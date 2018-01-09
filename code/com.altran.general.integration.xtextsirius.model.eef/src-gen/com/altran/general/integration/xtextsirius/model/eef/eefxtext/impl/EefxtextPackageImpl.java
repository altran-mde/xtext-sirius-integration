/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineValueDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextFactory;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription;

import org.eclipse.eef.EefPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefxtextPackageImpl extends EPackageImpl implements EefxtextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEefXtextDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEefXtextModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEefXtextValueDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEefXtextPropertyDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefXtextSingleLineModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefXtextMultiLineModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefXtextSingleLineValueDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefXtextMultiLineValueDescriptionEClass = null;

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
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EefxtextPackageImpl() {
		super(eNS_URI, EefxtextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EefxtextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EefxtextPackage init() {
		if (isInited)
			return (EefxtextPackage) EPackage.Registry.INSTANCE.getEPackage(EefxtextPackage.eNS_URI);

		// Obtain or create and register package
		EefxtextPackageImpl theEefxtextPackage = (EefxtextPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EefxtextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new EefxtextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EefPackage.eINSTANCE.eClass();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIEefXtextDescription() {
		return iEefXtextDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextDescription_InjectorId() {
		return (EAttribute) iEefXtextDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextDescription_MultiLine() {
		return (EAttribute) iEefXtextDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIEefXtextModelDescription() {
		return iEefXtextModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextModelDescription_EditableFeatures() {
		return (EAttribute) iEefXtextModelDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIEefXtextValueDescription() {
		return iEefXtextValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextValueDescription_PrefixTextExpression() {
		return (EAttribute) iEefXtextValueDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextValueDescription_SuffixTextExpression() {
		return (EAttribute) iEefXtextValueDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIEefXtextPropertyDescription() {
		return iEefXtextPropertyDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEefXtextSingleLineModelDescription() {
		return eefXtextSingleLineModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEefXtextMultiLineModelDescription() {
		return eefXtextMultiLineModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEefXtextSingleLineValueDescription() {
		return eefXtextSingleLineValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEefXtextMultiLineValueDescription() {
		return eefXtextMultiLineValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EefxtextFactory getEefxtextFactory() {
		return (EefxtextFactory) getEFactoryInstance();
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
		iEefXtextDescriptionEClass = createEClass(IEEF_XTEXT_DESCRIPTION);
		createEAttribute(iEefXtextDescriptionEClass, IEEF_XTEXT_DESCRIPTION__INJECTOR_ID);
		createEAttribute(iEefXtextDescriptionEClass, IEEF_XTEXT_DESCRIPTION__MULTI_LINE);

		iEefXtextModelDescriptionEClass = createEClass(IEEF_XTEXT_MODEL_DESCRIPTION);
		createEAttribute(iEefXtextModelDescriptionEClass, IEEF_XTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES);

		iEefXtextValueDescriptionEClass = createEClass(IEEF_XTEXT_VALUE_DESCRIPTION);
		createEAttribute(iEefXtextValueDescriptionEClass, IEEF_XTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION);
		createEAttribute(iEefXtextValueDescriptionEClass, IEEF_XTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION);

		iEefXtextPropertyDescriptionEClass = createEClass(IEEF_XTEXT_PROPERTY_DESCRIPTION);

		eefXtextSingleLineModelDescriptionEClass = createEClass(EEF_XTEXT_SINGLE_LINE_MODEL_DESCRIPTION);

		eefXtextMultiLineModelDescriptionEClass = createEClass(EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION);

		eefXtextSingleLineValueDescriptionEClass = createEClass(EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION);

		eefXtextMultiLineValueDescriptionEClass = createEClass(EEF_XTEXT_MULTI_LINE_VALUE_DESCRIPTION);
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
		EefPackage theEefPackage = (EefPackage) EPackage.Registry.INSTANCE.getEPackage(EefPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iEefXtextDescriptionEClass.getESuperTypes().add(theEefPackage.getEEFTextDescription());
		iEefXtextModelDescriptionEClass.getESuperTypes().add(this.getIEefXtextDescription());
		iEefXtextValueDescriptionEClass.getESuperTypes().add(this.getIEefXtextDescription());
		iEefXtextPropertyDescriptionEClass.getESuperTypes().add(this.getIEefXtextDescription());
		eefXtextSingleLineModelDescriptionEClass.getESuperTypes().add(this.getIEefXtextPropertyDescription());
		eefXtextSingleLineModelDescriptionEClass.getESuperTypes().add(this.getIEefXtextModelDescription());
		eefXtextMultiLineModelDescriptionEClass.getESuperTypes().add(this.getIEefXtextPropertyDescription());
		eefXtextMultiLineModelDescriptionEClass.getESuperTypes().add(this.getIEefXtextModelDescription());
		eefXtextSingleLineValueDescriptionEClass.getESuperTypes().add(this.getIEefXtextPropertyDescription());
		eefXtextSingleLineValueDescriptionEClass.getESuperTypes().add(this.getIEefXtextValueDescription());
		eefXtextMultiLineValueDescriptionEClass.getESuperTypes().add(this.getIEefXtextPropertyDescription());
		eefXtextMultiLineValueDescriptionEClass.getESuperTypes().add(this.getIEefXtextValueDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(iEefXtextDescriptionEClass, IEefXtextDescription.class, "IEefXtextDescription", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEefXtextDescription_InjectorId(), theEcorePackage.getEString(), "injectorId", null, 0, 1,
				IEefXtextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEefXtextDescription_MultiLine(), theEcorePackage.getEBoolean(), "multiLine", null, 0, 1,
				IEefXtextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iEefXtextModelDescriptionEClass, IEefXtextModelDescription.class, "IEefXtextModelDescription",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEefXtextModelDescription_EditableFeatures(), theEcorePackage.getEString(),
				"editableFeatures", null, 0, -1, IEefXtextModelDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iEefXtextValueDescriptionEClass, IEefXtextValueDescription.class, "IEefXtextValueDescription",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEefXtextValueDescription_PrefixTextExpression(), theEcorePackage.getEString(),
				"prefixTextExpression", null, 0, 1, IEefXtextValueDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEefXtextValueDescription_SuffixTextExpression(), theEcorePackage.getEString(),
				"suffixTextExpression", null, 0, 1, IEefXtextValueDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iEefXtextPropertyDescriptionEClass, IEefXtextPropertyDescription.class,
				"IEefXtextPropertyDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefXtextSingleLineModelDescriptionEClass, EefXtextSingleLineModelDescription.class,
				"EefXtextSingleLineModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefXtextMultiLineModelDescriptionEClass, EefXtextMultiLineModelDescription.class,
				"EefXtextMultiLineModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefXtextSingleLineValueDescriptionEClass, EefXtextSingleLineValueDescription.class,
				"EefXtextSingleLineValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefXtextMultiLineValueDescriptionEClass, EefXtextMultiLineValueDescription.class,
				"EefXtextMultiLineValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //EefxtextPackageImpl
