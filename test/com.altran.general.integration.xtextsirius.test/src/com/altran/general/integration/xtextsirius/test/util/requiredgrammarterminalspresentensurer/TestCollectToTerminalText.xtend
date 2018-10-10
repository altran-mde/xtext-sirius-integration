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

import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Keyword
import org.junit.Test

import static org.junit.Assert.*

class TestCollectToTerminalText extends ARequiredGrammarTerminalsPresentEnsurer {
	@Test
	def empty() {
		val model = defaultModel
		
		val rootRegion = getRootRegion(model)
		val grElement = rootRegion.regionForRootEObject.allSemanticRegions.head.grammarElement as AbstractElement

		val assurer = fakeEnsurer => [
			grammarElement = grElement
		]

		val text = assurer.collectToTerminalText(emptyList)

		assertEquals(" ", text)
	}

	@Test
	def noTerminals() {
		val model = defaultModel
		
		val rootRegion = getRootRegion(model)
		val grElement = rootRegion.regionForRootEObject.allSemanticRegions.head.grammarElement as AbstractElement
		
		val grammarElements = rootRegion.regionForRootEObject.allSemanticRegions
			.map[it.semanticElement]
			.filter(AbstractElement)
			.filter[!(it instanceof Keyword)]
			.toList
		
		val assurer = fakeEnsurer => [
			grammarElement = grElement
		]

		val text = assurer.collectToTerminalText(grammarElements)

		assertEquals(" ", text)
	}

	@Test
	def oneTerminal() {
		val model = defaultModel
		
		val event = model.events.get(0)
		
		val rootRegion = getRootRegion(model)
		val eventRegion = rootRegion.regionForEObject(event)
		
		val grElement = eventRegion.previousSemanticRegion.grammarElement as AbstractElement
		
		val assurer = fakeEnsurer => [
			grammarElement = grElement
		]

		val text = assurer.collectToTerminalText(#[grElement])

		assertEquals("events", text)
	}
	
	@Test
	def severalTerminals() {
		val model = defaultModel
		
		val rootRegion = getRootRegion(model)
		
		val eventsRegion = rootRegion.regionForRootEObject.allSemanticRegions
			.filter[it.grammarElement instanceof Keyword]
			.findFirst[(it.grammarElement as Keyword).value == "events"]
		
		val eventsEndRegion = rootRegion.regionForRootEObject.allSemanticRegions
			.filter[it.grammarElement instanceof Keyword]
			.findFirst[(it.grammarElement as Keyword).value == "end"]
		
		val grammarElements = rootRegion.regionForRootEObject.allSemanticRegions
			.filter[it.offset >= eventsRegion.offset && it.endOffset <= eventsEndRegion.endOffset]
			.map[it.grammarElement]
			.filter(AbstractElement)
			.toList
		
		val assurer = fakeEnsurer => [
			grammarElement = eventsRegion.grammarElement as AbstractElement
		]

		val text = assurer.collectToTerminalText(grammarElements)

		assertEquals("events[][][][..]end", text)
	}
	
}
