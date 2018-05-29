/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import org.eclipse.eef.EefPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass iEefXtextDescriptionEClass = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iEefXtextModelDescriptionEClass = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iEefXtextValueDescriptionEClass = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iEefXtextPropertyDescriptionEClass = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eefXtextSingleLineModelDescriptionEClass = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eefXtextMultiLineModelDescriptionEClass = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eefXtextSingleLineValueDescriptionEClass = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eefXtextMultiLineValueDescriptionEClass = null;
	
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
	public EClass getIEefXtextDescription() {
		return this.iEefXtextDescriptionEClass;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextDescription_InjectorId() {
		return (EAttribute) this.iEefXtextDescriptionEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextDescription_MultiLine() {
		return (EAttribute) this.iEefXtextDescriptionEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIEefXtextModelDescription() {
		return this.iEefXtextModelDescriptionEClass;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextModelDescription_EditableFeatures() {
		return (EAttribute) this.iEefXtextModelDescriptionEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIEefXtextValueDescription() {
		return this.iEefXtextValueDescriptionEClass;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextValueDescription_PrefixTextExpression() {
		return (EAttribute) this.iEefXtextValueDescriptionEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIEefXtextValueDescription_SuffixTextExpression() {
		return (EAttribute) this.iEefXtextValueDescriptionEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIEefXtextPropertyDescription() {
		return this.iEefXtextPropertyDescriptionEClass;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEefXtextSingleLineModelDescription() {
		return this.eefXtextSingleLineModelDescriptionEClass;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEefXtextMultiLineModelDescription() {
		return this.eefXtextMultiLineModelDescriptionEClass;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEefXtextSingleLineValueDescription() {
		return this.eefXtextSingleLineValueDescriptionEClass;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEefXtextMultiLineValueDescription() {
		return this.eefXtextMultiLineValueDescriptionEClass;
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
		this.iEefXtextDescriptionEClass = createEClass(IEEF_XTEXT_DESCRIPTION);
		createEAttribute(this.iEefXtextDescriptionEClass, IEEF_XTEXT_DESCRIPTION__INJECTOR_ID);
		createEAttribute(this.iEefXtextDescriptionEClass, IEEF_XTEXT_DESCRIPTION__MULTI_LINE);
		
		this.iEefXtextModelDescriptionEClass = createEClass(IEEF_XTEXT_MODEL_DESCRIPTION);
		createEAttribute(this.iEefXtextModelDescriptionEClass, IEEF_XTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES);
		
		this.iEefXtextValueDescriptionEClass = createEClass(IEEF_XTEXT_VALUE_DESCRIPTION);
		createEAttribute(this.iEefXtextValueDescriptionEClass, IEEF_XTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION);
		createEAttribute(this.iEefXtextValueDescriptionEClass, IEEF_XTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION);
		
		this.iEefXtextPropertyDescriptionEClass = createEClass(IEEF_XTEXT_PROPERTY_DESCRIPTION);
		
		this.eefXtextSingleLineModelDescriptionEClass = createEClass(EEF_XTEXT_SINGLE_LINE_MODEL_DESCRIPTION);
		
		this.eefXtextMultiLineModelDescriptionEClass = createEClass(EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION);
		
		this.eefXtextSingleLineValueDescriptionEClass = createEClass(EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION);
		
		this.eefXtextMultiLineValueDescriptionEClass = createEClass(EEF_XTEXT_MULTI_LINE_VALUE_DESCRIPTION);
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
		this.iEefXtextDescriptionEClass.getESuperTypes().add(theEefPackage.getEEFTextDescription());
		this.iEefXtextModelDescriptionEClass.getESuperTypes().add(getIEefXtextDescription());
		this.iEefXtextValueDescriptionEClass.getESuperTypes().add(getIEefXtextDescription());
		this.iEefXtextPropertyDescriptionEClass.getESuperTypes().add(getIEefXtextDescription());
		this.eefXtextSingleLineModelDescriptionEClass.getESuperTypes().add(getIEefXtextPropertyDescription());
		this.eefXtextSingleLineModelDescriptionEClass.getESuperTypes().add(getIEefXtextModelDescription());
		this.eefXtextMultiLineModelDescriptionEClass.getESuperTypes().add(getIEefXtextPropertyDescription());
		this.eefXtextMultiLineModelDescriptionEClass.getESuperTypes().add(getIEefXtextModelDescription());
		this.eefXtextSingleLineValueDescriptionEClass.getESuperTypes().add(getIEefXtextPropertyDescription());
		this.eefXtextSingleLineValueDescriptionEClass.getESuperTypes().add(getIEefXtextValueDescription());
		this.eefXtextMultiLineValueDescriptionEClass.getESuperTypes().add(getIEefXtextPropertyDescription());
		this.eefXtextMultiLineValueDescriptionEClass.getESuperTypes().add(getIEefXtextValueDescription());
		
		// Initialize classes and features; add operations and parameters
		initEClass(this.iEefXtextDescriptionEClass, IEefXtextDescription.class, "IEefXtextDescription", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEefXtextDescription_InjectorId(), theEcorePackage.getEString(), "injectorId", null, 0, 1,
				IEefXtextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEefXtextDescription_MultiLine(), theEcorePackage.getEBoolean(), "multiLine", null, 0, 1,
				IEefXtextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(this.iEefXtextModelDescriptionEClass, IEefXtextModelDescription.class, "IEefXtextModelDescription",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEefXtextModelDescription_EditableFeatures(), theEcorePackage.getEString(),
				"editableFeatures", null, 0, -1, IEefXtextModelDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(this.iEefXtextValueDescriptionEClass, IEefXtextValueDescription.class, "IEefXtextValueDescription",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEefXtextValueDescription_PrefixTextExpression(), theEcorePackage.getEString(),
				"prefixTextExpression", null, 0, 1, IEefXtextValueDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEefXtextValueDescription_SuffixTextExpression(), theEcorePackage.getEString(),
				"suffixTextExpression", null, 0, 1, IEefXtextValueDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(this.iEefXtextPropertyDescriptionEClass, IEefXtextPropertyDescription.class,
				"IEefXtextPropertyDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		
		initEClass(this.eefXtextSingleLineModelDescriptionEClass, EefXtextSingleLineModelDescription.class,
				"EefXtextSingleLineModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		
		initEClass(this.eefXtextMultiLineModelDescriptionEClass, EefXtextMultiLineModelDescription.class,
				"EefXtextMultiLineModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		
		initEClass(this.eefXtextSingleLineValueDescriptionEClass, EefXtextSingleLineValueDescription.class,
				"EefXtextSingleLineValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		
		initEClass(this.eefXtextMultiLineValueDescriptionEClass, EefXtextMultiLineValueDescription.class,
				"EefXtextMultiLineValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		
		// Create resource
		createResource(eNS_URI);
	}
	
} // EefxtextPackageImpl
