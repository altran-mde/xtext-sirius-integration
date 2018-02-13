/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.sirius.diagram.description.tool.ToolPackage;

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
 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelName='Diagram-xtext' modelPluginID='com.altran.general.integration.xtextsirius.model.diagram' complianceLevel='6.0' runtimeVersion='2.3' nonNLSMarkers='false' copyrightFields='false' creationIcons='false' modelDirectory='/com.altran.general.integration.xtextsirius.model.diagram/src-gen' editDirectory='/com.altran.general.integration.xtextsirius.model.diagram.edit/src-gen' editPluginID='com.altran.general.integration.xtextsirius.mode.diagram.edit' codeFormatting='true' importOrganizing='true' cleanup='true' styleProviders='false' disposableProviderFactory='true' extensibleProviderFactory='true' childCreationExtenders='true' basePackage='com.altran.general.integration.xtextsirius.model.diagram'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface DiagramxtextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagramxtext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://altran.com/general/integration/xtextsirius/model/diagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagram-xtext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramxtextPackage eINSTANCE = com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.AXtextDirectEditLabelImpl <em>AXtext Direct Edit Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.AXtextDirectEditLabelImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getAXtextDirectEditLabel()
	 * @generated
	 */
	int AXTEXT_DIRECT_EDIT_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__DOCUMENTATION = ToolPackage.DIRECT_EDIT_LABEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__NAME = ToolPackage.DIRECT_EDIT_LABEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__LABEL = ToolPackage.DIRECT_EDIT_LABEL__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__PRECONDITION = ToolPackage.DIRECT_EDIT_LABEL__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Force Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__FORCE_REFRESH = ToolPackage.DIRECT_EDIT_LABEL__FORCE_REFRESH;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__FILTERS = ToolPackage.DIRECT_EDIT_LABEL__FILTERS;

	/**
	 * The feature id for the '<em><b>Elements To Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__ELEMENTS_TO_SELECT = ToolPackage.DIRECT_EDIT_LABEL__ELEMENTS_TO_SELECT;

	/**
	 * The feature id for the '<em><b>Inverse Selection Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__INVERSE_SELECTION_ORDER = ToolPackage.DIRECT_EDIT_LABEL__INVERSE_SELECTION_ORDER;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__MASK = ToolPackage.DIRECT_EDIT_LABEL__MASK;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__INITIAL_OPERATION = ToolPackage.DIRECT_EDIT_LABEL__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Input Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL__INPUT_LABEL_EXPRESSION = ToolPackage.DIRECT_EDIT_LABEL__INPUT_LABEL_EXPRESSION;

	/**
	 * The number of structural features of the '<em>AXtext Direct Edit Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditModelDescriptionImpl <em>Xtext Direct Edit Model Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextDirectEditModelDescription()
	 * @generated
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__DOCUMENTATION = AXTEXT_DIRECT_EDIT_LABEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__NAME = AXTEXT_DIRECT_EDIT_LABEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__LABEL = AXTEXT_DIRECT_EDIT_LABEL__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__PRECONDITION = AXTEXT_DIRECT_EDIT_LABEL__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Force Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__FORCE_REFRESH = AXTEXT_DIRECT_EDIT_LABEL__FORCE_REFRESH;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__FILTERS = AXTEXT_DIRECT_EDIT_LABEL__FILTERS;

	/**
	 * The feature id for the '<em><b>Elements To Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__ELEMENTS_TO_SELECT = AXTEXT_DIRECT_EDIT_LABEL__ELEMENTS_TO_SELECT;

	/**
	 * The feature id for the '<em><b>Inverse Selection Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INVERSE_SELECTION_ORDER = AXTEXT_DIRECT_EDIT_LABEL__INVERSE_SELECTION_ORDER;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__MASK = AXTEXT_DIRECT_EDIT_LABEL__MASK;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INITIAL_OPERATION = AXTEXT_DIRECT_EDIT_LABEL__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Input Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INPUT_LABEL_EXPRESSION = AXTEXT_DIRECT_EDIT_LABEL__INPUT_LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID = AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE = AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES = AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xtext Direct Edit Model Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION_FEATURE_COUNT = AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl <em>Xtext Direct Edit Value Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextDirectEditValueDescription()
	 * @generated
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__DOCUMENTATION = AXTEXT_DIRECT_EDIT_LABEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__NAME = AXTEXT_DIRECT_EDIT_LABEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__LABEL = AXTEXT_DIRECT_EDIT_LABEL__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PRECONDITION = AXTEXT_DIRECT_EDIT_LABEL__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Force Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__FORCE_REFRESH = AXTEXT_DIRECT_EDIT_LABEL__FORCE_REFRESH;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__FILTERS = AXTEXT_DIRECT_EDIT_LABEL__FILTERS;

	/**
	 * The feature id for the '<em><b>Elements To Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__ELEMENTS_TO_SELECT = AXTEXT_DIRECT_EDIT_LABEL__ELEMENTS_TO_SELECT;

	/**
	 * The feature id for the '<em><b>Inverse Selection Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INVERSE_SELECTION_ORDER = AXTEXT_DIRECT_EDIT_LABEL__INVERSE_SELECTION_ORDER;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MASK = AXTEXT_DIRECT_EDIT_LABEL__MASK;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INITIAL_OPERATION = AXTEXT_DIRECT_EDIT_LABEL__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Input Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INPUT_LABEL_EXPRESSION = AXTEXT_DIRECT_EDIT_LABEL__INPUT_LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID = AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE = AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xtext Direct Edit Value Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION_FEATURE_COUNT = AXTEXT_DIRECT_EDIT_LABEL_FEATURE_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.AXtextDirectEditLabel <em>AXtext Direct Edit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AXtext Direct Edit Label</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.AXtextDirectEditLabel
	 * @generated
	 */
	EClass getAXtextDirectEditLabel();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription <em>Xtext Direct Edit Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xtext Direct Edit Model Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription
	 * @generated
	 */
	EClass getXtextDirectEditModelDescription();

	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription <em>Xtext Direct Edit Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xtext Direct Edit Value Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription
	 * @generated
	 */
	EClass getXtextDirectEditValueDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramxtextFactory getDiagramxtextFactory();

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
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.AXtextDirectEditLabelImpl <em>AXtext Direct Edit Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.AXtextDirectEditLabelImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getAXtextDirectEditLabel()
		 * @generated
		 */
		EClass AXTEXT_DIRECT_EDIT_LABEL = eINSTANCE.getAXtextDirectEditLabel();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditModelDescriptionImpl <em>Xtext Direct Edit Model Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextDirectEditModelDescription()
		 * @generated
		 */
		EClass XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION = eINSTANCE.getXtextDirectEditModelDescription();

		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl <em>Xtext Direct Edit Value Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextDirectEditValueDescription()
		 * @generated
		 */
		EClass XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION = eINSTANCE.getXtextDirectEditValueDescription();

	}

} //DiagramxtextPackage
