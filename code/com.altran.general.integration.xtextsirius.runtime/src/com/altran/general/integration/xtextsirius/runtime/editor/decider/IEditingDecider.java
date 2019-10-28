/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editor.decider;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;

/**
 * Decides whether an edit can be considered as a
 * {@linkplain #isNoOp(String, AXtextSiriusEditor) no-op} or
 * {@linkplain #isDeletion(String, AXtextSiriusEditor) deletion} based on
 * comparing the
 * {@linkplain r#initializeText(Object, String, AXtextSiriusEditor) initial
 * state} with the state after the edit.
 */
public interface IEditingDecider {
	/**
	 * Initializes the decider and provides the option to adjust the initial
	 * text.
	 * 
	 * @param initialValue
	 *            Initial value from the UI element.
	 * @param initialText
	 *            Initial text from the UI element. Contains only the visible
	 *            text.
	 * @param xtextSiriusEditor
	 * @return Potentially adjusted {@code initialText}.
	 */
	public @Nullable String initializeText(final @Nullable Object initialValue, final @NonNull String initialText,
			final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor);
	
	/**
	 * Checks whether the edit is a no-op.
	 * 
	 * @param text
	 *            Edited text from the UI element, including non-visible parts
	 *            (i.e. outside the visible region).
	 * @param xtextSiriusEditor
	 * @return Whether the edit is a no-op.
	 */
	public boolean isNoOp(final @Nullable String text, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor);
	
	/**
	 * Checks whether the edit is a deletion.
	 * 
	 * @param text
	 *            Edited text from the UI element, including non-visible parts
	 *            (i.e. outside the visible region).
	 * @param xtextSiriusEditor
	 * @return Whether the edit is a deletion.
	 */
	public boolean isDeletion(final @Nullable String text, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor);
}
