/**
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.refLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.reflang.refLang.Container#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link com.altran.general.integration.xtextsirius.test.reflang.refLang.IContainerContent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage#getContainer_Contents()
   * @model containment="true"
   * @generated
   */
  EList<IContainerContent> getContents();

} // Container
