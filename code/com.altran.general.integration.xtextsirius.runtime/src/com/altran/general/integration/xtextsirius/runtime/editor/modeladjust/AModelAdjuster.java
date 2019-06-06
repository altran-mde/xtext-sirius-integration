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
import com.altran.general.integration.xtextsirius.runtime.util.EcoreNavigationUtil;

public abstract class AModelAdjuster implements IModelAdjuster {
	@Override
	public @NonNull EObject getClosestElement(final @NonNull ModelEntryPoint modelEntryPoint) {
		final EObject semanticElement = getSemanticElement(modelEntryPoint);
		if (semanticElement != null) {
			return semanticElement;
		} else {
			return getFallbackContainer(modelEntryPoint);
		}
	}

	@Override
	public @NonNull ModelEntryPoint adjust(@NonNull final ModelEntryPoint modelEntryPoint) {
		if (modelEntryPoint.hasValueFeature()) {
			final EStructuralFeature structuralFeature = getStructuralFeature(modelEntryPoint);
			return new ModelEntryPoint(getSemanticElement(modelEntryPoint), getFallbackContainer(modelEntryPoint),
					structuralFeature);
		}

		return new ModelEntryPoint(getSemanticElement(modelEntryPoint), getFallbackContainer(modelEntryPoint));
	}
	
	protected @NonNull EObject getAssuredFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint) {
		final EObject fallbackContainer = modelEntryPoint.getFallbackContainer();
		if (fallbackContainer != null) {
			return fallbackContainer;
		} else {
			final EObject element = modelEntryPoint.getSemanticElement();
			if (element != null) {
				return EcoreNavigationUtil.eContainerIfExists(element);
			} else {
				throw new IllegalStateException("No FallbackContainer");
			}
		}
	}

	protected @NonNull EStructuralFeature getFeatureInFallback(final @NonNull ModelEntryPoint modelEntryPoint) {
		final String valueFeatureName = modelEntryPoint.getValueFeatureName();
		if (valueFeatureName != null) {
			final EObject fallbackContainer = getAssuredFallbackContainer(modelEntryPoint);
			final EStructuralFeature structuralFeature = fallbackContainer.eClass()
					.getEStructuralFeature(valueFeatureName);
			if (structuralFeature != null) {
				return structuralFeature;
			} else {
				throw new IllegalStateException(
						"No structuralFeature " + valueFeatureName + " in " + fallbackContainer);
			}
		} else {
			throw new IllegalStateException("No valueFeatureName");
		}
	}
}
