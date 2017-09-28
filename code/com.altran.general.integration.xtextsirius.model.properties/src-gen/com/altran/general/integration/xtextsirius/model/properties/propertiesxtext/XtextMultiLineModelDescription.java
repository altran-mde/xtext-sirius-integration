/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import org.eclipse.sirius.properties.TextAreaDescription;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xtext
 * Multi Line Model Description</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextMultiLineModelDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextMultiLineModelDescription
		extends TextAreaDescription, IXtextPropertyDescription, IXtextModelDescription {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        true;'"
	 * @generated
	 */
	@Override
	boolean isMultiLine();

} // XtextMultiLineModelDescription
