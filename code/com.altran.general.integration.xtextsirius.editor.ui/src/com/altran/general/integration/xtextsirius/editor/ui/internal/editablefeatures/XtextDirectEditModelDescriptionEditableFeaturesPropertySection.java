package com.altran.general.integration.xtextsirius.editor.ui.internal.editablefeatures;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.editor.properties.sections.common.AbstractEditorDialogPropertySection;
import org.eclipse.xtext.EcoreUtil2;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

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

	// @Override
	// protected String getFeatureAsText() {
	// String string = new String();
	//
	// if (eObject.eIsSet(getFeature())) {
	// List<?> values = getValue();
	// for (Iterator<?> iterator = values.iterator(); iterator.hasNext();) {
	// EObject eObj = (EObject) iterator.next();
	// string += getAdapterFactoryLabelProvider(eObj).getText(eObj);
	// if (iterator.hasNext()) {
	// string += ", ";
	// }
	// }
	// }
	//
	// return string;
	// }

	protected List<?> getValue() {
		return (List<?>) this.eObject.eGet(getFeature());
	}
	
	private Stream<EPackage> getAllEPackages() {
		return EPackage.Registry.INSTANCE.keySet().stream()
				.map(uri -> EPackage.Registry.INSTANCE.getEPackage(uri));
	}

	protected List<EClass> collectApplicableEClasses() {
		if (this.eObject instanceof DirectEditLabel) {
			return collectApplicableEClassesFromDirectEditLabel();
		} else if (this.eObject instanceof XtextEdgeLabelDirectEditModelDescription) {
			return collectApplicableEClassesFromXtextEdgeLabelDirectEditModelDescription();
		}
		return Collections.emptyList();
	}

	protected List<EClass> collectApplicableEClassesFromXtextEdgeLabelDirectEditModelDescription() {
		final XtextEdgeLabelDirectEditModelDescription desc = (XtextEdgeLabelDirectEditModelDescription) this.eObject;
		
		return findEClassesByName(desc.getEdgeLabelMappings().stream()
				.map(l -> EcoreUtil2.getContainerOfType(l, EdgeMapping.class))
				.map(m -> m.getDomainClass()));
	}

	protected List<EClass> findEClassesByName(final Stream<String> classNames) {
		return classNames
				.filter(Objects::nonNull)
				.map(seName -> {
					final String[] split = StringUtils.split(seName, '.');
					String eClassName = null;
					Stream<EPackage> ePackageCandidates = getAllEPackages();
					if (split.length == 1) {
						eClassName = split[0];
					} else if (split.length == 2) {
						eClassName = split[1];

						try {
							final String ePackageName = split[0];
							ePackageCandidates = getAllEPackages()
									.filter(pckg -> pckg.getName().equals(ePackageName))
									.map(pckg -> Stream.of(pckg))
									.findAny()
									.get();
						} catch (final NoSuchElementException e) {
							// do nothing, keep on with all EPackages
						}
					}

					if (StringUtils.isNotBlank(eClassName)) {
						final String eClassName2 = eClassName;
						
						final EClass result = (EClass) ePackageCandidates
								.flatMap(pckg -> pckg.getEClassifiers().stream())
								.filter(c -> c instanceof EClass)
								.filter(c -> c.getName().equals(eClassName2))
								.findAny()
								.orElse(null);

						return result;
					}

					return null;
				})
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
	}
	
	protected List<EClass> collectApplicableEClassesFromDirectEditLabel() {
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
