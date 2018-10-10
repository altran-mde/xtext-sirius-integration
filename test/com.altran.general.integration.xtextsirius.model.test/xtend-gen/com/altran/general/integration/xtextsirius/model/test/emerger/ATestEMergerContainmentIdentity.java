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

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerContainmentMixed;
import com.google.common.base.Objects;
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
public abstract class ATestEMergerContainmentIdentity<T extends IElement<T>> extends ATestEMergerContainmentMixed<T> {
  @Test
  @Override
  public void singleNonNull_singleExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      it.setChangeableCont(this.newEdited(1, "answer"));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      T _newExisting = this.newExisting(1, "question");
      final Procedure1<T> _function_2 = (T it_1) -> {
        EList<String> _changeableListAttr = it_1.getChangeableListAttr();
        Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("aaa", "bbb")));
      };
      T _doubleArrow = ObjectExtensions.<T>operator_doubleArrow(_newExisting, _function_2);
      it.setChangeableCont(_doubleArrow);
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
    Assert.assertTrue(result.getChangeableCont().getChangeableListAttr().contains("aaa"));
    Assert.assertTrue(result.getChangeableCont().getChangeableListAttr().contains("bbb"));
  }
  
  @Test
  @Override
  public void set_setNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(31, "31");
      T _newExisting_2 = this.newExisting(1, "1");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
  }
  
  @Test
  @Override
  public void set_setExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(6, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
  }
  
  @Test
  @Override
  public void list_listNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(31, "31");
      T _newExisting_2 = this.newExisting(1, "1");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
  }
  
  @Test
  @Override
  public void list_listExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(6, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("q2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(5).getChangeableAttr());
  }
  
  @Test
  @Override
  public void singleNonNull_setExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newEdited = this.newEdited(3, "3");
      _changeableSetCont.add(_newEdited);
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(99, "99");
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newExisting = this.newExisting(3, "4");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, this.changeableSetContFeature()).merge(IterableExtensions.<T>head(edited.getChangeableSetCont()), this.changeableSetContFeature());
    Assert.assertEquals(5, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q31"));
  }
  
  @Test
  @Override
  public void singleNonNull_listExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newEdited = this.newEdited(3, "3");
      _changeableUniqueListCont.add(_newEdited);
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(99, "99");
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newExisting = this.newExisting(3, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(IterableExtensions.<T>head(edited.getChangeableUniqueListCont()), this.changeableUniqueListContFeature());
    Assert.assertEquals(5, result.getChangeableUniqueListCont().size());
    String _changeableAttr = result.getChangeableUniqueListCont().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableUniqueListCont().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("q2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
    String _changeableAttr_2 = result.getChangeableUniqueListCont().get(2).getChangeableAttr();
    boolean _equals_2 = Objects.equal("q31", _changeableAttr_2);
    Assert.assertTrue(_equals_2);
    String _changeableAttr_3 = result.getChangeableUniqueListCont().get(3).getChangeableAttr();
    boolean _equals_3 = Objects.equal("q1", _changeableAttr_3);
    Assert.assertTrue(_equals_3);
    String _changeableAttr_4 = result.getChangeableUniqueListCont().get(4).getChangeableAttr();
    boolean _equals_4 = Objects.equal("q2", _changeableAttr_4);
    Assert.assertTrue(_equals_4);
  }
}
