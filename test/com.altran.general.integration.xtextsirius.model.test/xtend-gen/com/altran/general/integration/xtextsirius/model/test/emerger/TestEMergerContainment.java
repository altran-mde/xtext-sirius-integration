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
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerContainment extends ATestEMergerContainmentMixed<Element> {
  @Override
  public Element newElement(final int id, final String attrValue) {
    Element _newElement = super.newElement(id, attrValue);
    return ((Element) _newElement);
  }
  
  @Test
  @Override
  public void set_listPartiallyExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newEdited = this.newEdited(3, "3");
      _changeableUniqueListCont.add(_newEdited);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(99, "99");
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableUniqueListCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(ImmutableSet.<Element>of(IterableExtensions.<Element>head(edited.getChangeableUniqueListCont()), this.newEdited(2, "2")), this.changeableUniqueListContFeature());
    final EList<Element> list = result.getChangeableUniqueListCont();
    Assert.assertEquals(2, list.size());
    Assert.assertTrue(this.renderList(list), this.valueExists(list, "a3"));
    Assert.assertTrue(this.renderList(list), this.valueExists(list, "a2"));
  }
  
  @Test
  @Override
  public void list_setPartiallyExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetCont = it.getChangeableSetCont();
      Element _newEdited = this.newEdited(3, "3");
      _changeableSetCont.add(_newEdited);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(99, "99");
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableSetCont = it.getChangeableSetCont();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableSetCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    Element _head = IterableExtensions.<Element>head(edited.getChangeableSetCont());
    Element _newEdited = this.newEdited(2, "2");
    final Element result = this.createEMerger(existing, this.changeableSetContFeature()).merge(Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_head, _newEdited)), this.changeableSetContFeature());
    Assert.assertEquals(2, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
  }
}
