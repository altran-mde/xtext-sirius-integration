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
import java.util.Collections;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.IntLiteral;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Thing;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslStateFeature extends ATestFowlerdslModel {
  @Override
  protected CharSequence modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("state A things t1 1 t2 2 t4 4 end");
    _builder.newLine();
    return _builder;
  }
  
  @Test
  public void unchanged() {
    Thing _createThing = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function = (Thing it) -> {
      it.setName("t1");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_2 = (IntLiteral it_2) -> {
          it_2.setValue(1);
        };
        IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function);
    Thing _createThing_1 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_1 = (Thing it) -> {
      it.setName("t2");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_2 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_3 = (IntLiteral it_2) -> {
          it_2.setValue(2);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
        it_1.setCond(_doubleArrow_1);
      };
      ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
      it.setGuard(_doubleArrow_1);
    };
    Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_1);
    Thing _createThing_2 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_2 = (Thing it) -> {
      it.setName("t4");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_3 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_4 = (IntLiteral it_2) -> {
          it_2.setValue(4);
        };
        IntLiteral _doubleArrow_2 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
        it_1.setCond(_doubleArrow_2);
      };
      ValueGuard _doubleArrow_2 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
      it.setGuard(_doubleArrow_2);
    };
    Thing _doubleArrow_2 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_2, _function_2);
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      null, 
      Collections.<Thing>unmodifiableList(CollectionLiterals.<Thing>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2)));
  }
  
  @Test
  public void empty() {
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      null, 
      null);
  }
  
  @Test
  public void changeFirst() {
    Thing _createThing = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function = (Thing it) -> {
      it.setName("t3");
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
    Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function);
    Thing _createThing_1 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_1 = (Thing it) -> {
      it.setName("t2");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_2 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_3 = (IntLiteral it_2) -> {
          it_2.setValue(2);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
        it_1.setCond(_doubleArrow_1);
      };
      ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
      it.setGuard(_doubleArrow_1);
    };
    Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_1);
    Thing _createThing_2 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_2 = (Thing it) -> {
      it.setName("t4");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_3 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_4 = (IntLiteral it_2) -> {
          it_2.setValue(4);
        };
        IntLiteral _doubleArrow_2 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
        it_1.setCond(_doubleArrow_2);
      };
      ValueGuard _doubleArrow_2 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
      it.setGuard(_doubleArrow_2);
    };
    Thing _doubleArrow_2 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_2, _function_2);
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      "t3 3 t2 2 t4 4", 
      Collections.<Thing>unmodifiableList(CollectionLiterals.<Thing>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2)));
  }
  
  @Test
  public void changeBoth() {
    Thing _createThing = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function = (Thing it) -> {
      it.setName("t2");
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
    Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function);
    Thing _createThing_1 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_1 = (Thing it) -> {
      it.setName("t3");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_2 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_3 = (IntLiteral it_2) -> {
          it_2.setValue(3);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
        it_1.setCond(_doubleArrow_1);
      };
      ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
      it.setGuard(_doubleArrow_1);
    };
    Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_1);
    Thing _createThing_2 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_2 = (Thing it) -> {
      it.setName("t4");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_3 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_4 = (IntLiteral it_2) -> {
          it_2.setValue(4);
        };
        IntLiteral _doubleArrow_2 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
        it_1.setCond(_doubleArrow_2);
      };
      ValueGuard _doubleArrow_2 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
      it.setGuard(_doubleArrow_2);
    };
    Thing _doubleArrow_2 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_2, _function_2);
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      "t2 2 t3 3 t4 4", 
      Collections.<Thing>unmodifiableList(CollectionLiterals.<Thing>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2)));
  }
  
  @Test
  public void removeLast() {
    Thing _createThing = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function = (Thing it) -> {
      it.setName("t1");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_2 = (IntLiteral it_2) -> {
          it_2.setValue(1);
        };
        IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function);
    Thing _createThing_1 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_1 = (Thing it) -> {
      it.setName("t2");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_2 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_3 = (IntLiteral it_2) -> {
          it_2.setValue(2);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
        it_1.setCond(_doubleArrow_1);
      };
      ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
      it.setGuard(_doubleArrow_1);
    };
    Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_1);
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      "t1 1 t2 2", 
      Collections.<Thing>unmodifiableList(CollectionLiterals.<Thing>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void removeFirst() {
    Thing _createThing = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function = (Thing it) -> {
      it.setName("t2");
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
    Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function);
    Thing _createThing_1 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_1 = (Thing it) -> {
      it.setName("t4");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_2 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_3 = (IntLiteral it_2) -> {
          it_2.setValue(4);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
        it_1.setCond(_doubleArrow_1);
      };
      ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
      it.setGuard(_doubleArrow_1);
    };
    Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_1);
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      "t2 2 t4 4", 
      Collections.<Thing>unmodifiableList(CollectionLiterals.<Thing>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void replace() {
    Thing _createThing = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function = (Thing it) -> {
      it.setName("t3");
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
    Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function);
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      "t3 3", 
      Collections.<Thing>unmodifiableList(CollectionLiterals.<Thing>newArrayList(_doubleArrow)));
  }
  
  @Test
  public void replaceMove() {
    Thing _createThing = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function = (Thing it) -> {
      it.setName("t3");
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
    Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function);
    Thing _createThing_1 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_1 = (Thing it) -> {
      it.setName("t1");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_2 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_3 = (IntLiteral it_2) -> {
          it_2.setValue(1);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
        it_1.setCond(_doubleArrow_1);
      };
      ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
      it.setGuard(_doubleArrow_1);
    };
    Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_1);
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      "t3 3 t1 1", 
      Collections.<Thing>unmodifiableList(CollectionLiterals.<Thing>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void insertFirst() {
    Thing _createThing = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function = (Thing it) -> {
      it.setName("t3");
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
    Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function);
    Thing _createThing_1 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_1 = (Thing it) -> {
      it.setName("t1");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_2 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_3 = (IntLiteral it_2) -> {
          it_2.setValue(1);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
        it_1.setCond(_doubleArrow_1);
      };
      ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
      it.setGuard(_doubleArrow_1);
    };
    Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_1);
    Thing _createThing_2 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_2 = (Thing it) -> {
      it.setName("t2");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_3 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_4 = (IntLiteral it_2) -> {
          it_2.setValue(2);
        };
        IntLiteral _doubleArrow_2 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
        it_1.setCond(_doubleArrow_2);
      };
      ValueGuard _doubleArrow_2 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
      it.setGuard(_doubleArrow_2);
    };
    Thing _doubleArrow_2 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_2, _function_2);
    Thing _createThing_3 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_3 = (Thing it) -> {
      it.setName("t4");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_4 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_5 = (IntLiteral it_2) -> {
          it_2.setValue(4);
        };
        IntLiteral _doubleArrow_3 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_5);
        it_1.setCond(_doubleArrow_3);
      };
      ValueGuard _doubleArrow_3 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_4);
      it.setGuard(_doubleArrow_3);
    };
    Thing _doubleArrow_3 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_3, _function_3);
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      "t3 3 t1 1 t2 2 t4 4", 
      Collections.<Thing>unmodifiableList(CollectionLiterals.<Thing>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2, _doubleArrow_3)));
  }
  
  @Test
  public void insertLast() {
    Thing _createThing = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function = (Thing it) -> {
      it.setName("t1");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_2 = (IntLiteral it_2) -> {
          it_2.setValue(1);
        };
        IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    Thing _doubleArrow = ObjectExtensions.<Thing>operator_doubleArrow(_createThing, _function);
    Thing _createThing_1 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_1 = (Thing it) -> {
      it.setName("t2");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_2 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_3 = (IntLiteral it_2) -> {
          it_2.setValue(2);
        };
        IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
        it_1.setCond(_doubleArrow_1);
      };
      ValueGuard _doubleArrow_1 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_2);
      it.setGuard(_doubleArrow_1);
    };
    Thing _doubleArrow_1 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_1, _function_1);
    Thing _createThing_2 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_2 = (Thing it) -> {
      it.setName("t4");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_3 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_4 = (IntLiteral it_2) -> {
          it_2.setValue(4);
        };
        IntLiteral _doubleArrow_2 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_4);
        it_1.setCond(_doubleArrow_2);
      };
      ValueGuard _doubleArrow_2 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_3);
      it.setGuard(_doubleArrow_2);
    };
    Thing _doubleArrow_2 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_2, _function_2);
    Thing _createThing_3 = this.statemachineFactory.createThing();
    final Procedure1<Thing> _function_3 = (Thing it) -> {
      it.setName("t3");
      ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_4 = (ValueGuard it_1) -> {
        IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
        final Procedure1<IntLiteral> _function_5 = (IntLiteral it_2) -> {
          it_2.setValue(3);
        };
        IntLiteral _doubleArrow_3 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_5);
        it_1.setCond(_doubleArrow_3);
      };
      ValueGuard _doubleArrow_3 = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_4);
      it.setGuard(_doubleArrow_3);
    };
    Thing _doubleArrow_3 = ObjectExtensions.<Thing>operator_doubleArrow(_createThing_3, _function_3);
    this.assertModelEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "t1 1 t2 2 t4 4", 
      "t1 1 t2 2 t4 4 t3 3", 
      Collections.<Thing>unmodifiableList(CollectionLiterals.<Thing>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2, _doubleArrow_3)));
  }
  
  @Override
  protected String getFeatureName() {
    return "things";
  }
}
