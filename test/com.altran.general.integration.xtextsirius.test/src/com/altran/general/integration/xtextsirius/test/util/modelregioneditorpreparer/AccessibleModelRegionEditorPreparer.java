/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.runtime.modelregion.SemanticElementLocation;

class AccessibleModelRegionEditorPreparer extends ModelRegionEditorPreparer {
	
	public AccessibleModelRegionEditorPreparer(
			final IXtextSiriusModelDescriptor descriptor,
			final EObject semanticElement,
			final EObject parentSemanticElement,
			final EStructuralFeature semanticElementFeature) {
		super(descriptor, new MinimalModelAdjuster()
				.adjust(new ModelEntryPoint(semanticElement, parentSemanticElement, semanticElementFeature)));
	}

	public AccessibleModelRegionEditorPreparer(final IXtextSiriusModelDescriptor descriptor,
			final EObject semanticElement) {
		super(descriptor, new MinimalModelAdjuster().adjust(new ModelEntryPoint(semanticElement)));
	}

	public TextRegion calculateRegionForFeatures(final EObject semanticElement) {
		final AccessibleModelRegionCalculator modelRegionCalculator = new AccessibleModelRegionCalculator(this,
				getDefinedEditableFeatures());
		final TextRegion result = modelRegionCalculator.calculateRegionForFeatures(semanticElement, true);
		getDefinedEditableFeatures().addAll(modelRegionCalculator.getDefinedFeatures());
		return result;
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
		return new AccessibleModelRegionCalculator(this).resolveDefinedFeatures(semanticElement, features);
	}

	public Set<@NonNull EStructuralFeature> resolveEditableFeatures(final EObject semanticElement) {
		return new AccessibleModelRegionCalculator(this).resolveFeatures(semanticElement, getEditableFeatures());
	}

	public boolean canBeHandledByGetRegionForFeature(@NonNull final EStructuralFeature feature) {
		return new AccessibleModelRegionCalculator(this).canBeHandledByGetRegionForFeature(feature);
	}

	public @NonNull Set<@NonNull ISemanticRegion> translateToRegions(
			@NonNull final Set<@NonNull EStructuralFeature> features, @NonNull final IEObjectRegion semanticRegion,
			@NonNull final EObject semanticElement, @NonNull final ITextRegionAccess rootRegion) {
		final AccessibleModelRegionCalculator modelRegionCalculator = new AccessibleModelRegionCalculator(this,
				features);
		return modelRegionCalculator.translateToRegions(semanticRegion, semanticElement, rootRegion);
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
