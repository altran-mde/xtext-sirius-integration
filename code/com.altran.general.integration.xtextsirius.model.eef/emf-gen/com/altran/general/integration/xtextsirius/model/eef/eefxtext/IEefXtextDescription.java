/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext;

import org.eclipse.eef.EEFTextDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IEef
 * Xtext Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription#isMultiLine
 * <em>Multi Line</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription#isCancelOnValidationError
 * <em>Cancel On Validation Error</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextDescription()
 * @model abstract="true"
 * @generated
 */
public interface IEefXtextDescription extends EEFTextDescription {
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
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextDescription_InjectorId()
	 * @model unique="false"
	 * @generated
	 */
	String getInjectorId();
	
	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription#getInjectorId
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
	 * Returns the value of the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Line</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Multi Line</em>' attribute.
	 * @see #setMultiLine(boolean)
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextDescription_MultiLine()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMultiLine();
	
	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription#isMultiLine
	 * <em>Multi Line</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Multi Line</em>' attribute.
	 * @see #isMultiLine()
	 * @generated
	 */
	void setMultiLine(boolean value);
	
	/**
	 * Returns the value of the '<em><b>Cancel On Validation Error</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cancel On Validation Error</em>' attribute.
	 * @see #setCancelOnValidationError(boolean)
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextDescription_CancelOnValidationError()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCancelOnValidationError();
	
	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription#isCancelOnValidationError
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
	
} // IEefXtextDescription
