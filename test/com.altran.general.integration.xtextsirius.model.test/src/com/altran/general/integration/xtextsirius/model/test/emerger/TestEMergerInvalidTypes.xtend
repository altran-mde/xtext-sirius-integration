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
import org.eclipse.emf.ecore.EcoreFactory

class TestEMergerInvalidTypes extends ATestEMerger<Element> {
	
	@Test(expected=ClassCastException)
	def void singleAttr_single() {
		createEMerger(createRootElement, IElement_ChangeableAttr).merge(42, IElement_ChangeableAttr)
	}
	
	@Test(expected=IllegalStateException)
	def void singleAttr_multi() {
		createEMerger(createRootElement, IElement_ChangeableAttr).merge(#["aaa", "bbb"], IElement_ChangeableAttr)
	}
	
	@Test(expected=ClassCastException)
	def void multiAttr_single() {
		createEMerger(createRootElement, IElement_ChangeableListAttr).merge(42, IElement_ChangeableListAttr)
	}
	
	@Test(expected=ClassCastException)
	def void multiAttr_multi() {
		createEMerger(createRootElement, IElement_ChangeableListAttr).merge(#[EcoreFactory.eINSTANCE.createEDataType, 42], IElement_ChangeableListAttr)
	}
	
	@Test(expected=ClassCastException)
	def void singleRef_single() {
		createEMerger(createRootElement, AElement_ChangeableRef).merge(42, AElement_ChangeableRef)
	}
	
	@Test(expected=IllegalStateException)
	def void singleRef_multi() {
		createEMerger(createRootElement, AElement_ChangeableRef).merge(#[newElement(1, "1"), newElement(2, "2")], AElement_ChangeableRef)
	}
	
	@Test(expected=ClassCastException)
	def void multiRef_single() {
		createEMerger(createRootElement, AElement_ChangeableListRef).merge(42, AElement_ChangeableListRef)
	}
	
	@Test(expected=ClassCastException)
	def void multiRef_multi() {
		createEMerger(createRootElement, AElement_ChangeableListRef).merge(#[EcoreFactory.eINSTANCE.createEDataType, 42], AElement_ChangeableListRef)
	}
	
	@Test(expected=ClassCastException)
	def void singleCont_single() {
		createEMerger(createRootElement, AElement_ChangeableCont).merge(42, AElement_ChangeableCont)
	}
	
	@Test(expected=IllegalStateException)
	def void singleCont_multi() {
		createEMerger(createRootElement, AElement_ChangeableCont).merge(#[newElement(1, "1"), newElement(2, "2")], AElement_ChangeableCont)
	}
	
	@Test(expected=ClassCastException)
	def void multiCont_single() {
		createEMerger(createRootElement, AElement_ChangeableUniqueListCont).merge(42, AElement_ChangeableUniqueListCont)
	}
	
	@Test(expected=ClassCastException)
	def void multiCont_multi() {
		createEMerger(createRootElement, AElement_ChangeableUniqueListCont).merge(#[EcoreFactory.eINSTANCE.createEDataType, 42], AElement_ChangeableUniqueListCont)
	}
}
