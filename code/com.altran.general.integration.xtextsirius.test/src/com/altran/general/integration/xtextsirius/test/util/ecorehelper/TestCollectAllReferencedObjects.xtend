package com.altran.general.integration.xtextsirius.test.util.ecorehelper

import java.util.stream.Collectors
import org.junit.Test

import static org.junit.Assert.*

class TestCollectAllReferencedObjects extends ATestEcoreHelper {
	@Test
	def empty() {
		val model = defaultModel

		val event = model.events.get(0)

		val objects = accessibleEcoreHelper.collectAllReferencedObjects(event).collect(Collectors.toList)
		assertEquals(0, objects.size)
	}

	@Test
	def empty_shallow() {
		val model = defaultModel

		val event = model.events.get(2)

		val objects = accessibleEcoreHelper.collectAllReferencedObjects(event).collect(Collectors.toList)
		assertEquals(0, objects.size)
	}

	@Test
	def simple() {
		val model = defaultModel

		val guard = model.events.get(4).guard

		val objects = accessibleEcoreHelper.collectAllReferencedObjectsDeep(guard).collect(Collectors.toList)
		assertEquals(objects.toString, 2, objects.size)
		assertNotNull(objects.findFirstByName("constant2"))
		assertNotNull(objects.findFirstByName("constant3X"))
	}
}
