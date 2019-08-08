/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.edit.ui;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.altran.general.integration.xtextsirius.test.reflang.edit.ui.internal.EditActivator;
import com.google.inject.Injector;

public class RefLangEditInjector implements IXtextLanguageInjector {
	
	@Override
	public Injector getInjector() {
		return EditActivator.getInstance()
				.getInjector(EditActivator.COM_ALTRAN_GENERAL_INTEGRATION_XTEXTSIRIUS_TEST_REFLANG_EDIT_REFLANGEDIT);
	}

}
