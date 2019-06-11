package com.altran.general.integration.xtextsirius.test.integration

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.espilce.commons.lang.StringUtils2

import static org.espilce.commons.emf.testsupport.AssertEmf.*

abstract class ATestFowlerdslCombined extends ATestFowlerdsl {
	
	protected override modelText() {
		StringUtils2::normalizeNewline(
		'''
			events
			 eventSD 2 [ c2 .. c1 ]
			 event2 3 [ 2 ]
			 event4 3 [ c1 ]
			 event3 4 
			end
			
			commands
			 cmd0 23
			 cmd1 42
			end
			
			constants
			 c1 23
			 c2 42
			end
			
			state A 
				description "<p>This is a deschkriptschion</p>\n"
				event2 => A
				event2 => B
			end
			
			state B
			
			end
		''')
	}
	
	protected def String getFeatureName()
	
	protected def void assertEdit(EObject elementToEdit, String expectedText, String newText, Object expectedResultElement) {
		assertEdit(elementToEdit, elementToEdit, getFeatureName(), expectedText, newText, expectedResultElement)
	}
	
	protected def void assertEdit(Object elementToEdit, EObject fallbackContainer, String expectedText, String newText, Object expectedResultElement) {
		assertEdit(elementToEdit, fallbackContainer, getFeatureName(), expectedText, newText, expectedResultElement)
	}
	
	protected def void assertEdit(Object elementToEdit, EObject fallbackContainer, String valueFeatureName, String expectedText, String newText, Object expectedResultElement) {
		val descriptor = createDescriptor()
		val editor = new TestXtextSiriusModelEditor(descriptor)
		
		var callback = new AssertingXtextSiriusEditorCallback(injector, model, newText, expectedText)
		editor.callback = callback
		
		val mep = new ModelEntryPoint(if (elementToEdit instanceof EObject) elementToEdit else null, fallbackContainer, valueFeatureName)
		editor.modelEntryPoint = mep
		editor.initValue(elementToEdit)
		
		val commitTarget = new MinimalModelAdjuster().getClosestElement(mep)
		val result = editor.commit(commitTarget)
		if (expectedResultElement instanceof EObject) {
			assertModelEquals(expectedResultElement, result as EObject)
		} else if (expectedResultElement instanceof List) {
			assertModelEquals(expectedResultElement, result as List<EObject>)
		}
	}

	protected def createDescriptor() {
		new XtextSiriusModelDescriptor(inlineInjector, createXtextDirectEditModelDescription)
	}
}
