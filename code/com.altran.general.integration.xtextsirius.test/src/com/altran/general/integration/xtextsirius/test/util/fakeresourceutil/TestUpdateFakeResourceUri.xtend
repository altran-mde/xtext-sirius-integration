package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import com.altran.general.integration.xtextsirius.util.FakeResourceUtil
import org.junit.Test

import static org.junit.Assert.*

class TestUpdateFakeResourceUri extends ATestFakeResourceUtil {
	@Test
	def update() {
		val model = defaultModel
		val fakeModel = createFakeModel(model)

		val orgUri = model.eResource.getURI
		val fakeUri = fakeModel.eResource.getURI

		FakeResourceUtil.instance.updateFakeResourceUri(fakeModel.eResource, orgUri);

		val newUri = fakeModel.eResource.getURI
		val unsynthNewUri = accessibleFakeResourceUtil.removeSynthetic(newUri)

		assertNotEquals(orgUri, fakeUri)
		assertNotEquals(orgUri, newUri)
		assertNotEquals(fakeUri, newUri)
		assertEquals(orgUri, unsynthNewUri)
	}

}
