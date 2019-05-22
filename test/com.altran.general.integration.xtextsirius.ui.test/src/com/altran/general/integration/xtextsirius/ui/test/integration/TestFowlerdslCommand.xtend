package com.altran.general.integration.xtextsirius.ui.test.integration

import org.junit.Test

class TestFowlerdslCommand extends ATestFowlerdslCombined {
	@Test
	def void unchanged() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			null,
			#[
				createCommand => [
					name = "cmd0"
					code = 23
				],
				createCommand => [
					name = "cmd1"
					code = 42
				]
			]
		)
	}
	
	@Test
	def void empty() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			"",
			#[]
		)
	}
	
	@Test
	def void changeFirst() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			"cmd0 22 cmd1 42",
			#[
				createCommand => [
					name = "cmd0"
					code = 22
				],
				createCommand => [
					name = "cmd1"
					code = 42
				]
			]
		)
	}
	
	@Test
	def void changeBoth() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			"cmd0 22 cmd1 43",
			#[
				createCommand => [
					name = "cmd0"
					code = 22
				],
				createCommand => [
					name = "cmd1"
					code = 43
				]
			]
		)
	}
	
	@Test
	def void removeLast() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			"cmd0 23",
			#[
				createCommand => [
					name = "cmd0"
					code = 23
				]
			]
		)
	}
	
	@Test
	def void removeFirst() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			"cmd1 42",
			#[
				createCommand => [
					name = "cmd1"
					code = 42
				]
			]
		)
	}
	
	@Test
	def void replace() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			"cmd2 13",
			#[
				createCommand => [
					name = "cmd2"
					code = 13
				]
			]
		)
	}
	
	@Test
	def void replaceMove() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			"cmd2 13 cmd0 23",
			#[
				createCommand => [
					name = "cmd0"
					code = 13
				],
				createCommand => [
					name = "cmd0"
					code = 23
				]
			]
		)
	}
	
	@Test
	def void insertFirst() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			"cmd2 13 cmd0 23 cmd1 42",
			#[
				createCommand => [
					name = "cmd2"
					code = 13
				],
				createCommand => [
					name = "cmd0"
					code = 23
				],
				createCommand => [
					name = "cmd1"
					code = 42
				]
			]
		)
	}
	
	@Test
	def void insertLast() {
		assertEdit(
			model.commands,
			model,
			"cmd0 23  cmd1 42",
			"cmd0 23 cmd1 42 cmd2 13",
			#[
				createCommand => [
					name = "cmd0"
					code = 23
				],
				createCommand => [
					name = "cmd1"
					code = 42
				],
				createCommand => [
					name = "cmd2"
					code = 13
				]
			]
		)
	}
	
	override protected getFeatureName() {
		"commands"
	}
	
}