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

import org.apache.commons.lang.SystemUtils
import org.junit.Assume
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class TestEnsureRequiredGrammarTerminalsPresent extends ARequiredGrammarTerminalsPresentEnsurer {
    @Before
    def void assumeWindows() {
        // Platform specific test due to line separator
        Assume::assumeTrue('Test requires Windows OS', SystemUtils::IS_OS_WINDOWS)
    }
    
	@Test(expected=IllegalStateException)
	def void alreadySet() {
		val text = '''
			events
				event1 111
			end
		'''

		val model = parseIntoResource(text)
		val event = model.events.head

		val rootRegion = getRootRegion(event)

		val allText = getAllText(rootRegion)

		val ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(
			event, 
			statemachinePackage.event_Name, 
			rootRegion, 
			allText
		)

		ensurer.ensure()
	}

	@Test
	def void noTerminals() {
		val text = '''
			events
				event1
			end
		'''
		val expectedText = '''
			events
				event1  
			end
		'''

		val model = parseIntoResource(text)
		val event = model.events.head

		val rootRegion = getRootRegion(event)

		val allText = getAllText(rootRegion)

		val ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(
			event, 
			statemachinePackage.event_Code, 
			rootRegion, 
			allText
		)

		val resultRegion = ensurer.ensure()

		assertEquals(expectedText, allText.toString)
		assertEquals(16, resultRegion.offset)
		assertEquals(0, resultRegion.length)
	}

	@Test
	def void inBetweenNoTerminals() {
        // Platform specific test due to line separator
        Assume::assumeTrue('Test requires Windows OS', SystemUtils::IS_OS_WINDOWS)

		val text = '''
			events
				event1 [123]
			end
		'''
		val expectedText = '''
			events
				event1   [123]
			end
		'''

		val model = parseIntoResource(text)
		val event = model.events.head

		val rootRegion = getRootRegion(event)

		val allText = getAllText(rootRegion)

		val ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(
			event, 
			statemachinePackage.event_Code, 
			rootRegion, 
			allText
		)

		val resultRegion = ensurer.ensure()

		assertEquals(expectedText, allText.toString)
		assertEquals(16, resultRegion.offset)
		assertEquals(0, resultRegion.length)
	}

	@Test
	def void addedTerminals() {
		val text = '''
			events
				event1
			end
		'''
		val expectedText = '''
			events
				event1[]
			end
		'''

		val model = parseIntoResource(text)
		val event = model.events.head

		val rootRegion = getRootRegion(event)

		val allText = getAllText(rootRegion)

		val ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(
			event, 
			statemachinePackage.event_Guard, 
			rootRegion, 
			allText
		)

		val resultRegion = ensurer.ensure()

		assertEquals(expectedText, allText.toString)
		assertEquals(16, resultRegion.offset)
		assertEquals(0, resultRegion.length)
	}

	@Test
	def void addedTerminalsOptional() {
		val text = '''
			events
				event1 111
			end
		'''
		val expectedText = '''
			events
				event1 111[]
			end
		'''

		val model = parseIntoResource(text)
		val event = model.events.head

		val rootRegion = getRootRegion(event)

		val allText = getAllText(rootRegion)

		val ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(
			event, 
			statemachinePackage.event_Guard, 
			rootRegion, 
			allText
		)

		val resultRegion = ensurer.ensure()

		assertEquals(expectedText, allText.toString)
		assertEquals(20, resultRegion.offset)
		assertEquals(0, resultRegion.length)
	}

}
