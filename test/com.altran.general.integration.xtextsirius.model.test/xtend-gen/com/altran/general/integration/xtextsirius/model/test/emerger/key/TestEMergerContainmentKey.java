package com.altran.general.integration.xtextsirius.model.test.emerger.key;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.key.ATestEMergerEReferenceKey;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerContainmentKey extends ATestEMergerEReferenceKey {
  @Test
  public void singleNull_singleNew() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      it.setChangeableCont(null);
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      it.setChangeableCont(null);
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNull_singleExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      it.setChangeableCont(null);
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      it.setChangeableCont(this.newExisting(1, ""));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      it.setChangeableCont(this.newEdited(1, "answer"));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      it.setChangeableCont(null);
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNotNull(result.getChangeableCont());
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      it.setChangeableCont(this.newEdited(1, "answer"));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      it.setChangeableCont(this.newExisting(1, "question"));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
  }
  
  @Test
  public void set_setNew() {
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
      KeyElement _newExisting_1 = this.newExisting(31, "31");
      KeyElement _newExisting_2 = this.newExisting(1, "1");
      Iterables.<KeyElement>addAll(_changeableSetCont, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableSetCont().size());
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a2"));
  }
  
  @Test
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
    Assert.assertEquals(6, result.getChangeableSetCont().size());
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a2"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a3"));
  }
  
  @Test
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
    Assert.assertEquals(5, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
  }
  
  @Test
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
    Assert.assertEquals(6, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("q2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(5).getChangeableAttr());
  }
}
