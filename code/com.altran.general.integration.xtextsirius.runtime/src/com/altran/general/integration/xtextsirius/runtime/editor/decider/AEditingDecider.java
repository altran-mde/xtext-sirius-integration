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

public abstract class AEditingDecider implements IEditingDecider {
	private @Nullable String initialText;
	
	@Override
	public @Nullable String initializeText(final @Nullable Object initialValue, final @NonNull String initialText,
			final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		this.initialText = initialText;
		
		if (StringUtils.isBlank(initialText)) {
			return null;
		} else {
			return initialText;
		}
	}
	
	protected @Nullable String getInitialText() {
		return this.initialText;
	}
	
	
}
