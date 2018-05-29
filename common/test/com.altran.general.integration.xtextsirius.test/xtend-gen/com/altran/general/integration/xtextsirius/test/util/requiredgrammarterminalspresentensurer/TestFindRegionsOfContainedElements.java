package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

import com.altran.general.integration.xtextsirius.test.util.parentmap.AccessibleParentMap;
import com.google.common.base.Objects;

@SuppressWarnings("all")
public class TestFindRegionsOfContainedElements extends ARequiredGrammarTerminalsPresentEnsurer {
	@Test
	public void emptyElements() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final ITextRegionAccess rootRegion = getRootRegion(event);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		final EObject _grammarElement = eventRegion.getGrammarElement();
		final RuleCall eventRuleCall = ((RuleCall) _grammarElement);
		final AccessibleParentMap map = new AccessibleParentMap(eventRuleCall, eventRuleCall);
		final AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = getFakeEnsurer();
		final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (
				final AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
			it.setParentMap(map);
			it.setElementRegion(eventRegion);
			it.setContainedElementPath(CollectionLiterals.<AbstractElement> emptyList());
		};
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions
				.<AccessibleRequiredGrammarTerminalsPresentEnsurer> operator_doubleArrow(_fakeEnsurer, _function);
		final Set<ISemanticRegion> regions = ensurer.findRegionsOfContainedElements();
		Assert.assertTrue(regions.isEmpty());
	}
	
	@Test
	public void complexPath() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final ITextRegionAccess rootRegion = getRootRegion(event);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		final EObject _grammarElement = eventRegion.getGrammarElement();
		final RuleCall eventRuleCall = ((RuleCall) _grammarElement);
		final AbstractElement _alternatives = eventRuleCall.getRule().getAlternatives();
		final Group eventGroup = ((Group) _alternatives);
		final AbstractElement _get = eventGroup.getElements().get(0);
		final Assignment eventName = ((Assignment) _get);
		final AbstractElement _get_1 = eventGroup.getElements().get(2);
		final Group guardGroup = ((Group) _get_1);
		final AbstractElement _get_2 = guardGroup.getElements().get(1);
		final Assignment guardAssignment = ((Assignment) _get_2);
		final AccessibleParentMap map = new AccessibleParentMap(eventRuleCall, eventRuleCall);
		final AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = getFakeEnsurer();
		final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (
				final AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
			it.setParentMap(map);
			it.setElementRegion(eventRegion);
			it.setContainedElementPath(Collections.<AbstractElement> unmodifiableList(
					CollectionLiterals.<AbstractElement> newArrayList(eventName, guardAssignment)));
		};
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions
				.<AccessibleRequiredGrammarTerminalsPresentEnsurer> operator_doubleArrow(_fakeEnsurer, _function);
		final Set<ISemanticRegion> regions = ensurer.findRegionsOfContainedElements();
		Assert.assertEquals(4, regions.size());
		final Function1<ISemanticRegion, Boolean> _function_1 = (final ISemanticRegion it) -> {
			final String _text = it.getText();
			return Boolean.valueOf(Objects.equal(_text, "event5"));
		};
		Assert.assertNotNull(IterableExtensions.<ISemanticRegion> findFirst(regions, _function_1));
		final Function1<ISemanticRegion, Boolean> _function_2 = (final ISemanticRegion it) -> {
			final String _text = it.getText();
			return Boolean.valueOf(Objects.equal(_text, "constant3X"));
		};
		Assert.assertNotNull(IterableExtensions.<ISemanticRegion> findFirst(regions, _function_2));
		final Function1<ISemanticRegion, Boolean> _function_3 = (final ISemanticRegion it) -> {
			final String _text = it.getText();
			return Boolean.valueOf(Objects.equal(_text, ".."));
		};
		Assert.assertNotNull(IterableExtensions.<ISemanticRegion> findFirst(regions, _function_3));
		final Function1<ISemanticRegion, Boolean> _function_4 = (final ISemanticRegion it) -> {
			final String _text = it.getText();
			return Boolean.valueOf(Objects.equal(_text, "constant2"));
		};
		Assert.assertNotNull(IterableExtensions.<ISemanticRegion> findFirst(regions, _function_4));
	}
}
