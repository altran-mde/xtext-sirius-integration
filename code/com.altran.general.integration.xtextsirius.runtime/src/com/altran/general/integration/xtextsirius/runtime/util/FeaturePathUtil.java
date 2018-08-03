package com.altran.general.integration.xtextsirius.runtime.util;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;

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
