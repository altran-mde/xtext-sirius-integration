/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XtextSiriusTestPackageImpl extends EPackageImpl implements XtextSiriusTestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iContainedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedBEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XtextSiriusTestPackageImpl() {
		super(eNS_URI, XtextSiriusTestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link XtextSiriusTestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XtextSiriusTestPackage init() {
		if (isInited)
			return (XtextSiriusTestPackage) EPackage.Registry.INSTANCE.getEPackage(XtextSiriusTestPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredXtextSiriusTestPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		XtextSiriusTestPackageImpl theXtextSiriusTestPackage = registeredXtextSiriusTestPackage instanceof XtextSiriusTestPackageImpl
				? (XtextSiriusTestPackageImpl) registeredXtextSiriusTestPackage
				: new XtextSiriusTestPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theXtextSiriusTestPackage.createPackageContents();

		// Initialize created meta-data
		theXtextSiriusTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXtextSiriusTestPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XtextSiriusTestPackage.eNS_URI, theXtextSiriusTestPackage);
		return theXtextSiriusTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdElement() {
		return idElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdElement_Id() {
		return (EAttribute) idElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIElement() {
		return iElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIElement_ChangeableAttr() {
		return (EAttribute) iElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIElement_UnchangeableAttr() {
		return (EAttribute) iElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIElement_ChangeableListAttr() {
		return (EAttribute) iElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIElement_UnchangeableListAttr() {
		return (EAttribute) iElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIElement_ChangeableSetAttr() {
		return (EAttribute) iElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIElement_UnchangeableSetAttr() {
		return (EAttribute) iElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIElement_ChangeableBagAttr() {
		return (EAttribute) iElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIElement_UnchangeableBagAttr() {
		return (EAttribute) iElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIElement_ContainedSingle() {
		return (EReference) iElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIElement_ContainedMulti() {
		return (EReference) iElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElement__GetChangeableRef() {
		return iElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElement__SetChangeableRef__IElement() {
		return iElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElement__GetChangeableListRef() {
		return iElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElement__GetChangeableSetRef() {
		return iElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElement__GetChangeableBagRef() {
		return iElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElement__GetChangeableCont() {
		return iElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElement__SetChangeableCont__IElement() {
		return iElementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElement__GetChangeableUniqueListCont() {
		return iElementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElement__GetChangeableSetCont() {
		return iElementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAElement() {
		return aElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_ChangeableRef() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_UnchangeableRef() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_ChangeableListRef() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_UnchangeableListRef() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_ChangeableSetRef() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_UnchangeableSetRef() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_ChangeableBagRef() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_UnchangeableBagRef() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_ChangeableUniqueListCont() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_UnchangeableUniqueListCont() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_ChangeableSetCont() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_ChangeableCont() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_UnchangeableCont() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAElement_UnchangeableSetCont() {
		return (EReference) aElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyElement() {
		return keyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_ChangeableRef() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_UnchangeableRef() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_ChangeableListRef() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_UnchangeableListRef() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_ChangeableSetRef() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_UnchangeableSetRef() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_ChangeableBagRef() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_UnchangeableBagRef() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_ChangeableUniqueListCont() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_UnchangeableUniqueListCont() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_ChangeableSetCont() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_ChangeableCont() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_UnchangeableCont() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyElement_UnchangeableSetCont() {
		return (EReference) keyElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyElement_KeyId() {
		return (EAttribute) keyElementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIContainedElement() {
		return iContainedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIContainedElement_AttrA() {
		return (EAttribute) iContainedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedA() {
		return containedAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedA_AttrB() {
		return (EAttribute) containedAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedA_AttrX() {
		return (EAttribute) containedAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedB() {
		return containedBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedB_AttrB() {
		return (EAttribute) containedBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedB_AttrY() {
		return (EAttribute) containedBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtextSiriusTestFactory getXtextSiriusTestFactory() {
		return (XtextSiriusTestFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		idElementEClass = createEClass(ID_ELEMENT);
		createEAttribute(idElementEClass, ID_ELEMENT__ID);

		elementEClass = createEClass(ELEMENT);

		iElementEClass = createEClass(IELEMENT);
		createEAttribute(iElementEClass, IELEMENT__CHANGEABLE_ATTR);
		createEAttribute(iElementEClass, IELEMENT__UNCHANGEABLE_ATTR);
		createEAttribute(iElementEClass, IELEMENT__CHANGEABLE_LIST_ATTR);
		createEAttribute(iElementEClass, IELEMENT__UNCHANGEABLE_LIST_ATTR);
		createEAttribute(iElementEClass, IELEMENT__CHANGEABLE_SET_ATTR);
		createEAttribute(iElementEClass, IELEMENT__UNCHANGEABLE_SET_ATTR);
		createEAttribute(iElementEClass, IELEMENT__CHANGEABLE_BAG_ATTR);
		createEAttribute(iElementEClass, IELEMENT__UNCHANGEABLE_BAG_ATTR);
		createEReference(iElementEClass, IELEMENT__CONTAINED_SINGLE);
		createEReference(iElementEClass, IELEMENT__CONTAINED_MULTI);
		createEOperation(iElementEClass, IELEMENT___GET_CHANGEABLE_REF);
		createEOperation(iElementEClass, IELEMENT___SET_CHANGEABLE_REF__IELEMENT);
		createEOperation(iElementEClass, IELEMENT___GET_CHANGEABLE_LIST_REF);
		createEOperation(iElementEClass, IELEMENT___GET_CHANGEABLE_SET_REF);
		createEOperation(iElementEClass, IELEMENT___GET_CHANGEABLE_BAG_REF);
		createEOperation(iElementEClass, IELEMENT___GET_CHANGEABLE_CONT);
		createEOperation(iElementEClass, IELEMENT___SET_CHANGEABLE_CONT__IELEMENT);
		createEOperation(iElementEClass, IELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT);
		createEOperation(iElementEClass, IELEMENT___GET_CHANGEABLE_SET_CONT);

		aElementEClass = createEClass(AELEMENT);
		createEReference(aElementEClass, AELEMENT__CHANGEABLE_REF);
		createEReference(aElementEClass, AELEMENT__UNCHANGEABLE_REF);
		createEReference(aElementEClass, AELEMENT__CHANGEABLE_LIST_REF);
		createEReference(aElementEClass, AELEMENT__UNCHANGEABLE_LIST_REF);
		createEReference(aElementEClass, AELEMENT__CHANGEABLE_SET_REF);
		createEReference(aElementEClass, AELEMENT__UNCHANGEABLE_SET_REF);
		createEReference(aElementEClass, AELEMENT__CHANGEABLE_BAG_REF);
		createEReference(aElementEClass, AELEMENT__UNCHANGEABLE_BAG_REF);
		createEReference(aElementEClass, AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT);
		createEReference(aElementEClass, AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT);
		createEReference(aElementEClass, AELEMENT__CHANGEABLE_SET_CONT);
		createEReference(aElementEClass, AELEMENT__CHANGEABLE_CONT);
		createEReference(aElementEClass, AELEMENT__UNCHANGEABLE_CONT);
		createEReference(aElementEClass, AELEMENT__UNCHANGEABLE_SET_CONT);

		keyElementEClass = createEClass(KEY_ELEMENT);
		createEReference(keyElementEClass, KEY_ELEMENT__CHANGEABLE_REF);
		createEReference(keyElementEClass, KEY_ELEMENT__UNCHANGEABLE_REF);
		createEReference(keyElementEClass, KEY_ELEMENT__CHANGEABLE_LIST_REF);
		createEReference(keyElementEClass, KEY_ELEMENT__UNCHANGEABLE_LIST_REF);
		createEReference(keyElementEClass, KEY_ELEMENT__CHANGEABLE_SET_REF);
		createEReference(keyElementEClass, KEY_ELEMENT__UNCHANGEABLE_SET_REF);
		createEReference(keyElementEClass, KEY_ELEMENT__CHANGEABLE_BAG_REF);
		createEReference(keyElementEClass, KEY_ELEMENT__UNCHANGEABLE_BAG_REF);
		createEReference(keyElementEClass, KEY_ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT);
		createEReference(keyElementEClass, KEY_ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT);
		createEReference(keyElementEClass, KEY_ELEMENT__CHANGEABLE_SET_CONT);
		createEReference(keyElementEClass, KEY_ELEMENT__CHANGEABLE_CONT);
		createEReference(keyElementEClass, KEY_ELEMENT__UNCHANGEABLE_CONT);
		createEReference(keyElementEClass, KEY_ELEMENT__UNCHANGEABLE_SET_CONT);
		createEAttribute(keyElementEClass, KEY_ELEMENT__KEY_ID);

		iContainedElementEClass = createEClass(ICONTAINED_ELEMENT);
		createEAttribute(iContainedElementEClass, ICONTAINED_ELEMENT__ATTR_A);

		containedAEClass = createEClass(CONTAINED_A);
		createEAttribute(containedAEClass, CONTAINED_A__ATTR_B);
		createEAttribute(containedAEClass, CONTAINED_A__ATTR_X);

		containedBEClass = createEClass(CONTAINED_B);
		createEAttribute(containedBEClass, CONTAINED_B__ATTR_B);
		createEAttribute(containedBEClass, CONTAINED_B__ATTR_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter iElementEClass_T = addETypeParameter(iElementEClass, "T");
		ETypeParameter aElementEClass_A = addETypeParameter(aElementEClass, "A");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getIElement());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		iElementEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getAElement());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		aElementEClass_A.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getAElement());
		g2 = createEGenericType(this.getIdElement());
		g1.getETypeArguments().add(g2);
		idElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAElement());
		g2 = createEGenericType(this.getElement());
		g1.getETypeArguments().add(g2);
		elementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIElement());
		g2 = createEGenericType(aElementEClass_A);
		g1.getETypeArguments().add(g2);
		aElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIElement());
		g2 = createEGenericType(this.getKeyElement());
		g1.getETypeArguments().add(g2);
		keyElementEClass.getEGenericSuperTypes().add(g1);
		containedAEClass.getESuperTypes().add(this.getIContainedElement());
		containedBEClass.getESuperTypes().add(this.getIContainedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(idElementEClass, IdElement.class, "IdElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iElementEClass, IElement.class, "IElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIElement_ChangeableAttr(), ecorePackage.getEString(), "changeableAttr", null, 0, 1,
				IElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIElement_UnchangeableAttr(), ecorePackage.getEInt(), "unchangeableAttr", null, 0, 1,
				IElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIElement_ChangeableListAttr(), ecorePackage.getEString(), "changeableListAttr", null, 0, -1,
				IElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIElement_UnchangeableListAttr(), ecorePackage.getEBoolean(), "unchangeableListAttr", null, 0,
				-1, IElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIElement_ChangeableSetAttr(), ecorePackage.getEInt(), "changeableSetAttr", null, 0, -1,
				IElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIElement_UnchangeableSetAttr(), ecorePackage.getEInt(), "unchangeableSetAttr", null, 0, -1,
				IElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIElement_ChangeableBagAttr(), ecorePackage.getEDouble(), "changeableBagAttr", null, 0, -1,
				IElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIElement_UnchangeableBagAttr(), ecorePackage.getEDouble(), "unchangeableBagAttr", null, 0, -1,
				IElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getIElement_ContainedSingle(), this.getIContainedElement(), null, "containedSingle", null, 0, 1,
				IElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIElement_ContainedMulti(), this.getIContainedElement(), null, "containedMulti", null, 0, -1,
				IElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getIElement__GetChangeableRef(), null, "getChangeableRef", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(iElementEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getIElement__SetChangeableRef__IElement(), null, "setChangeableRef", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(iElementEClass_T);
		addEParameter(op, g1, "ref", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIElement__GetChangeableListRef(), null, "getChangeableListRef", 0, -1, !IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(iElementEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getIElement__GetChangeableSetRef(), null, "getChangeableSetRef", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		g1 = createEGenericType(iElementEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getIElement__GetChangeableBagRef(), null, "getChangeableBagRef", 0, -1, !IS_UNIQUE,
				!IS_ORDERED);
		g1 = createEGenericType(iElementEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getIElement__GetChangeableCont(), null, "getChangeableCont", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iElementEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getIElement__SetChangeableCont__IElement(), null, "setChangeableCont", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(iElementEClass_T);
		addEParameter(op, g1, "ref", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIElement__GetChangeableUniqueListCont(), null, "getChangeableUniqueListCont", 0, -1,
				!IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iElementEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getIElement__GetChangeableSetCont(), null, "getChangeableSetCont", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		g1 = createEGenericType(iElementEClass_T);
		initEOperation(op, g1);

		initEClass(aElementEClass, AElement.class, "AElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_ChangeableRef(), g1, null, "changeableRef", null, 0, 1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_UnchangeableRef(), g1, null, "unchangeableRef", null, 0, 1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_ChangeableListRef(), g1, null, "changeableListRef", null, 0, -1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_UnchangeableListRef(), g1, null, "unchangeableListRef", null, 0, -1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_ChangeableSetRef(), g1, null, "changeableSetRef", null, 0, -1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_UnchangeableSetRef(), g1, null, "unchangeableSetRef", null, 0, -1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_ChangeableBagRef(), g1, null, "changeableBagRef", null, 0, -1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_UnchangeableBagRef(), g1, null, "unchangeableBagRef", null, 0, -1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_ChangeableUniqueListCont(), g1, null, "changeableUniqueListCont", null, 0, -1,
				AElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_UnchangeableUniqueListCont(), g1, null, "unchangeableUniqueListCont", null, 0, -1,
				AElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_ChangeableSetCont(), g1, null, "changeableSetCont", null, 0, -1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_ChangeableCont(), g1, null, "changeableCont", null, 0, 1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_UnchangeableCont(), g1, null, "unchangeableCont", null, 0, 1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(aElementEClass_A);
		initEReference(getAElement_UnchangeableSetCont(), g1, null, "unchangeableSetCont", null, 0, -1, AElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(keyElementEClass, KeyElement.class, "KeyElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyElement_ChangeableRef(), this.getKeyElement(), null, "changeableRef", null, 0, 1,
				KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKeyElement_ChangeableRef().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_UnchangeableRef(), this.getKeyElement(), null, "unchangeableRef", null, 0, 1,
				KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKeyElement_UnchangeableRef().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_ChangeableListRef(), this.getKeyElement(), null, "changeableListRef", null, 0, -1,
				KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKeyElement_ChangeableListRef().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_UnchangeableListRef(), this.getKeyElement(), null, "unchangeableListRef", null, 0,
				-1, KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKeyElement_UnchangeableListRef().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_ChangeableSetRef(), this.getKeyElement(), null, "changeableSetRef", null, 0, -1,
				KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getKeyElement_ChangeableSetRef().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_UnchangeableSetRef(), this.getKeyElement(), null, "unchangeableSetRef", null, 0,
				-1, KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getKeyElement_UnchangeableSetRef().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_ChangeableBagRef(), this.getKeyElement(), null, "changeableBagRef", null, 0, -1,
				KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getKeyElement_ChangeableBagRef().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_UnchangeableBagRef(), this.getKeyElement(), null, "unchangeableBagRef", null, 0,
				-1, KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getKeyElement_UnchangeableBagRef().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_ChangeableUniqueListCont(), this.getKeyElement(), null, "changeableUniqueListCont",
				null, 0, -1, KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKeyElement_ChangeableUniqueListCont().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_UnchangeableUniqueListCont(), this.getKeyElement(), null,
				"unchangeableUniqueListCont", null, 0, -1, KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKeyElement_UnchangeableUniqueListCont().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_ChangeableSetCont(), this.getKeyElement(), null, "changeableSetCont", null, 0, -1,
				KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getKeyElement_ChangeableSetCont().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_ChangeableCont(), this.getKeyElement(), null, "changeableCont", null, 0, 1,
				KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKeyElement_ChangeableCont().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_UnchangeableCont(), this.getKeyElement(), null, "unchangeableCont", null, 0, 1,
				KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKeyElement_UnchangeableCont().getEKeys().add(this.getKeyElement_KeyId());
		initEReference(getKeyElement_UnchangeableSetCont(), this.getKeyElement(), null, "unchangeableSetCont", null, 0,
				-1, KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getKeyElement_UnchangeableSetCont().getEKeys().add(this.getKeyElement_KeyId());
		initEAttribute(getKeyElement_KeyId(), ecorePackage.getEString(), "keyId", null, 1, 1, KeyElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iContainedElementEClass, IContainedElement.class, "IContainedElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIContainedElement_AttrA(), ecorePackage.getEString(), "attrA", null, 0, 1,
				IContainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(containedAEClass, ContainedA.class, "ContainedA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainedA_AttrB(), ecorePackage.getEString(), "attrB", null, 0, 1, ContainedA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedA_AttrX(), ecorePackage.getEString(), "attrX", null, 0, 1, ContainedA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containedBEClass, ContainedB.class, "ContainedB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainedB_AttrB(), ecorePackage.getEString(), "attrB", null, 0, 1, ContainedB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainedB_AttrY(), ecorePackage.getEString(), "attrY", null, 0, 1, ContainedB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //XtextSiriusTestPackageImpl
