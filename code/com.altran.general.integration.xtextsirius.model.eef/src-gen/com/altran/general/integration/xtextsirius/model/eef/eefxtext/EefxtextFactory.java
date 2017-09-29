/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage
 * @generated
 */
public interface EefxtextFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EefxtextFactory eINSTANCE = com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefxtextFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Eef Xtext Single Line Model
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Eef Xtext Single Line Model
	 *         Description</em>'.
	 * @generated
	 */
	EefXtextSingleLineModelDescription createEefXtextSingleLineModelDescription();

	/**
	 * Returns a new object of class '<em>Eef Xtext Multi Line Model
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Eef Xtext Multi Line Model
	 *         Description</em>'.
	 * @generated
	 */
	EefXtextMultiLineModelDescription createEefXtextMultiLineModelDescription();

	/**
	 * Returns a new object of class '<em>Eef Xtext Single Line Value
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Eef Xtext Single Line Value
	 *         Description</em>'.
	 * @generated
	 */
	EefXtextSingleLineValueDescription createEefXtextSingleLineValueDescription();

	/**
	 * Returns a new object of class '<em>Eef Xtext Multi Line Value
	 * Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Eef Xtext Multi Line Value
	 *         Description</em>'.
	 * @generated
	 */
	EefXtextMultiLineValueDescription createEefXtextMultiLineValueDescription();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	EefxtextPackage getEefxtextPackage();

} // EefxtextFactory
