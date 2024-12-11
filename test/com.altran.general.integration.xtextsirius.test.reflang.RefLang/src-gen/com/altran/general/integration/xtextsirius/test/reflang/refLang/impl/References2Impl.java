/**
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.refLang.impl;

import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.References2;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.reflang.refLang.impl.References2Impl#getReferences2 <em>References2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class References2Impl extends MinimalEObjectImpl.Container implements References2
{
  /**
   * The cached value of the '{@link #getReferences2() <em>References2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences2()
   * @generated
   * @ordered
   */
  protected EList<Reference> references2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected References2Impl()
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
    return RefLangPackage.Literals.REFERENCES2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Reference> getReferences2()
  {
    if (references2 == null)
    {
      references2 = new EObjectContainmentEList<Reference>(Reference.class, this, RefLangPackage.REFERENCES2__REFERENCES2);
    }
    return references2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RefLangPackage.REFERENCES2__REFERENCES2:
        return ((InternalEList<?>)getReferences2()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RefLangPackage.REFERENCES2__REFERENCES2:
        return getReferences2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RefLangPackage.REFERENCES2__REFERENCES2:
        getReferences2().clear();
        getReferences2().addAll((Collection<? extends Reference>)newValue);
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
      case RefLangPackage.REFERENCES2__REFERENCES2:
        getReferences2().clear();
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
      case RefLangPackage.REFERENCES2__REFERENCES2:
        return references2 != null && !references2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //References2Impl
