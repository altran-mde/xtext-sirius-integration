/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.editor.model

import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.test.editor.ATestFowlerdsl

abstract class ATestFowlerdslModel extends ATestFowlerdsl {
	protected override createModelDescriptor() {
 		new XtextSiriusModelDescriptor(inlineInjector, createXtextDirectEditModelDescription)
 	}
}
