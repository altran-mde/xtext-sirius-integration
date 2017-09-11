package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import org.junit.Test

import static org.junit.Assert.*

class TestGetWhitespace extends AModelRegionEditorPreparer {
	@Test
	def whitespace() {
		val model = defaultModel
		
		val rootRegion = getRootRegion(model)
		
		assertEquals(" ", fakePreparer.getWhitespace(rootRegion.regionForRootEObject.grammarElement))
	}

}
