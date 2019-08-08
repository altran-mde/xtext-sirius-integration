/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.task;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;

public class ReplaceValueParameter {
	private final IXtextSiriusDescriptor descriptor;
	private final EObject elementToEdit;
	private final EStructuralFeature feature;
	private final Object value;
	private final DRepresentationElement representationElement;
	private final URI originalUri;
	
	public ReplaceValueParameter(
			final @NonNull IXtextSiriusDescriptor descriptor,
			final @NonNull EObject elementToEdit,
			final @NonNull EStructuralFeature feature,
			final @Nullable Object value,
			final @NonNull DRepresentationElement representationElement,
			final @Nullable URI originalUri) {
		this.descriptor = descriptor;
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
	
	public @NonNull Set<String> getFeaturesToReplace() {
		final IXtextSiriusDescriptor desc = getDescriptor();
		if (desc instanceof IXtextSiriusModelDescriptor) {
			return ((IXtextSiriusModelDescriptor) desc).getEditableFeatures();
		}
		return Collections.emptySet();
	}
	
	public @NonNull Set<String> getIgnoredNestedFeatures() {
		final IXtextSiriusDescriptor desc = getDescriptor();
		if (desc instanceof IXtextSiriusModelDescriptor) {
			return ((IXtextSiriusModelDescriptor) desc).getIgnoredNestedFeatures();
		}
		return Collections.emptySet();
	}
	
	public @Nullable URI getOriginalUri() {
		return this.originalUri;
	}

	protected IXtextSiriusDescriptor getDescriptor() {
		return this.descriptor;
	}
}
