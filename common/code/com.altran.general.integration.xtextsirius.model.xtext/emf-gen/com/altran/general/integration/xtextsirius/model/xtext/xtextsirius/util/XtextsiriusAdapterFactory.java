/**
 */
package com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 *
 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage
 * @generated
 */
public class XtextsiriusAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static XtextsiriusPackage modelPackage;
	
	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public XtextsiriusAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XtextsiriusPackage.eINSTANCE;
		}
	}
	
	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(final Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}
	
	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected XtextsiriusSwitch<Adapter> modelSwitch = new XtextsiriusSwitch<Adapter>() {
		@Override
		public Adapter caseIXtextDescription(final IXtextDescription object) {
			return createIXtextDescriptionAdapter();
		}
		
		@Override
		public Adapter caseIXtextModelDescription(final IXtextModelDescription object) {
			return createIXtextModelDescriptionAdapter();
		}
		
		@Override
		public Adapter caseIXtextValueDescription(final IXtextValueDescription object) {
			return createIXtextValueDescriptionAdapter();
		}
		
		@Override
		public Adapter caseIXtextPropertyDescription(final IXtextPropertyDescription object) {
			return createIXtextPropertyDescriptionAdapter();
		}
		
		@Override
		public Adapter caseIXtextDirectEditDescription(final IXtextDirectEditDescription object) {
			return createIXtextDirectEditDescriptionAdapter();
		}
		
		@Override
		public Adapter caseIXtextDirectEditModelDescription(final IXtextDirectEditModelDescription object) {
			return createIXtextDirectEditModelDescriptionAdapter();
		}
		
		@Override
		public Adapter caseIXtextDirectEditValueDescription(final IXtextDirectEditValueDescription object) {
			return createIXtextDirectEditValueDescriptionAdapter();
		}
		
		@Override
		public Adapter caseIXtextPropertyModelDescription(final IXtextPropertyModelDescription object) {
			return createIXtextPropertyModelDescriptionAdapter();
		}
		
		@Override
		public Adapter caseIXtextPropertyValueDescription(final IXtextPropertyValueDescription object) {
			return createIXtextPropertyValueDescriptionAdapter();
		}
		
		@Override
		public Adapter defaultCase(final EObject object) {
			return createEObjectAdapter();
		}
	};
	
	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(final Notifier target) {
		return this.modelSwitch.doSwitch((EObject) target);
	}
	
	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
	 * <em>IXtext Description</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
	 * @generated
	 */
	public Adapter createIXtextDescriptionAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
	 * <em>IXtext Model Description</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
	 * @generated
	 */
	public Adapter createIXtextModelDescriptionAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
	 * <em>IXtext Value Description</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
	 * @generated
	 */
	public Adapter createIXtextValueDescriptionAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
	 * <em>IXtext Property Description</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
	 * @generated
	 */
	public Adapter createIXtextPropertyDescriptionAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription
	 * <em>IXtext Direct Edit Description</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription
	 * @generated
	 */
	public Adapter createIXtextDirectEditDescriptionAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription
	 * <em>IXtext Direct Edit Model Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription
	 * @generated
	 */
	public Adapter createIXtextDirectEditModelDescriptionAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription
	 * <em>IXtext Direct Edit Value Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription
	 * @generated
	 */
	public Adapter createIXtextDirectEditValueDescriptionAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
	 * <em>IXtext Property Model Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
	 * @generated
	 */
	public Adapter createIXtextPropertyModelDescriptionAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
	 * <em>IXtext Property Value Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
	 * @generated
	 */
	public Adapter createIXtextPropertyValueDescriptionAdapter() {
		return null;
	}
	
	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}
	
} // XtextsiriusAdapterFactory
