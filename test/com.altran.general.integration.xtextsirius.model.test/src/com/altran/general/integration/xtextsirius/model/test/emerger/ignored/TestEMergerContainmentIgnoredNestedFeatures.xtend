/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger.ignored

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerContainment
import com.altran.general.integration.xtextsirius.runtime.util.EMerger
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.junit.After
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerContainmentIgnoredNestedFeatures extends ATestEMergerContainment<Element> {
	int i = 100
	protected Element existing
	protected Set<String> nestedFeaturesToIgnore = XtextSiriusTestPackage.Literals::ELEMENT.EAllStructuralFeatures
			.map[feature | 
				XtextSiriusTestPackage.Literals::ELEMENT.EAllStructuralFeatures
				.filter[name != "changeableAttr"]
				.map[feature.name + "." + name]
			]
			.flatten
			.toSet

	override protected createEMerger(Element existing, Element edited) {
		this.existing = existing
		
		new EMerger(createDescriptor(emptySet, nestedFeaturesToIgnore), existing, URI.createURI("resourceName.xmi#/42"))
	}
	
	
	override protected createEMerger(Element existing, EStructuralFeature feature) {
		this.existing = existing
		
		new EMerger(createDescriptor(emptySet, nestedFeaturesToIgnore), existing, URI.createURI("resourceName.xmi#/42"))
	}
	
	@After
	def void checkIgnoredNestedFeatures() {
		assertNotNull(existing)
		
		EcoreUtil.getAllContents(existing, false)
		.filter(Element)
		.forEach[
			assertTrue(changeableBagAttr.isEmpty)
			assertTrue(changeableBagRef.isEmpty)
			assertNull(changeableCont)
			// purposely excluded (see singleNonNull_singleExisting())
			// assertTrue(changeableListAttr.isEmpty)
			assertTrue(changeableListAttr.contains("aaa"))
			assertTrue(changeableListAttr.contains("bbb"))
			assertTrue(changeableListRef.isEmpty)
			assertNull(changeableRef)
			assertTrue(changeableSetAttr.isEmpty)
			assertTrue(changeableSetCont.isEmpty)
			assertTrue(changeableSetRef.isEmpty)
			assertTrue(changeableUniqueListCont.isEmpty)
		]
	}
	
	@Test
	override singleNonNull_singleExisting() {
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
	override singleNonNull_singleNew() {
		val edited = createRootElement => [
			changeableCont = newEdited(1, "answer") => [
				changeableListAttr += "ccc"
			]
		]
		
		val existing = createRootElement => [
			changeableCont = null
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNotNull(result.changeableCont)
		assertEquals("aanswer", result.changeableCont.changeableAttr)
		assertFalse(result.changeableCont.changeableListAttr.contains("bbb"))
		
		// to satisfy @After test
		result.changeableCont.changeableListAttr += #["aaa", "bbb"]
	}
	
	@Test
	override void singleNonNull_singleNew_deep() {
		val edited = createRootElement => [
			changeableCont = createRootElement => [
				changeableAttr = "aanswer"
				changeableCont = createRootElement => [
					changeableAttr = "amegaAnswer"
					changeableListAttr += "ddd"
				]
				changeableListAttr += "ccc"
			]
		]
		
		val existing = createRootElement => [
			changeableCont = newExisting(1, "question")
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNotNull(result.changeableCont)
		assertEquals("aanswer", result.changeableCont.changeableAttr)
		assertFalse(result.changeableCont.changeableListAttr.contains("ccc"))
		assertNull("amegaAnswer", result.changeableCont.changeableCont)

		// to satisfy @After test
		result.changeableCont.changeableListAttr += #["aaa", "bbb"]
	}

	@Test
	def void singleNonNull_listNew() {
		val newValue = createRootElement => [
			changeableAttr = "a3"
			changeableListAttr += #["aaa", "bbb"]
			changeableCont = newEdited(33, "33")
		]
		
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableUniqueListCont).merge(newValue, AElement_ChangeableUniqueListCont)
		assertEquals(6, result.changeableUniqueListCont.size)
		assertTrue("q1" == result.changeableUniqueListCont.get(0).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(1).changeableAttr)
		assertTrue("q31" == result.changeableUniqueListCont.get(2).changeableAttr)
		assertTrue("q1" == result.changeableUniqueListCont.get(3).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(4).changeableAttr)
		assertTrue("a3" == result.changeableUniqueListCont.get(5).changeableAttr)
		assertTrue(result.changeableUniqueListCont.get(5).changeableCont.changeableUniqueListCont.isEmpty)
		
		//satisfy @After asserts
		result.changeableUniqueListCont.get(5).changeableCont = null
	}
	
	override protected newEdited(int id, String attrValue) {
		val result = createRootElement => [
			changeableAttr = "a" + attrValue
			changeableBagAttr += #[2.71, 3.14]
			changeableBagRef += #[newDummyElement, newDummyElement]
			changeableCont = newDummyElement
			changeableListAttr += #["2.71", "3.14"]
			changeableListRef += #[newDummyElement, newDummyElement]
			changeableRef = newDummyElement
			changeableSetAttr += #[2, 3]
			changeableSetCont += #[newDummyElement, newDummyElement]
			changeableSetRef += #[newDummyElement, newDummyElement]
			changeableUniqueListCont += #[newDummyElement, newDummyElement]
		]

		this.editedResource.contents += result
		return result
	}
	
	override protected newExisting(int id, String attrValue) {
		super.newExisting(id, attrValue) => [
			changeableListAttr += #["aaa", "bbb"]
		]
	}
	
	private def newDummyElement() {
		newElement(i, "untouched" + i++)
	}
		
}
