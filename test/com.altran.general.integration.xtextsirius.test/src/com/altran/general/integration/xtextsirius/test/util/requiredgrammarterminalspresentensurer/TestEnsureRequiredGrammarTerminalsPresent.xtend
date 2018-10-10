package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer

import org.junit.Test

import static org.junit.Assert.*

class TestEnsureRequiredGrammarTerminalsPresent extends ARequiredGrammarTerminalsPresentEnsurer {
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
