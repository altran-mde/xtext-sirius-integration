/**
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	int ELEMENT__CHANGEABLE_ATTR = 0;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_ATTR = 1;
	
	/**
	 * The feature id for the '<em><b>Changeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_LIST_ATTR = 2;
	
	/**
	 * The feature id for the '<em><b>Unchangeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_LIST_ATTR = 3;
	
	/**
	 * The feature id for the '<em><b>Changeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_SET_ATTR = 4;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_SET_ATTR = 5;
	
	/**
	 * The feature id for the '<em><b>Changeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_BAG_ATTR = 6;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_BAG_ATTR = 7;
	
	/**
	 * The feature id for the '<em><b>Changeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_REF = 8;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_REF = 9;
	
	/**
	 * The feature id for the '<em><b>Changeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_LIST_REF = 10;
	
	/**
	 * The feature id for the '<em><b>Unchangeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_LIST_REF = 11;
	
	/**
	 * The feature id for the '<em><b>Changeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_SET_REF = 12;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_SET_REF = 13;
	
	/**
	 * The feature id for the '<em><b>Changeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_BAG_REF = 14;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_BAG_REF = 15;
	
	/**
	 * The feature id for the '<em><b>Changeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT = 16;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT = 17;
	
	/**
	 * The feature id for the '<em><b>Changeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_SET_CONT = 18;
	
	/**
	 * The feature id for the '<em><b>Changeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHANGEABLE_CONT = 19;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_CONT = 20;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNCHANGEABLE_SET_CONT = 21;
	
	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 22;
	
	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;
	
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
	int ID_ELEMENT__CHANGEABLE_ATTR = ELEMENT__CHANGEABLE_ATTR;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_ATTR = ELEMENT__UNCHANGEABLE_ATTR;
	
	/**
	 * The feature id for the '<em><b>Changeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_LIST_ATTR = ELEMENT__CHANGEABLE_LIST_ATTR;
	
	/**
	 * The feature id for the '<em><b>Unchangeable List Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_LIST_ATTR = ELEMENT__UNCHANGEABLE_LIST_ATTR;
	
	/**
	 * The feature id for the '<em><b>Changeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_SET_ATTR = ELEMENT__CHANGEABLE_SET_ATTR;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Set Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_SET_ATTR = ELEMENT__UNCHANGEABLE_SET_ATTR;
	
	/**
	 * The feature id for the '<em><b>Changeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_BAG_ATTR = ELEMENT__CHANGEABLE_BAG_ATTR;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Bag Attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_BAG_ATTR = ELEMENT__UNCHANGEABLE_BAG_ATTR;
	
	/**
	 * The feature id for the '<em><b>Changeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_REF = ELEMENT__CHANGEABLE_REF;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_REF = ELEMENT__UNCHANGEABLE_REF;
	
	/**
	 * The feature id for the '<em><b>Changeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_LIST_REF = ELEMENT__CHANGEABLE_LIST_REF;
	
	/**
	 * The feature id for the '<em><b>Unchangeable List Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_LIST_REF = ELEMENT__UNCHANGEABLE_LIST_REF;
	
	/**
	 * The feature id for the '<em><b>Changeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_SET_REF = ELEMENT__CHANGEABLE_SET_REF;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_SET_REF = ELEMENT__UNCHANGEABLE_SET_REF;
	
	/**
	 * The feature id for the '<em><b>Changeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_BAG_REF = ELEMENT__CHANGEABLE_BAG_REF;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Bag Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_BAG_REF = ELEMENT__UNCHANGEABLE_BAG_REF;
	
	/**
	 * The feature id for the '<em><b>Changeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT = ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Unique List Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT = ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT;
	
	/**
	 * The feature id for the '<em><b>Changeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_SET_CONT = ELEMENT__CHANGEABLE_SET_CONT;
	
	/**
	 * The feature id for the '<em><b>Changeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__CHANGEABLE_CONT = ELEMENT__CHANGEABLE_CONT;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_CONT = ELEMENT__UNCHANGEABLE_CONT;
	
	/**
	 * The feature id for the '<em><b>Unchangeable Set Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__UNCHANGEABLE_SET_CONT = ELEMENT__UNCHANGEABLE_SET_CONT;
	
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__ID = ELEMENT_FEATURE_COUNT + 0;
	
	/**
	 * The number of structural features of the '<em>Id Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;
	
	/**
	 * The number of operations of the '<em>Id Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;
	
	
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
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableAttr <em>Changeable Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableAttr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ChangeableAttr();
	
	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableAttr <em>Unchangeable Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unchangeable Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableAttr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_UnchangeableAttr();
	
	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableListAttr <em>Changeable List Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Changeable List Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableListAttr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ChangeableListAttr();
	
	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableListAttr <em>Unchangeable List Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unchangeable List Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableListAttr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_UnchangeableListAttr();
	
	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableSetAttr <em>Changeable Set Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Changeable Set Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableSetAttr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ChangeableSetAttr();
	
	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableSetAttr <em>Unchangeable Set Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unchangeable Set Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableSetAttr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_UnchangeableSetAttr();
	
	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableBagAttr <em>Changeable Bag Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Changeable Bag Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableBagAttr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ChangeableBagAttr();
	
	/**
	 * Returns the meta object for the attribute list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableBagAttr <em>Unchangeable Bag Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unchangeable Bag Attr</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableBagAttr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_UnchangeableBagAttr();
	
	/**
	 * Returns the meta object for the reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableRef <em>Changeable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changeable Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ChangeableRef();
	
	/**
	 * Returns the meta object for the reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableRef <em>Unchangeable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unchangeable Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_UnchangeableRef();
	
	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableListRef <em>Changeable List Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable List Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableListRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ChangeableListRef();
	
	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableListRef <em>Unchangeable List Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable List Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableListRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_UnchangeableListRef();
	
	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableSetRef <em>Changeable Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable Set Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableSetRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ChangeableSetRef();
	
	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableSetRef <em>Unchangeable Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Set Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableSetRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_UnchangeableSetRef();
	
	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableBagRef <em>Changeable Bag Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable Bag Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableBagRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ChangeableBagRef();
	
	/**
	 * Returns the meta object for the reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableBagRef <em>Unchangeable Bag Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Bag Ref</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableBagRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_UnchangeableBagRef();
	
	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableUniqueListCont <em>Changeable Unique List Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changeable Unique List Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableUniqueListCont()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ChangeableUniqueListCont();
	
	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableUniqueListCont <em>Unchangeable Unique List Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unchangeable Unique List Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableUniqueListCont()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_UnchangeableUniqueListCont();
	
	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableSetCont <em>Changeable Set Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changeable Set Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableSetCont()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ChangeableSetCont();
	
	/**
	 * Returns the meta object for the containment reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableCont <em>Changeable Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Changeable Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getChangeableCont()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ChangeableCont();
	
	/**
	 * Returns the meta object for the containment reference '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableCont <em>Unchangeable Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unchangeable Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableCont()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_UnchangeableCont();
	
	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableSetCont <em>Unchangeable Set Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unchangeable Set Cont</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getUnchangeableSetCont()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_UnchangeableSetCont();
	
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
		 * The meta object literal for the '<em><b>Changeable Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CHANGEABLE_ATTR = eINSTANCE.getElement_ChangeableAttr();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__UNCHANGEABLE_ATTR = eINSTANCE.getElement_UnchangeableAttr();
		
		/**
		 * The meta object literal for the '<em><b>Changeable List Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CHANGEABLE_LIST_ATTR = eINSTANCE.getElement_ChangeableListAttr();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable List Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__UNCHANGEABLE_LIST_ATTR = eINSTANCE.getElement_UnchangeableListAttr();
		
		/**
		 * The meta object literal for the '<em><b>Changeable Set Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CHANGEABLE_SET_ATTR = eINSTANCE.getElement_ChangeableSetAttr();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable Set Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__UNCHANGEABLE_SET_ATTR = eINSTANCE.getElement_UnchangeableSetAttr();
		
		/**
		 * The meta object literal for the '<em><b>Changeable Bag Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CHANGEABLE_BAG_ATTR = eINSTANCE.getElement_ChangeableBagAttr();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable Bag Attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__UNCHANGEABLE_BAG_ATTR = eINSTANCE.getElement_UnchangeableBagAttr();
		
		/**
		 * The meta object literal for the '<em><b>Changeable Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHANGEABLE_REF = eINSTANCE.getElement_ChangeableRef();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__UNCHANGEABLE_REF = eINSTANCE.getElement_UnchangeableRef();
		
		/**
		 * The meta object literal for the '<em><b>Changeable List Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHANGEABLE_LIST_REF = eINSTANCE.getElement_ChangeableListRef();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable List Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__UNCHANGEABLE_LIST_REF = eINSTANCE.getElement_UnchangeableListRef();
		
		/**
		 * The meta object literal for the '<em><b>Changeable Set Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHANGEABLE_SET_REF = eINSTANCE.getElement_ChangeableSetRef();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable Set Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__UNCHANGEABLE_SET_REF = eINSTANCE.getElement_UnchangeableSetRef();
		
		/**
		 * The meta object literal for the '<em><b>Changeable Bag Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHANGEABLE_BAG_REF = eINSTANCE.getElement_ChangeableBagRef();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable Bag Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__UNCHANGEABLE_BAG_REF = eINSTANCE.getElement_UnchangeableBagRef();
		
		/**
		 * The meta object literal for the '<em><b>Changeable Unique List Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT = eINSTANCE.getElement_ChangeableUniqueListCont();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable Unique List Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT = eINSTANCE.getElement_UnchangeableUniqueListCont();
		
		/**
		 * The meta object literal for the '<em><b>Changeable Set Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHANGEABLE_SET_CONT = eINSTANCE.getElement_ChangeableSetCont();
		
		/**
		 * The meta object literal for the '<em><b>Changeable Cont</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHANGEABLE_CONT = eINSTANCE.getElement_ChangeableCont();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable Cont</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__UNCHANGEABLE_CONT = eINSTANCE.getElement_UnchangeableCont();
		
		/**
		 * The meta object literal for the '<em><b>Unchangeable Set Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__UNCHANGEABLE_SET_CONT = eINSTANCE.getElement_UnchangeableSetCont();
		
	}
	
} //XtextSiriusTestPackage
