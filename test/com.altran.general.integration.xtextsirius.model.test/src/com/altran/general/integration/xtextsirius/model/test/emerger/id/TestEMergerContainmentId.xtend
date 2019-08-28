/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger.id

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerContainmentIdentity
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerContainmentId extends ATestEMergerContainmentIdentity<IdElement> {
	override newElement(int requestedId, String attrValue) {
		createIdElement  => [
			id = "id" + requestedId
			changeableAttr = attrValue
		]
	}
	
	override protected createRootElement() {
		createIdElement
	}

	@Test
	override void set_setNew() {
		val edited = createRootElement => [
			changeableSetCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("q1"))
		assertTrue(result.changeableSetCont.valueExists("q31"))
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
		assertEquals(2, result.changeableUniqueListCont.size)
		assertTrue(result.changeableUniqueListCont.valueExists("q1"))
		assertTrue(result.changeableUniqueListCont.valueExists("a2"))
	}
}
