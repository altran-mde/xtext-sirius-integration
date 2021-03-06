/*
 * generated by Xtext
 */
package org.eclipse.xtext.example.fowlerdsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.example.fowlerdsl.services.StatemachineGrammarAccess;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class InlineEditGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class InlineStatemachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.InlineEdit.InlineStatemachine");
		private final RuleCall cStatemachineParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// We have to have a root element, because Xtext uses the first rule as entry rule.
		//InlineStatemachine Statemachine:
		//	Statemachine;
		@Override public ParserRule getRule() { return rule; }

		//Statemachine
		public RuleCall getStatemachineParserRuleCall() { return cStatemachineParserRuleCall; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.InlineEdit.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cGuardAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cGuardGuardParserRuleCall_0_1_0 = (RuleCall)cGuardAssignment_0_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cEventAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEventEventCrossReference_1_0 = (CrossReference)cEventAssignment_1.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_1_0_1 = (RuleCall)cEventEventCrossReference_1_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cStateStateCrossReference_3_0 = (CrossReference)cStateAssignment_3.eContents().get(0);
		private final RuleCall cStateStateIDTerminalRuleCall_3_0_1 = (RuleCall)cStateStateCrossReference_3_0.eContents().get(1);
		
		////@Override 
		//Transition:
		//	('[' guard=Guard ']')? event=[Event] '=>' state=[State];
		@Override public ParserRule getRule() { return rule; }

		//('[' guard=Guard ']')? event=[Event] '=>' state=[State]
		public Group getGroup() { return cGroup; }

		//('[' guard=Guard ']')?
		public Group getGroup_0() { return cGroup_0; }

		//'['
		public Keyword getLeftSquareBracketKeyword_0_0() { return cLeftSquareBracketKeyword_0_0; }

		//guard=Guard
		public Assignment getGuardAssignment_0_1() { return cGuardAssignment_0_1; }

		//Guard
		public RuleCall getGuardGuardParserRuleCall_0_1_0() { return cGuardGuardParserRuleCall_0_1_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_0_2() { return cRightSquareBracketKeyword_0_2; }

		//event=[Event]
		public Assignment getEventAssignment_1() { return cEventAssignment_1; }

		//[Event]
		public CrossReference getEventEventCrossReference_1_0() { return cEventEventCrossReference_1_0; }

		//ID
		public RuleCall getEventEventIDTerminalRuleCall_1_0_1() { return cEventEventIDTerminalRuleCall_1_0_1; }

		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_2() { return cEqualsSignGreaterThanSignKeyword_2; }

		//state=[State]
		public Assignment getStateAssignment_3() { return cStateAssignment_3; }

		//[State]
		public CrossReference getStateStateCrossReference_3_0() { return cStateStateCrossReference_3_0; }

		//ID
		public RuleCall getStateStateIDTerminalRuleCall_3_0_1() { return cStateStateIDTerminalRuleCall_3_0_1; }
	}

	public class RangeGuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.InlineEdit.RangeGuard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMinAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMinValueParserRuleCall_0_0 = (RuleCall)cMinAssignment_0.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMaxAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMaxValueParserRuleCall_2_0 = (RuleCall)cMaxAssignment_2.eContents().get(0);
		
		//RangeGuard:
		//	min=Value? '..' max=Value?;
		@Override public ParserRule getRule() { return rule; }

		//min=Value? '..' max=Value?
		public Group getGroup() { return cGroup; }

		//min=Value?
		public Assignment getMinAssignment_0() { return cMinAssignment_0; }

		//Value
		public RuleCall getMinValueParserRuleCall_0_0() { return cMinValueParserRuleCall_0_0; }

		//'..'
		public Keyword getFullStopFullStopKeyword_1() { return cFullStopFullStopKeyword_1; }

		//max=Value?
		public Assignment getMaxAssignment_2() { return cMaxAssignment_2; }

		//Value
		public RuleCall getMaxValueParserRuleCall_2_0() { return cMaxValueParserRuleCall_2_0; }
	}
	
	
	private final InlineStatemachineElements pInlineStatemachine;
	private final TransitionElements pTransition;
	private final RangeGuardElements pRangeGuard;
	
	private final Grammar grammar;

	private final StatemachineGrammarAccess gaStatemachine;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public InlineEditGrammarAccess(GrammarProvider grammarProvider,
		StatemachineGrammarAccess gaStatemachine,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaStatemachine = gaStatemachine;
		this.gaTerminals = gaTerminals;
		this.pInlineStatemachine = new InlineStatemachineElements();
		this.pTransition = new TransitionElements();
		this.pRangeGuard = new RangeGuardElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.example.fowlerdsl.InlineEdit".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public StatemachineGrammarAccess getStatemachineGrammarAccess() {
		return gaStatemachine;
	}

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// We have to have a root element, because Xtext uses the first rule as entry rule.
	//InlineStatemachine Statemachine:
	//	Statemachine;
	public InlineStatemachineElements getInlineStatemachineAccess() {
		return pInlineStatemachine;
	}
	
	public ParserRule getInlineStatemachineRule() {
		return getInlineStatemachineAccess().getRule();
	}

	////@Override 
	//Transition:
	//	('[' guard=Guard ']')? event=[Event] '=>' state=[State];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//RangeGuard:
	//	min=Value? '..' max=Value?;
	public RangeGuardElements getRangeGuardAccess() {
		return pRangeGuard;
	}
	
	public ParserRule getRangeGuardRule() {
		return getRangeGuardAccess().getRule();
	}

	//Statemachine:
	//	{Statemachine} ('name' name=ID)? ('events' events+=Event* 'end')? ('resetEvents' resetEvents+=[Event]* 'end')?
	//	('commands' commands+=Command* 'end')? ('constants' constants+=Constant* 'end')? states+=State*;
	public StatemachineGrammarAccess.StatemachineElements getStatemachineAccess() {
		return gaStatemachine.getStatemachineAccess();
	}
	
	public ParserRule getStatemachineRule() {
		return getStatemachineAccess().getRule();
	}

	//Event:
	//	name=ID code=INT? ('[' guard=Guard ']')?;
	public StatemachineGrammarAccess.EventElements getEventAccess() {
		return gaStatemachine.getEventAccess();
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}

	//Guard:
	//	ValueGuard | super::RangeGuard;
	public StatemachineGrammarAccess.GuardElements getGuardAccess() {
		return gaStatemachine.getGuardAccess();
	}
	
	public ParserRule getGuardRule() {
		return getGuardAccess().getRule();
	}

	//ValueGuard:
	//	cond=Value;
	public StatemachineGrammarAccess.ValueGuardElements getValueGuardAccess() {
		return gaStatemachine.getValueGuardAccess();
	}
	
	public ParserRule getValueGuardRule() {
		return getValueGuardAccess().getRule();
	}

	//Value:
	//	ConstantRef | IntLiteral;
	public StatemachineGrammarAccess.ValueElements getValueAccess() {
		return gaStatemachine.getValueAccess();
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//ConstantRef:
	//	constant=[Constant];
	public StatemachineGrammarAccess.ConstantRefElements getConstantRefAccess() {
		return gaStatemachine.getConstantRefAccess();
	}
	
	public ParserRule getConstantRefRule() {
		return getConstantRefAccess().getRule();
	}

	//IntLiteral:
	//	value=INT;
	public StatemachineGrammarAccess.IntLiteralElements getIntLiteralAccess() {
		return gaStatemachine.getIntLiteralAccess();
	}
	
	public ParserRule getIntLiteralRule() {
		return getIntLiteralAccess().getRule();
	}

	//Command:
	//	('[' guard=Guard ']')? name=ID code=INT;
	public StatemachineGrammarAccess.CommandElements getCommandAccess() {
		return gaStatemachine.getCommandAccess();
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}

	//Constant:
	//	name=ID value=Value;
	public StatemachineGrammarAccess.ConstantElements getConstantAccess() {
		return gaStatemachine.getConstantAccess();
	}
	
	public ParserRule getConstantRule() {
		return getConstantAccess().getRule();
	}

	//State:
	//	'state' name=ID ('description' description=STRING)? ('actions' '{' actions+=[Command]+ '}')?
	//	transitions+=super::Transition* ('things' things+=Thing*)? 'end';
	public StatemachineGrammarAccess.StateElements getStateAccess() {
		return gaStatemachine.getStateAccess();
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//Thing:
	//	name=ID guard=Guard;
	public StatemachineGrammarAccess.ThingElements getThingAccess() {
		return gaStatemachine.getThingAccess();
	}
	
	public ParserRule getThingRule() {
		return getThingAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
