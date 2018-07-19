/**
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;

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
public class XtextSiriusTestPackageImpl extends EPackageImpl implements XtextSiriusTestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idElementEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;
	
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
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XtextSiriusTestPackageImpl() {
		super(eNS_URI, XtextSiriusTestFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XtextSiriusTestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XtextSiriusTestPackage init() {
		if (isInited)
			return (XtextSiriusTestPackage) EPackage.Registry.INSTANCE.getEPackage(XtextSiriusTestPackage.eNS_URI);
		
		// Obtain or create and register package
		XtextSiriusTestPackageImpl theXtextSiriusTestPackage = (XtextSiriusTestPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof XtextSiriusTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new XtextSiriusTestPackageImpl());
		
		isInited = true;
		
		// Create package meta-data objects
		theXtextSiriusTestPackage.createPackageContents();
		
		// Initialize created meta-data
		theXtextSiriusTestPackage.initializePackageContents();
		
		// Mark meta-data to indicate it can't be changed
		theXtextSiriusTestPackage.freeze();
		
		
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XtextSiriusTestPackage.eNS_URI, theXtextSiriusTestPackage);
		return theXtextSiriusTestPackage;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdElement() {
		return idElementEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdElement_Id() {
		return (EAttribute) idElementEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ChangeableAttr() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_UnchangeableAttr() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ChangeableListAttr() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_UnchangeableListAttr() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(3);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ChangeableSetAttr() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(4);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_UnchangeableSetAttr() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(5);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ChangeableBagAttr() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(6);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_UnchangeableBagAttr() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(7);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ChangeableRef() {
		return (EReference) elementEClass.getEStructuralFeatures().get(8);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_UnchangeableRef() {
		return (EReference) elementEClass.getEStructuralFeatures().get(9);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ChangeableListRef() {
		return (EReference) elementEClass.getEStructuralFeatures().get(10);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_UnchangeableListRef() {
		return (EReference) elementEClass.getEStructuralFeatures().get(11);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ChangeableSetRef() {
		return (EReference) elementEClass.getEStructuralFeatures().get(12);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_UnchangeableSetRef() {
		return (EReference) elementEClass.getEStructuralFeatures().get(13);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ChangeableBagRef() {
		return (EReference) elementEClass.getEStructuralFeatures().get(14);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_UnchangeableBagRef() {
		return (EReference) elementEClass.getEStructuralFeatures().get(15);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ChangeableUniqueListCont() {
		return (EReference) elementEClass.getEStructuralFeatures().get(16);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_UnchangeableUniqueListCont() {
		return (EReference) elementEClass.getEStructuralFeatures().get(17);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ChangeableSetCont() {
		return (EReference) elementEClass.getEStructuralFeatures().get(18);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ChangeableCont() {
		return (EReference) elementEClass.getEStructuralFeatures().get(19);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_UnchangeableCont() {
		return (EReference) elementEClass.getEStructuralFeatures().get(20);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_UnchangeableSetCont() {
		return (EReference) elementEClass.getEStructuralFeatures().get(21);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtextSiriusTestFactory getXtextSiriusTestFactory() {
		return (XtextSiriusTestFactory) getEFactoryInstance();
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
		idElementEClass = createEClass(ID_ELEMENT);
		createEAttribute(idElementEClass, ID_ELEMENT__ID);
		
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__CHANGEABLE_ATTR);
		createEAttribute(elementEClass, ELEMENT__UNCHANGEABLE_ATTR);
		createEAttribute(elementEClass, ELEMENT__CHANGEABLE_LIST_ATTR);
		createEAttribute(elementEClass, ELEMENT__UNCHANGEABLE_LIST_ATTR);
		createEAttribute(elementEClass, ELEMENT__CHANGEABLE_SET_ATTR);
		createEAttribute(elementEClass, ELEMENT__UNCHANGEABLE_SET_ATTR);
		createEAttribute(elementEClass, ELEMENT__CHANGEABLE_BAG_ATTR);
		createEAttribute(elementEClass, ELEMENT__UNCHANGEABLE_BAG_ATTR);
		createEReference(elementEClass, ELEMENT__CHANGEABLE_REF);
		createEReference(elementEClass, ELEMENT__UNCHANGEABLE_REF);
		createEReference(elementEClass, ELEMENT__CHANGEABLE_LIST_REF);
		createEReference(elementEClass, ELEMENT__UNCHANGEABLE_LIST_REF);
		createEReference(elementEClass, ELEMENT__CHANGEABLE_SET_REF);
		createEReference(elementEClass, ELEMENT__UNCHANGEABLE_SET_REF);
		createEReference(elementEClass, ELEMENT__CHANGEABLE_BAG_REF);
		createEReference(elementEClass, ELEMENT__UNCHANGEABLE_BAG_REF);
		createEReference(elementEClass, ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT);
		createEReference(elementEClass, ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT);
		createEReference(elementEClass, ELEMENT__CHANGEABLE_SET_CONT);
		createEReference(elementEClass, ELEMENT__CHANGEABLE_CONT);
		createEReference(elementEClass, ELEMENT__UNCHANGEABLE_CONT);
		createEReference(elementEClass, ELEMENT__UNCHANGEABLE_SET_CONT);
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
		idElementEClass.getESuperTypes().add(this.getElement());
		
		// Initialize classes, features, and operations; add parameters
		initEClass(idElementEClass, IdElement.class, "IdElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_ChangeableAttr(), ecorePackage.getEString(), "changeableAttr", null, 0, 1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_UnchangeableAttr(), ecorePackage.getEInt(), "unchangeableAttr", null, 0, 1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_ChangeableListAttr(), ecorePackage.getEString(), "changeableListAttr", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_UnchangeableListAttr(), ecorePackage.getEBoolean(), "unchangeableListAttr", null, 0,
				-1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_ChangeableSetAttr(), ecorePackage.getEInt(), "changeableSetAttr", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_UnchangeableSetAttr(), ecorePackage.getEInt(), "unchangeableSetAttr", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_ChangeableBagAttr(), ecorePackage.getEDouble(), "changeableBagAttr", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_UnchangeableBagAttr(), ecorePackage.getEDouble(), "unchangeableBagAttr", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_ChangeableRef(), this.getElement(), null, "changeableRef", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_UnchangeableRef(), this.getElement(), null, "unchangeableRef", null, 0, 1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ChangeableListRef(), this.getElement(), null, "changeableListRef", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_UnchangeableListRef(), this.getElement(), null, "unchangeableListRef", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ChangeableSetRef(), this.getElement(), null, "changeableSetRef", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_UnchangeableSetRef(), this.getElement(), null, "unchangeableSetRef", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_ChangeableBagRef(), this.getElement(), null, "changeableBagRef", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_UnchangeableBagRef(), this.getElement(), null, "unchangeableBagRef", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_ChangeableUniqueListCont(), this.getElement(), null, "changeableUniqueListCont", null,
				0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_UnchangeableUniqueListCont(), this.getElement(), null, "unchangeableUniqueListCont",
				null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ChangeableSetCont(), this.getElement(), null, "changeableSetCont", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_ChangeableCont(), this.getElement(), null, "changeableCont", null, 0, 1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_UnchangeableCont(), this.getElement(), null, "unchangeableCont", null, 0, 1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_UnchangeableSetCont(), this.getElement(), null, "unchangeableSetCont", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		
		// Create resource
		createResource(eNS_URI);
	}
	
} //XtextSiriusTestPackageImpl
