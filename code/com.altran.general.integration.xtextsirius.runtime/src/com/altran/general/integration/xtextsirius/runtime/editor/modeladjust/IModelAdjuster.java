package com.altran.general.integration.xtextsirius.runtime.editor.modeladjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;

public interface IModelAdjuster {
	public @Nullable EObject getSemanticElement(final @NonNull ModelEntryPoint modelEntryPoint);
	
	public @NonNull EObject getFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint);

	public @NonNull EObject getClosestElement(final @NonNull ModelEntryPoint modelEntryPoint);
	
	public @NonNull EStructuralFeature getStructuralFeature(final @NonNull ModelEntryPoint modelEntryPoint);

	public @Nullable Object getValue(final @NonNull ModelEntryPoint modelEntryPoint);
}
