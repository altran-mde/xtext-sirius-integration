/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.integration

import org.junit.Test
import org.espilce.commons.lang.StringUtils2

class TestFowlerdslRoot extends ATestFowlerdslCombined {
	
	protected override modelText() {
		StringUtils2::normalizeNewline(
		'''
			name statemachine1
		''')
	}
	
	@Test
	def void unchanged() {
		assertEdit(
			model,
			null,
			"name statemachine1",
			null,
			createStatemachine => [
				name = "statemachine1"
			]
		)
	}
	
	@Test
	def void empty() {
		assertEdit(
			model,
			null,
			"name statemachine1",
			"",
			[]
		)
	}
	
	@Test
	def void change() {
		assertEdit(
			model,
			null,
			"name statemachine1",
			"name statemachine2",
			createStatemachine => [
				name = "statemachine2"
			]
		)
	}
	
	override protected getFeatureName() {
		null
	}
	
}
