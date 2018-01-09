/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.util;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.*;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;

import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;

import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;
import org.eclipse.sirius.viewpoint.description.tool.MappingBasedToolDescription;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

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
 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage
 * @generated
 */
public class DiagramxtextSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramxtextPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramxtextSwitch() {
		if (modelPackage == null) {
			modelPackage = DiagramxtextPackage.eINSTANCE;
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
		case DiagramxtextPackage.AXTEXT_DIRECT_EDIT_LABEL: {
			AXtextDirectEditLabel aXtextDirectEditLabel = (AXtextDirectEditLabel) theEObject;
			T result = caseAXtextDirectEditLabel(aXtextDirectEditLabel);
			if (result == null)
				result = caseDirectEditLabel(aXtextDirectEditLabel);
			if (result == null)
				result = caseMappingBasedToolDescription(aXtextDirectEditLabel);
			if (result == null)
				result = caseAbstractToolDescription(aXtextDirectEditLabel);
			if (result == null)
				result = caseToolEntry(aXtextDirectEditLabel);
			if (result == null)
				result = caseDocumentedElement(aXtextDirectEditLabel);
			if (result == null)
				result = caseIdentifiedElement(aXtextDirectEditLabel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION: {
			XtextDirectEditModelDescription xtextDirectEditModelDescription = (XtextDirectEditModelDescription) theEObject;
			T result = caseXtextDirectEditModelDescription(xtextDirectEditModelDescription);
			if (result == null)
				result = caseAXtextDirectEditLabel(xtextDirectEditModelDescription);
			if (result == null)
				result = caseIXtextDirectEditModelDescription(xtextDirectEditModelDescription);
			if (result == null)
				result = caseDirectEditLabel(xtextDirectEditModelDescription);
			if (result == null)
				result = caseIXtextDirectEditDescription(xtextDirectEditModelDescription);
			if (result == null)
				result = caseIXtextModelDescription(xtextDirectEditModelDescription);
			if (result == null)
				result = caseMappingBasedToolDescription(xtextDirectEditModelDescription);
			if (result == null)
				result = caseIXtextDescription(xtextDirectEditModelDescription);
			if (result == null)
				result = caseAbstractToolDescription(xtextDirectEditModelDescription);
			if (result == null)
				result = caseToolEntry(xtextDirectEditModelDescription);
			if (result == null)
				result = caseDocumentedElement(xtextDirectEditModelDescription);
			if (result == null)
				result = caseIdentifiedElement(xtextDirectEditModelDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION: {
			XtextDirectEditValueDescription xtextDirectEditValueDescription = (XtextDirectEditValueDescription) theEObject;
			T result = caseXtextDirectEditValueDescription(xtextDirectEditValueDescription);
			if (result == null)
				result = caseAXtextDirectEditLabel(xtextDirectEditValueDescription);
			if (result == null)
				result = caseIXtextDirectEditValueDescription(xtextDirectEditValueDescription);
			if (result == null)
				result = caseDirectEditLabel(xtextDirectEditValueDescription);
			if (result == null)
				result = caseIXtextDirectEditDescription(xtextDirectEditValueDescription);
			if (result == null)
				result = caseIXtextValueDescription(xtextDirectEditValueDescription);
			if (result == null)
				result = caseMappingBasedToolDescription(xtextDirectEditValueDescription);
			if (result == null)
				result = caseIXtextDescription(xtextDirectEditValueDescription);
			if (result == null)
				result = caseAbstractToolDescription(xtextDirectEditValueDescription);
			if (result == null)
				result = caseToolEntry(xtextDirectEditValueDescription);
			if (result == null)
				result = caseDocumentedElement(xtextDirectEditValueDescription);
			if (result == null)
				result = caseIdentifiedElement(xtextDirectEditValueDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AXtext Direct Edit Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AXtext Direct Edit Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAXtextDirectEditLabel(AXtextDirectEditLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtext Direct Edit Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtext Direct Edit Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextDirectEditModelDescription(XtextDirectEditModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtext Direct Edit Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtext Direct Edit Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextDirectEditValueDescription(XtextDirectEditValueDescription object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolEntry(ToolEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tool Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tool Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractToolDescription(AbstractToolDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Based Tool Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Based Tool Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingBasedToolDescription(MappingBasedToolDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Edit Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Edit Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectEditLabel(DirectEditLabel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Direct Edit Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Direct Edit Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDirectEditDescription(IXtextDirectEditDescription object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Direct Edit Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Direct Edit Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDirectEditModelDescription(IXtextDirectEditModelDescription object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Direct Edit Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Direct Edit Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDirectEditValueDescription(IXtextDirectEditValueDescription object) {
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

} //DiagramxtextSwitch
