package com.altran.general.integration.xtextsirius.runtime.editor.modeladjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;

public class ElementModelAdjuster extends AModelAdjuster {

	@Override
	public @NonNull EObject getSemanticElement(final @NonNull ModelEntryPoint modelEntryPoint) {
		final EObject semanticElement = modelEntryPoint.getSemanticElement();
		if (semanticElement != null) {
			return semanticElement;
		} else {
			throw new IllegalStateException("No SemanticElement");
		}
	}

	@Override
	public @NonNull EObject getFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getAssuredFallbackContainer(modelEntryPoint);
	}

	@Override
	public @NonNull EStructuralFeature getStructuralFeature(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getSemanticElement(modelEntryPoint).eContainingFeature();
	}
}
