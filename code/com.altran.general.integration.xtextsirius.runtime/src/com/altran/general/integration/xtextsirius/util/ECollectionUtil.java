package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Utility for changing existing entries in an EMF collection based on their
 * URI.
 *
 * <p>
 * <b>Caution:</b> This utility works reliably only on collections of
 * {@link EObject}s that can be resolved to an {@link URI}. Additionally, no
 * elements must have been removed or added from the list.
 * </p>
 *
 * @author nstotz
 *
 */
public class ECollectionUtil {
	private static ECollectionUtil instance;
	
	public static ECollectionUtil getInstance() {
		if (instance == null) {
			instance = new ECollectionUtil();
		}
		
		return instance;
	}
	
	protected ECollectionUtil() {
		
	}
	
	/**
	 * Replaces {@code element} within {@code collection}, if contained; adds
	 * otherwise.
	 *
	 * <p>
	 * <i>Replace</i> means we compare the URI of {@code element} with each
	 * entry of {@code collection}. If we find an entry with the same URI, we
	 * remove the old entry and add {@code element} instead, i.e. changing the
	 * Java object identity of the EObject referred to by this URI. If there is
	 * more than one entry, we change only one of them (arbitrarily selected).
	 * If there is no such entry, we add {@code element} to {@code collection}.
	 * </p>
	 *
	 * <p>
	 * <b>Caution:</b> This utility works reliably only on collections of
	 * {@link EObject}s that can be resolved to an {@link URI}. Additionally, no
	 * elements must have been removed or added from the list.
	 * </p>
	 *
	 * @param collection
	 *            Collection to modify.
	 * @param element
	 *            Element to replace or add.
	 * @return Element with the same URI contained in the list afterwards.
	 */
	public <T extends EObject> @Nullable T replaceOrAddLocal(
			final @NonNull Collection<@NonNull T> collection,
			final @NonNull T element,
			final @Nullable URI originalUri) {
		return processOrAddLocal(collection, element, originalUri, (existing, newElement) -> {
			EcoreUtil.replace(existing, newElement);
			return newElement;
		});
	}
	
	/**
	 * Updates {@code element} within {@code collection}, if contained; adds
	 * otherwise.
	 *
	 * <p>
	 * <i>Update</i> means we compare the URI of {@code element} with each entry
	 * of {@code collection}. If we find an entry with the same URI, we update
	 * the existing entry with all EFeatures of {@code element}, i.e. retaining
	 * the Java object identity of the EObject referred to by this URI. If there
	 * is more than one entry, we update only one of them (arbitrarily
	 * selected). If there is no such entry, we add {@code element} to
	 * {@code collection}.
	 * </p>
	 *
	 * <p>
	 * <b>Caution:</b> This utility works reliably only on collections of
	 * {@link EObject}s that can be resolved to an {@link URI}. Additionally, no
	 * elements must have been removed or added from the list.
	 * </p>
	 *
	 * @param collection
	 *            Collection to modify.
	 * @param element
	 *            Element to update or add.
	 * @return Element with the same URI contained in the list afterwards.
	 */
	public <T extends EObject> @Nullable T updateOrAddLocal(
			final @NonNull Collection<@NonNull T> collection,
			final @NonNull T element,
			final @NonNull Collection<@NonNull String> featuresToReplace,
			final @Nullable URI originalUri) {
		return processOrAddLocal(collection, element, originalUri, (existing, newElement) -> {
			if (existing != null && newElement != null) {
				for (final EStructuralFeature feature : newElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable()) {
						if (featuresToReplace.isEmpty() || featuresToReplace.contains(feature.getName())) {
							if (newElement.eIsSet(feature)) {
								final Object newValue = newElement.eGet(feature, false);
								existing.eSet(feature, newValue);
							} else {
								existing.eUnset(feature);
							}
						}
					}
				}
				return existing;
			} else {
				EcoreUtil.delete(element);
				return null;
			}
		});
	}
	
	public <T extends EObject> void processOrAddAllLocal(
			final @NonNull Collection<@NonNull T> existingValues,
			final @NonNull Collection<@NonNull T> newValues,
			final @Nullable URI originalParentUri,
			final @NonNull BiConsumer<@NonNull Collection<@NonNull T>, @NonNull T> adder,
			final @NonNull BiConsumer<@NonNull T, @NonNull T> merger) {
		for (final T newValue : newValues) {
			processOrAddLocal(existingValues, newValue, originalParentUri, adder, merger);
		}
	}
	
	protected <T extends EObject> void processOrAddLocal(
			final Collection<@NonNull T> existingValues,
			final T newValue, final URI originalParentUri,
			final BiConsumer<@NonNull Collection<@NonNull T>, @NonNull T> adder,
			final BiConsumer<@NonNull T, @NonNull T> merger) {
		final URI originalUri = mergeUri(originalParentUri, newValue);
		
		final T existing = findMember(existingValues, newValue, originalUri);
		
		if (existing == null) {
			adder.accept(existingValues, newValue);
		} else {
			merger.accept(existing, newValue);
		}
	}
	
	public @Nullable URI mergeUri(final @Nullable URI originalParentUri, final @Nullable EObject element) {
		if (originalParentUri == null || element == null) {
			return null;
		}
		
		final URI uri = EcoreUtil.getURI(element);

		if (uri == null) {
			return null;
		}

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
	
	public <T extends EObject> @Nullable T processOrAddLocal(
			final @NonNull Collection<@NonNull T> collection,
			final @NonNull T element,
			final @Nullable URI originalUri,
			final @NonNull BiFunction<@NonNull T, @NonNull T, @Nullable T> processor) {
		final T existing = findMember(collection, element, originalUri);
		
		if (existing == null) {
			collection.add(element);
			return null;
		} else {
			return processor.apply(existing, element);
		}
	}
	
	protected <T extends EObject> @Nullable T findMember(
			final @NonNull Collection<@NonNull T> collection,
			final @NonNull T element,
			final @Nullable URI originalUri) {
		final String elementId = EcoreUtil.getID(element);
		if (elementId != null) {
			@SuppressWarnings("null")
			final T existing = collection.stream()
					.filter(e -> elementId.equals(EcoreUtil.getID(e)))
					.findAny()
					.orElse(null);

			return existing;
		} else {
			final String elementFragment = EcoreUtil.getURI(element).fragment();
			final String originalFragment = originalUri != null ? originalUri.fragment() : "";
			
			@SuppressWarnings("null")
			final T existing = collection.stream()
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
