/*
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.edit.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RefLangEditAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/altran/general/integration/xtextsirius/test/reflang/edit/parser/antlr/internal/InternalRefLangEdit.tokens");
	}
}
