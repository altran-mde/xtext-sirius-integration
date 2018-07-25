package com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import com.altran.general.integration.xtextsirius.model.test.emerger.TestEMergerReference
import org.junit.After
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerReferenceEditableFeatures extends TestEMergerReference {
	val EditableFeaturesExtension<Element> editableFeaturesExtension = new EditableFeaturesExtension(this)

	@After
	def checkUntouchedFeatures() {
		editableFeaturesExtension.checkUntouchedFeatures
	}
	
	override protected createEMerger(Element existing, Element edited) {
		editableFeaturesExtension.createEMerger(existing, edited)
	}
	
	@Test
	override singleNull_singleNew() {
		val edited = createRootElement => [
			changeableRef = null
		]
		
		val existing = createRootElement => [
			changeableRef = null
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableRef"}).merge(edited)
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
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableRef"}).merge(edited)
		assertNull(result.changeableRef)
	}
}
