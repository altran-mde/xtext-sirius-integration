/**
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.IdElementImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdElementImpl extends AElementImpl<IdElement> implements IdElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdElementImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextSiriusTestPackage.Literals.ID_ELEMENT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setChangeableRef(IdElement newChangeableRef) {
		super.setChangeableRef(newChangeableRef);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getChangeableListRef() {
		if (changeableListRef == null) {
			changeableListRef = new EObjectResolvingEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__CHANGEABLE_LIST_REF);
		}
		return changeableListRef;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getUnchangeableListRef() {
		if (unchangeableListRef == null) {
			unchangeableListRef = new EObjectResolvingEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__UNCHANGEABLE_LIST_REF);
		}
		return unchangeableListRef;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getChangeableSetRef() {
		if (changeableSetRef == null) {
			changeableSetRef = new EObjectResolvingEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__CHANGEABLE_SET_REF);
		}
		return changeableSetRef;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getUnchangeableSetRef() {
		if (unchangeableSetRef == null) {
			unchangeableSetRef = new EObjectResolvingEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__UNCHANGEABLE_SET_REF);
		}
		return unchangeableSetRef;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getChangeableBagRef() {
		if (changeableBagRef == null) {
			changeableBagRef = new EObjectResolvingEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__CHANGEABLE_BAG_REF);
		}
		return changeableBagRef;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getUnchangeableBagRef() {
		if (unchangeableBagRef == null) {
			unchangeableBagRef = new EObjectResolvingEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__UNCHANGEABLE_BAG_REF);
		}
		return unchangeableBagRef;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getChangeableUniqueListCont() {
		if (changeableUniqueListCont == null) {
			changeableUniqueListCont = new EObjectContainmentEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT);
		}
		return changeableUniqueListCont;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getUnchangeableUniqueListCont() {
		if (unchangeableUniqueListCont == null) {
			unchangeableUniqueListCont = new EObjectContainmentEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT);
		}
		return unchangeableUniqueListCont;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getChangeableSetCont() {
		if (changeableSetCont == null) {
			changeableSetCont = new EObjectContainmentEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__CHANGEABLE_SET_CONT);
		}
		return changeableSetCont;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetChangeableCont(IdElement newChangeableCont, NotificationChain msgs) {
		return super.basicSetChangeableCont(newChangeableCont, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetUnchangeableCont(IdElement newUnchangeableCont, NotificationChain msgs) {
		return super.basicSetUnchangeableCont(newUnchangeableCont, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IdElement> getUnchangeableSetCont() {
		if (unchangeableSetCont == null) {
			unchangeableSetCont = new EObjectContainmentEList<IdElement>(IdElement.class, this,
					XtextSiriusTestPackage.ID_ELEMENT__UNCHANGEABLE_SET_CONT);
		}
		return unchangeableSetCont;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextSiriusTestPackage.ID_ELEMENT__ID, oldId, id));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtextSiriusTestPackage.ID_ELEMENT__ID:
				return getId();
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
			case XtextSiriusTestPackage.ID_ELEMENT__ID:
				setId((String) newValue);
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
			case XtextSiriusTestPackage.ID_ELEMENT__ID:
				setId(ID_EDEFAULT);
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
			case XtextSiriusTestPackage.ID_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}
	
} //IdElementImpl
