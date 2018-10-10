/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard
import org.junit.Test

import static org.junit.Assert.*

class TestProxify extends ATestFakeResourceUtil {
	@Test
	def proxify() {
		val model = defaultModel
		val fakeModel = createFakeModel(model)

		val orgUri = model.eResource.getURI

		FakeResourceUtil.instance.updateFakeResourceUri(fakeModel.eResource, orgUri);

		val fakeEvent = fakeModel.events.get(2)

		val proxified = FakeResourceUtil.instance.proxify(fakeEvent, orgUri)

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
		assertEquals(proxyUri, accessibleFakeResourceUtil.removeSynthetic(proxyUri))

		val transition = fakeModel.states.get(2).transitions.get(1)
		assertNotNull(transition)
		assertFalse(transition.event.eIsProxy)
	}
}
