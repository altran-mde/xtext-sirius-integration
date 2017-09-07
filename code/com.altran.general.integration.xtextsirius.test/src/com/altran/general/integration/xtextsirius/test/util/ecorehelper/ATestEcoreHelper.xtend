package com.altran.general.integration.xtextsirius.test.util.ecorehelper

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest
import com.altran.general.integration.xtextsirius.util.EcoreHelper
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject

abstract class ATestEcoreHelper extends AFowlerdslDefaultModelTest {
	protected static class AccessibleEcoreHelper extends EcoreHelper {
		override public insertSynthetic(URI uri) {
			super.insertSynthetic(uri)
		}

		override public removeSynthetic(URI uri) {
			super.removeSynthetic(uri)
		}

		override public equalsDisregardingSynthetic(URI a, URI b) {
			super.equalsDisregardingSynthetic(a, b)
		}

		override public collectAllReferencedObjectsDeep(EObject base) {
			super.collectAllReferencedObjectsDeep(base)
		}

		override public collectAllReferencedObjects(EObject base) {
			super.collectAllReferencedObjects(base)
		}
	}

	def protected getAccessibleEcoreHelper() {
		new AccessibleEcoreHelper()
	}

	def protected <T> front(List<T> list) {
		if (list.size < 2) {
			return emptyList
		}

		list.subList(0, list.size - 2)
	}
}
