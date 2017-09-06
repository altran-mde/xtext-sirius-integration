package com.altran.general.integration.xtextsirius.test

import org.junit.Test

import static org.junit.Assert.*

class TestTestInfrastructure extends AFowlerdslTest {
	@Test
	def sometest() {
		val model = parse('''
			events
				event1 aaa
			end
		''')

		assertEquals("event1", model.events.head.name)
	}
}
