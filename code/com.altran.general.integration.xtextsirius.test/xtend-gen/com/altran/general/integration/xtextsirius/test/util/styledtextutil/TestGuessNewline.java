package com.altran.general.integration.xtextsirius.test.util.styledtextutil;

import com.altran.general.integration.xtextsirius.util.StyledTextUtil;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestGuessNewline {
  @Test
  public void empty() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("");
    Assert.assertEquals("\n", _guessNewline);
  }
  
  @Test
  public void short_lf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("\n");
    Assert.assertEquals("\n", _guessNewline);
  }
  
  @Test
  public void short_cr() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("\r");
    Assert.assertEquals("\r", _guessNewline);
  }
  
  @Test
  public void short_crlf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("\r\n");
    Assert.assertEquals("\r\n", _guessNewline);
  }
  
  @Test
  public void simple_lf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("Hello,\nWorld!");
    Assert.assertEquals("\n", _guessNewline);
  }
  
  @Test
  public void simple_cr() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("Hello,\rWorld!");
    Assert.assertEquals("\r", _guessNewline);
  }
  
  @Test
  public void simple_crlf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("Hello,\r\nWorld!");
    Assert.assertEquals("\r\n", _guessNewline);
  }
  
  @Test
  public void multiline_lf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("Hello,\nWorld!\nPan\nGalactic\nGargle\nBlaster\n");
    Assert.assertEquals("\n", _guessNewline);
  }
  
  @Test
  public void multiline_cr() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("Hello,\rWorld!\rPan\rGalactic\rGargle\rBlaster\r");
    Assert.assertEquals("\r", _guessNewline);
  }
  
  @Test
  public void multiline_crlf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("Hello,\r\nWorld!\r\nPan\r\nGalactic\r\nGargle\r\nBlaster\r\n");
    Assert.assertEquals("\r\n", _guessNewline);
  }
  
  @Test
  public void equal_mixed_lf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("Hello,\nWorld!\r\n");
    Assert.assertEquals("\n", _guessNewline);
  }
  
  @Test
  public void equal_mixed_cr() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("Hello,\rWorld!\r\n");
    Assert.assertEquals("\r\n", _guessNewline);
  }
  
  @Test
  public void equal_mixed_crlf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("Hello,\rWorld!\n");
    Assert.assertEquals("\n", _guessNewline);
  }
  
  @Test
  public void double_mixed_lf_crlf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("\nHello,\nWorld!\r\n");
    Assert.assertEquals("\n", _guessNewline);
  }
  
  @Test
  public void double_mixed_cr_crlf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("\rHello,\rWorld!\r\n");
    Assert.assertEquals("\r", _guessNewline);
  }
  
  @Test
  public void double_mixed_lf_cr() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("\nHello,\nWorld!\r");
    Assert.assertEquals("\n", _guessNewline);
  }
  
  @Test
  public void double_mixed_cr_lf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("\nHello,\rWorld!\r");
    Assert.assertEquals("\r", _guessNewline);
  }
  
  @Test
  public void double_mixed_crlf_lf() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("\r\nHello,\nWorld!\r\n");
    Assert.assertEquals("\r\n", _guessNewline);
  }
  
  @Test
  public void double_mixed_crlf_cr() {
    StyledTextUtil _instance = StyledTextUtil.getInstance();
    String _guessNewline = _instance.guessNewline("\r\nHello,\rWorld!\r\n");
    Assert.assertEquals("\r\n", _guessNewline);
  }
}
