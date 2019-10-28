/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Anything that can provide an {@link IXtextSiriusEditpartDescriptor}.
 */
public interface IXtextSiriusDescribable {
	public @NonNull IXtextSiriusEditpartDescriptor getDescriptor();
}
