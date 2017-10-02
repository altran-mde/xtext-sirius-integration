/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;
import org.eclipse.sirius.viewpoint.description.tool.impl.AbstractToolDescriptionImpl;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Edge Label Direct Edit Model Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditModelDescriptionImpl#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditModelDescriptionImpl#isMultiLine
 * <em>Multi Line</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditModelDescriptionImpl#getEdgeLabelMappings
 * <em>Edge Label Mappings</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditModelDescriptionImpl#getEditableFeatures
 * <em>Editable Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextEdgeLabelDirectEditModelDescriptionImpl extends AbstractToolDescriptionImpl
		implements XtextEdgeLabelDirectEditModelDescription {
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
	 * 
	 * @generated
	 */
	protected XtextEdgeLabelDirectEditModelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointxtextPackage.Literals.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION;
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
					ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID, oldInjectorId,
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
					ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE, oldMultiLine,
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
					this, ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS);
		}
		return this.edgeLabelMappings;
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
					ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES);
		}
		return this.editableFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID:
				return getInjectorId();
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE:
				return isMultiLine();
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				return getEdgeLabelMappings();
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES:
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID:
				setInjectorId((String) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE:
				setMultiLine((Boolean) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				getEdgeLabelMappings().clear();
				getEdgeLabelMappings().addAll((Collection<? extends BasicLabelStyleDescription>) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES:
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID:
				setInjectorId(INJECTOR_ID_EDEFAULT);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE:
				setMultiLine(MULTI_LINE_EDEFAULT);
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				getEdgeLabelMappings().clear();
				return;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES:
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID:
				return INJECTOR_ID_EDEFAULT == null ? this.injectorId != null
						: !INJECTOR_ID_EDEFAULT.equals(this.injectorId);
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE:
				return this.multiLine != MULTI_LINE_EDEFAULT;
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				return this.edgeLabelMappings != null && !this.edgeLabelMappings.isEmpty();
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES:
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
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID:
					return XtextsiriusPackage.IXTEXT_DESCRIPTION__INJECTOR_ID;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextDirectEditDescription.class) {
			switch (derivedFeatureID) {
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE:
					return XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextEdgeLabelDirectEditDescription.class) {
			switch (derivedFeatureID) {
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
					return ViewpointxtextPackage.IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextModelDescription.class) {
			switch (derivedFeatureID) {
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES:
					return XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextDirectEditModelDescription.class) {
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
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextDirectEditDescription.class) {
			switch (baseFeatureID) {
				case XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE:
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextEdgeLabelDirectEditDescription.class) {
			switch (baseFeatureID) {
				case ViewpointxtextPackage.IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS:
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextModelDescription.class) {
			switch (baseFeatureID) {
				case XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES:
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextDirectEditModelDescription.class) {
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
		result.append(", editableFeatures: ");
		result.append(this.editableFeatures);
		result.append(')');
		return result.toString();
	}

} // XtextEdgeLabelDirectEditModelDescriptionImpl
