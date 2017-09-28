/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextDescription;
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
			case EefxtextPackage.EEF_XTEXT_DESCRIPTION:
				return createEefXtextDescription();
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
	public EefXtextDescription createEefXtextDescription() {
		final EefXtextDescriptionImpl eefXtextDescription = new EefXtextDescriptionImpl();
		return eefXtextDescription;
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
