/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class ModelEntryPoint {
	private @Nullable EObject semanticElement;
	private @Nullable EObject fallbackContainer;
	private @Nullable String valueFeatureName;
	private @Nullable EStructuralFeature valueFeature;
	
	public ModelEntryPoint() {
		this(null, null, null, null);
	}
	
	public ModelEntryPoint(
			final @NonNull EObject semanticElement) {
		this(semanticElement, null, null, null);
	}
	
	public ModelEntryPoint(
			final @NonNull EObject semanticElement,
			final @Nullable String valueFeatureName) {
		this(semanticElement, null, valueFeatureName, null);
	}
	
	public ModelEntryPoint(
			final @Nullable EObject semanticElement,
			final @Nullable EObject fallbackContainer) {
		this(semanticElement, fallbackContainer, null, null);
	}
	
	public ModelEntryPoint(
			final @Nullable EObject semanticElement,
			final @Nullable EObject fallbackContainer,
			final @Nullable String valueFeatureName) {
		this(semanticElement, fallbackContainer, valueFeatureName, null);
	}
	
	public ModelEntryPoint(
			final @Nullable EObject semanticElement,
			final @Nullable EObject fallbackContainer,
			final @NonNull EStructuralFeature valueFeature) {
		this(semanticElement, fallbackContainer, valueFeature.getName(), valueFeature);
	}
	
	public ModelEntryPoint(
			final @Nullable EObject semanticElement,
			final @Nullable EObject fallbackContainer,
			final @Nullable String valueFeatureName,
			final @Nullable EStructuralFeature valueFeature) {
		this.semanticElement = semanticElement;
		this.fallbackContainer = fallbackContainer;
		this.valueFeatureName = valueFeatureName;
		this.valueFeature = valueFeature;
	}
	
	public @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}
	
	public @Nullable EObject getFallbackContainer() {
		return this.fallbackContainer;
	}
	
	public @Nullable String getValueFeatureName() {
		return this.valueFeatureName;
	}
	
	public @Nullable EStructuralFeature getValueFeature() {
		return this.valueFeature;
	}
	
	public void setSemanticElement(final @Nullable EObject semanticElement) {
		this.semanticElement = semanticElement;
	}
	
	public void setFallbackContainer(final @Nullable EObject fallbackContainer) {
		this.fallbackContainer = fallbackContainer;
	}
	
	public void setValueFeatureName(final @Nullable String valueFeatureName) {
		this.valueFeatureName = valueFeatureName;
	}
	
	public void setValueFeature(@Nullable final EStructuralFeature valueFeature) {
		this.valueFeature = valueFeature;
	}
	
	public boolean hasValueFeature() {
		return getValueFeature() != null || StringUtils.isNotBlank(getValueFeatureName());
	}
	
	@Override
	public String toString() {
		return "ModelEntryPoint [semanticElement=" + this.semanticElement + ", fallbackContainer="
				+ this.fallbackContainer
				+ ", valueFeatureName=" + this.valueFeatureName + ", valueFeature=" + this.valueFeature + "]";
	}
}
