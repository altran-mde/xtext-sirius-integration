/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextFactory;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class PropertiesxtextFactoryImpl extends EFactoryImpl implements PropertiesxtextFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static PropertiesxtextFactory init() {
		try {
			final PropertiesxtextFactory thePropertiesxtextFactory = (PropertiesxtextFactory) EPackage.Registry.INSTANCE
					.getEFactory(PropertiesxtextPackage.eNS_URI);
			if (thePropertiesxtextFactory != null) {
				return thePropertiesxtextFactory;
			}
		} catch (final Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PropertiesxtextFactoryImpl();
	}
	
	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertiesxtextFactoryImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(final EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION:
				return createXtextSingleLineModelDescription();
			case PropertiesxtextPackage.XTEXT_MULTI_LINE_MODEL_DESCRIPTION:
				return createXtextMultiLineModelDescription();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION:
				return createXtextSingleLineValueDescription();
			case PropertiesxtextPackage.XTEXT_MULTI_LINE_VALUE_DESCRIPTION:
				return createXtextMultiLineValueDescription();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextSingleLineModelDescription createXtextSingleLineModelDescription() {
		final XtextSingleLineModelDescriptionImpl xtextSingleLineModelDescription = new XtextSingleLineModelDescriptionImpl();
		return xtextSingleLineModelDescription;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextMultiLineModelDescription createXtextMultiLineModelDescription() {
		final XtextMultiLineModelDescriptionImpl xtextMultiLineModelDescription = new XtextMultiLineModelDescriptionImpl();
		return xtextMultiLineModelDescription;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextSingleLineValueDescription createXtextSingleLineValueDescription() {
		final XtextSingleLineValueDescriptionImpl xtextSingleLineValueDescription = new XtextSingleLineValueDescriptionImpl();
		return xtextSingleLineValueDescription;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextMultiLineValueDescription createXtextMultiLineValueDescription() {
		final XtextMultiLineValueDescriptionImpl xtextMultiLineValueDescription = new XtextMultiLineValueDescriptionImpl();
		return xtextMultiLineValueDescription;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PropertiesxtextPackage getPropertiesxtextPackage() {
		return (PropertiesxtextPackage) getEPackage();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PropertiesxtextPackage getPackage() {
		return PropertiesxtextPackage.eINSTANCE;
	}
	
} // PropertiesxtextFactoryImpl
