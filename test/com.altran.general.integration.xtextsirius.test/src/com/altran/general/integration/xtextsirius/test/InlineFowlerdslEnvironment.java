/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.example.fowlerdsl.InlineEditStandaloneSetup;

import com.google.inject.Injector;

public class InlineFowlerdslEnvironment {
	private static InlineFowlerdslEnvironment INSTANCE;
	
	private final Injector inlineFowlerdslInjector;
	
	private InlineFowlerdslEnvironment() {
		this.inlineFowlerdslInjector = new InlineEditStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public static @NonNull InlineFowlerdslEnvironment getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new InlineFowlerdslEnvironment();
		}
		
		return INSTANCE;
	}
	
	public @NonNull Injector getInjector() {
		return this.inlineFowlerdslInjector;
	}
	
}
