<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
import org.eclipse.emf.ecore.EcorePackage;
=======
import org.eclipse.sirius.properties.PropertiesPackage;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
import org.eclipse.emf.ecore.EcorePackage;
>>>>>>> updated to Oxygen.2
=======
import org.eclipse.sirius.properties.PropertiesPackage;
>>>>>>> fixed invalid import in generated files

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
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextFactory
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
>>>>>>> updated to Oxygen.2
 * @model kind="package" annotation="http://www.eclipse.org/emf/2002/GenModel
 *        modelName='Properties-xtext'
 *        modelPluginID='com.altran.general.integration.xtextsirius.model.properties.sirius4'
 *        complianceLevel='6.0' runtimeVersion='2.3' nonNLSMarkers='false'
 *        copyrightFields='false' creationIcons='false'
 *        modelDirectory='/com.altran.general.integration.xtextsirius.model.properties.sirius4/src-gen'
 *        editDirectory='/com.altran.general.integration.xtextsirius.model.properties.sirius4.edit/src-gen'
 *        editPluginID='com.altran.general.integration.xtextsirius.model.properties.sirius4.edit'
 *        codeFormatting='true' importOrganizing='true' cleanup='true'
 *        styleProviders='false' disposableProviderFactory='true'
 *        extensibleProviderFactory='true' childCreationExtenders='true'
 *        basePackage='com.altran.general.integration.xtextsirius.model.properties'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore
 *        Ecore='http://www.eclipse.org/emf/2002/Ecore'
 *        GenModel='http://www.eclipse.org/emf/2002/GenModel'"
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
=======
 * @model kind="package" annotation=
 *        "http://www.eclipse.org/emf/2002/GenModel modelName='Properties-xtext' modelPluginID='com.altran.general.integration.xtextsirius.model.properties.sirius4' complianceLevel='6.0' runtimeVersion='2.3' nonNLSMarkers='false' copyrightFields='false' creationIcons='false' modelDirectory='/com.altran.general.integration.xtextsirius.model.properties.sirius4/src-gen' editDirectory='/com.altran.general.integration.xtextsirius.model.properties.sirius4.edit/src-gen' editPluginID='com.altran.general.integration.xtextsirius.model.properties.sirius4.edit' codeFormatting='true' importOrganizing='true' cleanup='true' styleProviders='false' disposableProviderFactory='true' extensibleProviderFactory='true' childCreationExtenders='true' basePackage='com.altran.general.integration.xtextsirius.model.properties'"
 *        annotation=
 *        "http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel'"
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
 * @generated
 */
public interface PropertiesxtextPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "propertiesxtext";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://altran.com/general/integration/xtextsirius/model/properties/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "properties-xtext";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	PropertiesxtextPackage eINSTANCE = com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl
			.init();

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
=======
	 * The meta object id for the '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
>>>>>>> updated to Oxygen.2
	 * <em>Xtext Single Line Model Description</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextSingleLineModelDescription()
	 * @generated
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION = 0;

	/**
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
=======
>>>>>>> fixed invalid import in generated files
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IDENTIFIER = PropertiesPackage.TEXT_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.TEXT_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__STYLE = PropertiesPackage.TEXT_DESCRIPTION__STYLE;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__CONDITIONAL_STYLES = PropertiesPackage.TEXT_DESCRIPTION__CONDITIONAL_STYLES;

	/**
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;
=======
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 0;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;
>>>>>>> updated to Oxygen.2
=======
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 0;
>>>>>>> fixed invalid import in generated files

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xtext Single Line Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
=======
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '
	 * <em>Xtext Single Line Model Description</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = EcorePackage.EOBJECT_FEATURE_COUNT + 1;
=======
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 1;
>>>>>>> fixed invalid import in generated files

	/**
	 * The number of structural features of the '<em>Xtext Single Line Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
>>>>>>> updated to Oxygen.2
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;
=======
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 2;
>>>>>>> fixed invalid import in generated files

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
=======
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
>>>>>>> updated to Oxygen.2
	 * <em>Xtext Multi Line Model Description</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextMultiLineModelDescription()
	 * @generated
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION = 1;

	/**
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
=======
>>>>>>> fixed invalid import in generated files
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__IDENTIFIER = PropertiesPackage.TEXT_AREA_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.TEXT_AREA_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__STYLE = PropertiesPackage.TEXT_AREA_DESCRIPTION__STYLE;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__CONDITIONAL_STYLES = PropertiesPackage.TEXT_AREA_DESCRIPTION__CONDITIONAL_STYLES;

	/**
	 * The feature id for the '<em><b>Line Count</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__LINE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION__LINE_COUNT;

	/**
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__INJECTOR_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;
=======
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 0;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__INJECTOR_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;
>>>>>>> updated to Oxygen.2
=======
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 0;
>>>>>>> fixed invalid import in generated files

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = EcorePackage.EOBJECT_FEATURE_COUNT + 1;
=======
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT
			+ 1;
>>>>>>> fixed invalid import in generated files

	/**
	 * The number of structural features of the '<em>Xtext Multi Line Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
=======
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '
	 * <em>Xtext Multi Line Model Description</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xtext Multi Line Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
>>>>>>> updated to Oxygen.2
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
=======
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;
=======
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 2;
>>>>>>> fixed invalid import in generated files

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
>>>>>>> updated to Oxygen.2
	 * <em>Xtext Single Line Value Description</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextSingleLineValueDescription()
	 * @generated
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION = 2;

	/**
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
=======
>>>>>>> fixed invalid import in generated files
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__IDENTIFIER = PropertiesPackage.TEXT_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.TEXT_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__STYLE = PropertiesPackage.TEXT_DESCRIPTION__STYLE;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__CONDITIONAL_STYLES = PropertiesPackage.TEXT_DESCRIPTION__CONDITIONAL_STYLES;

	/**
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 0;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;
>>>>>>> updated to Oxygen.2
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 0;
>>>>>>> fixed invalid import in generated files

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = EcorePackage.EOBJECT_FEATURE_COUNT + 1;
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT
			+ 1;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = EcorePackage.EOBJECT_FEATURE_COUNT + 1;
>>>>>>> updated to Oxygen.2
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT
			+ 1;
>>>>>>> fixed invalid import in generated files

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xtext Single Line Value
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '
	 * <em>Xtext Single Line Value Description</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = EcorePackage.EOBJECT_FEATURE_COUNT + 2;
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT
			+ 2;
>>>>>>> fixed invalid import in generated files

	/**
	 * The number of structural features of the '<em>Xtext Single Line Value
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
>>>>>>> updated to Oxygen.2
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 3;
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 3;
>>>>>>> fixed invalid import in generated files

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
>>>>>>> updated to Oxygen.2
	 * <em>Xtext Multi Line Value Description</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextMultiLineValueDescription()
	 * @generated
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION = 3;

	/**
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
=======
>>>>>>> fixed invalid import in generated files
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__IDENTIFIER = PropertiesPackage.TEXT_AREA_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.TEXT_AREA_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__STYLE = PropertiesPackage.TEXT_AREA_DESCRIPTION__STYLE;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__CONDITIONAL_STYLES = PropertiesPackage.TEXT_AREA_DESCRIPTION__CONDITIONAL_STYLES;

	/**
	 * The feature id for the '<em><b>Line Count</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__LINE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION__LINE_COUNT;

	/**
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__INJECTOR_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 0;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__INJECTOR_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;
>>>>>>> updated to Oxygen.2
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 0;
>>>>>>> fixed invalid import in generated files

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = EcorePackage.EOBJECT_FEATURE_COUNT + 1;
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT
			+ 1;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = EcorePackage.EOBJECT_FEATURE_COUNT + 1;
>>>>>>> updated to Oxygen.2
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT
			+ 1;
>>>>>>> fixed invalid import in generated files

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = EcorePackage.EOBJECT_FEATURE_COUNT + 2;
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT
			+ 2;
>>>>>>> fixed invalid import in generated files

	/**
	 * The number of structural features of the '<em>Xtext Multi Line Value
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '
	 * <em>Xtext Multi Line Value Description</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xtext Multi Line Value
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
>>>>>>> updated to Oxygen.2
	 * 
	 * @generated
	 * @ordered
	 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 3;
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 3;
>>>>>>> fixed invalid import in generated files


	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription
	 * <em>Xtext Single Line Model Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Single Line Model
	 *         Description</em>'.
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 3;
=======
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 3;
>>>>>>> updated to Oxygen.2


	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription
	 * <em>Xtext Single Line Model Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
	 * @return the meta object for class '
	 *         <em>Xtext Single Line Model Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the meta object for class '<em>Xtext Single Line Model
	 *         Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription
	 * @generated
	 */
	EClass getXtextSingleLineModelDescription();

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
	 * <em>Xtext Multi Line Model Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Multi Line Model
	 *         Description</em>'.
=======
	 * Returns the meta object for class '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
	 * <em>Xtext Multi Line Model Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>Xtext Multi Line Model Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
	 * <em>Xtext Multi Line Model Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Multi Line Model
	 *         Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
	 * @generated
	 */
	EClass getXtextMultiLineModelDescription();

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
	 * <em>Xtext Single Line Value Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Single Line Value
	 *         Description</em>'.
=======
	 * Returns the meta object for class '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
	 * <em>Xtext Single Line Value Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>Xtext Single Line Value Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
	 * <em>Xtext Single Line Value Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Single Line Value
	 *         Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
	 * @generated
	 */
	EClass getXtextSingleLineValueDescription();

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
	 * <em>Xtext Multi Line Value Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Multi Line Value
	 *         Description</em>'.
=======
	 * Returns the meta object for class '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
	 * <em>Xtext Multi Line Value Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>Xtext Multi Line Value Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
	 * <em>Xtext Multi Line Value Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Multi Line Value
	 *         Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
	 * @generated
	 */
	EClass getXtextMultiLineValueDescription();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertiesxtextFactory getPropertiesxtextFactory();

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
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
=======
		 * The meta object literal for the '
		 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
>>>>>>> updated to Oxygen.2
		 * <em>Xtext Single Line Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextSingleLineModelDescription()
		 * @generated
		 */
		EClass XTEXT_SINGLE_LINE_MODEL_DESCRIPTION = eINSTANCE.getXtextSingleLineModelDescription();

		/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
=======
		 * The meta object literal for the '
		 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
>>>>>>> updated to Oxygen.2
		 * <em>Xtext Multi Line Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextMultiLineModelDescription()
		 * @generated
		 */
		EClass XTEXT_MULTI_LINE_MODEL_DESCRIPTION = eINSTANCE.getXtextMultiLineModelDescription();

		/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
=======
		 * The meta object literal for the '
		 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
>>>>>>> updated to Oxygen.2
		 * <em>Xtext Single Line Value Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextSingleLineValueDescription()
		 * @generated
		 */
		EClass XTEXT_SINGLE_LINE_VALUE_DESCRIPTION = eINSTANCE.getXtextSingleLineValueDescription();

		/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
=======
		 * The meta object literal for the '
		 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
>>>>>>> updated to Oxygen.2
		 * <em>Xtext Multi Line Value Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextMultiLineValueDescription()
		 * @generated
		 */
		EClass XTEXT_MULTI_LINE_VALUE_DESCRIPTION = eINSTANCE.getXtextMultiLineValueDescription();

	}

} // PropertiesxtextPackage
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.sirius.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelName='Properties-xtext' modelPluginID='com.altran.general.integration.xtextsirius.model.properties.sirius4' complianceLevel='6.0' runtimeVersion='2.3' nonNLSMarkers='false' copyrightFields='false' creationIcons='false' modelDirectory='/com.altran.general.integration.xtextsirius.model.properties.sirius4/src-gen' editDirectory='/com.altran.general.integration.xtextsirius.model.properties.sirius4.edit/src-gen' editPluginID='com.altran.general.integration.xtextsirius.model.properties.sirius4.edit' codeFormatting='true' importOrganizing='true' cleanup='true' styleProviders='false' disposableProviderFactory='true' extensibleProviderFactory='true' childCreationExtenders='true' basePackage='com.altran.general.integration.xtextsirius.model.properties'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface PropertiesxtextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "propertiesxtext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://altran.com/general/integration/xtextsirius/model/properties/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "properties-xtext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesxtextPackage eINSTANCE = com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl <em>Xtext Single Line Model Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextSingleLineModelDescription()
	 * @generated
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IDENTIFIER = PropertiesPackage.TEXT_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.TEXT_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__STYLE = PropertiesPackage.TEXT_DESCRIPTION__STYLE;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__CONDITIONAL_STYLES = PropertiesPackage.TEXT_DESCRIPTION__CONDITIONAL_STYLES;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xtext Single Line Model Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl <em>Xtext Multi Line Model Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextMultiLineModelDescription()
	 * @generated
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__IDENTIFIER = PropertiesPackage.TEXT_AREA_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.TEXT_AREA_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__STYLE = PropertiesPackage.TEXT_AREA_DESCRIPTION__STYLE;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__CONDITIONAL_STYLES = PropertiesPackage.TEXT_AREA_DESCRIPTION__CONDITIONAL_STYLES;

	/**
	 * The feature id for the '<em><b>Line Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__LINE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION__LINE_COUNT;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Xtext Multi Line Model Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_MODEL_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl <em>Xtext Single Line Value Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextSingleLineValueDescription()
	 * @generated
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__IDENTIFIER = PropertiesPackage.TEXT_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.TEXT_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__STYLE = PropertiesPackage.TEXT_DESCRIPTION__STYLE;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__CONDITIONAL_STYLES = PropertiesPackage.TEXT_DESCRIPTION__CONDITIONAL_STYLES;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>Xtext Single Line Value Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_SINGLE_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl <em>Xtext Multi Line Value Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextMultiLineValueDescription()
	 * @generated
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__IDENTIFIER = PropertiesPackage.TEXT_AREA_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION__VALUE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.TEXT_AREA_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__STYLE = PropertiesPackage.TEXT_AREA_DESCRIPTION__STYLE;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__CONDITIONAL_STYLES = PropertiesPackage.TEXT_AREA_DESCRIPTION__CONDITIONAL_STYLES;

	/**
	 * The feature id for the '<em><b>Line Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__LINE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION__LINE_COUNT;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__INJECTOR_ID = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>Xtext Multi Line Value Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_MULTI_LINE_VALUE_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.TEXT_AREA_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription <em>Xtext Single Line Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xtext Single Line Model Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription
	 * @generated
	 */
	EClass getXtextSingleLineModelDescription();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription <em>Xtext Multi Line Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xtext Multi Line Model Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
	 * @generated
	 */
	EClass getXtextMultiLineModelDescription();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription <em>Xtext Single Line Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xtext Single Line Value Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
	 * @generated
	 */
	EClass getXtextSingleLineValueDescription();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription <em>Xtext Multi Line Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xtext Multi Line Value Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
	 * @generated
	 */
	EClass getXtextMultiLineValueDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertiesxtextFactory getPropertiesxtextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl <em>Xtext Single Line Model Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextSingleLineModelDescription()
		 * @generated
		 */
		EClass XTEXT_SINGLE_LINE_MODEL_DESCRIPTION = eINSTANCE.getXtextSingleLineModelDescription();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl <em>Xtext Multi Line Model Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextMultiLineModelDescription()
		 * @generated
		 */
		EClass XTEXT_MULTI_LINE_MODEL_DESCRIPTION = eINSTANCE.getXtextMultiLineModelDescription();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl <em>Xtext Single Line Value Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextSingleLineValueDescription()
		 * @generated
		 */
		EClass XTEXT_SINGLE_LINE_VALUE_DESCRIPTION = eINSTANCE.getXtextSingleLineValueDescription();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl <em>Xtext Multi Line Value Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextMultiLineValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.PropertiesxtextPackageImpl#getXtextMultiLineValueDescription()
		 * @generated
		 */
		EClass XTEXT_MULTI_LINE_VALUE_DESCRIPTION = eINSTANCE.getXtextMultiLineValueDescription();

	}

} //PropertiesxtextPackage
>>>>>>> preliminary fix for using guava v16
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
