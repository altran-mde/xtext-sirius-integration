/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.integration;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster

class TestXtextSiriusModelEditorAdapter extends XtextSiriusModelEditor {
	
	new(IXtextSiriusModelDescriptor descriptor) {
		super(descriptor)
	}
	
	override setModelEntryPoint(ModelEntryPoint modelEntryPoint) {
		val callback = this.callback
		if (callback instanceof TestXtextSiriusEditorCallbackAdapter) {
			callback.testSemanticElement = new MinimalModelAdjuster().getClosestElement(modelEntryPoint)
		}

		super.setModelEntryPoint(modelEntryPoint)
	}
}

