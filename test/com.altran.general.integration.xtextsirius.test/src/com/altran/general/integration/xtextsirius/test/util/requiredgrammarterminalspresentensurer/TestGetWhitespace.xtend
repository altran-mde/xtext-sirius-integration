/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
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
