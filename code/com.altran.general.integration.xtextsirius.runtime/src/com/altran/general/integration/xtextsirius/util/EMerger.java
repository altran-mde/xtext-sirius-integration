package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Merges a <i>newElement</i> into an <i>existing</i> EObject recursively.
 * optionally limiting changed features.
 *
 * <h2>Limiting changed features</h2>
 * <p>
 * {@link #featuresToReplace} is a list of {@link EStructuralFeature} names
 * present in {@link #existing}. If the list is empty, we possibly change all
 * features of <i>existing</i>. If the list is not empty, we only change the
 * mentioned features of <i>existing</i>.
 * </p>
 *
 * <p>
 * {@link #nestedFeaturesToIgnore} is a list of concatenated
 * {@link EStructuralFeature} names, separated by <tt>.</tt> (dot). We do not
 * merge any feature in this list.
 * </p>
 *
 * <p>
 * Both <b>featuresToReplace</b> and <b>nestedFeaturesToIgnore</b> can be
 * combined.
 * </p>
 *
 * <p>
 * Example: Assume the following EClass structure:
 * </p>
 *
 * <pre>
 * class Family {
 *   String name
 *   contains Person[] members
 *   contains Address home
 *   refers Person[] friends
 * }
 *
 * class Person {
 *   String firstName
 *   String lastName
 *   refers Person[] friends
 * }
 *
 * class Address {
 *   String street
 *   contains Coordinate position
 * }
 *
 * class Coordinate {
 *   int lat
 *   int long
 * }
 * </pre>
 *
 * <p>
 * We set <b>featuresToReplace</b> to <tt>{ "name", "home" }</tt>. This ignores
 * all changes in <i>newElement</i> on any family members or family friends.
 * </p>
 *
 * <p>
 * In a different case, we set <b>nestedFeaturesToIgnore</b> to
 * <tt>{ "members.lastName", "home.position.lat" }</tt>. This ignores all
 * changes nested in <i>newElement</i> regarding last names or home latitude.
 * </p>
 *
 * <h2>Identity</h2>
 *
 * <p>
 * Object identity is used to find an object in a collection. We establish
 * object identity by the following rules:
 * </p>
 *
 * <ul>
 * <li>{@link EAttribute}s are compared by {@link Object#equals(Object)}.</li>
 * <li>{@link EReference}s are compared depending on their target:
 * <ul>
 * <li>{@link EClass#getEIDAttribute() ID}, if available.</li>
 * <li>{@link EReference#getEKeys() eKeys}, if available.</li>
 * <li>
 * <p>
 * {@link org.eclipse.emf.ecore.resource.Resource#getURI() URI}, if available.
 * In this case, we also assume {@link #originalUri} as the URI of the merged
 * <i>newElement</i>.
 * </p>
 * <p>
 * Might lead to positional replacement in collections, if the URI is derived
 * from the position.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 *
 * <h2>Merge Operations</h2>
 * <dl>
 * <dt>NOP
 * <dt>
 * <dd>No-op, don't do anything.</dd>
 * <dt>set
 * <dt>
 * <dd>set feature in <i>existing</i> to <i>newValue</i>.</dd>
 * <dt>unset</dt>
 * <dd>unset (i.e. delete) feature in <i>existing</i>.</dd>
 * <dt>replace
 * <dt>
 * <dd>replace <i>oldValue</i> in <i>existing</i> with <i>newValue</i>, possibly
 * maintaining the position in a collection.</dd>
 * <dt>replace all</dt>
 * <dd>replace the complete collection in <i>existing</i> with the
 * <i>newCollection</i>.</dd>
 * <dt>merge</dt>
 * <dd>if <i>newValue</i> and <i>oldValue</i> are of the same EClass:
 * recursively merge <i>newValue</i> into <i>oldValue</i>.<br/>
 * otherwise: &rarr; replace.</dd>
 * </dl>
 *
 * <h2>Merging EAttributes</h2>
 *
 * <table>
 * <thead>
 * <tr>
 * <th colspan="2">newElement</th>
 * <th colspan="2">Existing</th>
 * <th rowspan="2">Merge result</th>
 * </tr>
 * <tr>
 * <th>multiplicity</th>
 * <th>value</th>
 * <th>multiplicity</th>
 * <th>value</th>
 * </tr>
 * </thead>
 *
 * <tbody>
 * <tr>
 * <td>single</td>
 * <td>null</td>
 * <td>single</td>
 * <td>null</td>
 * <td>NOP</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>null</td>
 * <td>single</td>
 * <td>non-null</td>
 * <td>unset</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>non-null</td>
 * <td>single</td>
 * <td>null</td>
 * <td>set</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>non-null</td>
 * <td>single</td>
 * <td>non-null</td>
 * <td>replace</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>null</td>
 * <td>multi</td>
 * <td>*</td>
 * <td>NOP</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>non-null</td>
 * <td>multi</td>
 * <td>*</td>
 * <td><i>newElement</i> exists: replace, other: add</td>
 * </tr>
 *
 * <tr>
 * <td>multi</td>
 * <td>*</td>
 * <td>multi</td>
 * <td>*</td>
 * <td>foreach <i>newElement</i>:: exists: replace, other:add</td>
 * </tr>
 * </tbody>
 * </table>
 *
 *
 * <h2>Merging cross-references</h2>
 *
 * <table>
 * <thead>
 * <tr>
 * <th colspan="2">newElement</th>
 * <th colspan="2">Existing</th>
 * <th rowspan="2">Merge result</th>
 * </tr>
 * <tr>
 * <th>multiplicity</th>
 * <th>value</th>
 * <th>multiplicity</th>
 * <th>value</th>
 * </tr>
 * </thead>
 *
 * <tbody>
 * <tr>
 * <td>single</td>
 * <td>null</td>
 * <td>single</td>
 * <td>null</td>
 * <td>NOP</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>null</td>
 * <td>single</td>
 * <td>non-null</td>
 * <td>unset</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>non-null</td>
 * <td>single</td>
 * <td>null</td>
 * <td>set</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>non-null</td>
 * <td>single</td>
 * <td>non-null</td>
 * <td>replace</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>null</td>
 * <td>multi</td>
 * <td>*</td>
 * <td>NOP</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>non-null</td>
 * <td>multi</td>
 * <td>*</td>
 * <td><i>newElement</i> exists: replace, other: add</td>
 * </tr>
 *
 * <tr>
 * <td>multi</td>
 * <td>*</td>
 * <td>multi</td>
 * <td>*</td>
 * <td>replace all</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h2>Merging containments</h2>
 *
 * <table>
 * <thead>
 * <tr>
 * <th colspan="2">newElement</th>
 * <th colspan="2">Existing</th>
 * <th rowspan="2">Merge result</th>
 * </tr>
 * <tr>
 * <th>multiplicity</th>
 * <th>value</th>
 * <th>multiplicity</th>
 * <th>value</th>
 * </tr>
 * </thead>
 *
 * <tbody>
 * <tr>
 * <td>single</td>
 * <td>null</td>
 * <td>single</td>
 * <td>null</td>
 * <td>NOP</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>null</td>
 * <td>single</td>
 * <td>non-null</td>
 * <td>unset</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>non-null</td>
 * <td>single</td>
 * <td>null</td>
 * <td>merge</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>non-null</td>
 * <td>single</td>
 * <td>non-null</td>
 * <td>merge</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>null</td>
 * <td>multi</td>
 * <td>*</td>
 * <td>NOP</td>
 * </tr>
 *
 * <tr>
 * <td>single</td>
 * <td>non-null</td>
 * <td>multi</td>
 * <td>*</td>
 * <td><i>newElement</i> exists: merge, other: add</td>
 * </tr>
 *
 * <tr>
 * <td>multi</td>
 * <td>*</td>
 * <td>multi</td>
 * <td>*</td>
 * <td>toplevel: replace all<br/>
 * other: foreach <i>newElement</i>:: exists: merge, other: add</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * @param <T>
 *            Type of EObject to merge.
 */
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

	/**
	 * Merges {@code newElement} into {@link #existing}.
	 *
	 * <p>
	 * Considers both {@link #featuresToReplace} and
	 * {@link #nestedFeaturesToIgnore}.
	 * </p>
	 *
	 * @param newElement
	 *            {@link EObject} to merge into {@link #existing};
	 * @return The merged {@link #existing}.
	 */
	public @NonNull T merge(final @NonNull T newElement) {
		for (final EStructuralFeature feature : this.existing.eClass().getEAllStructuralFeatures()) {
			if (validateFirstLevelFeature(feature)) {
				mergeFeatureRecursive(feature, "", this.existing, newElement);
			}
		}
		
		return this.existing;
	}
	
	/**
	 * Merges {@code newValue} into {@code feature} of {@link #existing}.
	 *
	 * <p>
	 * Considers {@link #nestedFeaturesToIgnore}, but ignores
	 * {@link #featuresToReplace}.
	 * </p>
	 *
	 * @param newValue
	 *            Value to merge into {@code feature} of {@link existing}.
	 * @param feature
	 *            Feature of {@link existing} to merge {@code newValue} into.
	 * @return The merged {@link #existing}.
	 */
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
		
		final String featurePath = (prefix + "." + feature.getName()).replaceFirst("^\\.", "");
		
		final Object newValue = newEl.eGet(feature, false);
		final Object oldValue = exist.eGet(feature, false);
		
		mergeFeatureValueRecursive(feature, featurePath, exist, newEl, oldValue, newValue);
	}

	protected void mergeFeatureValueRecursive(
			final @NonNull EStructuralFeature feature,
			final @NonNull String prefix,
			final @NonNull EObject exist,
			final @Nullable EObject newEl,
			final @Nullable Object oldValue,
			final @Nullable Object newValue) {


		if (this.nestedFeaturesToIgnore.contains(prefix)) {
			return;
		}

		validateNewValue(feature, newValue);

		if (feature.isChangeable()) {
			if (feature instanceof EReference) {
				if (((EReference) feature).isContainment()) {
					mergeContainmentRecursive(feature, prefix, exist, newEl, oldValue, newValue);
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
					final EObject newEObject = EcoreUtil.create(newElement.eClass());
					oldValues.add(newEObject);
					mergeAllContainmentFeaturesRecursive(prefix, newEObject, newElement);
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

		final EObject compatibleExist;
		if (exist.eClass().equals(newEl.eClass())) {
			compatibleExist = exist;
		} else {
			compatibleExist = EcoreUtil.create(newEl.eClass());
			EcoreUtil.replace(exist, compatibleExist);
		}

		for (final EStructuralFeature feature : newEl.eClass().getEAllStructuralFeatures()) {
			mergeFeatureRecursive(feature, prefix, compatibleExist, newEl);
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