/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext;

import org.eclipse.eef.EEFTextDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Eef
 * Xtext Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextDescription#getLanguage
 * <em>Language</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getEefXtextDescription()
 * @model
 * @generated
 */
public interface EefXtextDescription extends EEFTextDescription {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getEefXtextDescription_Language()
	 * @model unique="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextDescription#getLanguage
	 * <em>Language</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // EefXtextDescription
