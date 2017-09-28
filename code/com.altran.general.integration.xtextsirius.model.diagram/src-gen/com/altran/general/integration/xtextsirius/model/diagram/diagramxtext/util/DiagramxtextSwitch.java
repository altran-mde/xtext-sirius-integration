/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;
import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;
import org.eclipse.sirius.viewpoint.description.tool.MappingBasedToolDescription;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage
 * @generated
 */
public class DiagramxtextSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DiagramxtextPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DiagramxtextSwitch() {
		if (modelPackage == null) {
			modelPackage = DiagramxtextPackage.eINSTANCE;
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
			case DiagramxtextPackage.IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION: {
				final IXtextDirectEditModelDescription iXtextDirectEditModelDescription = (IXtextDirectEditModelDescription) theEObject;
				T result = caseIXtextDirectEditModelDescription(iXtextDirectEditModelDescription);
				if (result == null) {
					result = caseIXtextDirectEditDescription(iXtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseIXtextModelDescription(iXtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(iXtextDirectEditModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION: {
				final XtextDirectEditModelDescription xtextDirectEditModelDescription = (XtextDirectEditModelDescription) theEObject;
				T result = caseXtextDirectEditModelDescription(xtextDirectEditModelDescription);
				if (result == null) {
					result = caseDirectEditLabel(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditModelDescription(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseMappingBasedToolDescription(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditDescription(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseIXtextModelDescription(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseAbstractToolDescription(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseToolEntry(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseDocumentedElement(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = caseIdentifiedElement(xtextDirectEditModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION: {
				final XtextDirectEditValueDescription xtextDirectEditValueDescription = (XtextDirectEditValueDescription) theEObject;
				T result = caseXtextDirectEditValueDescription(xtextDirectEditValueDescription);
				if (result == null) {
					result = caseDirectEditLabel(xtextDirectEditValueDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditDescription(xtextDirectEditValueDescription);
				}
				if (result == null) {
					result = caseIXtextValueDescription(xtextDirectEditValueDescription);
				}
				if (result == null) {
					result = caseMappingBasedToolDescription(xtextDirectEditValueDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextDirectEditValueDescription);
				}
				if (result == null) {
					result = caseAbstractToolDescription(xtextDirectEditValueDescription);
				}
				if (result == null) {
					result = caseToolEntry(xtextDirectEditValueDescription);
				}
				if (result == null) {
					result = caseDocumentedElement(xtextDirectEditValueDescription);
				}
				if (result == null) {
					result = caseIdentifiedElement(xtextDirectEditValueDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case DiagramxtextPackage.XTEXT_BEGIN_LABEL_STYLE_MODEL_DESCRIPTION: {
				final XtextBeginLabelStyleModelDescription xtextBeginLabelStyleModelDescription = (XtextBeginLabelStyleModelDescription) theEObject;
				T result = caseXtextBeginLabelStyleModelDescription(xtextBeginLabelStyleModelDescription);
				if (result == null) {
					result = caseBeginLabelStyleDescription(xtextBeginLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditModelDescription(xtextBeginLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseBasicLabelStyleDescription(xtextBeginLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditDescription(xtextBeginLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextModelDescription(xtextBeginLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextBeginLabelStyleModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case DiagramxtextPackage.XTEXT_BEGIN_LABEL_STYLE_VALUE_DESCRIPTION: {
				final XtextBeginLabelStyleValueDescription xtextBeginLabelStyleValueDescription = (XtextBeginLabelStyleValueDescription) theEObject;
				T result = caseXtextBeginLabelStyleValueDescription(xtextBeginLabelStyleValueDescription);
				if (result == null) {
					result = caseBeginLabelStyleDescription(xtextBeginLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditDescription(xtextBeginLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseIXtextValueDescription(xtextBeginLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseBasicLabelStyleDescription(xtextBeginLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextBeginLabelStyleValueDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case DiagramxtextPackage.XTEXT_CENTER_LABEL_STYLE_MODEL_DESCRIPTION: {
				final XtextCenterLabelStyleModelDescription xtextCenterLabelStyleModelDescription = (XtextCenterLabelStyleModelDescription) theEObject;
				T result = caseXtextCenterLabelStyleModelDescription(xtextCenterLabelStyleModelDescription);
				if (result == null) {
					result = caseCenterLabelStyleDescription(xtextCenterLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditModelDescription(xtextCenterLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseBasicLabelStyleDescription(xtextCenterLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditDescription(xtextCenterLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextModelDescription(xtextCenterLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextCenterLabelStyleModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case DiagramxtextPackage.XTEXT_CENTER_LABEL_STYLE_VALUE_DESCRIPTION: {
				final XtextCenterLabelStyleValueDescription xtextCenterLabelStyleValueDescription = (XtextCenterLabelStyleValueDescription) theEObject;
				T result = caseXtextCenterLabelStyleValueDescription(xtextCenterLabelStyleValueDescription);
				if (result == null) {
					result = caseCenterLabelStyleDescription(xtextCenterLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditDescription(xtextCenterLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseIXtextValueDescription(xtextCenterLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseBasicLabelStyleDescription(xtextCenterLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextCenterLabelStyleValueDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case DiagramxtextPackage.XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION: {
				final XtextEndLabelStyleModelDescription xtextEndLabelStyleModelDescription = (XtextEndLabelStyleModelDescription) theEObject;
				T result = caseXtextEndLabelStyleModelDescription(xtextEndLabelStyleModelDescription);
				if (result == null) {
					result = caseEndLabelStyleDescription(xtextEndLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditModelDescription(xtextEndLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseBasicLabelStyleDescription(xtextEndLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditDescription(xtextEndLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextModelDescription(xtextEndLabelStyleModelDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextEndLabelStyleModelDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case DiagramxtextPackage.XTEXT_END_LABEL_STYLE_VALUE_DESCRIPTION: {
				final XtextEndLabelStyleValueDescription xtextEndLabelStyleValueDescription = (XtextEndLabelStyleValueDescription) theEObject;
				T result = caseXtextEndLabelStyleValueDescription(xtextEndLabelStyleValueDescription);
				if (result == null) {
					result = caseEndLabelStyleDescription(xtextEndLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseIXtextDirectEditDescription(xtextEndLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseIXtextValueDescription(xtextEndLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseBasicLabelStyleDescription(xtextEndLabelStyleValueDescription);
				}
				if (result == null) {
					result = caseIXtextDescription(xtextEndLabelStyleValueDescription);
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
	 * '<em>IXtext Direct Edit Model Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Direct Edit Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDirectEditModelDescription(final IXtextDirectEditModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Direct Edit Model Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Direct Edit Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextDirectEditModelDescription(final XtextDirectEditModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Direct Edit Value Description</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Direct Edit Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextDirectEditValueDescription(final XtextDirectEditValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Begin Label Style Model Description</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Begin Label Style Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextBeginLabelStyleModelDescription(final XtextBeginLabelStyleModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Begin Label Style Value Description</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Begin Label Style Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextBeginLabelStyleValueDescription(final XtextBeginLabelStyleValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Center Label Style Model Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Center Label Style Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextCenterLabelStyleModelDescription(final XtextCenterLabelStyleModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext Center Label Style Value Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext Center Label Style Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextCenterLabelStyleValueDescription(final XtextCenterLabelStyleValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext End Label Style Model Description</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext End Label Style Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextEndLabelStyleModelDescription(final XtextEndLabelStyleModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Xtext End Label Style Value Description</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Xtext End Label Style Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtextEndLabelStyleValueDescription(final XtextEndLabelStyleValueDescription object) {
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
	 * '<em>IXtext Direct Edit Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>IXtext Direct Edit Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDirectEditDescription(final IXtextDirectEditDescription object) {
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
	 * '<em>Documented Element</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Documented Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedElement(final DocumentedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Identified Element</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(final IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Entry</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolEntry(final ToolEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Abstract Tool Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Abstract Tool Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractToolDescription(final AbstractToolDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Mapping Based Tool Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Mapping Based Tool Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingBasedToolDescription(final MappingBasedToolDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Direct Edit Label</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Direct Edit Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectEditLabel(final DirectEditLabel object) {
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
	 * '<em>Basic Label Style Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Basic Label Style Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicLabelStyleDescription(final BasicLabelStyleDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Begin Label Style Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Begin Label Style Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeginLabelStyleDescription(final BeginLabelStyleDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Center Label Style Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Center Label Style Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterLabelStyleDescription(final CenterLabelStyleDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End
	 * Label Style Description</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End
	 *         Label Style Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndLabelStyleDescription(final EndLabelStyleDescription object) {
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

} // DiagramxtextSwitch
