package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerEReference;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public abstract class ATestEMergerCrossReference<T extends IElement<T>> extends ATestEMergerEReference<T> {
  @Test
  public void singleNull_singleNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      it.setChangeableRef(null);
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      it.setChangeableRef(null);
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNull_singleExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      it.setChangeableRef(null);
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      it.setChangeableRef(this.newExisting(1, ""));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      it.setChangeableRef(null);
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNotNull(result.getChangeableRef());
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      it.setChangeableRef(this.newExisting(1, "question"));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void bag_bagNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      T _newEdited = this.newEdited(3, "3.14");
      T _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      T _newExisting = this.newExisting(1, "1.337");
      T _newExisting_1 = this.newExisting(31, "31.337");
      T _newExisting_2 = this.newExisting(1, "1.337");
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void bag_bagExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      T _newEdited = this.newEdited(3, "3.14");
      T _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      T _newExisting = this.newExisting(1, "1.337");
      T _newExisting_1 = this.newExisting(2, "2.71");
      T _newExisting_2 = this.newExisting(31, "31.337");
      T _newExisting_3 = this.newExisting(1, "1.337");
      T _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void set_setNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(31, "31");
      T _newExisting_2 = this.newExisting(1, "1");
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void set_setExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void list_listNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(31, "31");
      T _newExisting_2 = this.newExisting(1, "1");
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableListRef().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("a2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
  }
  
  @Test
  public void list_listExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableListRef().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("a2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
  }
}
