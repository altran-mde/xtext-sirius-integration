/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.*;

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
public class DiagramxtextFactoryImpl extends EFactoryImpl implements DiagramxtextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramxtextFactory init() {
		try {
			DiagramxtextFactory theDiagramxtextFactory = (DiagramxtextFactory) EPackage.Registry.INSTANCE
					.getEFactory(DiagramxtextPackage.eNS_URI);
			if (theDiagramxtextFactory != null) {
				return theDiagramxtextFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagramxtextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramxtextFactoryImpl() {
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
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION:
			return createXtextDirectEditModelDescription();
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION:
			return createXtextDirectEditValueDescription();
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
	public XtextDirectEditModelDescription createXtextDirectEditModelDescription() {
		XtextDirectEditModelDescriptionImpl xtextDirectEditModelDescription = new XtextDirectEditModelDescriptionImpl();
		return xtextDirectEditModelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XtextDirectEditValueDescription createXtextDirectEditValueDescription() {
		XtextDirectEditValueDescriptionImpl xtextDirectEditValueDescription = new XtextDirectEditValueDescriptionImpl();
		return xtextDirectEditValueDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramxtextPackage getDiagramxtextPackage() {
		return (DiagramxtextPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagramxtextPackage getPackage() {
		return DiagramxtextPackage.eINSTANCE;
	}

} //DiagramxtextFactoryImpl
