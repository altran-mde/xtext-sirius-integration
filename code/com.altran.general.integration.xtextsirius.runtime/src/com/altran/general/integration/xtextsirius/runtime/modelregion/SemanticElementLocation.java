/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.modelregion;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Stores the location of an {@link EObject} in a robust way.
 *
 * <p>
 * We can store the location of any EObject or a non-existing EObject, given its
 * parent, containing feature and index (if the containing feature is a
 * collection). The location can be resolved even if there are major changes to
 * the target or descendants. It might not be resolvable if the model changed
 * outside of the target.
 * </p>
 *
 * <p>
 * We do not keep any expensive / highly connected state of the target; We keep
 * a reference to the target's metamodel. This should reduce memory leaks.
 * </p>
 *
 * @author nstotz
 *
 */
public class SemanticElementLocation {

	private String uriFragment;
	private String parentUriFragment;
	private EStructuralFeature containingFeature;
	private int index;

	public SemanticElementLocation(final @NonNull EObject semanticElement) {
		storeLocation(semanticElement);
	}

	public SemanticElementLocation(
			final @NonNull String uriFragment,
			final @NonNull String parentUriFragment,
			final @NonNull EStructuralFeature containingFeature,
			final int index) {
		this.uriFragment = uriFragment;
		this.parentUriFragment = parentUriFragment;
		this.containingFeature = containingFeature;
		this.index = index;
	}

	@SuppressWarnings("unchecked")
	private void storeLocation(final @NonNull EObject semanticElement) {
		final Resource resource = semanticElement.eResource();
		this.uriFragment = resource.getURIFragment(semanticElement);
		this.parentUriFragment = resource.getURIFragment(semanticElement.eContainer());
		this.containingFeature = semanticElement.eContainingFeature();
		if (this.containingFeature.isMany()) {
			this.index = ((EList<EObject>) semanticElement.eContainer()
					.eGet(this.containingFeature)).indexOf(semanticElement);
		}
	}

	@SuppressWarnings("unchecked")
	public EObject resolve(final @NonNull Resource resource) {
		final EObject result = resource.getEObject(this.uriFragment);
		if (result != null) {
			return result;
		}

		final Object containingElement = resource.getEObject(this.parentUriFragment).eGet(this.containingFeature);
		if (this.containingFeature.isMany()) {
			return ((EList<EObject>) containingElement).get(this.index);
		} else {
			return (EObject) containingElement;
		}
	}
}
