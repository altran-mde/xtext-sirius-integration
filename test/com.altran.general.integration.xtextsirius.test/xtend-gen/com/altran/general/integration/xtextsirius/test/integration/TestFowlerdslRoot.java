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
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.espilce.commons.lang.StringUtils2;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslRoot extends ATestFowlerdslCombined {
  @Override
  protected String modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("name statemachine1");
    _builder.newLine();
    return StringUtils2.normalizeNewline(_builder.toString());
  }
  
  @Test
  public void unchanged() {
    Statemachine _createStatemachine = this.statemachineFactory.createStatemachine();
    final Procedure1<Statemachine> _function = (Statemachine it) -> {
      it.setName("statemachine1");
    };
    Statemachine _doubleArrow = ObjectExtensions.<Statemachine>operator_doubleArrow(_createStatemachine, _function);
    this.assertEdit(
      this.model, 
      null, 
      "name statemachine1", 
      null, _doubleArrow);
  }
  
  @Test
  public void empty() {
    final Function1<Object, Object> _function = (Object it) -> {
      return null;
    };
    this.assertEdit(
      this.model, 
      null, 
      "name statemachine1", 
      "", _function);
  }
  
  @Test
  public void change() {
    Statemachine _createStatemachine = this.statemachineFactory.createStatemachine();
    final Procedure1<Statemachine> _function = (Statemachine it) -> {
      it.setName("statemachine2");
    };
    Statemachine _doubleArrow = ObjectExtensions.<Statemachine>operator_doubleArrow(_createStatemachine, _function);
    this.assertEdit(
      this.model, 
      null, 
      "name statemachine1", 
      "name statemachine2", _doubleArrow);
  }
  
  @Override
  protected String getFeatureName() {
    return null;
  }
}
