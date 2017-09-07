package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Keyword
import org.junit.Test

import static org.junit.Assert.*

class TestCollectToTerminalText extends AModelRegionEditorPreparer {
	@Test
	def empty() {
		val preparer = fakePreparer

		val text = preparer.collectToTerminalText(emptyList)

		assertEquals("", text)
	}

	@Test
	def noTerminals() {
		val model = defaultModel
		
		val rootRegion = getRootRegion(model)
		
		val grammarElements = rootRegion.regionForRootEObject.allSemanticRegions
			.map[it.semanticElement]
			.filter(AbstractElement)
			.filter[!(it instanceof Keyword)]
			.toList
		
		val preparer = fakePreparer

		val text = preparer.collectToTerminalText(grammarElements)

		assertEquals("", text)
	}

	@Test
	def oneTerminal() {
		val model = defaultModel
		
		val event = model.events.get(0)
		
		val rootRegion = getRootRegion(model)
		val eventRegion = rootRegion.regionForEObject(event)
		
		val grammarElement = eventRegion.previousSemanticRegion.grammarElement as AbstractElement
		
		val preparer = fakePreparer

		val text = preparer.collectToTerminalText(#[grammarElement])

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
		
		val preparer = fakePreparer

		val text = preparer.collectToTerminalText(grammarElements)

		assertEquals("events[][][][..]end", text)
	}
	
}
