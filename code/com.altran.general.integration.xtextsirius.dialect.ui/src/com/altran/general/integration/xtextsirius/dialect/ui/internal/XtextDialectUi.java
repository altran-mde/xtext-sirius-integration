/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
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
