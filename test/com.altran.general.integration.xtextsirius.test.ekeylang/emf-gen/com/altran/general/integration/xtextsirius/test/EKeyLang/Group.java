/**
 */
package com.altran.general.integration.xtextsirius.test.EKeyLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Group#getLeafs <em>Leafs</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends ANamedElement, IContainerContent {
	/**
	 * Returns the value of the '<em><b>Leafs</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leafs</em>' containment reference list.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage#getGroup_Leafs()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<IContainerContent> getLeafs();
	
} // Group
