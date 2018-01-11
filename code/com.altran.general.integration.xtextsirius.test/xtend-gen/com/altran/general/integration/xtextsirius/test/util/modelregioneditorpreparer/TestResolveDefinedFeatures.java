package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestResolveDefinedFeatures extends AModelRegionEditorPreparer {
  @Test
  public void emptyFeatures() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    int _size = resolved.size();
    Assert.assertEquals(0, _size);
  }
  
  @Test
  public void someDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("Event.name", "Event.guard")));
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    String _string = resolved.toString();
    int _size = resolved.size();
    Assert.assertEquals(_string, 1, _size);
    EStructuralFeature _findFirstByName = this.<EStructuralFeature>findFirstByName(resolved, "name");
    Assert.assertNotNull(_findFirstByName);
  }
  
  @Test
  public void allDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("Event.name", "Event.code", "Event.guard")));
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    String _string = resolved.toString();
    int _size = resolved.size();
    Assert.assertEquals(_string, 2, _size);
    EStructuralFeature _findFirstByName = this.<EStructuralFeature>findFirstByName(resolved, "name");
    Assert.assertNotNull(_findFirstByName);
    EStructuralFeature _findFirstByName_1 = this.<EStructuralFeature>findFirstByName(resolved, "code");
    Assert.assertNotNull(_findFirstByName_1);
  }
  
  @Test
  public void allFeatures() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(1);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("Event.name", "Event.code", "Event.guard")));
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    String _string = resolved.toString();
    int _size = resolved.size();
    Assert.assertEquals(_string, 3, _size);
    EStructuralFeature _findFirstByName = this.<EStructuralFeature>findFirstByName(resolved, "name");
    Assert.assertNotNull(_findFirstByName);
    EStructuralFeature _findFirstByName_1 = this.<EStructuralFeature>findFirstByName(resolved, "code");
    Assert.assertNotNull(_findFirstByName_1);
    EStructuralFeature _findFirstByName_2 = this.<EStructuralFeature>findFirstByName(resolved, "guard");
    Assert.assertNotNull(_findFirstByName_2);
  }
}
