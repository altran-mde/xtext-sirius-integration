package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting2.FormatterPreferences;
import org.eclipse.xtext.formatting2.FormatterRequest;
import org.eclipse.xtext.formatting2.IFormatter2;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.ITextReplacement;
import org.eclipse.xtext.preferences.IPreferenceValuesProvider;
import org.eclipse.xtext.preferences.TypedPreferenceValues;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.ExceptionAcceptor;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Injector;
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
 *
 * @author nstotz
 *
 */
@SuppressWarnings("restriction")
public class ModelRegionEditorPreparer {
	
	/*
	 * @formatter:off
	Examples for technical understanding

	Grammar (partial):
		Event:
			name=ID code=INT? ('[' guard=Guard ']')?
		;

		Guard:
			ValueGuard | RangeGuard
		;

		ValueGuard:
			cond=Value
		;

		RangeGuard:
			min=Value '..' max=Value
		;

		Value:
			ConstantRef | IntLiteral
		;

		ConstantRef:
			constant=[Constant]
		;

		IntLiteral:
			value=INT
		;

		Constant:
			name=ID value=Value
		;


	GrammarModel (partial):
		ParserRule name=Event
			alternatives=Group elements=
				Assignment feature=name
					terminal=RuleCall rule=ID
				Assignment feature=code
					terminal=RuleCall rule=INT
				Group elements=
					Keyword value=[
					Assignment feature=guard
						terminal=RuleCall rule=Guard
					Keyword value=]

		ParserRule name=Guard
			alternatives=Alternatives elements=
				RuleCall rule=ValueGuard
				RuleCall rule=RangeGuard

		ParserRule name=ValueGuard
			alternatives=Assignment feature=cond
				terminal=RuleCall rule=Value

		ParserRule name=Value
			alternatives=Alternatives elements=
				RuleCall rule=ConstantRef
				RuleCall rule=IntLiteral

		ParserRule name=ConstantRef
			alternatives=Assignment feature=constant
				terminal=CrossReference type=Constant
					terminal=RuleCall rule=ID

		ParserRule name=IntLiteral
			alternatives=Assignment feature=value
				terminal=RuleCall rule=INT

		ParserRule name=Constant
			alternatives=Group elements=
				Assignment feature=name
					terminal=RuleCall rule=ID
				Assignment feature=value
					terminal=RuleCall rule=Value


	ParentMap (partial):
		<<element>>={<<allParentElements>>}

		Event={Event}
		Event.group[0]={Event}
		Event.group[1]={Event}
		Event.group[2]={Event}
		Event.group[0].terminal={Event.group[0]}
		Event.group[1].terminal={Event.group[1]}
		Event.group[2].group[0]={Event.group[2]}
		Event.group[2].group[1]={Event.group[2]}
		Event.group[2].group[2]={Event.group[2]}
		Event.group[2].group[1].terminal={Event.group[2].group[1]}
		Guard={Event.group[2].group[1].terminal}
		Guard.alternatives[0]={Guard}
		Guard.alternatives[1]={Guard}
		ValueGuard={Guard.alternatives[0]}
		ValueGuard.assignment={ValueGuard}
		ValueGuard.assignment.terminal={ValueGuard.assignment}
		Constant.group[0]={Constant}
		Constant.group[0].terminal={Constant.group[0]}
		Constant.group[1]={Constant}
		Constant.group[1].terminal={Constant.group[1]}
		Value={ValueGuard.assigment.terminal, Constant.group[1].terminal}
		Value.alternatives[0]={Value}
		Value.alternatives[1]={Value}
		ConstantRef={Value.alternatives[0]}
		ConstantRef.assignment={ConstantRef}
		ConstantRef.assignment.terminal={ConstantRef.assignment}
		IntLiteral={Value.alternatives[1]}
		IntLiteral.assignment={IntLiteral}
		IntLiteral.assignment.terminal={IntLiteral.assignment}
		ID={Event.group[0].terminal, Constant.group[0].terminal, ConstantRef.assignment.terminal}
		INT={Event.group[1].terminal, IntLiteral.assignment.terminal}


	Model (partial):
		events
			event0 1 [pi..1]
			event1 [42]
			event3
		end

		constants
			pi 314
		end

	ParserModel (partial):
		(A) SemanticRegion offset=28 length=13
			grammarElement=RuleCall rule=Event
			semanticElement=event1
			semanticRegions=
				(B) SemanticRegion offset=28 length=6
					grammarElement=RuleCall(Event.group[0].terminal)
					semanticElement=event1
					nextSemanticRegion
						--> (C)
				(C) SemanticRegion offset=35 length=1
					grammarElement=RuleCall(Event.group[1].terminal)
					semanticElement=event1
					nextSemanticRegion
						--> (D)
				(D) SemanticRegion offset=37 length=1
					grammarElement=Keyword(Event.group[2].group[0])
					semanticElement=event140 length=1
					nextSemanticRegion
						--> (F)
				(E) SemanticRegion offset=40 length=1
					grammarElement=Keyword(Event.group[2].group[2])
					semanticElement=event1

		(contained somewhere else)
		(F) SemanticRegion offset=38 length=2
			grammarElement=RuleCall(IntLiteral.assignment.terminal)
			semanticElement=IntLiteral(42)
			nextSemanticRegion
				--> (E)

	 * @formatter:on
	 */
	
	@Inject
	private ISerializer serializer;
	
	@Inject(optional = true)
	private Provider<IFormatter2> formatterProvider;

	@Inject(optional = true)
	private Provider<FormatterRequest> requestProvider;
	
	@Inject(optional = true)
	@FormatterPreferences
	private IPreferenceValuesProvider preferencesProvider;
	
	private final @Nullable EObject semanticElement;
	private final @NonNull EObject parentSemanticElement;
	private final boolean multiLine;
	private final @NonNull Set<@NonNull String> editableFeatures;
	private final EStructuralFeature semanticElementFeature;
	
	protected boolean prepared;
	
	protected ITextRegionAccess rootRegion;
	protected IEObjectRegion semanticRegion;
	protected Set<@NonNull EStructuralFeature> definedFeatures;
	
	protected StringBuffer allText;
	protected TextRegion textRegion;
	protected SemanticElementLocation semanticElementLocation;
	
	
	/**
	 * Creates a ModelRegionEditorPreparer based on a non-null target.
	 *
	 * @param semanticElement
	 *            Target to edit.
	 * @param injector
	 *            Injector of the edited Xtext language.
	 * @param multiLine
	 *            Whether the editor support several lines.
	 * @param editableFeatures
	 *            Collection of names of {@link EStructuralFeatures} valid for
	 *            {@code semanticElement} that should be editable. If empty, all
	 *            features are assumed to be editable.
	 */
	public ModelRegionEditorPreparer(
			final @NonNull EObject semanticElement,
			final @NonNull Injector injector,
			final boolean multiLine,
			final @NonNull Collection<@NonNull String> editableFeatures) {
		this(semanticElement, semanticElement.eContainer(), injector, multiLine, editableFeatures,
				semanticElement.eContainingFeature());
	}
	
	/**
	 * Creates a ModelRegionEditorPreparer based on a nullable target.
	 *
	 * @param semanticElement
	 *            Target to edit.
	 * @param parentSemanticElement
	 *            EContainer of {@code semanticElement}.
	 * @param injector
	 *            Injector of the edited Xtext language.
	 * @param multiLine
	 *            Whether the editor support several lines.
	 * @param editableFeatures
	 *            Collection of names of {@link EStructuralFeatures} valid for
	 *            {@code semanticElement} that should be editable. If empty, all
	 *            features are assumed to be editable.
	 * @param semanticElementFeature
	 *            Feature of {@code semanticElement} within
	 *            {@code parentSemanticElement}.
	 */
	public ModelRegionEditorPreparer(
			final @Nullable EObject semanticElement,
			final @NonNull EObject parentSemanticElement,
			final @NonNull Injector injector,
			final boolean multiLine,
			final @NonNull Collection<@NonNull String> editableFeatures,
			final @NonNull EStructuralFeature semanticElementFeature) {
		this.semanticElement = semanticElement;
		this.parentSemanticElement = parentSemanticElement;
		this.multiLine = multiLine;
		this.editableFeatures = Sets.newLinkedHashSet(editableFeatures);
		this.semanticElementFeature = semanticElementFeature;
		
		injector.injectMembers(this);
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
	 * Returns the complete text that should be contained in the editor,
	 * including hidden parts.
	 *
	 * @return The complete text that should be contained in the editor,
	 *         including hidden parts.
	 */
	public @NonNull String getText() {
		prepare();
		return this.allText.toString();
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
		return this.allText.substring(this.textRegion.getOffset(),
				this.textRegion.getOffset() + this.textRegion.getLength());
	}
	
	protected void prepare() {
		if (this.prepared) {
			return;
		}
		
		final EObject rootContainer = EcoreUtil.getRootContainer(getParent());
		this.rootRegion = getSerializer().serializeToRegions(rootContainer);

		formatIfPossible(rootContainer);

		this.allText = new StringBuffer(this.rootRegion.regionForDocument().getText());
		
		final EObject element = getSemanticElement();
		
		if (element != null) {
			this.semanticElementLocation = new SemanticElementLocation(element);
			this.semanticRegion = this.rootRegion.regionForEObject(element);
			
			if (getEditableFeatures().isEmpty()) {
				this.textRegion = new TextRegion(this.semanticRegion.getOffset(), this.semanticRegion.getLength());
			} else {
				this.definedFeatures = resolveDefinedFeatures(element);
				
				if (!this.definedFeatures.isEmpty()) {
					this.textRegion = calculateRegionForFeatures(element);
				} else {
					this.textRegion = new RequiredGrammarTerminalsPresentEnsurer(element,
							resolveEditableFeatures(element).iterator().next(), this.rootRegion, this.allText).ensure();
				}
			}
		} else {
			this.semanticElementLocation = constructXtextFragmentSchemeBasedLocation();
			this.semanticRegion = this.rootRegion.regionForEObject(getParent());
			this.textRegion = new RequiredGrammarTerminalsPresentEnsurer(getParent(), getSemanticElementFeature(),
					this.rootRegion, this.allText).ensure();
		}
		
		this.textRegion = StyledTextUtil.getInstance().insertNewline(this.allText, this.textRegion);
		
		StyledTextUtil.getInstance().removeNewlinesIfSingleLine(this.allText, this.textRegion, isMultiLine());
		
		this.prepared = true;
	}
	
	protected void formatIfPossible(final EObject rootContainer) {
		if (this.requestProvider != null && this.formatterProvider != null) {
			final FormatterRequest request = this.requestProvider.get();
			request.setAllowIdentityEdits(false);
			request.setFormatUndefinedHiddenRegionsOnly(false);
			if (this.preferencesProvider != null) {
				request.setPreferences(TypedPreferenceValues
						.castOrWrap(this.preferencesProvider.getPreferenceValues(rootContainer.eResource())));
			}
			request.setTextRegionAccess(this.rootRegion);
			request.setExceptionHandler(ExceptionAcceptor.IGNORING);
			final IFormatter2 formatter = this.formatterProvider.get();
			final List<ITextReplacement> replacements = formatter.format(request);
			this.rootRegion.getRewriter().renderToString(replacements);
		}
	}
	
	/**
	 * Mimics the URI fragment scheme used by Xtext.
	 */
	protected SemanticElementLocation constructXtextFragmentSchemeBasedLocation() {
		final EStructuralFeature feature = getSemanticElementFeature();
		final String parentFragment = EcoreUtil.getURI(getParent()).fragment();
		final String fragment = parentFragment + "/@" + feature.getName() + (feature.isMany() ? ".0" : "");
		return new SemanticElementLocation(fragment, parentFragment, feature, 0);
	}
	
	
	/**
	 * Calculates the TextRegion spanning all <i>definedFeatures</i> of
	 * {@code semanticElement}, including attached terminals.
	 */
	protected @NonNull TextRegion calculateRegionForFeatures(final @NonNull EObject semanticElement) {
		final Set<@NonNull ISemanticRegion> featureRegions = translateToRegions(this.definedFeatures,
				this.semanticRegion,
				semanticElement, this.rootRegion);
		
		ISemanticRegion firstRegion = SemanticRegionNavigator.getInstance().selectFirstmostRegion(featureRegions);
		firstRegion = extendByAttachedTerminals(semanticElement, firstRegion, (r -> r.getPreviousSemanticRegion()));
		final int startOffset = firstRegion.getOffset();
		
		ISemanticRegion endRegion = SemanticRegionNavigator.getInstance().selectLastmostRegion(featureRegions);
		endRegion = extendByAttachedTerminals(semanticElement, endRegion, (r -> r.getNextSemanticRegion()));
		final int endOffset = endRegion.getEndOffset();
		
		return new TextRegion(startOffset, endOffset - startOffset);
	}

	/**
	 * Returns the SemanticRegion of existing terminals that are attached to the
	 * semantic contents of {@code endRegion}, if any; otherwise, returns
	 * {@code endRegion}.
	 */
	protected ISemanticRegion extendByAttachedTerminals(final EObject semanticElement, ISemanticRegion endRegion,
			final Function<ISemanticRegion, ISemanticRegion> extender) {
		// this logic is really only trial&error, don't try to find a deeper
		// meaning
		
		final ISemanticRegion nextSemanticRegion = extender.apply(endRegion);
		if (nextSemanticRegion != null && nextSemanticRegion.getGrammarElement() instanceof Keyword) {
			
			ISemanticRegion ongoingSemanticRegion = nextSemanticRegion;
			for (;;) {
				final ISemanticRegion next = extender.apply(ongoingSemanticRegion);
				if (next == null) {
					break;
				}

				ongoingSemanticRegion = next;
				
				if (!(next.getGrammarElement() instanceof Keyword)) {
					break;
				}
			}
			
			if (ongoingSemanticRegion != null) {
				final Group group = GrammarUtil.containingGroup(nextSemanticRegion.getGrammarElement());
				
				if (group != null) {

					final ParentMap parentMap = new ParentMap(group, group);
					
					if (!parentMap.containsGrammarElementDeep(
							(AbstractElement) ongoingSemanticRegion.getGrammarElement(),
							ImmutableList.of(group))) {
						endRegion = nextSemanticRegion;
					}
				}
			}
		}
		return endRegion;
	}
	
	/**
	 * Collects all <i>editableFeatures</i> that are set for
	 * {@code semanticElement}.
	 */
	protected @NonNull Set<@NonNull EStructuralFeature> resolveDefinedFeatures(final @NonNull EObject semanticElement) {
		final @NonNull Set<@NonNull EStructuralFeature> features = resolveEditableFeatures(semanticElement);
		final @NonNull Set<@NonNull EStructuralFeature> definedFeatures = features.stream()
				.filter(feature -> semanticElement.eIsSet(feature))
				.collect(Collectors.toSet());
		return definedFeatures;
	}
	
	/**
	 * Collects all SemanticRegions covering {@code features} within
	 * {@code semanticElement} / {@code semanticRegion}.
	 */
	protected @NonNull Set<@NonNull ISemanticRegion> translateToRegions(
			final @NonNull Set<@NonNull EStructuralFeature> features,
			final @NonNull IEObjectRegion semanticRegion,
			final @NonNull EObject semanticElement,
			final @NonNull ITextRegionAccess rootRegion) {
		return features.stream()
				.flatMap(feature -> {
					if (canBeHandledByGetRegionForFeature(feature)) {
						return Stream.of(semanticRegion.getRegionFor().feature(feature));
					} else {
						final Object child = semanticElement.eGet(feature);
						if (child instanceof EObject) {
							return asStream(rootRegion.regionForEObject((EObject) child).getAllSemanticRegions());
						} else {
							return Stream.of();
						}
					}
				})
				.collect(Collectors.toSet());
	}
	
	/**
	 * Inverted version of
	 * {@link org.eclipse.xtext.formatting2.regionaccess.internal.AbstractSemanticRegionsFinder#assertNoContainment(EStructuralFeature)}.
	 */
	protected boolean canBeHandledByGetRegionForFeature(final @NonNull EStructuralFeature feature) {
		return feature instanceof EAttribute
				|| (feature instanceof EReference && !((EReference) feature).isContainment());
	}
	
	/**
	 * Converts all <i>editableFeatures</i> (defined as string) into
	 * {@link EStructuralFeature}s, iff defined for
	 * {@code semanticElement.eClass()}.
	 */
	protected @NonNull Set<@NonNull EStructuralFeature> resolveEditableFeatures(
			final @NonNull EObject semanticElement) {
		final EClass eClass = semanticElement.eClass();
		
		return getEditableFeatures().stream()
				.map(ef -> eClass.getEStructuralFeature(ef))
				.filter(Objects::nonNull)
				.collect(Collectors.toSet());
	}
	
	private <T> @NonNull Stream<T> asStream(final @NonNull Iterable<T> iter) {
		return StreamSupport.stream(iter.spliterator(), false);
	}
	
	protected EObject getSemanticElement() {
		return this.semanticElement;
	}
	
	protected boolean isMultiLine() {
		return this.multiLine;
	}
	
	protected EObject getParent() {
		return this.parentSemanticElement;
	}
	
	protected @NonNull Set<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
	
	protected EStructuralFeature getSemanticElementFeature() {
		return this.semanticElementFeature;
	}
	
	protected Serializer getSerializer() {
		return (Serializer) this.serializer;
	}
}
