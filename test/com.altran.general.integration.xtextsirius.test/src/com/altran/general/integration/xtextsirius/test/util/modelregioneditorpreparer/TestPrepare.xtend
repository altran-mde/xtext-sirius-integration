package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import org.junit.Test

import static org.junit.Assert.*

class TestPrepare extends AModelRegionEditorPreparer {
	@Test
	def prepareOnlyOnce() {
		val model = defaultModel
		
		val event = model.events.get(0)
		
		val preparer = new AccessibleModelRegionEditorPreparer(injector, null, event, statemachinePackage.event_Guard)
		preparer.multiLine = true
		
		assertFalse(preparer.prepared)
		
		preparer.prepare()
		
		assertTrue(preparer.prepared)
	}

}
