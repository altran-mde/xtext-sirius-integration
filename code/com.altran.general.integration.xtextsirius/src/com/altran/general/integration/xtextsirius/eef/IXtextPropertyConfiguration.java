package com.altran.general.integration.xtextsirius.eef;

import org.eclipse.swt.layout.GridData;

import com.google.inject.Injector;

public interface IXtextPropertyConfiguration {
	Injector getInjector();

	int getSwtWidgetStyle();

	GridData getLayoutData();
}
