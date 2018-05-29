package com.altran.general.integration.xtextsirius.test;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestTestInfrastructure extends AFowlerdslDefaultModelTest {
	@Test
	public void parseTest() {
		final StringConcatenation _builder = new StringConcatenation();
		_builder.append("events");
		_builder.newLine();
		_builder.append("\t");
		_builder.append("event1 111");
		_builder.newLine();
		_builder.append("end");
		_builder.newLine();
		final Statemachine model = this.parse(_builder.toString());
		Assert.assertEquals("event1", IterableExtensions.<Event> head(model.getEvents()).getName());
	}
	
	@Test
	public void parseIntoResourceTest() {
		final StringConcatenation _builder = new StringConcatenation();
		_builder.append("events");
		_builder.newLine();
		_builder.append("\t");
		_builder.append("event1 111");
		_builder.newLine();
		_builder.append("end");
		_builder.newLine();
		final Statemachine model = this.parseIntoResource(_builder.toString());
		Assert.assertEquals("event1", IterableExtensions.<Event> head(model.getEvents()).getName());
		Assert.assertNotNull(model.eResource());
		Assert.assertNotNull(model.eResource().getResourceSet());
	}
	
	@Test
	public void findFirstTargetOfTypeTest() {
		final Statemachine model = getDefaultModel();
		final Event event4 = model.getEvents().get(4);
		final Constant constant = AXtextTest.<Constant> findFirstTargetOfType(event4, Constant.class);
		Assert.assertEquals("constant3X", constant.getName());
	}
	
	@Test
	public void defaultModelTest() {
		final Statemachine model = getDefaultModel();
		Assert.assertEquals(5, model.getEvents().size());
		Assert.assertEquals(3, model.getConstants().size());
		final Event event4 = model.getEvents().get(3);
		final Constant constant = AXtextTest.<Constant> findFirstTargetOfType(event4, Constant.class);
		Assert.assertNotEquals(event4.eResource(), constant.eResource());
	}
	
	@Test
	public void fakeModelTest() {
		final Statemachine model = getDefaultModel();
		final Statemachine fakeModel = createFakeModel(model);
		Assert.assertNotEquals(model, fakeModel);
		Assert.assertNotEquals(model.eResource(), fakeModel.eResource());
		Assert.assertNotEquals(model.eResource().getResourceSet(), fakeModel.eResource().getResourceSet());
	}
}
