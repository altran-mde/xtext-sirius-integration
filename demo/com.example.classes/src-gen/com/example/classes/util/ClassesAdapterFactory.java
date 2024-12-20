/**
 * generated by Xtext 2.22.0
 */
package com.example.classes.util;

import com.example.classes.Association;
import com.example.classes.Attribute;
import com.example.classes.BuiltInType;
import com.example.classes.ClassModel;
import com.example.classes.ClassRef;
import com.example.classes.ClassesPackage;
import com.example.classes.Constant;
import com.example.classes.ConstantRef;
import com.example.classes.Content;
import com.example.classes.Description;
import com.example.classes.IntegerLiteral;
import com.example.classes.IntegerType;
import com.example.classes.StringType;
import com.example.classes.Type;
import com.example.classes.Value;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.example.classes.ClassesPackage
 * @generated
 */
public class ClassesAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ClassesPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassesAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ClassesPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassesSwitch<Adapter> modelSwitch =
    new ClassesSwitch<Adapter>()
    {
      @Override
      public Adapter caseClassModel(ClassModel object)
      {
        return createClassModelAdapter();
      }
      @Override
      public Adapter caseContent(Content object)
      {
        return createContentAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseAssociation(Association object)
      {
        return createAssociationAdapter();
      }
      @Override
      public Adapter caseClass(com.example.classes.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseBuiltInType(BuiltInType object)
      {
        return createBuiltInTypeAdapter();
      }
      @Override
      public Adapter caseStringType(StringType object)
      {
        return createStringTypeAdapter();
      }
      @Override
      public Adapter caseIntegerType(IntegerType object)
      {
        return createIntegerTypeAdapter();
      }
      @Override
      public Adapter caseClassRef(ClassRef object)
      {
        return createClassRefAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseConstantRef(ConstantRef object)
      {
        return createConstantRefAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.ClassModel <em>Class Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.ClassModel
   * @generated
   */
  public Adapter createClassModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.Content
   * @generated
   */
  public Adapter createContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.Association
   * @generated
   */
  public Adapter createAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.BuiltInType
   * @generated
   */
  public Adapter createBuiltInTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.StringType
   * @generated
   */
  public Adapter createStringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.IntegerType <em>Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.IntegerType
   * @generated
   */
  public Adapter createIntegerTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.ClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.ClassRef
   * @generated
   */
  public Adapter createClassRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.ConstantRef <em>Constant Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.ConstantRef
   * @generated
   */
  public Adapter createConstantRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.classes.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.classes.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ClassesAdapterFactory
