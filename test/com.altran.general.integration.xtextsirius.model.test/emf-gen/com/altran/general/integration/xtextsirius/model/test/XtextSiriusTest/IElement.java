/**
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IElement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableAttr <em>Changeable Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableAttr <em>Unchangeable Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableListAttr <em>Changeable List Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableListAttr <em>Unchangeable List Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableSetAttr <em>Changeable Set Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableSetAttr <em>Unchangeable Set Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableBagAttr <em>Changeable Bag Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getUnchangeableBagAttr <em>Unchangeable Bag Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getContainedSingle <em>Contained Single</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getContainedMulti <em>Contained Multi</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IElement<T extends IElement<?>> extends EObject {
	/**
	 * Returns the value of the '<em><b>Changeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable Attr</em>' attribute.
	 * @see #setChangeableAttr(String)
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_ChangeableAttr()
	 * @model
	 * @generated
	 */
	String getChangeableAttr();

	/**
	 * Sets the value of the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getChangeableAttr <em>Changeable Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable Attr</em>' attribute.
	 * @see #getChangeableAttr()
	 * @generated
	 */
	void setChangeableAttr(String value);

	/**
	 * Returns the value of the '<em><b>Unchangeable Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unchangeable Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchangeable Attr</em>' attribute.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_UnchangeableAttr()
	 * @model changeable="false"
	 * @generated
	 */
	int getUnchangeableAttr();

	/**
	 * Returns the value of the '<em><b>Changeable List Attr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable List Attr</em>' attribute list.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_ChangeableListAttr()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getChangeableListAttr();

	/**
	 * Returns the value of the '<em><b>Unchangeable List Attr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unchangeable List Attr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchangeable List Attr</em>' attribute list.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_UnchangeableListAttr()
	 * @model unique="false" changeable="false"
	 * @generated
	 */
	EList<Boolean> getUnchangeableListAttr();

	/**
	 * Returns the value of the '<em><b>Changeable Set Attr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable Set Attr</em>' attribute list.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_ChangeableSetAttr()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Integer> getChangeableSetAttr();

	/**
	 * Returns the value of the '<em><b>Unchangeable Set Attr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unchangeable Set Attr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchangeable Set Attr</em>' attribute list.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_UnchangeableSetAttr()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<Integer> getUnchangeableSetAttr();

	/**
	 * Returns the value of the '<em><b>Changeable Bag Attr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable Bag Attr</em>' attribute list.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_ChangeableBagAttr()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<Double> getChangeableBagAttr();

	/**
	 * Returns the value of the '<em><b>Unchangeable Bag Attr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unchangeable Bag Attr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchangeable Bag Attr</em>' attribute list.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_UnchangeableBagAttr()
	 * @model unique="false" changeable="false" ordered="false"
	 * @generated
	 */
	EList<Double> getUnchangeableBagAttr();

	/**
	 * Returns the value of the '<em><b>Contained Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Single</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Single</em>' containment reference.
	 * @see #setContainedSingle(IContainedElement)
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_ContainedSingle()
	 * @model containment="true"
	 * @generated
	 */
	IContainedElement getContainedSingle();

	/**
	 * Sets the value of the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement#getContainedSingle <em>Contained Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Single</em>' containment reference.
	 * @see #getContainedSingle()
	 * @generated
	 */
	void setContainedSingle(IContainedElement value);

	/**
	 * Returns the value of the '<em><b>Contained Multi</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Multi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Multi</em>' containment reference list.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIElement_ContainedMulti()
	 * @model containment="true"
	 * @generated
	 */
	EList<IContainedElement> getContainedMulti();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	T getChangeableRef();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setChangeableRef(T ref);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<T> getChangeableListRef();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<T> getChangeableSetRef();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 * @generated
	 */
	EList<T> getChangeableBagRef();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	T getChangeableCont();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setChangeableCont(T ref);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<T> getChangeableUniqueListCont();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<T> getChangeableSetCont();

} // IElement
