/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer

import org.apache.commons.lang.SystemUtils
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.Group
import org.eclipse.xtext.XtextFactory
import org.junit.Assume
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class TestCollectGrammarElementsBeforeAndAfter extends ARequiredGrammarTerminalsPresentEnsurer {
    @Before
    def void assumeWindows() {
        // Platform specific test due to line separator
        Assume::assumeTrue('Test requires Windows OS', SystemUtils::IS_OS_WINDOWS)
    }
    
	@Test
	def emptyGroup() {
		val ensurer = fakeEnsurer => [
			containedElement = XtextFactory.eINSTANCE.createAbstractElement
			containingGroup = XtextFactory.eINSTANCE.createGroup
		]

		ensurer.collectBeforeAndAfter()

		assertTrue(ensurer.elementsBefore.isEmpty)
		assertTrue(ensurer.elementsAfter.isEmpty)
	}

	@Test
	def eventName() {
		val model = defaultModel

		val event = model.events.get(4)

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)

		val featureRegion = eventRegion.allRegionsFor.feature(statemachinePackage.event_Name)
		val grElement = featureRegion.grammarElement as AbstractElement
		val group = GrammarUtil.containingGroup(grElement) 

		val ensurer = fakeEnsurer => [
			containedElement = grElement 
			containingGroup = group
		]


		ensurer.collectBeforeAndAfter()

		assertTrue(ensurer.elementsBefore.isEmpty)
		assertEquals(ensurer.elementsAfter.toString, 2, ensurer.elementsAfter.size)

		assertTrue(ensurer.elementsAfter.head instanceof Assignment)
		val elementAfter1 = ensurer.elementsAfter.head as Assignment
		assertEquals("code", elementAfter1.feature)

		assertTrue(ensurer.elementsAfter.last instanceof Group)
		val elementAfter2 = ensurer.elementsAfter.last as Group
		assertEquals("guard", elementAfter2.elements.filter(Assignment).head.feature)
	}

	@Test
	def eventCode() {
		val model = defaultModel

		val event = model.events.get(4)

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)

		val featureRegion = eventRegion.allRegionsFor.feature(statemachinePackage.event_Code)
		val grElement = featureRegion.grammarElement as AbstractElement
		val group = GrammarUtil.containingGroup(grElement)

		val ensurer = fakeEnsurer => [
			containedElement = grElement
			containingGroup = group
		]

		ensurer.collectBeforeAndAfter()

		assertEquals(ensurer.elementsBefore.toString, 1, ensurer.elementsBefore.size)

		assertTrue(ensurer.elementsBefore.head instanceof Assignment)
		val elementBefore = ensurer.elementsBefore.head as Assignment
		assertEquals("name", elementBefore.feature)

		assertEquals(ensurer.elementsAfter.toString, 1, ensurer.elementsAfter.size)

		assertTrue(ensurer.elementsAfter.toString, ensurer.elementsAfter.head instanceof Group)
		val elementAfter = ensurer.elementsAfter.head as Group
		assertEquals("guard", elementAfter.elements.filter(Assignment).head.feature)
	}

	@Test
	def eventGuard() {
		val model = defaultModel

		val event = model.events.get(4)

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)

		val featureRegion = eventRegion.allRegionsFor.feature(statemachinePackage.event_Code).nextSemanticRegion
		val grElement = GrammarUtil.containingGroup(GrammarUtil.containingGroup(featureRegion.grammarElement as AbstractElement))
		val group = grElement.eContainer as Group

		val ensurer = fakeEnsurer => [
			containedElement = grElement
			containingGroup = group
		]

		ensurer.collectBeforeAndAfter()

		assertEquals(ensurer.elementsBefore.toString, 2, ensurer.elementsBefore.size)

		assertTrue(ensurer.elementsBefore.head instanceof Assignment)
		val elementBefore1 = ensurer.elementsBefore.head as Assignment
		assertEquals("name", elementBefore1.feature)

		assertTrue(ensurer.elementsBefore.last instanceof Assignment)
		val elementBefore2 = ensurer.elementsBefore.last as Assignment
		assertEquals("code", elementBefore2.feature)

		assertTrue(ensurer.elementsAfter.isEmpty)
	}

}
