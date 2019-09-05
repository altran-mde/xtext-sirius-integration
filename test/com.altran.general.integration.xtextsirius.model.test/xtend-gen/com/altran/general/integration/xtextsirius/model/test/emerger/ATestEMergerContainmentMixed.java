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
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerContainment;
import com.google.common.base.Objects;
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
public abstract class ATestEMergerContainmentMixed<T extends IElement<T>> extends ATestEMergerContainment<T> {
  @Test
  public void singleNull_setEmpty() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.changeableSetContFeature()).merge(null, this.changeableSetContFeature());
    Assert.assertTrue(result.getChangeableSetCont().isEmpty());
  }
  
  @Test
  public void singleNull_setNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.changeableSetContFeature()).merge(null, this.changeableSetContFeature());
    Assert.assertEquals(5, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q31"));
  }
  
  @Test
  public void singleNull_listEmpty() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(null, this.changeableUniqueListContFeature());
    Assert.assertTrue(result.getChangeableUniqueListCont().isEmpty());
  }
  
  @Test
  public void singleNull_listNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(null, this.changeableUniqueListContFeature());
    Assert.assertEquals(5, result.getChangeableUniqueListCont().size());
    String _changeableAttr = result.getChangeableUniqueListCont().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("q1", _changeableAttr);
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
  
  @Test
  public void singleNonNull_setEmpty() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.changeableSetContFeature()).merge(this.newEdited(3, "3"), this.changeableSetContFeature());
    Assert.assertEquals(1, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
  }
  
  @Test
  public void singleNonNull_setNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.changeableSetContFeature()).merge(this.newEdited(3, "3"), this.changeableSetContFeature());
    Assert.assertEquals(6, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
  }
  
  @Test
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
      T _newExisting = this.newExisting(4, "4");
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
  public void singleNonNull_listEmpty() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(this.newEdited(3, "3"), this.changeableUniqueListContFeature());
    Assert.assertEquals(1, result.getChangeableUniqueListCont().size());
    String _changeableAttr = result.getChangeableUniqueListCont().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void singleNonNull_listNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(this.newEdited(3, "3"), this.changeableUniqueListContFeature());
    Assert.assertEquals(6, result.getChangeableUniqueListCont().size());
    String _changeableAttr = result.getChangeableUniqueListCont().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("q1", _changeableAttr);
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
    String _changeableAttr_5 = result.getChangeableUniqueListCont().get(5).getChangeableAttr();
    boolean _equals_5 = Objects.equal("a3", _changeableAttr_5);
    Assert.assertTrue(_equals_5);
  }
  
  @Test
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
      T _newExisting = this.newExisting(1, "1");
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
  
  @Test
  public void set_listEmpty() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(ImmutableSet.<T>of(this.newEdited(3, "3"), this.newEdited(2, "2")), this.changeableUniqueListContFeature());
    Assert.assertEquals(2, result.getChangeableUniqueListCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableUniqueListCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableUniqueListCont(), "a2"));
  }
  
  @Test
  public void set_listPartiallyExisting() {
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
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(ImmutableSet.<T>of(IterableExtensions.<T>head(edited.getChangeableUniqueListCont()), this.newEdited(2, "2")), this.changeableUniqueListContFeature());
    Assert.assertEquals(2, result.getChangeableUniqueListCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableUniqueListCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableUniqueListCont(), "q2"));
  }
  
  @Test
  public void list_setEmpty() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _newEdited = this.newEdited(3, "3");
    T _newEdited_1 = this.newEdited(2, "2");
    final T result = this.createEMerger(existing, this.changeableSetContFeature()).merge(Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)), this.changeableSetContFeature());
    Assert.assertEquals(2, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
  }
  
  @Test
  public void list_setPartiallyExisting() {
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
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    T _head = IterableExtensions.<T>head(edited.getChangeableSetCont());
    T _newEdited = this.newEdited(2, "2");
    final T result = this.createEMerger(existing, this.changeableSetContFeature()).merge(Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_head, _newEdited)), this.changeableSetContFeature());
    Assert.assertEquals(2, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
  }
  
  protected EReference changeableSetContFeature() {
    return this.xtextSiriusTestPackage.getAElement_ChangeableSetCont();
  }
  
  protected EReference changeableUniqueListContFeature() {
    return this.xtextSiriusTestPackage.getAElement_ChangeableUniqueListCont();
  }
}
