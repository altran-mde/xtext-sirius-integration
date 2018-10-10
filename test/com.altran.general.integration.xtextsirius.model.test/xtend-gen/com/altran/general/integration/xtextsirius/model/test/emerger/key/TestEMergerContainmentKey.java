/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger.key;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerContainmentIdentity;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TestEMergerContainmentKey extends ATestEMergerContainmentIdentity<KeyElement> {
  @Override
  protected EReference changeableSetContFeature() {
    return this.xtextSiriusTestPackage.getKeyElement_ChangeableSetCont();
  }
  
  @Override
  protected EReference changeableUniqueListContFeature() {
    return this.xtextSiriusTestPackage.getKeyElement_ChangeableUniqueListCont();
  }
  
  @Override
  public KeyElement newElement(final int requestedId, final String attrValue) {
    KeyElement _createKeyElement = this.xtextSiriusTestFactory.createKeyElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      it.setKeyId(("keyId" + Integer.valueOf(requestedId)));
      it.setChangeableAttr(attrValue);
    };
    return ObjectExtensions.<KeyElement>operator_doubleArrow(_createKeyElement, _function);
  }
  
  @Override
  protected KeyElement createRootElement() {
    return this.xtextSiriusTestFactory.createKeyElement();
  }
}
