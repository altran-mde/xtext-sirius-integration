/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import org.eclipse.eef.EefPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextFactory;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EefxtextPackageImpl extends EPackageImpl implements EefxtextPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefXtextDescriptionEClass = null;

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
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EefxtextPackageImpl() {
		super(eNS_URI, EefxtextFactory.eINSTANCE);
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
	 * This method is used to initialize {@link EefxtextPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EefxtextPackage init() {
		if (isInited) {
			return (EefxtextPackage) EPackage.Registry.INSTANCE.getEPackage(EefxtextPackage.eNS_URI);
		}

		// Obtain or create and register package
		final EefxtextPackageImpl theEefxtextPackage = (EefxtextPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EefxtextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new EefxtextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EefPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEefxtextPackage.createPackageContents();

		// Initialize created meta-data
		theEefxtextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEefxtextPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EefxtextPackage.eNS_URI, theEefxtextPackage);
		return theEefxtextPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEefXtextDescription() {
		return this.eefXtextDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEefXtextDescription_Language() {
		return (EAttribute) this.eefXtextDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EefxtextFactory getEefxtextFactory() {
		return (EefxtextFactory) getEFactoryInstance();
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
		this.eefXtextDescriptionEClass = createEClass(EEF_XTEXT_DESCRIPTION);
		createEAttribute(this.eefXtextDescriptionEClass, EEF_XTEXT_DESCRIPTION__LANGUAGE);
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
		final EefPackage theEefPackage = (EefPackage) EPackage.Registry.INSTANCE.getEPackage(EefPackage.eNS_URI);
		final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		this.eefXtextDescriptionEClass.getESuperTypes().add(theEefPackage.getEEFTextDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(this.eefXtextDescriptionEClass, EefXtextDescription.class, "EefXtextDescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEefXtextDescription_Language(), theEcorePackage.getEString(), "language", null, 0, 1,
				EefXtextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
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

} // EefxtextPackageImpl
