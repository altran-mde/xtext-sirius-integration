/**
 */
package com.altran.general.integration.xtextsirius.model.xtext.xtextsirius;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>IXtext Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription#getInjectorId
 * <em>Injector Id</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage#getIXtextDescription()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IXtextDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injector Id</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Injector Id</em>' attribute.
	 * @see #setInjectorId(String)
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage#getIXtextDescription_InjectorId()
	 * @model unique="false"
	 * @generated
	 */
	String getInjectorId();

	/**
	 * Sets the value of the '
	 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription#getInjectorId
	 * <em>Injector Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Injector Id</em>' attribute.
	 * @see #getInjectorId()
	 * @generated
	 */
	void setInjectorId(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	boolean isMultiLine();

} // IXtextDescription
