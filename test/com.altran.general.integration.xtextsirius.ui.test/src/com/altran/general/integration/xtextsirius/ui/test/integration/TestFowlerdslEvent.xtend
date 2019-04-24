package com.altran.general.integration.xtextsirius.ui.test.integration

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor
import com.google.inject.Injector
import org.eclipse.emf.ecore.EObject
import org.espilce.commons.lang.StringUtils2
import org.junit.Test

import static org.espilce.commons.emf.testsupport.AssertEmf.*
import static org.junit.Assert.*

class TestFowlerdslEvent extends ATestFowlerdsl {
	
	protected override modelText() {
		StringUtils2::normalizeNewline(
		'''
			events
			 eventSD 2 [ c2 .. c1 ]
			 event2 3 [ 2 ]
			 event3 4 
			end
			
			commands
			 cmd0 0
			 cmd1 1 [2]
			 cmd2 2
			end
			
			constants
			 c1 23
			 c2 4
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
	
	@Test
	def void asdf() {
		assertEdit(
			model.events.last,
			"",
			"event3 4",
			"event3 5",
			createEvent => [
				name = "event3"
				code = 5
			]
		)
	} 
	
	protected static class TestXtextSiriusModelEditor extends XtextSiriusModelEditor {
		
		new(IXtextSiriusModelDescriptor descriptor) {
			super(descriptor)
		}
		
		override setSemanticElement(EObject element) {
			if (callback !== null) {
				(callback as TestXtextSiriusEditorCallbackAdapter).semanticElement = element
			}
			super.semanticElement = element
		}
	}
	
	protected static class AssertingXtextSiriusEditorCallback extends TestXtextSiriusEditorCallbackAdapter {
		val String expectedText
		
		new(Injector injector, EObject model, String expectedText) {
			super(injector, model)
			this.expectedText = expectedText
		}
		
		override callbackSetValue(Object value, int offset, int length) {
			assertTrue(value instanceof String)
			val text = (value as String).substring(offset, offset + length)
			assertEquals(expectedText, text)
			super.callbackSetValue(value, offset, length)
		}
	}
	
	protected def void assertEdit(EObject elementToEdit, String valueFeatureName, String expectedText, String newText, EObject expectedResultElement) {
		val descriptor = eventDescriptor()
		val editor = new TestXtextSiriusModelEditor(descriptor)
		
		editor.callback = new AssertingXtextSiriusEditorCallback(injector, model, expectedText)
		editor.semanticElement = elementToEdit
		editor.doSetValue("", valueFeatureName)
		
		editor.callback = new AssertingXtextSiriusEditorCallback(injector, model, newText)
		editor.semanticElement = elementToEdit
		editor.doSetValue(newText, valueFeatureName)
		
		val result = editor.commit(elementToEdit, valueFeatureName) as EObject
		assertModelEquals(expectedResultElement, result)
	}

	protected def eventDescriptor() {
		new XtextSiriusModelDescriptor(inlineInjector, createXtextDirectEditModelDescription => [
		])
	}
}