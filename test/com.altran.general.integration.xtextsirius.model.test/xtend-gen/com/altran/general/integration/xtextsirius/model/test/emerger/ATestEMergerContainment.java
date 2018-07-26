package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerEReference;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public abstract class ATestEMergerContainment<T extends IElement<T>> extends ATestEMergerEReference<T> {
  @Test
  public void singleNull_singleNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      it.setChangeableCont(null);
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      it.setChangeableCont(null);
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNull_singleExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      it.setChangeableCont(null);
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      it.setChangeableCont(this.newExisting(1, ""));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      T _newEdited = this.newEdited(1, "answer");
      final Procedure1<T> _function_1 = (T it_1) -> {
        EList<String> _changeableListAttr = it_1.getChangeableListAttr();
        _changeableListAttr.add("ccc");
      };
      T _doubleArrow = ObjectExtensions.<T>operator_doubleArrow(_newEdited, _function_1);
      it.setChangeableCont(_doubleArrow);
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      it.setChangeableCont(null);
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNotNull(result.getChangeableCont());
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
    Assert.assertTrue(result.getChangeableCont().getChangeableListAttr().contains("ccc"));
  }
  
  @Test
  public void singleNonNull_singleNew_deep() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      T _newEdited = this.newEdited(1, "answer");
      final Procedure1<T> _function_1 = (T it_1) -> {
        T _newEdited_1 = this.newEdited(2, "megaAnswer");
        final Procedure1<T> _function_2 = (T it_2) -> {
          EList<String> _changeableListAttr = it_2.getChangeableListAttr();
          _changeableListAttr.add("ddd");
        };
        T _doubleArrow = ObjectExtensions.<T>operator_doubleArrow(_newEdited_1, _function_2);
        it_1.setChangeableCont(_doubleArrow);
        EList<String> _changeableListAttr = it_1.getChangeableListAttr();
        _changeableListAttr.add("ccc");
      };
      T _doubleArrow = ObjectExtensions.<T>operator_doubleArrow(_newEdited, _function_1);
      it.setChangeableCont(_doubleArrow);
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      it.setChangeableCont(this.newEdited(1, "question"));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNotNull(result.getChangeableCont());
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
    Assert.assertTrue(result.getChangeableCont().getChangeableListAttr().contains("ccc"));
    Assert.assertEquals("amegaAnswer", result.getChangeableCont().getChangeableCont().getChangeableAttr());
    Assert.assertTrue(result.getChangeableCont().getChangeableCont().getChangeableListAttr().contains("ddd"));
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      it.setChangeableCont(this.newEdited(1, "answer"));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      T _newExisting = this.newExisting(1, "question");
      final Procedure1<T> _function_2 = (T it_1) -> {
        EList<String> _changeableListAttr = it_1.getChangeableListAttr();
        Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("aaa", "bbb")));
      };
      T _doubleArrow = ObjectExtensions.<T>operator_doubleArrow(_newExisting, _function_2);
      it.setChangeableCont(_doubleArrow);
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("aanswer", result.getChangeableCont().getChangeableAttr());
    Assert.assertTrue(result.getChangeableListAttr().isEmpty());
  }
  
  @Test
  public void set_setNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(31, "31");
      T _newExisting_2 = this.newExisting(1, "1");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(3, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
  }
  
  @Test
  public void set_setExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableSetCont = it.getChangeableSetCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableSetCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableSetCont().size());
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a3"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "a2"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q1"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q31"));
    Assert.assertTrue(this.valueExists(result.getChangeableSetCont(), "q2"));
  }
  
  @Test
  public void list_listNew() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(31, "31");
      T _newExisting_2 = this.newExisting(1, "1");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(3, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
  }
  
  @Test
  public void list_listExisting() {
    T _createRootElement = this.createRootElement();
    final Procedure1<T> _function = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newEdited = this.newEdited(3, "3");
      T _newEdited_1 = this.newEdited(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newEdited, _newEdited_1)));
    };
    final T edited = ObjectExtensions.<T>operator_doubleArrow(_createRootElement, _function);
    T _createRootElement_1 = this.createRootElement();
    final Procedure1<T> _function_1 = (T it) -> {
      EList<T> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      T _newExisting = this.newExisting(1, "1");
      T _newExisting_1 = this.newExisting(2, "2");
      T _newExisting_2 = this.newExisting(31, "31");
      T _newExisting_3 = this.newExisting(1, "1");
      T _newExisting_4 = this.newExisting(2, "2");
      Iterables.<T>addAll(_changeableUniqueListCont, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final T existing = ObjectExtensions.<T>operator_doubleArrow(_createRootElement_1, _function_1);
    final T result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableUniqueListCont().size());
    Assert.assertEquals("a3", result.getChangeableUniqueListCont().get(0).getChangeableAttr());
    Assert.assertEquals("a2", result.getChangeableUniqueListCont().get(1).getChangeableAttr());
    Assert.assertEquals("q31", result.getChangeableUniqueListCont().get(2).getChangeableAttr());
    Assert.assertEquals("q1", result.getChangeableUniqueListCont().get(3).getChangeableAttr());
    Assert.assertEquals("q2", result.getChangeableUniqueListCont().get(4).getChangeableAttr());
  }
}
