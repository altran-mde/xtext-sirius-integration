/**
 */
package com.altran.general.integration.xtextsirius.model.xtext.xtextsirius;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IXtext
 * Direct Edit Model Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription#getEditableFeatures
 * <em>Editable Features</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage#getIXtextDirectEditModelDescription()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IXtextDirectEditModelDescription extends IXtextDirectEditDescription, IXtextModelDescription {
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
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage#getIXtextDirectEditModelDescription_EditableFeatures()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getEditableFeatures();

} // IXtextDirectEditModelDescription
