package com.altran.general.integration.xtextsirius.test.util.parentmap

import com.altran.general.integration.xtextsirius.test.util.ARegion
import com.altran.general.integration.xtextsirius.test.util.parentmap.AccessibleParentMap
import com.google.common.collect.ImmutableMultimap
import com.google.common.collect.Multimap
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Alternatives
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.Group
import org.junit.Test

import static org.junit.Assert.*

class TestContainsGrammarElementDeep extends ARegion {
	@Test
	def emptyGrammarList() {
		val model = defaultModel

		val constant = model.constants.head

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val constantValueRegion = constantRegion.allSemanticRegions.last
		val constantValueGrammarElement = constantValueRegion.grammarElement as AbstractElement

		val intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").
			alternatives

		val map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, ImmutableMultimap.of(
			constantValueGrammarElement,
			constantValueGrammarElement,
			intGrammarElement,
			constantValueGrammarElement
		))

		assertFalse(map.containsGrammarElementDeep(constantValueGrammarElement, emptyList))
		assertFalse(map.containsGrammarElementDeep(intGrammarElement, emptyList))
	}

	@Test
	def emptyGrammarMapDirect() {
		val model = defaultModel

		val constant = model.constants.head

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val constantValueRegion = constantRegion.allSemanticRegions.last
		val constantValueGrammarElement = constantValueRegion.grammarElement as AbstractElement

		val map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, ImmutableMultimap.of())

		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList
		val result = map.containsGrammarElementDeep(constantValueGrammarElement, grammarElements)

		assertTrue(result)
	}

	@Test
	def emptyGrammarMapIndirect() {
		val model = defaultModel

		val constant = model.constants.head

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val constantValueRegion = constantRegion.allSemanticRegions.last
		val constantValueGrammarElement = constantValueRegion.grammarElement as AbstractElement

		val map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, ImmutableMultimap.of())

		val intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").
			alternatives

		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList
		val result = map.containsGrammarElementDeep(intGrammarElement, grammarElements)

		assertFalse(result)
	}

	@Test
	def simple() {
		val model = defaultModel

		val constant = model.constants.head

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val constantValueRegion = constantRegion.allSemanticRegions.last
		val constantValueGrammarElement = constantValueRegion.grammarElement as AbstractElement

		val intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").
			alternatives

		val map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement, ImmutableMultimap.of(
			constantValueGrammarElement,
			constantValueGrammarElement,
			intGrammarElement,
			constantValueGrammarElement
		))

		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList

		assertTrue(map.containsGrammarElementDeep(constantValueGrammarElement, grammarElements))
		assertTrue(map.containsGrammarElementDeep(intGrammarElement, grammarElements))
	}

	@Test
	def deep() {
		val model = defaultModel

		val constant = model.constants.head

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val grammarElement = constantRegion.grammarElement as AbstractElement

		val grammar = GrammarUtil.getGrammar(grammarElement)
		val intRule = GrammarUtil.findRuleForName(grammar, "INT").alternatives

		val map = new AccessibleParentMap(grammarElement, grammarElement, createConstantParentMap(grammarElement))		
			
		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList
		
		assertTrue(map.containsGrammarElementDeep(intRule, grammarElements))
	}

	def protected Multimap<AbstractElement, AbstractElement> createConstantParentMap(AbstractElement grammarElement) {
		val Grammar grammar = GrammarUtil.getGrammar(grammarElement);
		
		val Group constantRule = GrammarUtil.findRuleForName(grammar, "Constant").getAlternatives() as Group;
		val Assignment constantName = constantRule.getElements().get(0) as Assignment;
		val Assignment constantValue = constantRule.getElements().get(1) as Assignment;
		
		val Alternatives valueRule = GrammarUtil.findRuleForName(grammar, "Value").getAlternatives() as Alternatives;
		val AbstractElement valueConstantRef = valueRule.getElements().get(0);
		val AbstractElement valueIntLiteral = valueRule.getElements().get(1);
		
		val Assignment constantRefRule = GrammarUtil.findRuleForName(grammar, "ConstantRef").getAlternatives() as Assignment;
		val CrossReference constantRefConstant = constantRefRule.getTerminal() as CrossReference;
		
		val Assignment intLiteralRule = GrammarUtil.findRuleForName(grammar, "IntLiteral").getAlternatives() as Assignment;
		
		val AbstractElement idRule = GrammarUtil.findRuleForName(grammar, "ID").getAlternatives();
		
		val AbstractElement intRule = GrammarUtil.findRuleForName(grammar, "INT").getAlternatives();
		
		// same as in TestCollectContainedGrammarElementsDeep.deep()
		val Multimap<AbstractElement, AbstractElement> map = ImmutableMultimap
				.<AbstractElement, AbstractElement> builder()
				.put(grammarElement, grammarElement)
				.put(constantRule, grammarElement)
				.put(constantName, constantRule)
				.put(constantName.getTerminal(), constantName)
				.put(idRule, constantName.getTerminal())
				.put(constantValue, constantRule)
				.put(constantValue.getTerminal(), constantValue)
				.put(valueRule, constantValue.getTerminal())
				.put(valueConstantRef, valueRule)
				.put(constantRefRule, valueConstantRef)
				.put(constantRefConstant, constantRefRule)
				.put(constantRefConstant.getTerminal(), constantRefConstant)
				.put(idRule, constantRefConstant.getTerminal())
				.put(valueIntLiteral, valueRule)
				.put(intLiteralRule, valueIntLiteral)
				.put(intLiteralRule.getTerminal(), intLiteralRule)
				.put(intRule, intLiteralRule.getTerminal())
				.build();
		
		return map;
	}
}
