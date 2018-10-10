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

import org.eclipse.xtext.example.fowlerdsl.ui.internal.InlineEditActivator;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.google.inject.Injector;

public class InlineEditLanguageInjector implements IXtextLanguageInjector {

	@Override
	public Injector getInjector() {
		return InlineEditActivator.getInstance()
				.getInjector(InlineEditActivator.ORG_ECLIPSE_XTEXT_EXAMPLE_FOWLERDSL_INLINEEDIT);
	}
	
}
