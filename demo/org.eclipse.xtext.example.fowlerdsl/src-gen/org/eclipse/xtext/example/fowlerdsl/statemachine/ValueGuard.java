/**
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Value Guard</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard#getCond
 * <em>Cond</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage#getValueGuard()
 * @model
 * @generated
 */
public interface ValueGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Value)
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage#getValueGuard_Cond()
	 * @model containment="true"
	 * @generated
	 */
	Value getCond();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard#getCond
	 * <em>Cond</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Value value);

} // ValueGuard
