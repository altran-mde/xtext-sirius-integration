/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.sirius.diagram.description.style.StylePackage;
import org.eclipse.sirius.diagram.description.tool.ToolPackage;

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
 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory
 * @model kind="package" annotation="http://www.eclipse.org/emf/2002/GenModel
 *        modelName='Diagram-xtext'
 *        modelPluginID='com.altran.general.integration.xtextsirius.model.diagram'
 *        complianceLevel='6.0' runtimeVersion='2.3' nonNLSMarkers='false'
 *        copyrightFields='false' creationIcons='false'
 *        modelDirectory='/com.altran.general.integration.xtextsirius.model.diagram/src-gen'
 *        editDirectory='/com.altran.general.integration.xtextsirius.model.diagram.edit/src-gen'
 *        editPluginID='com.altran.general.integration.xtextsirius.mode.diagram.edit'
 *        codeFormatting='true' importOrganizing='true' cleanup='true'
 *        styleProviders='true' disposableProviderFactory='true'
 *        extensibleProviderFactory='true' childCreationExtenders='true'
 *        basePackage='com.altran.general.integration.xtextsirius.model.diagram'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore
 *        Ecore='http://www.eclipse.org/emf/2002/Ecore'
 *        GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface DiagramxtextPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "diagramxtext";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://altran.com/general/integration/xtextsirius/model/diagram/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "diagram-xtext";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	DiagramxtextPackage eINSTANCE = com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl
			.init();

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription
	 * <em>IXtext Direct Edit Model Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getIXtextDirectEditModelDescription()
	 * @generated
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID = XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__INJECTOR_ID;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE = XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES = XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>IXtext Direct Edit Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION_FEATURE_COUNT = XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditModelDescriptionImpl
	 * <em>Xtext Direct Edit Model Description</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextDirectEditModelDescription()
	 * @generated
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__DOCUMENTATION = ToolPackage.DIRECT_EDIT_LABEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__NAME = ToolPackage.DIRECT_EDIT_LABEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__LABEL = ToolPackage.DIRECT_EDIT_LABEL__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__PRECONDITION = ToolPackage.DIRECT_EDIT_LABEL__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Force Refresh</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__FORCE_REFRESH = ToolPackage.DIRECT_EDIT_LABEL__FORCE_REFRESH;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__FILTERS = ToolPackage.DIRECT_EDIT_LABEL__FILTERS;

	/**
	 * The feature id for the '<em><b>Elements To Select</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__ELEMENTS_TO_SELECT = ToolPackage.DIRECT_EDIT_LABEL__ELEMENTS_TO_SELECT;

	/**
	 * The feature id for the '<em><b>Inverse Selection Order</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INVERSE_SELECTION_ORDER = ToolPackage.DIRECT_EDIT_LABEL__INVERSE_SELECTION_ORDER;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__MASK = ToolPackage.DIRECT_EDIT_LABEL__MASK;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INITIAL_OPERATION = ToolPackage.DIRECT_EDIT_LABEL__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Input Label Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INPUT_LABEL_EXPRESSION = ToolPackage.DIRECT_EDIT_LABEL__INPUT_LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xtext Direct Edit Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION_FEATURE_COUNT = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl
	 * <em>Xtext Direct Edit Value Description</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextDirectEditValueDescription()
	 * @generated
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__DOCUMENTATION = ToolPackage.DIRECT_EDIT_LABEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__NAME = ToolPackage.DIRECT_EDIT_LABEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__LABEL = ToolPackage.DIRECT_EDIT_LABEL__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PRECONDITION = ToolPackage.DIRECT_EDIT_LABEL__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Force Refresh</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__FORCE_REFRESH = ToolPackage.DIRECT_EDIT_LABEL__FORCE_REFRESH;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__FILTERS = ToolPackage.DIRECT_EDIT_LABEL__FILTERS;

	/**
	 * The feature id for the '<em><b>Elements To Select</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__ELEMENTS_TO_SELECT = ToolPackage.DIRECT_EDIT_LABEL__ELEMENTS_TO_SELECT;

	/**
	 * The feature id for the '<em><b>Inverse Selection Order</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INVERSE_SELECTION_ORDER = ToolPackage.DIRECT_EDIT_LABEL__INVERSE_SELECTION_ORDER;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MASK = ToolPackage.DIRECT_EDIT_LABEL__MASK;

	/**
	 * The feature id for the '<em><b>Initial Operation</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INITIAL_OPERATION = ToolPackage.DIRECT_EDIT_LABEL__INITIAL_OPERATION;

	/**
	 * The feature id for the '<em><b>Input Label Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INPUT_LABEL_EXPRESSION = ToolPackage.DIRECT_EDIT_LABEL__INPUT_LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xtext Direct Edit Value
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION_FEATURE_COUNT = ToolPackage.DIRECT_EDIT_LABEL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextBeginLabelStyleModelDescriptionImpl
	 * <em>Xtext Begin Label Style Model Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextBeginLabelStyleModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextBeginLabelStyleModelDescription()
	 * @generated
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Label Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_SIZE = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__LABEL_SIZE;

	/**
	 * The feature id for the '<em><b>Label Format</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_FORMAT = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Show Icon</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION__SHOW_ICON = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__SHOW_ICON;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_EXPRESSION = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_COLOR = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION__ICON_PATH = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION__INJECTOR_ID = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION__MULTI_LINE = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION__EDITABLE_FEATURES = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>Xtext Begin Label Style
	 * Model Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION_FEATURE_COUNT = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 3;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextBeginLabelStyleValueDescriptionImpl
	 * <em>Xtext Begin Label Style Value Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextBeginLabelStyleValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextBeginLabelStyleValueDescription()
	 * @generated
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Label Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_SIZE = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__LABEL_SIZE;

	/**
	 * The feature id for the '<em><b>Label Format</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_FORMAT = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Show Icon</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__SHOW_ICON = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__SHOW_ICON;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_EXPRESSION = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_COLOR = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__ICON_PATH = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__INJECTOR_ID = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__MULTI_LINE = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 3;

	/**
	 * The number of structural features of the '<em>Xtext Begin Label Style
	 * Value Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION_FEATURE_COUNT = StylePackage.BEGIN_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 4;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextCenterLabelStyleModelDescriptionImpl
	 * <em>Xtext Center Label Style Model Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextCenterLabelStyleModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextCenterLabelStyleModelDescription()
	 * @generated
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Label Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_SIZE = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__LABEL_SIZE;

	/**
	 * The feature id for the '<em><b>Label Format</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_FORMAT = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Show Icon</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION__SHOW_ICON = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__SHOW_ICON;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_EXPRESSION = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_COLOR = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION__ICON_PATH = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION__INJECTOR_ID = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION__MULTI_LINE = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION__EDITABLE_FEATURES = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>Xtext Center Label Style
	 * Model Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION_FEATURE_COUNT = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 3;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextCenterLabelStyleValueDescriptionImpl
	 * <em>Xtext Center Label Style Value Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextCenterLabelStyleValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextCenterLabelStyleValueDescription()
	 * @generated
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Label Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_SIZE = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__LABEL_SIZE;

	/**
	 * The feature id for the '<em><b>Label Format</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_FORMAT = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Show Icon</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__SHOW_ICON = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__SHOW_ICON;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_EXPRESSION = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_COLOR = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__ICON_PATH = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__INJECTOR_ID = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__MULTI_LINE = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 3;

	/**
	 * The number of structural features of the '<em>Xtext Center Label Style
	 * Value Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION_FEATURE_COUNT = StylePackage.CENTER_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 4;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextEndLabelStyleModelDescriptionImpl
	 * <em>Xtext End Label Style Model Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextEndLabelStyleModelDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextEndLabelStyleModelDescription()
	 * @generated
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Label Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_SIZE = StylePackage.END_LABEL_STYLE_DESCRIPTION__LABEL_SIZE;

	/**
	 * The feature id for the '<em><b>Label Format</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_FORMAT = StylePackage.END_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Show Icon</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__SHOW_ICON = StylePackage.END_LABEL_STYLE_DESCRIPTION__SHOW_ICON;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_EXPRESSION = StylePackage.END_LABEL_STYLE_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__LABEL_COLOR = StylePackage.END_LABEL_STYLE_DESCRIPTION__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__ICON_PATH = StylePackage.END_LABEL_STYLE_DESCRIPTION__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__INJECTOR_ID = StylePackage.END_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__MULTI_LINE = StylePackage.END_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Editable Features</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__EDITABLE_FEATURES = StylePackage.END_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>Xtext End Label Style Model
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION_FEATURE_COUNT = StylePackage.END_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 3;

	/**
	 * The meta object id for the
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextEndLabelStyleValueDescriptionImpl
	 * <em>Xtext End Label Style Value Description</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextEndLabelStyleValueDescriptionImpl
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextEndLabelStyleValueDescription()
	 * @generated
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Label Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_SIZE = StylePackage.END_LABEL_STYLE_DESCRIPTION__LABEL_SIZE;

	/**
	 * The feature id for the '<em><b>Label Format</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_FORMAT = StylePackage.END_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Show Icon</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__SHOW_ICON = StylePackage.END_LABEL_STYLE_DESCRIPTION__SHOW_ICON;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_EXPRESSION = StylePackage.END_LABEL_STYLE_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Color</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__LABEL_COLOR = StylePackage.END_LABEL_STYLE_DESCRIPTION__LABEL_COLOR;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__ICON_PATH = StylePackage.END_LABEL_STYLE_DESCRIPTION__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Injector Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__INJECTOR_ID = StylePackage.END_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__MULTI_LINE = StylePackage.END_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION = StylePackage.END_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION = StylePackage.END_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 3;

	/**
	 * The number of structural features of the '<em>Xtext End Label Style Value
	 * Description</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION_FEATURE_COUNT = StylePackage.END_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT
			+ 4;


	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription
	 * <em>IXtext Direct Edit Model Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IXtext Direct Edit Model
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription
	 * @generated
	 */
	EClass getIXtextDirectEditModelDescription();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription#getEditableFeatures
	 * <em>Editable Features</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute list '<em>Editable
	 *         Features</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription#getEditableFeatures()
	 * @see #getIXtextDirectEditModelDescription()
	 * @generated
	 */
	EAttribute getIXtextDirectEditModelDescription_EditableFeatures();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription
	 * <em>Xtext Direct Edit Model Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Direct Edit Model
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription
	 * @generated
	 */
	EClass getXtextDirectEditModelDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription
	 * <em>Xtext Direct Edit Value Description</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Direct Edit Value
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription
	 * @generated
	 */
	EClass getXtextDirectEditValueDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleModelDescription
	 * <em>Xtext Begin Label Style Model Description</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Begin Label Style Model
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleModelDescription
	 * @generated
	 */
	EClass getXtextBeginLabelStyleModelDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleValueDescription
	 * <em>Xtext Begin Label Style Value Description</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Begin Label Style Value
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleValueDescription
	 * @generated
	 */
	EClass getXtextBeginLabelStyleValueDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleModelDescription
	 * <em>Xtext Center Label Style Model Description</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Center Label Style Model
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleModelDescription
	 * @generated
	 */
	EClass getXtextCenterLabelStyleModelDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleValueDescription
	 * <em>Xtext Center Label Style Value Description</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext Center Label Style Value
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleValueDescription
	 * @generated
	 */
	EClass getXtextCenterLabelStyleValueDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription
	 * <em>Xtext End Label Style Model Description</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext End Label Style Model
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription
	 * @generated
	 */
	EClass getXtextEndLabelStyleModelDescription();

	/**
	 * Returns the meta object for class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleValueDescription
	 * <em>Xtext End Label Style Value Description</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Xtext End Label Style Value
	 *         Description</em>'.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleValueDescription
	 * @generated
	 */
	EClass getXtextEndLabelStyleValueDescription();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramxtextFactory getDiagramxtextFactory();

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
		 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription
		 * <em>IXtext Direct Edit Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getIXtextDirectEditModelDescription()
		 * @generated
		 */
		EClass IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION = eINSTANCE.getIXtextDirectEditModelDescription();

		/**
		 * The meta object literal for the '<em><b>Editable Features</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES = eINSTANCE
				.getIXtextDirectEditModelDescription_EditableFeatures();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditModelDescriptionImpl
		 * <em>Xtext Direct Edit Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextDirectEditModelDescription()
		 * @generated
		 */
		EClass XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION = eINSTANCE.getXtextDirectEditModelDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl
		 * <em>Xtext Direct Edit Value Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextDirectEditValueDescription()
		 * @generated
		 */
		EClass XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION = eINSTANCE.getXtextDirectEditValueDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextBeginLabelStyleModelDescriptionImpl
		 * <em>Xtext Begin Label Style Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextBeginLabelStyleModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextBeginLabelStyleModelDescription()
		 * @generated
		 */
		EClass XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION = eINSTANCE.getXtextBeginLabelStyleModelDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextBeginLabelStyleValueDescriptionImpl
		 * <em>Xtext Begin Label Style Value Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextBeginLabelStyleValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextBeginLabelStyleValueDescription()
		 * @generated
		 */
		EClass XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION = eINSTANCE.getXtextBeginLabelStyleValueDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextCenterLabelStyleModelDescriptionImpl
		 * <em>Xtext Center Label Style Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextCenterLabelStyleModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextCenterLabelStyleModelDescription()
		 * @generated
		 */
		EClass XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION = eINSTANCE.getXtextCenterLabelStyleModelDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextCenterLabelStyleValueDescriptionImpl
		 * <em>Xtext Center Label Style Value Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextCenterLabelStyleValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextCenterLabelStyleValueDescription()
		 * @generated
		 */
		EClass XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION = eINSTANCE.getXtextCenterLabelStyleValueDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextEndLabelStyleModelDescriptionImpl
		 * <em>Xtext End Label Style Model Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextEndLabelStyleModelDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextEndLabelStyleModelDescription()
		 * @generated
		 */
		EClass XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION = eINSTANCE.getXtextEndLabelStyleModelDescription();

		/**
		 * The meta object literal for the
		 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextEndLabelStyleValueDescriptionImpl
		 * <em>Xtext End Label Style Value Description</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextEndLabelStyleValueDescriptionImpl
		 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextPackageImpl#getXtextEndLabelStyleValueDescription()
		 * @generated
		 */
		EClass XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION = eINSTANCE.getXtextEndLabelStyleValueDescription();

	}

} // DiagramxtextPackage
