/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>IEef Xtext Model Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription#getEditableFeatures
 * <em>Editable Features</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextModelDescription()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IEefXtextModelDescription extends IEefXtextDescription {
	/**
	 * Returns the value of the '<em><b>Editable Features</b></em>' attribute
	 * list. The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable Features</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Editable Features</em>' attribute list.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextModelDescription_EditableFeatures()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getEditableFeatures();

} // IEefXtextModelDescription
