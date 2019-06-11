package com.altran.general.integration.xtextsirius.test.integration;

import com.altran.general.integration.xtextsirius.test.integration.TestXtextSiriusEditorCallbackAdapter;
import com.google.inject.Injector;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.parser.IParseResult;
import org.junit.Assert;

@SuppressWarnings("all")
public class AssertingXtextSiriusEditorCallback extends TestXtextSiriusEditorCallbackAdapter {
  private final String newText;
  
  private final String expectedText;
  
  private String initialValue;
  
  private int offset;
  
  private int length;
  
  public AssertingXtextSiriusEditorCallback(final Injector injector, final EObject model, final String newText, final String expectedText) {
    super(injector, model);
    this.newText = newText;
    this.expectedText = expectedText;
  }
  
  @Override
  public void callbackInitText(final String initialValue, final int offset, final int length) {
    final String text = ((String) initialValue).substring(offset, (offset + length));
    this.initialValue = initialValue;
    this.offset = offset;
    this.length = length;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("doesn\'t match");
    Assert.assertEquals(_builder.toString(), this.expectedText, text);
    super.callbackInitText(initialValue, offset, length);
  }
  
  @Override
  public IParseResult getXtextParseResult() {
    IParseResult _xblockexpression = null;
    {
      final String overlay = StringUtils.overlay(this.initialValue, this.newText, this.offset, (this.offset + this.length));
      this.updateEditedText(overlay);
      _xblockexpression = super.getXtextParseResult();
    }
    return _xblockexpression;
  }
  
  @Override
  public String callbackGetText() {
    return this.newText;
  }
}
