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
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.util.EMerger;
import com.google.inject.Injector;
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
    IXtextSiriusModelDescriptor _createDescriptor = this.createDescriptor();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    return new EMerger<T>(_createDescriptor, existing, _createURI);
  }
  
  protected EMerger<T> createEMerger(final T existing, final EStructuralFeature feature) {
    IXtextSiriusModelDescriptor _createDescriptor = this.createDescriptor();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    return new EMerger<T>(_createDescriptor, existing, _createURI);
  }
  
  public IXtextSiriusModelDescriptor createDescriptor() {
    return this.createDescriptor(CollectionLiterals.<String>emptySet(), CollectionLiterals.<String>emptySet());
  }
  
  public IXtextSiriusModelDescriptor createDescriptor(final Set<String> editableFeaturesSet, final Set<String> ignoredNestedFeaturesSet) {
    return new IXtextSiriusModelDescriptor() {
      @Override
      public Set<String> getEditableFeatures() {
        return editableFeaturesSet;
      }
      
      @Override
      public Set<String> getIgnoredNestedFeatures() {
        return ignoredNestedFeaturesSet;
      }
      
      @Override
      public String getPrefixTerminalsExpression() {
        return null;
      }
      
      @Override
      public Set<String> getSelectedFeatures() {
        return CollectionLiterals.<String>emptySet();
      }
      
      @Override
      public String getSuffixTerminalsExpression() {
        return null;
      }
      
      @Override
      public boolean isMultiLine() {
        return false;
      }
      
      @Override
      public Injector getInjector() {
        throw new IllegalStateException("Didn\'t expect this call");
      }
    };
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
