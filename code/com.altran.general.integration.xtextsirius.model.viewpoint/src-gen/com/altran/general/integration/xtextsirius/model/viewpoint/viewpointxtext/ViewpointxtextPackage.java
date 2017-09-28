/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextFactory
 * @model kind="package" annotation="http://www.eclipse.org/emf/2002/GenModel
 *        modelName='Viewpoint-xtext'
 *        modelPluginID='com.altran.general.integration.xtextsirius.model.viewpoint'
 *        complianceLevel='6.0' runtimeVersion='2.3' nonNLSMarkers='false'
 *        copyrightFields='false' creationIcons='false'
 *        modelDirectory='/com.altran.general.integration.xtextsirius.model.viewpoint/src-gen'
 *        editDirectory='/com.altran.general.integration.xtextsirius.model.viewpoint.edit/src-gen'
 *        editPluginID='com.altran.general.integration.xtextsirius.mode.viewpoint.edit'
 *        codeFormatting='true' importOrganizing='true' cleanup='true'
 *        styleProviders='true' disposableProviderFactory='true'
 *        extensibleProviderFactory='true' childCreationExtenders='true'
 *        basePackage='com.altran.general.integration.xtextsirius.model.viewpoint'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore
 *        Ecore='http://www.eclipse.org/emf/2002/Ecore'
 *        GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface ViewpointxtextPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "viewpointxtext";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://altran.com/general/integration/xtextsirius/model/viewpoint/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "viewpoint-xtext";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ViewpointxtextPackage eINSTANCE = com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl
			.init();

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextFeatureExtensionDescriptionImpl
	 * <em>Xtext Feature Extension Description</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextFeatureExtensionDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextFeatureExtensionDescription()
	 * @generated
	 */
	int XTEXT_FEATURE_EXTENSION_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_FEATURE_EXTENSION_DESCRIPTION__LABEL = DescriptionPackage.FEATURE_EXTENSION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xtext Feature Extension
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_FEATURE_EXTENSION_DESCRIPTION_FEATURE_COUNT = DescriptionPackage.FEATURE_EXTENSION_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextDFeatureExtensionImpl
	 * <em>Xtext DFeature Extension</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextDFeatureExtensionImpl
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextDFeatureExtension()
	 * @generated
	 */
	int XTEXT_DFEATURE_EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DFEATURE_EXTENSION__DESCRIPTION = ViewpointPackage.DFEATURE_EXTENSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dumdidum</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DFEATURE_EXTENSION__DUMDIDUM = ViewpointPackage.DFEATURE_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xtext DFeature
	 * Extension</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DFEATURE_EXTENSION_FEATURE_COUNT = ViewpointPackage.DFEATURE_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextRepresentationExtensionImpl
	 * <em>Xtext Representation Extension</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextRepresentationExtensionImpl
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextRepresentationExtension()
	 * @generated
	 */
	int XTEXT_REPRESENTATION_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_REPRESENTATION_EXTENSION__NAME = DescriptionPackage.REPRESENTATION_EXTENSION_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Viewpoint URI</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_REPRESENTATION_EXTENSION__VIEWPOINT_URI = DescriptionPackage.REPRESENTATION_EXTENSION_DESCRIPTION__VIEWPOINT_URI;

	/**
	 * The feature id for the '<em><b>Representation Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_REPRESENTATION_EXTENSION__REPRESENTATION_NAME = DescriptionPackage.REPRESENTATION_EXTENSION_DESCRIPTION__REPRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_REPRESENTATION_EXTENSION__METAMODEL = DescriptionPackage.REPRESENTATION_EXTENSION_DESCRIPTION__METAMODEL;

	/**
	 * The feature id for the '<em><b>Lalala</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_REPRESENTATION_EXTENSION__LALALA = DescriptionPackage.REPRESENTATION_EXTENSION_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Xtext Representation
	 * Extension</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_REPRESENTATION_EXTENSION_FEATURE_COUNT = DescriptionPackage.REPRESENTATION_EXTENSION_DESCRIPTION_FEATURE_COUNT
			+ 1;


	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription
	 * <em>Xtext Feature Extension Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Feature Extension
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription
	 * @generated
	 */
	EClass getXtextFeatureExtensionDescription();

	/**
	 * Returns the meta object for the reference
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription#getLabel
	 * <em>Label</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription#getLabel()
	 * @see #getXtextFeatureExtensionDescription()
	 * @generated
	 */
	EReference getXtextFeatureExtensionDescription_Label();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension
	 * <em>Xtext DFeature Extension</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext DFeature Extension</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension
	 * @generated
	 */
	EClass getXtextDFeatureExtension();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension#getDumdidum
	 * <em>Dumdidum</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Dumdidum</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension#getDumdidum()
	 * @see #getXtextDFeatureExtension()
	 * @generated
	 */
	EAttribute getXtextDFeatureExtension_Dumdidum();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension
	 * <em>Xtext Representation Extension</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Representation
	 *         Extension</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension
	 * @generated
	 */
	EClass getXtextRepresentationExtension();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension#getLalala
	 * <em>Lalala</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Lalala</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension#getLalala()
	 * @see #getXtextRepresentationExtension()
	 * @generated
	 */
	EAttribute getXtextRepresentationExtension_Lalala();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewpointxtextFactory getViewpointxtextFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextFeatureExtensionDescriptionImpl
		 * <em>Xtext Feature Extension Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextFeatureExtensionDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextFeatureExtensionDescription()
		 * @generated
		 */
		EClass XTEXT_FEATURE_EXTENSION_DESCRIPTION = eINSTANCE.getXtextFeatureExtensionDescription();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference XTEXT_FEATURE_EXTENSION_DESCRIPTION__LABEL = eINSTANCE.getXtextFeatureExtensionDescription_Label();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextDFeatureExtensionImpl
		 * <em>Xtext DFeature Extension</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextDFeatureExtensionImpl
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextDFeatureExtension()
		 * @generated
		 */
		EClass XTEXT_DFEATURE_EXTENSION = eINSTANCE.getXtextDFeatureExtension();

		/**
		 * The meta object literal for the '<em><b>Dumdidum</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute XTEXT_DFEATURE_EXTENSION__DUMDIDUM = eINSTANCE.getXtextDFeatureExtension_Dumdidum();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextRepresentationExtensionImpl
		 * <em>Xtext Representation Extension</em>}' class. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextRepresentationExtensionImpl
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextRepresentationExtension()
		 * @generated
		 */
		EClass XTEXT_REPRESENTATION_EXTENSION = eINSTANCE.getXtextRepresentationExtension();

		/**
		 * The meta object literal for the '<em><b>Lalala</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute XTEXT_REPRESENTATION_EXTENSION__LALALA = eINSTANCE.getXtextRepresentationExtension_Lalala();

	}

} // ViewpointxtextPackage
