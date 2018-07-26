package com.altran.general.integration.xtextsirius.model.test.emerger.id;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerContainmentIdentity;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TestEMergerContainmentId extends ATestEMergerContainmentIdentity<IdElement> {
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
