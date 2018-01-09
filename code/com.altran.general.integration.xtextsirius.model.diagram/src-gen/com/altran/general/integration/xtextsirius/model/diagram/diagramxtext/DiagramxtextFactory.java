/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage
 * @generated
 */
public interface DiagramxtextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramxtextFactory eINSTANCE = com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl.DiagramxtextFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Xtext Direct Edit Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xtext Direct Edit Model Description</em>'.
	 * @generated
	 */
	XtextDirectEditModelDescription createXtextDirectEditModelDescription();

	/**
	 * Returns a new object of class '<em>Xtext Direct Edit Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xtext Direct Edit Value Description</em>'.
	 * @generated
	 */
	XtextDirectEditValueDescription createXtextDirectEditValueDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiagramxtextPackage getDiagramxtextPackage();

} //DiagramxtextFactory
