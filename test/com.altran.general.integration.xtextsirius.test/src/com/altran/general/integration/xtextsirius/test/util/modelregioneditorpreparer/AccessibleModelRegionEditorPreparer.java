package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionCalculator;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.runtime.modelregion.SemanticElementLocation;
import com.google.inject.Injector;

class AccessibleModelRegionEditorPreparer extends ModelRegionEditorPreparer {

	public AccessibleModelRegionEditorPreparer(final Injector injector, final EObject semanticElement,
			final EObject parentSemanticElement,
			final EStructuralFeature semanticElementFeature) {
		super(injector, semanticElement, parentSemanticElement, semanticElementFeature);
	}
	
	public AccessibleModelRegionEditorPreparer(final Injector injector, final EObject semanticElement) {
		super(injector, semanticElement);
	}
	
	public TextRegion calculateRegionForFeatures(final EObject semanticElement) {
		return new ModelRegionCalculator(this).calculateRegionForFeatures(semanticElement, getDefinedEditableFeatures(),
				true);
	}
	
	@Override
	public SemanticElementLocation constructXtextFragmentSchemeBasedLocation() {
		return super.constructXtextFragmentSchemeBasedLocation();
	}
	
	@Override
	public void prepare() {
		super.prepare();
	}
	
	public Set<EStructuralFeature> resolveDefinedFeatures(final EObject semanticElement) {
		final @NonNull Set<@NonNull EStructuralFeature> features = resolveEditableFeatures(semanticElement);
		return new ModelRegionCalculator(this).resolveDefinedFeatures(semanticElement, features);
	}
	
	public Set<@NonNull EStructuralFeature> resolveEditableFeatures(final EObject semanticElement) {
		return new ModelRegionCalculator(this).resolveFeatures(semanticElement, getEditableFeatures());
	}
	
	public boolean canBeHandledByGetRegionForFeature(@NonNull final EStructuralFeature feature) {
		return new ModelRegionCalculator(this).canBeHandledByGetRegionForFeature(feature);
	}
	
	public @NonNull Set<@NonNull ISemanticRegion> translateToRegions(
			@NonNull final Set<@NonNull EStructuralFeature> features, @NonNull final IEObjectRegion semanticRegion,
			@NonNull final EObject semanticElement, @NonNull final ITextRegionAccess rootRegion) {
		return new ModelRegionCalculator(this).translateToRegions(features, semanticRegion, semanticElement,
				rootRegion);
	}
	
	public void setDefinedFeatures(final @NonNull Set<@NonNull EStructuralFeature> definedFeatures) {
		this.getDefinedEditableFeatures().addAll(definedFeatures);
	}
	
	public void setSemanticRegion(final @NonNull IEObjectRegion semanticRegion) {
		this.semanticRegion = semanticRegion;
	}
	
	public void setRootRegion(final @NonNull ITextRegionAccess rootRegion) {
		this.rootRegion = rootRegion;
	}
	
	public void setAllText(final @NonNull StringBuffer text) {
		this.allText = text;
	}
	
	@Override
	public boolean isPrepared() {
		return super.isPrepared();
	}
}