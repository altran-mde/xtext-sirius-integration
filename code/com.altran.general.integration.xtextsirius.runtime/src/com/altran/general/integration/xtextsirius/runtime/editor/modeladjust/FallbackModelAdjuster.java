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

/**
 * Uses the {@linkplain ModelEntryPoint#getFallbackContainer() fallback
 * container} as semantic element. Based on this result, returns the result's
 * parent as fallback container, and the feature containing the result.
 */
public class FallbackModelAdjuster extends AModelAdjuster {
	
	@Override
	public @NonNull EObject getSemanticElement(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getAssuredFallbackContainer(modelEntryPoint);
	}
	
	@Override
	public @NonNull EObject getFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint) {
		return EcoreNavigationUtil.eContainerIfExists(getAssuredFallbackContainer(modelEntryPoint));
	}
	
	@Override
	public @NonNull EStructuralFeature getStructuralFeature(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getAssuredFallbackContainer(modelEntryPoint).eContainingFeature();
	}
}
