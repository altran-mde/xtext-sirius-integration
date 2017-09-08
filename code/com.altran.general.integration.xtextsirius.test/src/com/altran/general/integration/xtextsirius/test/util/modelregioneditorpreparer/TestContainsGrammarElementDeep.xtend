package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import com.google.common.collect.ImmutableMultimap
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Alternatives
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.Group
import org.junit.Test

import static org.junit.Assert.*

class TestContainsGrammarElementDeep extends AModelRegionEditorPreparer {
	@Test
	def emptyGrammarList() {
		val model = defaultModel

		val constant = model.connstants.head

		val preparer = fakePreparer

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val constantValueRegion = constantRegion.allSemanticRegions.last
		val constantValueGrammarElement = constantValueRegion.grammarElement as AbstractElement

		val intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").
			alternatives

		val map = ImmutableMultimap.of(
			constantValueGrammarElement,
			constantValueGrammarElement,
			intGrammarElement,
			constantValueGrammarElement
		)

		assertFalse(preparer.containsGrammarElementDeep(constantValueGrammarElement, emptyList, map))
		assertFalse(preparer.containsGrammarElementDeep(intGrammarElement, emptyList, map))
	}

	@Test
	def emptyGrammarMapDirect() {
		val model = defaultModel

		val constant = model.connstants.head

		val preparer = fakePreparer

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val constantValueRegion = constantRegion.allSemanticRegions.last
		val constantValueGrammarElement = constantValueRegion.grammarElement as AbstractElement

		val map = ImmutableMultimap.of()

		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList
		val result = preparer.containsGrammarElementDeep(constantValueGrammarElement, grammarElements, map)

		assertTrue(result)
	}

	@Test
	def emptyGrammarMapIndirect() {
		val model = defaultModel

		val constant = model.connstants.head

		val preparer = fakePreparer

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val constantValueRegion = constantRegion.allSemanticRegions.last
		val constantValueGrammarElement = constantValueRegion.grammarElement as AbstractElement

		val map = ImmutableMultimap.of()

		val intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").
			alternatives

		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList
		val result = preparer.containsGrammarElementDeep(intGrammarElement, grammarElements, map)

		assertFalse(result)
	}

	@Test
	def simple() {
		val model = defaultModel

		val constant = model.connstants.head

		val preparer = fakePreparer

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val constantGrammarElement = constantRegion.grammarElement as AbstractElement
		val constantValueRegion = constantRegion.allSemanticRegions.last
		val constantValueGrammarElement = constantValueRegion.grammarElement as AbstractElement

		val intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").
			alternatives

		val map = ImmutableMultimap.of(
			constantValueGrammarElement,
			constantValueGrammarElement,
			intGrammarElement,
			constantValueGrammarElement
		)

		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList

		assertTrue(preparer.containsGrammarElementDeep(constantValueGrammarElement, grammarElements, map))
		assertTrue(preparer.containsGrammarElementDeep(intGrammarElement, grammarElements, map))
	}

	@Test
	def deep() {
		val model = defaultModel

		val constant = model.connstants.head

		val preparer = fakePreparer

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val grammarElement = constantRegion.grammarElement as AbstractElement

		val grammar = GrammarUtil.getGrammar(grammarElement)

		val constantRule = GrammarUtil.findRuleForName(grammar, "Constant").alternatives as Group
		val constantName = constantRule.elements.head as Assignment
		val constantValue = constantRule.elements.last as Assignment

		val valueRule = GrammarUtil.findRuleForName(grammar, "Value").alternatives as Alternatives
		val valueConstantRef = valueRule.elements.head
		val valueIntLiteral = valueRule.elements.last

		val constantRefRule = GrammarUtil.findRuleForName(grammar, "ConstantRef").alternatives as Assignment
		val constantRefConstant = constantRefRule.terminal as CrossReference

		val intLiteralRule = GrammarUtil.findRuleForName(grammar, "IntLiteral").alternatives as Assignment

		val idRule = GrammarUtil.findRuleForName(grammar, "ID").alternatives

		val intRule = GrammarUtil.findRuleForName(grammar, "INT").alternatives
		
		// same as in TestCollectContainedGrammarElementsDeep.deep()
		val map = ImmutableMultimap.builder
			.put(grammarElement, grammarElement)
			.put(constantRule, grammarElement)
			.put(constantName, constantRule)
			.put(constantName.terminal, constantName)
			.put(idRule, constantName.terminal)
			.put(constantValue, constantRule)
			.put(constantValue.terminal, constantValue)
			.put(valueRule, constantValue.terminal)
			.put(valueConstantRef, valueRule)
			.put(constantRefRule, valueConstantRef)
			.put(constantRefConstant, constantRefRule)
			.put(constantRefConstant.terminal, constantRefConstant)
			.put(idRule, constantRefConstant.terminal)
			.put(valueIntLiteral, valueRule)
			.put(intLiteralRule, valueIntLiteral)
			.put(intLiteralRule.terminal, intLiteralRule)
			.put(intRule, intLiteralRule.terminal)
			.build
			
		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList
		
		assertTrue(preparer.containsGrammarElementDeep(intRule, grammarElements, map))
	}

}
