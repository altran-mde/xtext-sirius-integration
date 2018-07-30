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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'=>'", "'..'", "'events'", "'end'", "'resetEvents'", "'commands'", "'constants'", "'state'", "'description'", "'actions'", "'{'", "'}'", "'things'"
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
    public static final int T__25=25;
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
        	return "InlineStatemachine";	
       	}
       	
       	@Override
       	protected InlineEditGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleInlineStatemachine"
    // InternalInlineEdit.g:67:1: entryRuleInlineStatemachine returns [EObject current=null] : iv_ruleInlineStatemachine= ruleInlineStatemachine EOF ;
    public final EObject entryRuleInlineStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineStatemachine = null;


        try {
            // InternalInlineEdit.g:68:2: (iv_ruleInlineStatemachine= ruleInlineStatemachine EOF )
            // InternalInlineEdit.g:69:2: iv_ruleInlineStatemachine= ruleInlineStatemachine EOF
            {
             newCompositeNode(grammarAccess.getInlineStatemachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineStatemachine=ruleInlineStatemachine();

            state._fsp--;

             current =iv_ruleInlineStatemachine; 
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
    // $ANTLR end "entryRuleInlineStatemachine"


    // $ANTLR start "ruleInlineStatemachine"
    // InternalInlineEdit.g:76:1: ruleInlineStatemachine returns [EObject current=null] : this_Statemachine_0= ruleStatemachine ;
    public final EObject ruleInlineStatemachine() throws RecognitionException {
        EObject current = null;

        EObject this_Statemachine_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:79:28: (this_Statemachine_0= ruleStatemachine )
            // InternalInlineEdit.g:81:5: this_Statemachine_0= ruleStatemachine
            {
             
                    newCompositeNode(grammarAccess.getInlineStatemachineAccess().getStatemachineParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Statemachine_0=ruleStatemachine();

            state._fsp--;

             
                    current = this_Statemachine_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleInlineStatemachine"


    // $ANTLR start "entryRuleTransition"
    // InternalInlineEdit.g:97:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalInlineEdit.g:98:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalInlineEdit.g:99:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalInlineEdit.g:106:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) ) ;
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
            // InternalInlineEdit.g:109:28: ( ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalInlineEdit.g:110:1: ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalInlineEdit.g:110:1: ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) )
            // InternalInlineEdit.g:110:2: (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '=>' ( (otherlv_5= RULE_ID ) )
            {
            // InternalInlineEdit.g:110:2: (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalInlineEdit.g:110:4: otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                        	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_0_0());
                        
                    // InternalInlineEdit.g:114:1: ( (lv_guard_1_0= ruleGuard ) )
                    // InternalInlineEdit.g:115:1: (lv_guard_1_0= ruleGuard )
                    {
                    // InternalInlineEdit.g:115:1: (lv_guard_1_0= ruleGuard )
                    // InternalInlineEdit.g:116:3: lv_guard_1_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_4);
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

                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_0_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:136:3: ( (otherlv_3= RULE_ID ) )
            // InternalInlineEdit.g:137:1: (otherlv_3= RULE_ID )
            {
            // InternalInlineEdit.g:137:1: (otherlv_3= RULE_ID )
            // InternalInlineEdit.g:138:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // InternalInlineEdit.g:153:1: ( (otherlv_5= RULE_ID ) )
            // InternalInlineEdit.g:154:1: (otherlv_5= RULE_ID )
            {
            // InternalInlineEdit.g:154:1: (otherlv_5= RULE_ID )
            // InternalInlineEdit.g:155:3: otherlv_5= RULE_ID
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


    // $ANTLR start "entryRuleRangeGuard"
    // InternalInlineEdit.g:174:1: entryRuleRangeGuard returns [EObject current=null] : iv_ruleRangeGuard= ruleRangeGuard EOF ;
    public final EObject entryRuleRangeGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeGuard = null;


        try {
            // InternalInlineEdit.g:175:2: (iv_ruleRangeGuard= ruleRangeGuard EOF )
            // InternalInlineEdit.g:176:2: iv_ruleRangeGuard= ruleRangeGuard EOF
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
    // InternalInlineEdit.g:183:1: ruleRangeGuard returns [EObject current=null] : ( ( (lv_min_0_0= ruleValue ) )? otherlv_1= '..' ( (lv_max_2_0= ruleValue ) )? ) ;
    public final EObject ruleRangeGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_min_0_0 = null;

        EObject lv_max_2_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:186:28: ( ( ( (lv_min_0_0= ruleValue ) )? otherlv_1= '..' ( (lv_max_2_0= ruleValue ) )? ) )
            // InternalInlineEdit.g:187:1: ( ( (lv_min_0_0= ruleValue ) )? otherlv_1= '..' ( (lv_max_2_0= ruleValue ) )? )
            {
            // InternalInlineEdit.g:187:1: ( ( (lv_min_0_0= ruleValue ) )? otherlv_1= '..' ( (lv_max_2_0= ruleValue ) )? )
            // InternalInlineEdit.g:187:2: ( (lv_min_0_0= ruleValue ) )? otherlv_1= '..' ( (lv_max_2_0= ruleValue ) )?
            {
            // InternalInlineEdit.g:187:2: ( (lv_min_0_0= ruleValue ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalInlineEdit.g:188:1: (lv_min_0_0= ruleValue )
                    {
                    // InternalInlineEdit.g:188:1: (lv_min_0_0= ruleValue )
                    // InternalInlineEdit.g:189:3: lv_min_0_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getRangeGuardAccess().getMinValueParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_7);
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
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_8); 

                	newLeafNode(otherlv_1, grammarAccess.getRangeGuardAccess().getFullStopFullStopKeyword_1());
                
            // InternalInlineEdit.g:209:1: ( (lv_max_2_0= ruleValue ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||LA3_1==12||LA3_1==16) ) {
                    alt3=1;
                }
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalInlineEdit.g:210:1: (lv_max_2_0= ruleValue )
                    {
                    // InternalInlineEdit.g:210:1: (lv_max_2_0= ruleValue )
                    // InternalInlineEdit.g:211:3: lv_max_2_0= ruleValue
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
    // $ANTLR end "ruleRangeGuard"


    // $ANTLR start "entryRuleStatemachine"
    // InternalInlineEdit.g:235:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalInlineEdit.g:236:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalInlineEdit.g:237:2: iv_ruleStatemachine= ruleStatemachine EOF
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
    // InternalInlineEdit.g:244:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )* ) ;
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
            // InternalInlineEdit.g:247:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )* ) )
            // InternalInlineEdit.g:248:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )* )
            {
            // InternalInlineEdit.g:248:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )* )
            // InternalInlineEdit.g:248:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )? (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )? ( (lv_states_13_0= ruleState ) )*
            {
            // InternalInlineEdit.g:248:2: ()
            // InternalInlineEdit.g:249:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // InternalInlineEdit.g:254:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalInlineEdit.g:254:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // InternalInlineEdit.g:258:1: ( (lv_events_2_0= ruleEvent ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalInlineEdit.g:259:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // InternalInlineEdit.g:259:1: (lv_events_2_0= ruleEvent )
                    	    // InternalInlineEdit.g:260:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_9);
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:280:3: (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalInlineEdit.g:280:5: otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_5); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getResetEventsKeyword_2_0());
                        
                    // InternalInlineEdit.g:284:1: ( (otherlv_5= RULE_ID ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalInlineEdit.g:285:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalInlineEdit.g:285:1: (otherlv_5= RULE_ID )
                    	    // InternalInlineEdit.g:286:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getStatemachineAccess().getResetEventsEventCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_11); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:301:3: (otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalInlineEdit.g:301:5: otherlv_7= 'commands' ( (lv_commands_8_0= ruleCommand ) )+ otherlv_9= 'end'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_12); 

                        	newLeafNode(otherlv_7, grammarAccess.getStatemachineAccess().getCommandsKeyword_3_0());
                        
                    // InternalInlineEdit.g:305:1: ( (lv_commands_8_0= ruleCommand ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID||LA8_0==11) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalInlineEdit.g:306:1: (lv_commands_8_0= ruleCommand )
                    	    {
                    	    // InternalInlineEdit.g:306:1: (lv_commands_8_0= ruleCommand )
                    	    // InternalInlineEdit.g:307:3: lv_commands_8_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_13);
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_14); 

                        	newLeafNode(otherlv_9, grammarAccess.getStatemachineAccess().getEndKeyword_3_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:327:3: (otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalInlineEdit.g:327:5: otherlv_10= 'constants' ( (lv_constants_11_0= ruleConstant ) )+ otherlv_12= 'end'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_5); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getConstantsKeyword_4_0());
                        
                    // InternalInlineEdit.g:331:1: ( (lv_constants_11_0= ruleConstant ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalInlineEdit.g:332:1: (lv_constants_11_0= ruleConstant )
                    	    {
                    	    // InternalInlineEdit.g:332:1: (lv_constants_11_0= ruleConstant )
                    	    // InternalInlineEdit.g:333:3: lv_constants_11_0= ruleConstant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getConstantsConstantParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_9);
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_15); 

                        	newLeafNode(otherlv_12, grammarAccess.getStatemachineAccess().getEndKeyword_4_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:353:3: ( (lv_states_13_0= ruleState ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalInlineEdit.g:354:1: (lv_states_13_0= ruleState )
            	    {
            	    // InternalInlineEdit.g:354:1: (lv_states_13_0= ruleState )
            	    // InternalInlineEdit.g:355:3: lv_states_13_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_15);
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
            	    break loop12;
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


    // $ANTLR start "entryRuleEvent"
    // InternalInlineEdit.g:379:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalInlineEdit.g:380:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalInlineEdit.g:381:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalInlineEdit.g:388:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:391:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? ) )
            // InternalInlineEdit.g:392:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? )
            {
            // InternalInlineEdit.g:392:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? )
            // InternalInlineEdit.g:392:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )?
            {
            // InternalInlineEdit.g:392:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalInlineEdit.g:393:1: (lv_name_0_0= RULE_ID )
            {
            // InternalInlineEdit.g:393:1: (lv_name_0_0= RULE_ID )
            // InternalInlineEdit.g:394:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalInlineEdit.g:410:2: ( (lv_code_1_0= RULE_INT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalInlineEdit.g:411:1: (lv_code_1_0= RULE_INT )
                    {
                    // InternalInlineEdit.g:411:1: (lv_code_1_0= RULE_INT )
                    // InternalInlineEdit.g:412:3: lv_code_1_0= RULE_INT
                    {
                    lv_code_1_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            // InternalInlineEdit.g:428:3: (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalInlineEdit.g:428:5: otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // InternalInlineEdit.g:432:1: ( (lv_guard_3_0= ruleGuard ) )
                    // InternalInlineEdit.g:433:1: (lv_guard_3_0= ruleGuard )
                    {
                    // InternalInlineEdit.g:433:1: (lv_guard_3_0= ruleGuard )
                    // InternalInlineEdit.g:434:3: lv_guard_3_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardGuardParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_4);
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

                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

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
    // InternalInlineEdit.g:462:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalInlineEdit.g:463:2: (iv_ruleGuard= ruleGuard EOF )
            // InternalInlineEdit.g:464:2: iv_ruleGuard= ruleGuard EOF
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
    // InternalInlineEdit.g:471:1: ruleGuard returns [EObject current=null] : (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        EObject this_ValueGuard_0 = null;

        EObject this_RangeGuard_1 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:474:28: ( (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard ) )
            // InternalInlineEdit.g:475:1: (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard )
            {
            // InternalInlineEdit.g:475:1: (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard )
            int alt15=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==14) ) {
                    alt15=2;
                }
                else if ( (LA15_1==EOF||LA15_1==RULE_ID||LA15_1==12||LA15_1==16) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==EOF||LA15_2==RULE_ID||LA15_2==12||LA15_2==16) ) {
                    alt15=1;
                }
                else if ( (LA15_2==14) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt15=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalInlineEdit.g:476:5: this_ValueGuard_0= ruleValueGuard
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
                    // InternalInlineEdit.g:486:5: this_RangeGuard_1= ruleRangeGuard
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
    // InternalInlineEdit.g:502:1: entryRuleValueGuard returns [EObject current=null] : iv_ruleValueGuard= ruleValueGuard EOF ;
    public final EObject entryRuleValueGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueGuard = null;


        try {
            // InternalInlineEdit.g:503:2: (iv_ruleValueGuard= ruleValueGuard EOF )
            // InternalInlineEdit.g:504:2: iv_ruleValueGuard= ruleValueGuard EOF
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
    // InternalInlineEdit.g:511:1: ruleValueGuard returns [EObject current=null] : ( (lv_cond_0_0= ruleValue ) ) ;
    public final EObject ruleValueGuard() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_0_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:514:28: ( ( (lv_cond_0_0= ruleValue ) ) )
            // InternalInlineEdit.g:515:1: ( (lv_cond_0_0= ruleValue ) )
            {
            // InternalInlineEdit.g:515:1: ( (lv_cond_0_0= ruleValue ) )
            // InternalInlineEdit.g:516:1: (lv_cond_0_0= ruleValue )
            {
            // InternalInlineEdit.g:516:1: (lv_cond_0_0= ruleValue )
            // InternalInlineEdit.g:517:3: lv_cond_0_0= ruleValue
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


    // $ANTLR start "entryRuleValue"
    // InternalInlineEdit.g:541:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalInlineEdit.g:542:2: (iv_ruleValue= ruleValue EOF )
            // InternalInlineEdit.g:543:2: iv_ruleValue= ruleValue EOF
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
    // InternalInlineEdit.g:550:1: ruleValue returns [EObject current=null] : (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantRef_0 = null;

        EObject this_IntLiteral_1 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:553:28: ( (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral ) )
            // InternalInlineEdit.g:554:1: (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral )
            {
            // InternalInlineEdit.g:554:1: (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_INT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalInlineEdit.g:555:5: this_ConstantRef_0= ruleConstantRef
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
                    // InternalInlineEdit.g:565:5: this_IntLiteral_1= ruleIntLiteral
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
    // InternalInlineEdit.g:581:1: entryRuleConstantRef returns [EObject current=null] : iv_ruleConstantRef= ruleConstantRef EOF ;
    public final EObject entryRuleConstantRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantRef = null;


        try {
            // InternalInlineEdit.g:582:2: (iv_ruleConstantRef= ruleConstantRef EOF )
            // InternalInlineEdit.g:583:2: iv_ruleConstantRef= ruleConstantRef EOF
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
    // InternalInlineEdit.g:590:1: ruleConstantRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalInlineEdit.g:593:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalInlineEdit.g:594:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalInlineEdit.g:594:1: ( (otherlv_0= RULE_ID ) )
            // InternalInlineEdit.g:595:1: (otherlv_0= RULE_ID )
            {
            // InternalInlineEdit.g:595:1: (otherlv_0= RULE_ID )
            // InternalInlineEdit.g:596:3: otherlv_0= RULE_ID
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
    // InternalInlineEdit.g:615:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalInlineEdit.g:616:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalInlineEdit.g:617:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalInlineEdit.g:624:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalInlineEdit.g:627:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalInlineEdit.g:628:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalInlineEdit.g:628:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalInlineEdit.g:629:1: (lv_value_0_0= RULE_INT )
            {
            // InternalInlineEdit.g:629:1: (lv_value_0_0= RULE_INT )
            // InternalInlineEdit.g:630:3: lv_value_0_0= RULE_INT
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
    // InternalInlineEdit.g:654:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalInlineEdit.g:655:2: (iv_ruleCommand= ruleCommand EOF )
            // InternalInlineEdit.g:656:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalInlineEdit.g:663:1: ruleCommand returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_code_4_0=null;
        EObject lv_guard_1_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:666:28: ( ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) ) ) )
            // InternalInlineEdit.g:667:1: ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) ) )
            {
            // InternalInlineEdit.g:667:1: ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) ) )
            // InternalInlineEdit.g:667:2: (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) )
            {
            // InternalInlineEdit.g:667:2: (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==11) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalInlineEdit.g:667:4: otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                        	newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getLeftSquareBracketKeyword_0_0());
                        
                    // InternalInlineEdit.g:671:1: ( (lv_guard_1_0= ruleGuard ) )
                    // InternalInlineEdit.g:672:1: (lv_guard_1_0= ruleGuard )
                    {
                    // InternalInlineEdit.g:672:1: (lv_guard_1_0= ruleGuard )
                    // InternalInlineEdit.g:673:3: lv_guard_1_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getCommandAccess().getGuardGuardParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_4);
                    lv_guard_1_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCommandRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_1_0, 
                            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getRightSquareBracketKeyword_0_2());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:693:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalInlineEdit.g:694:1: (lv_name_3_0= RULE_ID )
            {
            // InternalInlineEdit.g:694:1: (lv_name_3_0= RULE_ID )
            // InternalInlineEdit.g:695:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            			newLeafNode(lv_name_3_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalInlineEdit.g:711:2: ( (lv_code_4_0= RULE_INT ) )
            // InternalInlineEdit.g:712:1: (lv_code_4_0= RULE_INT )
            {
            // InternalInlineEdit.g:712:1: (lv_code_4_0= RULE_INT )
            // InternalInlineEdit.g:713:3: lv_code_4_0= RULE_INT
            {
            lv_code_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_code_4_0, grammarAccess.getCommandAccess().getCodeINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_4_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

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
    // InternalInlineEdit.g:737:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalInlineEdit.g:738:2: (iv_ruleConstant= ruleConstant EOF )
            // InternalInlineEdit.g:739:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalInlineEdit.g:746:1: ruleConstant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:749:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) )
            // InternalInlineEdit.g:750:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) )
            {
            // InternalInlineEdit.g:750:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) )
            // InternalInlineEdit.g:750:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) )
            {
            // InternalInlineEdit.g:750:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalInlineEdit.g:751:1: (lv_name_0_0= RULE_ID )
            {
            // InternalInlineEdit.g:751:1: (lv_name_0_0= RULE_ID )
            // InternalInlineEdit.g:752:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalInlineEdit.g:768:2: ( (lv_value_1_0= ruleValue ) )
            // InternalInlineEdit.g:769:1: (lv_value_1_0= ruleValue )
            {
            // InternalInlineEdit.g:769:1: (lv_value_1_0= ruleValue )
            // InternalInlineEdit.g:770:3: lv_value_1_0= ruleValue
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
    // InternalInlineEdit.g:794:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalInlineEdit.g:795:2: (iv_ruleState= ruleState EOF )
            // InternalInlineEdit.g:796:2: iv_ruleState= ruleState EOF
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
    // InternalInlineEdit.g:803:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end' ) ;
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
        Token otherlv_11=null;
        EObject lv_transitions_8_0 = null;

        EObject lv_things_10_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:806:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end' ) )
            // InternalInlineEdit.g:807:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end' )
            {
            // InternalInlineEdit.g:807:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end' )
            // InternalInlineEdit.g:807:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // InternalInlineEdit.g:811:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalInlineEdit.g:812:1: (lv_name_1_0= RULE_ID )
            {
            // InternalInlineEdit.g:812:1: (lv_name_1_0= RULE_ID )
            // InternalInlineEdit.g:813:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalInlineEdit.g:829:2: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalInlineEdit.g:829:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getDescriptionKeyword_2_0());
                        
                    // InternalInlineEdit.g:833:1: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalInlineEdit.g:834:1: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalInlineEdit.g:834:1: (lv_description_3_0= RULE_STRING )
                    // InternalInlineEdit.g:835:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            // InternalInlineEdit.g:851:4: (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalInlineEdit.g:851:6: otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_23); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,23,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalInlineEdit.g:859:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalInlineEdit.g:860:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalInlineEdit.g:860:1: (otherlv_6= RULE_ID )
                    	    // InternalInlineEdit.g:861:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_24); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getStateAccess().getActionsCommandCrossReference_3_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    otherlv_7=(Token)match(input,24,FOLLOW_25); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // InternalInlineEdit.g:876:3: ( (lv_transitions_8_0= ruleTransition ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==11) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalInlineEdit.g:877:1: (lv_transitions_8_0= ruleTransition )
            	    {
            	    // InternalInlineEdit.g:877:1: (lv_transitions_8_0= ruleTransition )
            	    // InternalInlineEdit.g:878:3: lv_transitions_8_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_25);
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
            	    break loop21;
                }
            } while (true);

            // InternalInlineEdit.g:894:3: (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalInlineEdit.g:894:5: otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )*
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_9); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getThingsKeyword_5_0());
                        
                    // InternalInlineEdit.g:898:1: ( (lv_things_10_0= ruleThing ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalInlineEdit.g:899:1: (lv_things_10_0= ruleThing )
                    	    {
                    	    // InternalInlineEdit.g:899:1: (lv_things_10_0= ruleThing )
                    	    // InternalInlineEdit.g:900:3: lv_things_10_0= ruleThing
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getThingsThingParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_9);
                    	    lv_things_10_0=ruleThing();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"things",
                    	            		lv_things_10_0, 
                    	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Thing");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

                	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getEndKeyword_6());
                

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


    // $ANTLR start "entryRuleThing"
    // InternalInlineEdit.g:928:1: entryRuleThing returns [EObject current=null] : iv_ruleThing= ruleThing EOF ;
    public final EObject entryRuleThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThing = null;


        try {
            // InternalInlineEdit.g:929:2: (iv_ruleThing= ruleThing EOF )
            // InternalInlineEdit.g:930:2: iv_ruleThing= ruleThing EOF
            {
             newCompositeNode(grammarAccess.getThingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThing=ruleThing();

            state._fsp--;

             current =iv_ruleThing; 
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
    // $ANTLR end "entryRuleThing"


    // $ANTLR start "ruleThing"
    // InternalInlineEdit.g:937:1: ruleThing returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) ) ) ;
    public final EObject ruleThing() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_guard_1_0 = null;


         enterRule(); 
            
        try {
            // InternalInlineEdit.g:940:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) ) ) )
            // InternalInlineEdit.g:941:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) ) )
            {
            // InternalInlineEdit.g:941:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) ) )
            // InternalInlineEdit.g:941:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) )
            {
            // InternalInlineEdit.g:941:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalInlineEdit.g:942:1: (lv_name_0_0= RULE_ID )
            {
            // InternalInlineEdit.g:942:1: (lv_name_0_0= RULE_ID )
            // InternalInlineEdit.g:943:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			newLeafNode(lv_name_0_0, grammarAccess.getThingAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getThingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalInlineEdit.g:959:2: ( (lv_guard_1_0= ruleGuard ) )
            // InternalInlineEdit.g:960:1: (lv_guard_1_0= ruleGuard )
            {
            // InternalInlineEdit.g:960:1: (lv_guard_1_0= ruleGuard )
            // InternalInlineEdit.g:961:3: lv_guard_1_0= ruleGuard
            {
             
            	        newCompositeNode(grammarAccess.getThingAccess().getGuardGuardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_guard_1_0=ruleGuard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getThingRule());
            	        }
                   		set(
                   			current, 
                   			"guard",
                    		lv_guard_1_0, 
                    		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Guard");
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
    // $ANTLR end "ruleThing"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002610810L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002410810L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002010810L});

}