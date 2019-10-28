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
import org.eclipse.jdt.annotation.Nullable;

/**
 * Externally required interaction of {@link AXtextSiriusEditor}.
 */
public interface IXtextSiriusEditorCallback {
	/**
	 * Sets the initial text in the user-visible UI element.
	 * 
	 * @param initialValue
	 *            The initial text, if available.
	 * @param offset
	 *            Offset of the visible text within {@code initialValue}.
	 * @param length
	 *            Length of the visible text within {@code initialValue}.
	 */
	public void callbackInitText(final @NonNull String initialValue, int offset, int length);
	
	/**
	 * Requests the text as entered by the user, including non-visible parts
	 * (i.e. outside the visible region).
	 * 
	 * @return Text as entered by the user, or {@code null} if no text is
	 *         available.
	 */
	public @Nullable String callbackGetText();
}
