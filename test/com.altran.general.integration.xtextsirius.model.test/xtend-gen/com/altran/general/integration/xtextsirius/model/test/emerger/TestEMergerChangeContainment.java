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

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerEReference;
import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerChangeContainment extends ATestEMergerEReference<Element> {
  @Test
  public void single_single() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      ContainedA _createContainedA = this.xtextSiriusTestFactory.createContainedA();
      final Procedure1<ContainedA> _function_1 = (ContainedA it_1) -> {
        it_1.setAttrB("11b");
        it_1.setAttrX("11x");
      };
      ContainedA _doubleArrow = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA, _function_1);
      it.setContainedSingle(_doubleArrow);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      ContainedB _createContainedB = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_2 = (ContainedB it_1) -> {
        it_1.setAttrA("22a");
        it_1.setAttrB("22b");
        it_1.setAttrY("22y");
      };
      ContainedB _doubleArrow = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB, _function_2);
      it.setContainedSingle(_doubleArrow);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertNotNull(result.getContainedSingle());
    IContainedElement _containedSingle = result.getContainedSingle();
    Assert.assertTrue((_containedSingle instanceof ContainedA));
    Assert.assertNull(result.getContainedSingle().getAttrA());
    Assert.assertEquals("11b", result.getContainedSingle().eGet(this.xtextSiriusTestPackage.getContainedA_AttrB()));
    Assert.assertEquals("11x", result.getContainedSingle().eGet(this.xtextSiriusTestPackage.getContainedA_AttrX()));
  }
  
  @Test
  public void single_multiEmpty() {
    ContainedA _createContainedA = this.xtextSiriusTestFactory.createContainedA();
    final Procedure1<ContainedA> _function = (ContainedA it) -> {
      it.setAttrA("11a");
      it.setAttrB("11b");
      it.setAttrX("11x");
    };
    final ContainedA newValue = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA, _function);
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function_1);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ContainedMulti()).merge(newValue, this.xtextSiriusTestPackage.getIElement_ContainedMulti());
    Assert.assertEquals(1, result.getContainedMulti().size());
    final Function1<IContainedElement, Boolean> _function_2 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "11a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_2));
  }
  
  @Test
  public void single_multiNew() {
    ContainedA _createContainedA = this.xtextSiriusTestFactory.createContainedA();
    final Procedure1<ContainedA> _function = (ContainedA it) -> {
      it.setAttrA("11a");
      it.setAttrB("11b");
      it.setAttrX("11x");
    };
    final ContainedA newValue = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA, _function);
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<IContainedElement> _containedMulti = it.getContainedMulti();
      ContainedB _createContainedB = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_2 = (ContainedB it_1) -> {
        it_1.setAttrA("22a");
        it_1.setAttrB("22b");
        it_1.setAttrY("22y");
      };
      ContainedB _doubleArrow = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB, _function_2);
      _containedMulti.add(_doubleArrow);
      EList<IContainedElement> _containedMulti_1 = it.getContainedMulti();
      ContainedB _createContainedB_1 = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_3 = (ContainedB it_1) -> {
        it_1.setAttrA("33a");
        it_1.setAttrB("33b");
        it_1.setAttrY("33y");
      };
      ContainedB _doubleArrow_1 = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB_1, _function_3);
      _containedMulti_1.add(_doubleArrow_1);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function_1);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ContainedMulti()).merge(newValue, this.xtextSiriusTestPackage.getIElement_ContainedMulti());
    Assert.assertEquals(3, result.getContainedMulti().size());
    final Function1<IContainedElement, Boolean> _function_2 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "22a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_2));
    final Function1<IContainedElement, Boolean> _function_3 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "33a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_3));
    final Function1<IContainedElement, Boolean> _function_4 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "11a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_4));
  }
  
  @Test
  public void single_multiExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(this.newEdited(99, "99"));
      EList<IContainedElement> _containedMulti = it.getContainedMulti();
      ContainedA _createContainedA = this.xtextSiriusTestFactory.createContainedA();
      final Procedure1<ContainedA> _function_1 = (ContainedA it_1) -> {
        it_1.setAttrA("11a");
        it_1.setAttrB("11b");
        it_1.setAttrX("11x");
      };
      ContainedA _doubleArrow = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA, _function_1);
      _containedMulti.add(_doubleArrow);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(100, "100");
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<IContainedElement> _containedMulti = it.getContainedMulti();
      ContainedB _createContainedB = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_2 = (ContainedB it_1) -> {
        it_1.setAttrA("22a");
        it_1.setAttrB("22b");
        it_1.setAttrY("22y");
      };
      ContainedB _doubleArrow = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB, _function_2);
      _containedMulti.add(_doubleArrow);
      EList<IContainedElement> _containedMulti_1 = it.getContainedMulti();
      ContainedB _createContainedB_1 = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_3 = (ContainedB it_1) -> {
        it_1.setAttrA("33a");
        it_1.setAttrB("33b");
        it_1.setAttrY("33y");
      };
      ContainedB _doubleArrow_1 = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB_1, _function_3);
      _containedMulti_1.add(_doubleArrow_1);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ContainedMulti()).merge(IterableExtensions.<IContainedElement>head(edited.getContainedMulti()), this.xtextSiriusTestPackage.getIElement_ContainedMulti());
    Assert.assertEquals(2, result.getContainedMulti().size());
    final Function1<IContainedElement, Boolean> _function_2 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "11a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_2));
    final Function1<IContainedElement, Boolean> _function_3 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "33a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_3));
  }
  
  @Test
  public void multi_multiEmpty() {
    ContainedA _createContainedA = this.xtextSiriusTestFactory.createContainedA();
    final Procedure1<ContainedA> _function = (ContainedA it) -> {
      it.setAttrA("11a");
      it.setAttrB("11b");
      it.setAttrX("11x");
    };
    ContainedA _doubleArrow = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA, _function);
    ContainedA _createContainedA_1 = this.xtextSiriusTestFactory.createContainedA();
    final Procedure1<ContainedA> _function_1 = (ContainedA it) -> {
      it.setAttrA("44a");
      it.setAttrB("44b");
      it.setAttrX("44x");
    };
    ContainedA _doubleArrow_1 = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA_1, _function_1);
    final List<ContainedA> newValue = Collections.<ContainedA>unmodifiableList(CollectionLiterals.<ContainedA>newArrayList(_doubleArrow, _doubleArrow_1));
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function_2 = (Element it) -> {
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function_2);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ContainedMulti()).merge(newValue, this.xtextSiriusTestPackage.getIElement_ContainedMulti());
    Assert.assertEquals(2, result.getContainedMulti().size());
    final Function1<IContainedElement, Boolean> _function_3 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "11a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_3));
    final Function1<IContainedElement, Boolean> _function_4 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "44a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_4));
  }
  
  @Test
  public void multi_multiNew() {
    ContainedA _createContainedA = this.xtextSiriusTestFactory.createContainedA();
    final Procedure1<ContainedA> _function = (ContainedA it) -> {
      it.setAttrA("11a");
      it.setAttrB("11b");
      it.setAttrX("11x");
    };
    ContainedA _doubleArrow = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA, _function);
    ContainedA _createContainedA_1 = this.xtextSiriusTestFactory.createContainedA();
    final Procedure1<ContainedA> _function_1 = (ContainedA it) -> {
      it.setAttrA("44a");
      it.setAttrB("44b");
      it.setAttrX("44x");
    };
    ContainedA _doubleArrow_1 = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA_1, _function_1);
    final List<ContainedA> newValue = Collections.<ContainedA>unmodifiableList(CollectionLiterals.<ContainedA>newArrayList(_doubleArrow, _doubleArrow_1));
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function_2 = (Element it) -> {
      EList<IContainedElement> _containedMulti = it.getContainedMulti();
      ContainedB _createContainedB = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_3 = (ContainedB it_1) -> {
        it_1.setAttrA("22a");
        it_1.setAttrB("22b");
        it_1.setAttrY("22y");
      };
      ContainedB _doubleArrow_2 = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB, _function_3);
      _containedMulti.add(_doubleArrow_2);
      EList<IContainedElement> _containedMulti_1 = it.getContainedMulti();
      ContainedB _createContainedB_1 = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_4 = (ContainedB it_1) -> {
        it_1.setAttrA("33a");
        it_1.setAttrB("33b");
        it_1.setAttrY("33y");
      };
      ContainedB _doubleArrow_3 = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB_1, _function_4);
      _containedMulti_1.add(_doubleArrow_3);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function_2);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ContainedMulti()).merge(newValue, this.xtextSiriusTestPackage.getIElement_ContainedMulti());
    Assert.assertEquals(2, result.getContainedMulti().size());
    final Function1<IContainedElement, Boolean> _function_3 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "11a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_3));
    final Function1<IContainedElement, Boolean> _function_4 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "44a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_4));
  }
  
  @Test
  public void multi_multiExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(this.newEdited(99, "99"));
      EList<IContainedElement> _containedMulti = it.getContainedMulti();
      ContainedA _createContainedA = this.xtextSiriusTestFactory.createContainedA();
      final Procedure1<ContainedA> _function_1 = (ContainedA it_1) -> {
        it_1.setAttrA("11a");
        it_1.setAttrB("11b");
        it_1.setAttrX("11x");
      };
      ContainedA _doubleArrow = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA, _function_1);
      _containedMulti.add(_doubleArrow);
      EList<IContainedElement> _containedMulti_1 = it.getContainedMulti();
      ContainedA _createContainedA_1 = this.xtextSiriusTestFactory.createContainedA();
      final Procedure1<ContainedA> _function_2 = (ContainedA it_1) -> {
        it_1.setAttrA("44a");
        it_1.setAttrB("44b");
        it_1.setAttrX("44x");
      };
      ContainedA _doubleArrow_1 = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA_1, _function_2);
      _containedMulti_1.add(_doubleArrow_1);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(100, "100");
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<IContainedElement> _containedMulti = it.getContainedMulti();
      ContainedB _createContainedB = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_2 = (ContainedB it_1) -> {
        it_1.setAttrA("22a");
        it_1.setAttrB("22b");
        it_1.setAttrY("22y");
      };
      ContainedB _doubleArrow = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB, _function_2);
      _containedMulti.add(_doubleArrow);
      EList<IContainedElement> _containedMulti_1 = it.getContainedMulti();
      ContainedB _createContainedB_1 = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_3 = (ContainedB it_1) -> {
        it_1.setAttrA("33a");
        it_1.setAttrB("33b");
        it_1.setAttrY("33y");
      };
      ContainedB _doubleArrow_1 = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB_1, _function_3);
      _containedMulti_1.add(_doubleArrow_1);
      EList<IContainedElement> _containedMulti_2 = it.getContainedMulti();
      ContainedB _createContainedB_2 = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_4 = (ContainedB it_1) -> {
        it_1.setAttrA("55a");
        it_1.setAttrB("55b");
        it_1.setAttrY("55y");
      };
      ContainedB _doubleArrow_2 = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB_2, _function_4);
      _containedMulti_2.add(_doubleArrow_2);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, this.xtextSiriusTestPackage.getIElement_ContainedMulti()).merge(edited.getContainedMulti(), this.xtextSiriusTestPackage.getIElement_ContainedMulti());
    Assert.assertEquals(2, result.getContainedMulti().size());
    final Function1<IContainedElement, Boolean> _function_2 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "11a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_2));
    final Function1<IContainedElement, Boolean> _function_3 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "44a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_3));
  }
  
  @Test
  public void multi_multi() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableCont(this.newEdited(99, "99"));
      EList<IContainedElement> _containedMulti = it.getContainedMulti();
      ContainedA _createContainedA = this.xtextSiriusTestFactory.createContainedA();
      final Procedure1<ContainedA> _function_1 = (ContainedA it_1) -> {
        it_1.setAttrA("11a");
        it_1.setAttrB("11b");
        it_1.setAttrX("11x");
      };
      ContainedA _doubleArrow = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA, _function_1);
      _containedMulti.add(_doubleArrow);
      EList<IContainedElement> _containedMulti_1 = it.getContainedMulti();
      ContainedA _createContainedA_1 = this.xtextSiriusTestFactory.createContainedA();
      final Procedure1<ContainedA> _function_2 = (ContainedA it_1) -> {
        it_1.setAttrA("44a");
        it_1.setAttrB("44b");
        it_1.setAttrX("44x");
      };
      ContainedA _doubleArrow_1 = ObjectExtensions.<ContainedA>operator_doubleArrow(_createContainedA_1, _function_2);
      _containedMulti_1.add(_doubleArrow_1);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(100, "100");
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<IContainedElement> _containedMulti = it.getContainedMulti();
      ContainedB _createContainedB = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_2 = (ContainedB it_1) -> {
        it_1.setAttrA("22a");
        it_1.setAttrB("22b");
        it_1.setAttrY("22y");
      };
      ContainedB _doubleArrow = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB, _function_2);
      _containedMulti.add(_doubleArrow);
      EList<IContainedElement> _containedMulti_1 = it.getContainedMulti();
      ContainedB _createContainedB_1 = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_3 = (ContainedB it_1) -> {
        it_1.setAttrA("33a");
        it_1.setAttrB("33b");
        it_1.setAttrY("33y");
      };
      ContainedB _doubleArrow_1 = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB_1, _function_3);
      _containedMulti_1.add(_doubleArrow_1);
      EList<IContainedElement> _containedMulti_2 = it.getContainedMulti();
      ContainedB _createContainedB_2 = this.xtextSiriusTestFactory.createContainedB();
      final Procedure1<ContainedB> _function_4 = (ContainedB it_1) -> {
        it_1.setAttrA("55a");
        it_1.setAttrB("55b");
        it_1.setAttrY("55y");
      };
      ContainedB _doubleArrow_2 = ObjectExtensions.<ContainedB>operator_doubleArrow(_createContainedB_2, _function_4);
      _containedMulti_2.add(_doubleArrow_2);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.createEMerger(existing, edited).merge(edited);
    Assert.assertEquals(3, result.getContainedMulti().size());
    final Function1<IContainedElement, Boolean> _function_2 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "11a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_2));
    final Function1<IContainedElement, Boolean> _function_3 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "44a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_3));
    final Function1<IContainedElement, Boolean> _function_4 = (IContainedElement it) -> {
      String _attrA = it.getAttrA();
      return Boolean.valueOf(Objects.equal(_attrA, "55a"));
    };
    Assert.assertTrue(IterableExtensions.<IContainedElement>exists(result.getContainedMulti(), _function_4));
  }
}
