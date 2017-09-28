/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext;

import org.eclipse.sirius.viewpoint.description.FeatureExtensionDescription;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xtext
 * Feature Extension Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription#getLabel
 * <em>Label</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage#getXtextFeatureExtensionDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextFeatureExtensionDescription extends FeatureExtensionDescription {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(BasicLabelStyleDescription)
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage#getXtextFeatureExtensionDescription_Label()
	 * @model
	 * @generated
	 */
	BasicLabelStyleDescription getLabel();

	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription#getLabel
	 * <em>Label</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(BasicLabelStyleDescription value);

} // XtextFeatureExtensionDescription
