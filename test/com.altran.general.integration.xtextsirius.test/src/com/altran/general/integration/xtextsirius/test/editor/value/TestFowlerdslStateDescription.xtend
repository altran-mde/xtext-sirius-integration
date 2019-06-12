package com.altran.general.integration.xtextsirius.test.editor.value

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusValueDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusValueEditorCallback
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusValueEditor
import com.altran.general.integration.xtextsirius.test.editor.ATestFowlerdsl
import com.google.inject.Injector
import nl.altran.example.xtext.html.HtmlLangStandaloneSetup
import org.eclipse.emf.ecore.EObject
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*

class TestFowlerdslStateDescription extends ATestFowlerdsl {
	static Injector htmlInjector

	@BeforeClass
	static def void loadHtml() {
		htmlInjector = new HtmlLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}

	protected def createDescriptor() {
		new XtextSiriusValueDescriptor(htmlInjector, createXtextDirectEditValueDescription)
	}

	@Test
	def void existingEdit() {
		assertEdit(
			model.states.head,
			null,
			"<p>This is a deschkriptschion</p>\n",
			"<p>This is a <b>desch</b>kriptschion</p>\n",
			"<p>This is a <b>desch</b>kriptschion</p>\n"
		)
	}

	@Test
	def void initEdit() {
		assertEdit(
			model.states.head,
			"<p>T",
			"<p>T",
			"<p>This is a <b>desch</b>kriptschion</p>\n",
			"<p>This is a <b>desch</b>kriptschion</p>\n"
		)
	}

	@Test
	def void existingNoOp() {
		assertEdit(
			model.states.head,
			null,
			"<p>This is a deschkriptschion</p>\n",
			null,
			"<p>This is a deschkriptschion</p>\n"
		)
	}

	@Test
	def void existingDelete() {
		assertEdit(
			model.states.head,
			null,
			"<p>This is a deschkriptschion</p>\n",
			"",
			null
		)
	}

	protected def void assertEdit(EObject container, String initialValue, String expectedText, String changedText,
		String expectedResult) {
		val descriptor = createDescriptor()
		val editor = new XtextSiriusValueEditor(descriptor)

		editor.callback = new IXtextSiriusValueEditorCallback() {
			override callbackGetText() {
				changedText
			}

			override callbackInitText(String initialValue, int offset, int length) {
				val text = initialValue.substring(offset, offset + length)
				assertEquals('''doesn't match''', expectedText, text)
			}
		}

		val mep = new ModelEntryPoint(null, container, featureName)
		editor.modelEntryPoint = mep

		editor.initValue(initialValue)

		val result = editor.commit(container)

		assertEquals(expectedResult, result)
	}

	override protected getFeatureName() {
		"description"
	}
}
