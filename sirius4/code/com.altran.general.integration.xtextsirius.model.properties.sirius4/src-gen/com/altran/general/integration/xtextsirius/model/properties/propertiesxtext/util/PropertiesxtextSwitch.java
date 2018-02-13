/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage
 * @generated
 */
public class PropertiesxtextSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static PropertiesxtextPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertiesxtextSwitch() {
		if (modelPackage == null) {
			modelPackage = PropertiesxtextPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	public T doSwitch(final EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	protected T doSwitch(final EClass theEClass, final EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			final List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	protected T doSwitch(final int classifierID, final EObject theEObject) {
		switch (classifierID) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION: {
				final XtextSingleLineModelDescription xtextSingleLineModelDescription = (XtextSingleLineModelDescription) theEObject;
				T result = caseXtextSingleLineModelDescription(xtextSingleLineModelDescription);
				if (result == null) {
					result = caseIXtextPropertyModelDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextModelDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case PropertiesxtextPackage.XTEXT_MULTI_LINE_MODEL_DESCRIPTION: {
				final XtextMultiLineModelDescription xtextMultiLineModelDescription = (XtextMultiLineModelDescription) theEObject;
				T result = caseXtextMultiLineModelDescription(xtextMultiLineModelDescription);
				if (result == null) {
					result = caseIXtextPropertyModelDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextModelDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION: {
				final XtextSingleLineValueDescription xtextSingleLineValueDescription = (XtextSingleLineValueDescription) theEObject;
				T result = caseXtextSingleLineValueDescription(xtextSingleLineValueDescription);
				if (result == null) {
					result = caseIXtextPropertyValueDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextValueDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case PropertiesxtextPackage.XTEXT_MULTI_LINE_VALUE_DESCRIPTION: {
				final XtextMultiLineValueDescription xtextMultiLineValueDescription = (XtextMultiLineValueDescription) theEObject;
				T result = caseXtextMultiLineValueDescription(xtextMultiLineValueDescription);
				if (result == null) {
					result = caseIXtextPropertyValueDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextValueDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Single Line Model Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Single Line Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextSingleLineModelDescription(final XtextSingleLineModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Multi Line Model Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Multi Line Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextMultiLineModelDescription(final XtextMultiLineModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Single Line Value Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Single Line Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextSingleLineValueDescription(final XtextSingleLineValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Multi Line Value Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Multi Line Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextMultiLineValueDescription(final XtextMultiLineValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDescription(final IXtextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Property Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Property Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyDescription(final IXtextPropertyDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Model Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextModelDescription(final IXtextModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Property Model Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Property Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyModelDescription(final IXtextPropertyModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Value Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextValueDescription(final IXtextValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Property Value Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Property Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyValueDescription(final IXtextPropertyValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(final EObject object) {
		return null;
	}

} // PropertiesxtextSwitch
