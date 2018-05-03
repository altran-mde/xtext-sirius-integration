package com.altran.general.integration.xtextsirius.runtime.task;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

public class ReplaceValueParameter {
	private final EObject elementToEdit;
	private final EStructuralFeature feature;
	private final Object value;
	private final DRepresentationElement representationElement;
	private final URI originalUri;

	public ReplaceValueParameter(
			final @NonNull EObject elementToEdit,
			final @NonNull EStructuralFeature feature,
			final @Nullable Object value,
			final @NonNull DRepresentationElement representationElement,
			final @Nullable URI originalUri) {
		this.elementToEdit = elementToEdit;
		this.feature = feature;
		this.value = value;
		this.representationElement = representationElement;
		this.originalUri = originalUri;
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

	public @NonNull DRepresentationElement getRepresentationElement() {
		return this.representationElement;
	}
	
	public @Nullable URI getOriginalUri() {
		return this.originalUri;
	}
}
