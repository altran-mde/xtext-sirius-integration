package com.altran.general.integration.xtextsirius.test.editor.value

import org.eclipse.emf.ecore.EObject
import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint

class TestFowlerdslStateDescriptionDirect extends TestFowlerdslStateDescription {
	
	override createModelEntryPoint(EObject container) {
		new ModelEntryPoint(container, featureName)
	}
}