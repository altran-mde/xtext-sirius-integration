package com.altran.general.integration.xtextsirius.test.util.styledtextutil

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest
import com.altran.general.integration.xtextsirius.util.StyledTextUtil
import org.eclipse.xtext.util.TextRegion
import org.junit.Test

import static org.junit.Assert.*

class InsertNewline extends AFowlerdslDefaultModelTest {
	@Test
	def simple_region() {
		val text = new StringBuffer("Hello, World!")
		
		val newRegion = StyledTextUtil.instance.insertNewline(text, new TextRegion(6, 20))
		
		assertEquals("Hello,\n World!", text.toString)
		assertEquals(7, newRegion.offset)
		assertEquals(20, newRegion.length)
	}

	@Test
	def simple_ints() {
		val text = new StringBuffer("Hello, World!")
		
		val newRegion = StyledTextUtil.instance.insertNewline(text, 6, 20)
		
		assertEquals("Hello,\n World!", text.toString)
		assertEquals(7, newRegion.offset)
		assertEquals(20, newRegion.length)
	}

	@Test
	def empty() {
		val text = new StringBuffer("")
		
		val newRegion = StyledTextUtil.instance.insertNewline(text, 0, 20)
		
		assertEquals("\n", text.toString)
		assertEquals(1, newRegion.offset)
		assertEquals(20, newRegion.length)
	}

	@Test(expected = StringIndexOutOfBoundsException)
	def void after() {
		val text = new StringBuffer("Hello, World!")
		
		StyledTextUtil.instance.insertNewline(text, 20, 20)
	}

	@Test(expected = StringIndexOutOfBoundsException)
	def void after_empty() {
		val text = new StringBuffer("")
		
		StyledTextUtil.instance.insertNewline(text, 1, 20)
	}

}
