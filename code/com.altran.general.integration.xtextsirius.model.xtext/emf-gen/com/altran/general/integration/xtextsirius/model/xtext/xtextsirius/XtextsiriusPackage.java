/**
 */
package com.altran.general.integration.xtextsirius.model.xtext.xtextsirius;

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
 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusFactory
 * @model kind="package"
 * @generated
 */
public interface XtextsiriusPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "xtextsirius";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://altran.com/general/integration/xtextsirius/model/xtext/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "xtext-sirius";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	XtextsiriusPackage eINSTANCE = com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl
			.init();

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
	 * <em>IXtext Description</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextDescription()
	 * @generated
	 */
	int IXTEXT_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DESCRIPTION__INJECTOR_ID = 0;

	/**
	 * The number of structural features of the '<em>IXtext Description</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
	 * <em>IXtext Model Description</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextModelDescription()
	 * @generated
	 */
	int IXTEXT_MODEL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_MODEL_DESCRIPTION__INJECTOR_ID = IXTEXT_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES = IXTEXT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignored Nested Features</b></em>'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES = IXTEXT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix Terminals Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION = IXTEXT_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suffix Terminals Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION = IXTEXT_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IXtext Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_MODEL_DESCRIPTION_FEATURE_COUNT = IXTEXT_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
	 * <em>IXtext Value Description</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextValueDescription()
	 * @generated
	 */
	int IXTEXT_VALUE_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_VALUE_DESCRIPTION__INJECTOR_ID = IXTEXT_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = IXTEXT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = IXTEXT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IXtext Value
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_VALUE_DESCRIPTION_FEATURE_COUNT = IXTEXT_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
	 * <em>IXtext Property Description</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextPropertyDescription()
	 * @generated
	 */
	int IXTEXT_PROPERTY_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_DESCRIPTION__INJECTOR_ID = IXTEXT_DESCRIPTION__INJECTOR_ID;

	/**
	 * The number of structural features of the '<em>IXtext Property
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_DESCRIPTION_FEATURE_COUNT = IXTEXT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription
	 * <em>IXtext Direct Edit Description</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextDirectEditDescription()
	 * @generated
	 */
	int IXTEXT_DIRECT_EDIT_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_DESCRIPTION__INJECTOR_ID = IXTEXT_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE = IXTEXT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IXtext Direct Edit
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT = IXTEXT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription
	 * <em>IXtext Direct Edit Model Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextDirectEditModelDescription()
	 * @generated
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID = IXTEXT_DIRECT_EDIT_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE = IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES = IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignored Nested Features</b></em>'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES = IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Prefix Terminals Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION = IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Suffix Terminals Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION = IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Selected Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__SELECTED_FEATURES = IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>IXtext Direct Edit Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION_FEATURE_COUNT = IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription
	 * <em>IXtext Direct Edit Value Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextDirectEditValueDescription()
	 * @generated
	 */
	int IXTEXT_DIRECT_EDIT_VALUE_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID = IXTEXT_DIRECT_EDIT_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE = IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IXtext Direct Edit Value
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_VALUE_DESCRIPTION_FEATURE_COUNT = IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
	 * <em>IXtext Property Model Description</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextPropertyModelDescription()
	 * @generated
	 */
	int IXTEXT_PROPERTY_MODEL_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_MODEL_DESCRIPTION__INJECTOR_ID = IXTEXT_PROPERTY_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_MODEL_DESCRIPTION__EDITABLE_FEATURES = IXTEXT_PROPERTY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignored Nested Features</b></em>'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES = IXTEXT_PROPERTY_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix Terminals Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION = IXTEXT_PROPERTY_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suffix Terminals Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION = IXTEXT_PROPERTY_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IXtext Property Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_MODEL_DESCRIPTION_FEATURE_COUNT = IXTEXT_PROPERTY_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
	 * <em>IXtext Property Value Description</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextPropertyValueDescription()
	 * @generated
	 */
	int IXTEXT_PROPERTY_VALUE_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_VALUE_DESCRIPTION__INJECTOR_ID = IXTEXT_PROPERTY_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = IXTEXT_PROPERTY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = IXTEXT_PROPERTY_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IXtext Property Value
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_PROPERTY_VALUE_DESCRIPTION_FEATURE_COUNT = IXTEXT_PROPERTY_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
	 * <em>IXtext Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>IXtext Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
	 * @generated
	 */
	EClass getIXtextDescription();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription#getInjectorId
	 * <em>Injector Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Injector Id</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription#getInjectorId()
	 * @see #getIXtextDescription()
	 * @generated
	 */
	EAttribute getIXtextDescription_InjectorId();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
	 * <em>IXtext Model Description</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Model Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
	 * @generated
	 */
	EClass getIXtextModelDescription();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription#getEditableFeatures
	 * <em>Editable Features</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the attribute list '<em>Editable
	 *         Features</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription#getEditableFeatures()
	 * @see #getIXtextModelDescription()
	 * @generated
	 */
	EAttribute getIXtextModelDescription_EditableFeatures();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription#getIgnoredNestedFeatures
	 * <em>Ignored Nested Features</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Ignored Nested
	 *         Features</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription#getIgnoredNestedFeatures()
	 * @see #getIXtextModelDescription()
	 * @generated
	 */
	EAttribute getIXtextModelDescription_IgnoredNestedFeatures();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription#getPrefixTerminalsExpression
	 * <em>Prefix Terminals Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Prefix Terminals
	 *         Expression</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription#getPrefixTerminalsExpression()
	 * @see #getIXtextModelDescription()
	 * @generated
	 */
	EAttribute getIXtextModelDescription_PrefixTerminalsExpression();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription#getSuffixTerminalsExpression
	 * <em>Suffix Terminals Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Suffix Terminals
	 *         Expression</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription#getSuffixTerminalsExpression()
	 * @see #getIXtextModelDescription()
	 * @generated
	 */
	EAttribute getIXtextModelDescription_SuffixTerminalsExpression();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
	 * <em>IXtext Value Description</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Value Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
	 * @generated
	 */
	EClass getIXtextValueDescription();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription#getPrefixTextExpression
	 * <em>Prefix Text Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Prefix Text
	 *         Expression</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription#getPrefixTextExpression()
	 * @see #getIXtextValueDescription()
	 * @generated
	 */
	EAttribute getIXtextValueDescription_PrefixTextExpression();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription#getSuffixTextExpression
	 * <em>Suffix Text Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Suffix Text
	 *         Expression</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription#getSuffixTextExpression()
	 * @see #getIXtextValueDescription()
	 * @generated
	 */
	EAttribute getIXtextValueDescription_SuffixTextExpression();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
	 * <em>IXtext Property Description</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Property Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
	 * @generated
	 */
	EClass getIXtextPropertyDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription
	 * <em>IXtext Direct Edit Description</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Direct Edit
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription
	 * @generated
	 */
	EClass getIXtextDirectEditDescription();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription#isMultiLine
	 * <em>Multi Line</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Multi Line</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription#isMultiLine()
	 * @see #getIXtextDirectEditDescription()
	 * @generated
	 */
	EAttribute getIXtextDirectEditDescription_MultiLine();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription
	 * <em>IXtext Direct Edit Model Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Direct Edit Model
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription
	 * @generated
	 */
	EClass getIXtextDirectEditModelDescription();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription#getSelectedFeatures
	 * <em>Selected Features</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the attribute list '<em>Selected
	 *         Features</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription#getSelectedFeatures()
	 * @see #getIXtextDirectEditModelDescription()
	 * @generated
	 */
	EAttribute getIXtextDirectEditModelDescription_SelectedFeatures();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription
	 * <em>IXtext Direct Edit Value Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Direct Edit Value
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription
	 * @generated
	 */
	EClass getIXtextDirectEditValueDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
	 * <em>IXtext Property Model Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Property Model
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
	 * @generated
	 */
	EClass getIXtextPropertyModelDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
	 * <em>IXtext Property Value Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Property Value
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
	 * @generated
	 */
	EClass getIXtextPropertyValueDescription();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XtextsiriusFactory getXtextsiriusFactory();

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
		 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
		 * <em>IXtext Description</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextDescription()
		 * @generated
		 */
		EClass IXTEXT_DESCRIPTION = eINSTANCE.getIXtextDescription();

		/**
		 * The meta object literal for the '<em><b>Injector Id</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_DESCRIPTION__INJECTOR_ID = eINSTANCE.getIXtextDescription_InjectorId();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
		 * <em>IXtext Model Description</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextModelDescription()
		 * @generated
		 */
		EClass IXTEXT_MODEL_DESCRIPTION = eINSTANCE.getIXtextModelDescription();

		/**
		 * The meta object literal for the '<em><b>Editable Features</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES = eINSTANCE.getIXtextModelDescription_EditableFeatures();

		/**
		 * The meta object literal for the '<em><b>Ignored Nested
		 * Features</b></em>' attribute list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES = eINSTANCE
				.getIXtextModelDescription_IgnoredNestedFeatures();

		/**
		 * The meta object literal for the '<em><b>Prefix Terminals
		 * Expression</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION = eINSTANCE
				.getIXtextModelDescription_PrefixTerminalsExpression();

		/**
		 * The meta object literal for the '<em><b>Suffix Terminals
		 * Expression</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION = eINSTANCE
				.getIXtextModelDescription_SuffixTerminalsExpression();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
		 * <em>IXtext Value Description</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextValueDescription()
		 * @generated
		 */
		EClass IXTEXT_VALUE_DESCRIPTION = eINSTANCE.getIXtextValueDescription();

		/**
		 * The meta object literal for the '<em><b>Prefix Text
		 * Expression</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = eINSTANCE
				.getIXtextValueDescription_PrefixTextExpression();

		/**
		 * The meta object literal for the '<em><b>Suffix Text
		 * Expression</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = eINSTANCE
				.getIXtextValueDescription_SuffixTextExpression();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
		 * <em>IXtext Property Description</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextPropertyDescription()
		 * @generated
		 */
		EClass IXTEXT_PROPERTY_DESCRIPTION = eINSTANCE.getIXtextPropertyDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription
		 * <em>IXtext Direct Edit Description</em>}' class. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextDirectEditDescription()
		 * @generated
		 */
		EClass IXTEXT_DIRECT_EDIT_DESCRIPTION = eINSTANCE.getIXtextDirectEditDescription();

		/**
		 * The meta object literal for the '<em><b>Multi Line</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE = eINSTANCE.getIXtextDirectEditDescription_MultiLine();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription
		 * <em>IXtext Direct Edit Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextDirectEditModelDescription()
		 * @generated
		 */
		EClass IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION = eINSTANCE.getIXtextDirectEditModelDescription();

		/**
		 * The meta object literal for the '<em><b>Selected Features</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__SELECTED_FEATURES = eINSTANCE
				.getIXtextDirectEditModelDescription_SelectedFeatures();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription
		 * <em>IXtext Direct Edit Value Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextDirectEditValueDescription()
		 * @generated
		 */
		EClass IXTEXT_DIRECT_EDIT_VALUE_DESCRIPTION = eINSTANCE.getIXtextDirectEditValueDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
		 * <em>IXtext Property Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextPropertyModelDescription()
		 * @generated
		 */
		EClass IXTEXT_PROPERTY_MODEL_DESCRIPTION = eINSTANCE.getIXtextPropertyModelDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
		 * <em>IXtext Property Value Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
		 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl.XtextsiriusPackageImpl#getIXtextPropertyValueDescription()
		 * @generated
		 */
		EClass IXTEXT_PROPERTY_VALUE_DESCRIPTION = eINSTANCE.getIXtextPropertyValueDescription();

	}

} // XtextsiriusPackage
