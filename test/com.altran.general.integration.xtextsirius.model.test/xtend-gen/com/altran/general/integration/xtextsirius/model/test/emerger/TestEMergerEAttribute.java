/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMerger;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerEAttribute extends ATestEMerger<Element> {
  @Test
  public void singleNull_singleNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableAttr());
  }
  
  @Test
  public void singleNull_singleExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr("Hello");
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNull(result.getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr("Hi");
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("Hi", result.getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr("Greetings");
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr("Hello");
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals("Greetings", result.getChangeableAttr());
  }
  
  @Test
  public void bag_bagNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(3.14), Double.valueOf(2.71))));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(1.337), Double.valueOf(31.337), Double.valueOf(1.337))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(1.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(31.337)));
  }
  
  @Test
  public void bag_bagExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(3.14), Double.valueOf(2.71))));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(1.337), Double.valueOf(2.71), Double.valueOf(31.337), Double.valueOf(1.337), Double.valueOf(2.71))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(6, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(1.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(31.337)));
  }
  
  @Test
  public void set_setNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(2))));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(31), Integer.valueOf(1))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(4, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(3)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(2)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(1)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(31)));
  }
  
  @Test
  public void set_setExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(2))));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(31), Integer.valueOf(1), Integer.valueOf(2))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(4, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(3)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(2)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(1)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(31)));
  }
  
  @Test
  public void list_listNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("3", "2")));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("1", "31", "1")));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(5, result.getChangeableListAttr().size());
    Assert.assertEquals("1", result.getChangeableListAttr().get(0));
    Assert.assertEquals("31", result.getChangeableListAttr().get(1));
    Assert.assertEquals("1", result.getChangeableListAttr().get(2));
    Assert.assertEquals("3", result.getChangeableListAttr().get(3));
    Assert.assertEquals("2", result.getChangeableListAttr().get(4));
  }
  
  @Test
  public void list_listExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("3", "2")));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("1", "2", "31", "1", "2")));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(6, result.getChangeableListAttr().size());
    Assert.assertEquals("1", result.getChangeableListAttr().get(0));
    Assert.assertEquals("2", result.getChangeableListAttr().get(1));
    Assert.assertEquals("31", result.getChangeableListAttr().get(2));
    Assert.assertEquals("1", result.getChangeableListAttr().get(3));
    Assert.assertEquals("2", result.getChangeableListAttr().get(4));
    Assert.assertEquals("3", result.getChangeableListAttr().get(5));
  }
  
  @Test
  public void singleNull_bagEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr()).merge(null, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr());
    Assert.assertTrue(result.getChangeableBagAttr().isEmpty());
  }
  
  @Test
  public void singleNull_bagNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(1.337), Double.valueOf(2.71), Double.valueOf(31.337), Double.valueOf(1.337), Double.valueOf(2.71))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr()).merge(null, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr());
    Assert.assertEquals(5, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(1.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(31.337)));
  }
  
  @Test
  public void singleNull_setEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr()).merge(null, this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr());
    Assert.assertTrue(result.getChangeableSetAttr().isEmpty());
  }
  
  @Test
  public void singleNull_setNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(31), Integer.valueOf(1), Integer.valueOf(2))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr()).merge(null, this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr());
    Assert.assertEquals(3, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(1)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(2)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(31)));
  }
  
  @Test
  public void singleNull_listEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableListAttr()).merge(null, this.xtextSiriusTestPackage.getIElement_ChangeableListAttr());
    Assert.assertTrue(result.getChangeableListAttr().isEmpty());
  }
  
  @Test
  public void singleNull_listNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("1", "2", "31", "1", "2")));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableListAttr()).merge(null, this.xtextSiriusTestPackage.getIElement_ChangeableListAttr());
    Assert.assertEquals(5, result.getChangeableListAttr().size());
    Assert.assertEquals("1", result.getChangeableListAttr().get(0));
    Assert.assertEquals("2", result.getChangeableListAttr().get(1));
    Assert.assertEquals("31", result.getChangeableListAttr().get(2));
    Assert.assertEquals("1", result.getChangeableListAttr().get(3));
    Assert.assertEquals("2", result.getChangeableListAttr().get(4));
  }
  
  @Test
  public void singleNonNull_bagEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr()).merge(Double.valueOf(3.14), this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr());
    Assert.assertEquals(1, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
  }
  
  @Test
  public void singleNonNull_bagNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(1.337), Double.valueOf(2.71), Double.valueOf(31.337), Double.valueOf(1.337), Double.valueOf(2.71))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr()).merge(Double.valueOf(3.14), this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr());
    Assert.assertEquals(6, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(1.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(31.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
  }
  
  @Test
  public void singleNonNull_bagExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(1.337), Double.valueOf(2.71), Double.valueOf(31.337), Double.valueOf(1.337), Double.valueOf(2.71))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr()).merge(Double.valueOf(2.71), this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr());
    Assert.assertEquals(5, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(1.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(31.337)));
  }
  
  @Test
  public void singleNonNull_setEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr()).merge(Integer.valueOf(3), this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr());
    Assert.assertEquals(1, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(3)));
  }
  
  @Test
  public void singleNonNull_setNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(31), Integer.valueOf(1), Integer.valueOf(2))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr()).merge(Integer.valueOf(3), this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr());
    Assert.assertEquals(4, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(1)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(2)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(31)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(3)));
  }
  
  @Test
  public void singleNonNull_setExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(31), Integer.valueOf(1), Integer.valueOf(2))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr()).merge(Integer.valueOf(2), this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr());
    Assert.assertEquals(3, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(1)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(2)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(31)));
  }
  
  @Test
  public void singleNonNull_listEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableListAttr()).merge("3", this.xtextSiriusTestPackage.getIElement_ChangeableListAttr());
    Assert.assertEquals(1, result.getChangeableListAttr().size());
    Assert.assertEquals("3", result.getChangeableListAttr().get(0));
  }
  
  @Test
  public void singleNonNull_listNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("1", "2", "31", "1", "2")));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableListAttr()).merge("3", this.xtextSiriusTestPackage.getIElement_ChangeableListAttr());
    Assert.assertEquals(6, result.getChangeableListAttr().size());
    Assert.assertEquals("1", result.getChangeableListAttr().get(0));
    Assert.assertEquals("2", result.getChangeableListAttr().get(1));
    Assert.assertEquals("31", result.getChangeableListAttr().get(2));
    Assert.assertEquals("1", result.getChangeableListAttr().get(3));
    Assert.assertEquals("2", result.getChangeableListAttr().get(4));
    Assert.assertEquals("3", result.getChangeableListAttr().get(5));
  }
  
  @Test
  public void singleNonNull_listExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("1", "2", "31", "1", "2")));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableListAttr()).merge("2", this.xtextSiriusTestPackage.getIElement_ChangeableListAttr());
    Assert.assertEquals(5, result.getChangeableListAttr().size());
    Assert.assertEquals("1", result.getChangeableListAttr().get(0));
    Assert.assertEquals("2", result.getChangeableListAttr().get(1));
    Assert.assertEquals("31", result.getChangeableListAttr().get(2));
    Assert.assertEquals("1", result.getChangeableListAttr().get(3));
    Assert.assertEquals("2", result.getChangeableListAttr().get(4));
  }
  
  @Test
  public void set_bagEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr()).merge(Collections.<Double>unmodifiableSet(CollectionLiterals.<Double>newHashSet(Double.valueOf(3.14), Double.valueOf(2.71))), this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr());
    Assert.assertEquals(2, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
  }
  
  @Test
  public void set_bagPartiallyExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(1.337), Double.valueOf(2.71), Double.valueOf(31.337), Double.valueOf(1.337), Double.valueOf(2.71))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr()).merge(Collections.<Double>unmodifiableSet(CollectionLiterals.<Double>newHashSet(Double.valueOf(3.14), Double.valueOf(2.71))), this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr());
    Assert.assertEquals(6, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(1.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(31.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
  }
  
  @Test
  public void set_listEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableListAttr()).merge(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("3", "2")), this.xtextSiriusTestPackage.getIElement_ChangeableListAttr());
    Assert.assertEquals(2, result.getChangeableListAttr().size());
    Assert.assertTrue(result.getChangeableListAttr().contains("3"));
    Assert.assertTrue(result.getChangeableListAttr().contains("2"));
  }
  
  @Test
  public void set_listPartiallyExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<String> _changeableListAttr = it.getChangeableListAttr();
      Iterables.<String>addAll(_changeableListAttr, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("1", "2", "31", "1", "2")));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableListAttr()).merge(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("3", "2")), this.xtextSiriusTestPackage.getIElement_ChangeableListAttr());
    Assert.assertEquals(6, result.getChangeableListAttr().size());
    Assert.assertEquals("1", result.getChangeableListAttr().get(0));
    Assert.assertEquals("2", result.getChangeableListAttr().get(1));
    Assert.assertEquals("31", result.getChangeableListAttr().get(2));
    Assert.assertEquals("1", result.getChangeableListAttr().get(3));
    Assert.assertEquals("2", result.getChangeableListAttr().get(4));
    Assert.assertEquals("3", result.getChangeableListAttr().get(5));
  }
  
  @Test
  public void list_bagEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr()).merge(Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(3.14), Double.valueOf(2.71))), this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr());
    Assert.assertEquals(2, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
  }
  
  @Test
  public void list_bagPartiallyExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Double> _changeableBagAttr = it.getChangeableBagAttr();
      Iterables.<Double>addAll(_changeableBagAttr, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(1.337), Double.valueOf(2.71), Double.valueOf(31.337), Double.valueOf(1.337), Double.valueOf(2.71))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr()).merge(Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(3.14), Double.valueOf(2.71))), this.xtextSiriusTestPackage.getIElement_ChangeableBagAttr());
    Assert.assertEquals(6, result.getChangeableBagAttr().size());
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(1.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(2.71)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(31.337)));
    Assert.assertTrue(result.getChangeableBagAttr().contains(Double.valueOf(3.14)));
  }
  
  @Test
  public void list_setEmpty() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList()));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr()).merge(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(2))), this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr());
    Assert.assertEquals(2, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(3)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(2)));
  }
  
  @Test
  public void list_setPartiallyExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Integer> _changeableSetAttr = it.getChangeableSetAttr();
      Iterables.<Integer>addAll(_changeableSetAttr, Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(31), Integer.valueOf(1), Integer.valueOf(2))));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr()).merge(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(2))), this.xtextSiriusTestPackage.getIElement_ChangeableSetAttr());
    Assert.assertEquals(4, result.getChangeableSetAttr().size());
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(1)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(2)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(31)));
    Assert.assertTrue(result.getChangeableSetAttr().contains(Integer.valueOf(3)));
  }
}
