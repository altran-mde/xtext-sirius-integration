package com.altran.general.integration.xtextsirius.test;

import com.altran.general.integration.xtextsirius.test.AFowlerdslTest;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestTestInfrastructure extends AFowlerdslTest {
  @Test
  public void sometest() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event1 aaa");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = AFowlerdslTest.parse(_builder.toString());
    Assert.assertEquals("event1", IterableExtensions.<Event>head(model.getEvents()).getName());
  }
}
