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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IEef
 * Xtext Model Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription#getEditableFeatures
 * <em>Editable Features</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription#getIgnoredNestedFeatures
 * <em>Ignored Nested Features</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription#getPrefixTerminalsExpression
 * <em>Prefix Terminals Expression</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription#getSuffixTerminalsExpression
 * <em>Suffix Terminals Expression</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextModelDescription()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IEefXtextModelDescription extends IEefXtextDescription {
	/**
	 * Returns the value of the '<em><b>Editable Features</b></em>' attribute
	 * list. The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable Features</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Editable Features</em>' attribute list.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextModelDescription_EditableFeatures()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getEditableFeatures();

	/**
	 * Returns the value of the '<em><b>Ignored Nested Features</b></em>'
	 * attribute list. The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignored Nested Features</em>' attribute list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ignored Nested Features</em>' attribute
	 *         list.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextModelDescription_IgnoredNestedFeatures()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIgnoredNestedFeatures();

	/**
	 * Returns the value of the '<em><b>Prefix Terminals Expression</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Terminals Expression</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Prefix Terminals Expression</em>'
	 *         attribute.
	 * @see #setPrefixTerminalsExpression(String)
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextModelDescription_PrefixTerminalsExpression()
	 * @model unique="false"
	 * @generated
	 */
	String getPrefixTerminalsExpression();

	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription#getPrefixTerminalsExpression
	 * <em>Prefix Terminals Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Prefix Terminals Expression</em>'
	 *            attribute.
	 * @see #getPrefixTerminalsExpression()
	 * @generated
	 */
	void setPrefixTerminalsExpression(String value);

	/**
	 * Returns the value of the '<em><b>Suffix Terminals Expression</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix Terminals Expression</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Suffix Terminals Expression</em>'
	 *         attribute.
	 * @see #setSuffixTerminalsExpression(String)
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextModelDescription_SuffixTerminalsExpression()
	 * @model unique="false"
	 * @generated
	 */
	String getSuffixTerminalsExpression();

	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription#getSuffixTerminalsExpression
	 * <em>Suffix Terminals Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Suffix Terminals Expression</em>'
	 *            attribute.
	 * @see #getSuffixTerminalsExpression()
	 * @generated
	 */
	void setSuffixTerminalsExpression(String value);

} // IEefXtextModelDescription
