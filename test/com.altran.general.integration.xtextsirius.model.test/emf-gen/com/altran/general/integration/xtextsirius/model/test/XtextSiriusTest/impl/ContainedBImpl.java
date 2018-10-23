/**
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contained B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedBImpl#getAttrA <em>Attr A</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedBImpl#getAttrB <em>Attr B</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ContainedBImpl#getAttrY <em>Attr Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainedBImpl extends MinimalEObjectImpl.Container implements ContainedB {
	/**
	 * The default value of the '{@link #getAttrA() <em>Attr A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrA()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrA() <em>Attr A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrA()
	 * @generated
	 * @ordered
	 */
	protected String attrA = ATTR_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrB() <em>Attr B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrB()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrB() <em>Attr B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrB()
	 * @generated
	 * @ordered
	 */
	protected String attrB = ATTR_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrY() <em>Attr Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrY()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrY() <em>Attr Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrY()
	 * @generated
	 * @ordered
	 */
	protected String attrY = ATTR_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextSiriusTestPackage.Literals.CONTAINED_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttrA() {
		return attrA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrA(String newAttrA) {
		String oldAttrA = attrA;
		attrA = newAttrA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextSiriusTestPackage.CONTAINED_B__ATTR_A, oldAttrA,
					attrA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttrB() {
		return attrB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrB(String newAttrB) {
		String oldAttrB = attrB;
		attrB = newAttrB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextSiriusTestPackage.CONTAINED_B__ATTR_B, oldAttrB,
					attrB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttrY() {
		return attrY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrY(String newAttrY) {
		String oldAttrY = attrY;
		attrY = newAttrY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextSiriusTestPackage.CONTAINED_B__ATTR_Y, oldAttrY,
					attrY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_A:
			return getAttrA();
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_B:
			return getAttrB();
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_Y:
			return getAttrY();
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
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_A:
			setAttrA((String) newValue);
			return;
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_B:
			setAttrB((String) newValue);
			return;
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_Y:
			setAttrY((String) newValue);
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
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_A:
			setAttrA(ATTR_A_EDEFAULT);
			return;
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_B:
			setAttrB(ATTR_B_EDEFAULT);
			return;
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_Y:
			setAttrY(ATTR_Y_EDEFAULT);
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
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_A:
			return ATTR_A_EDEFAULT == null ? attrA != null : !ATTR_A_EDEFAULT.equals(attrA);
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_B:
			return ATTR_B_EDEFAULT == null ? attrB != null : !ATTR_B_EDEFAULT.equals(attrB);
		case XtextSiriusTestPackage.CONTAINED_B__ATTR_Y:
			return ATTR_Y_EDEFAULT == null ? attrY != null : !ATTR_Y_EDEFAULT.equals(attrY);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (attrA: ");
		result.append(attrA);
		result.append(", attrB: ");
		result.append(attrB);
		result.append(", attrY: ");
		result.append(attrY);
		result.append(')');
		return result.toString();
	}

} //ContainedBImpl
