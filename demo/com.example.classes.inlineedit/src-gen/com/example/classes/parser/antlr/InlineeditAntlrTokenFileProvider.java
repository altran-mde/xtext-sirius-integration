/*
 * generated by Xtext 2.22.0
 */
package com.example.classes.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class InlineeditAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/example/classes/parser/antlr/internal/InternalInlineedit.tokens");
	}
}