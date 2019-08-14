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
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.IntLiteral;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Thing;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslState extends ATestFowlerdslModel {
  @Override
  protected CharSequence modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("state A things t1 1 t2 2 end");
    _builder.newLine();
    return _builder;
  }
  
  @Test
  public void unchanged() {
    State _last = IterableExtensions.<State>last(this.model.getStates());
    State _createState = this.statemachineFactory.createState();
    final Procedure1<State> _function = (State it) -> {
      it.setName("A");
      EList<Thing> _things = it.getThings();
      Thing _createThing = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_1 = (Thing it_1) -> {
        it_1.setName("t1");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_2 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_3 = (IntLiteral it_3) -> {
            it_3.setValue(1);
          };
          IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
          it_2.setCond(_doubleArrow);
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
        it_1.setGuard(_doubleArrow);
      };
      Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function_1);
      _things.add(_doubleArrow);
      EList<Thing> _things_1 = it.getThings();
      Thing _createThing_1 = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_2 = (Thing it_1) -> {
        it_1.setName("t2");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_3 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_4 = (IntLiteral it_3) -> {
            it_3.setValue(2);
          };
          IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
          it_2.setCond(_doubleArrow_1);
        };
        ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
        it_1.setGuard(_doubleArrow_1);
      };
      Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_2);
      _things_1.add(_doubleArrow_1);
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function);
    this.assertModelEdit(_last, 
      this.model, 
      "state A things t1 1 t2 2 end", 
      null, _doubleArrow);
  }
  
  @Test
  public void empty() {
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      this.model, 
      "state A things t1 1 t2 2 end", 
      null, 
      null);
  }
  
  @Test
  public void changeFirst() {
    State _last = IterableExtensions.<State>last(this.model.getStates());
    State _createState = this.statemachineFactory.createState();
    final Procedure1<State> _function = (State it) -> {
      it.setName("A");
      EList<Thing> _things = it.getThings();
      Thing _createThing = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_1 = (Thing it_1) -> {
        it_1.setName("t3");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_2 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_3 = (IntLiteral it_3) -> {
            it_3.setValue(3);
          };
          IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
          it_2.setCond(_doubleArrow);
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
        it_1.setGuard(_doubleArrow);
      };
      Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function_1);
      _things.add(_doubleArrow);
      EList<Thing> _things_1 = it.getThings();
      Thing _createThing_1 = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_2 = (Thing it_1) -> {
        it_1.setName("t2");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_3 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_4 = (IntLiteral it_3) -> {
            it_3.setValue(2);
          };
          IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
          it_2.setCond(_doubleArrow_1);
        };
        ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
        it_1.setGuard(_doubleArrow_1);
      };
      Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_2);
      _things_1.add(_doubleArrow_1);
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function);
    this.assertModelEdit(_last, 
      this.model, 
      "state A things t1 1 t2 2 end", 
      "state A things t3 3 t2 2 end", _doubleArrow);
  }
  
  @Test
  public void changeBoth() {
    State _last = IterableExtensions.<State>last(this.model.getStates());
    State _createState = this.statemachineFactory.createState();
    final Procedure1<State> _function = (State it) -> {
      it.setName("A");
      EList<Thing> _things = it.getThings();
      Thing _createThing = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_1 = (Thing it_1) -> {
        it_1.setName("t2");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_2 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_3 = (IntLiteral it_3) -> {
            it_3.setValue(2);
          };
          IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
          it_2.setCond(_doubleArrow);
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
        it_1.setGuard(_doubleArrow);
      };
      Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function_1);
      _things.add(_doubleArrow);
      EList<Thing> _things_1 = it.getThings();
      Thing _createThing_1 = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_2 = (Thing it_1) -> {
        it_1.setName("t3");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_3 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_4 = (IntLiteral it_3) -> {
            it_3.setValue(3);
          };
          IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
          it_2.setCond(_doubleArrow_1);
        };
        ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
        it_1.setGuard(_doubleArrow_1);
      };
      Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_2);
      _things_1.add(_doubleArrow_1);
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function);
    this.assertModelEdit(_last, 
      this.model, 
      "state A things t1 1 t2 2 end", 
      "state A things t2 2 t3 3 end", _doubleArrow);
  }
  
  @Test
  public void removeLast() {
    State _last = IterableExtensions.<State>last(this.model.getStates());
    State _createState = this.statemachineFactory.createState();
    final Procedure1<State> _function = (State it) -> {
      it.setName("A");
      EList<Thing> _things = it.getThings();
      Thing _createThing = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_1 = (Thing it_1) -> {
        it_1.setName("t1");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_2 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_3 = (IntLiteral it_3) -> {
            it_3.setValue(1);
          };
          IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
          it_2.setCond(_doubleArrow);
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
        it_1.setGuard(_doubleArrow);
      };
      Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function_1);
      _things.add(_doubleArrow);
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function);
    this.assertModelEdit(_last, 
      this.model, 
      "state A things t1 1 t2 2 end", 
      "state A things t1 1 end", _doubleArrow);
  }
  
  @Test
  public void removeFirst() {
    State _last = IterableExtensions.<State>last(this.model.getStates());
    State _createState = this.statemachineFactory.createState();
    final Procedure1<State> _function = (State it) -> {
      it.setName("A");
      EList<Thing> _things = it.getThings();
      Thing _createThing = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_1 = (Thing it_1) -> {
        it_1.setName("t2");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_2 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_3 = (IntLiteral it_3) -> {
            it_3.setValue(2);
          };
          IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
          it_2.setCond(_doubleArrow);
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
        it_1.setGuard(_doubleArrow);
      };
      Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function_1);
      _things.add(_doubleArrow);
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function);
    this.assertModelEdit(_last, 
      this.model, 
      "state A things t1 1 t2 2 end", 
      "state A things t2 2 end", _doubleArrow);
  }
  
  @Test
  public void replace() {
    State _last = IterableExtensions.<State>last(this.model.getStates());
    State _createState = this.statemachineFactory.createState();
    final Procedure1<State> _function = (State it) -> {
      it.setName("A");
      EList<Thing> _things = it.getThings();
      Thing _createThing = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_1 = (Thing it_1) -> {
        it_1.setName("t3");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_2 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_3 = (IntLiteral it_3) -> {
            it_3.setValue(3);
          };
          IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
          it_2.setCond(_doubleArrow);
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
        it_1.setGuard(_doubleArrow);
      };
      Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function_1);
      _things.add(_doubleArrow);
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function);
    this.assertModelEdit(_last, 
      this.model, 
      "state A things t1 1 t2 2 end", 
      "state A things t3 3 end", _doubleArrow);
  }
  
  @Test
  public void replaceMove() {
    State _last = IterableExtensions.<State>last(this.model.getStates());
    State _createState = this.statemachineFactory.createState();
    final Procedure1<State> _function = (State it) -> {
      it.setName("A");
      EList<Thing> _things = it.getThings();
      Thing _createThing = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_1 = (Thing it_1) -> {
        it_1.setName("t3");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_2 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_3 = (IntLiteral it_3) -> {
            it_3.setValue(3);
          };
          IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
          it_2.setCond(_doubleArrow);
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
        it_1.setGuard(_doubleArrow);
      };
      Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function_1);
      _things.add(_doubleArrow);
      EList<Thing> _things_1 = it.getThings();
      Thing _createThing_1 = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_2 = (Thing it_1) -> {
        it_1.setName("t1");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_3 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_4 = (IntLiteral it_3) -> {
            it_3.setValue(1);
          };
          IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
          it_2.setCond(_doubleArrow_1);
        };
        ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
        it_1.setGuard(_doubleArrow_1);
      };
      Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_2);
      _things_1.add(_doubleArrow_1);
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function);
    this.assertModelEdit(_last, 
      this.model, 
      "state A things t1 1 t2 2 end", 
      "state A things t3 3 t1 1 end", _doubleArrow);
  }
  
  @Test
  public void insertFirst() {
    State _last = IterableExtensions.<State>last(this.model.getStates());
    State _createState = this.statemachineFactory.createState();
    final Procedure1<State> _function = (State it) -> {
      it.setName("A");
      EList<Thing> _things = it.getThings();
      Thing _createThing = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_1 = (Thing it_1) -> {
        it_1.setName("t3");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_2 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_3 = (IntLiteral it_3) -> {
            it_3.setValue(3);
          };
          IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
          it_2.setCond(_doubleArrow);
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
        it_1.setGuard(_doubleArrow);
      };
      Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function_1);
      _things.add(_doubleArrow);
      EList<Thing> _things_1 = it.getThings();
      Thing _createThing_1 = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_2 = (Thing it_1) -> {
        it_1.setName("t1");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_3 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_4 = (IntLiteral it_3) -> {
            it_3.setValue(1);
          };
          IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
          it_2.setCond(_doubleArrow_1);
        };
        ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
        it_1.setGuard(_doubleArrow_1);
      };
      Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_2);
      _things_1.add(_doubleArrow_1);
      EList<Thing> _things_2 = it.getThings();
      Thing _createThing_2 = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_3 = (Thing it_1) -> {
        it_1.setName("t2");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_4 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_5 = (IntLiteral it_3) -> {
            it_3.setValue(2);
          };
          IntLiteral _doubleArrow_2 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_5);
          it_2.setCond(_doubleArrow_2);
        };
        ValueGuard _doubleArrow_2 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_4);
        it_1.setGuard(_doubleArrow_2);
      };
      Thing _doubleArrow_2 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_2, _function_3);
      _things_2.add(_doubleArrow_2);
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function);
    this.assertModelEdit(_last, 
      this.model, 
      "state A things t1 1 t2 2 end", 
      "state A things t3 3 t1 1 t2 2 end", _doubleArrow);
  }
  
  @Test
  public void insertLast() {
    State _last = IterableExtensions.<State>last(this.model.getStates());
    State _createState = this.statemachineFactory.createState();
    final Procedure1<State> _function = (State it) -> {
      it.setName("A");
      EList<Thing> _things = it.getThings();
      Thing _createThing = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_1 = (Thing it_1) -> {
        it_1.setName("t1");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_2 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_3 = (IntLiteral it_3) -> {
            it_3.setValue(1);
          };
          IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
          it_2.setCond(_doubleArrow);
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
        it_1.setGuard(_doubleArrow);
      };
      Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function_1);
      _things.add(_doubleArrow);
      EList<Thing> _things_1 = it.getThings();
      Thing _createThing_1 = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_2 = (Thing it_1) -> {
        it_1.setName("t2");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_3 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_4 = (IntLiteral it_3) -> {
            it_3.setValue(2);
          };
          IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
          it_2.setCond(_doubleArrow_1);
        };
        ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
        it_1.setGuard(_doubleArrow_1);
      };
      Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_2);
      _things_1.add(_doubleArrow_1);
      EList<Thing> _things_2 = it.getThings();
      Thing _createThing_2 = this.statemachineFactory.createThing();
      final Procedure1<Thing> _function_3 = (Thing it_1) -> {
        it_1.setName("t3");
        ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function_4 = (ValueGuard it_2) -> {
          IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
          final Procedure1<IntLiteral> _function_5 = (IntLiteral it_3) -> {
            it_3.setValue(3);
          };
          IntLiteral _doubleArrow_2 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_5);
          it_2.setCond(_doubleArrow_2);
        };
        ValueGuard _doubleArrow_2 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_4);
        it_1.setGuard(_doubleArrow_2);
      };
      Thing _doubleArrow_2 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_2, _function_3);
      _things_2.add(_doubleArrow_2);
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function);
    this.assertModelEdit(_last, 
      this.model, 
      "state A things t1 1 t2 2 end", 
      "state A things t1 1 t2 2 t3 3 end", _doubleArrow);
  }
  
  @Override
  protected String getFeatureName() {
    return "";
  }
}
