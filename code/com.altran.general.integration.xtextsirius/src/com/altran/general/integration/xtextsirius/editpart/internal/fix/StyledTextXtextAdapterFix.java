package com.altran.general.integration.xtextsirius.editpart.internal.fix;

import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.yakindu.base.xtext.utils.jface.viewers.StyledTextXtextAdapter;
import org.yakindu.base.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 *
 * @author andreas.muelder@itemis.de
 * @author alexander.nyssen@itemis.de
 * @author patrick.koenemann@itemis.de
 *
 */
@SuppressWarnings("restriction")
public class StyledTextXtextAdapterFix extends StyledTextXtextAdapter {
	@Inject
	private IPreferenceStoreAccess preferenceStoreAccess;


	private StyledText styledText;


	private SourceViewerDecorationSupport decorationSupport;

	public StyledTextXtextAdapterFix(final Injector injector,
			final IXtextFakeContextResourcesProvider contextFakeResourceProvider) {
		super(injector, contextFakeResourceProvider);
	}

	public StyledTextXtextAdapterFix(final Injector injector) {
		super(injector);
	}
	
	@Override
	public void adapt(final StyledText styledText) {
		this.styledText = styledText;
		super.adapt(styledText);
	}

	@Override
	protected void createXtextSourceViewer() {
		this.sourceviewer = new XtextSourceViewerExFix(this.styledText,
				this.preferenceStoreAccess.getPreferenceStore());
		this.sourceviewer.configure(this.getXtextSourceViewerConfiguration());
		this.sourceviewer.setDocument(this.getXtextDocument(), new AnnotationModel());
		this.decorationSupport = new SourceViewerDecorationSupport(this.sourceviewer, null,
				new DefaultMarkerAnnotationAccess(),
				getSharedColors());
		configureSourceViewerDecorationSupport(this.decorationSupport);
	}

	@Override
	public void dispose() {
		if (this.decorationSupport != null) {
			unconfigureSourceViewerDecorationSupport(this.decorationSupport);
		}
		super.dispose();
	}
	
	/*
	 * Needs to be here to defeat visibility in StyledTextXtextAdapterFix
	 */
	@Override
	protected XtextSourceViewer getXtextSourceviewer() {
		return super.getXtextSourceviewer();
	}
}