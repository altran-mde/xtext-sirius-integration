/**
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.refLang.impl;

import com.altran.general.integration.xtextsirius.test.reflang.refLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefLangFactoryImpl extends EFactoryImpl implements RefLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RefLangFactory init()
  {
    try
    {
      RefLangFactory theRefLangFactory = (RefLangFactory)EPackage.Registry.INSTANCE.getEFactory(RefLangPackage.eNS_URI);
      if (theRefLangFactory != null)
      {
        return theRefLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RefLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RefLangPackage.CONTAINER: return createContainer();
      case RefLangPackage.ICONTAINER_CONTENT: return createIContainerContent();
      case RefLangPackage.SUB_CONTAINER: return createSubContainer();
      case RefLangPackage.LEAF: return createLeaf();
      case RefLangPackage.REFERENCES: return createReferences();
      case RefLangPackage.REFERENCE: return createReference();
      case RefLangPackage.REFERENCES2: return createReferences2();
      case RefLangPackage.REFERENCES3: return createReferences3();
      case RefLangPackage.REFERENCE3: return createReference3();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.altran.general.integration.xtextsirius.test.reflang.refLang.Container createContainer()
  {
    ContainerImpl container = new ContainerImpl();
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IContainerContent createIContainerContent()
  {
    IContainerContentImpl iContainerContent = new IContainerContentImpl();
    return iContainerContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubContainer createSubContainer()
  {
    SubContainerImpl subContainer = new SubContainerImpl();
    return subContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Leaf createLeaf()
  {
    LeafImpl leaf = new LeafImpl();
    return leaf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public References createReferences()
  {
    ReferencesImpl references = new ReferencesImpl();
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public References2 createReferences2()
  {
    References2Impl references2 = new References2Impl();
    return references2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public References3 createReferences3()
  {
    References3Impl references3 = new References3Impl();
    return references3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference3 createReference3()
  {
    Reference3Impl reference3 = new Reference3Impl();
    return reference3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RefLangPackage getRefLangPackage()
  {
    return (RefLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RefLangPackage getPackage()
  {
    return RefLangPackage.eINSTANCE;
  }

} //RefLangFactoryImpl
