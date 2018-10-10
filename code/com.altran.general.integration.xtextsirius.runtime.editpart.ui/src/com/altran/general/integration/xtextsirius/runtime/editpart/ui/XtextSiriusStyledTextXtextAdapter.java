/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.projection.ProjectionDocument;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.yakindu.base.xtext.utils.jface.viewers.StyledTextXtextAdapter;
import org.yakindu.base.xtext.utils.jface.viewers.XtextSourceViewerEx;
import org.yakindu.base.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

import com.google.inject.Injector;

public class XtextSiriusStyledTextXtextAdapter extends StyledTextXtextAdapter {
	public XtextSiriusStyledTextXtextAdapter(final Injector injector,
			final IXtextFakeContextResourcesProvider contextFakeResourceProvider) {
		super(injector, contextFakeResourceProvider);
	}

	@Override
	protected XtextSourceViewer createXtextSourceViewer() {
		final XtextSourceViewer result = new XtextSourceViewerEx(getStyledText(),
				getPreferenceStoreAccess().getPreferenceStore()) {
			/**
			 * Overwritten to handle offset properly.
			 */
			@Override
			protected boolean updateSlaveDocument(final IDocument slaveDocument,
					final int modelRangeOffset, final int modelRangeLength)
							throws BadLocationException {
				if (slaveDocument instanceof ProjectionDocument) {
					final ProjectionDocument projection = (ProjectionDocument) slaveDocument;

					final int offset = modelRangeOffset;
					final int length = modelRangeLength;

					// This "mimicking" does not work for us, so we disable it
					// (XtextSirius)

					// if (!isProjectionMode()) {
					// // mimic original TextViewer behavior
					// final IDocument master = projection.getMasterDocument();
					// final int line =
					// master.getLineOfOffset(modelRangeOffset);
					// offset += master.getLineOffset(line);
					// length = (modelRangeOffset - offset) +
					// modelRangeLength;
					// }

					try {
						// fHandleProjectionChanges= false;
						setPrivateHandleProjectionChangesField(false);
						projection.replaceMasterDocumentRanges(offset, length);
					} finally {
						// fHandleProjectionChanges= true;
						setPrivateHandleProjectionChangesField(true);
					}
					return true;
				}
				return false;
			}
		};
		result.configure(getXtextSourceViewerConfiguration());
		result.setDocument(getXtextDocument(), new AnnotationModel());
		return result;
	}

	public IRegion getVisibleRegion() {
		return getXtextSourceviewer().getVisibleRegion();
	}
	
	public XtextSourceViewer getXtextSourceViewer() {
		return super.getXtextSourceviewer();
	}

	public long getModificationStamp() {
		return getXtextDocument().getModificationStamp();
	}
}
