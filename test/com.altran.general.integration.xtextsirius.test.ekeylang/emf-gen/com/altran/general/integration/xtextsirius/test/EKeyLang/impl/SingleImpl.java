/**
 */
package com.altran.general.integration.xtextsirius.test.EKeyLang.impl;

import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Single;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.EKeyLang.impl.SingleImpl#getLeaf <em>Leaf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleImpl extends ANamedElementImpl implements Single {
	/**
	 * The cached value of the '{@link #getLeaf() <em>Leaf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaf()
	 * @generated
	 * @ordered
	 */
	protected Leaf leaf;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EKeyLangPackage.Literals.SINGLE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Leaf getLeaf() {
		return leaf;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeaf(Leaf newLeaf, NotificationChain msgs) {
		Leaf oldLeaf = leaf;
		leaf = newLeaf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EKeyLangPackage.SINGLE__LEAF,
					oldLeaf, newLeaf);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaf(Leaf newLeaf) {
		if (newLeaf != leaf) {
			NotificationChain msgs = null;
			if (leaf != null)
				msgs = ((InternalEObject) leaf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EKeyLangPackage.SINGLE__LEAF, null, msgs);
			if (newLeaf != null)
				msgs = ((InternalEObject) newLeaf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EKeyLangPackage.SINGLE__LEAF, null, msgs);
			msgs = basicSetLeaf(newLeaf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EKeyLangPackage.SINGLE__LEAF, newLeaf, newLeaf));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EKeyLangPackage.SINGLE__LEAF:
				return basicSetLeaf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EKeyLangPackage.SINGLE__LEAF:
				return getLeaf();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EKeyLangPackage.SINGLE__LEAF:
				setLeaf((Leaf) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EKeyLangPackage.SINGLE__LEAF:
				setLeaf((Leaf) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EKeyLangPackage.SINGLE__LEAF:
				return leaf != null;
		}
		return super.eIsSet(featureID);
	}
	
} //SingleImpl
