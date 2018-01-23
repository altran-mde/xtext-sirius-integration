<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
import org.eclipse.emf.ecore.impl.EObjectImpl;
=======
import org.eclipse.sirius.properties.impl.TextDescriptionImpl;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
import org.eclipse.emf.ecore.impl.EObjectImpl;
>>>>>>> updated to Oxygen.2
=======
import org.eclipse.sirius.properties.impl.TextDescriptionImpl;
>>>>>>> fixed invalid import in generated files

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Single Line Value Description</b></em>'. <!-- end-user-doc -->
=======
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Xtext Single Line Value Description</b></em>'. <!-- end-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Single Line Value Description</b></em>'. <!-- end-user-doc -->
>>>>>>> updated to Oxygen.2
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getPrefixTextExpression
 * <em>Prefix Text Expression</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getSuffixTextExpression
=======
 * <li>
 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getInjectorId
=======
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getInjectorId
>>>>>>> updated to Oxygen.2
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getPrefixTextExpression
 * <em>Prefix Text Expression</em>}</li>
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
 * <li>
 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getSuffixTextExpression
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getSuffixTextExpression
>>>>>>> updated to Oxygen.2
 * <em>Suffix Text Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
public class XtextSingleLineValueDescriptionImpl extends EObjectImpl implements XtextSingleLineValueDescription {
=======
public class XtextSingleLineValueDescriptionImpl extends TextDescriptionImpl
		implements XtextSingleLineValueDescription {
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
public class XtextSingleLineValueDescriptionImpl extends EObjectImpl implements XtextSingleLineValueDescription {
>>>>>>> updated to Oxygen.2
=======
public class XtextSingleLineValueDescriptionImpl extends TextDescriptionImpl
		implements XtextSingleLineValueDescription {
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
	 * The default value of the '{@link #getPrefixTextExpression() <em>Prefix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
=======
	 * The default value of the '{@link #getPrefixTextExpression()
	 * <em>Prefix Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * The default value of the '{@link #getPrefixTextExpression() <em>Prefix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
>>>>>>> updated to Oxygen.2
	 * end-user-doc -->
	 * 
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_TEXT_EXPRESSION_EDEFAULT = null;

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * The cached value of the '{@link #getPrefixTextExpression() <em>Prefix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
=======
	 * The cached value of the '{@link #getPrefixTextExpression()
	 * <em>Prefix Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * The cached value of the '{@link #getPrefixTextExpression() <em>Prefix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
>>>>>>> updated to Oxygen.2
	 * end-user-doc -->
	 * 
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected String prefixTextExpression = PREFIX_TEXT_EXPRESSION_EDEFAULT;

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * The default value of the '{@link #getSuffixTextExpression() <em>Suffix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
=======
	 * The default value of the '{@link #getSuffixTextExpression()
	 * <em>Suffix Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * The default value of the '{@link #getSuffixTextExpression() <em>Suffix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
>>>>>>> updated to Oxygen.2
	 * end-user-doc -->
	 * 
	 * @see #getSuffixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_TEXT_EXPRESSION_EDEFAULT = null;

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * The cached value of the '{@link #getSuffixTextExpression() <em>Suffix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
=======
	 * The cached value of the '{@link #getSuffixTextExpression()
	 * <em>Suffix Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * The cached value of the '{@link #getSuffixTextExpression() <em>Suffix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
>>>>>>> updated to Oxygen.2
	 * end-user-doc -->
	 * 
	 * @see #getSuffixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected String suffixTextExpression = SUFFIX_TEXT_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XtextSingleLineValueDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesxtextPackage.Literals.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION;
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
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID, oldInjectorId,
					this.injectorId));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPrefixTextExpression() {
		return this.prefixTextExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPrefixTextExpression(final String newPrefixTextExpression) {
		final String oldPrefixTextExpression = this.prefixTextExpression;
		this.prefixTextExpression = newPrefixTextExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION,
					oldPrefixTextExpression, this.prefixTextExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getSuffixTextExpression() {
		return this.suffixTextExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSuffixTextExpression(final String newSuffixTextExpression) {
		final String oldSuffixTextExpression = this.suffixTextExpression;
		this.suffixTextExpression = newSuffixTextExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION,
					oldSuffixTextExpression, this.suffixTextExpression));
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
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
				return getInjectorId();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return getPrefixTextExpression();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return getSuffixTextExpression();
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
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
				setInjectorId((String) newValue);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				setPrefixTextExpression((String) newValue);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				setSuffixTextExpression((String) newValue);
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
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
				setInjectorId(INJECTOR_ID_EDEFAULT);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				setPrefixTextExpression(PREFIX_TEXT_EXPRESSION_EDEFAULT);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				setSuffixTextExpression(SUFFIX_TEXT_EXPRESSION_EDEFAULT);
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
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
				return INJECTOR_ID_EDEFAULT == null ? this.injectorId != null
						: !INJECTOR_ID_EDEFAULT.equals(this.injectorId);
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return PREFIX_TEXT_EXPRESSION_EDEFAULT == null ? this.prefixTextExpression != null
						: !PREFIX_TEXT_EXPRESSION_EDEFAULT.equals(this.prefixTextExpression);
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return SUFFIX_TEXT_EXPRESSION_EDEFAULT == null ? this.suffixTextExpression != null
						: !SUFFIX_TEXT_EXPRESSION_EDEFAULT.equals(this.suffixTextExpression);
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
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
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
		if (baseClass == IXtextValueDescription.class) {
			switch (derivedFeatureID) {
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
					return XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
					return XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextPropertyValueDescription.class) {
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
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID;
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
		if (baseClass == IXtextValueDescription.class) {
			switch (baseFeatureID) {
				case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
				case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextPropertyValueDescription.class) {
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
		result.append(", prefixTextExpression: ");
		result.append(this.prefixTextExpression);
		result.append(", suffixTextExpression: ");
		result.append(this.suffixTextExpression);
		result.append(')');
		return result.toString();
	}

} // XtextSingleLineValueDescriptionImpl
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.properties.impl.TextDescriptionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xtext Single Line Value Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getInjectorId <em>Injector Id</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getPrefixTextExpression <em>Prefix Text Expression</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getSuffixTextExpression <em>Suffix Text Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextSingleLineValueDescriptionImpl extends TextDescriptionImpl
		implements XtextSingleLineValueDescription {
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
	 * The default value of the '{@link #getPrefixTextExpression() <em>Prefix Text Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_TEXT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixTextExpression() <em>Prefix Text Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected String prefixTextExpression = PREFIX_TEXT_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuffixTextExpression() <em>Suffix Text Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_TEXT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffixTextExpression() <em>Suffix Text Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected String suffixTextExpression = SUFFIX_TEXT_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XtextSingleLineValueDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesxtextPackage.Literals.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION;
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
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID, oldInjectorId,
					injectorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefixTextExpression() {
		return prefixTextExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefixTextExpression(String newPrefixTextExpression) {
		String oldPrefixTextExpression = prefixTextExpression;
		prefixTextExpression = newPrefixTextExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION,
					oldPrefixTextExpression, prefixTextExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffixTextExpression() {
		return suffixTextExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffixTextExpression(String newSuffixTextExpression) {
		String oldSuffixTextExpression = suffixTextExpression;
		suffixTextExpression = newSuffixTextExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION,
					oldSuffixTextExpression, suffixTextExpression));
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
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
			return getInjectorId();
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			return getPrefixTextExpression();
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
			return getSuffixTextExpression();
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
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
			setInjectorId((String) newValue);
			return;
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			setPrefixTextExpression((String) newValue);
			return;
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
			setSuffixTextExpression((String) newValue);
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
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
			setInjectorId(INJECTOR_ID_EDEFAULT);
			return;
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			setPrefixTextExpression(PREFIX_TEXT_EXPRESSION_EDEFAULT);
			return;
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
			setSuffixTextExpression(SUFFIX_TEXT_EXPRESSION_EDEFAULT);
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
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
			return INJECTOR_ID_EDEFAULT == null ? injectorId != null : !INJECTOR_ID_EDEFAULT.equals(injectorId);
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			return PREFIX_TEXT_EXPRESSION_EDEFAULT == null ? prefixTextExpression != null
					: !PREFIX_TEXT_EXPRESSION_EDEFAULT.equals(prefixTextExpression);
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
			return SUFFIX_TEXT_EXPRESSION_EDEFAULT == null ? suffixTextExpression != null
					: !SUFFIX_TEXT_EXPRESSION_EDEFAULT.equals(suffixTextExpression);
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
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
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
		if (baseClass == IXtextValueDescription.class) {
			switch (derivedFeatureID) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextPropertyValueDescription.class) {
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
				return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID;
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
		if (baseClass == IXtextValueDescription.class) {
			switch (baseFeatureID) {
			case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
			case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextPropertyValueDescription.class) {
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
		result.append(", prefixTextExpression: ");
		result.append(prefixTextExpression);
		result.append(", suffixTextExpression: ");
		result.append(suffixTextExpression);
		result.append(')');
		return result.toString();
	}

} //XtextSingleLineValueDescriptionImpl
>>>>>>> preliminary fix for using guava v16
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
