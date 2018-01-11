/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

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
 *        styleProviders='false' disposableProviderFactory='true'
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
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription
	 * <em>IXtext Edge Label Direct Edit Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getIXtextEdgeLabelDirectEditDescription()
	 * @generated
	 */
	int IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__INJECTOR_ID = XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__MULTI_LINE = XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Edge Label Mappings</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS = XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>IXtext Edge Label Direct
	 * Edit Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT = XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditModelDescriptionImpl
	 * <em>Xtext Edge Label Direct Edit Model Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextEdgeLabelDirectEditModelDescription()
	 * @generated
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__DOCUMENTATION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__NAME = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__LABEL = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__PRECONDITION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Force Refresh</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__FORCE_REFRESH = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__FORCE_REFRESH;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__FILTERS = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__FILTERS;

	/**
	 * The feature id for the '<em><b>Elements To Select</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__ELEMENTS_TO_SELECT = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__ELEMENTS_TO_SELECT;

	/**
	 * The feature id for the '<em><b>Inverse Selection Order</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INVERSE_SELECTION_ORDER = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INVERSE_SELECTION_ORDER;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__MASK = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__MASK;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INITIAL_OPERATION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Input Label Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INPUT_LABEL_EXPRESSION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INPUT_LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES;

	/**
	 * The feature id for the '<em><b>Edge Label Mappings</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Xtext Edge Label Direct
	 * Edit Model Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION_FEATURE_COUNT = DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl
	 * <em>Xtext Edge Label Direct Edit Value Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextEdgeLabelDirectEditValueDescription()
	 * @generated
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__DOCUMENTATION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__NAME = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__LABEL = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__PRECONDITION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Force Refresh</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__FORCE_REFRESH = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__FORCE_REFRESH;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__FILTERS = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__FILTERS;

	/**
	 * The feature id for the '<em><b>Elements To Select</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__ELEMENTS_TO_SELECT = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__ELEMENTS_TO_SELECT;

	/**
	 * The feature id for the '<em><b>Inverse Selection Order</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INVERSE_SELECTION_ORDER = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INVERSE_SELECTION_ORDER;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__MASK = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MASK;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INITIAL_OPERATION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Input Label Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INPUT_LABEL_EXPRESSION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INPUT_LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Edge Label Mappings</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Xtext Edge Label Direct
	 * Edit Value Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION_FEATURE_COUNT = DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION_FEATURE_COUNT
			+ 1;


	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription
	 * <em>IXtext Edge Label Direct Edit Description</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Edge Label Direct Edit
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription
	 * @generated
	 */
	EClass getIXtextEdgeLabelDirectEditDescription();

	/**
	 * Returns the meta object for the reference list
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription#getEdgeLabelMappings
	 * <em>Edge Label Mappings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference list '<em>Edge Label
	 *         Mappings</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription#getEdgeLabelMappings()
	 * @see #getIXtextEdgeLabelDirectEditDescription()
	 * @generated
	 */
	EReference getIXtextEdgeLabelDirectEditDescription_EdgeLabelMappings();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription
	 * <em>Xtext Edge Label Direct Edit Model Description</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Edge Label Direct Edit Model
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription
	 * @generated
	 */
	EClass getXtextEdgeLabelDirectEditModelDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditValueDescription
	 * <em>Xtext Edge Label Direct Edit Value Description</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Edge Label Direct Edit Value
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditValueDescription
	 * @generated
	 */
	EClass getXtextEdgeLabelDirectEditValueDescription();

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
		 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription
		 * <em>IXtext Edge Label Direct Edit Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getIXtextEdgeLabelDirectEditDescription()
		 * @generated
		 */
		EClass IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION = eINSTANCE.getIXtextEdgeLabelDirectEditDescription();

		/**
		 * The meta object literal for the '<em><b>Edge Label Mappings</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS = eINSTANCE
				.getIXtextEdgeLabelDirectEditDescription_EdgeLabelMappings();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditModelDescriptionImpl
		 * <em>Xtext Edge Label Direct Edit Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextEdgeLabelDirectEditModelDescription()
		 * @generated
		 */
		EClass XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION = eINSTANCE.getXtextEdgeLabelDirectEditModelDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl
		 * <em>Xtext Edge Label Direct Edit Value Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.ViewpointxtextPackageImpl#getXtextEdgeLabelDirectEditValueDescription()
		 * @generated
		 */
		EClass XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION = eINSTANCE.getXtextEdgeLabelDirectEditValueDescription();

	}

} // ViewpointxtextPackage
