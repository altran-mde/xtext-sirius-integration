/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.editor.value;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusValueEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusValueEditor;
import com.altran.general.integration.xtextsirius.test.editor.ATestFowlerdsl;
import com.google.inject.Injector;
import nl.altran.example.xtext.html.HtmlLangStandaloneSetup;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslStateDescription extends ATestFowlerdsl {
  private static Injector htmlInjector;
  
  @BeforeClass
  public static void loadHtml() {
    TestFowlerdslStateDescription.htmlInjector = new HtmlLangStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  protected XtextSiriusValueDescriptor createDescriptor() {
    XtextDirectEditValueDescription _createXtextDirectEditValueDescription = this.diagramFactory.createXtextDirectEditValueDescription();
    return new XtextSiriusValueDescriptor(TestFowlerdslStateDescription.htmlInjector, _createXtextDirectEditValueDescription);
  }
  
  @Test
  public void existingEdit() {
    this.assertEdit(
      IterableExtensions.<State>head(this.model.getStates()), 
      null, 
      "<p>This is a deschkriptschion</p>\n", 
      "<p>This is a <b>desch</b>kriptschion</p>\n", 
      "<p>This is a <b>desch</b>kriptschion</p>\n");
  }
  
  @Test
  public void existingInitEdit() {
    this.assertEdit(
      IterableExtensions.<State>head(this.model.getStates()), 
      "<p>T", 
      "<p>T", 
      "<p>T", 
      "<p>T");
  }
  
  @Test
  public void existingNoOp() {
    this.assertEdit(
      IterableExtensions.<State>head(this.model.getStates()), 
      null, 
      "<p>This is a deschkriptschion</p>\n", 
      null, 
      "<p>This is a deschkriptschion</p>\n");
  }
  
  @Test
  public void existingDelete() {
    this.assertEdit(
      IterableExtensions.<State>head(this.model.getStates()), 
      null, 
      "<p>This is a deschkriptschion</p>\n", 
      "", 
      null);
  }
  
  @Test
  public void nullEdit() {
    this.assertEdit(
      this.model.getStates().get(1), 
      null, 
      "", 
      "<p>This is a <b>desch</b>kriptschion</p>\n", 
      "<p>This is a <b>desch</b>kriptschion</p>\n");
  }
  
  @Test
  public void nullInitEdit() {
    this.assertEdit(
      this.model.getStates().get(1), 
      "<p>T", 
      "<p>T", 
      "<p>T", 
      "<p>T");
  }
  
  @Test
  public void nullNoOp() {
    this.assertEdit(
      this.model.getStates().get(1), 
      null, 
      "", 
      null, 
      null);
  }
  
  @Test
  public void nullDelete() {
    this.assertEdit(
      this.model.getStates().get(1), 
      null, 
      "", 
      "", 
      null);
  }
  
  @Test
  public void emptyEdit() {
    this.assertEdit(
      this.model.getStates().get(2), 
      null, 
      "", 
      "<p>This is a <b>desch</b>kriptschion</p>\n", 
      "<p>This is a <b>desch</b>kriptschion</p>\n");
  }
  
  @Test
  public void emptyInitEdit() {
    this.assertEdit(
      this.model.getStates().get(2), 
      "<p>T", 
      "<p>T", 
      "<p>T", 
      "<p>T");
  }
  
  @Test
  public void emptyNoOp() {
    this.assertEdit(
      this.model.getStates().get(2), 
      null, 
      "", 
      null, 
      "");
  }
  
  @Test
  public void emptyDelete() {
    this.assertEdit(
      this.model.getStates().get(2), 
      null, 
      "", 
      "", 
      null);
  }
  
  @Test
  public void blankEdit() {
    this.assertEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      null, 
      "  ", 
      "<p>This is a <b>desch</b>kriptschion</p>\n", 
      "<p>This is a <b>desch</b>kriptschion</p>\n");
  }
  
  @Test
  public void blankInitEdit() {
    this.assertEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      "<p>T", 
      "<p>T", 
      "<p>T", 
      "<p>T");
  }
  
  @Test
  public void blankNoOp() {
    this.assertEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      null, 
      "  ", 
      null, 
      "  ");
  }
  
  @Test
  public void blankDelete() {
    this.assertEdit(
      IterableExtensions.<State>last(this.model.getStates()), 
      null, 
      "  ", 
      "", 
      null);
  }
  
  protected void assertEdit(final EObject container, final String initialValue, final String expectedText, final String changedText, final String expectedResult) {
    final XtextSiriusValueDescriptor descriptor = this.createDescriptor();
    final XtextSiriusValueEditor editor = new XtextSiriusValueEditor(descriptor);
    editor.setCallback(new IXtextSiriusValueEditorCallback() {
      @Override
      public String callbackGetText() {
        return changedText;
      }
      
      @Override
      public void callbackInitText(final String initialValue, final int offset, final int length) {
        final String text = initialValue.substring(offset, (offset + length));
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("doesn\'t match");
        Assert.assertEquals(_builder.toString(), expectedText, text);
      }
    });
    final ModelEntryPoint mep = this.createModelEntryPoint(container);
    editor.setModelEntryPoint(mep);
    editor.initValue(initialValue);
    final Object result = editor.commit(container);
    Assert.assertEquals(expectedResult, result);
  }
  
  protected ModelEntryPoint createModelEntryPoint(final EObject container) {
    String _featureName = this.getFeatureName();
    return new ModelEntryPoint(null, container, _featureName);
  }
  
  @Override
  protected String getFeatureName() {
    return "description";
  }
}
