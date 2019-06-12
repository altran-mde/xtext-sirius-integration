package com.altran.general.integration.xtextsirius.test.editor.value;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusValueEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusValueEditor;
import com.altran.general.integration.xtextsirius.test.editor.ATestFowlerdsl;
import com.google.inject.Injector;
import nl.altran.example.xtext.html.HtmlLangStandaloneSetup;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslStateDescription extends ATestFowlerdsl {
  private static Injector htmlInjector;
  
  @BeforeClass
  public static void loadHtml() {
    TestFowlerdslStateDescription.htmlInjector = new HtmlLangStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  protected XtextSiriusValueDescriptor createDescriptor() {
    XtextDirectEditValueDescription _createXtextDirectEditValueDescription = this.diagramFactory.createXtextDirectEditValueDescription();
    return new XtextSiriusValueDescriptor(TestFowlerdslStateDescription.htmlInjector, _createXtextDirectEditValueDescription);
  }
  
  @Test
  public void existingEdit() {
    this.assertEdit(
      IterableExtensions.<State>head(this.model.getStates()), 
      null, 
      "<p>This is a deschkriptschion</p>\n", 
      "<p>This is a <b>desch</b>kriptschion</p>\n", 
      "<p>This is a <b>desch</b>kriptschion</p>\n");
  }
  
  @Test
  public void initEdit() {
    this.assertEdit(
      IterableExtensions.<State>head(this.model.getStates()), 
      "<p>T", 
      "<p>T", 
      "<p>This is a <b>desch</b>kriptschion</p>\n", 
      "<p>This is a <b>desch</b>kriptschion</p>\n");
  }
  
  @Test
  public void existingNoOp() {
    this.assertEdit(
      IterableExtensions.<State>head(this.model.getStates()), 
      null, 
      "<p>This is a deschkriptschion</p>\n", 
      null, 
      "<p>This is a deschkriptschion</p>\n");
  }
  
  @Test
  public void existingDelete() {
    this.assertEdit(
      IterableExtensions.<State>head(this.model.getStates()), 
      null, 
      "<p>This is a deschkriptschion</p>\n", 
      "", 
      null);
  }
  
  protected void assertEdit(final EObject container, final String initialValue, final String expectedText, final String changedText, final String expectedResult) {
    final XtextSiriusValueDescriptor descriptor = this.createDescriptor();
    final XtextSiriusValueEditor editor = new XtextSiriusValueEditor(descriptor);
    editor.setCallback(new IXtextSiriusValueEditorCallback() {
      @Override
      public String callbackGetText() {
        return changedText;
      }
      
      @Override
      public void callbackInitText(final String initialValue, final int offset, final int length) {
        final String text = initialValue.substring(offset, (offset + length));
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("doesn\'t match");
        Assert.assertEquals(_builder.toString(), expectedText, text);
      }
    });
    String _featureName = this.getFeatureName();
    final ModelEntryPoint mep = new ModelEntryPoint(null, container, _featureName);
    editor.setModelEntryPoint(mep);
    editor.initValue(initialValue);
    final Object result = editor.commit(container);
    Assert.assertEquals(expectedResult, result);
  }
  
  @Override
  protected String getFeatureName() {
    return "description";
  }
}
