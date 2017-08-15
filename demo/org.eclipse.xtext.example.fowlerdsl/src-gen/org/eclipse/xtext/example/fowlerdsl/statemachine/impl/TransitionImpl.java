/**
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Transition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.TransitionImpl#getEvent
 * <em>Event</em>}</li>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.TransitionImpl#getState
 * <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Event getEvent() {
		if (this.event != null && this.event.eIsProxy()) {
			final InternalEObject oldEvent = (InternalEObject) this.event;
			this.event = (Event) eResolveProxy(oldEvent);
			if (this.event != oldEvent) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__EVENT,
							oldEvent, this.event));
				}
			}
		}
		return this.event;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Event basicGetEvent() {
		return this.event;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEvent(final Event newEvent) {
		final Event oldEvent = this.event;
		this.event = newEvent;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__EVENT, oldEvent,
					this.event));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public State getState() {
		if (this.state != null && this.state.eIsProxy()) {
			final InternalEObject oldState = (InternalEObject) this.state;
			this.state = (State) eResolveProxy(oldState);
			if (this.state != oldState) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__STATE,
							oldState, this.state));
				}
			}
		}
		return this.state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public State basicGetState() {
		return this.state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setState(final State newState) {
		final State oldState = this.state;
		this.state = newState;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__STATE, oldState,
					this.state));
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
			case StatemachinePackage.TRANSITION__EVENT:
				if (resolve) {
					return getEvent();
				}
				return basicGetEvent();
			case StatemachinePackage.TRANSITION__STATE:
				if (resolve) {
					return getState();
				}
				return basicGetState();
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
			case StatemachinePackage.TRANSITION__EVENT:
				setEvent((Event) newValue);
				return;
			case StatemachinePackage.TRANSITION__STATE:
				setState((State) newValue);
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
			case StatemachinePackage.TRANSITION__EVENT:
				setEvent((Event) null);
				return;
			case StatemachinePackage.TRANSITION__STATE:
				setState((State) null);
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
			case StatemachinePackage.TRANSITION__EVENT:
				return this.event != null;
			case StatemachinePackage.TRANSITION__STATE:
				return this.state != null;
		}
		return super.eIsSet(featureID);
	}

} // TransitionImpl
