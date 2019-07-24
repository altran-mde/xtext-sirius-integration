/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineValueDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextFactory;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EefxtextFactoryImpl extends EFactoryImpl implements EefxtextFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static EefxtextFactory init() {
		try {
			final EefxtextFactory theEefxtextFactory = (EefxtextFactory) EPackage.Registry.INSTANCE
					.getEFactory(EefxtextPackage.eNS_URI);
			if (theEefxtextFactory != null) {
				return theEefxtextFactory;
			}
		} catch (final Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EefxtextFactoryImpl();
	}
	
	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public EefxtextFactoryImpl() {
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
			case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_MODEL_DESCRIPTION:
				return createEefXtextSingleLineModelDescription();
			case EefxtextPackage.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION:
				return createEefXtextMultiLineModelDescription();
			case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION:
				return createEefXtextSingleLineValueDescription();
			case EefxtextPackage.EEF_XTEXT_MULTI_LINE_VALUE_DESCRIPTION:
				return createEefXtextMultiLineValueDescription();
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
	public EefXtextSingleLineModelDescription createEefXtextSingleLineModelDescription() {
		final EefXtextSingleLineModelDescriptionImpl eefXtextSingleLineModelDescription = new EefXtextSingleLineModelDescriptionImpl();
		return eefXtextSingleLineModelDescription;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EefXtextMultiLineModelDescription createEefXtextMultiLineModelDescription() {
		final EefXtextMultiLineModelDescriptionImpl eefXtextMultiLineModelDescription = new EefXtextMultiLineModelDescriptionImpl();
		return eefXtextMultiLineModelDescription;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EefXtextSingleLineValueDescription createEefXtextSingleLineValueDescription() {
		final EefXtextSingleLineValueDescriptionImpl eefXtextSingleLineValueDescription = new EefXtextSingleLineValueDescriptionImpl();
		return eefXtextSingleLineValueDescription;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EefXtextMultiLineValueDescription createEefXtextMultiLineValueDescription() {
		final EefXtextMultiLineValueDescriptionImpl eefXtextMultiLineValueDescription = new EefXtextMultiLineValueDescriptionImpl();
		return eefXtextMultiLineValueDescription;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EefxtextPackage getEefxtextPackage() {
		return (EefxtextPackage) getEPackage();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EefxtextPackage getPackage() {
		return EefxtextPackage.eINSTANCE;
	}
	
} // EefxtextFactoryImpl
