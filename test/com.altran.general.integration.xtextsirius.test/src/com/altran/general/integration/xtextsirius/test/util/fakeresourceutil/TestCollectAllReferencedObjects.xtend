/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import java.util.stream.Collectors
import org.junit.Test

import static org.junit.Assert.*

class TestCollectAllReferencedObjects extends ATestFakeResourceUtil {
	@Test
	def empty() {
		val model = defaultModel

		val event = model.events.get(0)

		val objects = accessibleFakeResourceUtil.collectAllReferencedObjects(event).collect(Collectors.toList)
		assertEquals(0, objects.size)
	}

	@Test
	def empty_shallow() {
		val model = defaultModel

		val event = model.events.get(2)

		val objects = accessibleFakeResourceUtil.collectAllReferencedObjects(event).collect(Collectors.toList)
		assertEquals(0, objects.size)
	}

	@Test
	def simple() {
		val model = defaultModel

		val guard = model.events.get(4).guard

		val objects = accessibleFakeResourceUtil.collectAllReferencedObjectsDeep(guard).collect(Collectors.toList)
		assertEquals(objects.toString, 2, objects.size)
		assertNotNull(objects.findFirstByName("constant2"))
		assertNotNull(objects.findFirstByName("constant3X"))
	}
}
