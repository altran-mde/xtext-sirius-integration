package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import java.util.stream.Collectors
import org.junit.Test

import static org.junit.Assert.*

class TestCollectAllReferencedObjects extends ATestFakeResourceUtil {
	@Test
	def empty() {
		val model = defaultModel

		val event = model.events.get(0)

		val objects = accessibleFakeResourceUtil.collectAllReferencedObjects(event).collect(Collectors.toList)
		assertEquals(0, objects.size)
	}

	@Test
	def empty_shallow() {
		val model = defaultModel

		val event = model.events.get(2)

		val objects = accessibleFakeResourceUtil.collectAllReferencedObjects(event).collect(Collectors.toList)
		assertEquals(0, objects.size)
	}

	@Test
	def simple() {
		val model = defaultModel

		val guard = model.events.get(4).guard

		val objects = accessibleFakeResourceUtil.collectAllReferencedObjectsDeep(guard).collect(Collectors.toList)
		assertEquals(objects.toString, 2, objects.size)
		assertNotNull(objects.findFirstByName("constant2"))
		assertNotNull(objects.findFirstByName("constant3X"))
	}
}
