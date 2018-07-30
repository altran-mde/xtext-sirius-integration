package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import java.util.Set
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event
import org.junit.Test

import static org.junit.Assert.*

class TestTranslateToRegions extends AModelRegionEditorPreparer {
	@Test
	def emptyFeatures() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(event, injector, false, emptySet, emptySet)

		val rootRegion = getRootRegion(event)

		val eventRegion = rootRegion.regionForEObject(event)

		val regions = preparer.translateToRegions(emptySet, eventRegion, event, rootRegion)

		assertEquals(0, regions.size)
	}

	@Test
	def oneDefinedFeature() {
		val model = defaultModel

		val event = model.events.get(0)

		val preparer = new AccessibleModelRegionEditorPreparer(event, injector, false, emptySet, emptySet)

		val rootRegion = getRootRegion(event)

		val eventRegion = rootRegion.regionForEObject(event)

		val regions = preparer.translateToRegions(#[statemachinePackage.event_Name, statemachinePackage.event_Guard].toSet as Set<EStructuralFeature>, eventRegion, event, rootRegion)

		assertEquals(1, regions.size)
		
		val region = regions.head
		assertEquals(26, region.offset)
		assertEquals(6, region.length)
		assertEquals("event1", region.text)
	}

	@Test
	def someDefinedFeatures() {
		val model = defaultModel

		val event = model.events.get(2)

		val preparer = new AccessibleModelRegionEditorPreparer(event, injector, false, emptySet, emptySet)

		val rootRegion = getRootRegion(event)

		val eventRegion = rootRegion.regionForEObject(event)

		val regions = preparer.translateToRegions(#[statemachinePackage.event_Name, statemachinePackage.event_Guard].toSet as Set<EStructuralFeature>, eventRegion, event, rootRegion)

		assertEquals(2, regions.size)

		val region1 = regions.findFirst[it.semanticElement instanceof Event]
		assertEquals(58, region1.offset)
		assertEquals(6, region1.length)
		assertEquals("event3", region1.text)
		
		val region2 = regions.findFirst[it.semanticElement instanceof ConstantRef]
		assertEquals(75, region2.offset)
		assertEquals(9, region2.length)
		assertEquals("constant1", region2.text)
	}

}
