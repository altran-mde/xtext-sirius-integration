package com.altran.general.integration.xtextsirius.ui.test.integration;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.ui.test.integration.ATestFowlerdsl;
import com.altran.general.integration.xtextsirius.ui.test.integration.TestXtextSiriusEditorCallbackAdapter;
import com.google.inject.Injector;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.espilce.commons.emf.testsupport.AssertEmf;
import org.espilce.commons.lang.StringUtils2;
import org.junit.Assert;

@SuppressWarnings("all")
public abstract class ATestFowlerdslCombined extends ATestFowlerdsl {
  protected static class TestXtextSiriusModelEditor extends XtextSiriusModelEditor {
    public TestXtextSiriusModelEditor(final IXtextSiriusModelDescriptor descriptor) {
      super(descriptor);
    }
    
    @Override
    public void setSemanticElement(final EObject element) {
      IXtextSiriusModelEditorCallback _callback = this.getCallback();
      boolean _tripleNotEquals = (_callback != null);
      if (_tripleNotEquals) {
        IXtextSiriusModelEditorCallback _callback_1 = this.getCallback();
        ((TestXtextSiriusEditorCallbackAdapter) _callback_1).testSemanticElement = element;
      }
      super.setSemanticElement(element);
    }
  }
  
  protected static class AssertingXtextSiriusEditorCallback extends TestXtextSiriusEditorCallbackAdapter {
    private final String message;
    
    private final String expectedText;
    
    public AssertingXtextSiriusEditorCallback(final Injector injector, final EObject model, final String message, final String expectedText) {
      super(injector, model);
      this.message = message;
      this.expectedText = expectedText;
    }
    
    @Override
    public void callbackSetValue(final Object value, final int offset, final int length) {
      Assert.assertTrue("value is not string", (value instanceof String));
      final String text = ((String) value).substring(offset, (offset + length));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.message);
      _builder.append(" doesn\'t match");
      Assert.assertEquals(_builder.toString(), this.expectedText, text);
      super.callbackSetValue(value, offset, length);
    }
  }
  
  @Override
  protected String modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("eventSD 2 [ c2 .. c1 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event2 3 [ 2 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event4 3 [ c1 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event3 4 ");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("commands");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("cmd0 23");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("cmd1 42");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("constants");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("c1 23");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("c2 42");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state A ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description \"<p>This is a deschkriptschion</p>\\n\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event2 => A");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event2 => B");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state B");
    _builder.newLine();
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    return StringUtils2.normalizeNewline(_builder.toString());
  }
  
  protected abstract String getFeatureName();
  
  protected void assertEdit(final EObject elementToEdit, final String expectedText, final String newText, final Object expectedResultElement) {
    this.assertEdit(elementToEdit, elementToEdit, this.getFeatureName(), expectedText, newText, expectedResultElement);
  }
  
  protected void assertEdit(final Object elementToEdit, final EObject fallbackContainer, final String expectedText, final String newText, final Object expectedResultElement) {
    this.assertEdit(elementToEdit, fallbackContainer, this.getFeatureName(), expectedText, newText, expectedResultElement);
  }
  
  protected void assertEdit(final Object elementToEdit, final EObject fallbackContainer, final String valueFeatureName, final String expectedText, final String newText, final Object expectedResultElement) {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final ATestFowlerdslCombined.TestXtextSiriusModelEditor editor = new ATestFowlerdslCombined.TestXtextSiriusModelEditor(descriptor);
    Injector _injector = this.getInjector();
    ATestFowlerdslCombined.AssertingXtextSiriusEditorCallback _assertingXtextSiriusEditorCallback = new ATestFowlerdslCombined.AssertingXtextSiriusEditorCallback(_injector, this.model, "expectedText", expectedText);
    editor.setCallback(_assertingXtextSiriusEditorCallback);
    editor.setValueFeatureName(valueFeatureName);
    EObject _xifexpression = null;
    if ((elementToEdit instanceof EObject)) {
      _xifexpression = ((EObject)elementToEdit);
    } else {
      _xifexpression = fallbackContainer;
    }
    final EObject commitTarget = _xifexpression;
    editor.setSemanticElement(commitTarget);
    editor.setFallbackContainer(fallbackContainer);
    editor.setValue(null);
    if ((newText != null)) {
      Injector _injector_1 = this.getInjector();
      ATestFowlerdslCombined.AssertingXtextSiriusEditorCallback _assertingXtextSiriusEditorCallback_1 = new ATestFowlerdslCombined.AssertingXtextSiriusEditorCallback(_injector_1, this.model, "newText", newText);
      editor.setCallback(_assertingXtextSiriusEditorCallback_1);
    } else {
      Injector _injector_2 = this.getInjector();
      ATestFowlerdslCombined.AssertingXtextSiriusEditorCallback _assertingXtextSiriusEditorCallback_2 = new ATestFowlerdslCombined.AssertingXtextSiriusEditorCallback(_injector_2, this.model, "newText", expectedText);
      editor.setCallback(_assertingXtextSiriusEditorCallback_2);
    }
    editor.setSemanticElement(commitTarget);
    editor.setValue(newText);
    final Object result = editor.commit(commitTarget);
    if ((expectedResultElement instanceof EObject)) {
      AssertEmf.assertModelEquals(((EObject)expectedResultElement), ((EObject) result));
    } else {
      if ((expectedResultElement instanceof List)) {
        AssertEmf.assertModelEquals(((List<EObject>)expectedResultElement), ((List<EObject>) result));
      }
    }
  }
  
  protected XtextSiriusModelDescriptor eventDescriptor() {
    Injector _inlineInjector = this.getInlineInjector();
    XtextDirectEditModelDescription _createXtextDirectEditModelDescription = this.diagramFactory.createXtextDirectEditModelDescription();
    final Procedure1<XtextDirectEditModelDescription> _function = (XtextDirectEditModelDescription it) -> {
    };
    XtextDirectEditModelDescription _doubleArrow = ObjectExtensions.<XtextDirectEditModelDescription>operator_doubleArrow(_createXtextDirectEditModelDescription, _function);
    return new XtextSiriusModelDescriptor(_inlineInjector, _doubleArrow);
  }
}
