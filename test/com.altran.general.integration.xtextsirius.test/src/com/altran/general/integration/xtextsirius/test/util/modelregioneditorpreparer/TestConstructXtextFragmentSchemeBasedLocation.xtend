package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import com.altran.general.integration.xtextsirius.runtime.util.SemanticElementLocation
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
		
		val preparer = new AccessibleModelRegionEditorPreparer(injector, null, event, statemachinePackage.event_Guard)
		preparer.multiLine = true
		
		val location = preparer.constructXtextFragmentSchemeBasedLocation()
		
		assertEquals(orgUri.fragment, location.extractUriFragment)
	}
	
	@Test
	def firstChild() {
		val model = defaultModel
		
		val event = model.events.get(0)
		
		val orgUri = EcoreUtil.getURI(event)
		
		val preparer = new AccessibleModelRegionEditorPreparer(injector, null, model, statemachinePackage.statemachine_Events)
		preparer.multiLine = true
		
		val location = preparer.constructXtextFragmentSchemeBasedLocation()
		
		assertEquals(orgUri.fragment, location.extractUriFragment)
	}
	
	def protected extractUriFragment(SemanticElementLocation location) {
		val field = location.class.getDeclaredField("uriFragment")
		field.accessible = true
		return field.get(location) as String		
	}

}
