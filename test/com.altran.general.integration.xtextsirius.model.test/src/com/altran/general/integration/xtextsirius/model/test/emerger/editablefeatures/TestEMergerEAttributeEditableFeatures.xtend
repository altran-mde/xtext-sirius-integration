package com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import com.altran.general.integration.xtextsirius.model.test.emerger.TestEMergerEAttribute
import org.eclipse.emf.ecore.EStructuralFeature
import org.junit.After
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerEAttributeEditableFeatures extends TestEMergerEAttribute {
	val EditableFeaturesExtension<Element> editableFeaturesExtension = new EditableFeaturesExtension(this)

	@After
	def checkUntouchedFeatures() {
		editableFeaturesExtension.checkUntouchedFeatures
	}
	
	override protected createEMerger(Element existing, Element edited) {
		editableFeaturesExtension.createEMerger(existing, edited)
	}
	
	override protected createEMerger(Element existing, EStructuralFeature feature) {
		editableFeaturesExtension.createEMerger(existing, feature)
	}
	
	@Test
	override singleNull_singleNew() {
		val edited = createRootElement => [
			changeableAttr = null
		]
		
		val existing = createRootElement => [
			changeableAttr = null
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableAttr"}).merge(edited)
		assertNull(result.changeableAttr)
	}
	
	@Test
	override singleNull_singleExisting() {
		val edited = createRootElement => [
			changeableAttr = null
		]
		
		val existing = createRootElement => [
			changeableAttr = "Hello"
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableAttr"}).merge(edited)
		assertNull(result.changeableAttr)
	}
}
