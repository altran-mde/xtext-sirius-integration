package com.altran.general.integration.xtextsirius.test.util.parentmap;

import com.altran.general.integration.xtextsirius.test.util.ARegion;
import com.altran.general.integration.xtextsirius.test.util.parentmap.AccessibleParentMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
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
public class TestContainsGrammarElementDeep extends ARegion {
  @Test
  public void emptyGrammarList() {
    final Statemachine model = this.getDefaultModel();
    EList<Constant> _constants = model.getConstants();
    final Constant constant = IterableExtensions.<Constant>head(_constants);
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    Iterable<ISemanticRegion> _allSemanticRegions = constantRegion.getAllSemanticRegions();
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(_allSemanticRegions);
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    Grammar _grammar = GrammarUtil.getGrammar(constantValueGrammarElement);
    AbstractRule _findRuleForName = GrammarUtil.findRuleForName(_grammar, "INT");
    final AbstractElement intGrammarElement = _findRuleForName.getAlternatives();
    ImmutableMultimap<AbstractElement, AbstractElement> _of = ImmutableMultimap.<AbstractElement, AbstractElement>of(constantValueGrammarElement, constantValueGrammarElement, intGrammarElement, constantValueGrammarElement);
    final AccessibleParentMap map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, _of);
    List<AbstractElement> _emptyList = CollectionLiterals.<AbstractElement>emptyList();
    boolean _containsGrammarElementDeep = map.containsGrammarElementDeep(constantValueGrammarElement, _emptyList);
    Assert.assertFalse(_containsGrammarElementDeep);
    List<AbstractElement> _emptyList_1 = CollectionLiterals.<AbstractElement>emptyList();
    boolean _containsGrammarElementDeep_1 = map.containsGrammarElementDeep(intGrammarElement, _emptyList_1);
    Assert.assertFalse(_containsGrammarElementDeep_1);
  }
  
  @Test
  public void emptyGrammarMapDirect() {
    final Statemachine model = this.getDefaultModel();
    EList<Constant> _constants = model.getConstants();
    final Constant constant = IterableExtensions.<Constant>head(_constants);
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    Iterable<ISemanticRegion> _allSemanticRegions = constantRegion.getAllSemanticRegions();
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(_allSemanticRegions);
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    ImmutableMultimap<AbstractElement, AbstractElement> _of = ImmutableMultimap.<AbstractElement, AbstractElement>of();
    final AccessibleParentMap map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, _of);
    Iterable<ISemanticRegion> _allSemanticRegions_1 = constantRegion.getAllSemanticRegions();
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    Iterable<AbstractElement> _map = IterableExtensions.<ISemanticRegion, AbstractElement>map(_allSemanticRegions_1, _function);
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(_map);
    final boolean result = map.containsGrammarElementDeep(constantValueGrammarElement, grammarElements);
    Assert.assertTrue(result);
  }
  
  @Test
  public void emptyGrammarMapIndirect() {
    final Statemachine model = this.getDefaultModel();
    EList<Constant> _constants = model.getConstants();
    final Constant constant = IterableExtensions.<Constant>head(_constants);
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    Iterable<ISemanticRegion> _allSemanticRegions = constantRegion.getAllSemanticRegions();
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(_allSemanticRegions);
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    ImmutableMultimap<AbstractElement, AbstractElement> _of = ImmutableMultimap.<AbstractElement, AbstractElement>of();
    final AccessibleParentMap map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, _of);
    Grammar _grammar = GrammarUtil.getGrammar(constantValueGrammarElement);
    AbstractRule _findRuleForName = GrammarUtil.findRuleForName(_grammar, "INT");
    final AbstractElement intGrammarElement = _findRuleForName.getAlternatives();
    Iterable<ISemanticRegion> _allSemanticRegions_1 = constantRegion.getAllSemanticRegions();
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    Iterable<AbstractElement> _map = IterableExtensions.<ISemanticRegion, AbstractElement>map(_allSemanticRegions_1, _function);
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(_map);
    final boolean result = map.containsGrammarElementDeep(intGrammarElement, grammarElements);
    Assert.assertFalse(result);
  }
  
  @Test
  public void simple() {
    final Statemachine model = this.getDefaultModel();
    EList<Constant> _constants = model.getConstants();
    final Constant constant = IterableExtensions.<Constant>head(_constants);
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    Iterable<ISemanticRegion> _allSemanticRegions = constantRegion.getAllSemanticRegions();
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(_allSemanticRegions);
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    Grammar _grammar = GrammarUtil.getGrammar(constantValueGrammarElement);
    AbstractRule _findRuleForName = GrammarUtil.findRuleForName(_grammar, "INT");
    final AbstractElement intGrammarElement = _findRuleForName.getAlternatives();
    ImmutableMultimap<AbstractElement, AbstractElement> _of = ImmutableMultimap.<AbstractElement, AbstractElement>of(constantValueGrammarElement, constantValueGrammarElement, intGrammarElement, constantValueGrammarElement);
    final AccessibleParentMap map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, _of);
    Iterable<ISemanticRegion> _allSemanticRegions_1 = constantRegion.getAllSemanticRegions();
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    Iterable<AbstractElement> _map = IterableExtensions.<ISemanticRegion, AbstractElement>map(_allSemanticRegions_1, _function);
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(_map);
    boolean _containsGrammarElementDeep = map.containsGrammarElementDeep(constantValueGrammarElement, grammarElements);
    Assert.assertTrue(_containsGrammarElementDeep);
    boolean _containsGrammarElementDeep_1 = map.containsGrammarElementDeep(intGrammarElement, grammarElements);
    Assert.assertTrue(_containsGrammarElementDeep_1);
  }
  
  @Test
  public void deep() {
    final Statemachine model = this.getDefaultModel();
    EList<Constant> _constants = model.getConstants();
    final Constant constant = IterableExtensions.<Constant>head(_constants);
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    EObject _grammarElement = constantRegion.getGrammarElement();
    final AbstractElement grammarElement = ((AbstractElement) _grammarElement);
    final Grammar grammar = GrammarUtil.getGrammar(grammarElement);
    AbstractRule _findRuleForName = GrammarUtil.findRuleForName(grammar, "INT");
    final AbstractElement intRule = _findRuleForName.getAlternatives();
    Multimap<AbstractElement, AbstractElement> _createConstantParentMap = this.createConstantParentMap(grammarElement);
    final AccessibleParentMap map = new AccessibleParentMap(grammarElement, grammarElement, _createConstantParentMap);
    Iterable<ISemanticRegion> _allSemanticRegions = constantRegion.getAllSemanticRegions();
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    Iterable<AbstractElement> _map = IterableExtensions.<ISemanticRegion, AbstractElement>map(_allSemanticRegions, _function);
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(_map);
    boolean _containsGrammarElementDeep = map.containsGrammarElementDeep(intRule, grammarElements);
    Assert.assertTrue(_containsGrammarElementDeep);
  }
  
  protected Multimap<AbstractElement, AbstractElement> createConstantParentMap(final AbstractElement grammarElement) {
    final Grammar grammar = GrammarUtil.getGrammar(grammarElement);
    AbstractRule _findRuleForName = GrammarUtil.findRuleForName(grammar, "Constant");
    AbstractElement _alternatives = _findRuleForName.getAlternatives();
    final Group constantRule = ((Group) _alternatives);
    EList<AbstractElement> _elements = constantRule.getElements();
    AbstractElement _get = _elements.get(0);
    final Assignment constantName = ((Assignment) _get);
    EList<AbstractElement> _elements_1 = constantRule.getElements();
    AbstractElement _get_1 = _elements_1.get(1);
    final Assignment constantValue = ((Assignment) _get_1);
    AbstractRule _findRuleForName_1 = GrammarUtil.findRuleForName(grammar, "Value");
    AbstractElement _alternatives_1 = _findRuleForName_1.getAlternatives();
    final Alternatives valueRule = ((Alternatives) _alternatives_1);
    EList<AbstractElement> _elements_2 = valueRule.getElements();
    final AbstractElement valueConstantRef = _elements_2.get(0);
    EList<AbstractElement> _elements_3 = valueRule.getElements();
    final AbstractElement valueIntLiteral = _elements_3.get(1);
    AbstractRule _findRuleForName_2 = GrammarUtil.findRuleForName(grammar, "ConstantRef");
    AbstractElement _alternatives_2 = _findRuleForName_2.getAlternatives();
    final Assignment constantRefRule = ((Assignment) _alternatives_2);
    AbstractElement _terminal = constantRefRule.getTerminal();
    final CrossReference constantRefConstant = ((CrossReference) _terminal);
    AbstractRule _findRuleForName_3 = GrammarUtil.findRuleForName(grammar, "IntLiteral");
    AbstractElement _alternatives_3 = _findRuleForName_3.getAlternatives();
    final Assignment intLiteralRule = ((Assignment) _alternatives_3);
    AbstractRule _findRuleForName_4 = GrammarUtil.findRuleForName(grammar, "ID");
    final AbstractElement idRule = _findRuleForName_4.getAlternatives();
    AbstractRule _findRuleForName_5 = GrammarUtil.findRuleForName(grammar, "INT");
    final AbstractElement intRule = _findRuleForName_5.getAlternatives();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _builder = ImmutableMultimap.<AbstractElement, AbstractElement>builder();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put = _builder.put(grammarElement, grammarElement);
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_1 = _put.put(constantRule, grammarElement);
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_2 = _put_1.put(constantName, constantRule);
    AbstractElement _terminal_1 = constantName.getTerminal();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_3 = _put_2.put(_terminal_1, constantName);
    AbstractElement _terminal_2 = constantName.getTerminal();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_4 = _put_3.put(idRule, _terminal_2);
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_5 = _put_4.put(constantValue, constantRule);
    AbstractElement _terminal_3 = constantValue.getTerminal();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_6 = _put_5.put(_terminal_3, constantValue);
    AbstractElement _terminal_4 = constantValue.getTerminal();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_7 = _put_6.put(valueRule, _terminal_4);
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_8 = _put_7.put(valueConstantRef, valueRule);
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_9 = _put_8.put(constantRefRule, valueConstantRef);
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_10 = _put_9.put(constantRefConstant, constantRefRule);
    AbstractElement _terminal_5 = constantRefConstant.getTerminal();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_11 = _put_10.put(_terminal_5, constantRefConstant);
    AbstractElement _terminal_6 = constantRefConstant.getTerminal();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_12 = _put_11.put(idRule, _terminal_6);
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_13 = _put_12.put(valueIntLiteral, valueRule);
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_14 = _put_13.put(intLiteralRule, valueIntLiteral);
    AbstractElement _terminal_7 = intLiteralRule.getTerminal();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_15 = _put_14.put(_terminal_7, intLiteralRule);
    AbstractElement _terminal_8 = intLiteralRule.getTerminal();
    ImmutableMultimap.Builder<AbstractElement, AbstractElement> _put_16 = _put_15.put(intRule, _terminal_8);
    final Multimap<AbstractElement, AbstractElement> map = _put_16.build();
    return map;
  }
}
