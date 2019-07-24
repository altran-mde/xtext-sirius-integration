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


/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IXtext
 * Direct Edit Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription#isMultiLine
 * <em>Multi Line</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage#getIXtextDirectEditDescription()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IXtextDirectEditDescription extends IXtextDescription {
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
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage#getIXtextDirectEditDescription_MultiLine()
	 * @model unique="false"
	 * @generated
	 */
	@Override
	boolean isMultiLine();
	
	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription#isMultiLine
	 * <em>Multi Line</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Multi Line</em>' attribute.
	 * @see #isMultiLine()
	 * @generated
	 */
	void setMultiLine(boolean value);
	
} // IXtextDirectEditDescription
