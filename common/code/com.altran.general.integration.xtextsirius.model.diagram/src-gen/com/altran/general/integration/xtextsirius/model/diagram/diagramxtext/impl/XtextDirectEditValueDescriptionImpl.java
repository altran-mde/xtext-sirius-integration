/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xtext Direct Edit Value Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl#getInjectorId <em>Injector Id</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl#isMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl#getPrefixTextExpression <em>Prefix Text Expression</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl#getSuffixTextExpression <em>Suffix Text Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextDirectEditValueDescriptionImpl extends AXtextDirectEditLabelImpl
		implements XtextDirectEditValueDescription {
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
	 * The default value of the '{@link #isMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiLine()
	 * @generated
	 * @ordered
	 */
	protected boolean multiLine = MULTI_LINE_EDEFAULT;

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
	protected XtextDirectEditValueDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramxtextPackage.Literals.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION;
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
					DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID, oldInjectorId, injectorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiLine() {
		return multiLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiLine(boolean newMultiLine) {
		boolean oldMultiLine = multiLine;
		multiLine = newMultiLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE, oldMultiLine, multiLine));
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
					DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION,
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
					DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION,
					oldSuffixTextExpression, suffixTextExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
			return getInjectorId();
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
			return isMultiLine();
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			return getPrefixTextExpression();
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
			setInjectorId((String) newValue);
			return;
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
			setMultiLine((Boolean) newValue);
			return;
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			setPrefixTextExpression((String) newValue);
			return;
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
			setInjectorId(INJECTOR_ID_EDEFAULT);
			return;
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
			setMultiLine(MULTI_LINE_EDEFAULT);
			return;
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			setPrefixTextExpression(PREFIX_TEXT_EXPRESSION_EDEFAULT);
			return;
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
			return INJECTOR_ID_EDEFAULT == null ? injectorId != null : !INJECTOR_ID_EDEFAULT.equals(injectorId);
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
			return multiLine != MULTI_LINE_EDEFAULT;
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			return PREFIX_TEXT_EXPRESSION_EDEFAULT == null ? prefixTextExpression != null
					: !PREFIX_TEXT_EXPRESSION_EDEFAULT.equals(prefixTextExpression);
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
				return XtextsiriusPackage.IXTEXT_DESCRIPTION__INJECTOR_ID;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextDirectEditDescription.class) {
			switch (derivedFeatureID) {
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
				return XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextValueDescription.class) {
			switch (derivedFeatureID) {
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextDirectEditValueDescription.class) {
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
				return DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextDirectEditDescription.class) {
			switch (baseFeatureID) {
			case XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE:
				return DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextValueDescription.class) {
			switch (baseFeatureID) {
			case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
			case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
			default:
				return -1;
			}
		}
		if (baseClass == IXtextDirectEditValueDescription.class) {
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
		result.append(", multiLine: ");
		result.append(multiLine);
		result.append(", prefixTextExpression: ");
		result.append(prefixTextExpression);
		result.append(", suffixTextExpression: ");
		result.append(suffixTextExpression);
		result.append(')');
		return result.toString();
	}

} //XtextDirectEditValueDescriptionImpl
