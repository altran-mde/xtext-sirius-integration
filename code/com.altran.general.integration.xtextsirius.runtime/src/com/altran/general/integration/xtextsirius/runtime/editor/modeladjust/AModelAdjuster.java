package com.altran.general.integration.xtextsirius.runtime.editor.modeladjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.util.EcoreNavigationUtil;

public abstract class AModelAdjuster implements IModelAdjuster {
	protected @NonNull EObject getAssuredFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint) {
		final EObject fallbackContainer = modelEntryPoint.getFallbackContainer();
		if (fallbackContainer != null) {
			return fallbackContainer;
		} else {
			final EObject element = modelEntryPoint.getSemanticElement();
			if (element != null) {
				return EcoreNavigationUtil.eContainerIfExists(element);
			} else {
				throw new IllegalStateException("No FallbackContainer");
			}
		}
	}

	protected @NonNull EStructuralFeature getFeatureInFallback(final @NonNull ModelEntryPoint modelEntryPoint) {
		final String valueFeatureName = modelEntryPoint.getValueFeatureName();
		if (valueFeatureName != null) {
			return getAssuredFallbackContainer(modelEntryPoint).eClass().getEStructuralFeature(valueFeatureName);
		} else {
			throw new IllegalStateException("No valueFeatureName");
		}
	}
}
