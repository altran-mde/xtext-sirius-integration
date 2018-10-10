package com.altran.general.integration.xtextsirius.test.internal

import com.altran.general.integration.xtextsirius.runtime.modelregion.SemanticElementLocation
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest
import org.junit.Test

import static org.junit.Assert.*

class TestSemanticElementLocation extends AFowlerdslDefaultModelTest {
	@Test
	def single_same() {
		val model = defaultModel

		val event = model.events.get(1)
		val guard = event.guard

		val location = new SemanticElementLocation(guard)

		assertSame(guard, location.resolve(model.eResource))
	}

	@Test
	def list_same() {
		val model = defaultModel

		val event = model.events.get(1)

		val location = new SemanticElementLocation(event)

		assertSame(event, location.resolve(model.eResource))
	}

	@Test
	def single_other() {
		val model = defaultModel

		val event = model.events.get(1)
		val guard = event.guard

		val modelClone = createFakeModel(model)
		val eventClone = modelClone.events.get(1)
		val guardClone = eventClone.guard

		val location = new SemanticElementLocation(guard)

		assertSame(guardClone, location.resolve(modelClone.eResource))
	}

	@Test
	def list_other() {
		val model = defaultModel

		val event = model.events.get(1)

		val modelClone = createFakeModel(model)
		val eventClone = modelClone.events.get(1)

		val location = new SemanticElementLocation(event)

		assertSame(eventClone, location.resolve(modelClone.eResource))
	}

	@Test
	def single_rename() {
		val model = defaultModel

		val event = model.events.get(1)
		val guard = event.guard

		val modelClone = createFakeModel(model)
		val eventClone = modelClone.events.get(1)
		val guardClone = eventClone.guard
		eventClone.name = "someOtherName"

		val location = new SemanticElementLocation(guard)

		assertSame(guardClone, location.resolve(modelClone.eResource))
	}

	@Test
	def list_rename() {
		val model = defaultModel

		val event = model.events.get(1)

		val modelClone = createFakeModel(model)
		val eventClone = modelClone.events.get(1)
		eventClone.name = "someOtherName"

		val location = new SemanticElementLocation(event)

		assertSame(eventClone, location.resolve(modelClone.eResource))
	}

}
