package com.altran.general.integration.xtextsirius.runtime.editor;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.altran.general.integration.xtextsirius.runtime.ignoredfeature.IgnoredFeatureAdapter;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.runtime.modelregion.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;

public class XtextSiriusModelEditor extends AXtextSiriusEditor {

	private @Nullable SemanticElementLocation semanticElementLocation;
	private TextRegion selectedRegion;
	
	public XtextSiriusModelEditor(final @NonNull IXtextSiriusModelDescriptor descriptor) {
		super(descriptor);
	}
	
	@Override
	public void doSetValue(final Object value) {
		final EObject semanticElement = getSemanticElement();
		
		if (semanticElement == null) {
			return;
		}
		
		final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(getInjector(), semanticElement);
		preparer.setMultiLine(isMultiLine());
		preparer.setEditableFeatures(getDescriptor().getEditableFeatures());
		preparer.setIgnoredNestedFeatures(getDescriptor().getIgnoredNestedFeatures());
		preparer.setSelectedFeatures(getDescriptor().getSelectedFeatures());
		
		final String prefixText = interpret(getDescriptor().getPrefixTerminalsExpression());
		preparer.setPrefixText(prefixText);
		final String suffixText = interpret(getDescriptor().getSuffixTerminalsExpression());
		preparer.setSuffixText(suffixText);
		
		String text = preparer.getText();
		TextRegion textRegion = preparer.getTextRegion();
		
		if (value instanceof String) {
			final String str = (String) value;
			if (StringUtils.isNotBlank(str)) {
				text = StringUtils.overlay(text, str, textRegion.getOffset(),
						textRegion.getOffset() + textRegion.getLength());
				textRegion = new TextRegion(textRegion.getOffset(), str.length());
			}
		}
		
		getCallback().resetVisibleRegion();
		super.doSetValue(text);
		
		this.semanticElementLocation = preparer.getSemanticElementLocation();
		
		getCallback().setVisibleRegion(textRegion.getOffset(), textRegion.getLength());
		this.selectedRegion = preparer.getSelectedRegion();
	}

	@Nullable
	public SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}

	public @Nullable Object getValueToCommit() throws AXtextSiriusIssueException {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location != null) {
			final IParseResult parseResult = getCallback().getXtextParseResult();
			if (parseResult.hasSyntaxErrors()) {
				final XtextSiriusSyntaxErrorException ex = getCallback().handleSyntaxErrors(parseResult);
				throw ex;
			}
			final EObject element = location.resolve(parseResult.getRootASTElement().eResource());
			if (element != null) {
				if (containsUnresolvableProxies(element)) {
					final XtextSiriusErrorException ex = getCallback().handleUnresolvableProxies();
					throw ex;
				}
				return FakeResourceUtil.getInstance().proxify(element, EcoreUtil.getURI(getSemanticElement()));
			}
		}

		return null;
	}

	protected boolean containsUnresolvableProxies(final EObject eObject) {
		return !EcoreUtil.UnresolvedProxyCrossReferencer.find(eObject).isEmpty();
	}

	/** Must not be called before the merging is complete */
	public void removeAllIgnoredFeatureAdapters() {
		if (getSemanticElement() == null) {
			return;
		}
		final EObject rootContainer = EcoreUtil.getRootContainer(getSemanticElement());
		rootContainer.eAllContents()
				.forEachRemaining(eObject -> eObject.eAdapters().removeIf(IgnoredFeatureAdapter.class::isInstance));
	}

	@Override
	public IXtextSiriusModelDescriptor getDescriptor() {
		return (IXtextSiriusModelDescriptor) super.getDescriptor();
	}

	public TextRegion getSelectedRegion() {
		return this.selectedRegion;
	}
}
