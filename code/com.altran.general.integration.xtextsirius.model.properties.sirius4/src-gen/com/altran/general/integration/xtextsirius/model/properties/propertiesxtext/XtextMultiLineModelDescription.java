<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import org.eclipse.emf.ecore.EObject;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xtext
 * Multi Line Model Description</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextMultiLineModelDescription()
 * @model superTypes="org.eclipse.emf.ecore.EJavaObject
 *        com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextMultiLineModelDescription extends EObject, IXtextPropertyModelDescription {
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
=======
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;

import org.eclipse.sirius.properties.TextAreaDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xtext Multi Line Model Description</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextMultiLineModelDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextMultiLineModelDescription extends TextAreaDescription, IXtextPropertyModelDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	@Override
	boolean isMultiLine();

} // XtextMultiLineModelDescription
>>>>>>> preliminary fix for using guava v16
