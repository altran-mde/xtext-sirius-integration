/**
 */
package com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.*;

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
public class XtextsiriusFactoryImpl extends EFactoryImpl implements XtextsiriusFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XtextsiriusFactory init() {
		try {
			XtextsiriusFactory theXtextsiriusFactory = (XtextsiriusFactory) EPackage.Registry.INSTANCE
					.getEFactory(XtextsiriusPackage.eNS_URI);
			if (theXtextsiriusFactory != null) {
				return theXtextsiriusFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XtextsiriusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtextsiriusFactoryImpl() {
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
	public XtextsiriusPackage getXtextsiriusPackage() {
		return (XtextsiriusPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XtextsiriusPackage getPackage() {
		return XtextsiriusPackage.eINSTANCE;
	}

} //XtextsiriusFactoryImpl
