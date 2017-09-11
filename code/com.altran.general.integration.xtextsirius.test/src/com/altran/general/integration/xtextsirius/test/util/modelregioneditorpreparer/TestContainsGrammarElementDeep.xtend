package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import com.google.common.collect.ImmutableMultimap
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.GrammarUtil
import org.junit.Test

import static org.junit.Assert.*

class TestContainsGrammarElementDeep extends AModelRegionEditorPreparer {
	@Test
	def emptyGrammarList() {
		val model = defaultModel

		val constant = model.constants.head

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

		val constant = model.constants.head

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

		val constant = model.constants.head

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

		val constant = model.constants.head

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

		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList

		assertTrue(preparer.containsGrammarElementDeep(constantValueGrammarElement, grammarElements, map))
		assertTrue(preparer.containsGrammarElementDeep(intGrammarElement, grammarElements, map))
	}

	@Test
	def deep() {
		val model = defaultModel

		val constant = model.constants.head

		val preparer = fakePreparer

		val rootRegion = getRootRegion(constant)
		val constantRegion = rootRegion.regionForEObject(constant)
		val grammarElement = constantRegion.grammarElement as AbstractElement

		val grammar = GrammarUtil.getGrammar(grammarElement)
		val intRule = GrammarUtil.findRuleForName(grammar, "INT").alternatives

		val map = createConstantParentMap(grammarElement)		
			
		val grammarElements = constantRegion.allSemanticRegions.map[it.grammarElement as AbstractElement].toList
		
		assertTrue(preparer.containsGrammarElementDeep(intRule, grammarElements, map))
	}

}
