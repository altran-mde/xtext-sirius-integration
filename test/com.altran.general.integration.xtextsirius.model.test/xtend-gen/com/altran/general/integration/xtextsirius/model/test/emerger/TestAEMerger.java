package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public abstract class TestAEMerger {
  @Extension
  protected XtextSiriusTestPackage xtextSiriusTestPackage = XtextSiriusTestPackage.eINSTANCE;
  
  @Extension
  protected XtextSiriusTestFactory xtextSiriusTestFactory = XtextSiriusTestFactory.eINSTANCE;
}
