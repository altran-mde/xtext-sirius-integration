package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class ReplaceValueParameter {
	private final EObject elementToEdit;
	private final EStructuralFeature feature;
	private final Object value;
	
	public ReplaceValueParameter(
			final @NonNull EObject elementToEdit,
			final @NonNull EStructuralFeature feature,
			final @Nullable Object value) {
		this.elementToEdit = elementToEdit;
		this.feature = feature;
		this.value = value;
	}

	public @NonNull EObject getElementToEdit() {
		return this.elementToEdit;
	}

	public @NonNull EStructuralFeature getFeature() {
		return this.feature;
	}

	public @Nullable Object getValue() {
		return this.value;
	}
}
