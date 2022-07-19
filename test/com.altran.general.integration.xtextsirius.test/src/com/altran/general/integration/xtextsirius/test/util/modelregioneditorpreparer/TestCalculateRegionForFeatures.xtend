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

import java.util.NoSuchElementException
import java.util.Set
import org.apache.commons.lang.SystemUtils
import org.eclipse.emf.ecore.EStructuralFeature
import org.junit.Assume
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class TestCalculateRegionForFeatures extends AModelRegionEditorPreparer {
    @Before
    def void assumeWindows() {
        // Platform specific test due to line separator
        Assume::assumeTrue('Test requires Windows OS', SystemUtils::IS_OS_WINDOWS)
    }
    
	@Test(expected=NoSuchElementException)
	def void emptyFeatures() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(descriptor, event)

		preparer.definedFeatures = emptySet

		preparer.calculateRegionForFeatures(event)
	}

	@Test
	def oneDefinedFeature() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(descriptor, event)

		val rootRegion = getRootRegion(event)
		preparer.rootRegion = rootRegion

		val eventRegion = rootRegion.regionForEObject(event)
		preparer.semanticRegion = eventRegion

		preparer.definedFeatures = #[statemachinePackage.event_Name as EStructuralFeature].toSet

		val region = preparer.calculateRegionForFeatures(event)

		assertEquals(26, region.offset)
		assertEquals(6, region.length)
		assertEquals("event1", rootRegion.resolveRegion(region))
	}

	@Test
	def oneDefinedFeatureLong() {
		val model = defaultModel

		val event = model.events.get(2)

		val preparer = new AccessibleModelRegionEditorPreparer(descriptor, event)

		val rootRegion = getRootRegion(event)
		preparer.rootRegion = rootRegion

		val eventRegion = rootRegion.regionForEObject(event)
		preparer.semanticRegion = eventRegion

		preparer.definedFeatures = #[statemachinePackage.event_Name as EStructuralFeature].toSet

		val region = preparer.calculateRegionForFeatures(event)

		assertEquals(58, region.offset)
		assertEquals(6, region.length)
		assertEquals("event3", rootRegion.resolveRegion(region))
	}

	@Test
	def someDefinedFeatures() {
		val model = defaultModel

		val event = model.events.get(2)

		val preparer = new AccessibleModelRegionEditorPreparer(descriptor, event)

		val rootRegion = getRootRegion(event)
		preparer.rootRegion = rootRegion

		val eventRegion = rootRegion.regionForEObject(event)
		preparer.semanticRegion = eventRegion

		preparer.definedFeatures = #[statemachinePackage.event_Name, statemachinePackage.event_Guard].
			toSet as Set<EStructuralFeature>

		val region = preparer.calculateRegionForFeatures(event)

		assertEquals(58, region.offset)
		assertEquals(30, region.length)
		val text = rootRegion.resolveRegion(region)
		assertEquals("event3\r\n333\t \t[\r\nconstant1\t\t\t]", text)
	}

	@Test
	def allPrefixedFeatures() {
		val model = defaultModel

		val cmd = model.commands.get(1)

		val preparer = new AccessibleModelRegionEditorPreparer(descriptor, cmd)

		val rootRegion = getRootRegion(cmd)
		preparer.rootRegion = rootRegion

		val cmdRegion = rootRegion.regionForEObject(cmd)
		preparer.semanticRegion = cmdRegion
		preparer.definedFeatures = #[statemachinePackage.command_Name, statemachinePackage.command_Code,
			statemachinePackage.command_Guard].toSet as Set<EStructuralFeature>

		val region = preparer.calculateRegionForFeatures(cmd)

		assertEquals(194, region.offset)
		assertEquals(18, region.length)
		val text = rootRegion.resolveRegion(region)
		assertEquals("[123] command2 234", text)

	}

}
