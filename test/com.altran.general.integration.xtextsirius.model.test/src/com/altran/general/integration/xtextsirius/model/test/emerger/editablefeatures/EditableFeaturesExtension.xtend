/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMerger
import com.altran.general.integration.xtextsirius.runtime.util.EMerger
import com.google.common.collect.ImmutableSet
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

class EditableFeaturesExtension<T extends IElement<?>> {
	protected T existing
	protected T edited
	protected Set<EStructuralFeature> untouchedFeatures
	ATestEMerger<T> test
	
	new(ATestEMerger<T> test) {
		this.test = test
	}

	def createEMerger(T existing, T edited) {
		createEMerger(existing, edited, edited.eClass.EAllStructuralFeatures
			.filter[!isDerived && edited.eIsSet(it)]
			.map[name]
			.toSet
		)
	}
	
	def createEMerger(T existing, T edited, Set<String> editableFeatures) {
		this.existing = existing
		this.edited = edited

		this.untouchedFeatures = edited.eClass.EAllStructuralFeatures
			.filter[isChangeable]
			.filter[!editableFeatures.contains(name)]
			.toSet
		this.untouchedFeatures.forEach[fillFeature(it)]

		new EMerger(test.createDescriptor(editableFeatures, emptySet), existing, URI.createURI(resourceName))
	}
	
	def createEMerger(T existing, EStructuralFeature feature) {
		this.existing = existing
		
		this.untouchedFeatures = existing.eClass.EAllStructuralFeatures
			.filter[isChangeable]
			.reject[it == feature]
			.toSet
		this.untouchedFeatures.forEach[fillFeature(it)]
		
		new EMerger(test.createDescriptor(ImmutableSet::of(feature.name), emptySet), existing, URI.createURI(resourceName))
	}
	
	protected def String resourceName()
		'''resourceName.xmi'''
	
	
	def createEMerger(T existing, EStructuralFeature feature, Set<String> editableFeatures) {
		this.existing = existing
		
		this.untouchedFeatures = existing.eClass.EAllStructuralFeatures
			.filter[isChangeable]
			.filter[!editableFeatures.contains(name)]
			.toSet
		this.untouchedFeatures.forEach[fillFeature(it)]
		
		new EMerger(test.createDescriptor(editableFeatures, emptySet), existing, URI.createURI(resourceName))
	}
	
	def void checkUntouchedFeatures() {
		assertNotNull(this.existing)
		
		this.untouchedFeatures.forEach[feature |
			var i  = 100
			
			val expected  = switch (feature) {
			EAttribute:
				feature.createAttributeValue
			EReference case XtextSiriusTestPackage.Literals::IELEMENT.isSuperTypeOf(feature.EReferenceType): {
					val integer = new AtomicInteger(i)
					val r = feature.createReferenceValue(integer)
					i = integer.get
					r
				}
			}
			
			if (feature.isMany) {
				switch (feature) {
					EAttribute: assertArrayEquals(feature.name, (expected as List<?>).toArray, (this.existing.eGet(feature) as List<?>).toArray)
					EReference case XtextSiriusTestPackage.Literals::IELEMENT.isSuperTypeOf(feature.EReferenceType): assertArrayEquals(feature.name, (expected as List<?>).map[extractAttr].toArray, (this.existing.eGet(feature) as List<?>).map[extractAttr].toArray)
				}
			} else {
				switch (feature) {
					EAttribute: assertEquals(feature.name, expected, this.existing.eGet(feature)) 
					EReference case XtextSiriusTestPackage.Literals::IELEMENT.isSuperTypeOf(feature.EReferenceType): assertEquals(feature.name, expected.extractAttr, this.existing.eGet(feature).extractAttr) 
				}
			}
		]
	}
	
	protected def extractAttr(Object el) {
		(el as T).changeableAttr
	}

	protected def fillFeature(EStructuralFeature feature) {
		var i = 100
		switch (feature) {
			EAttribute:
				this.existing.eSet(feature, feature.createAttributeValue)
			EReference case XtextSiriusTestPackage.Literals::IELEMENT.isSuperTypeOf(feature.EReferenceType): {
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
