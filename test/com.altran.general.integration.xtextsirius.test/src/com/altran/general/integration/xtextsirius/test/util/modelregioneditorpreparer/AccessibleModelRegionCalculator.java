package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;

import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionCalculator;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;

public class AccessibleModelRegionCalculator extends ModelRegionCalculator {

	public AccessibleModelRegionCalculator(final ModelRegionEditorPreparer preparer) {
		super(preparer);
	}

	public AccessibleModelRegionCalculator(final AccessibleModelRegionEditorPreparer preparer,
			final Set<@NonNull EStructuralFeature> definedEditableFeatures) {
		super(preparer, definedEditableFeatures);
	}
	
	@Override
	public @NonNull Set<@NonNull EStructuralFeature> resolveDefinedFeatures(
			final @NonNull EObject semanticElement,
			final @NonNull Set<@NonNull EStructuralFeature> features) {
		return super.resolveDefinedFeatures(semanticElement, features);
	}

	@Override
	public boolean canBeHandledByGetRegionForFeature(final @NonNull EStructuralFeature feature) {
		return super.canBeHandledByGetRegionForFeature(feature);
	}

	
	@Override
	public @NonNull Set<@NonNull EStructuralFeature> resolveFeatures(final @NonNull EObject semanticElement,
			@NonNull final Set<@NonNull String> featureNames) {
		return super.resolveFeatures(semanticElement, featureNames);
	}
	
	@Override
	public @NonNull Set<@NonNull ISemanticRegion> translateToRegions(
			final @NonNull IEObjectRegion semanticRegion,
			final @NonNull EObject semanticElement,
			final @NonNull ITextRegionAccess rootRegion) {
		return super.translateToRegions(semanticRegion, semanticElement, rootRegion);
	}
}
