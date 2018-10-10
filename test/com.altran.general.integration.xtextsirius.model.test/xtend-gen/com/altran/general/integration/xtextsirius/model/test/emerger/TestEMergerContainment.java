/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerContainmentMixed;

@SuppressWarnings("all")
public class TestEMergerContainment extends ATestEMergerContainmentMixed<Element> {
  @Override
  public Element newElement(final int id, final String attrValue) {
    Element _newElement = super.newElement(id, attrValue);
    return ((Element) _newElement);
  }
}
