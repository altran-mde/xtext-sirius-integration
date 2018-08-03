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
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getEditableFeatures
 * <em>Editable Features</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getIgnoredNestedFeatures
 * <em>Ignored Nested Features</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getPrefixTerminalsExpression
 * <em>Prefix Terminals Expression</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineModelDescriptionImpl#getSuffixTerminalsExpression
 * <em>Suffix Terminals Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextSingleLineModelDescriptionImpl extends TextDescriptionImpl
		implements XtextSingleLineModelDescription {
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
	 * The cached value of the '{@link #getIgnoredNestedFeatures() <em>Ignored
	 * Nested Features</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIgnoredNestedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ignoredNestedFeatures;

	/**
	 * The default value of the '{@link #getPrefixTerminalsExpression()
	 * <em>Prefix Terminals Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrefixTerminalsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_TERMINALS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixTerminalsExpression()
	 * <em>Prefix Terminals Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrefixTerminalsExpression()
	 * @generated
	 * @ordered
	 */
	protected String prefixTerminalsExpression = PREFIX_TERMINALS_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuffixTerminalsExpression()
	 * <em>Suffix Terminals Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSuffixTerminalsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_TERMINALS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffixTerminalsExpression()
	 * <em>Suffix Terminals Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSuffixTerminalsExpression()
	 * @generated
	 * @ordered
	 */
	protected String suffixTerminalsExpression = SUFFIX_TERMINALS_EXPRESSION_EDEFAULT;

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
			this.editableFeatures = new EDataTypeEList<>(String.class, this,
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
	public EList<String> getIgnoredNestedFeatures() {
		if (this.ignoredNestedFeatures == null) {
			this.ignoredNestedFeatures = new EDataTypeEList<>(String.class, this,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES);
		}
		return this.ignoredNestedFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPrefixTerminalsExpression() {
		return this.prefixTerminalsExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPrefixTerminalsExpression(final String newPrefixTerminalsExpression) {
		final String oldPrefixTerminalsExpression = this.prefixTerminalsExpression;
		this.prefixTerminalsExpression = newPrefixTerminalsExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION,
					oldPrefixTerminalsExpression, this.prefixTerminalsExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getSuffixTerminalsExpression() {
		return this.suffixTerminalsExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSuffixTerminalsExpression(final String newSuffixTerminalsExpression) {
		final String oldSuffixTerminalsExpression = this.suffixTerminalsExpression;
		this.suffixTerminalsExpression = newSuffixTerminalsExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION,
					oldSuffixTerminalsExpression, this.suffixTerminalsExpression));
		}
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
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES:
				return getIgnoredNestedFeatures();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION:
				return getPrefixTerminalsExpression();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION:
				return getSuffixTerminalsExpression();
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
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES:
				getIgnoredNestedFeatures().clear();
				getIgnoredNestedFeatures().addAll((Collection<? extends String>) newValue);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION:
				setPrefixTerminalsExpression((String) newValue);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION:
				setSuffixTerminalsExpression((String) newValue);
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
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES:
				getIgnoredNestedFeatures().clear();
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION:
				setPrefixTerminalsExpression(PREFIX_TERMINALS_EXPRESSION_EDEFAULT);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION:
				setSuffixTerminalsExpression(SUFFIX_TERMINALS_EXPRESSION_EDEFAULT);
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
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES:
				return this.ignoredNestedFeatures != null && !this.ignoredNestedFeatures.isEmpty();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION:
				return PREFIX_TERMINALS_EXPRESSION_EDEFAULT == null ? this.prefixTerminalsExpression != null
						: !PREFIX_TERMINALS_EXPRESSION_EDEFAULT.equals(this.prefixTerminalsExpression);
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION:
				return SUFFIX_TERMINALS_EXPRESSION_EDEFAULT == null ? this.suffixTerminalsExpression != null
						: !SUFFIX_TERMINALS_EXPRESSION_EDEFAULT.equals(this.suffixTerminalsExpression);
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
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES:
					return XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES;
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION:
					return XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION;
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION:
					return XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION;
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
				case XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__IGNORED_NESTED_FEATURES;
				case XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__PREFIX_TERMINALS_EXPRESSION;
				case XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__SUFFIX_TERMINALS_EXPRESSION;
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
		result.append(", ignoredNestedFeatures: ");
		result.append(this.ignoredNestedFeatures);
		result.append(", prefixTerminalsExpression: ");
		result.append(this.prefixTerminalsExpression);
		result.append(", suffixTerminalsExpression: ");
		result.append(this.suffixTerminalsExpression);
		result.append(')');
		return result.toString();
	}

} // XtextSingleLineModelDescriptionImpl
