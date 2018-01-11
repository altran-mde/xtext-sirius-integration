/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext;


/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IEef
 * Xtext Value Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription#getPrefixTextExpression
 * <em>Prefix Text Expression</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription#getSuffixTextExpression
 * <em>Suffix Text Expression</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextValueDescription()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IEefXtextValueDescription extends IEefXtextDescription {
	/**
	 * Returns the value of the '<em><b>Prefix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Text Expression</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Prefix Text Expression</em>' attribute.
	 * @see #setPrefixTextExpression(String)
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextValueDescription_PrefixTextExpression()
	 * @model unique="false"
	 * @generated
	 */
	String getPrefixTextExpression();

	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription#getPrefixTextExpression
	 * <em>Prefix Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Prefix Text Expression</em>'
	 *            attribute.
	 * @see #getPrefixTextExpression()
	 * @generated
	 */
	void setPrefixTextExpression(String value);

	/**
	 * Returns the value of the '<em><b>Suffix Text Expression</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix Text Expression</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Suffix Text Expression</em>' attribute.
	 * @see #setSuffixTextExpression(String)
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage#getIEefXtextValueDescription_SuffixTextExpression()
	 * @model unique="false"
	 * @generated
	 */
	String getSuffixTextExpression();

	/**
	 * Sets the value of the
	 * '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription#getSuffixTextExpression
	 * <em>Suffix Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Suffix Text Expression</em>'
	 *            attribute.
	 * @see #getSuffixTextExpression()
	 * @generated
	 */
	void setSuffixTextExpression(String value);

} // IEefXtextValueDescription
