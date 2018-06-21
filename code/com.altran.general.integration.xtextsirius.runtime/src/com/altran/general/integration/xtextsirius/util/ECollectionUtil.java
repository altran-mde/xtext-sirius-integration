package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;
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
	private static ECollectionUtil INSTANCE;
	
	public static ECollectionUtil getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ECollectionUtil();
		}
		
		return INSTANCE;
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
	public <@Nullable T extends EObject> T replaceOrAddLocal(
			final @NonNull Collection<T> collection,
			final T element,
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
	public <@Nullable T extends EObject> T updateOrAddLocal(
			final @NonNull Collection<T> collection,
			final T element,
			final @NonNull Collection<String> featuresToReplace,
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
	
	protected <@Nullable T extends EObject> T processOrAddLocal(
			final @NonNull Collection<T> collection,
			final T element,
			final @Nullable URI originalUri,
			final @NonNull BiFunction<T, T, T> processor) {
		final T existing = findMember(collection, element, originalUri);
		
		if (existing == null) {
			collection.add(element);
			return null;
		} else {
			return processor.apply(existing, element);
		}
	}
	
	protected <@Nullable T extends EObject> T findMember(
			final @NonNull Collection<T> collection,
			final T element,
			final @Nullable URI originalUri) {
		final String elementFragment = EcoreUtil.getURI(element).fragment();
		final String originalFragment = originalUri != null ? originalUri.fragment() : "";
		
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
