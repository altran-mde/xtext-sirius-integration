package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerEReferenceId;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerContainmentId extends ATestEMergerEReferenceId {
  @Test
  public void singleNull_singleNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableCont(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNull_singleExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableCont(this.newExisting(1, ""));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(this.newEdited(1, "answer"));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableCont(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertNotNull(result.getChangeableCont());
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(this.newEdited(1, "answer"));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableCont(this.newExisting(1, "question"));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
  }
  
  @Test
  public void set_setNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetCont = it.getChangeableSetCont();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableSetCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableSetCont = it.getChangeableSetCont();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(31, "31");
      Element _newExisting_2 = this.newExisting(1, "1");
      Iterables.<Element>addAll(_changeableSetCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals(5, result.getChangeableSetCont().size());
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a2"));
  }
  
  @Test
  public void set_setExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetCont = it.getChangeableSetCont();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableSetCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableSetCont = it.getChangeableSetCont();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableSetCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals(6, result.getChangeableSetCont().size());
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a2"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a3"));
  }
  
  @Test
  public void list_listNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableUniqueListCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(31, "31");
      Element _newExisting_2 = this.newExisting(1, "1");
      Iterables.<Element>addAll(_changeableUniqueListCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals(5, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
  }
  
  @Test
  public void list_listExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableUniqueListCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableUniqueListCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge();
    Assert.assertEquals(6, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("q2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(5).getChangeableAttr());
  }
}
