/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.ui.test.integration

import com.altran.general.integration.xtextsirius.test.editor.model.ATestFowlerdslModel
import org.junit.Ignore
import org.junit.Test

@Ignore("Probably wrong expectation: containing event instead of guard")
class TestFowlerdslEventGuardInvalid extends ATestFowlerdslModel {
	@Test
	def void emptyUnchanged() {
		assertEdit(
			model.events.last,
			"",
			null,
			createEvent => [
				name = "event3"
				code = 4
			]
		)
	}

	@Test
	def void emptyAdd() {
		assertEdit(
			model.events.last,
			"",
			"5",
			createEvent => [
				name = "event3"
				code = 4
				guard = createValueGuard => [
					cond = createIntLiteral => [value = 5]
				]
			]
		)
	}

	@Test
	def void existingUnchanged() {
		assertEdit(
			model.events.get(1),
			"2",
			null,
			createEvent => [
				name = "event2"
				code = 3
				guard = createValueGuard => [
					cond = createIntLiteral => [value = 2]
				]
			]
		)
	}

	@Test
	def void existingEmpty() {
		assertEdit(
			model.events.get(1),
			"2",
			"",
			createEvent => [
				name = "event2"
				code = 3
			]
		)
	}

	@Test
	def void existingChange() {
		assertEdit(
			model.events.get(1),
			"2",
			"5",
			createEvent => [
				name = "event2"
				code = 3
				guard = createValueGuard => [
					cond = createIntLiteral => [value = 5]
				]
			]
		)
	}

	@Test
	def void emptyAddRef() {
		assertEdit(
			model.events.last,
			"",
			"c2",
			createEvent => [
				name = "event3"
				code = 4
				guard = createValueGuard => [
					cond = createConstantRef => [constant = model.constants.last]
				]
			]
		)
	}

	@Test
	def void refUnchanged() {
		assertEdit(
			model.events.get(2),
			"c1",
			null,
			createEvent => [
				name = "event4"
				code = 3
				guard = createValueGuard => [
					cond = createConstantRef => [constant = model.constants.head]
				]
			]
		)
	}

	@Test
	def void refEmpty() {
		assertEdit(
			model.events.get(2),
			"c1",
			"",
			createEvent => [
				name = "event4"
				code = 3
			]
		)
	}

	@Test
	def void refChange() {
		assertEdit(
			model.events.get(2),
			"c1",
			"c2",
			createEvent => [
				name = "event4"
				code = 3
				guard = createValueGuard => [
					cond = createConstantRef => [constant = model.constants.last]
				]
			]
		)
	}

	override protected getFeatureName() {
		"guard"
	}

}
