package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.ARequiredGrammarTerminalsPresentEnsurer;
import com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer.AccessibleRequiredGrammarTerminalsPresentEnsurer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEnsureRequiredGrammarTerminalsPresent extends ARequiredGrammarTerminalsPresentEnsurer {
  @Test(expected = IllegalStateException.class)
  public void alreadySet() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event1 111");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final String text = _builder.toString();
    final Statemachine model = this.parseIntoResource(text);
    EList<Event> _events = model.getEvents();
    final Event event = IterableExtensions.<Event>head(_events);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Name = _statemachinePackage.getEvent_Name();
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(event, _event_Name, rootRegion, allText);
    ensurer.ensure();
  }
  
  @Test
  public void noTerminals() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event1");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final String text = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("event1  ");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    final String expectedText = _builder_1.toString();
    final Statemachine model = this.parseIntoResource(text);
    EList<Event> _events = model.getEvents();
    final Event event = IterableExtensions.<Event>head(_events);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Code = _statemachinePackage.getEvent_Code();
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(event, _event_Code, rootRegion, allText);
    final TextRegion resultRegion = ensurer.ensure();
    String _string = allText.toString();
    Assert.assertEquals(expectedText, _string);
    int _offset = resultRegion.getOffset();
    Assert.assertEquals(16, _offset);
    int _length = resultRegion.getLength();
    Assert.assertEquals(0, _length);
  }
  
  @Test
  public void inBetweenNoTerminals() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event1 [123]");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final String text = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("event1   [123]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    final String expectedText = _builder_1.toString();
    final Statemachine model = this.parseIntoResource(text);
    EList<Event> _events = model.getEvents();
    final Event event = IterableExtensions.<Event>head(_events);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EAttribute _event_Code = _statemachinePackage.getEvent_Code();
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(event, _event_Code, rootRegion, allText);
    final TextRegion resultRegion = ensurer.ensure();
    String _string = allText.toString();
    Assert.assertEquals(expectedText, _string);
    int _offset = resultRegion.getOffset();
    Assert.assertEquals(16, _offset);
    int _length = resultRegion.getLength();
    Assert.assertEquals(0, _length);
  }
  
  @Test
  public void addedTerminals() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event1");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final String text = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("event1[]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    final String expectedText = _builder_1.toString();
    final Statemachine model = this.parseIntoResource(text);
    EList<Event> _events = model.getEvents();
    final Event event = IterableExtensions.<Event>head(_events);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _event_Guard = _statemachinePackage.getEvent_Guard();
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(event, _event_Guard, rootRegion, allText);
    final TextRegion resultRegion = ensurer.ensure();
    String _string = allText.toString();
    Assert.assertEquals(expectedText, _string);
    int _offset = resultRegion.getOffset();
    Assert.assertEquals(16, _offset);
    int _length = resultRegion.getLength();
    Assert.assertEquals(0, _length);
  }
  
  @Test
  public void addedTerminalsOptional() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event1 111");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final String text = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("event1 111[]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    final String expectedText = _builder_1.toString();
    final Statemachine model = this.parseIntoResource(text);
    EList<Event> _events = model.getEvents();
    final Event event = IterableExtensions.<Event>head(_events);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _event_Guard = _statemachinePackage.getEvent_Guard();
    final AccessibleRequiredGrammarTerminalsPresentEnsurer ensurer = new AccessibleRequiredGrammarTerminalsPresentEnsurer(event, _event_Guard, rootRegion, allText);
    final TextRegion resultRegion = ensurer.ensure();
    String _string = allText.toString();
    Assert.assertEquals(expectedText, _string);
    int _offset = resultRegion.getOffset();
    Assert.assertEquals(20, _offset);
    int _length = resultRegion.getLength();
    Assert.assertEquals(0, _length);
  }
}
