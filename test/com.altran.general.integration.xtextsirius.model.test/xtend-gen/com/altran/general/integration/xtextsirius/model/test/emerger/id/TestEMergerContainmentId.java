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
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerContainmentIdentity;
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
  
  @Test
  @Override
  public void set_setNew() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableSetCont = it.getChangeableSetCont();
      IdElement _newEdited = this.newEdited(3, "3");
      IdElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<IdElement>addAll(_changeableSetCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableSetCont = it.getChangeableSetCont();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(31, "31");
      IdElement _newExisting_2 = this.newExisting(1, "1");
      Iterables.<IdElement>addAll(_changeableSetCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q31"));
  }
  
  @Test
  @Override
  public void set_listPartiallyExisting() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      IdElement _newEdited = this.newEdited(3, "3");
      _changeableUniqueListCont.add(_newEdited);
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(99, "99");
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(2, "2");
      IdElement _newExisting_2 = this.newExisting(31, "31");
      IdElement _newExisting_3 = this.newExisting(1, "1");
      IdElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<IdElement>addAll(_changeableUniqueListCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(ImmutableSet.<IdElement>of(IterableExtensions.<IdElement>head(edited.getChangeableUniqueListCont()), this.newEdited(2, "2")), this.changeableUniqueListContFeature());
    Assert.assertEquals(2, result.getChangeableUniqueListCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableUniqueListCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableUniqueListCont(), "a2"));
  }
}
