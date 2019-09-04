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

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerContainment extends ATestEMergerContainmentMixed<Element> {
	override Element newElement(int id, String attrValue) {
		super.newElement(id, attrValue) as Element
	}

	@Test
	override void set_listPartiallyExisting() {
		val edited = createRootElement => [
			changeableUniqueListCont += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableUniqueListContFeature).merge(#{edited.changeableUniqueListCont.head, newEdited(2, "2")}, changeableUniqueListContFeature)
		val list = result.changeableUniqueListCont
		assertEquals(2, list.size)
		assertTrue(list.renderList, list.valueExists("a3"))
		assertTrue(list.renderList, list.valueExists("a2"))
	}

	@Test
	override void list_setPartiallyExisting() {
		val edited = createRootElement => [
			changeableSetCont += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableSetContFeature).merge(#[edited.changeableSetCont.head, newEdited(2, "2")], changeableSetContFeature)
		assertEquals(2, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("a3"))
		assertTrue(result.changeableSetCont.valueExists("a2"))
	}
	
}
