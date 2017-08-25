package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.editpart.internal.fix.XtextStyledTextCellEditorExFix;
import com.google.inject.Injector;

public abstract class AXtextSiriusStyledTextCellEditor extends XtextStyledTextCellEditorExFix {
	
	protected final boolean multiLine;

	public AXtextSiriusStyledTextCellEditor(
			final int style,
			final @NonNull Injector injector,
			final boolean multiLine) {
		super(style, injector);
		this.multiLine = multiLine;
	}

	public boolean isMultiLine() {
		return this.multiLine;
	}
	
	public abstract @Nullable Object getValueToCommit();
}
