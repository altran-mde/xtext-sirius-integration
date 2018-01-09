package com.altran.general.integration.xtextsirius.test.util.semanticregionnavigator;

import com.altran.general.integration.xtextsirius.test.util.ARegion;
import com.altran.general.integration.xtextsirius.util.SemanticRegionNavigator;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestSelectLastmostRegion extends ARegion {
  @Test(expected = NoSuchElementException.class)
  public void emptyRegionList() {
    SemanticRegionNavigator _instance = SemanticRegionNavigator.getInstance();
    Set<ISemanticRegion> _emptySet = CollectionLiterals.<ISemanticRegion>emptySet();
    _instance.selectLastmostRegion(_emptySet);
  }
  
  @Test
  public void singleEntry() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = IterableExtensions.<Event>head(_events);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    Iterable<ISemanticRegion> _semanticRegions = eventRegion.getSemanticRegions();
    final ISemanticRegion semanticRegion = IterableExtensions.<ISemanticRegion>head(_semanticRegions);
    SemanticRegionNavigator _instance = SemanticRegionNavigator.getInstance();
    Set<ISemanticRegion> _set = IterableExtensions.<ISemanticRegion>toSet(Collections.<ISemanticRegion>unmodifiableList(CollectionLiterals.<ISemanticRegion>newArrayList(semanticRegion)));
    final ISemanticRegion lastmost = _instance.selectLastmostRegion(_set);
    Assert.assertSame(semanticRegion, lastmost);
  }
  
  @Test
  public void manyEntries() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = IterableExtensions.<Event>head(_events);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    Iterable<ISemanticRegion> _semanticRegions = eventRegion.getSemanticRegions();
    final ISemanticRegion lastRegion = IterableExtensions.<ISemanticRegion>last(_semanticRegions);
    Iterable<ISemanticRegion> _semanticRegions_1 = eventRegion.getSemanticRegions();
    final List<ISemanticRegion> regions = IterableExtensions.<ISemanticRegion>toList(_semanticRegions_1);
    Random _random = new Random(31337);
    Collections.shuffle(regions, _random);
    SemanticRegionNavigator _instance = SemanticRegionNavigator.getInstance();
    Set<ISemanticRegion> _set = IterableExtensions.<ISemanticRegion>toSet(regions);
    final ISemanticRegion lastmost = _instance.selectLastmostRegion(_set);
    Assert.assertSame(lastRegion, lastmost);
  }
}
