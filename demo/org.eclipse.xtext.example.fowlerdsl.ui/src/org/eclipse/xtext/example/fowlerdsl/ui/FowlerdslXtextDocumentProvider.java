package org.eclipse.xtext.example.fowlerdsl.ui;

import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.DocumentTokenSource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class FowlerdslXtextDocumentProvider implements Provider<XtextDocument> {
	
	@Inject
	private ITextEditComposer composer;

	@Inject
	private DocumentTokenSource tokenSource;
	
	@Inject
	private Injector injector;

	@Override
	public XtextDocument get() {
		final XtextDocument result = new XtextDocument(this.tokenSource, this.composer) {
			@Override
			protected XtextDocumentLocker createDocumentLocker() {
				return new XtextDocumentLocker() {
					@Override
					public <T> T modify(final IUnitOfWork<T, XtextResource> work) {
						final TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(getState());
						if (editingDomain != null) {
							final AtomicReference<T> ref = new AtomicReference<>();
							editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
								
								@Override
								protected void doExecute() {
									ref.set(superModify(work));
								}
							});
							return ref.get();
						} else {
							return super.modify(work);
						}
					}

					public <T> T superModify(final IUnitOfWork<T, XtextResource> work) {
						return super.modify(work);
					}
				};
			}
		};

		this.injector.injectMembers(result);
		return result;
	}
	
}
