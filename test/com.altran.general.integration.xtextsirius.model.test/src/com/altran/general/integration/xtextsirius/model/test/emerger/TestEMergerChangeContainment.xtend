/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerChangeContainment extends ATestEMergerEReference<Element> {
	@Test
	def void single_single() {
		val edited = createRootElement => [
			containedSingle = createContainedA => [
				attrB = "11b"
				attrX = "11x"
			]
		]

		val existing = createRootElement => [
			containedSingle = createContainedB => [
				attrA = "22a"
				attrB = "22b"
				attrY = "22y"
			]
		]

		val result = createEMerger(existing, edited).merge(edited)
		assertNotNull(result.containedSingle)
		assertTrue(result.containedSingle instanceof ContainedA)
		assertNull(result.containedSingle.attrA)
		assertEquals("11b", result.containedSingle.eGet(containedA_AttrB))
		assertEquals("11x", result.containedSingle.eGet(containedA_AttrX))
	}

	@Test
	def void single_multiEmpty() {
		val newValue = createContainedA => [
			attrA = "11a"
			attrB = "11b"
			attrX = "11x"
		]

		val existing = createRootElement => [
		]

		val result = createEMerger(existing, IElement_ContainedMulti).merge(newValue, IElement_ContainedMulti)
		assertEquals(1, result.containedMulti.size)
		assertTrue(result.containedMulti.exists[attrA == "11a"])
	}

	@Test
	def void single_multiNew() {
		val newValue = createContainedA => [
			attrA = "11a"
			attrB = "11b"
			attrX = "11x"
		]

		val existing = createRootElement => [
			containedMulti += createContainedB => [
				attrA = "22a"
				attrB = "22b"
				attrY = "22y"
			]
			containedMulti += createContainedB => [
				attrA = "33a"
				attrB = "33b"
				attrY = "33y"
			]
		]

		val result = createEMerger(existing, IElement_ContainedMulti).merge(newValue, IElement_ContainedMulti)
		assertEquals(3, result.containedMulti.size)
		assertTrue(result.containedMulti.exists[attrA == "22a"])
		assertTrue(result.containedMulti.exists[attrA == "33a"])
		assertTrue(result.containedMulti.exists[attrA == "11a"])
	}

	@Test
	def void single_multiExisting() {
		val edited = createRootElement => [
			changeableCont = newEdited(99, "99")
			containedMulti += createContainedA => [
				attrA = "11a"
				attrB = "11b"
				attrX = "11x"
			]
		]
		
		//dummy to create appropriate edited URIs
		newEdited(100, "100")

		val existing = createRootElement => [
			containedMulti += createContainedB => [
				attrA = "22a"
				attrB = "22b"
				attrY = "22y"
			]
			containedMulti += createContainedB => [
				attrA = "33a"
				attrB = "33b"
				attrY = "33y"
			]
		]

		val result = createEMerger(existing, IElement_ContainedMulti).merge(edited.containedMulti.head, IElement_ContainedMulti)
		assertEquals(2, result.containedMulti.size)
		assertTrue(result.containedMulti.exists[attrA == "11a"])
		assertTrue(result.containedMulti.exists[attrA == "33a"])
	}

	@Test
	def void multi_multiEmpty() {
		val newValue = #[
			createContainedA => [
				attrA = "11a"
				attrB = "11b"
				attrX = "11x"
			],
			createContainedA => [
				attrA = "44a"
				attrB = "44b"
				attrX = "44x"
			]
		]

		val existing = createRootElement => [
		]

		val result = createEMerger(existing, IElement_ContainedMulti).merge(newValue, IElement_ContainedMulti)
		assertEquals(2, result.containedMulti.size)
		assertTrue(result.containedMulti.exists[attrA == "11a"])
		assertTrue(result.containedMulti.exists[attrA == "44a"])
	}

	@Test
	def void multi_multiNew() {
		val newValue = #[
			createContainedA => [
				attrA = "11a"
				attrB = "11b"
				attrX = "11x"
			],
			createContainedA => [
				attrA = "44a"
				attrB = "44b"
				attrX = "44x"
			]
		]

		val existing = createRootElement => [
			containedMulti += createContainedB => [
				attrA = "22a"
				attrB = "22b"
				attrY = "22y"
			]
			containedMulti += createContainedB => [
				attrA = "33a"
				attrB = "33b"
				attrY = "33y"
			]
		]

		val result = createEMerger(existing, IElement_ContainedMulti).merge(newValue, IElement_ContainedMulti)
		assertEquals(2, result.containedMulti.size)
		assertTrue(result.containedMulti.exists[attrA == "11a"])
		assertTrue(result.containedMulti.exists[attrA == "44a"])
	}

	@Test
	def void multi_multiExisting() {
		val edited = createRootElement => [
			changeableCont = newEdited(99, "99")
			containedMulti += createContainedA => [
				attrA = "11a"
				attrB = "11b"
				attrX = "11x"
			]
			containedMulti += createContainedA => [
				attrA = "44a"
				attrB = "44b"
				attrX = "44x"
			]
			
		]
		
		//dummy to create appropriate edited URIs
		newEdited(100, "100")

		val existing = createRootElement => [
			containedMulti += createContainedB => [
				attrA = "22a"
				attrB = "22b"
				attrY = "22y"
			]
			containedMulti += createContainedB => [
				attrA = "33a"
				attrB = "33b"
				attrY = "33y"
			]
			containedMulti += createContainedB => [
				attrA = "55a"
				attrB = "55b"
				attrY = "55y"
			]
		]

		val result = createEMerger(existing, IElement_ContainedMulti).merge(edited.containedMulti, IElement_ContainedMulti)
		assertEquals(2, result.containedMulti.size)
		assertTrue(result.containedMulti.exists[attrA == "11a"])
		assertTrue(result.containedMulti.exists[attrA == "44a"])
	}

	@Test
	def void multi_multi() {
		val edited = createRootElement => [
			changeableCont = newEdited(99, "99")
			containedMulti += createContainedA => [
				attrA = "11a"
				attrB = "11b"
				attrX = "11x"
			]
			containedMulti += createContainedA => [
				attrA = "44a"
				attrB = "44b"
				attrX = "44x"
			]
			
		]
		
		//dummy to create appropriate edited URIs
		newEdited(100, "100")

		val existing = createRootElement => [
			containedMulti += createContainedB => [
				attrA = "22a"
				attrB = "22b"
				attrY = "22y"
			]
			containedMulti += createContainedB => [
				attrA = "33a"
				attrB = "33b"
				attrY = "33y"
			]
			containedMulti += createContainedB => [
				attrA = "55a"
				attrB = "55b"
				attrY = "55y"
			]
		]

		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.containedMulti.size)
		assertTrue(result.containedMulti.exists[attrA == "11a"])
		assertTrue(result.containedMulti.exists[attrA == "44a"])
	}
}
