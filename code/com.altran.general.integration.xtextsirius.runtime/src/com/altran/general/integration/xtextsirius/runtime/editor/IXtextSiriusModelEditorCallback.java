/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.parser.IParseResult;

import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;

public interface IXtextSiriusModelEditorCallback extends IXtextSiriusEditorCallback {
	public @NonNull IParseResult getXtextParseResult();
	
	public @NonNull XtextSiriusSyntaxErrorException handleSyntaxErrors(final @NonNull IParseResult parseResult);
	
	public @NonNull XtextSiriusErrorException handleUnresolvableProxies();
}
