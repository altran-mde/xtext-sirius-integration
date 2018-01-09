package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.ARequiredGrammarTerminalsPresentEnsurer;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.AccessibleRequiredGrammarTerminalsPresentEnsurer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestGetWhitespace extends ARequiredGrammarTerminalsPresentEnsurer {
  @Test
  public void whitespace() {
    final Statemachine model = this.getDefaultModel();
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    AccessibleRequiredGrammarTerminalsPresentEnsurer _fakeEnsurer = this.getFakeEnsurer();
    IEObjectRegion _regionForRootEObject = rootRegion.regionForRootEObject();
    EObject _grammarElement = _regionForRootEObject.getGrammarElement();
    String _whitespace = _fakeEnsurer.getWhitespace(_grammarElement);
    Assert.assertEquals(" ", _whitespace);
  }
}
