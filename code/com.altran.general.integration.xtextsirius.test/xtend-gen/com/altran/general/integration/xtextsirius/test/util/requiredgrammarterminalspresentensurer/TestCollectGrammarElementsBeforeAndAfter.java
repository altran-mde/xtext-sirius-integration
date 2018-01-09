package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.ARequiredGrammarTerminalsPresentEnsurer;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.AccessibleRequiredGrammarTerminalsPresentEnsurer;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegionsFinder;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCollectGrammarElementsBeforeAndAfter extends ARequiredGrammarTerminalsPresentEnsurer {
  @Test
  public void emptyGroup() {
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = new Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer>() {
      @Override
      public void apply(final AccessibleRequiredGrammarTerminalsPresentEnsurer it) {
        AbstractElement _createAbstractElement = XtextFactory.eINSTANCE.createAbstractElement();
        it.setContainedElement(_createAbstractElement);
        Group _createGroup = XtextFactory.eINSTANCE.createGroup();
        it.setContainingGroup(_createGroup);
      }
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    ensurer.collectBeforeAndAfter();
    List<AbstractElement> _elementsBefore = ensurer.getElementsBefore();
    boolean _isEmpty = _elementsBefore.isEmpty();
    Assert.assertTrue(_isEmpty);
    List<AbstractElement> _elementsAfter = ensurer.getElementsAfter();
    boolean _isEmpty_1 = _elementsAfter.isEmpty();
    Assert.assertTrue(_isEmpty_1);
  }
  
  @Test
  public void eventName() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    ISemanticRegionsFinder _allRegionsFor = eventRegion.getAllRegionsFor();
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Name = _statemachinePackage.getEvent_Name();
    final ISemanticRegion featureRegion = _allRegionsFor.feature(_event_Name);
    EObject _grammarElement = featureRegion.getGrammarElement();
    final AbstractElement grElement = ((AbstractElement) _grammarElement);
    final Group group = GrammarUtil.containingGroup(grElement);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = new Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer>() {
      @Override
      public void apply(final AccessibleRequiredGrammarTerminalsPresentEnsurer it) {
        it.setContainedElement(grElement);
        it.setContainingGroup(group);
      }
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    ensurer.collectBeforeAndAfter();
    List<AbstractElement> _elementsBefore = ensurer.getElementsBefore();
    boolean _isEmpty = _elementsBefore.isEmpty();
    Assert.assertTrue(_isEmpty);
    List<AbstractElement> _elementsAfter = ensurer.getElementsAfter();
    String _string = _elementsAfter.toString();
    List<AbstractElement> _elementsAfter_1 = ensurer.getElementsAfter();
    int _size = _elementsAfter_1.size();
    Assert.assertEquals(_string, 2, _size);
    List<AbstractElement> _elementsAfter_2 = ensurer.getElementsAfter();
    AbstractElement _head = IterableExtensions.<AbstractElement>head(_elementsAfter_2);
    Assert.assertTrue((_head instanceof Assignment));
    List<AbstractElement> _elementsAfter_3 = ensurer.getElementsAfter();
    AbstractElement _head_1 = IterableExtensions.<AbstractElement>head(_elementsAfter_3);
    final Assignment elementAfter1 = ((Assignment) _head_1);
    String _feature = elementAfter1.getFeature();
    Assert.assertEquals("code", _feature);
    List<AbstractElement> _elementsAfter_4 = ensurer.getElementsAfter();
    AbstractElement _last = IterableExtensions.<AbstractElement>last(_elementsAfter_4);
    Assert.assertTrue((_last instanceof Group));
    List<AbstractElement> _elementsAfter_5 = ensurer.getElementsAfter();
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(_elementsAfter_5);
    final Group elementAfter2 = ((Group) _last_1);
    EList<AbstractElement> _elements = elementAfter2.getElements();
    Iterable<Assignment> _filter = Iterables.<Assignment>filter(_elements, Assignment.class);
    Assignment _head_2 = IterableExtensions.<Assignment>head(_filter);
    String _feature_1 = _head_2.getFeature();
    Assert.assertEquals("guard", _feature_1);
  }
  
  @Test
  public void eventCode() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    ISemanticRegionsFinder _allRegionsFor = eventRegion.getAllRegionsFor();
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Code = _statemachinePackage.getEvent_Code();
    final ISemanticRegion featureRegion = _allRegionsFor.feature(_event_Code);
    EObject _grammarElement = featureRegion.getGrammarElement();
    final AbstractElement grElement = ((AbstractElement) _grammarElement);
    final Group group = GrammarUtil.containingGroup(grElement);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = new Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer>() {
      @Override
      public void apply(final AccessibleRequiredGrammarTerminalsPresentEnsurer it) {
        it.setContainedElement(grElement);
        it.setContainingGroup(group);
      }
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    ensurer.collectBeforeAndAfter();
    List<AbstractElement> _elementsBefore = ensurer.getElementsBefore();
    String _string = _elementsBefore.toString();
    List<AbstractElement> _elementsBefore_1 = ensurer.getElementsBefore();
    int _size = _elementsBefore_1.size();
    Assert.assertEquals(_string, 1, _size);
    List<AbstractElement> _elementsBefore_2 = ensurer.getElementsBefore();
    AbstractElement _head = IterableExtensions.<AbstractElement>head(_elementsBefore_2);
    Assert.assertTrue((_head instanceof Assignment));
    List<AbstractElement> _elementsBefore_3 = ensurer.getElementsBefore();
    AbstractElement _head_1 = IterableExtensions.<AbstractElement>head(_elementsBefore_3);
    final Assignment elementBefore = ((Assignment) _head_1);
    String _feature = elementBefore.getFeature();
    Assert.assertEquals("name", _feature);
    List<AbstractElement> _elementsAfter = ensurer.getElementsAfter();
    String _string_1 = _elementsAfter.toString();
    List<AbstractElement> _elementsAfter_1 = ensurer.getElementsAfter();
    int _size_1 = _elementsAfter_1.size();
    Assert.assertEquals(_string_1, 1, _size_1);
    List<AbstractElement> _elementsAfter_2 = ensurer.getElementsAfter();
    String _string_2 = _elementsAfter_2.toString();
    List<AbstractElement> _elementsAfter_3 = ensurer.getElementsAfter();
    AbstractElement _head_2 = IterableExtensions.<AbstractElement>head(_elementsAfter_3);
    Assert.assertTrue(_string_2, (_head_2 instanceof Group));
    List<AbstractElement> _elementsAfter_4 = ensurer.getElementsAfter();
    AbstractElement _head_3 = IterableExtensions.<AbstractElement>head(_elementsAfter_4);
    final Group elementAfter = ((Group) _head_3);
    EList<AbstractElement> _elements = elementAfter.getElements();
    Iterable<Assignment> _filter = Iterables.<Assignment>filter(_elements, Assignment.class);
    Assignment _head_4 = IterableExtensions.<Assignment>head(_filter);
    String _feature_1 = _head_4.getFeature();
    Assert.assertEquals("guard", _feature_1);
  }
  
  @Test
  public void eventGuard() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    ISemanticRegionsFinder _allRegionsFor = eventRegion.getAllRegionsFor();
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Code = _statemachinePackage.getEvent_Code();
    ISemanticRegion _feature = _allRegionsFor.feature(_event_Code);
    final ISemanticRegion featureRegion = _feature.getNextSemanticRegion();
    EObject _grammarElement = featureRegion.getGrammarElement();
    Group _containingGroup = GrammarUtil.containingGroup(((AbstractElement) _grammarElement));
    final Group grElement = GrammarUtil.containingGroup(_containingGroup);
    EObject _eContainer = grElement.eContainer();
    final Group group = ((Group) _eContainer);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = new Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer>() {
      @Override
      public void apply(final AccessibleRequiredGrammarTerminalsPresentEnsurer it) {
        it.setContainedElement(grElement);
        it.setContainingGroup(group);
      }
    };
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions.<AccessibleRequiredGrammarTerminalsPresentEnsurer>operator_doubleArrow(_fakeEnsurer, _function);
    ensurer.collectBeforeAndAfter();
    List<AbstractElement> _elementsBefore = ensurer.getElementsBefore();
    String _string = _elementsBefore.toString();
    List<AbstractElement> _elementsBefore_1 = ensurer.getElementsBefore();
    int _size = _elementsBefore_1.size();
    Assert.assertEquals(_string, 2, _size);
    List<AbstractElement> _elementsBefore_2 = ensurer.getElementsBefore();
    AbstractElement _head = IterableExtensions.<AbstractElement>head(_elementsBefore_2);
    Assert.assertTrue((_head instanceof Assignment));
    List<AbstractElement> _elementsBefore_3 = ensurer.getElementsBefore();
    AbstractElement _head_1 = IterableExtensions.<AbstractElement>head(_elementsBefore_3);
    final Assignment elementBefore1 = ((Assignment) _head_1);
    String _feature_1 = elementBefore1.getFeature();
    Assert.assertEquals("name", _feature_1);
    List<AbstractElement> _elementsBefore_4 = ensurer.getElementsBefore();
    AbstractElement _last = IterableExtensions.<AbstractElement>last(_elementsBefore_4);
    Assert.assertTrue((_last instanceof Assignment));
    List<AbstractElement> _elementsBefore_5 = ensurer.getElementsBefore();
    AbstractElement _last_1 = IterableExtensions.<AbstractElement>last(_elementsBefore_5);
    final Assignment elementBefore2 = ((Assignment) _last_1);
    String _feature_2 = elementBefore2.getFeature();
    Assert.assertEquals("code", _feature_2);
    List<AbstractElement> _elementsAfter = ensurer.getElementsAfter();
    boolean _isEmpty = _elementsAfter.isEmpty();
    Assert.assertTrue(_isEmpty);
  }
}
