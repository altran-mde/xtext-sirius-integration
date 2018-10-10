/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.styledtextutil;

import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import org.eclipse.xtext.util.TextRegion;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestRemoveNewlinesIfSingleLine extends AFowlerdslDefaultModelTest {
  @Test
  public void nothing_singleLine() {
    final StringBuffer text = new StringBuffer("Hello, World!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, text.length(), false);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello, World!", result.toString());
  }
  
  @Test
  public void nothing_multiLine() {
    final StringBuffer text = new StringBuffer("Hello, World!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, text.length(), true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello, World!", result.toString());
  }
  
  @Test
  public void simple_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\n World!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, text.length(), false);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,  World!", result.toString());
  }
  
  @Test
  public void simple_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\n World!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, text.length(), true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,\n World!", result.toString());
  }
  
  @Test
  public void simple_singleLine_region() {
    final StringBuffer text = new StringBuffer("Hello,\n World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    int _length = text.length();
    TextRegion _textRegion = new TextRegion(0, _length);
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, _textRegion, false);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,  World!", result.toString());
  }
  
  @Test
  public void simple_multiLine_region() {
    final StringBuffer text = new StringBuffer("Hello,\n World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    int _length = text.length();
    TextRegion _textRegion = new TextRegion(0, _length);
    final StringBuffer result = _instance.removeNewlinesIfSingleLine(text, _textRegion, true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,\n World!", result.toString());
  }
  
  @Test
  public void outside_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this is my\n\n\n\nWorld!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 7, 11, false);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,\n this is my\n\n\n\nWorld!", result.toString());
  }
  
  @Test
  public void outside_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this is my\n\n\n\nWorld!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 7, 11, true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,\n this is my\n\n\n\nWorld!", result.toString());
  }
  
  @Test
  public void subset_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 6, 14, false);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,  this  is  my\n\n\n\nWorld!", result.toString());
  }
  
  @Test
  public void subset_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 6, 14, true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,\n this \nis\n my\n\n\n\nWorld!", result.toString());
  }
  
  @Test
  public void subsetWithLast_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 6, 15, false);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,  this  is  my \n\n\nWorld!", result.toString());
  }
  
  @Test
  public void subsetWithLast_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\n this \nis\n my\n\n\n\nWorld!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 6, 15, true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,\n this \nis\n my\n\n\n\nWorld!", result.toString());
  }
  
  @Test
  public void empty_singleLine() {
    final StringBuffer text = new StringBuffer("");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, 0, false);
    Assert.assertSame(text, result);
    Assert.assertEquals("", result.toString());
  }
  
  @Test
  public void empty_multiLine() {
    final StringBuffer text = new StringBuffer("");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, 0, true);
    Assert.assertSame(text, result);
    Assert.assertEquals("", result.toString());
  }
  
  @Test(expected = StringIndexOutOfBoundsException.class)
  public void offsetBeyond_singleLine() {
    final StringBuffer text = new StringBuffer("Hello");
    StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 5, 1, false);
  }
  
  @Test
  public void offsetBeyond_multiLine() {
    final StringBuffer text = new StringBuffer("Hello");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 5, 1, true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello", result.toString());
  }
  
  @Test(expected = StringIndexOutOfBoundsException.class)
  public void lengthBeyond_singleLine() {
    final StringBuffer text = new StringBuffer("Hello");
    StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 3, 3, false);
  }
  
  @Test
  public void lengthBeyond_multiLine() {
    final StringBuffer text = new StringBuffer("Hello");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 3, 3, true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello", result.toString());
  }
  
  @Test
  public void zeroLength_singleLine() {
    final StringBuffer text = new StringBuffer("Hello");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 500, 0, false);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello", result.toString());
  }
  
  @Test
  public void zeroLength_multiLine() {
    final StringBuffer text = new StringBuffer("Hello");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 500, 0, true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello", result.toString());
  }
  
  @Test
  public void windowsCRLF_singleLine() {
    final StringBuffer text = new StringBuffer("Hello,\r\n this \r\nis\r\n my\r\n\r\n\r\n\r\nWorld!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 6, 19, false);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,   this   is   my  \r\n\r\n\r\nWorld!", result.toString());
  }
  
  @Test
  public void windowsCRLF_multiLine() {
    final StringBuffer text = new StringBuffer("Hello,\r\n this \r\nis\r\n my\r\n\r\n\r\n\r\nWorld!");
    final StringBuffer result = StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 6, 19, true);
    Assert.assertSame(text, result);
    Assert.assertEquals("Hello,\r\n this \r\nis\r\n my\r\n\r\n\r\n\r\nWorld!", result.toString());
  }
}
