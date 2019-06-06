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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getDerivedAttr <em>Derived Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element#getDerivedRef <em>Derived Ref</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends AElement<Element> {

	/**
	 * Returns the value of the '<em><b>Derived Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Attr</em>' attribute.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getElement_DerivedAttr()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDerivedAttr();

	/**
	 * Returns the value of the '<em><b>Derived Ref</b></em>' reference list.
	 * The list contents are of type {@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement}<code>&lt;?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Ref</em>' reference list.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#getElement_DerivedRef()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<IElement<?>> getDerivedRef();
} // Element
