package com.altran.general.integration.xtextsirius.ui.test.integration;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.ui.test.integration.ATestFowlerdsl;
import com.altran.general.integration.xtextsirius.ui.test.integration.TestXtextSiriusEditorCallbackAdapter;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.espilce.commons.emf.testsupport.AssertEmf;
import org.espilce.commons.lang.StringUtils2;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslEvent extends ATestFowlerdsl {
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
        ((TestXtextSiriusEditorCallbackAdapter) _callback_1).semanticElement = element;
      }
      super.setSemanticElement(element);
    }
  }
  
  protected static class AssertingXtextSiriusEditorCallback extends TestXtextSiriusEditorCallbackAdapter {
    private final String expectedText;
    
    public AssertingXtextSiriusEditorCallback(final Injector injector, final EObject model, final String expectedText) {
      super(injector, model);
      this.expectedText = expectedText;
    }
    
    @Override
    public void callbackSetValue(final Object value, final int offset, final int length) {
      Assert.assertTrue((value instanceof String));
      final String text = ((String) value).substring(offset, (offset + length));
      Assert.assertEquals(this.expectedText, text);
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
    _builder.append("event3 4 ");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("commands");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("cmd0 0");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("cmd1 1 [2]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("cmd2 2");
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
    _builder.append("c2 4");
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
  
  @Test
  public void asdf() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event3");
      it.setCode(5);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_last, 
      "", 
      "event3 4", 
      "event3 5", _doubleArrow);
  }
  
  protected void assertEdit(final EObject elementToEdit, final String valueFeatureName, final String expectedText, final String newText, final EObject expectedResultElement) {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final TestFowlerdslEvent.TestXtextSiriusModelEditor editor = new TestFowlerdslEvent.TestXtextSiriusModelEditor(descriptor);
    Injector _injector = this.getInjector();
    TestFowlerdslEvent.AssertingXtextSiriusEditorCallback _assertingXtextSiriusEditorCallback = new TestFowlerdslEvent.AssertingXtextSiriusEditorCallback(_injector, this.model, expectedText);
    editor.setCallback(_assertingXtextSiriusEditorCallback);
    editor.setSemanticElement(elementToEdit);
    editor.doSetValue("", valueFeatureName);
    Injector _injector_1 = this.getInjector();
    TestFowlerdslEvent.AssertingXtextSiriusEditorCallback _assertingXtextSiriusEditorCallback_1 = new TestFowlerdslEvent.AssertingXtextSiriusEditorCallback(_injector_1, this.model, newText);
    editor.setCallback(_assertingXtextSiriusEditorCallback_1);
    editor.setSemanticElement(elementToEdit);
    editor.doSetValue(newText, valueFeatureName);
    Object _commit = editor.commit(elementToEdit, valueFeatureName);
    final EObject result = ((EObject) _commit);
    AssertEmf.assertModelEquals(expectedResultElement, result);
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
