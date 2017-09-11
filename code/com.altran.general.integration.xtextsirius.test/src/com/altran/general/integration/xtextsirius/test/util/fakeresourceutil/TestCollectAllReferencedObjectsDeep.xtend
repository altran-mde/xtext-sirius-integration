package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import java.util.stream.Collectors
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant
import org.junit.Test

import static org.junit.Assert.*

class TestCollectAllReferencedObjectsDeep extends ATestFakeResourceUtil {
	@Test
	def empty() {
		val model = defaultModel

		val event = model.events.get(0)

		val objects = accessibleFakeResourceUtil.collectAllReferencedObjectsDeep(event).collect(Collectors.toList)
		assertEquals(0, objects.size)
	}

	@Test
	def simple() {
		val model = defaultModel

		val event = model.events.get(2)

		val objects = accessibleFakeResourceUtil.collectAllReferencedObjectsDeep(event).collect(Collectors.toList)
		assertEquals(1, objects.size)
		assertEquals("constant1", (objects.head as Constant).name)
	}

	@Test
	def deep() {
		val model = defaultModel

		val event = model.events.get(4)

		val objects = accessibleFakeResourceUtil.collectAllReferencedObjectsDeep(event).collect(Collectors.toList)
		assertEquals(objects.toString, 2, objects.size)
		assertNotNull(objects.findFirstByName("constant2"))
		assertNotNull(objects.findFirstByName("constant3X"))
	}

}
