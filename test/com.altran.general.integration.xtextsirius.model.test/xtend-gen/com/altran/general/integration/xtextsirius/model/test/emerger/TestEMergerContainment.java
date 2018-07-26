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
