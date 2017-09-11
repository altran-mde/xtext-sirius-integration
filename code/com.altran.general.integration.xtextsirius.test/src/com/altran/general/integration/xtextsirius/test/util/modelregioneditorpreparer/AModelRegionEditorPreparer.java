package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.util.ModelRegionEditorPreparer;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Injector;

@SuppressWarnings({ "restriction" })
public abstract class AModelRegionEditorPreparer extends AFowlerdslDefaultModelTest {
	protected static class AccessibleModelRegionEditorPreparer extends ModelRegionEditorPreparer {
		public AccessibleModelRegionEditorPreparer(final EObject semanticElement, final EObject parentSemanticElement,
				final Injector injector, final boolean multiLine, final Collection<String> editableFeatures,
				final EStructuralFeature semanticElementFeature) {
			super(semanticElement, parentSemanticElement, injector, multiLine, editableFeatures,
					semanticElementFeature);
		}
		
		public AccessibleModelRegionEditorPreparer(final EObject semanticElement, final Injector injector,
				final boolean multiLine, final Collection<String> editableFeatures) {
			super(semanticElement, injector, multiLine, editableFeatures);
		}
		
		@Override
		public TextRegion calculateRegionForFeatures(final EObject semanticElement) {
			return super.calculateRegionForFeatures(semanticElement);
		}
		
		@Override
		public void collectGrammarElementsBeforeAndAfter(final AbstractElement containedElement,
				final Group containingGroup, final List<AbstractElement> elementsBefore,
				final List<AbstractElement> elementsAfter) {
			super.collectGrammarElementsBeforeAndAfter(containedElement, containingGroup, elementsBefore,
					elementsAfter);
		}

		@Override
		protected @NonNull String collectToTerminalText(@NonNull final AbstractElement grammarElement,
				@NonNull final List<@NonNull AbstractElement> grammarElements) {
			return super.collectToTerminalText(grammarElement, grammarElements);
		}
		
		@Override
		public SemanticElementLocation constructXtextFragmentSchemeBasedLocation() {
			return super.constructXtextFragmentSchemeBasedLocation();
		}
		
		@Override
		public TextRegion ensureRequiredGrammarTerminalsPresent(final EObject element,
				final EStructuralFeature feature) {
			return super.ensureRequiredGrammarTerminalsPresent(element, feature);
		}
		
		@Override
		public List<AbstractElement> findContainedElementPath(final AbstractElement abstractElement,
				final EStructuralFeature feature) {
			return super.findContainedElementPath(abstractElement, feature);
		}
		
		@Override
		protected @NonNull Set<@NonNull ISemanticRegion> findRegionsOfContainedElements(
				@NonNull final IEObjectRegion elementRegion,
				@NonNull final List<@NonNull AbstractElement> containedElementPath,
				@NonNull final Multimap<@NonNull AbstractElement, @NonNull AbstractElement> parentMap) {
			return super.findRegionsOfContainedElements(elementRegion, containedElementPath, parentMap);
		}
		
		@Override
		public void prepare() {
			super.prepare();
		}
		
		@Override
		public Set<EStructuralFeature> resolveDefinedFeatures(final EObject semanticElement) {
			return super.resolveDefinedFeatures(semanticElement);
		}
		
		@Override
		public Set<@NonNull EStructuralFeature> resolveEditableFeatures(final EObject semanticElement) {
			return super.resolveEditableFeatures(semanticElement);
		}
		
		@Override
		public ISemanticRegion selectLastmostRegion(final Set<@NonNull ISemanticRegion> regionsOfContainedElements) {
			return super.selectLastmostRegion(regionsOfContainedElements);
		}

		@Override
		public boolean canBeHandledByGetRegionForFeature(@NonNull final EStructuralFeature feature) {
			return super.canBeHandledByGetRegionForFeature(feature);
		}
		
		@Override
		public @NonNull Set<@NonNull ISemanticRegion> translateToRegions(
				@NonNull final Set<@NonNull EStructuralFeature> features, @NonNull final IEObjectRegion semanticRegion,
				@NonNull final EObject semanticElement, @NonNull final ITextRegionAccess rootRegion) {
			return super.translateToRegions(features, semanticRegion, semanticElement, rootRegion);
		}

		@Override
		protected @NonNull Multimap<@NonNull AbstractElement, @NonNull AbstractElement> collectContainedGrammarElementsDeep(
				@NonNull final AbstractElement parent, @NonNull final AbstractElement base,
				@NonNull final Multimap<@NonNull AbstractElement, @NonNull AbstractElement> map) {
			return super.collectContainedGrammarElementsDeep(parent, base, map);
		}

		@Override
		protected boolean containsGrammarElementDeep(@NonNull final AbstractElement grammarElement,
				@NonNull final List<@NonNull AbstractElement> grammarElements,
				@NonNull final Multimap<@NonNull AbstractElement, @NonNull AbstractElement> parentMap) {
			return super.containsGrammarElementDeep(grammarElement, grammarElements, parentMap);
		}
		
		@Override
		protected String getWhitespace(final EObject grammarElement) {
			return super.getWhitespace(grammarElement);
		}

		public void setDefinedFeatures(final @NonNull Set<@NonNull EStructuralFeature> definedFeatures) {
			this.definedFeatures = definedFeatures;
		}

		public void setSemanticRegion(final @NonNull IEObjectRegion semanticRegion) {
			this.semanticRegion = semanticRegion;
		}

		public void setRootRegion(final @NonNull ITextRegionAccess rootRegion) {
			this.rootRegion = rootRegion;
		}
		
		public void setAllText(final @NonNull StringBuffer text) {
			this.allText = text;
		}

		public boolean isPrepared() {
			return this.prepared;
		}
	}
	
	protected AccessibleModelRegionEditorPreparer getFakePreparer() {
		return new AccessibleModelRegionEditorPreparer(AFowlerdslDefaultModelTest.statemachineFactory.createEvent(),
				getInjector(), false, Collections.emptyList());
	}

	protected ITextRegionAccess getRootRegion(final EObject obj) {
		return ((Serializer) getInjector().getInstance(ISerializer.class))
				.serializeToRegions(EcoreUtil.getRootContainer(obj));
	}

	protected StringBuffer getAllText(final ITextRegionAccess rootRegion) {
		return new StringBuffer(rootRegion.regionForDocument().getText());
	}

	protected String resolveRegion(final ITextRegionAccess rootRegion, final TextRegion region) {
		return rootRegion.regionForDocument().getText().substring(region.getOffset(),
				region.getOffset() + region.getLength());
	}
	
	protected Multimap<AbstractElement, AbstractElement> createConstantParentMap(final AbstractElement grammarElement) {
		final Grammar grammar = GrammarUtil.getGrammar(grammarElement);
		
		final Group constantRule = (Group) GrammarUtil.findRuleForName(grammar, "Constant").getAlternatives();
		final Assignment constantName = (Assignment) constantRule.getElements().get(0);
		final Assignment constantValue = (Assignment) constantRule.getElements().get(1);
		
		final Alternatives valueRule = (Alternatives) GrammarUtil.findRuleForName(grammar, "Value").getAlternatives();
		final AbstractElement valueConstantRef = valueRule.getElements().get(0);
		final AbstractElement valueIntLiteral = valueRule.getElements().get(1);
		
		final Assignment constantRefRule = (Assignment) GrammarUtil.findRuleForName(grammar, "ConstantRef")
				.getAlternatives();
		final CrossReference constantRefConstant = (CrossReference) constantRefRule.getTerminal();
		
		final Assignment intLiteralRule = (Assignment) GrammarUtil.findRuleForName(grammar, "IntLiteral")
				.getAlternatives();
		
		final AbstractElement idRule = GrammarUtil.findRuleForName(grammar, "ID").getAlternatives();
		
		final AbstractElement intRule = GrammarUtil.findRuleForName(grammar, "INT").getAlternatives();
		
		// same as in TestCollectContainedGrammarElementsDeep.deep()
		final Multimap<AbstractElement, AbstractElement> map = ImmutableMultimap
				.<AbstractElement, AbstractElement> builder()
				.put(grammarElement, grammarElement)
				.put(constantRule, grammarElement)
				.put(constantName, constantRule)
				.put(constantName.getTerminal(), constantName)
				.put(idRule, constantName.getTerminal())
				.put(constantValue, constantRule)
				.put(constantValue.getTerminal(), constantValue)
				.put(valueRule, constantValue.getTerminal())
				.put(valueConstantRef, valueRule)
				.put(constantRefRule, valueConstantRef)
				.put(constantRefConstant, constantRefRule)
				.put(constantRefConstant.getTerminal(), constantRefConstant)
				.put(idRule, constantRefConstant.getTerminal())
				.put(valueIntLiteral, valueRule)
				.put(intLiteralRule, valueIntLiteral)
				.put(intLiteralRule.getTerminal(), intLiteralRule)
				.put(intRule, intLiteralRule.getTerminal())
				.build();
		
		return map;
	}
}
