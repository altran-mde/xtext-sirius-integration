package com.altran.general.integration.xtextsirius.runtime.editor.modeladjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;

public class FeatureFallbackModelAdjuster extends AModelAdjuster {
	
	@Override
	public @Nullable EObject getSemanticElement(final @NonNull ModelEntryPoint modelEntryPoint) {
		final Object featureValue = getAssuredFallbackContainer(modelEntryPoint)
				.eGet(getFeatureInFallback(modelEntryPoint));
		if (featureValue == null || featureValue instanceof EObject) {
			return (EObject) featureValue;
		} else {
			throw new IllegalStateException("featureValue no EObject");
		}
	}
	
	@Override
	public @NonNull EObject getFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getAssuredFallbackContainer(modelEntryPoint);
	}
	
	@Override
	public @NonNull EStructuralFeature getStructuralFeature(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getFeatureInFallback(modelEntryPoint);
	}
}
