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

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.test.integration.TestXtextSiriusEditorCallbackAdapter;

@SuppressWarnings("all")
public class TestXtextSiriusModelEditor extends XtextSiriusModelEditor {
  public TestXtextSiriusModelEditor(final IXtextSiriusModelDescriptor descriptor) {
    super(descriptor);
  }
  
  @Override
  public void setModelEntryPoint(final ModelEntryPoint modelEntryPoint) {
    IXtextSiriusModelEditorCallback _callback = this.getCallback();
    boolean _tripleNotEquals = (_callback != null);
    if (_tripleNotEquals) {
      IXtextSiriusModelEditorCallback _callback_1 = this.getCallback();
      ((TestXtextSiriusEditorCallbackAdapter) _callback_1).testSemanticElement = new MinimalModelAdjuster().getClosestElement(modelEntryPoint);
    }
    super.setModelEntryPoint(modelEntryPoint);
  }
}
