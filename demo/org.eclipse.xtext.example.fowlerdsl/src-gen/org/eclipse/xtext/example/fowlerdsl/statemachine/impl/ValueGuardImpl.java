/**
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Value;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Value Guard</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.ValueGuardImpl#getCond
 * <em>Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueGuardImpl extends GuardImpl implements ValueGuard {
	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected Value cond;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ValueGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.VALUE_GUARD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Value getCond() {
		return this.cond;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetCond(final Value newCond, NotificationChain msgs) {
		final Value oldCond = this.cond;
		this.cond = newCond;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.VALUE_GUARD__COND, oldCond, newCond);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCond(final Value newCond) {
		if (newCond != this.cond) {
			NotificationChain msgs = null;
			if (this.cond != null) {
				msgs = ((InternalEObject) this.cond).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.VALUE_GUARD__COND, null, msgs);
			}
			if (newCond != null) {
				msgs = ((InternalEObject) newCond).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.VALUE_GUARD__COND, null, msgs);
			}
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.VALUE_GUARD__COND, newCond,
					newCond));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.VALUE_GUARD__COND:
				return basicSetCond(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case StatemachinePackage.VALUE_GUARD__COND:
				return getCond();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
			case StatemachinePackage.VALUE_GUARD__COND:
				setCond((Value) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
			case StatemachinePackage.VALUE_GUARD__COND:
				setCond((Value) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
			case StatemachinePackage.VALUE_GUARD__COND:
				return this.cond != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}
		return this.cond != null ? this.cond.toString() : "?";
	}
	
} // ValueGuardImpl
