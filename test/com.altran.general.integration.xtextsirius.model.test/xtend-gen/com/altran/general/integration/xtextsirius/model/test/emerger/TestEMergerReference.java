package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
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
public class TestEMergerReference extends ATestEMergerEReference {
  @Test
  public void singleNull_singleNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNull_singleExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(this.newExisting(1, ""));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertNotNull(result.getChangeableRef());
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(this.newExisting(1, "question"));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void bag_bagNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newEdited = this.newEdited(3, "3.14");
      Element _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newExisting = this.newExisting(1, "1.337");
      Element _newExisting_1 = this.newExisting(31, "31.337");
      Element _newExisting_2 = this.newExisting(1, "1.337");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void bag_bagExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newEdited = this.newEdited(3, "3.14");
      Element _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newExisting = this.newExisting(1, "1.337");
      Element _newExisting_1 = this.newExisting(2, "2.71");
      Element _newExisting_2 = this.newExisting(31, "31.337");
      Element _newExisting_3 = this.newExisting(1, "1.337");
      Element _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void set_setNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(31, "31");
      Element _newExisting_2 = this.newExisting(1, "1");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void set_setExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void list_listNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(31, "31");
      Element _newExisting_2 = this.newExisting(1, "1");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
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
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals(2, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableListRef().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("a2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
  }
}
