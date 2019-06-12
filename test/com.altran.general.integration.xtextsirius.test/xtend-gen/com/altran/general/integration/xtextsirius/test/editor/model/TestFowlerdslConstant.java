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
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.IntLiteral;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslConstant extends ATestFowlerdslModel {
  @Test
  public void unchanged() {
    Constant _createConstant = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function = (Constant it) -> {
      it.setName("c1");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(23);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setValue(_doubleArrow);
    };
    Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function);
    Constant _createConstant_1 = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function_1 = (Constant it) -> {
      it.setName("c2");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(42);
      };
      IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setValue(_doubleArrow_1);
    };
    Constant _doubleArrow_1 = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant_1, _function_1);
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      null, 
      Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void empty() {
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      "", 
      Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
  }
  
  @Test
  public void changeFirst() {
    Constant _createConstant = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function = (Constant it) -> {
      it.setName("c1");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(22);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setValue(_doubleArrow);
    };
    Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function);
    Constant _createConstant_1 = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function_1 = (Constant it) -> {
      it.setName("c2");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(42);
      };
      IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setValue(_doubleArrow_1);
    };
    Constant _doubleArrow_1 = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant_1, _function_1);
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      "c1 22 c2 42", 
      Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void changeLast() {
    Constant _createConstant = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function = (Constant it) -> {
      it.setName("c1");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(23);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setValue(_doubleArrow);
    };
    Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function);
    Constant _createConstant_1 = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function_1 = (Constant it) -> {
      it.setName("c2");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(43);
      };
      IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setValue(_doubleArrow_1);
    };
    Constant _doubleArrow_1 = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant_1, _function_1);
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      "c1 23 c2 43", 
      Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void removeFirst() {
    Constant _createConstant = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function = (Constant it) -> {
      it.setName("c2");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(42);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setValue(_doubleArrow);
    };
    Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function);
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      "c2 42", 
      Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(_doubleArrow)));
  }
  
  @Test
  public void removeLast() {
    Constant _createConstant = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function = (Constant it) -> {
      it.setName("c1");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(23);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setValue(_doubleArrow);
    };
    Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function);
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      "c1 23", 
      Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(_doubleArrow)));
  }
  
  @Test
  public void replace() {
    Constant _createConstant = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function = (Constant it) -> {
      it.setName("c3");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(13);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setValue(_doubleArrow);
    };
    Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function);
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      "c3 13", 
      Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(_doubleArrow)));
  }
  
  @Test
  public void replaceMove() {
    Constant _createConstant = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function = (Constant it) -> {
      it.setName("c3");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(13);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setValue(_doubleArrow);
    };
    Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function);
    Constant _createConstant_1 = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function_1 = (Constant it) -> {
      it.setName("c1");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(23);
      };
      IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setValue(_doubleArrow_1);
    };
    Constant _doubleArrow_1 = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant_1, _function_1);
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      "c3 13 c1 23", 
      Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void addFirst() {
    Constant _createConstant = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function = (Constant it) -> {
      it.setName("c3");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(13);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setValue(_doubleArrow);
    };
    Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function);
    Constant _createConstant_1 = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function_1 = (Constant it) -> {
      it.setName("c1");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(23);
      };
      IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setValue(_doubleArrow_1);
    };
    Constant _doubleArrow_1 = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant_1, _function_1);
    Constant _createConstant_2 = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function_2 = (Constant it) -> {
      it.setName("c2");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_3 = (IntLiteral it_1) -> {
        it_1.setValue(42);
      };
      IntLiteral _doubleArrow_2 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
      it.setValue(_doubleArrow_2);
    };
    Constant _doubleArrow_2 = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant_2, _function_2);
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      "c3 13 c1 23 c2 42", 
      Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2)));
  }
  
  @Test
  public void addLast() {
    Constant _createConstant = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function = (Constant it) -> {
      it.setName("c1");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(23);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setValue(_doubleArrow);
    };
    Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function);
    Constant _createConstant_1 = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function_1 = (Constant it) -> {
      it.setName("c2");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_2 = (IntLiteral it_1) -> {
        it_1.setValue(42);
      };
      IntLiteral _doubleArrow_1 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_2);
      it.setValue(_doubleArrow_1);
    };
    Constant _doubleArrow_1 = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant_1, _function_1);
    Constant _createConstant_2 = this.statemachineFactory.createConstant();
    final Procedure1<Constant> _function_2 = (Constant it) -> {
      it.setName("c3");
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_3 = (IntLiteral it_1) -> {
        it_1.setValue(13);
      };
      IntLiteral _doubleArrow_2 = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_3);
      it.setValue(_doubleArrow_2);
    };
    Constant _doubleArrow_2 = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant_2, _function_2);
    this.assertEdit(
      this.model, 
      "c1 23  c2 42", 
      "c1 23 c2 42 c3 13", 
      Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2)));
  }
  
  @Override
  protected String getFeatureName() {
    return "constants";
  }
}
