/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AElement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableAttr <em>Changeable Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableAttr <em>Unchangeable Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableListAttr <em>Changeable List Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableListAttr <em>Unchangeable List Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableSetAttr <em>Changeable Set Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableSetAttr <em>Unchangeable Set Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableBagAttr <em>Changeable Bag Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableBagAttr <em>Unchangeable Bag Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getContainedSingle <em>Contained Single</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getContainedMulti <em>Contained Multi</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableRef <em>Changeable Ref</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableRef <em>Unchangeable Ref</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableListRef <em>Changeable List Ref</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableListRef <em>Unchangeable List Ref</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableSetRef <em>Changeable Set Ref</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableSetRef <em>Unchangeable Set Ref</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableBagRef <em>Changeable Bag Ref</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableBagRef <em>Unchangeable Bag Ref</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableUniqueListCont <em>Changeable Unique List Cont</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableUniqueListCont <em>Unchangeable Unique List Cont</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableSetCont <em>Changeable Set Cont</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getChangeableCont <em>Changeable Cont</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableCont <em>Unchangeable Cont</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.AElementImpl#getUnchangeableSetCont <em>Unchangeable Set Cont</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AElementImpl<A extends AElement<?>> extends MinimalEObjectImpl.Container implements AElement<A> {
	/**
	 * The default value of the '{@link #getChangeableAttr() <em>Changeable Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGEABLE_ATTR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeableAttr() <em>Changeable Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableAttr()
	 * @generated
	 * @ordered
	 */
	protected String changeableAttr = CHANGEABLE_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnchangeableAttr() <em>Unchangeable Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int UNCHANGEABLE_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnchangeableAttr() <em>Unchangeable Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableAttr()
	 * @generated
	 * @ordered
	 */
	protected int unchangeableAttr = UNCHANGEABLE_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChangeableListAttr() <em>Changeable List Attr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableListAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<String> changeableListAttr;

	/**
	 * The cached value of the '{@link #getUnchangeableListAttr() <em>Unchangeable List Attr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableListAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> unchangeableListAttr;

	/**
	 * The cached value of the '{@link #getChangeableSetAttr() <em>Changeable Set Attr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableSetAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> changeableSetAttr;

	/**
	 * The cached value of the '{@link #getUnchangeableSetAttr() <em>Unchangeable Set Attr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableSetAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> unchangeableSetAttr;

	/**
	 * The cached value of the '{@link #getChangeableBagAttr() <em>Changeable Bag Attr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableBagAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> changeableBagAttr;

	/**
	 * The cached value of the '{@link #getUnchangeableBagAttr() <em>Unchangeable Bag Attr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableBagAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> unchangeableBagAttr;

	/**
	 * The cached value of the '{@link #getContainedSingle() <em>Contained Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSingle()
	 * @generated
	 * @ordered
	 */
	protected IContainedElement containedSingle;

	/**
	 * The cached value of the '{@link #getContainedMulti() <em>Contained Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedMulti()
	 * @generated
	 * @ordered
	 */
	protected EList<IContainedElement> containedMulti;

	/**
	 * The cached value of the '{@link #getChangeableRef() <em>Changeable Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableRef()
	 * @generated
	 * @ordered
	 */
	protected A changeableRef;

	/**
	 * The cached value of the '{@link #getUnchangeableRef() <em>Unchangeable Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableRef()
	 * @generated
	 * @ordered
	 */
	protected A unchangeableRef;

	/**
	 * The cached value of the '{@link #getChangeableListRef() <em>Changeable List Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableListRef()
	 * @generated
	 * @ordered
	 */
	protected EList<A> changeableListRef;

	/**
	 * The cached value of the '{@link #getUnchangeableListRef() <em>Unchangeable List Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableListRef()
	 * @generated
	 * @ordered
	 */
	protected EList<A> unchangeableListRef;

	/**
	 * The cached value of the '{@link #getChangeableSetRef() <em>Changeable Set Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableSetRef()
	 * @generated
	 * @ordered
	 */
	protected EList<A> changeableSetRef;

	/**
	 * The cached value of the '{@link #getUnchangeableSetRef() <em>Unchangeable Set Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableSetRef()
	 * @generated
	 * @ordered
	 */
	protected EList<A> unchangeableSetRef;

	/**
	 * The cached value of the '{@link #getChangeableBagRef() <em>Changeable Bag Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableBagRef()
	 * @generated
	 * @ordered
	 */
	protected EList<A> changeableBagRef;

	/**
	 * The cached value of the '{@link #getUnchangeableBagRef() <em>Unchangeable Bag Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableBagRef()
	 * @generated
	 * @ordered
	 */
	protected EList<A> unchangeableBagRef;

	/**
	 * The cached value of the '{@link #getChangeableUniqueListCont() <em>Changeable Unique List Cont</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableUniqueListCont()
	 * @generated
	 * @ordered
	 */
	protected EList<A> changeableUniqueListCont;

	/**
	 * The cached value of the '{@link #getUnchangeableUniqueListCont() <em>Unchangeable Unique List Cont</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableUniqueListCont()
	 * @generated
	 * @ordered
	 */
	protected EList<A> unchangeableUniqueListCont;

	/**
	 * The cached value of the '{@link #getChangeableSetCont() <em>Changeable Set Cont</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableSetCont()
	 * @generated
	 * @ordered
	 */
	protected EList<A> changeableSetCont;

	/**
	 * The cached value of the '{@link #getChangeableCont() <em>Changeable Cont</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableCont()
	 * @generated
	 * @ordered
	 */
	protected A changeableCont;

	/**
	 * The cached value of the '{@link #getUnchangeableCont() <em>Unchangeable Cont</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableCont()
	 * @generated
	 * @ordered
	 */
	protected A unchangeableCont;

	/**
	 * The cached value of the '{@link #getUnchangeableSetCont() <em>Unchangeable Set Cont</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableSetCont()
	 * @generated
	 * @ordered
	 */
	protected EList<A> unchangeableSetCont;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextSiriusTestPackage.Literals.AELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChangeableAttr() {
		return changeableAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeableAttr(String newChangeableAttr) {
		String oldChangeableAttr = changeableAttr;
		changeableAttr = newChangeableAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextSiriusTestPackage.AELEMENT__CHANGEABLE_ATTR,
					oldChangeableAttr, changeableAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnchangeableAttr() {
		return unchangeableAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getChangeableListAttr() {
		if (changeableListAttr == null) {
			changeableListAttr = new EDataTypeEList<String>(String.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_ATTR);
		}
		return changeableListAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getUnchangeableListAttr() {
		if (unchangeableListAttr == null) {
			unchangeableListAttr = new EDataTypeEList<Boolean>(Boolean.class, this,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_LIST_ATTR);
		}
		return unchangeableListAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getChangeableSetAttr() {
		if (changeableSetAttr == null) {
			changeableSetAttr = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_ATTR);
		}
		return changeableSetAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getUnchangeableSetAttr() {
		if (unchangeableSetAttr == null) {
			unchangeableSetAttr = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_ATTR);
		}
		return unchangeableSetAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getChangeableBagAttr() {
		if (changeableBagAttr == null) {
			changeableBagAttr = new EDataTypeEList<Double>(Double.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_ATTR);
		}
		return changeableBagAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getUnchangeableBagAttr() {
		if (unchangeableBagAttr == null) {
			unchangeableBagAttr = new EDataTypeEList<Double>(Double.class, this,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_BAG_ATTR);
		}
		return unchangeableBagAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContainedElement getContainedSingle() {
		return containedSingle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedSingle(IContainedElement newContainedSingle, NotificationChain msgs) {
		IContainedElement oldContainedSingle = containedSingle;
		containedSingle = newContainedSingle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					XtextSiriusTestPackage.AELEMENT__CONTAINED_SINGLE, oldContainedSingle, newContainedSingle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedSingle(IContainedElement newContainedSingle) {
		if (newContainedSingle != containedSingle) {
			NotificationChain msgs = null;
			if (containedSingle != null)
				msgs = ((InternalEObject) containedSingle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - XtextSiriusTestPackage.AELEMENT__CONTAINED_SINGLE, null, msgs);
			if (newContainedSingle != null)
				msgs = ((InternalEObject) newContainedSingle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - XtextSiriusTestPackage.AELEMENT__CONTAINED_SINGLE, null, msgs);
			msgs = basicSetContainedSingle(newContainedSingle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextSiriusTestPackage.AELEMENT__CONTAINED_SINGLE,
					newContainedSingle, newContainedSingle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IContainedElement> getContainedMulti() {
		if (containedMulti == null) {
			containedMulti = new EObjectContainmentEList<IContainedElement>(IContainedElement.class, this,
					XtextSiriusTestPackage.AELEMENT__CONTAINED_MULTI);
		}
		return containedMulti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public A getChangeableRef() {
		if (changeableRef != null && changeableRef.eIsProxy()) {
			InternalEObject oldChangeableRef = (InternalEObject) changeableRef;
			changeableRef = (A) eResolveProxy(oldChangeableRef);
			if (changeableRef != oldChangeableRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XtextSiriusTestPackage.AELEMENT__CHANGEABLE_REF, oldChangeableRef, changeableRef));
			}
		}
		return changeableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetChangeableRef() {
		return changeableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeableRef(A newChangeableRef) {
		A oldChangeableRef = changeableRef;
		changeableRef = newChangeableRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextSiriusTestPackage.AELEMENT__CHANGEABLE_REF,
					oldChangeableRef, changeableRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public A getUnchangeableRef() {
		if (unchangeableRef != null && unchangeableRef.eIsProxy()) {
			InternalEObject oldUnchangeableRef = (InternalEObject) unchangeableRef;
			unchangeableRef = (A) eResolveProxy(oldUnchangeableRef);
			if (unchangeableRef != oldUnchangeableRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_REF, oldUnchangeableRef, unchangeableRef));
			}
		}
		return unchangeableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetUnchangeableRef() {
		return unchangeableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getChangeableListRef() {
		if (changeableListRef == null) {
			changeableListRef = new EObjectResolvingEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_REF);
		}
		return changeableListRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getUnchangeableListRef() {
		if (unchangeableListRef == null) {
			unchangeableListRef = new EObjectResolvingEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_LIST_REF);
		}
		return unchangeableListRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getChangeableSetRef() {
		if (changeableSetRef == null) {
			changeableSetRef = new EObjectResolvingEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_REF);
		}
		return changeableSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getUnchangeableSetRef() {
		if (unchangeableSetRef == null) {
			unchangeableSetRef = new EObjectResolvingEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_REF);
		}
		return unchangeableSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getChangeableBagRef() {
		if (changeableBagRef == null) {
			changeableBagRef = new EObjectResolvingEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_REF);
		}
		return changeableBagRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getUnchangeableBagRef() {
		if (unchangeableBagRef == null) {
			unchangeableBagRef = new EObjectResolvingEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_BAG_REF);
		}
		return unchangeableBagRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getChangeableUniqueListCont() {
		if (changeableUniqueListCont == null) {
			changeableUniqueListCont = new EObjectContainmentEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT);
		}
		return changeableUniqueListCont;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getUnchangeableUniqueListCont() {
		if (unchangeableUniqueListCont == null) {
			unchangeableUniqueListCont = new EObjectContainmentEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT);
		}
		return unchangeableUniqueListCont;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getChangeableSetCont() {
		if (changeableSetCont == null) {
			changeableSetCont = new EObjectContainmentEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_CONT);
		}
		return changeableSetCont;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A getChangeableCont() {
		return changeableCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeableCont(A newChangeableCont, NotificationChain msgs) {
		A oldChangeableCont = changeableCont;
		changeableCont = newChangeableCont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_CONT, oldChangeableCont, newChangeableCont);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeableCont(A newChangeableCont) {
		if (newChangeableCont != changeableCont) {
			NotificationChain msgs = null;
			if (changeableCont != null)
				msgs = ((InternalEObject) changeableCont).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - XtextSiriusTestPackage.AELEMENT__CHANGEABLE_CONT, null, msgs);
			if (newChangeableCont != null)
				msgs = ((InternalEObject) newChangeableCont).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - XtextSiriusTestPackage.AELEMENT__CHANGEABLE_CONT, null, msgs);
			msgs = basicSetChangeableCont(newChangeableCont, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextSiriusTestPackage.AELEMENT__CHANGEABLE_CONT,
					newChangeableCont, newChangeableCont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A getUnchangeableCont() {
		return unchangeableCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnchangeableCont(A newUnchangeableCont, NotificationChain msgs) {
		A oldUnchangeableCont = unchangeableCont;
		unchangeableCont = newUnchangeableCont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_CONT, oldUnchangeableCont, newUnchangeableCont);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getUnchangeableSetCont() {
		if (unchangeableSetCont == null) {
			unchangeableSetCont = new EObjectContainmentEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_CONT);
		}
		return unchangeableSetCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_SINGLE:
			return basicSetContainedSingle(null, msgs);
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_MULTI:
			return ((InternalEList<?>) getContainedMulti()).basicRemove(otherEnd, msgs);
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT:
			return ((InternalEList<?>) getChangeableUniqueListCont()).basicRemove(otherEnd, msgs);
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT:
			return ((InternalEList<?>) getUnchangeableUniqueListCont()).basicRemove(otherEnd, msgs);
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_CONT:
			return ((InternalEList<?>) getChangeableSetCont()).basicRemove(otherEnd, msgs);
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_CONT:
			return basicSetChangeableCont(null, msgs);
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_CONT:
			return basicSetUnchangeableCont(null, msgs);
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_CONT:
			return ((InternalEList<?>) getUnchangeableSetCont()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getChangeableUniqueListCont() {
		if (changeableUniqueListCont == null) {
			changeableUniqueListCont = new EObjectContainmentEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT);
		}
		return changeableUniqueListCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getUnchangeableUniqueListCont() {
		if (unchangeableUniqueListCont == null) {
			unchangeableUniqueListCont = new EObjectContainmentEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT);
		}
		return unchangeableUniqueListCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getChangeableSetCont() {
		if (changeableSetCont == null) {
			changeableSetCont = new EObjectContainmentEList<A>(AElement.class, this,
					XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_CONT);
		}
		return changeableSetCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_ATTR:
			return getChangeableAttr();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_ATTR:
			return getUnchangeableAttr();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_ATTR:
			return getChangeableListAttr();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_LIST_ATTR:
			return getUnchangeableListAttr();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_ATTR:
			return getChangeableSetAttr();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_ATTR:
			return getUnchangeableSetAttr();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_ATTR:
			return getChangeableBagAttr();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_BAG_ATTR:
			return getUnchangeableBagAttr();
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_SINGLE:
			return getContainedSingle();
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_MULTI:
			return getContainedMulti();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_REF:
			if (resolve)
				return getChangeableRef();
			return basicGetChangeableRef();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_REF:
			if (resolve)
				return getUnchangeableRef();
			return basicGetUnchangeableRef();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_REF:
			return getChangeableListRef();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_LIST_REF:
			return getUnchangeableListRef();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_REF:
			return getChangeableSetRef();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_REF:
			return getUnchangeableSetRef();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_REF:
			return getChangeableBagRef();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_BAG_REF:
			return getUnchangeableBagRef();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT:
			return getChangeableUniqueListCont();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT:
			return getUnchangeableUniqueListCont();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_CONT:
			return getChangeableSetCont();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_CONT:
			return getChangeableCont();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_CONT:
			return getUnchangeableCont();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_CONT:
			return getUnchangeableSetCont();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_ATTR:
			setChangeableAttr((String) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_ATTR:
			getChangeableListAttr().clear();
			getChangeableListAttr().addAll((Collection<? extends String>) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_ATTR:
			getChangeableSetAttr().clear();
			getChangeableSetAttr().addAll((Collection<? extends Integer>) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_ATTR:
			getChangeableBagAttr().clear();
			getChangeableBagAttr().addAll((Collection<? extends Double>) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_SINGLE:
			setContainedSingle((IContainedElement) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_MULTI:
			getContainedMulti().clear();
			getContainedMulti().addAll((Collection<? extends IContainedElement>) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_REF:
			setChangeableRef((A) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_REF:
			getChangeableListRef().clear();
			getChangeableListRef().addAll((Collection<? extends A>) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_REF:
			getChangeableSetRef().clear();
			getChangeableSetRef().addAll((Collection<? extends A>) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_REF:
			getChangeableBagRef().clear();
			getChangeableBagRef().addAll((Collection<? extends A>) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT:
			getChangeableUniqueListCont().clear();
			getChangeableUniqueListCont().addAll((Collection<? extends A>) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_CONT:
			getChangeableSetCont().clear();
			getChangeableSetCont().addAll((Collection<? extends A>) newValue);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_CONT:
			setChangeableCont((A) newValue);
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
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_ATTR:
			setChangeableAttr(CHANGEABLE_ATTR_EDEFAULT);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_ATTR:
			getChangeableListAttr().clear();
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_ATTR:
			getChangeableSetAttr().clear();
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_ATTR:
			getChangeableBagAttr().clear();
			return;
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_SINGLE:
			setContainedSingle((IContainedElement) null);
			return;
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_MULTI:
			getContainedMulti().clear();
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_REF:
			setChangeableRef((A) null);
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_REF:
			getChangeableListRef().clear();
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_REF:
			getChangeableSetRef().clear();
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_REF:
			getChangeableBagRef().clear();
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT:
			getChangeableUniqueListCont().clear();
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_CONT:
			getChangeableSetCont().clear();
			return;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_CONT:
			setChangeableCont((A) null);
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
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_ATTR:
			return CHANGEABLE_ATTR_EDEFAULT == null ? changeableAttr != null
					: !CHANGEABLE_ATTR_EDEFAULT.equals(changeableAttr);
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_ATTR:
			return unchangeableAttr != UNCHANGEABLE_ATTR_EDEFAULT;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_ATTR:
			return changeableListAttr != null && !changeableListAttr.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_LIST_ATTR:
			return unchangeableListAttr != null && !unchangeableListAttr.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_ATTR:
			return changeableSetAttr != null && !changeableSetAttr.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_ATTR:
			return unchangeableSetAttr != null && !unchangeableSetAttr.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_ATTR:
			return changeableBagAttr != null && !changeableBagAttr.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_BAG_ATTR:
			return unchangeableBagAttr != null && !unchangeableBagAttr.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_SINGLE:
			return containedSingle != null;
		case XtextSiriusTestPackage.AELEMENT__CONTAINED_MULTI:
			return containedMulti != null && !containedMulti.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_REF:
			return changeableRef != null;
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_REF:
			return unchangeableRef != null;
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_LIST_REF:
			return changeableListRef != null && !changeableListRef.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_LIST_REF:
			return unchangeableListRef != null && !unchangeableListRef.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_REF:
			return changeableSetRef != null && !changeableSetRef.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_REF:
			return unchangeableSetRef != null && !unchangeableSetRef.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_BAG_REF:
			return changeableBagRef != null && !changeableBagRef.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_BAG_REF:
			return unchangeableBagRef != null && !unchangeableBagRef.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_UNIQUE_LIST_CONT:
			return changeableUniqueListCont != null && !changeableUniqueListCont.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT:
			return unchangeableUniqueListCont != null && !unchangeableUniqueListCont.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_SET_CONT:
			return changeableSetCont != null && !changeableSetCont.isEmpty();
		case XtextSiriusTestPackage.AELEMENT__CHANGEABLE_CONT:
			return changeableCont != null;
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_CONT:
			return unchangeableCont != null;
		case XtextSiriusTestPackage.AELEMENT__UNCHANGEABLE_SET_CONT:
			return unchangeableSetCont != null && !unchangeableSetCont.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (changeableAttr: ");
		result.append(changeableAttr);
		result.append(", unchangeableAttr: ");
		result.append(unchangeableAttr);
		result.append(", changeableListAttr: ");
		result.append(changeableListAttr);
		result.append(", unchangeableListAttr: ");
		result.append(unchangeableListAttr);
		result.append(", changeableSetAttr: ");
		result.append(changeableSetAttr);
		result.append(", unchangeableSetAttr: ");
		result.append(unchangeableSetAttr);
		result.append(", changeableBagAttr: ");
		result.append(changeableBagAttr);
		result.append(", unchangeableBagAttr: ");
		result.append(unchangeableBagAttr);
		result.append(')');
		return result.toString();
	}

} //AElementImpl
