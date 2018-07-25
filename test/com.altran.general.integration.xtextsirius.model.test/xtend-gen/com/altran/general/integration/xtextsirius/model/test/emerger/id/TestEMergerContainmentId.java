package com.altran.general.integration.xtextsirius.model.test.emerger.id;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.id.ATestEMergerEReferenceId;
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
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      it.setChangeableCont(null);
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      it.setChangeableCont(null);
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNull_singleExisting() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      it.setChangeableCont(null);
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      it.setChangeableCont(this.newExisting(1, ""));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      it.setChangeableCont(this.newEdited(1, "answer"));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      it.setChangeableCont(null);
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNotNull(result.getChangeableCont());
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      it.setChangeableCont(this.newEdited(1, "answer"));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      it.setChangeableCont(this.newExisting(1, "question"));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
  }
  
  @Test
  public void set_setNew() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableSetCont = it.getChangeableSetCont();
      IdElement _newEdited = this.newEdited(3, "3");
      IdElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<IdElement>addAll(_changeableSetCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableSetCont = it.getChangeableSetCont();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(31, "31");
      IdElement _newExisting_2 = this.newExisting(1, "1");
      Iterables.<IdElement>addAll(_changeableSetCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableSetCont().size());
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a2"));
  }
  
  @Test
  public void set_setExisting() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableSetCont = it.getChangeableSetCont();
      IdElement _newEdited = this.newEdited(3, "3");
      IdElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<IdElement>addAll(_changeableSetCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableSetCont = it.getChangeableSetCont();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(2, "2");
      IdElement _newExisting_2 = this.newExisting(31, "31");
      IdElement _newExisting_3 = this.newExisting(1, "1");
      IdElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<IdElement>addAll(_changeableSetCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(6, result.getChangeableSetCont().size());
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a2"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.exists(result.getChangeableSetCont(), "a3"));
  }
  
  @Test
  public void list_listNew() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      IdElement _newEdited = this.newEdited(3, "3");
      IdElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<IdElement>addAll(_changeableUniqueListCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(31, "31");
      IdElement _newExisting_2 = this.newExisting(1, "1");
      Iterables.<IdElement>addAll(_changeableUniqueListCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
  }
  
  @Test
  public void list_listExisting() {
    IdElement _createRootElement = this.createRootElement();
    final Procedure1<IdElement> _function = (IdElement it) -> {
      EList<IdElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      IdElement _newEdited = this.newEdited(3, "3");
      IdElement _newEdited_1 = this.newEdited(2, "2");
      Iterables.<IdElement>addAll(_changeableUniqueListCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newEdited, _newEdited_1)));
    };
    final IdElement edited = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement, _function);
    IdElement _createRootElement_1 = this.createRootElement();
    final Procedure1<IdElement> _function_1 = (IdElement it) -> {
      EList<IdElement> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      IdElement _newExisting = this.newExisting(1, "1");
      IdElement _newExisting_1 = this.newExisting(2, "2");
      IdElement _newExisting_2 = this.newExisting(31, "31");
      IdElement _newExisting_3 = this.newExisting(1, "1");
      IdElement _newExisting_4 = this.newExisting(2, "2");
      Iterables.<IdElement>addAll(_changeableUniqueListCont, Collections.<IdElement>unmodifiableList(CollectionLiterals.<IdElement>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final IdElement existing = ObjectExtensions.<IdElement>operator_doubleArrow(_createRootElement_1, _function_1);
    final IdElement result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(6, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("q2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(5).getChangeableAttr());
  }
}
