<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
=======
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.sirius.properties.impl.TextDescriptionImpl;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
>>>>>>> updated to Oxygen.2
=======
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.sirius.properties.impl.TextDescriptionImpl;
>>>>>>> fixed invalid import in generated files

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Single Line Model Description</b></em>'. <!-- end-user-doc -->
=======
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Xtext Single Line Model Description</b></em>'. <!-- end-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Single Line Model Description</b></em>'. <!-- end-user-doc -->
>>>>>>> updated to Oxygen.2
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getEditableFeatures
=======
 * <li>
 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>
 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getEditableFeatures
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getEditableFeatures
>>>>>>> updated to Oxygen.2
 * <em>Editable Features</em>}</li>
 * </ul>
 *
 * @generated
 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
public class XtextSingleLineModelDescriptionImpl extends EObjectImpl implements XtextSingleLineModelDescription {
=======
public class XtextSingleLineModelDescriptionImpl extends TextDescriptionImpl
		implements XtextSingleLineModelDescription {
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
public class XtextSingleLineModelDescriptionImpl extends EObjectImpl implements XtextSingleLineModelDescription {
>>>>>>> updated to Oxygen.2
=======
public class XtextSingleLineModelDescriptionImpl extends TextDescriptionImpl
		implements XtextSingleLineModelDescription {
>>>>>>> fixed invalid import in generated files
	/**
	 * The default value of the '{@link #getInjectorId() <em>Injector Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInjectorId()
	 * @generated
	 * @ordered
	 */
	protected static final String INJECTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInjectorId() <em>Injector Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInjectorId()
	 * @generated
	 * @ordered
	 */
	protected String injectorId = INJECTOR_ID_EDEFAULT;

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * The cached value of the '{@link #getEditableFeatures() <em>Editable
	 * Features</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
=======
	 * The cached value of the '{@link #getEditableFeatures()
	 * <em>Editable Features</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * The cached value of the '{@link #getEditableFeatures() <em>Editable
	 * Features</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
>>>>>>> updated to Oxygen.2
	 * 
	 * @see #getEditableFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> editableFeatures;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XtextSingleLineModelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesxtextPackage.Literals.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getInjectorId() {
		return this.injectorId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setInjectorId(final String newInjectorId) {
		final String oldInjectorId = this.injectorId;
		this.injectorId = newInjectorId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID, oldInjectorId,
					this.injectorId));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<String> getEditableFeatures() {
		if (this.editableFeatures == null) {
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
			this.editableFeatures = new EDataTypeEList<>(String.class, this,
=======
			this.editableFeatures = new EDataTypeEList<String>(String.class, this,
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
			this.editableFeatures = new EDataTypeEList<>(String.class, this,
>>>>>>> updated to Oxygen.2
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES);
		}
		return this.editableFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isMultiLine() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
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
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
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
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
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
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID:
				return INJECTOR_ID_EDEFAULT == null ? this.injectorId != null
						: !INJECTOR_ID_EDEFAULT.equals(this.injectorId);
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
				return this.editableFeatures != null && !this.editableFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
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
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
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
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (injectorId: ");
		result.append(this.injectorId);
		result.append(", editableFeatures: ");
		result.append(this.editableFeatures);
		result.append(')');
		return result.toString();
	}

} // XtextSingleLineModelDescriptionImpl
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.sirius.properties.impl.TextDescriptionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xtext Single Line Model Description</b></em>'.
 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectorId()
	 * @generated
	 * @ordered
	 */
	protected static final String INJECTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInjectorId() <em>Injector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectorId()
	 * @generated
	 * @ordered
	 */
	protected String injectorId = INJECTOR_ID_EDEFAULT;

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
	protected XtextSingleLineModelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesxtextPackage.Literals.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInjectorId() {
		return injectorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiLine() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //XtextSingleLineModelDescriptionImpl
>>>>>>> preliminary fix for using guava v16
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
