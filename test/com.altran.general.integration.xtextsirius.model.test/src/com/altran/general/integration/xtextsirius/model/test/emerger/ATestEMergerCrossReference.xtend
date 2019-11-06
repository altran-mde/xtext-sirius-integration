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

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
import com.google.common.collect.ImmutableSet
import org.junit.Test

import static org.junit.Assert.*

abstract class ATestEMergerCrossReference<T extends IElement<T>> extends ATestEMergerEReference<T> {
	@Test
	def void singleNull_singleNew() {
		val edited = createRootElement => [
			changeableRef = null
		]
		
		val existing = createRootElement => [
			changeableRef = null
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNull(result.changeableRef)
	}
	
	@Test
	def void singleNull_singleExisting() {
		val edited = createRootElement => [
			changeableRef = null
		]
		
		val existing = createRootElement => [
			changeableRef = newExisting(1, "")
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNull(result.changeableRef)
	}
	
	@Test
	def void singleNonNull_singleNew() {
		val edited = createRootElement => [
			changeableRef = newEdited(1, "answer")
		]
		
		val existing = createRootElement => [
			changeableRef = null
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNotNull(result.changeableRef)
		assertEquals("aanswer", result.changeableRef.changeableAttr)
	}
	
	@Test
	def void singleNonNull_singleExisting() {
		val edited = createRootElement => [
			changeableRef = newEdited(1, "answer")
		]
		
		val existing = createRootElement => [
			changeableRef = newExisting(1, "question")
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals("aanswer", result.changeableRef.changeableAttr)
	}
	
	@Test
	def void bag_bagNew() {
		val edited = createRootElement => [
			changeableBagRef += #[newEdited(3, "3.14"), newEdited(2, "2.71")]
		]
		
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(31, "31.337"), newExisting(1, "1.337")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
	}
	
	@Test
	def void bag_bagExisting() {
		val edited = createRootElement => [
			changeableBagRef += #[newEdited(3, "3.14"), newEdited(2, "2.71")]
		]
		
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
	}
	
	@Test
	def void set_setNew() {
		val edited = createRootElement => [
			changeableSetRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a3"))
		assertTrue(result.changeableSetRef.valueExists("a2"))
	}
	
	@Test
	def void set_setExisting() {
		val edited = createRootElement => [
			changeableSetRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a3"))
		assertTrue(result.changeableSetRef.valueExists("a2"))
	}
	
	@Test
	def void list_listNew() {
		val edited = createRootElement => [
			changeableListRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("a2" == result.changeableListRef.get(1).changeableAttr)
	}
	
	@Test
	def void list_listExisting() {
		val edited = createRootElement => [
			changeableListRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("a2" == result.changeableListRef.get(1).changeableAttr)
	}

	@Test
	def void singleNull_bagEmpty() {
		val existing = createRootElement => [
			changeableBagRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(null, AElement_ChangeableBagRef)
		assertTrue(result.changeableBagRef.isEmpty)
	}
	
	@Test
	def void singleNull_bagNew() {
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(null, AElement_ChangeableBagRef)
		assertEquals(5, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("q1.337"))
		assertTrue(result.changeableBagRef.valueExists("q2.71"))
		assertTrue(result.changeableBagRef.valueExists("q31.337"))
	}
	
	@Test
	def void singleNull_setEmpty() {
		val existing = createRootElement => [
			changeableSetRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(null, AElement_ChangeableSetRef)
		assertTrue(result.changeableSetRef.isEmpty)
	}
	
	@Test
	def void singleNull_setNew() {
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(null, AElement_ChangeableSetRef)
		assertEquals(5, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("q1"))
		assertTrue(result.changeableSetRef.valueExists("q2"))
		assertTrue(result.changeableSetRef.valueExists("q31"))
	}
	
	@Test
	def void singleNull_listEmpty() {
		val existing = createRootElement => [
			changeableListRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(null, AElement_ChangeableListRef)
		assertTrue(result.changeableListRef.isEmpty)
	}
	
	@Test
	def void singleNull_listNew() {
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(null, AElement_ChangeableListRef)
		assertEquals(5, result.changeableListRef.size)
		assertTrue("q1" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(1).changeableAttr)
		assertTrue("q31" == result.changeableListRef.get(2).changeableAttr)
		assertTrue("q1" == result.changeableListRef.get(3).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(4).changeableAttr)
	}

	@Test
	def void singleNonNull_bagEmpty() {
		val existing = createRootElement => [
			changeableBagRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(newEdited(3, "3.14"), AElement_ChangeableBagRef)
		assertEquals(1, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
	}
	
	@Test
	def void singleNonNull_bagNew() {
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(newEdited(3, "3.14"), AElement_ChangeableBagRef)
		assertEquals(6, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("q1.337"))
		assertTrue(result.changeableBagRef.valueExists("q2.71"))
		assertTrue(result.changeableBagRef.valueExists("q31.337"))
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
	}
	
	@Test
	def void singleNonNull_bagExisting() {
		val edited = createRootElement => [
			changeableBagRef += newEdited(2, "2.71")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(4, "44"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(edited.changeableBagRef.head, AElement_ChangeableBagRef)
		assertEquals(5, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
		assertTrue(result.changeableBagRef.valueExists("q2.71"))
		assertTrue(result.changeableBagRef.valueExists("q1.337"))
		assertTrue(result.changeableBagRef.valueExists("q31.337"))
	}
	
	@Test
	def void singleNonNull_setEmpty() {
		val existing = createRootElement => [
			changeableSetRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(newEdited(3, "3"), AElement_ChangeableSetRef)
		assertEquals(1, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a3"))
	}
	
	@Test
	def void singleNonNull_setNew() {
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(newEdited(3, "3"), AElement_ChangeableSetRef)
		assertEquals(6, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("q1"))
		assertTrue(result.changeableSetRef.valueExists("q2"))
		assertTrue(result.changeableSetRef.valueExists("q31"))
		assertTrue(result.changeableSetRef.valueExists("a3"))
	}
	
	@Test
	def void singleNonNull_setExisting() {
		val edited = createRootElement => [
			changeableSetRef += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(4, "44"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(edited.changeableSetRef.head, AElement_ChangeableSetRef)
		assertEquals(5, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a3"))
		assertTrue(result.changeableSetRef.valueExists("q1"))
		assertTrue(result.changeableSetRef.valueExists("q2"))
		assertTrue(result.changeableSetRef.valueExists("q31"))
	}
	
	@Test
	def void singleNonNull_listEmpty() {
		val existing = createRootElement => [
			changeableListRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(newEdited(3, "3"), AElement_ChangeableListRef)
		assertEquals(1, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
	}
	
	@Test
	def void singleNonNull_listNew() {
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(newEdited(3, "3"), AElement_ChangeableListRef)
		assertEquals(6, result.changeableListRef.size)
		assertTrue("q1" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(1).changeableAttr)
		assertTrue("q31" == result.changeableListRef.get(2).changeableAttr)
		assertTrue("q1" == result.changeableListRef.get(3).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(4).changeableAttr)
		assertTrue("a3" == result.changeableListRef.get(5).changeableAttr)
	}

	@Test
	def void singleNonNull_listExisting() {
		val edited = createRootElement => [
			changeableListRef += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(edited.changeableListRef.head, AElement_ChangeableListRef)
		assertEquals(5, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(1).changeableAttr)
		assertTrue("q31" == result.changeableListRef.get(2).changeableAttr)
		assertTrue("q1" == result.changeableListRef.get(3).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(4).changeableAttr)
	}

	@Test
	def void set_bagEmpty() {
		val existing = createRootElement => [
			changeableBagRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(ImmutableSet::of(newEdited(3, "3.14"), newEdited(2, "2.71")), AElement_ChangeableBagRef)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
	}
	
	@Test
	def void set_bagPartiallyExisting() {
		val edited = createRootElement => [
			changeableBagRef += newEdited(3, "3.14")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(ImmutableSet::of(edited.changeableBagRef.head, newEdited(2, "2.71")), AElement_ChangeableBagRef)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
	}
	
	@Test
	def void set_listEmpty() {
		val existing = createRootElement => [
			changeableListRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(ImmutableSet::of(newEdited(3, "3"), newEdited(2, "2")), AElement_ChangeableListRef)
		assertEquals(2, result.changeableListRef.size)
		assertTrue(result.changeableListRef.valueExists("a3"))
		assertTrue(result.changeableListRef.valueExists("a2"))
	}
	
	@Test
	def void set_listPartiallyExisting() {
		val edited = createRootElement => [
			changeableListRef += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(ImmutableSet::of(edited.changeableListRef.head, newEdited(2, "2")), AElement_ChangeableListRef)
		assertEquals(2, result.changeableListRef.size)
		assertTrue(result.changeableListRef.valueExists("a3"))
		assertTrue(result.changeableListRef.valueExists("a2"))
	}

	@Test
	def void list_bagEmpty() {
		val existing = createRootElement => [
			changeableBagRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(#[newEdited(3, "3.14"), newEdited(2, "2.71")], AElement_ChangeableBagRef)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
	}
	
	@Test
	def void list_bagPartiallyExisting() {
		val edited = createRootElement => [
			changeableBagRef += newEdited(3, "3.14")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(#[edited.changeableBagRef.head, newEdited(2, "2.71")], AElement_ChangeableBagRef)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
	}
	
	@Test
	def void list_setEmpty() {
		val existing = createRootElement => [
			changeableSetRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(#[newEdited(3, "3"), newEdited(2, "2")], AElement_ChangeableSetRef)
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a3"))
		assertTrue(result.changeableSetRef.valueExists("a2"))
	}
	
	@Test
	def void list_setPartiallyExisting() {
		val edited = createRootElement => [
			changeableSetRef += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(#[edited.changeableSetRef.head, newEdited(2, "2")], AElement_ChangeableSetRef)
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a2"))
		assertTrue(result.changeableSetRef.valueExists("a3"))
	}
}
