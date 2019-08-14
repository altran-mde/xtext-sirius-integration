/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.util;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Supports building the path of nested features.
 */
public class FeaturePathUtil {
	private static FeaturePathUtil instance;
	
	public static FeaturePathUtil getInstance() {
		if (instance == null) {
			instance = new FeaturePathUtil();
		}
		
		return instance;
	}
	
	protected FeaturePathUtil() {
		
	}
	
	public @NonNull String concatFeaturePath(final @NonNull String prefix, final @NonNull EStructuralFeature feature) {
		return (prefix + "." + feature.getName()).replaceFirst("^\\.", "");
	}
}
