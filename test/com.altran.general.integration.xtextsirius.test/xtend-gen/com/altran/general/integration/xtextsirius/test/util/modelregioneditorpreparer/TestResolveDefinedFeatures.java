/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
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
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    Assert.assertEquals(0, resolved.size());
  }
  
  @Test
  public void someDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    preparer.setEditableFeatures(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "guard")));
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    Assert.assertEquals(resolved.toString(), 1, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
  }
  
  @Test
  public void allDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    preparer.setEditableFeatures(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "code", "guard")));
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
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_injector, event);
    preparer.setEditableFeatures(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "code", "guard")));
    final Set<EStructuralFeature> resolved = preparer.resolveDefinedFeatures(event);
    Assert.assertEquals(resolved.toString(), 3, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "code"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "guard"));
  }
}
