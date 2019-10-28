/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class EcoreNavigationUtil {
	public static @NonNull EObject eContainerIfExists(final @NonNull EObject fallbackContainer) {
		return fallbackContainer.eContainer() != null
				? fallbackContainer.eContainer()
				: fallbackContainer;
	}

	public static boolean hasFeature(final @NonNull EObject eObject, final @Nullable String featureName) {
		return featureName == null || eObject.eClass().getEStructuralFeature(featureName) != null;
	}
}
