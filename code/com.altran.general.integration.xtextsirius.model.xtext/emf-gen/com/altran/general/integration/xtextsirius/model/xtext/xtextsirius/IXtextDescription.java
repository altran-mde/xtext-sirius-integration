/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.xtext.xtextsirius;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IXtext
 * Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription#isCancelOnValidationError
 * <em>Cancel On Validation Error</em>}</li>
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
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription#getInjectorId
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
	
	/**
	 * Returns the value of the '<em><b>Cancel On Validation Error</b></em>'
	 * attribute. The default value is <code>"false"</code>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cancel On Validation Error</em>' attribute.
	 * @see #setCancelOnValidationError(boolean)
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage#getIXtextDescription_CancelOnValidationError()
	 * @model default="false"
	 * @generated
	 */
	boolean isCancelOnValidationError();
	
	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription#isCancelOnValidationError
	 * <em>Cancel On Validation Error</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Cancel On Validation Error</em>'
	 *            attribute.
	 * @see #isCancelOnValidationError()
	 * @generated
	 */
	void setCancelOnValidationError(boolean value);
	
} // IXtextDescription
