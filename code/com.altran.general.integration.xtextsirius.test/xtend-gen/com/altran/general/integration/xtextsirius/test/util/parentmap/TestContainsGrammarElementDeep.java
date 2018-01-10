package com.altran.general.integration.xtextsirius.test.util.parentmap;

import com.altran.general.integration.xtextsirius.test.util.ARegion;
import com.altran.general.integration.xtextsirius.test.util.parentmap.AccessibleParentMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
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
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(constantRegion.getAllSemanticRegions());
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    final AbstractElement intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").getAlternatives();
    ImmutableMultimap<AbstractElement, AbstractElement> _of = ImmutableMultimap.<AbstractElement, AbstractElement>of(constantValueGrammarElement, constantValueGrammarElement, intGrammarElement, constantValueGrammarElement);
    final AccessibleParentMap map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, _of);
    Assert.assertFalse(map.containsGrammarElementDeep(constantValueGrammarElement, CollectionLiterals.<AbstractElement>emptyList()));
    Assert.assertFalse(map.containsGrammarElementDeep(intGrammarElement, CollectionLiterals.<AbstractElement>emptyList()));
  }
  
  @Test
  public void emptyGrammarMapDirect() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(constantRegion.getAllSemanticRegions());
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    ImmutableMultimap<AbstractElement, AbstractElement> _of = ImmutableMultimap.<AbstractElement, AbstractElement>of();
    final AccessibleParentMap map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, _of);
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(IterableExtensions.<ISemanticRegion, AbstractElement>map(constantRegion.getAllSemanticRegions(), _function));
    final boolean result = map.containsGrammarElementDeep(constantValueGrammarElement, grammarElements);
    Assert.assertTrue(result);
  }
  
  @Test
  public void emptyGrammarMapIndirect() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(constantRegion.getAllSemanticRegions());
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    ImmutableMultimap<AbstractElement, AbstractElement> _of = ImmutableMultimap.<AbstractElement, AbstractElement>of();
    final AccessibleParentMap map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, _of);
    final AbstractElement intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").getAlternatives();
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(IterableExtensions.<ISemanticRegion, AbstractElement>map(constantRegion.getAllSemanticRegions(), _function));
    final boolean result = map.containsGrammarElementDeep(intGrammarElement, grammarElements);
    Assert.assertFalse(result);
  }
  
  @Test
  public void simple() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(constantRegion.getAllSemanticRegions());
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    final AbstractElement intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").getAlternatives();
    ImmutableMultimap<AbstractElement, AbstractElement> _of = ImmutableMultimap.<AbstractElement, AbstractElement>of(constantValueGrammarElement, constantValueGrammarElement, intGrammarElement, constantValueGrammarElement);
    final AccessibleParentMap map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, _of);
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(IterableExtensions.<ISemanticRegion, AbstractElement>map(constantRegion.getAllSemanticRegions(), _function));
    Assert.assertTrue(map.containsGrammarElementDeep(constantValueGrammarElement, grammarElements));
    Assert.assertTrue(map.containsGrammarElementDeep(intGrammarElement, grammarElements));
  }
  
  @Test
  public void deep() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    EObject _grammarElement = constantRegion.getGrammarElement();
    final AbstractElement grammarElement = ((AbstractElement) _grammarElement);
    final Grammar grammar = GrammarUtil.getGrammar(grammarElement);
    final AbstractElement intRule = GrammarUtil.findRuleForName(grammar, "INT").getAlternatives();
    Multimap<AbstractElement, AbstractElement> _createConstantParentMap = this.createConstantParentMap(grammarElement);
    final AccessibleParentMap map = new AccessibleParentMap(grammarElement, grammarElement, _createConstantParentMap);
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(IterableExtensions.<ISemanticRegion, AbstractElement>map(constantRegion.getAllSemanticRegions(), _function));
    Assert.assertTrue(map.containsGrammarElementDeep(intRule, grammarElements));
  }
  
  protected Multimap<AbstractElement, AbstractElement> createConstantParentMap(final AbstractElement grammarElement) {
    final Grammar grammar = GrammarUtil.getGrammar(grammarElement);
    AbstractElement _alternatives = GrammarUtil.findRuleForName(grammar, "Constant").getAlternatives();
    final Group constantRule = ((Group) _alternatives);
    AbstractElement _get = constantRule.getElements().get(0);
    final Assignment constantName = ((Assignment) _get);
    AbstractElement _get_1 = constantRule.getElements().get(1);
    final Assignment constantValue = ((Assignment) _get_1);
    AbstractElement _alternatives_1 = GrammarUtil.findRuleForName(grammar, "Value").getAlternatives();
    final Alternatives valueRule = ((Alternatives) _alternatives_1);
    final AbstractElement valueConstantRef = valueRule.getElements().get(0);
    final AbstractElement valueIntLiteral = valueRule.getElements().get(1);
    AbstractElement _alternatives_2 = GrammarUtil.findRuleForName(grammar, "ConstantRef").getAlternatives();
    final Assignment constantRefRule = ((Assignment) _alternatives_2);
    AbstractElement _terminal = constantRefRule.getTerminal();
    final CrossReference constantRefConstant = ((CrossReference) _terminal);
    AbstractElement _alternatives_3 = GrammarUtil.findRuleForName(grammar, "IntLiteral").getAlternatives();
    final Assignment intLiteralRule = ((Assignment) _alternatives_3);
    final AbstractElement idRule = GrammarUtil.findRuleForName(grammar, "ID").getAlternatives();
    final AbstractElement intRule = GrammarUtil.findRuleForName(grammar, "INT").getAlternatives();
    final Multimap<AbstractElement, AbstractElement> map = ImmutableMultimap.<AbstractElement, AbstractElement>builder().put(grammarElement, grammarElement).put(constantRule, grammarElement).put(constantName, constantRule).put(constantName.getTerminal(), constantName).put(idRule, constantName.getTerminal()).put(constantValue, constantRule).put(constantValue.getTerminal(), constantValue).put(valueRule, constantValue.getTerminal()).put(valueConstantRef, valueRule).put(constantRefRule, valueConstantRef).put(constantRefConstant, constantRefRule).put(constantRefConstant.getTerminal(), constantRefConstant).put(idRule, constantRefConstant.getTerminal()).put(valueIntLiteral, valueRule).put(intLiteralRule, valueIntLiteral).put(intLiteralRule.getTerminal(), intLiteralRule).put(intRule, intLiteralRule.getTerminal()).build();
    return map;
  }
}
