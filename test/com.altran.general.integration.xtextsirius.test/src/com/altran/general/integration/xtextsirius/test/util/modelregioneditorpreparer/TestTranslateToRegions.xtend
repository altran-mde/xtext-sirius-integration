/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import java.util.Set
import org.apache.commons.lang.SystemUtils
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event
import org.junit.Assume
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class TestTranslateToRegions extends AModelRegionEditorPreparer {
    @Before
    def void assumeWindows() {
        // Platform specific test due to line separator
        Assume::assumeTrue('Test requires Windows OS', SystemUtils::IS_OS_WINDOWS)
    }
    
	@Test
	def emptyFeatures() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(descriptor, event)

		val rootRegion = getRootRegion(event)

		val eventRegion = rootRegion.regionForEObject(event)

		val regions = preparer.translateToRegions(emptySet, eventRegion, event, rootRegion)

		assertEquals(0, regions.size)
	}

	@Test
	def oneDefinedFeature() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(descriptor, event)

		val rootRegion = getRootRegion(event)

		val eventRegion = rootRegion.regionForEObject(event)

		val regions = preparer.translateToRegions(#[statemachinePackage.event_Name, statemachinePackage.event_Guard].toSet as Set<EStructuralFeature>, eventRegion, event, rootRegion)

		assertEquals(1, regions.size)
		
		val region = regions.head
		assertEquals(26, region.offset)
		assertEquals(6, region.length)
		assertEquals("event1", region.text)
	}

	@Test
	def someDefinedFeatures() {
		val model = defaultModel

		val event = model.events.get(2)

		val preparer = new AccessibleModelRegionEditorPreparer(descriptor, event)

		val rootRegion = getRootRegion(event)

		val eventRegion = rootRegion.regionForEObject(event)

		val regions = preparer.translateToRegions(#[statemachinePackage.event_Name, statemachinePackage.event_Guard].toSet as Set<EStructuralFeature>, eventRegion, event, rootRegion)

		assertEquals(2, regions.size)

		val region1 = regions.findFirst[it.semanticElement instanceof Event]
		assertEquals(58, region1.offset)
		assertEquals(6, region1.length)
		assertEquals("event3", region1.text)
		
		val region2 = regions.findFirst[it.semanticElement instanceof ConstantRef]
		assertEquals(75, region2.offset)
		assertEquals(9, region2.length)
		assertEquals("constant1", region2.text)
	}

}
