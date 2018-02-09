/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eef Xtext Multi Line Model Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefXtextMultiLineModelDescriptionImpl#getEditableFeatures <em>Editable Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EefXtextMultiLineModelDescriptionImpl extends IEefXtextDescriptionImpl
		implements EefXtextMultiLineModelDescription {
	/**
	 * The cached value of the '{@link #getEditableFeatures() <em>Editable Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditableFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> editableFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EefXtextMultiLineModelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefxtextPackage.Literals.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEditableFeatures() {
		if (editableFeatures == null) {
			editableFeatures = new EDataTypeEList<String>(String.class, this,
					EefxtextPackage.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES);
		}
		return editableFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefxtextPackage.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
			return getEditableFeatures();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefxtextPackage.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
			getEditableFeatures().clear();
			getEditableFeatures().addAll((Collection<? extends String>) newValue);
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
		case EefxtextPackage.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
			getEditableFeatures().clear();
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
		case EefxtextPackage.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
			return editableFeatures != null && !editableFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IEefXtextModelDescription.class) {
			switch (derivedFeatureID) {
			case EefxtextPackage.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
				return EefxtextPackage.IEEF_XTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IEefXtextModelDescription.class) {
			switch (baseFeatureID) {
			case EefxtextPackage.IEEF_XTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES:
				return EefxtextPackage.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (editableFeatures: ");
		result.append(editableFeatures);
		result.append(')');
		return result.toString();
	}

} //EefXtextMultiLineModelDescriptionImpl
