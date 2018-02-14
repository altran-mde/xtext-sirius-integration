<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

<<<<<<< b7f31d8da2d0f8863339344fb2e4db4be675bd51
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
import org.eclipse.emf.ecore.EObject;
=======
import org.eclipse.sirius.properties.TextAreaDescription;
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
import org.eclipse.emf.ecore.EObject;
>>>>>>> updated to Oxygen.2
=======
import org.eclipse.sirius.properties.TextAreaDescription;
>>>>>>> fixed invalid import in generated files

=======
>>>>>>> intermediate commit: non-working start of delegate implmenetation
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;

import org.eclipse.sirius.properties.TextAreaDescription;

/**
<<<<<<< b7f31d8da2d0f8863339344fb2e4db4be675bd51
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xtext
 * Multi Line Value Description</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextMultiLineValueDescription()
 * @model superTypes="org.eclipse.emf.ecore.EJavaObject
 *        com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextMultiLineValueDescription extends EObject, IXtextPropertyValueDescription {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        true;'"
=======
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Xtext Multi Line Value Description</b></em>'. <!-- end-user-doc -->
=======
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xtext
 * Multi Line Value Description</b></em>'. <!-- end-user-doc -->
>>>>>>> updated to Oxygen.2
=======
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xtext Multi Line Value Description</b></em>'.
 * <!-- end-user-doc -->
>>>>>>> intermediate commit: non-working start of delegate implmenetation
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextMultiLineValueDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextMultiLineValueDescription extends TextAreaDescription, IXtextPropertyValueDescription {
	/**
<<<<<<< b7f31d8da2d0f8863339344fb2e4db4be675bd51
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
	 * @model kind="operation" unique="false" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return true;'"
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        true;'"
>>>>>>> updated to Oxygen.2
=======
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
>>>>>>> intermediate commit: non-working start of delegate implmenetation
	 * @generated
	 */
	@Override
	boolean isMultiLine();

} // XtextMultiLineValueDescription
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;

import org.eclipse.sirius.properties.TextAreaDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xtext Multi Line Value Description</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextMultiLineValueDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextMultiLineValueDescription extends TextAreaDescription, IXtextPropertyValueDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	@Override
	boolean isMultiLine();

} // XtextMultiLineValueDescription
>>>>>>> preliminary fix for using guava v16
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
