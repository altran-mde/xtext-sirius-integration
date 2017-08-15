/**
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Command;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Statemachine</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.StatemachineImpl#getEvents
 * <em>Events</em>}</li>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.StatemachineImpl#getResetEvents
 * <em>Reset Events</em>}</li>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.StatemachineImpl#getCommands
 * <em>Commands</em>}</li>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.StatemachineImpl#getConnstants
 * <em>Connstants</em>}</li>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.impl.StatemachineImpl#getStates
 * <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatemachineImpl extends MinimalEObjectImpl.Container implements Statemachine {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getResetEvents() <em>Reset Events</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getResetEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> resetEvents;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getConnstants() <em>Connstants</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getConnstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> connstants;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StatemachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.STATEMACHINE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (this.events == null) {
			this.events = new EObjectContainmentEList<Event>(Event.class, this,
					StatemachinePackage.STATEMACHINE__EVENTS);
		}
		return this.events;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Event> getResetEvents() {
		if (this.resetEvents == null) {
			this.resetEvents = new EObjectResolvingEList<Event>(Event.class, this,
					StatemachinePackage.STATEMACHINE__RESET_EVENTS);
		}
		return this.resetEvents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Command> getCommands() {
		if (this.commands == null) {
			this.commands = new EObjectContainmentEList<Command>(Command.class, this,
					StatemachinePackage.STATEMACHINE__COMMANDS);
		}
		return this.commands;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Constant> getConnstants() {
		if (this.connstants == null) {
			this.connstants = new EObjectContainmentEList<Constant>(Constant.class, this,
					StatemachinePackage.STATEMACHINE__CONNSTANTS);
		}
		return this.connstants;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (this.states == null) {
			this.states = new EObjectContainmentEList<State>(State.class, this,
					StatemachinePackage.STATEMACHINE__STATES);
		}
		return this.states;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.STATEMACHINE__EVENTS:
				return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATEMACHINE__COMMANDS:
				return ((InternalEList<?>) getCommands()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATEMACHINE__CONNSTANTS:
				return ((InternalEList<?>) getConnstants()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATEMACHINE__STATES:
				return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case StatemachinePackage.STATEMACHINE__EVENTS:
				return getEvents();
			case StatemachinePackage.STATEMACHINE__RESET_EVENTS:
				return getResetEvents();
			case StatemachinePackage.STATEMACHINE__COMMANDS:
				return getCommands();
			case StatemachinePackage.STATEMACHINE__CONNSTANTS:
				return getConnstants();
			case StatemachinePackage.STATEMACHINE__STATES:
				return getStates();
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
			case StatemachinePackage.STATEMACHINE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>) newValue);
				return;
			case StatemachinePackage.STATEMACHINE__RESET_EVENTS:
				getResetEvents().clear();
				getResetEvents().addAll((Collection<? extends Event>) newValue);
				return;
			case StatemachinePackage.STATEMACHINE__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>) newValue);
				return;
			case StatemachinePackage.STATEMACHINE__CONNSTANTS:
				getConnstants().clear();
				getConnstants().addAll((Collection<? extends Constant>) newValue);
				return;
			case StatemachinePackage.STATEMACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>) newValue);
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
			case StatemachinePackage.STATEMACHINE__EVENTS:
				getEvents().clear();
				return;
			case StatemachinePackage.STATEMACHINE__RESET_EVENTS:
				getResetEvents().clear();
				return;
			case StatemachinePackage.STATEMACHINE__COMMANDS:
				getCommands().clear();
				return;
			case StatemachinePackage.STATEMACHINE__CONNSTANTS:
				getConnstants().clear();
				return;
			case StatemachinePackage.STATEMACHINE__STATES:
				getStates().clear();
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
			case StatemachinePackage.STATEMACHINE__EVENTS:
				return this.events != null && !this.events.isEmpty();
			case StatemachinePackage.STATEMACHINE__RESET_EVENTS:
				return this.resetEvents != null && !this.resetEvents.isEmpty();
			case StatemachinePackage.STATEMACHINE__COMMANDS:
				return this.commands != null && !this.commands.isEmpty();
			case StatemachinePackage.STATEMACHINE__CONNSTANTS:
				return this.connstants != null && !this.connstants.isEmpty();
			case StatemachinePackage.STATEMACHINE__STATES:
				return this.states != null && !this.states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StatemachineImpl
