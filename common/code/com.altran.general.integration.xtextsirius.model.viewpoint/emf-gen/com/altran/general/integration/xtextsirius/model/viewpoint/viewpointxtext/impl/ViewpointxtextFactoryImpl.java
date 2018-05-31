/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextFactory;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditValueDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ViewpointxtextFactoryImpl extends EFactoryImpl implements ViewpointxtextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static ViewpointxtextFactory init() {
		try {
			ViewpointxtextFactory theViewpointxtextFactory = (ViewpointxtextFactory) EPackage.Registry.INSTANCE
					.getEFactory(ViewpointxtextPackage.eNS_URI);
			if (theViewpointxtextFactory != null) {
				return theViewpointxtextFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewpointxtextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ViewpointxtextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION:
			return createXtextEdgeLabelDirectEditModelDescription();
		case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION:
			return createXtextEdgeLabelDirectEditValueDescription();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XtextEdgeLabelDirectEditModelDescription createXtextEdgeLabelDirectEditModelDescription() {
		XtextEdgeLabelDirectEditModelDescriptionImpl xtextEdgeLabelDirectEditModelDescription = new XtextEdgeLabelDirectEditModelDescriptionImpl();
		return xtextEdgeLabelDirectEditModelDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XtextEdgeLabelDirectEditValueDescription createXtextEdgeLabelDirectEditValueDescription() {
		XtextEdgeLabelDirectEditValueDescriptionImpl xtextEdgeLabelDirectEditValueDescription = new XtextEdgeLabelDirectEditValueDescriptionImpl();
		return xtextEdgeLabelDirectEditValueDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewpointxtextPackage getViewpointxtextPackage() {
		return (ViewpointxtextPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewpointxtextPackage getPackage() {
		return ViewpointxtextPackage.eINSTANCE;
	}

} // ViewpointxtextFactoryImpl
