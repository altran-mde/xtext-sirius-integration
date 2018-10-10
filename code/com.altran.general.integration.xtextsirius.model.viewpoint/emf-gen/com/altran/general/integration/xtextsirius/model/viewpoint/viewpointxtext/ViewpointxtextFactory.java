/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage
 * @generated
 */
public interface ViewpointxtextFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ViewpointxtextFactory eINSTANCE = com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Xtext Edge Label Direct Edit Model
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Xtext Edge Label Direct Edit Model
	 *         Description</em>'.
	 * @generated
	 */
	XtextEdgeLabelDirectEditModelDescription createXtextEdgeLabelDirectEditModelDescription();

	/**
	 * Returns a new object of class '<em>Xtext Edge Label Direct Edit Value
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Xtext Edge Label Direct Edit Value
	 *         Description</em>'.
	 * @generated
	 */
	XtextEdgeLabelDirectEditValueDescription createXtextEdgeLabelDirectEditValueDescription();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewpointxtextPackage getViewpointxtextPackage();

} // ViewpointxtextFactory
