/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Representation Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextRepresentationExtensionImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextRepresentationExtensionImpl#getViewpointURI
 * <em>Viewpoint URI</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextRepresentationExtensionImpl#getRepresentationName
 * <em>Representation Name</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextRepresentationExtensionImpl#getMetamodel
 * <em>Metamodel</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.impl.XtextRepresentationExtensionImpl#getLalala
 * <em>Lalala</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextRepresentationExtensionImpl extends MinimalEObjectImpl.Container
		implements XtextRepresentationExtension {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewpointURI() <em>Viewpoint
	 * URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getViewpointURI()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWPOINT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewpointURI() <em>Viewpoint
	 * URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getViewpointURI()
	 * @generated
	 * @ordered
	 */
	protected String viewpointURI = VIEWPOINT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentationName()
	 * <em>Representation Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRepresentationName()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationName()
	 * <em>Representation Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRepresentationName()
	 * @generated
	 * @ordered
	 */
	protected String representationName = REPRESENTATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> metamodel;

	/**
	 * The default value of the '{@link #getLalala() <em>Lalala</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLalala()
	 * @generated
	 * @ordered
	 */
	protected static final String LALALA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLalala() <em>Lalala</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLalala()
	 * @generated
	 * @ordered
	 */
	protected String lalala = LALALA_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XtextRepresentationExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointxtextPackage.Literals.XTEXT_REPRESENTATION_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setName(final String newName) {
		final String oldName = this.name;
		this.name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__NAME, oldName, this.name));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getViewpointURI() {
		return this.viewpointURI;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setViewpointURI(final String newViewpointURI) {
		final String oldViewpointURI = this.viewpointURI;
		this.viewpointURI = newViewpointURI;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__VIEWPOINT_URI, oldViewpointURI,
					this.viewpointURI));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getRepresentationName() {
		return this.representationName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setRepresentationName(final String newRepresentationName) {
		final String oldRepresentationName = this.representationName;
		this.representationName = newRepresentationName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__REPRESENTATION_NAME, oldRepresentationName,
					this.representationName));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EPackage> getMetamodel() {
		if (this.metamodel == null) {
			this.metamodel = new EObjectResolvingEList<>(EPackage.class, this,
					ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__METAMODEL);
		}
		return this.metamodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLalala() {
		return this.lalala;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLalala(final String newLalala) {
		final String oldLalala = this.lalala;
		this.lalala = newLalala;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__LALALA, oldLalala, this.lalala));
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
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__NAME:
				return getName();
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__VIEWPOINT_URI:
				return getViewpointURI();
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__REPRESENTATION_NAME:
				return getRepresentationName();
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__METAMODEL:
				return getMetamodel();
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__LALALA:
				return getLalala();
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
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__NAME:
				setName((String) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__VIEWPOINT_URI:
				setViewpointURI((String) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__REPRESENTATION_NAME:
				setRepresentationName((String) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__METAMODEL:
				getMetamodel().clear();
				getMetamodel().addAll((Collection<? extends EPackage>) newValue);
				return;
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__LALALA:
				setLalala((String) newValue);
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
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__VIEWPOINT_URI:
				setViewpointURI(VIEWPOINT_URI_EDEFAULT);
				return;
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__REPRESENTATION_NAME:
				setRepresentationName(REPRESENTATION_NAME_EDEFAULT);
				return;
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__METAMODEL:
				getMetamodel().clear();
				return;
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__LALALA:
				setLalala(LALALA_EDEFAULT);
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
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__NAME:
				return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__VIEWPOINT_URI:
				return VIEWPOINT_URI_EDEFAULT == null ? this.viewpointURI != null
						: !VIEWPOINT_URI_EDEFAULT.equals(this.viewpointURI);
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__REPRESENTATION_NAME:
				return REPRESENTATION_NAME_EDEFAULT == null ? this.representationName != null
						: !REPRESENTATION_NAME_EDEFAULT.equals(this.representationName);
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__METAMODEL:
				return this.metamodel != null && !this.metamodel.isEmpty();
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__LALALA:
				return LALALA_EDEFAULT == null ? this.lalala != null : !LALALA_EDEFAULT.equals(this.lalala);
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(this.name);
		result.append(", viewpointURI: ");
		result.append(this.viewpointURI);
		result.append(", representationName: ");
		result.append(this.representationName);
		result.append(", lalala: ");
		result.append(this.lalala);
		result.append(')');
		return result.toString();
	}

} // XtextRepresentationExtensionImpl
