package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import java.util.Map;
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
public class TestCollectContainedGrammarElementsDeep extends AModelRegionEditorPreparer {
  @Test
  public void simple() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(constantRegion.getAllSemanticRegions());
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    final Multimap<AbstractElement, AbstractElement> map = preparer.collectContainedGrammarElementsDeep(constantValueGrammarElement, constantValueGrammarElement, 
      LinkedHashMultimap.<AbstractElement, AbstractElement>create());
    Assert.assertEquals(map.toString(), 2, map.size());
    Assert.assertTrue(map.containsEntry(constantValueGrammarElement, constantValueGrammarElement));
    final AbstractRule intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT");
    Assert.assertTrue(map.containsEntry(intGrammarElement.getAlternatives(), constantValueGrammarElement));
  }
  
  @Test
  public void deep() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    EObject _grammarElement = constantRegion.getGrammarElement();
    final AbstractElement grammarElement = ((AbstractElement) _grammarElement);
    final Multimap<AbstractElement, AbstractElement> mapIncludingXtextTerminals = preparer.collectContainedGrammarElementsDeep(grammarElement, grammarElement, 
      LinkedHashMultimap.<AbstractElement, AbstractElement>create());
    final Grammar grammar = GrammarUtil.getGrammar(grammarElement);
    AbstractElement _alternatives = GrammarUtil.findRuleForName(grammar, "Constant").getAlternatives();
    final Group constantRule = ((Group) _alternatives);
    AbstractElement _head = IterableExtensions.<AbstractElement>head(constantRule.getElements());
    final Assignment constantName = ((Assignment) _head);
    AbstractElement _last = IterableExtensions.<AbstractElement>last(constantRule.getElements());
    final Assignment constantValue = ((Assignment) _last);
    AbstractElement _alternatives_1 = GrammarUtil.findRuleForName(grammar, "Value").getAlternatives();
    final Alternatives valueRule = ((Alternatives) _alternatives_1);
    final AbstractElement valueConstantRef = IterableExtensions.<AbstractElement>head(valueRule.getElements());
    final AbstractElement valueIntLiteral = IterableExtensions.<AbstractElement>last(valueRule.getElements());
    AbstractElement _alternatives_2 = GrammarUtil.findRuleForName(grammar, "ConstantRef").getAlternatives();
    final Assignment constantRefRule = ((Assignment) _alternatives_2);
    AbstractElement _terminal = constantRefRule.getTerminal();
    final CrossReference constantRefConstant = ((CrossReference) _terminal);
    AbstractElement _alternatives_3 = GrammarUtil.findRuleForName(grammar, "IntLiteral").getAlternatives();
    final Assignment intLiteralRule = ((Assignment) _alternatives_3);
    final AbstractElement idRule = GrammarUtil.findRuleForName(grammar, "ID").getAlternatives();
    final AbstractElement intRule = GrammarUtil.findRuleForName(grammar, "INT").getAlternatives();
    final Grammar terminalsGrammar = GrammarUtil.getGrammar(idRule);
    final Predicate<Map.Entry<AbstractElement, AbstractElement>> _function = (Map.Entry<AbstractElement, AbstractElement> it) -> {
      return ((!Objects.equal(GrammarUtil.getGrammar(it.getKey()), terminalsGrammar)) || (!Objects.equal(GrammarUtil.getGrammar(it.getValue()), terminalsGrammar)));
    };
    final Multimap<AbstractElement, AbstractElement> map = Multimaps.<AbstractElement, AbstractElement>filterEntries(mapIncludingXtextTerminals, _function);
    Assert.assertEquals(map.toString(), 17, map.size());
    Assert.assertTrue(map.containsEntry(grammarElement, grammarElement));
    Assert.assertTrue(map.containsEntry(constantRule, grammarElement));
    Assert.assertTrue(map.containsEntry(constantName, constantRule));
    Assert.assertTrue(map.containsEntry(constantName.getTerminal(), constantName));
    Assert.assertTrue(map.containsEntry(idRule, constantName.getTerminal()));
    Assert.assertTrue(map.containsEntry(constantValue, constantRule));
    Assert.assertTrue(map.containsEntry(constantValue.getTerminal(), constantValue));
    Assert.assertTrue(map.containsEntry(valueRule, constantValue.getTerminal()));
    Assert.assertTrue(map.containsEntry(valueConstantRef, valueRule));
    Assert.assertTrue(map.containsEntry(constantRefRule, valueConstantRef));
    Assert.assertTrue(map.containsEntry(constantRefConstant, constantRefRule));
    Assert.assertTrue(map.containsEntry(constantRefConstant.getTerminal(), constantRefConstant));
    Assert.assertTrue(map.containsEntry(idRule, constantRefConstant.getTerminal()));
    Assert.assertTrue(map.containsEntry(valueIntLiteral, valueRule));
    Assert.assertTrue(map.containsEntry(intLiteralRule, valueIntLiteral));
    Assert.assertTrue(map.containsEntry(intLiteralRule.getTerminal(), intLiteralRule));
    Assert.assertTrue(map.containsEntry(intRule, intLiteralRule.getTerminal()));
  }
}
