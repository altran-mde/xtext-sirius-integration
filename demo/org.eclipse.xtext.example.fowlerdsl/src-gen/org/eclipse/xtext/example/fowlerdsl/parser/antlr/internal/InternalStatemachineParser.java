package org.eclipse.xtext.example.fowlerdsl.parser.antlr.internal;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.example.fowlerdsl.services.StatemachineGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

@SuppressWarnings("all")
public class InternalStatemachineParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID",
			"RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'events'",
			"'end'", "'resetEvents'", "'commands'", "'constants'", "'['", "']'", "'..'", "'state'", "'description'",
			"'actions'", "'{'", "'}'", "'=>'" };
	public static final int RULE_STRING = 6;
	public static final int RULE_SL_COMMENT = 8;
	public static final int T__19 = 19;
	public static final int T__15 = 15;
	public static final int T__16 = 16;
	public static final int T__17 = 17;
	public static final int T__18 = 18;
	public static final int T__11 = 11;
	public static final int T__12 = 12;
	public static final int T__13 = 13;
	public static final int T__14 = 14;
	public static final int EOF = -1;
	public static final int RULE_ID = 4;
	public static final int RULE_WS = 9;
	public static final int RULE_ANY_OTHER = 10;
	public static final int RULE_INT = 5;
	public static final int T__22 = 22;
	public static final int RULE_ML_COMMENT = 7;
	public static final int T__23 = 23;
	public static final int T__24 = 24;
	public static final int T__20 = 20;
	public static final int T__21 = 21;

	// delegates
	// delegators


	public InternalStatemachineParser(final TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalStatemachineParser(final TokenStream input, final RecognizerSharedState state) {
		super(input, state);

	}


	@Override
	public String[] getTokenNames() {
		return InternalStatemachineParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "InternalStatemachine.g";
	}



	private StatemachineGrammarAccess grammarAccess;

	public InternalStatemachineParser(final TokenStream input, final StatemachineGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}

	@Override
	protected String getFirstRuleName() {
		return "Statemachine";
	}

	@Override
	protected StatemachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}



	// $ANTLR start "entryRuleStatemachine"
	// InternalStatemachine.g:67:1: entryRuleStatemachine returns [EObject
	// current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
	public final EObject entryRuleStatemachine() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleStatemachine = null;


		try {
			// InternalStatemachine.g:68:2: (iv_ruleStatemachine=
			// ruleStatemachine EOF )
			// InternalStatemachine.g:69:2: iv_ruleStatemachine=
			// ruleStatemachine EOF
			{
				newCompositeNode(this.grammarAccess.getStatemachineRule());
				pushFollow(FOLLOW_1);
				iv_ruleStatemachine = ruleStatemachine();

				this.state._fsp--;

				current = iv_ruleStatemachine;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleStatemachine"


	// $ANTLR start "ruleStatemachine"
	// InternalStatemachine.g:76:1: ruleStatemachine returns [EObject
	// current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent )
	// )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID )
	// )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0=
	// ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' (
	// (lv_connstants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? (
	// (lv_states_13_0= ruleState ) )* ) ;
	public final EObject ruleStatemachine() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		Token otherlv_5 = null;
		Token otherlv_6 = null;
		Token otherlv_7 = null;
		Token otherlv_9 = null;
		Token otherlv_10 = null;
		Token otherlv_12 = null;
		EObject lv_events_2_0 = null;

		EObject lv_commands_8_0 = null;

		EObject lv_connstants_11_0 = null;

		EObject lv_states_13_0 = null;


		enterRule();

		try {
			// InternalStatemachine.g:79:28: ( ( () (otherlv_1= 'events' (
			// (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4=
			// 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )?
			// (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+
			// otherlv_9= 'end' )? (otherlv_10= 'constants' (
			// (lv_connstants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? (
			// (lv_states_13_0= ruleState ) )* ) )
			// InternalStatemachine.g:80:1: ( () (otherlv_1= 'events' (
			// (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4=
			// 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )?
			// (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+
			// otherlv_9= 'end' )? (otherlv_10= 'constants' (
			// (lv_connstants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? (
			// (lv_states_13_0= ruleState ) )* )
			{
				// InternalStatemachine.g:80:1: ( () (otherlv_1= 'events' (
				// (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
				// (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+
				// otherlv_6= 'end' )? (otherlv_7= 'commands' (
				// (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )?
				// (otherlv_10= 'constants' ( (lv_connstants_11_0= ruleConstant
				// ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )* )
				// InternalStatemachine.g:80:2: () (otherlv_1= 'events' (
				// (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
				// (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+
				// otherlv_6= 'end' )? (otherlv_7= 'commands' (
				// (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )?
				// (otherlv_10= 'constants' ( (lv_connstants_11_0= ruleConstant
				// ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )*
				{
					// InternalStatemachine.g:80:2: ()
					// InternalStatemachine.g:81:5:
					{
						
						current = forceCreateModelElement(
								this.grammarAccess.getStatemachineAccess().getStatemachineAction_0(), current);


					}

					// InternalStatemachine.g:86:2: (otherlv_1= 'events' (
					// (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
					int alt2 = 2;
					final int LA2_0 = this.input.LA(1);

					if ((LA2_0 == 11)) {
						alt2 = 1;
					}
					switch (alt2) {
						case 1:
						// InternalStatemachine.g:86:4: otherlv_1= 'events' (
						// (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
						{
							otherlv_1 = (Token) match(this.input, 11, FOLLOW_3);

							newLeafNode(otherlv_1, this.grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());

							// InternalStatemachine.g:90:1: ( (lv_events_2_0=
							// ruleEvent ) )+
							int cnt1 = 0;
							loop1: do {
								int alt1 = 2;
								final int LA1_0 = this.input.LA(1);

								if ((LA1_0 == RULE_ID)) {
									alt1 = 1;
								}


								switch (alt1) {
									case 1:
									// InternalStatemachine.g:91:1:
									// (lv_events_2_0= ruleEvent )
									{
										// InternalStatemachine.g:91:1:
										// (lv_events_2_0= ruleEvent )
										// InternalStatemachine.g:92:3:
										// lv_events_2_0= ruleEvent
										{
											
											newCompositeNode(this.grammarAccess.getStatemachineAccess()
													.getEventsEventParserRuleCall_1_1_0());

											pushFollow(FOLLOW_4);
											lv_events_2_0 = ruleEvent();

											this.state._fsp--;


											if (current == null) {
												current = createModelElementForParent(
														this.grammarAccess.getStatemachineRule());
											}
											add(current, "events", lv_events_2_0,
													"org.eclipse.xtext.example.fowlerdsl.Statemachine.Event");
											afterParserOrEnumRuleCall();


										}


									}
										break;
									
									default:
										if (cnt1 >= 1) {
											break loop1;
										}
										final EarlyExitException eee = new EarlyExitException(1, this.input);
										throw eee;
								}
								cnt1++;
							} while (true);

							otherlv_3 = (Token) match(this.input, 12, FOLLOW_5);

							newLeafNode(otherlv_3, this.grammarAccess.getStatemachineAccess().getEndKeyword_1_2());


						}
							break;
						
					}

					// InternalStatemachine.g:112:3: (otherlv_4= 'resetEvents' (
					// (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )?
					int alt4 = 2;
					final int LA4_0 = this.input.LA(1);

					if ((LA4_0 == 13)) {
						alt4 = 1;
					}
					switch (alt4) {
						case 1:
						// InternalStatemachine.g:112:5: otherlv_4=
						// 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6=
						// 'end'
						{
							otherlv_4 = (Token) match(this.input, 13, FOLLOW_3);

							newLeafNode(otherlv_4,
									this.grammarAccess.getStatemachineAccess().getResetEventsKeyword_2_0());

							// InternalStatemachine.g:116:1: ( (otherlv_5=
							// RULE_ID ) )+
							int cnt3 = 0;
							loop3: do {
								int alt3 = 2;
								final int LA3_0 = this.input.LA(1);

								if ((LA3_0 == RULE_ID)) {
									alt3 = 1;
								}


								switch (alt3) {
									case 1:
									// InternalStatemachine.g:117:1: (otherlv_5=
									// RULE_ID )
									{
										// InternalStatemachine.g:117:1:
										// (otherlv_5= RULE_ID )
										// InternalStatemachine.g:118:3:
										// otherlv_5= RULE_ID
										{
											
											if (current == null) {
												current = createModelElement(this.grammarAccess.getStatemachineRule());
											}

											otherlv_5 = (Token) match(this.input, RULE_ID, FOLLOW_4);

											newLeafNode(otherlv_5, this.grammarAccess.getStatemachineAccess()
													.getResetEventsEventCrossReference_2_1_0());


										}


									}
										break;
									
									default:
										if (cnt3 >= 1) {
											break loop3;
										}
										final EarlyExitException eee = new EarlyExitException(3, this.input);
										throw eee;
								}
								cnt3++;
							} while (true);

							otherlv_6 = (Token) match(this.input, 12, FOLLOW_6);

							newLeafNode(otherlv_6, this.grammarAccess.getStatemachineAccess().getEndKeyword_2_2());


						}
							break;
						
					}

					// InternalStatemachine.g:133:3: (otherlv_7= 'commands' (
					// (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )?
					int alt6 = 2;
					final int LA6_0 = this.input.LA(1);

					if ((LA6_0 == 14)) {
						alt6 = 1;
					}
					switch (alt6) {
						case 1:
						// InternalStatemachine.g:133:5: otherlv_7= 'commands' (
						// (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end'
						{
							otherlv_7 = (Token) match(this.input, 14, FOLLOW_3);

							newLeafNode(otherlv_7, this.grammarAccess.getStatemachineAccess().getCommandsKeyword_3_0());

							// InternalStatemachine.g:137:1: ( (lv_commands_8_0=
							// ruleCommand ) )+
							int cnt5 = 0;
							loop5: do {
								int alt5 = 2;
								final int LA5_0 = this.input.LA(1);

								if ((LA5_0 == RULE_ID)) {
									alt5 = 1;
								}


								switch (alt5) {
									case 1:
									// InternalStatemachine.g:138:1:
									// (lv_commands_8_0= ruleCommand )
									{
										// InternalStatemachine.g:138:1:
										// (lv_commands_8_0= ruleCommand )
										// InternalStatemachine.g:139:3:
										// lv_commands_8_0= ruleCommand
										{
											
											newCompositeNode(this.grammarAccess.getStatemachineAccess()
													.getCommandsCommandParserRuleCall_3_1_0());

											pushFollow(FOLLOW_4);
											lv_commands_8_0 = ruleCommand();

											this.state._fsp--;


											if (current == null) {
												current = createModelElementForParent(
														this.grammarAccess.getStatemachineRule());
											}
											add(current, "commands", lv_commands_8_0,
													"org.eclipse.xtext.example.fowlerdsl.Statemachine.Command");
											afterParserOrEnumRuleCall();


										}


									}
										break;
									
									default:
										if (cnt5 >= 1) {
											break loop5;
										}
										final EarlyExitException eee = new EarlyExitException(5, this.input);
										throw eee;
								}
								cnt5++;
							} while (true);

							otherlv_9 = (Token) match(this.input, 12, FOLLOW_7);

							newLeafNode(otherlv_9, this.grammarAccess.getStatemachineAccess().getEndKeyword_3_2());


						}
							break;
						
					}

					// InternalStatemachine.g:159:3: (otherlv_10= 'constants' (
					// (lv_connstants_11_0= ruleConstant ) )+ otherlv_12= 'end'
					// )?
					int alt8 = 2;
					final int LA8_0 = this.input.LA(1);

					if ((LA8_0 == 15)) {
						alt8 = 1;
					}
					switch (alt8) {
						case 1:
						// InternalStatemachine.g:159:5: otherlv_10= 'constants'
						// ( (lv_connstants_11_0= ruleConstant ) )+ otherlv_12=
						// 'end'
						{
							otherlv_10 = (Token) match(this.input, 15, FOLLOW_3);

							newLeafNode(otherlv_10,
									this.grammarAccess.getStatemachineAccess().getConstantsKeyword_4_0());

							// InternalStatemachine.g:163:1: (
							// (lv_connstants_11_0= ruleConstant ) )+
							int cnt7 = 0;
							loop7: do {
								int alt7 = 2;
								final int LA7_0 = this.input.LA(1);

								if ((LA7_0 == RULE_ID)) {
									alt7 = 1;
								}


								switch (alt7) {
									case 1:
									// InternalStatemachine.g:164:1:
									// (lv_connstants_11_0= ruleConstant )
									{
										// InternalStatemachine.g:164:1:
										// (lv_connstants_11_0= ruleConstant )
										// InternalStatemachine.g:165:3:
										// lv_connstants_11_0= ruleConstant
										{
											
											newCompositeNode(this.grammarAccess.getStatemachineAccess()
													.getConnstantsConstantParserRuleCall_4_1_0());

											pushFollow(FOLLOW_4);
											lv_connstants_11_0 = ruleConstant();

											this.state._fsp--;


											if (current == null) {
												current = createModelElementForParent(
														this.grammarAccess.getStatemachineRule());
											}
											add(current, "connstants", lv_connstants_11_0,
													"org.eclipse.xtext.example.fowlerdsl.Statemachine.Constant");
											afterParserOrEnumRuleCall();


										}


									}
										break;
									
									default:
										if (cnt7 >= 1) {
											break loop7;
										}
										final EarlyExitException eee = new EarlyExitException(7, this.input);
										throw eee;
								}
								cnt7++;
							} while (true);

							otherlv_12 = (Token) match(this.input, 12, FOLLOW_8);

							newLeafNode(otherlv_12, this.grammarAccess.getStatemachineAccess().getEndKeyword_4_2());


						}
							break;
						
					}

					// InternalStatemachine.g:185:3: ( (lv_states_13_0=
					// ruleState ) )*
					loop9: do {
						int alt9 = 2;
						final int LA9_0 = this.input.LA(1);

						if ((LA9_0 == 19)) {
							alt9 = 1;
						}


						switch (alt9) {
							case 1:
							// InternalStatemachine.g:186:1: (lv_states_13_0=
							// ruleState )
							{
								// InternalStatemachine.g:186:1:
								// (lv_states_13_0= ruleState )
								// InternalStatemachine.g:187:3: lv_states_13_0=
								// ruleState
								{
									
									newCompositeNode(this.grammarAccess.getStatemachineAccess()
											.getStatesStateParserRuleCall_5_0());

									pushFollow(FOLLOW_8);
									lv_states_13_0 = ruleState();

									this.state._fsp--;


									if (current == null) {
										current = createModelElementForParent(this.grammarAccess.getStatemachineRule());
									}
									add(current, "states", lv_states_13_0,
											"org.eclipse.xtext.example.fowlerdsl.Statemachine.State");
									afterParserOrEnumRuleCall();


								}


							}
								break;
							
							default:
								break loop9;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleStatemachine"


	// $ANTLR start "entryRuleEvent"
	// InternalStatemachine.g:211:1: entryRuleEvent returns [EObject
	// current=null] : iv_ruleEvent= ruleEvent EOF ;
	public final EObject entryRuleEvent() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleEvent = null;


		try {
			// InternalStatemachine.g:212:2: (iv_ruleEvent= ruleEvent EOF )
			// InternalStatemachine.g:213:2: iv_ruleEvent= ruleEvent EOF
			{
				newCompositeNode(this.grammarAccess.getEventRule());
				pushFollow(FOLLOW_1);
				iv_ruleEvent = ruleEvent();

				this.state._fsp--;

				current = iv_ruleEvent;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleEvent"


	// $ANTLR start "ruleEvent"
	// InternalStatemachine.g:220:1: ruleEvent returns [EObject current=null] :
	// ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) (otherlv_2= '['
	// ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? ) ;
	public final EObject ruleEvent() throws RecognitionException {
		EObject current = null;

		Token lv_name_0_0 = null;
		Token lv_code_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject lv_guard_3_0 = null;


		enterRule();

		try {
			// InternalStatemachine.g:223:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (
			// (lv_code_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_guard_3_0=
			// ruleGuard ) ) otherlv_4= ']' )? ) )
			// InternalStatemachine.g:224:1: ( ( (lv_name_0_0= RULE_ID ) ) (
			// (lv_code_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_guard_3_0=
			// ruleGuard ) ) otherlv_4= ']' )? )
			{
				// InternalStatemachine.g:224:1: ( ( (lv_name_0_0= RULE_ID ) ) (
				// (lv_code_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_guard_3_0=
				// ruleGuard ) ) otherlv_4= ']' )? )
				// InternalStatemachine.g:224:2: ( (lv_name_0_0= RULE_ID ) ) (
				// (lv_code_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_guard_3_0=
				// ruleGuard ) ) otherlv_4= ']' )?
				{
					// InternalStatemachine.g:224:2: ( (lv_name_0_0= RULE_ID ) )
					// InternalStatemachine.g:225:1: (lv_name_0_0= RULE_ID )
					{
						// InternalStatemachine.g:225:1: (lv_name_0_0= RULE_ID )
						// InternalStatemachine.g:226:3: lv_name_0_0= RULE_ID
						{
							lv_name_0_0 = (Token) match(this.input, RULE_ID, FOLLOW_3);

							newLeafNode(lv_name_0_0,
									this.grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getEventRule());
							}
							setWithLastConsumed(current, "name", lv_name_0_0, "org.eclipse.xtext.common.Terminals.ID");


						}


					}

					// InternalStatemachine.g:242:2: ( (lv_code_1_0= RULE_ID ) )
					// InternalStatemachine.g:243:1: (lv_code_1_0= RULE_ID )
					{
						// InternalStatemachine.g:243:1: (lv_code_1_0= RULE_ID )
						// InternalStatemachine.g:244:3: lv_code_1_0= RULE_ID
						{
							lv_code_1_0 = (Token) match(this.input, RULE_ID, FOLLOW_9);

							newLeafNode(lv_code_1_0,
									this.grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getEventRule());
							}
							setWithLastConsumed(current, "code", lv_code_1_0, "org.eclipse.xtext.common.Terminals.ID");


						}


					}

					// InternalStatemachine.g:260:2: (otherlv_2= '[' (
					// (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )?
					int alt10 = 2;
					final int LA10_0 = this.input.LA(1);

					if ((LA10_0 == 16)) {
						alt10 = 1;
					}
					switch (alt10) {
						case 1:
						// InternalStatemachine.g:260:4: otherlv_2= '[' (
						// (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']'
						{
							otherlv_2 = (Token) match(this.input, 16, FOLLOW_10);

							newLeafNode(otherlv_2,
									this.grammarAccess.getEventAccess().getLeftSquareBracketKeyword_2_0());

							// InternalStatemachine.g:264:1: ( (lv_guard_3_0=
							// ruleGuard ) )
							// InternalStatemachine.g:265:1: (lv_guard_3_0=
							// ruleGuard )
							{
								// InternalStatemachine.g:265:1: (lv_guard_3_0=
								// ruleGuard )
								// InternalStatemachine.g:266:3: lv_guard_3_0=
								// ruleGuard
								{
									
									newCompositeNode(
											this.grammarAccess.getEventAccess().getGuardGuardParserRuleCall_2_1_0());

									pushFollow(FOLLOW_11);
									lv_guard_3_0 = ruleGuard();

									this.state._fsp--;


									if (current == null) {
										current = createModelElementForParent(this.grammarAccess.getEventRule());
									}
									set(current, "guard", lv_guard_3_0,
											"org.eclipse.xtext.example.fowlerdsl.Statemachine.Guard");
									afterParserOrEnumRuleCall();


								}


							}

							otherlv_4 = (Token) match(this.input, 17, FOLLOW_2);

							newLeafNode(otherlv_4,
									this.grammarAccess.getEventAccess().getRightSquareBracketKeyword_2_2());


						}
							break;
						
					}


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleEvent"


	// $ANTLR start "entryRuleGuard"
	// InternalStatemachine.g:294:1: entryRuleGuard returns [EObject
	// current=null] : iv_ruleGuard= ruleGuard EOF ;
	public final EObject entryRuleGuard() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleGuard = null;


		try {
			// InternalStatemachine.g:295:2: (iv_ruleGuard= ruleGuard EOF )
			// InternalStatemachine.g:296:2: iv_ruleGuard= ruleGuard EOF
			{
				newCompositeNode(this.grammarAccess.getGuardRule());
				pushFollow(FOLLOW_1);
				iv_ruleGuard = ruleGuard();

				this.state._fsp--;

				current = iv_ruleGuard;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleGuard"


	// $ANTLR start "ruleGuard"
	// InternalStatemachine.g:303:1: ruleGuard returns [EObject current=null] :
	// (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard )
	// ;
	public final EObject ruleGuard() throws RecognitionException {
		EObject current = null;

		EObject this_ValueGuard_0 = null;

		EObject this_RangeGuard_1 = null;


		enterRule();

		try {
			// InternalStatemachine.g:306:28: ( (this_ValueGuard_0=
			// ruleValueGuard | this_RangeGuard_1= ruleRangeGuard ) )
			// InternalStatemachine.g:307:1: (this_ValueGuard_0= ruleValueGuard
			// | this_RangeGuard_1= ruleRangeGuard )
			{
				// InternalStatemachine.g:307:1: (this_ValueGuard_0=
				// ruleValueGuard | this_RangeGuard_1= ruleRangeGuard )
				int alt11 = 2;
				final int LA11_0 = this.input.LA(1);

				if ((LA11_0 == RULE_ID)) {
					final int LA11_1 = this.input.LA(2);

					if ((LA11_1 == EOF || LA11_1 == 17)) {
						alt11 = 1;
					} else if ((LA11_1 == 18)) {
						alt11 = 2;
					} else {
						final NoViableAltException nvae = new NoViableAltException("", 11, 1, this.input);

						throw nvae;
					}
				} else if ((LA11_0 == RULE_INT)) {
					final int LA11_2 = this.input.LA(2);

					if ((LA11_2 == 18)) {
						alt11 = 2;
					} else if ((LA11_2 == EOF || LA11_2 == 17)) {
						alt11 = 1;
					} else {
						final NoViableAltException nvae = new NoViableAltException("", 11, 2, this.input);

						throw nvae;
					}
				} else {
					final NoViableAltException nvae = new NoViableAltException("", 11, 0, this.input);

					throw nvae;
				}
				switch (alt11) {
					case 1:
					// InternalStatemachine.g:308:5: this_ValueGuard_0=
					// ruleValueGuard
					{
						
						newCompositeNode(this.grammarAccess.getGuardAccess().getValueGuardParserRuleCall_0());

						pushFollow(FOLLOW_2);
						this_ValueGuard_0 = ruleValueGuard();

						this.state._fsp--;


						current = this_ValueGuard_0;
						afterParserOrEnumRuleCall();


					}
						break;
					case 2:
					// InternalStatemachine.g:318:5: this_RangeGuard_1=
					// ruleRangeGuard
					{
						
						newCompositeNode(this.grammarAccess.getGuardAccess().getRangeGuardParserRuleCall_1());

						pushFollow(FOLLOW_2);
						this_RangeGuard_1 = ruleRangeGuard();

						this.state._fsp--;


						current = this_RangeGuard_1;
						afterParserOrEnumRuleCall();


					}
						break;
					
				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleGuard"


	// $ANTLR start "entryRuleValueGuard"
	// InternalStatemachine.g:334:1: entryRuleValueGuard returns [EObject
	// current=null] : iv_ruleValueGuard= ruleValueGuard EOF ;
	public final EObject entryRuleValueGuard() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleValueGuard = null;


		try {
			// InternalStatemachine.g:335:2: (iv_ruleValueGuard= ruleValueGuard
			// EOF )
			// InternalStatemachine.g:336:2: iv_ruleValueGuard= ruleValueGuard
			// EOF
			{
				newCompositeNode(this.grammarAccess.getValueGuardRule());
				pushFollow(FOLLOW_1);
				iv_ruleValueGuard = ruleValueGuard();

				this.state._fsp--;

				current = iv_ruleValueGuard;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleValueGuard"


	// $ANTLR start "ruleValueGuard"
	// InternalStatemachine.g:343:1: ruleValueGuard returns [EObject
	// current=null] : ( (lv_cond_0_0= ruleValue ) ) ;
	public final EObject ruleValueGuard() throws RecognitionException {
		EObject current = null;

		EObject lv_cond_0_0 = null;


		enterRule();

		try {
			// InternalStatemachine.g:346:28: ( ( (lv_cond_0_0= ruleValue ) ) )
			// InternalStatemachine.g:347:1: ( (lv_cond_0_0= ruleValue ) )
			{
				// InternalStatemachine.g:347:1: ( (lv_cond_0_0= ruleValue ) )
				// InternalStatemachine.g:348:1: (lv_cond_0_0= ruleValue )
				{
					// InternalStatemachine.g:348:1: (lv_cond_0_0= ruleValue )
					// InternalStatemachine.g:349:3: lv_cond_0_0= ruleValue
					{
						
						newCompositeNode(this.grammarAccess.getValueGuardAccess().getCondValueParserRuleCall_0());

						pushFollow(FOLLOW_2);
						lv_cond_0_0 = ruleValue();

						this.state._fsp--;


						if (current == null) {
							current = createModelElementForParent(this.grammarAccess.getValueGuardRule());
						}
						set(current, "cond", lv_cond_0_0, "org.eclipse.xtext.example.fowlerdsl.Statemachine.Value");
						afterParserOrEnumRuleCall();


					}


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleValueGuard"


	// $ANTLR start "entryRuleRangeGuard"
	// InternalStatemachine.g:373:1: entryRuleRangeGuard returns [EObject
	// current=null] : iv_ruleRangeGuard= ruleRangeGuard EOF ;
	public final EObject entryRuleRangeGuard() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRangeGuard = null;


		try {
			// InternalStatemachine.g:374:2: (iv_ruleRangeGuard= ruleRangeGuard
			// EOF )
			// InternalStatemachine.g:375:2: iv_ruleRangeGuard= ruleRangeGuard
			// EOF
			{
				newCompositeNode(this.grammarAccess.getRangeGuardRule());
				pushFollow(FOLLOW_1);
				iv_ruleRangeGuard = ruleRangeGuard();

				this.state._fsp--;

				current = iv_ruleRangeGuard;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleRangeGuard"


	// $ANTLR start "ruleRangeGuard"
	// InternalStatemachine.g:382:1: ruleRangeGuard returns [EObject
	// current=null] : ( ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' (
	// (lv_max_2_0= ruleValue ) ) ) ;
	public final EObject ruleRangeGuard() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_min_0_0 = null;

		EObject lv_max_2_0 = null;


		enterRule();

		try {
			// InternalStatemachine.g:385:28: ( ( ( (lv_min_0_0= ruleValue ) )
			// otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) ) )
			// InternalStatemachine.g:386:1: ( ( (lv_min_0_0= ruleValue ) )
			// otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) )
			{
				// InternalStatemachine.g:386:1: ( ( (lv_min_0_0= ruleValue ) )
				// otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) )
				// InternalStatemachine.g:386:2: ( (lv_min_0_0= ruleValue ) )
				// otherlv_1= '..' ( (lv_max_2_0= ruleValue ) )
				{
					// InternalStatemachine.g:386:2: ( (lv_min_0_0= ruleValue )
					// )
					// InternalStatemachine.g:387:1: (lv_min_0_0= ruleValue )
					{
						// InternalStatemachine.g:387:1: (lv_min_0_0= ruleValue
						// )
						// InternalStatemachine.g:388:3: lv_min_0_0= ruleValue
						{
							
							newCompositeNode(this.grammarAccess.getRangeGuardAccess().getMinValueParserRuleCall_0_0());

							pushFollow(FOLLOW_12);
							lv_min_0_0 = ruleValue();

							this.state._fsp--;


							if (current == null) {
								current = createModelElementForParent(this.grammarAccess.getRangeGuardRule());
							}
							set(current, "min", lv_min_0_0, "org.eclipse.xtext.example.fowlerdsl.Statemachine.Value");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_1 = (Token) match(this.input, 18, FOLLOW_10);

					newLeafNode(otherlv_1, this.grammarAccess.getRangeGuardAccess().getFullStopFullStopKeyword_1());

					// InternalStatemachine.g:408:1: ( (lv_max_2_0= ruleValue )
					// )
					// InternalStatemachine.g:409:1: (lv_max_2_0= ruleValue )
					{
						// InternalStatemachine.g:409:1: (lv_max_2_0= ruleValue
						// )
						// InternalStatemachine.g:410:3: lv_max_2_0= ruleValue
						{
							
							newCompositeNode(this.grammarAccess.getRangeGuardAccess().getMaxValueParserRuleCall_2_0());

							pushFollow(FOLLOW_2);
							lv_max_2_0 = ruleValue();

							this.state._fsp--;


							if (current == null) {
								current = createModelElementForParent(this.grammarAccess.getRangeGuardRule());
							}
							set(current, "max", lv_max_2_0, "org.eclipse.xtext.example.fowlerdsl.Statemachine.Value");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleRangeGuard"


	// $ANTLR start "entryRuleValue"
	// InternalStatemachine.g:434:1: entryRuleValue returns [EObject
	// current=null] : iv_ruleValue= ruleValue EOF ;
	public final EObject entryRuleValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleValue = null;


		try {
			// InternalStatemachine.g:435:2: (iv_ruleValue= ruleValue EOF )
			// InternalStatemachine.g:436:2: iv_ruleValue= ruleValue EOF
			{
				newCompositeNode(this.grammarAccess.getValueRule());
				pushFollow(FOLLOW_1);
				iv_ruleValue = ruleValue();

				this.state._fsp--;

				current = iv_ruleValue;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleValue"


	// $ANTLR start "ruleValue"
	// InternalStatemachine.g:443:1: ruleValue returns [EObject current=null] :
	// (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral
	// ) ;
	public final EObject ruleValue() throws RecognitionException {
		EObject current = null;

		EObject this_ConstantRef_0 = null;

		EObject this_IntLiteral_1 = null;


		enterRule();

		try {
			// InternalStatemachine.g:446:28: ( (this_ConstantRef_0=
			// ruleConstantRef | this_IntLiteral_1= ruleIntLiteral ) )
			// InternalStatemachine.g:447:1: (this_ConstantRef_0=
			// ruleConstantRef | this_IntLiteral_1= ruleIntLiteral )
			{
				// InternalStatemachine.g:447:1: (this_ConstantRef_0=
				// ruleConstantRef | this_IntLiteral_1= ruleIntLiteral )
				int alt12 = 2;
				final int LA12_0 = this.input.LA(1);

				if ((LA12_0 == RULE_ID)) {
					alt12 = 1;
				} else if ((LA12_0 == RULE_INT)) {
					alt12 = 2;
				} else {
					final NoViableAltException nvae = new NoViableAltException("", 12, 0, this.input);

					throw nvae;
				}
				switch (alt12) {
					case 1:
					// InternalStatemachine.g:448:5: this_ConstantRef_0=
					// ruleConstantRef
					{
						
						newCompositeNode(this.grammarAccess.getValueAccess().getConstantRefParserRuleCall_0());

						pushFollow(FOLLOW_2);
						this_ConstantRef_0 = ruleConstantRef();

						this.state._fsp--;


						current = this_ConstantRef_0;
						afterParserOrEnumRuleCall();


					}
						break;
					case 2:
					// InternalStatemachine.g:458:5: this_IntLiteral_1=
					// ruleIntLiteral
					{
						
						newCompositeNode(this.grammarAccess.getValueAccess().getIntLiteralParserRuleCall_1());

						pushFollow(FOLLOW_2);
						this_IntLiteral_1 = ruleIntLiteral();

						this.state._fsp--;


						current = this_IntLiteral_1;
						afterParserOrEnumRuleCall();


					}
						break;
					
				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleValue"


	// $ANTLR start "entryRuleConstantRef"
	// InternalStatemachine.g:474:1: entryRuleConstantRef returns [EObject
	// current=null] : iv_ruleConstantRef= ruleConstantRef EOF ;
	public final EObject entryRuleConstantRef() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleConstantRef = null;


		try {
			// InternalStatemachine.g:475:2: (iv_ruleConstantRef=
			// ruleConstantRef EOF )
			// InternalStatemachine.g:476:2: iv_ruleConstantRef= ruleConstantRef
			// EOF
			{
				newCompositeNode(this.grammarAccess.getConstantRefRule());
				pushFollow(FOLLOW_1);
				iv_ruleConstantRef = ruleConstantRef();

				this.state._fsp--;

				current = iv_ruleConstantRef;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleConstantRef"


	// $ANTLR start "ruleConstantRef"
	// InternalStatemachine.g:483:1: ruleConstantRef returns [EObject
	// current=null] : ( (otherlv_0= RULE_ID ) ) ;
	public final EObject ruleConstantRef() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;

		enterRule();

		try {
			// InternalStatemachine.g:486:28: ( ( (otherlv_0= RULE_ID ) ) )
			// InternalStatemachine.g:487:1: ( (otherlv_0= RULE_ID ) )
			{
				// InternalStatemachine.g:487:1: ( (otherlv_0= RULE_ID ) )
				// InternalStatemachine.g:488:1: (otherlv_0= RULE_ID )
				{
					// InternalStatemachine.g:488:1: (otherlv_0= RULE_ID )
					// InternalStatemachine.g:489:3: otherlv_0= RULE_ID
					{
						
						if (current == null) {
							current = createModelElement(this.grammarAccess.getConstantRefRule());
						}

						otherlv_0 = (Token) match(this.input, RULE_ID, FOLLOW_2);

						newLeafNode(otherlv_0,
								this.grammarAccess.getConstantRefAccess().getConstantConstantCrossReference_0());


					}


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleConstantRef"


	// $ANTLR start "entryRuleIntLiteral"
	// InternalStatemachine.g:508:1: entryRuleIntLiteral returns [EObject
	// current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
	public final EObject entryRuleIntLiteral() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleIntLiteral = null;


		try {
			// InternalStatemachine.g:509:2: (iv_ruleIntLiteral= ruleIntLiteral
			// EOF )
			// InternalStatemachine.g:510:2: iv_ruleIntLiteral= ruleIntLiteral
			// EOF
			{
				newCompositeNode(this.grammarAccess.getIntLiteralRule());
				pushFollow(FOLLOW_1);
				iv_ruleIntLiteral = ruleIntLiteral();

				this.state._fsp--;

				current = iv_ruleIntLiteral;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleIntLiteral"


	// $ANTLR start "ruleIntLiteral"
	// InternalStatemachine.g:517:1: ruleIntLiteral returns [EObject
	// current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
	public final EObject ruleIntLiteral() throws RecognitionException {
		EObject current = null;

		Token lv_value_0_0 = null;

		enterRule();

		try {
			// InternalStatemachine.g:520:28: ( ( (lv_value_0_0= RULE_INT ) ) )
			// InternalStatemachine.g:521:1: ( (lv_value_0_0= RULE_INT ) )
			{
				// InternalStatemachine.g:521:1: ( (lv_value_0_0= RULE_INT ) )
				// InternalStatemachine.g:522:1: (lv_value_0_0= RULE_INT )
				{
					// InternalStatemachine.g:522:1: (lv_value_0_0= RULE_INT )
					// InternalStatemachine.g:523:3: lv_value_0_0= RULE_INT
					{
						lv_value_0_0 = (Token) match(this.input, RULE_INT, FOLLOW_2);

						newLeafNode(lv_value_0_0,
								this.grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());


						if (current == null) {
							current = createModelElement(this.grammarAccess.getIntLiteralRule());
						}
						setWithLastConsumed(current, "value", lv_value_0_0, "org.eclipse.xtext.common.Terminals.INT");


					}


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleIntLiteral"


	// $ANTLR start "entryRuleCommand"
	// InternalStatemachine.g:547:1: entryRuleCommand returns [EObject
	// current=null] : iv_ruleCommand= ruleCommand EOF ;
	public final EObject entryRuleCommand() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleCommand = null;


		try {
			// InternalStatemachine.g:548:2: (iv_ruleCommand= ruleCommand EOF )
			// InternalStatemachine.g:549:2: iv_ruleCommand= ruleCommand EOF
			{
				newCompositeNode(this.grammarAccess.getCommandRule());
				pushFollow(FOLLOW_1);
				iv_ruleCommand = ruleCommand();

				this.state._fsp--;

				current = iv_ruleCommand;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleCommand"


	// $ANTLR start "ruleCommand"
	// InternalStatemachine.g:556:1: ruleCommand returns [EObject current=null]
	// : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
	public final EObject ruleCommand() throws RecognitionException {
		EObject current = null;

		Token lv_name_0_0 = null;
		Token lv_code_1_0 = null;

		enterRule();

		try {
			// InternalStatemachine.g:559:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (
			// (lv_code_1_0= RULE_ID ) ) ) )
			// InternalStatemachine.g:560:1: ( ( (lv_name_0_0= RULE_ID ) ) (
			// (lv_code_1_0= RULE_ID ) ) )
			{
				// InternalStatemachine.g:560:1: ( ( (lv_name_0_0= RULE_ID ) ) (
				// (lv_code_1_0= RULE_ID ) ) )
				// InternalStatemachine.g:560:2: ( (lv_name_0_0= RULE_ID ) ) (
				// (lv_code_1_0= RULE_ID ) )
				{
					// InternalStatemachine.g:560:2: ( (lv_name_0_0= RULE_ID ) )
					// InternalStatemachine.g:561:1: (lv_name_0_0= RULE_ID )
					{
						// InternalStatemachine.g:561:1: (lv_name_0_0= RULE_ID )
						// InternalStatemachine.g:562:3: lv_name_0_0= RULE_ID
						{
							lv_name_0_0 = (Token) match(this.input, RULE_ID, FOLLOW_3);

							newLeafNode(lv_name_0_0,
									this.grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getCommandRule());
							}
							setWithLastConsumed(current, "name", lv_name_0_0, "org.eclipse.xtext.common.Terminals.ID");


						}


					}

					// InternalStatemachine.g:578:2: ( (lv_code_1_0= RULE_ID ) )
					// InternalStatemachine.g:579:1: (lv_code_1_0= RULE_ID )
					{
						// InternalStatemachine.g:579:1: (lv_code_1_0= RULE_ID )
						// InternalStatemachine.g:580:3: lv_code_1_0= RULE_ID
						{
							lv_code_1_0 = (Token) match(this.input, RULE_ID, FOLLOW_2);

							newLeafNode(lv_code_1_0,
									this.grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getCommandRule());
							}
							setWithLastConsumed(current, "code", lv_code_1_0, "org.eclipse.xtext.common.Terminals.ID");


						}


					}


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleCommand"


	// $ANTLR start "entryRuleConstant"
	// InternalStatemachine.g:604:1: entryRuleConstant returns [EObject
	// current=null] : iv_ruleConstant= ruleConstant EOF ;
	public final EObject entryRuleConstant() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleConstant = null;


		try {
			// InternalStatemachine.g:605:2: (iv_ruleConstant= ruleConstant EOF
			// )
			// InternalStatemachine.g:606:2: iv_ruleConstant= ruleConstant EOF
			{
				newCompositeNode(this.grammarAccess.getConstantRule());
				pushFollow(FOLLOW_1);
				iv_ruleConstant = ruleConstant();

				this.state._fsp--;

				current = iv_ruleConstant;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleConstant"


	// $ANTLR start "ruleConstant"
	// InternalStatemachine.g:613:1: ruleConstant returns [EObject current=null]
	// : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) ;
	public final EObject ruleConstant() throws RecognitionException {
		EObject current = null;

		Token lv_name_0_0 = null;
		EObject lv_value_1_0 = null;


		enterRule();

		try {
			// InternalStatemachine.g:616:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (
			// (lv_value_1_0= ruleValue ) ) ) )
			// InternalStatemachine.g:617:1: ( ( (lv_name_0_0= RULE_ID ) ) (
			// (lv_value_1_0= ruleValue ) ) )
			{
				// InternalStatemachine.g:617:1: ( ( (lv_name_0_0= RULE_ID ) ) (
				// (lv_value_1_0= ruleValue ) ) )
				// InternalStatemachine.g:617:2: ( (lv_name_0_0= RULE_ID ) ) (
				// (lv_value_1_0= ruleValue ) )
				{
					// InternalStatemachine.g:617:2: ( (lv_name_0_0= RULE_ID ) )
					// InternalStatemachine.g:618:1: (lv_name_0_0= RULE_ID )
					{
						// InternalStatemachine.g:618:1: (lv_name_0_0= RULE_ID )
						// InternalStatemachine.g:619:3: lv_name_0_0= RULE_ID
						{
							lv_name_0_0 = (Token) match(this.input, RULE_ID, FOLLOW_10);

							newLeafNode(lv_name_0_0,
									this.grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getConstantRule());
							}
							setWithLastConsumed(current, "name", lv_name_0_0, "org.eclipse.xtext.common.Terminals.ID");


						}


					}

					// InternalStatemachine.g:635:2: ( (lv_value_1_0= ruleValue
					// ) )
					// InternalStatemachine.g:636:1: (lv_value_1_0= ruleValue )
					{
						// InternalStatemachine.g:636:1: (lv_value_1_0=
						// ruleValue )
						// InternalStatemachine.g:637:3: lv_value_1_0= ruleValue
						{
							
							newCompositeNode(this.grammarAccess.getConstantAccess().getValueValueParserRuleCall_1_0());

							pushFollow(FOLLOW_2);
							lv_value_1_0 = ruleValue();

							this.state._fsp--;


							if (current == null) {
								current = createModelElementForParent(this.grammarAccess.getConstantRule());
							}
							set(current, "value", lv_value_1_0,
									"org.eclipse.xtext.example.fowlerdsl.Statemachine.Value");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleConstant"


	// $ANTLR start "entryRuleState"
	// InternalStatemachine.g:661:1: entryRuleState returns [EObject
	// current=null] : iv_ruleState= ruleState EOF ;
	public final EObject entryRuleState() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleState = null;


		try {
			// InternalStatemachine.g:662:2: (iv_ruleState= ruleState EOF )
			// InternalStatemachine.g:663:2: iv_ruleState= ruleState EOF
			{
				newCompositeNode(this.grammarAccess.getStateRule());
				pushFollow(FOLLOW_1);
				iv_ruleState = ruleState();

				this.state._fsp--;

				current = iv_ruleState;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleState"


	// $ANTLR start "ruleState"
	// InternalStatemachine.g:670:1: ruleState returns [EObject current=null] :
	// (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description'
	// ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions'
	// otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (
	// (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' ) ;
	public final EObject ruleState() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;
		Token lv_description_3_0 = null;
		Token otherlv_4 = null;
		Token otherlv_5 = null;
		Token otherlv_6 = null;
		Token otherlv_7 = null;
		Token otherlv_9 = null;
		EObject lv_transitions_8_0 = null;


		enterRule();

		try {
			// InternalStatemachine.g:673:28: ( (otherlv_0= 'state' (
			// (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' (
			// (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions'
			// otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (
			// (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' ) )
			// InternalStatemachine.g:674:1: (otherlv_0= 'state' ( (lv_name_1_0=
			// RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0=
			// RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' (
			// (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0=
			// ruleTransition ) )* otherlv_9= 'end' )
			{
				// InternalStatemachine.g:674:1: (otherlv_0= 'state' (
				// (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' (
				// (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions'
				// otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (
				// (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' )
				// InternalStatemachine.g:674:3: otherlv_0= 'state' (
				// (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' (
				// (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions'
				// otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (
				// (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end'
				{
					otherlv_0 = (Token) match(this.input, 19, FOLLOW_3);

					newLeafNode(otherlv_0, this.grammarAccess.getStateAccess().getStateKeyword_0());

					// InternalStatemachine.g:678:1: ( (lv_name_1_0= RULE_ID ) )
					// InternalStatemachine.g:679:1: (lv_name_1_0= RULE_ID )
					{
						// InternalStatemachine.g:679:1: (lv_name_1_0= RULE_ID )
						// InternalStatemachine.g:680:3: lv_name_1_0= RULE_ID
						{
							lv_name_1_0 = (Token) match(this.input, RULE_ID, FOLLOW_13);

							newLeafNode(lv_name_1_0,
									this.grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getStateRule());
							}
							setWithLastConsumed(current, "name", lv_name_1_0, "org.eclipse.xtext.common.Terminals.ID");


						}


					}

					// InternalStatemachine.g:696:2: (otherlv_2= 'description' (
					// (lv_description_3_0= RULE_STRING ) ) )?
					int alt13 = 2;
					final int LA13_0 = this.input.LA(1);

					if ((LA13_0 == 20)) {
						alt13 = 1;
					}
					switch (alt13) {
						case 1:
						// InternalStatemachine.g:696:4: otherlv_2=
						// 'description' ( (lv_description_3_0= RULE_STRING ) )
						{
							otherlv_2 = (Token) match(this.input, 20, FOLLOW_14);

							newLeafNode(otherlv_2, this.grammarAccess.getStateAccess().getDescriptionKeyword_2_0());

							// InternalStatemachine.g:700:1: (
							// (lv_description_3_0= RULE_STRING ) )
							// InternalStatemachine.g:701:1:
							// (lv_description_3_0= RULE_STRING )
							{
								// InternalStatemachine.g:701:1:
								// (lv_description_3_0= RULE_STRING )
								// InternalStatemachine.g:702:3:
								// lv_description_3_0= RULE_STRING
								{
									lv_description_3_0 = (Token) match(this.input, RULE_STRING, FOLLOW_15);

									newLeafNode(lv_description_3_0, this.grammarAccess.getStateAccess()
											.getDescriptionSTRINGTerminalRuleCall_2_1_0());


									if (current == null) {
										current = createModelElement(this.grammarAccess.getStateRule());
									}
									setWithLastConsumed(current, "description", lv_description_3_0,
											"org.eclipse.xtext.common.Terminals.STRING");


								}


							}


						}
							break;
						
					}

					// InternalStatemachine.g:718:4: (otherlv_4= 'actions'
					// otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}'
					// )?
					int alt15 = 2;
					final int LA15_0 = this.input.LA(1);

					if ((LA15_0 == 21)) {
						alt15 = 1;
					}
					switch (alt15) {
						case 1:
						// InternalStatemachine.g:718:6: otherlv_4= 'actions'
						// otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7=
						// '}'
						{
							otherlv_4 = (Token) match(this.input, 21, FOLLOW_16);

							newLeafNode(otherlv_4, this.grammarAccess.getStateAccess().getActionsKeyword_3_0());

							otherlv_5 = (Token) match(this.input, 22, FOLLOW_3);

							newLeafNode(otherlv_5,
									this.grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());

							// InternalStatemachine.g:726:1: ( (otherlv_6=
							// RULE_ID ) )+
							int cnt14 = 0;
							loop14: do {
								int alt14 = 2;
								final int LA14_0 = this.input.LA(1);

								if ((LA14_0 == RULE_ID)) {
									alt14 = 1;
								}


								switch (alt14) {
									case 1:
									// InternalStatemachine.g:727:1: (otherlv_6=
									// RULE_ID )
									{
										// InternalStatemachine.g:727:1:
										// (otherlv_6= RULE_ID )
										// InternalStatemachine.g:728:3:
										// otherlv_6= RULE_ID
										{
											
											if (current == null) {
												current = createModelElement(this.grammarAccess.getStateRule());
											}

											otherlv_6 = (Token) match(this.input, RULE_ID, FOLLOW_17);

											newLeafNode(otherlv_6, this.grammarAccess.getStateAccess()
													.getActionsCommandCrossReference_3_2_0());


										}


									}
										break;
									
									default:
										if (cnt14 >= 1) {
											break loop14;
										}
										final EarlyExitException eee = new EarlyExitException(14, this.input);
										throw eee;
								}
								cnt14++;
							} while (true);

							otherlv_7 = (Token) match(this.input, 23, FOLLOW_4);

							newLeafNode(otherlv_7,
									this.grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());


						}
							break;
						
					}

					// InternalStatemachine.g:743:3: ( (lv_transitions_8_0=
					// ruleTransition ) )*
					loop16: do {
						int alt16 = 2;
						final int LA16_0 = this.input.LA(1);

						if ((LA16_0 == RULE_ID)) {
							alt16 = 1;
						}


						switch (alt16) {
							case 1:
							// InternalStatemachine.g:744:1:
							// (lv_transitions_8_0= ruleTransition )
							{
								// InternalStatemachine.g:744:1:
								// (lv_transitions_8_0= ruleTransition )
								// InternalStatemachine.g:745:3:
								// lv_transitions_8_0= ruleTransition
								{
									
									newCompositeNode(this.grammarAccess.getStateAccess()
											.getTransitionsTransitionParserRuleCall_4_0());

									pushFollow(FOLLOW_4);
									lv_transitions_8_0 = ruleTransition();

									this.state._fsp--;


									if (current == null) {
										current = createModelElementForParent(this.grammarAccess.getStateRule());
									}
									add(current, "transitions", lv_transitions_8_0,
											"org.eclipse.xtext.example.fowlerdsl.Statemachine.Transition");
									afterParserOrEnumRuleCall();


								}


							}
								break;
							
							default:
								break loop16;
						}
					} while (true);

					otherlv_9 = (Token) match(this.input, 12, FOLLOW_2);

					newLeafNode(otherlv_9, this.grammarAccess.getStateAccess().getEndKeyword_5());


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleState"


	// $ANTLR start "entryRuleTransition"
	// InternalStatemachine.g:773:1: entryRuleTransition returns [EObject
	// current=null] : iv_ruleTransition= ruleTransition EOF ;
	public final EObject entryRuleTransition() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTransition = null;


		try {
			// InternalStatemachine.g:774:2: (iv_ruleTransition= ruleTransition
			// EOF )
			// InternalStatemachine.g:775:2: iv_ruleTransition= ruleTransition
			// EOF
			{
				newCompositeNode(this.grammarAccess.getTransitionRule());
				pushFollow(FOLLOW_1);
				iv_ruleTransition = ruleTransition();

				this.state._fsp--;

				current = iv_ruleTransition;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleTransition"


	// $ANTLR start "ruleTransition"
	// InternalStatemachine.g:782:1: ruleTransition returns [EObject
	// current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2=
	// RULE_ID ) ) ) ;
	public final EObject ruleTransition() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token otherlv_2 = null;

		enterRule();

		try {
			// InternalStatemachine.g:785:28: ( ( ( (otherlv_0= RULE_ID ) )
			// otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
			// InternalStatemachine.g:786:1: ( ( (otherlv_0= RULE_ID ) )
			// otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
			{
				// InternalStatemachine.g:786:1: ( ( (otherlv_0= RULE_ID ) )
				// otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
				// InternalStatemachine.g:786:2: ( (otherlv_0= RULE_ID ) )
				// otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
				{
					// InternalStatemachine.g:786:2: ( (otherlv_0= RULE_ID ) )
					// InternalStatemachine.g:787:1: (otherlv_0= RULE_ID )
					{
						// InternalStatemachine.g:787:1: (otherlv_0= RULE_ID )
						// InternalStatemachine.g:788:3: otherlv_0= RULE_ID
						{
							
							if (current == null) {
								current = createModelElement(this.grammarAccess.getTransitionRule());
							}

							otherlv_0 = (Token) match(this.input, RULE_ID, FOLLOW_18);

							newLeafNode(otherlv_0,
									this.grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0());


						}


					}

					otherlv_1 = (Token) match(this.input, 24, FOLLOW_3);

					newLeafNode(otherlv_1,
							this.grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());

					// InternalStatemachine.g:803:1: ( (otherlv_2= RULE_ID ) )
					// InternalStatemachine.g:804:1: (otherlv_2= RULE_ID )
					{
						// InternalStatemachine.g:804:1: (otherlv_2= RULE_ID )
						// InternalStatemachine.g:805:3: otherlv_2= RULE_ID
						{
							
							if (current == null) {
								current = createModelElement(this.grammarAccess.getTransitionRule());
							}

							otherlv_2 = (Token) match(this.input, RULE_ID, FOLLOW_2);

							newLeafNode(otherlv_2,
									this.grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0());


						}


					}


				}


			}

			leaveRule();
		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleTransition"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_2 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_3 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_4 = new BitSet(new long[] { 0x0000000000001010L });
	public static final BitSet FOLLOW_5 = new BitSet(new long[] { 0x000000000008E002L });
	public static final BitSet FOLLOW_6 = new BitSet(new long[] { 0x000000000008C002L });
	public static final BitSet FOLLOW_7 = new BitSet(new long[] { 0x0000000000088002L });
	public static final BitSet FOLLOW_8 = new BitSet(new long[] { 0x0000000000080002L });
	public static final BitSet FOLLOW_9 = new BitSet(new long[] { 0x0000000000010002L });
	public static final BitSet FOLLOW_10 = new BitSet(new long[] { 0x0000000000000030L });
	public static final BitSet FOLLOW_11 = new BitSet(new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_12 = new BitSet(new long[] { 0x0000000000040000L });
	public static final BitSet FOLLOW_13 = new BitSet(new long[] { 0x0000000000301010L });
	public static final BitSet FOLLOW_14 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_15 = new BitSet(new long[] { 0x0000000000201010L });
	public static final BitSet FOLLOW_16 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_17 = new BitSet(new long[] { 0x0000000000800010L });
	public static final BitSet FOLLOW_18 = new BitSet(new long[] { 0x0000000001000000L });

}