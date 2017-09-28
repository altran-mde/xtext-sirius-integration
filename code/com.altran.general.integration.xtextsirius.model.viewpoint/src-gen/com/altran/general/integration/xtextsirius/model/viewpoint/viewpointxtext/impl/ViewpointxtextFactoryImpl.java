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
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ViewpointxtextFactoryImpl extends EFactoryImpl implements ViewpointxtextFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ViewpointxtextFactory init() {
		try {
			final ViewpointxtextFactory theViewpointxtextFactory = (ViewpointxtextFactory) EPackage.Registry.INSTANCE
					.getEFactory(ViewpointxtextPackage.eNS_URI);
			if (theViewpointxtextFactory != null) {
				return theViewpointxtextFactory;
			}
		} catch (final Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewpointxtextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ViewpointxtextFactoryImpl() {
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
			case ViewpointxtextPackage.XTEXT_FEATURE_EXTENSION_DESCRIPTION:
				return createXtextFeatureExtensionDescription();
			case ViewpointxtextPackage.XTEXT_DFEATURE_EXTENSION:
				return createXtextDFeatureExtension();
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION:
				return createXtextRepresentationExtension();
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
	public XtextFeatureExtensionDescription createXtextFeatureExtensionDescription() {
		final XtextFeatureExtensionDescriptionImpl xtextFeatureExtensionDescription = new XtextFeatureExtensionDescriptionImpl();
		return xtextFeatureExtensionDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextDFeatureExtension createXtextDFeatureExtension() {
		final XtextDFeatureExtensionImpl xtextDFeatureExtension = new XtextDFeatureExtensionImpl();
		return xtextDFeatureExtension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XtextRepresentationExtension createXtextRepresentationExtension() {
		final XtextRepresentationExtensionImpl xtextRepresentationExtension = new XtextRepresentationExtensionImpl();
		return xtextRepresentationExtension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ViewpointxtextPackage getViewpointxtextPackage() {
		return (ViewpointxtextPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewpointxtextPackage getPackage() {
		return ViewpointxtextPackage.eINSTANCE;
	}

} // ViewpointxtextFactoryImpl
