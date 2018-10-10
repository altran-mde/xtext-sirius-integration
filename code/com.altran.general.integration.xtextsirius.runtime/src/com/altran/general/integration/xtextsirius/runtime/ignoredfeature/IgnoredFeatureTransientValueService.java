/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.ignoredfeature;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.serializer.sequencer.LegacyTransientValueService;

@SuppressWarnings("restriction")
public class IgnoredFeatureTransientValueService extends LegacyTransientValueService {
	@Override
	public ValueTransient isValueTransient(final EObject semanticObject, final EStructuralFeature feature) {
		if (isIgnoredFeature(semanticObject, feature)) {
			return ValueTransient.YES;
		}
		
		return super.isValueTransient(semanticObject, feature);
	}
	
	@Override
	public ListTransient isListTransient(final EObject semanticObject, final EStructuralFeature feature) {
		if (isIgnoredFeature(semanticObject, feature)) {
			return ListTransient.YES;
		}
		
		return super.isListTransient(semanticObject, feature);
	}
	
	@Override
	public boolean isValueInListTransient(final EObject semanticObject, final int index,
			final EStructuralFeature feature) {
		if (isIgnoredFeature(semanticObject, feature)) {
			return true;
		}
		
		return super.isValueInListTransient(semanticObject, index, feature);
	}
	
	protected boolean isIgnoredFeature(final EObject semanticObject, final EStructuralFeature feature) {
		if (semanticObject == null || feature == null) {
			return false;
		}

		return semanticObject.eAdapters().stream()
				.filter(IgnoredFeatureAdapter.class::isInstance)
				.map(IgnoredFeatureAdapter.class::cast)
				.anyMatch(a -> feature.getName().equals(a.getFeatureName()));
	}
}
