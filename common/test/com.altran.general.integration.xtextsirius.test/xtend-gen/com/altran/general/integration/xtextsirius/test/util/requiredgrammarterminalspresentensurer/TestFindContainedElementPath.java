package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;

@SuppressWarnings("all")
public class TestFindContainedElementPath extends ARequiredGrammarTerminalsPresentEnsurer {
	@Test
	public void noPath() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = getFakeEnsurer();
		final ITextRegionAccess rootRegion = getRootRegion(event);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		final EObject _grammarElement = eventRegion.getGrammarElement();
		final AbstractElement baseElement = ((AbstractElement) _grammarElement);
		final List<AbstractElement> path = ensurer.findContainedElementPath(baseElement,
				AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getState_Transitions());
		Assert.assertTrue(path.isEmpty());
	}
	
	@Test
	public void invalidPath() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = getFakeEnsurer();
		final ITextRegionAccess rootRegion = getRootRegion(event);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		final EObject _grammarElement = eventRegion.getGrammarElement();
		final AbstractElement baseElement = ((AbstractElement) _grammarElement);
		final List<AbstractElement> path = ensurer.findContainedElementPath(baseElement,
				AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getConstant_Value());
		Assert.assertTrue(path.isEmpty());
	}
	
	@Test
	public void simplePath() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = getFakeEnsurer();
		final ITextRegionAccess rootRegion = getRootRegion(event);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		final EObject _grammarElement = eventRegion.getGrammarElement();
		final RuleCall baseElement = ((RuleCall) _grammarElement);
		final List<AbstractElement> path = ensurer.findContainedElementPath(baseElement,
				AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name());
		Assert.assertEquals(path.toString(), 3, path.size());
		Assert.assertEquals(baseElement, IterableExtensions.<AbstractElement> head(path));
		final AbstractElement _get = path.get(1);
		Assert.assertTrue((_get instanceof Group));
		final AbstractElement _get_1 = path.get(1);
		final Group middle = ((Group) _get_1);
		Assert.assertEquals(3, middle.getElements().size());
		Assert.assertSame(baseElement.getRule(), middle.eContainer());
		final AbstractElement _last = IterableExtensions.<AbstractElement> last(path);
		Assert.assertTrue((_last instanceof Assignment));
		final AbstractElement _last_1 = IterableExtensions.<AbstractElement> last(path);
		final Assignment last = ((Assignment) _last_1);
		Assert.assertEquals(
				AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name().getName(),
				last.getFeature());
		Assert.assertSame(middle, last.eContainer());
	}
	
	@Test
	public void complexPath() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = getFakeEnsurer();
		final ITextRegionAccess rootRegion = getRootRegion(event);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		final EObject _grammarElement = eventRegion.getGrammarElement();
		final RuleCall baseElement = ((RuleCall) _grammarElement);
		final List<AbstractElement> path = ensurer.findContainedElementPath(baseElement,
				AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard());
		Assert.assertEquals(path.toString(), 4, path.size());
		Assert.assertEquals(baseElement, IterableExtensions.<AbstractElement> head(path));
		final AbstractElement _get = path.get(1);
		Assert.assertTrue((_get instanceof Group));
		final AbstractElement _get_1 = path.get(1);
		final Group second = ((Group) _get_1);
		Assert.assertEquals(3, second.getElements().size());
		Assert.assertSame(baseElement.getRule(), second.eContainer());
		final AbstractElement _get_2 = path.get(2);
		Assert.assertTrue((_get_2 instanceof Group));
		final AbstractElement _get_3 = path.get(2);
		final Group third = ((Group) _get_3);
		Assert.assertEquals(3, third.getElements().size());
		Assert.assertSame(second, third.eContainer());
		final AbstractElement _last = IterableExtensions.<AbstractElement> last(path);
		Assert.assertTrue((_last instanceof Assignment));
		final AbstractElement _last_1 = IterableExtensions.<AbstractElement> last(path);
		final Assignment last = ((Assignment) _last_1);
		Assert.assertEquals(
				AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard().getName(),
				last.getFeature());
		Assert.assertSame(third, last.eContainer());
	}
}
