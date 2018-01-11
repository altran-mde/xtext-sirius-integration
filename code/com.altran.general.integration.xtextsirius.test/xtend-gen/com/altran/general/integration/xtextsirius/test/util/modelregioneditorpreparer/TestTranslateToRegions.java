package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
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
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    Set<EStructuralFeature> _emptySet = CollectionLiterals.<EStructuralFeature>emptySet();
    final Set<ISemanticRegion> regions = preparer.translateToRegions(_emptySet, eventRegion, event, rootRegion);
    int _size = regions.size();
    Assert.assertEquals(0, _size);
  }
  
  @Test
  public void oneDefinedFeature() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Name = _statemachinePackage.getEvent_Name();
    StatemachinePackage _statemachinePackage_1 = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _event_Guard = _statemachinePackage_1.getEvent_Guard();
    Set<? extends EStructuralFeature> _set = IterableExtensions.toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(_event_Name, _event_Guard)));
    final Set<ISemanticRegion> regions = preparer.translateToRegions(((Set<EStructuralFeature>) _set), eventRegion, event, rootRegion);
    int _size = regions.size();
    Assert.assertEquals(1, _size);
    final ISemanticRegion region = IterableExtensions.<ISemanticRegion>head(regions);
    int _offset = region.getOffset();
    Assert.assertEquals(26, _offset);
    int _length = region.getLength();
    Assert.assertEquals(6, _length);
    String _text = region.getText();
    Assert.assertEquals("event1", _text);
  }
  
  @Test
  public void someDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(2);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Name = _statemachinePackage.getEvent_Name();
    StatemachinePackage _statemachinePackage_1 = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _event_Guard = _statemachinePackage_1.getEvent_Guard();
    Set<? extends EStructuralFeature> _set = IterableExtensions.toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(_event_Name, _event_Guard)));
    final Set<ISemanticRegion> regions = preparer.translateToRegions(((Set<EStructuralFeature>) _set), eventRegion, event, rootRegion);
    int _size = regions.size();
    Assert.assertEquals(2, _size);
    final Function1<ISemanticRegion, Boolean> _function = (ISemanticRegion it) -> {
      EObject _semanticElement = it.getSemanticElement();
      return Boolean.valueOf((_semanticElement instanceof Event));
    };
    final ISemanticRegion region1 = IterableExtensions.<ISemanticRegion>findFirst(regions, _function);
    int _offset = region1.getOffset();
    Assert.assertEquals(58, _offset);
    int _length = region1.getLength();
    Assert.assertEquals(6, _length);
    String _text = region1.getText();
    Assert.assertEquals("event3", _text);
    final Function1<ISemanticRegion, Boolean> _function_1 = (ISemanticRegion it) -> {
      EObject _semanticElement = it.getSemanticElement();
      return Boolean.valueOf((_semanticElement instanceof ConstantRef));
    };
    final ISemanticRegion region2 = IterableExtensions.<ISemanticRegion>findFirst(regions, _function_1);
    int _offset_1 = region2.getOffset();
    Assert.assertEquals(75, _offset_1);
    int _length_1 = region2.getLength();
    Assert.assertEquals(9, _length_1);
    String _text_1 = region2.getText();
    Assert.assertEquals("constant1", _text_1);
  }
}
