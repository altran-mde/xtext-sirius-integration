package com.altran.general.integration.xtextsirius.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Streams {
	public static <T> Stream<T> stream(final Iterator<T> iterator) {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, 0), false);
	}
	
	public static <T> Stream<T> stream(final Iterable<T> iterable) {
		return (iterable instanceof Collection)
				? ((Collection<T>) iterable).stream()
				: StreamSupport.stream(iterable.spliterator(), false);
	}
}
