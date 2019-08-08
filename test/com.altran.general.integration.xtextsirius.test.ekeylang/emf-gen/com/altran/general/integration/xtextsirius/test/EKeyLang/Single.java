/**
 */
package com.altran.general.integration.xtextsirius.test.EKeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Single#getLeaf <em>Leaf</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage#getSingle()
 * @model
 * @generated
 */
public interface Single extends ANamedElement, IContainerContent {
	/**
	 * Returns the value of the '<em><b>Leaf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf</em>' containment reference.
	 * @see #setLeaf(Leaf)
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage#getSingle_Leaf()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	Leaf getLeaf();
	
	/**
	 * Sets the value of the '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Single#getLeaf <em>Leaf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf</em>' containment reference.
	 * @see #getLeaf()
	 * @generated
	 */
	void setLeaf(Leaf value);
	
} // Single
