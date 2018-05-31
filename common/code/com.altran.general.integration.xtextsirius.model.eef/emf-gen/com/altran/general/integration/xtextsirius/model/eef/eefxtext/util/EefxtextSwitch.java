/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.util;

import java.util.List;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineValueDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage
 * @generated
 */
public class EefxtextSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static EefxtextPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public EefxtextSwitch() {
		if (modelPackage == null) {
			modelPackage = EefxtextPackage.eINSTANCE;
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
			case EefxtextPackage.IEEF_XTEXT_DESCRIPTION: {
				final IEefXtextDescription iEefXtextDescription = (IEefXtextDescription) theEObject;
				T result = caseIEefXtextDescription(iEefXtextDescription);
				if (result == null) {
					result = caseEEFTextDescription(iEefXtextDescription);
				}
				if (result == null) {
					result = caseEEFWidgetDescription(iEefXtextDescription);
				}
				if (result == null) {
					result = caseEEFControlDescription(iEefXtextDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EefxtextPackage.IEEF_XTEXT_MODEL_DESCRIPTION: {
				final IEefXtextModelDescription iEefXtextModelDescription = (IEefXtextModelDescription) theEObject;
				T result = caseIEefXtextModelDescription(iEefXtextModelDescription);
				if (result == null) {
					result = caseIEefXtextDescription(iEefXtextModelDescription);
				}
				if (result == null) {
					result = caseEEFTextDescription(iEefXtextModelDescription);
				}
				if (result == null) {
					result = caseEEFWidgetDescription(iEefXtextModelDescription);
				}
				if (result == null) {
					result = caseEEFControlDescription(iEefXtextModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EefxtextPackage.IEEF_XTEXT_VALUE_DESCRIPTION: {
				final IEefXtextValueDescription iEefXtextValueDescription = (IEefXtextValueDescription) theEObject;
				T result = caseIEefXtextValueDescription(iEefXtextValueDescription);
				if (result == null) {
					result = caseIEefXtextDescription(iEefXtextValueDescription);
				}
				if (result == null) {
					result = caseEEFTextDescription(iEefXtextValueDescription);
				}
				if (result == null) {
					result = caseEEFWidgetDescription(iEefXtextValueDescription);
				}
				if (result == null) {
					result = caseEEFControlDescription(iEefXtextValueDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EefxtextPackage.IEEF_XTEXT_PROPERTY_DESCRIPTION: {
				final IEefXtextPropertyDescription iEefXtextPropertyDescription = (IEefXtextPropertyDescription) theEObject;
				T result = caseIEefXtextPropertyDescription(iEefXtextPropertyDescription);
				if (result == null) {
					result = caseIEefXtextDescription(iEefXtextPropertyDescription);
				}
				if (result == null) {
					result = caseEEFTextDescription(iEefXtextPropertyDescription);
				}
				if (result == null) {
					result = caseEEFWidgetDescription(iEefXtextPropertyDescription);
				}
				if (result == null) {
					result = caseEEFControlDescription(iEefXtextPropertyDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_MODEL_DESCRIPTION: {
				final EefXtextSingleLineModelDescription eefXtextSingleLineModelDescription = (EefXtextSingleLineModelDescription) theEObject;
				T result = caseEefXtextSingleLineModelDescription(eefXtextSingleLineModelDescription);
				if (result == null) {
					result = caseIEefXtextPropertyDescription(eefXtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseIEefXtextModelDescription(eefXtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseIEefXtextDescription(eefXtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseEEFTextDescription(eefXtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseEEFWidgetDescription(eefXtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseEEFControlDescription(eefXtextSingleLineModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EefxtextPackage.EEF_XTEXT_MULTI_LINE_MODEL_DESCRIPTION: {
				final EefXtextMultiLineModelDescription eefXtextMultiLineModelDescription = (EefXtextMultiLineModelDescription) theEObject;
				T result = caseEefXtextMultiLineModelDescription(eefXtextMultiLineModelDescription);
				if (result == null) {
					result = caseIEefXtextPropertyDescription(eefXtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIEefXtextModelDescription(eefXtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIEefXtextDescription(eefXtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseEEFTextDescription(eefXtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseEEFWidgetDescription(eefXtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseEEFControlDescription(eefXtextMultiLineModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION: {
				final EefXtextSingleLineValueDescription eefXtextSingleLineValueDescription = (EefXtextSingleLineValueDescription) theEObject;
				T result = caseEefXtextSingleLineValueDescription(eefXtextSingleLineValueDescription);
				if (result == null) {
					result = caseIEefXtextPropertyDescription(eefXtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseIEefXtextValueDescription(eefXtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseIEefXtextDescription(eefXtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseEEFTextDescription(eefXtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseEEFWidgetDescription(eefXtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseEEFControlDescription(eefXtextSingleLineValueDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EefxtextPackage.EEF_XTEXT_MULTI_LINE_VALUE_DESCRIPTION: {
				final EefXtextMultiLineValueDescription eefXtextMultiLineValueDescription = (EefXtextMultiLineValueDescription) theEObject;
				T result = caseEefXtextMultiLineValueDescription(eefXtextMultiLineValueDescription);
				if (result == null) {
					result = caseIEefXtextPropertyDescription(eefXtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseIEefXtextValueDescription(eefXtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseIEefXtextDescription(eefXtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseEEFTextDescription(eefXtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseEEFWidgetDescription(eefXtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseEEFControlDescription(eefXtextMultiLineValueDescription);
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
	 * Returns the result of interpreting the object as an instance of '<em>IEef
	 * Xtext Description</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEef
	 *         Xtext Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEefXtextDescription(final IEefXtextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEef
	 * Xtext Model Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEef
	 *         Xtext Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEefXtextModelDescription(final IEefXtextModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEef
	 * Xtext Value Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEef
	 *         Xtext Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEefXtextValueDescription(final IEefXtextValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEef
	 * Xtext Property Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEef
	 *         Xtext Property Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEefXtextPropertyDescription(final IEefXtextPropertyDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eef
	 * Xtext Single Line Model Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eef
	 *         Xtext Single Line Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEefXtextSingleLineModelDescription(final EefXtextSingleLineModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eef
	 * Xtext Multi Line Model Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eef
	 *         Xtext Multi Line Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEefXtextMultiLineModelDescription(final EefXtextMultiLineModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eef
	 * Xtext Single Line Value Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eef
	 *         Xtext Single Line Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEefXtextSingleLineValueDescription(final EefXtextSingleLineValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eef
	 * Xtext Multi Line Value Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eef
	 *         Xtext Multi Line Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEefXtextMultiLineValueDescription(final EefXtextMultiLineValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF
	 * Control Description</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF
	 *         Control Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFControlDescription(final EEFControlDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF
	 * Widget Description</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF
	 *         Widget Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFWidgetDescription(final EEFWidgetDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF
	 * Text Description</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF
	 *         Text Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTextDescription(final EEFTextDescription object) {
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

} // EefxtextSwitch
