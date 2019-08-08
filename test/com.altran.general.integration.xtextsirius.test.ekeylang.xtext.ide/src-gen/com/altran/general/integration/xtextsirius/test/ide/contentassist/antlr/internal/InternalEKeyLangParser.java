package com.altran.general.integration.xtextsirius.test.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.altran.general.integration.xtextsirius.test.services.EKeyLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEKeyLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Container'", "'{'", "'}'", "':'"
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
    public static final int T__14=14;
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

    	public void setGrammarAccess(EKeyLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleContainer"
    // InternalEKeyLang.g:53:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalEKeyLang.g:54:1: ( ruleContainer EOF )
            // InternalEKeyLang.g:55:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalEKeyLang.g:62:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:66:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalEKeyLang.g:67:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalEKeyLang.g:67:2: ( ( rule__Container__Group__0 ) )
            // InternalEKeyLang.g:68:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalEKeyLang.g:69:3: ( rule__Container__Group__0 )
            // InternalEKeyLang.g:69:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleIContainerContent"
    // InternalEKeyLang.g:78:1: entryRuleIContainerContent : ruleIContainerContent EOF ;
    public final void entryRuleIContainerContent() throws RecognitionException {
        try {
            // InternalEKeyLang.g:79:1: ( ruleIContainerContent EOF )
            // InternalEKeyLang.g:80:1: ruleIContainerContent EOF
            {
             before(grammarAccess.getIContainerContentRule()); 
            pushFollow(FOLLOW_1);
            ruleIContainerContent();

            state._fsp--;

             after(grammarAccess.getIContainerContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIContainerContent"


    // $ANTLR start "ruleIContainerContent"
    // InternalEKeyLang.g:87:1: ruleIContainerContent : ( ( rule__IContainerContent__Alternatives ) ) ;
    public final void ruleIContainerContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:91:2: ( ( ( rule__IContainerContent__Alternatives ) ) )
            // InternalEKeyLang.g:92:2: ( ( rule__IContainerContent__Alternatives ) )
            {
            // InternalEKeyLang.g:92:2: ( ( rule__IContainerContent__Alternatives ) )
            // InternalEKeyLang.g:93:3: ( rule__IContainerContent__Alternatives )
            {
             before(grammarAccess.getIContainerContentAccess().getAlternatives()); 
            // InternalEKeyLang.g:94:3: ( rule__IContainerContent__Alternatives )
            // InternalEKeyLang.g:94:4: rule__IContainerContent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IContainerContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIContainerContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIContainerContent"


    // $ANTLR start "entryRuleGroup"
    // InternalEKeyLang.g:103:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalEKeyLang.g:104:1: ( ruleGroup EOF )
            // InternalEKeyLang.g:105:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalEKeyLang.g:112:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:116:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalEKeyLang.g:117:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalEKeyLang.g:117:2: ( ( rule__Group__Group__0 ) )
            // InternalEKeyLang.g:118:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalEKeyLang.g:119:3: ( rule__Group__Group__0 )
            // InternalEKeyLang.g:119:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleSingle"
    // InternalEKeyLang.g:128:1: entryRuleSingle : ruleSingle EOF ;
    public final void entryRuleSingle() throws RecognitionException {
        try {
            // InternalEKeyLang.g:129:1: ( ruleSingle EOF )
            // InternalEKeyLang.g:130:1: ruleSingle EOF
            {
             before(grammarAccess.getSingleRule()); 
            pushFollow(FOLLOW_1);
            ruleSingle();

            state._fsp--;

             after(grammarAccess.getSingleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingle"


    // $ANTLR start "ruleSingle"
    // InternalEKeyLang.g:137:1: ruleSingle : ( ( rule__Single__Group__0 ) ) ;
    public final void ruleSingle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:141:2: ( ( ( rule__Single__Group__0 ) ) )
            // InternalEKeyLang.g:142:2: ( ( rule__Single__Group__0 ) )
            {
            // InternalEKeyLang.g:142:2: ( ( rule__Single__Group__0 ) )
            // InternalEKeyLang.g:143:3: ( rule__Single__Group__0 )
            {
             before(grammarAccess.getSingleAccess().getGroup()); 
            // InternalEKeyLang.g:144:3: ( rule__Single__Group__0 )
            // InternalEKeyLang.g:144:4: rule__Single__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Single__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingle"


    // $ANTLR start "entryRuleLeaf"
    // InternalEKeyLang.g:153:1: entryRuleLeaf : ruleLeaf EOF ;
    public final void entryRuleLeaf() throws RecognitionException {
        try {
            // InternalEKeyLang.g:154:1: ( ruleLeaf EOF )
            // InternalEKeyLang.g:155:1: ruleLeaf EOF
            {
             before(grammarAccess.getLeafRule()); 
            pushFollow(FOLLOW_1);
            ruleLeaf();

            state._fsp--;

             after(grammarAccess.getLeafRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeaf"


    // $ANTLR start "ruleLeaf"
    // InternalEKeyLang.g:162:1: ruleLeaf : ( ( rule__Leaf__Group__0 ) ) ;
    public final void ruleLeaf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:166:2: ( ( ( rule__Leaf__Group__0 ) ) )
            // InternalEKeyLang.g:167:2: ( ( rule__Leaf__Group__0 ) )
            {
            // InternalEKeyLang.g:167:2: ( ( rule__Leaf__Group__0 ) )
            // InternalEKeyLang.g:168:3: ( rule__Leaf__Group__0 )
            {
             before(grammarAccess.getLeafAccess().getGroup()); 
            // InternalEKeyLang.g:169:3: ( rule__Leaf__Group__0 )
            // InternalEKeyLang.g:169:4: rule__Leaf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Leaf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeafAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeaf"


    // $ANTLR start "rule__IContainerContent__Alternatives"
    // InternalEKeyLang.g:177:1: rule__IContainerContent__Alternatives : ( ( ruleGroup ) | ( ruleSingle ) );
    public final void rule__IContainerContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:181:1: ( ( ruleGroup ) | ( ruleSingle ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==RULE_ID||LA1_1==14) ) {
                    alt1=2;
                }
                else if ( (LA1_1==12) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEKeyLang.g:182:2: ( ruleGroup )
                    {
                    // InternalEKeyLang.g:182:2: ( ruleGroup )
                    // InternalEKeyLang.g:183:3: ruleGroup
                    {
                     before(grammarAccess.getIContainerContentAccess().getGroupParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGroup();

                    state._fsp--;

                     after(grammarAccess.getIContainerContentAccess().getGroupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEKeyLang.g:188:2: ( ruleSingle )
                    {
                    // InternalEKeyLang.g:188:2: ( ruleSingle )
                    // InternalEKeyLang.g:189:3: ruleSingle
                    {
                     before(grammarAccess.getIContainerContentAccess().getSingleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSingle();

                    state._fsp--;

                     after(grammarAccess.getIContainerContentAccess().getSingleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IContainerContent__Alternatives"


    // $ANTLR start "rule__Container__Group__0"
    // InternalEKeyLang.g:198:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:202:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalEKeyLang.g:203:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalEKeyLang.g:210:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:214:1: ( ( () ) )
            // InternalEKeyLang.g:215:1: ( () )
            {
            // InternalEKeyLang.g:215:1: ( () )
            // InternalEKeyLang.g:216:2: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // InternalEKeyLang.g:217:2: ()
            // InternalEKeyLang.g:217:3: 
            {
            }

             after(grammarAccess.getContainerAccess().getContainerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalEKeyLang.g:225:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:229:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalEKeyLang.g:230:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalEKeyLang.g:237:1: rule__Container__Group__1__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:241:1: ( ( 'Container' ) )
            // InternalEKeyLang.g:242:1: ( 'Container' )
            {
            // InternalEKeyLang.g:242:1: ( 'Container' )
            // InternalEKeyLang.g:243:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalEKeyLang.g:252:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:256:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalEKeyLang.g:257:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalEKeyLang.g:264:1: rule__Container__Group__2__Impl : ( ( rule__Container__NameAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:268:1: ( ( ( rule__Container__NameAssignment_2 ) ) )
            // InternalEKeyLang.g:269:1: ( ( rule__Container__NameAssignment_2 ) )
            {
            // InternalEKeyLang.g:269:1: ( ( rule__Container__NameAssignment_2 ) )
            // InternalEKeyLang.g:270:2: ( rule__Container__NameAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_2()); 
            // InternalEKeyLang.g:271:2: ( rule__Container__NameAssignment_2 )
            // InternalEKeyLang.g:271:3: rule__Container__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalEKeyLang.g:279:1: rule__Container__Group__3 : rule__Container__Group__3__Impl ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:283:1: ( rule__Container__Group__3__Impl )
            // InternalEKeyLang.g:284:2: rule__Container__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalEKeyLang.g:290:1: rule__Container__Group__3__Impl : ( ( rule__Container__ContentsAssignment_3 )* ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:294:1: ( ( ( rule__Container__ContentsAssignment_3 )* ) )
            // InternalEKeyLang.g:295:1: ( ( rule__Container__ContentsAssignment_3 )* )
            {
            // InternalEKeyLang.g:295:1: ( ( rule__Container__ContentsAssignment_3 )* )
            // InternalEKeyLang.g:296:2: ( rule__Container__ContentsAssignment_3 )*
            {
             before(grammarAccess.getContainerAccess().getContentsAssignment_3()); 
            // InternalEKeyLang.g:297:2: ( rule__Container__ContentsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEKeyLang.g:297:3: rule__Container__ContentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Container__ContentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getContentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalEKeyLang.g:306:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:310:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalEKeyLang.g:311:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalEKeyLang.g:318:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:322:1: ( ( () ) )
            // InternalEKeyLang.g:323:1: ( () )
            {
            // InternalEKeyLang.g:323:1: ( () )
            // InternalEKeyLang.g:324:2: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // InternalEKeyLang.g:325:2: ()
            // InternalEKeyLang.g:325:3: 
            {
            }

             after(grammarAccess.getGroupAccess().getGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalEKeyLang.g:333:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:337:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalEKeyLang.g:338:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalEKeyLang.g:345:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:349:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalEKeyLang.g:350:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalEKeyLang.g:350:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalEKeyLang.g:351:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalEKeyLang.g:352:2: ( rule__Group__NameAssignment_1 )
            // InternalEKeyLang.g:352:3: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalEKeyLang.g:360:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:364:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalEKeyLang.g:365:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalEKeyLang.g:372:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:376:1: ( ( '{' ) )
            // InternalEKeyLang.g:377:1: ( '{' )
            {
            // InternalEKeyLang.g:377:1: ( '{' )
            // InternalEKeyLang.g:378:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalEKeyLang.g:387:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:391:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalEKeyLang.g:392:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalEKeyLang.g:399:1: rule__Group__Group__3__Impl : ( ( rule__Group__LeafsAssignment_3 )* ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:403:1: ( ( ( rule__Group__LeafsAssignment_3 )* ) )
            // InternalEKeyLang.g:404:1: ( ( rule__Group__LeafsAssignment_3 )* )
            {
            // InternalEKeyLang.g:404:1: ( ( rule__Group__LeafsAssignment_3 )* )
            // InternalEKeyLang.g:405:2: ( rule__Group__LeafsAssignment_3 )*
            {
             before(grammarAccess.getGroupAccess().getLeafsAssignment_3()); 
            // InternalEKeyLang.g:406:2: ( rule__Group__LeafsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEKeyLang.g:406:3: rule__Group__LeafsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Group__LeafsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getLeafsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalEKeyLang.g:414:1: rule__Group__Group__4 : rule__Group__Group__4__Impl ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:418:1: ( rule__Group__Group__4__Impl )
            // InternalEKeyLang.g:419:2: rule__Group__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalEKeyLang.g:425:1: rule__Group__Group__4__Impl : ( '}' ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:429:1: ( ( '}' ) )
            // InternalEKeyLang.g:430:1: ( '}' )
            {
            // InternalEKeyLang.g:430:1: ( '}' )
            // InternalEKeyLang.g:431:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Single__Group__0"
    // InternalEKeyLang.g:441:1: rule__Single__Group__0 : rule__Single__Group__0__Impl rule__Single__Group__1 ;
    public final void rule__Single__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:445:1: ( rule__Single__Group__0__Impl rule__Single__Group__1 )
            // InternalEKeyLang.g:446:2: rule__Single__Group__0__Impl rule__Single__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Single__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Single__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group__0"


    // $ANTLR start "rule__Single__Group__0__Impl"
    // InternalEKeyLang.g:453:1: rule__Single__Group__0__Impl : ( () ) ;
    public final void rule__Single__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:457:1: ( ( () ) )
            // InternalEKeyLang.g:458:1: ( () )
            {
            // InternalEKeyLang.g:458:1: ( () )
            // InternalEKeyLang.g:459:2: ()
            {
             before(grammarAccess.getSingleAccess().getSingleAction_0()); 
            // InternalEKeyLang.g:460:2: ()
            // InternalEKeyLang.g:460:3: 
            {
            }

             after(grammarAccess.getSingleAccess().getSingleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group__0__Impl"


    // $ANTLR start "rule__Single__Group__1"
    // InternalEKeyLang.g:468:1: rule__Single__Group__1 : rule__Single__Group__1__Impl rule__Single__Group__2 ;
    public final void rule__Single__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:472:1: ( rule__Single__Group__1__Impl rule__Single__Group__2 )
            // InternalEKeyLang.g:473:2: rule__Single__Group__1__Impl rule__Single__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Single__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Single__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group__1"


    // $ANTLR start "rule__Single__Group__1__Impl"
    // InternalEKeyLang.g:480:1: rule__Single__Group__1__Impl : ( ( rule__Single__NameAssignment_1 ) ) ;
    public final void rule__Single__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:484:1: ( ( ( rule__Single__NameAssignment_1 ) ) )
            // InternalEKeyLang.g:485:1: ( ( rule__Single__NameAssignment_1 ) )
            {
            // InternalEKeyLang.g:485:1: ( ( rule__Single__NameAssignment_1 ) )
            // InternalEKeyLang.g:486:2: ( rule__Single__NameAssignment_1 )
            {
             before(grammarAccess.getSingleAccess().getNameAssignment_1()); 
            // InternalEKeyLang.g:487:2: ( rule__Single__NameAssignment_1 )
            // InternalEKeyLang.g:487:3: rule__Single__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Single__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group__1__Impl"


    // $ANTLR start "rule__Single__Group__2"
    // InternalEKeyLang.g:495:1: rule__Single__Group__2 : rule__Single__Group__2__Impl ;
    public final void rule__Single__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:499:1: ( rule__Single__Group__2__Impl )
            // InternalEKeyLang.g:500:2: rule__Single__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Single__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group__2"


    // $ANTLR start "rule__Single__Group__2__Impl"
    // InternalEKeyLang.g:506:1: rule__Single__Group__2__Impl : ( ( rule__Single__Group_2__0 )? ) ;
    public final void rule__Single__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:510:1: ( ( ( rule__Single__Group_2__0 )? ) )
            // InternalEKeyLang.g:511:1: ( ( rule__Single__Group_2__0 )? )
            {
            // InternalEKeyLang.g:511:1: ( ( rule__Single__Group_2__0 )? )
            // InternalEKeyLang.g:512:2: ( rule__Single__Group_2__0 )?
            {
             before(grammarAccess.getSingleAccess().getGroup_2()); 
            // InternalEKeyLang.g:513:2: ( rule__Single__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEKeyLang.g:513:3: rule__Single__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Single__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group__2__Impl"


    // $ANTLR start "rule__Single__Group_2__0"
    // InternalEKeyLang.g:522:1: rule__Single__Group_2__0 : rule__Single__Group_2__0__Impl rule__Single__Group_2__1 ;
    public final void rule__Single__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:526:1: ( rule__Single__Group_2__0__Impl rule__Single__Group_2__1 )
            // InternalEKeyLang.g:527:2: rule__Single__Group_2__0__Impl rule__Single__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Single__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Single__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group_2__0"


    // $ANTLR start "rule__Single__Group_2__0__Impl"
    // InternalEKeyLang.g:534:1: rule__Single__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Single__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:538:1: ( ( ':' ) )
            // InternalEKeyLang.g:539:1: ( ':' )
            {
            // InternalEKeyLang.g:539:1: ( ':' )
            // InternalEKeyLang.g:540:2: ':'
            {
             before(grammarAccess.getSingleAccess().getColonKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group_2__0__Impl"


    // $ANTLR start "rule__Single__Group_2__1"
    // InternalEKeyLang.g:549:1: rule__Single__Group_2__1 : rule__Single__Group_2__1__Impl ;
    public final void rule__Single__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:553:1: ( rule__Single__Group_2__1__Impl )
            // InternalEKeyLang.g:554:2: rule__Single__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Single__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group_2__1"


    // $ANTLR start "rule__Single__Group_2__1__Impl"
    // InternalEKeyLang.g:560:1: rule__Single__Group_2__1__Impl : ( ( rule__Single__LeafAssignment_2_1 ) ) ;
    public final void rule__Single__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:564:1: ( ( ( rule__Single__LeafAssignment_2_1 ) ) )
            // InternalEKeyLang.g:565:1: ( ( rule__Single__LeafAssignment_2_1 ) )
            {
            // InternalEKeyLang.g:565:1: ( ( rule__Single__LeafAssignment_2_1 ) )
            // InternalEKeyLang.g:566:2: ( rule__Single__LeafAssignment_2_1 )
            {
             before(grammarAccess.getSingleAccess().getLeafAssignment_2_1()); 
            // InternalEKeyLang.g:567:2: ( rule__Single__LeafAssignment_2_1 )
            // InternalEKeyLang.g:567:3: rule__Single__LeafAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Single__LeafAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleAccess().getLeafAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group_2__1__Impl"


    // $ANTLR start "rule__Leaf__Group__0"
    // InternalEKeyLang.g:576:1: rule__Leaf__Group__0 : rule__Leaf__Group__0__Impl rule__Leaf__Group__1 ;
    public final void rule__Leaf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:580:1: ( rule__Leaf__Group__0__Impl rule__Leaf__Group__1 )
            // InternalEKeyLang.g:581:2: rule__Leaf__Group__0__Impl rule__Leaf__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Leaf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Leaf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__0"


    // $ANTLR start "rule__Leaf__Group__0__Impl"
    // InternalEKeyLang.g:588:1: rule__Leaf__Group__0__Impl : ( ( rule__Leaf__NameAssignment_0 ) ) ;
    public final void rule__Leaf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:592:1: ( ( ( rule__Leaf__NameAssignment_0 ) ) )
            // InternalEKeyLang.g:593:1: ( ( rule__Leaf__NameAssignment_0 ) )
            {
            // InternalEKeyLang.g:593:1: ( ( rule__Leaf__NameAssignment_0 ) )
            // InternalEKeyLang.g:594:2: ( rule__Leaf__NameAssignment_0 )
            {
             before(grammarAccess.getLeafAccess().getNameAssignment_0()); 
            // InternalEKeyLang.g:595:2: ( rule__Leaf__NameAssignment_0 )
            // InternalEKeyLang.g:595:3: rule__Leaf__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Leaf__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLeafAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__0__Impl"


    // $ANTLR start "rule__Leaf__Group__1"
    // InternalEKeyLang.g:603:1: rule__Leaf__Group__1 : rule__Leaf__Group__1__Impl ;
    public final void rule__Leaf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:607:1: ( rule__Leaf__Group__1__Impl )
            // InternalEKeyLang.g:608:2: rule__Leaf__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Leaf__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__1"


    // $ANTLR start "rule__Leaf__Group__1__Impl"
    // InternalEKeyLang.g:614:1: rule__Leaf__Group__1__Impl : ( ( rule__Leaf__NumberAssignment_1 ) ) ;
    public final void rule__Leaf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:618:1: ( ( ( rule__Leaf__NumberAssignment_1 ) ) )
            // InternalEKeyLang.g:619:1: ( ( rule__Leaf__NumberAssignment_1 ) )
            {
            // InternalEKeyLang.g:619:1: ( ( rule__Leaf__NumberAssignment_1 ) )
            // InternalEKeyLang.g:620:2: ( rule__Leaf__NumberAssignment_1 )
            {
             before(grammarAccess.getLeafAccess().getNumberAssignment_1()); 
            // InternalEKeyLang.g:621:2: ( rule__Leaf__NumberAssignment_1 )
            // InternalEKeyLang.g:621:3: rule__Leaf__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Leaf__NumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLeafAccess().getNumberAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__Group__1__Impl"


    // $ANTLR start "rule__Container__NameAssignment_2"
    // InternalEKeyLang.g:630:1: rule__Container__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:634:1: ( ( RULE_ID ) )
            // InternalEKeyLang.g:635:2: ( RULE_ID )
            {
            // InternalEKeyLang.g:635:2: ( RULE_ID )
            // InternalEKeyLang.g:636:3: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__NameAssignment_2"


    // $ANTLR start "rule__Container__ContentsAssignment_3"
    // InternalEKeyLang.g:645:1: rule__Container__ContentsAssignment_3 : ( ruleIContainerContent ) ;
    public final void rule__Container__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:649:1: ( ( ruleIContainerContent ) )
            // InternalEKeyLang.g:650:2: ( ruleIContainerContent )
            {
            // InternalEKeyLang.g:650:2: ( ruleIContainerContent )
            // InternalEKeyLang.g:651:3: ruleIContainerContent
            {
             before(grammarAccess.getContainerAccess().getContentsIContainerContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIContainerContent();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContentsIContainerContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ContentsAssignment_3"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // InternalEKeyLang.g:660:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:664:1: ( ( RULE_ID ) )
            // InternalEKeyLang.g:665:2: ( RULE_ID )
            {
            // InternalEKeyLang.g:665:2: ( RULE_ID )
            // InternalEKeyLang.g:666:3: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__LeafsAssignment_3"
    // InternalEKeyLang.g:675:1: rule__Group__LeafsAssignment_3 : ( ruleLeaf ) ;
    public final void rule__Group__LeafsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:679:1: ( ( ruleLeaf ) )
            // InternalEKeyLang.g:680:2: ( ruleLeaf )
            {
            // InternalEKeyLang.g:680:2: ( ruleLeaf )
            // InternalEKeyLang.g:681:3: ruleLeaf
            {
             before(grammarAccess.getGroupAccess().getLeafsLeafParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLeaf();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getLeafsLeafParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__LeafsAssignment_3"


    // $ANTLR start "rule__Single__NameAssignment_1"
    // InternalEKeyLang.g:690:1: rule__Single__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Single__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:694:1: ( ( RULE_ID ) )
            // InternalEKeyLang.g:695:2: ( RULE_ID )
            {
            // InternalEKeyLang.g:695:2: ( RULE_ID )
            // InternalEKeyLang.g:696:3: RULE_ID
            {
             before(grammarAccess.getSingleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__NameAssignment_1"


    // $ANTLR start "rule__Single__LeafAssignment_2_1"
    // InternalEKeyLang.g:705:1: rule__Single__LeafAssignment_2_1 : ( ruleLeaf ) ;
    public final void rule__Single__LeafAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:709:1: ( ( ruleLeaf ) )
            // InternalEKeyLang.g:710:2: ( ruleLeaf )
            {
            // InternalEKeyLang.g:710:2: ( ruleLeaf )
            // InternalEKeyLang.g:711:3: ruleLeaf
            {
             before(grammarAccess.getSingleAccess().getLeafLeafParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLeaf();

            state._fsp--;

             after(grammarAccess.getSingleAccess().getLeafLeafParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__LeafAssignment_2_1"


    // $ANTLR start "rule__Leaf__NameAssignment_0"
    // InternalEKeyLang.g:720:1: rule__Leaf__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Leaf__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:724:1: ( ( RULE_ID ) )
            // InternalEKeyLang.g:725:2: ( RULE_ID )
            {
            // InternalEKeyLang.g:725:2: ( RULE_ID )
            // InternalEKeyLang.g:726:3: RULE_ID
            {
             before(grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__NameAssignment_0"


    // $ANTLR start "rule__Leaf__NumberAssignment_1"
    // InternalEKeyLang.g:735:1: rule__Leaf__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__Leaf__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEKeyLang.g:739:1: ( ( RULE_INT ) )
            // InternalEKeyLang.g:740:2: ( RULE_INT )
            {
            // InternalEKeyLang.g:740:2: ( RULE_INT )
            // InternalEKeyLang.g:741:3: RULE_INT
            {
             before(grammarAccess.getLeafAccess().getNumberINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLeafAccess().getNumberINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaf__NumberAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});

}