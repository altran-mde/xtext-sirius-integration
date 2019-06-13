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

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.test.editor.model.TestXtextSiriusEditorCallbackAdapter;

@SuppressWarnings("all")
public class TestXtextSiriusModelEditorAdapter extends XtextSiriusModelEditor {
  public TestXtextSiriusModelEditorAdapter(final IXtextSiriusModelDescriptor descriptor) {
    super(descriptor);
  }
  
  @Override
  public void setModelEntryPoint(final ModelEntryPoint modelEntryPoint) {
    final IXtextSiriusModelEditorCallback callback = this.getCallback();
    if ((callback instanceof TestXtextSiriusEditorCallbackAdapter)) {
      ((TestXtextSiriusEditorCallbackAdapter)callback).testSemanticElement = new MinimalModelAdjuster().getClosestElement(modelEntryPoint);
    }
    super.setModelEntryPoint(modelEntryPoint);
  }
}
