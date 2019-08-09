/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.modelregion;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.formatting2.FormatterPreferences;
import org.eclipse.xtext.formatting2.FormatterRequest;
import org.eclipse.xtext.formatting2.IFormatter2;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.ITextReplacement;
import org.eclipse.xtext.formatting2.regionaccess.TextRegionAccessBuilder;
import org.eclipse.xtext.preferences.IPreferenceValuesProvider;
import org.eclipse.xtext.preferences.TypedPreferenceValues;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.ExceptionAcceptor;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.util.EvaluateHelper;
import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Prepares an Xtext-based EObject to be edited in an embedded editor.
 *
 * <p>
 * Takes care of:
 * </p>
 *
 * <ul>
 * <li>Serializing the current model state (independent of persistence)</li>
 * <li>Attaching
 * {@link com.altran.general.integration.xtextsirius.runtime.ignoredfeature.IgnoredFeatureAdapter
 * IgnoredFeatureAdapters}</li>
 * <li>Formatting the serialized version if the language provides a
 * formatter</li>
 * <li>Moving the text of the target to the beginning of a line (as
 * StyledTextEditor can only show subparts of the document starting at a new
 * line)</li>
 * <li>Calculating the correct TextRegion that can be edited, based on the
 * target and the <i>editableFeatures</i></li>
 * <li>Calculating the location of the target</li>
 * <li>Removing newlines if {@code multiLine} is NOT set</li>
 * <li>Adds terminals from the grammar if required (i.e. the target itself or
 * the single <i>editableFeature</i> is {@code null}, and its position in the
 * grammar requires delimiters)</li>
 * </ul>
 *
 * <p>
 * Limitations:
 * </p>
 * <ul>
 * <li>If several <i>editableFeatures</i> are defined, but other features are
 * serialized in between, the other features will still be included.
 * <p>
 * <b>Example:</b><br/>
 * Grammar: <tt>Event: name=ID code=INT? ('[' guard=Guard ']')?;</tt><br/>
 * Model: <tt>myEvent 123 [1..2]</tt><br/>
 * <i>editableFeatures:</i> <tt>[name, guard]</tt><br/>
 * <i>semanticText:</i> <tt>myEvent 123 [1..2]</tt> (i.e. including the
 * <tt>code</tt> value)
 * </p>
 * </li>
 * <li>Adding required terminals might not work reliably if we use a complex
 * grammar. However, it should be influenced only by the grammar, not the model
 * text, therefore we can test it during language development.</li>
 * </ul>
 *
 */
@SuppressWarnings("restriction")
public class ModelRegionEditorPreparer {
	@Inject
	private ISerializer serializer;
	
	@Inject(optional = true)
	private Provider<IFormatter2> formatterProvider;
	
	@Inject(optional = true)
	private Provider<FormatterRequest> requestProvider;
	
	@Inject(optional = true)
	@FormatterPreferences
	private IPreferenceValuesProvider preferencesProvider;
	
	@Inject(optional = true)
	private XtextResourceFactory xtextResourceFactory;
	
	@Inject(optional = true)
	private Provider<TextRegionAccessBuilder> textRegionBuilderProvider;
	
	private final IXtextSiriusModelDescriptor descriptor;
	private final EStructuralFeature valueFeature;
	
	private final Set<@NonNull EStructuralFeature> definedEditableFeatures = Sets.newLinkedHashSet();
	private final Set<@NonNull EStructuralFeature> definedSelectedFeatures = Sets.newLinkedHashSet();
	
	private @Nullable EObject semanticElement;
	private @NonNull EObject parentSemanticElement;
	
	private boolean prepared;
	
	private TextRegion textRegion;
	private TextRegion selectedRegion;
	private SemanticElementLocation semanticElementLocation;
	
	// protected for testing purposes
	protected ITextRegionAccess rootRegion;
	protected IEObjectRegion semanticRegion;
	protected StringBuffer allText;
	
	
	/**
	 * Creates a ModelRegionEditorPreparer.
	 *
	 */
	public ModelRegionEditorPreparer(
			final IXtextSiriusModelDescriptor descriptor,
			final @NonNull ModelEntryPoint modelEntryPoint) {
		final EObject fallbackContainer = modelEntryPoint.getFallbackContainer();
		if (fallbackContainer == null) {
			throw new IllegalStateException("Need a fallbackContainer");
		}
		
		this.descriptor = descriptor;
		this.semanticElement = modelEntryPoint.getSemanticElement();
		this.parentSemanticElement = fallbackContainer;
		this.valueFeature = modelEntryPoint.getValueFeature();
		
		descriptor.getInjector().injectMembers(this);
	}
	
	/**
	 * Returns the subpart of the text that should be edited.
	 *
	 * @return The subpart of the text that should be edited.
	 */
	public @NonNull TextRegion getTextRegion() {
		prepare();
		return this.textRegion;
	}
	
	/**
	 * Returns the subpart of the text that should be selected.
	 *
	 * @return The subpart of the text that should be selected.
	 */
	public @NonNull TextRegion getSelectedRegion() {
		prepare();
		return this.selectedRegion;
	}
	
	/**
	 * Returns the complete text that should be contained in the editor,
	 * including hidden parts.
	 *
	 * @return The complete text that should be contained in the editor,
	 *         including hidden parts.
	 */
	public @NonNull String getText() {
		prepare();
		return getAllText().toString();
	}
	
	/**
	 * Returns the location of the target.
	 *
	 * @return The location of the target.
	 */
	public @NonNull SemanticElementLocation getSemanticElementLocation() {
		prepare();
		return this.semanticElementLocation;
	}
	
	/**
	 * Returns the substring of the text that should be edited.
	 *
	 * @return The substring of the text that should be edited.
	 */
	public @NonNull String getSemanticText() {
		prepare();
		return getAllText().substring(getTextRegion().getOffset(),
				getTextRegion().getOffset() + getTextRegion().getLength());
	}
	
	protected TextRegion getTextRegionInternal() {
		return this.textRegion;
	}
	
	protected TextRegion getSelectedRegionInternal() {
		return this.selectedRegion;
	}
	
	protected void prepare() {
		if (isPrepared()) {
			return;
		}
		
		final EObject preRootContainer = EcoreUtil.getRootContainer(getParent());
		final ITextRegionAccess preRootRegion = new ModelRegionSerializer(this).serialize(preRootContainer);
		
		// TODO: The ModelRegionSerializer attaches the IgnoredFeatureAdapters.
		// Do we still have them if formatting works?
		EObject rootContainer = formatIfPossible(preRootContainer, preRootRegion);
		if (rootContainer == null) {
			rootContainer = preRootContainer;
			this.rootRegion = preRootRegion;
		}
		
		this.allText = new StringBuffer(getRootRegion().regionForDocument().getText());
		
		final EObject element = getSemanticElement();
		
		if (element != null) {
			this.semanticElementLocation = new SemanticElementLocation(element);
			this.semanticRegion = getRootRegion().regionForEObject(element);
			
			this.textRegion = calculateEditableRegionElement(element);
			
			this.selectedRegion = calculateSelectedRegionElement(element);
		} else {
			this.semanticElementLocation = constructXtextFragmentSchemeBasedLocation();
			this.semanticRegion = getRootRegion().regionForEObject(getParent());
			final Object value = getParent().eGet(getSemanticElementFeature());
			if (value != null) {
				this.textRegion = calculateEditableRegionFeature();
			} else {
				this.textRegion = new RequiredGrammarTerminalsPresentEnsurer(getParent(), getSemanticElementFeature(),
						getRootRegion(), getAllText()).ensure();
			}
			this.selectedRegion = new TextRegion(getSemanticRegion().getOffset(), 0);
		}
		
		this.textRegion = StyledTextUtil.getInstance().insertNewline(getAllText(), getTextRegionInternal());
		this.selectedRegion = StyledTextUtil.getInstance().moveByInsertedNewline(getAllText(),
				getSelectedRegionInternal());
		
		StyledTextUtil.getInstance().removeNewlinesIfSingleLine(getAllText(), getTextRegionInternal(), isMultiLine());
		
		this.prepared = true;
	}
	
	private @NonNull TextRegion calculateEditableRegionElement(final EObject element) {
		final ModelRegionCalculator editableRegionCalculator = new ModelRegionCalculator(this);
		final TextRegion result = editableRegionCalculator.calculateFeatureRegion(element, getEditableFeatures(), true);
		getDefinedEditableFeatures().addAll(editableRegionCalculator.getDefinedFeatures());
		return result;
	}
	
	private @NonNull TextRegion calculateSelectedRegionElement(final EObject element) {
		final ModelRegionCalculator selectedRegionCalculator = new ModelRegionCalculator(this);
		final TextRegion result = selectedRegionCalculator.calculateFeatureRegion(element, getSelectedFeatures(),
				false);
		getDefinedSelectedFeatures().addAll(selectedRegionCalculator.getDefinedFeatures());
		return result;
	}
	
	private @NonNull TextRegion calculateEditableRegionFeature() {
		final ModelRegionCalculator editableRegionCalculator = new ModelRegionCalculator(this,
				Collections.singleton(getSemanticElementFeature()));
		return editableRegionCalculator.calculateFeatureRegion(getParent(),
				Collections.singleton(getSemanticElementFeature().getName()), false);
	}
	
	protected @Nullable EObject formatIfPossible(final EObject rootContainer, final ITextRegionAccess preRootRegion) {
		if (this.requestProvider == null ||
				this.formatterProvider == null ||
				this.xtextResourceFactory == null ||
				this.textRegionBuilderProvider == null ||
				this.parentSemanticElement.eResource() == null) {
			return null;
		}
		
		final List<ITextReplacement> replacements = setupFormatter(rootContainer, preRootRegion);
		try {
			final XtextResource resource = applyFormat(replacements, preRootRegion, new StringBuffer());
			
			if (this.semanticElement != null) {
				this.semanticElement = findCorresponding(resource, this.semanticElement);
			}
			this.parentSemanticElement = findCorresponding(resource, this.parentSemanticElement);
			
			if (!resource.getContents().isEmpty()) {
				return resource.getContents().iterator().next();
			}
		} catch (final IOException e) {
			// fall-through
		}
		
		this.rootRegion = null;
		return null;
	}
	
	private List<ITextReplacement> setupFormatter(final EObject rootContainer, final ITextRegionAccess preRootRegion) {
		final FormatterRequest request = this.requestProvider.get();
		request.setAllowIdentityEdits(false);
		request.setFormatUndefinedHiddenRegionsOnly(false);
		if (this.preferencesProvider != null) {
			request.setPreferences(TypedPreferenceValues
					.castOrWrap(this.preferencesProvider.getPreferenceValues(rootContainer.eResource())));
		}
		request.setTextRegionAccess(preRootRegion);
		request.setExceptionHandler(ExceptionAcceptor.IGNORING);
		final IFormatter2 formatter = this.formatterProvider.get();
		final List<ITextReplacement> replacements = formatter.format(request);
		return replacements;
	}
	
	private XtextResource applyFormat(final List<ITextReplacement> replacements, final ITextRegionAccess preRootRegion,
			final StringBuffer allText) throws IOException {
		preRootRegion.getRewriter().renderToAppendable(replacements, allText);
		final XtextResource resource = (XtextResource) this.xtextResourceFactory
				.createResource(this.parentSemanticElement.eResource().getURI());
		resource.load(new StringInputStream(allText.toString()), Collections.emptyMap());
		this.rootRegion = this.textRegionBuilderProvider.get().forNodeModel(resource).create();
		return resource;
	}
	
	private EObject findCorresponding(final XtextResource resource, final EObject element) {
		return resource.getEObject(EcoreUtil.getURI(element).fragment());
	}
	
	/**
	 * Mimics the URI fragment scheme used by Xtext.
	 */
	protected SemanticElementLocation constructXtextFragmentSchemeBasedLocation() {
		final EStructuralFeature feature = getSemanticElementFeature();
		final String parentFragment = EcoreUtil.getURI(getParent()).fragment();
		
		return new SemanticElementLocation(parentFragment, feature);
	}
	
	
	protected @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}
	
	protected boolean isMultiLine() {
		return getDescriptor().isMultiLine();
	}
	
	protected @NonNull EObject getParent() {
		return this.parentSemanticElement;
	}
	
	protected @NonNull Set<@NonNull String> getEditableFeatures() {
		return getDescriptor().getEditableFeatures();
	}
	
	protected @NonNull Set<@NonNull String> getIgnoredNestedFeatures() {
		return getDescriptor().getIgnoredNestedFeatures();
	}
	
	protected @NonNull Set<@NonNull String> getSelectedFeatures() {
		return getDescriptor().getSelectedFeatures();
	}
	
	protected @NonNull EStructuralFeature getSemanticElementFeature() {
		return this.valueFeature;
	}
	
	protected @Nullable String getPrefixText() {
		return interpret(getDescriptor().getPrefixTerminalsExpression());
	}
	
	protected @Nullable String getSuffixText() {
		return interpret(getDescriptor().getSuffixTerminalsExpression());
	}
	
	protected @Nullable String interpret(final @NonNull String expression) {
		if (StringUtils.isBlank(expression)) {
			return null;
		}
		
		final EObject self = getSemanticElement();
		if (self != null) {
			return EvaluateHelper.getInstance().evaluateString(expression, self);
		}
		
		return null;
	}
	
	protected Serializer getSerializer() {
		return (Serializer) this.serializer;
	}
	
	protected boolean isPrepared() {
		return this.prepared;
	}
	
	protected ITextRegionAccess getRootRegion() {
		return this.rootRegion;
	}
	
	protected IEObjectRegion getSemanticRegion() {
		return this.semanticRegion;
	}
	
	protected StringBuffer getAllText() {
		return this.allText;
	}
	
	protected Set<@NonNull EStructuralFeature> getDefinedEditableFeatures() {
		return this.definedEditableFeatures;
	}
	
	protected Set<@NonNull EStructuralFeature> getDefinedSelectedFeatures() {
		return this.definedSelectedFeatures;
	}
	
	protected IXtextSiriusModelDescriptor getDescriptor() {
		return this.descriptor;
	}
}
