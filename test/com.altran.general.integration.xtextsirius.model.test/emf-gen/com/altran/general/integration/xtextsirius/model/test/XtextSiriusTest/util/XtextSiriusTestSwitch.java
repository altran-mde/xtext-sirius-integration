/**
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.util;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.*;

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
 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
 * @generated
 */
public class XtextSiriusTestSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XtextSiriusTestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtextSiriusTestSwitch() {
		if (modelPackage == null) {
			modelPackage = XtextSiriusTestPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case XtextSiriusTestPackage.ID_ELEMENT: {
			IdElement idElement = (IdElement) theEObject;
			T1 result = caseIdElement(idElement);
			if (result == null)
				result = caseAElement(idElement);
			if (result == null)
				result = caseIElement(idElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextSiriusTestPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T1 result = caseElement(element);
			if (result == null)
				result = caseAElement(element);
			if (result == null)
				result = caseIElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextSiriusTestPackage.IELEMENT: {
			IElement<?> iElement = (IElement<?>) theEObject;
			T1 result = caseIElement(iElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextSiriusTestPackage.AELEMENT: {
			AElement<?> aElement = (AElement<?>) theEObject;
			T1 result = caseAElement(aElement);
			if (result == null)
				result = caseIElement(aElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextSiriusTestPackage.KEY_ELEMENT: {
			KeyElement keyElement = (KeyElement) theEObject;
			T1 result = caseKeyElement(keyElement);
			if (result == null)
				result = caseIElement(keyElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextSiriusTestPackage.ICONTAINED_ELEMENT: {
			IContainedElement iContainedElement = (IContainedElement) theEObject;
			T1 result = caseIContainedElement(iContainedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextSiriusTestPackage.CONTAINED_A: {
			ContainedA containedA = (ContainedA) theEObject;
			T1 result = caseContainedA(containedA);
			if (result == null)
				result = caseIContainedElement(containedA);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextSiriusTestPackage.CONTAINED_B: {
			ContainedB containedB = (ContainedB) theEObject;
			T1 result = caseContainedB(containedB);
			if (result == null)
				result = caseIContainedElement(containedB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdElement(IdElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IElement<?>> T1 caseIElement(IElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <A extends AElement<?>> T1 caseAElement(AElement<A> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKeyElement(KeyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IContained Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IContained Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIContainedElement(IContainedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contained A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContainedA(ContainedA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contained B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContainedB(ContainedB object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //XtextSiriusTestSwitch
