/**
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.util;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
 * @generated
 */
public class XtextSiriusTestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XtextSiriusTestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtextSiriusTestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XtextSiriusTestPackage.eINSTANCE;
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
	protected XtextSiriusTestSwitch<Adapter> modelSwitch = new XtextSiriusTestSwitch<Adapter>() {
		@Override
		public Adapter caseIdElement(IdElement object) {
			return createIdElementAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public <T extends IElement<?>> Adapter caseIElement(IElement<T> object) {
			return createIElementAdapter();
		}

		@Override
		public <A extends AElement<?>> Adapter caseAElement(AElement<A> object) {
			return createAElementAdapter();
		}

		@Override
		public Adapter caseKeyElement(KeyElement object) {
			return createKeyElementAdapter();
		}

		@Override
		public Adapter caseIContainedElement(IContainedElement object) {
			return createIContainedElementAdapter();
		}

		@Override
		public Adapter caseContainedA(ContainedA object) {
			return createContainedAAdapter();
		}

		@Override
		public Adapter caseContainedB(ContainedB object) {
			return createContainedBAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement <em>Id Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement
	 * @generated
	 */
	public Adapter createIdElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement <em>IElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
	 * @generated
	 */
	public Adapter createIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement <em>AElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.AElement
	 * @generated
	 */
	public Adapter createAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement <em>Key Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement
	 * @generated
	 */
	public Adapter createKeyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement <em>IContained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IContainedElement
	 * @generated
	 */
	public Adapter createIContainedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA <em>Contained A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedA
	 * @generated
	 */
	public Adapter createContainedAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB <em>Contained B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.ContainedB
	 * @generated
	 */
	public Adapter createContainedBAdapter() {
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

} //XtextSiriusTestAdapterFactory
