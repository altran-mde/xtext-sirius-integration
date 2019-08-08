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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IContained Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement#getAttrA <em>Attr A</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIContainedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IContainedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Attr A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr A</em>' attribute.
	 * @see #setAttrA(String)
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getIContainedElement_AttrA()
	 * @model
	 * @generated
	 */
	String getAttrA();

	/**
	 * Sets the value of the '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement#getAttrA <em>Attr A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr A</em>' attribute.
	 * @see #getAttrA()
	 * @generated
	 */
	void setAttrA(String value);

} // IContainedElement
