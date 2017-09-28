/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import org.eclipse.eef.impl.EEFTextDescriptionImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Eef
 * Xtext Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefXtextDescriptionImpl#getLanguage
 * <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EefXtextDescriptionImpl extends EEFTextDescriptionImpl implements EefXtextDescription {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EefXtextDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefxtextPackage.Literals.EEF_XTEXT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return this.language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLanguage(final String newLanguage) {
		final String oldLanguage = this.language;
		this.language = newLanguage;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefxtextPackage.EEF_XTEXT_DESCRIPTION__LANGUAGE,
					oldLanguage, this.language));
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
			case EefxtextPackage.EEF_XTEXT_DESCRIPTION__LANGUAGE:
				return getLanguage();
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
			case EefxtextPackage.EEF_XTEXT_DESCRIPTION__LANGUAGE:
				setLanguage((String) newValue);
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
			case EefxtextPackage.EEF_XTEXT_DESCRIPTION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
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
			case EefxtextPackage.EEF_XTEXT_DESCRIPTION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? this.language != null : !LANGUAGE_EDEFAULT.equals(this.language);
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
		result.append(" (language: ");
		result.append(this.language);
		result.append(')');
		return result.toString();
	}

} // EefXtextDescriptionImpl
