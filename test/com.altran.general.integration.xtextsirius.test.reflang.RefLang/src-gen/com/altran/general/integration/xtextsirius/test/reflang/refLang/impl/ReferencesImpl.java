/**
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.refLang.impl;

import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.References;

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
 * An implementation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.reflang.refLang.impl.ReferencesImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencesImpl extends MinimalEObjectImpl.Container implements References
{
  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<Reference> references;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferencesImpl()
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
    return RefLangPackage.Literals.REFERENCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Reference> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<Reference>(Reference.class, this, RefLangPackage.REFERENCES__REFERENCES);
    }
    return references;
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
      case RefLangPackage.REFERENCES__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
      case RefLangPackage.REFERENCES__REFERENCES:
        return getReferences();
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
      case RefLangPackage.REFERENCES__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends Reference>)newValue);
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
      case RefLangPackage.REFERENCES__REFERENCES:
        getReferences().clear();
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
      case RefLangPackage.REFERENCES__REFERENCES:
        return references != null && !references.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReferencesImpl