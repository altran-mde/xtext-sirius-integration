/*
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RefLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/altran/general/integration/xtextsirius/test/reflang/parser/antlr/internal/InternalRefLang.tokens");
	}
}
