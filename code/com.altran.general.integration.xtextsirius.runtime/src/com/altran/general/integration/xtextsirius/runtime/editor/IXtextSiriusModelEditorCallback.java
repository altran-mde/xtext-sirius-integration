package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.parser.IParseResult;

import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;

public interface IXtextSiriusModelEditorCallback extends IXtextSiriusEditorCallback {
	public @NonNull IParseResult getXtextParseResult();

	public @NonNull XtextSiriusSyntaxErrorException handleSyntaxErrors(final @NonNull IParseResult parseResult);

	public @NonNull XtextSiriusErrorException handleUnresolvableProxies();
}
