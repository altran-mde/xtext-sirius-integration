/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory
 * @model kind="package"
 * @generated
 */
public interface XtextSiriusTestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XtextSiriusTest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/XtextSiriusTest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XtextSiriusTest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XtextSiriusTestPackage eINSTANCE = com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement <em>IElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getIElement()
	 * @generated
	 */
	int IELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Changeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__CHANGEABLE_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Unchangeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__UNCHANGEABLE_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Changeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__CHANGEABLE_LIST_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Unchangeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__UNCHANGEABLE_LIST_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Changeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__CHANGEABLE_SET_ATTR = 4;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__UNCHANGEABLE_SET_ATTR = 5;

	/**
	 * The feature id for the '<em><b>Changeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__CHANGEABLE_BAG_ATTR = 6;

	/**
	 * The feature id for the '<em><b>Unchangeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__UNCHANGEABLE_BAG_ATTR = 7;

	/**
	 * The feature id for the '<em><b>Contained Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__CONTAINED_SINGLE = 8;

	/**
	 * The feature id for the '<em><b>Contained Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__CONTAINED_MULTI = 9;

	/**
	 * The number of structural features of the '<em>IElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Get Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT___GET_CHANGEABLE_REF = 0;

	/**
	 * The operation id for the '<em>Set Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT___SET_CHANGEABLE_REF__IELEMENT = 1;

	/**
	 * The operation id for the '<em>Get Changeable List Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT___GET_CHANGEABLE_LIST_REF = 2;

	/**
	 * The operation id for the '<em>Get Changeable Set Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT___GET_CHANGEABLE_SET_REF = 3;

	/**
	 * The operation id for the '<em>Get Changeable Bag Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT___GET_CHANGEABLE_BAG_REF = 4;

	/**
	 * The operation id for the '<em>Get Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT___GET_CHANGEABLE_CONT = 5;

	/**
	 * The operation id for the '<em>Set Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT___SET_CHANGEABLE_CONT__IELEMENT = 6;

	/**
	 * The operation id for the '<em>Get Changeable Unique List Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT = 7;

	/**
	 * The operation id for the '<em>Get Changeable Set Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT___GET_CHANGEABLE_SET_CONT = 8;

	/**
	 * The number of operations of the '<em>IElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl <em>AElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getAElement()
	 * @generated
	 */
	int AELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Changeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_ATTR = IELEMENT__CHANGEABLE_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_ATTR = IELEMENT__UNCHANGEABLE_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_LIST_ATTR = IELEMENT__CHANGEABLE_LIST_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_LIST_ATTR = IELEMENT__UNCHANGEABLE_LIST_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_SET_ATTR = IELEMENT__CHANGEABLE_SET_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_SET_ATTR = IELEMENT__UNCHANGEABLE_SET_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_BAG_ATTR = IELEMENT__CHANGEABLE_BAG_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_BAG_ATTR = IELEMENT__UNCHANGEABLE_BAG_ATTR;

	/**
	 * The feature id for the '<em><b>Contained Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CONTAINED_SINGLE = IELEMENT__CONTAINED_SINGLE;

	/**
	 * The feature id for the '<em><b>Contained Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CONTAINED_MULTI = IELEMENT__CONTAINED_MULTI;

	/**
	 * The feature id for the '<em><b>Changeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_REF = IELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unchangeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_REF = IELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Changeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_LIST_REF = IELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unchangeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_LIST_REF = IELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Changeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_SET_REF = IELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_SET_REF = IELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Changeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_BAG_REF = IELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unchangeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_BAG_REF = IELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Changeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT = IELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Unchangeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT = IELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Changeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_SET_CONT = IELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Changeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__CHANGEABLE_CONT = IELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unchangeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_CONT = IELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT__UNCHANGEABLE_SET_CONT = IELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>AElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT_FEATURE_COUNT = IELEMENT_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT___GET_CHANGEABLE_REF = IELEMENT___GET_CHANGEABLE_REF;

	/**
	 * The operation id for the '<em>Set Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT___SET_CHANGEABLE_REF__IELEMENT = IELEMENT___SET_CHANGEABLE_REF__IELEMENT;

	/**
	 * The operation id for the '<em>Get Changeable List Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT___GET_CHANGEABLE_LIST_REF = IELEMENT___GET_CHANGEABLE_LIST_REF;

	/**
	 * The operation id for the '<em>Get Changeable Set Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT___GET_CHANGEABLE_SET_REF = IELEMENT___GET_CHANGEABLE_SET_REF;

	/**
	 * The operation id for the '<em>Get Changeable Bag Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT___GET_CHANGEABLE_BAG_REF = IELEMENT___GET_CHANGEABLE_BAG_REF;

	/**
	 * The operation id for the '<em>Get Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT___GET_CHANGEABLE_CONT = IELEMENT___GET_CHANGEABLE_CONT;

	/**
	 * The operation id for the '<em>Set Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT___SET_CHANGEABLE_CONT__IELEMENT = IELEMENT___SET_CHANGEABLE_CONT__IELEMENT;

	/**
	 * The operation id for the '<em>Get Changeable Unique List Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT = IELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT;

	/**
	 * The operation id for the '<em>Get Changeable Set Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT___GET_CHANGEABLE_SET_CONT = IELEMENT___GET_CHANGEABLE_SET_CONT;

	/**
	 * The number of operations of the '<em>AElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AELEMENT_OPERATION_COUNT = IELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.IdElementImpl <em>Id Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.IdElementImpl
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getIdElement()
	 * @generated
	 */
	int ID_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Changeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_ATTR = AELEMENT__CHANGEABLE_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_ATTR = AELEMENT__UNCHANGEABLE_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_LIST_ATTR = AELEMENT__CHANGEABLE_LIST_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_LIST_ATTR = AELEMENT__UNCHANGEABLE_LIST_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_SET_ATTR = AELEMENT__CHANGEABLE_SET_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_SET_ATTR = AELEMENT__UNCHANGEABLE_SET_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_BAG_ATTR = AELEMENT__CHANGEABLE_BAG_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_BAG_ATTR = AELEMENT__UNCHANGEABLE_BAG_ATTR;

	/**
	 * The feature id for the '<em><b>Contained Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CONTAINED_SINGLE = AELEMENT__CONTAINED_SINGLE;

	/**
	 * The feature id for the '<em><b>Contained Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CONTAINED_MULTI = AELEMENT__CONTAINED_MULTI;

	/**
	 * The feature id for the '<em><b>Changeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_REF = AELEMENT__CHANGEABLE_REF;

	/**
	 * The feature id for the '<em><b>Unchangeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_REF = AELEMENT__UNCHANGEABLE_REF;

	/**
	 * The feature id for the '<em><b>Changeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_LIST_REF = AELEMENT__CHANGEABLE_LIST_REF;

	/**
	 * The feature id for the '<em><b>Unchangeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_LIST_REF = AELEMENT__UNCHANGEABLE_LIST_REF;

	/**
	 * The feature id for the '<em><b>Changeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_SET_REF = AELEMENT__CHANGEABLE_SET_REF;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_SET_REF = AELEMENT__UNCHANGEABLE_SET_REF;

	/**
	 * The feature id for the '<em><b>Changeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_BAG_REF = AELEMENT__CHANGEABLE_BAG_REF;

	/**
	 * The feature id for the '<em><b>Unchangeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_BAG_REF = AELEMENT__UNCHANGEABLE_BAG_REF;

	/**
	 * The feature id for the '<em><b>Changeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT = AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT;

	/**
	 * The feature id for the '<em><b>Unchangeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT = AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT;

	/**
	 * The feature id for the '<em><b>Changeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_SET_CONT = AELEMENT__CHANGEABLE_SET_CONT;

	/**
	 * The feature id for the '<em><b>Changeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_CONT = AELEMENT__CHANGEABLE_CONT;

	/**
	 * The feature id for the '<em><b>Unchangeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_CONT = AELEMENT__UNCHANGEABLE_CONT;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_SET_CONT = AELEMENT__UNCHANGEABLE_SET_CONT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__ID = AELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Id Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_FEATURE_COUNT = AELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT___GET_CHANGEABLE_REF = AELEMENT___GET_CHANGEABLE_REF;

	/**
	 * The operation id for the '<em>Set Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT___SET_CHANGEABLE_REF__IELEMENT = AELEMENT___SET_CHANGEABLE_REF__IELEMENT;

	/**
	 * The operation id for the '<em>Get Changeable List Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT___GET_CHANGEABLE_LIST_REF = AELEMENT___GET_CHANGEABLE_LIST_REF;

	/**
	 * The operation id for the '<em>Get Changeable Set Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT___GET_CHANGEABLE_SET_REF = AELEMENT___GET_CHANGEABLE_SET_REF;

	/**
	 * The operation id for the '<em>Get Changeable Bag Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT___GET_CHANGEABLE_BAG_REF = AELEMENT___GET_CHANGEABLE_BAG_REF;

	/**
	 * The operation id for the '<em>Get Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT___GET_CHANGEABLE_CONT = AELEMENT___GET_CHANGEABLE_CONT;

	/**
	 * The operation id for the '<em>Set Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT___SET_CHANGEABLE_CONT__IELEMENT = AELEMENT___SET_CHANGEABLE_CONT__IELEMENT;

	/**
	 * The operation id for the '<em>Get Changeable Unique List Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT = AELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT;

	/**
	 * The operation id for the '<em>Get Changeable Set Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT___GET_CHANGEABLE_SET_CONT = AELEMENT___GET_CHANGEABLE_SET_CONT;

	/**
	 * The number of operations of the '<em>Id Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_OPERATION_COUNT = AELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ElementImpl
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Changeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_ATTR = AELEMENT__CHANGEABLE_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_ATTR = AELEMENT__UNCHANGEABLE_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_LIST_ATTR = AELEMENT__CHANGEABLE_LIST_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_LIST_ATTR = AELEMENT__UNCHANGEABLE_LIST_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_SET_ATTR = AELEMENT__CHANGEABLE_SET_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_SET_ATTR = AELEMENT__UNCHANGEABLE_SET_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_BAG_ATTR = AELEMENT__CHANGEABLE_BAG_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_BAG_ATTR = AELEMENT__UNCHANGEABLE_BAG_ATTR;

	/**
	 * The feature id for the '<em><b>Contained Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONTAINED_SINGLE = AELEMENT__CONTAINED_SINGLE;

	/**
	 * The feature id for the '<em><b>Contained Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONTAINED_MULTI = AELEMENT__CONTAINED_MULTI;

	/**
	 * The feature id for the '<em><b>Changeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_REF = AELEMENT__CHANGEABLE_REF;

	/**
	 * The feature id for the '<em><b>Unchangeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_REF = AELEMENT__UNCHANGEABLE_REF;

	/**
	 * The feature id for the '<em><b>Changeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_LIST_REF = AELEMENT__CHANGEABLE_LIST_REF;

	/**
	 * The feature id for the '<em><b>Unchangeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_LIST_REF = AELEMENT__UNCHANGEABLE_LIST_REF;

	/**
	 * The feature id for the '<em><b>Changeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_SET_REF = AELEMENT__CHANGEABLE_SET_REF;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_SET_REF = AELEMENT__UNCHANGEABLE_SET_REF;

	/**
	 * The feature id for the '<em><b>Changeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_BAG_REF = AELEMENT__CHANGEABLE_BAG_REF;

	/**
	 * The feature id for the '<em><b>Unchangeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_BAG_REF = AELEMENT__UNCHANGEABLE_BAG_REF;

	/**
	 * The feature id for the '<em><b>Changeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT = AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT;

	/**
	 * The feature id for the '<em><b>Unchangeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT = AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT;

	/**
	 * The feature id for the '<em><b>Changeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_SET_CONT = AELEMENT__CHANGEABLE_SET_CONT;

	/**
	 * The feature id for the '<em><b>Changeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_CONT = AELEMENT__CHANGEABLE_CONT;

	/**
	 * The feature id for the '<em><b>Unchangeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_CONT = AELEMENT__UNCHANGEABLE_CONT;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_SET_CONT = AELEMENT__UNCHANGEABLE_SET_CONT;

	/**
	 * The feature id for the '<em><b>Derived Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DERIVED_ATTR = AELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DERIVED_REF = AELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = AELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CHANGEABLE_REF = AELEMENT___GET_CHANGEABLE_REF;

	/**
	 * The operation id for the '<em>Set Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___SET_CHANGEABLE_REF__IELEMENT = AELEMENT___SET_CHANGEABLE_REF__IELEMENT;

	/**
	 * The operation id for the '<em>Get Changeable List Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CHANGEABLE_LIST_REF = AELEMENT___GET_CHANGEABLE_LIST_REF;

	/**
	 * The operation id for the '<em>Get Changeable Set Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CHANGEABLE_SET_REF = AELEMENT___GET_CHANGEABLE_SET_REF;

	/**
	 * The operation id for the '<em>Get Changeable Bag Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CHANGEABLE_BAG_REF = AELEMENT___GET_CHANGEABLE_BAG_REF;

	/**
	 * The operation id for the '<em>Get Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CHANGEABLE_CONT = AELEMENT___GET_CHANGEABLE_CONT;

	/**
	 * The operation id for the '<em>Set Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___SET_CHANGEABLE_CONT__IELEMENT = AELEMENT___SET_CHANGEABLE_CONT__IELEMENT;

	/**
	 * The operation id for the '<em>Get Changeable Unique List Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT = AELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT;

	/**
	 * The operation id for the '<em>Get Changeable Set Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CHANGEABLE_SET_CONT = AELEMENT___GET_CHANGEABLE_SET_CONT;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = AELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.KeyElementImpl <em>Key Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.KeyElementImpl
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getKeyElement()
	 * @generated
	 */
	int KEY_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Changeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_ATTR = IELEMENT__CHANGEABLE_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_ATTR = IELEMENT__UNCHANGEABLE_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_LIST_ATTR = IELEMENT__CHANGEABLE_LIST_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_LIST_ATTR = IELEMENT__UNCHANGEABLE_LIST_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_SET_ATTR = IELEMENT__CHANGEABLE_SET_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_SET_ATTR = IELEMENT__UNCHANGEABLE_SET_ATTR;

	/**
	 * The feature id for the '<em><b>Changeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_BAG_ATTR = IELEMENT__CHANGEABLE_BAG_ATTR;

	/**
	 * The feature id for the '<em><b>Unchangeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_BAG_ATTR = IELEMENT__UNCHANGEABLE_BAG_ATTR;

	/**
	 * The feature id for the '<em><b>Contained Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CONTAINED_SINGLE = IELEMENT__CONTAINED_SINGLE;

	/**
	 * The feature id for the '<em><b>Contained Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CONTAINED_MULTI = IELEMENT__CONTAINED_MULTI;

	/**
	 * The feature id for the '<em><b>Changeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_REF = IELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unchangeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_REF = IELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Changeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_LIST_REF = IELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unchangeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_LIST_REF = IELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Changeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_SET_REF = IELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_SET_REF = IELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Changeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_BAG_REF = IELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unchangeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_BAG_REF = IELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Changeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT = IELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Unchangeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT = IELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Changeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_SET_CONT = IELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Changeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__CHANGEABLE_CONT = IELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unchangeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_CONT = IELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Unchangeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__UNCHANGEABLE_SET_CONT = IELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT__KEY_ID = IELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Key Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT_FEATURE_COUNT = IELEMENT_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT___GET_CHANGEABLE_REF = IELEMENT___GET_CHANGEABLE_REF;

	/**
	 * The operation id for the '<em>Set Changeable Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT___SET_CHANGEABLE_REF__IELEMENT = IELEMENT___SET_CHANGEABLE_REF__IELEMENT;

	/**
	 * The operation id for the '<em>Get Changeable List Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT___GET_CHANGEABLE_LIST_REF = IELEMENT___GET_CHANGEABLE_LIST_REF;

	/**
	 * The operation id for the '<em>Get Changeable Set Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT___GET_CHANGEABLE_SET_REF = IELEMENT___GET_CHANGEABLE_SET_REF;

	/**
	 * The operation id for the '<em>Get Changeable Bag Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT___GET_CHANGEABLE_BAG_REF = IELEMENT___GET_CHANGEABLE_BAG_REF;

	/**
	 * The operation id for the '<em>Get Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT___GET_CHANGEABLE_CONT = IELEMENT___GET_CHANGEABLE_CONT;

	/**
	 * The operation id for the '<em>Set Changeable Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT___SET_CHANGEABLE_CONT__IELEMENT = IELEMENT___SET_CHANGEABLE_CONT__IELEMENT;

	/**
	 * The operation id for the '<em>Get Changeable Unique List Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT = IELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT;

	/**
	 * The operation id for the '<em>Get Changeable Set Cont</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT___GET_CHANGEABLE_SET_CONT = IELEMENT___GET_CHANGEABLE_SET_CONT;

	/**
	 * The number of operations of the '<em>Key Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ELEMENT_OPERATION_COUNT = IELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement <em>IContained Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getIContainedElement()
	 * @generated
	 */
	int ICONTAINED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Attr A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINED_ELEMENT__ATTR_A = 0;

	/**
	 * The number of structural features of the '<em>IContained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IContained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedAImpl <em>Contained A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedAImpl
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getContainedA()
	 * @generated
	 */
	int CONTAINED_A = 6;

	/**
	 * The feature id for the '<em><b>Attr A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_A__ATTR_A = ICONTAINED_ELEMENT__ATTR_A;

	/**
	 * The feature id for the '<em><b>Attr B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_A__ATTR_B = ICONTAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_A__ATTR_X = ICONTAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contained A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_A_FEATURE_COUNT = ICONTAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contained A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_A_OPERATION_COUNT = ICONTAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedBImpl <em>Contained B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedBImpl
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getContainedB()
	 * @generated
	 */
	int CONTAINED_B = 7;

	/**
	 * The feature id for the '<em><b>Attr A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_B__ATTR_A = ICONTAINED_ELEMENT__ATTR_A;

	/**
	 * The feature id for the '<em><b>Attr B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_B__ATTR_B = ICONTAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_B__ATTR_Y = ICONTAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contained B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_B_FEATURE_COUNT = ICONTAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contained B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_B_OPERATION_COUNT = ICONTAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement <em>Id Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Element</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement
	 * @generated
	 */
	EClass getIdElement();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement#getId()
	 * @see #getIdElement()
	 * @generated
	 */
	EAttribute getIdElement_Id();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getDerivedAttr <em>Derived Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getDerivedAttr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_DerivedAttr();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getDerivedRef <em>Derived Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getDerivedRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_DerivedRef();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement <em>IElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IElement</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
	 * @generated
	 */
	EClass getIElement();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableAttr <em>Changeable Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableAttr()
	 * @see #getIElement()
	 * @generated
	 */
	EAttribute getIElement_ChangeableAttr();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableAttr <em>Unchangeable Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unchangeable Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableAttr()
	 * @see #getIElement()
	 * @generated
	 */
	EAttribute getIElement_UnchangeableAttr();

	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableListAttr <em>Changeable List Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Changeable List Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableListAttr()
	 * @see #getIElement()
	 * @generated
	 */
	EAttribute getIElement_ChangeableListAttr();

	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableListAttr <em>Unchangeable List Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unchangeable List Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableListAttr()
	 * @see #getIElement()
	 * @generated
	 */
	EAttribute getIElement_UnchangeableListAttr();

	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableSetAttr <em>Changeable Set Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Changeable Set Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableSetAttr()
	 * @see #getIElement()
	 * @generated
	 */
	EAttribute getIElement_ChangeableSetAttr();

	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableSetAttr <em>Unchangeable Set Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unchangeable Set Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableSetAttr()
	 * @see #getIElement()
	 * @generated
	 */
	EAttribute getIElement_UnchangeableSetAttr();

	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableBagAttr <em>Changeable Bag Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Changeable Bag Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableBagAttr()
	 * @see #getIElement()
	 * @generated
	 */
	EAttribute getIElement_ChangeableBagAttr();

	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableBagAttr <em>Unchangeable Bag Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unchangeable Bag Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableBagAttr()
	 * @see #getIElement()
	 * @generated
	 */
	EAttribute getIElement_UnchangeableBagAttr();

	/**
	 * Returns the meta object for the containment reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getContainedSingle <em>Contained Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Single</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getContainedSingle()
	 * @see #getIElement()
	 * @generated
	 */
	EReference getIElement_ContainedSingle();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getContainedMulti <em>Contained Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Multi</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getContainedMulti()
	 * @see #getIElement()
	 * @generated
	 */
	EReference getIElement_ContainedMulti();

	/**
	 * Returns the meta object for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableRef() <em>Get Changeable Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changeable Ref</em>' operation.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableRef()
	 * @generated
	 */
	EOperation getIElement__GetChangeableRef();

	/**
	 * Returns the meta object for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#setChangeableRef(com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement) <em>Set Changeable Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Changeable Ref</em>' operation.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#setChangeableRef(com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement)
	 * @generated
	 */
	EOperation getIElement__SetChangeableRef__IElement();

	/**
	 * Returns the meta object for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableListRef() <em>Get Changeable List Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changeable List Ref</em>' operation.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableListRef()
	 * @generated
	 */
	EOperation getIElement__GetChangeableListRef();

	/**
	 * Returns the meta object for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableSetRef() <em>Get Changeable Set Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changeable Set Ref</em>' operation.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableSetRef()
	 * @generated
	 */
	EOperation getIElement__GetChangeableSetRef();

	/**
	 * Returns the meta object for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableBagRef() <em>Get Changeable Bag Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changeable Bag Ref</em>' operation.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableBagRef()
	 * @generated
	 */
	EOperation getIElement__GetChangeableBagRef();

	/**
	 * Returns the meta object for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableCont() <em>Get Changeable Cont</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changeable Cont</em>' operation.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableCont()
	 * @generated
	 */
	EOperation getIElement__GetChangeableCont();

	/**
	 * Returns the meta object for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#setChangeableCont(com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement) <em>Set Changeable Cont</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Changeable Cont</em>' operation.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#setChangeableCont(com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement)
	 * @generated
	 */
	EOperation getIElement__SetChangeableCont__IElement();

	/**
	 * Returns the meta object for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableUniqueListCont() <em>Get Changeable Unique List Cont</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changeable Unique List Cont</em>' operation.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableUniqueListCont()
	 * @generated
	 */
	EOperation getIElement__GetChangeableUniqueListCont();

	/**
	 * Returns the meta object for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableSetCont() <em>Get Changeable Set Cont</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changeable Set Cont</em>' operation.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableSetCont()
	 * @generated
	 */
	EOperation getIElement__GetChangeableSetCont();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement <em>AElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AElement</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement
	 * @generated
	 */
	EClass getAElement();

	/**
	 * Returns the meta object for the reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableRef <em>Changeable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changeable Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableRef()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_ChangeableRef();

	/**
	 * Returns the meta object for the reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableRef <em>Unchangeable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unchangeable Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableRef()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_UnchangeableRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableListRef <em>Changeable List Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable List Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableListRef()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_ChangeableListRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableListRef <em>Unchangeable List Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable List Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableListRef()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_UnchangeableListRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableSetRef <em>Changeable Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable Set Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableSetRef()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_ChangeableSetRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableSetRef <em>Unchangeable Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Set Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableSetRef()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_UnchangeableSetRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableBagRef <em>Changeable Bag Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable Bag Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableBagRef()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_ChangeableBagRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableBagRef <em>Unchangeable Bag Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Bag Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableBagRef()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_UnchangeableBagRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableUniqueListCont <em>Changeable Unique List Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changeable Unique List Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableUniqueListCont()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_ChangeableUniqueListCont();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableUniqueListCont <em>Unchangeable Unique List Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unchangeable Unique List Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableUniqueListCont()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_UnchangeableUniqueListCont();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableSetCont <em>Changeable Set Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changeable Set Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableSetCont()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_ChangeableSetCont();

	/**
	 * Returns the meta object for the containment reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableCont <em>Changeable Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Changeable Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getChangeableCont()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_ChangeableCont();

	/**
	 * Returns the meta object for the containment reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableCont <em>Unchangeable Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unchangeable Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableCont()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_UnchangeableCont();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableSetCont <em>Unchangeable Set Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unchangeable Set Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement#getUnchangeableSetCont()
	 * @see #getAElement()
	 * @generated
	 */
	EReference getAElement_UnchangeableSetCont();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement <em>Key Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Element</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement
	 * @generated
	 */
	EClass getKeyElement();

	/**
	 * Returns the meta object for the reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableRef <em>Changeable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changeable Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableRef()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_ChangeableRef();

	/**
	 * Returns the meta object for the reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableRef <em>Unchangeable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unchangeable Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableRef()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_UnchangeableRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableListRef <em>Changeable List Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable List Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableListRef()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_ChangeableListRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableListRef <em>Unchangeable List Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable List Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableListRef()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_UnchangeableListRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableSetRef <em>Changeable Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable Set Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableSetRef()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_ChangeableSetRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableSetRef <em>Unchangeable Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Set Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableSetRef()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_UnchangeableSetRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableBagRef <em>Changeable Bag Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable Bag Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableBagRef()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_ChangeableBagRef();

	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableBagRef <em>Unchangeable Bag Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Bag Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableBagRef()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_UnchangeableBagRef();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableUniqueListCont <em>Changeable Unique List Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changeable Unique List Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableUniqueListCont()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_ChangeableUniqueListCont();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableUniqueListCont <em>Unchangeable Unique List Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unchangeable Unique List Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableUniqueListCont()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_UnchangeableUniqueListCont();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableSetCont <em>Changeable Set Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changeable Set Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableSetCont()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_ChangeableSetCont();

	/**
	 * Returns the meta object for the containment reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableCont <em>Changeable Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Changeable Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getChangeableCont()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_ChangeableCont();

	/**
	 * Returns the meta object for the containment reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableCont <em>Unchangeable Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unchangeable Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableCont()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_UnchangeableCont();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableSetCont <em>Unchangeable Set Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unchangeable Set Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getUnchangeableSetCont()
	 * @see #getKeyElement()
	 * @generated
	 */
	EReference getKeyElement_UnchangeableSetCont();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement#getKeyId()
	 * @see #getKeyElement()
	 * @generated
	 */
	EAttribute getKeyElement_KeyId();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement <em>IContained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IContained Element</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement
	 * @generated
	 */
	EClass getIContainedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement#getAttrA <em>Attr A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr A</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement#getAttrA()
	 * @see #getIContainedElement()
	 * @generated
	 */
	EAttribute getIContainedElement_AttrA();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA <em>Contained A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained A</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA
	 * @generated
	 */
	EClass getContainedA();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA#getAttrB <em>Attr B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr B</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA#getAttrB()
	 * @see #getContainedA()
	 * @generated
	 */
	EAttribute getContainedA_AttrB();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA#getAttrX <em>Attr X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr X</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA#getAttrX()
	 * @see #getContainedA()
	 * @generated
	 */
	EAttribute getContainedA_AttrX();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB <em>Contained B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained B</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB
	 * @generated
	 */
	EClass getContainedB();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB#getAttrB <em>Attr B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr B</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB#getAttrB()
	 * @see #getContainedB()
	 * @generated
	 */
	EAttribute getContainedB_AttrB();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB#getAttrY <em>Attr Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Y</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB#getAttrY()
	 * @see #getContainedB()
	 * @generated
	 */
	EAttribute getContainedB_AttrY();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XtextSiriusTestFactory getXtextSiriusTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.IdElementImpl <em>Id Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.IdElementImpl
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getIdElement()
		 * @generated
		 */
		EClass ID_ELEMENT = eINSTANCE.getIdElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ELEMENT__ID = eINSTANCE.getIdElement_Id();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ElementImpl
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Derived Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DERIVED_ATTR = eINSTANCE.getElement_DerivedAttr();

		/**
		 * The meta object literal for the '<em><b>Derived Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__DERIVED_REF = eINSTANCE.getElement_DerivedRef();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement <em>IElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getIElement()
		 * @generated
		 */
		EClass IELEMENT = eINSTANCE.getIElement();

		/**
		 * The meta object literal for the '<em><b>Changeable Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IELEMENT__CHANGEABLE_ATTR = eINSTANCE.getIElement_ChangeableAttr();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IELEMENT__UNCHANGEABLE_ATTR = eINSTANCE.getIElement_UnchangeableAttr();

		/**
		 * The meta object literal for the '<em><b>Changeable List Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IELEMENT__CHANGEABLE_LIST_ATTR = eINSTANCE.getIElement_ChangeableListAttr();

		/**
		 * The meta object literal for the '<em><b>Unchangeable List Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IELEMENT__UNCHANGEABLE_LIST_ATTR = eINSTANCE.getIElement_UnchangeableListAttr();

		/**
		 * The meta object literal for the '<em><b>Changeable Set Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IELEMENT__CHANGEABLE_SET_ATTR = eINSTANCE.getIElement_ChangeableSetAttr();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Set Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IELEMENT__UNCHANGEABLE_SET_ATTR = eINSTANCE.getIElement_UnchangeableSetAttr();

		/**
		 * The meta object literal for the '<em><b>Changeable Bag Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IELEMENT__CHANGEABLE_BAG_ATTR = eINSTANCE.getIElement_ChangeableBagAttr();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Bag Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IELEMENT__UNCHANGEABLE_BAG_ATTR = eINSTANCE.getIElement_UnchangeableBagAttr();

		/**
		 * The meta object literal for the '<em><b>Contained Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IELEMENT__CONTAINED_SINGLE = eINSTANCE.getIElement_ContainedSingle();

		/**
		 * The meta object literal for the '<em><b>Contained Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IELEMENT__CONTAINED_MULTI = eINSTANCE.getIElement_ContainedMulti();

		/**
		 * The meta object literal for the '<em><b>Get Changeable Ref</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT___GET_CHANGEABLE_REF = eINSTANCE.getIElement__GetChangeableRef();

		/**
		 * The meta object literal for the '<em><b>Set Changeable Ref</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT___SET_CHANGEABLE_REF__IELEMENT = eINSTANCE.getIElement__SetChangeableRef__IElement();

		/**
		 * The meta object literal for the '<em><b>Get Changeable List Ref</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT___GET_CHANGEABLE_LIST_REF = eINSTANCE.getIElement__GetChangeableListRef();

		/**
		 * The meta object literal for the '<em><b>Get Changeable Set Ref</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT___GET_CHANGEABLE_SET_REF = eINSTANCE.getIElement__GetChangeableSetRef();

		/**
		 * The meta object literal for the '<em><b>Get Changeable Bag Ref</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT___GET_CHANGEABLE_BAG_REF = eINSTANCE.getIElement__GetChangeableBagRef();

		/**
		 * The meta object literal for the '<em><b>Get Changeable Cont</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT___GET_CHANGEABLE_CONT = eINSTANCE.getIElement__GetChangeableCont();

		/**
		 * The meta object literal for the '<em><b>Set Changeable Cont</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT___SET_CHANGEABLE_CONT__IELEMENT = eINSTANCE.getIElement__SetChangeableCont__IElement();

		/**
		 * The meta object literal for the '<em><b>Get Changeable Unique List Cont</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT___GET_CHANGEABLE_UNIQUE_LIST_CONT = eINSTANCE.getIElement__GetChangeableUniqueListCont();

		/**
		 * The meta object literal for the '<em><b>Get Changeable Set Cont</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT___GET_CHANGEABLE_SET_CONT = eINSTANCE.getIElement__GetChangeableSetCont();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl <em>AElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getAElement()
		 * @generated
		 */
		EClass AELEMENT = eINSTANCE.getAElement();

		/**
		 * The meta object literal for the '<em><b>Changeable Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__CHANGEABLE_REF = eINSTANCE.getAElement_ChangeableRef();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__UNCHANGEABLE_REF = eINSTANCE.getAElement_UnchangeableRef();

		/**
		 * The meta object literal for the '<em><b>Changeable List Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__CHANGEABLE_LIST_REF = eINSTANCE.getAElement_ChangeableListRef();

		/**
		 * The meta object literal for the '<em><b>Unchangeable List Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__UNCHANGEABLE_LIST_REF = eINSTANCE.getAElement_UnchangeableListRef();

		/**
		 * The meta object literal for the '<em><b>Changeable Set Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__CHANGEABLE_SET_REF = eINSTANCE.getAElement_ChangeableSetRef();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Set Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__UNCHANGEABLE_SET_REF = eINSTANCE.getAElement_UnchangeableSetRef();

		/**
		 * The meta object literal for the '<em><b>Changeable Bag Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__CHANGEABLE_BAG_REF = eINSTANCE.getAElement_ChangeableBagRef();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Bag Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__UNCHANGEABLE_BAG_REF = eINSTANCE.getAElement_UnchangeableBagRef();

		/**
		 * The meta object literal for the '<em><b>Changeable Unique List Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT = eINSTANCE.getAElement_ChangeableUniqueListCont();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Unique List Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT = eINSTANCE.getAElement_UnchangeableUniqueListCont();

		/**
		 * The meta object literal for the '<em><b>Changeable Set Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__CHANGEABLE_SET_CONT = eINSTANCE.getAElement_ChangeableSetCont();

		/**
		 * The meta object literal for the '<em><b>Changeable Cont</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__CHANGEABLE_CONT = eINSTANCE.getAElement_ChangeableCont();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Cont</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__UNCHANGEABLE_CONT = eINSTANCE.getAElement_UnchangeableCont();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Set Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AELEMENT__UNCHANGEABLE_SET_CONT = eINSTANCE.getAElement_UnchangeableSetCont();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.KeyElementImpl <em>Key Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.KeyElementImpl
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getKeyElement()
		 * @generated
		 */
		EClass KEY_ELEMENT = eINSTANCE.getKeyElement();

		/**
		 * The meta object literal for the '<em><b>Changeable Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__CHANGEABLE_REF = eINSTANCE.getKeyElement_ChangeableRef();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__UNCHANGEABLE_REF = eINSTANCE.getKeyElement_UnchangeableRef();

		/**
		 * The meta object literal for the '<em><b>Changeable List Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__CHANGEABLE_LIST_REF = eINSTANCE.getKeyElement_ChangeableListRef();

		/**
		 * The meta object literal for the '<em><b>Unchangeable List Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__UNCHANGEABLE_LIST_REF = eINSTANCE.getKeyElement_UnchangeableListRef();

		/**
		 * The meta object literal for the '<em><b>Changeable Set Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__CHANGEABLE_SET_REF = eINSTANCE.getKeyElement_ChangeableSetRef();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Set Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__UNCHANGEABLE_SET_REF = eINSTANCE.getKeyElement_UnchangeableSetRef();

		/**
		 * The meta object literal for the '<em><b>Changeable Bag Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__CHANGEABLE_BAG_REF = eINSTANCE.getKeyElement_ChangeableBagRef();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Bag Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__UNCHANGEABLE_BAG_REF = eINSTANCE.getKeyElement_UnchangeableBagRef();

		/**
		 * The meta object literal for the '<em><b>Changeable Unique List Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT = eINSTANCE.getKeyElement_ChangeableUniqueListCont();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Unique List Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT = eINSTANCE.getKeyElement_UnchangeableUniqueListCont();

		/**
		 * The meta object literal for the '<em><b>Changeable Set Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__CHANGEABLE_SET_CONT = eINSTANCE.getKeyElement_ChangeableSetCont();

		/**
		 * The meta object literal for the '<em><b>Changeable Cont</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__CHANGEABLE_CONT = eINSTANCE.getKeyElement_ChangeableCont();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Cont</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__UNCHANGEABLE_CONT = eINSTANCE.getKeyElement_UnchangeableCont();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Set Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_ELEMENT__UNCHANGEABLE_SET_CONT = eINSTANCE.getKeyElement_UnchangeableSetCont();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_ELEMENT__KEY_ID = eINSTANCE.getKeyElement_KeyId();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement <em>IContained Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getIContainedElement()
		 * @generated
		 */
		EClass ICONTAINED_ELEMENT = eINSTANCE.getIContainedElement();

		/**
		 * The meta object literal for the '<em><b>Attr A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICONTAINED_ELEMENT__ATTR_A = eINSTANCE.getIContainedElement_AttrA();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedAImpl <em>Contained A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedAImpl
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getContainedA()
		 * @generated
		 */
		EClass CONTAINED_A = eINSTANCE.getContainedA();

		/**
		 * The meta object literal for the '<em><b>Attr B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_A__ATTR_B = eINSTANCE.getContainedA_AttrB();

		/**
		 * The meta object literal for the '<em><b>Attr X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_A__ATTR_X = eINSTANCE.getContainedA_AttrX();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedBImpl <em>Contained B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedBImpl
		 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestPackageImpl#getContainedB()
		 * @generated
		 */
		EClass CONTAINED_B = eINSTANCE.getContainedB();

		/**
		 * The meta object literal for the '<em><b>Attr B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_B__ATTR_B = eINSTANCE.getContainedB_AttrB();

		/**
		 * The meta object literal for the '<em><b>Attr Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_B__ATTR_Y = eINSTANCE.getContainedB_AttrY();

	}

} //XtextSiriusTestPackage
