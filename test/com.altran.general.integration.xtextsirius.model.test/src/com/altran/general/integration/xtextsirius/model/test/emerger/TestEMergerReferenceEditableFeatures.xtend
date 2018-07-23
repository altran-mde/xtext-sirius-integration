package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import org.junit.After
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerReferenceEditableFeatures extends TestEMergerReference {
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
			changeableRef = null
		]
		
		val existing = createElement => [
			changeableRef = null
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableRef"}).merge()
		assertNull(result.changeableRef)
	}
	
	@Test
	override singleNull_singleExisting() {
		val edited = createElement => [
			changeableRef = null
		]
		
		val existing = createElement => [
			changeableRef = newExisting(1, "")
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableRef"}).merge()
		assertNull(result.changeableRef)
	}
}
