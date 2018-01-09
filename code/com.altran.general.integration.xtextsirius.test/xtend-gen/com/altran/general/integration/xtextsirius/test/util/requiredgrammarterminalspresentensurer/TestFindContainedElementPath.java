package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.ARequiredGrammarTerminalsPresentEnsurer;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.AccessibleRequiredGrammarTerminalsPresentEnsurer;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFindContainedElementPath extends ARequiredGrammarTerminalsPresentEnsurer {
  @Test
  public void noPath() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = this.getFakeEnsurer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final AbstractElement baseElement = ((AbstractElement) _grammarElement);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _state_Transitions = _statemachinePackage.getState_Transitions();
    final List<AbstractElement> path = ensurer.findContainedElementPath(baseElement, _state_Transitions);
    boolean _isEmpty = path.isEmpty();
    Assert.assertTrue(_isEmpty);
  }
  
  @Test
  public void invalidPath() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = this.getFakeEnsurer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final AbstractElement baseElement = ((AbstractElement) _grammarElement);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _constant_Value = _statemachinePackage.getConstant_Value();
    final List<AbstractElement> path = ensurer.findContainedElementPath(baseElement, _constant_Value);
    boolean _isEmpty = path.isEmpty();
    Assert.assertTrue(_isEmpty);
  }
  
  @Test
  public void simplePath() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = this.getFakeEnsurer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final RuleCall baseElement = ((RuleCall) _grammarElement);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Name = _statemachinePackage.getEvent_Name();
    final List<AbstractElement> path = ensurer.findContainedElementPath(baseElement, _event_Name);
    String _string = path.toString();
    int _size = path.size();
    Assert.assertEquals(_string, 3, _size);
    AbstractElement _head = IterableExtensions.<AbstractElement>head(path);
    Assert.assertEquals(baseElement, _head);
    AbstractElement _get = path.get(1);
    Assert.assertTrue((_get instanceof Group));
    AbstractElement _get_1 = path.get(1);
    final Group middle = ((Group) _get_1);
    EList<AbstractElement> _elements = middle.getElements();
    int _size_1 = _elements.size();
    Assert.assertEquals(3, _size_1);
    AbstractRule _rule = baseElement.getRule();
    EObject _eContainer = middle.eContainer();
    Assert.assertSame(_rule, _eContainer);
    AbstractElement _last = IterableExtensions.<AbstractElement>last(path);
    Assert.assertTrue((_last instanceof Assignment));
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(path);
    final Assignment last = ((Assignment) _last_1);
    StatemachinePackage _statemachinePackage_1 = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Name_1 = _statemachinePackage_1.getEvent_Name();
    String _name = _event_Name_1.getName();
    String _feature = last.getFeature();
    Assert.assertEquals(_name, _feature);
    EObject _eContainer_1 = last.eContainer();
    Assert.assertSame(middle, _eContainer_1);
  }
  
  @Test
  public void complexPath() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = this.getFakeEnsurer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final RuleCall baseElement = ((RuleCall) _grammarElement);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _event_Guard = _statemachinePackage.getEvent_Guard();
    final List<AbstractElement> path = ensurer.findContainedElementPath(baseElement, _event_Guard);
    String _string = path.toString();
    int _size = path.size();
    Assert.assertEquals(_string, 4, _size);
    AbstractElement _head = IterableExtensions.<AbstractElement>head(path);
    Assert.assertEquals(baseElement, _head);
    AbstractElement _get = path.get(1);
    Assert.assertTrue((_get instanceof Group));
    AbstractElement _get_1 = path.get(1);
    final Group second = ((Group) _get_1);
    EList<AbstractElement> _elements = second.getElements();
    int _size_1 = _elements.size();
    Assert.assertEquals(3, _size_1);
    AbstractRule _rule = baseElement.getRule();
    EObject _eContainer = second.eContainer();
    Assert.assertSame(_rule, _eContainer);
    AbstractElement _get_2 = path.get(2);
    Assert.assertTrue((_get_2 instanceof Group));
    AbstractElement _get_3 = path.get(2);
    final Group third = ((Group) _get_3);
    EList<AbstractElement> _elements_1 = third.getElements();
    int _size_2 = _elements_1.size();
    Assert.assertEquals(3, _size_2);
    EObject _eContainer_1 = third.eContainer();
    Assert.assertSame(second, _eContainer_1);
    AbstractElement _last = IterableExtensions.<AbstractElement>last(path);
    Assert.assertTrue((_last instanceof Assignment));
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(path);
    final Assignment last = ((Assignment) _last_1);
    StatemachinePackage _statemachinePackage_1 = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _event_Guard_1 = _statemachinePackage_1.getEvent_Guard();
    String _name = _event_Guard_1.getName();
    String _feature = last.getFeature();
    Assert.assertEquals(_name, _feature);
    EObject _eContainer_2 = last.eContainer();
    Assert.assertSame(third, _eContainer_2);
  }
}
