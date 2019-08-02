/**
 */
package com.altran.general.integration.xtextsirius.test.EKeyLang.util;

import com.altran.general.integration.xtextsirius.test.EKeyLang.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage
 * @generated
 */
public class EKeyLangSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EKeyLangPackage modelPackage;
	
	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EKeyLangSwitch() {
		if (modelPackage == null) {
			modelPackage = EKeyLangPackage.eINSTANCE;
		}
	}
	
	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}
	
	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EKeyLangPackage.CONTAINER: {
				Container container = (Container) theEObject;
				T result = caseContainer(container);
				if (result == null)
					result = caseANamedElement(container);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case EKeyLangPackage.ICONTAINER_CONTENT: {
				IContainerContent iContainerContent = (IContainerContent) theEObject;
				T result = caseIContainerContent(iContainerContent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case EKeyLangPackage.ANAMED_ELEMENT: {
				ANamedElement aNamedElement = (ANamedElement) theEObject;
				T result = caseANamedElement(aNamedElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case EKeyLangPackage.GROUP: {
				Group group = (Group) theEObject;
				T result = caseGroup(group);
				if (result == null)
					result = caseANamedElement(group);
				if (result == null)
					result = caseIContainerContent(group);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case EKeyLangPackage.LEAF: {
				Leaf leaf = (Leaf) theEObject;
				T result = caseLeaf(leaf);
				if (result == null)
					result = caseANamedElement(leaf);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case EKeyLangPackage.SINGLE: {
				Single single = (Single) theEObject;
				T result = caseSingle(single);
				if (result == null)
					result = caseANamedElement(single);
				if (result == null)
					result = caseIContainerContent(single);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>IContainer Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IContainer Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIContainerContent(IContainerContent object) {
		return null;
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANamedElement(ANamedElement object) {
		return null;
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeaf(Leaf object) {
		return null;
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingle(Single object) {
		return null;
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}
	
} //EKeyLangSwitch
