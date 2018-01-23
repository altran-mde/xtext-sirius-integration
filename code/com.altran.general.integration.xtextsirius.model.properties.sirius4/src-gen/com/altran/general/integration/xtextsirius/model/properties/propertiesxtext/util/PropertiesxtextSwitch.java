<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
=======
>>>>>>> fixed invalid import in generated files
import org.eclipse.sirius.properties.ControlDescription;
import org.eclipse.sirius.properties.TextAreaDescription;
import org.eclipse.sirius.properties.TextDescription;
import org.eclipse.sirius.properties.WidgetDescription;
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files

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
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
					result = caseIXtextPropertyModelDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
=======
					result = caseTextDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyModelDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseWidgetDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
					result = caseIXtextPropertyModelDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
>>>>>>> updated to Oxygen.2
=======
					result = caseTextDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyModelDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseWidgetDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
>>>>>>> fixed invalid import in generated files
					result = caseIXtextPropertyDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextModelDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
					result = caseControlDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
=======
					result = caseControlDescription(xtextSingleLineModelDescription);
				}
				if (result == null) {
>>>>>>> fixed invalid import in generated files
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
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
					result = caseIXtextPropertyModelDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
=======
					result = caseTextAreaDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyModelDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseTextDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
					result = caseIXtextPropertyModelDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
>>>>>>> updated to Oxygen.2
=======
					result = caseTextAreaDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyModelDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseTextDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
>>>>>>> fixed invalid import in generated files
					result = caseIXtextPropertyDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextModelDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
					result = caseIXtextDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
=======
					result = caseWidgetDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseControlDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
					result = caseIXtextDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
>>>>>>> updated to Oxygen.2
=======
					result = caseWidgetDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
					result = caseControlDescription(xtextMultiLineModelDescription);
				}
				if (result == null) {
>>>>>>> fixed invalid import in generated files
					result = defaultCase(theEObject);
				}
				return result;
			}
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION: {
				final XtextSingleLineValueDescription xtextSingleLineValueDescription = (XtextSingleLineValueDescription) theEObject;
				T result = caseXtextSingleLineValueDescription(xtextSingleLineValueDescription);
				if (result == null) {
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
					result = caseIXtextPropertyValueDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
=======
					result = caseTextDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyValueDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseWidgetDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
					result = caseIXtextPropertyValueDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
>>>>>>> updated to Oxygen.2
=======
					result = caseTextDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyValueDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseWidgetDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
>>>>>>> fixed invalid import in generated files
					result = caseIXtextPropertyDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextValueDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
					result = caseControlDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
=======
					result = caseControlDescription(xtextSingleLineValueDescription);
				}
				if (result == null) {
>>>>>>> fixed invalid import in generated files
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
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
					result = caseIXtextPropertyValueDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
=======
					result = caseTextAreaDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyValueDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseTextDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
					result = caseIXtextPropertyValueDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
>>>>>>> updated to Oxygen.2
=======
					result = caseTextAreaDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextPropertyValueDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseTextDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
>>>>>>> fixed invalid import in generated files
					result = caseIXtextPropertyDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextValueDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
					result = caseIXtextDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
=======
=======
>>>>>>> fixed invalid import in generated files
					result = caseWidgetDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
					result = caseControlDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
					result = caseIXtextDescription(xtextMultiLineValueDescription);
				}
				if (result == null) {
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Single Line Model Description</em>'. <!-- begin-user-doc -->
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Xtext Single Line Model Description</em>'. <!-- begin-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Single Line Model Description</em>'. <!-- begin-user-doc -->
>>>>>>> updated to Oxygen.2
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Single Line Model Description</em>'.
=======
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Xtext Single Line Model Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Single Line Model Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextSingleLineModelDescription(final XtextSingleLineModelDescription object) {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Multi Line Model Description</em>'. <!-- begin-user-doc -->
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Xtext Multi Line Model Description</em>'. <!-- begin-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Multi Line Model Description</em>'. <!-- begin-user-doc -->
>>>>>>> updated to Oxygen.2
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Multi Line Model Description</em>'.
=======
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Xtext Multi Line Model Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Multi Line Model Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextMultiLineModelDescription(final XtextMultiLineModelDescription object) {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Single Line Value Description</em>'. <!-- begin-user-doc -->
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Xtext Single Line Value Description</em>'. <!-- begin-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Single Line Value Description</em>'. <!-- begin-user-doc -->
>>>>>>> updated to Oxygen.2
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Single Line Value Description</em>'.
=======
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Xtext Single Line Value Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Single Line Value Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextSingleLineValueDescription(final XtextSingleLineValueDescription object) {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Multi Line Value Description</em>'. <!-- begin-user-doc -->
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Xtext Multi Line Value Description</em>'. <!-- begin-user-doc -->
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Multi Line Value Description</em>'. <!-- begin-user-doc -->
>>>>>>> updated to Oxygen.2
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Multi Line Value Description</em>'.
=======
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Xtext Multi Line Value Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Multi Line Value Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextMultiLineValueDescription(final XtextMultiLineValueDescription object) {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Control Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Control Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlDescription(final ControlDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Widget Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Widget Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetDescription(final WidgetDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text
	 * Description</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text
	 *         Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDescription(final TextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Description</em>'. <!-- begin-user-doc --> This
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Control Description</em>'. <!-- begin-user-doc --> This
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Description</em>'. <!-- begin-user-doc --> This
>>>>>>> updated to Oxygen.2
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Description</em>'.
=======
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Control Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlDescription(final ControlDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Widget Description</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Widget Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetDescription(final WidgetDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Text Description</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Text Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDescription(final TextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IXtext Description</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IXtext Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDescription(final IXtextDescription object) {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Property Description</em>'. <!-- begin-user-doc --> This
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IXtext Property Description</em>'. <!-- begin-user-doc --> This
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Property Description</em>'. <!-- begin-user-doc --> This
>>>>>>> updated to Oxygen.2
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Property Description</em>'.
=======
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IXtext Property Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Property Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyDescription(final IXtextPropertyDescription object) {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Model Description</em>'. <!-- begin-user-doc --> This
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IXtext Model Description</em>'. <!-- begin-user-doc --> This
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Model Description</em>'. <!-- begin-user-doc --> This
>>>>>>> updated to Oxygen.2
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Model Description</em>'.
=======
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IXtext Model Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Model Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextModelDescription(final IXtextModelDescription object) {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
>>>>>>> updated to Oxygen.2
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Property Model Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Property Model Description</em>'.
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IXtext Property Model Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IXtext Property Model Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Property Model Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyModelDescription(final IXtextPropertyModelDescription object) {
		return null;
	}

	/**
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
	 * Returns the result of interpreting the object as an instance of '<em>Text
	 * Area Description</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text
	 *         Area Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAreaDescription(final TextAreaDescription object) {
		return null;
	}

	/**
>>>>>>> fixed invalid import in generated files
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Value Description</em>'. <!-- begin-user-doc --> This
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Text Area Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Text Area Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAreaDescription(final TextAreaDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IXtext Value Description</em>'. <!-- begin-user-doc --> This
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Value Description</em>'. <!-- begin-user-doc --> This
>>>>>>> updated to Oxygen.2
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Value Description</em>'.
=======
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IXtext Value Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Value Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextValueDescription(final IXtextValueDescription object) {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
>>>>>>> updated to Oxygen.2
	 * Returns the result of interpreting the object as an instance of
	 * '<em>IXtext Property Value Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Property Value Description</em>'.
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IXtext Property Value Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IXtext Property Value Description</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Property Value Description</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyValueDescription(final IXtextPropertyValueDescription object) {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Returns the result of interpreting the object as an instance of
	 * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
=======
	 * Returns the result of interpreting the object as an instance of '
	 * <em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Returns the result of interpreting the object as an instance of
	 * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
>>>>>>> updated to Oxygen.2
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * @return the result of interpreting the object as an instance of
	 *         '<em>EObject</em>'.
=======
	 * @return the result of interpreting the object as an instance of '
	 *         <em>EObject</em>'.
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * @return the result of interpreting the object as an instance of
	 *         '<em>EObject</em>'.
>>>>>>> updated to Oxygen.2
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(final EObject object) {
		return null;
	}

} // PropertiesxtextSwitch
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
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

import org.eclipse.sirius.properties.ControlDescription;
import org.eclipse.sirius.properties.TextAreaDescription;
import org.eclipse.sirius.properties.TextDescription;
import org.eclipse.sirius.properties.WidgetDescription;

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
				result = caseWidgetDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseIXtextModelDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseControlDescription(xtextSingleLineModelDescription);
			if (result == null)
				result = caseIXtextDescription(xtextSingleLineModelDescription);
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
				result = caseTextDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseIXtextModelDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseWidgetDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseIXtextDescription(xtextMultiLineModelDescription);
			if (result == null)
				result = caseControlDescription(xtextMultiLineModelDescription);
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
				result = caseWidgetDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseIXtextValueDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseControlDescription(xtextSingleLineValueDescription);
			if (result == null)
				result = caseIXtextDescription(xtextSingleLineValueDescription);
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
				result = caseTextDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseIXtextValueDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseWidgetDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseIXtextDescription(xtextMultiLineValueDescription);
			if (result == null)
				result = caseControlDescription(xtextMultiLineValueDescription);
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
>>>>>>> preliminary fix for using guava v16
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
