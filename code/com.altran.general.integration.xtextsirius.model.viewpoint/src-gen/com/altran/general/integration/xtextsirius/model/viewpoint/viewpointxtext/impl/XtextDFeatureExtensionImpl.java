/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.sirius.viewpoint.impl.DFeatureExtensionImpl;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * DFeature Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextDFeatureExtensionImpl#getDumdidum
 * <em>Dumdidum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextDFeatureExtensionImpl extends DFeatureExtensionImpl implements XtextDFeatureExtension {
	/**
	 * The default value of the '{@link #getDumdidum() <em>Dumdidum</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDumdidum()
	 * @generated
	 * @ordered
	 */
	protected static final String DUMDIDUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDumdidum() <em>Dumdidum</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDumdidum()
	 * @generated
	 * @ordered
	 */
	protected String dumdidum = DUMDIDUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XtextDFeatureExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointxtextPackage.Literals.XTEXT_DFEATURE_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDumdidum() {
		return this.dumdidum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDumdidum(final String newDumdidum) {
		final String oldDumdidum = this.dumdidum;
		this.dumdidum = newDumdidum;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ViewpointxtextPackage.XTEXT_DFEATURE_EXTENSION__DUMDIDUM, oldDumdidum, this.dumdidum));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case ViewpointxtextPackage.XTEXT_DFEATURE_EXTENSION__DUMDIDUM:
				return getDumdidum();
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
			case ViewpointxtextPackage.XTEXT_DFEATURE_EXTENSION__DUMDIDUM:
				setDumdidum((String) newValue);
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
			case ViewpointxtextPackage.XTEXT_DFEATURE_EXTENSION__DUMDIDUM:
				setDumdidum(DUMDIDUM_EDEFAULT);
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
			case ViewpointxtextPackage.XTEXT_DFEATURE_EXTENSION__DUMDIDUM:
				return DUMDIDUM_EDEFAULT == null ? this.dumdidum != null : !DUMDIDUM_EDEFAULT.equals(this.dumdidum);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dumdidum: ");
		result.append(this.dumdidum);
		result.append(')');
		return result.toString();
	}

} // XtextDFeatureExtensionImpl
