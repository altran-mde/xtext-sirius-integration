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
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject

abstract class ATestFakeResourceUtil extends AFowlerdslDefaultModelTest {
	protected static class AccessibleFakeResourceUtil extends FakeResourceUtil {
		override insertSynthetic(URI uri) {
			super.insertSynthetic(uri)
		}

		override removeSynthetic(URI uri) {
			super.removeSynthetic(uri)
		}

		override equalsDisregardingSyntheticAndFileExtension(URI a, URI b) {
			super.equalsDisregardingSyntheticAndFileExtension(a, b)
		}

		override collectAllReferencedObjectsDeep(EObject base) {
			super.collectAllReferencedObjectsDeep(base)
		}

		override collectAllReferencedObjects(EObject base) {
			super.collectAllReferencedObjects(base)
		}
	}

	def protected getAccessibleFakeResourceUtil() {
		new AccessibleFakeResourceUtil()
	}

	def protected <T> front(List<T> list) {
		if (list.size < 2) {
			return emptyList
		}

		list.subList(0, list.size - 2)
	}
}
