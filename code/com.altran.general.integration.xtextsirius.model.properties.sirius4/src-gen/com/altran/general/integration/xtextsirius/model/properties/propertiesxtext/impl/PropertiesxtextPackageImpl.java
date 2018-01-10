<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
import org.eclipse.sirius.properties.PropertiesPackage;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.style.StylePackage;
import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;
import org.eclipse.sirius.viewpoint.description.validation.ValidationPackage;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextFactory;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class PropertiesxtextPackageImpl extends EPackageImpl implements PropertiesxtextPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextSingleLineModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextMultiLineModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextSingleLineValueDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xtextMultiLineValueDescriptionEClass = null;

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
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PropertiesxtextPackageImpl() {
		super(eNS_URI, PropertiesxtextFactory.eINSTANCE);
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
	 * This method is used to initialize
	 * {@link PropertiesxtextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access
	 * that field to obtain the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PropertiesxtextPackage init() {
		if (isInited) {
			return (PropertiesxtextPackage) EPackage.Registry.INSTANCE.getEPackage(PropertiesxtextPackage.eNS_URI);
		}

		// Obtain or create and register package
		final PropertiesxtextPackageImpl thePropertiesxtextPackage = (PropertiesxtextPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PropertiesxtextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new PropertiesxtextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
		XtextsiriusPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
=======
		ValidationPackage.eINSTANCE.eClass();
		StylePackage.eINSTANCE.eClass();
		DescriptionPackage.eINSTANCE.eClass();
		PropertiesPackage.eINSTANCE.eClass();
		XtextsiriusPackage.eINSTANCE.eClass();
		ToolPackage.eINSTANCE.eClass();
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy

		// Create package meta-data objects
		thePropertiesxtextPackage.createPackageContents();

		// Initialize created meta-data
		thePropertiesxtextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePropertiesxtextPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PropertiesxtextPackage.eNS_URI, thePropertiesxtextPackage);
		return thePropertiesxtextPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextSingleLineModelDescription() {
		return this.xtextSingleLineModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextMultiLineModelDescription() {
		return this.xtextMultiLineModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextSingleLineValueDescription() {
		return this.xtextSingleLineValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getXtextMultiLineValueDescription() {
		return this.xtextMultiLineValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PropertiesxtextFactory getPropertiesxtextFactory() {
		return (PropertiesxtextFactory) getEFactoryInstance();
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
		this.xtextSingleLineModelDescriptionEClass = createEClass(XTEXT_SINGLE_LINE_MODEL_DESCRIPTION);

		this.xtextMultiLineModelDescriptionEClass = createEClass(XTEXT_MULTI_LINE_MODEL_DESCRIPTION);

		this.xtextSingleLineValueDescriptionEClass = createEClass(XTEXT_SINGLE_LINE_VALUE_DESCRIPTION);

		this.xtextMultiLineValueDescriptionEClass = createEClass(XTEXT_MULTI_LINE_VALUE_DESCRIPTION);
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
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
		final PropertiesPackage thePropertiesPackage = (PropertiesPackage) EPackage.Registry.INSTANCE
				.getEPackage(PropertiesPackage.eNS_URI);
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
		final XtextsiriusPackage theXtextsiriusPackage = (XtextsiriusPackage) EPackage.Registry.INSTANCE
				.getEPackage(XtextsiriusPackage.eNS_URI);
		final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
		this.xtextSingleLineModelDescriptionEClass.getESuperTypes().add(this.ecorePackage.getEObject());
		this.xtextSingleLineModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyModelDescription());
		this.xtextMultiLineModelDescriptionEClass.getESuperTypes().add(this.ecorePackage.getEObject());
		this.xtextMultiLineModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyModelDescription());
		this.xtextSingleLineValueDescriptionEClass.getESuperTypes().add(this.ecorePackage.getEObject());
		this.xtextSingleLineValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyValueDescription());
		this.xtextMultiLineValueDescriptionEClass.getESuperTypes().add(this.ecorePackage.getEObject());
=======
		this.xtextSingleLineModelDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getTextDescription());
		this.xtextSingleLineModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyModelDescription());
		this.xtextMultiLineModelDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getTextAreaDescription());
		this.xtextMultiLineModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyModelDescription());
		this.xtextSingleLineValueDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getTextDescription());
		this.xtextSingleLineValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyValueDescription());
		this.xtextMultiLineValueDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getTextAreaDescription());
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
		this.xtextMultiLineValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyValueDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(this.xtextSingleLineModelDescriptionEClass, XtextSingleLineModelDescription.class,
				"XtextSingleLineModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(this.xtextSingleLineModelDescriptionEClass, theEcorePackage.getEBoolean(), "isMultiLine", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

		initEClass(this.xtextMultiLineModelDescriptionEClass, XtextMultiLineModelDescription.class,
				"XtextMultiLineModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(this.xtextMultiLineModelDescriptionEClass, theEcorePackage.getEBoolean(), "isMultiLine", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

		initEClass(this.xtextSingleLineValueDescriptionEClass, XtextSingleLineValueDescription.class,
				"XtextSingleLineValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(this.xtextSingleLineValueDescriptionEClass, theEcorePackage.getEBoolean(), "isMultiLine", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

		initEClass(this.xtextMultiLineValueDescriptionEClass, XtextMultiLineValueDescription.class,
				"XtextMultiLineValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(this.xtextMultiLineValueDescriptionEClass, theEcorePackage.getEBoolean(), "isMultiLine", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

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

} // PropertiesxtextPackageImpl
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextFactory;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.properties.PropertiesPackage;

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
public class PropertiesxtextPackageImpl extends EPackageImpl implements PropertiesxtextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtextSingleLineModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtextMultiLineModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtextSingleLineValueDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtextMultiLineValueDescriptionEClass = null;

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
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PropertiesxtextPackageImpl() {
		super(eNS_URI, PropertiesxtextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PropertiesxtextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PropertiesxtextPackage init() {
		if (isInited)
			return (PropertiesxtextPackage) EPackage.Registry.INSTANCE.getEPackage(PropertiesxtextPackage.eNS_URI);

		// Obtain or create and register package
		PropertiesxtextPackageImpl thePropertiesxtextPackage = (PropertiesxtextPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PropertiesxtextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new PropertiesxtextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropertiesPackage.eINSTANCE.eClass();
		XtextsiriusPackage.eINSTANCE.eClass();
		DescriptionPackage.eINSTANCE.eClass();
		ValidationPackage.eINSTANCE.eClass();
		ToolPackage.eINSTANCE.eClass();
		StylePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePropertiesxtextPackage.createPackageContents();

		// Initialize created meta-data
		thePropertiesxtextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePropertiesxtextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PropertiesxtextPackage.eNS_URI, thePropertiesxtextPackage);
		return thePropertiesxtextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXtextSingleLineModelDescription() {
		return xtextSingleLineModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXtextMultiLineModelDescription() {
		return xtextMultiLineModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXtextSingleLineValueDescription() {
		return xtextSingleLineValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXtextMultiLineValueDescription() {
		return xtextMultiLineValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesxtextFactory getPropertiesxtextFactory() {
		return (PropertiesxtextFactory) getEFactoryInstance();
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
		xtextSingleLineModelDescriptionEClass = createEClass(XTEXT_SINGLE_LINE_MODEL_DESCRIPTION);

		xtextMultiLineModelDescriptionEClass = createEClass(XTEXT_MULTI_LINE_MODEL_DESCRIPTION);

		xtextSingleLineValueDescriptionEClass = createEClass(XTEXT_SINGLE_LINE_VALUE_DESCRIPTION);

		xtextMultiLineValueDescriptionEClass = createEClass(XTEXT_MULTI_LINE_VALUE_DESCRIPTION);
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
		PropertiesPackage thePropertiesPackage = (PropertiesPackage) EPackage.Registry.INSTANCE
				.getEPackage(PropertiesPackage.eNS_URI);
		XtextsiriusPackage theXtextsiriusPackage = (XtextsiriusPackage) EPackage.Registry.INSTANCE
				.getEPackage(XtextsiriusPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xtextSingleLineModelDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getTextDescription());
		xtextSingleLineModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyModelDescription());
		xtextMultiLineModelDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getTextAreaDescription());
		xtextMultiLineModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyModelDescription());
		xtextSingleLineValueDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getTextDescription());
		xtextSingleLineValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyValueDescription());
		xtextMultiLineValueDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getTextAreaDescription());
		xtextMultiLineValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextPropertyValueDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(xtextSingleLineModelDescriptionEClass, XtextSingleLineModelDescription.class,
				"XtextSingleLineModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(xtextSingleLineModelDescriptionEClass, theEcorePackage.getEBoolean(), "isMultiLine", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

		initEClass(xtextMultiLineModelDescriptionEClass, XtextMultiLineModelDescription.class,
				"XtextMultiLineModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(xtextMultiLineModelDescriptionEClass, theEcorePackage.getEBoolean(), "isMultiLine", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

		initEClass(xtextSingleLineValueDescriptionEClass, XtextSingleLineValueDescription.class,
				"XtextSingleLineValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(xtextSingleLineValueDescriptionEClass, theEcorePackage.getEBoolean(), "isMultiLine", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

		initEClass(xtextMultiLineValueDescriptionEClass, XtextMultiLineValueDescription.class,
				"XtextMultiLineValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(xtextMultiLineValueDescriptionEClass, theEcorePackage.getEBoolean(), "isMultiLine", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

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

} //PropertiesxtextPackageImpl
>>>>>>> preliminary fix for using guava v16
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
