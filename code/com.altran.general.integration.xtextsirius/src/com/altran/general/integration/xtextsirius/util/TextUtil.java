package com.altran.general.integration.xtextsirius.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.TextRegion;

public class TextUtil {
	public static @NonNull StringBuffer removeNewlinesIfSingleLine(
			final @NonNull StringBuffer text,
			final int offset,
			final int length,
			final boolean multiLine) {
		if (!multiLine) {
			for (int i = offset; i < offset + length; i++) {
				final char currentChar = text.charAt(i);
				if (currentChar == '\n' || currentChar == '\r') {
					text.setCharAt(i, ' ');
				}
			}
		}

		return text;
	}

	public static TextRegion calculateAndAdjustEditorOffset(final @NonNull INode node, final @NonNull StringBuffer text,
			final boolean multiLine) {
		text.append(node.getRootNode().getText());

		int offset = node.getOffset();
		final int length = node.getLength();

		// we need to add a newline before node, because StyledTextEditor can
		// only edit regions starting at column 0
		final String newline = "\n";
		text.insert(offset, newline);
		// this should account for different line endings
		offset += newline.length();

		removeNewlinesIfSingleLine(text, offset, length, multiLine);

		return new TextRegion(offset, length);
	}
	
	
}
