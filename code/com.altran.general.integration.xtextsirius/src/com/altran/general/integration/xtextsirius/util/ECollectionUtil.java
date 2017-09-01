package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.Nullable;

public class ECollectionUtil {
	public static <@Nullable T extends EObject> boolean replaceOrAddLocal(final Collection<T> collection,
			final T element) {
		final String fragment = EcoreUtil.getURI(element).fragment();
		
		final T existing = collection.stream()
				.filter(e -> fragment.equals(EcoreUtil.getURI(e).fragment()))
				.findAny()
				.orElse(null);
		
		if (existing == null) {
			collection.add(element);
			return false;
		} else {
			EcoreUtil.replace(existing, element);
			return true;
		}
	}
	
}
