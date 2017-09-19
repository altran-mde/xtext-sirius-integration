package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCollectGrammarElementsBeforeAndAfter extends AModelRegionEditorPreparer {
  @Test
  public void emptyGroup() {
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ArrayList<AbstractElement> elementsBefore = CollectionLiterals.<AbstractElement>newArrayList();
    final ArrayList<AbstractElement> elementsAfter = CollectionLiterals.<AbstractElement>newArrayList();
    preparer.collectGrammarElementsBeforeAndAfter(XtextFactory.eINSTANCE.createAbstractElement(), 
      XtextFactory.eINSTANCE.createGroup(), elementsBefore, elementsAfter);
    Assert.assertTrue(elementsBefore.isEmpty());
    Assert.assertTrue(elementsAfter.isEmpty());
  }
  
  @Test
  public void eventName() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    final ISemanticRegion featureRegion = eventRegion.getAllRegionsFor().feature(AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name());
    EObject _grammarElement = featureRegion.getGrammarElement();
    final AbstractElement grammarElement = ((AbstractElement) _grammarElement);
    final Group group = GrammarUtil.containingGroup(grammarElement);
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ArrayList<AbstractElement> elementsBefore = CollectionLiterals.<AbstractElement>newArrayList();
    final ArrayList<AbstractElement> elementsAfter = CollectionLiterals.<AbstractElement>newArrayList();
    preparer.collectGrammarElementsBeforeAndAfter(grammarElement, group, elementsBefore, elementsAfter);
    Assert.assertTrue(elementsBefore.isEmpty());
    Assert.assertEquals(elementsAfter.toString(), 2, elementsAfter.size());
    AbstractElement _head = IterableExtensions.<AbstractElement>head(elementsAfter);
    Assert.assertTrue((_head instanceof Assignment));
    AbstractElement _head_1 = IterableExtensions.<AbstractElement>head(elementsAfter);
    final Assignment elementAfter1 = ((Assignment) _head_1);
    Assert.assertEquals("code", elementAfter1.getFeature());
    AbstractElement _last = IterableExtensions.<AbstractElement>last(elementsAfter);
    Assert.assertTrue((_last instanceof Group));
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(elementsAfter);
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
    final AbstractElement grammarElement = ((AbstractElement) _grammarElement);
    final Group group = GrammarUtil.containingGroup(grammarElement);
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ArrayList<AbstractElement> elementsBefore = CollectionLiterals.<AbstractElement>newArrayList();
    final ArrayList<AbstractElement> elementsAfter = CollectionLiterals.<AbstractElement>newArrayList();
    preparer.collectGrammarElementsBeforeAndAfter(grammarElement, group, elementsBefore, elementsAfter);
    Assert.assertEquals(elementsBefore.toString(), 1, elementsBefore.size());
    AbstractElement _head = IterableExtensions.<AbstractElement>head(elementsBefore);
    Assert.assertTrue((_head instanceof Assignment));
    AbstractElement _head_1 = IterableExtensions.<AbstractElement>head(elementsBefore);
    final Assignment elementBefore = ((Assignment) _head_1);
    Assert.assertEquals("name", elementBefore.getFeature());
    Assert.assertEquals(elementsAfter.toString(), 1, elementsAfter.size());
    AbstractElement _head_2 = IterableExtensions.<AbstractElement>head(elementsAfter);
    Assert.assertTrue((_head_2 instanceof Group));
    AbstractElement _head_3 = IterableExtensions.<AbstractElement>head(elementsAfter);
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
    final Group grammarElement = GrammarUtil.containingGroup(GrammarUtil.containingGroup(((AbstractElement) _grammarElement)));
    EObject _eContainer = grammarElement.eContainer();
    final Group group = ((Group) _eContainer);
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ArrayList<AbstractElement> elementsBefore = CollectionLiterals.<AbstractElement>newArrayList();
    final ArrayList<AbstractElement> elementsAfter = CollectionLiterals.<AbstractElement>newArrayList();
    preparer.collectGrammarElementsBeforeAndAfter(grammarElement, group, elementsBefore, elementsAfter);
    Assert.assertEquals(elementsBefore.toString(), 2, elementsBefore.size());
    AbstractElement _head = IterableExtensions.<AbstractElement>head(elementsBefore);
    Assert.assertTrue((_head instanceof Assignment));
    AbstractElement _head_1 = IterableExtensions.<AbstractElement>head(elementsBefore);
    final Assignment elementBefore1 = ((Assignment) _head_1);
    Assert.assertEquals("name", elementBefore1.getFeature());
    AbstractElement _last = IterableExtensions.<AbstractElement>last(elementsBefore);
    Assert.assertTrue((_last instanceof Assignment));
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(elementsBefore);
    final Assignment elementBefore2 = ((Assignment) _last_1);
    Assert.assertEquals("code", elementBefore2.getFeature());
    Assert.assertTrue(elementsAfter.isEmpty());
  }
}
