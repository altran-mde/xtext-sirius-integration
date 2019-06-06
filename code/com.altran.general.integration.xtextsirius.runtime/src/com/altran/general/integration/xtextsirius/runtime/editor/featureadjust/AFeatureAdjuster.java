package com.altran.general.integration.xtextsirius.runtime.editor.featureadjust;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;

public abstract class AFeatureAdjuster implements IFeatureAdjuster {
	protected final @NonNull ModelEntryPoint targetModelEntryPoint;
	
	public AFeatureAdjuster(final @NonNull ModelEntryPoint targetModelEntryPoint) {
		this.targetModelEntryPoint = targetModelEntryPoint;
	}

}
