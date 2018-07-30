package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.xtext.resource.XtextResource;
import org.yakindu.base.xtext.utils.gmf.viewers.XtextStyledTextCellEditorEx;
import org.yakindu.base.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.AXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusDescribable;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;

public abstract class AXtextSiriusStyledTextCellEditor extends XtextStyledTextCellEditorEx
		implements IXtextSiriusDescribable {
	private final @NonNull AXtextSiriusDescriptor descriptor;

	private EObject semanticElement;
	private EObject fallbackContainer;

	private long modificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;

	public AXtextSiriusStyledTextCellEditor(
			final @NonNull AXtextSiriusDescriptor descriptor) {
		super(descriptor.translateToStyle(), descriptor.getInjector());
		this.descriptor = descriptor;
	}

	public boolean isMultiLine() {
		return getDescriptor().isMultiLine();
	}

	public abstract @Nullable Object getValueToCommit() throws AXtextSiriusIssueException;

	@Override
	protected XtextSiriusStyledTextXtextAdapter createXtextAdapter() {

		return new XtextSiriusStyledTextXtextAdapter(getInjector(),
				getContextFakeResourceProvider() == null ? IXtextFakeContextResourcesProvider.NULL_CONTEXT_PROVIDER
						: getContextFakeResourceProvider());
	}

	protected IXtextFakeContextResourcesProvider createXtextFakeContextResourcesProvider() {
		return new ResourceSetFakeContextResourcesProvider(this);
	}

	@Override
	public XtextSiriusStyledTextXtextAdapter getXtextAdapter() {
		return (XtextSiriusStyledTextXtextAdapter) super.getXtextAdapter();
	}

	@Override
	protected void doSetValue(final Object value) {
		super.doSetValue(value);
		final EObject element = getSemanticElement();
		final XtextResource fakeResource = getXtextAdapter().getFakeResourceContext().getFakeResource();
		if (element != null) {
			FakeResourceUtil.getInstance().updateFakeResourceUri(fakeResource, element.eResource().getURI());
		} else {
			final EObject fallback = getFallbackContainer();
			FakeResourceUtil.getInstance().updateFakeResourceUri(fakeResource, fallback.eResource().getURI());
		}

		getXtextAdapter().getFakeResourceContext().updateFakeResourceContext(createXtextFakeContextResourcesProvider());

		resetDirty();
	}

	protected void setSemanticElement(final @Nullable EObject element) {
		this.semanticElement = element;
	}

	public @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}

	protected void setFallbackContainer(final @NonNull EObject fallbackContainer) {
		this.fallbackContainer = fallbackContainer;
	}

	protected void resetDirty() {
		this.modificationStamp = retrieveModificationStamp();
	}

	protected long retrieveModificationStamp() {
		return getXtextAdapter().getModificationStamp();
	}

	@Override
	public boolean isDirty() {
		return this.modificationStamp != retrieveModificationStamp();
	}

	protected EObject getFallbackContainer() {
		return this.fallbackContainer;
	}

	@Override
	public @NonNull AXtextSiriusDescriptor getDescriptor() {
		return this.descriptor;
	}
}
