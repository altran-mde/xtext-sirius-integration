package com.altran.general.integration.xtextsirius.util;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

@SuppressWarnings("restriction")
public class SemanticRegionNavigator {
	private static SemanticRegionNavigator INSTANCE;

	protected SemanticRegionNavigator() {

	}

	public static @NonNull SemanticRegionNavigator getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SemanticRegionNavigator();
		}

		return INSTANCE;
	}

	/**
	 * Finds the region starting closest to the begin of file.
	 */
	public ISemanticRegion selectFirstmostRegion(
			final @NonNull Set<@NonNull ISemanticRegion> regionsOfContainedElements) {
		final ISemanticRegion max = regionsOfContainedElements.stream()
				.min((a, b) -> Integer.compare(a.getOffset(), b.getOffset()))
				.get();
		return max;
	}
	
	/**
	 * Finds the region ending closest to the end of file.
	 */
	public ISemanticRegion selectLastmostRegion(
			final @NonNull Set<@NonNull ISemanticRegion> regionsOfContainedElements) {
		final ISemanticRegion max = regionsOfContainedElements.stream()
				.max((a, b) -> Integer.compare(a.getEndOffset(), b.getEndOffset()))
				.get();
		return max;
	}


}
