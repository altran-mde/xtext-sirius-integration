/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Feature Extension Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextFeatureExtensionDescriptionImpl#getLabel
 * <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextFeatureExtensionDescriptionImpl extends MinimalEObjectImpl.Container
		implements XtextFeatureExtensionDescription {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected BasicLabelStyleDescription label;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XtextFeatureExtensionDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointxtextPackage.Literals.XTEXT_FEATURE_EXTENSION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BasicLabelStyleDescription getLabel() {
		if (this.label != null && this.label.eIsProxy()) {
			final InternalEObject oldLabel = (InternalEObject) this.label;
			this.label = (BasicLabelStyleDescription) eResolveProxy(oldLabel);
			if (this.label != oldLabel) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ViewpointxtextPackage.XTEXT_FEATURE_EXTENSION_DESCRIPTION__LABEL, oldLabel, this.label));
				}
			}
		}
		return this.label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BasicLabelStyleDescription basicGetLabel() {
		return this.label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabel(final BasicLabelStyleDescription newLabel) {
		final BasicLabelStyleDescription oldLabel = this.label;
		this.label = newLabel;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ViewpointxtextPackage.XTEXT_FEATURE_EXTENSION_DESCRIPTION__LABEL, oldLabel, this.label));
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
			case ViewpointxtextPackage.XTEXT_FEATURE_EXTENSION_DESCRIPTION__LABEL:
				if (resolve) {
					return getLabel();
				}
				return basicGetLabel();
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
			case ViewpointxtextPackage.XTEXT_FEATURE_EXTENSION_DESCRIPTION__LABEL:
				setLabel((BasicLabelStyleDescription) newValue);
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
			case ViewpointxtextPackage.XTEXT_FEATURE_EXTENSION_DESCRIPTION__LABEL:
				setLabel((BasicLabelStyleDescription) null);
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
			case ViewpointxtextPackage.XTEXT_FEATURE_EXTENSION_DESCRIPTION__LABEL:
				return this.label != null;
		}
		return super.eIsSet(featureID);
	}

} // XtextFeatureExtensionDescriptionImpl
