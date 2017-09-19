package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEnsureRequiredGrammarTerminalsPresent extends AModelRegionEditorPreparer {
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
    final Event event = IterableExtensions.<Event>head(model.getEvents());
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    preparer.setRootRegion(rootRegion);
    preparer.setAllText(allText);
    preparer.ensureRequiredGrammarTerminalsPresent(event, AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name());
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
    final Event event = IterableExtensions.<Event>head(model.getEvents());
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    preparer.setRootRegion(rootRegion);
    preparer.setAllText(allText);
    final TextRegion resultRegion = preparer.ensureRequiredGrammarTerminalsPresent(event, AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Code());
    Assert.assertEquals(expectedText, allText.toString());
    Assert.assertEquals(16, resultRegion.getOffset());
    Assert.assertEquals(0, resultRegion.getLength());
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
    final Event event = IterableExtensions.<Event>head(model.getEvents());
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    preparer.setRootRegion(rootRegion);
    preparer.setAllText(allText);
    final TextRegion resultRegion = preparer.ensureRequiredGrammarTerminalsPresent(event, AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Code());
    Assert.assertEquals(expectedText, allText.toString());
    Assert.assertEquals(16, resultRegion.getOffset());
    Assert.assertEquals(0, resultRegion.getLength());
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
    final Event event = IterableExtensions.<Event>head(model.getEvents());
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    preparer.setRootRegion(rootRegion);
    preparer.setAllText(allText);
    final TextRegion resultRegion = preparer.ensureRequiredGrammarTerminalsPresent(event, AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard());
    Assert.assertEquals(expectedText, allText.toString());
    Assert.assertEquals(16, resultRegion.getOffset());
    Assert.assertEquals(0, resultRegion.getLength());
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
    final Event event = IterableExtensions.<Event>head(model.getEvents());
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    final StringBuffer allText = this.getAllText(rootRegion);
    final AccessibleModelRegionEditorPreparer preparer = this.getFakePreparer();
    preparer.setRootRegion(rootRegion);
    preparer.setAllText(allText);
    final TextRegion resultRegion = preparer.ensureRequiredGrammarTerminalsPresent(event, AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard());
    Assert.assertEquals(expectedText, allText.toString());
    Assert.assertEquals(20, resultRegion.getOffset());
    Assert.assertEquals(0, resultRegion.getLength());
  }
}
