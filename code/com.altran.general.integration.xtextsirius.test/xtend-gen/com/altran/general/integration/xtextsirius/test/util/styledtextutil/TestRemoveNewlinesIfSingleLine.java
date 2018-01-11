package com.altran.general.integration.xtextsirius.test.util.styledtextutil;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.util.StyledTextUtil;
import org.eclipse.xtext.util.TextRegion;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestRemoveNewlinesIfSingleLine extends AFowlerdslDefaultModelTest {
  @Test
  public void nothing_singleLine() {
    final StringBuffer text = new StringBuffer("Hello, World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    int _length = text.length();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 0, _length, false);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello, World!", _string);
  }
  
  @Test
  public void nothing_multiLine() {
    final StringBuffer text = new StringBuffer("Hello, World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    int _length = text.length();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 0, _length, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello, World!", _string);
  }
  
  @Test
  public void simple_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\n World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    int _length = text.length();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 0, _length, false);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,  World!", _string);
  }
  
  @Test
  public void simple_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\n World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    int _length = text.length();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 0, _length, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,\n World!", _string);
  }
  
  @Test
  public void simple_singleLine_region() {
    final StringBuffer text = new StringBuffer("Hello,\n World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    int _length = text.length();
    TextRegion _textRegion = new TextRegion(0, _length);
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, _textRegion, false);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,  World!", _string);
  }
  
  @Test
  public void simple_multiLine_region() {
    final StringBuffer text = new StringBuffer("Hello,\n World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    int _length = text.length();
    TextRegion _textRegion = new TextRegion(0, _length);
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, _textRegion, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,\n World!", _string);
  }
  
  @Test
  public void outside_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this is my\n\n\n\nWorld!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 7, 11, false);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,\n this is my\n\n\n\nWorld!", _string);
  }
  
  @Test
  public void outside_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this is my\n\n\n\nWorld!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 7, 11, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,\n this is my\n\n\n\nWorld!", _string);
  }
  
  @Test
  public void subset_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 6, 14, false);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,  this  is  my\n\n\n\nWorld!", _string);
  }
  
  @Test
  public void subset_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 6, 14, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,\n this \nis\n my\n\n\n\nWorld!", _string);
  }
  
  @Test
  public void subsetWithLast_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 6, 15, false);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,  this  is  my \n\n\nWorld!", _string);
  }
  
  @Test
  public void subsetWithLast_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 6, 15, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,\n this \nis\n my\n\n\n\nWorld!", _string);
  }
  
  @Test
  public void empty_singleLine() {
    final StringBuffer text = new StringBuffer("");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 0, 0, false);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("", _string);
  }
  
  @Test
  public void empty_multiLine() {
    final StringBuffer text = new StringBuffer("");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 0, 0, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("", _string);
  }
  
  @Test(expected = StringIndexOutOfBoundsException.class)
  public void offsetBeyond_singleLine() {
    final StringBuffer text = new StringBuffer("Hello");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    _instance.removeNewlinesIfSingleLine(text, 5, 1, false);
  }
  
  @Test
  public void offsetBeyond_multiLine() {
    final StringBuffer text = new StringBuffer("Hello");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 5, 1, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello", _string);
  }
  
  @Test(expected = StringIndexOutOfBoundsException.class)
  public void lengthBeyond_singleLine() {
    final StringBuffer text = new StringBuffer("Hello");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    _instance.removeNewlinesIfSingleLine(text, 3, 3, false);
  }
  
  @Test
  public void lengthBeyond_multiLine() {
    final StringBuffer text = new StringBuffer("Hello");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 3, 3, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello", _string);
  }
  
  @Test
  public void zeroLength_singleLine() {
    final StringBuffer text = new StringBuffer("Hello");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 500, 0, false);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello", _string);
  }
  
  @Test
  public void zeroLength_multiLine() {
    final StringBuffer text = new StringBuffer("Hello");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 500, 0, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello", _string);
  }
  
  @Test
  public void windowsCRLF_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\r\n this \r\nis\r\n my\r\n\r\n\r\n\r\nWorld!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 6, 19, false);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,   this   is   my  \r\n\r\n\r\nWorld!", _string);
  }
  
  @Test
  public void windowsCRLF_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\r\n this \r\nis\r\n my\r\n\r\n\r\n\r\nWorld!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, 6, 19, true);
    Assert.assertSame(text, result);
    String _string = result.toString();
    Assert.assertEquals("Hello,\r\n this \r\nis\r\n my\r\n\r\n\r\n\r\nWorld!", _string);
  }
}
