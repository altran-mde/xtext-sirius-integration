package com.altran.general.integration.xtextsirius.util;

import java.util.List;
import java.util.stream.Stream;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CompoundElement;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.patch.Streams;

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

		if (base instanceof RuleCall) {
			collectContainedGrammarElementsDeep(base, ((RuleCall) base).getRule().getAlternatives());
		} else if (base instanceof Assignment) {
			collectContainedGrammarElementsDeep(base, ((Assignment) base).getTerminal());
		} else if (base instanceof CrossReference) {
			collectContainedGrammarElementsDeep(base, ((CrossReference) base).getTerminal());
		} else if (base instanceof CompoundElement) {
			for (final AbstractElement element : ((CompoundElement) base).getElements()) {
				collectContainedGrammarElementsDeep(base, element);
			}
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
		if (grammarElements.contains(grammarElement)) {
			return true;
		}

		for (final AbstractElement parent : this.map.get(grammarElement)) {
			if (parent != null && parent != grammarElement) {
				return containsGrammarElementDeep(parent, grammarElements);
			}
		}

		return false;
	}

	/**
	 * Finds all parents of {@code el} recursively, and maps these parents to
	 * their leaf object in the grammar model.
	 */
	public @NonNull Stream<@NonNull AbstractElement> findAllParents(final @NonNull AbstractElement el) {
		final Stream<@NonNull AbstractElement> result = this.map.get(el).stream()
				.filter(e -> e != el)
				.flatMap(e -> findAllParents(e));
		
		if (!(el instanceof CompoundElement)) {
			return Stream.concat(
					Streams.stream(el.eAllContents())
							.filter(c -> c.eContents().isEmpty() && c instanceof AbstractElement)
							.map(AbstractElement.class::cast),
					result);
		} else {
			return result;
		}
	}
	
}
