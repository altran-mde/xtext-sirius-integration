/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.TestEMergerContainment;
import com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures.EditableFeaturesExtension;
import com.altran.general.integration.xtextsirius.runtime.util.EMerger;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerContainmentEditableFeatures extends TestEMergerContainment {
  private final EditableFeaturesExtension<Element> editableFeaturesExtension = new EditableFeaturesExtension<Element>(this);
  
  @After
  public void checkUntouchedFeatures() {
    this.editableFeaturesExtension.checkUntouchedFeatures();
  }
  
  @Override
  protected EMerger<Element> createEMerger(final Element existing, final Element edited) {
    return this.editableFeaturesExtension.createEMerger(existing, edited);
  }
  
  @Override
  protected EMerger<Element> createEMerger(final Element existing, final EStructuralFeature feature) {
    return this.editableFeaturesExtension.createEMerger(existing, feature);
  }
  
  @Test
  @Override
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
    final Element result = this.editableFeaturesExtension.createEMerger(existing, edited, ImmutableSet.<String>of("changeableCont")).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  @Override
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
    final Element result = this.editableFeaturesExtension.createEMerger(existing, edited, ImmutableSet.<String>of("changeableCont")).merge(edited);
    Assert.assertNull(result.getChangeableCont());
  }
  
  @Test
  @Override
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
    Assert.assertTrue(result.getChangeableCont().getChangeableListAttr().contains("aaa"));
    Assert.assertTrue(result.getChangeableCont().getChangeableListAttr().contains("bbb"));
  }
  
  @Test
  @Override
  public void set_listPartiallyExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableUniqueListCont = it.getChangeableUniqueListCont();
      Element _newEdited = this.newEdited(3, "3");
      _changeableUniqueListCont.add(_newEdited);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    this.newEdited(99, "99");
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
    final Element result = this.createEMerger(existing, this.changeableUniqueListContFeature()).merge(ImmutableSet.<Element>of(IterableExtensions.<Element>head(edited.getChangeableUniqueListCont()), this.newEdited(2, "2")), this.changeableUniqueListContFeature());
    final EList<Element> list = result.getChangeableUniqueListCont();
    Assert.assertEquals(2, list.size());
    Assert.assertTrue(this.renderList(list), this.valueExists(list, "a3"));
    Assert.assertTrue(this.renderList(list), this.valueExists(list, "a2"));
  }
}
