package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import org.junit.Test

import static org.junit.Assert.*
import org.eclipse.xtext.XtextFactory
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Group

class TestCollectGrammarElementsBeforeAndAfter extends AModelRegionEditorPreparer {
	@Test
	def emptyGroup() {
		val preparer = fakePreparer

		val elementsBefore = newArrayList()
		val elementsAfter = newArrayList()

		preparer.collectGrammarElementsBeforeAndAfter(XtextFactory.eINSTANCE.createAbstractElement,
			XtextFactory.eINSTANCE.createGroup, elementsBefore, elementsAfter)

		assertTrue(elementsBefore.isEmpty)
		assertTrue(elementsAfter.isEmpty)
	}

	@Test
	def eventName() {
		val model = defaultModel

		val event = model.events.get(4)

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)

		val featureRegion = eventRegion.allRegionsFor.feature(statemachinePackage.event_Name)
		val grammarElement = featureRegion.grammarElement as AbstractElement
		val group = GrammarUtil.containingGroup(grammarElement)

		val preparer = fakePreparer

		val elementsBefore = newArrayList()
		val elementsAfter = newArrayList()

		preparer.collectGrammarElementsBeforeAndAfter(grammarElement, group, elementsBefore, elementsAfter)

		assertTrue(elementsBefore.isEmpty)
		assertEquals(elementsAfter.toString, 2, elementsAfter.size)

		assertTrue(elementsAfter.head instanceof Assignment)
		val elementAfter1 = elementsAfter.head as Assignment
		assertEquals("code", elementAfter1.feature)

		assertTrue(elementsAfter.last instanceof Group)
		val elementAfter2 = elementsAfter.last as Group
		assertEquals("guard", elementAfter2.elements.filter(Assignment).head.feature)
	}

	@Test
	def eventCode() {
		val model = defaultModel

		val event = model.events.get(4)

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)

		val featureRegion = eventRegion.allRegionsFor.feature(statemachinePackage.event_Code)
		val grammarElement = featureRegion.grammarElement as AbstractElement
		val group = GrammarUtil.containingGroup(grammarElement)

		val preparer = fakePreparer

		val elementsBefore = newArrayList()
		val elementsAfter = newArrayList()

		preparer.collectGrammarElementsBeforeAndAfter(grammarElement, group, elementsBefore, elementsAfter)

		assertEquals(elementsBefore.toString, 1, elementsBefore.size)

		assertTrue(elementsBefore.head instanceof Assignment)
		val elementBefore = elementsBefore.head as Assignment
		assertEquals("name", elementBefore.feature)

		assertEquals(elementsAfter.toString, 1, elementsAfter.size)

		assertTrue(elementsAfter.head instanceof Group)
		val elementAfter = elementsAfter.head as Group
		assertEquals("guard", elementAfter.elements.filter(Assignment).head.feature)
	}

	@Test
	def eventGuard() {
		val model = defaultModel

		val event = model.events.get(4)

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)

		val featureRegion = eventRegion.allRegionsFor.feature(statemachinePackage.event_Code).nextSemanticRegion
		val grammarElement = GrammarUtil.containingGroup(GrammarUtil.containingGroup(featureRegion.grammarElement as AbstractElement))
		val group = grammarElement.eContainer as Group

		val preparer = fakePreparer

		val elementsBefore = newArrayList()
		val elementsAfter = newArrayList()

		preparer.collectGrammarElementsBeforeAndAfter(grammarElement, group, elementsBefore, elementsAfter)

		assertEquals(elementsBefore.toString, 2, elementsBefore.size)

		assertTrue(elementsBefore.head instanceof Assignment)
		val elementBefore1 = elementsBefore.head as Assignment
		assertEquals("name", elementBefore1.feature)

		assertTrue(elementsBefore.last instanceof Assignment)
		val elementBefore2 = elementsBefore.last as Assignment
		assertEquals("code", elementBefore2.feature)

		assertTrue(elementsAfter.isEmpty)
	}

}
