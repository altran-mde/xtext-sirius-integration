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
import org.junit.Test

import static org.junit.Assert.*

abstract class ATestEMergerContainmentIdentity<T extends IElement<T>> extends ATestEMergerContainmentMixed<T>  {
	@Test
	override void singleNonNull_singleExisting() {
		val edited = createRootElement => [
			changeableCont = newEdited(1, "answer")
		]
		
		val existing = createRootElement => [
			changeableCont = newExisting(1, "question") => [
				changeableListAttr += #["aaa", "bbb"]
			]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals("aanswer", result.changeableCont.changeableAttr)
		assertTrue(result.changeableCont.changeableListAttr.contains("aaa"))
		assertTrue(result.changeableCont.changeableListAttr.contains("bbb"))
	}
	
	@Test
	override void set_setExisting() {
		val edited = createRootElement => [
			changeableSetCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("a2"))
		assertTrue(result.changeableSetCont.valueExists("q1"))
	}
	
	@Test
	override void list_listNew() {
		val edited = createRootElement => [
			changeableUniqueListCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableUniqueListCont.size)
		assertEquals("q1", result.changeableUniqueListCont.get(0).changeableAttr)
		assertEquals("q31", result.changeableUniqueListCont.get(1).changeableAttr)
	}
	
	@Test
	override void list_listExisting() {
		val edited = createRootElement => [
			changeableUniqueListCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableUniqueListCont.size)
		assertEquals("q1", result.changeableUniqueListCont.get(0).changeableAttr)
		assertEquals("a2", result.changeableUniqueListCont.get(1).changeableAttr)
	}

	@Test
	override void singleNonNull_setExisting() {
		val edited = createRootElement => [
			changeableSetCont += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(3, "4"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableSetContFeature).merge(edited.changeableSetCont.head, changeableSetContFeature)
		assertEquals(5, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("a3"))
		assertTrue(result.changeableSetCont.valueExists("q1"))
		assertTrue(result.changeableSetCont.valueExists("q2"))
		assertTrue(result.changeableSetCont.valueExists("q31"))
	}
	
	@Test
	override void singleNonNull_listExisting() {
		val edited = createRootElement => [
			changeableUniqueListCont += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(3, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableUniqueListContFeature).merge(edited.changeableUniqueListCont.head, changeableUniqueListContFeature)
		assertEquals(5, result.changeableUniqueListCont.size)
		assertTrue("a3" == result.changeableUniqueListCont.get(0).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(1).changeableAttr)
		assertTrue("q31" == result.changeableUniqueListCont.get(2).changeableAttr)
		assertTrue("q1" == result.changeableUniqueListCont.get(3).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(4).changeableAttr)
	}
}
