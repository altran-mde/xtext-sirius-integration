package com.altran.general.integration.xtextsirius.test;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public abstract class AFowlerdslDefaultModelTest extends AFowlerdslTest {
	@Extension
	protected static StatemachineFactory statemachineFactory = StatemachineFactory.eINSTANCE;
	
	protected Statemachine getDefaultModel() {
		Statemachine _xblockexpression = null;
		{
			final StringConcatenation _builder = new StringConcatenation();
			_builder.append("events");
			_builder.newLine();
			_builder.append("\t");
			_builder.append("event1X 111");
			_builder.newLine();
			_builder.append("\t");
			_builder.append("event2X 222 [123]");
			_builder.newLine();
			_builder.append("\t");
			_builder.append("event3X 333 [constant1X]");
			_builder.newLine();
			_builder.append("\t");
			_builder.append("event4X 444 [constant2X .. 234]");
			_builder.newLine();
			_builder.append("end");
			_builder.newLine();
			_builder.newLine();
			_builder.append("constants");
			_builder.newLine();
			_builder.append("\t");
			_builder.append("constant1X 42");
			_builder.newLine();
			_builder.append("\t");
			_builder.append("constant2X 23");
			_builder.newLine();
			_builder.append("\t");
			_builder.append("constant3X constant1X");
			_builder.newLine();
			_builder.append("end");
			_builder.newLine();
			this.parseIntoResource(_builder.toString(), "/proj/other.statemachine");
			final StringConcatenation _builder_1 = new StringConcatenation();
			_builder_1.newLine();
			_builder_1.append("\t\t");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("     ");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("events");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("event1 111");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("event2 222 [123]");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("event3");
			_builder_1.newLine();
			_builder_1.append("333\t \t[");
			_builder_1.newLine();
			_builder_1.append("constant1\t\t\t]    ");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("event4 444 [constant2X]");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("event5 555 [constant3X .. constant2]");
			_builder_1.newLine();
			_builder_1.append("end");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("commands");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("command1 123");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("[123] command2 234");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("[constant2X..constant1] command3 345");
			_builder_1.newLine();
			_builder_1.append("end");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("constants");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("constant1 42");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("constant2 constant1");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("constant3 constant1X");
			_builder_1.newLine();
			_builder_1.append("end");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("state State1");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("event1 => State2");
			_builder_1.newLine();
			_builder_1.append("end");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("state State2");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("description \"asdf\"");
			_builder_1.newLine();
			_builder_1.append("end");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("state State3");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("event2 => State32");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("event3 => State33");
			_builder_1.newLine();
			_builder_1.append("\t");
			_builder_1.append("event5 => State35");
			_builder_1.newLine();
			_builder_1.append("end");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("state State32");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("end");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("state State33");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("end");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("state State35");
			_builder_1.newLine();
			_builder_1.newLine();
			_builder_1.append("end");
			_builder_1.newLine();
			_xblockexpression = this.parseIntoResource(_builder_1.toString());
		}
		return _xblockexpression;
	}
	
	protected <T extends EObject> T findFirstByName(final Collection<T> collection, final String name) {
		final Function1<T, Boolean> _function = (final T it) -> {
			final Object _eGet = it.eGet(it.eClass().getEStructuralFeature("name"));
			return Boolean.valueOf(Objects.equal(_eGet, name));
		};
		return IterableExtensions.<T> findFirst(collection, _function);
	}
}
