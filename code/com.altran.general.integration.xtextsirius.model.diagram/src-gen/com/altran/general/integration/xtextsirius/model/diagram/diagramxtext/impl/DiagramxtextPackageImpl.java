/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.description.concern.ConcernPackage;
import org.eclipse.sirius.diagram.description.filter.FilterPackage;
import org.eclipse.sirius.diagram.description.style.StylePackage;
import org.eclipse.sirius.diagram.description.tool.ToolPackage;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.validation.ValidationPackage;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DiagramxtextPackageImpl extends EPackageImpl implements DiagramxtextPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iXtextDirectEditModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextDirectEditModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextDirectEditValueDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextBeginLabelStyleModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextBeginLabelStyleValueDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextCenterLabelStyleModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextCenterLabelStyleValueDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextEndLabelStyleModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextEndLabelStyleValueDescriptionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagramxtextPackageImpl() {
		super(eNS_URI, DiagramxtextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link DiagramxtextPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagramxtextPackage init() {
		if (isInited) {
			return (DiagramxtextPackage) EPackage.Registry.INSTANCE.getEPackage(DiagramxtextPackage.eNS_URI);
		}

		// Obtain or create and register package
		final DiagramxtextPackageImpl theDiagramxtextPackage = (DiagramxtextPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DiagramxtextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new DiagramxtextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XtextsiriusPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ToolPackage.eINSTANCE.eClass();
		DescriptionPackage.eINSTANCE.eClass();
		org.eclipse.sirius.viewpoint.description.tool.ToolPackage.eINSTANCE.eClass();
		StylePackage.eINSTANCE.eClass();
		org.eclipse.sirius.viewpoint.description.style.StylePackage.eINSTANCE.eClass();
		org.eclipse.sirius.diagram.description.DescriptionPackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		ValidationPackage.eINSTANCE.eClass();
		ViewpointPackage.eINSTANCE.eClass();
		FilterPackage.eINSTANCE.eClass();
		ConcernPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDiagramxtextPackage.createPackageContents();

		// Initialize created meta-data
		theDiagramxtextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagramxtextPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagramxtextPackage.eNS_URI, theDiagramxtextPackage);
		return theDiagramxtextPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getIXtextDirectEditModelDescription() {
		return this.iXtextDirectEditModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getIXtextDirectEditModelDescription_EditableFeatures() {
		return (EAttribute) this.iXtextDirectEditModelDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextDirectEditModelDescription() {
		return this.xtextDirectEditModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextDirectEditValueDescription() {
		return this.xtextDirectEditValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextBeginLabelStyleModelDescription() {
		return this.xtextBeginLabelStyleModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextBeginLabelStyleValueDescription() {
		return this.xtextBeginLabelStyleValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextCenterLabelStyleModelDescription() {
		return this.xtextCenterLabelStyleModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextCenterLabelStyleValueDescription() {
		return this.xtextCenterLabelStyleValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextEndLabelStyleModelDescription() {
		return this.xtextEndLabelStyleModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextEndLabelStyleValueDescription() {
		return this.xtextEndLabelStyleValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public DiagramxtextFactory getDiagramxtextFactory() {
		return (DiagramxtextFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (this.isCreated) {
			return;
		}
		this.isCreated = true;

		// Create classes and their features
		this.iXtextDirectEditModelDescriptionEClass = createEClass(IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION);
		createEAttribute(this.iXtextDirectEditModelDescriptionEClass,
				IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES);

		this.xtextDirectEditModelDescriptionEClass = createEClass(XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION);

		this.xtextDirectEditValueDescriptionEClass = createEClass(XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION);

		this.xtextBeginLabelStyleModelDescriptionEClass = createEClass(XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION);

		this.xtextBeginLabelStyleValueDescriptionEClass = createEClass(XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION);

		this.xtextCenterLabelStyleModelDescriptionEClass = createEClass(XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION);

		this.xtextCenterLabelStyleValueDescriptionEClass = createEClass(XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION);

		this.xtextEndLabelStyleModelDescriptionEClass = createEClass(XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION);

		this.xtextEndLabelStyleValueDescriptionEClass = createEClass(XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (this.isInitialized) {
			return;
		}
		this.isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		final XtextsiriusPackage theXtextsiriusPackage = (XtextsiriusPackage) EPackage.Registry.INSTANCE
				.getEPackage(XtextsiriusPackage.eNS_URI);
		final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);
		final ToolPackage theToolPackage = (ToolPackage) EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI);
		final StylePackage theStylePackage = (StylePackage) EPackage.Registry.INSTANCE
				.getEPackage(StylePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		this.iXtextDirectEditModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditDescription());
		this.iXtextDirectEditModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextModelDescription());
		this.xtextDirectEditModelDescriptionEClass.getESuperTypes().add(theToolPackage.getDirectEditLabel());
		this.xtextDirectEditModelDescriptionEClass.getESuperTypes().add(getIXtextDirectEditModelDescription());
		this.xtextDirectEditValueDescriptionEClass.getESuperTypes().add(theToolPackage.getDirectEditLabel());
		this.xtextDirectEditValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditDescription());
		this.xtextDirectEditValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextValueDescription());
		this.xtextBeginLabelStyleModelDescriptionEClass.getESuperTypes()
				.add(theStylePackage.getBeginLabelStyleDescription());
		this.xtextBeginLabelStyleModelDescriptionEClass.getESuperTypes().add(getIXtextDirectEditModelDescription());
		this.xtextBeginLabelStyleValueDescriptionEClass.getESuperTypes()
				.add(theStylePackage.getBeginLabelStyleDescription());
		this.xtextBeginLabelStyleValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditDescription());
		this.xtextBeginLabelStyleValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextValueDescription());
		this.xtextCenterLabelStyleModelDescriptionEClass.getESuperTypes()
				.add(theStylePackage.getCenterLabelStyleDescription());
		this.xtextCenterLabelStyleModelDescriptionEClass.getESuperTypes().add(getIXtextDirectEditModelDescription());
		this.xtextCenterLabelStyleValueDescriptionEClass.getESuperTypes()
				.add(theStylePackage.getCenterLabelStyleDescription());
		this.xtextCenterLabelStyleValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditDescription());
		this.xtextCenterLabelStyleValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextValueDescription());
		this.xtextEndLabelStyleModelDescriptionEClass.getESuperTypes()
				.add(theStylePackage.getEndLabelStyleDescription());
		this.xtextEndLabelStyleModelDescriptionEClass.getESuperTypes().add(getIXtextDirectEditModelDescription());
		this.xtextEndLabelStyleValueDescriptionEClass.getESuperTypes()
				.add(theStylePackage.getEndLabelStyleDescription());
		this.xtextEndLabelStyleValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditDescription());
		this.xtextEndLabelStyleValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextValueDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(this.iXtextDirectEditModelDescriptionEClass, IXtextDirectEditModelDescription.class,
				"IXtextDirectEditModelDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIXtextDirectEditModelDescription_EditableFeatures(), theEcorePackage.getEString(),
				"editableFeatures", null, 0, -1, IXtextDirectEditModelDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(this.xtextDirectEditModelDescriptionEClass, XtextDirectEditModelDescription.class,
				"XtextDirectEditModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(this.xtextDirectEditValueDescriptionEClass, XtextDirectEditValueDescription.class,
				"XtextDirectEditValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(this.xtextBeginLabelStyleModelDescriptionEClass, XtextBeginLabelStyleModelDescription.class,
				"XtextBeginLabelStyleModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(this.xtextBeginLabelStyleValueDescriptionEClass, XtextBeginLabelStyleValueDescription.class,
				"XtextBeginLabelStyleValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(this.xtextCenterLabelStyleModelDescriptionEClass, XtextCenterLabelStyleModelDescription.class,
				"XtextCenterLabelStyleModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(this.xtextCenterLabelStyleValueDescriptionEClass, XtextCenterLabelStyleValueDescription.class,
				"XtextCenterLabelStyleValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(this.xtextEndLabelStyleModelDescriptionEClass, XtextEndLabelStyleModelDescription.class,
				"XtextEndLabelStyleModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(this.xtextEndLabelStyleValueDescriptionEClass, XtextEndLabelStyleValueDescription.class,
				"XtextEndLabelStyleValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/emf/2011/Xcore</b>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		final String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation(this,
				source,
				new String[] {
						"Ecore", "http://www.eclipse.org/emf/2002/Ecore",
						"GenModel", "http://www.eclipse.org/emf/2002/GenModel"
				});
	}

} // DiagramxtextPackageImpl
