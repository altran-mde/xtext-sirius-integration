/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.editor.model;

import com.altran.general.integration.xtextsirius.test.editor.model.ATestFowlerdslModel;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.IntLiteral;
import org.eclipse.xtext.example.fowlerdsl.statemachine.RangeGuard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslEvent extends ATestFowlerdslModel {
  @Test
  public void unchanged() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event3");
      it.setCode(4);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_last, 
      "event3 4", 
      null, _doubleArrow);
  }
  
  @Test
  public void changeCode() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event3");
      it.setCode(5);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_last, 
      "event3 4", 
      "event3 5", _doubleArrow);
  }
  
  @Test
  public void changeName() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("eventX");
      it.setCode(4);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_last, 
      "event3 4", 
      "eventX 4", _doubleArrow);
  }
  
  @Test
  public void changeNameAndCode() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("eventX");
      it.setCode(5);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_last, 
      "event3 4", 
      "eventX 5", _doubleArrow);
  }
  
  @Test
  public void empty() {
    this.assertModelEdit(
      IterableExtensions.<Event>last(this.model.getEvents()), 
      "event3 4", 
      "", 
      null);
  }
  
  @Test
  public void unchangedGuard() {
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
    this.assertModelEdit(_get, 
      "event2 3 [ 2 ]", 
      null, _doubleArrow);
  }
  
  @Test
  public void changeNameGuard() {
    Event _get = this.model.getEvents().get(1);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("eventX");
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
    this.assertModelEdit(_get, 
      "event2 3 [ 2 ]", 
      "eventX 3 [ 2 ]", _doubleArrow);
  }
  
  @Test
  public void changeGuard() {
    Event _get = this.model.getEvents().get(1);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event2");
      it.setCode(3);
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_2 = (IntLiteral it_2) -> {
          it_2.setValue(3);
        };
        IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_get, 
      "event2 3 [ 2 ]", 
      "event2 3 [ 3 ]", _doubleArrow);
  }
  
  @Test
  public void removeGuard() {
    Event _get = this.model.getEvents().get(1);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event2");
      it.setCode(3);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_get, 
      "event2 3 [ 2 ]", 
      "event2 3", _doubleArrow);
  }
  
  @Test
  public void changeGuardRef() {
    Event _get = this.model.getEvents().get(1);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event2");
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
    this.assertModelEdit(_get, 
      "event2 3 [ 2 ]", 
      "event2 3 [ c1 ]", _doubleArrow);
  }
  
  @Test
  public void changeGuardDoubleRef() {
    Event _get = this.model.getEvents().get(1);
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("event2");
      it.setCode(3);
      RangeGuard _createRangeGuard = this.statemachineFactory.createRangeGuard();
      final Procedure1<RangeGuard> _function_1 = (RangeGuard it_1) -> {
        ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_2 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>head(this.model.getConstants()));
        };
        ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_2);
        it_1.setMin(_doubleArrow);
        ConstantRef _createConstantRef_1 = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_3 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>last(this.model.getConstants()));
        };
        ConstantRef _doubleArrow_1 = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef_1, _function_3);
        it_1.setMax(_doubleArrow_1);
      };
      RangeGuard _doubleArrow = ObjectExtensions.<RangeGuard>operator_doubleArrow(_createRangeGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_get, 
      "event2 3 [ 2 ]", 
      "event2 3 [c1..c2]", _doubleArrow);
  }
  
  @Test
  public void unchangedRangeGuard() {
    Event _head = IterableExtensions.<Event>head(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("eventSD");
      it.setCode(2);
      RangeGuard _createRangeGuard = this.statemachineFactory.createRangeGuard();
      final Procedure1<RangeGuard> _function_1 = (RangeGuard it_1) -> {
        ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_2 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>last(this.model.getConstants()));
        };
        ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_2);
        it_1.setMin(_doubleArrow);
        ConstantRef _createConstantRef_1 = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_3 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>head(this.model.getConstants()));
        };
        ConstantRef _doubleArrow_1 = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef_1, _function_3);
        it_1.setMax(_doubleArrow_1);
      };
      RangeGuard _doubleArrow = ObjectExtensions.<RangeGuard>operator_doubleArrow(_createRangeGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_head, 
      "eventSD 2 [ c2 .. c1 ]", 
      null, _doubleArrow);
  }
  
  @Test
  public void removeRangeGuard() {
    Event _head = IterableExtensions.<Event>head(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("eventSD");
      it.setCode(2);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_head, 
      "eventSD 2 [ c2 .. c1 ]", 
      "eventSD 2", _doubleArrow);
  }
  
  @Test
  public void changeRangeGuardToMin() {
    Event _head = IterableExtensions.<Event>head(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("eventSD");
      it.setCode(2);
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
    this.assertModelEdit(_head, 
      "eventSD 2 [ c2 .. c1 ]", 
      "eventSD 2 [c2]", _doubleArrow);
  }
  
  @Test
  public void changeRangeGuardToMax() {
    Event _head = IterableExtensions.<Event>head(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("eventSD");
      it.setCode(2);
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
    this.assertModelEdit(_head, 
      "eventSD 2 [ c2 .. c1 ]", 
      "eventSD 2 [c1]", _doubleArrow);
  }
  
  @Test
  public void changeRangeGuard() {
    Event _head = IterableExtensions.<Event>head(this.model.getEvents());
    Event _createEvent = this.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("eventSD");
      it.setCode(2);
      RangeGuard _createRangeGuard = this.statemachineFactory.createRangeGuard();
      final Procedure1<RangeGuard> _function_1 = (RangeGuard it_1) -> {
        ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_2 = (ConstantRef it_2) -> {
          it_2.setConstant(IterableExtensions.<Constant>last(this.model.getConstants()));
        };
        ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_2);
        it_1.setMin(_doubleArrow);
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_3 = (IntLiteral it_2) -> {
          it_2.setValue(5);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
        it_1.setMax(_doubleArrow_1);
      };
      RangeGuard _doubleArrow = ObjectExtensions.<RangeGuard>operator_doubleArrow(_createRangeGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Event _doubleArrow = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    this.assertModelEdit(_head, 
      "eventSD 2 [ c2 .. c1 ]", 
      "eventSD 2 [ c2 .. 5 ]", _doubleArrow);
  }
  
  @Override
  protected String getFeatureName() {
    return "";
  }
}
