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
public class TestEMergerContainment extends ATestEMergerEReference {
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
    Assert.assertEquals(4, result.getChangeableSetCont().size());
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "3"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "2"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "1"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "31"));
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
    Assert.assertEquals(4, result.getChangeableSetCont().size());
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "3"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "2"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "1"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "31"));
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
    String _changeableAttr = result.getChangeableUniqueListCont().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("1", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableUniqueListCont().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("31", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
    String _changeableAttr_2 = result.getChangeableUniqueListCont().get(2).getChangeableAttr();
    boolean _equals_2 = Objects.equal("1", _changeableAttr_2);
    Assert.assertTrue(_equals_2);
    String _changeableAttr_3 = result.getChangeableUniqueListCont().get(3).getChangeableAttr();
    boolean _equals_3 = Objects.equal("3", _changeableAttr_3);
    Assert.assertTrue(_equals_3);
    String _changeableAttr_4 = result.getChangeableUniqueListCont().get(4).getChangeableAttr();
    boolean _equals_4 = Objects.equal("2", _changeableAttr_4);
    Assert.assertTrue(_equals_4);
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
    String _changeableAttr = result.getChangeableUniqueListCont().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("1", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableUniqueListCont().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
    String _changeableAttr_2 = result.getChangeableUniqueListCont().get(2).getChangeableAttr();
    boolean _equals_2 = Objects.equal("31", _changeableAttr_2);
    Assert.assertTrue(_equals_2);
    String _changeableAttr_3 = result.getChangeableUniqueListCont().get(3).getChangeableAttr();
    boolean _equals_3 = Objects.equal("1", _changeableAttr_3);
    Assert.assertTrue(_equals_3);
    String _changeableAttr_4 = result.getChangeableUniqueListCont().get(4).getChangeableAttr();
    boolean _equals_4 = Objects.equal("2", _changeableAttr_4);
    Assert.assertTrue(_equals_4);
    String _changeableAttr_5 = result.getChangeableUniqueListCont().get(5).getChangeableAttr();
    boolean _equals_5 = Objects.equal("3", _changeableAttr_5);
    Assert.assertTrue(_equals_5);
  }
}
