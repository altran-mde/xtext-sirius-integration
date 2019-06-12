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

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.test.editor.ATestFowlerdsl;
import com.altran.general.integration.xtextsirius.test.editor.model.AssertingXtextSiriusEditorCallback;
import com.altran.general.integration.xtextsirius.test.editor.model.TestXtextSiriusModelEditorAdapter;
import com.google.inject.Injector;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.espilce.commons.emf.testsupport.AssertEmf;

@SuppressWarnings("all")
public abstract class ATestFowlerdslModel extends ATestFowlerdsl {
  protected void assertEdit(final EObject elementToEdit, final String expectedText, final String newText, final Object expectedResultElement) {
    this.assertEdit(elementToEdit, elementToEdit, this.getFeatureName(), expectedText, newText, expectedResultElement);
  }
  
  protected void assertEdit(final Object elementToEdit, final EObject fallbackContainer, final String expectedText, final String newText, final Object expectedResultElement) {
    this.assertEdit(elementToEdit, fallbackContainer, this.getFeatureName(), expectedText, newText, expectedResultElement);
  }
  
  protected void assertEdit(final Object elementToEdit, final EObject fallbackContainer, final String valueFeatureName, final String expectedText, final String newText, final Object expectedResultElement) {
    final XtextSiriusModelDescriptor descriptor = this.createDescriptor();
    final TestXtextSiriusModelEditorAdapter editor = new TestXtextSiriusModelEditorAdapter(descriptor);
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
