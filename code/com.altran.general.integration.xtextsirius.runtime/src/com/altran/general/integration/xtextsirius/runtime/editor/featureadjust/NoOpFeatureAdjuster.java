package com.altran.general.integration.xtextsirius.runtime.editor.featureadjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.util.EcoreNavigationUtil;

public class NoOpFeatureAdjuster extends AFeatureAdjuster {
	public NoOpFeatureAdjuster(final @NonNull ModelEntryPoint targetModelEntryPoint) {
		super(targetModelEntryPoint);
	}

	@Override
	public @NonNull EObject getTarget(final @NonNull EObject target) {
		final EObject semanticElement = this.targetModelEntryPoint.getSemanticElement();
		
		if (semanticElement == null) {
			throw new IllegalStateException("semanticElement must not be null");
		}
		
		return semanticElement;
	}

	@Override
	public @Nullable EStructuralFeature getStructuralFeature(final @NonNull EObject base) {
		return null;
	}

	@Override
	public @Nullable Object getValue(final @NonNull EObject base) {
		if (this.targetModelEntryPoint.hasValueFeature()) {
			@SuppressWarnings("null")
			final @NonNull String valueFeatureName = this.targetModelEntryPoint.getValueFeatureName();
			if (!EcoreNavigationUtil.hasFeature(base, valueFeatureName)) {
				throw new IllegalStateException("no feature " + valueFeatureName + " in " + base);
			}
			
			return base.eGet(base.eClass().getEStructuralFeature(valueFeatureName));
		}
		
		return base;
	}
	
}
