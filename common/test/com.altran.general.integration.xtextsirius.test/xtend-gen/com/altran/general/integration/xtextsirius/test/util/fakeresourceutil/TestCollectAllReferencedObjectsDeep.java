package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCollectAllReferencedObjectsDeep extends ATestFakeResourceUtil {
	@Test
	public void empty() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(0);
		final List<EObject> objects = getAccessibleFakeResourceUtil().collectAllReferencedObjectsDeep(event)
				.collect(Collectors.<EObject> toList());
		Assert.assertEquals(0, objects.size());
	}
	
	@Test
	public void simple() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(2);
		final List<EObject> objects = getAccessibleFakeResourceUtil().collectAllReferencedObjectsDeep(event)
				.collect(Collectors.<EObject> toList());
		Assert.assertEquals(1, objects.size());
		final EObject _head = IterableExtensions.<EObject> head(objects);
		Assert.assertEquals("constant1", ((Constant) _head).getName());
	}
	
	@Test
	public void deep() {
		final Statemachine model = getDefaultModel();
		final Event event = model.getEvents().get(4);
		final List<EObject> objects = getAccessibleFakeResourceUtil().collectAllReferencedObjectsDeep(event)
				.collect(Collectors.<EObject> toList());
		Assert.assertEquals(objects.toString(), 2, objects.size());
		Assert.assertNotNull(this.<EObject> findFirstByName(objects, "constant2"));
		Assert.assertNotNull(this.<EObject> findFirstByName(objects, "constant3X"));
	}
}
