/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.style.StylePackage;
import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;
import org.eclipse.sirius.viewpoint.description.validation.ValidationPackage;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextFactory;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ViewpointxtextPackageImpl extends EPackageImpl implements ViewpointxtextPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextFeatureExtensionDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextDFeatureExtensionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextRepresentationExtensionEClass = null;

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
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewpointxtextPackageImpl() {
		super(eNS_URI, ViewpointxtextFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ViewpointxtextPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewpointxtextPackage init() {
		if (isInited) {
			return (ViewpointxtextPackage) EPackage.Registry.INSTANCE.getEPackage(ViewpointxtextPackage.eNS_URI);
		}

		// Obtain or create and register package
		final ViewpointxtextPackageImpl theViewpointxtextPackage = (ViewpointxtextPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ViewpointxtextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ViewpointxtextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DescriptionPackage.eINSTANCE.eClass();
		StylePackage.eINSTANCE.eClass();
		ViewpointPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ValidationPackage.eINSTANCE.eClass();
		ToolPackage.eINSTANCE.eClass();

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextFeatureExtensionDescription() {
		return this.xtextFeatureExtensionDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getXtextFeatureExtensionDescription_Label() {
		return (EReference) this.xtextFeatureExtensionDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextDFeatureExtension() {
		return this.xtextDFeatureExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getXtextDFeatureExtension_Dumdidum() {
		return (EAttribute) this.xtextDFeatureExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextRepresentationExtension() {
		return this.xtextRepresentationExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getXtextRepresentationExtension_Lalala() {
		return (EAttribute) this.xtextRepresentationExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ViewpointxtextFactory getViewpointxtextFactory() {
		return (ViewpointxtextFactory) getEFactoryInstance();
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
		this.xtextFeatureExtensionDescriptionEClass = createEClass(XTEXT_FEATURE_EXTENSION_DESCRIPTION);
		createEReference(this.xtextFeatureExtensionDescriptionEClass, XTEXT_FEATURE_EXTENSION_DESCRIPTION__LABEL);

		this.xtextDFeatureExtensionEClass = createEClass(XTEXT_DFEATURE_EXTENSION);
		createEAttribute(this.xtextDFeatureExtensionEClass, XTEXT_DFEATURE_EXTENSION__DUMDIDUM);

		this.xtextRepresentationExtensionEClass = createEClass(XTEXT_REPRESENTATION_EXTENSION);
		createEAttribute(this.xtextRepresentationExtensionEClass, XTEXT_REPRESENTATION_EXTENSION__LALALA);
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
		final DescriptionPackage theDescriptionPackage = (DescriptionPackage) EPackage.Registry.INSTANCE
				.getEPackage(DescriptionPackage.eNS_URI);
		final StylePackage theStylePackage = (StylePackage) EPackage.Registry.INSTANCE
				.getEPackage(StylePackage.eNS_URI);
		final ViewpointPackage theViewpointPackage = (ViewpointPackage) EPackage.Registry.INSTANCE
				.getEPackage(ViewpointPackage.eNS_URI);
		final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		this.xtextFeatureExtensionDescriptionEClass.getESuperTypes()
				.add(theDescriptionPackage.getFeatureExtensionDescription());
		this.xtextDFeatureExtensionEClass.getESuperTypes().add(theViewpointPackage.getDFeatureExtension());
		this.xtextRepresentationExtensionEClass.getESuperTypes()
				.add(theDescriptionPackage.getRepresentationExtensionDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(this.xtextFeatureExtensionDescriptionEClass, XtextFeatureExtensionDescription.class,
				"XtextFeatureExtensionDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXtextFeatureExtensionDescription_Label(), theStylePackage.getBasicLabelStyleDescription(),
				null, "label", null, 0, 1, XtextFeatureExtensionDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(this.xtextDFeatureExtensionEClass, XtextDFeatureExtension.class, "XtextDFeatureExtension",
				!IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXtextDFeatureExtension_Dumdidum(), theEcorePackage.getEString(), "dumdidum", null, 0, 1,
				XtextDFeatureExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(this.xtextRepresentationExtensionEClass, XtextRepresentationExtension.class,
				"XtextRepresentationExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXtextRepresentationExtension_Lalala(), theEcorePackage.getEString(), "lalala", null, 0, 1,
				XtextRepresentationExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} // ViewpointxtextPackageImpl
