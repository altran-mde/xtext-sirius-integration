package com.altran.general.integration.xtextsirius.runtime.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;

public class EcoreNavigationUtil {
	public static @NonNull EObject eContainerIfExists(final @NonNull EObject fallbackContainer) {
		return fallbackContainer.eContainer() != null
				? fallbackContainer.eContainer()
				: fallbackContainer;
	}
}
