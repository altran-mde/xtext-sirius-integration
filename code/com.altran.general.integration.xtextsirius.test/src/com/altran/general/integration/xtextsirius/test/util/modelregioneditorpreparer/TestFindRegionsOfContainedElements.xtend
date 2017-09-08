package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import com.google.common.collect.LinkedHashMultimap
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Group
import org.eclipse.xtext.RuleCall
import org.junit.Test

import static org.junit.Assert.*

class TestFindRegionsOfContainedElements extends AModelRegionEditorPreparer {
	@Test
	def void emptyElements() {
		val model = defaultModel

		val event = model.events.get(4)

		val preparer = fakePreparer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val eventRuleCall = eventRegion.grammarElement as RuleCall

		val map = preparer.collectContainedGrammarElementsDeep(eventRuleCall, eventRuleCall, LinkedHashMultimap.create)
				
		val regions = preparer.findRegionsOfContainedElements(eventRegion, emptyList, map)

		assertTrue(regions.isEmpty)
	}

	@Test
	def void complexPath() {
		val model = defaultModel

		val event = model.events.get(4)

		val preparer = fakePreparer

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)

		val eventRuleCall = eventRegion.grammarElement as RuleCall
		val eventGroup = eventRuleCall.rule.alternatives as Group
		val eventName = eventGroup.elements.get(0) as Assignment
		val guardGroup = eventGroup.elements.get(2) as Group
		val guardAssignment = guardGroup.elements.get(1) as Assignment

		val map = preparer.collectContainedGrammarElementsDeep(eventRuleCall, eventRuleCall, LinkedHashMultimap.create)
		
		val regions = preparer.findRegionsOfContainedElements(eventRegion, #[eventName, guardAssignment], map)

		assertEquals(4, regions.size)

		assertNotNull(regions.findFirst[it.text == "event5"])
		assertNotNull(regions.findFirst[it.text == "constant3X"])
		assertNotNull(regions.findFirst[it.text == ".."])
		assertNotNull(regions.findFirst[it.text == "constant2"])
	}

}
