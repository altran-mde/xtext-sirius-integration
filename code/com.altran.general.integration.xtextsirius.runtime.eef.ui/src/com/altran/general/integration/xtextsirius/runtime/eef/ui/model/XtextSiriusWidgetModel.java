package com.altran.general.integration.xtextsirius.runtime.eef.ui.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.text.IRegion;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.eef.ui.AXtextSiriusWidget;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.altran.general.integration.xtextsirius.runtime.util.SemanticElementLocation;
import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class XtextSiriusWidgetModel extends AXtextSiriusWidget {
	private SemanticElementLocation semanticElementLocation;
	
	public XtextSiriusWidgetModel(final @NonNull Composite parent, final @NonNull Injector injector,
			final boolean multiLine) {
		super(parent, injector, multiLine);
	}
	
	@SuppressWarnings("restriction")
	public void update(final @NonNull String completeText, final @NonNull SemanticElementLocation newValueLocation,
			final @NonNull TextRegion textRegion) {
		this.semanticElementLocation = newValueLocation;
		
		this.editorAccess.updateModel(completeText, state -> textRegion);
		resetDirty();
	}
	
	@SuppressWarnings("restriction")
	public @Nullable EObject getSemanticElement() {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location != null) {
			final Object result = this.editor.getDocument().readOnly(state -> {
				final IParseResult parseResult = state.getParseResult();
				if (parseResult.hasSyntaxErrors()) {
					final IRegion visibleRegion = this.editor.getViewer().getVisibleRegion();
					final String text = this.editor.getDocument().get(visibleRegion.getOffset(),
							visibleRegion.getLength());
					return new XtextSiriusSyntaxErrorException(text, visibleRegion, Lists.newArrayList(parseResult.getSyntaxErrors()));
				}
				return location.resolve(state);
			});

			if (result instanceof AXtextSiriusIssueException) {
				StatusManager.getManager().handle(((AXtextSiriusIssueException) result).toStatus(), StatusManager.SHOW);
			} else if (result instanceof EObject) {
				return (EObject) result;
			}
		}
		
		return null;
	}
	
	public @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}
}
