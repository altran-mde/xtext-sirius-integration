package com.altran.general.integration.xtextsirius.test.util.styledtextutil

import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil
import org.junit.Test

import static org.junit.Assert.*

class TestGuessNewline {
	@Test
	def empty() {
		assertEquals("\n", StyledTextUtil.instance.guessNewline(""))
	}

	@Test
	def short_lf() {
		assertEquals("\n", StyledTextUtil.instance.guessNewline("\n"))
	}

	@Test
	def short_cr() {
		assertEquals("\r", StyledTextUtil.instance.guessNewline("\r"))
	}

	@Test
	def short_crlf() {
		assertEquals("\r\n", StyledTextUtil.instance.guessNewline("\r\n"))
	}

	@Test
	def simple_lf() {
		assertEquals("\n", StyledTextUtil.instance.guessNewline("Hello,\nWorld!"))
	}

	@Test
	def simple_cr() {
		assertEquals("\r", StyledTextUtil.instance.guessNewline("Hello,\rWorld!"))
	}

	@Test
	def simple_crlf() {
		assertEquals("\r\n", StyledTextUtil.instance.guessNewline("Hello,\r\nWorld!"))
	}

	@Test
	def multiline_lf() {
		assertEquals("\n", StyledTextUtil.instance.guessNewline("Hello,\nWorld!\nPan\nGalactic\nGargle\nBlaster\n"))
	}

	@Test
	def multiline_cr() {
		assertEquals("\r", StyledTextUtil.instance.guessNewline("Hello,\rWorld!\rPan\rGalactic\rGargle\rBlaster\r"))
	}

	@Test
	def multiline_crlf() {
		assertEquals("\r\n",
			StyledTextUtil.instance.guessNewline("Hello,\r\nWorld!\r\nPan\r\nGalactic\r\nGargle\r\nBlaster\r\n"))
	}

	@Test
	def equal_mixed_lf() {
		assertEquals("\n", StyledTextUtil.instance.guessNewline("Hello,\nWorld!\r\n"))
	}

	@Test
	def equal_mixed_cr() {
		assertEquals("\r\n", StyledTextUtil.instance.guessNewline("Hello,\rWorld!\r\n"))
	}

	@Test
	def equal_mixed_crlf() {
		assertEquals("\n", StyledTextUtil.instance.guessNewline("Hello,\rWorld!\n"))
	}

	@Test
	def double_mixed_lf_crlf() {
		assertEquals("\n", StyledTextUtil.instance.guessNewline("\nHello,\nWorld!\r\n"))
	}

	@Test
	def double_mixed_cr_crlf() {
		assertEquals("\r", StyledTextUtil.instance.guessNewline("\rHello,\rWorld!\r\n"))
	}

	@Test
	def double_mixed_lf_cr() {
		assertEquals("\n", StyledTextUtil.instance.guessNewline("\nHello,\nWorld!\r"))
	}

	@Test
	def double_mixed_cr_lf() {
		assertEquals("\r", StyledTextUtil.instance.guessNewline("\nHello,\rWorld!\r"))
	}

	@Test
	def double_mixed_crlf_lf() {
		assertEquals("\r\n", StyledTextUtil.instance.guessNewline("\r\nHello,\nWorld!\r\n"))
	}

	@Test
	def double_mixed_crlf_cr() {
		assertEquals("\r\n", StyledTextUtil.instance.guessNewline("\r\nHello,\rWorld!\r\n"))
	}

}
