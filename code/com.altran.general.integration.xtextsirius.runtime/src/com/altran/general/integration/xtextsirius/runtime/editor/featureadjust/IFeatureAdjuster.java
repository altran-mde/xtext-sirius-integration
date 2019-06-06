package com.altran.general.integration.xtextsirius.runtime.editor.featureadjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;


public interface IFeatureAdjuster {
	
	public @NonNull EObject getTarget(final @NonNull EObject target);
	
	public @Nullable EStructuralFeature getStructuralFeature(final @NonNull EObject base);
	
	public @Nullable Object getValue(@NonNull EObject base);
}