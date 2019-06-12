/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.integration;

import com.altran.general.integration.xtextsirius.test.integration.ATestFowlerdslCombined;
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
    this.assertEdit(
      IterableExtensions.<Event>last(this.model.getEvents()), 
      "", 
      null, 
      null);
  }
  
  @Test
  public void emptyAdd() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function = (ValueGuard it) -> {
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(5);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function);
    this.assertEdit(_last, 
      "", 
      "5", _doubleArrow);
  }
  
  @Test
  public void existingUnchanged() {
    Event _get = this.model.getEvents().get(1);
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function = (ValueGuard it) -> {
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(2);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function);
    this.assertEdit(_get, 
      "2", 
      null, _doubleArrow);
  }
  
  @Test
  public void existingEmpty() {
    this.assertEdit(
      this.model.getEvents().get(1), 
      "2", 
      "", 
      null);
  }
  
  @Test
  public void existingChange() {
    Event _get = this.model.getEvents().get(1);
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function = (ValueGuard it) -> {
      IntLiteral _createIntLiteral = this.statemachineFactory.createIntLiteral();
      final Procedure1<IntLiteral> _function_1 = (IntLiteral it_1) -> {
        it_1.setValue(5);
      };
      IntLiteral _doubleArrow = ObjectExtensions.<IntLiteral>operator_doubleArrow(_createIntLiteral, _function_1);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function);
    this.assertEdit(_get, 
      "2", 
      "5", _doubleArrow);
  }
  
  @Test
  public void emptyAddRef() {
    Event _last = IterableExtensions.<Event>last(this.model.getEvents());
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function = (ValueGuard it) -> {
      ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
      final Procedure1<ConstantRef> _function_1 = (ConstantRef it_1) -> {
        it_1.setConstant(IterableExtensions.<Constant>last(this.model.getConstants()));
      };
      ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_1);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function);
    this.assertEdit(_last, 
      "", 
      "c2", _doubleArrow);
  }
  
  @Test
  public void refUnchanged() {
    Event _get = this.model.getEvents().get(2);
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function = (ValueGuard it) -> {
      ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
      final Procedure1<ConstantRef> _function_1 = (ConstantRef it_1) -> {
        it_1.setConstant(IterableExtensions.<Constant>head(this.model.getConstants()));
      };
      ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_1);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function);
    this.assertEdit(_get, 
      "c1", 
      null, _doubleArrow);
  }
  
  @Test
  public void refEmpty() {
    this.assertEdit(
      this.model.getEvents().get(2), 
      "c1", 
      "", 
      null);
  }
  
  @Test
  public void refChange() {
    Event _get = this.model.getEvents().get(2);
    ValueGuard _createValueGuard = this.statemachineFactory.createValueGuard();
    final Procedure1<ValueGuard> _function = (ValueGuard it) -> {
      ConstantRef _createConstantRef = this.statemachineFactory.createConstantRef();
      final Procedure1<ConstantRef> _function_1 = (ConstantRef it_1) -> {
        it_1.setConstant(IterableExtensions.<Constant>last(this.model.getConstants()));
      };
      ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_1);
      it.setCond(_doubleArrow);
    };
    ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function);
    this.assertEdit(_get, 
      "c1", 
      "c2", _doubleArrow);
  }
  
  @Override
  protected String getFeatureName() {
    return "guard";
  }
}
