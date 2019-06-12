/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.integration

import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusEditorCallback
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusValueEditorCallback
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil
import com.google.inject.Injector
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.StringInputStream
import org.junit.Assert
import org.eclipse.xtext.util.TextRegion

abstract class TestXtextSiriusEditorCallbackAdapter implements IXtextSiriusEditorCallback, IXtextSiriusModelEditorCallback, IXtextSiriusValueEditorCallback {
	protected val XtextResource fakeResource
	
	@Accessors
	protected var EObject testSemanticElement
	
	String newContent
	
	new(Injector injector, EObject model) {
		val uri = model.eResource.URI
		fakeResource = injector.getInstance(IResourceFactory).createResource(uri) as XtextResource
		val text = NodeModelUtils::getNode(model).rootNode.text
		fakeResource.load(new StringInputStream(text), Collections::emptyMap)
		FakeResourceUtil::instance.updateFakeResourceUri(fakeResource, uri)
	}
	
	override callbackInitText(String initialText, int offset, int length) {
		updateEditedText(initialText)
		val element = getTestSemanticElement()
		Assert.assertNotNull("testSemanticElement is null", element)
		FakeResourceUtil::instance.updateFakeResourceUri(fakeResource, element.eResource().getURI())
	}
	
	override callbackGetText() {
		newContent
	}
	
	def updateEditedText(String newContent) {
		this.newContent = newContent
		fakeResource.reparse(newContent ?: "")
		fakeResource.relink
	}
	
	override getXtextParseResult() {
		EcoreUtil2::resolveLazyCrossReferences(fakeResource, null)
		fakeResource.parseResult
	}
	
	override callbackGetVisibleRegion() {
		new TextRegion(0, 0)
	}
}
