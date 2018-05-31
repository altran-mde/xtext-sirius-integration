/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import org.eclipse.eef.impl.EEFTextDescriptionImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>IEef
 * Xtext Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.IEefXtextDescriptionImpl#getInjectorId <em>Injector Id</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.IEefXtextDescriptionImpl#isMultiLine <em>Multi Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IEefXtextDescriptionImpl extends EEFTextDescriptionImpl implements IEefXtextDescription {
	/**
	 * The default value of the '{@link #getInjectorId() <em>Injector Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInjectorId()
	 * @generated
	 * @ordered
	 */
	protected static final String INJECTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInjectorId() <em>Injector Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInjectorId()
	 * @generated
	 * @ordered
	 */
	protected String injectorId = INJECTOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMultiLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMultiLine()
	 * @generated
	 * @ordered
	 */
	protected boolean multiLine = MULTI_LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IEefXtextDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefxtextPackage.Literals.IEEF_XTEXT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInjectorId() {
		return injectorId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInjectorId(String newInjectorId) {
		String oldInjectorId = injectorId;
		injectorId = newInjectorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefxtextPackage.IEEF_XTEXT_DESCRIPTION__INJECTOR_ID,
					oldInjectorId, injectorId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiLine() {
		return multiLine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiLine(boolean newMultiLine) {
		boolean oldMultiLine = multiLine;
		multiLine = newMultiLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefxtextPackage.IEEF_XTEXT_DESCRIPTION__MULTI_LINE,
					oldMultiLine, multiLine));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefxtextPackage.IEEF_XTEXT_DESCRIPTION__INJECTOR_ID:
			return getInjectorId();
		case EefxtextPackage.IEEF_XTEXT_DESCRIPTION__MULTI_LINE:
			return isMultiLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefxtextPackage.IEEF_XTEXT_DESCRIPTION__INJECTOR_ID:
			setInjectorId((String) newValue);
			return;
		case EefxtextPackage.IEEF_XTEXT_DESCRIPTION__MULTI_LINE:
			setMultiLine((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EefxtextPackage.IEEF_XTEXT_DESCRIPTION__INJECTOR_ID:
			setInjectorId(INJECTOR_ID_EDEFAULT);
			return;
		case EefxtextPackage.IEEF_XTEXT_DESCRIPTION__MULTI_LINE:
			setMultiLine(MULTI_LINE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefxtextPackage.IEEF_XTEXT_DESCRIPTION__INJECTOR_ID:
			return INJECTOR_ID_EDEFAULT == null ? injectorId != null : !INJECTOR_ID_EDEFAULT.equals(injectorId);
		case EefxtextPackage.IEEF_XTEXT_DESCRIPTION__MULTI_LINE:
			return multiLine != MULTI_LINE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (injectorId: ");
		result.append(injectorId);
		result.append(", multiLine: ");
		result.append(multiLine);
		result.append(')');
		return result.toString();
	}

} // IEefXtextDescriptionImpl
