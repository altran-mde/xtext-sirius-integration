<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
import org.eclipse.emf.ecore.EObject;
=======
import org.eclipse.sirius.properties.TextDescription;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
import org.eclipse.emf.ecore.EObject;
>>>>>>> updated to Oxygen.2
=======
import org.eclipse.sirius.properties.TextDescription;
>>>>>>> fixed invalid import in generated files

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;

/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xtext
 * Single Line Model Description</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextSingleLineModelDescription()
 * @model superTypes="org.eclipse.emf.ecore.EJavaObject
 *        com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextSingleLineModelDescription extends EObject, IXtextPropertyModelDescription {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        false;'"
=======
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Xtext Single Line Model Description</b></em>'. <!-- end-user-doc -->
=======
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xtext
 * Single Line Model Description</b></em>'. <!-- end-user-doc -->
>>>>>>> updated to Oxygen.2
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextSingleLineModelDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextSingleLineModelDescription extends TextDescription, IXtextPropertyModelDescription {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
	 * @model kind="operation" unique="false" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return false;'"
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        false;'"
>>>>>>> updated to Oxygen.2
	 * @generated
	 */
	@Override
	boolean isMultiLine();

} // XtextSingleLineModelDescription
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;

import org.eclipse.sirius.properties.TextDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xtext Single Line Model Description</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextSingleLineModelDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextSingleLineModelDescription extends TextDescription, IXtextPropertyModelDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return false;'"
	 * @generated
	 */
	@Override
	boolean isMultiLine();

} // XtextSingleLineModelDescription
>>>>>>> preliminary fix for using guava v16
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
