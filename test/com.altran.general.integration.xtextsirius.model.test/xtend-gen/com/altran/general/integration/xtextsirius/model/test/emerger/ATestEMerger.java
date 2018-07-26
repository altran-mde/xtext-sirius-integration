package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;
import com.altran.general.integration.xtextsirius.util.EMerger;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class ATestEMerger<T extends IElement<?>> {
  @Extension
  protected XtextSiriusTestPackage xtextSiriusTestPackage = XtextSiriusTestPackage.eINSTANCE;
  
  @Extension
  protected XtextSiriusTestFactory xtextSiriusTestFactory = XtextSiriusTestFactory.eINSTANCE;
  
  protected EMerger<T> createEMerger(final T existing, final T edited) {
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    return new EMerger<T>(existing, _emptySet, _emptySet_1, _createURI);
  }
  
  protected EMerger<T> createEMerger(final T existing, final EStructuralFeature feature) {
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    return new EMerger<T>(existing, _emptySet, _emptySet_1, _createURI);
  }
  
  public T newElement(final int id, final String attrValue) {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      it.setChangeableAttr(attrValue);
    };
    return ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
  }
  
  protected T createRootElement() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    return ((T) _createElement);
  }
}
