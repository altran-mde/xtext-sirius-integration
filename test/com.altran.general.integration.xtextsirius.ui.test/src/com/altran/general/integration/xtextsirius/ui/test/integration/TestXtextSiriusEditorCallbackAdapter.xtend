package com.altran.general.integration.xtextsirius.ui.test.integration

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
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.StringInputStream

abstract class TestXtextSiriusEditorCallbackAdapter implements IXtextSiriusEditorCallback, IXtextSiriusModelEditorCallback, IXtextSiriusValueEditorCallback {
	protected val XtextResource fakeResource
	@Accessors
	protected var EObject testSemanticElement
	
	new(Injector injector, EObject model) {
		val uri = model.eResource.URI
		fakeResource = injector.getInstance(IResourceFactory).createResource(uri) as XtextResource
		val text = NodeModelUtils::getNode(model).rootNode.text
		fakeResource.load(new StringInputStream(text), Collections::emptyMap)
		FakeResourceUtil::instance.updateFakeResourceUri(fakeResource, uri)
	}
	
	override callbackSetValue(Object value, int offset, int length) {
		val newContent = value.toString
		fakeResource.reparse(newContent)
		fakeResource.relink
		val element = getTestSemanticElement()
//		if (element !== null) {
			FakeResourceUtil::instance.updateFakeResourceUri(fakeResource, element.eResource().getURI())
//		}
	}
	
	override getXtextParseResult() {
		EcoreUtil2::resolveLazyCrossReferences(fakeResource, null)
		fakeResource.parseResult
	}
	
	override getValue() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override handleSyntaxErrors(IParseResult parseResult) {
		throw new AssertionError(parseResult.syntaxErrors.map[it.syntaxErrorMessage])
	}
	
	override handleUnresolvableProxies() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}
