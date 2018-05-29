package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestGetWhitespace extends ARequiredGrammarTerminalsPresentEnsurer {
	@Test
	public void whitespace() {
		final Statemachine model = getDefaultModel();
		final ITextRegionAccess rootRegion = getRootRegion(model);
		Assert.assertEquals(" ", getFakeEnsurer().getWhitespace(rootRegion.regionForRootEObject().getGrammarElement()));
	}
}
