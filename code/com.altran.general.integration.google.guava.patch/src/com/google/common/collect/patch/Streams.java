/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.google.common.collect.patch;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

/**
 * Static utility methods related to {@code Stream} instances.
 *
 * Partial backport from Guava v21
 *
 * @since 21.0
 */
@Beta
@GwtCompatible
public class Streams {
	/**
	 * Returns a sequential {@link Stream} of the remaining contents of
	 * {@code iterator}. Do not use {@code iterator} directly after passing it
	 * to this method.
	 */
	public static <T> Stream<T> stream(final Iterator<T> iterator) {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, 0), false);
	}
	
	/**
	 * Returns a sequential {@link Stream} of the contents of {@code iterable},
	 * delegating to {@link Collection#stream} if possible.
	 */
	public static <T> Stream<T> stream(final Iterable<T> iterable) {
		return (iterable instanceof Collection)
				? ((Collection<T>) iterable).stream()
				: StreamSupport.stream(iterable.spliterator(), false);
	}
}
