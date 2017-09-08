package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
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
public class TestContainsGrammarElementDeep extends AModelRegionEditorPreparer {
  @Test
  public void emptyGrammarList() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(constantRegion.getAllSemanticRegions());
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    final AbstractElement intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").getAlternatives();
    final ImmutableMultimap<AbstractElement, AbstractElement> map = ImmutableMultimap.<AbstractElement, AbstractElement>of(constantValueGrammarElement, constantValueGrammarElement, intGrammarElement, constantValueGrammarElement);
    Assert.assertFalse(preparer.containsGrammarElementDeep(constantValueGrammarElement, CollectionLiterals.<AbstractElement>emptyList(), map));
    Assert.assertFalse(preparer.containsGrammarElementDeep(intGrammarElement, CollectionLiterals.<AbstractElement>emptyList(), map));
  }
  
  @Test
  public void emptyGrammarMapDirect() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(constantRegion.getAllSemanticRegions());
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    final ImmutableMultimap<AbstractElement, AbstractElement> map = ImmutableMultimap.<AbstractElement, AbstractElement>of();
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(IterableExtensions.<ISemanticRegion, AbstractElement>map(constantRegion.getAllSemanticRegions(), _function));
    final boolean result = preparer.containsGrammarElementDeep(constantValueGrammarElement, grammarElements, map);
    Assert.assertTrue(result);
  }
  
  @Test
  public void emptyGrammarMapIndirect() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(constantRegion.getAllSemanticRegions());
    EObject _grammarElement = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement);
    final ImmutableMultimap<AbstractElement, AbstractElement> map = ImmutableMultimap.<AbstractElement, AbstractElement>of();
    final AbstractElement intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").getAlternatives();
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(IterableExtensions.<ISemanticRegion, AbstractElement>map(constantRegion.getAllSemanticRegions(), _function));
    final boolean result = preparer.containsGrammarElementDeep(intGrammarElement, grammarElements, map);
    Assert.assertFalse(result);
  }
  
  @Test
  public void simple() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    EObject _grammarElement = constantRegion.getGrammarElement();
    final AbstractElement constantGrammarElement = ((AbstractElement) _grammarElement);
    final ISemanticRegion constantValueRegion = IterableExtensions.<ISemanticRegion>last(constantRegion.getAllSemanticRegions());
    EObject _grammarElement_1 = constantValueRegion.getGrammarElement();
    final AbstractElement constantValueGrammarElement = ((AbstractElement) _grammarElement_1);
    final AbstractElement intGrammarElement = GrammarUtil.findRuleForName(GrammarUtil.getGrammar(constantValueGrammarElement), "INT").getAlternatives();
    final ImmutableMultimap<AbstractElement, AbstractElement> map = ImmutableMultimap.<AbstractElement, AbstractElement>of(constantValueGrammarElement, constantValueGrammarElement, intGrammarElement, constantValueGrammarElement);
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_2 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_2);
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(IterableExtensions.<ISemanticRegion, AbstractElement>map(constantRegion.getAllSemanticRegions(), _function));
    Assert.assertTrue(preparer.containsGrammarElementDeep(constantValueGrammarElement, grammarElements, map));
    Assert.assertTrue(preparer.containsGrammarElementDeep(intGrammarElement, grammarElements, map));
  }
  
  @Test
  public void deep() {
    final Statemachine model = this.getDefaultModel();
    final Constant constant = IterableExtensions.<Constant>head(model.getConstants());
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    final ITextRegionAccess rootRegion = this.getRootRegion(constant);
    final IEObjectRegion constantRegion = rootRegion.regionForEObject(constant);
    EObject _grammarElement = constantRegion.getGrammarElement();
    final AbstractElement grammarElement = ((AbstractElement) _grammarElement);
    final Grammar grammar = GrammarUtil.getGrammar(grammarElement);
    final AbstractElement intRule = GrammarUtil.findRuleForName(grammar, "INT").getAlternatives();
    final Multimap<AbstractElement, AbstractElement> map = this.createConstantParentMap(grammarElement);
    final Function1<ISemanticRegion, AbstractElement> _function = (ISemanticRegion it) -> {
      EObject _grammarElement_1 = it.getGrammarElement();
      return ((AbstractElement) _grammarElement_1);
    };
    final List<AbstractElement> grammarElements = IterableExtensions.<AbstractElement>toList(IterableExtensions.<ISemanticRegion, AbstractElement>map(constantRegion.getAllSemanticRegions(), _function));
    Assert.assertTrue(preparer.containsGrammarElementDeep(intRule, grammarElements, map));
  }
}
