package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.ARequiredGrammarTerminalsPresentEnsurer;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.AccessibleRequiredGrammarTerminalsPresentEnsurer;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCollectToTerminalText extends ARequiredGrammarTerminalsPresentEnsurer {
  @Test
  public void empty() {
    final Statemachine model = this.getDefaultModel();
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    IEObjectRegion _regionForRootEObject = rootRegion.regionForRootEObject();
    Iterable<ISemanticRegion> _allSemanticRegions = _regionForRootEObject.getAllSemanticRegions();
    ISemanticRegion _head = IterableExtensions.<ISemanticRegion>head(_allSemanticRegions);
    EObject _grammarElement = _head.getGrammarElement();
    final AbstractElement grElement = ((AbstractElement) _grammarElement);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
      it.setGrammarElement(grElement);
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer assurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    List<AbstractElement> _emptyList = CollectionLiterals.<AbstractElement>emptyList();
    final String text = assurer.collectToTerminalText(_emptyList);
    Assert.assertEquals(" ", text);
  }
  
  @Test
  public void noTerminals() {
    final Statemachine model = this.getDefaultModel();
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    IEObjectRegion _regionForRootEObject = rootRegion.regionForRootEObject();
    Iterable<ISemanticRegion> _allSemanticRegions = _regionForRootEObject.getAllSemanticRegions();
    ISemanticRegion _head = IterableExtensions.<ISemanticRegion>head(_allSemanticRegions);
    EObject _grammarElement = _head.getGrammarElement();
    final AbstractElement grElement = ((AbstractElement) _grammarElement);
    IEObjectRegion _regionForRootEObject_1 = rootRegion.regionForRootEObject();
    Iterable<ISemanticRegion> _allSemanticRegions_1 = _regionForRootEObject_1.getAllSemanticRegions();
    final Function1<ISemanticRegion, EObject> _function = (ISemanticRegion it) -> {
      return it.getSemanticElement();
    };
    Iterable<EObject> _map = IterableExtensions.<ISemanticRegion, EObject>map(_allSemanticRegions_1, _function);
    Iterable<AbstractElement> _filter = Iterables.<AbstractElement>filter(_map, AbstractElement.class);
    final Function1<AbstractElement, Boolean> _function_1 = (AbstractElement it) -> {
      return Boolean.valueOf((!(it instanceof Keyword)));
    };
    Iterable<AbstractElement> _filter_1 = IterableExtensions.<AbstractElement>filter(_filter, _function_1);
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(_filter_1);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function_2 = (AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
      it.setGrammarElement(grElement);
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer assurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function_2);
    final String text = assurer.collectToTerminalText(grammarElements);
    Assert.assertEquals(" ", text);
  }
  
  @Test
  public void oneTerminal() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    ISemanticRegion _previousSemanticRegion = eventRegion.getPreviousSemanticRegion();
    EObject _grammarElement = _previousSemanticRegion.getGrammarElement();
    final AbstractElement grElement = ((AbstractElement) _grammarElement);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
      it.setGrammarElement(grElement);
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer assurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    final String text = assurer.collectToTerminalText(Collections.<AbstractElement>unmodifiableList(CollectionLiterals.<AbstractElement>newArrayList(grElement)));
    Assert.assertEquals("events", text);
  }
  
  @Test
  public void severalTerminals() {
    final Statemachine model = this.getDefaultModel();
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    IEObjectRegion _regionForRootEObject = rootRegion.regionForRootEObject();
    Iterable<ISemanticRegion> _allSemanticRegions = _regionForRootEObject.getAllSemanticRegions();
    final Function1<ISemanticRegion, Boolean> _function = (ISemanticRegion it) -> {
      EObject _grammarElement = it.getGrammarElement();
      return Boolean.valueOf((_grammarElement instanceof Keyword));
    };
    Iterable<ISemanticRegion> _filter = IterableExtensions.<ISemanticRegion>filter(_allSemanticRegions, _function);
    final Function1<ISemanticRegion, Boolean> _function_1 = (ISemanticRegion it) -> {
      EObject _grammarElement = it.getGrammarElement();
      String _value = ((Keyword) _grammarElement).getValue();
      return Boolean.valueOf(Objects.equal(_value, "events"));
    };
    final ISemanticRegion eventsRegion = IterableExtensions.<ISemanticRegion>findFirst(_filter, _function_1);
    IEObjectRegion _regionForRootEObject_1 = rootRegion.regionForRootEObject();
    Iterable<ISemanticRegion> _allSemanticRegions_1 = _regionForRootEObject_1.getAllSemanticRegions();
    final Function1<ISemanticRegion, Boolean> _function_2 = (ISemanticRegion it) -> {
      EObject _grammarElement = it.getGrammarElement();
      return Boolean.valueOf((_grammarElement instanceof Keyword));
    };
    Iterable<ISemanticRegion> _filter_1 = IterableExtensions.<ISemanticRegion>filter(_allSemanticRegions_1, _function_2);
    final Function1<ISemanticRegion, Boolean> _function_3 = (ISemanticRegion it) -> {
      EObject _grammarElement = it.getGrammarElement();
      String _value = ((Keyword) _grammarElement).getValue();
      return Boolean.valueOf(Objects.equal(_value, "end"));
    };
    final ISemanticRegion eventsEndRegion = IterableExtensions.<ISemanticRegion>findFirst(_filter_1, _function_3);
    IEObjectRegion _regionForRootEObject_2 = rootRegion.regionForRootEObject();
    Iterable<ISemanticRegion> _allSemanticRegions_2 = _regionForRootEObject_2.getAllSemanticRegions();
    final Function1<ISemanticRegion, Boolean> _function_4 = (ISemanticRegion it) -> {
      boolean _and = false;
      int _offset = it.getOffset();
      int _offset_1 = eventsRegion.getOffset();
      boolean _greaterEqualsThan = (_offset >= _offset_1);
      if (!_greaterEqualsThan) {
        _and = false;
      } else {
        int _endOffset = it.getEndOffset();
        int _endOffset_1 = eventsEndRegion.getEndOffset();
        boolean _lessEqualsThan = (_endOffset <= _endOffset_1);
        _and = _lessEqualsThan;
      }
      return Boolean.valueOf(_and);
    };
    Iterable<ISemanticRegion> _filter_2 = IterableExtensions.<ISemanticRegion>filter(_allSemanticRegions_2, _function_4);
    final Function1<ISemanticRegion, EObject> _function_5 = (ISemanticRegion it) -> {
      return it.getGrammarElement();
    };
    Iterable<EObject> _map = IterableExtensions.<ISemanticRegion, EObject>map(_filter_2, _function_5);
    Iterable<AbstractElement> _filter_3 = Iterables.<AbstractElement>filter(_map, AbstractElement.class);
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(_filter_3);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function_6 = (AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
      EObject _grammarElement = eventsRegion.getGrammarElement();
      it.setGrammarElement(((AbstractElement) _grammarElement));
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer assurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function_6);
    final String text = assurer.collectToTerminalText(grammarElements);
    Assert.assertEquals("events[][][][..]end", text);
  }
}
