/**
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage#getConstantRef()
 * @model
 * @generated
 */
public interface ConstantRef extends Value
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' reference.
   * @see #setConstant(Constant)
   * @see org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage#getConstantRef_Constant()
   * @model
   * @generated
   */
  Constant getConstant();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef#getConstant <em>Constant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Constant value);

} // ConstantRef
