package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import org.junit.After
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerEAttributeEditableFeatures extends TestEMergerEAttribute {
	val EditableFeaturesExtension editableFeaturesExtension = new EditableFeaturesExtension(this)

	@After
	def checkUntouchedFeatures() {
		editableFeaturesExtension.checkUntouchedFeatures
	}
	
	override protected createEMerger(Element existing, Element edited) {
		editableFeaturesExtension.createEMerger(existing, edited)
	}
	
	@Test
	override singleNull_singleNew() {
		val edited = createElement => [
			changeableAttr = null
		]
		
		val existing = createElement => [
			changeableAttr = null
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableAttr"}).merge()
		assertNull(result.changeableAttr)
	}
	
	@Test
	override singleNull_singleExisting() {
		val edited = createElement => [
			changeableAttr = null
		]
		
		val existing = createElement => [
			changeableAttr = "Hello"
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableAttr"}).merge()
		assertNull(result.changeableAttr)
	}
}
