/**
 * generated by Xtext 2.22.0
 */
package com.example.classes.impl;

import com.example.classes.Association;
import com.example.classes.Attribute;
import com.example.classes.BuiltInType;
import com.example.classes.ClassModel;
import com.example.classes.ClassRef;
import com.example.classes.ClassesFactory;
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
import com.example.classes.Visibility;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ClassesFactoryImpl extends EFactoryImpl implements ClassesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ClassesFactory init()
  {
    try
    {
      ClassesFactory theClassesFactory = (ClassesFactory)EPackage.Registry.INSTANCE.getEFactory(ClassesPackage.eNS_URI);
      if (theClassesFactory != null)
      {
        return theClassesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ClassesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassesFactoryImpl()
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
      case ClassesPackage.CLASS_MODEL: return createClassModel();
      case ClassesPackage.CONTENT: return createContent();
      case ClassesPackage.CONSTANT: return createConstant();
      case ClassesPackage.ASSOCIATION: return createAssociation();
      case ClassesPackage.CLASS: return createClass();
      case ClassesPackage.ATTRIBUTE: return createAttribute();
      case ClassesPackage.TYPE: return createType();
      case ClassesPackage.BUILT_IN_TYPE: return createBuiltInType();
      case ClassesPackage.STRING_TYPE: return createStringType();
      case ClassesPackage.INTEGER_TYPE: return createIntegerType();
      case ClassesPackage.CLASS_REF: return createClassRef();
      case ClassesPackage.VALUE: return createValue();
      case ClassesPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case ClassesPackage.CONSTANT_REF: return createConstantRef();
      case ClassesPackage.DESCRIPTION: return createDescription();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ClassesPackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ClassesPackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassModel createClassModel()
  {
    ClassModelImpl classModel = new ClassModelImpl();
    return classModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Association createAssociation()
  {
    AssociationImpl association = new AssociationImpl();
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.example.classes.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BuiltInType createBuiltInType()
  {
    BuiltInTypeImpl builtInType = new BuiltInTypeImpl();
    return builtInType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerType createIntegerType()
  {
    IntegerTypeImpl integerType = new IntegerTypeImpl();
    return integerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassRef createClassRef()
  {
    ClassRefImpl classRef = new ClassRefImpl();
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstantRef createConstantRef()
  {
    ConstantRefImpl constantRef = new ConstantRefImpl();
    return constantRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
  {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassesPackage getClassesPackage()
  {
    return (ClassesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ClassesPackage getPackage()
  {
    return ClassesPackage.eINSTANCE;
  }

} //ClassesFactoryImpl
