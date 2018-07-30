package com.altran.general.integration.xtextsirius.runtime.util;

import java.util.EnumSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;

public class MultimapCollectors {
	private static MultimapCollectors INSTANCE;
	
	public static MultimapCollectors getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MultimapCollectors();
		}
		
		return INSTANCE;
	}
	
	protected MultimapCollectors() {
		
	}
	
	public <Tt, Kk> Collector<Tt, ?, Multimap<Kk, Tt>> byKey(
			final Function<? super Tt, ? extends Iterable<? extends Kk>> keysMapper) {
		return new KeyMapperCollector<>(keysMapper);
	}
	
	public <Tt, Kk> Collector<Entry<Kk, Tt>, ?, Multimap<Kk, Tt>> fromEntries() {
		return new EntryCollector<>();
	}
	
	private static class EntryCollector<T, K>
			implements Collector<Entry<K, T>, ImmutableMultimap.Builder<K, T>, Multimap<K, T>> {
		
		@Override
		public Supplier<Builder<K, T>> supplier() {
			return ImmutableMultimap::builder;
		}
		
		@Override
		public BiConsumer<Builder<K, T>, Entry<K, T>> accumulator() {
			return (builder, value) -> builder.put(value);
		}
		
		@Override
		public BinaryOperator<Builder<K, T>> combiner() {
			return (b1, b2) -> b1.putAll(b2.build());
		}
		
		@Override
		public Function<Builder<K, T>, Multimap<K, T>> finisher() {
			return ImmutableMultimap.Builder<K, T>::build;
		}
		
		@Override
		public Set<Characteristics> characteristics() {
			return EnumSet.of(Characteristics.UNORDERED);
		}
	}
	
	private static class KeyMapperCollector<T, K>
			implements Collector<T, ImmutableMultimap.Builder<K, T>, Multimap<K, T>> {
		private final Function<? super T, ? extends Iterable<? extends K>> keyMapper;
		
		
		private KeyMapperCollector(final Function<? super T, ? extends Iterable<? extends K>> keyMapper) {
			this.keyMapper = keyMapper;
		}
		
		@Override
		public Supplier<ImmutableMultimap.Builder<K, T>> supplier() {
			return ImmutableMultimap::builder;
		}
		
		@Override
		public BiConsumer<ImmutableMultimap.Builder<K, T>, T> accumulator() {
			return (builder, value) -> this.keyMapper.apply(value).forEach(k -> builder.put(k, value));
		}
		
		@Override
		public BinaryOperator<ImmutableMultimap.Builder<K, T>> combiner() {
			return (b1, b2) -> b1.putAll(b2.build());
		}
		
		@Override
		public Function<ImmutableMultimap.Builder<K, T>, Multimap<K, T>> finisher() {
			return ImmutableMultimap.Builder<K, T>::build;
		}
		
		@Override
		public Set<Characteristics> characteristics() {
			return EnumSet.of(Characteristics.UNORDERED);
		}
	}
}