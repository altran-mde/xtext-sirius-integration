package com.altran.general.integration.xtextsirius.test.reflang.edit.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.altran.general.integration.xtextsirius.test.reflang.edit.services.RefLangEditGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRefLangEditParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'{'", "'}'", "'1'", "'2'", "'3'", "'.'"
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
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRefLangEditParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRefLangEditParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRefLangEditParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRefLangEdit.g"; }



     	private RefLangEditGrammarAccess grammarAccess;

        public InternalRefLangEditParser(TokenStream input, RefLangEditGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "XContainer";
       	}

       	@Override
       	protected RefLangEditGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleXContainer"
    // InternalRefLangEdit.g:64:1: entryRuleXContainer returns [EObject current=null] : iv_ruleXContainer= ruleXContainer EOF ;
    public final EObject entryRuleXContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXContainer = null;


        try {
            // InternalRefLangEdit.g:64:51: (iv_ruleXContainer= ruleXContainer EOF )
            // InternalRefLangEdit.g:65:2: iv_ruleXContainer= ruleXContainer EOF
            {
             newCompositeNode(grammarAccess.getXContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXContainer=ruleXContainer();

            state._fsp--;

             current =iv_ruleXContainer; 
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
    // $ANTLR end "entryRuleXContainer"


    // $ANTLR start "ruleXContainer"
    // InternalRefLangEdit.g:71:1: ruleXContainer returns [EObject current=null] : this_Container_0= ruleContainer ;
    public final EObject ruleXContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;



        	enterRule();

        try {
            // InternalRefLangEdit.g:77:2: (this_Container_0= ruleContainer )
            // InternalRefLangEdit.g:78:2: this_Container_0= ruleContainer
            {

            		newCompositeNode(grammarAccess.getXContainerAccess().getContainerParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Container_0=ruleContainer();

            state._fsp--;


            		current = this_Container_0;
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
    // $ANTLR end "ruleXContainer"


    // $ANTLR start "entryRuleReference"
    // InternalRefLangEdit.g:89:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalRefLangEdit.g:89:50: (iv_ruleReference= ruleReference EOF )
            // InternalRefLangEdit.g:90:2: iv_ruleReference= ruleReference EOF
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
    // InternalRefLangEdit.g:96:1: ruleReference returns [EObject current=null] : (otherlv_0= '->' ( ( ruleQID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRefLangEdit.g:102:2: ( (otherlv_0= '->' ( ( ruleQID ) ) ) )
            // InternalRefLangEdit.g:103:2: (otherlv_0= '->' ( ( ruleQID ) ) )
            {
            // InternalRefLangEdit.g:103:2: (otherlv_0= '->' ( ( ruleQID ) ) )
            // InternalRefLangEdit.g:104:3: otherlv_0= '->' ( ( ruleQID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalRefLangEdit.g:108:3: ( ( ruleQID ) )
            // InternalRefLangEdit.g:109:4: ( ruleQID )
            {
            // InternalRefLangEdit.g:109:4: ( ruleQID )
            // InternalRefLangEdit.g:110:5: ruleQID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetIContainerContentCrossReference_1_0());
            				
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleContainer"
    // InternalRefLangEdit.g:128:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalRefLangEdit.g:128:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalRefLangEdit.g:129:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalRefLangEdit.g:135:1: ruleContainer returns [EObject current=null] : ( (lv_contents_0_0= ruleIContainerContent ) )* ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;



        	enterRule();

        try {
            // InternalRefLangEdit.g:141:2: ( ( (lv_contents_0_0= ruleIContainerContent ) )* )
            // InternalRefLangEdit.g:142:2: ( (lv_contents_0_0= ruleIContainerContent ) )*
            {
            // InternalRefLangEdit.g:142:2: ( (lv_contents_0_0= ruleIContainerContent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRefLangEdit.g:143:3: (lv_contents_0_0= ruleIContainerContent )
            	    {
            	    // InternalRefLangEdit.g:143:3: (lv_contents_0_0= ruleIContainerContent )
            	    // InternalRefLangEdit.g:144:4: lv_contents_0_0= ruleIContainerContent
            	    {

            	    				newCompositeNode(grammarAccess.getContainerAccess().getContentsIContainerContentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_4);
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
    // InternalRefLangEdit.g:164:1: entryRuleIContainerContent returns [EObject current=null] : iv_ruleIContainerContent= ruleIContainerContent EOF ;
    public final EObject entryRuleIContainerContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIContainerContent = null;


        try {
            // InternalRefLangEdit.g:164:58: (iv_ruleIContainerContent= ruleIContainerContent EOF )
            // InternalRefLangEdit.g:165:2: iv_ruleIContainerContent= ruleIContainerContent EOF
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
    // InternalRefLangEdit.g:171:1: ruleIContainerContent returns [EObject current=null] : (this_SubContainer_0= ruleSubContainer | this_Leaf_1= ruleLeaf ) ;
    public final EObject ruleIContainerContent() throws RecognitionException {
        EObject current = null;

        EObject this_SubContainer_0 = null;

        EObject this_Leaf_1 = null;



        	enterRule();

        try {
            // InternalRefLangEdit.g:177:2: ( (this_SubContainer_0= ruleSubContainer | this_Leaf_1= ruleLeaf ) )
            // InternalRefLangEdit.g:178:2: (this_SubContainer_0= ruleSubContainer | this_Leaf_1= ruleLeaf )
            {
            // InternalRefLangEdit.g:178:2: (this_SubContainer_0= ruleSubContainer | this_Leaf_1= ruleLeaf )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RULE_ID||(LA2_1>=13 && LA2_1<=16)) ) {
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
                    // InternalRefLangEdit.g:179:3: this_SubContainer_0= ruleSubContainer
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
                    // InternalRefLangEdit.g:188:3: this_Leaf_1= ruleLeaf
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
    // InternalRefLangEdit.g:200:1: entryRuleSubContainer returns [EObject current=null] : iv_ruleSubContainer= ruleSubContainer EOF ;
    public final EObject entryRuleSubContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubContainer = null;


        try {
            // InternalRefLangEdit.g:200:53: (iv_ruleSubContainer= ruleSubContainer EOF )
            // InternalRefLangEdit.g:201:2: iv_ruleSubContainer= ruleSubContainer EOF
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
    // InternalRefLangEdit.g:207:1: ruleSubContainer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )? ) ;
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
            // InternalRefLangEdit.g:213:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )? ) )
            // InternalRefLangEdit.g:214:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )? )
            {
            // InternalRefLangEdit.g:214:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )? )
            // InternalRefLangEdit.g:215:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_subContents_2_0= ruleIContainerContent ) )* otherlv_3= '}' (this_References_4= ruleReferences[$current] )? (this_References2_5= ruleReferences2[$current] )? (this_References3_6= ruleReferences3[$current] )?
            {
            // InternalRefLangEdit.g:215:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRefLangEdit.g:216:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRefLangEdit.g:216:4: (lv_name_0_0= RULE_ID )
            // InternalRefLangEdit.g:217:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSubContainerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRefLangEdit.g:237:3: ( (lv_subContents_2_0= ruleIContainerContent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRefLangEdit.g:238:4: (lv_subContents_2_0= ruleIContainerContent )
            	    {
            	    // InternalRefLangEdit.g:238:4: (lv_subContents_2_0= ruleIContainerContent )
            	    // InternalRefLangEdit.g:239:5: lv_subContents_2_0= ruleIContainerContent
            	    {

            	    					newCompositeNode(grammarAccess.getSubContainerAccess().getSubContentsIContainerContentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubContainerAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalRefLangEdit.g:260:3: (this_References_4= ruleReferences[$current] )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRefLangEdit.g:261:4: this_References_4= ruleReferences[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getSubContainerRule());
                    				}
                    				newCompositeNode(grammarAccess.getSubContainerAccess().getReferencesParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_8);
                    this_References_4=ruleReferences(current);

                    state._fsp--;


                    				current = this_References_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRefLangEdit.g:273:3: (this_References2_5= ruleReferences2[$current] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRefLangEdit.g:274:4: this_References2_5= ruleReferences2[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getSubContainerRule());
                    				}
                    				newCompositeNode(grammarAccess.getSubContainerAccess().getReferences2ParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_9);
                    this_References2_5=ruleReferences2(current);

                    state._fsp--;


                    				current = this_References2_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRefLangEdit.g:286:3: (this_References3_6= ruleReferences3[$current] )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRefLangEdit.g:287:4: this_References3_6= ruleReferences3[$current]
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
    // InternalRefLangEdit.g:303:1: entryRuleLeaf returns [EObject current=null] : iv_ruleLeaf= ruleLeaf EOF ;
    public final EObject entryRuleLeaf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeaf = null;


        try {
            // InternalRefLangEdit.g:303:45: (iv_ruleLeaf= ruleLeaf EOF )
            // InternalRefLangEdit.g:304:2: iv_ruleLeaf= ruleLeaf EOF
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
    // InternalRefLangEdit.g:310:1: ruleLeaf returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )? ) ;
    public final EObject ruleLeaf() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject this_References_1 = null;

        EObject this_References2_2 = null;

        EObject this_References3_3 = null;



        	enterRule();

        try {
            // InternalRefLangEdit.g:316:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )? ) )
            // InternalRefLangEdit.g:317:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )? )
            {
            // InternalRefLangEdit.g:317:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )? )
            // InternalRefLangEdit.g:318:3: ( (lv_name_0_0= RULE_ID ) ) (this_References_1= ruleReferences[$current] )? (this_References2_2= ruleReferences2[$current] )? (this_References3_3= ruleReferences3[$current] )?
            {
            // InternalRefLangEdit.g:318:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRefLangEdit.g:319:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRefLangEdit.g:319:4: (lv_name_0_0= RULE_ID )
            // InternalRefLangEdit.g:320:5: lv_name_0_0= RULE_ID
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

            // InternalRefLangEdit.g:336:3: (this_References_1= ruleReferences[$current] )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRefLangEdit.g:337:4: this_References_1= ruleReferences[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getLeafRule());
                    				}
                    				newCompositeNode(grammarAccess.getLeafAccess().getReferencesParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_References_1=ruleReferences(current);

                    state._fsp--;


                    				current = this_References_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRefLangEdit.g:349:3: (this_References2_2= ruleReferences2[$current] )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRefLangEdit.g:350:4: this_References2_2= ruleReferences2[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getLeafRule());
                    				}
                    				newCompositeNode(grammarAccess.getLeafAccess().getReferences2ParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_9);
                    this_References2_2=ruleReferences2(current);

                    state._fsp--;


                    				current = this_References2_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRefLangEdit.g:362:3: (this_References3_3= ruleReferences3[$current] )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRefLangEdit.g:363:4: this_References3_3= ruleReferences3[$current]
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
    // InternalRefLangEdit.g:380:1: ruleReferences[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )* ) ;
    public final EObject ruleReferences(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_references_1_0 = null;



        	enterRule();

        try {
            // InternalRefLangEdit.g:386:2: ( (otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )* ) )
            // InternalRefLangEdit.g:387:2: (otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )* )
            {
            // InternalRefLangEdit.g:387:2: (otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )* )
            // InternalRefLangEdit.g:388:3: otherlv_0= '1' ( (lv_references_1_0= ruleReference ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getReferencesAccess().getDigitOneKeyword_0());
            		
            // InternalRefLangEdit.g:392:3: ( (lv_references_1_0= ruleReference ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRefLangEdit.g:393:4: (lv_references_1_0= ruleReference )
            	    {
            	    // InternalRefLangEdit.g:393:4: (lv_references_1_0= ruleReference )
            	    // InternalRefLangEdit.g:394:5: lv_references_1_0= ruleReference
            	    {

            	    					newCompositeNode(grammarAccess.getReferencesAccess().getReferencesReferenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_references_1_0=ruleReference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferencesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"references",
            	    						lv_references_1_0,
            	    						"com.altran.general.integration.xtextsirius.test.reflang.edit.RefLangEdit.Reference");
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


    // $ANTLR start "ruleReferences2"
    // InternalRefLangEdit.g:416:1: ruleReferences2[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )* ) ;
    public final EObject ruleReferences2(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_references2_1_0 = null;



        	enterRule();

        try {
            // InternalRefLangEdit.g:422:2: ( (otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )* ) )
            // InternalRefLangEdit.g:423:2: (otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )* )
            {
            // InternalRefLangEdit.g:423:2: (otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )* )
            // InternalRefLangEdit.g:424:3: otherlv_0= '2' ( (lv_references2_1_0= ruleReference ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getReferences2Access().getDigitTwoKeyword_0());
            		
            // InternalRefLangEdit.g:428:3: ( (lv_references2_1_0= ruleReference ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRefLangEdit.g:429:4: (lv_references2_1_0= ruleReference )
            	    {
            	    // InternalRefLangEdit.g:429:4: (lv_references2_1_0= ruleReference )
            	    // InternalRefLangEdit.g:430:5: lv_references2_1_0= ruleReference
            	    {

            	    					newCompositeNode(grammarAccess.getReferences2Access().getReferences2ReferenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_references2_1_0=ruleReference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferences2Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"references2",
            	    						lv_references2_1_0,
            	    						"com.altran.general.integration.xtextsirius.test.reflang.edit.RefLangEdit.Reference");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRefLangEdit.g:452:1: ruleReferences3[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )* ) ;
    public final EObject ruleReferences3(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_references3_1_0 = null;



        	enterRule();

        try {
            // InternalRefLangEdit.g:458:2: ( (otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )* ) )
            // InternalRefLangEdit.g:459:2: (otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )* )
            {
            // InternalRefLangEdit.g:459:2: (otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )* )
            // InternalRefLangEdit.g:460:3: otherlv_0= '3' ( (lv_references3_1_0= ruleReference3 ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getReferences3Access().getDigitThreeKeyword_0());
            		
            // InternalRefLangEdit.g:464:3: ( (lv_references3_1_0= ruleReference3 ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRefLangEdit.g:465:4: (lv_references3_1_0= ruleReference3 )
            	    {
            	    // InternalRefLangEdit.g:465:4: (lv_references3_1_0= ruleReference3 )
            	    // InternalRefLangEdit.g:466:5: lv_references3_1_0= ruleReference3
            	    {

            	    					newCompositeNode(grammarAccess.getReferences3Access().getReferences3Reference3ParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // $ANTLR end "ruleReferences3"


    // $ANTLR start "entryRuleReference3"
    // InternalRefLangEdit.g:487:1: entryRuleReference3 returns [EObject current=null] : iv_ruleReference3= ruleReference3 EOF ;
    public final EObject entryRuleReference3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference3 = null;


        try {
            // InternalRefLangEdit.g:487:51: (iv_ruleReference3= ruleReference3 EOF )
            // InternalRefLangEdit.g:488:2: iv_ruleReference3= ruleReference3 EOF
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
    // InternalRefLangEdit.g:494:1: ruleReference3 returns [EObject current=null] : (otherlv_0= '->' ( ( ruleQID ) ) ) ;
    public final EObject ruleReference3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRefLangEdit.g:500:2: ( (otherlv_0= '->' ( ( ruleQID ) ) ) )
            // InternalRefLangEdit.g:501:2: (otherlv_0= '->' ( ( ruleQID ) ) )
            {
            // InternalRefLangEdit.g:501:2: (otherlv_0= '->' ( ( ruleQID ) ) )
            // InternalRefLangEdit.g:502:3: otherlv_0= '->' ( ( ruleQID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReference3Access().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalRefLangEdit.g:506:3: ( ( ruleQID ) )
            // InternalRefLangEdit.g:507:4: ( ruleQID )
            {
            // InternalRefLangEdit.g:507:4: ( ruleQID )
            // InternalRefLangEdit.g:508:5: ruleQID
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
    // InternalRefLangEdit.g:526:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // InternalRefLangEdit.g:526:43: (iv_ruleQID= ruleQID EOF )
            // InternalRefLangEdit.g:527:2: iv_ruleQID= ruleQID EOF
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
    // InternalRefLangEdit.g:533:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRefLangEdit.g:539:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRefLangEdit.g:540:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRefLangEdit.g:540:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRefLangEdit.g:541:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalRefLangEdit.g:548:3: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRefLangEdit.g:549:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});

}