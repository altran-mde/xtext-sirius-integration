package com.altran.general.integration.xtextsirius.ui.test.integration

import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor
import org.eclipse.emf.ecore.EObject
import org.espilce.commons.lang.StringUtils2

import static org.espilce.commons.emf.testsupport.AssertEmf.*
import static org.junit.Assert.*
import org.junit.Test

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
	
	protected def void assertEdit(EObject elementToEdit, String valueFeatureName, String expectedText, String newText, EObject expectedResultElement) {
		val descriptor = eventDescriptor()
		val editor = new XtextSiriusModelEditor(descriptor) => [
			semanticElement = elementToEdit
			callback = new TestXtextSiriusEditorCallbackAdapter(injector, model) {
				
				override callbackSetValue(Object value, int offset, int length) {
//					getSemanticElementLocation().
					assertTrue(value instanceof String)
					assertEquals(expectedText, value.toString.substring(offset, offset + length))
				}
				
				override getXtextParseResult() {
					super.getXtextParseResult()
				}
				
				override protected getSemanticElement() {
					elementToEdit
				}
			}
		]
		editor.doSetValue(newText, valueFeatureName)
		val result = editor.commit(elementToEdit, valueFeatureName) as EObject
		assertModelEquals(expectedResultElement, result)
	}

	protected def eventDescriptor() {
		new XtextSiriusModelDescriptor(inlineInjector, createXtextDirectEditModelDescription => [
		])
	}
}