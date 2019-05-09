package com.altran.general.integration.xtextsirius.ui.test.integration;

import com.altran.general.integration.xtextsirius.ui.test.integration.ATestFowlerdslCombined;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.IntLiteral;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslEventGuard extends ATestFowlerdslCombined {
  @Test
  public void emptyUnchanged() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event3");
      it.setCode(4);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_last, 
      "", 
      null, _doubleArrow);
  }
  
  @Test
  public void emptyAdd() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event3");
      it.setCode(4);
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_2 = (IntLiteral it_2) -> {
          it_2.setValue(5);
        };
        IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_last, 
      "", 
      "5", _doubleArrow);
  }
  
  @Test
  public void existingUnchanged() {
    Event _get = this.model.getEvents().get(1);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event2");
      it.setCode(3);
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_2 = (IntLiteral it_2) -> {
          it_2.setValue(2);
        };
        IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_get, 
      "2", 
      null, _doubleArrow);
  }
  
  @Test
  public void existingEmpty() {
    Event _get = this.model.getEvents().get(1);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event2");
      it.setCode(3);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_get, 
      "2", 
      "", _doubleArrow);
  }
  
  @Test
  public void existingChange() {
    Event _get = this.model.getEvents().get(1);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event2");
      it.setCode(3);
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_2 = (IntLiteral it_2) -> {
          it_2.setValue(5);
        };
        IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_get, 
      "2", 
      "5", _doubleArrow);
  }
  
  @Test
  public void emptyAddRef() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event3");
      it.setCode(4);
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_2 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>last(this.model.getConstants()));
        };
        ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_last, 
      "", 
      "c2", _doubleArrow);
  }
  
  @Test
  public void refUnchanged() {
    Event _get = this.model.getEvents().get(2);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event4");
      it.setCode(3);
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_2 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>head(this.model.getConstants()));
        };
        ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_get, 
      "c1", 
      null, _doubleArrow);
  }
  
  @Test
  public void refEmpty() {
    Event _get = this.model.getEvents().get(2);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event4");
      it.setCode(3);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_get, 
      "c1", 
      "", _doubleArrow);
  }
  
  @Test
  public void refChange() {
    Event _get = this.model.getEvents().get(2);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event4");
      it.setCode(3);
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_2 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>last(this.model.getConstants()));
        };
        ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertEdit(_get, 
      "c1", 
      "c2", _doubleArrow);
  }
  
  @Override
  protected String getFeatureName() {
    return "guard";
  }
}
