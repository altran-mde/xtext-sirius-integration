package com.altran.general.integration.xtextsirius.model.test.emerger

import org.junit.Test

import static org.junit.Assert.*

class TestEMergerContainmentId extends ATestEMergerEReferenceId {
	@Test
	def void singleNull_singleNew() {
		val edited = createElement => [
			changeableCont = null
		]
		
		val existing = createElement => [
			changeableCont = null
		]
		
		val result = createEMerger(existing, edited).merge()
		assertNull(result.changeableCont)
	}
	
	@Test
	def void singleNull_singleExisting() {
		val edited = createElement => [
			changeableCont = null
		]
		
		val existing = createElement => [
			changeableCont = newExisting(1, "")
		]
		
		val result = createEMerger(existing, edited).merge()
		assertNull(result.changeableCont)
	}
	
	@Test
	def void singleNonNull_singleNew() {
		val edited = createElement => [
			changeableCont = newEdited(1, "answer")
		]
		
		val existing = createElement => [
			changeableCont = null
		]
		
		val result = createEMerger(existing, edited).merge()
		assertNotNull(result.changeableCont)
		assertEquals("aanswer", result.changeableCont.changeableAttr)
	}
	
	@Test
	def void singleNonNull_singleExisting() {
		val edited = createElement => [
			changeableCont = newEdited(1, "answer")
		]
		
		val existing = createElement => [
			changeableCont = newExisting(1, "question")
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals("aanswer", result.changeableCont.changeableAttr)
	}
	
	@Test
	def void set_setNew() {
		val edited = createElement => [
			changeableSetCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(5, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.exists("q1"))
		assertTrue(result.changeableSetCont.exists("q31"))
		assertTrue(result.changeableSetCont.exists("a3"))
		assertTrue(result.changeableSetCont.exists("a2"))
	}
	
	@Test
	def void set_setExisting() {
		val edited = createElement => [
			changeableSetCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(6, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.exists("q1"))
		assertTrue(result.changeableSetCont.exists("a2"))
		assertTrue(result.changeableSetCont.exists("q31"))
		assertTrue(result.changeableSetCont.exists("a3"))
	}
	
	@Test
	def void list_listNew() {
		val edited = createElement => [
			changeableUniqueListCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(5, result.changeableUniqueListCont.size)
		assertEquals("q1", result.changeableUniqueListCont.get(0).changeableAttr)
		assertEquals("q31", result.changeableUniqueListCont.get(1).changeableAttr)
		assertEquals("q1", result.changeableUniqueListCont.get(2).changeableAttr)
		assertEquals("a3", result.changeableUniqueListCont.get(3).changeableAttr)
		assertEquals("a2", result.changeableUniqueListCont.get(4).changeableAttr)
	}
	
	@Test
	def void list_listExisting() {
		val edited = createElement => [
			changeableUniqueListCont += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(6, result.changeableUniqueListCont.size)
		assertEquals("q1", result.changeableUniqueListCont.get(0).changeableAttr)
		assertEquals("a2", result.changeableUniqueListCont.get(1).changeableAttr)
		assertEquals("q31", result.changeableUniqueListCont.get(2).changeableAttr)
		assertEquals("q1", result.changeableUniqueListCont.get(3).changeableAttr)
		assertEquals("q2", result.changeableUniqueListCont.get(4).changeableAttr)
		assertEquals("a3", result.changeableUniqueListCont.get(5).changeableAttr)
	}
}
