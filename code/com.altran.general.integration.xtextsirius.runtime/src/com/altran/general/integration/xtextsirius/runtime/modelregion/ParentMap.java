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

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CompoundElement;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.common.collect.Streams;

/**
 * An inverted grammar tree. Allows us to find all calls to a specfic grammar
 * rule in the current grammar.
 */
public class ParentMap {
	protected final Multimap<@NonNull AbstractElement, @NonNull AbstractElement> map = LinkedHashMultimap.create();
	private final AbstractElement parent;
	private final AbstractElement base;
	
	public ParentMap(
			final @NonNull AbstractElement parent,
			final @NonNull AbstractElement base) {
		this.parent = parent;
		this.base = base;
		
		collectContainedGrammarElementsDeep(this.parent, this.base);
	}
	
	/**
	 * Builds up the inverted grammar tree (child --> allParents).
	 */
	protected void collectContainedGrammarElementsDeep(
			final @NonNull AbstractElement parent,
			final @NonNull AbstractElement base) {
		if (this.map.containsEntry(base, parent)) {
			return;
		}
		
		this.map.put(base, parent);
		
		if (base instanceof CompoundElement) {
			for (final AbstractElement element : ((CompoundElement) base).getElements()) {
				collectContainedGrammarElementsDeep(base, element);
			}
		} else if (base instanceof RuleCall) {
			collectContainedGrammarElementsDeep(base, ((RuleCall) base).getRule().getAlternatives());
		} else if (base instanceof Assignment) {
			collectContainedGrammarElementsDeep(base, ((Assignment) base).getTerminal());
		} else if (base instanceof CrossReference) {
			collectContainedGrammarElementsDeep(base, ((CrossReference) base).getTerminal());
		}
	}
	
	/**
	 * Checks if {@code grammarElement} or any of its (direct and indirect)
	 * parents in the grammar tree (aka {@code parentMap}) is contained in
	 * {@code grammarElements}.
	 */
	public boolean containsGrammarElementDeep(
			final @NonNull AbstractElement grammarElement,
			final @NonNull List<@NonNull AbstractElement> grammarElements) {
		return containsGrammarElementDeep(grammarElement, grammarElements, Sets.newLinkedHashSet());
	}
	
	private boolean containsGrammarElementDeep(
			final @NonNull AbstractElement grammarElement,
			final @NonNull List<@NonNull AbstractElement> grammarElements,
			final @NonNull Set<@NonNull AbstractElement> visitedElements) {
		if (visitedElements.contains(grammarElement)) {
			return false;
		} else {
			visitedElements.add(grammarElement);
		}
		
		if (grammarElements.contains(grammarElement)) {
			return true;
		}
		
		final Collection<@NonNull AbstractElement> parents = this.map.get(grammarElement);
		for (final AbstractElement parent : parents) {
			if (parent != null && parent != grammarElement) {
				return containsGrammarElementDeep(parent, grammarElements, visitedElements);
			}
		}
		
		return false;
	}
	
	/**
	 * Finds all parents of {@code el} recursively, and maps these parents to
	 * their leaf object in the grammar model.
	 */
	public @NonNull Stream<@NonNull AbstractElement> findAllParents(final @NonNull AbstractElement el) {
		return findAllParents(el, Sets.newLinkedHashSet()).stream();
	}
	
	private @NonNull Set<@NonNull AbstractElement> findAllParents(final @NonNull AbstractElement el,
			@NonNull final Set<@NonNull AbstractElement> result) {
		if (result.contains(el)) {
			return result;
		} else {
			result.add(el);
		}
		
		final Collection<@NonNull AbstractElement> directParents = this.map.get(el);
		directParents.stream()
				.filter(e -> e != el)
				.forEach(e -> findAllParents(e, result));
		
		if (!(el instanceof CompoundElement)) {
			Streams.stream(el.eAllContents())
					.filter(c -> c.eContents().isEmpty() && c instanceof AbstractElement)
					.map(AbstractElement.class::cast)
					.forEach(c -> result.add(c));
		}
		
		return result;
	}
	
}
