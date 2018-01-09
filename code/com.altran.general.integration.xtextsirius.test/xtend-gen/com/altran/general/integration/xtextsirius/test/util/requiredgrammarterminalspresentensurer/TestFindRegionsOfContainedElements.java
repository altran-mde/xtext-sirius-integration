package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import com.altran.general.integration.xtextsirius.test.util.parentmap.AccessibleParentMap;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.ARequiredGrammarTerminalsPresentEnsurer;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.AccessibleRequiredGrammarTerminalsPresentEnsurer;
import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.RuleCall;
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
public class TestFindRegionsOfContainedElements extends ARequiredGrammarTerminalsPresentEnsurer {
  @Test
  public void emptyElements() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final RuleCall eventRuleCall = ((RuleCall) _grammarElement);
    final AccessibleParentMap map = new AccessibleParentMap(eventRuleCall, eventRuleCall);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = new Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer>() {
      @Override
      public void apply(final AccessibleRequiredGrammarTerminalsPresentEnsurer it) {
        it.setParentMap(map);
        it.setElementRegion(eventRegion);
        List<AbstractElement> _emptyList = CollectionLiterals.<AbstractElement>emptyList();
        it.setContainedElementPath(_emptyList);
      }
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    final Set<ISemanticRegion> regions = ensurer.findRegionsOfContainedElements();
    boolean _isEmpty = regions.isEmpty();
    Assert.assertTrue(_isEmpty);
  }
  
  @Test
  public void complexPath() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final RuleCall eventRuleCall = ((RuleCall) _grammarElement);
    AbstractRule _rule = eventRuleCall.getRule();
    AbstractElement _alternatives = _rule.getAlternatives();
    final Group eventGroup = ((Group) _alternatives);
    EList<AbstractElement> _elements = eventGroup.getElements();
    AbstractElement _get = _elements.get(0);
    final Assignment eventName = ((Assignment) _get);
    EList<AbstractElement> _elements_1 = eventGroup.getElements();
    AbstractElement _get_1 = _elements_1.get(2);
    final Group guardGroup = ((Group) _get_1);
    EList<AbstractElement> _elements_2 = guardGroup.getElements();
    AbstractElement _get_2 = _elements_2.get(1);
    final Assignment guardAssignment = ((Assignment) _get_2);
    final AccessibleParentMap map = new AccessibleParentMap(eventRuleCall, eventRuleCall);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = new Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer>() {
      @Override
      public void apply(final AccessibleRequiredGrammarTerminalsPresentEnsurer it) {
        it.setParentMap(map);
        it.setElementRegion(eventRegion);
        it.setContainedElementPath(Collections.<AbstractElement>unmodifiableList(CollectionLiterals.<AbstractElement>newArrayList(eventName, guardAssignment)));
      }
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    final Set<ISemanticRegion> regions = ensurer.findRegionsOfContainedElements();
    int _size = regions.size();
    Assert.assertEquals(4, _size);
    final Function1<ISemanticRegion, Boolean> _function_1 = new Function1<ISemanticRegion, Boolean>() {
      @Override
      public Boolean apply(final ISemanticRegion it) {
        String _text = it.getText();
        return Boolean.valueOf(Objects.equal(_text, "event5"));
      }
    };
    ISemanticRegion _findFirst = IterableExtensions.<ISemanticRegion>findFirst(regions, _function_1);
    Assert.assertNotNull(_findFirst);
    final Function1<ISemanticRegion, Boolean> _function_2 = new Function1<ISemanticRegion, Boolean>() {
      @Override
      public Boolean apply(final ISemanticRegion it) {
        String _text = it.getText();
        return Boolean.valueOf(Objects.equal(_text, "constant3X"));
      }
    };
    ISemanticRegion _findFirst_1 = IterableExtensions.<ISemanticRegion>findFirst(regions, _function_2);
    Assert.assertNotNull(_findFirst_1);
    final Function1<ISemanticRegion, Boolean> _function_3 = new Function1<ISemanticRegion, Boolean>() {
      @Override
      public Boolean apply(final ISemanticRegion it) {
        String _text = it.getText();
        return Boolean.valueOf(Objects.equal(_text, ".."));
      }
    };
    ISemanticRegion _findFirst_2 = IterableExtensions.<ISemanticRegion>findFirst(regions, _function_3);
    Assert.assertNotNull(_findFirst_2);
    final Function1<ISemanticRegion, Boolean> _function_4 = new Function1<ISemanticRegion, Boolean>() {
      @Override
      public Boolean apply(final ISemanticRegion it) {
        String _text = it.getText();
        return Boolean.valueOf(Objects.equal(_text, "constant2"));
      }
    };
    ISemanticRegion _findFirst_3 = IterableExtensions.<ISemanticRegion>findFirst(regions, _function_4);
    Assert.assertNotNull(_findFirst_3);
  }
}
