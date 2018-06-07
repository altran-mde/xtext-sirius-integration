package com.altran.general.integration.xtextsirius.test.util.parentmap

import com.altran.general.integration.xtextsirius.test.util.ARegion
import com.google.common.collect.Multimaps
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Alternatives
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.Group
import org.junit.Test

import static org.junit.Assert.*

class TestCollectContainedGrammarElementsDeep extends ARegion {
	@Test
	def simple() {
		val model = defaultModel

		val constant = model.constants.head

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val constantValueRegion = constantRegion.allSemanticRegions.last
		val constantValueGrammarElement = constantValueRegion.grammarElement as AbstractElement

		val map = new AccessibleParentMap(constantValueGrammarElement, constantValueGrammarElement).map

		assertEquals(map.toString, 2, map.size)
		assertTrue(map.containsEntry(constantValueGrammarElement, constantValueGrammarElement))
		val intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT")
		assertTrue(map.containsEntry(intGrammarElement.alternatives, constantValueGrammarElement))
	}

	@Test
	def void deep() {
		val model = defaultModel

		val constant = model.constants.head

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val grammarElement = constantRegion.grammarElement as AbstractElement

		val mapIncludingXtextTerminals = new AccessibleParentMap(grammarElement, grammarElement).map

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

		val terminalsGrammar = GrammarUtil.getGrammar(idRule)
		// we don't want to look at the internals of Xtext Terminals grammar
		val map = Multimaps.filterEntries(mapIncludingXtextTerminals, [
			GrammarUtil.getGrammar(it.key) != terminalsGrammar || GrammarUtil.getGrammar(it.value) != terminalsGrammar
		])

		assertEquals(map.toString, 17, map.size)

		// 1
		assertTrue(map.containsEntry(grammarElement, grammarElement))
		// 2
		assertTrue(map.containsEntry(constantRule, grammarElement))
		// 3
		assertTrue(map.containsEntry(constantName, constantRule))
		// 4
		assertTrue(map.containsEntry(constantName.terminal, constantName))
		// 5
		assertTrue(map.containsEntry(idRule, constantName.terminal))

		// 6
		assertTrue(map.containsEntry(constantValue, constantRule))
		// 7
		assertTrue(map.containsEntry(constantValue.terminal, constantValue))
		// 8
		assertTrue(map.containsEntry(valueRule, constantValue.terminal))
		// 9
		assertTrue(map.containsEntry(valueConstantRef, valueRule))
		// 10
		assertTrue(map.containsEntry(constantRefRule, valueConstantRef))
		// 11
		assertTrue(map.containsEntry(constantRefConstant, constantRefRule))
		// 12
		assertTrue(map.containsEntry(constantRefConstant.terminal, constantRefConstant))
		// 13
		assertTrue(map.containsEntry(idRule, constantRefConstant.terminal))

		// 14
		assertTrue(map.containsEntry(valueIntLiteral, valueRule))
		// 15
		assertTrue(map.containsEntry(intLiteralRule, valueIntLiteral))
		// 16
		assertTrue(map.containsEntry(intLiteralRule.terminal, intLiteralRule))
		// 17
		assertTrue(map.containsEntry(intRule, intLiteralRule.terminal))
	}

}
