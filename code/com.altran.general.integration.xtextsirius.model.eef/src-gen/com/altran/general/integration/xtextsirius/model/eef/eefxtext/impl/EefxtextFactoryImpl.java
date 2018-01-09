/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefxtextFactoryImpl extends EFactoryImpl implements EefxtextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EefxtextFactory init() {
		try {
			EefxtextFactory theEefxtextFactory = (EefxtextFactory) EPackage.Registry.INSTANCE
					.getEFactory(EefxtextPackage.eNS_URI);
			if (theEefxtextFactory != null) {
				return theEefxtextFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EefxtextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefxtextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EefXtextSingleLineModelDescription createEefXtextSingleLineModelDescription() {
		EefXtextSingleLineModelDescriptionImpl eefXtextSingleLineModelDescription = new EefXtextSingleLineModelDescriptionImpl();
		return eefXtextSingleLineModelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EefXtextMultiLineModelDescription createEefXtextMultiLineModelDescription() {
		EefXtextMultiLineModelDescriptionImpl eefXtextMultiLineModelDescription = new EefXtextMultiLineModelDescriptionImpl();
		return eefXtextMultiLineModelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EefXtextSingleLineValueDescription createEefXtextSingleLineValueDescription() {
		EefXtextSingleLineValueDescriptionImpl eefXtextSingleLineValueDescription = new EefXtextSingleLineValueDescriptionImpl();
		return eefXtextSingleLineValueDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EefXtextMultiLineValueDescription createEefXtextMultiLineValueDescription() {
		EefXtextMultiLineValueDescriptionImpl eefXtextMultiLineValueDescription = new EefXtextMultiLineValueDescriptionImpl();
		return eefXtextMultiLineValueDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EefxtextPackage getEefxtextPackage() {
		return (EefxtextPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EefxtextPackage getPackage() {
		return EefxtextPackage.eINSTANCE;
	}

} //EefxtextFactoryImpl
