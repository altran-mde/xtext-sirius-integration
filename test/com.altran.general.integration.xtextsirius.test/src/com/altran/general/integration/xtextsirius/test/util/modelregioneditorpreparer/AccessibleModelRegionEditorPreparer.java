package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.util.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.runtime.util.SemanticElementLocation;
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

	@Override
	public TextRegion calculateRegionForFeatures(final EObject semanticElement) {
		return super.calculateRegionForFeatures(semanticElement);
	}

	@Override
	public SemanticElementLocation constructXtextFragmentSchemeBasedLocation() {
		return super.constructXtextFragmentSchemeBasedLocation();
	}

	@Override
	public void prepare() {
		super.prepare();
	}

	@Override
	public Set<EStructuralFeature> resolveDefinedFeatures(final EObject semanticElement) {
		return super.resolveDefinedFeatures(semanticElement);
	}

	@Override
	public Set<@NonNull EStructuralFeature> resolveEditableFeatures(final EObject semanticElement) {
		return super.resolveEditableFeatures(semanticElement);
	}

	@Override
	public boolean canBeHandledByGetRegionForFeature(@NonNull final EStructuralFeature feature) {
		return super.canBeHandledByGetRegionForFeature(feature);
	}

	@Override
	public @NonNull Set<@NonNull ISemanticRegion> translateToRegions(
			@NonNull final Set<@NonNull EStructuralFeature> features, @NonNull final IEObjectRegion semanticRegion,
			@NonNull final EObject semanticElement, @NonNull final ITextRegionAccess rootRegion) {
		return super.translateToRegions(features, semanticRegion, semanticElement, rootRegion);
	}

	public void setDefinedFeatures(final @NonNull Set<@NonNull EStructuralFeature> definedFeatures) {
		this.definedEditableFeatures.addAll(definedFeatures);
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

	public boolean isPrepared() {
		return this.prepared;
	}
}