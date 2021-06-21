/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.eef.ui;

import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.MembersInjector;
import com.google.inject.Module;
import com.google.inject.Provider;

/**
 * Fixes un-modifiable SWT style for single-line editors in
 * {@link org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory.Builder#withParent(Composite)
 * EmbeddedEditorFactory.Builder}.
 *
 * @author nstotz
 *
 */
@SuppressWarnings("restriction")
public class XtextEditorSwtStyleOverridingModule implements Module {
	private final int style;
	
	public XtextEditorSwtStyleOverridingModule(final int style) {
		this.style = style;
	}
	
	@Override
	public void configure(final Binder binder) {
		binder.bind(EmbeddedEditorFactory.Builder.class)
				.toProvider(new Provider<EmbeddedEditorFactory.Builder>() {
					@Inject
					private Injector localInjector;
					
					@Override
					public EmbeddedEditorFactory.Builder get() {
						final EmbeddedEditorFactory.Builder result = new EmbeddedEditorFactory.Builder() {
							@Inject
							private MembersInjector<XtextSourceViewer> membersInjector;
							
							@Override
							public EmbeddedEditor withParent(final Composite parent) {
								this.sourceViewerFactory = new XtextSourceViewer.DefaultFactory() {
									@Override
									public XtextSourceViewer createSourceViewer(final Composite parent,
											final IVerticalRuler ruler,
											final IOverviewRuler overviewRuler,
											final boolean showsAnnotationOverview, final int styles) {
										final XtextSourceViewer result = new XtextSourceViewer(parent, ruler,
												overviewRuler, showsAnnotationOverview,
												// this is the reason for all
												// the effort of this class
												XtextEditorSwtStyleOverridingModule.this.style);
										membersInjector.injectMembers(result);
										return result;
									}
								};
								return super.withParent(parent);
							}
						};
						
						this.localInjector.injectMembers(result);
						
						return result;
					}
				});
	}
}
