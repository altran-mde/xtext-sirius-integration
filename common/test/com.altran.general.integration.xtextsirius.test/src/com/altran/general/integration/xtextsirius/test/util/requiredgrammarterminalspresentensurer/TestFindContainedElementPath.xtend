package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer

import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Group
import org.eclipse.xtext.RuleCall
import org.junit.Test

import static org.junit.Assert.*

class TestFindContainedElementPath extends ARequiredGrammarTerminalsPresentEnsurer {
	@Test
	def void noPath() {
		val model = defaultModel

		val event = model.events.get(4)

		val ensurer = fakeEnsurer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val baseElement = eventRegion.grammarElement as AbstractElement

		val path = ensurer.findContainedElementPath(baseElement, statemachinePackage.state_Transitions)

		assertTrue(path.isEmpty)
	}

	@Test
	def void invalidPath() {
		val model = defaultModel

		val event = model.events.get(4)

		val ensurer = fakeEnsurer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val baseElement = eventRegion.grammarElement as AbstractElement

		val path = ensurer.findContainedElementPath(baseElement, statemachinePackage.constant_Value)

		assertTrue(path.isEmpty)
	}

	@Test
	def void simplePath() {
		val model = defaultModel

		val event = model.events.get(4)

		val ensurer = fakeEnsurer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val baseElement = eventRegion.grammarElement as RuleCall

		val path = ensurer.findContainedElementPath(baseElement, statemachinePackage.event_Name)

		assertEquals(path.toString, 3, path.size)

		assertEquals(baseElement, path.head)

		assertTrue(path.get(1) instanceof Group)
		val middle = path.get(1) as Group
		assertEquals(3, middle.elements.size)
		assertSame(baseElement.rule, middle.eContainer)

		assertTrue(path.last instanceof Assignment)
		val last = path.last as Assignment
		assertEquals(statemachinePackage.event_Name.name, last.feature)
		assertSame(middle, last.eContainer)
	}

	@Test
	def void complexPath() {
		val model = defaultModel

		val event = model.events.get(4)

		val ensurer = fakeEnsurer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val baseElement = eventRegion.grammarElement as RuleCall

		val path = ensurer.findContainedElementPath(baseElement, statemachinePackage.event_Guard)

		assertEquals(path.toString, 4, path.size)

		assertEquals(baseElement, path.head)

		assertTrue(path.get(1) instanceof Group)
		val second = path.get(1) as Group
		assertEquals(3, second.elements.size)
		assertSame(baseElement.rule, second.eContainer)

		assertTrue(path.get(2) instanceof Group)
		val third = path.get(2) as Group
		assertEquals(3, third.elements.size)
		assertSame(second, third.eContainer)

		assertTrue(path.last instanceof Assignment)
		val last = path.last as Assignment
		assertEquals(statemachinePackage.event_Guard.name, last.feature)
		assertSame(third, last.eContainer)
	}

}
