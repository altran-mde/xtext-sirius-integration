package com.altran.general.integration.xtextsirius.test.util.ecorehelper

import com.altran.general.integration.xtextsirius.util.EcoreHelper
import org.junit.Test

import static org.junit.Assert.*

class TestUpdateFakeResourceUri extends ATestEcoreHelper {
	@Test
	def update() {
		val model = defaultModel
		val fakeModel = createFakeModel(model)

		val orgUri = model.eResource.URI
		val fakeUri = fakeModel.eResource.URI

		EcoreHelper.instance.updateFakeResourceUri(fakeModel.eResource, orgUri);

		val newUri = fakeModel.eResource.URI
		val unsynthNewUri = accessibleEcoreHelper.removeSynthetic(newUri)

		assertNotEquals(orgUri, fakeUri)
		assertNotEquals(orgUri, newUri)
		assertNotEquals(fakeUri, newUri)
		assertEquals(orgUri, unsynthNewUri)
	}

}
