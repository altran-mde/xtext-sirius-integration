package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.google.common.collect.Iterables;

@SuppressWarnings("all")
public class TestCollectGrammarElementsBeforeAndAfter extends ARequiredGrammarTerminalsPresentEnsurer {
	@Test
	public void emptyGroup() {
		final AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = getFakeEnsurer();
		final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (
				final AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
			it.setContainedElement(XtextFactory.eINSTANCE.createAbstractElement());
			it.setContainingGroup(XtextFactory.eINSTANCE.createGroup());
		};
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions
				.<AccessibleRequiredGrammarTerminalsPresentEnsurer> operator_doubleArrow(_fakeEnsurer, _function);
		ensurer.collectBeforeAndAfter();
		Assert.assertTrue(ensurer.getElementsBefore().isEmpty());
		Assert.assertTrue(ensurer.getElementsAfter().isEmpty());
	}
	
	@Test
	public void eventName() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final ITextRegionAccess rootRegion = getRootRegion(event);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		final ISemanticRegion featureRegion = eventRegion.getAllRegionsFor()
				.feature(AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name());
		final EObject _grammarElement = featureRegion.getGrammarElement();
		final AbstractElement grElement = ((AbstractElement) _grammarElement);
		final Group group = GrammarUtil.containingGroup(grElement);
		final AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = getFakeEnsurer();
		final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (
				final AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
			it.setContainedElement(grElement);
			it.setContainingGroup(group);
		};
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions
				.<AccessibleRequiredGrammarTerminalsPresentEnsurer> operator_doubleArrow(_fakeEnsurer, _function);
		ensurer.collectBeforeAndAfter();
		Assert.assertTrue(ensurer.getElementsBefore().isEmpty());
		Assert.assertEquals(ensurer.getElementsAfter().toString(), 2, ensurer.getElementsAfter().size());
		final AbstractElement _head = IterableExtensions.<AbstractElement> head(ensurer.getElementsAfter());
		Assert.assertTrue((_head instanceof Assignment));
		final AbstractElement _head_1 = IterableExtensions.<AbstractElement> head(ensurer.getElementsAfter());
		final Assignment elementAfter1 = ((Assignment) _head_1);
		Assert.assertEquals("code", elementAfter1.getFeature());
		final AbstractElement _last = IterableExtensions.<AbstractElement> last(ensurer.getElementsAfter());
		Assert.assertTrue((_last instanceof Group));
		final AbstractElement _last_1 = IterableExtensions.<AbstractElement> last(ensurer.getElementsAfter());
		final Group elementAfter2 = ((Group) _last_1);
		Assert.assertEquals("guard",
				IterableExtensions
						.<Assignment> head(Iterables.<Assignment> filter(elementAfter2.getElements(), Assignment.class))
						.getFeature());
	}
	
	@Test
	public void eventCode() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final ITextRegionAccess rootRegion = getRootRegion(event);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		final ISemanticRegion featureRegion = eventRegion.getAllRegionsFor()
				.feature(AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Code());
		final EObject _grammarElement = featureRegion.getGrammarElement();
		final AbstractElement grElement = ((AbstractElement) _grammarElement);
		final Group group = GrammarUtil.containingGroup(grElement);
		final AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = getFakeEnsurer();
		final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (
				final AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
			it.setContainedElement(grElement);
			it.setContainingGroup(group);
		};
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions
				.<AccessibleRequiredGrammarTerminalsPresentEnsurer> operator_doubleArrow(_fakeEnsurer, _function);
		ensurer.collectBeforeAndAfter();
		Assert.assertEquals(ensurer.getElementsBefore().toString(), 1, ensurer.getElementsBefore().size());
		final AbstractElement _head = IterableExtensions.<AbstractElement> head(ensurer.getElementsBefore());
		Assert.assertTrue((_head instanceof Assignment));
		final AbstractElement _head_1 = IterableExtensions.<AbstractElement> head(ensurer.getElementsBefore());
		final Assignment elementBefore = ((Assignment) _head_1);
		Assert.assertEquals("name", elementBefore.getFeature());
		Assert.assertEquals(ensurer.getElementsAfter().toString(), 1, ensurer.getElementsAfter().size());
		final AbstractElement _head_2 = IterableExtensions.<AbstractElement> head(ensurer.getElementsAfter());
		Assert.assertTrue(ensurer.getElementsAfter().toString(), (_head_2 instanceof Group));
		final AbstractElement _head_3 = IterableExtensions.<AbstractElement> head(ensurer.getElementsAfter());
		final Group elementAfter = ((Group) _head_3);
		Assert.assertEquals("guard",
				IterableExtensions
						.<Assignment> head(Iterables.<Assignment> filter(elementAfter.getElements(), Assignment.class))
						.getFeature());
	}
	
	@Test
	public void eventGuard() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final ITextRegionAccess rootRegion = getRootRegion(event);
		final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
		final ISemanticRegion featureRegion = eventRegion.getAllRegionsFor()
				.feature(AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Code())
				.getNextSemanticRegion();
		final EObject _grammarElement = featureRegion.getGrammarElement();
		final Group grElement = GrammarUtil
				.containingGroup(GrammarUtil.containingGroup(((AbstractElement) _grammarElement)));
		final EObject _eContainer = grElement.eContainer();
		final Group group = ((Group) _eContainer);
		final AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = getFakeEnsurer();
		final Procedure1<AccessibleRequiredGrammarTerminalsPresentEnsurer> _function = (
				final AccessibleRequiredGrammarTerminalsPresentEnsurer it) -> {
			it.setContainedElement(grElement);
			it.setContainingGroup(group);
		};
		final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = ObjectExtensions
				.<AccessibleRequiredGrammarTerminalsPresentEnsurer> operator_doubleArrow(_fakeEnsurer, _function);
		ensurer.collectBeforeAndAfter();
		Assert.assertEquals(ensurer.getElementsBefore().toString(), 2, ensurer.getElementsBefore().size());
		final AbstractElement _head = IterableExtensions.<AbstractElement> head(ensurer.getElementsBefore());
		Assert.assertTrue((_head instanceof Assignment));
		final AbstractElement _head_1 = IterableExtensions.<AbstractElement> head(ensurer.getElementsBefore());
		final Assignment elementBefore1 = ((Assignment) _head_1);
		Assert.assertEquals("name", elementBefore1.getFeature());
		final AbstractElement _last = IterableExtensions.<AbstractElement> last(ensurer.getElementsBefore());
		Assert.assertTrue((_last instanceof Assignment));
		final AbstractElement _last_1 = IterableExtensions.<AbstractElement> last(ensurer.getElementsBefore());
		final Assignment elementBefore2 = ((Assignment) _last_1);
		Assert.assertEquals("code", elementBefore2.getFeature());
		Assert.assertTrue(ensurer.getElementsAfter().isEmpty());
	}
}
