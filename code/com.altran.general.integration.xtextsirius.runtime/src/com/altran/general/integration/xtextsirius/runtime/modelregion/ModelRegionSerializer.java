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
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;

import com.altran.general.integration.xtextsirius.runtime.ignoredfeature.IgnoredFeatureAdapter;
import com.altran.general.integration.xtextsirius.runtime.util.FeaturePathUtil;
import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public class ModelRegionSerializer {
	private final ModelRegionEditorPreparer preparer;

	public ModelRegionSerializer(final ModelRegionEditorPreparer preparer) {
		this.preparer = preparer;
	}

	public ITextRegionAccess serialize(final @NonNull EObject rootContainer) {
		markIgnoredFeatures(rootContainer);
		return this.preparer.getSerializer().serializeToRegions(rootContainer);
	}

	protected void markIgnoredFeatures(final @NonNull EObject rootContainer) {
		final EClass semanticElementEClass = getSemanticElementEClass();
		Lists.newArrayList(rootContainer.eAllContents()).stream()
				.filter(eObject -> eObject.eClass() == semanticElementEClass)
				.forEach(eObject -> markIgnoredFeatures("", eObject));
	}

	protected void markIgnoredFeatures(final @NonNull String prefix, final @NonNull EObject element) {
		element.eClass().getEAllStructuralFeatures().stream()
				.forEach(feature -> markIgnoredFeature(feature, prefix, element));
	}

	protected void markIgnoredFeatures(final @NonNull String prefix, final @NonNull Collection<EObject> element) {
		element.stream()
				.forEach(eObject -> markIgnoredFeatures(prefix, eObject));
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
			if (child instanceof EObject) {
				markIgnoredFeatures(featurePath, (EObject) child);
			} else if (feature.isMany() && child instanceof Collection) {
				final List<EObject> children = getEObjectsInCollection((Collection<?>) child);
				markIgnoredFeatures(prefix, children);
			}
		}
	}

	protected EClass getSemanticElementEClass() {
		if (this.preparer.getSemanticElement() != null) {
			return this.preparer.getSemanticElement().eClass();
		} else {
			return (EClass) this.preparer.getSemanticElementFeature().getEType();
		}
	}

	protected List<EObject> getEObjectsInCollection(final Collection<?> collection) {
		return collection.stream()
				.filter(EObject.class::isInstance)
				.map(EObject.class::cast)
				.collect(Collectors.toList());
	}
}
