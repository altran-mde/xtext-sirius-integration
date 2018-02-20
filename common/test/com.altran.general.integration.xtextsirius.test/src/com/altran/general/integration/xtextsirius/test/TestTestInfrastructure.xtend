package com.altran.general.integration.xtextsirius.test

import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant
import org.junit.Test

import static org.junit.Assert.*

class TestTestInfrastructure extends AFowlerdslDefaultModelTest {
	@Test
	def parseTest() {
		val model = parse('''
			events
				event1 111
			end
		''')

		assertEquals("event1", model.events.head.name)
	}
	
	@Test
	def parseIntoResourceTest() {
		val model = parseIntoResource('''
			events
				event1 111
			end
		''')

		assertEquals("event1", model.events.head.name)
		assertNotNull(model.eResource)
		assertNotNull(model.eResource.resourceSet)
	}
	
	@Test
	def findFirstTargetOfTypeTest() {
		val model = defaultModel;
		
		val event4 = model.events.get(4)
		val constant = findFirstTargetOfType(event4, Constant)
		
		assertEquals("constant3X", constant.name) 
	}
	
	@Test
	def defaultModelTest() {
		val model = defaultModel;
		
		assertEquals(5, model.events.size)
		assertEquals(3, model.constants.size)
		
		val event4 = model.events.get(3)
		val constant = findFirstTargetOfType(event4, Constant)
		
		assertNotEquals(event4.eResource, constant.eResource)
	}
	
	@Test
	def fakeModelTest() {
		val model = defaultModel
		val fakeModel = createFakeModel(model)
		
		assertNotEquals(model, fakeModel)
		assertNotEquals(model.eResource, fakeModel.eResource)
		assertNotEquals(model.eResource.resourceSet, fakeModel.eResource.resourceSet)
	}
	
}
