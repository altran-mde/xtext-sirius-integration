package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import org.junit.Test

import static org.junit.Assert.*

class TestResolveDefinedFeatures extends AModelRegionEditorPreparer {
	@Test
	def emptyFeatures() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(event, injector, false, emptyList)

		val resolved = preparer.resolveDefinedFeatures(event)

		assertEquals(0, resolved.size)
	}

	@Test
	def someDefinedFeatures() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(event, injector, false, #["Event.name", "Event.guard"])

		val resolved = preparer.resolveDefinedFeatures(event)

		assertEquals(resolved.toString, 1, resolved.size)
		assertNotNull(resolved.findFirstByName("name"))
	}

	@Test
	def allDefinedFeatures() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(event, injector, false, #["Event.name", "Event.code", "Event.guard"])

		val resolved = preparer.resolveDefinedFeatures(event)

		assertEquals(resolved.toString, 2, resolved.size)
		assertNotNull(resolved.findFirstByName("name"))
		assertNotNull(resolved.findFirstByName("code"))
	}

	@Test
	def allFeatures() {
		val model = defaultModel

		val event = model.events.get(1)

		val preparer = new AccessibleModelRegionEditorPreparer(event, injector, false, #["Event.name", "Event.code", "Event.guard"])

		val resolved = preparer.resolveDefinedFeatures(event)

		assertEquals(resolved.toString, 3, resolved.size)
		assertNotNull(resolved.findFirstByName("name"))
		assertNotNull(resolved.findFirstByName("code"))
		assertNotNull(resolved.findFirstByName("guard"))
	}

}
