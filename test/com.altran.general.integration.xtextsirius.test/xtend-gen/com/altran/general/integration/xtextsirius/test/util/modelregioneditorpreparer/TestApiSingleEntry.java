package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.util.ModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.Set;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Command;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestApiSingleEntry extends AModelRegionEditorPreparer {
  @Test
  public void eventOnlyName() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, _emptySet);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 6);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 1");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, _emptySet);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 1");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0 1", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 8);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameCodeGuard() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 1 [1..pi]");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("constants");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("pi 314");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, _emptySet);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 1 [1..pi]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("constants");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("pi 314");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0 1 [1..pi]", 
      _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 16);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventOnlyName_name() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 6);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameCode_name() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 123");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 123");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 6);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameCode_nameCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 123");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "code")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 123");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0 123", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 10);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameGuard_nameCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 [1..2]");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "code")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 [1..2]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 6);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameGuard_nameGuard() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 [1..2]");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "guard")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 [1..2]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0 [1..2]", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 13);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameCodeGuard_nameGuard() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 123 [1..2]");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "guard")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 123 [1..2]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0 123 [1..2]", 
      _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 17);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventName_nameCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "code")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 6);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventName_nameCodeGuard() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "code", "guard")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 6);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventName_guard() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("guard")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("event0[");
    _builder_1.newLine();
    _builder_1.append("]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(18, 0);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void guard_self() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(null, event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("guard")), _event_Guard);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("event0[");
    _builder_1.newLine();
    _builder_1.append("]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(18, 0);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertNull(preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameCode_singleLine() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("1");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, false, _emptySet);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0  \t  \t  \t1");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0  \t  \t  \t1", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 16);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameGuard_nameGuard_singleLine() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 \t\t[");
    _builder.newLine();
    _builder.append("1\t\t  \t\t..");
    _builder.newLine();
    _builder.append("2               ]");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "guard")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 \t\t[  1\t\t  \t\t..  2               ]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0 \t\t[  1\t\t  \t\t..  2               ]", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 40);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameCode_multiLine() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("1");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, _emptySet);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("1");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0\r\n\t\r\n\t\r\n\t1", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 16);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void eventNameGuard_nameGuard_multiLine() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 \t\t[");
    _builder.newLine();
    _builder.append("1\t\t  \t\t..");
    _builder.newLine();
    _builder.append("2               ]");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(event, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "guard")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 \t\t[");
    _builder_1.newLine();
    _builder_1.append("1\t\t  \t\t..");
    _builder_1.newLine();
    _builder_1.append("2               ]");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0 \t\t[\r\n1\t\t  \t\t..\r\n2               ]", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(11, 40);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(event, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void transitionOnlyEvent_eventGuard() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state state0");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 => state0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final State state = model.getStates().get(0);
    final Transition transition = state.getTransitions().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(transition, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("event", "guard")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("event0");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("state state0");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 => state0");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(41, 6);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(transition, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void transitionEventGuard_eventGuard() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state state0");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event0 [123] => state0");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final State state = model.getStates().get(0);
    final Transition transition = state.getTransitions().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(transition, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("event", "guard")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("events");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("event0");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("state state0");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("event0 [123] => state0");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("event0 [123]", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(41, 12);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(transition, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void commandNameCode_nameCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("commands");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("cmd1 123");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Command cmd = model.getCommands().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(cmd, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("code", "name")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("commands");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("cmd1 123");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("cmd1 123", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(13, 8);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(cmd, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void commandGuardNameCode_nameCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("commands");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[123]cmd1 123");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Command cmd = model.getCommands().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(cmd, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("code", "name")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("commands");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("[123]");
    _builder_1.newLine();
    _builder_1.append("cmd1 123");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("cmd1 123", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(18, 8);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(cmd, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void commandGuardNameCode_guardName() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("commands");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[123]cmd1 123");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Command cmd = model.getCommands().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(cmd, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("guard", "name")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("commands");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("[123]cmd1 123");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("[123]cmd1", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(13, 9);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(cmd, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
  
  @Test
  public void commandNameCode_guard() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("commands");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("cmd1 123");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    final Command cmd = model.getCommands().get(0);
    Injector _injector = this.getInjector();
    final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(cmd, _injector, true, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("guard")));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("commands");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("[");
    _builder_1.newLine();
    _builder_1.append("]cmd1 123");
    _builder_1.newLine();
    _builder_1.append("end");
    _builder_1.newLine();
    Assert.assertEquals(_builder_1.toString(), preparer.getText());
    final TextRegion textRegion = preparer.getTextRegion();
    String _text = preparer.getText();
    int _offset = textRegion.getOffset();
    int _offset_1 = textRegion.getOffset();
    int _length = textRegion.getLength();
    int _plus = (_offset_1 + _length);
    Assert.assertEquals("", _text.substring(_offset, _plus));
    TextRegion _textRegion = new TextRegion(14, 0);
    Assert.assertEquals(_textRegion, preparer.getTextRegion());
    Assert.assertSame(cmd, preparer.getSemanticElementLocation().resolve(model.eResource()));
  }
}
