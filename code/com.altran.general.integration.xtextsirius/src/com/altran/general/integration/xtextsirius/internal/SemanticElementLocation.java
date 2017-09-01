package com.altran.general.integration.xtextsirius.internal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;

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
