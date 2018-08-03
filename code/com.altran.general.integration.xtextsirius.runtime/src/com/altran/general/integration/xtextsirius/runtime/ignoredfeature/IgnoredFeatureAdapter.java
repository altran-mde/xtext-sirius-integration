package com.altran.general.integration.xtextsirius.runtime.ignoredfeature;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jdt.annotation.NonNull;

public class IgnoredFeatureAdapter extends AdapterImpl {
	private final String featureName;
	
	public IgnoredFeatureAdapter(final @NonNull String featureName) {
		this.featureName = featureName;
	}
	
	public String getFeatureName() {
		return this.featureName;
	}
	
	@Override
	public boolean isAdapterForType(final Object type) {
		return type == IgnoredFeatureAdapter.class;
	}
}
