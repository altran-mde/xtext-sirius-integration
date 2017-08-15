/**
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.example.fowlerdsl.statemachine.RangeGuard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Value;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Range Guard</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.RangeGuardImpl#getMin
 * <em>Min</em>}</li>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.RangeGuardImpl#getMax
 * <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeGuardImpl extends GuardImpl implements RangeGuard {
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Value min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Value max;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RangeGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.RANGE_GUARD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Value getMin() {
		return this.min;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetMin(final Value newMin, NotificationChain msgs) {
		final Value oldMin = this.min;
		this.min = newMin;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.RANGE_GUARD__MIN, oldMin, newMin);
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
	public void setMin(final Value newMin) {
		if (newMin != this.min) {
			NotificationChain msgs = null;
			if (this.min != null) {
				msgs = ((InternalEObject) this.min).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.RANGE_GUARD__MIN, null, msgs);
			}
			if (newMin != null) {
				msgs = ((InternalEObject) newMin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.RANGE_GUARD__MIN, null, msgs);
			}
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.RANGE_GUARD__MIN, newMin,
					newMin));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Value getMax() {
		return this.max;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetMax(final Value newMax, NotificationChain msgs) {
		final Value oldMax = this.max;
		this.max = newMax;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.RANGE_GUARD__MAX, oldMax, newMax);
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
	public void setMax(final Value newMax) {
		if (newMax != this.max) {
			NotificationChain msgs = null;
			if (this.max != null) {
				msgs = ((InternalEObject) this.max).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.RANGE_GUARD__MAX, null, msgs);
			}
			if (newMax != null) {
				msgs = ((InternalEObject) newMax).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.RANGE_GUARD__MAX, null, msgs);
			}
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.RANGE_GUARD__MAX, newMax,
					newMax));
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
			case StatemachinePackage.RANGE_GUARD__MIN:
				return basicSetMin(null, msgs);
			case StatemachinePackage.RANGE_GUARD__MAX:
				return basicSetMax(null, msgs);
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
			case StatemachinePackage.RANGE_GUARD__MIN:
				return getMin();
			case StatemachinePackage.RANGE_GUARD__MAX:
				return getMax();
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
			case StatemachinePackage.RANGE_GUARD__MIN:
				setMin((Value) newValue);
				return;
			case StatemachinePackage.RANGE_GUARD__MAX:
				setMax((Value) newValue);
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
			case StatemachinePackage.RANGE_GUARD__MIN:
				setMin((Value) null);
				return;
			case StatemachinePackage.RANGE_GUARD__MAX:
				setMax((Value) null);
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
			case StatemachinePackage.RANGE_GUARD__MIN:
				return this.min != null;
			case StatemachinePackage.RANGE_GUARD__MAX:
				return this.max != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}
		
		return this.min + ".." + this.max;
	}
	
} // RangeGuardImpl
