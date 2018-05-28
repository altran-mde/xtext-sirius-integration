/**
 */
package com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.impl;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusFactory;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

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
public class XtextsiriusPackageImpl extends EPackageImpl implements XtextsiriusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextValueDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextPropertyDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextDirectEditDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextDirectEditModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextDirectEditValueDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextPropertyModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iXtextPropertyValueDescriptionEClass = null;

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
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XtextsiriusPackageImpl() {
		super(eNS_URI, XtextsiriusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XtextsiriusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XtextsiriusPackage init() {
		if (isInited)
			return (XtextsiriusPackage) EPackage.Registry.INSTANCE.getEPackage(XtextsiriusPackage.eNS_URI);

		// Obtain or create and register package
		XtextsiriusPackageImpl theXtextsiriusPackage = (XtextsiriusPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof XtextsiriusPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new XtextsiriusPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXtextsiriusPackage.createPackageContents();

		// Initialize created meta-data
		theXtextsiriusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXtextsiriusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XtextsiriusPackage.eNS_URI, theXtextsiriusPackage);
		return theXtextsiriusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextDescription() {
		return iXtextDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIXtextDescription_InjectorId() {
		return (EAttribute) iXtextDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextModelDescription() {
		return iXtextModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIXtextModelDescription_EditableFeatures() {
		return (EAttribute) iXtextModelDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextValueDescription() {
		return iXtextValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIXtextValueDescription_PrefixTextExpression() {
		return (EAttribute) iXtextValueDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIXtextValueDescription_SuffixTextExpression() {
		return (EAttribute) iXtextValueDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextPropertyDescription() {
		return iXtextPropertyDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextDirectEditDescription() {
		return iXtextDirectEditDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIXtextDirectEditDescription_MultiLine() {
		return (EAttribute) iXtextDirectEditDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextDirectEditModelDescription() {
		return iXtextDirectEditModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextDirectEditValueDescription() {
		return iXtextDirectEditValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextPropertyModelDescription() {
		return iXtextPropertyModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIXtextPropertyValueDescription() {
		return iXtextPropertyValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XtextsiriusFactory getXtextsiriusFactory() {
		return (XtextsiriusFactory) getEFactoryInstance();
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
		iXtextDescriptionEClass = createEClass(IXTEXT_DESCRIPTION);
		createEAttribute(iXtextDescriptionEClass, IXTEXT_DESCRIPTION__INJECTOR_ID);

		iXtextModelDescriptionEClass = createEClass(IXTEXT_MODEL_DESCRIPTION);
		createEAttribute(iXtextModelDescriptionEClass, IXTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES);

		iXtextValueDescriptionEClass = createEClass(IXTEXT_VALUE_DESCRIPTION);
		createEAttribute(iXtextValueDescriptionEClass, IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION);
		createEAttribute(iXtextValueDescriptionEClass, IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION);

		iXtextPropertyDescriptionEClass = createEClass(IXTEXT_PROPERTY_DESCRIPTION);

		iXtextDirectEditDescriptionEClass = createEClass(IXTEXT_DIRECT_EDIT_DESCRIPTION);
		createEAttribute(iXtextDirectEditDescriptionEClass, IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE);

		iXtextDirectEditModelDescriptionEClass = createEClass(IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION);

		iXtextDirectEditValueDescriptionEClass = createEClass(IXTEXT_DIRECT_EDIT_VALUE_DESCRIPTION);

		iXtextPropertyModelDescriptionEClass = createEClass(IXTEXT_PROPERTY_MODEL_DESCRIPTION);

		iXtextPropertyValueDescriptionEClass = createEClass(IXTEXT_PROPERTY_VALUE_DESCRIPTION);
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
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iXtextModelDescriptionEClass.getESuperTypes().add(this.getIXtextDescription());
		iXtextValueDescriptionEClass.getESuperTypes().add(this.getIXtextDescription());
		iXtextPropertyDescriptionEClass.getESuperTypes().add(this.getIXtextDescription());
		iXtextDirectEditDescriptionEClass.getESuperTypes().add(this.getIXtextDescription());
		iXtextDirectEditModelDescriptionEClass.getESuperTypes().add(this.getIXtextDirectEditDescription());
		iXtextDirectEditModelDescriptionEClass.getESuperTypes().add(this.getIXtextModelDescription());
		iXtextDirectEditValueDescriptionEClass.getESuperTypes().add(this.getIXtextDirectEditDescription());
		iXtextDirectEditValueDescriptionEClass.getESuperTypes().add(this.getIXtextValueDescription());
		iXtextPropertyModelDescriptionEClass.getESuperTypes().add(this.getIXtextPropertyDescription());
		iXtextPropertyModelDescriptionEClass.getESuperTypes().add(this.getIXtextModelDescription());
		iXtextPropertyValueDescriptionEClass.getESuperTypes().add(this.getIXtextPropertyDescription());
		iXtextPropertyValueDescriptionEClass.getESuperTypes().add(this.getIXtextValueDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(iXtextDescriptionEClass, IXtextDescription.class, "IXtextDescription", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIXtextDescription_InjectorId(), theEcorePackage.getEString(), "injectorId", null, 0, 1,
				IXtextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(iXtextDescriptionEClass, theEcorePackage.getEBoolean(), "isMultiLine", 0, 1, !IS_UNIQUE,
				IS_ORDERED);

		initEClass(iXtextModelDescriptionEClass, IXtextModelDescription.class, "IXtextModelDescription", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIXtextModelDescription_EditableFeatures(), theEcorePackage.getEString(), "editableFeatures",
				null, 0, -1, IXtextModelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iXtextValueDescriptionEClass, IXtextValueDescription.class, "IXtextValueDescription", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIXtextValueDescription_PrefixTextExpression(), theEcorePackage.getEString(),
				"prefixTextExpression", null, 0, 1, IXtextValueDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIXtextValueDescription_SuffixTextExpression(), theEcorePackage.getEString(),
				"suffixTextExpression", null, 0, 1, IXtextValueDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iXtextPropertyDescriptionEClass, IXtextPropertyDescription.class, "IXtextPropertyDescription",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iXtextDirectEditDescriptionEClass, IXtextDirectEditDescription.class, "IXtextDirectEditDescription",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIXtextDirectEditDescription_MultiLine(), theEcorePackage.getEBoolean(), "multiLine", null, 0,
				1, IXtextDirectEditDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iXtextDirectEditModelDescriptionEClass, IXtextDirectEditModelDescription.class,
				"IXtextDirectEditModelDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iXtextDirectEditValueDescriptionEClass, IXtextDirectEditValueDescription.class,
				"IXtextDirectEditValueDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iXtextPropertyModelDescriptionEClass, IXtextPropertyModelDescription.class,
				"IXtextPropertyModelDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iXtextPropertyValueDescriptionEClass, IXtextPropertyValueDescription.class,
				"IXtextPropertyValueDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XtextsiriusPackageImpl
