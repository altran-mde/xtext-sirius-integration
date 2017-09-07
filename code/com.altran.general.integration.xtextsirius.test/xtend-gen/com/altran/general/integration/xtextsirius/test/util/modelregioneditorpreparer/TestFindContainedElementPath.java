package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFindContainedElementPath extends AModelRegionEditorPreparer {
  @Test
  public void noPath() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final AbstractElement baseElement = ((AbstractElement) _grammarElement);
    final List<AbstractElement> path = preparer.findContainedElementPath(baseElement, AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getState_Transitions());
    Assert.assertTrue(path.isEmpty());
  }
  
  @Test
  public void invalidPath() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final AbstractElement baseElement = ((AbstractElement) _grammarElement);
    final List<AbstractElement> path = preparer.findContainedElementPath(baseElement, AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getConstant_Value());
    Assert.assertTrue(path.isEmpty());
  }
  
  @Test
  public void simplePath() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final AbstractElement baseElement = ((AbstractElement) _grammarElement);
    final List<AbstractElement> path = preparer.findContainedElementPath(baseElement, AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name());
    Assert.assertEquals(path.toString(), 3, path.size());
    Assert.assertEquals(baseElement, IterableExtensions.<AbstractElement>head(path));
    AbstractElement _last = IterableExtensions.<AbstractElement>last(path);
    Assert.assertTrue((_last instanceof Assignment));
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(path);
    final Assignment last = ((Assignment) _last_1);
    Assert.assertEquals(AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name().getName(), last.getFeature());
  }
  
  @Test
  public void complexPath() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final AbstractElement baseElement = ((AbstractElement) _grammarElement);
    final List<AbstractElement> path = preparer.findContainedElementPath(baseElement, AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard());
    Assert.assertEquals(path.toString(), 4, path.size());
    Assert.assertEquals(baseElement, IterableExtensions.<AbstractElement>head(path));
    AbstractElement _last = IterableExtensions.<AbstractElement>last(path);
    Assert.assertTrue((_last instanceof Assignment));
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(path);
    final Assignment last = ((Assignment) _last_1);
    Assert.assertEquals(AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard().getName(), last.getFeature());
  }
}
