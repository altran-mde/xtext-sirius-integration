package com.altran.general.integration.xtextsirius.test.util.parentmap;

import com.altran.general.integration.xtextsirius.test.util.ARegion;
import com.altran.general.integration.xtextsirius.test.util.parentmap.AccessibleParentMap;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import java.util.Map;
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
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCollectContainedGrammarElementsDeep extends ARegion {
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
    AccessibleParentMap _accessibleParentMap = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement);
    final Multimap<AbstractElement, AbstractElement> map = _accessibleParentMap.getMap();
    String _string = map.toString();
    int _size = map.size();
    Assert.assertEquals(_string, 2, _size);
    boolean _containsEntry = map.containsEntry(constantValueGrammarElement, constantValueGrammarElement);
    Assert.assertTrue(_containsEntry);
    Grammar _grammar = GrammarUtil.getGrammar(constantValueGrammarElement);
    final AbstractRule intGrammarElement = GrammarUtil.findRuleForName(_grammar, "INT");
    AbstractElement _alternatives = intGrammarElement.getAlternatives();
    boolean _containsEntry_1 = map.containsEntry(_alternatives, constantValueGrammarElement);
    Assert.assertTrue(_containsEntry_1);
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
    AccessibleParentMap _accessibleParentMap = new AccessibleParentMap(grammarElement, grammarElement);
    final Multimap<AbstractElement, AbstractElement> mapIncludingXtextTerminals = _accessibleParentMap.getMap();
    final Grammar grammar = GrammarUtil.getGrammar(grammarElement);
    AbstractRule _findRuleForName = GrammarUtil.findRuleForName(grammar, "Constant");
    AbstractElement _alternatives = _findRuleForName.getAlternatives();
    final Group constantRule = ((Group) _alternatives);
    EList<AbstractElement> _elements = constantRule.getElements();
    AbstractElement _head = IterableExtensions.<AbstractElement>head(_elements);
    final Assignment constantName = ((Assignment) _head);
    EList<AbstractElement> _elements_1 = constantRule.getElements();
    AbstractElement _last = IterableExtensions.<AbstractElement>last(_elements_1);
    final Assignment constantValue = ((Assignment) _last);
    AbstractRule _findRuleForName_1 = GrammarUtil.findRuleForName(grammar, "Value");
    AbstractElement _alternatives_1 = _findRuleForName_1.getAlternatives();
    final Alternatives valueRule = ((Alternatives) _alternatives_1);
    EList<AbstractElement> _elements_2 = valueRule.getElements();
    final AbstractElement valueConstantRef = IterableExtensions.<AbstractElement>head(_elements_2);
    EList<AbstractElement> _elements_3 = valueRule.getElements();
    final AbstractElement valueIntLiteral = IterableExtensions.<AbstractElement>last(_elements_3);
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
    final Grammar terminalsGrammar = GrammarUtil.getGrammar(idRule);
    final Predicate<Map.Entry<AbstractElement, AbstractElement>> _function = new Predicate<Map.Entry<AbstractElement, AbstractElement>>() {
      @Override
      public boolean apply(final Map.Entry<AbstractElement, AbstractElement> it) {
        boolean _or = false;
        AbstractElement _key = it.getKey();
        Grammar _grammar = GrammarUtil.getGrammar(_key);
        boolean _notEquals = (!Objects.equal(_grammar, terminalsGrammar));
        if (_notEquals) {
          _or = true;
        } else {
          AbstractElement _value = it.getValue();
          Grammar _grammar_1 = GrammarUtil.getGrammar(_value);
          boolean _notEquals_1 = (!Objects.equal(_grammar_1, terminalsGrammar));
          _or = _notEquals_1;
        }
        return _or;
      }
    };
    final Multimap<AbstractElement, AbstractElement> map = Multimaps.<AbstractElement, AbstractElement>filterEntries(mapIncludingXtextTerminals, _function);
    String _string = map.toString();
    int _size = map.size();
    Assert.assertEquals(_string, 17, _size);
    boolean _containsEntry = map.containsEntry(grammarElement, grammarElement);
    Assert.assertTrue(_containsEntry);
    boolean _containsEntry_1 = map.containsEntry(constantRule, grammarElement);
    Assert.assertTrue(_containsEntry_1);
    boolean _containsEntry_2 = map.containsEntry(constantName, constantRule);
    Assert.assertTrue(_containsEntry_2);
    AbstractElement _terminal_1 = constantName.getTerminal();
    boolean _containsEntry_3 = map.containsEntry(_terminal_1, constantName);
    Assert.assertTrue(_containsEntry_3);
    AbstractElement _terminal_2 = constantName.getTerminal();
    boolean _containsEntry_4 = map.containsEntry(idRule, _terminal_2);
    Assert.assertTrue(_containsEntry_4);
    boolean _containsEntry_5 = map.containsEntry(constantValue, constantRule);
    Assert.assertTrue(_containsEntry_5);
    AbstractElement _terminal_3 = constantValue.getTerminal();
    boolean _containsEntry_6 = map.containsEntry(_terminal_3, constantValue);
    Assert.assertTrue(_containsEntry_6);
    AbstractElement _terminal_4 = constantValue.getTerminal();
    boolean _containsEntry_7 = map.containsEntry(valueRule, _terminal_4);
    Assert.assertTrue(_containsEntry_7);
    boolean _containsEntry_8 = map.containsEntry(valueConstantRef, valueRule);
    Assert.assertTrue(_containsEntry_8);
    boolean _containsEntry_9 = map.containsEntry(constantRefRule, valueConstantRef);
    Assert.assertTrue(_containsEntry_9);
    boolean _containsEntry_10 = map.containsEntry(constantRefConstant, constantRefRule);
    Assert.assertTrue(_containsEntry_10);
    AbstractElement _terminal_5 = constantRefConstant.getTerminal();
    boolean _containsEntry_11 = map.containsEntry(_terminal_5, constantRefConstant);
    Assert.assertTrue(_containsEntry_11);
    AbstractElement _terminal_6 = constantRefConstant.getTerminal();
    boolean _containsEntry_12 = map.containsEntry(idRule, _terminal_6);
    Assert.assertTrue(_containsEntry_12);
    boolean _containsEntry_13 = map.containsEntry(valueIntLiteral, valueRule);
    Assert.assertTrue(_containsEntry_13);
    boolean _containsEntry_14 = map.containsEntry(intLiteralRule, valueIntLiteral);
    Assert.assertTrue(_containsEntry_14);
    AbstractElement _terminal_7 = intLiteralRule.getTerminal();
    boolean _containsEntry_15 = map.containsEntry(_terminal_7, intLiteralRule);
    Assert.assertTrue(_containsEntry_15);
    AbstractElement _terminal_8 = intLiteralRule.getTerminal();
    boolean _containsEntry_16 = map.containsEntry(intRule, _terminal_8);
    Assert.assertTrue(_containsEntry_16);
  }
}
