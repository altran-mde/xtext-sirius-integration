package com.example.classes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.example.classes.services.InlineeditGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInlineeditParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DESCRIPTION_TEXT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'association'", "'['", "'..'", "']'", "'-->'", "'constant'", "'='", "'class'", "'{'", "'}'", "':'", "'string'", "'integer'", "'+'", "'public'", "'#'", "'protected'", "'-'", "'private'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_DESCRIPTION_TEXT=6;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalInlineeditParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInlineeditParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInlineeditParser.tokenNames; }
    public String getGrammarFileName() { return "InternalInlineedit.g"; }



     	private InlineeditGrammarAccess grammarAccess;

        public InternalInlineeditParser(TokenStream input, InlineeditGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "InlineClassModel";
       	}

       	@Override
       	protected InlineeditGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInlineClassModel"
    // InternalInlineedit.g:65:1: entryRuleInlineClassModel returns [EObject current=null] : iv_ruleInlineClassModel= ruleInlineClassModel EOF ;
    public final EObject entryRuleInlineClassModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineClassModel = null;


        try {
            // InternalInlineedit.g:65:57: (iv_ruleInlineClassModel= ruleInlineClassModel EOF )
            // InternalInlineedit.g:66:2: iv_ruleInlineClassModel= ruleInlineClassModel EOF
            {
             newCompositeNode(grammarAccess.getInlineClassModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineClassModel=ruleInlineClassModel();

            state._fsp--;

             current =iv_ruleInlineClassModel; 
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
    // $ANTLR end "entryRuleInlineClassModel"


    // $ANTLR start "ruleInlineClassModel"
    // InternalInlineedit.g:72:1: ruleInlineClassModel returns [EObject current=null] : this_ClassModel_0= ruleClassModel ;
    public final EObject ruleInlineClassModel() throws RecognitionException {
        EObject current = null;

        EObject this_ClassModel_0 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:78:2: (this_ClassModel_0= ruleClassModel )
            // InternalInlineedit.g:79:2: this_ClassModel_0= ruleClassModel
            {

            		newCompositeNode(grammarAccess.getInlineClassModelAccess().getClassModelParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ClassModel_0=ruleClassModel();

            state._fsp--;


            		current = this_ClassModel_0;
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
    // $ANTLR end "ruleInlineClassModel"


    // $ANTLR start "entryRuleAssociation"
    // InternalInlineedit.g:90:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalInlineedit.g:90:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalInlineedit.g:91:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalInlineedit.g:97:1: ruleAssociation returns [EObject current=null] : ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_lowerBound_4_0= ruleValue ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleValue ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '-->' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject this_Description_0 = null;

        EObject lv_lowerBound_4_0 = null;

        EObject lv_upperBound_6_0 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:103:2: ( ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_lowerBound_4_0= ruleValue ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleValue ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '-->' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalInlineedit.g:104:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_lowerBound_4_0= ruleValue ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleValue ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '-->' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalInlineedit.g:104:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_lowerBound_4_0= ruleValue ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleValue ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '-->' ( (otherlv_10= RULE_ID ) ) )
            // InternalInlineedit.g:105:3: (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_lowerBound_4_0= ruleValue ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleValue ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '-->' ( (otherlv_10= RULE_ID ) )
            {
            // InternalInlineedit.g:105:3: (this_Description_0= ruleDescription[$current] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DESCRIPTION_TEXT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalInlineedit.g:106:4: this_Description_0= ruleDescription[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getAssociationRule());
                    				}
                    				newCompositeNode(grammarAccess.getAssociationAccess().getDescriptionParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_Description_0=ruleDescription(current);

                    state._fsp--;


                    				current = this_Description_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalInlineedit.g:122:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalInlineedit.g:123:4: (lv_name_2_0= RULE_ID )
            {
            // InternalInlineedit.g:123:4: (lv_name_2_0= RULE_ID )
            // InternalInlineedit.g:124:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalInlineedit.g:144:3: ( (lv_lowerBound_4_0= ruleValue ) )
            // InternalInlineedit.g:145:4: (lv_lowerBound_4_0= ruleValue )
            {
            // InternalInlineedit.g:145:4: (lv_lowerBound_4_0= ruleValue )
            // InternalInlineedit.g:146:5: lv_lowerBound_4_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getLowerBoundValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_lowerBound_4_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_4_0,
            						"com.example.Classes.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getFullStopFullStopKeyword_5());
            		
            // InternalInlineedit.g:167:3: ( (lv_upperBound_6_0= ruleValue ) )
            // InternalInlineedit.g:168:4: (lv_upperBound_6_0= ruleValue )
            {
            // InternalInlineedit.g:168:4: (lv_upperBound_6_0= ruleValue )
            // InternalInlineedit.g:169:5: lv_upperBound_6_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getUpperBoundValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_upperBound_6_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_6_0,
            						"com.example.Classes.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_7());
            		
            // InternalInlineedit.g:190:3: ( (otherlv_8= RULE_ID ) )
            // InternalInlineedit.g:191:4: (otherlv_8= RULE_ID )
            {
            // InternalInlineedit.g:191:4: (otherlv_8= RULE_ID )
            // InternalInlineedit.g:192:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getSourceClassCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_9());
            		
            // InternalInlineedit.g:207:3: ( (otherlv_10= RULE_ID ) )
            // InternalInlineedit.g:208:4: (otherlv_10= RULE_ID )
            {
            // InternalInlineedit.g:208:4: (otherlv_10= RULE_ID )
            // InternalInlineedit.g:209:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getTargetClassCrossReference_10_0());
            				

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleClassModel"
    // InternalInlineedit.g:224:1: entryRuleClassModel returns [EObject current=null] : iv_ruleClassModel= ruleClassModel EOF ;
    public final EObject entryRuleClassModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassModel = null;


        try {
            // InternalInlineedit.g:224:51: (iv_ruleClassModel= ruleClassModel EOF )
            // InternalInlineedit.g:225:2: iv_ruleClassModel= ruleClassModel EOF
            {
             newCompositeNode(grammarAccess.getClassModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassModel=ruleClassModel();

            state._fsp--;

             current =iv_ruleClassModel; 
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
    // $ANTLR end "entryRuleClassModel"


    // $ANTLR start "ruleClassModel"
    // InternalInlineedit.g:231:1: ruleClassModel returns [EObject current=null] : ( (lv_content_0_0= ruleContent ) )* ;
    public final EObject ruleClassModel() throws RecognitionException {
        EObject current = null;

        EObject lv_content_0_0 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:237:2: ( ( (lv_content_0_0= ruleContent ) )* )
            // InternalInlineedit.g:238:2: ( (lv_content_0_0= ruleContent ) )*
            {
            // InternalInlineedit.g:238:2: ( (lv_content_0_0= ruleContent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DESCRIPTION_TEXT||LA2_0==12||LA2_0==17||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalInlineedit.g:239:3: (lv_content_0_0= ruleContent )
            	    {
            	    // InternalInlineedit.g:239:3: (lv_content_0_0= ruleContent )
            	    // InternalInlineedit.g:240:4: lv_content_0_0= ruleContent
            	    {

            	    				newCompositeNode(grammarAccess.getClassModelAccess().getContentContentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_10);
            	    lv_content_0_0=ruleContent();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getClassModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"content",
            	    					lv_content_0_0,
            	    					"com.example.Classes.Content");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleClassModel"


    // $ANTLR start "entryRuleContent"
    // InternalInlineedit.g:260:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalInlineedit.g:260:48: (iv_ruleContent= ruleContent EOF )
            // InternalInlineedit.g:261:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalInlineedit.g:267:1: ruleContent returns [EObject current=null] : (this_Constant_0= ruleConstant | this_Class_1= ruleClass | this_Association_2= ruleAssociation ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_Class_1 = null;

        EObject this_Association_2 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:273:2: ( (this_Constant_0= ruleConstant | this_Class_1= ruleClass | this_Association_2= ruleAssociation ) )
            // InternalInlineedit.g:274:2: (this_Constant_0= ruleConstant | this_Class_1= ruleClass | this_Association_2= ruleAssociation )
            {
            // InternalInlineedit.g:274:2: (this_Constant_0= ruleConstant | this_Class_1= ruleClass | this_Association_2= ruleAssociation )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_DESCRIPTION_TEXT:
                {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    alt3=3;
                    }
                    break;
                case 19:
                    {
                    alt3=2;
                    }
                    break;
                case 17:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 17:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalInlineedit.g:275:3: this_Constant_0= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_0=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:284:3: this_Class_1= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_1=ruleClass();

                    state._fsp--;


                    			current = this_Class_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalInlineedit.g:293:3: this_Association_2= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getAssociationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_2=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_2;
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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleConstant"
    // InternalInlineedit.g:305:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalInlineedit.g:305:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalInlineedit.g:306:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalInlineedit.g:312:1: ruleConstant returns [EObject current=null] : ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject this_Description_0 = null;

        EObject lv_initial_4_0 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:318:2: ( ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) ) ) )
            // InternalInlineedit.g:319:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) ) )
            {
            // InternalInlineedit.g:319:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) ) )
            // InternalInlineedit.g:320:3: (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) )
            {
            // InternalInlineedit.g:320:3: (this_Description_0= ruleDescription[$current] )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DESCRIPTION_TEXT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalInlineedit.g:321:4: this_Description_0= ruleDescription[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getConstantRule());
                    				}
                    				newCompositeNode(grammarAccess.getConstantAccess().getDescriptionParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_Description_0=ruleDescription(current);

                    state._fsp--;


                    				current = this_Description_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstantKeyword_1());
            		
            // InternalInlineedit.g:337:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalInlineedit.g:338:4: (lv_name_2_0= RULE_ID )
            {
            // InternalInlineedit.g:338:4: (lv_name_2_0= RULE_ID )
            // InternalInlineedit.g:339:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
            		
            // InternalInlineedit.g:359:3: ( (lv_initial_4_0= ruleValue ) )
            // InternalInlineedit.g:360:4: (lv_initial_4_0= ruleValue )
            {
            // InternalInlineedit.g:360:4: (lv_initial_4_0= ruleValue )
            // InternalInlineedit.g:361:5: lv_initial_4_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getConstantAccess().getInitialValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_initial_4_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantRule());
            					}
            					set(
            						current,
            						"initial",
            						lv_initial_4_0,
            						"com.example.Classes.Value");
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


    // $ANTLR start "entryRuleClass"
    // InternalInlineedit.g:382:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalInlineedit.g:382:46: (iv_ruleClass= ruleClass EOF )
            // InternalInlineedit.g:383:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalInlineedit.g:389:1: ruleClass returns [EObject current=null] : ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_subClasses_4_0= ruleClass ) )* ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject this_Description_0 = null;

        EObject lv_subClasses_4_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:395:2: ( ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_subClasses_4_0= ruleClass ) )* ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalInlineedit.g:396:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_subClasses_4_0= ruleClass ) )* ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalInlineedit.g:396:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_subClasses_4_0= ruleClass ) )* ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalInlineedit.g:397:3: (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_subClasses_4_0= ruleClass ) )* ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            // InternalInlineedit.g:397:3: (this_Description_0= ruleDescription[$current] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DESCRIPTION_TEXT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalInlineedit.g:398:4: this_Description_0= ruleDescription[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getClassRule());
                    				}
                    				newCompositeNode(grammarAccess.getClassAccess().getDescriptionParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_Description_0=ruleDescription(current);

                    state._fsp--;


                    				current = this_Description_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalInlineedit.g:414:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalInlineedit.g:415:4: (lv_name_2_0= RULE_ID )
            {
            // InternalInlineedit.g:415:4: (lv_name_2_0= RULE_ID )
            // InternalInlineedit.g:416:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInlineedit.g:436:3: ( (lv_subClasses_4_0= ruleClass ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DESCRIPTION_TEXT) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==19) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalInlineedit.g:437:4: (lv_subClasses_4_0= ruleClass )
            	    {
            	    // InternalInlineedit.g:437:4: (lv_subClasses_4_0= ruleClass )
            	    // InternalInlineedit.g:438:5: lv_subClasses_4_0= ruleClass
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getSubClassesClassParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_subClasses_4_0=ruleClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subClasses",
            	    						lv_subClasses_4_0,
            	    						"com.example.Classes.Class");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalInlineedit.g:455:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_DESCRIPTION_TEXT||(LA7_0>=25 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInlineedit.g:456:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalInlineedit.g:456:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalInlineedit.g:457:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"com.example.Classes.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalInlineedit.g:482:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalInlineedit.g:482:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalInlineedit.g:483:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalInlineedit.g:489:1: ruleAttribute returns [EObject current=null] : ( (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Description_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_lowerBound_6_0 = null;

        EObject lv_upperBound_8_0 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:495:2: ( ( (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']' ) )
            // InternalInlineedit.g:496:2: ( (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']' )
            {
            // InternalInlineedit.g:496:2: ( (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']' )
            // InternalInlineedit.g:497:3: (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']'
            {
            // InternalInlineedit.g:497:3: (this_Description_0= ruleDescription[$current] )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DESCRIPTION_TEXT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInlineedit.g:498:4: this_Description_0= ruleDescription[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getAttributeRule());
                    				}
                    				newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_Description_0=ruleDescription(current);

                    state._fsp--;


                    				current = this_Description_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalInlineedit.g:510:3: ( (lv_visibility_1_0= ruleVisibility ) )
            // InternalInlineedit.g:511:4: (lv_visibility_1_0= ruleVisibility )
            {
            // InternalInlineedit.g:511:4: (lv_visibility_1_0= ruleVisibility )
            // InternalInlineedit.g:512:5: lv_visibility_1_0= ruleVisibility
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_visibility_1_0=ruleVisibility();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"visibility",
            						lv_visibility_1_0,
            						"com.example.Classes.Visibility");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInlineedit.g:529:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalInlineedit.g:530:4: (lv_name_2_0= RULE_ID )
            {
            // InternalInlineedit.g:530:4: (lv_name_2_0= RULE_ID )
            // InternalInlineedit.g:531:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalInlineedit.g:551:3: ( (lv_type_4_0= ruleType ) )
            // InternalInlineedit.g:552:4: (lv_type_4_0= ruleType )
            {
            // InternalInlineedit.g:552:4: (lv_type_4_0= ruleType )
            // InternalInlineedit.g:553:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"com.example.Classes.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalInlineedit.g:574:3: ( (lv_lowerBound_6_0= ruleValue ) )
            // InternalInlineedit.g:575:4: (lv_lowerBound_6_0= ruleValue )
            {
            // InternalInlineedit.g:575:4: (lv_lowerBound_6_0= ruleValue )
            // InternalInlineedit.g:576:5: lv_lowerBound_6_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getLowerBoundValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_lowerBound_6_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_6_0,
            						"com.example.Classes.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_7());
            		
            // InternalInlineedit.g:597:3: ( (lv_upperBound_8_0= ruleValue ) )
            // InternalInlineedit.g:598:4: (lv_upperBound_8_0= ruleValue )
            {
            // InternalInlineedit.g:598:4: (lv_upperBound_8_0= ruleValue )
            // InternalInlineedit.g:599:5: lv_upperBound_8_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getUpperBoundValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_upperBound_8_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_8_0,
            						"com.example.Classes.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_9());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalInlineedit.g:624:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalInlineedit.g:624:45: (iv_ruleType= ruleType EOF )
            // InternalInlineedit.g:625:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalInlineedit.g:631:1: ruleType returns [EObject current=null] : (this_BuiltInType_0= ruleBuiltInType | this_ClassRef_1= ruleClassRef ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltInType_0 = null;

        EObject this_ClassRef_1 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:637:2: ( (this_BuiltInType_0= ruleBuiltInType | this_ClassRef_1= ruleClassRef ) )
            // InternalInlineedit.g:638:2: (this_BuiltInType_0= ruleBuiltInType | this_ClassRef_1= ruleClassRef )
            {
            // InternalInlineedit.g:638:2: (this_BuiltInType_0= ruleBuiltInType | this_ClassRef_1= ruleClassRef )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=23 && LA9_0<=24)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalInlineedit.g:639:3: this_BuiltInType_0= ruleBuiltInType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBuiltInTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuiltInType_0=ruleBuiltInType();

                    state._fsp--;


                    			current = this_BuiltInType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:648:3: this_ClassRef_1= ruleClassRef
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getClassRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassRef_1=ruleClassRef();

                    state._fsp--;


                    			current = this_ClassRef_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBuiltInType"
    // InternalInlineedit.g:660:1: entryRuleBuiltInType returns [EObject current=null] : iv_ruleBuiltInType= ruleBuiltInType EOF ;
    public final EObject entryRuleBuiltInType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInType = null;


        try {
            // InternalInlineedit.g:660:52: (iv_ruleBuiltInType= ruleBuiltInType EOF )
            // InternalInlineedit.g:661:2: iv_ruleBuiltInType= ruleBuiltInType EOF
            {
             newCompositeNode(grammarAccess.getBuiltInTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuiltInType=ruleBuiltInType();

            state._fsp--;

             current =iv_ruleBuiltInType; 
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
    // $ANTLR end "entryRuleBuiltInType"


    // $ANTLR start "ruleBuiltInType"
    // InternalInlineedit.g:667:1: ruleBuiltInType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType ) ;
    public final EObject ruleBuiltInType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_IntegerType_1 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:673:2: ( (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType ) )
            // InternalInlineedit.g:674:2: (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType )
            {
            // InternalInlineedit.g:674:2: (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalInlineedit.g:675:3: this_StringType_0= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getBuiltInTypeAccess().getStringTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_0=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:684:3: this_IntegerType_1= ruleIntegerType
                    {

                    			newCompositeNode(grammarAccess.getBuiltInTypeAccess().getIntegerTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerType_1=ruleIntegerType();

                    state._fsp--;


                    			current = this_IntegerType_1;
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
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "entryRuleStringType"
    // InternalInlineedit.g:696:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalInlineedit.g:696:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalInlineedit.g:697:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalInlineedit.g:703:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalInlineedit.g:709:2: ( ( () otherlv_1= 'string' ) )
            // InternalInlineedit.g:710:2: ( () otherlv_1= 'string' )
            {
            // InternalInlineedit.g:710:2: ( () otherlv_1= 'string' )
            // InternalInlineedit.g:711:3: () otherlv_1= 'string'
            {
            // InternalInlineedit.g:711:3: ()
            // InternalInlineedit.g:712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
            		

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalInlineedit.g:726:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalInlineedit.g:726:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalInlineedit.g:727:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalInlineedit.g:733:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'integer' ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalInlineedit.g:739:2: ( ( () otherlv_1= 'integer' ) )
            // InternalInlineedit.g:740:2: ( () otherlv_1= 'integer' )
            {
            // InternalInlineedit.g:740:2: ( () otherlv_1= 'integer' )
            // InternalInlineedit.g:741:3: () otherlv_1= 'integer'
            {
            // InternalInlineedit.g:741:3: ()
            // InternalInlineedit.g:742:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1());
            		

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleClassRef"
    // InternalInlineedit.g:756:1: entryRuleClassRef returns [EObject current=null] : iv_ruleClassRef= ruleClassRef EOF ;
    public final EObject entryRuleClassRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassRef = null;


        try {
            // InternalInlineedit.g:756:49: (iv_ruleClassRef= ruleClassRef EOF )
            // InternalInlineedit.g:757:2: iv_ruleClassRef= ruleClassRef EOF
            {
             newCompositeNode(grammarAccess.getClassRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassRef=ruleClassRef();

            state._fsp--;

             current =iv_ruleClassRef; 
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
    // $ANTLR end "entryRuleClassRef"


    // $ANTLR start "ruleClassRef"
    // InternalInlineedit.g:763:1: ruleClassRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalInlineedit.g:769:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalInlineedit.g:770:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalInlineedit.g:770:2: ( (otherlv_0= RULE_ID ) )
            // InternalInlineedit.g:771:3: (otherlv_0= RULE_ID )
            {
            // InternalInlineedit.g:771:3: (otherlv_0= RULE_ID )
            // InternalInlineedit.g:772:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getClassRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getClassRefAccess().getTargetClassCrossReference_0());
            			

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
    // $ANTLR end "ruleClassRef"


    // $ANTLR start "entryRuleValue"
    // InternalInlineedit.g:786:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalInlineedit.g:786:46: (iv_ruleValue= ruleValue EOF )
            // InternalInlineedit.g:787:2: iv_ruleValue= ruleValue EOF
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
    // InternalInlineedit.g:793:1: ruleValue returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_ConstantRef_1= ruleConstantRef ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_ConstantRef_1 = null;



        	enterRule();

        try {
            // InternalInlineedit.g:799:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_ConstantRef_1= ruleConstantRef ) )
            // InternalInlineedit.g:800:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_ConstantRef_1= ruleConstantRef )
            {
            // InternalInlineedit.g:800:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_ConstantRef_1= ruleConstantRef )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalInlineedit.g:801:3: this_IntegerLiteral_0= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:810:3: this_ConstantRef_1= ruleConstantRef
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getConstantRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantRef_1=ruleConstantRef();

                    state._fsp--;


                    			current = this_ConstantRef_1;
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


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalInlineedit.g:822:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalInlineedit.g:822:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalInlineedit.g:823:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalInlineedit.g:829:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalInlineedit.g:835:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalInlineedit.g:836:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalInlineedit.g:836:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalInlineedit.g:837:3: (lv_value_0_0= RULE_INT )
            {
            // InternalInlineedit.g:837:3: (lv_value_0_0= RULE_INT )
            // InternalInlineedit.g:838:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerLiteralRule());
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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleConstantRef"
    // InternalInlineedit.g:857:1: entryRuleConstantRef returns [EObject current=null] : iv_ruleConstantRef= ruleConstantRef EOF ;
    public final EObject entryRuleConstantRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantRef = null;


        try {
            // InternalInlineedit.g:857:52: (iv_ruleConstantRef= ruleConstantRef EOF )
            // InternalInlineedit.g:858:2: iv_ruleConstantRef= ruleConstantRef EOF
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
    // InternalInlineedit.g:864:1: ruleConstantRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalInlineedit.g:870:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalInlineedit.g:871:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalInlineedit.g:871:2: ( (otherlv_0= RULE_ID ) )
            // InternalInlineedit.g:872:3: (otherlv_0= RULE_ID )
            {
            // InternalInlineedit.g:872:3: (otherlv_0= RULE_ID )
            // InternalInlineedit.g:873:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConstantRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getConstantRefAccess().getTargetConstantCrossReference_0());
            			

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


    // $ANTLR start "ruleDescription"
    // InternalInlineedit.g:888:1: ruleDescription[EObject in_current] returns [EObject current=in_current] : ( (lv_description_0_0= RULE_DESCRIPTION_TEXT ) ) ;
    public final EObject ruleDescription(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_description_0_0=null;


        	enterRule();

        try {
            // InternalInlineedit.g:894:2: ( ( (lv_description_0_0= RULE_DESCRIPTION_TEXT ) ) )
            // InternalInlineedit.g:895:2: ( (lv_description_0_0= RULE_DESCRIPTION_TEXT ) )
            {
            // InternalInlineedit.g:895:2: ( (lv_description_0_0= RULE_DESCRIPTION_TEXT ) )
            // InternalInlineedit.g:896:3: (lv_description_0_0= RULE_DESCRIPTION_TEXT )
            {
            // InternalInlineedit.g:896:3: (lv_description_0_0= RULE_DESCRIPTION_TEXT )
            // InternalInlineedit.g:897:4: lv_description_0_0= RULE_DESCRIPTION_TEXT
            {
            lv_description_0_0=(Token)match(input,RULE_DESCRIPTION_TEXT,FOLLOW_2); 

            				newLeafNode(lv_description_0_0, grammarAccess.getDescriptionAccess().getDescriptionDESCRIPTION_TEXTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDescriptionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"description",
            					lv_description_0_0,
            					"com.example.Classes.DESCRIPTION_TEXT");
            			

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "ruleVisibility"
    // InternalInlineedit.g:916:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= 'protected' ) | (enumLiteral_4= '-' ) | (enumLiteral_5= 'private' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalInlineedit.g:922:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= 'protected' ) | (enumLiteral_4= '-' ) | (enumLiteral_5= 'private' ) ) )
            // InternalInlineedit.g:923:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= 'protected' ) | (enumLiteral_4= '-' ) | (enumLiteral_5= 'private' ) )
            {
            // InternalInlineedit.g:923:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= 'protected' ) | (enumLiteral_4= '-' ) | (enumLiteral_5= 'private' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case 29:
                {
                alt12=5;
                }
                break;
            case 30:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalInlineedit.g:924:3: (enumLiteral_0= '+' )
                    {
                    // InternalInlineedit.g:924:3: (enumLiteral_0= '+' )
                    // InternalInlineedit.g:925:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:932:3: (enumLiteral_1= 'public' )
                    {
                    // InternalInlineedit.g:932:3: (enumLiteral_1= 'public' )
                    // InternalInlineedit.g:933:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalInlineedit.g:940:3: (enumLiteral_2= '#' )
                    {
                    // InternalInlineedit.g:940:3: (enumLiteral_2= '#' )
                    // InternalInlineedit.g:941:4: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalInlineedit.g:948:3: (enumLiteral_3= 'protected' )
                    {
                    // InternalInlineedit.g:948:3: (enumLiteral_3= 'protected' )
                    // InternalInlineedit.g:949:4: enumLiteral_3= 'protected'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalInlineedit.g:956:3: (enumLiteral_4= '-' )
                    {
                    // InternalInlineedit.g:956:3: (enumLiteral_4= '-' )
                    // InternalInlineedit.g:957:4: enumLiteral_4= '-'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalInlineedit.g:964:3: (enumLiteral_5= 'private' )
                    {
                    // InternalInlineedit.g:964:3: (enumLiteral_5= 'private' )
                    // InternalInlineedit.g:965:4: enumLiteral_5= 'private'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_5());
                    			

                    }


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
    // $ANTLR end "ruleVisibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A1042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000007E280040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007E200040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000007E000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800010L});

}