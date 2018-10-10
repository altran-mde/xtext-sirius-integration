package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
import org.junit.Test

import static org.junit.Assert.*

abstract class ATestEMergerContainmentMixed<T extends IElement<T>> extends ATestEMergerContainment<T> {
	@Test
	def void singleNull_setEmpty() {
		val existing = createRootElement => [
			changeableSetCont += #[]
		]
		
		val result = createEMerger(existing, changeableSetContFeature).merge(null, changeableSetContFeature)
		assertTrue(result.changeableSetCont.isEmpty)
	}
	
	@Test
	def void singleNull_setNew() {
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableSetContFeature).merge(null, changeableSetContFeature)
		assertEquals(5, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("q1"))
		assertTrue(result.changeableSetCont.valueExists("q2"))
		assertTrue(result.changeableSetCont.valueExists("q31"))
	}
	
	@Test
	def void singleNull_listEmpty() {
		val existing = createRootElement => [
			changeableUniqueListCont += #[]
		]
		
		val result = createEMerger(existing, changeableUniqueListContFeature).merge(null, changeableUniqueListContFeature)
		assertTrue(result.changeableUniqueListCont.isEmpty)
	}
	
	@Test
	def void singleNull_listNew() {
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableUniqueListContFeature).merge(null, changeableUniqueListContFeature)
		assertEquals(5, result.changeableUniqueListCont.size)
		assertTrue("q1" == result.changeableUniqueListCont.get(0).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(1).changeableAttr)
		assertTrue("q31" == result.changeableUniqueListCont.get(2).changeableAttr)
		assertTrue("q1" == result.changeableUniqueListCont.get(3).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(4).changeableAttr)
	}

	@Test
	def void singleNonNull_setEmpty() {
		val existing = createRootElement => [
			changeableSetCont += #[]
		]
		
		val result = createEMerger(existing, changeableSetContFeature).merge(newEdited(3, "3"), changeableSetContFeature)
		assertEquals(1, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("a3"))
	}
	
	@Test
	def void singleNonNull_setNew() {
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableSetContFeature).merge(newEdited(3, "3"), changeableSetContFeature)
		assertEquals(6, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("q1"))
		assertTrue(result.changeableSetCont.valueExists("q2"))
		assertTrue(result.changeableSetCont.valueExists("q31"))
		assertTrue(result.changeableSetCont.valueExists("a3"))
	}
	
	@Test
	def void singleNonNull_setExisting() {
		val edited = createRootElement => [
			changeableSetCont += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(4, "4"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableSetContFeature).merge(edited.changeableSetCont.head, changeableSetContFeature)
		assertEquals(5, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("a3"))
		assertTrue(result.changeableSetCont.valueExists("q1"))
		assertTrue(result.changeableSetCont.valueExists("q2"))
		assertTrue(result.changeableSetCont.valueExists("q31"))
	}
	
	@Test
	def void singleNonNull_listEmpty() {
		val existing = createRootElement => [
			changeableUniqueListCont += #[]
		]
		
		val result = createEMerger(existing, changeableUniqueListContFeature).merge(newEdited(3, "3"), changeableUniqueListContFeature)
		assertEquals(1, result.changeableUniqueListCont.size)
		assertTrue("a3" == result.changeableUniqueListCont.get(0).changeableAttr)
	}
	
	@Test
	def void singleNonNull_listNew() {
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableUniqueListContFeature).merge(newEdited(3, "3"), changeableUniqueListContFeature)
		assertEquals(6, result.changeableUniqueListCont.size)
		assertTrue("q1" == result.changeableUniqueListCont.get(0).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(1).changeableAttr)
		assertTrue("q31" == result.changeableUniqueListCont.get(2).changeableAttr)
		assertTrue("q1" == result.changeableUniqueListCont.get(3).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(4).changeableAttr)
		assertTrue("a3" == result.changeableUniqueListCont.get(5).changeableAttr)
	}
	
	@Test
	def void singleNonNull_listExisting() {
		val edited = createRootElement => [
			changeableUniqueListCont += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableUniqueListContFeature).merge(edited.changeableUniqueListCont.head, changeableUniqueListContFeature)
		assertEquals(5, result.changeableUniqueListCont.size)
		assertTrue("a3" == result.changeableUniqueListCont.get(0).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(1).changeableAttr)
		assertTrue("q31" == result.changeableUniqueListCont.get(2).changeableAttr)
		assertTrue("q1" == result.changeableUniqueListCont.get(3).changeableAttr)
		assertTrue("q2" == result.changeableUniqueListCont.get(4).changeableAttr)
	}

	@Test
	def void set_listEmpty() {
		val existing = createRootElement => [
			changeableUniqueListCont += #[]
		]
		
		val result = createEMerger(existing, changeableUniqueListContFeature).merge(#{newEdited(3, "3"), newEdited(2, "2")}, changeableUniqueListContFeature)
		assertEquals(2, result.changeableUniqueListCont.size)
		assertTrue(result.changeableUniqueListCont.valueExists("a3"))
		assertTrue(result.changeableUniqueListCont.valueExists("a2"))
	}
	
	@Test
	def void set_listPartiallyExisting() {
		val edited = createRootElement => [
			changeableUniqueListCont += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableUniqueListCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableUniqueListContFeature).merge(#{edited.changeableUniqueListCont.head, newEdited(2, "2")}, changeableUniqueListContFeature)
		assertEquals(2, result.changeableUniqueListCont.size)
		assertTrue(result.changeableUniqueListCont.valueExists("a3"))
		assertTrue(result.changeableUniqueListCont.valueExists("a2"))
	}

	@Test
	def void list_setEmpty() {
		val existing = createRootElement => [
			changeableSetCont += #[]
		]
		
		val result = createEMerger(existing, changeableSetContFeature).merge(#[newEdited(3, "3"), newEdited(2, "2")], changeableSetContFeature)
		assertEquals(2, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("a3"))
		assertTrue(result.changeableSetCont.valueExists("a2"))
	}
	
	@Test
	def void list_setPartiallyExisting() {
		val edited = createRootElement => [
			changeableSetCont += newEdited(3, "3")
		]
		
		//dummy to create appropriate edited URIs
		newEdited(99, "99")
		
		val existing = createRootElement => [
			changeableSetCont += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, changeableSetContFeature).merge(#[edited.changeableSetCont.head, newEdited(2, "2")], changeableSetContFeature)
		assertEquals(2, result.changeableSetCont.size)
		assertTrue(result.changeableSetCont.valueExists("a2"))
		assertTrue(result.changeableSetCont.valueExists("a3"))
	}
	
	def protected changeableSetContFeature() {
		AElement_ChangeableSetCont
	}
	
	def protected changeableUniqueListContFeature() {
		AElement_ChangeableUniqueListCont
	} 
}