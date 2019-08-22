/**
 */
package com.altran.general.integration.xtextsirius.test.EKeyLang.impl;

import com.altran.general.integration.xtextsirius.test.EKeyLang.ANamedElement;
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangFactory;
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Group;
import com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EKeyLangPackageImpl extends EPackageImpl implements EKeyLangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iContainerContentEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aNamedElementEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafEClass = null;
	
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
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EKeyLangPackageImpl() {
		super(eNS_URI, EKeyLangFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EKeyLangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EKeyLangPackage init() {
		if (isInited)
			return (EKeyLangPackage) EPackage.Registry.INSTANCE.getEPackage(EKeyLangPackage.eNS_URI);
		
		// Obtain or create and register package
		Object registeredEKeyLangPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EKeyLangPackageImpl theEKeyLangPackage = registeredEKeyLangPackage instanceof EKeyLangPackageImpl
				? (EKeyLangPackageImpl) registeredEKeyLangPackage
				: new EKeyLangPackageImpl();
		
		isInited = true;
		
		// Create package meta-data objects
		theEKeyLangPackage.createPackageContents();
		
		// Initialize created meta-data
		theEKeyLangPackage.initializePackageContents();
		
		// Mark meta-data to indicate it can't be changed
		theEKeyLangPackage.freeze();
		
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EKeyLangPackage.eNS_URI, theEKeyLangPackage);
		return theEKeyLangPackage;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Contents() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIContainerContent() {
		return iContainerContentEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getANamedElement() {
		return aNamedElementEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getANamedElement_Name() {
		return (EAttribute) aNamedElementEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Leafs() {
		return (EReference) groupEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeaf() {
		return leafEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeaf_Number() {
		return (EAttribute) leafEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EKeyLangFactory getEKeyLangFactory() {
		return (EKeyLangFactory) getEFactoryInstance();
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
		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTENTS);
		
		iContainerContentEClass = createEClass(ICONTAINER_CONTENT);
		
		aNamedElementEClass = createEClass(ANAMED_ELEMENT);
		createEAttribute(aNamedElementEClass, ANAMED_ELEMENT__NAME);
		
		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__LEAFS);
		
		leafEClass = createEClass(LEAF);
		createEAttribute(leafEClass, LEAF__NUMBER);
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
		
		// Create type parameters
		
		// Set bounds for type parameters
		
		// Add supertypes to classes
		containerEClass.getESuperTypes().add(this.getANamedElement());
		iContainerContentEClass.getESuperTypes().add(this.getANamedElement());
		groupEClass.getESuperTypes().add(this.getANamedElement());
		groupEClass.getESuperTypes().add(this.getIContainerContent());
		leafEClass.getESuperTypes().add(this.getANamedElement());
		leafEClass.getESuperTypes().add(this.getIContainerContent());
		
		// Initialize classes, features, and operations; add parameters
		initEClass(containerEClass, com.altran.general.integration.xtextsirius.test.EKeyLang.Container.class,
				"Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Contents(), this.getIContainerContent(), null, "contents", null, 0, -1,
				com.altran.general.integration.xtextsirius.test.EKeyLang.Container.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(iContainerContentEClass, IContainerContent.class, "IContainerContent", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		
		initEClass(aNamedElementEClass, ANamedElement.class, "ANamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ANamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Leafs(), this.getIContainerContent(), null, "leafs", null, 0, -1, Group.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGroup_Leafs().getEKeys().add(this.getANamedElement_Name());
		
		initEClass(leafEClass, Leaf.class, "Leaf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeaf_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Leaf.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		// Create resource
		createResource(eNS_URI);
	}
	
} //EKeyLangPackageImpl
