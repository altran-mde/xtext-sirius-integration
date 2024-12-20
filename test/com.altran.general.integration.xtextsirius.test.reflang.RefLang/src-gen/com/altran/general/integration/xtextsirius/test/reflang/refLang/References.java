/**
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.refLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.reflang.refLang.References#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage#getReferences()
 * @model
 * @generated
 */
public interface References extends EObject
{
  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage#getReferences_References()
   * @model containment="true"
   * @generated
   */
  EList<Reference> getReferences();

} // References
