package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;

import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;

public interface IXtextSiriusEditorCallback {
	public void callbackSetValue(final Object value);
	
	public void resetVisibleRegion();
	
	public void setVisibleRegion(int start, int length);
	
	public XtextResource getFakeResource();

	public void updateFakeResourceContext();
	
	public void resetDirty();

	public IParseResult getXtextParseResult();

	public XtextSiriusSyntaxErrorException handleSyntaxErrors(IParseResult parseResult);

	public XtextSiriusErrorException handleUnresolvableProxies();
	
	public @Nullable Object getValue();
}
