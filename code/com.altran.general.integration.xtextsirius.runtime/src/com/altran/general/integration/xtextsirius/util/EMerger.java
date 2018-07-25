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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
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

	protected void mergeContainmentRecursive(
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
		
		final Object newValue = newEl.eGet(feature, false);
		final Object oldValue = exist != null ? exist.eGet(feature, false) : null;
		mergeFeatureValueRecursive(feature, prefix, exist, newEl, oldValue, newValue);
	}

	protected void mergeFeatureValueRecursive(final EStructuralFeature feature, final String prefix,
			final EObject exist, final EObject newEl, final Object oldValue, final Object newValue) {
		
		final String featurePath = (prefix + "." + feature.getName()).replaceFirst("^\\.", "");

		if (this.nestedFeaturesToIgnore.contains(featurePath)) {
			return;
		}

		if (feature.isChangeable()) {
			if (newValue != null) {
				if (feature instanceof EReference) {
					if (((EReference) feature).isContainment()) {
						Object oldValueOrCreated = oldValue;
						if (exist != null && oldValueOrCreated == null && newValue instanceof EObject) {
							oldValueOrCreated = EcoreUtil.create(((EObject) newValue).eClass());
							exist.eSet(feature, oldValueOrCreated);
						}
						mergeEReferences(feature, exist, newEl, oldValueOrCreated, newValue,
								(exst, nEl) -> mergeContainmentRecursive(featurePath, exst, nEl));
					} else if (exist != null) {
						exist.eSet(feature, newValue);
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
			} else if (exist != null) {
				exist.eUnset(feature);
			}
		}
	}

	@SuppressWarnings("unchecked")
	protected <E> void mergeAttributeOrReference(
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
		} else if (oldValue instanceof Collection) {
			final Collection<E> oldValues = ((Collection<E>) oldValue);

			oldValues.remove(exst);

			if (nEl != null) {
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
			if (oldValue instanceof Collection) {
				final Collection<@NonNull EObject> oldValues = ((Collection<@NonNull EObject>) oldValue);
				if (newValue instanceof Collection) {
					final Collection<@NonNull EObject> values = (Collection<@NonNull EObject>) newValue;
					ECollectionUtil.getInstance().processOrAddAllLocal(oldValues, values, uri,
							(c, nEl) -> {
								final EObject newEObject = EcoreUtil.create(nEl.eClass());
								oldValues.add(newEObject);
								merger.accept(newEObject, nEl);
							},
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
