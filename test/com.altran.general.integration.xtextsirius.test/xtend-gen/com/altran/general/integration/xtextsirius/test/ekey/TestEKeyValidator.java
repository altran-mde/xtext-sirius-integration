package com.altran.general.integration.xtextsirius.test.ekey;

import com.altran.general.integration.xtextsirius.runtime.validator.DuplicateEKeyValidatorFast;
import com.altran.general.integration.xtextsirius.runtime.validator.DuplicateEKeyValidatorNormal;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Container;
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangFactory;
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Group;
import com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.espilce.periksa.testsupport.ATestValidator;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEKeyValidator extends ATestValidator {
  @Extension
  private EKeyLangFactory _eKeyLangFactory = EKeyLangFactory.eINSTANCE;
  
  @Extension
  private EKeyLangPackage _eKeyLangPackage = EKeyLangPackage.eINSTANCE;
  
  @Test
  public void testBuiltInValidator() {
    Group _createGroup = this._eKeyLangFactory.createGroup();
    final Procedure1<Group> _function = (Group it) -> {
      EList<IContainerContent> _leafs = it.getLeafs();
      Leaf _createLeaf = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_1 = (Leaf it_1) -> {
        it_1.setName("A");
      };
      Leaf _doubleArrow = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf, _function_1);
      _leafs.add(_doubleArrow);
      EList<IContainerContent> _leafs_1 = it.getLeafs();
      Leaf _createLeaf_1 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_2 = (Leaf it_1) -> {
        it_1.setName("B");
      };
      Leaf _doubleArrow_1 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_1, _function_2);
      _leafs_1.add(_doubleArrow_1);
      EList<IContainerContent> _leafs_2 = it.getLeafs();
      Leaf _createLeaf_2 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_3 = (Leaf it_1) -> {
        it_1.setName("C");
      };
      Leaf _doubleArrow_2 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_2, _function_3);
      _leafs_2.add(_doubleArrow_2);
      EList<IContainerContent> _leafs_3 = it.getLeafs();
      Leaf _createLeaf_3 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_4 = (Leaf it_1) -> {
        it_1.setName("B");
      };
      Leaf _doubleArrow_3 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_3, _function_4);
      _leafs_3.add(_doubleArrow_3);
      EList<IContainerContent> _leafs_4 = it.getLeafs();
      Leaf _createLeaf_4 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_5 = (Leaf it_1) -> {
        it_1.setName("B");
      };
      Leaf _doubleArrow_4 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_4, _function_5);
      _leafs_4.add(_doubleArrow_4);
    };
    final Group group = ObjectExtensions.<Group>operator_doubleArrow(_createGroup, _function);
    Container _createContainer = this._eKeyLangFactory.createContainer();
    final Procedure1<Container> _function_1 = (Container it) -> {
      EList<IContainerContent> _contents = it.getContents();
      _contents.add(group);
    };
    final Container container = ObjectExtensions.<Container>operator_doubleArrow(_createContainer, _function_1);
    this.validateModel(container);
    this.assertErrorPresent(group, this._eKeyLangPackage.getGroup_Leafs(), null);
    final Consumer<IContainerContent> _function_2 = (IContainerContent it) -> {
      this.assertNoErrors(it);
    };
    group.getLeafs().forEach(_function_2);
  }
  
  @Test
  public void testCustomValidatorFast() {
    Group _createGroup = this._eKeyLangFactory.createGroup();
    final Procedure1<Group> _function = (Group it) -> {
      EList<IContainerContent> _leafs = it.getLeafs();
      Leaf _createLeaf = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_1 = (Leaf it_1) -> {
        it_1.setName("A");
      };
      Leaf _doubleArrow = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf, _function_1);
      _leafs.add(_doubleArrow);
      EList<IContainerContent> _leafs_1 = it.getLeafs();
      Leaf _createLeaf_1 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_2 = (Leaf it_1) -> {
        it_1.setName("B");
      };
      Leaf _doubleArrow_1 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_1, _function_2);
      _leafs_1.add(_doubleArrow_1);
      EList<IContainerContent> _leafs_2 = it.getLeafs();
      Leaf _createLeaf_2 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_3 = (Leaf it_1) -> {
        it_1.setName("C");
      };
      Leaf _doubleArrow_2 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_2, _function_3);
      _leafs_2.add(_doubleArrow_2);
      EList<IContainerContent> _leafs_3 = it.getLeafs();
      Leaf _createLeaf_3 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_4 = (Leaf it_1) -> {
        it_1.setName("B");
      };
      Leaf _doubleArrow_3 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_3, _function_4);
      _leafs_3.add(_doubleArrow_3);
      EList<IContainerContent> _leafs_4 = it.getLeafs();
      Leaf _createLeaf_4 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_5 = (Leaf it_1) -> {
        it_1.setName("B");
      };
      Leaf _doubleArrow_4 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_4, _function_5);
      _leafs_4.add(_doubleArrow_4);
    };
    final Group group = ObjectExtensions.<Group>operator_doubleArrow(_createGroup, _function);
    Container _createContainer = this._eKeyLangFactory.createContainer();
    final Procedure1<Container> _function_1 = (Container it) -> {
      EList<IContainerContent> _contents = it.getContents();
      _contents.add(group);
    };
    final Container container = ObjectExtensions.<Container>operator_doubleArrow(_createContainer, _function_1);
    EKeyLangPackage _eKeyLangPackage = this._eKeyLangFactory.getEKeyLangPackage();
    DuplicateEKeyValidatorFast _duplicateEKeyValidatorFast = new DuplicateEKeyValidatorFast();
    this.eValidatorRegistry.put(_eKeyLangPackage, _duplicateEKeyValidatorFast);
    this.validateModel(container);
    this.assertErrorPresent("Same key [name=\'B\'] as elements in positions 3, 4", group, this._eKeyLangPackage.getGroup_Leafs(), 1);
    this.assertErrorPresent("Same key [name=\'B\'] as elements in positions 1, 4", group, this._eKeyLangPackage.getGroup_Leafs(), 3);
    this.assertErrorPresent("Same key [name=\'B\'] as elements in positions 1, 3", group, this._eKeyLangPackage.getGroup_Leafs(), 4);
  }
  
  @Test
  public void testCustomValidatorNormal() {
    Group _createGroup = this._eKeyLangFactory.createGroup();
    final Procedure1<Group> _function = (Group it) -> {
      EList<IContainerContent> _leafs = it.getLeafs();
      Leaf _createLeaf = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_1 = (Leaf it_1) -> {
        it_1.setName("A");
      };
      Leaf _doubleArrow = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf, _function_1);
      _leafs.add(_doubleArrow);
      EList<IContainerContent> _leafs_1 = it.getLeafs();
      Leaf _createLeaf_1 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_2 = (Leaf it_1) -> {
        it_1.setName("B");
      };
      Leaf _doubleArrow_1 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_1, _function_2);
      _leafs_1.add(_doubleArrow_1);
      EList<IContainerContent> _leafs_2 = it.getLeafs();
      Leaf _createLeaf_2 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_3 = (Leaf it_1) -> {
        it_1.setName("C");
      };
      Leaf _doubleArrow_2 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_2, _function_3);
      _leafs_2.add(_doubleArrow_2);
      EList<IContainerContent> _leafs_3 = it.getLeafs();
      Leaf _createLeaf_3 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_4 = (Leaf it_1) -> {
        it_1.setName("B");
      };
      Leaf _doubleArrow_3 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_3, _function_4);
      _leafs_3.add(_doubleArrow_3);
      EList<IContainerContent> _leafs_4 = it.getLeafs();
      Leaf _createLeaf_4 = this._eKeyLangFactory.createLeaf();
      final Procedure1<Leaf> _function_5 = (Leaf it_1) -> {
        it_1.setName("B");
      };
      Leaf _doubleArrow_4 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_4, _function_5);
      _leafs_4.add(_doubleArrow_4);
    };
    final Group group = ObjectExtensions.<Group>operator_doubleArrow(_createGroup, _function);
    Container _createContainer = this._eKeyLangFactory.createContainer();
    final Procedure1<Container> _function_1 = (Container it) -> {
      EList<IContainerContent> _contents = it.getContents();
      _contents.add(group);
    };
    final Container container = ObjectExtensions.<Container>operator_doubleArrow(_createContainer, _function_1);
    EKeyLangPackage _eKeyLangPackage = this._eKeyLangFactory.getEKeyLangPackage();
    DuplicateEKeyValidatorNormal _duplicateEKeyValidatorNormal = new DuplicateEKeyValidatorNormal();
    this.eValidatorRegistry.put(_eKeyLangPackage, _duplicateEKeyValidatorNormal);
    this.validateModel(container);
    this.assertErrorPresent("Same key [name=\'B\'] as elements in positions 3, 4", group, this._eKeyLangPackage.getGroup_Leafs(), 1);
    this.assertErrorPresent("Same key [name=\'B\'] as elements in positions 1, 4", group, this._eKeyLangPackage.getGroup_Leafs(), 3);
    this.assertErrorPresent("Same key [name=\'B\'] as elements in positions 1, 3", group, this._eKeyLangPackage.getGroup_Leafs(), 4);
  }
}
