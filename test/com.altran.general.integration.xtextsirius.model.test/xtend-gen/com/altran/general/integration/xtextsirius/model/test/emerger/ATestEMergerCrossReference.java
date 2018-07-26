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
  
  @Test
  public void singleNull_bagNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertTrue(result.getChangeableBagRef().isEmpty());
  }
  
  @Test
  public void singleNull_bagExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      T _newExisting = this.newExisting(1, "1.337");
      T _newExisting_1 = this.newExisting(2, "2.71");
      T _newExisting_2 = this.newExisting(31, "31.337");
      T _newExisting_3 = this.newExisting(1, "1.337");
      T _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(5, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q1.337"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q2.71"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q31.337"));
  }
  
  @Test
  public void singleNull_setNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertTrue(result.getChangeableSetRef().isEmpty());
  }
  
  @Test
  public void singleNull_setExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(5, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q31"));
  }
  
  @Test
  public void singleNull_listNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertTrue(result.getChangeableListRef().isEmpty());
  }
  
  @Test
  public void singleNull_listExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertEquals(5, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("q1", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableListRef().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("q2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
    String _changeableAttr_2 = result.getChangeableListRef().get(2).getChangeableAttr();
    boolean _equals_2 = Objects.equal("q31", _changeableAttr_2);
    Assert.assertTrue(_equals_2);
    String _changeableAttr_3 = result.getChangeableListRef().get(3).getChangeableAttr();
    boolean _equals_3 = Objects.equal("q1", _changeableAttr_3);
    Assert.assertTrue(_equals_3);
    String _changeableAttr_4 = result.getChangeableListRef().get(4).getChangeableAttr();
    boolean _equals_4 = Objects.equal("q2", _changeableAttr_4);
    Assert.assertTrue(_equals_4);
  }
  
  @Test
  public void singleNonNull_bagNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(this.newEdited(3, "3.14"), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(1, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
  }
  
  @Test
  public void singleNonNull_bagExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      T _newExisting = this.newExisting(1, "1.337");
      T _newExisting_1 = this.newExisting(2, "2.71");
      T _newExisting_2 = this.newExisting(31, "31.337");
      T _newExisting_3 = this.newExisting(1, "1.337");
      T _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(this.newEdited(3, "3.14"), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(6, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q1.337"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q2.71"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q31.337"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
  }
  
  @Test
  public void singleNonNull_setNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(this.newEdited(3, "3"), this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(1, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
  }
  
  @Test
  public void singleNonNull_setExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(this.newEdited(3, "3"), this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(6, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q31"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
  }
  
  @Test
  public void singleNonNull_listNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(this.newEdited(3, "3"), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertEquals(1, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void singleNonNull_listExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(this.newEdited(3, "3"), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertEquals(6, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("q1", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableListRef().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("q2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
    String _changeableAttr_2 = result.getChangeableListRef().get(2).getChangeableAttr();
    boolean _equals_2 = Objects.equal("q31", _changeableAttr_2);
    Assert.assertTrue(_equals_2);
    String _changeableAttr_3 = result.getChangeableListRef().get(3).getChangeableAttr();
    boolean _equals_3 = Objects.equal("q1", _changeableAttr_3);
    Assert.assertTrue(_equals_3);
    String _changeableAttr_4 = result.getChangeableListRef().get(4).getChangeableAttr();
    boolean _equals_4 = Objects.equal("q2", _changeableAttr_4);
    Assert.assertTrue(_equals_4);
    String _changeableAttr_5 = result.getChangeableListRef().get(5).getChangeableAttr();
    boolean _equals_5 = Objects.equal("a3", _changeableAttr_5);
    Assert.assertTrue(_equals_5);
  }
  
  @Test
  public void set_bagNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _newEdited = this.newEdited(3, "3.14");
    T _newEdited_1 = this.newEdited(2, "2.71");
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(Collections.<T>unmodifiableSet(CollectionLiterals.<T>newHashSet(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void set_bagExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      T _newExisting = this.newExisting(1, "1.337");
      T _newExisting_1 = this.newExisting(2, "2.71");
      T _newExisting_2 = this.newExisting(31, "31.337");
      T _newExisting_3 = this.newExisting(1, "1.337");
      T _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _newEdited = this.newEdited(3, "3.14");
    T _newEdited_1 = this.newEdited(2, "2.71");
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(Collections.<T>unmodifiableSet(CollectionLiterals.<T>newHashSet(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
  }
  
  @Test
  public void set_listNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _newEdited = this.newEdited(3, "3");
    T _newEdited_1 = this.newEdited(2, "2");
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(Collections.<T>unmodifiableSet(CollectionLiterals.<T>newHashSet(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertEquals(2, result.getChangeableListRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableListRef(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableListRef(), "a2"));
  }
  
  @Test
  public void set_listExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableListRef = it.getChangeableListRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableListRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _newEdited = this.newEdited(3, "3");
    T _newEdited_1 = this.newEdited(2, "2");
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(Collections.<T>unmodifiableSet(CollectionLiterals.<T>newHashSet(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertEquals(2, result.getChangeableListRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableListRef(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableListRef(), "a2"));
  }
  
  @Test
  public void list_bagNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _newEdited = this.newEdited(3, "3.14");
    T _newEdited_1 = this.newEdited(2, "2.71");
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void list_bagExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableBagRef = it.getChangeableBagRef();
      T _newExisting = this.newExisting(1, "1.337");
      T _newExisting_1 = this.newExisting(2, "2.71");
      T _newExisting_2 = this.newExisting(31, "31.337");
      T _newExisting_3 = this.newExisting(1, "1.337");
      T _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<T>addAll(_changeableBagRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _newEdited = this.newEdited(3, "3.14");
    T _newEdited_1 = this.newEdited(2, "2.71");
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
  }
  
  @Test
  public void list_setNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList()));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _newEdited = this.newEdited(3, "3");
    T _newEdited_1 = this.newEdited(2, "2");
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void list_setExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetRef = it.getChangeableSetRef();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetRef, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _newEdited = this.newEdited(3, "3");
    T _newEdited_1 = this.newEdited(2, "2");
    final T result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
  }
}
