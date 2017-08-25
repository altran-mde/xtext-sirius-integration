package com.altran.general.integration.xtextsirius.editpart.internal.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.util.TextUtil;
import com.google.inject.Injector;

public class XtextSiriusStyledTextCellEditorModel extends AXtextSiriusStyledTextCellEditor {
	private @Nullable EObject semanticElement;
	private SemanticElementLocation semanticElementLocation;
	
	public XtextSiriusStyledTextCellEditorModel(
			final int style,
			final @NonNull Injector injector,
			final boolean multiLine) {
		super(style, injector, multiLine);
	}
	
	@Override
	protected void doSetValue(final Object value) {
		final EObject element = getSemanticElement();

		if (element == null) {
			return;
		}

		final INode node = NodeModelUtils.getNode(element);
		if (node == null) {
			return;
		}
		
		final StringBuffer text = new StringBuffer(node.getRootNode().getTotalLength());
		final TextRegion textRegion = TextUtil.calculateAndAdjustEditorOffset(node, text, this.isMultiLine());
		super.doSetValue(text.toString());

		this.semanticElementLocation = new SemanticElementLocation(element);
		
		// final char[] chars = new char[textRegion.getLength()];
		// text.getChars(textRegion.getOffset(), textRegion.getOffset() +
		// textRegion.getLength(), chars, 0);
		// System.err.println("text:>>>\n" + text + "\n<<< " + textRegion + "\n"
		// + Arrays.toString(chars));
		
		getXtextAdapter().resetVisibleRegion();
		getXtextAdapter().setVisibleRegion(textRegion.getOffset(), textRegion.getLength());
	}

	public void setSemanticElement(final @NonNull EObject element) {
		this.semanticElement = element;
	}
	
	protected @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}
	
	protected @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}

	@Override
	public @Nullable Object getValueToCommit() {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location != null) {
			final EObject element = location.resolve(getXtextAdapter().getFakeResourceContext().getFakeResource());
			return element;
			// if (element != null) {
			// return EcoreHelper.proxify(element,
			// EcoreUtil.getURI(getSemanticElement()));
			// }
		}
		
		return null;
	}
}
