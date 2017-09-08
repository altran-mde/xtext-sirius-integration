package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.google.common.base.Objects;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
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
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFindRegionsOfContainedElements extends AModelRegionEditorPreparer {
  @Test
  public void emptyElements() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final RuleCall eventRuleCall = ((RuleCall) _grammarElement);
    final Multimap<AbstractElement, AbstractElement> map = preparer.collectContainedGrammarElementsDeep(eventRuleCall, eventRuleCall, LinkedHashMultimap.<AbstractElement, AbstractElement>create());
    final Set<ISemanticRegion> regions = preparer.findRegionsOfContainedElements(eventRegion, CollectionLiterals.<AbstractElement>emptyList(), map);
    Assert.assertTrue(regions.isEmpty());
  }
  
  @Test
  public void complexPath() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(4);
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    EObject _grammarElement = eventRegion.getGrammarElement();
    final RuleCall eventRuleCall = ((RuleCall) _grammarElement);
    AbstractElement _alternatives = eventRuleCall.getRule().getAlternatives();
    final Group eventGroup = ((Group) _alternatives);
    AbstractElement _get = eventGroup.getElements().get(0);
    final Assignment eventName = ((Assignment) _get);
    AbstractElement _get_1 = eventGroup.getElements().get(2);
    final Group guardGroup = ((Group) _get_1);
    AbstractElement _get_2 = guardGroup.getElements().get(1);
    final Assignment guardAssignment = ((Assignment) _get_2);
    final Multimap<AbstractElement, AbstractElement> map = preparer.collectContainedGrammarElementsDeep(eventRuleCall, eventRuleCall, LinkedHashMultimap.<AbstractElement, AbstractElement>create());
    final Set<ISemanticRegion> regions = preparer.findRegionsOfContainedElements(eventRegion, Collections.<AbstractElement>unmodifiableList(CollectionLiterals.<AbstractElement>newArrayList(eventName, guardAssignment)), map);
    Assert.assertEquals(4, regions.size());
    final Function1<ISemanticRegion, Boolean> _function = (ISemanticRegion it) -> {
      String _text = it.getText();
      return Boolean.valueOf(Objects.equal(_text, "event5"));
    };
    Assert.assertNotNull(IterableExtensions.<ISemanticRegion>findFirst(regions, _function));
    final Function1<ISemanticRegion, Boolean> _function_1 = (ISemanticRegion it) -> {
      String _text = it.getText();
      return Boolean.valueOf(Objects.equal(_text, "constant3X"));
    };
    Assert.assertNotNull(IterableExtensions.<ISemanticRegion>findFirst(regions, _function_1));
    final Function1<ISemanticRegion, Boolean> _function_2 = (ISemanticRegion it) -> {
      String _text = it.getText();
      return Boolean.valueOf(Objects.equal(_text, ".."));
    };
    Assert.assertNotNull(IterableExtensions.<ISemanticRegion>findFirst(regions, _function_2));
    final Function1<ISemanticRegion, Boolean> _function_3 = (ISemanticRegion it) -> {
      String _text = it.getText();
      return Boolean.valueOf(Objects.equal(_text, "constant2"));
    };
    Assert.assertNotNull(IterableExtensions.<ISemanticRegion>findFirst(regions, _function_3));
  }
}
