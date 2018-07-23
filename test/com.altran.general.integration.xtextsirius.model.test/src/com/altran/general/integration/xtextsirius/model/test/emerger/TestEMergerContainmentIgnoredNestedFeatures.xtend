package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
import com.altran.general.integration.xtextsirius.util.EMerger
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.util.EcoreUtil
import org.junit.After

import static org.junit.Assert.*

class TestEMergerContainmentIgnoredNestedFeatures extends TestEMergerContainment {
	private int i = 100
	protected Element existing
	protected Set<String> nestedFeaturesToIgnore

	override protected createEMerger(Element existing, Element edited) {
		this.existing = existing
		
		nestedFeaturesToIgnore = edited.eClass.EAllStructuralFeatures
			.map[feature | 
				XtextSiriusTestPackage.Literals::ELEMENT.EAllStructuralFeatures
				.filter[name != "changeableAttr"]
				.map[feature.name + "." + name]
			]
			.flatten
			.toSet
		
		new EMerger(existing, edited, emptySet, nestedFeaturesToIgnore, URI.createURI("resourceName.xmi#/42"))
	}
	
	@After
	def void checkIgnoredNestedFeatures() {
		assertNotNull(existing)
		
		EcoreUtil.getAllContents(existing, false)
		.filter(Element)
		.forEach[
			assertTrue(changeableBagAttr.isEmpty)
			assertTrue(changeableBagRef.isEmpty)
			assertNull(changeableCont)
			assertTrue(changeableListAttr.isEmpty)
			assertTrue(changeableListRef.isEmpty)
			assertNull(changeableRef)
			assertTrue(changeableSetAttr.isEmpty)
			assertTrue(changeableSetCont.isEmpty)
			assertTrue(changeableSetRef.isEmpty)
			assertTrue(changeableUniqueListCont.isEmpty)
		]
	}
	
	override protected newEdited(int id, String attrValue) {
		val result = createElement => [
			changeableAttr = "a" + attrValue
			changeableBagAttr += #[2.71, 3.14]
			changeableBagRef += #[newDummyElement, newDummyElement]
			changeableCont = newDummyElement
			changeableListAttr += #["2.71", "3.14"]
			changeableListRef += #[newDummyElement, newDummyElement]
			changeableRef = newDummyElement
			changeableSetAttr += #[2, 3]
			changeableSetCont += #[newDummyElement, newDummyElement]
			changeableSetRef += #[newDummyElement, newDummyElement]
			changeableUniqueListCont += #[newDummyElement, newDummyElement]
		]

		this.editedResource.contents += result
		return result
	}
	
	private def newDummyElement() {
		newElement(i, "untouched" + i++)
	}
		
}