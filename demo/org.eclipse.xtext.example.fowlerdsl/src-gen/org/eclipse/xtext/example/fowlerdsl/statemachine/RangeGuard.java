/**
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Range Guard</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.xtext.example.fowlerdsl.statemachine.RangeGuard#getMin
 * <em>Min</em>}</li>
 * <li>{@link org.eclipse.xtext.example.fowlerdsl.statemachine.RangeGuard#getMax
 * <em>Max</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage#getRangeGuard()
 * @model
 * @generated
 */
public interface RangeGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(Value)
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage#getRangeGuard_Min()
	 * @model containment="true"
	 * @generated
	 */
	Value getMin();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.RangeGuard#getMin
	 * <em>Min</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Value value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(Value)
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage#getRangeGuard_Max()
	 * @model containment="true"
	 * @generated
	 */
	Value getMax();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.xtext.example.fowlerdsl.statemachine.RangeGuard#getMax
	 * <em>Max</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Value value);

} // RangeGuard
