/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.descriptor;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.google.inject.Injector;

public abstract class AXtextSiriusDescriptor implements IXtextSiriusDescriptor {
	private final @NonNull Injector injector;
	private final boolean multiLine;
	
	public AXtextSiriusDescriptor(final @NonNull Injector injector, final @NonNull IXtextDescription description) {
		this.injector = injector;
		this.multiLine = description.isMultiLine();
	}
	
	@Override
	public Injector getInjector() {
		return this.injector;
	}
	
	@Override
	public boolean isMultiLine() {
		return this.multiLine;
	}
}
