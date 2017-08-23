/**
 * generated by Xtext 2.12.0
 */
package nl.altran.example.xtext.html.htmlLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import nl.altran.example.xtext.html.htmlLang.HtmlLangPackage;
import nl.altran.example.xtext.html.htmlLang.Style;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link nl.altran.example.xtext.html.htmlLang.impl.StyleImpl#getStyles
 * <em>Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleImpl extends HeaderImpl implements Style {
	/**
	 * The default value of the '{@link #getStyles() <em>Styles</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected String styles = STYLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlLangPackage.Literals.STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getStyles() {
		return this.styles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStyles(final String newStyles) {
		final String oldStyles = this.styles;
		this.styles = newStyles;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlLangPackage.STYLE__STYLES, oldStyles,
					this.styles));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case HtmlLangPackage.STYLE__STYLES:
				return getStyles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
			case HtmlLangPackage.STYLE__STYLES:
				setStyles((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
			case HtmlLangPackage.STYLE__STYLES:
				setStyles(STYLES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
			case HtmlLangPackage.STYLE__STYLES:
				return STYLES_EDEFAULT == null ? this.styles != null : !STYLES_EDEFAULT.equals(this.styles);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (styles: ");
		result.append(this.styles);
		result.append(')');
		return result.toString();
	}

} // StyleImpl