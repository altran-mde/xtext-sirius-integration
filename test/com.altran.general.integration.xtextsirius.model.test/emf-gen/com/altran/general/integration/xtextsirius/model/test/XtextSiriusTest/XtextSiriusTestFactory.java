/**
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
 * @generated
 */
public interface XtextSiriusTestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XtextSiriusTestFactory eINSTANCE = com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.XtextSiriusTestFactoryImpl
			.init();
	
	/**
	 * Returns a new object of class '<em>Id Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Element</em>'.
	 * @generated
	 */
	IdElement createIdElement();
	
	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();
	
	/**
	 * Returns a new object of class '<em>Key Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Element</em>'.
	 * @generated
	 */
	KeyElement createKeyElement();
	
	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XtextSiriusTestPackage getXtextSiriusTestPackage();
	
} //XtextSiriusTestFactory
