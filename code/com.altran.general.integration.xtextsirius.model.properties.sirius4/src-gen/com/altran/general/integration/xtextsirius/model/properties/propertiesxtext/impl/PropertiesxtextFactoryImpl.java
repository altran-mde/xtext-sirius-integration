/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.*;

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
public class PropertiesxtextFactoryImpl extends EFactoryImpl implements PropertiesxtextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertiesxtextFactory init() {
		try {
			PropertiesxtextFactory thePropertiesxtextFactory = (PropertiesxtextFactory) EPackage.Registry.INSTANCE
					.getEFactory(PropertiesxtextPackage.eNS_URI);
			if (thePropertiesxtextFactory != null) {
				return thePropertiesxtextFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PropertiesxtextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesxtextFactoryImpl() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XtextSingleLineModelDescription createXtextSingleLineModelDescription() {
		XtextSingleLineModelDescriptionImpl xtextSingleLineModelDescription = new XtextSingleLineModelDescriptionImpl();
		return xtextSingleLineModelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XtextMultiLineModelDescription createXtextMultiLineModelDescription() {
		XtextMultiLineModelDescriptionImpl xtextMultiLineModelDescription = new XtextMultiLineModelDescriptionImpl();
		return xtextMultiLineModelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XtextSingleLineValueDescription createXtextSingleLineValueDescription() {
		XtextSingleLineValueDescriptionImpl xtextSingleLineValueDescription = new XtextSingleLineValueDescriptionImpl();
		return xtextSingleLineValueDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XtextMultiLineValueDescription createXtextMultiLineValueDescription() {
		XtextMultiLineValueDescriptionImpl xtextMultiLineValueDescription = new XtextMultiLineValueDescriptionImpl();
		return xtextMultiLineValueDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesxtextPackage getPropertiesxtextPackage() {
		return (PropertiesxtextPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PropertiesxtextPackage getPackage() {
		return PropertiesxtextPackage.eINSTANCE;
	}

} //PropertiesxtextFactoryImpl
