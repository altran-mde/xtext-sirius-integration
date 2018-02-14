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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage
 * @generated
 */
public class PropertiesxtextAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertiesxtextPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesxtextAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PropertiesxtextPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesxtextSwitch<Adapter> modelSwitch = new PropertiesxtextSwitch<Adapter>() {
		@Override
		public Adapter caseXtextSingleLineModelDescription(XtextSingleLineModelDescription object) {
			return createXtextSingleLineModelDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextMultiLineModelDescription(XtextMultiLineModelDescription object) {
			return createXtextMultiLineModelDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextSingleLineValueDescription(XtextSingleLineValueDescription object) {
			return createXtextSingleLineValueDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextMultiLineValueDescription(XtextMultiLineValueDescription object) {
			return createXtextMultiLineValueDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextDescription(IXtextDescription object) {
			return createIXtextDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextPropertyDescription(IXtextPropertyDescription object) {
			return createIXtextPropertyDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextModelDescription(IXtextModelDescription object) {
			return createIXtextModelDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextPropertyModelDescription(IXtextPropertyModelDescription object) {
			return createIXtextPropertyModelDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextValueDescription(IXtextValueDescription object) {
			return createIXtextValueDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextPropertyValueDescription(IXtextPropertyValueDescription object) {
			return createIXtextPropertyValueDescriptionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription <em>Xtext Single Line Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription
	 * @generated
	 */
	public Adapter createXtextSingleLineModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription <em>Xtext Multi Line Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
	 * @generated
	 */
	public Adapter createXtextMultiLineModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription <em>Xtext Single Line Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
	 * @generated
	 */
	public Adapter createXtextSingleLineValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription <em>Xtext Multi Line Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
	 * @generated
	 */
	public Adapter createXtextMultiLineValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription <em>IXtext Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
	 * @generated
	 */
	public Adapter createIXtextDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription <em>IXtext Property Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
	 * @generated
	 */
	public Adapter createIXtextPropertyDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription <em>IXtext Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
	 * @generated
	 */
	public Adapter createIXtextModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription <em>IXtext Property Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
	 * @generated
	 */
	public Adapter createIXtextPropertyModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription <em>IXtext Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
	 * @generated
	 */
	public Adapter createIXtextValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription <em>IXtext Property Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
	 * @generated
	 */
	public Adapter createIXtextPropertyValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PropertiesxtextAdapterFactory
