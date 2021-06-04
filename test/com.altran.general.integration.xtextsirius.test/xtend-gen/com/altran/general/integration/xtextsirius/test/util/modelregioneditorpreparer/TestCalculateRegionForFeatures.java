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

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.lang.SystemUtils;
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
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCalculateRegionForFeatures extends AModelRegionEditorPreparer {
  @Before
  public void assumeWindows() {
    Assume.assumeTrue("Test requires Windows OS", SystemUtils.IS_OS_WINDOWS);
  }
  
  @Test(expected = NoSuchElementException.class)
  public void emptyFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    IXtextSiriusModelDescriptor _descriptor = this.descriptor();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_descriptor, event);
    preparer.setDefinedFeatures(CollectionLiterals.<EStructuralFeature>emptySet());
    preparer.calculateRegionForFeatures(event);
  }
  
  @Test
  public void oneDefinedFeature() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    IXtextSiriusModelDescriptor _descriptor = this.descriptor();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_descriptor, event);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    preparer.setSemanticRegion(eventRegion);
    EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name();
    preparer.setDefinedFeatures(IterableExtensions.<EStructuralFeature>toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(((EStructuralFeature) _event_Name)))));
    final TextRegion region = preparer.calculateRegionForFeatures(event);
    Assert.assertEquals(26, region.getOffset());
    Assert.assertEquals(6, region.getLength());
    Assert.assertEquals("event1", this.resolveRegion(rootRegion, region));
  }
  
  @Test
  public void oneDefinedFeatureLong() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(2);
    IXtextSiriusModelDescriptor _descriptor = this.descriptor();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_descriptor, event);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    preparer.setSemanticRegion(eventRegion);
    EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name();
    preparer.setDefinedFeatures(IterableExtensions.<EStructuralFeature>toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(((EStructuralFeature) _event_Name)))));
    final TextRegion region = preparer.calculateRegionForFeatures(event);
    Assert.assertEquals(58, region.getOffset());
    Assert.assertEquals(6, region.getLength());
    Assert.assertEquals("event3", this.resolveRegion(rootRegion, region));
  }
  
  @Test
  public void someDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(2);
    IXtextSiriusModelDescriptor _descriptor = this.descriptor();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_descriptor, event);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    preparer.setSemanticRegion(eventRegion);
    EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name();
    EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard();
    Set<? extends EStructuralFeature> _set = IterableExtensions.toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(_event_Name, _event_Guard)));
    preparer.setDefinedFeatures(((Set<EStructuralFeature>) _set));
    final TextRegion region = preparer.calculateRegionForFeatures(event);
    Assert.assertEquals(58, region.getOffset());
    Assert.assertEquals(30, region.getLength());
    final String text = this.resolveRegion(rootRegion, region);
    Assert.assertEquals("event3\r\n333\t \t[\r\nconstant1\t\t\t]", text);
  }
  
  @Test
  public void allPrefixedFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Command cmd = model.getCommands().get(1);
    IXtextSiriusModelDescriptor _descriptor = this.descriptor();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_descriptor, cmd);
    final ITextRegionAccess rootRegion = this.getRootRegion(cmd);
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion cmdRegion = rootRegion.regionForEObject(cmd);
    preparer.setSemanticRegion(cmdRegion);
    EAttribute _command_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getCommand_Name();
    EAttribute _command_Code = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getCommand_Code();
    EReference _command_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getCommand_Guard();
    Set<? extends EStructuralFeature> _set = IterableExtensions.toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(_command_Name, _command_Code, _command_Guard)));
    preparer.setDefinedFeatures(((Set<EStructuralFeature>) _set));
    final TextRegion region = preparer.calculateRegionForFeatures(cmd);
    Assert.assertEquals(194, region.getOffset());
    Assert.assertEquals(18, region.getLength());
    final String text = this.resolveRegion(rootRegion, region);
    Assert.assertEquals("[123] command2 234", text);
  }
}
