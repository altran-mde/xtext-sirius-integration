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
	private @Nullable URI originalUri;

	public EMerger(
			final @NonNull T existing,
			final @NonNull Set<@NonNull String> featuresToReplace,
			final @NonNull Set<@NonNull String> nestedFeaturesToIgnore) {
		this(existing, featuresToReplace, nestedFeaturesToIgnore, null);
	}

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

		mergeFeatureValueRecursive(feature, "", this.existing, null, oldValue, newValue);
		
		return this.existing;
	}
	
	protected void merge(final @NonNull EObject exist, final @NonNull EObject newEl) {
		for (final EStructuralFeature feature : exist.eClass().getEAllStructuralFeatures()) {
			if (feature.isChangeable()) {
				if (this.featuresToReplace.isEmpty() || this.featuresToReplace.contains(feature.getName())) {
					mergeFeatureRecursive(feature, "", exist, newEl);
				}
			}

		}
	}

	protected void mergeFeatureRecursive(
			final @NonNull EStructuralFeature feature,
			final @NonNull String prefix,
			final @Nullable EObject exist,
			final @NonNull EObject newEl) {
		
		final Object newValue = newEl.eGet(feature, false);
		final Object oldValue = exist != null ? exist.eGet(feature, false) : null;
		mergeFeatureValueRecursive(feature, prefix, exist, newEl, oldValue, newValue);
	}

	protected void mergeFeatureValueRecursive(
			final @NonNull EStructuralFeature feature,
			final @NonNull String prefix,
			final @Nullable EObject exist,
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
					Object oldValueOrCreated = oldValue;
					if (exist != null && oldValueOrCreated == null && newValue instanceof EObject) {
						oldValueOrCreated = EcoreUtil.create(((EObject) newValue).eClass());
						exist.eSet(feature, oldValueOrCreated);
					}
					mergeContainmentRecursive(feature, featurePath, exist, newEl, oldValueOrCreated, newValue);
				} else {
					if (exist != null) {
						mergeCrossReference(feature, exist, oldValue, newValue);
					}
				}
			} else {
				if (newValue instanceof Collection) {
					for (final Object newVal : (Collection<?>) newValue) {
						mergeAttribute(feature, exist, oldValue, newVal, newVal);
					}
				} else {
					mergeAttribute(feature, exist, oldValue, null, newValue);
				}
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
			final @Nullable EObject exist,
			final @Nullable EObject newEl,
			final @Nullable Object oldValue,
			final @Nullable Object newValue) {
		final URI uri = ECollectionUtil.getInstance().mergeUri(this.originalUri, newEl);
		if (feature.isMany() && oldValue instanceof Collection) {
			final Collection<@NonNull EObject> oldValues = ((Collection<@NonNull EObject>) oldValue);
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
			if (oldValue instanceof EObject) {
				mergeAllContainmentFeaturesRecursive(prefix, (EObject) oldValue, (EObject) newValue);
			} else {
				mergeAllContainmentFeaturesRecursive(prefix, null, (EObject) newValue);
			}
		} else if (newValue == null) {
			if (exist != null) {
				exist.eUnset(feature);
			}
		}
	}
	
	protected void mergeAllContainmentFeaturesRecursive(
			final @NonNull String prefix,
			final @Nullable EObject exist,
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
	protected <E> void mergeAttribute(
			final @NonNull EStructuralFeature feature,
			final @Nullable EObject exist,
			final @Nullable Object oldValue,
			final @Nullable E exst,
			final @Nullable E nEl) {
		if (oldValue instanceof List) {
			final List<E> oldValues = ((List<E>) oldValue);

			final int index = oldValues.indexOf(exst);
			if (index >= 0) {
				oldValues.remove(index);
				if (nEl != null) {
					oldValues.add(index, nEl);
				}
			} else if (nEl != null) {
				oldValues.add(nEl);
			}
		} else if (exist != null) {
			if (nEl != null) {
				exist.eSet(feature, nEl);
			} else {
				exist.eUnset(feature);
			}
		}
	}

}
