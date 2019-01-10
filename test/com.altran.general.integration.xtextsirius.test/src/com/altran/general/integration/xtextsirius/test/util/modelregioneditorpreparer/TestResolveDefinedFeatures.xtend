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

import org.junit.Test

import static org.junit.Assert.*

class TestResolveDefinedFeatures extends AModelRegionEditorPreparer {
	@Test
	def emptyFeatures() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(multilineDescriptor, event)

		val resolved = preparer.resolveDefinedFeatures(event)

		assertEquals(0, resolved.size)
	}

	@Test
	def someDefinedFeatures() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(editableFeatureDescriptor(#{"name", "guard"}), event)

		val resolved = preparer.resolveDefinedFeatures(event)

		assertEquals(resolved.toString, 1, resolved.size)
		assertNotNull(resolved.findFirstByName("name"))
	}

	@Test
	def allDefinedFeatures() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(editableFeatureDescriptor(#{"name", "code", "guard"}), event)

		val resolved = preparer.resolveDefinedFeatures(event)

		assertEquals(resolved.toString, 2, resolved.size)
		assertNotNull(resolved.findFirstByName("name"))
		assertNotNull(resolved.findFirstByName("code"))
	}

	@Test
	def allFeatures() {
		val model = defaultModel

		val event = model.events.get(1)

		val preparer = new AccessibleModelRegionEditorPreparer(editableFeatureDescriptor(#{"name", "code", "guard"}), event)

		val resolved = preparer.resolveDefinedFeatures(event)

		assertEquals(resolved.toString, 3, resolved.size)
		assertNotNull(resolved.findFirstByName("name"))
		assertNotNull(resolved.findFirstByName("code"))
		assertNotNull(resolved.findFirstByName("guard"))
	}

}
