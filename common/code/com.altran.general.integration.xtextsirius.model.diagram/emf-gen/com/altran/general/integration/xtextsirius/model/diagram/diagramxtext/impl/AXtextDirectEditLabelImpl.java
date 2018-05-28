/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.AXtextDirectEditLabel;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;

import com.google.common.base.Objects;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.EStructuralFeature.Setting;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

import org.eclipse.sirius.diagram.description.DescriptionPackage;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;

import org.eclipse.sirius.diagram.description.tool.impl.DirectEditLabelImpl;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AXtext Direct Edit Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AXtextDirectEditLabelImpl extends DirectEditLabelImpl implements AXtextDirectEditLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AXtextDirectEditLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramxtextPackage.Literals.AXTEXT_DIRECT_EDIT_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiagramElementMapping> getMapping() {
		final Resource r = this.eResource();
		if ((r == null)) {
			throw new UnsupportedOperationException();
		}
		final ECrossReferenceAdapter crossReferencer = ECrossReferenceAdapter.getCrossReferenceAdapter(r);
		if ((crossReferencer == null)) {
			throw new UnsupportedOperationException();
		}
		final ArrayList<DiagramElementMapping> diagramElementMappings = CollectionLiterals
				.<DiagramElementMapping>newArrayList();
		final Collection<Setting> settings = crossReferencer.getInverseReferences(this, true);
		for (final Setting setting : settings) {
			{
				final EObject eReferencer = setting.getEObject();
				final EStructuralFeature eFeature = setting.getEStructuralFeature();
				if (((eReferencer instanceof DiagramElementMapping) && Objects.equal(eFeature,
						DescriptionPackage.eINSTANCE.getDiagramElementMapping_LabelDirectEdit()))) {
					diagramElementMappings.add(((DiagramElementMapping) eReferencer));
				}
			}
		}
		return new BasicEList<DiagramElementMapping>(diagramElementMappings);
	}

} //AXtextDirectEditLabelImpl
