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
import org.junit.BeforeClass;

import com.google.inject.Injector;

public abstract class AFowlerdslTest extends AXtextTest {
	@BeforeClass
	public static void loadFowlerds() {
		FowlerdslEnvironment.getInstance();
	}
	
	@Override
	protected @NonNull Injector getInjector() {
		return FowlerdslEnvironment.getInstance().getInjector();
	}
}
