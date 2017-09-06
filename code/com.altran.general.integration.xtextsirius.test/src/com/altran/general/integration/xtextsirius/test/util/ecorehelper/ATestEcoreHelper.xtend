package com.altran.general.integration.xtextsirius.test.util.ecorehelper

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest
import com.altran.general.integration.xtextsirius.util.EcoreHelper
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject

abstract class ATestEcoreHelper extends AFowlerdslDefaultModelTest {
	protected static class AccessibleEcoreHelper extends EcoreHelper {
		def insertSyntheticA(URI uri) {
			EcoreHelper.insertSynthetic(uri)
		}

		def removeSyntheticA(URI uri) {
			EcoreHelper.removeSynthetic(uri)
		}

		def equalsDisregardingSyntheticA(URI a, URI b) {
			EcoreHelper.equalsDisregardingSynthetic(a, b)
		}

		def collectAllReferencedObjectsDeepA(EObject base) {
			EcoreHelper.collectAllReferencedObjectsDeep(base)
		}

		def collectAllReferencedObjectsA(EObject base) {
			EcoreHelper.collectAllReferencedObjects(base)
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
	
	def protected EObject findFirstByName(List<EObject> list, String name) {
		list.findFirst[it.eGet(it.eClass.getEStructuralFeature("name")) == name]
	}
}