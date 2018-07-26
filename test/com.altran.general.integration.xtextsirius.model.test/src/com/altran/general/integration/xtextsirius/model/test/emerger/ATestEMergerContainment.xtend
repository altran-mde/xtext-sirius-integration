package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
import org.junit.Test

import static org.junit.Assert.*

abstract class ATestEMergerContainment<T extends IElement<T>> extends ATestEMergerEReference<T> {
	@Test
	def void singleNull_singleNew() {
		val edited = createRootElement => [
			changeableCont = null
		]
		
		val existing = createRootElement => [
			changeableCont = null
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNull(result.changeableCont)
	}
	
	@Test
	def void singleNull_singleExisting() {
		val edited = createRootElement => [
			changeableCont = null
		]
		
		val existing = createRootElement => [
			changeableCont = newExisting(1, "")
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNull(result.changeableCont)
	}
	
	@Test
	def void singleNonNull_singleNew() {
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
		assertTrue(result.changeableCont.changeableListAttr.contains("ccc"))
	}
	
	@Test
	def void singleNonNull_singleNew_deep() {
		val edited = createRootElement => [
			changeableCont = newEdited(1, "answer") => [
				changeableCont = newEdited(2, "megaAnswer") => [
					changeableListAttr += "ddd"
				]
				changeableListAttr += "ccc"
			]
		]
		
		val existing = createRootElement => [
			changeableCont = newEdited(1, "question")
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNotNull(result.changeableCont)
		assertEquals("aanswer", result.changeableCont.changeableAttr)
		assertTrue(result.changeableCont.changeableListAttr.contains("ccc"))
		assertEquals("amegaAnswer", result.changeableCont.changeableCont.changeableAttr)
		assertTrue(result.changeableCont.changeableCont.changeableListAttr.contains("ddd"))
	}
	
	@Test
	def void singleNonNull_singleExisting() {
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
		assertTrue(result.changeableListAttr.isEmpty)
	}
	
	@Test
	def void set_setNew() {
		val edited = createRootElement => [
			changeableSetCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(3, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("a3"))
		assertTrue(result.changeableSetCont.valueExists("a2"))
		assertTrue(result.changeableSetCont.valueExists("q1"))
	}
	
	@Test
	def void set_setExisting() {
		val edited = createRootElement => [
			changeableSetCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(5, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("a3"))
		assertTrue(result.changeableSetCont.valueExists("a2"))
		assertTrue(result.changeableSetCont.valueExists("q1"))
		assertTrue(result.changeableSetCont.valueExists("q31"))
		assertTrue(result.changeableSetCont.valueExists("q2"))
	}
	
	@Test
	def void list_listNew() {
		val edited = createRootElement => [
			changeableUniqueListCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(3, result.changeableUniqueListCont.size)
		assertEquals("a3", result.changeableUniqueListCont.get(0).changeableAttr)
		assertEquals("a2", result.changeableUniqueListCont.get(1).changeableAttr)
		assertEquals("q1", result.changeableUniqueListCont.get(2).changeableAttr)
	}
	
	@Test
	def void list_listExisting() {
		val edited = createRootElement => [
			changeableUniqueListCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(5, result.changeableUniqueListCont.size)
		assertEquals("a3", result.changeableUniqueListCont.get(0).changeableAttr)
		assertEquals("a2", result.changeableUniqueListCont.get(1).changeableAttr)
		assertEquals("q31", result.changeableUniqueListCont.get(2).changeableAttr)
		assertEquals("q1", result.changeableUniqueListCont.get(3).changeableAttr)
		assertEquals("q2", result.changeableUniqueListCont.get(4).changeableAttr)
	}
}