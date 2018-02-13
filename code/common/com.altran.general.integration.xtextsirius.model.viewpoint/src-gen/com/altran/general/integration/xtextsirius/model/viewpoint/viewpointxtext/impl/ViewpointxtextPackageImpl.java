/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextFactory;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditValueDescription;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.diagram.DiagramPackage;

import org.eclipse.sirius.diagram.description.concern.ConcernPackage;

import org.eclipse.sirius.diagram.description.filter.FilterPackage;

import org.eclipse.sirius.viewpoint.ViewpointPackage;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

import org.eclipse.sirius.viewpoint.description.style.StylePackage;

import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;

import org.eclipse.sirius.viewpoint.description.validation.ValidationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewpointxtextPackageImpl extends EPackageImpl implements ViewpointxtextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextEdgeLabelDirectEditDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtextEdgeLabelDirectEditModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtextEdgeLabelDirectEditValueDescriptionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewpointxtextPackageImpl() {
		super(eNS_URI, ViewpointxtextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ViewpointxtextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewpointxtextPackage init() {
		if (isInited)
			return (ViewpointxtextPackage) EPackage.Registry.INSTANCE.getEPackage(ViewpointxtextPackage.eNS_URI);

		// Obtain or create and register package
		ViewpointxtextPackageImpl theViewpointxtextPackage = (ViewpointxtextPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ViewpointxtextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ViewpointxtextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XtextsiriusPackage.eINSTANCE.eClass();
		StylePackage.eINSTANCE.eClass();
		DiagramxtextPackage.eINSTANCE.eClass();
		DescriptionPackage.eINSTANCE.eClass();
		ToolPackage.eINSTANCE.eClass();
		org.eclipse.sirius.diagram.description.tool.ToolPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ViewpointPackage.eINSTANCE.eClass();
		org.eclipse.sirius.diagram.description.DescriptionPackage.eINSTANCE.eClass();
		ValidationPackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		FilterPackage.eINSTANCE.eClass();
		ConcernPackage.eINSTANCE.eClass();
		org.eclipse.sirius.diagram.description.style.StylePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViewpointxtextPackage.createPackageContents();

		// Initialize created meta-data
		theViewpointxtextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewpointxtextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewpointxtextPackage.eNS_URI, theViewpointxtextPackage);
		return theViewpointxtextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextEdgeLabelDirectEditDescription() {
		return iXtextEdgeLabelDirectEditDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIXtextEdgeLabelDirectEditDescription_EdgeLabelMappings() {
		return (EReference) iXtextEdgeLabelDirectEditDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXtextEdgeLabelDirectEditModelDescription() {
		return xtextEdgeLabelDirectEditModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXtextEdgeLabelDirectEditValueDescription() {
		return xtextEdgeLabelDirectEditValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewpointxtextFactory getViewpointxtextFactory() {
		return (ViewpointxtextFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		iXtextEdgeLabelDirectEditDescriptionEClass = createEClass(IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION);
		createEReference(iXtextEdgeLabelDirectEditDescriptionEClass,
				IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS);

		xtextEdgeLabelDirectEditModelDescriptionEClass = createEClass(XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION);

		xtextEdgeLabelDirectEditValueDescriptionEClass = createEClass(XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XtextsiriusPackage theXtextsiriusPackage = (XtextsiriusPackage) EPackage.Registry.INSTANCE
				.getEPackage(XtextsiriusPackage.eNS_URI);
		StylePackage theStylePackage = (StylePackage) EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);
		DiagramxtextPackage theDiagramxtextPackage = (DiagramxtextPackage) EPackage.Registry.INSTANCE
				.getEPackage(DiagramxtextPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iXtextEdgeLabelDirectEditDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditDescription());
		xtextEdgeLabelDirectEditModelDescriptionEClass.getESuperTypes()
				.add(theDiagramxtextPackage.getXtextDirectEditModelDescription());
		xtextEdgeLabelDirectEditModelDescriptionEClass.getESuperTypes()
				.add(this.getIXtextEdgeLabelDirectEditDescription());
		xtextEdgeLabelDirectEditValueDescriptionEClass.getESuperTypes()
				.add(theDiagramxtextPackage.getXtextDirectEditValueDescription());
		xtextEdgeLabelDirectEditValueDescriptionEClass.getESuperTypes()
				.add(this.getIXtextEdgeLabelDirectEditDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(iXtextEdgeLabelDirectEditDescriptionEClass, IXtextEdgeLabelDirectEditDescription.class,
				"IXtextEdgeLabelDirectEditDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIXtextEdgeLabelDirectEditDescription_EdgeLabelMappings(),
				theStylePackage.getBasicLabelStyleDescription(), null, "edgeLabelMappings", null, 0, -1,
				IXtextEdgeLabelDirectEditDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xtextEdgeLabelDirectEditModelDescriptionEClass, XtextEdgeLabelDirectEditModelDescription.class,
				"XtextEdgeLabelDirectEditModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xtextEdgeLabelDirectEditValueDescriptionEClass, XtextEdgeLabelDirectEditValueDescription.class,
				"XtextEdgeLabelDirectEditValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation(this, source, new String[] { "Ecore", "http://www.eclipse.org/emf/2002/Ecore", "GenModel",
				"http://www.eclipse.org/emf/2002/GenModel" });
	}

} //ViewpointxtextPackageImpl
