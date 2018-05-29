package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Command;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.google.inject.Injector;

@SuppressWarnings("all")
public class TestCalculateRegionForFeatures extends AModelRegionEditorPreparer {
	@Test(expected = NoSuchElementException.class)
	public void emptyFeatures() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(0);
		final Injector _injector = getInjector();
		final Set<String> _emptySet = CollectionLiterals.<String> emptySet();
		final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector,
				false, _emptySet);
		preparer.setDefinedFeatures(CollectionLiterals.<EStructuralFeature> emptySet());
		preparer.calculateRegionForFeatures(event);
	}
	
	@Test
	public void oneDefinedFeature() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(0);
		final Injector _injector = getInjector();
		final Set<String> _emptySet = CollectionLiterals.<String> emptySet();
		final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector,
				false, _emptySet);
		final ITextRegionAccess rootRegion = getRootRegion(event);
		preparer.setRootRegion(rootRegion);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		preparer.setSemanticRegion(eventRegion);
		final EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getEvent_Name();
		preparer.setDefinedFeatures(
				IterableExtensions.<EStructuralFeature> toSet(Collections.<EStructuralFeature> unmodifiableList(
						CollectionLiterals.<EStructuralFeature> newArrayList(((EStructuralFeature) _event_Name)))));
		final TextRegion region = preparer.calculateRegionForFeatures(event);
		Assert.assertEquals(26, region.getOffset());
		Assert.assertEquals(6, region.getLength());
		Assert.assertEquals("event1", resolveRegion(rootRegion, region));
	}
	
	@Test
	public void oneDefinedFeatureLong() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(2);
		final Injector _injector = getInjector();
		final Set<String> _emptySet = CollectionLiterals.<String> emptySet();
		final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector,
				false, _emptySet);
		final ITextRegionAccess rootRegion = getRootRegion(event);
		preparer.setRootRegion(rootRegion);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		preparer.setSemanticRegion(eventRegion);
		final EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getEvent_Name();
		preparer.setDefinedFeatures(
				IterableExtensions.<EStructuralFeature> toSet(Collections.<EStructuralFeature> unmodifiableList(
						CollectionLiterals.<EStructuralFeature> newArrayList(((EStructuralFeature) _event_Name)))));
		final TextRegion region = preparer.calculateRegionForFeatures(event);
		Assert.assertEquals(58, region.getOffset());
		Assert.assertEquals(6, region.getLength());
		Assert.assertEquals("event3", resolveRegion(rootRegion, region));
	}
	
	@Test
	public void someDefinedFeatures() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(2);
		final Injector _injector = getInjector();
		final Set<String> _emptySet = CollectionLiterals.<String> emptySet();
		final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector,
				false, _emptySet);
		final ITextRegionAccess rootRegion = getRootRegion(event);
		preparer.setRootRegion(rootRegion);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		preparer.setSemanticRegion(eventRegion);
		final EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getEvent_Name();
		final EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getEvent_Guard();
		final Set<? extends EStructuralFeature> _set = IterableExtensions
				.toSet(Collections.<EStructuralFeature> unmodifiableList(
						CollectionLiterals.<EStructuralFeature> newArrayList(_event_Name, _event_Guard)));
		preparer.setDefinedFeatures(((Set<EStructuralFeature>) _set));
		final TextRegion region = preparer.calculateRegionForFeatures(event);
		Assert.assertEquals(58, region.getOffset());
		Assert.assertEquals(30, region.getLength());
		final String text = resolveRegion(rootRegion, region);
		Assert.assertEquals("event3\r\n333\t \t[\r\nconstant1\t\t\t]", text);
	}
	
	@Test
	public void allPrefixedFeatures() {
		final Statemachine model = getDefaultModel();
		final Command cmd = model.getCommands().get(1);
		final Injector _injector = getInjector();
		final Set<String> _emptySet = CollectionLiterals.<String> emptySet();
		final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(cmd, _injector,
				false, _emptySet);
		final ITextRegionAccess rootRegion = getRootRegion(cmd);
		preparer.setRootRegion(rootRegion);
		final IEObjectRegion cmdRegion = rootRegion.regionForEObject(cmd);
		preparer.setSemanticRegion(cmdRegion);
		final EAttribute _command_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getCommand_Name();
		final EAttribute _command_Code = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getCommand_Code();
		final EReference _command_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getCommand_Guard();
		final Set<? extends EStructuralFeature> _set = IterableExtensions
				.toSet(Collections.<EStructuralFeature> unmodifiableList(CollectionLiterals
						.<EStructuralFeature> newArrayList(_command_Name, _command_Code, _command_Guard)));
		preparer.setDefinedFeatures(((Set<EStructuralFeature>) _set));
		final TextRegion region = preparer.calculateRegionForFeatures(cmd);
		Assert.assertEquals(194, region.getOffset());
		Assert.assertEquals(18, region.getLength());
		final String text = resolveRegion(rootRegion, region);
		Assert.assertEquals("[123] command2 234", text);
	}
}
