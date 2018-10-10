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
import org.eclipse.xtext.example.fowlerdsl.StatemachineStandaloneSetup;

import com.google.inject.Injector;

public class FowlerdslEnvironment {
	private static FowlerdslEnvironment INSTANCE;
	
	private final Injector fowlerdslInjector;
	
	private FowlerdslEnvironment() {
		this.fowlerdslInjector = new StatemachineStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public static @NonNull FowlerdslEnvironment getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new FowlerdslEnvironment();
		}
		
		return INSTANCE;
	}
	
	public @NonNull Injector getInjector() {
		return this.fowlerdslInjector;
	}
	
}
