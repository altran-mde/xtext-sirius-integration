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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIdElement()
 * @model
 * @generated
 */
public interface IdElement extends AElement<IdElement> {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIdElement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();
	
	/**
	 * Sets the value of the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);
	
} // IdElement
