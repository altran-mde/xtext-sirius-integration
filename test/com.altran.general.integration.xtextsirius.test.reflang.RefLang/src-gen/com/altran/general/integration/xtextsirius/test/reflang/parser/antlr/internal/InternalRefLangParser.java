package com.altran.general.integration.xtextsirius.test.reflang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.altran.general.integration.xtextsirius.test.reflang.services.RefLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRefLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'1'", "'->'", "'/'", "'2'", "'3'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRefLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRefLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRefLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRefLang.g"; }



     	private RefLangGrammarAccess grammarAccess;

        public InternalRefLangParser(TokenStream input, RefLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Container";
       	}

       	@Override
       	protected RefLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContainer"
    // InternalRefLang.g:64:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalRefLang.g:64:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalRefLang.g:65:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalRefLang.g:71:1: ruleContainer returns [EObject current=null] : ( (lv_contents_0_0= ruleIContainerContent ) )* ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;



        	enterRule();

        try {
            // InternalRefLang.g:77:2: ( ( (lv_contents_0_0= ruleIContainerContent ) )* )
            // InternalRefLang.g:78:2: ( (lv_contents_0_0= ruleIContainerContent ) )*
            {
            // InternalRefLang.g:78:2: ( (lv_contents_0_0= ruleIContainerContent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRefLang.g:79:3: (lv_contents_0_0= ruleIContainerContent )
            	    {
            	    // InternalRefLang.g:79:3: (lv_contents_0_0= ruleIContainerContent )
            	    // InternalRefLang.g:80:4: lv_contents_0_0= ruleIContainerContent
            	    {

            	    				newCompositeNode(grammarAccess.getContainerAccess().getContentsIContainerContentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_contents_0_0=ruleIContainerContent();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getContainerRule());
            	    				}
            	    				add(
            	    					current,
            	    					"contents",
            	    					lv_contents_0_0,
            	    					"com.altran.general.integration.xtextsirius.test.reflang.RefLang.IContainerContent");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalRefLang.g:100:1: entryRuleIContainerContent returns [EObject current=null] : iv_ruleIContainerContent= ruleIContainerContent EOF ;
    public final EObject entryRuleIContainerContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIContainerContent = null;


        try {
            // InternalRefLang.g:100:58: (iv_ruleIContainerContent= ruleIContainerContent EOF )
            // InternalRefLang.g:101:2: iv_ruleIContainerContent= ruleIContainerContent EOF
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
    // InternalRefLang.g:107:1: ruleIContainerContent returns [EObject current=null] : (this_SubContainer_0= ruleSubContainer | this_Leaf_1= ruleLeaf ) ;
    public final EObject ruleIContainerContent() throws RecognitionException {
        EObject current = null;

        EObject this_SubContainer_0 = null;

        EObject this_Leaf_1 = null;



        	enterRule();

        try {
            // InternalRefLang.g:113:2: ( (this_SubContainer_0= ruleSubContainer | this_Leaf_1= ruleLeaf ) )
            // InternalRefLang.g:114:2: (this_SubContainer_0= ruleSubContainer | this_Leaf_1= ruleLeaf )
            {
            // InternalRefLang.g:114:2: (this_SubContainer_0= ruleSubContainer | this_Leaf_1= ruleLeaf )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RULE_ID||(LA2_1>=12 && LA2_1<=13)||(LA2_1>=16 && LA2_1<=17)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==11) ) {
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
                    // InternalRefLang.g:115:3: this_SubContainer_0= ruleSubContainer
                    {

                    			newCompositeNode(grammarAccess.getIContainerContentAccess().getSubContainerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubContainer_0=ruleSubContainer();

                    state._fsp--;


                    			current = this_SubContainer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRefLang.g:124:3: this_Leaf_1= ruleLeaf
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


    // $ANTLR start "entryRuleSubContainer"
    // InternalRefLang.g:136:1: entryRuleSubContainer returns [EObject current=null] : iv_ruleSubContainer= ruleSubContainer EOF ;
    public final EObject entryRuleSubContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubContainer = null;


        try {
            // InternalRefLang.g:136:53: (iv_ruleSubContainer= ruleSubContainer EOF )
            // InternalRefLang.g:137:2: iv_ruleSubContainer= ruleSubContainer EOF
            {
             newCompositeNode(grammarAccess.getSubContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubContainer=ruleSubContainer();

            state._fsp--;

             current =iv_ruleSubContainer; 
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
    // $ANTLR end "entryRuleSubContainer"


    // $ANTLR start "ruleSubContainer"
    // InternalRefLang.g:143:1: ruleSubContainer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )? ) ;
    public final EObject ruleSubContainer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_subContents_2_0 = null;

        EObject this_References_4 = null;

        EObject this_References2_5 = null;

        EObject this_References3_6 = null;



        	enterRule();

        try {
            // InternalRefLang.g:149:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )? ) )
            // InternalRefLang.g:150:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )? )
            {
            // InternalRefLang.g:150:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )? )
            // InternalRefLang.g:151:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )?
            {
            // InternalRefLang.g:151:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRefLang.g:152:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRefLang.g:152:4: (lv_name_0_0= RULE_ID )
            // InternalRefLang.g:153:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSubContainerAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubContainerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRefLang.g:173:3: ( (lv_subContents_2_0= ruleIContainerContent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRefLang.g:174:4: (lv_subContents_2_0= ruleIContainerContent )
            	    {
            	    // InternalRefLang.g:174:4: (lv_subContents_2_0= ruleIContainerContent )
            	    // InternalRefLang.g:175:5: lv_subContents_2_0= ruleIContainerContent
            	    {

            	    					newCompositeNode(grammarAccess.getSubContainerAccess().getSubContentsIContainerContentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_subContents_2_0=ruleIContainerContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subContents",
            	    						lv_subContents_2_0,
            	    						"com.altran.general.integration.xtextsirius.test.reflang.RefLang.IContainerContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSubContainerAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalRefLang.g:196:3: (this_References_4= ruleReferences[$current] )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRefLang.g:197:4: this_References_4= ruleReferences[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getSubContainerRule());
                    				}
                    				newCompositeNode(grammarAccess.getSubContainerAccess().getReferencesParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_7);
                    this_References_4=ruleReferences(current);

                    state._fsp--;


                    				current = this_References_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRefLang.g:209:3: (this_References2_5= ruleReferences2[$current] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRefLang.g:210:4: this_References2_5= ruleReferences2[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getSubContainerRule());
                    				}
                    				newCompositeNode(grammarAccess.getSubContainerAccess().getReferences2ParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_8);
                    this_References2_5=ruleReferences2(current);

                    state._fsp--;


                    				current = this_References2_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRefLang.g:222:3: (this_References3_6= ruleReferences3[$current] )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRefLang.g:223:4: this_References3_6= ruleReferences3[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getSubContainerRule());
                    				}
                    				newCompositeNode(grammarAccess.getSubContainerAccess().getReferences3ParserRuleCall_6());
                    			
                    pushFollow(FOLLOW_2);
                    this_References3_6=ruleReferences3(current);

                    state._fsp--;


                    				current = this_References3_6;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleSubContainer"


    // $ANTLR start "entryRuleLeaf"
    // InternalRefLang.g:239:1: entryRuleLeaf returns [EObject current=null] : iv_ruleLeaf= ruleLeaf EOF ;
    public final EObject entryRuleLeaf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeaf = null;


        try {
            // InternalRefLang.g:239:45: (iv_ruleLeaf= ruleLeaf EOF )
            // InternalRefLang.g:240:2: iv_ruleLeaf= ruleLeaf EOF
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
    // InternalRefLang.g:246:1: ruleLeaf returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )? ) ;
    public final EObject ruleLeaf() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject this_References_1 = null;

        EObject this_References2_2 = null;

        EObject this_References3_3 = null;



        	enterRule();

        try {
            // InternalRefLang.g:252:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )? ) )
            // InternalRefLang.g:253:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )? )
            {
            // InternalRefLang.g:253:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )? )
            // InternalRefLang.g:254:3: ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )?
            {
            // InternalRefLang.g:254:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRefLang.g:255:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRefLang.g:255:4: (lv_name_0_0= RULE_ID )
            // InternalRefLang.g:256:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalRefLang.g:272:3: (this_References_1= ruleReferences[$current] )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRefLang.g:273:4: this_References_1= ruleReferences[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getLeafRule());
                    				}
                    				newCompositeNode(grammarAccess.getLeafAccess().getReferencesParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_References_1=ruleReferences(current);

                    state._fsp--;


                    				current = this_References_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRefLang.g:285:3: (this_References2_2= ruleReferences2[$current] )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRefLang.g:286:4: this_References2_2= ruleReferences2[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getLeafRule());
                    				}
                    				newCompositeNode(grammarAccess.getLeafAccess().getReferences2ParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_References2_2=ruleReferences2(current);

                    state._fsp--;


                    				current = this_References2_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRefLang.g:298:3: (this_References3_3= ruleReferences3[$current] )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRefLang.g:299:4: this_References3_3= ruleReferences3[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getLeafRule());
                    				}
                    				newCompositeNode(grammarAccess.getLeafAccess().getReferences3ParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_References3_3=ruleReferences3(current);

                    state._fsp--;


                    				current = this_References3_3;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleLeaf"


    // $ANTLR start "ruleReferences"
    // InternalRefLang.g:316:1: ruleReferences[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )* ) ;
    public final EObject ruleReferences(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_references_1_0 = null;



        	enterRule();

        try {
            // InternalRefLang.g:322:2: ( (otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )* ) )
            // InternalRefLang.g:323:2: (otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )* )
            {
            // InternalRefLang.g:323:2: (otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )* )
            // InternalRefLang.g:324:3: otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReferencesAccess().getDigitOneKeyword_0());
            		
            // InternalRefLang.g:328:3: ( (lv_references_1_0= ruleReference ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRefLang.g:329:4: (lv_references_1_0= ruleReference )
            	    {
            	    // InternalRefLang.g:329:4: (lv_references_1_0= ruleReference )
            	    // InternalRefLang.g:330:5: lv_references_1_0= ruleReference
            	    {

            	    					newCompositeNode(grammarAccess.getReferencesAccess().getReferencesReferenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_references_1_0=ruleReference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferencesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"references",
            	    						lv_references_1_0,
            	    						"com.altran.general.integration.xtextsirius.test.reflang.RefLang.Reference");
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
    // $ANTLR end "ruleReferences"


    // $ANTLR start "entryRuleReference"
    // InternalRefLang.g:351:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalRefLang.g:351:50: (iv_ruleReference= ruleReference EOF )
            // InternalRefLang.g:352:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalRefLang.g:358:1: ruleReference returns [EObject current=null] : (otherlv_0= '->' ( ( ruleQID ) ) (otherlv_2= '/' ( ( ruleQID ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRefLang.g:364:2: ( (otherlv_0= '->' ( ( ruleQID ) ) (otherlv_2= '/' ( ( ruleQID ) ) )? ) )
            // InternalRefLang.g:365:2: (otherlv_0= '->' ( ( ruleQID ) ) (otherlv_2= '/' ( ( ruleQID ) ) )? )
            {
            // InternalRefLang.g:365:2: (otherlv_0= '->' ( ( ruleQID ) ) (otherlv_2= '/' ( ( ruleQID ) ) )? )
            // InternalRefLang.g:366:3: otherlv_0= '->' ( ( ruleQID ) ) (otherlv_2= '/' ( ( ruleQID ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalRefLang.g:370:3: ( ( ruleQID ) )
            // InternalRefLang.g:371:4: ( ruleQID )
            {
            // InternalRefLang.g:371:4: ( ruleQID )
            // InternalRefLang.g:372:5: ruleQID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetIContainerContentCrossReference_1_0());
            				
            pushFollow(FOLLOW_11);
            ruleQID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRefLang.g:386:3: (otherlv_2= '/' ( ( ruleQID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRefLang.g:387:4: otherlv_2= '/' ( ( ruleQID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getSolidusKeyword_2_0());
                    			
                    // InternalRefLang.g:391:4: ( ( ruleQID ) )
                    // InternalRefLang.g:392:5: ( ruleQID )
                    {
                    // InternalRefLang.g:392:5: ( ruleQID )
                    // InternalRefLang.g:393:6: ruleQID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getTarget2IContainerContentCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleReference"


    // $ANTLR start "ruleReferences2"
    // InternalRefLang.g:413:1: ruleReferences2[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )* ) ;
    public final EObject ruleReferences2(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_references2_1_0 = null;



        	enterRule();

        try {
            // InternalRefLang.g:419:2: ( (otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )* ) )
            // InternalRefLang.g:420:2: (otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )* )
            {
            // InternalRefLang.g:420:2: (otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )* )
            // InternalRefLang.g:421:3: otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReferences2Access().getDigitTwoKeyword_0());
            		
            // InternalRefLang.g:425:3: ( (lv_references2_1_0= ruleReference ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRefLang.g:426:4: (lv_references2_1_0= ruleReference )
            	    {
            	    // InternalRefLang.g:426:4: (lv_references2_1_0= ruleReference )
            	    // InternalRefLang.g:427:5: lv_references2_1_0= ruleReference
            	    {

            	    					newCompositeNode(grammarAccess.getReferences2Access().getReferences2ReferenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_references2_1_0=ruleReference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferences2Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"references2",
            	    						lv_references2_1_0,
            	    						"com.altran.general.integration.xtextsirius.test.reflang.RefLang.Reference");
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
    // $ANTLR end "ruleReferences2"


    // $ANTLR start "ruleReferences3"
    // InternalRefLang.g:449:1: ruleReferences3[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )* ) ;
    public final EObject ruleReferences3(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_references3_1_0 = null;



        	enterRule();

        try {
            // InternalRefLang.g:455:2: ( (otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )* ) )
            // InternalRefLang.g:456:2: (otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )* )
            {
            // InternalRefLang.g:456:2: (otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )* )
            // InternalRefLang.g:457:3: otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReferences3Access().getDigitThreeKeyword_0());
            		
            // InternalRefLang.g:461:3: ( (lv_references3_1_0= ruleReference3 ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRefLang.g:462:4: (lv_references3_1_0= ruleReference3 )
            	    {
            	    // InternalRefLang.g:462:4: (lv_references3_1_0= ruleReference3 )
            	    // InternalRefLang.g:463:5: lv_references3_1_0= ruleReference3
            	    {

            	    					newCompositeNode(grammarAccess.getReferences3Access().getReferences3Reference3ParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_references3_1_0=ruleReference3();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferences3Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"references3",
            	    						lv_references3_1_0,
            	    						"com.altran.general.integration.xtextsirius.test.reflang.RefLang.Reference3");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleReferences3"


    // $ANTLR start "entryRuleReference3"
    // InternalRefLang.g:484:1: entryRuleReference3 returns [EObject current=null] : iv_ruleReference3= ruleReference3 EOF ;
    public final EObject entryRuleReference3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference3 = null;


        try {
            // InternalRefLang.g:484:51: (iv_ruleReference3= ruleReference3 EOF )
            // InternalRefLang.g:485:2: iv_ruleReference3= ruleReference3 EOF
            {
             newCompositeNode(grammarAccess.getReference3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference3=ruleReference3();

            state._fsp--;

             current =iv_ruleReference3; 
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
    // $ANTLR end "entryRuleReference3"


    // $ANTLR start "ruleReference3"
    // InternalRefLang.g:491:1: ruleReference3 returns [EObject current=null] : (otherlv_0= '->' ( ( ruleQID ) ) ) ;
    public final EObject ruleReference3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRefLang.g:497:2: ( (otherlv_0= '->' ( ( ruleQID ) ) ) )
            // InternalRefLang.g:498:2: (otherlv_0= '->' ( ( ruleQID ) ) )
            {
            // InternalRefLang.g:498:2: (otherlv_0= '->' ( ( ruleQID ) ) )
            // InternalRefLang.g:499:3: otherlv_0= '->' ( ( ruleQID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getReference3Access().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalRefLang.g:503:3: ( ( ruleQID ) )
            // InternalRefLang.g:504:4: ( ruleQID )
            {
            // InternalRefLang.g:504:4: ( ruleQID )
            // InternalRefLang.g:505:5: ruleQID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReference3Rule());
            					}
            				

            					newCompositeNode(grammarAccess.getReference3Access().getTarget3IContainerContentCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQID();

            state._fsp--;


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
    // $ANTLR end "ruleReference3"


    // $ANTLR start "entryRuleQID"
    // InternalRefLang.g:523:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // InternalRefLang.g:523:43: (iv_ruleQID= ruleQID EOF )
            // InternalRefLang.g:524:2: iv_ruleQID= ruleQID EOF
            {
             newCompositeNode(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQID=ruleQID();

            state._fsp--;

             current =iv_ruleQID.getText(); 
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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // InternalRefLang.g:530:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRefLang.g:536:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRefLang.g:537:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRefLang.g:537:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRefLang.g:538:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalRefLang.g:545:3: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRefLang.g:546:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleQID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000032002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});

}