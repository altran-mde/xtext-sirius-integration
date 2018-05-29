package com.altran.general.integration.xtextsirius.test.util.styledtextutil;

import org.eclipse.xtext.util.TextRegion;
import org.junit.Assert;
import org.junit.Test;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.util.StyledTextUtil;

@SuppressWarnings("all")
public class TestInsertNewline extends AFowlerdslDefaultModelTest {
	@Test
	public void simple_region() {
		final StringBuffer text = new StringBuffer("Hello, World!");
		final StyledTextUtil _instance = StyledTextUtil.getInstance();
		final TextRegion _textRegion = new TextRegion(6, 20);
		final TextRegion newRegion = _instance.insertNewline(text, _textRegion);
		Assert.assertEquals("Hello,\n World!", text.toString());
		Assert.assertEquals(7, newRegion.getOffset());
		Assert.assertEquals(20, newRegion.getLength());
	}
	
	@Test
	public void simple_ints() {
		final StringBuffer text = new StringBuffer("Hello, World!");
		final TextRegion newRegion = StyledTextUtil.getInstance().insertNewline(text, 6, 20);
		Assert.assertEquals("Hello,\n World!", text.toString());
		Assert.assertEquals(7, newRegion.getOffset());
		Assert.assertEquals(20, newRegion.getLength());
	}
	
	@Test
	public void empty() {
		final StringBuffer text = new StringBuffer("");
		final TextRegion newRegion = StyledTextUtil.getInstance().insertNewline(text, 0, 20);
		Assert.assertEquals("\n", text.toString());
		Assert.assertEquals(1, newRegion.getOffset());
		Assert.assertEquals(20, newRegion.getLength());
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void after() {
		final StringBuffer text = new StringBuffer("Hello, World!");
		StyledTextUtil.getInstance().insertNewline(text, 20, 20);
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void after_empty() {
		final StringBuffer text = new StringBuffer("");
		StyledTextUtil.getInstance().insertNewline(text, 1, 20);
	}
}
