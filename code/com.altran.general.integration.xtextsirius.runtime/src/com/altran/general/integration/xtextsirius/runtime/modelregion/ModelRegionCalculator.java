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
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;

@SuppressWarnings("restriction")
public class ModelRegionCalculator {
	private final ModelRegionEditorPreparer preparer;
	
	public ModelRegionCalculator(final ModelRegionEditorPreparer preparer) {
		this.preparer = preparer;
	}

	public TextRegion calculateFeatureRegion(
			final @NonNull EObject element,
			final @NonNull Set<@NonNull String> featureNames,
			final @NonNull Set<@NonNull EStructuralFeature> features,
			final boolean addRequiredTerminals) {
		TextRegion result;
		
		if (featureNames.isEmpty()) {
			result = new TextRegion(this.preparer.getSemanticRegion().getOffset(),
					this.preparer.getSemanticRegion().getLength());
		} else {
			final @NonNull Set<@NonNull EStructuralFeature> resolvedFeatures = resolveFeatures(element, featureNames);
			final @NonNull Set<@NonNull EStructuralFeature> definedFeatures = resolveDefinedFeatures(element,
					resolvedFeatures);
			features.addAll(definedFeatures);
			
			if (!definedFeatures.isEmpty()) {
				result = calculateRegionForFeatures(element, definedFeatures, addRequiredTerminals);
			} else if (addRequiredTerminals) {
				result = new RequiredGrammarTerminalsPresentEnsurer(element,
						resolvedFeatures.iterator().next(), this.preparer.getRootRegion(), this.preparer.getAllText())
								.ensure();
			} else {
				result = new TextRegion(this.preparer.getSemanticRegion().getOffset(), 0);
			}
		}
		
		return result;
	}
	
	@NonNull
	public TextRegion calculateRegionForFeatures(
			final @NonNull EObject semanticElement,
			final @NonNull Set<@NonNull EStructuralFeature> definedFeatures,
			final boolean addRequiredTerminals) {
		final Set<@NonNull ISemanticRegion> featureRegions = translateToRegions(definedFeatures,
				this.preparer.getSemanticRegion(),
				semanticElement, this.preparer.getRootRegion());
		
		ISemanticRegion firstRegion = SemanticRegionNavigator.getInstance().selectFirstmostRegion(featureRegions);
		if (addRequiredTerminals) {
			final String pattern = this.preparer.getPrefixText();
			if (pattern == null) {
				firstRegion = extendHeuristiclyByAttachedTerminals(firstRegion, (r -> r.getPreviousSemanticRegion()));
			} else {
				firstRegion = extendPatternBasedByAttachedTerminals(firstRegion, StringUtils.reverse(pattern),
						(r -> r.getPreviousSemanticRegion()));
			}
		}
		final int startOffset = firstRegion.getOffset();
		
		ISemanticRegion endRegion = SemanticRegionNavigator.getInstance().selectLastmostRegion(featureRegions);
		if (addRequiredTerminals) {
			final String pattern = this.preparer.getSuffixText();
			if (pattern == null) {
				endRegion = extendHeuristiclyByAttachedTerminals(endRegion, (r -> r.getNextSemanticRegion()));
			} else {
				endRegion = extendPatternBasedByAttachedTerminals(endRegion, pattern, (r -> r.getNextSemanticRegion()));
			}
		}
		final int endOffset = endRegion.getEndOffset();
		
		return new TextRegion(startOffset, endOffset - startOffset);
	}
	
	/**
	 * Returns the SemanticRegion of existing terminals that are attached to the
	 * semantic contents of {@code region}, if any; otherwise, returns
	 * {@code region}.
	 */
	protected ISemanticRegion extendHeuristiclyByAttachedTerminals(final @NonNull ISemanticRegion region,
			final @NonNull Function<ISemanticRegion, ISemanticRegion> extender) {
		ISemanticRegion result = region;
		
		// this logic is really only trial&error, don't try to find a deeper
		// meaning

		final ISemanticRegion nextSemanticRegion = extender.apply(region);
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
						result = nextSemanticRegion;
					}
				}
			}
		}
		return result;
	}
	
	protected ISemanticRegion extendPatternBasedByAttachedTerminals(final @NonNull ISemanticRegion region,
			final @NonNull String pattern,
			final @NonNull Function<ISemanticRegion, ISemanticRegion> extender) {
		ISemanticRegion result = region;

		final StringBuilder remainingPattern = new StringBuilder(pattern);

		ISemanticRegion nextSemanticRegion = extender.apply(region);
		while (remainingPattern.length() > 0 && nextSemanticRegion != null
				&& nextSemanticRegion.getGrammarElement() instanceof Keyword) {

			final String keyword = ((Keyword) nextSemanticRegion.getGrammarElement()).getValue();
			final int keywordLength = keyword.length();
			if ((remainingPattern.length() >= keywordLength
					&& keyword.equals(remainingPattern.substring(0, keywordLength)))) {
				result = nextSemanticRegion;
				remainingPattern.delete(0, keywordLength);
			} else {
				break;
			}

			nextSemanticRegion = extender.apply(result);
		}

		return result;
	}
	
	
	/**
	 * Collects all SemanticRegions covering {@code features} within
	 * {@code semanticElement} / {@code semanticRegion}.
	 */
	@NonNull
	public Set<@NonNull ISemanticRegion> translateToRegions(
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
							return Streams.stream(rootRegion.regionForEObject((EObject) child).getAllSemanticRegions());
						} else if (child instanceof Collection) {
							return ((Collection<?>) child).stream()
									.filter(EObject.class::isInstance)
									.map(EObject.class::cast)
									.flatMap(e -> Streams
											.stream(rootRegion.regionForEObject(e).getAllSemanticRegions()));
						} else {
							return Stream.of();
						}
					}
				})
				.collect(Collectors.toSet());
	}
	
	/**
	 * Inverted version of
	 * {@link org.eclipse.xtext.formatting2.regionaccess.internal.AbstractSemanticRegionsFinder#assertNoContainment(EStructuralFeature)}
	 * .
	 */
	public boolean canBeHandledByGetRegionForFeature(final @NonNull EStructuralFeature feature) {
		return feature instanceof EAttribute
				|| (feature instanceof EReference && !((EReference) feature).isContainment());
	}
	
	@NonNull
	public Set<@NonNull EStructuralFeature> resolveDefinedFeatures(
			final @NonNull EObject semanticElement,
			final @NonNull Set<@NonNull EStructuralFeature> features) {
		final @NonNull Set<@NonNull EStructuralFeature> definedFeatures = features.stream()
				.filter(feature -> semanticElement.eIsSet(feature))
				.collect(Collectors.toSet());
		return definedFeatures;
	}
	
	/**
	 * Converts all <i>editableFeatures</i> (defined as string) into
	 * {@link EStructuralFeature}s, iff defined for
	 * {@code semanticElement.eClass()}.
	 */
	protected @NonNull Set<@NonNull EStructuralFeature> resolveEditableFeatures(
			final @NonNull EObject semanticElement) {
		
		return resolveFeatures(semanticElement, this.preparer.getEditableFeatures());
	}

	public @NonNull Set<@NonNull EStructuralFeature> resolveFeatures(final @NonNull EObject semanticElement,
			@NonNull final Set<@NonNull String> featureNames) {
		final EClass eClass = semanticElement.eClass();

		return featureNames.stream()
				.map(ef -> eClass.getEStructuralFeature(ef))
				.filter(Objects::nonNull)
				.collect(Collectors.toSet());
	}
	
}
