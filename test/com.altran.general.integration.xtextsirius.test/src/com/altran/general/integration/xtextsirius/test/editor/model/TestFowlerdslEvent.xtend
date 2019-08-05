/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.editor.model

import org.junit.Test

class TestFowlerdslEvent extends ATestFowlerdslModel {
	@Test
	def void unchanged() {
		assertModelEdit(
			model.events.last,
			"event3 4",
			null,
			createEvent => [
				name = "event3"
				code = 4
			]
		)
	}

	@Test
	def void changeCode() {
		assertModelEdit(
			model.events.last,
			"event3 4",
			"event3 5",
			createEvent => [
				name = "event3"
				code = 5
			]
		)
	}

	@Test
	def void changeName() {
		assertModelEdit(
			model.events.last,
			"event3 4",
			"eventX 4",
			createEvent => [
				name = "eventX"
				code = 4
			]
		)
	}

	@Test
	def void changeNameAndCode() {
		assertModelEdit(
			model.events.last,
			"event3 4",
			"eventX 5",
			createEvent => [
				name = "eventX"
				code = 5
			]
		)
	}

	@Test
	def void empty() {
		assertModelEdit(
			model.events.last,
			"event3 4",
			"",
			null
		)
	}

	@Test
	def void unchangedGuard() {
		assertModelEdit(
			model.events.get(1),
			"event2 3 [ 2 ]",
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
	def void changeNameGuard() {
		assertModelEdit(
			model.events.get(1),
			"event2 3 [ 2 ]",
			"eventX 3 [ 2 ]",
			createEvent => [
				name = "eventX"
				code = 3
				guard = createValueGuard => [
					cond = createIntLiteral => [value = 2]
				]
			]
		)
	}

	@Test
	def void changeGuard() {
		assertModelEdit(
			model.events.get(1),
			"event2 3 [ 2 ]",
			"event2 3 [ 3 ]",
			createEvent => [
				name = "event2"
				code = 3
				guard = createValueGuard => [
					cond = createIntLiteral => [value = 3]
				]
			]
		)
	}

	@Test
	def void removeGuard() {
		assertModelEdit(
			model.events.get(1),
			"event2 3 [ 2 ]",
			"event2 3",
			createEvent => [
				name = "event2"
				code = 3
			]
		)
	}

	@Test
	def void changeGuardRef() {
		assertModelEdit(
			model.events.get(1),
			"event2 3 [ 2 ]",
			"event2 3 [ c1 ]",
			createEvent => [
				name = "event2"
				code = 3
				guard = createValueGuard => [
					cond = createConstantRef => [constant = model.constants.head]
				]
			]
		)
	}

	@Test
	def void changeGuardDoubleRef() {
		assertModelEdit(
			model.events.get(1),
			"event2 3 [ 2 ]",
			"event2 3 [c1..c2]",
			createEvent => [
				name = "event2"
				code = 3
				guard = createRangeGuard => [
					min = createConstantRef => [constant = model.constants.head]
					max = createConstantRef => [constant = model.constants.last]
				]
			]
		)
	}

	@Test
	def void unchangedRangeGuard() {
		assertModelEdit(
			model.events.head,
			"eventSD 2 [ c2 .. c1 ]",
			null,
			createEvent => [
				name = "eventSD"
				code = 2
				guard = createRangeGuard => [
					min = createConstantRef => [constant = model.constants.last]
					max = createConstantRef => [constant = model.constants.head]
				]
			]
		)
	}

	@Test
	def void removeRangeGuard() {
		assertModelEdit(
			model.events.head,
			"eventSD 2 [ c2 .. c1 ]",
			"eventSD 2",
			createEvent => [
				name = "eventSD"
				code = 2
			]
		)
	}

	@Test
	def void changeRangeGuardToMin() {
		assertModelEdit(
			model.events.head,
			"eventSD 2 [ c2 .. c1 ]",
			"eventSD 2 [c2]",
			createEvent => [
				name = "eventSD"
				code = 2
				guard = createValueGuard => [
					cond = createConstantRef => [constant = model.constants.last]
				]
			]
		)
	}

	@Test
	def void changeRangeGuardToMax() {
		assertModelEdit(
			model.events.head,
			"eventSD 2 [ c2 .. c1 ]",
			"eventSD 2 [c1]",
			createEvent => [
				name = "eventSD"
				code = 2
				guard = createValueGuard => [
					cond = createConstantRef => [constant = model.constants.head]
				]
			]
		)
	}

	@Test
	def void changeRangeGuard() {
		assertModelEdit(
			model.events.head,
			"eventSD 2 [ c2 .. c1 ]",
			"eventSD 2 [ c2 .. 5 ]",
			createEvent => [
				name = "eventSD"
				code = 2
				guard = createRangeGuard => [
					min = createConstantRef => [constant = model.constants.last]
					max = createIntLiteral => [value = 5]
				]
			]
		)
	}

	override protected getFeatureName() {
		""
	}

}
