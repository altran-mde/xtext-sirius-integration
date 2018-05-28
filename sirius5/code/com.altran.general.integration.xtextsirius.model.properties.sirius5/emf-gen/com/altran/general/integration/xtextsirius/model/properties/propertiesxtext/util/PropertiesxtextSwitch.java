/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.util;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.*;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.properties.AbstractControlDescription;
import org.eclipse.sirius.properties.AbstractTextAreaDescription;
import org.eclipse.sirius.properties.AbstractTextDescription;
import org.eclipse.sirius.properties.AbstractWidgetDescription;
import org.eclipse.sirius.properties.ControlDescription;
import org.eclipse.sirius.properties.TextAreaDescription;
import org.eclipse.sirius.properties.TextDescription;
import org.eclipse.sirius.properties.WidgetDescription;

import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;

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
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage
 * @generated
 */
public class PropertiesxtextSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertiesxtextPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesxtextSwitch() {
		if (modelPackage == null) {
			modelPackage = PropertiesxtextPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION: {
			XtextSingleLineModelDescription xtextSingleLineModelDescription = (XtextSingleLineModelDescription) theEObject;
			T result = caseXtextSingleLineModelDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseTextDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseIXtextPropertyModelDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseAbstractTextDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseWidgetDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseIXtextModelDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseAbstractWidgetDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseControlDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseIXtextDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseAbstractControlDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseIdentifiedElement(xtextSingleLineModelDescription);
			if (result == null)
				result = caseDocumentedElement(xtextSingleLineModelDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PropertiesxtextPackage.XTEXT_MULTI_LINE_MODEL_DESCRIPTION: {
			XtextMultiLineModelDescription xtextMultiLineModelDescription = (XtextMultiLineModelDescription) theEObject;
			T result = caseXtextMultiLineModelDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseTextAreaDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseIXtextPropertyModelDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseAbstractTextAreaDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseWidgetDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseIXtextModelDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseAbstractWidgetDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseControlDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseIXtextDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseAbstractControlDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseIdentifiedElement(xtextMultiLineModelDescription);
			if (result == null)
				result = caseDocumentedElement(xtextMultiLineModelDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION: {
			XtextSingleLineValueDescription xtextSingleLineValueDescription = (XtextSingleLineValueDescription) theEObject;
			T result = caseXtextSingleLineValueDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseTextDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseIXtextPropertyValueDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseAbstractTextDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseWidgetDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseIXtextValueDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseAbstractWidgetDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseControlDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseIXtextDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseAbstractControlDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseIdentifiedElement(xtextSingleLineValueDescription);
			if (result == null)
				result = caseDocumentedElement(xtextSingleLineValueDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PropertiesxtextPackage.XTEXT_MULTI_LINE_VALUE_DESCRIPTION: {
			XtextMultiLineValueDescription xtextMultiLineValueDescription = (XtextMultiLineValueDescription) theEObject;
			T result = caseXtextMultiLineValueDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseTextAreaDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseIXtextPropertyValueDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseAbstractTextAreaDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseWidgetDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseIXtextValueDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseAbstractWidgetDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseControlDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseIXtextDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseAbstractControlDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseIdentifiedElement(xtextMultiLineValueDescription);
			if (result == null)
				result = caseDocumentedElement(xtextMultiLineValueDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtext Single Line Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtext Single Line Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextSingleLineModelDescription(XtextSingleLineModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtext Multi Line Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtext Multi Line Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextMultiLineModelDescription(XtextMultiLineModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtext Single Line Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtext Single Line Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextSingleLineValueDescription(XtextSingleLineValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtext Multi Line Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtext Multi Line Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextMultiLineValueDescription(XtextMultiLineValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedElement(DocumentedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Control Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Control Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractControlDescription(AbstractControlDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Widget Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Widget Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractWidgetDescription(AbstractWidgetDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Text Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Text Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTextDescription(AbstractTextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlDescription(ControlDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetDescription(WidgetDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDescription(TextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDescription(IXtextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Property Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Property Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyDescription(IXtextPropertyDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextModelDescription(IXtextModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Property Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Property Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyModelDescription(IXtextPropertyModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Text Area Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Text Area Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTextAreaDescription(AbstractTextAreaDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAreaDescription(TextAreaDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextValueDescription(IXtextValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Property Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Property Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyValueDescription(IXtextPropertyValueDescription object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //PropertiesxtextSwitch
