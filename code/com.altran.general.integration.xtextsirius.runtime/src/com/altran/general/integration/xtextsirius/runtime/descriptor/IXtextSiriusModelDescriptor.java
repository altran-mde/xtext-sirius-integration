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

import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;


public interface IXtextSiriusModelDescriptor extends IXtextSiriusDescriptor {
	
	public @NonNull Set<@NonNull String> getEditableFeatures();
	
	public @NonNull Set<@NonNull String> getSelectedFeatures();
	
	public @NonNull Set<@NonNull String> getIgnoredNestedFeatures();
	
	public @NonNull String getPrefixTerminalsExpression();
	
	public @NonNull String getSuffixTerminalsExpression();
}