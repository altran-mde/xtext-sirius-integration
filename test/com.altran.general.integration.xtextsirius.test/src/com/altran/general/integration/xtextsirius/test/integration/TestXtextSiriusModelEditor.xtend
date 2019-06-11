package com.altran.general.integration.xtextsirius.test.integration;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster

class TestXtextSiriusModelEditor extends XtextSiriusModelEditor {
	
	new(IXtextSiriusModelDescriptor descriptor) {
		super(descriptor)
	}
	
	override setModelEntryPoint(ModelEntryPoint modelEntryPoint) {
		if (this.callback !== null) {
			(this.callback as TestXtextSiriusEditorCallbackAdapter).testSemanticElement = new MinimalModelAdjuster().getClosestElement(modelEntryPoint)
		}

		super.modelEntryPoint = modelEntryPoint
	}
}

