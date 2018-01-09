package com.altran.general.integration.xtextsirius.test.util.styledtextutil;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.util.StyledTextUtil;
import org.eclipse.xtext.util.TextRegion;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestInsertNewline extends AFowlerdslDefaultModelTest {
  @Test
  public void simple_region() {
    final StringBuffer text = new StringBuffer("Hello, World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    TextRegion _textRegion = new TextRegion(6, 20);
    final TextRegion newRegion = _instance.insertNewline(text, _textRegion);
    String _string = text.toString();
    Assert.assertEquals("Hello,\n World!", _string);
    int _offset = newRegion.getOffset();
    Assert.assertEquals(7, _offset);
    int _length = newRegion.getLength();
    Assert.assertEquals(20, _length);
  }
  
  @Test
  public void simple_ints() {
    final StringBuffer text = new StringBuffer("Hello, World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final TextRegion newRegion = _instance.insertNewline(text, 6, 20);
    String _string = text.toString();
    Assert.assertEquals("Hello,\n World!", _string);
    int _offset = newRegion.getOffset();
    Assert.assertEquals(7, _offset);
    int _length = newRegion.getLength();
    Assert.assertEquals(20, _length);
  }
  
  @Test
  public void empty() {
    final StringBuffer text = new StringBuffer("");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final TextRegion newRegion = _instance.insertNewline(text, 0, 20);
    String _string = text.toString();
    Assert.assertEquals("\n", _string);
    int _offset = newRegion.getOffset();
    Assert.assertEquals(1, _offset);
    int _length = newRegion.getLength();
    Assert.assertEquals(20, _length);
  }
  
  @Test(expected = StringIndexOutOfBoundsException.class)
  public void after() {
    final StringBuffer text = new StringBuffer("Hello, World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    _instance.insertNewline(text, 20, 20);
  }
  
  @Test(expected = StringIndexOutOfBoundsException.class)
  public void after_empty() {
    final StringBuffer text = new StringBuffer("");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    _instance.insertNewline(text, 1, 20);
  }
}
