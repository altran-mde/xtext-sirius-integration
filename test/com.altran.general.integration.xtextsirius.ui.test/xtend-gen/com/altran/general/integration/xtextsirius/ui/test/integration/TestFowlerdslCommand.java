package com.altran.general.integration.xtextsirius.ui.test.integration;

import com.altran.general.integration.xtextsirius.ui.test.integration.ATestFowlerdslCombined;
import java.util.Collections;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Command;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFowlerdslCommand extends ATestFowlerdslCombined {
  @Test
  public void unchanged() {
    Command _createCommand = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function = (Command it) -> {
      it.setName("cmd0");
      it.setCode(23);
    };
    Command _doubleArrow = ObjectExtensions.<Command>operator_doubleArrow(_createCommand, _function);
    Command _createCommand_1 = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function_1 = (Command it) -> {
      it.setName("cmd1");
      it.setCode(42);
    };
    Command _doubleArrow_1 = ObjectExtensions.<Command>operator_doubleArrow(_createCommand_1, _function_1);
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      null, 
      Collections.<Command>unmodifiableList(CollectionLiterals.<Command>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void empty() {
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      "", 
      Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
  }
  
  @Test
  public void changeFirst() {
    Command _createCommand = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function = (Command it) -> {
      it.setName("cmd0");
      it.setCode(22);
    };
    Command _doubleArrow = ObjectExtensions.<Command>operator_doubleArrow(_createCommand, _function);
    Command _createCommand_1 = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function_1 = (Command it) -> {
      it.setName("cmd1");
      it.setCode(42);
    };
    Command _doubleArrow_1 = ObjectExtensions.<Command>operator_doubleArrow(_createCommand_1, _function_1);
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      "cmd0 22 cmd1 42", 
      Collections.<Command>unmodifiableList(CollectionLiterals.<Command>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void changeBoth() {
    Command _createCommand = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function = (Command it) -> {
      it.setName("cmd0");
      it.setCode(22);
    };
    Command _doubleArrow = ObjectExtensions.<Command>operator_doubleArrow(_createCommand, _function);
    Command _createCommand_1 = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function_1 = (Command it) -> {
      it.setName("cmd1");
      it.setCode(43);
    };
    Command _doubleArrow_1 = ObjectExtensions.<Command>operator_doubleArrow(_createCommand_1, _function_1);
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      "cmd0 22 cmd1 43", 
      Collections.<Command>unmodifiableList(CollectionLiterals.<Command>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void removeLast() {
    Command _createCommand = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function = (Command it) -> {
      it.setName("cmd0");
      it.setCode(23);
    };
    Command _doubleArrow = ObjectExtensions.<Command>operator_doubleArrow(_createCommand, _function);
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      "cmd0 23", 
      Collections.<Command>unmodifiableList(CollectionLiterals.<Command>newArrayList(_doubleArrow)));
  }
  
  @Test
  public void removeFirst() {
    Command _createCommand = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function = (Command it) -> {
      it.setName("cmd1");
      it.setCode(42);
    };
    Command _doubleArrow = ObjectExtensions.<Command>operator_doubleArrow(_createCommand, _function);
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      "cmd1 42", 
      Collections.<Command>unmodifiableList(CollectionLiterals.<Command>newArrayList(_doubleArrow)));
  }
  
  @Test
  public void replace() {
    Command _createCommand = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function = (Command it) -> {
      it.setName("cmd2");
      it.setCode(13);
    };
    Command _doubleArrow = ObjectExtensions.<Command>operator_doubleArrow(_createCommand, _function);
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      "cmd2 13", 
      Collections.<Command>unmodifiableList(CollectionLiterals.<Command>newArrayList(_doubleArrow)));
  }
  
  @Test
  public void replaceMove() {
    Command _createCommand = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function = (Command it) -> {
      it.setName("cmd0");
      it.setCode(13);
    };
    Command _doubleArrow = ObjectExtensions.<Command>operator_doubleArrow(_createCommand, _function);
    Command _createCommand_1 = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function_1 = (Command it) -> {
      it.setName("cmd0");
      it.setCode(23);
    };
    Command _doubleArrow_1 = ObjectExtensions.<Command>operator_doubleArrow(_createCommand_1, _function_1);
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      "cmd2 13 cmd0 23", 
      Collections.<Command>unmodifiableList(CollectionLiterals.<Command>newArrayList(_doubleArrow, _doubleArrow_1)));
  }
  
  @Test
  public void insertFirst() {
    Command _createCommand = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function = (Command it) -> {
      it.setName("cmd2");
      it.setCode(13);
    };
    Command _doubleArrow = ObjectExtensions.<Command>operator_doubleArrow(_createCommand, _function);
    Command _createCommand_1 = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function_1 = (Command it) -> {
      it.setName("cmd0");
      it.setCode(23);
    };
    Command _doubleArrow_1 = ObjectExtensions.<Command>operator_doubleArrow(_createCommand_1, _function_1);
    Command _createCommand_2 = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function_2 = (Command it) -> {
      it.setName("cmd1");
      it.setCode(42);
    };
    Command _doubleArrow_2 = ObjectExtensions.<Command>operator_doubleArrow(_createCommand_2, _function_2);
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      "cmd2 13 cmd0 23 cmd1 42", 
      Collections.<Command>unmodifiableList(CollectionLiterals.<Command>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2)));
  }
  
  @Test
  public void insertLast() {
    Command _createCommand = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function = (Command it) -> {
      it.setName("cmd0");
      it.setCode(23);
    };
    Command _doubleArrow = ObjectExtensions.<Command>operator_doubleArrow(_createCommand, _function);
    Command _createCommand_1 = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function_1 = (Command it) -> {
      it.setName("cmd1");
      it.setCode(42);
    };
    Command _doubleArrow_1 = ObjectExtensions.<Command>operator_doubleArrow(_createCommand_1, _function_1);
    Command _createCommand_2 = this.statemachineFactory.createCommand();
    final Procedure1<Command> _function_2 = (Command it) -> {
      it.setName("cmd2");
      it.setCode(13);
    };
    Command _doubleArrow_2 = ObjectExtensions.<Command>operator_doubleArrow(_createCommand_2, _function_2);
    this.assertEdit(
      this.model.getCommands(), 
      this.model, 
      "cmd0 23  cmd1 42", 
      "cmd0 23 cmd1 42 cmd2 13", 
      Collections.<Command>unmodifiableList(CollectionLiterals.<Command>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2)));
  }
  
  @Override
  protected String getFeatureName() {
    return "commands";
  }
}
