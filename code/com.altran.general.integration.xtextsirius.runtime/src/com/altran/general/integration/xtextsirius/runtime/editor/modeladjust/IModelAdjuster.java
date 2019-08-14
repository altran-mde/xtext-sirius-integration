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
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;

/**
 * Abstracts different strategies to process {@link ModelEntryPoint}s.
 * 
 * <p>
 * All methods may throw an {@link IllegalStateException} if the request cannot
 * be fulfilled.
 * </p>
 */
public interface IModelAdjuster {
	/**
	 * Returns the edited element, if any.
	 */
	public @Nullable EObject getSemanticElement(final @NonNull ModelEntryPoint modelEntryPoint)
			throws IllegalStateException;
	
	/**
	 * Returns the container of the edited element.
	 */
	public @NonNull EObject getFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint)
			throws IllegalStateException;
	
	/**
	 * Returns the closest element to the edited element.
	 */
	public @NonNull EObject getClosestElement(final @NonNull ModelEntryPoint modelEntryPoint)
			throws IllegalStateException;
	
	/**
	 * Returns the feature of the edited element.
	 */
	public @NonNull EStructuralFeature getStructuralFeature(final @NonNull ModelEntryPoint modelEntryPoint)
			throws IllegalStateException;
	
	/**
	 * Creates a new {@link ModelEntryPoint} containing all the adjustments of
	 * this model adjuster.
	 */
	public @NonNull ModelEntryPoint adjust(final @NonNull ModelEntryPoint modelEntryPoint) throws IllegalStateException;
}
