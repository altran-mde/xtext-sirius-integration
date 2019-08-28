/**
 */
package com.altran.general.integration.xtextsirius.test.EKeyLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangFactory
 * @model kind="package"
 * @generated
 */
public interface EKeyLangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EKeyLang";
	
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://altran.com/general/integration/xtextsirius/test/EKeyLang";
	
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EKeyLang";
	
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EKeyLangPackage eINSTANCE = com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl
			.init();
	
	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.impl.ANamedElementImpl <em>ANamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.ANamedElementImpl
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getANamedElement()
	 * @generated
	 */
	int ANAMED_ELEMENT = 2;
	
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAMED_ELEMENT__NAME = 0;
	
	/**
	 * The number of structural features of the '<em>ANamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAMED_ELEMENT_FEATURE_COUNT = 1;
	
	/**
	 * The number of operations of the '<em>ANamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAMED_ELEMENT_OPERATION_COUNT = 0;
	
	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.ContainerImpl
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;
	
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = ANAMED_ELEMENT__NAME;
	
	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTENTS = ANAMED_ELEMENT_FEATURE_COUNT + 0;
	
	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ANAMED_ELEMENT_FEATURE_COUNT + 1;
	
	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = ANAMED_ELEMENT_OPERATION_COUNT + 0;
	
	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent <em>IContainer Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getIContainerContent()
	 * @generated
	 */
	int ICONTAINER_CONTENT = 1;
	
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER_CONTENT__NAME = ANAMED_ELEMENT__NAME;
	
	/**
	 * The number of structural features of the '<em>IContainer Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER_CONTENT_FEATURE_COUNT = ANAMED_ELEMENT_FEATURE_COUNT + 0;
	
	/**
	 * The number of operations of the '<em>IContainer Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTAINER_CONTENT_OPERATION_COUNT = ANAMED_ELEMENT_OPERATION_COUNT + 0;
	
	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.GroupImpl
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;
	
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ANAMED_ELEMENT__NAME;
	
	/**
	 * The feature id for the '<em><b>Leafs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LEAFS = ANAMED_ELEMENT_FEATURE_COUNT + 0;
	
	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ANAMED_ELEMENT_FEATURE_COUNT + 1;
	
	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ANAMED_ELEMENT_OPERATION_COUNT + 0;
	
	/**
	 * The meta object id for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.impl.LeafImpl <em>Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.LeafImpl
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getLeaf()
	 * @generated
	 */
	int LEAF = 4;
	
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__NAME = ANAMED_ELEMENT__NAME;
	
	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__NUMBER = ANAMED_ELEMENT_FEATURE_COUNT + 0;
	
	/**
	 * The number of structural features of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FEATURE_COUNT = ANAMED_ELEMENT_FEATURE_COUNT + 1;
	
	/**
	 * The number of operations of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_OPERATION_COUNT = ANAMED_ELEMENT_OPERATION_COUNT + 0;
	
	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.Container
	 * @generated
	 */
	EClass getContainer();
	
	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Container#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.Container#getContents()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Contents();
	
	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent <em>IContainer Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IContainer Content</em>'.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent
	 * @generated
	 */
	EClass getIContainerContent();
	
	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.ANamedElement <em>ANamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANamed Element</em>'.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.ANamedElement
	 * @generated
	 */
	EClass getANamedElement();
	
	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.ANamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.ANamedElement#getName()
	 * @see #getANamedElement()
	 * @generated
	 */
	EAttribute getANamedElement_Name();
	
	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.Group
	 * @generated
	 */
	EClass getGroup();
	
	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Group#getLeafs <em>Leafs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Leafs</em>'.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.Group#getLeafs()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Leafs();
	
	/**
	 * Returns the meta object for class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf</em>'.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf
	 * @generated
	 */
	EClass getLeaf();
	
	/**
	 * Returns the meta object for the attribute '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf#getNumber()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_Number();
	
	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EKeyLangFactory getEKeyLangFactory();
	
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.ContainerImpl
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();
		
		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTENTS = eINSTANCE.getContainer_Contents();
		
		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent <em>IContainer Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getIContainerContent()
		 * @generated
		 */
		EClass ICONTAINER_CONTENT = eINSTANCE.getIContainerContent();
		
		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.impl.ANamedElementImpl <em>ANamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.ANamedElementImpl
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getANamedElement()
		 * @generated
		 */
		EClass ANAMED_ELEMENT = eINSTANCE.getANamedElement();
		
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANAMED_ELEMENT__NAME = eINSTANCE.getANamedElement_Name();
		
		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.GroupImpl
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();
		
		/**
		 * The meta object literal for the '<em><b>Leafs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__LEAFS = eINSTANCE.getGroup_Leafs();
		
		/**
		 * The meta object literal for the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.impl.LeafImpl <em>Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.LeafImpl
		 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.impl.EKeyLangPackageImpl#getLeaf()
		 * @generated
		 */
		EClass LEAF = eINSTANCE.getLeaf();
		
		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__NUMBER = eINSTANCE.getLeaf_Number();
		
	}
	
} //EKeyLangPackage
