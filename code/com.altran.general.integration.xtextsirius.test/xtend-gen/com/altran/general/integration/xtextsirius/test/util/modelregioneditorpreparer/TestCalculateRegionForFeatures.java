package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Command;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCalculateRegionForFeatures extends AModelRegionEditorPreparer {
  @Test(expected = NoSuchElementException.class)
  public void emptyFeatures() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    Set<EStructuralFeature> _emptySet = CollectionLiterals.<EStructuralFeature>emptySet();
    preparer.setDefinedFeatures(_emptySet);
    preparer.calculateRegionForFeatures(event);
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
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    preparer.setSemanticRegion(eventRegion);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Name = _statemachinePackage.getEvent_Name();
    Set<EStructuralFeature> _set = IterableExtensions.<EStructuralFeature>toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(((EStructuralFeature) _event_Name))));
    preparer.setDefinedFeatures(_set);
    final TextRegion region = preparer.calculateRegionForFeatures(event);
    int _offset = region.getOffset();
    Assert.assertEquals(26, _offset);
    int _length = region.getLength();
    Assert.assertEquals(6, _length);
    String _resolveRegion = this.resolveRegion(rootRegion, region);
    Assert.assertEquals("event1", _resolveRegion);
  }
  
  @Test
  public void oneDefinedFeatureLong() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(2);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    preparer.setSemanticRegion(eventRegion);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Name = _statemachinePackage.getEvent_Name();
    Set<EStructuralFeature> _set = IterableExtensions.<EStructuralFeature>toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(((EStructuralFeature) _event_Name))));
    preparer.setDefinedFeatures(_set);
    final TextRegion region = preparer.calculateRegionForFeatures(event);
    int _offset = region.getOffset();
    Assert.assertEquals(58, _offset);
    int _length = region.getLength();
    Assert.assertEquals(6, _length);
    String _resolveRegion = this.resolveRegion(rootRegion, region);
    Assert.assertEquals("event3", _resolveRegion);
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
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    preparer.setSemanticRegion(eventRegion);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Name = _statemachinePackage.getEvent_Name();
    StatemachinePackage _statemachinePackage_1 = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _event_Guard = _statemachinePackage_1.getEvent_Guard();
    Set<? extends EStructuralFeature> _set = IterableExtensions.toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(_event_Name, _event_Guard)));
    preparer.setDefinedFeatures(((Set<EStructuralFeature>) _set));
    final TextRegion region = preparer.calculateRegionForFeatures(event);
    int _offset = region.getOffset();
    Assert.assertEquals(58, _offset);
    int _length = region.getLength();
    Assert.assertEquals(30, _length);
    final String text = this.resolveRegion(rootRegion, region);
    Assert.assertEquals("event3\r\n333\t \t[\r\nconstant1\t\t\t]", text);
  }
  
  @Test
  public void allPrefixedFeatures() {
    final Statemachine model = this.getDefaultModel();
    EList<Command> _commands = model.getCommands();
    final Command cmd = _commands.get(1);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(cmd, _injector, false, _emptyList);
    final ITextRegionAccess rootRegion = this.getRootRegion(cmd);
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion cmdRegion = rootRegion.regionForEObject(cmd);
    preparer.setSemanticRegion(cmdRegion);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _command_Name = _statemachinePackage.getCommand_Name();
    StatemachinePackage _statemachinePackage_1 = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _command_Code = _statemachinePackage_1.getCommand_Code();
    StatemachinePackage _statemachinePackage_2 = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _command_Guard = _statemachinePackage_2.getCommand_Guard();
    Set<? extends EStructuralFeature> _set = IterableExtensions.toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(_command_Name, _command_Code, _command_Guard)));
    preparer.setDefinedFeatures(((Set<EStructuralFeature>) _set));
    final TextRegion region = preparer.calculateRegionForFeatures(cmd);
    int _offset = region.getOffset();
    Assert.assertEquals(194, _offset);
    int _length = region.getLength();
    Assert.assertEquals(18, _length);
    final String text = this.resolveRegion(rootRegion, region);
    Assert.assertEquals("[123] command2 234", text);
  }
}
