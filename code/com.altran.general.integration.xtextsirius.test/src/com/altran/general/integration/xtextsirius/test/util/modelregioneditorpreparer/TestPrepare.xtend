package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import org.junit.Test

import static org.junit.Assert.*

class TestPrepare extends AModelRegionEditorPreparer {
	@Test
	def prepareOnlyOnce() {
		val model = defaultModel
		
		val event = model.events.get(0)
		
		val preparer = new AccessibleModelRegionEditorPreparer(null, event, injector, true, emptyList, statemachinePackage.event_Guard)
		
		assertFalse(preparer.prepared)
		
		preparer.prepare()
		
		assertTrue(preparer.prepared)
	}

}
