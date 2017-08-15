package com.altran.general.integration.xtextsirius.editpart.internal;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;

public class EditPartDescriptor {
	private final String semanticType;
	private final boolean singleLine;
	private final IXtextDirectEditConfiguration config;
	
	EditPartDescriptor(final String semanticType, final boolean singleLine,
			final IXtextDirectEditConfiguration config) {
		this.semanticType = semanticType;
		this.singleLine = singleLine;
		this.config = config;
	}
	
	public String getSemanticType() {
		return this.semanticType;
	}
	
	public boolean isSingleLine() {
		return this.singleLine;
	}
	
	public IXtextDirectEditConfiguration getConfig() {
		return this.config;
	}

}
