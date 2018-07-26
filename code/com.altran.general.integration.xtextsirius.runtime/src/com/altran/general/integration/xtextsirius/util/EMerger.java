package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class EMerger<T extends EObject> {
	private final @NonNull T existing;
	private final Set<@NonNull String> featuresToReplace;
	private final Set<@NonNull String> nestedFeaturesToIgnore;
	private @Nullable final URI originalUri;

	public EMerger(
			final @NonNull T existing,
			final @NonNull Set<@NonNull String> featuresToReplace,
			final @NonNull Set<@NonNull String> nestedFeaturesToIgnore,
			final @Nullable URI originalUri) {
		this.existing = existing;
		this.featuresToReplace = featuresToReplace;
		this.nestedFeaturesToIgnore = nestedFeaturesToIgnore;
		this.originalUri = originalUri;
	}

	public @NonNull T merge(final @NonNull T newElement) {
		merge(this.existing, newElement);
		
		return this.existing;
	}
	
	public @NonNull T merge(final @Nullable Object newValue, final @NonNull EStructuralFeature feature) {
		final Object oldValue = this.existing.eGet(feature);

		if (feature.isMany()
				&& feature instanceof EReference
				&& ((EReference) feature).isContainment()
				&& newValue instanceof Collection) {
			validateNewValue(feature, newValue);
			this.existing.eSet(feature, newValue);
		} else {
			mergeFeatureValueRecursive(feature, "", this.existing, null, oldValue, newValue);
		}
		
		return this.existing;
	}
	
	protected void merge(final @NonNull EObject exist, final @NonNull EObject newEl) {
		for (final EStructuralFeature feature : exist.eClass().getEAllStructuralFeatures()) {
			if (validateFirstLevelFeature(feature)) {
				mergeFeatureRecursive(feature, "", exist, newEl);
			}
		}
	}
	
	protected boolean validateFirstLevelFeature(final EStructuralFeature feature) {
		return feature.isChangeable() && this.featuresToReplace.isEmpty()
				|| this.featuresToReplace.contains(feature.getName());
	}

	protected void mergeFeatureRecursive(
			final @NonNull EStructuralFeature feature,
			final @NonNull String prefix,
			final @NonNull EObject exist,
			final @NonNull EObject newEl) {
		
		final Object newValue = newEl.eGet(feature, false);
		final Object oldValue = exist.eGet(feature, false);
		mergeFeatureValueRecursive(feature, prefix, exist, newEl, oldValue, newValue);
	}

	protected void mergeFeatureValueRecursive(
			final @NonNull EStructuralFeature feature,
			final @NonNull String prefix,
			final @NonNull EObject exist,
			final @Nullable EObject newEl,
			final @Nullable Object oldValue,
			final @Nullable Object newValue) {
		
		final String featurePath = (prefix + "." + feature.getName()).replaceFirst("^\\.", "");

		if (this.nestedFeaturesToIgnore.contains(featurePath)) {
			return;
		}

		validateNewValue(feature, newValue);

		if (feature.isChangeable()) {
			if (feature instanceof EReference) {
				if (((EReference) feature).isContainment()) {
					mergeContainmentRecursive(feature, featurePath, exist, newEl, oldValue, newValue);
				} else {
					mergeCrossReference(feature, exist, oldValue, newValue);
				}
			} else {
				mergeAttribute(feature, exist, oldValue, newValue);
			}
		}
	}

	protected void validateNewValue(final EStructuralFeature feature, final Object newValue) {
		if (newValue != null) {
			if (newValue instanceof Collection) {
				if (!feature.isMany()) {
					throw new IllegalStateException(
							"Cannot add collection to single-value feature " + feature.getName() + ": " + newValue);
				}
				for (final Object n : (Collection<?>) newValue) {
					if (!feature.getEType().isInstance(n)) {
						throw new ClassCastException("value incompatible with feature " + feature.getName() + ": " + n);
					}
				}
			} else if (!feature.getEType().isInstance(newValue)) {
				throw new ClassCastException("value incompatible with feature " + feature.getName() + ": " + newValue);
			}
		}
	}

	@SuppressWarnings("unchecked")
	protected void mergeContainmentRecursive(
			final @NonNull EStructuralFeature feature,
			final @NonNull String prefix,
			final @NonNull EObject exist,
			final @Nullable EObject newEl,
			final @Nullable Object oldValue,
			final @Nullable Object newValue) {
		final URI uri = ECollectionUtil.getInstance().mergeUri(this.originalUri, newEl);

		Object oldValueOrCreated = oldValue;
		if (oldValueOrCreated == null) {
			if (newValue instanceof EObject) {
				oldValueOrCreated = EcoreUtil.create(((EObject) newValue).eClass());
				exist.eSet(feature, oldValueOrCreated);
			}
		}
		
		if (feature.isMany()) {
			final @NonNull Collection<@NonNull EObject> oldValues = ((@NonNull Collection<@NonNull EObject>) oldValueOrCreated);
			if (newValue instanceof Collection) {
				final Collection<@NonNull EObject> values = (Collection<@NonNull EObject>) newValue;
				ECollectionUtil.getInstance().processOrAddAllLocal(oldValues, values, uri,
						(c, nEl) -> {
							final EObject newEObject = EcoreUtil.create(nEl.eClass());
							oldValues.add(newEObject);
							mergeAllContainmentFeaturesRecursive(prefix, newEObject, nEl);
						},
						(exst, nEl) -> mergeAllContainmentFeaturesRecursive(prefix, exst, nEl));
			} else if (newValue instanceof EObject) {
				ECollectionUtil.getInstance().processOrAddLocal(oldValues, (EObject) newValue,
						uri, (exst, nEl) -> {
							mergeAllContainmentFeaturesRecursive(prefix, exst, nEl);
							return null;
						});
			} else if (newValue == null) {
				// don't do anything
			}
		} else if (newValue instanceof EObject) {
			final EObject nonNullOldValue = (@NonNull EObject) oldValueOrCreated;
			mergeAllContainmentFeaturesRecursive(prefix, nonNullOldValue, (EObject) newValue);
		} else {
			exist.eUnset(feature);
		}
	}
	
	protected void mergeAllContainmentFeaturesRecursive(
			final @NonNull String prefix,
			final @NonNull EObject exist,
			final @NonNull EObject newEl) {
		for (final EStructuralFeature feature : newEl.eClass().getEAllStructuralFeatures()) {
			mergeFeatureRecursive(feature, prefix, exist, newEl);
		}
	}

	@SuppressWarnings("unchecked")
	protected void mergeCrossReference(
			final @NonNull EStructuralFeature feature,
			final @NonNull EObject exist,
			final @Nullable Object oldValue,
			final @Nullable Object newValue) {
		final URI uri = newValue instanceof EObject
				? ECollectionUtil.getInstance().mergeUri(this.originalUri, (EObject) newValue)
				: null;
		if (newValue instanceof Collection) {
			exist.eSet(feature, newValue);
		} else if (newValue instanceof EObject) {
			if (oldValue instanceof List) {
				final List<@NonNull EObject> oldValues = ((List<@NonNull EObject>) oldValue);
				
				ECollectionUtil.getInstance().processOrAddLocal(oldValues, (EObject) newValue, uri,
						(exVals, nEl) -> exVals.add(nEl), (ex, nEl) -> EcoreUtil.replace(exist, feature, ex, nEl));
			} else {
				exist.eSet(feature, newValue);
			}
		} else {
			if (feature.isMany()) {
				// don't do anything
			} else {
				exist.eUnset(feature);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void mergeAttribute(
			final @NonNull EStructuralFeature feature,
			final @NonNull EObject exist,
			final @Nullable Object oldValue,
			final @Nullable Object newValue) {
		if (newValue instanceof Collection) {
			final @NonNull List<@NonNull Object> oldValues = (@NonNull List<@NonNull Object>) oldValue;
			
			for (final Object newVal : (Collection<@NonNull Object>) newValue) {
				mergeSingleEAttribute(oldValues, newVal);
			}
		} else if (newValue != null) {
			if (oldValue instanceof List) {
				mergeSingleEAttribute(((List<@NonNull Object>) oldValue), newValue);
			} else {
				exist.eSet(feature, newValue);
			}
		} else {
			if (feature.isMany()) {
				// don't do anything
			} else {
				exist.eUnset(feature);
			}
		}
	}

	protected <E> void mergeSingleEAttribute(
			final @NonNull List<@NonNull E> oldValues,
			final @NonNull E newVal) {
		final int index = oldValues.indexOf(newVal);
		if (index >= 0) {
			oldValues.remove(index);
			oldValues.add(index, newVal);
		} else {
			oldValues.add(newVal);
		}
	}
}