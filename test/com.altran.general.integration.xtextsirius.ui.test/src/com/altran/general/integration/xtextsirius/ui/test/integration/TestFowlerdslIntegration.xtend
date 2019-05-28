package com.altran.general.integration.xtextsirius.ui.test.integration

import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine
import org.espilce.commons.lang.StringUtils2
import org.junit.Ignore
import org.junit.Test

import static org.espilce.commons.emf.testsupport.AssertEmf.*
import static org.junit.Assert.*

@Ignore
class TestFowlerdslIntegration extends ATestFowlerdsl {
	
	protected override modelText() {
		StringUtils2::normalizeNewline(
		'''
			events
			 event 1 [c1..22]
			 event2 2
			end
			
			constants
			 c1 23
			 c2 42
			end
			
			state A 
				description "<p>This is a deschkriptschion</p>\n"
				event => A
				event2 => B
			end
			
			state B
			
			end
		''')
	}
	
		
	protected def modelInlineText() {
		StringUtils2::normalizeNewline(
		'''
			 events
			 event 1 [ .. 22 ]
			 event2 2
			end constants
			 c1 23
			 c2 42
			end state A 
				description "<p>This is a deschkriptschion</p>\n"
				event => A
				event2 => B
			end state B
			
			end'''
		)
	}
	
	@Test
	def void event_empty() {
		val descriptor = eventDescriptor()
		val elementToEdit = model.events.last
		val editor = new XtextSiriusModelEditor(descriptor) => [
			semanticElement = elementToEdit
			callback = new TestXtextSiriusEditorCallbackAdapter(inlineInjector, model) {
				
				override callbackSetValue(Object value, int offset, int length) {
					assertEquals(29, offset)
					assertEquals(9, length)
					
					super.callbackInitValue(value, offset, length)
				}
				
				override getTestSemanticElement() {
					elementToEdit
				}
			}
		]
		
		editor.valueFeatureName = ""
		editor.initValue("eventX 33")
		val result = editor.commit(elementToEdit) as Event
		assertModelEquals(createEvent => [
			name = "eventX"
			code = 33
		], result)
		val rootContainer = EcoreUtil::getRootContainer(result)
		EcoreUtil::resolveAll(rootContainer)
		assertModelEquals(
			modelText
				.replace("event2 2", "eventX 33")
				.replace("event2 => B", "eventX => B")
				.parseModel("test.statemachine"),
			rootContainer
		)
	}
	
	@Test
	def void event_guard_set() {
		val descriptor = eventDescriptor()
		val elementToEdit = model.events.head
		val editor = new XtextSiriusModelEditor(descriptor) => [
			semanticElement = elementToEdit
			callback = new TestXtextSiriusEditorCallbackAdapter(inlineInjector, model) {
				
				override callbackSetValue(Object value, int offset, int length) {
					assertEquals(29, offset)
					assertEquals(9, length)
					
					super.callbackInitValue(value, offset, length)
				}
				
				override getTestSemanticElement() {
					elementToEdit
				}
			}
		]
		
		editor.valueFeatureName = "guard"
		editor.initValue("2")
		val result = editor.commit(elementToEdit) as Statemachine
		val valueToCommit = result.events.head
		assertModelEquals(createValueGuard => [
			cond = createIntLiteral => [
				value = 2
			]
		], valueToCommit)
		val rootContainer = EcoreUtil::getRootContainer(valueToCommit)
		EcoreUtil::resolveAll(rootContainer)
		assertModelEquals(
			modelText
				.replace("[c1..22]", "[2]")
				.parseModel("test.statemachine"),
			rootContainer
		)
	}
	
	@Test
	def void event_guard_unset() {
		val descriptor = eventDescriptor()
		val elementToEdit = model.events.last
		val editor = new XtextSiriusModelEditor(descriptor) => [
			semanticElement = elementToEdit
			callback = new TestXtextSiriusEditorCallbackAdapter(inlineInjector, model) {
				
				override callbackSetValue(Object value, int offset, int length) {
					assertEquals(37, offset)
					assertEquals(0, length)
					
					super.callbackInitValue(value, offset, length)
				}
				
				override getTestSemanticElement() {
					elementToEdit
				}
			}
		]
		
		editor.valueFeatureName = "guard"
		editor.initValue("")
		val result = editor.commit(elementToEdit) as Statemachine
		val valueToCommit = result.events.last
		assertModelEquals(createValueGuard => [
			cond = createIntLiteral => [
				value = 2
			]
		], valueToCommit)
		val rootContainer = EcoreUtil::getRootContainer(valueToCommit)
		EcoreUtil::resolveAll(rootContainer)
		assertModelEquals(
			modelText
				.replace("event2 2", "event2 2 [2]")
				.parseModel("test.statemachine"),
			rootContainer
		)
	}
	
	@Test
	def void statemachine_events_set() {
		val descriptor = eventDescriptor()
		val elementToEdit = model
		val editor = new XtextSiriusModelEditor(descriptor) => [
			semanticElement = elementToEdit
			callback = new TestXtextSiriusEditorCallbackAdapter(inlineInjector, model) {
				
				override callbackSetValue(Object value, int offset, int length) {
					assertEquals(10, offset)
					assertEquals(30, length)
					
					super.callbackInitValue(value, offset, length)
				}
				
				override getTestSemanticElement() {
					elementToEdit
				}
			}
		]
		
		editor.valueFeatureName = "events"
		editor.initValue("event 1 [ .. 22 ] event2 2")
		val result = editor.commit(elementToEdit) as Statemachine
		val valueToCommit = result
		val rootContainer = EcoreUtil::getRootContainer(valueToCommit)
		EcoreUtil::resolveAll(rootContainer)
		assertModelEquals(
			modelText
				.parseModel("test.statemachine"),
			rootContainer
		)
	}
	
	@Test
	def void statemachine_events_unset() {
		val descriptor = eventDescriptor()
		model.events.clear()
		val elementToEdit = model
		val editor = new XtextSiriusModelEditor(descriptor) => [
			semanticElement = elementToEdit
			callback = new TestXtextSiriusEditorCallbackAdapter(inlineInjector, model) {
				
				override callbackSetValue(Object value, int offset, int length) {
					assertEquals(10, offset)
					assertEquals(0, length)
					
					super.callbackInitValue(value, offset, length)
				}
				
				override getTestSemanticElement() {
					elementToEdit
				}
			}
		]
		
		editor.valueFeatureName = "events"
		editor.initValue("event 1 [ .. 22 ] event2 2")
		val result = editor.commit(elementToEdit) as Statemachine
		val valueToCommit = result
		val rootContainer = EcoreUtil::getRootContainer(valueToCommit)
		EcoreUtil::resolveAll(rootContainer)
		assertModelEquals(
			modelText
				.parseModel("test.statemachine"),
			rootContainer
		)
	}
	
	@Test
	def void guard_empty_set() {
		val descriptor = eventDescriptor()
		val elementToEdit = model.events.head.guard
		val editor = new XtextSiriusModelEditor(descriptor) => [
			semanticElement = elementToEdit
			callback = new TestXtextSiriusEditorCallbackAdapter(inlineInjector, model) {
				
				override callbackSetValue(Object value, int offset, int length) {
					assertEquals(20, offset)
					assertEquals(9, length)
					
					super.callbackInitValue(value, offset, length)
				}
				
				override getTestSemanticElement() {
					elementToEdit
				}
			}
		]
		
		editor.valueFeatureName = ""
		editor.initValue("2")
		val result = editor.commit(elementToEdit) as Statemachine
		val valueToCommit = result.events.head
		assertModelEquals(createValueGuard => [
			cond = createIntLiteral => [
				value = 2
			]
		], valueToCommit)
		val rootContainer = EcoreUtil::getRootContainer(valueToCommit)
		EcoreUtil::resolveAll(rootContainer)
		assertModelEquals(
			modelText
				.replace("[c1..22]", "[2]")
				.parseModel("test.statemachine"),
			rootContainer
		)
	}
	
	@Test
	def void guard_empty_unset() {
		val descriptor = eventDescriptor()
		val container = model.events.last 
		val elementToEdit = container.guard
		val editor = new XtextSiriusModelEditor(descriptor) => [
			fallbackContainer = container
			semanticElement = elementToEdit
			
			callback = new TestXtextSiriusEditorCallbackAdapter(inlineInjector, model) {
				
				override callbackSetValue(Object value, int offset, int length) {
					assertEquals(37, offset)
					assertEquals(0, length)
					
					super.callbackInitValue(value, offset, length)
				}
				
				override getTestSemanticElement() {
					container
				}
			}
		]
		
		editor.valueFeatureName = ""
		editor.initValue("")
		val result = editor.commit(container) as Statemachine
		val valueToCommit = result.events.last
		assertModelEquals(createValueGuard => [
			cond = createIntLiteral => [
				value = 2
			]
		], valueToCommit)
		val rootContainer = EcoreUtil::getRootContainer(valueToCommit)
		EcoreUtil::resolveAll(rootContainer)
		assertModelEquals(
			modelText
				.replace("event2 2", "event2 2 [2]")
				.parseModel("test.statemachine"),
			rootContainer
		)
	}
	
	@Test
	def void eventNoEdit() {
		val descriptor = eventDescriptor()
		val elementToEdit = model.events.head
		
		val editor = new XtextSiriusModelEditor(descriptor) => [
			semanticElement = elementToEdit
			callback = new TestXtextSiriusEditorCallbackAdapter(inlineInjector, model) {
				override callbackSetValue(Object value, int offset, int length) {
					val newContent = value.toString
					assertEquals(modelInlineText.toString.replace("events\n event", "events\n \nevent"), newContent)
					assertEquals(10, offset)
					assertEquals(17, length)
					
					super.callbackInitValue(value, offset, length)
				}
				
				override getTestSemanticElement() {
					elementToEdit
				}
				
			}
		]
		
		editor.valueFeatureName = elementToEdit.eContainingFeature.name
		editor.initValue("")
		val result = editor.commit(elementToEdit.eContainer) as Statemachine
		val valueToCommit = result.events.head
		assertModelEquals(createEvent => [
			name = "event"
			code = 1
			guard = createRangeGuard => [
				min = createConstantRef => [ constant = model.constants.head ]
				max = createIntLiteral => [ value = 22 ]
			]
		], valueToCommit)
		val rootContainer = EcoreUtil::getRootContainer(valueToCommit)
		EcoreUtil::resolveAll(rootContainer)
		assertModelEquals(parseModel, rootContainer)
	}
	
	@Test
	def void eventEdit() {
		val descriptor = eventDescriptor()
		val editText = modelInlineText.toString.replace("events\n event", "events\n \nevent")
		val elementToEdit = model.events.head
		
		val editor = new XtextSiriusModelEditor(descriptor) => [
			semanticElement = elementToEdit
			callback = new TestXtextSiriusEditorCallbackAdapter(injector, model) {
				
				override getXtextParseResult() {
					fakeResource.update(10, 17, "avenT 11 [33..c2]")
					super.getXtextParseResult()
				}
				
				override getTestSemanticElement() {
					elementToEdit
				}
				
			}
		]
		
		editor.valueFeatureName = ""
		editor.initValue("")
		val valueToCommit = editor.commit(elementToEdit) as EObject
		assertModelEquals(createEvent => [
			name = "avenT"
			code = 11
			guard = createRangeGuard => [
				min = createConstantRef => [ constant = model.constants.head ]
				max = createConstantRef => [ constant = model.constants.last ]
			]
		], valueToCommit)
		
		val rootContainer = EcoreUtil::getRootContainer(valueToCommit)
		EcoreUtil::resolveAll(rootContainer)
		assertModelEquals(
			modelText
				.replace("event 1 [c1..22]", "avenT 11 [c1..c2]")
				.replace("event => A", "avenT => A")
				.parseModel("test.statemachine"),
			rootContainer
		)
	}
	
	protected def eventDescriptor() {
		new XtextSiriusModelDescriptor(inlineInjector, createXtextDirectEditModelDescription => [
			ignoredNestedFeatures += "guard.min"
			selectedFeatures += "Event.name"
		])
	}
}
