/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.exception;

import static java.lang.Math.max;
import static java.lang.Math.min;

import org.apache.commons.lang.StringUtils;

/**
 * One error message inside {@link AXtextSiriusErrorContentException}.
 */
public class ErrorMessage implements Comparable<ErrorMessage> {
	private final String message;
	private final int totalOffset;
	
	public ErrorMessage(final String message, final int totalOffset) {
		super();
		this.message = message;
		this.totalOffset = totalOffset;
	}
	
	public String getCompiledMessage(final String normalizedEditText, final int visibleRegionOffset) {
		final int totalStart = calcTotalStart(normalizedEditText, visibleRegionOffset);
		final String prefix = calcPrefix(normalizedEditText, totalStart);
		final int lineNum = calcLineNum(prefix);
		final int startOfLine = calcStartOfLine(prefix);
		final int endOfLine = calcEndOfLine(normalizedEditText, totalStart);
		final int lineOffset = totalStart - startOfLine;
		final String line = calcLine(normalizedEditText, startOfLine, endOfLine);
		
		final String message = "\n[line " + lineNum + "] " + getMessage() + "\n" + line + "\n"
				+ StringUtils.repeat("\u2013", lineOffset - 1) + "^";
		
		return message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public int getTotalOffset() {
		return this.totalOffset;
	}
	
	@Override
	public int compareTo(final ErrorMessage o) {
		return Integer.compare(getTotalOffset(), o.getTotalOffset());
	}
	
	private String calcLine(final String normalizedEditText, final int startOfLine, final int endOfLine) {
		return normalizedEditText.substring(startOfLine, endOfLine);
	}
	
	private int calcEndOfLine(final String normalizedEditText, final int totalStart) {
		int endOfLine = StringUtils.indexOf(normalizedEditText, "\n", totalStart);
		if (endOfLine < 0) {
			endOfLine = normalizedEditText.length();
		}
		return endOfLine;
	}
	
	private int calcStartOfLine(final String prefix) {
		return max(StringUtils.lastIndexOf(prefix, "\n"), 0);
	}
	
	private int calcLineNum(final String prefix) {
		return StringUtils.countMatches(prefix, "\n") + 1;
	}
	
	private String calcPrefix(final String normalizedEditText, final int totalStart) {
		return normalizedEditText.substring(0, totalStart);
	}
	
	private int calcTotalStart(final String normalizedEditText, final int visibleRegionOffset) {
		return max(min(getTotalOffset() - visibleRegionOffset, normalizedEditText.length()), 0);
	}
	
}
