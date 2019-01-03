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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
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
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.util.Tuples;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Tries to find (and add) terminals (a.k.a. keywords) required to be present to
 * edit {@code feature} within {@code element}, if any.
 */
@SuppressWarnings("restriction")
public class RequiredGrammarTerminalsPresentEnsurer {

	private final EObject element;
	private final EStructuralFeature feature;

	protected ITextRegionAccess rootRegion;
	protected StringBuffer allText;

	protected IEObjectRegion elementRegion;
	protected AbstractElement grammarElement;
	protected List<@NonNull AbstractElement> containedElementPath;
	protected AbstractElement containedElement;
	protected Group containingGroup;
	protected List<AbstractElement> elementsBefore;
	protected List<AbstractElement> elementsAfter;
	protected ParentMap parentMap;

	public RequiredGrammarTerminalsPresentEnsurer(
			final @NonNull EObject element,
			final @NonNull EStructuralFeature feature,
			final @NonNull ITextRegionAccess rootRegion,
			final @NonNull StringBuffer allText) {
		this.element = element;
		this.feature = feature;
		this.rootRegion = rootRegion;
		this.allText = allText;
	}

	public @NonNull TextRegion ensure() {
		validate();

		collectBeforeAndAfter();

		calculateParentMap();

		final int offset = calculateOffsetForInsertion();

		return prepareTextRegion(offset);
	}

	protected TextRegion prepareTextRegion(final int offset) {
		final String beforeText = collectToTerminalText(this.elementsBefore);
		final String afterText = collectToTerminalText(this.elementsAfter);

		this.allText.insert(offset, afterText);
		this.allText.insert(offset, beforeText);

		return new TextRegion(offset + beforeText.length(), 0);
	}

	protected int calculateOffsetForInsertion() {
		final Set<@NonNull ISemanticRegion> regionsOfContainedElements = findRegionsOfContainedElements();

		int offset;

		final List<@NonNull AbstractElement> ruleLeafs = orderRuleLeafs(
				GrammarUtil.containingRule(this.containedElement));

		final AbstractElement containedElementLeaf = findFirstLeaf(this.containedElement, ruleLeafs);
		final int indexOfContainedElementLeaf = ruleLeafs.indexOf(containedElementLeaf);

		// this is probably only a workaround, but it works for the current test
		// cases and abstract reasoning about possible grammars and token
		// streams is hard /-:
		if (regionsOfContainedElements.size() == 1) {
			offset = calculateOffsetFromSingleCandidate(regionsOfContainedElements, ruleLeafs,
					indexOfContainedElementLeaf);

		} else {
			offset = calculateOffsetFromMultipleCandidates(regionsOfContainedElements, ruleLeafs,
					indexOfContainedElementLeaf);
		}
		return offset;
	}

	protected int calculateOffsetFromMultipleCandidates(
			final @NonNull Set<@NonNull ISemanticRegion> regionsOfContainedElements,
			final @NonNull List<@NonNull AbstractElement> ruleLeafs,
			final int indexOfContainedElementLeaf) {

		int offset;
		final Set<Pair<AbstractElement, ISemanticRegion>> regionsBefore = regionsOfContainedElements.stream()
				.filter(r -> !this.parentMap.containsGrammarElementDeep((AbstractElement) r.getGrammarElement(),
						this.elementsAfter))
				.map(r -> Tuples.pair(findFirstLeaf((AbstractElement) r.getGrammarElement(), ruleLeafs), r))
				.collect(Collectors.toSet());

		final Set<@NonNull ISemanticRegion> regions = regionsBefore.stream()
				.map(p -> p.getSecond())
				.collect(Collectors.toSet());
		if (regionsBefore.stream()
				.anyMatch(p -> {
					final int indexOf = ruleLeafs.indexOf(p.getFirst());
					return indexOf < indexOfContainedElementLeaf;
				})) {
			final ISemanticRegion nearestRegion = SemanticRegionNavigator.getInstance().selectLastmostRegion(regions);
			offset = nearestRegion.getEndOffset();
		} else {
			final ISemanticRegion nearestRegion = SemanticRegionNavigator.getInstance().selectFirstmostRegion(regions);
			offset = nearestRegion.getOffset();
		}
		return offset;
	}

	protected int calculateOffsetFromSingleCandidate(
			final @NonNull Set<@NonNull ISemanticRegion> regionsOfContainedElements,
			final @NonNull List<@NonNull AbstractElement> ruleLeafs,
			final int indexOfContainedElementLeaf) {

		int offset;
		final ISemanticRegion nearestRegion = regionsOfContainedElements.iterator().next();
		final AbstractElement firstLeaf = findFirstLeaf((AbstractElement) nearestRegion.getGrammarElement(), ruleLeafs);
		if (ruleLeafs.indexOf(firstLeaf) < indexOfContainedElementLeaf) {
			offset = nearestRegion.getEndOffset();
		} else {
			offset = nearestRegion.getOffset();
		}
		return offset;
	}

	protected void calculateParentMap() {
		this.parentMap = new ParentMap(this.grammarElement, this.grammarElement);
	}

	/**
	 * Sort elements of {@code containingGroup} into {@code elementsBefore} or
	 * {@code elementsAfter}, depending on their position relative to
	 * {@code containedElement}.
	 */
	protected void collectBeforeAndAfter() {
		this.elementsBefore = Lists.newArrayList();
		this.elementsAfter = Lists.newArrayList();

		List<AbstractElement> currentList = this.elementsBefore;

		for (final AbstractElement ae : this.containingGroup.getElements()) {
			if (ae == this.containedElement
					|| EcoreUtil2.eAllContentsAsList(ae).contains(this.containedElement)) {
				currentList = this.elementsAfter;
			} else {
				currentList.add(ae);
			}
		}
	}

	protected void validate() {
		if (this.element.eIsSet(this.feature)) {
			throw new IllegalStateException("Feature " + this.feature + " is set in " + this.element);
		}

		this.elementRegion = this.rootRegion.regionForEObject(this.element);

		if (!(this.elementRegion.getGrammarElement() instanceof RuleCall)) {
			throw new IllegalArgumentException("element does not resolve to RuleCall grammar element: " + this.element);
		}

		this.grammarElement = (RuleCall) this.elementRegion.getGrammarElement();

		this.containedElementPath = findContainedElementPath(this.grammarElement, this.feature);

		if (this.containedElementPath.isEmpty()) {
			throw new IllegalArgumentException(
					"Cannot find grammar element for feature " + this.feature + " in " + this.element);
		}

		this.containedElement = Iterables.getLast(this.containedElementPath);
		this.containingGroup = GrammarUtil.containingGroup(this.containedElement);
		// 0-th entry must be == grammarElement, so we don't need it
		this.containedElementPath.remove(0);

		if (this.containingGroup == null) {
			throw new IllegalArgumentException("Cannot find containing group for grammar element of feature "
					+ this.feature + " in " + this.element);
		}
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
	 * Merges all terminals' values within {@code grammarElements}, or returns a
	 * whitespace if there are no terminals.
	 */
	protected @NonNull String collectToTerminalText(final @NonNull List<@NonNull AbstractElement> grammarElements) {
		final String result = grammarElements.stream()
				.filter(e -> e instanceof Keyword)
				.map(el -> ((Keyword) el).getValue())
				.collect(Collectors.joining());

		if (!result.isEmpty()) {
			return result;
		}

		return getWhitespace(this.grammarElement);
	}

	/**
	 * Converts one path through the grammar tree to semanticRegions.
	 */
	protected @NonNull Set<@NonNull ISemanticRegion> findRegionsOfContainedElements() {

		final Set<@NonNull ISemanticRegion> result = Sets.newLinkedHashSet();

		final EObject grammarElement = this.elementRegion.getGrammarElement();
		if (grammarElement instanceof AbstractElement) {
			for (final ISemanticRegion region : this.elementRegion.getAllSemanticRegions()) {
				final EObject regionGrammarElement = region.getGrammarElement();
				if (regionGrammarElement instanceof AbstractElement) {
					if (this.parentMap.containsGrammarElementDeep((AbstractElement) regionGrammarElement,
							this.containedElementPath)) {
						result.add(region);
					}
				}
			}
		}

		return result;
	}

	/**
	 * Returns a ordered list of all leafs contained in a grammar model rule.
	 */
	protected @NonNull List<@NonNull AbstractElement> orderRuleLeafs(final @NonNull AbstractRule rule) {
		final ArrayList<@NonNull AbstractElement> result = Lists.newArrayList();

		orderGrammar(rule.getAlternatives(), result);

		return result;
	}

	protected void orderGrammar(final @NonNull AbstractElement el, final @NonNull List<@NonNull AbstractElement> list) {
		final EList<EObject> contents = el.eContents();
		if (contents.isEmpty()) {
			list.add(el);
		} else {
			for (final EObject child : contents) {
				if (child instanceof AbstractElement) {
					orderGrammar((AbstractElement) child, list);
				}
			}
		}
	}

	/**
	 * Finds first parent of {@code el} contained in {@code leafs}.
	 */
	protected @NonNull AbstractElement findFirstLeaf(final @NonNull AbstractElement el,
			final @NonNull List<@NonNull AbstractElement> leafs) {
		final Set<AbstractElement> allParents = this.parentMap.findAllParents(el).collect(Collectors.toSet());
		final AbstractElement firstLeaf = leafs.stream()
				.filter(e -> allParents.contains(e))
				.findFirst()
				.orElse(leafs.iterator().next());

		return firstLeaf;
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

}
