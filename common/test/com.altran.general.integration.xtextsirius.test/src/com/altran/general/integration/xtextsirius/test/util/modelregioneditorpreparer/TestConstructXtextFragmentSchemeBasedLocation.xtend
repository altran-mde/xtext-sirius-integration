package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import com.altran.general.integration.xtextsirius.util.SemanticElementLocation
import org.eclipse.emf.ecore.util.EcoreUtil
import org.junit.Test

import static org.junit.Assert.*

class TestConstructXtextFragmentSchemeBasedLocation extends AModelRegionEditorPreparer {
	@Test
	def singleChild() {
		val model = defaultModel
		
		val event = model.events.get(2)
		val guard = event.guard
		
		val orgUri = EcoreUtil.getURI(guard)
		
		val preparer = new AccessibleModelRegionEditorPreparer(null, event, injector, true, emptyList, statemachinePackage.event_Guard)
		
		val location = preparer.constructXtextFragmentSchemeBasedLocation()
		
		assertEquals(orgUri.fragment, location.extractUriFragment)
	}
	
	@Test
	def firstChild() {
		val model = defaultModel
		
		val event = model.events.get(0)
		
		val orgUri = EcoreUtil.getURI(event)
		
		val preparer = new AccessibleModelRegionEditorPreparer(null, model, injector, true, emptyList, statemachinePackage.statemachine_Events)
		
		val location = preparer.constructXtextFragmentSchemeBasedLocation()
		
		assertEquals(orgUri.fragment, location.extractUriFragment)
	}
	
	def protected extractUriFragment(SemanticElementLocation location) {
		val field = location.class.getDeclaredField("uriFragment")
		field.accessible = true
		return field.get(location) as String		
	}

}
