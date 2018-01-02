/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.description.DescriptionPackage;
import org.eclipse.sirius.diagram.description.concern.ConcernPackage;
import org.eclipse.sirius.diagram.description.filter.FilterPackage;
import org.eclipse.sirius.viewpoint.description.style.StylePackage;
import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;
import org.eclipse.sirius.viewpoint.description.validation.ValidationPackage;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.AXtextDirectEditLabel;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;
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
	private EClass aXtextDirectEditLabelEClass = null;

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
		ToolPackage.eINSTANCE.eClass();
		org.eclipse.sirius.diagram.description.tool.ToolPackage.eINSTANCE.eClass();
		XtextsiriusPackage.eINSTANCE.eClass();
		DescriptionPackage.eINSTANCE.eClass();
		StylePackage.eINSTANCE.eClass();
		org.eclipse.sirius.diagram.description.style.StylePackage.eINSTANCE.eClass();
		FilterPackage.eINSTANCE.eClass();
		ConcernPackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		org.eclipse.sirius.viewpoint.description.DescriptionPackage.eINSTANCE.eClass();
		ValidationPackage.eINSTANCE.eClass();

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
	public EClass getAXtextDirectEditLabel() {
		return this.aXtextDirectEditLabelEClass;
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
		this.aXtextDirectEditLabelEClass = createEClass(AXTEXT_DIRECT_EDIT_LABEL);

		this.xtextDirectEditModelDescriptionEClass = createEClass(XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION);

		this.xtextDirectEditValueDescriptionEClass = createEClass(XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION);
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
		final org.eclipse.sirius.diagram.description.tool.ToolPackage theToolPackage_1 = (org.eclipse.sirius.diagram.description.tool.ToolPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.eclipse.sirius.diagram.description.tool.ToolPackage.eNS_URI);
		final DescriptionPackage theDescriptionPackage = (DescriptionPackage) EPackage.Registry.INSTANCE
				.getEPackage(DescriptionPackage.eNS_URI);
		final XtextsiriusPackage theXtextsiriusPackage = (XtextsiriusPackage) EPackage.Registry.INSTANCE
				.getEPackage(XtextsiriusPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		this.aXtextDirectEditLabelEClass.getESuperTypes().add(theToolPackage_1.getDirectEditLabel());
		this.xtextDirectEditModelDescriptionEClass.getESuperTypes().add(getAXtextDirectEditLabel());
		this.xtextDirectEditModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditModelDescription());
		this.xtextDirectEditValueDescriptionEClass.getESuperTypes().add(getAXtextDirectEditLabel());
		this.xtextDirectEditValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditValueDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(this.aXtextDirectEditLabelEClass, AXtextDirectEditLabel.class, "AXtextDirectEditLabel", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(this.aXtextDirectEditLabelEClass, theDescriptionPackage.getDiagramElementMapping(), "getMapping",
				0,
				-1, !IS_UNIQUE, IS_ORDERED);

		initEClass(this.xtextDirectEditModelDescriptionEClass, XtextDirectEditModelDescription.class,
				"XtextDirectEditModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(this.xtextDirectEditValueDescriptionEClass, XtextDirectEditValueDescription.class,
				"XtextDirectEditValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
