package com.altran.general.integration.xtextsirius.ui.test.integration

import org.junit.Test

class TestFowlerdslEventGuard extends ATestFowlerdslCombined {
	@Test
	def void emptyUnchanged() {
		assertEdit(
			model.events.last,
			"",
			null,
			null
		)
	}

	@Test
	def void emptyAdd() {
		assertEdit(
			model.events.last,
			"",
			"5",
			createValueGuard => [
				cond = createIntLiteral => [value = 5]
			]
		)
	}

	@Test
	def void existingUnchanged() {
		assertEdit(
			model.events.get(1),
			"2",
			null,
			createValueGuard => [
				cond = createIntLiteral => [value = 2]
			]
		)
	}

	@Test
	def void existingEmpty() {
		assertEdit(
			model.events.get(1),
			"2",
			"",
			null
		)
	}

	@Test
	def void existingChange() {
		assertEdit(
			model.events.get(1),
			"2",
			"5",
			createValueGuard => [
				cond = createIntLiteral => [value = 5]
			]
		)
	}

	@Test
	def void emptyAddRef() {
		assertEdit(
			model.events.last,
			"",
			"c2",
			createValueGuard => [
				cond = createConstantRef => [constant = model.constants.last]
			]
		)
	}

	@Test
	def void refUnchanged() {
		assertEdit(
			model.events.get(2),
			"c1",
			null,
			createValueGuard => [
				cond = createConstantRef => [constant = model.constants.head]
			]
		)
	}

	@Test
	def void refEmpty() {
		assertEdit(
			model.events.get(2),
			"c1",
			"",
			null
		)
	}

	@Test
	def void refChange() {
		assertEdit(
			model.events.get(2),
			"c1",
			"c2",
			createValueGuard => [
				cond = createConstantRef => [constant = model.constants.last]
			]
		)
	}

	override protected getFeatureName() {
		"guard"
	}

}
