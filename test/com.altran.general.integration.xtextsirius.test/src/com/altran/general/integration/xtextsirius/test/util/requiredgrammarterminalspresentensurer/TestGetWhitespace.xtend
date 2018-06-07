package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer

import org.junit.Test

import static org.junit.Assert.*

class TestGetWhitespace extends ARequiredGrammarTerminalsPresentEnsurer {
	@Test
	def whitespace() {
		val model = defaultModel
		
		val rootRegion = getRootRegion(model)
		
		assertEquals(" ", fakeEnsurer.getWhitespace(rootRegion.regionForRootEObject.grammarElement))
	}

}
