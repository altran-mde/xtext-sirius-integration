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
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

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
  
  @Test
  @Override
  public void set_setExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableSetCont = it.getChangeableSetCont();
      KeyElement _newEdited = this.newEdited(3, "3");
      KeyElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<KeyElement>addAll(_changeableSetCont, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableSetCont = it.getChangeableSetCont();
      KeyElement _newExisting = this.newExisting(1, "1");
      KeyElement _newExisting_1 = this.newExisting(2, "2");
      KeyElement _newExisting_2 = this.newExisting(31, "31");
      KeyElement _newExisting_3 = this.newExisting(1, "1");
      KeyElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<KeyElement>addAll(_changeableSetCont, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
  }
  
  @Test
  @Override
  public void set_listPartiallyExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      KeyElement _newEdited = this.newEdited(3, "3");
      _changeableUniqueListCont.add(_newEdited);
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(99, "99");
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      KeyElement _newExisting = this.newExisting(1, "1");
      KeyElement _newExisting_1 = this.newExisting(2, "2");
      KeyElement _newExisting_2 = this.newExisting(31, "31");
      KeyElement _newExisting_3 = this.newExisting(1, "1");
      KeyElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<KeyElement>addAll(_changeableUniqueListCont, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(ImmutableSet.<KeyElement>of(IterableExtensions.<KeyElement>head(edited.getChangeableUniqueListCont()), this.newEdited(2, "2")), this.changeableUniqueListContFeature());
    Assert.assertEquals(2, result.getChangeableUniqueListCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableUniqueListCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableUniqueListCont(), "a2"));
  }
  
  @Test
  @Override
  public void list_listNew() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      KeyElement _newEdited = this.newEdited(3, "3");
      KeyElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<KeyElement>addAll(_changeableUniqueListCont, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      KeyElement _newExisting = this.newExisting(1, "1");
      KeyElement _newExisting_1 = this.newExisting(31, "31");
      KeyElement _newExisting_2 = this.newExisting(1, "1");
      Iterables.<KeyElement>addAll(_changeableUniqueListCont, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
  }
  
  @Test
  @Override
  public void list_listExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      KeyElement _newEdited = this.newEdited(3, "3");
      KeyElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<KeyElement>addAll(_changeableUniqueListCont, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      KeyElement _newExisting = this.newExisting(1, "1");
      KeyElement _newExisting_1 = this.newExisting(2, "2");
      KeyElement _newExisting_2 = this.newExisting(31, "31");
      KeyElement _newExisting_3 = this.newExisting(1, "1");
      KeyElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<KeyElement>addAll(_changeableUniqueListCont, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
  }
  
  @Test
  @Override
  public void list_setPartiallyExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableSetCont = it.getChangeableSetCont();
      KeyElement _newEdited = this.newEdited(3, "3");
      _changeableSetCont.add(_newEdited);
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(99, "99");
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableSetCont = it.getChangeableSetCont();
      KeyElement _newExisting = this.newExisting(1, "1");
      KeyElement _newExisting_1 = this.newExisting(2, "2");
      KeyElement _newExisting_2 = this.newExisting(31, "31");
      KeyElement _newExisting_3 = this.newExisting(1, "1");
      KeyElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<KeyElement>addAll(_changeableSetCont, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    KeyElement _head = IterableExtensions.<KeyElement>head(edited.getChangeableSetCont());
    KeyElement _newEdited = this.newEdited(2, "2");
    final KeyElement result = this.createEMerger(existing, this.changeableSetContFeature()).merge(Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_head, _newEdited)), this.changeableSetContFeature());
    Assert.assertEquals(2, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
  }
}
