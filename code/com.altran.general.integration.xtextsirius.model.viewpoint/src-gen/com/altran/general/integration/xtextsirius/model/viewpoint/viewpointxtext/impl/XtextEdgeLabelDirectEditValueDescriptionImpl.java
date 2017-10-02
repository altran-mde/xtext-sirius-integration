/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;
import org.eclipse.sirius.viewpoint.description.tool.impl.AbstractToolDescriptionImpl;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Edge Label Direct Edit Value Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl#isMultiLine
 * <em>Multi Line</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl#getEdgeLabelMappings
 * <em>Edge Label Mappings</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl#getPrefixTextExpression
 * <em>Prefix Text Expression</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl#getSuffixTextExpression
 * <em>Suffix Text Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextEdgeLabelDirectEditValueDescriptionImpl extends AbstractToolDescriptionImpl
		implements XtextEdgeLabelDirectEditValueDescription {
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
	 * The default value of the '{@link #isMultiLine() <em>Multi Line</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isMultiLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiLine() <em>Multi Line</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isMultiLine()
	 * @generated
	 * @ordered
	 */
	protected boolean multiLine = MULTI_LINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEdgeLabelMappings() <em>Edge Label
	 * Mappings</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getEdgeLabelMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicLabelStyleDescription> edgeLabelMappings;

	/**
	 * The default value of the '{@link #getPrefixTextExpression() <em>Prefix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_TEXT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixTextExpression() <em>Prefix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected String prefixTextExpression = PREFIX_TEXT_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuffixTextExpression() <em>Suffix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSuffixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_TEXT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffixTextExpression() <em>Suffix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
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
	protected XtextEdgeLabelDirectEditValueDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointxtextPackage.Literals.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION;
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
					ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID, oldInjectorId,
					this.injectorId));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isMultiLine() {
		return this.multiLine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMultiLine(final boolean newMultiLine) {
		final boolean oldMultiLine = this.multiLine;
		this.multiLine = newMultiLine;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE, oldMultiLine,
					this.multiLine));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<BasicLabelStyleDescription> getEdgeLabelMappings() {
		if (this.edgeLabelMappings == null) {
			this.edgeLabelMappings = new EObjectResolvingEList<>(
					BasicLabelStyleDescription.class,
					this, ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS);
		}
		return this.edgeLabelMappings;
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
					ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION,
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
					ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION,
					oldSuffixTextExpression, this.suffixTextExpression));
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
				return getInjectorId();
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
				return isMultiLine();
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				return getEdgeLabelMappings();
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return getPrefixTextExpression();
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return getSuffixTextExpression();
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
				setInjectorId((String) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
				setMultiLine((Boolean) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				getEdgeLabelMappings().clear();
				getEdgeLabelMappings().addAll((Collection<? extends BasicLabelStyleDescription>) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				setPrefixTextExpression((String) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
				setInjectorId(INJECTOR_ID_EDEFAULT);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
				setMultiLine(MULTI_LINE_EDEFAULT);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				getEdgeLabelMappings().clear();
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				setPrefixTextExpression(PREFIX_TEXT_EXPRESSION_EDEFAULT);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
				return INJECTOR_ID_EDEFAULT == null ? this.injectorId != null
						: !INJECTOR_ID_EDEFAULT.equals(this.injectorId);
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
				return this.multiLine != MULTI_LINE_EDEFAULT;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				return this.edgeLabelMappings != null && !this.edgeLabelMappings.isEmpty();
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return PREFIX_TEXT_EXPRESSION_EDEFAULT == null ? this.prefixTextExpression != null
						: !PREFIX_TEXT_EXPRESSION_EDEFAULT.equals(this.prefixTextExpression);
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
					return XtextsiriusPackage.IXTEXT_DESCRIPTION__INJECTOR_ID;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextDirectEditDescription.class) {
			switch (derivedFeatureID) {
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
					return XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextEdgeLabelDirectEditDescription.class) {
			switch (derivedFeatureID) {
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
					return ViewpointxtextPackage.IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextValueDescription.class) {
			switch (derivedFeatureID) {
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
					return XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
		if (baseClass == IXtextDescription.class) {
			switch (baseFeatureID) {
				case XtextsiriusPackage.IXTEXT_DESCRIPTION__INJECTOR_ID:
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextDirectEditDescription.class) {
			switch (baseFeatureID) {
				case XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE:
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextEdgeLabelDirectEditDescription.class) {
			switch (baseFeatureID) {
				case ViewpointxtextPackage.IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS:
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextValueDescription.class) {
			switch (baseFeatureID) {
				case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
				case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
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
		result.append(", multiLine: ");
		result.append(this.multiLine);
		result.append(", prefixTextExpression: ");
		result.append(this.prefixTextExpression);
		result.append(", suffixTextExpression: ");
		result.append(this.suffixTextExpression);
		result.append(')');
		return result.toString();
	}

} // XtextEdgeLabelDirectEditValueDescriptionImpl
