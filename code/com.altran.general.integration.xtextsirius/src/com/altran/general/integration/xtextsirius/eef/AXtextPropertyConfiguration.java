package com.altran.general.integration.xtextsirius.eef;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.layout.GridData;

public abstract class AXtextPropertyConfiguration implements IXtextPropertyConfiguration {
	
	@Override
	public int getSwtWidgetStyle(final int defaultStyle) {
		return defaultStyle;
	}
	
	@Override
	public @NonNull GridData getLayoutData(final @NonNull GridData defaultData) {
		return defaultData;
	}
}
