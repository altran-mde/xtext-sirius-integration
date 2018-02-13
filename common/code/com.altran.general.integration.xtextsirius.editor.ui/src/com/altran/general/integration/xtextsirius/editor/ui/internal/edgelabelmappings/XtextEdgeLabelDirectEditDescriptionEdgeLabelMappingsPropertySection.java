package com.altran.general.integration.xtextsirius.editor.ui.internal.edgelabelmappings;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.sirius.editor.properties.sections.common.AbstractEditorDialogWithListPropertySection;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.AXtextDirectEditLabel;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.google.common.collect.Streams;

public class XtextEdgeLabelDirectEditDescriptionEdgeLabelMappingsPropertySection
		extends AbstractEditorDialogWithListPropertySection {

	@Override
	protected List<BasicLabelStyleDescription> getCurrentValue() {
		return getDescription().getEdgeLabelMappings();
	}
	
	protected IXtextEdgeLabelDirectEditDescription getDescription() {
		return (IXtextEdgeLabelDirectEditDescription) this.eObject;
	}

	@Override
	protected boolean getSortChoice() {
		return true;
	}

	@Override
	protected String getDefaultLabelText() {
		return "Edge Label Mappings";
	}

	@Override
	protected String getLabelText() {
		return super.getLabelText() + ":";
	}

	@Override
	protected List<BasicLabelStyleDescription> getChoiceOfValues() {
		return ((AXtextDirectEditLabel) getDescription()).getMapping().stream()
				.flatMap(m -> Streams.stream(m.eAllContents()))
				.filter(BasicLabelStyleDescription.class::isInstance)
				.map(BasicLabelStyleDescription.class::cast)
				.collect(Collectors.toList());
	}
	
	/*
	 * stolen and adapted from
	 * org.eclipse.sirius.editor.properties.sections.tool.
	 * representationnavigationdescription.
	 * RepresentationNavigationDescriptionMappingsPropertySection.
	 * handleFeatureModified(List)
	 */
	@Override
	protected void handleFeatureModified(final @SuppressWarnings("rawtypes") List result) {
		final boolean equals = isEqual(result);
		
		if (!equals) {
			final EditingDomain editingDomain = ((IEditingDomainProvider) getPart()).getEditingDomain();
			if (this.eObjectList.size() == 1) {
				CompoundCommand compoundCommand = new CompoundCommand();
				final Object eGet = getCurrentValue();
				if (eGet instanceof EList) {
					for (final Object object : (EList<?>) eGet) {
						compoundCommand.append(RemoveCommand.create(editingDomain, this.eObject, getFeature(), object));
					}
				}
				editingDomain.getCommandStack().execute(compoundCommand);
				
				compoundCommand = new CompoundCommand();
				if (result instanceof EList) {
					for (final Object object : result) {
						compoundCommand.append(AddCommand.create(editingDomain, this.eObject, getFeature(), object));
					}
				}
				editingDomain.getCommandStack().execute(compoundCommand);
			} else {
				final CompoundCommand compoundCommand = new CompoundCommand();
				/* apply the property change to all selected elements */
				for (final EObject nextObject : this.eObjectList) {
					compoundCommand.append(SetCommand.create(editingDomain, nextObject, getFeature(), result));
				}
				editingDomain.getCommandStack().execute(compoundCommand);
			}
		}
	}
	
	@Override
	protected EReference getFeature() {
		return ViewpointxtextPackage.eINSTANCE.getIXtextEdgeLabelDirectEditDescription_EdgeLabelMappings();
	}
	
}
