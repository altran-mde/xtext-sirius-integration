/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditModelDescriptionImpl;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Edge Label Direct Edit Model Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditModelDescriptionImpl#getEdgeLabelMappings <em>Edge Label Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextEdgeLabelDirectEditModelDescriptionImpl extends XtextDirectEditModelDescriptionImpl
		implements XtextEdgeLabelDirectEditModelDescription {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected XtextEdgeLabelDirectEditModelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointxtextPackage.Literals.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasicLabelStyleDescription> getEdgeLabelMappings() {
		if (edgeLabelMappings == null) {
			edgeLabelMappings = new EObjectResolvingEList<BasicLabelStyleDescription>(BasicLabelStyleDescription.class,
					this, ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS);
		}
		return edgeLabelMappings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
			return getEdgeLabelMappings();
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
		case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
			getEdgeLabelMappings().clear();
			getEdgeLabelMappings().addAll((Collection<? extends BasicLabelStyleDescription>) newValue);
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
		case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
			getEdgeLabelMappings().clear();
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
		case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
			return edgeLabelMappings != null && !edgeLabelMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IXtextEdgeLabelDirectEditDescription.class) {
			switch (derivedFeatureID) {
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				return ViewpointxtextPackage.IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS;
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
		if (baseClass == IXtextEdgeLabelDirectEditDescription.class) {
			switch (baseFeatureID) {
			case ViewpointxtextPackage.IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_MODEL_DESCRIPTION__EDGE_LABEL_MAPPINGS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // XtextEdgeLabelDirectEditModelDescriptionImpl
