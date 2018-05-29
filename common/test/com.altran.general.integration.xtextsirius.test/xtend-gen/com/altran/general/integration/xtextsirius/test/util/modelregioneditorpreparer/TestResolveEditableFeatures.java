package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Assert;
import org.junit.Test;

import com.google.inject.Injector;

@SuppressWarnings("all")
public class TestResolveEditableFeatures extends AModelRegionEditorPreparer {
	@Test
	public void emptyFeatures() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(0);
		final Injector _injector = getInjector();
		final Set<String> _emptySet = CollectionLiterals.<String> emptySet();
		final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector,
				false, _emptySet);
		final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
		Assert.assertEquals(0, resolved.size());
	}
	
	@Test
	public void invalidFeatures() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(0);
		final Injector _injector = getInjector();
		final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector,
				false, Collections.<String> unmodifiableSet(CollectionLiterals.<String> newHashSet("some", "feature")));
		final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
		Assert.assertEquals(0, resolved.size());
	}
	
	@Test
	public void someInvalidFeatures() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(0);
		final Injector _injector = getInjector();
		final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector,
				false, Collections.<String> unmodifiableSet(
						CollectionLiterals.<String> newHashSet("name", "some", "guard", "cond")));
		final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
		Assert.assertEquals(resolved.toString(), 2, resolved.size());
		Assert.assertNotNull(this.<EStructuralFeature> findFirstByName(resolved, "name"));
		Assert.assertNotNull(this.<EStructuralFeature> findFirstByName(resolved, "guard"));
	}
	
	@Test
	public void validFeatures() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(0);
		final Injector _injector = getInjector();
		final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector,
				false, Collections.<String> unmodifiableSet(CollectionLiterals.<String> newHashSet("name", "guard")));
		final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
		Assert.assertEquals(resolved.toString(), 2, resolved.size());
		Assert.assertNotNull(this.<EStructuralFeature> findFirstByName(resolved, "name"));
		Assert.assertNotNull(this.<EStructuralFeature> findFirstByName(resolved, "guard"));
	}
}
