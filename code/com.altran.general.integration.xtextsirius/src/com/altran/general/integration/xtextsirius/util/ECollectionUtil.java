package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;
import java.util.function.BiFunction;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

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

	public <@Nullable T extends EObject> T replaceOrAddLocal(
			final @NonNull Collection<T> collection,
			final T element) {
		return processOrAddLocal(collection, element, (existing, newElement) -> {
			EcoreUtil.replace(existing, newElement);
			return newElement;
		});
	}

	public <@Nullable T extends EObject> T updateOrAddLocal(
			final @NonNull Collection<T> collection,
			final T element) {
		return processOrAddLocal(collection, element, (existing, newElement) -> {
			if (existing != null && newElement != null) {
				for (final EStructuralFeature feature : newElement.eClass().getEAllStructuralFeatures()) {
					if (newElement.eIsSet(feature)) {
						final Object newValue = newElement.eGet(feature, false);
						existing.eSet(feature, newValue);
					} else {
						existing.eUnset(feature);
					}
				}
				return existing;
			} else {
				EcoreUtil.delete(element);
				return null;
			}
		});
	}

	public <@Nullable T extends EObject> T processOrAddLocal(
			final @NonNull Collection<T> collection,
			final T element,
			final @NonNull BiFunction<T, T, T> processor) {
		final String fragment = EcoreUtil.getURI(element).fragment();

		final T existing = collection.stream()
				.filter(e -> fragment.equals(EcoreUtil.getURI(e).fragment()))
				.findAny()
				.orElse(null);

		if (existing == null) {
			collection.add(element);
			return null;
		} else {
			return processor.apply(existing, element);
		}
	}

}
