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

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.test.integration.ATestFowlerdsl;
import com.altran.general.integration.xtextsirius.test.integration.AssertingXtextSiriusEditorCallback;
import com.altran.general.integration.xtextsirius.test.integration.TestXtextSiriusModelEditor;
import com.google.inject.Injector;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.espilce.commons.emf.testsupport.AssertEmf;
import org.espilce.commons.lang.StringUtils2;

@SuppressWarnings("all")
public abstract class ATestFowlerdslCombined extends ATestFowlerdsl {
  @Override
  protected String modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("eventSD 2 [ c2 .. c1 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event2 3 [ 2 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event4 3 [ c1 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event3 4 ");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("commands");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("cmd0 23");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("cmd1 42");
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
    _builder.append("event2 => A");
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
  
  protected abstract String getFeatureName();
  
  protected void assertEdit(final EObject elementToEdit, final String expectedText, final String newText, final Object expectedResultElement) {
    this.assertEdit(elementToEdit, elementToEdit, this.getFeatureName(), expectedText, newText, expectedResultElement);
  }
  
  protected void assertEdit(final Object elementToEdit, final EObject fallbackContainer, final String expectedText, final String newText, final Object expectedResultElement) {
    this.assertEdit(elementToEdit, fallbackContainer, this.getFeatureName(), expectedText, newText, expectedResultElement);
  }
  
  protected void assertEdit(final Object elementToEdit, final EObject fallbackContainer, final String valueFeatureName, final String expectedText, final String newText, final Object expectedResultElement) {
    final XtextSiriusModelDescriptor descriptor = this.createDescriptor();
    final TestXtextSiriusModelEditor editor = new TestXtextSiriusModelEditor(descriptor);
    Injector _injector = this.getInjector();
    AssertingXtextSiriusEditorCallback callback = new AssertingXtextSiriusEditorCallback(_injector, this.model, newText, expectedText);
    editor.setCallback(callback);
    EObject _xifexpression = null;
    if ((elementToEdit instanceof EObject)) {
      _xifexpression = ((EObject)elementToEdit);
    } else {
      _xifexpression = null;
    }
    final ModelEntryPoint mep = new ModelEntryPoint(_xifexpression, fallbackContainer, valueFeatureName);
    editor.setModelEntryPoint(mep);
    editor.initValue(elementToEdit);
    final EObject commitTarget = new MinimalModelAdjuster().getClosestElement(mep);
    final Object result = editor.commit(commitTarget);
    if ((expectedResultElement instanceof EObject)) {
      AssertEmf.assertModelEquals(((EObject)expectedResultElement), ((EObject) result));
    } else {
      if ((expectedResultElement instanceof List)) {
        AssertEmf.assertModelEquals(((List<EObject>)expectedResultElement), ((List<EObject>) result));
      }
    }
  }
  
  protected XtextSiriusModelDescriptor createDescriptor() {
    Injector _inlineInjector = this.getInlineInjector();
    XtextDirectEditModelDescription _createXtextDirectEditModelDescription = this.diagramFactory.createXtextDirectEditModelDescription();
    return new XtextSiriusModelDescriptor(_inlineInjector, _createXtextDirectEditModelDescription);
  }
}
