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
import org.eclipse.xtext.example.fowlerdsl.services.StatemachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatemachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'events'", "'end'", "'resetEvents'", "'commands'", "'constants'", "'['", "']'", "'..'", "'state'", "'description'", "'actions'", "'{'", "'}'", "'things'", "'=>'"
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
    public static final int T__26=26;
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


        public InternalStatemachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStatemachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStatemachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStatemachine.g"; }



     	private StatemachineGrammarAccess grammarAccess;
     	
        public InternalStatemachineParser(TokenStream input, StatemachineGrammarAccess grammarAccess) {
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
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStatemachine"
    // InternalStatemachine.g:67:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalStatemachine.g:68:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalStatemachine.g:69:2: iv_ruleStatemachine= ruleStatemachine EOF
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
    // InternalStatemachine.g:76:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'events' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= 'end' )? (otherlv_6= 'resetEvents' ( (otherlv_7= RULE_ID ) )* otherlv_8= 'end' )? (otherlv_9= 'commands' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= 'end' )? (otherlv_12= 'constants' ( (lv_constants_13_0= ruleConstant ) )* otherlv_14= 'end' )? ( (lv_states_15_0= ruleState ) )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_events_4_0 = null;

        EObject lv_commands_10_0 = null;

        EObject lv_constants_13_0 = null;

        EObject lv_states_15_0 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:79:28: ( ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'events' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= 'end' )? (otherlv_6= 'resetEvents' ( (otherlv_7= RULE_ID ) )* otherlv_8= 'end' )? (otherlv_9= 'commands' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= 'end' )? (otherlv_12= 'constants' ( (lv_constants_13_0= ruleConstant ) )* otherlv_14= 'end' )? ( (lv_states_15_0= ruleState ) )* ) )
            // InternalStatemachine.g:80:1: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'events' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= 'end' )? (otherlv_6= 'resetEvents' ( (otherlv_7= RULE_ID ) )* otherlv_8= 'end' )? (otherlv_9= 'commands' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= 'end' )? (otherlv_12= 'constants' ( (lv_constants_13_0= ruleConstant ) )* otherlv_14= 'end' )? ( (lv_states_15_0= ruleState ) )* )
            {
            // InternalStatemachine.g:80:1: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'events' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= 'end' )? (otherlv_6= 'resetEvents' ( (otherlv_7= RULE_ID ) )* otherlv_8= 'end' )? (otherlv_9= 'commands' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= 'end' )? (otherlv_12= 'constants' ( (lv_constants_13_0= ruleConstant ) )* otherlv_14= 'end' )? ( (lv_states_15_0= ruleState ) )* )
            // InternalStatemachine.g:80:2: () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'events' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= 'end' )? (otherlv_6= 'resetEvents' ( (otherlv_7= RULE_ID ) )* otherlv_8= 'end' )? (otherlv_9= 'commands' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= 'end' )? (otherlv_12= 'constants' ( (lv_constants_13_0= ruleConstant ) )* otherlv_14= 'end' )? ( (lv_states_15_0= ruleState ) )*
            {
            // InternalStatemachine.g:80:2: ()
            // InternalStatemachine.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // InternalStatemachine.g:86:2: (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalStatemachine.g:86:4: otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getNameKeyword_1_0());
                        
                    // InternalStatemachine.g:90:1: ( (lv_name_2_0= RULE_ID ) )
                    // InternalStatemachine.g:91:1: (lv_name_2_0= RULE_ID )
                    {
                    // InternalStatemachine.g:91:1: (lv_name_2_0= RULE_ID )
                    // InternalStatemachine.g:92:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getStatemachineAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStatemachine.g:108:4: (otherlv_3= 'events' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= 'end' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStatemachine.g:108:6: otherlv_3= 'events' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= 'end'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEventsKeyword_2_0());
                        
                    // InternalStatemachine.g:112:1: ( (lv_events_4_0= ruleEvent ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalStatemachine.g:113:1: (lv_events_4_0= ruleEvent )
                    	    {
                    	    // InternalStatemachine.g:113:1: (lv_events_4_0= ruleEvent )
                    	    // InternalStatemachine.g:114:3: lv_events_4_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_5);
                    	    lv_events_4_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_4_0, 
                    	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                        	newLeafNode(otherlv_5, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // InternalStatemachine.g:134:3: (otherlv_6= 'resetEvents' ( (otherlv_7= RULE_ID ) )* otherlv_8= 'end' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStatemachine.g:134:5: otherlv_6= 'resetEvents' ( (otherlv_7= RULE_ID ) )* otherlv_8= 'end'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getResetEventsKeyword_3_0());
                        
                    // InternalStatemachine.g:138:1: ( (otherlv_7= RULE_ID ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalStatemachine.g:139:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalStatemachine.g:139:1: (otherlv_7= RULE_ID )
                    	    // InternalStatemachine.g:140:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getStatemachineAccess().getResetEventsEventCrossReference_3_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FOLLOW_7); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatemachineAccess().getEndKeyword_3_2());
                        

                    }
                    break;

            }

            // InternalStatemachine.g:155:3: (otherlv_9= 'commands' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= 'end' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStatemachine.g:155:5: otherlv_9= 'commands' ( (lv_commands_10_0= ruleCommand ) )* otherlv_11= 'end'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                        	newLeafNode(otherlv_9, grammarAccess.getStatemachineAccess().getCommandsKeyword_4_0());
                        
                    // InternalStatemachine.g:159:1: ( (lv_commands_10_0= ruleCommand ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalStatemachine.g:160:1: (lv_commands_10_0= ruleCommand )
                    	    {
                    	    // InternalStatemachine.g:160:1: (lv_commands_10_0= ruleCommand )
                    	    // InternalStatemachine.g:161:3: lv_commands_10_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_8);
                    	    lv_commands_10_0=ruleCommand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"commands",
                    	            		lv_commands_10_0, 
                    	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Command");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,13,FOLLOW_9); 

                        	newLeafNode(otherlv_11, grammarAccess.getStatemachineAccess().getEndKeyword_4_2());
                        

                    }
                    break;

            }

            // InternalStatemachine.g:181:3: (otherlv_12= 'constants' ( (lv_constants_13_0= ruleConstant ) )* otherlv_14= 'end' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStatemachine.g:181:5: otherlv_12= 'constants' ( (lv_constants_13_0= ruleConstant ) )* otherlv_14= 'end'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_5); 

                        	newLeafNode(otherlv_12, grammarAccess.getStatemachineAccess().getConstantsKeyword_5_0());
                        
                    // InternalStatemachine.g:185:1: ( (lv_constants_13_0= ruleConstant ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalStatemachine.g:186:1: (lv_constants_13_0= ruleConstant )
                    	    {
                    	    // InternalStatemachine.g:186:1: (lv_constants_13_0= ruleConstant )
                    	    // InternalStatemachine.g:187:3: lv_constants_13_0= ruleConstant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getConstantsConstantParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_5);
                    	    lv_constants_13_0=ruleConstant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constants",
                    	            		lv_constants_13_0, 
                    	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Constant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_10); 

                        	newLeafNode(otherlv_14, grammarAccess.getStatemachineAccess().getEndKeyword_5_2());
                        

                    }
                    break;

            }

            // InternalStatemachine.g:207:3: ( (lv_states_15_0= ruleState ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStatemachine.g:208:1: (lv_states_15_0= ruleState )
            	    {
            	    // InternalStatemachine.g:208:1: (lv_states_15_0= ruleState )
            	    // InternalStatemachine.g:209:3: lv_states_15_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_states_15_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_15_0, 
            	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalStatemachine.g:233:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStatemachine.g:234:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalStatemachine.g:235:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalStatemachine.g:242:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:245:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? ) )
            // InternalStatemachine.g:246:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? )
            {
            // InternalStatemachine.g:246:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )? )
            // InternalStatemachine.g:246:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_INT ) )? (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )?
            {
            // InternalStatemachine.g:246:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStatemachine.g:247:1: (lv_name_0_0= RULE_ID )
            {
            // InternalStatemachine.g:247:1: (lv_name_0_0= RULE_ID )
            // InternalStatemachine.g:248:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalStatemachine.g:264:2: ( (lv_code_1_0= RULE_INT ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStatemachine.g:265:1: (lv_code_1_0= RULE_INT )
                    {
                    // InternalStatemachine.g:265:1: (lv_code_1_0= RULE_INT )
                    // InternalStatemachine.g:266:3: lv_code_1_0= RULE_INT
                    {
                    lv_code_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            // InternalStatemachine.g:282:3: (otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStatemachine.g:282:5: otherlv_2= '[' ( (lv_guard_3_0= ruleGuard ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_13); 

                        	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // InternalStatemachine.g:286:1: ( (lv_guard_3_0= ruleGuard ) )
                    // InternalStatemachine.g:287:1: (lv_guard_3_0= ruleGuard )
                    {
                    // InternalStatemachine.g:287:1: (lv_guard_3_0= ruleGuard )
                    // InternalStatemachine.g:288:3: lv_guard_3_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardGuardParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_14);
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

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalStatemachine.g:316:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalStatemachine.g:317:2: (iv_ruleGuard= ruleGuard EOF )
            // InternalStatemachine.g:318:2: iv_ruleGuard= ruleGuard EOF
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
    // InternalStatemachine.g:325:1: ruleGuard returns [EObject current=null] : (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        EObject this_ValueGuard_0 = null;

        EObject this_RangeGuard_1 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:328:28: ( (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard ) )
            // InternalStatemachine.g:329:1: (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard )
            {
            // InternalStatemachine.g:329:1: (this_ValueGuard_0= ruleValueGuard | this_RangeGuard_1= ruleRangeGuard )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==RULE_ID||LA13_1==13||LA13_1==18) ) {
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
                else if ( (LA13_2==EOF||LA13_2==RULE_ID||LA13_2==13||LA13_2==18) ) {
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
                    // InternalStatemachine.g:330:5: this_ValueGuard_0= ruleValueGuard
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
                    // InternalStatemachine.g:340:5: this_RangeGuard_1= ruleRangeGuard
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
    // InternalStatemachine.g:356:1: entryRuleValueGuard returns [EObject current=null] : iv_ruleValueGuard= ruleValueGuard EOF ;
    public final EObject entryRuleValueGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueGuard = null;


        try {
            // InternalStatemachine.g:357:2: (iv_ruleValueGuard= ruleValueGuard EOF )
            // InternalStatemachine.g:358:2: iv_ruleValueGuard= ruleValueGuard EOF
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
    // InternalStatemachine.g:365:1: ruleValueGuard returns [EObject current=null] : ( (lv_cond_0_0= ruleValue ) ) ;
    public final EObject ruleValueGuard() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_0_0 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:368:28: ( ( (lv_cond_0_0= ruleValue ) ) )
            // InternalStatemachine.g:369:1: ( (lv_cond_0_0= ruleValue ) )
            {
            // InternalStatemachine.g:369:1: ( (lv_cond_0_0= ruleValue ) )
            // InternalStatemachine.g:370:1: (lv_cond_0_0= ruleValue )
            {
            // InternalStatemachine.g:370:1: (lv_cond_0_0= ruleValue )
            // InternalStatemachine.g:371:3: lv_cond_0_0= ruleValue
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
    // InternalStatemachine.g:395:1: entryRuleRangeGuard returns [EObject current=null] : iv_ruleRangeGuard= ruleRangeGuard EOF ;
    public final EObject entryRuleRangeGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeGuard = null;


        try {
            // InternalStatemachine.g:396:2: (iv_ruleRangeGuard= ruleRangeGuard EOF )
            // InternalStatemachine.g:397:2: iv_ruleRangeGuard= ruleRangeGuard EOF
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
    // InternalStatemachine.g:404:1: ruleRangeGuard returns [EObject current=null] : ( ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) ) ;
    public final EObject ruleRangeGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_min_0_0 = null;

        EObject lv_max_2_0 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:407:28: ( ( ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) ) )
            // InternalStatemachine.g:408:1: ( ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) )
            {
            // InternalStatemachine.g:408:1: ( ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) ) )
            // InternalStatemachine.g:408:2: ( (lv_min_0_0= ruleValue ) ) otherlv_1= '..' ( (lv_max_2_0= ruleValue ) )
            {
            // InternalStatemachine.g:408:2: ( (lv_min_0_0= ruleValue ) )
            // InternalStatemachine.g:409:1: (lv_min_0_0= ruleValue )
            {
            // InternalStatemachine.g:409:1: (lv_min_0_0= ruleValue )
            // InternalStatemachine.g:410:3: lv_min_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getRangeGuardAccess().getMinValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_15);
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

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

                	newLeafNode(otherlv_1, grammarAccess.getRangeGuardAccess().getFullStopFullStopKeyword_1());
                
            // InternalStatemachine.g:430:1: ( (lv_max_2_0= ruleValue ) )
            // InternalStatemachine.g:431:1: (lv_max_2_0= ruleValue )
            {
            // InternalStatemachine.g:431:1: (lv_max_2_0= ruleValue )
            // InternalStatemachine.g:432:3: lv_max_2_0= ruleValue
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
    // InternalStatemachine.g:456:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalStatemachine.g:457:2: (iv_ruleValue= ruleValue EOF )
            // InternalStatemachine.g:458:2: iv_ruleValue= ruleValue EOF
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
    // InternalStatemachine.g:465:1: ruleValue returns [EObject current=null] : (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantRef_0 = null;

        EObject this_IntLiteral_1 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:468:28: ( (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral ) )
            // InternalStatemachine.g:469:1: (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral )
            {
            // InternalStatemachine.g:469:1: (this_ConstantRef_0= ruleConstantRef | this_IntLiteral_1= ruleIntLiteral )
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
                    // InternalStatemachine.g:470:5: this_ConstantRef_0= ruleConstantRef
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
                    // InternalStatemachine.g:480:5: this_IntLiteral_1= ruleIntLiteral
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
    // InternalStatemachine.g:496:1: entryRuleConstantRef returns [EObject current=null] : iv_ruleConstantRef= ruleConstantRef EOF ;
    public final EObject entryRuleConstantRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantRef = null;


        try {
            // InternalStatemachine.g:497:2: (iv_ruleConstantRef= ruleConstantRef EOF )
            // InternalStatemachine.g:498:2: iv_ruleConstantRef= ruleConstantRef EOF
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
    // InternalStatemachine.g:505:1: ruleConstantRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalStatemachine.g:508:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalStatemachine.g:509:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalStatemachine.g:509:1: ( (otherlv_0= RULE_ID ) )
            // InternalStatemachine.g:510:1: (otherlv_0= RULE_ID )
            {
            // InternalStatemachine.g:510:1: (otherlv_0= RULE_ID )
            // InternalStatemachine.g:511:3: otherlv_0= RULE_ID
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
    // InternalStatemachine.g:530:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalStatemachine.g:531:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalStatemachine.g:532:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalStatemachine.g:539:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalStatemachine.g:542:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalStatemachine.g:543:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalStatemachine.g:543:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalStatemachine.g:544:1: (lv_value_0_0= RULE_INT )
            {
            // InternalStatemachine.g:544:1: (lv_value_0_0= RULE_INT )
            // InternalStatemachine.g:545:3: lv_value_0_0= RULE_INT
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
    // InternalStatemachine.g:569:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalStatemachine.g:570:2: (iv_ruleCommand= ruleCommand EOF )
            // InternalStatemachine.g:571:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalStatemachine.g:578:1: ruleCommand returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_code_4_0=null;
        EObject lv_guard_1_0 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:581:28: ( ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) ) ) )
            // InternalStatemachine.g:582:1: ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) ) )
            {
            // InternalStatemachine.g:582:1: ( (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) ) )
            // InternalStatemachine.g:582:2: (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_code_4_0= RULE_INT ) )
            {
            // InternalStatemachine.g:582:2: (otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalStatemachine.g:582:4: otherlv_0= '[' ( (lv_guard_1_0= ruleGuard ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_13); 

                        	newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getLeftSquareBracketKeyword_0_0());
                        
                    // InternalStatemachine.g:586:1: ( (lv_guard_1_0= ruleGuard ) )
                    // InternalStatemachine.g:587:1: (lv_guard_1_0= ruleGuard )
                    {
                    // InternalStatemachine.g:587:1: (lv_guard_1_0= ruleGuard )
                    // InternalStatemachine.g:588:3: lv_guard_1_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getCommandAccess().getGuardGuardParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_14);
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

                    otherlv_2=(Token)match(input,18,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getRightSquareBracketKeyword_0_2());
                        

                    }
                    break;

            }

            // InternalStatemachine.g:608:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalStatemachine.g:609:1: (lv_name_3_0= RULE_ID )
            {
            // InternalStatemachine.g:609:1: (lv_name_3_0= RULE_ID )
            // InternalStatemachine.g:610:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalStatemachine.g:626:2: ( (lv_code_4_0= RULE_INT ) )
            // InternalStatemachine.g:627:1: (lv_code_4_0= RULE_INT )
            {
            // InternalStatemachine.g:627:1: (lv_code_4_0= RULE_INT )
            // InternalStatemachine.g:628:3: lv_code_4_0= RULE_INT
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
    // InternalStatemachine.g:652:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalStatemachine.g:653:2: (iv_ruleConstant= ruleConstant EOF )
            // InternalStatemachine.g:654:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalStatemachine.g:661:1: ruleConstant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:664:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) )
            // InternalStatemachine.g:665:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) )
            {
            // InternalStatemachine.g:665:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) )
            // InternalStatemachine.g:665:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) )
            {
            // InternalStatemachine.g:665:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStatemachine.g:666:1: (lv_name_0_0= RULE_ID )
            {
            // InternalStatemachine.g:666:1: (lv_name_0_0= RULE_ID )
            // InternalStatemachine.g:667:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalStatemachine.g:683:2: ( (lv_value_1_0= ruleValue ) )
            // InternalStatemachine.g:684:1: (lv_value_1_0= ruleValue )
            {
            // InternalStatemachine.g:684:1: (lv_value_1_0= ruleValue )
            // InternalStatemachine.g:685:3: lv_value_1_0= ruleValue
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
    // InternalStatemachine.g:709:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStatemachine.g:710:2: (iv_ruleState= ruleState EOF )
            // InternalStatemachine.g:711:2: iv_ruleState= ruleState EOF
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
    // InternalStatemachine.g:718:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end' ) ;
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
            // InternalStatemachine.g:721:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end' ) )
            // InternalStatemachine.g:722:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end' )
            {
            // InternalStatemachine.g:722:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end' )
            // InternalStatemachine.g:722:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )? otherlv_11= 'end'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // InternalStatemachine.g:726:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStatemachine.g:727:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStatemachine.g:727:1: (lv_name_1_0= RULE_ID )
            // InternalStatemachine.g:728:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            // InternalStatemachine.g:744:2: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStatemachine.g:744:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_18); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getDescriptionKeyword_2_0());
                        
                    // InternalStatemachine.g:748:1: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalStatemachine.g:749:1: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalStatemachine.g:749:1: (lv_description_3_0= RULE_STRING )
                    // InternalStatemachine.g:750:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            // InternalStatemachine.g:766:4: (otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalStatemachine.g:766:6: otherlv_4= 'actions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_20); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalStatemachine.g:774:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalStatemachine.g:775:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalStatemachine.g:775:1: (otherlv_6= RULE_ID )
                    	    // InternalStatemachine.g:776:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getStateAccess().getActionsCommandCrossReference_3_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    otherlv_7=(Token)match(input,24,FOLLOW_22); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // InternalStatemachine.g:791:3: ( (lv_transitions_8_0= ruleTransition ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStatemachine.g:792:1: (lv_transitions_8_0= ruleTransition )
            	    {
            	    // InternalStatemachine.g:792:1: (lv_transitions_8_0= ruleTransition )
            	    // InternalStatemachine.g:793:3: lv_transitions_8_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_22);
            	    lv_transitions_8_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_8_0, 
            	            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalStatemachine.g:809:3: (otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalStatemachine.g:809:5: otherlv_9= 'things' ( (lv_things_10_0= ruleThing ) )*
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getThingsKeyword_5_0());
                        
                    // InternalStatemachine.g:813:1: ( (lv_things_10_0= ruleThing ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalStatemachine.g:814:1: (lv_things_10_0= ruleThing )
                    	    {
                    	    // InternalStatemachine.g:814:1: (lv_things_10_0= ruleThing )
                    	    // InternalStatemachine.g:815:3: lv_things_10_0= ruleThing
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getThingsThingParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_5);
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
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTransition"
    // InternalStatemachine.g:843:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStatemachine.g:844:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalStatemachine.g:845:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalStatemachine.g:852:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuard ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_guard_2_0 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:855:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuard ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalStatemachine.g:856:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuard ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalStatemachine.g:856:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuard ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) )
            // InternalStatemachine.g:856:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuard ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) )
            {
            // InternalStatemachine.g:856:2: ( (otherlv_0= RULE_ID ) )
            // InternalStatemachine.g:857:1: (otherlv_0= RULE_ID )
            {
            // InternalStatemachine.g:857:1: (otherlv_0= RULE_ID )
            // InternalStatemachine.g:858:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
            	

            }


            }

            // InternalStatemachine.g:869:2: (otherlv_1= '[' ( (lv_guard_2_0= ruleGuard ) ) otherlv_3= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalStatemachine.g:869:4: otherlv_1= '[' ( (lv_guard_2_0= ruleGuard ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // InternalStatemachine.g:873:1: ( (lv_guard_2_0= ruleGuard ) )
                    // InternalStatemachine.g:874:1: (lv_guard_2_0= ruleGuard )
                    {
                    // InternalStatemachine.g:874:1: (lv_guard_2_0= ruleGuard )
                    // InternalStatemachine.g:875:3: lv_guard_2_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_14);
                    lv_guard_2_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_2_0, 
                            		"org.eclipse.xtext.example.fowlerdsl.Statemachine.Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_24); 

                        	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // InternalStatemachine.g:899:1: ( (otherlv_5= RULE_ID ) )
            // InternalStatemachine.g:900:1: (otherlv_5= RULE_ID )
            {
            // InternalStatemachine.g:900:1: (otherlv_5= RULE_ID )
            // InternalStatemachine.g:901:3: otherlv_5= RULE_ID
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


    // $ANTLR start "entryRuleThing"
    // InternalStatemachine.g:920:1: entryRuleThing returns [EObject current=null] : iv_ruleThing= ruleThing EOF ;
    public final EObject entryRuleThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThing = null;


        try {
            // InternalStatemachine.g:921:2: (iv_ruleThing= ruleThing EOF )
            // InternalStatemachine.g:922:2: iv_ruleThing= ruleThing EOF
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
    // InternalStatemachine.g:929:1: ruleThing returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) ) ) ;
    public final EObject ruleThing() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_guard_1_0 = null;


         enterRule(); 
            
        try {
            // InternalStatemachine.g:932:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) ) ) )
            // InternalStatemachine.g:933:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) ) )
            {
            // InternalStatemachine.g:933:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) ) )
            // InternalStatemachine.g:933:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_guard_1_0= ruleGuard ) )
            {
            // InternalStatemachine.g:933:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStatemachine.g:934:1: (lv_name_0_0= RULE_ID )
            {
            // InternalStatemachine.g:934:1: (lv_name_0_0= RULE_ID )
            // InternalStatemachine.g:935:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalStatemachine.g:951:2: ( (lv_guard_1_0= ruleGuard ) )
            // InternalStatemachine.g:952:1: (lv_guard_1_0= ruleGuard )
            {
            // InternalStatemachine.g:952:1: (lv_guard_1_0= ruleGuard )
            // InternalStatemachine.g:953:3: lv_guard_1_0= ruleGuard
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000011D002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000011C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000118002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002602010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002402010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002002010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});

}