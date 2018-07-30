package com.altran.general.integration.xtextsirius.test.util.semanticregionnavigator;

import com.altran.general.integration.xtextsirius.runtime.util.SemanticRegionNavigator;
import com.altran.general.integration.xtextsirius.test.util.ARegion;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
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
    SemanticRegionNavigator.getInstance().selectLastmostRegion(CollectionLiterals.<ISemanticRegion>emptySet());
  }
  
  @Test
  public void singleEntry() {
    final Statemachine model = this.getDefaultModel();
    final Event event = IterableExtensions.<Event>head(model.getEvents());
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    final ISemanticRegion semanticRegion = IterableExtensions.<ISemanticRegion>head(eventRegion.getSemanticRegions());
    final ISemanticRegion lastmost = SemanticRegionNavigator.getInstance().selectLastmostRegion(IterableExtensions.<ISemanticRegion>toSet(Collections.<ISemanticRegion>unmodifiableList(CollectionLiterals.<ISemanticRegion>newArrayList(semanticRegion))));
    Assert.assertSame(semanticRegion, lastmost);
  }
  
  @Test
  public void manyEntries() {
    final Statemachine model = this.getDefaultModel();
    final Event event = IterableExtensions.<Event>head(model.getEvents());
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    final ISemanticRegion lastRegion = IterableExtensions.<ISemanticRegion>last(eventRegion.getSemanticRegions());
    final List<ISemanticRegion> regions = IterableExtensions.<ISemanticRegion>toList(eventRegion.getSemanticRegions());
    Random _random = new Random(31337);
    Collections.shuffle(regions, _random);
    final ISemanticRegion lastmost = SemanticRegionNavigator.getInstance().selectLastmostRegion(IterableExtensions.<ISemanticRegion>toSet(regions));
    Assert.assertSame(lastRegion, lastmost);
  }
}
