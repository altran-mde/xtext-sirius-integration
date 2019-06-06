package com.altran.general.integration.xtextsirius.runtime.editor.featureadjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.ElementModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.util.EcoreNavigationUtil;

public class FeatureAdjuster extends AFeatureAdjuster {
	private final ElementModelAdjuster modelAdjuster = new ElementModelAdjuster();

	public FeatureAdjuster(final @NonNull ModelEntryPoint targetModelEntryPoint) {
		super(targetModelEntryPoint);
	}
	
	@Override
	public EObject getTarget(final @NonNull EObject target) {

		if (!this.targetModelEntryPoint.hasValueFeature()) {
			return target;
		}

		final EObject closestElement = this.modelAdjuster.getClosestElement(this.targetModelEntryPoint);

		@SuppressWarnings("null")
		final @NonNull String valueFeatureName = this.targetModelEntryPoint.getValueFeatureName();
		if (EcoreNavigationUtil.hasFeature(closestElement, valueFeatureName)) {
			return target;
		} else {
			return EcoreNavigationUtil.eContainerIfExists(target);
		}
	}

	@Override
	public @Nullable EStructuralFeature getStructuralFeature(final EObject base) {
		if (!this.targetModelEntryPoint.hasValueFeature()) {
			return null;
		}
		
		final EObject closestElement = this.modelAdjuster.getClosestElement(this.targetModelEntryPoint);

		final EStructuralFeature feature = closestElement.eClass()
				.getEStructuralFeature(this.targetModelEntryPoint.getValueFeatureName());
		
		// if (feature == null) {
		// throw new IllegalStateException(
		// "No feature " + this.targetModelEntryPoint.getValueFeatureName() + "
		// in " + base);
		// }
		
		return feature;
	}
	
	@Override
	public Object getValue(final EObject base) {
		if (!this.targetModelEntryPoint.hasValueFeature()) {
			return base;
		}
		
		final EStructuralFeature feature = getStructuralFeature(base);

		if (feature == null) {
			return base;
		}

		final Object value = base.eGet(feature);
		return value;
	}
}
