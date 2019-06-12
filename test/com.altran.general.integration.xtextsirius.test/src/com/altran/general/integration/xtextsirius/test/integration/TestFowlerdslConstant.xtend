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

class TestFowlerdslConstant extends ATestFowlerdslCombined {
	@Test
	def void unchanged() {
		assertEdit(
			model,
			"c1 23  c2 42",
			null,
			#[
				createConstant => [
					name = "c1"
					value = createIntLiteral => [value = 23]
				],
				createConstant => [
					name = "c2"
					value = createIntLiteral => [value = 42]
				]
			]
		)
	}
	
	@Test
	def void empty() {
		assertEdit(
			model,
			"c1 23  c2 42",
			"",
			#[
			]
		)
	}
	
	@Test
	def void changeFirst() {
		assertEdit(
			model,
			"c1 23  c2 42",
			"c1 22 c2 42",
			#[
				createConstant => [
					name = "c1"
					value = createIntLiteral => [value = 22]
				],
				createConstant => [
					name = "c2"
					value = createIntLiteral => [value = 42]
				]
			]
		)
	}
	
	@Test
	def void changeLast() {
		assertEdit(
			model,
			"c1 23  c2 42",
			"c1 23 c2 43",
			#[
				createConstant => [
					name = "c1"
					value = createIntLiteral => [value = 23]
				],
				createConstant => [
					name = "c2"
					value = createIntLiteral => [value = 43]
				]
			]
		)
	}
	
	@Test
	def void removeFirst() {
		assertEdit(
			model,
			"c1 23  c2 42",
			"c2 42",
			#[
				createConstant => [
					name = "c2"
					value = createIntLiteral => [value = 42]
				]
			]
		)
	}
	
	@Test
	def void removeLast() {
		assertEdit(
			model,
			"c1 23  c2 42",
			"c1 23",
			#[
				createConstant => [
					name = "c1"
					value = createIntLiteral => [value = 23]
				]
			]
		)
	}
	
	@Test
	def void replace() {
		assertEdit(
			model,
			"c1 23  c2 42",
			"c3 13",
			#[
				createConstant => [
					name = "c3"
					value = createIntLiteral => [value = 13]
				]
			]
		)
	}
	
	@Test
	def void replaceMove() {
		assertEdit(
			model,
			"c1 23  c2 42",
			"c3 13 c1 23",
			#[
				createConstant => [
					name = "c3"
					value = createIntLiteral => [value = 13]
				],
				createConstant => [
					name = "c1"
					value = createIntLiteral => [value = 23]
				]
			]
		)
	}
	
	@Test
	def void addFirst() {
		assertEdit(
			model,
			"c1 23  c2 42",
			"c3 13 c1 23 c2 42",
			#[
				createConstant => [
					name = "c3"
					value = createIntLiteral => [value = 13]
				],
				createConstant => [
					name = "c1"
					value = createIntLiteral => [value = 23]
				],
				createConstant => [
					name = "c2"
					value = createIntLiteral => [value = 42]
				]
			]
		)
	}
	
	@Test
	def void addLast() {
		assertEdit(
			model,
			"c1 23  c2 42",
			"c1 23 c2 42 c3 13",
			#[
				createConstant => [
					name = "c1"
					value = createIntLiteral => [value = 23]
				],
				createConstant => [
					name = "c2"
					value = createIntLiteral => [value = 42]
				],
				createConstant => [
					name = "c3"
					value = createIntLiteral => [value = 13]
				]
			]
		)
	}
	
	override protected getFeatureName() {
		"constants"
	}
	
}
