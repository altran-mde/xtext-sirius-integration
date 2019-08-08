/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.eef.ui.value;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.runtime.eef.ui.XtextSiriusWidget;
import com.google.inject.Injector;

public class XtextSiriusWidgetValue extends XtextSiriusWidget {
	public XtextSiriusWidgetValue(
			final @NonNull Composite parent,
			final @NonNull Injector injector) {
		super(parent, injector);
	}
}
