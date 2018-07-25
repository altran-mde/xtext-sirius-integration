package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerEAttribute extends ATestEMerger<Element> {
	@Test
	def void singleNull_singleNew() {
		val edited = createRootElement => [
			changeableAttr = null
		]
		
		val existing = createRootElement => [
			changeableAttr = null
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNull(result.changeableAttr)
	}
	
	@Test
	def void singleNull_singleExisting() {
		val edited = createRootElement => [
			changeableAttr = null
		]
		
		val existing = createRootElement => [
			changeableAttr = "Hello"
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNull(result.changeableAttr)
	}
	
	@Test
	def void singleNonNull_singleNew() {
		val edited = createRootElement => [
			changeableAttr = "Hi"
		]
		
		val existing = createRootElement => [
			changeableAttr = null
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals("Hi", result.changeableAttr)
	}
	
	@Test
	def void singleNonNull_singleExisting() {
		val edited = createRootElement => [
			changeableAttr = "Greetings"
		]
		
		val existing = createRootElement => [
			changeableAttr = "Hello"
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals("Greetings", result.changeableAttr)
	}
	
	@Test
	def void bag_bagNew() {
		val edited = createRootElement => [
			changeableBagAttr += #[3.14, 2.71]
		]
		
		val existing = createRootElement => [
			changeableBagAttr += #[1.337, 31.337, 1.337]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(5, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(3.14))
		assertTrue(result.changeableBagAttr.contains(2.71))
		assertTrue(result.changeableBagAttr.contains(1.337))
		assertTrue(result.changeableBagAttr.contains(31.337))
	}
	
	@Test
	def void bag_bagExisting() {
		val edited = createRootElement => [
			changeableBagAttr += #[3.14, 2.71]
		]
		
		val existing = createRootElement => [
			changeableBagAttr += #[1.337, 2.71, 31.337, 1.337, 2.71]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(6, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(3.14))
		assertTrue(result.changeableBagAttr.contains(2.71))
		assertTrue(result.changeableBagAttr.contains(1.337))
		assertTrue(result.changeableBagAttr.contains(31.337))
	}
	
	@Test
	def void set_setNew() {
		val edited = createRootElement => [
			changeableSetAttr += #[3, 2]
		]
		
		val existing = createRootElement => [
			changeableSetAttr += #[1, 31, 1]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(4, result.changeableSetAttr.size)
		assertTrue(result.changeableSetAttr.contains(3))
		assertTrue(result.changeableSetAttr.contains(2))
		assertTrue(result.changeableSetAttr.contains(1))
		assertTrue(result.changeableSetAttr.contains(31))
	}
	
	@Test
	def void set_setExisting() {
		val edited = createRootElement => [
			changeableSetAttr += #[3, 2]
		]
		
		val existing = createRootElement => [
			changeableSetAttr += #[1, 2, 31, 1, 2]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(4, result.changeableSetAttr.size)
		assertTrue(result.changeableSetAttr.contains(3))
		assertTrue(result.changeableSetAttr.contains(2))
		assertTrue(result.changeableSetAttr.contains(1))
		assertTrue(result.changeableSetAttr.contains(31))
	}
	
	@Test
	def void list_listNew() {
		val edited = createRootElement => [
			changeableListAttr += #["3", "2"]
		]
		
		val existing = createRootElement => [
			changeableListAttr += #["1", "31", "1"]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(5, result.changeableListAttr.size)
		assertEquals("1", result.changeableListAttr.get(0))
		assertEquals("31", result.changeableListAttr.get(1))
		assertEquals("1", result.changeableListAttr.get(2))
		assertEquals("3", result.changeableListAttr.get(3))
		assertEquals("2", result.changeableListAttr.get(4))
	}
	
	@Test
	def void list_listExisting() {
		val edited = createRootElement => [
			changeableListAttr += #["3", "2"]
		]
		
		val existing = createRootElement => [
			changeableListAttr += #["1", "2", "31", "1", "2"]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(6, result.changeableListAttr.size)
		assertEquals("1", result.changeableListAttr.get(0))
		assertEquals("2", result.changeableListAttr.get(1))
		assertEquals("31", result.changeableListAttr.get(2))
		assertEquals("1", result.changeableListAttr.get(3))
		assertEquals("2", result.changeableListAttr.get(4))
		assertEquals("3", result.changeableListAttr.get(5))
	}
}
