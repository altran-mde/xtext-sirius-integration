package com.altran.general.integration.xtextsirius.ui.test.integration;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.ui.test.integration.ATestFowlerdsl;
import com.altran.general.integration.xtextsirius.ui.test.integration.TestXtextSiriusEditorCallbackAdapter;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Guard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.IntLiteral;
import org.eclipse.xtext.example.fowlerdsl.statemachine.RangeGuard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.espilce.commons.emf.testsupport.AssertEmf;
import org.espilce.commons.lang.StringUtils2;
import org.junit.Assert;
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
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final Event elementToEdit = IterableExtensions.<Event>last(this.model.getEvents());
    XtextSiriusModelEditor _xtextSiriusModelEditor = new XtextSiriusModelEditor(descriptor);
    final Procedure1<XtextSiriusModelEditor> _function = (XtextSiriusModelEditor it) -> {
      Injector _inlineInjector = this.getInlineInjector();
      it.setCallback(new TestXtextSiriusEditorCallbackAdapter(_inlineInjector, this.model) {
        @Override
        public void callbackInitText(final String value, final int offset, final int length) {
          Assert.assertEquals(29, offset);
          Assert.assertEquals(9, length);
          super.callbackInitText(value, offset, length);
        }
        
        @Override
        public EObject getTestSemanticElement() {
          return elementToEdit;
        }
      });
    };
    final XtextSiriusModelEditor editor = ObjectExtensions.<XtextSiriusModelEditor>operator_doubleArrow(_xtextSiriusModelEditor, _function);
    ModelEntryPoint _modelEntryPoint = new ModelEntryPoint(elementToEdit, "");
    editor.setModelEntryPoint(_modelEntryPoint);
    editor.initValue("eventX 33");
    Object _commit = editor.commit(elementToEdit);
    final Event result = ((Event) _commit);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function_1 = (Event it) -> {
      it.setName("eventX");
      it.setCode(33);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function_1);
    AssertEmf.assertModelEquals(_doubleArrow, result);
    final EObject rootContainer = EcoreUtil.getRootContainer(result);
    EcoreUtil.resolveAll(rootContainer);
    AssertEmf.assertModelEquals(
      this.modelLoader.parseModel(this.modelText().replace("event2 2", "eventX 33").replace("event2 => B", "eventX => B"), "test.statemachine"), rootContainer);
  }
  
  @Test
  public void event_guard_set() {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final Event elementToEdit = IterableExtensions.<Event>head(this.model.getEvents());
    XtextSiriusModelEditor _xtextSiriusModelEditor = new XtextSiriusModelEditor(descriptor);
    final Procedure1<XtextSiriusModelEditor> _function = (XtextSiriusModelEditor it) -> {
      Injector _inlineInjector = this.getInlineInjector();
      it.setCallback(new TestXtextSiriusEditorCallbackAdapter(_inlineInjector, this.model) {
        @Override
        public void callbackInitText(final String value, final int offset, final int length) {
          Assert.assertEquals(29, offset);
          Assert.assertEquals(9, length);
          super.callbackInitText(value, offset, length);
        }
        
        @Override
        public EObject getTestSemanticElement() {
          return elementToEdit;
        }
      });
    };
    final XtextSiriusModelEditor editor = ObjectExtensions.<XtextSiriusModelEditor>operator_doubleArrow(_xtextSiriusModelEditor, _function);
    ModelEntryPoint _modelEntryPoint = new ModelEntryPoint(elementToEdit, "guard");
    editor.setModelEntryPoint(_modelEntryPoint);
    editor.initValue("2");
    Object _commit = editor.commit(elementToEdit);
    final Statemachine result = ((Statemachine) _commit);
    final Event valueToCommit = IterableExtensions.<Event>head(result.getEvents());
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function_1 = (ValueGuard it) -> {
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(2);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
    AssertEmf.assertModelEquals(_doubleArrow, valueToCommit);
    final EObject rootContainer = EcoreUtil.getRootContainer(valueToCommit);
    EcoreUtil.resolveAll(rootContainer);
    AssertEmf.assertModelEquals(
      this.modelLoader.parseModel(this.modelText().replace("[c1..22]", "[2]"), "test.statemachine"), rootContainer);
  }
  
  @Test
  public void event_guard_unset() {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final Event elementToEdit = IterableExtensions.<Event>last(this.model.getEvents());
    XtextSiriusModelEditor _xtextSiriusModelEditor = new XtextSiriusModelEditor(descriptor);
    final Procedure1<XtextSiriusModelEditor> _function = (XtextSiriusModelEditor it) -> {
      Injector _inlineInjector = this.getInlineInjector();
      it.setCallback(new TestXtextSiriusEditorCallbackAdapter(_inlineInjector, this.model) {
        @Override
        public void callbackInitText(final String value, final int offset, final int length) {
          Assert.assertEquals(37, offset);
          Assert.assertEquals(0, length);
          super.callbackInitText(value, offset, length);
        }
        
        @Override
        public EObject getTestSemanticElement() {
          return elementToEdit;
        }
      });
    };
    final XtextSiriusModelEditor editor = ObjectExtensions.<XtextSiriusModelEditor>operator_doubleArrow(_xtextSiriusModelEditor, _function);
    ModelEntryPoint _modelEntryPoint = new ModelEntryPoint(elementToEdit, "guard");
    editor.setModelEntryPoint(_modelEntryPoint);
    editor.initValue("");
    Object _commit = editor.commit(elementToEdit);
    final Statemachine result = ((Statemachine) _commit);
    final Event valueToCommit = IterableExtensions.<Event>last(result.getEvents());
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function_1 = (ValueGuard it) -> {
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(2);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
    AssertEmf.assertModelEquals(_doubleArrow, valueToCommit);
    final EObject rootContainer = EcoreUtil.getRootContainer(valueToCommit);
    EcoreUtil.resolveAll(rootContainer);
    AssertEmf.assertModelEquals(
      this.modelLoader.parseModel(this.modelText().replace("event2 2", "event2 2 [2]"), "test.statemachine"), rootContainer);
  }
  
  @Test
  public void statemachine_events_set() {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final Statemachine elementToEdit = this.model;
    XtextSiriusModelEditor _xtextSiriusModelEditor = new XtextSiriusModelEditor(descriptor);
    final Procedure1<XtextSiriusModelEditor> _function = (XtextSiriusModelEditor it) -> {
      Injector _inlineInjector = this.getInlineInjector();
      it.setCallback(new TestXtextSiriusEditorCallbackAdapter(_inlineInjector, this.model) {
        @Override
        public void callbackInitText(final String value, final int offset, final int length) {
          Assert.assertEquals(10, offset);
          Assert.assertEquals(30, length);
          super.callbackInitText(value, offset, length);
        }
        
        @Override
        public EObject getTestSemanticElement() {
          return elementToEdit;
        }
      });
    };
    final XtextSiriusModelEditor editor = ObjectExtensions.<XtextSiriusModelEditor>operator_doubleArrow(_xtextSiriusModelEditor, _function);
    ModelEntryPoint _modelEntryPoint = new ModelEntryPoint(elementToEdit, "events");
    editor.setModelEntryPoint(_modelEntryPoint);
    editor.initValue("event 1 [ .. 22 ] event2 2");
    Object _commit = editor.commit(elementToEdit);
    final Statemachine result = ((Statemachine) _commit);
    final Statemachine valueToCommit = result;
    final EObject rootContainer = EcoreUtil.getRootContainer(valueToCommit);
    EcoreUtil.resolveAll(rootContainer);
    AssertEmf.assertModelEquals(
      this.modelLoader.parseModel(this.modelText(), "test.statemachine"), rootContainer);
  }
  
  @Test
  public void statemachine_events_unset() {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    this.model.getEvents().clear();
    final Statemachine elementToEdit = this.model;
    XtextSiriusModelEditor _xtextSiriusModelEditor = new XtextSiriusModelEditor(descriptor);
    final Procedure1<XtextSiriusModelEditor> _function = (XtextSiriusModelEditor it) -> {
      Injector _inlineInjector = this.getInlineInjector();
      it.setCallback(new TestXtextSiriusEditorCallbackAdapter(_inlineInjector, this.model) {
        @Override
        public void callbackInitText(final String value, final int offset, final int length) {
          Assert.assertEquals(10, offset);
          Assert.assertEquals(0, length);
          super.callbackInitText(value, offset, length);
        }
        
        @Override
        public EObject getTestSemanticElement() {
          return elementToEdit;
        }
      });
    };
    final XtextSiriusModelEditor editor = ObjectExtensions.<XtextSiriusModelEditor>operator_doubleArrow(_xtextSiriusModelEditor, _function);
    ModelEntryPoint _modelEntryPoint = new ModelEntryPoint(elementToEdit, "events");
    editor.setModelEntryPoint(_modelEntryPoint);
    editor.initValue("event 1 [ .. 22 ] event2 2");
    Object _commit = editor.commit(elementToEdit);
    final Statemachine result = ((Statemachine) _commit);
    final Statemachine valueToCommit = result;
    final EObject rootContainer = EcoreUtil.getRootContainer(valueToCommit);
    EcoreUtil.resolveAll(rootContainer);
    AssertEmf.assertModelEquals(
      this.modelLoader.parseModel(this.modelText(), "test.statemachine"), rootContainer);
  }
  
  @Test
  public void guard_empty_set() {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final Guard elementToEdit = IterableExtensions.<Event>head(this.model.getEvents()).getGuard();
    XtextSiriusModelEditor _xtextSiriusModelEditor = new XtextSiriusModelEditor(descriptor);
    final Procedure1<XtextSiriusModelEditor> _function = (XtextSiriusModelEditor it) -> {
      Injector _inlineInjector = this.getInlineInjector();
      it.setCallback(new TestXtextSiriusEditorCallbackAdapter(_inlineInjector, this.model) {
        @Override
        public void callbackInitText(final String value, final int offset, final int length) {
          Assert.assertEquals(20, offset);
          Assert.assertEquals(9, length);
          super.callbackInitText(value, offset, length);
        }
        
        @Override
        public EObject getTestSemanticElement() {
          return elementToEdit;
        }
      });
    };
    final XtextSiriusModelEditor editor = ObjectExtensions.<XtextSiriusModelEditor>operator_doubleArrow(_xtextSiriusModelEditor, _function);
    ModelEntryPoint _modelEntryPoint = new ModelEntryPoint(elementToEdit, "");
    editor.setModelEntryPoint(_modelEntryPoint);
    editor.initValue("2");
    Object _commit = editor.commit(elementToEdit);
    final Statemachine result = ((Statemachine) _commit);
    final Event valueToCommit = IterableExtensions.<Event>head(result.getEvents());
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function_1 = (ValueGuard it) -> {
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(2);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
    AssertEmf.assertModelEquals(_doubleArrow, valueToCommit);
    final EObject rootContainer = EcoreUtil.getRootContainer(valueToCommit);
    EcoreUtil.resolveAll(rootContainer);
    AssertEmf.assertModelEquals(
      this.modelLoader.parseModel(this.modelText().replace("[c1..22]", "[2]"), "test.statemachine"), rootContainer);
  }
  
  @Test
  public void guard_empty_unset() {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final Event container = IterableExtensions.<Event>last(this.model.getEvents());
    final Guard elementToEdit = container.getGuard();
    XtextSiriusModelEditor _xtextSiriusModelEditor = new XtextSiriusModelEditor(descriptor);
    final Procedure1<XtextSiriusModelEditor> _function = (XtextSiriusModelEditor it) -> {
      Injector _inlineInjector = this.getInlineInjector();
      it.setCallback(new TestXtextSiriusEditorCallbackAdapter(_inlineInjector, this.model) {
        @Override
        public void callbackInitText(final String value, final int offset, final int length) {
          Assert.assertEquals(37, offset);
          Assert.assertEquals(0, length);
          super.callbackInitText(value, offset, length);
        }
        
        @Override
        public EObject getTestSemanticElement() {
          return container;
        }
      });
    };
    final XtextSiriusModelEditor editor = ObjectExtensions.<XtextSiriusModelEditor>operator_doubleArrow(_xtextSiriusModelEditor, _function);
    ModelEntryPoint _modelEntryPoint = new ModelEntryPoint(elementToEdit, container, "");
    editor.setModelEntryPoint(_modelEntryPoint);
    editor.initValue("");
    Object _commit = editor.commit(container);
    final Statemachine result = ((Statemachine) _commit);
    final Event valueToCommit = IterableExtensions.<Event>last(result.getEvents());
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function_1 = (ValueGuard it) -> {
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(2);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
    AssertEmf.assertModelEquals(_doubleArrow, valueToCommit);
    final EObject rootContainer = EcoreUtil.getRootContainer(valueToCommit);
    EcoreUtil.resolveAll(rootContainer);
    AssertEmf.assertModelEquals(
      this.modelLoader.parseModel(this.modelText().replace("event2 2", "event2 2 [2]"), "test.statemachine"), rootContainer);
  }
  
  @Test
  public void eventNoEdit() {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final Event elementToEdit = IterableExtensions.<Event>head(this.model.getEvents());
    XtextSiriusModelEditor _xtextSiriusModelEditor = new XtextSiriusModelEditor(descriptor);
    final Procedure1<XtextSiriusModelEditor> _function = (XtextSiriusModelEditor it) -> {
      Injector _inlineInjector = this.getInlineInjector();
      it.setCallback(new TestXtextSiriusEditorCallbackAdapter(_inlineInjector, this.model) {
        @Override
        public void callbackInitText(final String value, final int offset, final int length) {
          final String newContent = value.toString();
          Assert.assertEquals(TestFowlerdslIntegration.this.modelInlineText().toString().replace("events\n event", "events\n \nevent"), newContent);
          Assert.assertEquals(10, offset);
          Assert.assertEquals(17, length);
          super.callbackInitText(value, offset, length);
        }
        
        @Override
        public EObject getTestSemanticElement() {
          return elementToEdit;
        }
      });
    };
    final XtextSiriusModelEditor editor = ObjectExtensions.<XtextSiriusModelEditor>operator_doubleArrow(_xtextSiriusModelEditor, _function);
    String _name = elementToEdit.eContainingFeature().getName();
    ModelEntryPoint _modelEntryPoint = new ModelEntryPoint(elementToEdit, _name);
    editor.setModelEntryPoint(_modelEntryPoint);
    editor.initValue("");
    Object _commit = editor.commit(elementToEdit.eContainer());
    final Statemachine result = ((Statemachine) _commit);
    final Event valueToCommit = IterableExtensions.<Event>head(result.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function_1 = (Event it) -> {
      it.setName("event");
      it.setCode(1);
      RangeGuard _createRangeGuard = this.statemachineFactory.createRangeGuard();
      final Procedure1<RangeGuard> _function_2 = (RangeGuard it_1) -> {
        ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_3 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>head(this.model.getConstants()));
        };
        ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_3);
        it_1.setMin(_doubleArrow);
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_4 = (IntLiteral it_2) -> {
          it_2.setValue(22);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
        it_1.setMax(_doubleArrow_1);
      };
      RangeGuard _doubleArrow = ObjectExtensions.<RangeGuard>operator_doubleArrow(_createRangeGuard, _function_2);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function_1);
    AssertEmf.assertModelEquals(_doubleArrow, valueToCommit);
    final EObject rootContainer = EcoreUtil.getRootContainer(valueToCommit);
    EcoreUtil.resolveAll(rootContainer);
    AssertEmf.assertModelEquals(this.parseModel(), rootContainer);
  }
  
  @Test
  public void eventEdit() {
    final XtextSiriusModelDescriptor descriptor = this.eventDescriptor();
    final String editText = this.modelInlineText().toString().replace("events\n event", "events\n \nevent");
    final Event elementToEdit = IterableExtensions.<Event>head(this.model.getEvents());
    XtextSiriusModelEditor _xtextSiriusModelEditor = new XtextSiriusModelEditor(descriptor);
    final Procedure1<XtextSiriusModelEditor> _function = (XtextSiriusModelEditor it) -> {
      Injector _injector = this.getInjector();
      it.setCallback(new TestXtextSiriusEditorCallbackAdapter(_injector, this.model) {
        @Override
        public IParseResult getXtextParseResult() {
          IParseResult _xblockexpression = null;
          {
            this.fakeResource.update(10, 17, "avenT 11 [33..c2]");
            _xblockexpression = super.getXtextParseResult();
          }
          return _xblockexpression;
        }
        
        @Override
        public EObject getTestSemanticElement() {
          return elementToEdit;
        }
      });
    };
    final XtextSiriusModelEditor editor = ObjectExtensions.<XtextSiriusModelEditor>operator_doubleArrow(_xtextSiriusModelEditor, _function);
    ModelEntryPoint _modelEntryPoint = new ModelEntryPoint(elementToEdit, "");
    editor.setModelEntryPoint(_modelEntryPoint);
    editor.initValue("");
    Object _commit = editor.commit(elementToEdit);
    final EObject valueToCommit = ((EObject) _commit);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function_1 = (Event it) -> {
      it.setName("avenT");
      it.setCode(11);
      RangeGuard _createRangeGuard = this.statemachineFactory.createRangeGuard();
      final Procedure1<RangeGuard> _function_2 = (RangeGuard it_1) -> {
        ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_3 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>head(this.model.getConstants()));
        };
        ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_3);
        it_1.setMin(_doubleArrow);
        ConstantRef _createConstantRef_1 = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_4 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>last(this.model.getConstants()));
        };
        ConstantRef _doubleArrow_1 = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef_1, _function_4);
        it_1.setMax(_doubleArrow_1);
      };
      RangeGuard _doubleArrow = ObjectExtensions.<RangeGuard>operator_doubleArrow(_createRangeGuard, _function_2);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function_1);
    AssertEmf.assertModelEquals(_doubleArrow, valueToCommit);
    final EObject rootContainer = EcoreUtil.getRootContainer(valueToCommit);
    EcoreUtil.resolveAll(rootContainer);
    AssertEmf.assertModelEquals(
      this.modelLoader.parseModel(this.modelText().replace("event 1 [c1..22]", "avenT 11 [c1..c2]").replace("event => A", "avenT => A"), "test.statemachine"), rootContainer);
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
