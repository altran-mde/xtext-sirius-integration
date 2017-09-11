package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestGetWhitespace extends AModelRegionEditorPreparer {
  @Test
  public void whitespace() {
    final Statemachine model = this.getDefaultModel();
    final ITextRegionAccess rootRegion = this.getRootRegion(model);
    Assert.assertEquals(" ", this.getFakePreparer().getWhitespace(rootRegion.regionForRootEObject().getGrammarElement()));
  }
}
