package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import com.altran.general.integration.xtextsirius.util.EMerger
import java.util.List
import java.util.Set
import java.util.concurrent.atomic.AtomicInteger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.util.EcoreUtil

import static org.junit.Assert.*

class EditableFeaturesExtension {
	protected Element existing
	protected Set<EStructuralFeature> untouchedFeatures
	private ATestEMerger test
	
	new(ATestEMerger test) {
		this.test = test
	}

	def createEMerger(Element existing, Element edited) {
		createEMerger(existing, edited, edited.eClass.EAllStructuralFeatures.filter[edited.eIsSet(it)].map[name].toSet)
	}
	
	def createEMerger(Element existing, Element edited, Set<String> editableFeatures) {
		this.existing = existing

		this.untouchedFeatures = edited.eClass.EAllStructuralFeatures.filter[isChangeable].filter[!editableFeatures.contains(name)].toSet
		this.untouchedFeatures.forEach[fillFeature(it)]

		new EMerger(existing, edited, editableFeatures, emptySet, URI.createURI("resourceName.xmi#/42"))
	}
	
	def void checkUntouchedFeatures() {
		assertNotNull(this.existing)
		
		this.untouchedFeatures.forEach[feature |
			var i  = 100
			
			val expected  = switch (feature) {
			EAttribute:
				feature.createAttributeValue
			EReference: {
					val integer = new AtomicInteger(i)
					val r = feature.createReferenceValue(integer)
					i = integer.get
					r
				}
			}
			
			if (feature.isMany) {
				switch (feature) {
					EAttribute: assertArrayEquals(feature.name, (expected as List<?>).toArray, (this.existing.eGet(feature) as List<?>).toArray)
					EReference: assertArrayEquals(feature.name, (expected as List<?>).map[extractAttr].toArray, (this.existing.eGet(feature) as List<?>).map[extractAttr].toArray)
				}
			} else {
				switch (feature) {
					EAttribute: assertEquals(feature.name, expected, this.existing.eGet(feature)) 
					EReference: assertEquals(feature.name, expected.extractAttr, this.existing.eGet(feature).extractAttr) 
				}
			}
		]
	}
	
	protected def extractAttr(Object el) {
		(el as Element).changeableAttr
	}

	protected def fillFeature(EStructuralFeature feature) {
		var i = 100
		switch (feature) {
			EAttribute:
				this.existing.eSet(feature, feature.createAttributeValue)
			EReference: {
				val integer = new AtomicInteger(i)
				this.existing.eSet(feature, feature.createReferenceValue(integer))
				i = integer.get
			}
		}
	}

	protected def createAttributeValue(EAttribute feature) {
		if (feature.isMany) {
			switch (feature.EType) {
				case EcorePackage.Literals::ESTRING:
					#["aaa", "bbb"]
				case EcorePackage.Literals::EINT:
					#[23, 42]
				case EcorePackage.Literals::EDOUBLE:
					#[2.71, 3.14]
			}
		} else {
			EcoreUtil.createFromString(feature.EType as EDataType, switch (feature.EType) {
				case EcorePackage.Literals::ESTRING: "aaa"
				case EcorePackage.Literals::EINT: "23"
				case EcorePackage.Literals::EDOUBLE: "2.71"
			})
		}
	}

	protected def createReferenceValue(EReference feature, AtomicInteger integer) {
		var i = integer.get

		val result = if (feature.isMany) {
				#[this.test.newElement(i, "untouched" + i++), this.test.newElement(i, "untouched" + i++)]
			} else {
				this.test.newElement(i, "untouched" + i++)
			}

		integer.set(i)

		return result
	}
}
