/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleValueDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DiagramxtextFactoryImpl extends EFactoryImpl implements DiagramxtextFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static DiagramxtextFactory init() {
		try {
			final DiagramxtextFactory theDiagramxtextFactory = (DiagramxtextFactory) EPackage.Registry.INSTANCE
					.getEFactory(DiagramxtextPackage.eNS_URI);
			if (theDiagramxtextFactory != null) {
				return theDiagramxtextFactory;
			}
		} catch (final Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagramxtextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DiagramxtextFactoryImpl() {
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
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION:
				return createXtextDirectEditModelDescription();
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION:
				return createXtextDirectEditValueDescription();
			case DiagramxtextPackage.XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION:
				return createXtextBeginLabelStyleModelDescription();
			case DiagramxtextPackage.XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION:
				return createXtextBeginLabelStyleValueDescription();
			case DiagramxtextPackage.XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION:
				return createXtextCenterLabelStyleModelDescription();
			case DiagramxtextPackage.XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION:
				return createXtextCenterLabelStyleValueDescription();
			case DiagramxtextPackage.XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION:
				return createXtextEndLabelStyleModelDescription();
			case DiagramxtextPackage.XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION:
				return createXtextEndLabelStyleValueDescription();
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
	public XtextDirectEditModelDescription createXtextDirectEditModelDescription() {
		final XtextDirectEditModelDescriptionImpl xtextDirectEditModelDescription = new XtextDirectEditModelDescriptionImpl();
		return xtextDirectEditModelDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextDirectEditValueDescription createXtextDirectEditValueDescription() {
		final XtextDirectEditValueDescriptionImpl xtextDirectEditValueDescription = new XtextDirectEditValueDescriptionImpl();
		return xtextDirectEditValueDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextBeginLabelStyleModelDescription createXtextBeginLabelStyleModelDescription() {
		final XtextBeginLabelStyleModelDescriptionImpl xtextBeginLabelStyleModelDescription = new XtextBeginLabelStyleModelDescriptionImpl();
		return xtextBeginLabelStyleModelDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextBeginLabelStyleValueDescription createXtextBeginLabelStyleValueDescription() {
		final XtextBeginLabelStyleValueDescriptionImpl xtextBeginLabelStyleValueDescription = new XtextBeginLabelStyleValueDescriptionImpl();
		return xtextBeginLabelStyleValueDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextCenterLabelStyleModelDescription createXtextCenterLabelStyleModelDescription() {
		final XtextCenterLabelStyleModelDescriptionImpl xtextCenterLabelStyleModelDescription = new XtextCenterLabelStyleModelDescriptionImpl();
		return xtextCenterLabelStyleModelDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextCenterLabelStyleValueDescription createXtextCenterLabelStyleValueDescription() {
		final XtextCenterLabelStyleValueDescriptionImpl xtextCenterLabelStyleValueDescription = new XtextCenterLabelStyleValueDescriptionImpl();
		return xtextCenterLabelStyleValueDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextEndLabelStyleModelDescription createXtextEndLabelStyleModelDescription() {
		final XtextEndLabelStyleModelDescriptionImpl xtextEndLabelStyleModelDescription = new XtextEndLabelStyleModelDescriptionImpl();
		return xtextEndLabelStyleModelDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextEndLabelStyleValueDescription createXtextEndLabelStyleValueDescription() {
		final XtextEndLabelStyleValueDescriptionImpl xtextEndLabelStyleValueDescription = new XtextEndLabelStyleValueDescriptionImpl();
		return xtextEndLabelStyleValueDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public DiagramxtextPackage getDiagramxtextPackage() {
		return (DiagramxtextPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagramxtextPackage getPackage() {
		return DiagramxtextPackage.eINSTANCE;
	}

} // DiagramxtextFactoryImpl
