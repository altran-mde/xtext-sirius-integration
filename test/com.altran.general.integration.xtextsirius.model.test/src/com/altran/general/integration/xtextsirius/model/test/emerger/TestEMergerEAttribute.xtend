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
	
	@Test
	def void singleNull_bagEmpty() {
		val existing = createRootElement => [
			changeableBagAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableBagAttr).merge(null, IElement_ChangeableBagAttr)
		assertTrue(result.changeableBagAttr.isEmpty)
	}
	
	@Test
	def void singleNull_bagNew() {
		val existing = createRootElement => [
			changeableBagAttr += #[1.337, 2.71, 31.337, 1.337, 2.71]
		]
		
		val result = createEMerger(existing, IElement_ChangeableBagAttr).merge(null, IElement_ChangeableBagAttr)
		assertEquals(5, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(1.337))
		assertTrue(result.changeableBagAttr.contains(2.71))
		assertTrue(result.changeableBagAttr.contains(31.337))
	}
	
	@Test
	def void singleNull_setEmpty() {
		val existing = createRootElement => [
			changeableSetAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableSetAttr).merge(null, IElement_ChangeableSetAttr)
		assertTrue(result.changeableSetAttr.isEmpty)
	}
	
	@Test
	def void singleNull_setNew() {
		val existing = createRootElement => [
			changeableSetAttr += #[1, 2, 31, 1, 2]
		]
		
		val result = createEMerger(existing, IElement_ChangeableSetAttr).merge(null, IElement_ChangeableSetAttr)
		assertEquals(3, result.changeableSetAttr.size)
		assertTrue(result.changeableSetAttr.contains(1))
		assertTrue(result.changeableSetAttr.contains(2))
		assertTrue(result.changeableSetAttr.contains(31))
	}
	
	@Test
	def void singleNull_listEmpty() {
		val existing = createRootElement => [
			changeableListAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableListAttr).merge(null, IElement_ChangeableListAttr)
		assertTrue(result.changeableListAttr.isEmpty)
	}
	
	@Test
	def void singleNull_listNew() {
		val existing = createRootElement => [
			changeableListAttr += #["1", "2", "31", "1", "2"]
		]
		
		val result = createEMerger(existing, IElement_ChangeableListAttr).merge(null, IElement_ChangeableListAttr)
		assertEquals(5, result.changeableListAttr.size)
		assertEquals("1", result.changeableListAttr.get(0))
		assertEquals("2", result.changeableListAttr.get(1))
		assertEquals("31", result.changeableListAttr.get(2))
		assertEquals("1", result.changeableListAttr.get(3))
		assertEquals("2", result.changeableListAttr.get(4))
	}

	@Test
	def void singleNonNull_bagEmpty() {
		val existing = createRootElement => [
			changeableBagAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableBagAttr).merge(3.14, IElement_ChangeableBagAttr)
		assertEquals(1, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(3.14))
	}
	
	@Test
	def void singleNonNull_bagNew() {
		val existing = createRootElement => [
			changeableBagAttr += #[1.337, 2.71, 31.337, 1.337, 2.71]
		]
		
		val result = createEMerger(existing, IElement_ChangeableBagAttr).merge(3.14, IElement_ChangeableBagAttr)
		assertEquals(6, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(1.337))
		assertTrue(result.changeableBagAttr.contains(2.71))
		assertTrue(result.changeableBagAttr.contains(31.337))
		assertTrue(result.changeableBagAttr.contains(3.14))
	}
	
	@Test
	def void singleNonNull_bagExisting() {
		val existing = createRootElement => [
			changeableBagAttr += #[1.337, 2.71, 31.337, 1.337, 2.71]
		]
		
		val result = createEMerger(existing, IElement_ChangeableBagAttr).merge(2.71, IElement_ChangeableBagAttr)
		assertEquals(5, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(1.337))
		assertTrue(result.changeableBagAttr.contains(2.71))
		assertTrue(result.changeableBagAttr.contains(31.337))
	}
	
	@Test
	def void singleNonNull_setEmpty() {
		val existing = createRootElement => [
			changeableSetAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableSetAttr).merge(3, IElement_ChangeableSetAttr)
		assertEquals(1, result.changeableSetAttr.size)
		assertTrue(result.changeableSetAttr.contains(3))
	}
	
	@Test
	def void singleNonNull_setNew() {
		val existing = createRootElement => [
			changeableSetAttr += #[1, 2, 31, 1, 2]
		]
		
		val result = createEMerger(existing, IElement_ChangeableSetAttr).merge(3, IElement_ChangeableSetAttr)
		assertEquals(4, result.changeableSetAttr.size)
		assertTrue(result.changeableSetAttr.contains(1))
		assertTrue(result.changeableSetAttr.contains(2))
		assertTrue(result.changeableSetAttr.contains(31))
		assertTrue(result.changeableSetAttr.contains(3))
	}
	
	@Test
	def void singleNonNull_setExisting() {
		val existing = createRootElement => [
			changeableSetAttr += #[1, 2, 31, 1, 2]
		]
		
		val result = createEMerger(existing, IElement_ChangeableSetAttr).merge(2, IElement_ChangeableSetAttr)
		assertEquals(3, result.changeableSetAttr.size)
		assertTrue(result.changeableSetAttr.contains(1))
		assertTrue(result.changeableSetAttr.contains(2))
		assertTrue(result.changeableSetAttr.contains(31))
	}
	
	@Test
	def void singleNonNull_listEmpty() {
		val existing = createRootElement => [
			changeableListAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableListAttr).merge("3", IElement_ChangeableListAttr)
		assertEquals(1, result.changeableListAttr.size)
		assertEquals("3", result.changeableListAttr.get(0))
	}
	
	@Test
	def void singleNonNull_listNew() {
		val existing = createRootElement => [
			changeableListAttr += #["1", "2", "31", "1", "2"]
		]
		
		val result = createEMerger(existing, IElement_ChangeableListAttr).merge("3", IElement_ChangeableListAttr)
		assertEquals(6, result.changeableListAttr.size)
		assertEquals("1", result.changeableListAttr.get(0))
		assertEquals("2", result.changeableListAttr.get(1))
		assertEquals("31", result.changeableListAttr.get(2))
		assertEquals("1", result.changeableListAttr.get(3))
		assertEquals("2", result.changeableListAttr.get(4))
		assertEquals("3", result.changeableListAttr.get(5))
	}

	@Test
	def void singleNonNull_listExisting() {
		val existing = createRootElement => [
			changeableListAttr += #["1", "2", "31", "1", "2"]
		]
		
		val result = createEMerger(existing, IElement_ChangeableListAttr).merge("2", IElement_ChangeableListAttr)
		assertEquals(5, result.changeableListAttr.size)
		assertEquals("1", result.changeableListAttr.get(0))
		assertEquals("2", result.changeableListAttr.get(1))
		assertEquals("31", result.changeableListAttr.get(2))
		assertEquals("1", result.changeableListAttr.get(3))
		assertEquals("2", result.changeableListAttr.get(4))
	}

	@Test
	def void set_bagEmpty() {
		val existing = createRootElement => [
			changeableBagAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableBagAttr).merge(#{3.14, 2.71}, IElement_ChangeableBagAttr)
		assertEquals(2, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(3.14))
		assertTrue(result.changeableBagAttr.contains(2.71))
	}
	
	@Test
	def void set_bagPartiallyExisting() {
		val existing = createRootElement => [
			changeableBagAttr += #[1.337, 2.71, 31.337, 1.337, 2.71]
		]
		
		val result = createEMerger(existing, IElement_ChangeableBagAttr).merge(#{3.14, 2.71}, IElement_ChangeableBagAttr)
		assertEquals(6, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(1.337))
		assertTrue(result.changeableBagAttr.contains(2.71))
		assertTrue(result.changeableBagAttr.contains(31.337))
		assertTrue(result.changeableBagAttr.contains(3.14))
	}
	
	@Test
	def void set_listEmpty() {
		val existing = createRootElement => [
			changeableListAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableListAttr).merge(#{"3", "2"}, IElement_ChangeableListAttr)
		assertEquals(2, result.changeableListAttr.size)
		assertTrue(result.changeableListAttr.contains("3"))
		assertTrue(result.changeableListAttr.contains("2"))
	}
	
	@Test
	def void set_listPartiallyExisting() {
		val existing = createRootElement => [
			changeableListAttr += #["1", "2", "31", "1", "2"]
		]
		
		val result = createEMerger(existing, IElement_ChangeableListAttr).merge(#{"3", "2"}, IElement_ChangeableListAttr)
		assertEquals(6, result.changeableListAttr.size)
		assertEquals("1", result.changeableListAttr.get(0))
		assertEquals("2", result.changeableListAttr.get(1))
		assertEquals("31", result.changeableListAttr.get(2))
		assertEquals("1", result.changeableListAttr.get(3))
		assertEquals("2", result.changeableListAttr.get(4))
		assertEquals("3", result.changeableListAttr.get(5))
	}

	@Test
	def void list_bagEmpty() {
		val existing = createRootElement => [
			changeableBagAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableBagAttr).merge(#[3.14, 2.71], IElement_ChangeableBagAttr)
		assertEquals(2, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(3.14))
		assertTrue(result.changeableBagAttr.contains(2.71))
	}
	
	@Test
	def void list_bagPartiallyExisting() {
		val existing = createRootElement => [
			changeableBagAttr += #[1.337, 2.71, 31.337, 1.337, 2.71]
		]
		
		val result = createEMerger(existing, IElement_ChangeableBagAttr).merge(#[3.14, 2.71], IElement_ChangeableBagAttr)
		assertEquals(6, result.changeableBagAttr.size)
		assertTrue(result.changeableBagAttr.contains(1.337))
		assertTrue(result.changeableBagAttr.contains(2.71))
		assertTrue(result.changeableBagAttr.contains(31.337))
		assertTrue(result.changeableBagAttr.contains(3.14))
	}
	
	@Test
	def void list_setEmpty() {
		val existing = createRootElement => [
			changeableSetAttr += #[]
		]
		
		val result = createEMerger(existing, IElement_ChangeableSetAttr).merge(#[3, 2], IElement_ChangeableSetAttr)
		assertEquals(2, result.changeableSetAttr.size)
		assertTrue(result.changeableSetAttr.contains(3))
		assertTrue(result.changeableSetAttr.contains(2))
	}
	
	@Test
	def void list_setPartiallyExisting() {
		val existing = createRootElement => [
			changeableSetAttr += #[1, 2, 31, 1, 2]
		]
		
		val result = createEMerger(existing, IElement_ChangeableSetAttr).merge(#[3, 2], IElement_ChangeableSetAttr)
		assertEquals(4, result.changeableSetAttr.size)
		assertTrue(result.changeableSetAttr.contains(1))
		assertTrue(result.changeableSetAttr.contains(2))
		assertTrue(result.changeableSetAttr.contains(31))
		assertTrue(result.changeableSetAttr.contains(3))
	}
}
