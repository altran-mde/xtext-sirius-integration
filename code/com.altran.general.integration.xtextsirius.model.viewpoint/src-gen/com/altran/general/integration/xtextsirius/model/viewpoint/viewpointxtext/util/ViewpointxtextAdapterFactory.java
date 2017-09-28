/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.viewpoint.DFeatureExtension;
import org.eclipse.sirius.viewpoint.description.FeatureExtensionDescription;
import org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage
 * @generated
 */
public class ViewpointxtextAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ViewpointxtextPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ViewpointxtextAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewpointxtextPackage.eINSTANCE;
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
	protected ViewpointxtextSwitch<Adapter> modelSwitch = new ViewpointxtextSwitch<Adapter>() {
		@Override
		public Adapter caseXtextFeatureExtensionDescription(final XtextFeatureExtensionDescription object) {
			return createXtextFeatureExtensionDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextDFeatureExtension(final XtextDFeatureExtension object) {
			return createXtextDFeatureExtensionAdapter();
		}

		@Override
		public Adapter caseXtextRepresentationExtension(final XtextRepresentationExtension object) {
			return createXtextRepresentationExtensionAdapter();
		}

		@Override
		public Adapter caseFeatureExtensionDescription(final FeatureExtensionDescription object) {
			return createFeatureExtensionDescriptionAdapter();
		}

		@Override
		public Adapter caseDFeatureExtension(final DFeatureExtension object) {
			return createDFeatureExtensionAdapter();
		}

		@Override
		public Adapter caseRepresentationExtensionDescription(final RepresentationExtensionDescription object) {
			return createRepresentationExtensionDescriptionAdapter();
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
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription
	 * <em>Xtext Feature Extension Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription
	 * @generated
	 */
	public Adapter createXtextFeatureExtensionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension
	 * <em>Xtext DFeature Extension</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension
	 * @generated
	 */
	public Adapter createXtextDFeatureExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension
	 * <em>Xtext Representation Extension</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension
	 * @generated
	 */
	public Adapter createXtextRepresentationExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.viewpoint.description.FeatureExtensionDescription
	 * <em>Feature Extension Description</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.description.FeatureExtensionDescription
	 * @generated
	 */
	public Adapter createFeatureExtensionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.viewpoint.DFeatureExtension <em>DFeature
	 * Extension</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.DFeatureExtension
	 * @generated
	 */
	public Adapter createDFeatureExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription
	 * <em>Representation Extension Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription
	 * @generated
	 */
	public Adapter createRepresentationExtensionDescriptionAdapter() {
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

} // ViewpointxtextAdapterFactory
