/**
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage
 * @generated
 */
public interface StatemachineFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	StatemachineFactory eINSTANCE = org.eclipse.xtext.example.fowlerdsl.statemachine.impl.StatemachineFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Statemachine</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Statemachine</em>'.
	 * @generated
	 */
	Statemachine createStatemachine();

	/**
	 * Returns a new object of class '<em>Event</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Guard</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Guard</em>'.
	 * @generated
	 */
	Guard createGuard();

	/**
	 * Returns a new object of class '<em>Value Guard</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Value Guard</em>'.
	 * @generated
	 */
	ValueGuard createValueGuard();

	/**
	 * Returns a new object of class '<em>Range Guard</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Range Guard</em>'.
	 * @generated
	 */
	RangeGuard createRangeGuard();

	/**
	 * Returns a new object of class '<em>Value</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Constant Ref</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Constant Ref</em>'.
	 * @generated
	 */
	ConstantRef createConstantRef();

	/**
	 * Returns a new object of class '<em>Int Literal</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Int Literal</em>'.
	 * @generated
	 */
	IntLiteral createIntLiteral();

	/**
	 * Returns a new object of class '<em>Command</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Constant</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>State</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatemachinePackage getStatemachinePackage();

} // StatemachineFactory
