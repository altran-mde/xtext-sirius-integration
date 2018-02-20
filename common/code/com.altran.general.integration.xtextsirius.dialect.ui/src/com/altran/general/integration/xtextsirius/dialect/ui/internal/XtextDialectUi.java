package com.altran.general.integration.xtextsirius.dialect.ui.internal;

import org.eclipse.sirius.ui.business.api.dialect.DialectUI;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIServices;

public class XtextDialectUi implements DialectUI {
	
	private DialectUIServices services;
	
	@Override
	public String getName() {
		return "XtextDialectUi";
	}
	
	@Override
	public DialectUIServices getServices() {
		if (this.services == null) {
			this.services = new XtextDialectUiServices();
		}
		return this.services;
	}

}
