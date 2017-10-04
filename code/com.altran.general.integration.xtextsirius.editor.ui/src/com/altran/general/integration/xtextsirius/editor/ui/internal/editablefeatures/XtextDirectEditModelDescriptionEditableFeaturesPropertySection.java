package com.altran.general.integration.xtextsirius.editor.ui.internal.editablefeatures;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.editor.editorPlugin.SiriusEditorPlugin;
import org.eclipse.sirius.editor.properties.sections.common.AbstractEditorDialogPropertySection;
import org.eclipse.sirius.editor.tools.internal.assist.TypeAssistant;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

@SuppressWarnings("restriction")
public class XtextDirectEditModelDescriptionEditableFeaturesPropertySection
		extends AbstractEditorDialogPropertySection {
	
	@Override
	protected boolean isEqual(final List<?> newList) {
		return newList.equals(getValue());
	}
	
	@Override
	protected EStructuralFeature getFeature() {
		return XtextsiriusPackage.eINSTANCE.getIXtextModelDescription_EditableFeatures();
	}

	protected List<?> getValue() {
		return (List<?>) this.eObject.eGet(getFeature());
	}
	
	protected Stream<EClass> getContextEClasses() {
		return new TypeAssistant(SiriusEditorPlugin.getPlugin().getWorkspaceEPackageRegistry(), this).proposal("")
				.stream()
				.filter(EClass.class::isInstance)
				.map(EClass.class::cast);
	}

	protected List<EClass> collectApplicableEClasses() {
		final DirectEditLabel label = ((DirectEditLabel) this.eObject);

		return findEClassesByName(label.getMapping().stream()
				.map(m -> {
					if (m instanceof AbstractNodeMapping) {
						return ((AbstractNodeMapping) m).getDomainClass();
					} else if (m instanceof EdgeMapping) {
						return ((EdgeMapping) m).getDomainClass();
					}
					
					return null;
				}));
	}

	protected List<EClass> findEClassesByName(final Stream<String> classNames) {
		return classNames
				.filter(Objects::nonNull)
				.map(seName -> {
					final String[] split = StringUtils.split(seName, '.');
					
					Predicate<EClass> secondFilter = null;
					String eClassName = null;
					if (split.length == 1) {
						eClassName = split[0];
					} else if (split.length == 2) {
						eClassName = split[1];
						
						final String ePackageName = split[0];
						if (StringUtils.isNotBlank(ePackageName)) {
							secondFilter = eClass -> ePackageName.equals(eClass.getEPackage().getName());
						}
					}

					if (StringUtils.isNotBlank(eClassName)) {
						final String eClassName2 = eClassName;
						
						Stream<EClass> stream = getContextEClasses()
								.filter(eClass -> eClass.getName().equals(eClassName2));
						if (secondFilter != null) {
							stream = stream.filter(secondFilter);
						}
						
						final EClass result = stream
								.findAny()
								.orElse(null);

						return result;
					}

					return null;
				})
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
	}
	
	@Override
	protected List<String> getChoiceOfValues(final List<?> currentValues) {
		return collectApplicableEClasses().stream()
				.flatMap(eClass -> eClass.getEAllStructuralFeatures().stream())
				.distinct()
				.map(f -> f.getEContainingClass().getName() + "." + f.getName())
				.filter(s -> !currentValues.contains(s))
				.collect(Collectors.toList());
	}

	@Override
	protected void handleFeatureModified(final @SuppressWarnings("rawtypes") List result) {
		final boolean equals = isEqual(result);

		if (!equals) {
			final EditingDomain editingDomain = ((IEditingDomainProvider) getPart()).getEditingDomain();
			final Object value = result;

			if (this.eObjectList.size() == 1) {
				// apply the property change to single selected object
				editingDomain.getCommandStack()
						.execute(SetCommand.create(editingDomain, this.eObject, getFeature(), value));
			} else {
				final CompoundCommand compoundCommand = new CompoundCommand();
				/* apply the property change to all selected elements */
				for (final Iterator<EObject> i = this.eObjectList.iterator(); i.hasNext();) {
					final EObject nextObject = i.next();
					compoundCommand.append(SetCommand.create(editingDomain, nextObject, getFeature(), value));
				}
				editingDomain.getCommandStack().execute(compoundCommand);
			}
		}
	}


	@Override
	protected String getLabelText() {
		return super.getLabelText() + ":";
	}
	
	@Override
	protected String getDefaultLabelText() {
		return "Editable features";
	}
}
