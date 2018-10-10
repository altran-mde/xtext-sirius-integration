/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger.id;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerEReference;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TestEMergerCrossReferenceId extends ATestEMergerEReference<IdElement> {
  @Override
  public IdElement newElement(final int requestedId, final String attrValue) {
    IdElement _createIdElement = this.xtextSiriusTestFactory.createIdElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      it.setId(("id" + Integer.valueOf(requestedId)));
      it.setChangeableAttr(attrValue);
    };
    return ObjectExtensions.<IdElement>operator_doubleArrow(_createIdElement, _function);
  }
  
  @Override
  protected IdElement createRootElement() {
    return this.xtextSiriusTestFactory.createIdElement();
  }
}
