/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.ignoredfeature;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionSerializer;

/**
 * {@link ModelRegionSerializer} attaches this adapter to each model element
 * that should be ignored during merging. Removed afterwards by
 * {@link XtextSiriusModelEditor#removeAllIgnoredFeatureAdapters()}.
 */
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
