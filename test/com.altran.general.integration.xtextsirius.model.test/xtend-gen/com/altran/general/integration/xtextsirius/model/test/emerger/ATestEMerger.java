package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;
import com.altran.general.integration.xtextsirius.util.EMerger;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class ATestEMerger {
  @Extension
  protected XtextSiriusTestPackage xtextSiriusTestPackage = XtextSiriusTestPackage.eINSTANCE;
  
  @Extension
  protected XtextSiriusTestFactory xtextSiriusTestFactory = XtextSiriusTestFactory.eINSTANCE;
  
  protected EMerger<Element> createEMerger(final Element existing, final Element edited) {
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    return new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI);
  }
  
  protected Element newElement(final int id, final String attrValue) {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(attrValue);
    };
    return ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
  }
}
