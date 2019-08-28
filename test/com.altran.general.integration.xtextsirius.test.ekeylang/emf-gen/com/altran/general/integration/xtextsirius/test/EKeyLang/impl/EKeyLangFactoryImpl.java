/**
 */
package com.altran.general.integration.xtextsirius.test.EKeyLang.impl;

import com.altran.general.integration.xtextsirius.test.EKeyLang.*;

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
public class EKeyLangFactoryImpl extends EFactoryImpl implements EKeyLangFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EKeyLangFactory init() {
		try {
			EKeyLangFactory theEKeyLangFactory = (EKeyLangFactory) EPackage.Registry.INSTANCE
					.getEFactory(EKeyLangPackage.eNS_URI);
			if (theEKeyLangFactory != null) {
				return theEKeyLangFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EKeyLangFactoryImpl();
	}
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EKeyLangFactoryImpl() {
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
			case EKeyLangPackage.CONTAINER:
				return createContainer();
			case EKeyLangPackage.GROUP:
				return createGroup();
			case EKeyLangPackage.LEAF:
				return createLeaf();
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
	public com.altran.general.integration.xtextsirius.test.EKeyLang.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Leaf createLeaf() {
		LeafImpl leaf = new LeafImpl();
		return leaf;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EKeyLangPackage getEKeyLangPackage() {
		return (EKeyLangPackage) getEPackage();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EKeyLangPackage getPackage() {
		return EKeyLangPackage.eINSTANCE;
	}
	
} //EKeyLangFactoryImpl
