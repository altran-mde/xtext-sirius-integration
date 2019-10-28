/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editor.modeladjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;

/**
 * Returns, and requires a {@linkplain ModelEntryPoint#getSemanticElement()
 * semantic element} and a {@linkplain ModelEntryPoint#getValueFeatureName()
 * value feature} contained in the semantic element.
 */
public class ElementFeatureModelAdjuster extends AModelAdjuster {
	
	@Override
	public @NonNull EObject getSemanticElement(final @NonNull ModelEntryPoint modelEntryPoint) {
		final EObject semanticElement = modelEntryPoint.getSemanticElement();
		if (semanticElement != null) {
			return semanticElement;
		}
		
		throw new IllegalStateException("No SemanticElement");
	}
	
	@Override
	public @NonNull EObject getFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getAssuredFallbackContainer(modelEntryPoint);
	}
	
	@Override
	public @NonNull EStructuralFeature getStructuralFeature(final @NonNull ModelEntryPoint modelEntryPoint) {
		final EObject semanticElement = getSemanticElement(modelEntryPoint);
		final EStructuralFeature feature = semanticElement.eClass()
				.getEStructuralFeature(modelEntryPoint.getValueFeatureName());
		
		if (feature != null) {
			return feature;
		}
		
		throw new IllegalStateException(
				"Cannot find feature " + modelEntryPoint.getValueFeatureName() + " in " + semanticElement);
	}
}
