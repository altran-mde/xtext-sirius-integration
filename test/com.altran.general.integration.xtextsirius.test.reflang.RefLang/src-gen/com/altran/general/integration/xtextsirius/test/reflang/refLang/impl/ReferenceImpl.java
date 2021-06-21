/**
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.refLang.impl;

import com.altran.general.integration.xtextsirius.test.reflang.refLang.IContainerContent;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.reflang.refLang.impl.ReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.reflang.refLang.impl.ReferenceImpl#getTarget2 <em>Target2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected IContainerContent target;

  /**
   * The cached value of the '{@link #getTarget2() <em>Target2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget2()
   * @generated
   * @ordered
   */
  protected IContainerContent target2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RefLangPackage.Literals.REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IContainerContent getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (IContainerContent)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefLangPackage.REFERENCE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IContainerContent basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(IContainerContent newTarget)
  {
    IContainerContent oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RefLangPackage.REFERENCE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IContainerContent getTarget2()
  {
    if (target2 != null && target2.eIsProxy())
    {
      InternalEObject oldTarget2 = (InternalEObject)target2;
      target2 = (IContainerContent)eResolveProxy(oldTarget2);
      if (target2 != oldTarget2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefLangPackage.REFERENCE__TARGET2, oldTarget2, target2));
      }
    }
    return target2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IContainerContent basicGetTarget2()
  {
    return target2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget2(IContainerContent newTarget2)
  {
    IContainerContent oldTarget2 = target2;
    target2 = newTarget2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RefLangPackage.REFERENCE__TARGET2, oldTarget2, target2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RefLangPackage.REFERENCE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case RefLangPackage.REFERENCE__TARGET2:
        if (resolve) return getTarget2();
        return basicGetTarget2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RefLangPackage.REFERENCE__TARGET:
        setTarget((IContainerContent)newValue);
        return;
      case RefLangPackage.REFERENCE__TARGET2:
        setTarget2((IContainerContent)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RefLangPackage.REFERENCE__TARGET:
        setTarget((IContainerContent)null);
        return;
      case RefLangPackage.REFERENCE__TARGET2:
        setTarget2((IContainerContent)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RefLangPackage.REFERENCE__TARGET:
        return target != null;
      case RefLangPackage.REFERENCE__TARGET2:
        return target2 != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferenceImpl
