package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

@SuppressWarnings({ "restriction" })
public abstract class AModelRegionEditorPreparer extends AFowlerdslDefaultModelTest {
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
