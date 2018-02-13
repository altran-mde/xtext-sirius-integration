package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer

import com.altran.general.integration.xtextsirius.test.util.parentmap.AccessibleParentMap
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Group
import org.eclipse.xtext.RuleCall
import org.junit.Test

import static org.junit.Assert.*

class TestFindRegionsOfContainedElements extends ARequiredGrammarTerminalsPresentEnsurer {
	@Test
	def void emptyElements() {
		val model = defaultModel

		val event = model.events.get(4)


		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val eventRuleCall = eventRegion.grammarElement as RuleCall

		val map = new AccessibleParentMap(eventRuleCall, eventRuleCall)
		val ensurer = fakeEnsurer => [
			parentMap = map
			elementRegion = eventRegion
			containedElementPath = emptyList				
		]
				
		val regions = ensurer.findRegionsOfContainedElements()

		assertTrue(regions.isEmpty)
	}

	@Test
	def void complexPath() {
		val model = defaultModel

		val event = model.events.get(4)

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)

		val eventRuleCall = eventRegion.grammarElement as RuleCall
		val eventGroup = eventRuleCall.rule.alternatives as Group
		val eventName = eventGroup.elements.get(0) as Assignment
		val guardGroup = eventGroup.elements.get(2) as Group
		val guardAssignment = guardGroup.elements.get(1) as Assignment

		val map = new AccessibleParentMap(eventRuleCall, eventRuleCall)
		val ensurer = fakeEnsurer => [
			parentMap = map
			elementRegion = eventRegion
			containedElementPath = #[eventName, guardAssignment]				
		]
		
		val regions = ensurer.findRegionsOfContainedElements()

		assertEquals(4, regions.size)

		assertNotNull(regions.findFirst[it.text == "event5"])
		assertNotNull(regions.findFirst[it.text == "constant3X"])
		assertNotNull(regions.findFirst[it.text == ".."])
		assertNotNull(regions.findFirst[it.text == "constant2"])
	}

}
