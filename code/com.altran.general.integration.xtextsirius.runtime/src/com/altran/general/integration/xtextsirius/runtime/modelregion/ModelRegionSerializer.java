/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.modelregion;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;

import com.altran.general.integration.xtextsirius.runtime.ignoredfeature.IgnoredFeatureAdapter;
import com.altran.general.integration.xtextsirius.runtime.util.FeaturePathUtil;

@SuppressWarnings("restriction")
public class ModelRegionSerializer {
	private final ModelRegionEditorPreparer preparer;

	public ModelRegionSerializer(final ModelRegionEditorPreparer preparer) {
		this.preparer = preparer;
	}

	public ITextRegionAccess serialize(final @NonNull EObject rootContainer) {
		EClass eClass;
		if (this.preparer.getSemanticElement() != null) {
			eClass = this.preparer.getSemanticElement().eClass();
		} else {
			eClass = (EClass) this.preparer.getSemanticElementFeature().getEType();
		}

		final List<? extends EObject> allInstances = EcoreUtil2.getAllContentsOfType(rootContainer,
				(Class<? extends EObject>) eClass.getInstanceClass());
		for (final EObject instance : allInstances) {
			markIgnoredFeatures("", instance);
		}
		
		
		// if (this.preparer.getSemanticElement() != null) {
		// markIgnoredFeatures("", this.preparer.getSemanticElement());
		// } else {
		// markIgnoredFeature(this.preparer.getSemanticElementFeature(), "",
		// this.preparer.getParent());
		// }
		return this.preparer.getSerializer().serializeToRegions(rootContainer);
	}
	
	protected void markIgnoredFeature(final @NonNull EStructuralFeature feature, final @NonNull String prefix,
			final @Nullable EObject element) {
		if (element == null) {
			return;
		}
		
		final String featurePath = FeaturePathUtil.getInstance().concatFeaturePath(prefix, feature);
		if (this.preparer.getIgnoredNestedFeatures().contains(featurePath)) {
			element.eAdapters().add(new IgnoredFeatureAdapter(feature.getName()));
		} else if (feature instanceof EReference && ((EReference) feature).isContainment()) {
			final Object child = element.eGet(feature);
			System.err.println("child: " + child);
			if (child instanceof EObject) {
				markIgnoredFeatures(featurePath, (EObject) child);
			} else if (feature.isMany() && child instanceof Collection) {
				for (final EObject c : ((Collection<EObject>) child)) {
					markIgnoredFeatures(featurePath, c);
				}
			}
		}
	}

	protected void markIgnoredFeatures(final @NonNull String prefix, final @NonNull EObject element) {
		for (final EStructuralFeature feature : element.eClass().getEAllStructuralFeatures()) {
			markIgnoredFeature(feature, prefix, element);
		}
	}
}
