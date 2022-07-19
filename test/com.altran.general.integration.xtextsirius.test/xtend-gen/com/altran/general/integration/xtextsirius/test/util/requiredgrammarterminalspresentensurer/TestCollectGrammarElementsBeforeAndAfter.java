/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.ARequiredGrammarTerminalsPresentEnsurer;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.AccessibleRequiredGrammarTerminalsPresentEnsurer;
import com.google.common.collect.Iterables;
import org.apache.commons.lang.SystemUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCollectGrammarElementsBeforeAndAfter extends ARequiredGrammarTerminalsPresentEnsurer {
  @Before
  public void assumeWindows() {
    Assume.assumeTrue("Test requires Windows OS", SystemUtils.IS_OS_WINDOWS);
  }
  
  @Test
  public void emptyGroup() {
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
      it.setContainedElement(XtextFactory.eINSTANCE.createAbstractElement());
      it.setContainingGroup(XtextFactory.eINSTANCE.createGroup());
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    ensurer.collectBeforeAndAfter();
    Assert.assertTrue(ensurer.getElementsBefore().isEmpty());
    Assert.assertTrue(ensurer.getElementsAfter().isEmpty());
  }
  
  @Test
  public void eventName() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    final ISemanticRegion featureRegion = eventRegion.getAllRegionsFor().feature(AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name());
    EObject _grammarElement = featureRegion.getGrammarElement();
    final AbstractElement grElement = ((AbstractElement) _grammarElement);
    final Group group = GrammarUtil.containingGroup(grElement);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
      it.setContainedElement(grElement);
      it.setContainingGroup(group);
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    ensurer.collectBeforeAndAfter();
    Assert.assertTrue(ensurer.getElementsBefore().isEmpty());
    Assert.assertEquals(ensurer.getElementsAfter().toString(), 2, ensurer.getElementsAfter().size());
    AbstractElement _head = IterableExtensions.<AbstractElement>head(ensurer.getElementsAfter());
    Assert.assertTrue((_head instanceof Assignment));
    AbstractElement _head_1 = IterableExtensions.<AbstractElement>head(ensurer.getElementsAfter());
    final Assignment elementAfter1 = ((Assignment) _head_1);
    Assert.assertEquals("code", elementAfter1.getFeature());
    AbstractElement _last = IterableExtensions.<AbstractElement>last(ensurer.getElementsAfter());
    Assert.assertTrue((_last instanceof Group));
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(ensurer.getElementsAfter());
    final Group elementAfter2 = ((Group) _last_1);
    Assert.assertEquals("guard", IterableExtensions.<Assignment>head(Iterables.<Assignment>filter(elementAfter2.getElements(), Assignment.class)).getFeature());
  }
  
  @Test
  public void eventCode() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    final ISemanticRegion featureRegion = eventRegion.getAllRegionsFor().feature(AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Code());
    EObject _grammarElement = featureRegion.getGrammarElement();
    final AbstractElement grElement = ((AbstractElement) _grammarElement);
    final Group group = GrammarUtil.containingGroup(grElement);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
      it.setContainedElement(grElement);
      it.setContainingGroup(group);
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    ensurer.collectBeforeAndAfter();
    Assert.assertEquals(ensurer.getElementsBefore().toString(), 1, ensurer.getElementsBefore().size());
    AbstractElement _head = IterableExtensions.<AbstractElement>head(ensurer.getElementsBefore());
    Assert.assertTrue((_head instanceof Assignment));
    AbstractElement _head_1 = IterableExtensions.<AbstractElement>head(ensurer.getElementsBefore());
    final Assignment elementBefore = ((Assignment) _head_1);
    Assert.assertEquals("name", elementBefore.getFeature());
    Assert.assertEquals(ensurer.getElementsAfter().toString(), 1, ensurer.getElementsAfter().size());
    AbstractElement _head_2 = IterableExtensions.<AbstractElement>head(ensurer.getElementsAfter());
    Assert.assertTrue(ensurer.getElementsAfter().toString(), (_head_2 instanceof Group));
    AbstractElement _head_3 = IterableExtensions.<AbstractElement>head(ensurer.getElementsAfter());
    final Group elementAfter = ((Group) _head_3);
    Assert.assertEquals("guard", IterableExtensions.<Assignment>head(Iterables.<Assignment>filter(elementAfter.getElements(), Assignment.class)).getFeature());
  }
  
  @Test
  public void eventGuard() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    final ISemanticRegion featureRegion = eventRegion.getAllRegionsFor().feature(AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Code()).getNextSemanticRegion();
    EObject _grammarElement = featureRegion.getGrammarElement();
    final Group grElement = GrammarUtil.containingGroup(GrammarUtil.containingGroup(((AbstractElement) _grammarElement)));
    EObject _eContainer = grElement.eContainer();
    final Group group = ((Group) _eContainer);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
      it.setContainedElement(grElement);
      it.setContainingGroup(group);
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    ensurer.collectBeforeAndAfter();
    Assert.assertEquals(ensurer.getElementsBefore().toString(), 2, ensurer.getElementsBefore().size());
    AbstractElement _head = IterableExtensions.<AbstractElement>head(ensurer.getElementsBefore());
    Assert.assertTrue((_head instanceof Assignment));
    AbstractElement _head_1 = IterableExtensions.<AbstractElement>head(ensurer.getElementsBefore());
    final Assignment elementBefore1 = ((Assignment) _head_1);
    Assert.assertEquals("name", elementBefore1.getFeature());
    AbstractElement _last = IterableExtensions.<AbstractElement>last(ensurer.getElementsBefore());
    Assert.assertTrue((_last instanceof Assignment));
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(ensurer.getElementsBefore());
    final Assignment elementBefore2 = ((Assignment) _last_1);
    Assert.assertEquals("code", elementBefore2.getFeature());
    Assert.assertTrue(ensurer.getElementsAfter().isEmpty());
  }
}
