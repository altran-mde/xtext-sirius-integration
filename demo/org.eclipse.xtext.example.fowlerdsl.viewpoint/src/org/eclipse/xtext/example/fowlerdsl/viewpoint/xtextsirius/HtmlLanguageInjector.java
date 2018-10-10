/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.example.fowlerdsl.viewpoint.xtextsirius;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.google.inject.Injector;

import nl.altran.example.xtext.html.ui.internal.HtmlActivator;

public class HtmlLanguageInjector implements IXtextLanguageInjector {

	@Override
	public Injector getInjector() {
		return HtmlActivator.getInstance()
				.getInjector(HtmlActivator.NL_ALTRAN_EXAMPLE_XTEXT_HTML_HTMLLANG);
	}

}
