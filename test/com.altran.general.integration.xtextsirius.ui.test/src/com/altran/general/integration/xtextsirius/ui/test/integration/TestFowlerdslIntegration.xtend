package com.altran.general.integration.xtextsirius.ui.test.integration

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor
import com.altran.general.integration.xtextsirius.test.FowlerdslEnvironment
import com.altran.general.integration.xtextsirius.test.InlineFowlerdslEnvironment
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory
import org.espilce.commons.emf.testsupport.AModelLoader
import org.espilce.commons.lang.StringUtils2
import org.junit.After
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

import static org.espilce.commons.emf.testsupport.AssertEmf.*
import static org.junit.Assert.*

class TestFowlerdslIntegration {
	extension AModelLoader modelLoader = new AModelLoader() {
		
		override provideResourceSet() {
			new ResourceSetImpl()
		}
		
	}
	extension DiagramxtextFactory diagramFactory = DiagramxtextFactory::eINSTANCE
	extension StatemachineFactory statemachineFactory = StatemachineFactory::eINSTANCE
	
	Statemachine model
	
	@BeforeClass
	static def void loadFowlerds() {
		FowlerdslEnvironment::getInstance
		InlineFowlerdslEnvironment::getInstance
	}
	
	protected def modelText() {
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
	
	protected def parseModel() {
		val result = modelText.parseModel("test.statemachine") as Statemachine
		EcoreUtil.resolveAll(result)
		return result
	}

	@Before
	def void loadModel() {
		model = parseModel()
	}
	
	@After
	def void unloadModel() {
		model.eResource.unload
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
					
					super.callbackSetValue(value, offset, length)
				}
				
				override protected getSemanticElement() {
					elementToEdit
				}
				
			}
		]
		
		val valueFeatureName = elementToEdit.eContainingFeature.name
		editor.doSetValue("", valueFeatureName)
		val result = editor.commit(elementToEdit.eContainer, valueFeatureName) as Statemachine
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
				
				override protected getSemanticElement() {
					elementToEdit
				}
				
			}
		]
		
		val valueFeatureName = ""
		editor.doSetValue("", valueFeatureName)
		val valueToCommit = editor.commit(elementToEdit, valueFeatureName) as EObject
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
	
	protected def getInjector() {
		FowlerdslEnvironment::instance.injector
	}
	
	protected def getInlineInjector() {
		InlineFowlerdslEnvironment::instance.injector
	}
}
