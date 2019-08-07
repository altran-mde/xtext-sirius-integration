/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.XtextDirectEditValueDescriptionImpl;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditValueDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Edge Label Direct Edit Value Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextEdgeLabelDirectEditValueDescriptionImpl#getEdgeLabelMappings
 * <em>Edge Label Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextEdgeLabelDirectEditValueDescriptionImpl extends XtextDirectEditValueDescriptionImpl
		implements XtextEdgeLabelDirectEditValueDescription {
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
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				return getEdgeLabelMappings();
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				getEdgeLabelMappings().clear();
				getEdgeLabelMappings().addAll((Collection<? extends BasicLabelStyleDescription>) newValue);
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				getEdgeLabelMappings().clear();
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
			case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
				return this.edgeLabelMappings != null && !this.edgeLabelMappings.isEmpty();
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
		if (baseClass == IXtextEdgeLabelDirectEditDescription.class) {
			switch (derivedFeatureID) {
				case ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS:
					return ViewpointxtextPackage.IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS;
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
		if (baseClass == IXtextEdgeLabelDirectEditDescription.class) {
			switch (baseFeatureID) {
				case ViewpointxtextPackage.IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS:
					return ViewpointxtextPackage.XTEXT_EDGE_LABEL_DIRECT_EDIT_VALUE_DESCRIPTION__EDGE_LABEL_MAPPINGS;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
} // XtextEdgeLabelDirectEditValueDescriptionImpl
