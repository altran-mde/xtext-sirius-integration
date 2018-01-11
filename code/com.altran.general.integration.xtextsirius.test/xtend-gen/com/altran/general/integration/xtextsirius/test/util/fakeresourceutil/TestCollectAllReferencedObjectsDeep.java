package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.emf.common.util.EList;
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
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    Stream<EObject> _collectAllReferencedObjectsDeep = _accessibleFakeResourceUtil.collectAllReferencedObjectsDeep(event);
    Collector<EObject, ?, List<EObject>> _list = Collectors.<EObject>toList();
    final List<EObject> objects = _collectAllReferencedObjectsDeep.collect(_list);
    int _size = objects.size();
    Assert.assertEquals(0, _size);
  }
  
  @Test
  public void simple() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(2);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    Stream<EObject> _collectAllReferencedObjectsDeep = _accessibleFakeResourceUtil.collectAllReferencedObjectsDeep(event);
    Collector<EObject, ?, List<EObject>> _list = Collectors.<EObject>toList();
    final List<EObject> objects = _collectAllReferencedObjectsDeep.collect(_list);
    int _size = objects.size();
    Assert.assertEquals(1, _size);
    EObject _head = IterableExtensions.<EObject>head(objects);
    String _name = ((Constant) _head).getName();
    Assert.assertEquals("constant1", _name);
  }
  
  @Test
  public void deep() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(4);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    Stream<EObject> _collectAllReferencedObjectsDeep = _accessibleFakeResourceUtil.collectAllReferencedObjectsDeep(event);
    Collector<EObject, ?, List<EObject>> _list = Collectors.<EObject>toList();
    final List<EObject> objects = _collectAllReferencedObjectsDeep.collect(_list);
    String _string = objects.toString();
    int _size = objects.size();
    Assert.assertEquals(_string, 2, _size);
    EObject _findFirstByName = this.<EObject>findFirstByName(objects, "constant2");
    Assert.assertNotNull(_findFirstByName);
    EObject _findFirstByName_1 = this.<EObject>findFirstByName(objects, "constant3X");
    Assert.assertNotNull(_findFirstByName_1);
  }
}
