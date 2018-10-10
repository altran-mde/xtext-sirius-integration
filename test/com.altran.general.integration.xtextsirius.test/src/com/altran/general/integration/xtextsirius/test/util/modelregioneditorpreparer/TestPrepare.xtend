/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
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
