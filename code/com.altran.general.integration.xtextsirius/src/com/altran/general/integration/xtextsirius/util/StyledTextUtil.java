package com.altran.general.integration.xtextsirius.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.TextRegion;

public class StyledTextUtil {
	private static final String NEWLINE = "\n";
	
	public static @NonNull StringBuffer removeNewlinesIfSingleLine(
			final @NonNull StringBuffer text,
			final @NonNull TextRegion textRegion,
			final boolean multiLine) {
		return removeNewlinesIfSingleLine(text, textRegion.getOffset(), textRegion.getLength(), multiLine);
	}
	
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

	public static @NonNull TextRegion insertNewline(
			final @NonNull StringBuffer text,
			final @NonNull TextRegion textRegion) {
		return insertNewline(text, textRegion.getOffset(), textRegion.getLength());
	}
	
	public static @NonNull TextRegion insertNewline(
			final @NonNull StringBuffer text,
			final int offset,
			final int length) {
		text.insert(offset, NEWLINE);
		return new TextRegion(offset + NEWLINE.length(), length);
	}

	public static TextRegion calculateAndAdjustEditorOffset(final @NonNull INode node, final @NonNull StringBuffer text,
			final boolean multiLine) {
		text.append(node.getRootNode().getText());
		
		// we need to add a newline before node, because StyledTextEditor can
		// only edit regions starting at column 0
		final TextRegion result = insertNewline(text, node.getOffset(), node.getLength());
		
		removeNewlinesIfSingleLine(text, result, multiLine);
		
		return result;
	}


}
