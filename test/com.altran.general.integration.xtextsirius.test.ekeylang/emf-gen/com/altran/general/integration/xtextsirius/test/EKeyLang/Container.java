/**
 */
package com.altran.general.integration.xtextsirius.test.EKeyLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Container#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends ANamedElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage#getContainer_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<IContainerContent> getContents();
	
} // Container
