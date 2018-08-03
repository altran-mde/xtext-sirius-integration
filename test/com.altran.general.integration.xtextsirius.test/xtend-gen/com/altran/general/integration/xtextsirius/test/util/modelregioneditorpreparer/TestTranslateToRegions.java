package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.Set;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestTranslateToRegions extends AModelRegionEditorPreparer {
  @Test
  public void emptyFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    final Set<ISemanticRegion> regions = preparer.translateToRegions(CollectionLiterals.<EStructuralFeature>emptySet(), eventRegion, event, rootRegion);
    Assert.assertEquals(0, regions.size());
  }
  
  @Test
  public void oneDefinedFeature() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name();
    EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard();
    Set<? extends EStructuralFeature> _set = IterableExtensions.toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(_event_Name, _event_Guard)));
    final Set<ISemanticRegion> regions = preparer.translateToRegions(((Set<EStructuralFeature>) _set), eventRegion, event, rootRegion);
    Assert.assertEquals(1, regions.size());
    final ISemanticRegion region = IterableExtensions.<ISemanticRegion>head(regions);
    Assert.assertEquals(26, region.getOffset());
    Assert.assertEquals(6, region.getLength());
    Assert.assertEquals("event1", region.getText());
  }
  
  @Test
  public void someDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(2);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name();
    EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard();
    Set<? extends EStructuralFeature> _set = IterableExtensions.toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(_event_Name, _event_Guard)));
    final Set<ISemanticRegion> regions = preparer.translateToRegions(((Set<EStructuralFeature>) _set), eventRegion, event, rootRegion);
    Assert.assertEquals(2, regions.size());
    final Function1<ISemanticRegion, Boolean> _function = (ISemanticRegion it) -> {
      EObject _semanticElement = it.getSemanticElement();
      return Boolean.valueOf((_semanticElement instanceof Event));
    };
    final ISemanticRegion region1 = IterableExtensions.<ISemanticRegion>findFirst(regions, _function);
    Assert.assertEquals(58, region1.getOffset());
    Assert.assertEquals(6, region1.getLength());
    Assert.assertEquals("event3", region1.getText());
    final Function1<ISemanticRegion, Boolean> _function_1 = (ISemanticRegion it) -> {
      EObject _semanticElement = it.getSemanticElement();
      return Boolean.valueOf((_semanticElement instanceof ConstantRef));
    };
    final ISemanticRegion region2 = IterableExtensions.<ISemanticRegion>findFirst(regions, _function_1);
    Assert.assertEquals(75, region2.getOffset());
    Assert.assertEquals(9, region2.getLength());
    Assert.assertEquals("constant1", region2.getText());
  }
}
