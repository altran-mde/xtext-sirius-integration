package com.altran.general.integration.xtextsirius.runtime.editor.modeladjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;

public class FeatureNullModelAdjuster extends AModelAdjuster {
	
	@Override
	public @Nullable EObject getSemanticElement(final @NonNull ModelEntryPoint modelEntryPoint) {
		return null;
	}
	
	@Override
	public @NonNull EObject getFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getAssuredFallbackContainer(modelEntryPoint);
	}
	
	@Override
	public @NonNull EStructuralFeature getStructuralFeature(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getFeatureInFallback(modelEntryPoint);
	}
	
	@Override
	public @Nullable Object getValue(final @NonNull ModelEntryPoint modelEntryPoint) {
		return getFallbackContainer(modelEntryPoint).eGet(getStructuralFeature(modelEntryPoint));
	}
}
