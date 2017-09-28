/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext;

import org.eclipse.eef.EefPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextFactory
 * @model kind="package" annotation="http://www.eclipse.org/emf/2002/GenModel
 *        modelName='Eef-xtext'
 *        modelPluginID='com.altran.general.integration.xtextsirius.model.eef'
 *        complianceLevel='6.0' runtimeVersion='2.3' nonNLSMarkers='false'
 *        copyrightFields='false' creationIcons='false'
 *        modelDirectory='/com.altran.general.integration.xtextsirius.model.eef/src-gen'
 *        codeFormatting='true' importOrganizing='true' cleanup='true'
 *        containmentProxies='true' disposableProviderFactory='true'
 *        basePackage='com.altran.general.integration.xtextsirius.model.eef'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore
 *        Ecore='http://www.eclipse.org/emf/2002/Ecore'
 *        GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface EefxtextPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "eefxtext";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://altran.com/general/integration/xtextsirius/model/eef/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "eef-xtext";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EefxtextPackage eINSTANCE = com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefxtextPackageImpl
			.init();

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefXtextDescriptionImpl
	 * <em>Eef Xtext Description</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefXtextDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefxtextPackageImpl#getEefXtextDescription()
	 * @generated
	 */
	int EEF_XTEXT_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__IDENTIFIER = EefPackage.EEF_TEXT_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_TEXT_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_TEXT_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_TEXT_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_TEXT_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__EDIT_EXPRESSION = EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Line Count</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__LINE_COUNT = EefPackage.EEF_TEXT_DESCRIPTION__LINE_COUNT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__STYLE = EefPackage.EEF_TEXT_DESCRIPTION__STYLE;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION__LANGUAGE = EefPackage.EEF_TEXT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eef Xtext Description</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_XTEXT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_TEXT_DESCRIPTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextDescription
	 * <em>Eef Xtext Description</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Eef Xtext Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextDescription
	 * @generated
	 */
	EClass getEefXtextDescription();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextDescription#getLanguage
	 * <em>Language</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextDescription#getLanguage()
	 * @see #getEefXtextDescription()
	 * @generated
	 */
	EAttribute getEefXtextDescription_Language();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EefxtextFactory getEefxtextFactory();

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
		 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefXtextDescriptionImpl
		 * <em>Eef Xtext Description</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefXtextDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefxtextPackageImpl#getEefXtextDescription()
		 * @generated
		 */
		EClass EEF_XTEXT_DESCRIPTION = eINSTANCE.getEefXtextDescription();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EEF_XTEXT_DESCRIPTION__LANGUAGE = eINSTANCE.getEefXtextDescription_Language();

	}

} // EefxtextPackage
