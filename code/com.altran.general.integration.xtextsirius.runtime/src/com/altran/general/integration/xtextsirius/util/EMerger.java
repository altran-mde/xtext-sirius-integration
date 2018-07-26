package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;

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
		for (final EStructuralFeature feature : this.existing.eClass().getEAllStructuralFeatures()) {
			if (validateFirstLevelFeature(feature)) {
				mergeFeatureRecursive(feature, "", this.existing, newElement);
			}
		}
		
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
	
	protected boolean validateFirstLevelFeature(final EStructuralFeature feature) {
		return feature.isChangeable() && this.featuresToReplace.isEmpty()
				|| this.featuresToReplace.contains(feature.getName());
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

	@SuppressWarnings("unchecked")
	protected void mergeContainmentRecursive(
			final @NonNull EStructuralFeature feature,
			final @NonNull String prefix,
			final @NonNull EObject exist,
			final @Nullable EObject newEl,
			final @Nullable Object oldValue,
			final @Nullable Object newValue) {
		final URI uri = mergeUri(this.originalUri, newEl);

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
				for (final EObject newValue1 : values) {
					mergeOrAdd(oldValues, newValue1, uri, (c, nEl) -> {
						final EObject newEObject = EcoreUtil.create(nEl.eClass());
						oldValues.add(newEObject);
						mergeAllContainmentFeaturesRecursive(prefix, newEObject, nEl);
					}, (exst, nEl) -> mergeAllContainmentFeaturesRecursive(prefix, exst, nEl));
				}
			} else if (newValue instanceof EObject) {
				final EObject newElement = (EObject) newValue;
				final EObject existing = findMember(oldValues, newElement, uri);

				if (existing == null) {
					oldValues.add(newElement);
				} else {
					mergeAllContainmentFeaturesRecursive(prefix, existing, newElement);
				}
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
				? mergeUri(this.originalUri, (EObject) newValue)
				: null;
		
		if (newValue instanceof Collection) {
			exist.eSet(feature, newValue);
		} else if (newValue instanceof EObject) {
			if (oldValue instanceof List) {
				final List<@NonNull EObject> oldValues = ((List<@NonNull EObject>) oldValue);
				
				mergeOrAdd(oldValues, (EObject) newValue, uri,
						(exVals, nEl) -> exVals.add(nEl),
						(ex, nEl) -> EcoreUtil.replace(exist, feature, ex, nEl));
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

	protected @Nullable URI mergeUri(final @Nullable URI originalParentUri, final @Nullable EObject element) {
		if (originalParentUri == null || element == null) {
			return null;
		}
		
		final URI uri = EcoreUtil.getURI(element);

		String newTidyFragment;
		if (EcoreUtil.getID(element) == null) {
			
			final EObject container = element.eContainer();
			URI parentUri = null;
			if (container != null) {
				parentUri = EcoreUtil.getURI(container);
			} else {
				parentUri = uri.trimFragment().appendFragment("");
			}
			
			final String relativeFragment = uri.fragment().substring(parentUri.fragment().length());
			
			final String newFragment = originalParentUri.fragment() + relativeFragment;
			newTidyFragment = newFragment.replaceFirst("^//+([^/])", "/$1").replaceFirst("^//+", "//");
		} else {
			newTidyFragment = uri.fragment();
		}

		final URI originalUri = originalParentUri.trimFragment().appendFragment(newTidyFragment);
		
		return originalUri;
	}
	
	protected <E extends EObject> void mergeOrAdd(
			final Collection<@NonNull E> existingValues,
			final E newValue,
			final URI originalParentUri,
			final BiConsumer<@NonNull Collection<@NonNull E>, @NonNull E> adder,
			final BiConsumer<@NonNull E, @NonNull E> merger) {
		final URI originalUri = mergeUri(originalParentUri, newValue);
		
		final E existing = findMember(existingValues, newValue, originalUri);
		
		if (existing == null) {
			adder.accept(existingValues, newValue);
		} else {
			merger.accept(existing, newValue);
		}
	}

	protected <E extends EObject> @Nullable E findMember(
			final @NonNull Collection<@NonNull E> collection,
			final @NonNull E element,
			final @Nullable URI originalUri) {
		final String elementId = EcoreUtil.getID(element);
		if (elementId != null) {
			@SuppressWarnings("null")
			final E existing = collection.stream()
					.filter(e -> elementId.equals(EcoreUtil.getID(e)))
					.findAny()
					.orElse(null);

			return existing;
		} else {
			final String elementFragment = EcoreUtil.getURI(element).fragment();
			final String originalFragment = originalUri != null ? originalUri.fragment() : "";
			
			@SuppressWarnings("null")
			final E existing = collection.stream()
					.filter(e -> {
						final String fragment = EcoreUtil.getURI(e).fragment();
						return elementFragment.equals(fragment) || originalFragment.equals(fragment);
					})
					.findAny()
					.orElse(null);
			
			return existing;
		}
	}
}