/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.ui.test

import com.altran.general.integration.xtextsirius.test.reflang.refLang.Container
import org.eclipse.core.resources.IFile
import org.espilce.commons.emf.testsupport.AModelLoader
import org.espilce.commons.lang.loadhelper.ILoadHelper
import org.espilce.commons.resource.loadhelper.WorkspacePluginLoadHelper
import org.espilce.commons.testsupport.resource.ATestWorkspace
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

import static org.espilce.commons.resource.WorkspaceUtils.waitForWorkspaceChanges
import static org.junit.Assert.*

@Ignore
class TestSelfReferenceEdit extends ATestWorkspace {
	val fileName = "test1.reflang"

	val modelLoader = new AModelLoader() {
		
		override protected createLoadHelper() {
			getLoadHelperX()
		}
	}

	ILoadHelper loadHelper
	IFile file

	@Before
	def void copyTestFile() {
		waitForWorkspaceChanges[
			file = project.getFile(fileName)
			val contents = getLoadHelperX.getContents(getClass, '''testData/refLangTest/«fileName»''')
			file.create(contents, true, null)
		]
	}
	
	@Test
	def void checkFileExists() {
		assertNotNull(file)
		assertTrue(file.isAccessible)
		
		val model = modelLoader.loadModel(file.locationURI.toURL)
		assertNotNull(model)
		assertTrue(model instanceof Container)		
	}

	def protected ILoadHelper getLoadHelperX() {
		if (loadHelper === null) {
			loadHelper = createLoadHelper()
		}

		return loadHelper
	}

	def protected ILoadHelper createLoadHelper() {
		new WorkspacePluginLoadHelper()
	}
}
