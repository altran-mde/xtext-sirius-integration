/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.descriptor;

import org.eclipse.jdt.annotation.NonNull;

import com.google.inject.Injector;


/**
 * Complete configuration for one Xtext/Sirius Integration editor.
 *
 * This interface is deliberately not integrated into the EMF world (that would
 * be
 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription})
 * to avoid stale EMF resources, memory leaks, and issues with EMF transactions.
 */
public interface IXtextSiriusDescriptor {
	
	public @NonNull Injector getInjector();
	
	boolean isMultiLine();
	
	boolean isCancelOnValidationError();
	
	boolean isEnableFormatter();
}