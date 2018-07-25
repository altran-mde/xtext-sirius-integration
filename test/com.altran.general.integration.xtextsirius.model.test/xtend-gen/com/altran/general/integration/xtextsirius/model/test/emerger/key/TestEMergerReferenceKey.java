package com.altran.general.integration.xtextsirius.model.test.emerger.key;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.key.ATestEMergerEReferenceKey;
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
public class TestEMergerReferenceKey extends ATestEMergerEReferenceKey {
  @Test
  public void singleNull_singleNew() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      it.setChangeableRef(null);
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      it.setChangeableRef(null);
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNull_singleExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      it.setChangeableRef(null);
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      it.setChangeableRef(this.newExisting(1, ""));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      it.setChangeableRef(null);
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNotNull(result.getChangeableRef());
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      it.setChangeableRef(this.newExisting(1, "question"));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void bag_bagNew() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableBagRef = it.getChangeableBagRef();
      KeyElement _newEdited = this.newEdited(3, "3.14");
      KeyElement _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<KeyElement>addAll(_changeableBagRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableBagRef = it.getChangeableBagRef();
      KeyElement _newExisting = this.newExisting(1, "1.337");
      KeyElement _newExisting_1 = this.newExisting(31, "31.337");
      KeyElement _newExisting_2 = this.newExisting(1, "1.337");
      Iterables.<KeyElement>addAll(_changeableBagRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void bag_bagExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableBagRef = it.getChangeableBagRef();
      KeyElement _newEdited = this.newEdited(3, "3.14");
      KeyElement _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<KeyElement>addAll(_changeableBagRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableBagRef = it.getChangeableBagRef();
      KeyElement _newExisting = this.newExisting(1, "1.337");
      KeyElement _newExisting_1 = this.newExisting(2, "2.71");
      KeyElement _newExisting_2 = this.newExisting(31, "31.337");
      KeyElement _newExisting_3 = this.newExisting(1, "1.337");
      KeyElement _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<KeyElement>addAll(_changeableBagRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void set_setNew() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableSetRef = it.getChangeableSetRef();
      KeyElement _newEdited = this.newEdited(3, "3");
      KeyElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<KeyElement>addAll(_changeableSetRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableSetRef = it.getChangeableSetRef();
      KeyElement _newExisting = this.newExisting(1, "1");
      KeyElement _newExisting_1 = this.newExisting(31, "31");
      KeyElement _newExisting_2 = this.newExisting(1, "1");
      Iterables.<KeyElement>addAll(_changeableSetRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void set_setExisting() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableSetRef = it.getChangeableSetRef();
      KeyElement _newEdited = this.newEdited(3, "3");
      KeyElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<KeyElement>addAll(_changeableSetRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableSetRef = it.getChangeableSetRef();
      KeyElement _newExisting = this.newExisting(1, "1");
      KeyElement _newExisting_1 = this.newExisting(2, "2");
      KeyElement _newExisting_2 = this.newExisting(31, "31");
      KeyElement _newExisting_3 = this.newExisting(1, "1");
      KeyElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<KeyElement>addAll(_changeableSetRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void list_listNew() {
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableListRef = it.getChangeableListRef();
      KeyElement _newEdited = this.newEdited(3, "3");
      KeyElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<KeyElement>addAll(_changeableListRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableListRef = it.getChangeableListRef();
      KeyElement _newExisting = this.newExisting(1, "1");
      KeyElement _newExisting_1 = this.newExisting(31, "31");
      KeyElement _newExisting_2 = this.newExisting(1, "1");
      Iterables.<KeyElement>addAll(_changeableListRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
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
    KeyElement _createRootElement = this.createRootElement();
    final Procedure1<KeyElement> _function = (KeyElement it) -> {
      EList<KeyElement> _changeableListRef = it.getChangeableListRef();
      KeyElement _newEdited = this.newEdited(3, "3");
      KeyElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<KeyElement>addAll(_changeableListRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final KeyElement edited = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement, _function);
    KeyElement _createRootElement_1 = this.createRootElement();
    final Procedure1<KeyElement> _function_1 = (KeyElement it) -> {
      EList<KeyElement> _changeableListRef = it.getChangeableListRef();
      KeyElement _newExisting = this.newExisting(1, "1");
      KeyElement _newExisting_1 = this.newExisting(2, "2");
      KeyElement _newExisting_2 = this.newExisting(31, "31");
      KeyElement _newExisting_3 = this.newExisting(1, "1");
      KeyElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<KeyElement>addAll(_changeableListRef, Collections.<KeyElement>unmodifiableList(CollectionLiterals.<KeyElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final KeyElement existing = ObjectExtensions.<KeyElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final KeyElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableListRef().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("a2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
  }
}
