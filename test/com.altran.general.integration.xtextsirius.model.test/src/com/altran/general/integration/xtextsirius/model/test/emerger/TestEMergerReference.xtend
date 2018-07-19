package com.altran.general.integration.xtextsirius.model.test.emerger

import org.junit.Test

import static org.junit.Assert.*

class TestEMergerReference extends ATestEMergerEReference {
	@Test
	def void singleNull_singleNew() {
		val edited = createElement => [
			changeableRef = null
		]
		
		val existing = createElement => [
			changeableRef = null
		]
		
		val result = createEMerger(existing, edited).merge()
		assertNull(result.changeableRef)
	}
	
	@Test
	def void singleNull_singleExisting() {
		val edited = createElement => [
			changeableRef = null
		]
		
		val existing = createElement => [
			changeableRef = newExisting(1, "")
		]
		
		val result = createEMerger(existing, edited).merge()
		assertNull(result.changeableRef)
	}
	
	@Test
	def void singleNonNull_singleNew() {
		val edited = createElement => [
			changeableRef = newEdited(1, "answer")
		]
		
		val existing = createElement => [
			changeableRef = null
		]
		
		val result = createEMerger(existing, edited).merge()
		assertNotNull(result.changeableRef)
		assertEquals("aanswer", result.changeableRef.changeableAttr)
	}
	
	@Test
	def void singleNonNull_singleExisting() {
		val edited = createElement => [
			changeableRef = newEdited(1, "answer")
		]
		
		val existing = createElement => [
			changeableRef = newExisting(1, "question")
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals("aanswer", result.changeableRef.changeableAttr)
	}
	
	@Test
	def void bag_bagNew() {
		val edited = createElement => [
			changeableBagRef += #[newEdited(3, "3.14"), newEdited(2, "2.71")]
		]
		
		val existing = createElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(31, "31.337"), newExisting(1, "1.337")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.exists("a3.14"))
		assertTrue(result.changeableBagRef.exists("a2.71"))
	}
	
	@Test
	def void bag_bagExisting() {
		val edited = createElement => [
			changeableBagRef += #[newEdited(3, "3.14"), newEdited(2, "2.71")]
		]
		
		val existing = createElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.exists("a3.14"))
		assertTrue(result.changeableBagRef.exists("a2.71"))
	}
	
	@Test
	def void set_setNew() {
		val edited = createElement => [
			changeableSetRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.exists("a3"))
		assertTrue(result.changeableSetRef.exists("a2"))
	}
	
	@Test
	def void set_setExisting() {
		val edited = createElement => [
			changeableSetRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.exists("a3"))
		assertTrue(result.changeableSetRef.exists("a2"))
	}
	
	@Test
	def void list_listNew() {
		val edited = createElement => [
			changeableListRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(2, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("a2" == result.changeableListRef.get(1).changeableAttr)
	}
	
	@Test
	def void list_listExisting() {
		val edited = createElement => [
			changeableListRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge()
		assertEquals(2, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("a2" == result.changeableListRef.get(1).changeableAttr)
	}
}
