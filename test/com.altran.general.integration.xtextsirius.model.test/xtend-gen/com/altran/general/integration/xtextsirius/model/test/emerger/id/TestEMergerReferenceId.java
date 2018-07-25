package com.altran.general.integration.xtextsirius.model.test.emerger.id;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.id.ATestEMergerEReferenceId;
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
public class TestEMergerReferenceId extends ATestEMergerEReferenceId {
  @Test
  public void singleNull_singleNew() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      it.setChangeableRef(null);
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      it.setChangeableRef(null);
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNull_singleExisting() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      it.setChangeableRef(null);
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      it.setChangeableRef(this.newExisting(1, ""));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      it.setChangeableRef(null);
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNotNull(result.getChangeableRef());
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      it.setChangeableRef(this.newExisting(1, "question"));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void bag_bagNew() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableBagRef = it.getChangeableBagRef();
      IdElement _newEdited = this.newEdited(3, "3.14");
      IdElement _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<IdElement>addAll(_changeableBagRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableBagRef = it.getChangeableBagRef();
      IdElement _newExisting = this.newExisting(1, "1.337");
      IdElement _newExisting_1 = this.newExisting(31, "31.337");
      IdElement _newExisting_2 = this.newExisting(1, "1.337");
      Iterables.<IdElement>addAll(_changeableBagRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void bag_bagExisting() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableBagRef = it.getChangeableBagRef();
      IdElement _newEdited = this.newEdited(3, "3.14");
      IdElement _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<IdElement>addAll(_changeableBagRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableBagRef = it.getChangeableBagRef();
      IdElement _newExisting = this.newExisting(1, "1.337");
      IdElement _newExisting_1 = this.newExisting(2, "2.71");
      IdElement _newExisting_2 = this.newExisting(31, "31.337");
      IdElement _newExisting_3 = this.newExisting(1, "1.337");
      IdElement _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<IdElement>addAll(_changeableBagRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void set_setNew() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableSetRef = it.getChangeableSetRef();
      IdElement _newEdited = this.newEdited(3, "3");
      IdElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<IdElement>addAll(_changeableSetRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableSetRef = it.getChangeableSetRef();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(31, "31");
      IdElement _newExisting_2 = this.newExisting(1, "1");
      Iterables.<IdElement>addAll(_changeableSetRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void set_setExisting() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableSetRef = it.getChangeableSetRef();
      IdElement _newEdited = this.newEdited(3, "3");
      IdElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<IdElement>addAll(_changeableSetRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableSetRef = it.getChangeableSetRef();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(2, "2");
      IdElement _newExisting_2 = this.newExisting(31, "31");
      IdElement _newExisting_3 = this.newExisting(1, "1");
      IdElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<IdElement>addAll(_changeableSetRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void list_listNew() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableListRef = it.getChangeableListRef();
      IdElement _newEdited = this.newEdited(3, "3");
      IdElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<IdElement>addAll(_changeableListRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableListRef = it.getChangeableListRef();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(31, "31");
      IdElement _newExisting_2 = this.newExisting(1, "1");
      Iterables.<IdElement>addAll(_changeableListRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
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
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableListRef = it.getChangeableListRef();
      IdElement _newEdited = this.newEdited(3, "3");
      IdElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<IdElement>addAll(_changeableListRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableListRef = it.getChangeableListRef();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(2, "2");
      IdElement _newExisting_2 = this.newExisting(31, "31");
      IdElement _newExisting_3 = this.newExisting(1, "1");
      IdElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<IdElement>addAll(_changeableListRef, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(2, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableListRef().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("a2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
  }
}
