/**
 * generated by Xtext 2.12.0
 */
package nl.altran.example.xtext.html.htmlLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Unordered List</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link nl.altran.example.xtext.html.htmlLang.UnorderedList#getItems
 * <em>Items</em>}</li>
 * </ul>
 *
 * @see nl.altran.example.xtext.html.htmlLang.HtmlLangPackage#getUnorderedList()
 * @model
 * @generated
 */
public interface UnorderedList extends BodyContents {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link nl.altran.example.xtext.html.htmlLang.ListItem}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see nl.altran.example.xtext.html.htmlLang.HtmlLangPackage#getUnorderedList_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getItems();

} // UnorderedList