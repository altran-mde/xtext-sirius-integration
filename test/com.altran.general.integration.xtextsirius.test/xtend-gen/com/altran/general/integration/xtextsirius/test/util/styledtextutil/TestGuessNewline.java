package com.altran.general.integration.xtextsirius.test.util.styledtextutil;

import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestGuessNewline {
  @Test
  public void empty() {
    Assert.assertEquals("\n", StyledTextUtil.getInstance().guessNewline(""));
  }
  
  @Test
  public void short_lf() {
    Assert.assertEquals("\n", StyledTextUtil.getInstance().guessNewline("\n"));
  }
  
  @Test
  public void short_cr() {
    Assert.assertEquals("\r", StyledTextUtil.getInstance().guessNewline("\r"));
  }
  
  @Test
  public void short_crlf() {
    Assert.assertEquals("\r\n", StyledTextUtil.getInstance().guessNewline("\r\n"));
  }
  
  @Test
  public void simple_lf() {
    Assert.assertEquals("\n", StyledTextUtil.getInstance().guessNewline("Hello,\nWorld!"));
  }
  
  @Test
  public void simple_cr() {
    Assert.assertEquals("\r", StyledTextUtil.getInstance().guessNewline("Hello,\rWorld!"));
  }
  
  @Test
  public void simple_crlf() {
    Assert.assertEquals("\r\n", StyledTextUtil.getInstance().guessNewline("Hello,\r\nWorld!"));
  }
  
  @Test
  public void multiline_lf() {
    Assert.assertEquals("\n", StyledTextUtil.getInstance().guessNewline("Hello,\nWorld!\nPan\nGalactic\nGargle\nBlaster\n"));
  }
  
  @Test
  public void multiline_cr() {
    Assert.assertEquals("\r", StyledTextUtil.getInstance().guessNewline("Hello,\rWorld!\rPan\rGalactic\rGargle\rBlaster\r"));
  }
  
  @Test
  public void multiline_crlf() {
    Assert.assertEquals("\r\n", 
      StyledTextUtil.getInstance().guessNewline("Hello,\r\nWorld!\r\nPan\r\nGalactic\r\nGargle\r\nBlaster\r\n"));
  }
  
  @Test
  public void equal_mixed_lf() {
    Assert.assertEquals("\n", StyledTextUtil.getInstance().guessNewline("Hello,\nWorld!\r\n"));
  }
  
  @Test
  public void equal_mixed_cr() {
    Assert.assertEquals("\r\n", StyledTextUtil.getInstance().guessNewline("Hello,\rWorld!\r\n"));
  }
  
  @Test
  public void equal_mixed_crlf() {
    Assert.assertEquals("\n", StyledTextUtil.getInstance().guessNewline("Hello,\rWorld!\n"));
  }
  
  @Test
  public void double_mixed_lf_crlf() {
    Assert.assertEquals("\n", StyledTextUtil.getInstance().guessNewline("\nHello,\nWorld!\r\n"));
  }
  
  @Test
  public void double_mixed_cr_crlf() {
    Assert.assertEquals("\r", StyledTextUtil.getInstance().guessNewline("\rHello,\rWorld!\r\n"));
  }
  
  @Test
  public void double_mixed_lf_cr() {
    Assert.assertEquals("\n", StyledTextUtil.getInstance().guessNewline("\nHello,\nWorld!\r"));
  }
  
  @Test
  public void double_mixed_cr_lf() {
    Assert.assertEquals("\r", StyledTextUtil.getInstance().guessNewline("\nHello,\rWorld!\r"));
  }
  
  @Test
  public void double_mixed_crlf_lf() {
    Assert.assertEquals("\r\n", StyledTextUtil.getInstance().guessNewline("\r\nHello,\nWorld!\r\n"));
  }
  
  @Test
  public void double_mixed_crlf_cr() {
    Assert.assertEquals("\r\n", StyledTextUtil.getInstance().guessNewline("\r\nHello,\rWorld!\r\n"));
  }
}
