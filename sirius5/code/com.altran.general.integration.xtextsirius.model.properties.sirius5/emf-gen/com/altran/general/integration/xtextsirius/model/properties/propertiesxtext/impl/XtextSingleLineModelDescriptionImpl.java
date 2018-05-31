/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.sirius.properties.impl.TextDescriptionImpl;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Single Line Model Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getInjectorId <em>Injector Id</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getEditableFeatures <em>Editable Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextSingleLineModelDescriptionImpl extends TextDescriptionImpl
		implements XtextSingleLineModelDescription {
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
	 * The cached value of the '{@link #getEditableFeatures() <em>Editable
	 * Features</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #getEditableFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> editableFeatures;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected XtextSingleLineModelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesxtextPackage.Literals.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID, oldInjectorId,
					injectorId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEditableFeatures() {
		if (editableFeatures == null) {
			editableFeatures = new EDataTypeEList<String>(String.class, this,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES);
		}
		return editableFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiLine() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID:
			return getInjectorId();
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
			return getEditableFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID:
			setInjectorId((String) newValue);
			return;
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
			getEditableFeatures().clear();
			getEditableFeatures().addAll((Collection<? extends String>) newValue);
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
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID:
			setInjectorId(INJECTOR_ID_EDEFAULT);
			return;
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
			getEditableFeatures().clear();
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
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID:
			return INJECTOR_ID_EDEFAULT == null ? injectorId != null : !INJECTOR_ID_EDEFAULT.equals(injectorId);
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
			return editableFeatures != null && !editableFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IXtextDescription.class) {
			switch (derivedFeatureID) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID:
				return XtextsiriusPackage.IXTEXT_DESCRIPTION__INJECTOR_ID;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextPropertyDescription.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == IXtextModelDescription.class) {
			switch (derivedFeatureID) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
				return XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextPropertyModelDescription.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IXtextDescription.class) {
			switch (baseFeatureID) {
			case XtextsiriusPackage.IXTEXT_DESCRIPTION__INJECTOR_ID:
				return PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextPropertyDescription.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == IXtextModelDescription.class) {
			switch (baseFeatureID) {
			case XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES:
				return PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextPropertyModelDescription.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", editableFeatures: ");
		result.append(editableFeatures);
		result.append(')');
		return result.toString();
	}

} // XtextSingleLineModelDescriptionImpl
