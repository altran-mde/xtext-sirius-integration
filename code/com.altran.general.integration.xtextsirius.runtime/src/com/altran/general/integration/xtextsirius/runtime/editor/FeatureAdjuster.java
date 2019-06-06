/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.ElementModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.util.EcoreNavigationUtil;

public class FeatureAdjuster {
	private final ElementModelAdjuster modelAdjuster = new ElementModelAdjuster();
	private final @NonNull ModelEntryPoint targetModelEntryPoint;
	
	public FeatureAdjuster(final @NonNull ModelEntryPoint targetModelEntryPoint) {
		this.targetModelEntryPoint = targetModelEntryPoint;
	}

	public @NonNull EObject getTarget(final @NonNull EObject target) {
		
		if (!this.targetModelEntryPoint.hasValueFeature()) {
			return target;
		}
		
		final EObject closestElement = this.modelAdjuster.getClosestElement(this.targetModelEntryPoint);
		
		if (EcoreNavigationUtil.hasFeature(closestElement, this.targetModelEntryPoint.getValueFeatureName())) {
			return target;
		} else {
			return EcoreNavigationUtil.eContainerIfExists(target);
		}
	}
	
	public @Nullable EStructuralFeature getStructuralFeature(final EObject base) {
		if (!this.targetModelEntryPoint.hasValueFeature()) {
			return null;
		}

		final EObject closestElement = this.modelAdjuster.getClosestElement(this.targetModelEntryPoint);
		
		final EStructuralFeature feature = closestElement.eClass()
				.getEStructuralFeature(this.targetModelEntryPoint.getValueFeatureName());

		return feature;
	}

	public @Nullable Object getValue(final @NonNull EObject base) {
		if (!this.targetModelEntryPoint.hasValueFeature()) {
			return base;
		}

		final EStructuralFeature feature = getStructuralFeature(base);
		
		if (feature == null) {
			return base;
		}
		
		final Object value = base.eGet(feature);
		return value;
	}
}
