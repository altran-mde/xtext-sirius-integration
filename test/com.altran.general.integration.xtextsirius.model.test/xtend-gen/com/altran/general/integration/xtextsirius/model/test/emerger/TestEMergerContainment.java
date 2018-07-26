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
public class TestEMergerContainment extends ATestEMergerEReference<Element> {
  @Test
  public void singleNull_singleNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableCont(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNull_singleExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableCont(this.newExisting(1, ""));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      Element _newEdited = this.newEdited(1, "answer");
      final Procedure1<Element> _function_1 = (Element it_1) -> {
        EList<String> _changeableListAttr = it_1.getChangeableListAttr();
        _changeableListAttr.add("ccc");
      };
      Element _doubleArrow = ObjectExtensions.<Element>operator_doubleArrow(_newEdited, _function_1);
      it.setChangeableCont(_doubleArrow);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableCont(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNotNull(result.getChangeableCont());
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
    Assert.assertTrue(result.getChangeableCont().getChangeableListAttr().contains("ccc"));
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(this.newEdited(1, "answer"));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      Element _newExisting = this.newExisting(1, "question");
      final Procedure1<Element> _function_2 = (Element it_1) -> {
        EList<String> _changeableListAttr = it_1.getChangeableListAttr();
        Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("aaa", "bbb")));
      };
      Element _doubleArrow = ObjectExtensions.<Element>operator_doubleArrow(_newExisting, _function_2);
      it.setChangeableCont(_doubleArrow);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
    Assert.assertTrue(result.getChangeableListAttr().isEmpty());
  }
  
  @Test
  public void set_setNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetCont = it.getChangeableSetCont();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableSetCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableSetCont = it.getChangeableSetCont();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(31, "31");
      Element _newExisting_2 = this.newExisting(1, "1");
      Iterables.<Element>addAll(_changeableSetCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(3, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
  }
  
  @Test
  public void set_setExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetCont = it.getChangeableSetCont();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableSetCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
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
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q2"));
  }
  
  @Test
  public void list_listNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableUniqueListCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(31, "31");
      Element _newExisting_2 = this.newExisting(1, "1");
      Iterables.<Element>addAll(_changeableUniqueListCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(3, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
  }
  
  @Test
  public void list_listExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableUniqueListCont, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
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
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("q2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
  }
  
  @Test
  public void singleNull_bagNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertTrue(result.getChangeableBagRef().isEmpty());
  }
  
  @Test
  public void singleNull_bagExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newExisting = this.newExisting(1, "1.337");
      Element _newExisting_1 = this.newExisting(2, "2.71");
      Element _newExisting_2 = this.newExisting(31, "31.337");
      Element _newExisting_3 = this.newExisting(1, "1.337");
      Element _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(5, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q1.337"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q2.71"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q31.337"));
  }
  
  @Test
  public void singleNull_setNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertTrue(result.getChangeableSetRef().isEmpty());
  }
  
  @Test
  public void singleNull_setExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(5, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q31"));
  }
  
  @Test
  public void singleNull_listNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertTrue(result.getChangeableListRef().isEmpty());
  }
  
  @Test
  public void singleNull_listExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(null, this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
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
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(this.newEdited(3, "3.14"), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(1, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
  }
  
  @Test
  public void singleNonNull_bagExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newExisting = this.newExisting(1, "1.337");
      Element _newExisting_1 = this.newExisting(2, "2.71");
      Element _newExisting_2 = this.newExisting(31, "31.337");
      Element _newExisting_3 = this.newExisting(1, "1.337");
      Element _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(this.newEdited(3, "3.14"), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(6, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q1.337"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q2.71"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "q31.337"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
  }
  
  @Test
  public void singleNonNull_setNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(this.newEdited(3, "3"), this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(1, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
  }
  
  @Test
  public void singleNonNull_setExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(this.newEdited(3, "3"), this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(6, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "q31"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
  }
  
  @Test
  public void singleNonNull_listNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(this.newEdited(3, "3"), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertEquals(1, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void singleNonNull_listExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(this.newEdited(3, "3"), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
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
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _newEdited = this.newEdited(3, "3.14");
    Element _newEdited_1 = this.newEdited(2, "2.71");
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(Collections.<Element>unmodifiableSet(CollectionLiterals.<Element>newHashSet(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void set_bagExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newExisting = this.newExisting(1, "1.337");
      Element _newExisting_1 = this.newExisting(2, "2.71");
      Element _newExisting_2 = this.newExisting(31, "31.337");
      Element _newExisting_3 = this.newExisting(1, "1.337");
      Element _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _newEdited = this.newEdited(3, "3.14");
    Element _newEdited_1 = this.newEdited(2, "2.71");
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(Collections.<Element>unmodifiableSet(CollectionLiterals.<Element>newHashSet(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
  }
  
  @Test
  public void set_listNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _newEdited = this.newEdited(3, "3");
    Element _newEdited_1 = this.newEdited(2, "2");
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(Collections.<Element>unmodifiableSet(CollectionLiterals.<Element>newHashSet(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertEquals(2, result.getChangeableListRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableListRef(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableListRef(), "a2"));
  }
  
  @Test
  public void set_listExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _newEdited = this.newEdited(3, "3");
    Element _newEdited_1 = this.newEdited(2, "2");
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(Collections.<Element>unmodifiableSet(CollectionLiterals.<Element>newHashSet(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
    Assert.assertEquals(2, result.getChangeableListRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableListRef(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableListRef(), "a2"));
  }
  
  @Test
  public void list_bagNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _newEdited = this.newEdited(3, "3.14");
    Element _newEdited_1 = this.newEdited(2, "2.71");
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void list_bagExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newExisting = this.newExisting(1, "1.337");
      Element _newExisting_1 = this.newExisting(2, "2.71");
      Element _newExisting_2 = this.newExisting(31, "31.337");
      Element _newExisting_3 = this.newExisting(1, "1.337");
      Element _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _newEdited = this.newEdited(3, "3.14");
    Element _newEdited_1 = this.newEdited(2, "2.71");
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableBagRef()).merge(Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableBagRef());
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a2.71"));
    Assert.assertTrue(this.valueExists(result.getChangeableBagRef(), "a3.14"));
  }
  
  @Test
  public void list_setNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _newEdited = this.newEdited(3, "3");
    Element _newEdited_1 = this.newEdited(2, "2");
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void list_setExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _newEdited = this.newEdited(3, "3");
    Element _newEdited_1 = this.newEdited(2, "2");
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getAElement_ChangeableSetRef()).merge(Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)), this.xtextSiriusTestPackage.getAElement_ChangeableSetRef());
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetRef(), "a3"));
  }
  
  @Override
  public Element newElement(final int id, final String attrValue) {
    Element _newElement = super.newElement(id, attrValue);
    return ((Element) _newElement);
  }
}
