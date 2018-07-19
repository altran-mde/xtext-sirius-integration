package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class EMerger<T extends EObject> {
	private final T existing;
	private final T newElement;
	private final Set<@NonNull String> featuresToReplace;
	private final Set<@NonNull String> nestedFeaturesToIgnore;
	private @Nullable URI originalUri;

	public EMerger(
			final @NonNull T existing,
			final @NonNull T newElement,
			final @NonNull Set<@NonNull String> featuresToReplace,
			final @NonNull Set<@NonNull String> nestedFeaturesToIgnore) {
		this(existing, newElement, featuresToReplace, nestedFeaturesToIgnore, null);
	}
	
	public EMerger(
			final @NonNull T existing,
			final @NonNull T newElement,
			final @NonNull Set<@NonNull String> featuresToReplace,
			final @NonNull Set<@NonNull String> nestedFeaturesToIgnore,
			final @Nullable URI originalUri) {
		this.existing = existing;
		this.newElement = newElement;
		this.featuresToReplace = featuresToReplace;
		this.nestedFeaturesToIgnore = nestedFeaturesToIgnore;
		this.originalUri = originalUri;
	}

	public T merge() {
		for (final EStructuralFeature feature : this.newElement.eClass().getEAllStructuralFeatures()) {
			if (feature.isChangeable()) {
				if (this.featuresToReplace.isEmpty() || this.featuresToReplace.contains(feature.getName())) {
					mergeFeatureRecursive(feature, "", this.existing, this.newElement);
				}
			}

		}

		return this.existing;
	}

	protected void mergeFeaturesRecursive(
			final @NonNull String prefix,
			final @Nullable EObject exist,
			final @NonNull EObject newEl) {
		for (final EStructuralFeature feature : newEl.eClass().getEAllStructuralFeatures()) {
			mergeFeatureRecursive(feature, prefix, exist, newEl);
		}
	}

	protected void mergeFeatureRecursive(
			final @NonNull EStructuralFeature feature,
			final @NonNull String prefix,
			final @Nullable EObject exist,
			final @NonNull EObject newEl) {

		final String featurePath = prefix + "." + feature.getName();

		if (this.nestedFeaturesToIgnore.contains(featurePath)) {
			return;
		}

		if (feature.isChangeable()) {
			if (newEl.eIsSet(feature)) {
				final Object newValue = newEl.eGet(feature, false);
				final Object oldValue = exist != null ? exist.eGet(feature, false) : null;
				if (feature instanceof EReference) {
					if (((EReference) feature).isContainment()) {
						mergeEReferences(feature, exist, newEl, oldValue, newValue,
								(exst, nEl) -> mergeFeaturesRecursive(prefix, exst, nEl));
					} else {
						exist.eSet(feature, newValue);
						// mergeEReferences(feature, exist, newEl, oldValue,
						// newValue, (exst, nEl) -> {
						// mergeAttributeOrReference(feature, exist, oldValue,
						// exst, nEl);
						// });
					}
				} else if (feature instanceof EAttribute) {
					if (newValue instanceof Collection) {
						for (final Object newVal : (Collection<?>) newValue) {
							mergeAttributeOrReference(feature, exist, oldValue, newVal, newVal);
						}
					} else {
						mergeAttributeOrReference(feature, exist, oldValue, null, newValue);
					}
				}
			} else {
				exist.eUnset(feature);
			}
		}
	}

	@SuppressWarnings("unchecked")
	protected <E> void mergeAttributeOrReference(final EStructuralFeature feature, final EObject exist,
			final Object oldValue, @Nullable final E exst, @Nullable final E nEl) {
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
		} else if (oldValue instanceof Collection) {
			final Collection<E> oldValues = ((Collection<E>) oldValue);

			oldValues.remove(exst);

			if (nEl != null) {
				oldValues.add(nEl);
			}
		} else {
			if (nEl != null) {
				exist.eSet(feature, nEl);
			} else {
				exist.eUnset(feature);
			}
		}
	}

	@SuppressWarnings("unchecked")
	protected void mergeEReferences(
			final @NonNull EStructuralFeature feature,
			final @Nullable EObject exist,
			final @NonNull EObject newEl,
			final @Nullable Object oldValue,
			final @Nullable Object newValue,
			final @NonNull BiConsumer<@Nullable EObject, @NonNull EObject> merger) {
		final URI uri = ECollectionUtil.getInstance().mergeUri(this.originalUri, newEl);
		final boolean many = FeatureMapUtil.isMany(newEl, feature) && oldValue instanceof Collection;
		if (many) {
			final Collection<EObject> oldValues = ((Collection<EObject>) oldValue);
			if (newValue instanceof Collection) {
				final Collection<EObject> values = (Collection<EObject>) newValue;
				ECollectionUtil.getInstance().processOrAddAllLocal(oldValues, values, uri,
						(c, nEl) -> merger.accept(null, nEl),
						(exst, nEl) -> merger.accept(exst, nEl));
			} else if (newValue instanceof EObject) {
				ECollectionUtil.getInstance().processOrAddLocal(oldValues, (EObject) newValue,
						uri, (exst, nEl) -> {
							merger.accept(exst, nEl);
							return null;
						});
			} else if (newValue == null) {
				// don't do anything
			}
		} else if (newValue instanceof EObject) {
			if (oldValue instanceof EObject) {
				merger.accept((EObject) oldValue, (EObject) newValue);
			} else {
				merger.accept(null, (EObject) newValue);
			}
		} else if (newValue == null) {
			if (exist != null) {
				exist.eUnset(feature);
			}
		}
	}
}
