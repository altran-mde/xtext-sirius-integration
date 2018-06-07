package com.altran.general.integration.xtextsirius.runtime.task;

import java.util.Set;

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
	private final Set<@NonNull String> featuresToReplace;
	
	public ReplaceValueParameter(
			final @NonNull EObject elementToEdit,
			final @NonNull EStructuralFeature feature,
			final @Nullable Object value,
			final @NonNull DRepresentationElement representationElement,
			final @NonNull Set<@NonNull String> featuresToReplace,
			final @Nullable URI originalUri) {
		this.elementToEdit = elementToEdit;
		this.feature = feature;
		this.value = value;
		this.representationElement = representationElement;
		this.featuresToReplace = featuresToReplace;
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
	
	public @NonNull Set<String> getFeaturesToReplace() {
		return this.featuresToReplace;
	}
	
	public @Nullable URI getOriginalUri() {
		return this.originalUri;
	}
}
