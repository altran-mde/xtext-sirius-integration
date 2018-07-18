package com.altran.general.integration.xtextsirius.runtime.exception;

import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.nodemodel.INode;

import com.altran.general.integration.xtextsirius.runtime.internal.XtextSiriusRuntimePlugin;

public class XtextSiriusSyntaxErrorException extends XtextSiriusErrorException {
	private static final long serialVersionUID = 7187667853765899743L;

	private final IRegion visibleRegion;
	private final Collection<INode> errorNodes;


	public XtextSiriusSyntaxErrorException(final String editText, final IRegion visibleRegion,
			final Collection<INode> errorNodes) {
		super("Syntax error", editText);
		this.visibleRegion = visibleRegion;
		this.errorNodes = errorNodes;
	}
	
	public Collection<INode> getErrorNodes() {
		return this.errorNodes;
	}
	
	@Override
	public IStatus toStatus() {
		final MultiStatus result = new MultiStatus(XtextSiriusRuntimePlugin.PLUGIN_ID, IStatus.ERROR,
				"Entered text is syntactically incorrect.",
				null);
		
		result.add(new Status(IStatus.INFO, XtextSiriusRuntimePlugin.PLUGIN_ID,
				"Complete entered text:\n\n" + getEditText()));
		
		final String normalizedEditText = StringUtils.replaceEach(getEditText(), new String[] { "\t", "\r\n", "\r" },
				new String[] { " ", " \n", " " });

		for (final INode errorNode : getErrorNodes()) {
			final int totalStart = Math.min(errorNode.getTotalOffset() - this.visibleRegion.getOffset(),
					normalizedEditText.length());
			final String prefix = normalizedEditText.substring(0, totalStart);
			final int lineNum = StringUtils.countMatches(prefix, "\n") + 1;
			final int startOfLine = Math.max(StringUtils.lastIndexOf(prefix, "\n"), 0);
			int endOfLine = StringUtils.indexOf(normalizedEditText, "\n", totalStart);
			if (endOfLine < 0) {
				endOfLine = normalizedEditText.length();
			}
			final int lineOffset = totalStart - startOfLine;
			final String line = normalizedEditText.substring(startOfLine, endOfLine);
			result.add(new Status(IStatus.ERROR, XtextSiriusRuntimePlugin.PLUGIN_ID,
					"\n[line " + lineNum + "] " + errorNode.getSyntaxErrorMessage().getMessage()
							+ "\n" + line + "\n"
							+ StringUtils.repeat("\u2013", lineOffset - 1) + "^"));
		}
		
		return result;
	}
}
