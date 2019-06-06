package com.altran.general.integration.xtextsirius.ui.test.integration;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.ui.test.integration.ATestFowlerdsl;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.espilce.commons.lang.StringUtils2;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
@SuppressWarnings("all")
public class TestFowlerdslIntegration extends ATestFowlerdsl {
  @Override
  protected String modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event 1 [c1..22]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event2 2");
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
    _builder.append("event => A");
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
  
  protected String modelInlineText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("events");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event 1 [ .. 22 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event2 2");
    _builder.newLine();
    _builder.append("end constants");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("c1 23");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("c2 42");
    _builder.newLine();
    _builder.append("end state A ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description \"<p>This is a deschkriptschion</p>\\n\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event => A");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event2 => B");
    _builder.newLine();
    _builder.append("end state B");
    _builder.newLine();
    _builder.newLine();
    _builder.append("end");
    return StringUtils2.normalizeNewline(_builder.toString());
  }
  
  @Test
  public void event_empty() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method semanticElement(Event) is undefined"
      + "\nThe method valueFeatureName(String) is undefined for the type XtextSiriusModelEditor"
      + "\nThe method callbackInitValue(Object, int, int) is undefined for the type TestXtextSiriusEditorCallbackAdapter"
      + "\nThe anonymous subclass of TestXtextSiriusEditorCallbackAdapter does not implement callbackGetText()"
      + "\nThe method callbackSetValue(Object, int, int) of type new TestXtextSiriusEditorCallbackAdapter(){} must override a superclass method.");
  }
  
  @Test
  public void event_guard_set() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method semanticElement(Event) is undefined"
      + "\nThe method valueFeatureName(String) is undefined for the type XtextSiriusModelEditor"
      + "\nThe method callbackInitValue(Object, int, int) is undefined for the type TestXtextSiriusEditorCallbackAdapter"
      + "\nThe anonymous subclass of TestXtextSiriusEditorCallbackAdapter does not implement callbackGetText()"
      + "\nThe method callbackSetValue(Object, int, int) of type new TestXtextSiriusEditorCallbackAdapter(){} must override a superclass method.");
  }
  
  @Test
  public void event_guard_unset() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method semanticElement(Event) is undefined"
      + "\nThe method valueFeatureName(String) is undefined for the type XtextSiriusModelEditor"
      + "\nThe method callbackInitValue(Object, int, int) is undefined for the type TestXtextSiriusEditorCallbackAdapter"
      + "\nThe anonymous subclass of TestXtextSiriusEditorCallbackAdapter does not implement callbackGetText()"
      + "\nThe method callbackSetValue(Object, int, int) of type new TestXtextSiriusEditorCallbackAdapter(){} must override a superclass method.");
  }
  
  @Test
  public void statemachine_events_set() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method semanticElement(Statemachine) is undefined"
      + "\nThe method valueFeatureName(String) is undefined for the type XtextSiriusModelEditor"
      + "\nThe method callbackInitValue(Object, int, int) is undefined for the type TestXtextSiriusEditorCallbackAdapter"
      + "\nThe anonymous subclass of TestXtextSiriusEditorCallbackAdapter does not implement callbackGetText()"
      + "\nThe method callbackSetValue(Object, int, int) of type new TestXtextSiriusEditorCallbackAdapter(){} must override a superclass method.");
  }
  
  @Test
  public void statemachine_events_unset() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method semanticElement(Statemachine) is undefined"
      + "\nThe method valueFeatureName(String) is undefined for the type XtextSiriusModelEditor"
      + "\nThe method callbackInitValue(Object, int, int) is undefined for the type TestXtextSiriusEditorCallbackAdapter"
      + "\nThe anonymous subclass of TestXtextSiriusEditorCallbackAdapter does not implement callbackGetText()"
      + "\nThe method callbackSetValue(Object, int, int) of type new TestXtextSiriusEditorCallbackAdapter(){} must override a superclass method.");
  }
  
  @Test
  public void guard_empty_set() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method semanticElement(Guard) is undefined"
      + "\nThe method valueFeatureName(String) is undefined for the type XtextSiriusModelEditor"
      + "\nThe method callbackInitValue(Object, int, int) is undefined for the type TestXtextSiriusEditorCallbackAdapter"
      + "\nThe anonymous subclass of TestXtextSiriusEditorCallbackAdapter does not implement callbackGetText()"
      + "\nThe method callbackSetValue(Object, int, int) of type new TestXtextSiriusEditorCallbackAdapter(){} must override a superclass method.");
  }
  
  @Test
  public void guard_empty_unset() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fallbackContainer(Event) is undefined"
      + "\nThe method semanticElement(Guard) is undefined"
      + "\nThe method valueFeatureName(String) is undefined for the type XtextSiriusModelEditor"
      + "\nThe method callbackInitValue(Object, int, int) is undefined for the type TestXtextSiriusEditorCallbackAdapter"
      + "\nThe anonymous subclass of TestXtextSiriusEditorCallbackAdapter does not implement callbackGetText()"
      + "\nThe method callbackSetValue(Object, int, int) of type new TestXtextSiriusEditorCallbackAdapter(){} must override a superclass method.");
  }
  
  @Test
  public void eventNoEdit() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method semanticElement(Event) is undefined"
      + "\nThe method valueFeatureName(String) is undefined for the type XtextSiriusModelEditor"
      + "\nThe method callbackInitValue(Object, int, int) is undefined for the type TestXtextSiriusEditorCallbackAdapter"
      + "\nThe anonymous subclass of TestXtextSiriusEditorCallbackAdapter does not implement callbackGetText()"
      + "\nThe method callbackSetValue(Object, int, int) of type new TestXtextSiriusEditorCallbackAdapter(){} must override a superclass method.");
  }
  
  @Test
  public void eventEdit() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method semanticElement(Event) is undefined"
      + "\nThe method valueFeatureName(String) is undefined for the type XtextSiriusModelEditor"
      + "\nThe anonymous subclass of TestXtextSiriusEditorCallbackAdapter does not implement callbackGetText()");
  }
  
  protected XtextSiriusModelDescriptor eventDescriptor() {
    Injector _inlineInjector = this.getInlineInjector();
    XtextDirectEditModelDescription _createXtextDirectEditModelDescription = this.diagramFactory.createXtextDirectEditModelDescription();
    final Procedure1<XtextDirectEditModelDescription> _function = (XtextDirectEditModelDescription it) -> {
      EList<String> _ignoredNestedFeatures = it.getIgnoredNestedFeatures();
      _ignoredNestedFeatures.add("guard.min");
      EList<String> _selectedFeatures = it.getSelectedFeatures();
      _selectedFeatures.add("Event.name");
    };
    XtextDirectEditModelDescription _doubleArrow = ObjectExtensions.<XtextDirectEditModelDescription>operator_doubleArrow(_createXtextDirectEditModelDescription, _function);
    return new XtextSiriusModelDescriptor(_inlineInjector, _doubleArrow);
  }
}
