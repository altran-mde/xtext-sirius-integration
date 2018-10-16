package com.example.parser.antlr.internal;

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
import com.example.services.ClassesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClassesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DESCRIPTION_TEXT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'constant'", "'='", "'association'", "'-->'", "'['", "'..'", "']'", "'class'", "'{'", "'}'", "':'", "'string'", "'integer'", "'+'", "'public'", "'#'", "'protected'", "'-'", "'private'"
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


        public InternalClassesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalClassesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalClassesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalClasses.g"; }



     	private ClassesGrammarAccess grammarAccess;

        public InternalClassesParser(TokenStream input, ClassesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ClassModel";
       	}

       	@Override
       	protected ClassesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleClassModel"
    // InternalClasses.g:65:1: entryRuleClassModel returns [EObject current=null] : iv_ruleClassModel= ruleClassModel EOF ;
    public final EObject entryRuleClassModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassModel = null;


        try {
            // InternalClasses.g:65:51: (iv_ruleClassModel= ruleClassModel EOF )
            // InternalClasses.g:66:2: iv_ruleClassModel= ruleClassModel EOF
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
    // InternalClasses.g:72:1: ruleClassModel returns [EObject current=null] : ( (lv_content_0_0= ruleContent ) )* ;
    public final EObject ruleClassModel() throws RecognitionException {
        EObject current = null;

        EObject lv_content_0_0 = null;



        	enterRule();

        try {
            // InternalClasses.g:78:2: ( ( (lv_content_0_0= ruleContent ) )* )
            // InternalClasses.g:79:2: ( (lv_content_0_0= ruleContent ) )*
            {
            // InternalClasses.g:79:2: ( (lv_content_0_0= ruleContent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_DESCRIPTION_TEXT||LA1_0==12||LA1_0==14||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalClasses.g:80:3: (lv_content_0_0= ruleContent )
            	    {
            	    // InternalClasses.g:80:3: (lv_content_0_0= ruleContent )
            	    // InternalClasses.g:81:4: lv_content_0_0= ruleContent
            	    {

            	    				newCompositeNode(grammarAccess.getClassModelAccess().getContentContentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
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
    // $ANTLR end "ruleClassModel"


    // $ANTLR start "entryRuleContent"
    // InternalClasses.g:101:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalClasses.g:101:48: (iv_ruleContent= ruleContent EOF )
            // InternalClasses.g:102:2: iv_ruleContent= ruleContent EOF
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
    // InternalClasses.g:108:1: ruleContent returns [EObject current=null] : (this_Constant_0= ruleConstant | this_Class_1= ruleClass | this_Association_2= ruleAssociation ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_Class_1 = null;

        EObject this_Association_2 = null;



        	enterRule();

        try {
            // InternalClasses.g:114:2: ( (this_Constant_0= ruleConstant | this_Class_1= ruleClass | this_Association_2= ruleAssociation ) )
            // InternalClasses.g:115:2: (this_Constant_0= ruleConstant | this_Class_1= ruleClass | this_Association_2= ruleAssociation )
            {
            // InternalClasses.g:115:2: (this_Constant_0= ruleConstant | this_Class_1= ruleClass | this_Association_2= ruleAssociation )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_DESCRIPTION_TEXT:
                {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    alt2=1;
                    }
                    break;
                case 19:
                    {
                    alt2=2;
                    }
                    break;
                case 14:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 12:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalClasses.g:116:3: this_Constant_0= ruleConstant
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
                    // InternalClasses.g:125:3: this_Class_1= ruleClass
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
                    // InternalClasses.g:134:3: this_Association_2= ruleAssociation
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
    // InternalClasses.g:146:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalClasses.g:146:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalClasses.g:147:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalClasses.g:153:1: ruleConstant returns [EObject current=null] : ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject this_Description_0 = null;

        EObject lv_initial_4_0 = null;



        	enterRule();

        try {
            // InternalClasses.g:159:2: ( ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) ) ) )
            // InternalClasses.g:160:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) ) )
            {
            // InternalClasses.g:160:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) ) )
            // InternalClasses.g:161:3: (this_Description_0= ruleDescription[$current] )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_initial_4_0= ruleValue ) )
            {
            // InternalClasses.g:161:3: (this_Description_0= ruleDescription[$current] )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DESCRIPTION_TEXT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalClasses.g:162:4: this_Description_0= ruleDescription[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getConstantRule());
                    				}
                    				newCompositeNode(grammarAccess.getConstantAccess().getDescriptionParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Description_0=ruleDescription(current);

                    state._fsp--;


                    				current = this_Description_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstantKeyword_1());
            		
            // InternalClasses.g:178:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalClasses.g:179:4: (lv_name_2_0= RULE_ID )
            {
            // InternalClasses.g:179:4: (lv_name_2_0= RULE_ID )
            // InternalClasses.g:180:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
            		
            // InternalClasses.g:200:3: ( (lv_initial_4_0= ruleValue ) )
            // InternalClasses.g:201:4: (lv_initial_4_0= ruleValue )
            {
            // InternalClasses.g:201:4: (lv_initial_4_0= ruleValue )
            // InternalClasses.g:202:5: lv_initial_4_0= ruleValue
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


    // $ANTLR start "entryRuleAssociation"
    // InternalClasses.g:223:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalClasses.g:223:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalClasses.g:224:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalClasses.g:230:1: ruleAssociation returns [EObject current=null] : ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '-->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '[' ( (lv_lowerBound_7_0= ruleValue ) ) otherlv_8= '..' ( (lv_upperBound_9_0= ruleValue ) ) otherlv_10= ']' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_Description_0 = null;

        EObject lv_lowerBound_7_0 = null;

        EObject lv_upperBound_9_0 = null;



        	enterRule();

        try {
            // InternalClasses.g:236:2: ( ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '-->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '[' ( (lv_lowerBound_7_0= ruleValue ) ) otherlv_8= '..' ( (lv_upperBound_9_0= ruleValue ) ) otherlv_10= ']' ) )
            // InternalClasses.g:237:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '-->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '[' ( (lv_lowerBound_7_0= ruleValue ) ) otherlv_8= '..' ( (lv_upperBound_9_0= ruleValue ) ) otherlv_10= ']' )
            {
            // InternalClasses.g:237:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '-->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '[' ( (lv_lowerBound_7_0= ruleValue ) ) otherlv_8= '..' ( (lv_upperBound_9_0= ruleValue ) ) otherlv_10= ']' )
            // InternalClasses.g:238:3: (this_Description_0= ruleDescription[$current] )? otherlv_1= 'association' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '-->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '[' ( (lv_lowerBound_7_0= ruleValue ) ) otherlv_8= '..' ( (lv_upperBound_9_0= ruleValue ) ) otherlv_10= ']'
            {
            // InternalClasses.g:238:3: (this_Description_0= ruleDescription[$current] )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DESCRIPTION_TEXT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalClasses.g:239:4: this_Description_0= ruleDescription[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getAssociationRule());
                    				}
                    				newCompositeNode(grammarAccess.getAssociationAccess().getDescriptionParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_Description_0=ruleDescription(current);

                    state._fsp--;


                    				current = this_Description_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalClasses.g:255:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalClasses.g:256:4: (lv_name_2_0= RULE_ID )
            {
            // InternalClasses.g:256:4: (lv_name_2_0= RULE_ID )
            // InternalClasses.g:257:5: lv_name_2_0= RULE_ID
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

            // InternalClasses.g:273:3: ( (otherlv_3= RULE_ID ) )
            // InternalClasses.g:274:4: (otherlv_3= RULE_ID )
            {
            // InternalClasses.g:274:4: (otherlv_3= RULE_ID )
            // InternalClasses.g:275:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getSourceClassCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalClasses.g:290:3: ( (otherlv_5= RULE_ID ) )
            // InternalClasses.g:291:4: (otherlv_5= RULE_ID )
            {
            // InternalClasses.g:291:4: (otherlv_5= RULE_ID )
            // InternalClasses.g:292:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getTargetClassCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalClasses.g:307:3: ( (lv_lowerBound_7_0= ruleValue ) )
            // InternalClasses.g:308:4: (lv_lowerBound_7_0= ruleValue )
            {
            // InternalClasses.g:308:4: (lv_lowerBound_7_0= ruleValue )
            // InternalClasses.g:309:5: lv_lowerBound_7_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getLowerBoundValueParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_lowerBound_7_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_7_0,
            						"com.example.Classes.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getFullStopFullStopKeyword_8());
            		
            // InternalClasses.g:330:3: ( (lv_upperBound_9_0= ruleValue ) )
            // InternalClasses.g:331:4: (lv_upperBound_9_0= ruleValue )
            {
            // InternalClasses.g:331:4: (lv_upperBound_9_0= ruleValue )
            // InternalClasses.g:332:5: lv_upperBound_9_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getUpperBoundValueParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_upperBound_9_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_9_0,
            						"com.example.Classes.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_10());
            		

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


    // $ANTLR start "entryRuleClass"
    // InternalClasses.g:357:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalClasses.g:357:46: (iv_ruleClass= ruleClass EOF )
            // InternalClasses.g:358:2: iv_ruleClass= ruleClass EOF
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
    // InternalClasses.g:364:1: ruleClass returns [EObject current=null] : ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Description_0 = null;

        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalClasses.g:370:2: ( ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) )
            // InternalClasses.g:371:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' )
            {
            // InternalClasses.g:371:2: ( (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' )
            // InternalClasses.g:372:3: (this_Description_0= ruleDescription[$current] )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}'
            {
            // InternalClasses.g:372:3: (this_Description_0= ruleDescription[$current] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DESCRIPTION_TEXT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalClasses.g:373:4: this_Description_0= ruleDescription[$current]
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

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalClasses.g:389:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalClasses.g:390:4: (lv_name_2_0= RULE_ID )
            {
            // InternalClasses.g:390:4: (lv_name_2_0= RULE_ID )
            // InternalClasses.g:391:5: lv_name_2_0= RULE_ID
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
            		
            // InternalClasses.g:411:3: ( (lv_attributes_4_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DESCRIPTION_TEXT||(LA6_0>=25 && LA6_0<=30)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalClasses.g:412:4: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // InternalClasses.g:412:4: (lv_attributes_4_0= ruleAttribute )
            	    // InternalClasses.g:413:5: lv_attributes_4_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_attributes_4_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"com.example.Classes.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalClasses.g:438:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalClasses.g:438:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalClasses.g:439:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalClasses.g:445:1: ruleAttribute returns [EObject current=null] : ( (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']' ) ;
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
            // InternalClasses.g:451:2: ( ( (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']' ) )
            // InternalClasses.g:452:2: ( (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']' )
            {
            // InternalClasses.g:452:2: ( (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']' )
            // InternalClasses.g:453:3: (this_Description_0= ruleDescription[$current] )? ( (lv_visibility_1_0= ruleVisibility ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= '[' ( (lv_lowerBound_6_0= ruleValue ) ) otherlv_7= '..' ( (lv_upperBound_8_0= ruleValue ) ) otherlv_9= ']'
            {
            // InternalClasses.g:453:3: (this_Description_0= ruleDescription[$current] )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DESCRIPTION_TEXT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalClasses.g:454:4: this_Description_0= ruleDescription[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getAttributeRule());
                    				}
                    				newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_16);
                    this_Description_0=ruleDescription(current);

                    state._fsp--;


                    				current = this_Description_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalClasses.g:466:3: ( (lv_visibility_1_0= ruleVisibility ) )
            // InternalClasses.g:467:4: (lv_visibility_1_0= ruleVisibility )
            {
            // InternalClasses.g:467:4: (lv_visibility_1_0= ruleVisibility )
            // InternalClasses.g:468:5: lv_visibility_1_0= ruleVisibility
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalClasses.g:485:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalClasses.g:486:4: (lv_name_2_0= RULE_ID )
            {
            // InternalClasses.g:486:4: (lv_name_2_0= RULE_ID )
            // InternalClasses.g:487:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalClasses.g:507:3: ( (lv_type_4_0= ruleType ) )
            // InternalClasses.g:508:4: (lv_type_4_0= ruleType )
            {
            // InternalClasses.g:508:4: (lv_type_4_0= ruleType )
            // InternalClasses.g:509:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalClasses.g:530:3: ( (lv_lowerBound_6_0= ruleValue ) )
            // InternalClasses.g:531:4: (lv_lowerBound_6_0= ruleValue )
            {
            // InternalClasses.g:531:4: (lv_lowerBound_6_0= ruleValue )
            // InternalClasses.g:532:5: lv_lowerBound_6_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getLowerBoundValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_7=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_7());
            		
            // InternalClasses.g:553:3: ( (lv_upperBound_8_0= ruleValue ) )
            // InternalClasses.g:554:4: (lv_upperBound_8_0= ruleValue )
            {
            // InternalClasses.g:554:4: (lv_upperBound_8_0= ruleValue )
            // InternalClasses.g:555:5: lv_upperBound_8_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getUpperBoundValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

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
    // InternalClasses.g:580:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalClasses.g:580:45: (iv_ruleType= ruleType EOF )
            // InternalClasses.g:581:2: iv_ruleType= ruleType EOF
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
    // InternalClasses.g:587:1: ruleType returns [EObject current=null] : (this_BuiltInType_0= ruleBuiltInType | this_ClassRef_1= ruleClassRef ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltInType_0 = null;

        EObject this_ClassRef_1 = null;



        	enterRule();

        try {
            // InternalClasses.g:593:2: ( (this_BuiltInType_0= ruleBuiltInType | this_ClassRef_1= ruleClassRef ) )
            // InternalClasses.g:594:2: (this_BuiltInType_0= ruleBuiltInType | this_ClassRef_1= ruleClassRef )
            {
            // InternalClasses.g:594:2: (this_BuiltInType_0= ruleBuiltInType | this_ClassRef_1= ruleClassRef )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=23 && LA8_0<=24)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalClasses.g:595:3: this_BuiltInType_0= ruleBuiltInType
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
                    // InternalClasses.g:604:3: this_ClassRef_1= ruleClassRef
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
    // InternalClasses.g:616:1: entryRuleBuiltInType returns [EObject current=null] : iv_ruleBuiltInType= ruleBuiltInType EOF ;
    public final EObject entryRuleBuiltInType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInType = null;


        try {
            // InternalClasses.g:616:52: (iv_ruleBuiltInType= ruleBuiltInType EOF )
            // InternalClasses.g:617:2: iv_ruleBuiltInType= ruleBuiltInType EOF
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
    // InternalClasses.g:623:1: ruleBuiltInType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType ) ;
    public final EObject ruleBuiltInType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_IntegerType_1 = null;



        	enterRule();

        try {
            // InternalClasses.g:629:2: ( (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType ) )
            // InternalClasses.g:630:2: (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType )
            {
            // InternalClasses.g:630:2: (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalClasses.g:631:3: this_StringType_0= ruleStringType
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
                    // InternalClasses.g:640:3: this_IntegerType_1= ruleIntegerType
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
    // InternalClasses.g:652:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalClasses.g:652:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalClasses.g:653:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalClasses.g:659:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalClasses.g:665:2: ( ( () otherlv_1= 'string' ) )
            // InternalClasses.g:666:2: ( () otherlv_1= 'string' )
            {
            // InternalClasses.g:666:2: ( () otherlv_1= 'string' )
            // InternalClasses.g:667:3: () otherlv_1= 'string'
            {
            // InternalClasses.g:667:3: ()
            // InternalClasses.g:668:4: 
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
    // InternalClasses.g:682:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalClasses.g:682:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalClasses.g:683:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalClasses.g:689:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'integer' ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalClasses.g:695:2: ( ( () otherlv_1= 'integer' ) )
            // InternalClasses.g:696:2: ( () otherlv_1= 'integer' )
            {
            // InternalClasses.g:696:2: ( () otherlv_1= 'integer' )
            // InternalClasses.g:697:3: () otherlv_1= 'integer'
            {
            // InternalClasses.g:697:3: ()
            // InternalClasses.g:698:4: 
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
    // InternalClasses.g:712:1: entryRuleClassRef returns [EObject current=null] : iv_ruleClassRef= ruleClassRef EOF ;
    public final EObject entryRuleClassRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassRef = null;


        try {
            // InternalClasses.g:712:49: (iv_ruleClassRef= ruleClassRef EOF )
            // InternalClasses.g:713:2: iv_ruleClassRef= ruleClassRef EOF
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
    // InternalClasses.g:719:1: ruleClassRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalClasses.g:725:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalClasses.g:726:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalClasses.g:726:2: ( (otherlv_0= RULE_ID ) )
            // InternalClasses.g:727:3: (otherlv_0= RULE_ID )
            {
            // InternalClasses.g:727:3: (otherlv_0= RULE_ID )
            // InternalClasses.g:728:4: otherlv_0= RULE_ID
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
    // InternalClasses.g:742:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalClasses.g:742:46: (iv_ruleValue= ruleValue EOF )
            // InternalClasses.g:743:2: iv_ruleValue= ruleValue EOF
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
    // InternalClasses.g:749:1: ruleValue returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_ConstantRef_1= ruleConstantRef ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_ConstantRef_1 = null;



        	enterRule();

        try {
            // InternalClasses.g:755:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_ConstantRef_1= ruleConstantRef ) )
            // InternalClasses.g:756:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_ConstantRef_1= ruleConstantRef )
            {
            // InternalClasses.g:756:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_ConstantRef_1= ruleConstantRef )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalClasses.g:757:3: this_IntegerLiteral_0= ruleIntegerLiteral
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
                    // InternalClasses.g:766:3: this_ConstantRef_1= ruleConstantRef
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
    // InternalClasses.g:778:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalClasses.g:778:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalClasses.g:779:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalClasses.g:785:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalClasses.g:791:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalClasses.g:792:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalClasses.g:792:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalClasses.g:793:3: (lv_value_0_0= RULE_INT )
            {
            // InternalClasses.g:793:3: (lv_value_0_0= RULE_INT )
            // InternalClasses.g:794:4: lv_value_0_0= RULE_INT
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
    // InternalClasses.g:813:1: entryRuleConstantRef returns [EObject current=null] : iv_ruleConstantRef= ruleConstantRef EOF ;
    public final EObject entryRuleConstantRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantRef = null;


        try {
            // InternalClasses.g:813:52: (iv_ruleConstantRef= ruleConstantRef EOF )
            // InternalClasses.g:814:2: iv_ruleConstantRef= ruleConstantRef EOF
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
    // InternalClasses.g:820:1: ruleConstantRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalClasses.g:826:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalClasses.g:827:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalClasses.g:827:2: ( (otherlv_0= RULE_ID ) )
            // InternalClasses.g:828:3: (otherlv_0= RULE_ID )
            {
            // InternalClasses.g:828:3: (otherlv_0= RULE_ID )
            // InternalClasses.g:829:4: otherlv_0= RULE_ID
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
    // InternalClasses.g:844:1: ruleDescription[EObject in_current] returns [EObject current=in_current] : ( (lv_description_0_0= RULE_DESCRIPTION_TEXT ) ) ;
    public final EObject ruleDescription(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_description_0_0=null;


        	enterRule();

        try {
            // InternalClasses.g:850:2: ( ( (lv_description_0_0= RULE_DESCRIPTION_TEXT ) ) )
            // InternalClasses.g:851:2: ( (lv_description_0_0= RULE_DESCRIPTION_TEXT ) )
            {
            // InternalClasses.g:851:2: ( (lv_description_0_0= RULE_DESCRIPTION_TEXT ) )
            // InternalClasses.g:852:3: (lv_description_0_0= RULE_DESCRIPTION_TEXT )
            {
            // InternalClasses.g:852:3: (lv_description_0_0= RULE_DESCRIPTION_TEXT )
            // InternalClasses.g:853:4: lv_description_0_0= RULE_DESCRIPTION_TEXT
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
    // InternalClasses.g:872:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= 'protected' ) | (enumLiteral_4= '-' ) | (enumLiteral_5= 'private' ) ) ;
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
            // InternalClasses.g:878:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= 'protected' ) | (enumLiteral_4= '-' ) | (enumLiteral_5= 'private' ) ) )
            // InternalClasses.g:879:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= 'protected' ) | (enumLiteral_4= '-' ) | (enumLiteral_5= 'private' ) )
            {
            // InternalClasses.g:879:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= 'protected' ) | (enumLiteral_4= '-' ) | (enumLiteral_5= 'private' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            case 28:
                {
                alt11=4;
                }
                break;
            case 29:
                {
                alt11=5;
                }
                break;
            case 30:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalClasses.g:880:3: (enumLiteral_0= '+' )
                    {
                    // InternalClasses.g:880:3: (enumLiteral_0= '+' )
                    // InternalClasses.g:881:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalClasses.g:888:3: (enumLiteral_1= 'public' )
                    {
                    // InternalClasses.g:888:3: (enumLiteral_1= 'public' )
                    // InternalClasses.g:889:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalClasses.g:896:3: (enumLiteral_2= '#' )
                    {
                    // InternalClasses.g:896:3: (enumLiteral_2= '#' )
                    // InternalClasses.g:897:4: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalClasses.g:904:3: (enumLiteral_3= 'protected' )
                    {
                    // InternalClasses.g:904:3: (enumLiteral_3= 'protected' )
                    // InternalClasses.g:905:4: enumLiteral_3= 'protected'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalClasses.g:912:3: (enumLiteral_4= '-' )
                    {
                    // InternalClasses.g:912:3: (enumLiteral_4= '-' )
                    // InternalClasses.g:913:4: enumLiteral_4= '-'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalClasses.g:920:3: (enumLiteral_5= 'private' )
                    {
                    // InternalClasses.g:920:3: (enumLiteral_5= 'private' )
                    // InternalClasses.g:921:4: enumLiteral_5= 'private'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000085042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000007E200040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007E000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800010L});

}