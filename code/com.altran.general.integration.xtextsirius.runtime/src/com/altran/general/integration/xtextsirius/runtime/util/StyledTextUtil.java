package com.altran.general.integration.xtextsirius.runtime.util;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.util.TextRegion;

/**
 * Utilities to prepare a {@link StringBuffer} for partial editing in a
 * StyledTextEditor.
 *
 * <p>
 * Cares for adding or removing appropriate newlines.
 * </p>
 *
 * @author nstotz
 *
 */
public class StyledTextUtil {
	private static final String CARRIAGE_RETURN = "\r";
	private static final String LINE_FEED = "\n";
	private static final String CARRIAGE_RETURN_LINE_FEED = "\r\n";

	private static StyledTextUtil INSTANCE;

	public static StyledTextUtil getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new StyledTextUtil();
		}

		return INSTANCE;
	}

	protected StyledTextUtil() {

	}

	/**
	 * Replaces all newline characters within {@code textRegion} by spaces if
	 * {@code multiLine} is set.
	 *
	 * <p>
	 * The length of {@code text} is not altered.
	 * </p>
	 *
	 * @param text
	 *            Text to replace the newlines in.
	 * @param textRegion
	 *            Region to search for newlines.
	 * @param multiLine
	 *            Only if {@code false} we actually do anything.
	 * @return {@code text} (without length changes) with all newlines within
	 *         {@code textRegion} replaced by spaces.
	 */
	public @NonNull StringBuffer removeNewlinesIfSingleLine(
			final @NonNull StringBuffer text,
			final @NonNull TextRegion textRegion,
			final boolean multiLine) {
		return removeNewlinesIfSingleLine(text, textRegion.getOffset(), textRegion.getLength(), multiLine);
	}

	/**
	 * Replaces all newline characters within positions
	 * {@code [offset..offset+length]} by spaces if {@code multiLine} is set.
	 *
	 * <p>
	 * The length of {@code text} is not altered.
	 * </p>
	 *
	 * @param text
	 *            Text to replace the newlines in.
	 * @param offset
	 *            First position to search for newlines.
	 * @param length
	 *            Length of region to search for newlines.
	 * @param multiLine
	 *            Only if {@code false} we actually do anything.
	 * @return {@code text} (without length changes) with all newlines within
	 *         positions {@code [offset..offset+length]} replaced by spaces.
	 */
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

	/**
	 * Inserts a newline at the given position.
	 *
	 * <p>
	 * The appropriate newline character is determined by
	 * {@link #guessNewline(String)}.
	 * </p>
	 *
	 * @param text
	 *            Text to add the newline to.
	 * @param textRegion
	 *            Position where to add the newline.
	 *
	 * @return A new TextRegion, based on {@code textRegion}, extended to
	 *         include the added newline.
	 */
	public @NonNull TextRegion insertNewline(
			final @NonNull StringBuffer text,
			final @NonNull TextRegion textRegion) {
		return insertNewline(text, textRegion.getOffset(), textRegion.getLength());
	}

	/**
	 * Inserts a newline at the given position.
	 *
	 * <p>
	 * The appropriate newline character is determined by
	 * {@link #guessNewline(String)}.
	 * </p>
	 *
	 * @param text
	 *            Text to add the newline to.
	 * @param offset
	 *            Position offset where to add the newline.
	 * @param length
	 *            Position length where to add the newline.
	 *
	 * @return A new TextRegion, based on {@code offset} and {@code length},
	 *         extended to include the added newline.
	 */
	public @NonNull TextRegion insertNewline(
			final @NonNull StringBuffer text,
			final int offset,
			final int length) {
		final String newline = guessNewline(text.toString());
		text.insert(offset, newline);
		return new TextRegion(offset + newline.length(), length);
	}

	public TextRegion moveByInsertedNewline(
			final @NonNull StringBuffer text,
			final @NonNull TextRegion region) {
		return new TextRegion(region.getOffset() + guessNewline(text.toString()).length(), region.getLength());
	}

	/**
	 * Guesses the newline separator by counting existing separators.
	 *
	 * <p>
	 * We follow this heuristics:
	 * </p>
	 *
	 * <ol>
	 * <li>If there are no separators, return LF.</li>
	 * <li>If there are only separators of one type, return the type.</li>
	 * <li>If there are more or equal LF than CRLF, return LF; otherwise, return
	 * CRLF.</li>
	 * <li>If there are the more CR than CRLF, return CR; otherwise, return CRLF
	 * (because CR is only used by legacy MacOS).</li>
	 * <li>If there are all three types, the result is undefined.</li>
	 *
	 * @param text
	 *            Text to analyze.
	 *
	 * @return One of "\n" (LF), "\r" (CR), or "\r\n" (CRLF).
	 */
	public @NonNull String guessNewline(final @NonNull String text) {
		final int lfCount = StringUtils.countMatches(text, LINE_FEED);
		final int crlfCount = StringUtils.countMatches(text, CARRIAGE_RETURN_LINE_FEED);
		final int crCount = StringUtils.countMatches(text, CARRIAGE_RETURN);

		if (crlfCount == 0) {
			if (crCount > lfCount) {
				return CARRIAGE_RETURN;
			}
			return LINE_FEED;
		}

		if (lfCount >= crCount) {
			if (lfCount == crlfCount) {
				return CARRIAGE_RETURN_LINE_FEED;
			}

			final int lfOnly = lfCount - crlfCount;
			if (lfOnly == crlfCount) {
				return LINE_FEED;
			}

			final double lfRatio = ((double) lfOnly) / crlfCount;
			if (lfRatio >= 1) {
				return LINE_FEED;
			}

			return CARRIAGE_RETURN_LINE_FEED;
		} else {
			if (crCount == crlfCount) {
				return CARRIAGE_RETURN_LINE_FEED;
			}

			final int crOnly = crCount - crlfCount;

			if (crOnly == crlfCount) {
				return CARRIAGE_RETURN_LINE_FEED;
			}
			final double crRatio = ((double) crOnly) / crlfCount;
			if (crRatio > 1) {
				return CARRIAGE_RETURN;
			}

			return CARRIAGE_RETURN_LINE_FEED;
		}
	}
}
