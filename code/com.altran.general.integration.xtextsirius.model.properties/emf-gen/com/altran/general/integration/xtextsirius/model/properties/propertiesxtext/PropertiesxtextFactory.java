/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage
 * @generated
 */
public interface PropertiesxtextFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	PropertiesxtextFactory eINSTANCE = com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextFactoryImpl
			.init();
	
	/**
	 * Returns a new object of class '<em>Xtext Single Line Model
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Xtext Single Line Model
	 *         Description</em>'.
	 * @generated
	 */
	XtextSingleLineModelDescription createXtextSingleLineModelDescription();
	
	/**
	 * Returns a new object of class '<em>Xtext Multi Line Model
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Xtext Multi Line Model
	 *         Description</em>'.
	 * @generated
	 */
	XtextMultiLineModelDescription createXtextMultiLineModelDescription();
	
	/**
	 * Returns a new object of class '<em>Xtext Single Line Value
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Xtext Single Line Value
	 *         Description</em>'.
	 * @generated
	 */
	XtextSingleLineValueDescription createXtextSingleLineValueDescription();
	
	/**
	 * Returns a new object of class '<em>Xtext Multi Line Value
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Xtext Multi Line Value
	 *         Description</em>'.
	 * @generated
	 */
	XtextMultiLineValueDescription createXtextMultiLineValueDescription();
	
	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	PropertiesxtextPackage getPropertiesxtextPackage();
	
} // PropertiesxtextFactory
