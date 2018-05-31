package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.Set;
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
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, _emptySet);
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    Assert.assertEquals(0, resolved.size());
  }
  
  @Test
  public void someDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "guard")));
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    Assert.assertEquals(resolved.toString(), 1, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
  }
  
  @Test
  public void allDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "code", "guard")));
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    Assert.assertEquals(resolved.toString(), 2, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "code"));
  }
  
  @Test
  public void allFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(1);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "code", "guard")));
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    Assert.assertEquals(resolved.toString(), 3, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "code"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "guard"));
  }
}
