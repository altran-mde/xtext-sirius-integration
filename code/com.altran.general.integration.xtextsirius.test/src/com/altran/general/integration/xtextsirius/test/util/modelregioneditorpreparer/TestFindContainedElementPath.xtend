package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Assignment
import org.junit.Test

import static org.junit.Assert.*

class TestFindContainedElementPath extends AModelRegionEditorPreparer {
	@Test
	def void noPath() {
		val model = defaultModel

		val event = model.events.get(4)

		val preparer = fakePreparer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val baseElement = eventRegion.grammarElement as AbstractElement

		val path = preparer.findContainedElementPath(baseElement, statemachinePackage.state_Transitions)

		assertTrue(path.isEmpty)
	}

	@Test
	def void invalidPath() {
		val model = defaultModel

		val event = model.events.get(4)

		val preparer = fakePreparer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val baseElement = eventRegion.grammarElement as AbstractElement

		val path = preparer.findContainedElementPath(baseElement, statemachinePackage.constant_Value)

		assertTrue(path.isEmpty)
	}

	@Test
	def void simplePath() {
		val model = defaultModel

		val event = model.events.get(4)

		val preparer = fakePreparer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val baseElement = eventRegion.grammarElement as AbstractElement

		val path = preparer.findContainedElementPath(baseElement, statemachinePackage.event_Name)

		assertEquals(path.toString, 3, path.size)

		assertEquals(baseElement, path.head)

		assertTrue(path.last instanceof Assignment)
		val last = path.last as Assignment
		assertEquals(statemachinePackage.event_Name.name, last.feature)
	}

	@Test
	def void complexPath() {
		val model = defaultModel

		val event = model.events.get(4)

		val preparer = fakePreparer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val baseElement = eventRegion.grammarElement as AbstractElement

		val path = preparer.findContainedElementPath(baseElement, statemachinePackage.event_Guard)

		assertEquals(path.toString, 4, path.size)

		assertEquals(baseElement, path.head)

		assertTrue(path.last instanceof Assignment)
		val last = path.last as Assignment
		assertEquals(statemachinePackage.event_Guard.name, last.feature)
	}

}
