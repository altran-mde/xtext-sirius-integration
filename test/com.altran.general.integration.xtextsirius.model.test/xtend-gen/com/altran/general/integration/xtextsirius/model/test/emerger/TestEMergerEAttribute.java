package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.TestAEMerger;
import com.altran.general.integration.xtextsirius.util.EMerger;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerEAttribute extends TestAEMerger {
  @Test
  public void singleNull_singleNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertNull(result.getChangeableAttr());
  }
  
  @Test
  public void singleNull_singleExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr("Hello");
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertNull(result.getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr("Hi");
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertEquals("Hi", result.getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr("Greetings");
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr("Hello");
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertEquals("Greetings", result.getChangeableAttr());
  }
  
  @Test
  public void bag_bagNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(3.14), Double.valueOf(2.71))));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(1.337), Double.valueOf(31.337), Double.valueOf(1.337))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertEquals(5, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(1.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(31.337)));
  }
  
  @Test
  public void bag_bagExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(3.14), Double.valueOf(2.71))));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(1.337), Double.valueOf(2.71), Double.valueOf(31.337), Double.valueOf(1.337), Double.valueOf(2.71))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertEquals(6, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(1.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(31.337)));
  }
  
  @Test
  public void set_setNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(2))));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(31), Integer.valueOf(1))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertEquals(4, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(3)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(2)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(1)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(31)));
  }
  
  @Test
  public void set_setExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(2))));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(31), Integer.valueOf(1), Integer.valueOf(2))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertEquals(4, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(3)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(2)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(1)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(31)));
  }
  
  @Test
  public void list_listNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("3", "2")));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("1", "31", "1")));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertEquals(5, result.getChangeableListAttr().size());
    Assert.assertEquals("1", result.getChangeableListAttr().get(0));
    Assert.assertEquals("31", result.getChangeableListAttr().get(1));
    Assert.assertEquals("1", result.getChangeableListAttr().get(2));
    Assert.assertEquals("3", result.getChangeableListAttr().get(3));
    Assert.assertEquals("2", result.getChangeableListAttr().get(4));
  }
  
  @Test
  public void list_listExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("3", "2")));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("1", "2", "31", "1", "2")));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1).merge();
    Assert.assertEquals(6, result.getChangeableListAttr().size());
    Assert.assertEquals("1", result.getChangeableListAttr().get(0));
    Assert.assertEquals("2", result.getChangeableListAttr().get(1));
    Assert.assertEquals("31", result.getChangeableListAttr().get(2));
    Assert.assertEquals("1", result.getChangeableListAttr().get(3));
    Assert.assertEquals("2", result.getChangeableListAttr().get(4));
    Assert.assertEquals("3", result.getChangeableListAttr().get(5));
  }
}
