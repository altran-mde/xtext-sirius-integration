/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.styledtextutil

import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest
import org.eclipse.xtext.util.TextRegion
import org.junit.Test

import static org.junit.Assert.*

class TestRemoveNewlinesIfSingleLine extends AFowlerdslDefaultModelTest {
	@Test
	def nothing_singleLine() {
		val text = new StringBuffer("Hello, World!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 0, text.length, false)
		
		assertSame(text, result)
		assertEquals("Hello, World!", result.toString)
	}

	@Test
	def nothing_multiLine() {
		val text = new StringBuffer("Hello, World!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 0, text.length, true)
		
		assertSame(text, result)
		assertEquals("Hello, World!", result.toString)
	}

	@Test
	def simple_singleLine() {
		val text = new StringBuffer("Hello,\n World!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 0, text.length, false)
		
		assertSame(text, result)
		assertEquals("Hello,  World!", result.toString)
	}

	@Test
	def simple_multiLine() {
		val text = new StringBuffer("Hello,\n World!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 0, text.length, true)
		
		assertSame(text, result)
		assertEquals("Hello,\n World!", result.toString)
	}
	
	@Test
	def simple_singleLine_region() {
		val text = new StringBuffer("Hello,\n World!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, new TextRegion(0, text.length), false)
		
		assertSame(text, result)
		assertEquals("Hello,  World!", result.toString)
	}

	@Test
	def simple_multiLine_region() {
		val text = new StringBuffer("Hello,\n World!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, new TextRegion(0, text.length), true)
		
		assertSame(text, result)
		assertEquals("Hello,\n World!", result.toString)
	}

	@Test
	def outside_singleLine() {
		val text = new StringBuffer("Hello,\n this is my\n\n\n\nWorld!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 7, 11, false)
		
		assertSame(text, result)
		assertEquals("Hello,\n this is my\n\n\n\nWorld!", result.toString)
	}

	@Test
	def outside_multiLine() {
		val text = new StringBuffer("Hello,\n this is my\n\n\n\nWorld!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 7, 11, true)
		
		assertSame(text, result)
		assertEquals("Hello,\n this is my\n\n\n\nWorld!", result.toString)
	}
	
	@Test
	def subset_singleLine() {
		val text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 6, 14, false)
		
		assertSame(text, result)
		assertEquals("Hello,  this  is  my\n\n\n\nWorld!", result.toString)
	}

	@Test
	def subset_multiLine() {
		val text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 6, 14, true)
		
		assertSame(text, result)
		assertEquals("Hello,\n this \nis\n my\n\n\n\nWorld!", result.toString)
	}
	
	@Test
	def subsetWithLast_singleLine() {
		val text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 6, 15, false)
		
		assertSame(text, result)
		assertEquals("Hello,  this  is  my \n\n\nWorld!", result.toString)
	}

	@Test
	def subsetWithLast_multiLine() {
		val text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 6, 15, true)
		
		assertSame(text, result)
		assertEquals("Hello,\n this \nis\n my\n\n\n\nWorld!", result.toString)
	}
	
	@Test
	def empty_singleLine() {
		val text = new StringBuffer("")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 0, 0, false)
		
		assertSame(text, result)
		assertEquals("", result.toString)
	}

	@Test
	def empty_multiLine() {
		val text = new StringBuffer("")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 0, 0, true)
		
		assertSame(text, result)
		assertEquals("", result.toString)
	}
	
	@Test(expected = StringIndexOutOfBoundsException)
	def void offsetBeyond_singleLine() {
		val text = new StringBuffer("Hello")
		
		StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 5, 1, false)
	}

	@Test
	def void offsetBeyond_multiLine() {
		val text = new StringBuffer("Hello")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 5, 1, true)
		
		assertSame(text, result)
		assertEquals("Hello", result.toString)
	}
	
	@Test(expected = StringIndexOutOfBoundsException)
	def void lengthBeyond_singleLine() {
		val text = new StringBuffer("Hello")
		
		StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 3, 3, false)
	}

	@Test
	def void lengthBeyond_multiLine() {
		val text = new StringBuffer("Hello")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 3, 3, true)
		
		assertSame(text, result)
		assertEquals("Hello", result.toString)
	}
	
	@Test
	def void zeroLength_singleLine() {
		val text = new StringBuffer("Hello")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 500, 0, false)
		
		assertSame(text, result)
		assertEquals("Hello", result.toString)
	}
	
	@Test
	def void zeroLength_multiLine() {
		val text = new StringBuffer("Hello")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 500, 0, true)
		
		assertSame(text, result)
		assertEquals("Hello", result.toString)
	}
	
	@Test
	def windowsCRLF_singleLine() {
		val text = new StringBuffer("Hello,\r\n this \r\nis\r\n my\r\n\r\n\r\n\r\nWorld!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 6, 19, false)
		
		assertSame(text, result)
		assertEquals("Hello,   this   is   my  \r\n\r\n\r\nWorld!", result.toString)
	}

	@Test
	def windowsCRLF_multiLine() {
		val text = new StringBuffer("Hello,\r\n this \r\nis\r\n my\r\n\r\n\r\n\r\nWorld!")
		
		val result = StyledTextUtil.instance.removeNewlinesIfSingleLine(text, 6, 19, true)
		
		assertSame(text, result)
		assertEquals("Hello,\r\n this \r\nis\r\n my\r\n\r\n\r\n\r\nWorld!", result.toString)
	}
	
}
