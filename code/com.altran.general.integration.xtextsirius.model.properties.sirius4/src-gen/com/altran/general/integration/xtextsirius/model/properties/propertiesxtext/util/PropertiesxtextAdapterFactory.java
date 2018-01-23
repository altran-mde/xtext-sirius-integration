<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage
 * @generated
 */
public class PropertiesxtextAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static PropertiesxtextPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertiesxtextAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PropertiesxtextPackage.eINSTANCE;
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
	protected PropertiesxtextSwitch<Adapter> modelSwitch = new PropertiesxtextSwitch<Adapter>() {
		@Override
		public Adapter caseXtextSingleLineModelDescription(final XtextSingleLineModelDescription object) {
			return createXtextSingleLineModelDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextMultiLineModelDescription(final XtextMultiLineModelDescription object) {
			return createXtextMultiLineModelDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextSingleLineValueDescription(final XtextSingleLineValueDescription object) {
			return createXtextSingleLineValueDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextMultiLineValueDescription(final XtextMultiLineValueDescription object) {
			return createXtextMultiLineValueDescriptionAdapter();
		}

		@Override
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
=======
>>>>>>> fixed invalid import in generated files
		public Adapter caseControlDescription(final ControlDescription object) {
			return createControlDescriptionAdapter();
		}

		@Override
		public Adapter caseWidgetDescription(final WidgetDescription object) {
			return createWidgetDescriptionAdapter();
		}

		@Override
		public Adapter caseTextDescription(final TextDescription object) {
			return createTextDescriptionAdapter();
		}

		@Override
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files
		public Adapter caseIXtextDescription(final IXtextDescription object) {
			return createIXtextDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextPropertyDescription(final IXtextPropertyDescription object) {
			return createIXtextPropertyDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextModelDescription(final IXtextModelDescription object) {
			return createIXtextModelDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextPropertyModelDescription(final IXtextPropertyModelDescription object) {
			return createIXtextPropertyModelDescriptionAdapter();
		}

		@Override
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
=======
=======
>>>>>>> fixed invalid import in generated files
		public Adapter caseTextAreaDescription(final TextAreaDescription object) {
			return createTextAreaDescriptionAdapter();
		}

		@Override
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files
		public Adapter caseIXtextValueDescription(final IXtextValueDescription object) {
			return createIXtextValueDescriptionAdapter();
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
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription
>>>>>>> updated to Oxygen.2
	 * <em>Xtext Single Line Model Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription
	 * @generated
	 */
	public Adapter createXtextSingleLineModelDescriptionAdapter() {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
>>>>>>> updated to Oxygen.2
	 * <em>Xtext Multi Line Model Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription
	 * @generated
	 */
	public Adapter createXtextMultiLineModelDescriptionAdapter() {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
>>>>>>> updated to Oxygen.2
	 * <em>Xtext Single Line Value Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription
	 * @generated
	 */
	public Adapter createXtextSingleLineValueDescriptionAdapter() {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
>>>>>>> updated to Oxygen.2
	 * <em>Xtext Multi Line Value Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription
	 * @generated
	 */
	public Adapter createXtextMultiLineValueDescriptionAdapter() {
		return null;
	}

	/**
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.sirius.properties.ControlDescription
	 * <em>Control Description</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.ControlDescription
	 * @generated
	 */
	public Adapter createControlDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.sirius.properties.WidgetDescription
	 * <em>Widget Description</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.WidgetDescription
	 * @generated
	 */
	public Adapter createWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.sirius.properties.TextDescription
	 * <em>Text Description</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.TextDescription
	 * @generated
	 */
	public Adapter createTextDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.properties.ControlDescription <em>Control
	 * Description</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.ControlDescription
	 * @generated
	 */
	public Adapter createControlDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.properties.WidgetDescription <em>Widget
	 * Description</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.WidgetDescription
	 * @generated
	 */
	public Adapter createWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.properties.TextDescription <em>Text
	 * Description</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.TextDescription
	 * @generated
	 */
	public Adapter createTextDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription
>>>>>>> updated to Oxygen.2
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
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription
>>>>>>> updated to Oxygen.2
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
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription
>>>>>>> updated to Oxygen.2
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
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription
>>>>>>> updated to Oxygen.2
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
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.properties.TextAreaDescription <em>Text Area
	 * Description</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.TextAreaDescription
	 * @generated
	 */
	public Adapter createTextAreaDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.sirius.properties.TextAreaDescription
	 * <em>Text Area Description</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.TextAreaDescription
	 * @generated
	 */
	public Adapter createTextAreaDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription
>>>>>>> updated to Oxygen.2
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
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
=======
	 * Creates a new adapter for an object of class '
	 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription
>>>>>>> updated to Oxygen.2
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

} // PropertiesxtextAdapterFactory
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.properties.ControlDescription;
import org.eclipse.sirius.properties.TextAreaDescription;
import org.eclipse.sirius.properties.TextDescription;
import org.eclipse.sirius.properties.WidgetDescription;

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
		public Adapter caseControlDescription(ControlDescription object) {
			return createControlDescriptionAdapter();
		}

		@Override
		public Adapter caseWidgetDescription(WidgetDescription object) {
			return createWidgetDescriptionAdapter();
		}

		@Override
		public Adapter caseTextDescription(TextDescription object) {
			return createTextDescriptionAdapter();
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
		public Adapter caseTextAreaDescription(TextAreaDescription object) {
			return createTextAreaDescriptionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.properties.ControlDescription <em>Control Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.ControlDescription
	 * @generated
	 */
	public Adapter createControlDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.properties.WidgetDescription <em>Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.WidgetDescription
	 * @generated
	 */
	public Adapter createWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.properties.TextDescription <em>Text Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.TextDescription
	 * @generated
	 */
	public Adapter createTextDescriptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.properties.TextAreaDescription <em>Text Area Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.properties.TextAreaDescription
	 * @generated
	 */
	public Adapter createTextAreaDescriptionAdapter() {
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
>>>>>>> preliminary fix for using guava v16
=======
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
