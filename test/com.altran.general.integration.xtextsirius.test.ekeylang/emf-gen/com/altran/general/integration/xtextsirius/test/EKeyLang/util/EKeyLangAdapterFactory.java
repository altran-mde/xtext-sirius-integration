/**
 */
package com.altran.general.integration.xtextsirius.test.EKeyLang.util;

import com.altran.general.integration.xtextsirius.test.EKeyLang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage
 * @generated
 */
public class EKeyLangAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EKeyLangPackage modelPackage;
	
	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EKeyLangAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EKeyLangPackage.eINSTANCE;
		}
	}
	
	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}
	
	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EKeyLangSwitch<Adapter> modelSwitch = new EKeyLangSwitch<Adapter>() {
		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}
		
		@Override
		public Adapter caseIContainerContent(IContainerContent object) {
			return createIContainerContentAdapter();
		}
		
		@Override
		public Adapter caseANamedElement(ANamedElement object) {
			return createANamedElementAdapter();
		}
		
		@Override
		public Adapter caseGroup(Group object) {
			return createGroupAdapter();
		}
		
		@Override
		public Adapter caseLeaf(Leaf object) {
			return createLeafAdapter();
		}
		
		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};
	
	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}
	
	
	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent <em>IContainer Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent
	 * @generated
	 */
	public Adapter createIContainerContentAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.ANamedElement <em>ANamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.ANamedElement
	 * @generated
	 */
	public Adapter createANamedElementAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf
	 * @generated
	 */
	public Adapter createLeafAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}
	
} //EKeyLangAdapterFactory
