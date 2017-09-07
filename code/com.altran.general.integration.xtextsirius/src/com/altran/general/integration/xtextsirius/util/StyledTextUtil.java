package com.altran.general.integration.xtextsirius.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.util.TextRegion;

public class StyledTextUtil {
	private static final String NEWLINE = "\n";

	private static StyledTextUtil INSTANCE;

	public static StyledTextUtil getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new StyledTextUtil();
		}

		return INSTANCE;
	}

	protected StyledTextUtil() {

	}
	
	public @NonNull StringBuffer removeNewlinesIfSingleLine(
			final @NonNull StringBuffer text,
			final @NonNull TextRegion textRegion,
			final boolean multiLine) {
		return removeNewlinesIfSingleLine(text, textRegion.getOffset(), textRegion.getLength(), multiLine);
	}

	public @NonNull StringBuffer removeNewlinesIfSingleLine(
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
	
	public @NonNull TextRegion insertNewline(
			final @NonNull StringBuffer text,
			final @NonNull TextRegion textRegion) {
		return insertNewline(text, textRegion.getOffset(), textRegion.getLength());
	}

	public @NonNull TextRegion insertNewline(
			final @NonNull StringBuffer text,
			final int offset,
			final int length) {
		text.insert(offset, NEWLINE);
		return new TextRegion(offset + NEWLINE.length(), length);
	}
}
