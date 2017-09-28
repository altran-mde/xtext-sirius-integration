/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;
import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;
import org.eclipse.sirius.viewpoint.description.tool.MappingBasedToolDescription;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage
 * @generated
 */
public class DiagramxtextAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DiagramxtextPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DiagramxtextAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiagramxtextPackage.eINSTANCE;
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
	protected DiagramxtextSwitch<Adapter> modelSwitch = new DiagramxtextSwitch<Adapter>() {
		@Override
		public Adapter caseIXtextDirectEditModelDescription(final IXtextDirectEditModelDescription object) {
			return createIXtextDirectEditModelDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextDirectEditModelDescription(final XtextDirectEditModelDescription object) {
			return createXtextDirectEditModelDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextDirectEditValueDescription(final XtextDirectEditValueDescription object) {
			return createXtextDirectEditValueDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextBeginLabelStyleModelDescription(final XtextBeginLabelStyleModelDescription object) {
			return createXtextBeginLabelStyleModelDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextBeginLabelStyleValueDescription(final XtextBeginLabelStyleValueDescription object) {
			return createXtextBeginLabelStyleValueDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextCenterLabelStyleModelDescription(final XtextCenterLabelStyleModelDescription object) {
			return createXtextCenterLabelStyleModelDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextCenterLabelStyleValueDescription(final XtextCenterLabelStyleValueDescription object) {
			return createXtextCenterLabelStyleValueDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextEndLabelStyleModelDescription(final XtextEndLabelStyleModelDescription object) {
			return createXtextEndLabelStyleModelDescriptionAdapter();
		}

		@Override
		public Adapter caseXtextEndLabelStyleValueDescription(final XtextEndLabelStyleValueDescription object) {
			return createXtextEndLabelStyleValueDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextDescription(final IXtextDescription object) {
			return createIXtextDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextDirectEditDescription(final IXtextDirectEditDescription object) {
			return createIXtextDirectEditDescriptionAdapter();
		}

		@Override
		public Adapter caseIXtextModelDescription(final IXtextModelDescription object) {
			return createIXtextModelDescriptionAdapter();
		}

		@Override
		public Adapter caseDocumentedElement(final DocumentedElement object) {
			return createDocumentedElementAdapter();
		}

		@Override
		public Adapter caseIdentifiedElement(final IdentifiedElement object) {
			return createIdentifiedElementAdapter();
		}

		@Override
		public Adapter caseToolEntry(final ToolEntry object) {
			return createToolEntryAdapter();
		}

		@Override
		public Adapter caseAbstractToolDescription(final AbstractToolDescription object) {
			return createAbstractToolDescriptionAdapter();
		}

		@Override
		public Adapter caseMappingBasedToolDescription(final MappingBasedToolDescription object) {
			return createMappingBasedToolDescriptionAdapter();
		}

		@Override
		public Adapter caseDirectEditLabel(final DirectEditLabel object) {
			return createDirectEditLabelAdapter();
		}

		@Override
		public Adapter caseIXtextValueDescription(final IXtextValueDescription object) {
			return createIXtextValueDescriptionAdapter();
		}

		@Override
		public Adapter caseBasicLabelStyleDescription(final BasicLabelStyleDescription object) {
			return createBasicLabelStyleDescriptionAdapter();
		}

		@Override
		public Adapter caseBeginLabelStyleDescription(final BeginLabelStyleDescription object) {
			return createBeginLabelStyleDescriptionAdapter();
		}

		@Override
		public Adapter caseCenterLabelStyleDescription(final CenterLabelStyleDescription object) {
			return createCenterLabelStyleDescriptionAdapter();
		}

		@Override
		public Adapter caseEndLabelStyleDescription(final EndLabelStyleDescription object) {
			return createEndLabelStyleDescriptionAdapter();
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
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription
	 * <em>IXtext Direct Edit Model Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.IXtextDirectEditModelDescription
	 * @generated
	 */
	public Adapter createIXtextDirectEditModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription
	 * <em>Xtext Direct Edit Model Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription
	 * @generated
	 */
	public Adapter createXtextDirectEditModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription
	 * <em>Xtext Direct Edit Value Description</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription
	 * @generated
	 */
	public Adapter createXtextDirectEditValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleModelDescription
	 * <em>Xtext Begin Label Style Model Description</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleModelDescription
	 * @generated
	 */
	public Adapter createXtextBeginLabelStyleModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleValueDescription
	 * <em>Xtext Begin Label Style Value Description</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextBeginLabelStyleValueDescription
	 * @generated
	 */
	public Adapter createXtextBeginLabelStyleValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleModelDescription
	 * <em>Xtext Center Label Style Model Description</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleModelDescription
	 * @generated
	 */
	public Adapter createXtextCenterLabelStyleModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleValueDescription
	 * <em>Xtext Center Label Style Value Description</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextCenterLabelStyleValueDescription
	 * @generated
	 */
	public Adapter createXtextCenterLabelStyleValueDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription
	 * <em>Xtext End Label Style Model Description</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription
	 * @generated
	 */
	public Adapter createXtextEndLabelStyleModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleValueDescription
	 * <em>Xtext End Label Style Value Description</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleValueDescription
	 * @generated
	 */
	public Adapter createXtextEndLabelStyleValueDescriptionAdapter() {
		return null;
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
	 * '{@link org.eclipse.sirius.viewpoint.description.DocumentedElement
	 * <em>Documented Element</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.description.DocumentedElement
	 * @generated
	 */
	public Adapter createDocumentedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.viewpoint.description.IdentifiedElement
	 * <em>Identified Element</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.description.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.viewpoint.description.tool.ToolEntry
	 * <em>Entry</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.description.tool.ToolEntry
	 * @generated
	 */
	public Adapter createToolEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription
	 * <em>Abstract Tool Description</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription
	 * @generated
	 */
	public Adapter createAbstractToolDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.viewpoint.description.tool.MappingBasedToolDescription
	 * <em>Mapping Based Tool Description</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.description.tool.MappingBasedToolDescription
	 * @generated
	 */
	public Adapter createMappingBasedToolDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.diagram.description.tool.DirectEditLabel
	 * <em>Direct Edit Label</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.diagram.description.tool.DirectEditLabel
	 * @generated
	 */
	public Adapter createDirectEditLabelAdapter() {
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
	 * '{@link org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription
	 * <em>Basic Label Style Description</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription
	 * @generated
	 */
	public Adapter createBasicLabelStyleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription
	 * <em>Begin Label Style Description</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription
	 * @generated
	 */
	public Adapter createBeginLabelStyleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription
	 * <em>Center Label Style Description</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription
	 * @generated
	 */
	public Adapter createCenterLabelStyleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription
	 * <em>End Label Style Description</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription
	 * @generated
	 */
	public Adapter createEndLabelStyleDescriptionAdapter() {
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

} // DiagramxtextAdapterFactory
