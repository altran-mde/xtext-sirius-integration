/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import com.altran.general.integration.xtextsirius.model.test.emerger.TestEMergerCrossReference
import com.google.common.collect.ImmutableSet
import org.eclipse.emf.ecore.EStructuralFeature
import org.junit.After
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerCrossReferenceEditableFeatures extends TestEMergerCrossReference {
	val EditableFeaturesExtension<Element> editableFeaturesExtension = new EditableFeaturesExtension(this)

	@After
	def checkUntouchedFeatures() {
		editableFeaturesExtension.checkUntouchedFeatures
	}
	
	override protected createEMerger(Element existing, Element edited) {
		editableFeaturesExtension.createEMerger(existing, edited)
	}
	
	override protected createEMerger(Element existing, EStructuralFeature feature) {
		editableFeaturesExtension.createEMerger(existing, feature);
	}
	
	@Test
	override singleNull_singleNew() {
		val edited = createRootElement => [
			changeableRef = null
		]
		
		val existing = createRootElement => [
			changeableRef = null
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, ImmutableSet::of("changeableRef")).merge(edited)
		assertNull(result.changeableRef)
	}
	
	@Test
	override singleNull_singleExisting() {
		val edited = createRootElement => [
			changeableRef = null
		]
		
		val existing = createRootElement => [
			changeableRef = newExisting(1, "")
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, ImmutableSet::of("changeableRef")).merge(edited)
		assertNull(result.changeableRef)
	}
}
