package com.altran.general.integration.xtextsirius.test.util.ecorehelper

import com.altran.general.integration.xtextsirius.util.EcoreHelper
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard
import org.junit.Test

import static org.junit.Assert.*

class TestProxify extends ATestEcoreHelper {
	@Test
	def proxify() {
		val model = defaultModel
		val fakeModel = createFakeModel(model)

		val orgUri = model.eResource.URI

		EcoreHelper.instance.updateFakeResourceUri(fakeModel.eResource, orgUri);

		val fakeEvent = fakeModel.events.get(2)

		val proxified = EcoreHelper.instance.proxify(fakeEvent, orgUri)

		assertSame(fakeEvent, proxified)
		assertFalse(proxified.eIsProxy)

		val guard = proxified.guard as ValueGuard
		assertNotNull(guard)
		assertFalse(guard.eIsProxy)

		val ref = guard.cond as ConstantRef
		assertNotNull(ref)
		assertFalse(ref.eIsProxy)

		val const = ref.constant
		assertNotNull(const)
		assertTrue(const.eIsProxy)
		val proxyUri = (const as InternalEObject).eProxyURI
		assertEquals(proxyUri, accessibleEcoreHelper.removeSynthetic(proxyUri))

		val transition = fakeModel.states.get(2).transitions.get(1)
		assertNotNull(transition)
		assertFalse(transition.event.eIsProxy)
	}
}
