package com.altran.general.integration.xtextsirius.eef;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;

public abstract class AXtextPropertyConfiguration implements IXtextPropertyConfiguration {
	
	@Override
	public int getSwtWidgetStyle() {
		return SWT.BORDER | SWT.H_SCROLL;
	}
	
	@Override
	public @NonNull GridData getLayoutData() {
		final GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		gridData.heightHint = 14 * 12;
		gridData.widthHint = 300;

		return gridData;
	}

}
