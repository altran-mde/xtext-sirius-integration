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
public class TestResolveEditableFeatures extends AModelRegionEditorPreparer {
  @Test
  public void emptyFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(0, resolved.size());
  }
  
  @Test
  public void invalidFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    preparer.setEditableFeatures(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("some", "feature")));
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(0, resolved.size());
  }
  
  @Test
  public void someInvalidFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    preparer.setEditableFeatures(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "some", "guard", "cond")));
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(resolved.toString(), 2, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "guard"));
  }
  
  @Test
  public void validFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    preparer.setEditableFeatures(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "guard")));
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(resolved.toString(), 2, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "guard"));
  }
}
