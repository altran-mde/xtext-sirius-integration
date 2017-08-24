package com.altran.general.integration.xtextsirius.editpart.internal.fix;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.yakindu.base.xtext.utils.jface.fieldassist.CompletionProposalAdapter;
import org.yakindu.base.xtext.utils.jface.viewers.FilteringMenuManager;
import org.yakindu.base.xtext.utils.jface.viewers.StyledTextXtextAdapter;
import org.yakindu.base.xtext.utils.jface.viewers.XtextStyledTextCellEditor;
import org.yakindu.base.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

import com.google.inject.Injector;

/**
 * This class integrates Xtext features into a {@link CellEditor} and can be
 * used e.g. in jFace {@link StructuredViewer}s or in GMF EditParts via
 * DirectEditManager.
 *
 * The current implementation supports, code completion, syntax highlighting and
 * validation
 *
 * @see XtextStyledTextProvider
 *
 * @author andreas.muelder@itemis.de
 * @author alexander.nyssen@itemis.de
 * @author patrick.koenemann@itemis.de
 */
public class XtextStyledTextCellEditorFix extends XtextStyledTextCellEditor {
	
	private final static String CONTEXTMENUID = "org.yakindu.base.xtext.utils.jface.viewers.StyledTextXtextAdapterContextMenu";
	
	private final Injector injector;

	private StyledTextXtextAdapter xtextAdapter;
	private IXtextFakeContextResourcesProvider contextFakeResourceProvider;
	
	// in gtk, we need this flag to let one focus lost event pass. See
	// focusLost() for details.
	private boolean ignoreNextFocusLost = false;
	private CompletionProposalAdapter completionProposalAdapter;
	
	public XtextStyledTextCellEditorFix(final int style, final Injector injector,
			final IXtextFakeContextResourcesProvider contextFakeResourceProvider) {
		this(style, injector);
		this.contextFakeResourceProvider = contextFakeResourceProvider;
	}
	
	public XtextStyledTextCellEditorFix(final int style, final Injector injector) {
		super(style, injector);
		this.injector = injector;
	}
	
	/**
	 * Creates an {@link SourceViewer} and returns the {@link StyledText} widget
	 * of the viewer as the cell editors control. Some code is copied from
	 * {@link XtextEditor}.
	 */
	@Override
	protected Control createControl(final Composite parent) {
		final StyledText styledText = (StyledText) super.createControl(parent);
		styledText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(final FocusEvent e) {
				XtextStyledTextCellEditorFix.this.focusLost();
			}
		});
		
		// adapt to xtext
		this.xtextAdapter = createXtextAdapter();
		this.getXtextAdapter().adapt(styledText);
		
		// configure content assist
		final IContentAssistant contentAssistant = this.getXtextAdapter().getContentAssistant();
		
		this.completionProposalAdapter = new CompletionProposalAdapter(styledText, contentAssistant,
				KeyStroke.getInstance(
						SWT.CTRL, SWT.SPACE),
				null);
		
		// This listener notifies the modification, when text is selected via
		// proposal. A ModifyEvent is not thrown by the StyledText in this case.
		this.getXtextAdapter().getXtextSourceviewer().addTextListener(new ITextListener() {
			@Override
			public void textChanged(final TextEvent event) {
				editOccured(null);
			}
		});
		
		if ((styledText.getStyle() & SWT.SINGLE) != 0) {
			// The regular key down event is too late (after popup is closed
			// again).
			// when using the StyledText.VerifyKey event (3005), we get the
			// event early enough!
			styledText.addListener(3005, new Listener() {
				@Override
				public void handleEvent(final Event event) {
					if (event.character == SWT.CR
							&& !XtextStyledTextCellEditorFix.this.getCompletionProposalAdapter()
									.isProposalPopupOpen()) {
						focusLost();
					}
				}
			});
		}
		styledText.addListener(3005, new Listener() {
			@Override
			public void handleEvent(final Event event) {
				if (event.character == '\u001b' // ESC
						&& !XtextStyledTextCellEditorFix.this.getCompletionProposalAdapter().isProposalPopupOpen()) {
					XtextStyledTextCellEditorFix.this.fireCancelEditor();
				}
			}
		});
		
		initContextMenu(styledText);
		
		return styledText;
	}
	
	protected StyledTextXtextAdapter createXtextAdapter() {
		return new StyledTextXtextAdapterFix(this.getInjector(),
				this.getContextFakeResourceProvider() == null ? IXtextFakeContextResourcesProvider.NULL_CONTEXT_PROVIDER
						: this.getContextFakeResourceProvider());
	}
	
	@Override
	protected void initContextMenu(final Control control) {
		final MenuManager menuManager = createMenuManager();
		final Menu contextMenu = menuManager.createContextMenu(control);
		control.setMenu(contextMenu);
		final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final IWorkbenchPartSite site = window.getActivePage().getActiveEditor().getSite();
		site.registerContextMenu(CONTEXTMENUID, menuManager, site.getSelectionProvider());
	}
	
	@Override
	protected MenuManager createMenuManager() {
		return new FilteringMenuManager();
	}
	
	@Override
	protected void keyReleaseOccured(final KeyEvent keyEvent) {
		if (keyEvent.character == '\u001b') { // ESC
			return;
		}
		super.keyReleaseOccured(keyEvent);
	}
	
	@Override
	protected void doSetValue(final Object value) {
		super.doSetValue(value);
		// Reset the undo manager to prevent deletion of complete text if the
		// user hits ctrl+z after cell editor opens
		this.getXtextAdapter().getXtextSourceviewer().getUndoManager().reset();
	}
	
	@Override
	public boolean isUndoEnabled() {
		return true;
	}
	
	@Override
	public void performUndo() {
		this.getXtextAdapter().getXtextSourceviewer().getUndoManager().undo();
	}
	
	@Override
	public boolean isRedoEnabled() {
		return true;
	}
	
	@Override
	public void performRedo() {
		this.getXtextAdapter().getXtextSourceviewer().getUndoManager().redo();
	}
	
	@Override
	public boolean isFindEnabled() {
		return true;
	}
	
	/*
	 * In gtk, the focus lost event is fired _after_ the CR event, so we need to
	 * remember the state when the proposal popup window is open.
	 */
	@Override
	protected void focusLost() {
		if (SWT.getPlatform().equals("gtk")) {
			if (this.isIgnoreNextFocusLost()) {
				this.setIgnoreNextFocusLost(false);
				return;
			}
			
			if (this.getCompletionProposalAdapter().isProposalPopupOpen()) {
				this.setIgnoreNextFocusLost(true);
				return;
			}
		}
		
		if (!this.getCompletionProposalAdapter().isProposalPopupOpen()) {
			super.focusLost();
		}
	}
	
	@Override
	public void dispose() {
		this.getXtextAdapter().dispose();
		super.dispose();
	}
	
	/*
	 * This is damn important! If we don't return false here, the
	 * ColumnEditorViewer calls applyEditorValue on FocusLostEvents!
	 */
	@Override
	protected boolean dependsOnExternalFocusListener() {
		return false;
	}
	
	@Override
	public void setVisibleRegion(final int start, final int length) {
		this.getXtextAdapter().setVisibleRegion(start, length);
	}

	@Override
	public StyledTextXtextAdapterFix getXtextAdapter() {
		return (StyledTextXtextAdapterFix) this.xtextAdapter;
	}
	
	protected IXtextFakeContextResourcesProvider getContextFakeResourceProvider() {
		return this.contextFakeResourceProvider;
	}
	
	protected Injector getInjector() {
		return this.injector;
	}
	
	protected CompletionProposalAdapter getCompletionProposalAdapter() {
		return this.completionProposalAdapter;
	}
	
	protected boolean isIgnoreNextFocusLost() {
		return this.ignoreNextFocusLost;
	}
	
	protected void setIgnoreNextFocusLost(final boolean ignoreNextFocusLost) {
		this.ignoreNextFocusLost = ignoreNextFocusLost;
	}
	
}
