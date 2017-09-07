package com.altran.general.integration.xtextsirius.test.util.ecollectionutil

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest
import com.altran.general.integration.xtextsirius.util.ECollectionUtil
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant
import org.junit.Test

import static org.junit.Assert.*

class TestReplaceOrAddLocal extends AFowlerdslDefaultModelTest {
	@Test
	def replace() {
		val model = defaultModel
		val fakeModel = createFakeModel(model);
		
		val orgEvent = model.events.get(3)
		
		val fakeEvent = fakeModel.events.get(3)
		val fakeConst = findFirstTargetOfType(fakeEvent, Constant)
		
		val eventCount = model.events.size
		
		val replacement = ECollectionUtil.instance.replaceOrAddLocal(model.events, fakeEvent)
		
		assertSame(fakeEvent, replacement)
		assertEquals(eventCount, model.events.size)
		
		val replacedEvent = model.events.get(3)
		val replacedConst = findFirstTargetOfType(replacedEvent, Constant)
		
		assertNotSame(orgEvent, replacedEvent)
		assertSame(fakeEvent, replacedEvent)
		assertSame(fakeConst, replacedConst)
	}
	
	@Test
	def add() {
		val model = defaultModel
		val fakeModel = createFakeModel(model);
		
		val orgEvent = model.events.get(3)
		
		val fakeConst = findFirstTargetOfType(fakeModel.events.get(3), Constant)
		val fakeEvent = createEvent => [
			name = "fakeEvent"
			code = "xxx"
			guard = createValueGuard => [
				cond = createConstantRef => [
					constant = fakeConst
				]
			]
		]
		fakeModel.events += fakeEvent
		
		val eventCount = model.events.size
		
		val replacement = ECollectionUtil.instance.replaceOrAddLocal(model.events, fakeEvent)
		
		assertNull(replacement)
		assertNotEquals(eventCount, model.events.size)
		
		val replacedEvent = model.events.last
		val replacedConst = findFirstTargetOfType(replacedEvent, Constant)
		
		assertNotSame(orgEvent, replacedEvent)
		assertSame(fakeEvent, replacedEvent)
		assertSame(fakeConst, replacedConst)
	}
}