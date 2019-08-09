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

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;

/**
 * Treats {@code null} or the same text as initially as no-op; treats a text
 * only consisting of whitespace as deletion.
 */
public class NullNoOpBlankDeletionEditingDecider extends AEditingDecider {
	@Override
	public boolean isNoOp(final @Nullable String text, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		return text == null || StringUtils.equals(getInitialText(), text);
	}
	
	@Override
	public boolean isDeletion(final @Nullable String text, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		return StringUtils.isBlank(text);
	}
}
