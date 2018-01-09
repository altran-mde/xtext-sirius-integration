/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.util;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.*;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFWidgetDescription;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage
 * @generated
 */
public class EefxtextAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EefxtextPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefxtextAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EefxtextPackage.eINSTANCE;
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
	protected EefxtextSwitch<Adapter> modelSwitch = new EefxtextSwitch<Adapter>() {
		@Override
		public Adapter caseIEefXtextDescription(IEefXtextDescription object) {
			return createIEefXtextDescriptionAdapter();
		}

		@Override
		public Adapter caseIEefXtextModelDescription(IEefXtextModelDescription object) {
			return createIEefXtextModelDescriptionAdapter();
		}

		@Override
		public Adapter caseIEefXtextValueDescription(IEefXtextValueDescription object) {
			return createIEefXtextValueDescriptionAdapter();
		}

		@Override
		public Adapter caseIEefXtextPropertyDescription(IEefXtextPropertyDescription object) {
			return createIEefXtextPropertyDescriptionAdapter();
		}

		@Override
		public Adapter caseEefXtextSingleLineModelDescription(EefXtextSingleLineModelDescription object) {
			return createEefXtextSingleLineModelDescriptionAdapter();
		}

		@Override
		public Adapter caseEefXtextMultiLineModelDescription(EefXtextMultiLineModelDescription object) {
			return createEefXtextMultiLineModelDescriptionAdapter();
		}

		@Override
		public Adapter caseEefXtextSingleLineValueDescription(EefXtextSingleLineValueDescription object) {
			return createEefXtextSingleLineValueDescriptionAdapter();
		}

		@Override
		public Adapter caseEefXtextMultiLineValueDescription(EefXtextMultiLineValueDescription object) {
			return createEefXtextMultiLineValueDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFControlDescription(EEFControlDescription object) {
			return createEEFControlDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFWidgetDescription(EEFWidgetDescription object) {
			return createEEFWidgetDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFTextDescription(EEFTextDescription object) {
			return createEEFTextDescriptionAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription <em>IEef Xtext Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription
	 * @generated
	 */
	public Adapter createIEefXtextDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription <em>IEef Xtext Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription
	 * @generated
	 */
	public Adapter createIEefXtextModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription <em>IEef Xtext Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription
	 * @generated
	 */
	public Adapter createIEefXtextValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextPropertyDescription <em>IEef Xtext Property Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextPropertyDescription
	 * @generated
	 */
	public Adapter createIEefXtextPropertyDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineModelDescription <em>Eef Xtext Single Line Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineModelDescription
	 * @generated
	 */
	public Adapter createEefXtextSingleLineModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineModelDescription <em>Eef Xtext Multi Line Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineModelDescription
	 * @generated
	 */
	public Adapter createEefXtextMultiLineModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineValueDescription <em>Eef Xtext Single Line Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineValueDescription
	 * @generated
	 */
	public Adapter createEefXtextSingleLineValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineValueDescription <em>Eef Xtext Multi Line Value Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineValueDescription
	 * @generated
	 */
	public Adapter createEefXtextMultiLineValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFControlDescription <em>EEF Control Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFControlDescription
	 * @generated
	 */
	public Adapter createEEFControlDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFWidgetDescription <em>EEF Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFWidgetDescription
	 * @generated
	 */
	public Adapter createEEFWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTextDescription <em>EEF Text Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTextDescription
	 * @generated
	 */
	public Adapter createEEFTextDescriptionAdapter() {
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

} //EefxtextAdapterFactory
