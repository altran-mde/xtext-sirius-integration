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

import org.eclipse.jdt.annotation.Nullable;

public interface IXtextSiriusEditorCallback {
	public void callbackInitText(final @Nullable String initialValue, int offset, int length);

	public @Nullable String callbackGetText();
}
