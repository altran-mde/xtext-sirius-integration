package org.eclipse.xtext.example.fowlerdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.example.fowlerdsl.services.InlineEditGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInlineEditParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'events'", "'end'", "'resetEvents'", "'commands'", "'constants'", "'['", "']'", "'=>'", "'..'", "'state'", "'description'", "'actions'", "'{'", "'}'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalInlineEditParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInlineEditParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInlineEditParser.tokenNames; }
    public String getGrammarFileName() { return "InternalInlineEdit.g"; }



     	private InlineEditGrammarAccess grammarAccess;
     	
        public InternalInlineEditParser(TokenStream input, InlineEditGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Statemachine";	
       	}
       	
       	@Override
       	protected InlineEditGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStatemachine"
    // InternalInlineEdit.g:67:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalInlineEdit.g:68:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalInlineEdit.g:69:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // InternalInlineEdit.g:76:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_events_2_0 = null;

        EObject lv_commands_8_0 = null;

        EObject lv_constants_11_0 = null;

        EObject lv_states_13_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:79:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )* ) )
            // InternalInlineEdit.g:80:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )* )
            {
            // InternalInlineEdit.g:80:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )* )
            // InternalInlineEdit.g:80:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )*
            {
            // InternalInlineEdit.g:80:2: ()
            // InternalInlineEdit.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // InternalInlineEdit.g:86:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalInlineEdit.g:86:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // InternalInlineEdit.g:90:1: ( (lv_events_2_0= ruleEvent ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalInlineEdit.g:91:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // InternalInlineEdit.g:91:1: (lv_events_2_0= ruleEvent )
                    	    // InternalInlineEdit.g:92:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_4);
                    	    lv_events_2_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_2_0, 
                    	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:112:3: (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalInlineEdit.g:112:5: otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getResetEventsKeyword_2_0());
                        
                    // InternalInlineEdit.g:116:1: ( (otherlv_5= RULE_ID ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalInlineEdit.g:117:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalInlineEdit.g:117:1: (otherlv_5= RULE_ID )
                    	    // InternalInlineEdit.g:118:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_4); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getStatemachineAccess().getResetEventsEventCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_6=(Token)match(input,12,FOLLOW_6); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:133:3: (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalInlineEdit.g:133:5: otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                        	newLeafNode(otherlv_7, grammarAccess.getStatemachineAccess().getCommandsKeyword_3_0());
                        
                    // InternalInlineEdit.g:137:1: ( (lv_commands_8_0= ruleCommand ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalInlineEdit.g:138:1: (lv_commands_8_0= ruleCommand )
                    	    {
                    	    // InternalInlineEdit.g:138:1: (lv_commands_8_0= ruleCommand )
                    	    // InternalInlineEdit.g:139:3: lv_commands_8_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_4);
                    	    lv_commands_8_0=ruleCommand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"commands",
                    	            		lv_commands_8_0, 
                    	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Command");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_9=(Token)match(input,12,FOLLOW_7); 

                        	newLeafNode(otherlv_9, grammarAccess.getStatemachineAccess().getEndKeyword_3_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:159:3: (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInlineEdit.g:159:5: otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_3); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getConstantsKeyword_4_0());
                        
                    // InternalInlineEdit.g:163:1: ( (lv_constants_11_0= ruleConstant ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalInlineEdit.g:164:1: (lv_constants_11_0= ruleConstant )
                    	    {
                    	    // InternalInlineEdit.g:164:1: (lv_constants_11_0= ruleConstant )
                    	    // InternalInlineEdit.g:165:3: lv_constants_11_0= ruleConstant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getConstantsConstantParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_4);
                    	    lv_constants_11_0=ruleConstant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constants",
                    	            		lv_constants_11_0, 
                    	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Constant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_12=(Token)match(input,12,FOLLOW_8); 

                        	newLeafNode(otherlv_12, grammarAccess.getStatemachineAccess().getEndKeyword_4_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:185:3: ( (lv_states_13_0= ruleState ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalInlineEdit.g:186:1: (lv_states_13_0= ruleState )
            	    {
            	    // InternalInlineEdit.g:186:1: (lv_states_13_0= ruleState )
            	    // InternalInlineEdit.g:187:3: lv_states_13_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_8);
            	    lv_states_13_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_13_0, 
            	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleTransition"
    // InternalInlineEdit.g:211:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalInlineEdit.g:212:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalInlineEdit.g:213:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalInlineEdit.g:220:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_guard_1_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:223:28: ( ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalInlineEdit.g:224:1: ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalInlineEdit.g:224:1: ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) )
            // InternalInlineEdit.g:224:2: (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) )
            {
            // InternalInlineEdit.g:224:2: (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalInlineEdit.g:224:4: otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_9); 

                        	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_0_0());
                        
                    // InternalInlineEdit.g:228:1: ( (lv_guard_1_0= ruleGuard ) )
                    // InternalInlineEdit.g:229:1: (lv_guard_1_0= ruleGuard )
                    {
                    // InternalInlineEdit.g:229:1: (lv_guard_1_0= ruleGuard )
                    // InternalInlineEdit.g:230:3: lv_guard_1_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_10);
                    lv_guard_1_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_1_0, 
                            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_0_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:250:3: ( (otherlv_3= RULE_ID ) )
            // InternalInlineEdit.g:251:1: (otherlv_3= RULE_ID )
            {
            // InternalInlineEdit.g:251:1: (otherlv_3= RULE_ID )
            // InternalInlineEdit.g:252:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // InternalInlineEdit.g:267:1: ( (otherlv_5= RULE_ID ) )
            // InternalInlineEdit.g:268:1: (otherlv_5= RULE_ID )
            {
            // InternalInlineEdit.g:268:1: (otherlv_5= RULE_ID )
            // InternalInlineEdit.g:269:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // InternalInlineEdit.g:288:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalInlineEdit.g:289:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalInlineEdit.g:290:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalInlineEdit.g:297:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:300:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? ) )
            // InternalInlineEdit.g:301:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? )
            {
            // InternalInlineEdit.g:301:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? )
            // InternalInlineEdit.g:301:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )?
            {
            // InternalInlineEdit.g:301:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalInlineEdit.g:302:1: (lv_name_0_0= RULE_ID )
            {
            // InternalInlineEdit.g:302:1: (lv_name_0_0= RULE_ID )
            // InternalInlineEdit.g:303:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalInlineEdit.g:319:2: ( (lv_code_1_0= RULE_INT ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalInlineEdit.g:320:1: (lv_code_1_0= RULE_INT )
                    {
                    // InternalInlineEdit.g:320:1: (lv_code_1_0= RULE_INT )
                    // InternalInlineEdit.g:321:3: lv_code_1_0= RULE_INT
                    {
                    lv_code_1_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    			newLeafNode(lv_code_1_0, grammarAccess.getEventAccess().getCodeINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"code",
                            		lv_code_1_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }
                    break;

            }

            // InternalInlineEdit.g:337:3: (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInlineEdit.g:337:5: otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_9); 

                        	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // InternalInlineEdit.g:341:1: ( (lv_guard_3_0= ruleGuard ) )
                    // InternalInlineEdit.g:342:1: (lv_guard_3_0= ruleGuard )
                    {
                    // InternalInlineEdit.g:342:1: (lv_guard_3_0= ruleGuard )
                    // InternalInlineEdit.g:343:3: lv_guard_3_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardGuardParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_10);
                    lv_guard_3_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_3_0, 
                            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_4, grammarAccess.getEventAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGuard"
    // InternalInlineEdit.g:371:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalInlineEdit.g:372:2: (iv_ruleGuard= ruleGuard EOF )
            // InternalInlineEdit.g:373:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalInlineEdit.g:380:1: ruleGuard returns [EObject current=null] : (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        EObject this_ValueGuard_0 = null;

        EObject this_RangeGuard_1 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:383:28: ( (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard ) )
            // InternalInlineEdit.g:384:1: (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard )
            {
            // InternalInlineEdit.g:384:1: (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==17) ) {
                    alt13=1;
                }
                else if ( (LA13_1==19) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_INT) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==19) ) {
                    alt13=2;
                }
                else if ( (LA13_2==EOF||LA13_2==17) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalInlineEdit.g:385:5: this_ValueGuard_0= ruleValueGuard
                    {
                     
                            newCompositeNode(grammarAccess.getGuardAccess().getValueGuardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ValueGuard_0=ruleValueGuard();

                    state._fsp--;

                     
                            current = this_ValueGuard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalInlineEdit.g:395:5: this_RangeGuard_1= ruleRangeGuard
                    {
                     
                            newCompositeNode(grammarAccess.getGuardAccess().getRangeGuardParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RangeGuard_1=ruleRangeGuard();

                    state._fsp--;

                     
                            current = this_RangeGuard_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleValueGuard"
    // InternalInlineEdit.g:411:1: entryRuleValueGuard returns [EObject current=null] : iv_ruleValueGuard= ruleValueGuard EOF ;
    public final EObject entryRuleValueGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueGuard = null;


        try {
            // InternalInlineEdit.g:412:2: (iv_ruleValueGuard= ruleValueGuard EOF )
            // InternalInlineEdit.g:413:2: iv_ruleValueGuard= ruleValueGuard EOF
            {
             newCompositeNode(grammarAccess.getValueGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueGuard=ruleValueGuard();

            state._fsp--;

             current =iv_ruleValueGuard; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueGuard"


    // $ANTLR start "ruleValueGuard"
    // InternalInlineEdit.g:420:1: ruleValueGuard returns [EObject current=null] : ( (lv_cond_0_0= ruleValue ) ) ;
    public final EObject ruleValueGuard() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_0_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:423:28: ( ( (lv_cond_0_0= ruleValue ) ) )
            // InternalInlineEdit.g:424:1: ( (lv_cond_0_0= ruleValue ) )
            {
            // InternalInlineEdit.g:424:1: ( (lv_cond_0_0= ruleValue ) )
            // InternalInlineEdit.g:425:1: (lv_cond_0_0= ruleValue )
            {
            // InternalInlineEdit.g:425:1: (lv_cond_0_0= ruleValue )
            // InternalInlineEdit.g:426:3: lv_cond_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getValueGuardAccess().getCondValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_cond_0_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueGuardRule());
            	        }
                   		set(
                   			current, 
                   			"cond",
                    		lv_cond_0_0, 
                    		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueGuard"


    // $ANTLR start "entryRuleRangeGuard"
    // InternalInlineEdit.g:450:1: entryRuleRangeGuard returns [EObject current=null] : iv_ruleRangeGuard= ruleRangeGuard EOF ;
    public final EObject entryRuleRangeGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeGuard = null;


        try {
            // InternalInlineEdit.g:451:2: (iv_ruleRangeGuard= ruleRangeGuard EOF )
            // InternalInlineEdit.g:452:2: iv_ruleRangeGuard= ruleRangeGuard EOF
            {
             newCompositeNode(grammarAccess.getRangeGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeGuard=ruleRangeGuard();

            state._fsp--;

             current =iv_ruleRangeGuard; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeGuard"


    // $ANTLR start "ruleRangeGuard"
    // InternalInlineEdit.g:459:1: ruleRangeGuard returns [EObject current=null] : ( ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) ) ;
    public final EObject ruleRangeGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_min_0_0 = null;

        EObject lv_max_2_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:462:28: ( ( ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) ) )
            // InternalInlineEdit.g:463:1: ( ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) )
            {
            // InternalInlineEdit.g:463:1: ( ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) )
            // InternalInlineEdit.g:463:2: ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) )
            {
            // InternalInlineEdit.g:463:2: ( (lv_min_0_0= ruleValue ) )
            // InternalInlineEdit.g:464:1: (lv_min_0_0= ruleValue )
            {
            // InternalInlineEdit.g:464:1: (lv_min_0_0= ruleValue )
            // InternalInlineEdit.g:465:3: lv_min_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getRangeGuardAccess().getMinValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_14);
            lv_min_0_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeGuardRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_0_0, 
                    		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

                	newLeafNode(otherlv_1, grammarAccess.getRangeGuardAccess().getFullStopFullStopKeyword_1());
                
            // InternalInlineEdit.g:485:1: ( (lv_max_2_0= ruleValue ) )
            // InternalInlineEdit.g:486:1: (lv_max_2_0= ruleValue )
            {
            // InternalInlineEdit.g:486:1: (lv_max_2_0= ruleValue )
            // InternalInlineEdit.g:487:3: lv_max_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getRangeGuardAccess().getMaxValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_max_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeGuardRule());
            	        }
                   		set(
                   			current, 
                   			"max",
                    		lv_max_2_0, 
                    		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeGuard"


    // $ANTLR start "entryRuleValue"
    // InternalInlineEdit.g:511:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalInlineEdit.g:512:2: (iv_ruleValue= ruleValue EOF )
            // InternalInlineEdit.g:513:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalInlineEdit.g:520:1: ruleValue returns [EObject current=null] : (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantRef_0 = null;

        EObject this_IntLiteral_1 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:523:28: ( (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral ) )
            // InternalInlineEdit.g:524:1: (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral )
            {
            // InternalInlineEdit.g:524:1: (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalInlineEdit.g:525:5: this_ConstantRef_0= ruleConstantRef
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getConstantRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ConstantRef_0=ruleConstantRef();

                    state._fsp--;

                     
                            current = this_ConstantRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalInlineEdit.g:535:5: this_IntLiteral_1= ruleIntLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;

                     
                            current = this_IntLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleConstantRef"
    // InternalInlineEdit.g:551:1: entryRuleConstantRef returns [EObject current=null] : iv_ruleConstantRef= ruleConstantRef EOF ;
    public final EObject entryRuleConstantRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantRef = null;


        try {
            // InternalInlineEdit.g:552:2: (iv_ruleConstantRef= ruleConstantRef EOF )
            // InternalInlineEdit.g:553:2: iv_ruleConstantRef= ruleConstantRef EOF
            {
             newCompositeNode(grammarAccess.getConstantRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantRef=ruleConstantRef();

            state._fsp--;

             current =iv_ruleConstantRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantRef"


    // $ANTLR start "ruleConstantRef"
    // InternalInlineEdit.g:560:1: ruleConstantRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalInlineEdit.g:563:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalInlineEdit.g:564:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalInlineEdit.g:564:1: ( (otherlv_0= RULE_ID ) )
            // InternalInlineEdit.g:565:1: (otherlv_0= RULE_ID )
            {
            // InternalInlineEdit.g:565:1: (otherlv_0= RULE_ID )
            // InternalInlineEdit.g:566:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getConstantRefAccess().getConstantConstantCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantRef"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalInlineEdit.g:585:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalInlineEdit.g:586:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalInlineEdit.g:587:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalInlineEdit.g:594:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalInlineEdit.g:597:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalInlineEdit.g:598:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalInlineEdit.g:598:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalInlineEdit.g:599:1: (lv_value_0_0= RULE_INT )
            {
            // InternalInlineEdit.g:599:1: (lv_value_0_0= RULE_INT )
            // InternalInlineEdit.g:600:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleCommand"
    // InternalInlineEdit.g:624:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalInlineEdit.g:625:2: (iv_ruleCommand= ruleCommand EOF )
            // InternalInlineEdit.g:626:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalInlineEdit.g:633:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // InternalInlineEdit.g:636:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // InternalInlineEdit.g:637:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // InternalInlineEdit.g:637:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // InternalInlineEdit.g:637:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // InternalInlineEdit.g:637:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalInlineEdit.g:638:1: (lv_name_0_0= RULE_ID )
            {
            // InternalInlineEdit.g:638:1: (lv_name_0_0= RULE_ID )
            // InternalInlineEdit.g:639:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalInlineEdit.g:655:2: ( (lv_code_1_0= RULE_ID ) )
            // InternalInlineEdit.g:656:1: (lv_code_1_0= RULE_ID )
            {
            // InternalInlineEdit.g:656:1: (lv_code_1_0= RULE_ID )
            // InternalInlineEdit.g:657:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_code_1_0, grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleConstant"
    // InternalInlineEdit.g:681:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalInlineEdit.g:682:2: (iv_ruleConstant= ruleConstant EOF )
            // InternalInlineEdit.g:683:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalInlineEdit.g:690:1: ruleConstant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:693:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) )
            // InternalInlineEdit.g:694:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) )
            {
            // InternalInlineEdit.g:694:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) )
            // InternalInlineEdit.g:694:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) )
            {
            // InternalInlineEdit.g:694:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalInlineEdit.g:695:1: (lv_name_0_0= RULE_ID )
            {
            // InternalInlineEdit.g:695:1: (lv_name_0_0= RULE_ID )
            // InternalInlineEdit.g:696:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalInlineEdit.g:712:2: ( (lv_value_1_0= ruleValue ) )
            // InternalInlineEdit.g:713:1: (lv_value_1_0= ruleValue )
            {
            // InternalInlineEdit.g:713:1: (lv_value_1_0= ruleValue )
            // InternalInlineEdit.g:714:3: lv_value_1_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValueValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleState"
    // InternalInlineEdit.g:738:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalInlineEdit.g:739:2: (iv_ruleState= ruleState EOF )
            // InternalInlineEdit.g:740:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalInlineEdit.g:747:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_transitions_8_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:750:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' ) )
            // InternalInlineEdit.g:751:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' )
            {
            // InternalInlineEdit.g:751:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' )
            // InternalInlineEdit.g:751:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // InternalInlineEdit.g:755:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalInlineEdit.g:756:1: (lv_name_1_0= RULE_ID )
            {
            // InternalInlineEdit.g:756:1: (lv_name_1_0= RULE_ID )
            // InternalInlineEdit.g:757:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalInlineEdit.g:773:2: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalInlineEdit.g:773:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_16); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getDescriptionKeyword_2_0());
                        
                    // InternalInlineEdit.g:777:1: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalInlineEdit.g:778:1: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalInlineEdit.g:778:1: (lv_description_3_0= RULE_STRING )
                    // InternalInlineEdit.g:779:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalInlineEdit.g:795:4: (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalInlineEdit.g:795:6: otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_18); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalInlineEdit.g:803:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalInlineEdit.g:804:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalInlineEdit.g:804:1: (otherlv_6= RULE_ID )
                    	    // InternalInlineEdit.g:805:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getStateAccess().getActionsCommandCrossReference_3_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_7=(Token)match(input,24,FOLLOW_20); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:820:3: ( (lv_transitions_8_0= ruleTransition ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInlineEdit.g:821:1: (lv_transitions_8_0= ruleTransition )
            	    {
            	    // InternalInlineEdit.g:821:1: (lv_transitions_8_0= ruleTransition )
            	    // InternalInlineEdit.g:822:3: lv_transitions_8_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_20);
            	    lv_transitions_8_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_8_0, 
            	            		"org.eclipse.xtext.example.fowlerdsl.InlineEdit.Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_9=(Token)match(input,12,FOLLOW_2); 

                	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getEndKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000010E002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000010C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000611010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000411010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000011010L});

}