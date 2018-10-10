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
public class TestInsertNewline extends AFowlerdslDefaultModelTest {
  @Test
  public void simple_region() {
    final StringBuffer text = new StringBuffer("Hello, World!");
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    TextRegion _textRegion = new TextRegion(6, 20);
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
