package com.altran.general.integration.xtextsirius.test.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.altran.general.integration.xtextsirius.test.services.EKeyLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEKeyLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Container'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEKeyLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEKeyLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEKeyLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEKeyLang.g"; }



     	private EKeyLangGrammarAccess grammarAccess;

        public InternalEKeyLangParser(TokenStream input, EKeyLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Container";
       	}

       	@Override
       	protected EKeyLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContainer"
    // InternalEKeyLang.g:64:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalEKeyLang.g:64:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalEKeyLang.g:65:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalEKeyLang.g:71:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= RULE_ID ) ) ( (lv_contents_3_0= ruleIContainerContent ) )* ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_contents_3_0 = null;



        	enterRule();

        try {
            // InternalEKeyLang.g:77:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= RULE_ID ) ) ( (lv_contents_3_0= ruleIContainerContent ) )* ) )
            // InternalEKeyLang.g:78:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= RULE_ID ) ) ( (lv_contents_3_0= ruleIContainerContent ) )* )
            {
            // InternalEKeyLang.g:78:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= RULE_ID ) ) ( (lv_contents_3_0= ruleIContainerContent ) )* )
            // InternalEKeyLang.g:79:3: () otherlv_1= 'Container' ( (lv_name_2_0= RULE_ID ) ) ( (lv_contents_3_0= ruleIContainerContent ) )*
            {
            // InternalEKeyLang.g:79:3: ()
            // InternalEKeyLang.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalEKeyLang.g:90:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEKeyLang.g:91:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEKeyLang.g:91:4: (lv_name_2_0= RULE_ID )
            // InternalEKeyLang.g:92:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEKeyLang.g:108:3: ( (lv_contents_3_0= ruleIContainerContent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEKeyLang.g:109:4: (lv_contents_3_0= ruleIContainerContent )
            	    {
            	    // InternalEKeyLang.g:109:4: (lv_contents_3_0= ruleIContainerContent )
            	    // InternalEKeyLang.g:110:5: lv_contents_3_0= ruleIContainerContent
            	    {

            	    					newCompositeNode(grammarAccess.getContainerAccess().getContentsIContainerContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_contents_3_0=ruleIContainerContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contents",
            	    						lv_contents_3_0,
            	    						"com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleIContainerContent"
    // InternalEKeyLang.g:131:1: entryRuleIContainerContent returns [EObject current=null] : iv_ruleIContainerContent= ruleIContainerContent EOF ;
    public final EObject entryRuleIContainerContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIContainerContent = null;


        try {
            // InternalEKeyLang.g:131:58: (iv_ruleIContainerContent= ruleIContainerContent EOF )
            // InternalEKeyLang.g:132:2: iv_ruleIContainerContent= ruleIContainerContent EOF
            {
             newCompositeNode(grammarAccess.getIContainerContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIContainerContent=ruleIContainerContent();

            state._fsp--;

             current =iv_ruleIContainerContent; 
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
    // $ANTLR end "entryRuleIContainerContent"


    // $ANTLR start "ruleIContainerContent"
    // InternalEKeyLang.g:138:1: ruleIContainerContent returns [EObject current=null] : (this_Group_0= ruleGroup | this_Leaf_1= ruleLeaf ) ;
    public final EObject ruleIContainerContent() throws RecognitionException {
        EObject current = null;

        EObject this_Group_0 = null;

        EObject this_Leaf_1 = null;



        	enterRule();

        try {
            // InternalEKeyLang.g:144:2: ( (this_Group_0= ruleGroup | this_Leaf_1= ruleLeaf ) )
            // InternalEKeyLang.g:145:2: (this_Group_0= ruleGroup | this_Leaf_1= ruleLeaf )
            {
            // InternalEKeyLang.g:145:2: (this_Group_0= ruleGroup | this_Leaf_1= ruleLeaf )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_INT) ) {
                    alt2=2;
                }
                else if ( (LA2_1==12) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEKeyLang.g:146:3: this_Group_0= ruleGroup
                    {

                    			newCompositeNode(grammarAccess.getIContainerContentAccess().getGroupParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_0=ruleGroup();

                    state._fsp--;


                    			current = this_Group_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEKeyLang.g:155:3: this_Leaf_1= ruleLeaf
                    {

                    			newCompositeNode(grammarAccess.getIContainerContentAccess().getLeafParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Leaf_1=ruleLeaf();

                    state._fsp--;


                    			current = this_Leaf_1;
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
    // $ANTLR end "ruleIContainerContent"


    // $ANTLR start "entryRuleGroup"
    // InternalEKeyLang.g:167:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalEKeyLang.g:167:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalEKeyLang.g:168:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalEKeyLang.g:174:1: ruleGroup returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_leafs_3_0= ruleIContainerContent ) )* otherlv_4= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leafs_3_0 = null;



        	enterRule();

        try {
            // InternalEKeyLang.g:180:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_leafs_3_0= ruleIContainerContent ) )* otherlv_4= '}' ) )
            // InternalEKeyLang.g:181:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_leafs_3_0= ruleIContainerContent ) )* otherlv_4= '}' )
            {
            // InternalEKeyLang.g:181:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_leafs_3_0= ruleIContainerContent ) )* otherlv_4= '}' )
            // InternalEKeyLang.g:182:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_leafs_3_0= ruleIContainerContent ) )* otherlv_4= '}'
            {
            // InternalEKeyLang.g:182:3: ()
            // InternalEKeyLang.g:183:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            // InternalEKeyLang.g:189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEKeyLang.g:190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEKeyLang.g:190:4: (lv_name_1_0= RULE_ID )
            // InternalEKeyLang.g:191:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEKeyLang.g:211:3: ( (lv_leafs_3_0= ruleIContainerContent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEKeyLang.g:212:4: (lv_leafs_3_0= ruleIContainerContent )
            	    {
            	    // InternalEKeyLang.g:212:4: (lv_leafs_3_0= ruleIContainerContent )
            	    // InternalEKeyLang.g:213:5: lv_leafs_3_0= ruleIContainerContent
            	    {

            	    					newCompositeNode(grammarAccess.getGroupAccess().getLeafsIContainerContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_leafs_3_0=ruleIContainerContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"leafs",
            	    						lv_leafs_3_0,
            	    						"com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleLeaf"
    // InternalEKeyLang.g:238:1: entryRuleLeaf returns [EObject current=null] : iv_ruleLeaf= ruleLeaf EOF ;
    public final EObject entryRuleLeaf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeaf = null;


        try {
            // InternalEKeyLang.g:238:45: (iv_ruleLeaf= ruleLeaf EOF )
            // InternalEKeyLang.g:239:2: iv_ruleLeaf= ruleLeaf EOF
            {
             newCompositeNode(grammarAccess.getLeafRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeaf=ruleLeaf();

            state._fsp--;

             current =iv_ruleLeaf; 
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
    // $ANTLR end "entryRuleLeaf"


    // $ANTLR start "ruleLeaf"
    // InternalEKeyLang.g:245:1: ruleLeaf returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_number_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLeaf() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalEKeyLang.g:251:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_number_1_0= RULE_INT ) ) ) )
            // InternalEKeyLang.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_number_1_0= RULE_INT ) ) )
            {
            // InternalEKeyLang.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_number_1_0= RULE_INT ) ) )
            // InternalEKeyLang.g:253:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_number_1_0= RULE_INT ) )
            {
            // InternalEKeyLang.g:253:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEKeyLang.g:254:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEKeyLang.g:254:4: (lv_name_0_0= RULE_ID )
            // InternalEKeyLang.g:255:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeafRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEKeyLang.g:271:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalEKeyLang.g:272:4: (lv_number_1_0= RULE_INT )
            {
            // InternalEKeyLang.g:272:4: (lv_number_1_0= RULE_INT )
            // InternalEKeyLang.g:273:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_number_1_0, grammarAccess.getLeafAccess().getNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeafRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
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
    // $ANTLR end "ruleLeaf"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}