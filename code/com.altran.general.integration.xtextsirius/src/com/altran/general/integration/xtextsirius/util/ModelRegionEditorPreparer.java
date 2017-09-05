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
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.internal.StringSemanticRegion;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class ModelRegionEditorPreparer {
	@Inject
	private ISerializer serializer;

	private final @Nullable EObject semanticElement;
	private final @NonNull EObject parentSemanticElement;
	private final boolean multiLine;
	private final @NonNull Set<@NonNull String> editableFeatures;
	private final EStructuralFeature semanticElementFeature;
	
	private boolean prepared;
	
	private ITextRegionAccess rootRegion;
	private IEObjectRegion semanticRegion;
	private Set<@NonNull EStructuralFeature> definedFeatures;
	
	private StringBuffer allText;
	private TextRegion textRegion;
	private SemanticElementLocation semanticElementLocation;
	
	
	public ModelRegionEditorPreparer(
			final @NonNull EObject semanticElement,
			final @NonNull Injector injector,
			final boolean multiLine,
			final @NonNull Collection<@NonNull String> editableFeatures) {
		this(semanticElement, semanticElement.eContainer(), injector, multiLine, editableFeatures,
				semanticElement.eContainingFeature());
	}
	
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

	public @NonNull TextRegion getTextRegion() {
		prepare();
		return this.textRegion;
	}

	public @NonNull String getText() {
		prepare();
		return this.allText.toString();
	}

	public @NonNull SemanticElementLocation getSemanticElementLocation() {
		prepare();
		return this.semanticElementLocation;
	}


	public @NonNull String getSemanticText() {
		prepare();
		return this.allText.substring(this.textRegion.getOffset(),
				this.textRegion.getOffset() + this.textRegion.getLength());
	}
	
	private void prepare() {
		if (this.prepared) {
			return;
		}

		EObject element = getSemanticElement();

		if (element != null) {
			this.semanticElementLocation = new SemanticElementLocation(element);
		} else {
			element = getParent();
			// editableFeatures refer to features of the semanticElement, so we
			// need to reset
			getEditableFeatures().clear();
			getEditableFeatures().add(getSemanticElementFeature().getName());

			this.semanticElementLocation = constructXtextFragmentSchemeBasedLocation();
		}

		this.rootRegion = getSerializer().serializeToRegions(EcoreUtil.getRootContainer(getParent()));

		this.allText = new StringBuffer(this.rootRegion.regionForDocument().getText());

		this.semanticRegion = this.rootRegion.regionForEObject(element);

		if (getEditableFeatures().isEmpty()) {
			this.textRegion = ensureRequiredGrammarTerminalsPresent(element.eContainer(),
					element.eContainingFeature());
		} else {
			this.definedFeatures = resolveDefinedFeatures(element);

			if (!this.definedFeatures.isEmpty()) {
				this.textRegion = calculateRegionForFeatures(element);
			} else {
				this.textRegion = ensureRequiredGrammarTerminalsPresent(element,
						this.definedFeatures.iterator().next());
			}
		}


		this.textRegion = StyledTextUtil.insertNewline(this.allText, this.textRegion);
		
		StyledTextUtil.removeNewlinesIfSingleLine(this.allText, this.textRegion, isMultiLine());

		this.prepared = true;
	}
	
	protected SemanticElementLocation constructXtextFragmentSchemeBasedLocation() {
		final EStructuralFeature feature = getSemanticElementFeature();
		final String parentFragment = EcoreUtil.getURI(getParent()).fragment();
		final String fragment = parentFragment + "/@" + feature.getName() + (feature.isMany() ? ".1" : "");
		return new SemanticElementLocation(fragment, parentFragment, feature, 0);
	}


	private @NonNull TextRegion ensureRequiredGrammarTerminalsPresent(
			final @NonNull EObject element,
			final @NonNull EStructuralFeature feature) {
		final IEObjectRegion elementRegion = this.rootRegion.regionForEObject(element);
		final EObject grammarElement = elementRegion.getGrammarElement();

		if (!(grammarElement instanceof RuleCall)) {
			throw new IllegalArgumentException("element does not resolve to RuleCall grammar element: " + element);
		}

		final List<@NonNull AbstractElement> containedElementPath = findContainedElementPath(
				(AbstractElement) grammarElement,
				feature);

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
		
		final String beforeText = collectToTerminalText(elementsBefore);
		final String afterText = collectToTerminalText(elementsAfter);
		
		
		final Set<@NonNull ISemanticRegion> regionsOfContainedElements = findRegionsOfContainedElements(elementRegion,
				containedElementPath);
		
		final ISemanticRegion max = selectLastmostRegion(regionsOfContainedElements);
		
		final int endOffset = max.getEndOffset();
		
		this.allText.insert(endOffset, afterText);
		this.allText.insert(endOffset, beforeText);
		
		return new TextRegion(endOffset + beforeText.length(), 0);
	}
	
	private ISemanticRegion selectLastmostRegion(final Set<@NonNull ISemanticRegion> regionsOfContainedElements) {
		final ISemanticRegion max = regionsOfContainedElements.stream()
				.max((a, b) -> Integer.compare(a.getEndOffset(), b.getEndOffset()))
				.get();
		return max;
	}
	
	private @NonNull Set<@NonNull ISemanticRegion> findRegionsOfContainedElements(final IEObjectRegion elementRegion,
			final List<@NonNull AbstractElement> containedElementPath) {
		final Set<@NonNull ISemanticRegion> result = Sets.newLinkedHashSet();
		
		for (final ISemanticRegion region : elementRegion.getSemanticRegions()) {
			final EObject regionGrammarElement = region.getGrammarElement();
			final Group regionGroup = GrammarUtil.containingGroup(regionGrammarElement);
			if (regionGroup != null) {
				if (regionGroup.getElements().stream().anyMatch(el -> containedElementPath.contains(el))) {
					result.add(region);
				}
			}
		}

		return result;
	}
	
	private void collectGrammarElementsBeforeAndAfter(final AbstractElement containedElement,
			final Group containingGroup, final List<AbstractElement> elementsBefore,
			final List<AbstractElement> elementsAfter) {
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

	private String collectToTerminalText(final List<AbstractElement> grammarElements) {
		return grammarElements.stream()
				.filter(e -> e instanceof Keyword)
				.map(el -> ((Keyword) el).getValue())
				.collect(Collectors.joining());
	}

	private @NonNull List<@NonNull AbstractElement> findContainedElementPath(
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

	private @NonNull TextRegion calculateRegionForFeatures(final EObject semanticElement) {
		final Set<@NonNull ISemanticRegion> featureRegions = translateToRegions(this.definedFeatures,
				this.semanticRegion,
				semanticElement, this.rootRegion);
		
		final int startOffset = featureRegions.stream()
				.map(reg -> reg.getOffset())
				.min(Integer::compare)
				.get();
		
		final int endOffset = featureRegions.stream()
				.map(reg -> {
					final ISemanticRegion nextHiddenRegion = reg.getNextSemanticRegion();
					if (nextHiddenRegion instanceof StringSemanticRegion) {
						return nextHiddenRegion.getEndOffset();
					}
					return reg.getEndOffset();
				})
				.max(Integer::compare)
				.get();

		return new TextRegion(startOffset, endOffset - startOffset);
	}
	
	private @NonNull Set<@NonNull EStructuralFeature> resolveDefinedFeatures(final EObject semanticElement) {
		final @NonNull Set<@NonNull EStructuralFeature> features = resolveEditableFeatures(semanticElement);
		final @NonNull Set<@NonNull EStructuralFeature> definedFeatures = features.stream()
				.filter(feature -> semanticElement.eIsSet(feature))
				.collect(Collectors.toSet());
		return definedFeatures;
	}
	
	private @NonNull Set<@NonNull ISemanticRegion> translateToRegions(
			final @NonNull Set<@NonNull EStructuralFeature> features,
			final @NonNull IEObjectRegion semanticRegion,
			final @NonNull EObject semanticElement,
			final @NonNull ITextRegionAccess rootRegion) {
		return features.stream()
				.flatMap(feature -> {
					if (feature instanceof EAttribute
							|| (feature instanceof EReference && !((EReference) feature).isContainment())) {
						return Stream.of(semanticRegion.getRegionFor().feature(feature));
					} else {
						final Object child = semanticElement.eGet(feature);
						if (child instanceof EObject) {
							return StreamSupport
									.stream(rootRegion.regionForEObject((EObject) child)
											.getAllSemanticRegions().spliterator(), false);
						} else {
							return Stream.of();
						}
					}
				})
				.collect(Collectors.toSet());
	}
	
	private Set<@NonNull EStructuralFeature> resolveEditableFeatures(final @NonNull EObject semanticElement) {
		final EClass eClass = semanticElement.eClass();
		
		return getEditableFeatures().stream()
				.map(ef -> eClass.getEStructuralFeature(ef))
				.filter(Objects::nonNull)
				.collect(Collectors.toSet());
	}
	
	
	
	private EObject getSemanticElement() {
		return this.semanticElement;
	}
	
	private boolean isMultiLine() {
		return this.multiLine;
	}

	private EObject getParent() {
		return this.parentSemanticElement;
	}
	
	private @NonNull Set<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
	
	private EStructuralFeature getSemanticElementFeature() {
		return this.semanticElementFeature;
	}
	
	private Serializer getSerializer() {
		return (Serializer) this.serializer;
	}
}
