package com.altran.general.integration.xtextsirius.editpart.internal.model;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.editpart.internal.fix.XtextStyledTextCellEditorExFix;
import com.altran.general.integration.xtextsirius.util.TextUtil;
import com.google.inject.Injector;

public class XtextSiriusStyledTextCellEditorModel extends XtextStyledTextCellEditorExFix {
	
	private @Nullable EObject semanticElement;
	
	public XtextSiriusStyledTextCellEditorModel(final int style, final Injector injector) {
		super(style, injector);
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
		final TextRegion textRegion = TextUtil.calculateAndAdjustEditorOffset(node, text, false);
		super.doSetValue(text.toString());

		final char[] chars = new char[textRegion.getLength()];
		text.getChars(textRegion.getOffset(), textRegion.getOffset() + textRegion.getLength(), chars, 0);

		System.err.println("text:>>>\n" + text + "\n<<< " + textRegion + "\n" + Arrays.toString(chars));
		getXtextAdapter().resetVisibleRegion();
		getXtextAdapter().setVisibleRegion(textRegion.getOffset(), textRegion.getLength());
	}

	public void setSemanticElement(final @NonNull EObject element) {
		this.semanticElement = element;
	}
	
	protected @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}
}
