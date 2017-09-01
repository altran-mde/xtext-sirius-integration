package com.altran.general.integration.xtextsirius.eef.internal.model;

import static org.eclipse.xtext.EcoreUtil2.eAllContentsAsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.sirius.common.tools.internal.interpreter.FeatureInterpreter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CompoundElement;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.eef.internal.XtextSiriusController;
import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Injector;

public class XtextSiriusEefLifecycleManagerModel extends AXtextSiriusEefLifecycleManager {
	public XtextSiriusEefLifecycleManagerModel(
			final @NonNull PropertyDescriptorModel descriptor,
			final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(descriptor, controlDescription, variableManager, interpreter, contextAdapter);
	}

	@Override
	protected void createMainControl(final Composite parent, final IEEFFormContainer formContainer) {
		final Injector injector = createSpecializedInjector();

		this.widget = new XtextSiriusWidgetModel(parent, injector, getDescriptor().isMultiLine());
		applyGridData(getWidget().getControl());

		this.controller = new XtextSiriusController(this.controlDescription, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.newValueConsumer = (newValue) -> {
			final Serializer serializer = (Serializer) getDescriptor().getConfig().getInjector()
					.getInstance(ISerializer.class);

			if (newValue instanceof EObject) {
				final EObject semanticElement = (EObject) newValue;
				final ITextRegionAccess region = serializer
						.serializeToRegions(EcoreUtil.getRootContainer(semanticElement));

				final ITextRegionAccess textRegionAccess = region.regionForRootEObject().getTextRegionAccess();
				final StringBuffer allText = new StringBuffer(region.regionForDocument().getText());
				final IEObjectRegion semanticRegion = region.regionForEObject(semanticElement);
				TextRegion textRegion = new TextRegion(semanticRegion.getOffset(), semanticRegion.getLength());
				final String newline = "\n";
				allText.insert(textRegion.getOffset(), newline);
				textRegion = new TextRegion(textRegion.getOffset() + newline.length(), textRegion.getLength());
				getWidget().update(allText.toString(), new SemanticElementLocation(semanticElement), textRegion);
				getWidget().updateUri(semanticElement.eResource().getURI());
			} else {
				final String valueExpression = getWidgetDescription().getValueExpression();
				if (valueExpression.startsWith(FeatureInterpreter.PREFIX)) {
					final String featureName = valueExpression.substring(FeatureInterpreter.PREFIX.length());
					final Object self = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
					if (self instanceof EObject) {
						final @Nullable EObject eSelf = (@Nullable EObject) self;

						final EStructuralFeature feature = eSelf.eClass().getEStructuralFeature(featureName);
						if (feature != null) {
							final ITextRegionAccess region = serializer
									.serializeToRegions(EcoreUtil.getRootContainer(eSelf));

							final ITextRegionAccess textRegionAccess = region.regionForRootEObject()
									.getTextRegionAccess();
							final StringBuffer allText = new StringBuffer(region.regionForDocument().getText());

							final IEObjectRegion selfRegion = region.regionForEObject(eSelf);

							if (feature instanceof EAttribute
									|| (feature instanceof EReference && !((EReference) feature).isContainment())) {
								final ISemanticRegion x = selfRegion.getRegionFor().feature(feature);
							} else {
								final EObject grammarElement = selfRegion.getGrammarElement();

								if (grammarElement instanceof RuleCall) {
									final List<AbstractElement> containedElements = findContainedElement(
											(AbstractElement) grammarElement, feature);
									if (!containedElements.isEmpty()) {
										final AbstractElement containedElement = Iterables.getLast(containedElements);
										final Group containingGroup = GrammarUtil.containingGroup(containedElement);
										if (containingGroup != null) {
											final List<AbstractElement> elementsBefore = Lists.newArrayList();
											final List<AbstractElement> elementsAfter = Lists.newArrayList();
											List<AbstractElement> currentList = elementsBefore;

											for (final AbstractElement ae : containingGroup.getElements()) {
												if (ae == containedElement
														|| eAllContentsAsList(ae).contains(containedElement)) {
													currentList = elementsAfter;
												} else {
													currentList.add(ae);
												}
											}

											final String beforeText = elementsBefore.stream()
													.filter(el -> el instanceof Keyword)
													.map(el -> ((Keyword) el).getValue())
													.collect(Collectors.joining());

											final String afterText = elementsAfter.stream()
													.filter(el -> el instanceof Keyword)
													.map(el -> ((Keyword) el).getValue())
													.collect(Collectors.joining());

											containedElements.remove(0);
											final Set<ISemanticRegion> rrr = Sets.newLinkedHashSet();

											final Iterable<ISemanticRegion> semanticRegions = selfRegion
													.getSemanticRegions();
											for (final ISemanticRegion x : semanticRegions) {
												final EObject ge = x.getGrammarElement();
												final Group gr = GrammarUtil.containingGroup(ge);
												if (gr != null) {
													if (gr.getElements().stream()
															.anyMatch(el -> containedElements.contains(el))) {
														rrr.add(x);
													}
												}
											}

											final ISemanticRegion max = rrr.stream()
													.max((a, b) -> Integer.compare(a.getEndOffset(), b.getEndOffset()))
													.get();

											final int endOffset = max.getEndOffset();
											System.err.println(endOffset);
											System.err.println(elementsBefore);
											System.err.println(elementsAfter);
											
											allText.insert(endOffset, afterText);
											allText.insert(endOffset, '\n');
											allText.insert(endOffset, beforeText);
											
											final TextRegion textRegion = new TextRegion(
													endOffset + 1 + beforeText.length(), 0);
											final String parentFragment = EcoreUtil.getURI(eSelf).fragment();
											final String fragment = parentFragment + "/@" + feature.getName()
													+ (feature.isMany() ? ".1" : "");
											final int index = 0;
											getWidget().update(allText.toString(), new SemanticElementLocation(
													fragment, parentFragment, feature, index),
													textRegion);
											getWidget().updateUri(eSelf.eResource().getURI());
										}

									}
								}
								// selfRegion.getRegionFor().element(element)assignment(assignment)
								// final Object child = eSelf.eGet(feature);
								// if (child instanceof EObject) {
								// int x =
								// selfRegion.getTextRegionAccess().regionForEObject((EObject)
								// child).;
								// } else {
								// return Stream.of();
								// }
							}

						}

						//
						// String text;
						// TextRegion textRegion;
						//
						//
						// if (getEditableFeatures().isEmpty()) {
						// text =
						// StringUtils.normalizeSpace(semanticRegion.getText());
						// textRegion = new
						// TextRegion(semanticRegion.getOffset(),
						// semanticRegion.getLength());
						// } else {
						// final EClass eClass = eSelf.eClass();
						// final List<ISemanticRegion> regions =
						// getEditableFeatures().stream()
						// .map(ef -> eClass.getEStructuralFeature(ef))
						// .filter(Objects::nonNull)
						// .flatMap(feature -> {
						// if (feature instanceof EAttribute
						// || (feature instanceof EReference && !((EReference)
						// feature).isContainment())) {
						// return
						// Stream.of(semanticRegion.getRegionFor().feature(feature));
						// } else {
						// final Object child = semanticElement.eGet(feature);
						// if (child instanceof EObject) {
						// return StreamSupport
						// .stream(region.regionForEObject((EObject) child)
						// .getAllSemanticRegions().spliterator(), false);
						// } else {
						// return Stream.of();
						// }
						// }
						// })
						// .collect(Collectors.toList());
						//
						// final int startOffset = regions.stream()
						// .map(reg -> reg.getOffset())
						// .min(Integer::compare)
						// .get();
						//
						// final int endOffset = regions.stream()
						// .map(reg -> {
						// final ISemanticRegion nextHiddenRegion =
						// reg.getNextSemanticRegion();
						// if (nextHiddenRegion instanceof StringSemanticRegion)
						// {
						// return nextHiddenRegion.getEndOffset();
						// }
						// return reg.getEndOffset();
						// })
						// .max(Integer::compare)
						// .get();
						//
						// text =
						// region.regionForRootEObject().getTextRegionAccess().textForOffset(startOffset,
						// endOffset - startOffset);
						// textRegion = new TextRegion(startOffset, endOffset -
						// startOffset);
						// }
						//
						// System.out.println("allText1:\n" + allText);
						// allText.insert(textRegion.getOffset(), "\n");
						// textRegion = new TextRegion(textRegion.getOffset() +
						// 1, textRegion.getLength());
						// System.out.println("allText2:\n" + allText);
						// StyledTextUtil.removeNewlinesIfSingleLine(allText,
						// textRegion.getOffset(), textRegion.getLength(),
						// false);
						//
						// System.out.println("allText:\n" + allText);
						// System.out.println("text: " + text);
						// System.out.println("textRegion: " + textRegion);
						// // }
						//
						// final EObject eSelf = (EObject) self;
						// getWidget().update(eSelf);
						// final EStructuralFeature feature =
						// eSelf.eClass().getEStructuralFeature(featureName);
						// final EClassifier eType = feature.getEType();
						// if (eType instanceof EClass) {
						// final EObject root =
						// EcoreUtil.getRootContainer(eSelf);
						// final EObject rootClone = EcoreUtil.copy(root);
						// final EObject selfClone =
						// EcoreUtil.getEObject(rootClone,
						// EcoreUtil.getRelativeURIFragmentPath(root, eSelf));
						// final EObject newInstance =
						// eType.getEPackage().getEFactoryInstance()
						// .create((EClass) eType);
						// selfClone.eSet(feature, newInstance);
						// final XtextResource cloneResource = new
						// XtextResource(eSelf.eResource().getURI());
						// cloneResource.getContents().add(rootClone);
						// getWidget().update(newInstance);
						// }
					}
				}
				updateWidgetUriWithSelf();
			}
		};
		this.controller.onNewValue(this.newValueConsumer);

	}

	private @NonNull List<@NonNull AbstractElement> findContainedElement(final @NonNull AbstractElement abstractElement,
			final @NonNull EStructuralFeature feature) {
		if (abstractElement instanceof Assignment) {
			if (feature.getName().equals(((Assignment) abstractElement).getFeature())) {
				return Collections.singletonList(abstractElement);
			}
		}

		if (abstractElement instanceof RuleCall) {
			final AbstractElement alternatives = ((RuleCall) abstractElement).getRule().getAlternatives();

			final List<AbstractElement> alternativesResult = findContainedElement(alternatives, feature);
			if (!alternativesResult.isEmpty()) {
				final ArrayList<AbstractElement> result = Lists.newArrayList(alternativesResult);
				result.add(0, abstractElement);
				return result;
			}
		}

		if (abstractElement instanceof CompoundElement) {
			for (final AbstractElement alternative : ((CompoundElement) abstractElement).getElements()) {
				final List<AbstractElement> alternativeResult = findContainedElement(alternative, feature);
				if (!alternativeResult.isEmpty()) {
					final ArrayList<AbstractElement> result = Lists.newArrayList(alternativeResult);
					result.add(0, abstractElement);
					return result;
				}
			}
		}

		return Collections.emptyList();
	}

	@Override
	public void aboutToBeHidden() {
		final EObject semanticElement = getWidget().getSemanticElement();
		// if (semanticElement != null) {
		// semanticElement = EcoreHelper.cloneAndProxify(semanticElement);
		// }
		persistIfDirty(semanticElement);
		super.aboutToBeHidden();
	}

	@Override
	public XtextSiriusWidgetModel getWidget() {
		return (XtextSiriusWidgetModel) super.getWidget();
	}
}
