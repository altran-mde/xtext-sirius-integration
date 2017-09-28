package com.altran.general.integration.xtextsirius.style.ui.internal;

import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.sirius.editor.tools.api.menu.AbstractMenuBuilder;

public class XtextMenuBuilder extends AbstractMenuBuilder {
	public XtextMenuBuilder() {

	}

	@Override
	public String getLabel() {
		return "New Xtext stuff";
	}

	@Override
	public int getPriority() {
		return -42;
	}
	
	@Override
	protected boolean isMine(final CommandParameter object) {
		return true;
	}
}
