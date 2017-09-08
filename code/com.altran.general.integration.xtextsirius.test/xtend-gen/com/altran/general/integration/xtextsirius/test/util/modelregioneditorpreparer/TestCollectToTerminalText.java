package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCollectToTerminalText extends AModelRegionEditorPreparer {
  @Test
  public void empty() {
    final Statemachine model = this.getDefaultModel();
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    EObject _grammarElement = IterableExtensions.<ISemanticRegion>head(rootRegion.regionForRootEObject().getAllSemanticRegions()).getGrammarElement();
    final AbstractElement grammarElement = ((AbstractElement) _grammarElement);
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final String text = preparer.collectToTerminalText(grammarElement, CollectionLiterals.<AbstractElement>emptyList());
    Assert.assertEquals(" ", text);
  }
  
  @Test
  public void noTerminals() {
    final Statemachine model = this.getDefaultModel();
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    EObject _grammarElement = IterableExtensions.<ISemanticRegion>head(rootRegion.regionForRootEObject().getAllSemanticRegions()).getGrammarElement();
    final AbstractElement grammarElement = ((AbstractElement) _grammarElement);
    final Function1<ISemanticRegion, EObject> _function = (ISemanticRegion it) -> {
      return it.getSemanticElement();
    };
    final Function1<AbstractElement, Boolean> _function_1 = (AbstractElement it) -> {
      return Boolean.valueOf((!(it instanceof Keyword)));
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(IterableExtensions.<AbstractElement>filter(Iterables.<AbstractElement>filter(IterableExtensions.<ISemanticRegion, EObject>map(rootRegion.regionForRootEObject().getAllSemanticRegions(), _function), AbstractElement.class), _function_1));
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final String text = preparer.collectToTerminalText(grammarElement, grammarElements);
    Assert.assertEquals(" ", text);
  }
  
  @Test
  public void oneTerminal() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getPreviousSemanticRegion().getGrammarElement();
    final AbstractElement grammarElement = ((AbstractElement) _grammarElement);
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final String text = preparer.collectToTerminalText(grammarElement, Collections.<AbstractElement>unmodifiableList(CollectionLiterals.<AbstractElement>newArrayList(grammarElement)));
    Assert.assertEquals("events", text);
  }
  
  @Test
  public void severalTerminals() {
    final Statemachine model = this.getDefaultModel();
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    final Function1<ISemanticRegion, Boolean> _function = (ISemanticRegion it) -> {
      EObject _grammarElement = it.getGrammarElement();
      return Boolean.valueOf((_grammarElement instanceof Keyword));
    };
    final Function1<ISemanticRegion, Boolean> _function_1 = (ISemanticRegion it) -> {
      EObject _grammarElement = it.getGrammarElement();
      String _value = ((Keyword) _grammarElement).getValue();
      return Boolean.valueOf(Objects.equal(_value, "events"));
    };
    final ISemanticRegion eventsRegion = IterableExtensions.<ISemanticRegion>findFirst(IterableExtensions.<ISemanticRegion>filter(rootRegion.regionForRootEObject().getAllSemanticRegions(), _function), _function_1);
    final Function1<ISemanticRegion, Boolean> _function_2 = (ISemanticRegion it) -> {
      EObject _grammarElement = it.getGrammarElement();
      return Boolean.valueOf((_grammarElement instanceof Keyword));
    };
    final Function1<ISemanticRegion, Boolean> _function_3 = (ISemanticRegion it) -> {
      EObject _grammarElement = it.getGrammarElement();
      String _value = ((Keyword) _grammarElement).getValue();
      return Boolean.valueOf(Objects.equal(_value, "end"));
    };
    final ISemanticRegion eventsEndRegion = IterableExtensions.<ISemanticRegion>findFirst(IterableExtensions.<ISemanticRegion>filter(rootRegion.regionForRootEObject().getAllSemanticRegions(), _function_2), _function_3);
    final Function1<ISemanticRegion, Boolean> _function_4 = (ISemanticRegion it) -> {
      return Boolean.valueOf(((it.getOffset() >= eventsRegion.getOffset()) && (it.getEndOffset() <= eventsEndRegion.getEndOffset())));
    };
    final Function1<ISemanticRegion, EObject> _function_5 = (ISemanticRegion it) -> {
      return it.getGrammarElement();
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(Iterables.<AbstractElement>filter(IterableExtensions.<ISemanticRegion, EObject>map(IterableExtensions.<ISemanticRegion>filter(rootRegion.regionForRootEObject().getAllSemanticRegions(), _function_4), _function_5), AbstractElement.class));
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    EObject _grammarElement = eventsRegion.getGrammarElement();
    final String text = preparer.collectToTerminalText(((AbstractElement) _grammarElement), grammarElements);
    Assert.assertEquals("events[][][][..]end", text);
  }
}
