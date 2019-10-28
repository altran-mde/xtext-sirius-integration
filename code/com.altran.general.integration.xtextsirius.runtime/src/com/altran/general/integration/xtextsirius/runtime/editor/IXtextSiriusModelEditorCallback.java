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
import org.eclipse.xtext.util.TextRegion;

/**
 * Externally required interaction of {@link XtextSiriusModelEditor}.
 */
public interface IXtextSiriusModelEditorCallback extends IXtextSiriusEditorCallback {
	/**
	 * Requests the parse result of the complete text, including non-visible
	 * parts (i.e. outside the visible region).
	 * 
	 * @return Parse result of the complete text.
	 */
	public @NonNull IParseResult getXtextParseResult();
	
	/**
	 * Requests the region of the text visible to the user.
	 * 
	 * @return Region of the text visible to the user.
	 */
	public @NonNull TextRegion callbackGetVisibleRegion();
}
