package com.altran.general.integration.xtextsirius.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
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
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CompoundElement;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Injector;

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


	Multimap built by collectContainedGrammarElementsDeep (partial):
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
		
		this.rootRegion = getSerializer().serializeToRegions(EcoreUtil.getRootContainer(getParent()));
		
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
					this.textRegion = ensureRequiredGrammarTerminalsPresent(element,
							resolveEditableFeatures(element).iterator().next());
				}
			}
		} else {
			this.semanticElementLocation = constructXtextFragmentSchemeBasedLocation();
			this.semanticRegion = this.rootRegion.regionForEObject(getParent());
			this.textRegion = ensureRequiredGrammarTerminalsPresent(getParent(), getSemanticElementFeature());
		}
		
		this.textRegion = StyledTextUtil.getInstance().insertNewline(this.allText, this.textRegion);
		
		StyledTextUtil.getInstance().removeNewlinesIfSingleLine(this.allText, this.textRegion, isMultiLine());
		
		this.prepared = true;
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
	 * Tries to find (and add) terminals (aka Keywords) required to be present
	 * to edit {@code feature} within {@code element}, if any.
	 */
	protected @NonNull TextRegion ensureRequiredGrammarTerminalsPresent(
			final @NonNull EObject element,
			final @NonNull EStructuralFeature feature) {
		if (element.eIsSet(feature)) {
			throw new IllegalStateException("Feature " + feature + " is set in " + element);
		}
		
		final IEObjectRegion elementRegion = this.rootRegion.regionForEObject(element);
		
		if (!(elementRegion.getGrammarElement() instanceof RuleCall)) {
			throw new IllegalArgumentException("element does not resolve to RuleCall grammar element: " + element);
		}
		
		final RuleCall grammarElement = (RuleCall) elementRegion.getGrammarElement();
		
		final List<@NonNull AbstractElement> containedElementPath = findContainedElementPath(grammarElement, feature);
		
		if (containedElementPath.isEmpty()) {
			throw new IllegalArgumentException("Cannot find grammar element for feature " + feature + " in " + element);
		}
		
		final AbstractElement containedElement = Iterables.getLast(containedElementPath);
		final Group containingGroup = GrammarUtil.containingGroup(containedElement);
		// 0-th entry must be == grammarElement, so we don't need it
		containedElementPath.remove(0);
		
		if (containingGroup == null) {
			throw new IllegalArgumentException(
					"Cannot find containing group for grammar element of feature " + feature + " in " + element);
		}
		
		final List<AbstractElement> elementsBefore = Lists.newArrayList();
		final List<AbstractElement> elementsAfter = Lists.newArrayList();
		collectGrammarElementsBeforeAndAfter(containedElement, containingGroup, elementsBefore, elementsAfter);
		
		final String beforeText = collectToTerminalText(grammarElement, elementsBefore);
		final String afterText = collectToTerminalText(grammarElement, elementsAfter);
		
		final Multimap<@NonNull AbstractElement, @NonNull AbstractElement> parentMap = collectContainedGrammarElementsDeep(
				grammarElement, grammarElement, LinkedHashMultimap.create());
		
		final Set<@NonNull ISemanticRegion> regionsOfContainedElements = findRegionsOfContainedElements(elementRegion,
				containedElementPath, parentMap);
		
		ISemanticRegion max;
		// this is probably only a workaround, but it works for the current test
		// cases and abstract reasoning about possible grammars and token
		// streams is hard /-:
		if (regionsOfContainedElements.size() == 1) {
			max = regionsOfContainedElements.iterator().next();
		} else {
			final Set<@NonNull ISemanticRegion> regionsBefore = regionsOfContainedElements.stream()
					.filter(r -> !containsGrammarElementDeep((AbstractElement) r.getGrammarElement(), elementsAfter,
							parentMap))
					.collect(Collectors.toSet());
			max = selectLastmostRegion(regionsBefore);
		}
		
		final int endOffset = max.getEndOffset();
		
		this.allText.insert(endOffset, afterText);
		this.allText.insert(endOffset, beforeText);
		
		return new TextRegion(endOffset + beforeText.length(), 0);
	}
	
	/**
	 * Extracts a valid whitespace character from the grammar.
	 */
	protected String getWhitespace(final EObject grammarElement) {
		return EcoreUtil2
				.getAllContentsOfType(GrammarUtil.findRuleForName(GrammarUtil.getGrammar(grammarElement), "WS"),
						Keyword.class)
				.iterator().next().getValue();
	}
	
	/**
	 * Finds the region ending closest to the end of file.
	 */
	protected ISemanticRegion selectLastmostRegion(
			final @NonNull Set<@NonNull ISemanticRegion> regionsOfContainedElements) {
		final ISemanticRegion max = regionsOfContainedElements.stream()
				.max((a, b) -> Integer.compare(a.getEndOffset(), b.getEndOffset()))
				.get();
		return max;
	}
	
	/**
	 * Converts one path through the grammar tree to semanticRegions.
	 */
	protected @NonNull Set<@NonNull ISemanticRegion> findRegionsOfContainedElements(
			final @NonNull IEObjectRegion elementRegion,
			final @NonNull List<@NonNull AbstractElement> containedElementPath,
			final @NonNull Multimap<@NonNull AbstractElement, @NonNull AbstractElement> parentMap) {
		
		final Set<@NonNull ISemanticRegion> result = Sets.newLinkedHashSet();
		
		final EObject grammarElement = elementRegion.getGrammarElement();
		if (grammarElement instanceof AbstractElement) {
			for (final ISemanticRegion region : elementRegion.getAllSemanticRegions()) {
				final EObject regionGrammarElement = region.getGrammarElement();
				if (regionGrammarElement instanceof AbstractElement) {
					if (containsGrammarElementDeep((AbstractElement) regionGrammarElement, containedElementPath,
							parentMap)) {
						result.add(region);
					}
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Builds up the inverted grammar tree (child --> allParents).
	 */
	protected @NonNull Multimap<@NonNull AbstractElement, @NonNull AbstractElement> collectContainedGrammarElementsDeep(
			final @NonNull AbstractElement parent,
			final @NonNull AbstractElement base,
			final @NonNull Multimap<@NonNull AbstractElement, @NonNull AbstractElement> map) {
		if (map.containsEntry(base, parent)) {
			return map;
		}
		
		map.put(base, parent);
		
		if (base instanceof RuleCall) {
			collectContainedGrammarElementsDeep(base, ((RuleCall) base).getRule().getAlternatives(), map);
		} else if (base instanceof Assignment) {
			collectContainedGrammarElementsDeep(base, ((Assignment) base).getTerminal(), map);
		} else if (base instanceof CrossReference) {
			collectContainedGrammarElementsDeep(base, ((CrossReference) base).getTerminal(), map);
		} else if (base instanceof CompoundElement) {
			for (final AbstractElement element : ((CompoundElement) base).getElements()) {
				collectContainedGrammarElementsDeep(base, element, map);
			}
		}
		
		return map;
	}
	
	/**
	 * Checks if {@code grammarElement} or any of its (direct and indirect)
	 * parents in the grammar tree (aka {@code parentMap}) is contained in
	 * {@code grammarElements}.
	 */
	protected boolean containsGrammarElementDeep(
			final @NonNull AbstractElement grammarElement,
			final @NonNull List<@NonNull AbstractElement> grammarElements,
			final @NonNull Multimap<@NonNull AbstractElement, @NonNull AbstractElement> parentMap) {
		if (grammarElements.contains(grammarElement)) {
			return true;
		}
		
		for (final AbstractElement parent : parentMap.get(grammarElement)) {
			if (parent != null && parent != grammarElement) {
				return containsGrammarElementDeep(parent, grammarElements, parentMap);
			}
		}
		
		return false;
	}
	
	/**
	 * Sort elements of {@code containingGroup} into {@code elementsBefore} or
	 * {@code elementsAfter}, depending on their position relative to
	 * {@code containedElement}.
	 */
	protected void collectGrammarElementsBeforeAndAfter(
			final @NonNull AbstractElement containedElement,
			final @NonNull Group containingGroup,
			final @NonNull List<@NonNull AbstractElement> elementsBefore,
			final @NonNull List<@NonNull AbstractElement> elementsAfter) {
		List<AbstractElement> currentList = elementsBefore;
		
		for (final AbstractElement ae : containingGroup.getElements()) {
			if (ae == containedElement
					|| EcoreUtil2.eAllContentsAsList(ae).contains(containedElement)) {
				currentList = elementsAfter;
			} else {
				currentList.add(ae);
			}
		}
	}
	
	/**
	 * Merges all terminals' values within {@code grammarElements}, or returns a
	 * whitespace if there are no terminals.
	 */
	protected @NonNull String collectToTerminalText(final @NonNull AbstractElement grammarElement,
			final @NonNull List<@NonNull AbstractElement> grammarElements) {
		final String result = grammarElements.stream()
				.filter(e -> e instanceof Keyword)
				.map(el -> ((Keyword) el).getValue())
				.collect(Collectors.joining());
		
		if (!result.isEmpty()) {
			return result;
		}
		
		return getWhitespace(grammarElement);
	}
	
	/**
	 * Finds the path through grammar from {@code abstractElement} to an
	 * Assignment to {@code feature}.
	 */
	protected @NonNull List<@NonNull AbstractElement> findContainedElementPath(
			final @NonNull AbstractElement abstractElement,
			final @NonNull EStructuralFeature feature) {
		if (abstractElement instanceof Assignment) {
			if (feature.getName().equals(((Assignment) abstractElement).getFeature())) {
				return Collections.singletonList(abstractElement);
			}
		}
		
		if (abstractElement instanceof RuleCall) {
			final AbstractElement alternatives = ((RuleCall) abstractElement).getRule().getAlternatives();
			
			final List<AbstractElement> alternativesResult = findContainedElementPath(alternatives, feature);
			if (!alternativesResult.isEmpty()) {
				final ArrayList<AbstractElement> result = Lists.newArrayList(alternativesResult);
				result.add(0, abstractElement);
				return result;
			}
		}
		
		if (abstractElement instanceof CompoundElement) {
			for (final AbstractElement alternative : ((CompoundElement) abstractElement).getElements()) {
				final List<AbstractElement> alternativeResult = findContainedElementPath(alternative, feature);
				if (!alternativeResult.isEmpty()) {
					final ArrayList<AbstractElement> result = Lists.newArrayList(alternativeResult);
					result.add(0, abstractElement);
					return result;
				}
			}
		}
		
		return Collections.emptyList();
	}
	
	/**
	 * Calculates the TextRegion spanning all <i>definedFeatures</i> of
	 * {@code semanticElement}, including attached terminals.
	 */
	protected @NonNull TextRegion calculateRegionForFeatures(final @NonNull EObject semanticElement) {
		final Set<@NonNull ISemanticRegion> featureRegions = translateToRegions(this.definedFeatures,
				this.semanticRegion,
				semanticElement, this.rootRegion);
		
		final int startOffset = featureRegions.stream()
				.map(reg -> reg.getOffset())
				.min(Integer::compare)
				.get();
		
		ISemanticRegion endRegion = selectLastmostRegion(featureRegions);
		
		endRegion = extendByAttachedTerminals(semanticElement, endRegion);
		
		final int endOffset = endRegion.getEndOffset();
		
		return new TextRegion(startOffset, endOffset - startOffset);
	}

	/**
	 * Returns the SemanticRegion of existing terminals that are attached to the
	 * semantic contents of {@code endRegion}, if any; otherwise, returns
	 * {@code endRegion}.
	 */
	protected ISemanticRegion extendByAttachedTerminals(final EObject semanticElement, ISemanticRegion endRegion) {
		final ISemanticRegion nextSemanticRegion = endRegion.getNextSemanticRegion();
		if (nextSemanticRegion != null && nextSemanticRegion.getGrammarElement() instanceof Keyword) {
			final ISemanticRegion ongoingSemanticRegion = nextSemanticRegion.getNextSemanticRegion();
			
			if (ongoingSemanticRegion != null && ongoingSemanticRegion.getSemanticElement() != semanticElement) {
				final Group group = GrammarUtil.containingGroup(nextSemanticRegion.getGrammarElement());
				
				if (group != null) {
					final Multimap<@NonNull AbstractElement, @NonNull AbstractElement> parentMap = collectContainedGrammarElementsDeep(
							group, group, LinkedHashMultimap.create());
					
					if (!containsGrammarElementDeep((AbstractElement) ongoingSemanticRegion.getGrammarElement(),
							ImmutableList.of(group), parentMap)) {
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
