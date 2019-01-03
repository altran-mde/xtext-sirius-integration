package com.altran.general.integration.xtextsirius.test.reflang.ide.contentassist.antlr.internal;

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
import com.altran.general.integration.xtextsirius.test.reflang.services.RefLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRefLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'1'", "'->'", "'2'", "'3'", "'.'"
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


        public InternalRefLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRefLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRefLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRefLang.g"; }


    	private RefLangGrammarAccess grammarAccess;

    	public void setGrammarAccess(RefLangGrammarAccess grammarAccess) {
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
    // InternalRefLang.g:53:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalRefLang.g:54:1: ( ruleContainer EOF )
            // InternalRefLang.g:55:1: ruleContainer EOF
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
    // InternalRefLang.g:62:1: ruleContainer : ( ( rule__Container__ContentsAssignment )* ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:66:2: ( ( ( rule__Container__ContentsAssignment )* ) )
            // InternalRefLang.g:67:2: ( ( rule__Container__ContentsAssignment )* )
            {
            // InternalRefLang.g:67:2: ( ( rule__Container__ContentsAssignment )* )
            // InternalRefLang.g:68:3: ( rule__Container__ContentsAssignment )*
            {
             before(grammarAccess.getContainerAccess().getContentsAssignment()); 
            // InternalRefLang.g:69:3: ( rule__Container__ContentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRefLang.g:69:4: rule__Container__ContentsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Container__ContentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getContentsAssignment()); 

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
    // InternalRefLang.g:78:1: entryRuleIContainerContent : ruleIContainerContent EOF ;
    public final void entryRuleIContainerContent() throws RecognitionException {
        try {
            // InternalRefLang.g:79:1: ( ruleIContainerContent EOF )
            // InternalRefLang.g:80:1: ruleIContainerContent EOF
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
    // InternalRefLang.g:87:1: ruleIContainerContent : ( ( rule__IContainerContent__Alternatives ) ) ;
    public final void ruleIContainerContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:91:2: ( ( ( rule__IContainerContent__Alternatives ) ) )
            // InternalRefLang.g:92:2: ( ( rule__IContainerContent__Alternatives ) )
            {
            // InternalRefLang.g:92:2: ( ( rule__IContainerContent__Alternatives ) )
            // InternalRefLang.g:93:3: ( rule__IContainerContent__Alternatives )
            {
             before(grammarAccess.getIContainerContentAccess().getAlternatives()); 
            // InternalRefLang.g:94:3: ( rule__IContainerContent__Alternatives )
            // InternalRefLang.g:94:4: rule__IContainerContent__Alternatives
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


    // $ANTLR start "entryRuleSubContainer"
    // InternalRefLang.g:103:1: entryRuleSubContainer : ruleSubContainer EOF ;
    public final void entryRuleSubContainer() throws RecognitionException {
        try {
            // InternalRefLang.g:104:1: ( ruleSubContainer EOF )
            // InternalRefLang.g:105:1: ruleSubContainer EOF
            {
             before(grammarAccess.getSubContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleSubContainer();

            state._fsp--;

             after(grammarAccess.getSubContainerRule()); 
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
    // $ANTLR end "entryRuleSubContainer"


    // $ANTLR start "ruleSubContainer"
    // InternalRefLang.g:112:1: ruleSubContainer : ( ( rule__SubContainer__Group__0 ) ) ;
    public final void ruleSubContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:116:2: ( ( ( rule__SubContainer__Group__0 ) ) )
            // InternalRefLang.g:117:2: ( ( rule__SubContainer__Group__0 ) )
            {
            // InternalRefLang.g:117:2: ( ( rule__SubContainer__Group__0 ) )
            // InternalRefLang.g:118:3: ( rule__SubContainer__Group__0 )
            {
             before(grammarAccess.getSubContainerAccess().getGroup()); 
            // InternalRefLang.g:119:3: ( rule__SubContainer__Group__0 )
            // InternalRefLang.g:119:4: rule__SubContainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubContainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleSubContainer"


    // $ANTLR start "entryRuleLeaf"
    // InternalRefLang.g:128:1: entryRuleLeaf : ruleLeaf EOF ;
    public final void entryRuleLeaf() throws RecognitionException {
        try {
            // InternalRefLang.g:129:1: ( ruleLeaf EOF )
            // InternalRefLang.g:130:1: ruleLeaf EOF
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
    // InternalRefLang.g:137:1: ruleLeaf : ( ( rule__Leaf__Group__0 ) ) ;
    public final void ruleLeaf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:141:2: ( ( ( rule__Leaf__Group__0 ) ) )
            // InternalRefLang.g:142:2: ( ( rule__Leaf__Group__0 ) )
            {
            // InternalRefLang.g:142:2: ( ( rule__Leaf__Group__0 ) )
            // InternalRefLang.g:143:3: ( rule__Leaf__Group__0 )
            {
             before(grammarAccess.getLeafAccess().getGroup()); 
            // InternalRefLang.g:144:3: ( rule__Leaf__Group__0 )
            // InternalRefLang.g:144:4: rule__Leaf__Group__0
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


    // $ANTLR start "ruleReferences"
    // InternalRefLang.g:154:1: ruleReferences : ( ( rule__References__Group__0 ) ) ;
    public final void ruleReferences() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:158:2: ( ( ( rule__References__Group__0 ) ) )
            // InternalRefLang.g:159:2: ( ( rule__References__Group__0 ) )
            {
            // InternalRefLang.g:159:2: ( ( rule__References__Group__0 ) )
            // InternalRefLang.g:160:3: ( rule__References__Group__0 )
            {
             before(grammarAccess.getReferencesAccess().getGroup()); 
            // InternalRefLang.g:161:3: ( rule__References__Group__0 )
            // InternalRefLang.g:161:4: rule__References__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__References__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferencesAccess().getGroup()); 

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
    // $ANTLR end "ruleReferences"


    // $ANTLR start "entryRuleReference"
    // InternalRefLang.g:170:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalRefLang.g:171:1: ( ruleReference EOF )
            // InternalRefLang.g:172:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalRefLang.g:179:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:183:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalRefLang.g:184:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalRefLang.g:184:2: ( ( rule__Reference__Group__0 ) )
            // InternalRefLang.g:185:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalRefLang.g:186:3: ( rule__Reference__Group__0 )
            // InternalRefLang.g:186:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "ruleReferences2"
    // InternalRefLang.g:196:1: ruleReferences2 : ( ( rule__References2__Group__0 ) ) ;
    public final void ruleReferences2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:200:2: ( ( ( rule__References2__Group__0 ) ) )
            // InternalRefLang.g:201:2: ( ( rule__References2__Group__0 ) )
            {
            // InternalRefLang.g:201:2: ( ( rule__References2__Group__0 ) )
            // InternalRefLang.g:202:3: ( rule__References2__Group__0 )
            {
             before(grammarAccess.getReferences2Access().getGroup()); 
            // InternalRefLang.g:203:3: ( rule__References2__Group__0 )
            // InternalRefLang.g:203:4: rule__References2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__References2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferences2Access().getGroup()); 

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
    // $ANTLR end "ruleReferences2"


    // $ANTLR start "ruleReferences3"
    // InternalRefLang.g:213:1: ruleReferences3 : ( ( rule__References3__Group__0 ) ) ;
    public final void ruleReferences3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:217:2: ( ( ( rule__References3__Group__0 ) ) )
            // InternalRefLang.g:218:2: ( ( rule__References3__Group__0 ) )
            {
            // InternalRefLang.g:218:2: ( ( rule__References3__Group__0 ) )
            // InternalRefLang.g:219:3: ( rule__References3__Group__0 )
            {
             before(grammarAccess.getReferences3Access().getGroup()); 
            // InternalRefLang.g:220:3: ( rule__References3__Group__0 )
            // InternalRefLang.g:220:4: rule__References3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__References3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferences3Access().getGroup()); 

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
    // $ANTLR end "ruleReferences3"


    // $ANTLR start "entryRuleReference3"
    // InternalRefLang.g:229:1: entryRuleReference3 : ruleReference3 EOF ;
    public final void entryRuleReference3() throws RecognitionException {
        try {
            // InternalRefLang.g:230:1: ( ruleReference3 EOF )
            // InternalRefLang.g:231:1: ruleReference3 EOF
            {
             before(grammarAccess.getReference3Rule()); 
            pushFollow(FOLLOW_1);
            ruleReference3();

            state._fsp--;

             after(grammarAccess.getReference3Rule()); 
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
    // $ANTLR end "entryRuleReference3"


    // $ANTLR start "ruleReference3"
    // InternalRefLang.g:238:1: ruleReference3 : ( ( rule__Reference3__Group__0 ) ) ;
    public final void ruleReference3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:242:2: ( ( ( rule__Reference3__Group__0 ) ) )
            // InternalRefLang.g:243:2: ( ( rule__Reference3__Group__0 ) )
            {
            // InternalRefLang.g:243:2: ( ( rule__Reference3__Group__0 ) )
            // InternalRefLang.g:244:3: ( rule__Reference3__Group__0 )
            {
             before(grammarAccess.getReference3Access().getGroup()); 
            // InternalRefLang.g:245:3: ( rule__Reference3__Group__0 )
            // InternalRefLang.g:245:4: rule__Reference3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReference3Access().getGroup()); 

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
    // $ANTLR end "ruleReference3"


    // $ANTLR start "entryRuleQID"
    // InternalRefLang.g:254:1: entryRuleQID : ruleQID EOF ;
    public final void entryRuleQID() throws RecognitionException {
        try {
            // InternalRefLang.g:255:1: ( ruleQID EOF )
            // InternalRefLang.g:256:1: ruleQID EOF
            {
             before(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_1);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getQIDRule()); 
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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // InternalRefLang.g:263:1: ruleQID : ( ( rule__QID__Group__0 ) ) ;
    public final void ruleQID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:267:2: ( ( ( rule__QID__Group__0 ) ) )
            // InternalRefLang.g:268:2: ( ( rule__QID__Group__0 ) )
            {
            // InternalRefLang.g:268:2: ( ( rule__QID__Group__0 ) )
            // InternalRefLang.g:269:3: ( rule__QID__Group__0 )
            {
             before(grammarAccess.getQIDAccess().getGroup()); 
            // InternalRefLang.g:270:3: ( rule__QID__Group__0 )
            // InternalRefLang.g:270:4: rule__QID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQIDAccess().getGroup()); 

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
    // $ANTLR end "ruleQID"


    // $ANTLR start "rule__IContainerContent__Alternatives"
    // InternalRefLang.g:278:1: rule__IContainerContent__Alternatives : ( ( ruleSubContainer ) | ( ruleLeaf ) );
    public final void rule__IContainerContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:282:1: ( ( ruleSubContainer ) | ( ruleLeaf ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==11) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||(LA2_1>=12 && LA2_1<=13)||(LA2_1>=15 && LA2_1<=16)) ) {
                    alt2=2;
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
                    // InternalRefLang.g:283:2: ( ruleSubContainer )
                    {
                    // InternalRefLang.g:283:2: ( ruleSubContainer )
                    // InternalRefLang.g:284:3: ruleSubContainer
                    {
                     before(grammarAccess.getIContainerContentAccess().getSubContainerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSubContainer();

                    state._fsp--;

                     after(grammarAccess.getIContainerContentAccess().getSubContainerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRefLang.g:289:2: ( ruleLeaf )
                    {
                    // InternalRefLang.g:289:2: ( ruleLeaf )
                    // InternalRefLang.g:290:3: ruleLeaf
                    {
                     before(grammarAccess.getIContainerContentAccess().getLeafParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLeaf();

                    state._fsp--;

                     after(grammarAccess.getIContainerContentAccess().getLeafParserRuleCall_1()); 

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


    // $ANTLR start "rule__SubContainer__Group__0"
    // InternalRefLang.g:299:1: rule__SubContainer__Group__0 : rule__SubContainer__Group__0__Impl rule__SubContainer__Group__1 ;
    public final void rule__SubContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:303:1: ( rule__SubContainer__Group__0__Impl rule__SubContainer__Group__1 )
            // InternalRefLang.g:304:2: rule__SubContainer__Group__0__Impl rule__SubContainer__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SubContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubContainer__Group__1();

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
    // $ANTLR end "rule__SubContainer__Group__0"


    // $ANTLR start "rule__SubContainer__Group__0__Impl"
    // InternalRefLang.g:311:1: rule__SubContainer__Group__0__Impl : ( ( rule__SubContainer__NameAssignment_0 ) ) ;
    public final void rule__SubContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:315:1: ( ( ( rule__SubContainer__NameAssignment_0 ) ) )
            // InternalRefLang.g:316:1: ( ( rule__SubContainer__NameAssignment_0 ) )
            {
            // InternalRefLang.g:316:1: ( ( rule__SubContainer__NameAssignment_0 ) )
            // InternalRefLang.g:317:2: ( rule__SubContainer__NameAssignment_0 )
            {
             before(grammarAccess.getSubContainerAccess().getNameAssignment_0()); 
            // InternalRefLang.g:318:2: ( rule__SubContainer__NameAssignment_0 )
            // InternalRefLang.g:318:3: rule__SubContainer__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SubContainer__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubContainerAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SubContainer__Group__0__Impl"


    // $ANTLR start "rule__SubContainer__Group__1"
    // InternalRefLang.g:326:1: rule__SubContainer__Group__1 : rule__SubContainer__Group__1__Impl rule__SubContainer__Group__2 ;
    public final void rule__SubContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:330:1: ( rule__SubContainer__Group__1__Impl rule__SubContainer__Group__2 )
            // InternalRefLang.g:331:2: rule__SubContainer__Group__1__Impl rule__SubContainer__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubContainer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubContainer__Group__2();

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
    // $ANTLR end "rule__SubContainer__Group__1"


    // $ANTLR start "rule__SubContainer__Group__1__Impl"
    // InternalRefLang.g:338:1: rule__SubContainer__Group__1__Impl : ( '{' ) ;
    public final void rule__SubContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:342:1: ( ( '{' ) )
            // InternalRefLang.g:343:1: ( '{' )
            {
            // InternalRefLang.g:343:1: ( '{' )
            // InternalRefLang.g:344:2: '{'
            {
             before(grammarAccess.getSubContainerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSubContainerAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__SubContainer__Group__1__Impl"


    // $ANTLR start "rule__SubContainer__Group__2"
    // InternalRefLang.g:353:1: rule__SubContainer__Group__2 : rule__SubContainer__Group__2__Impl rule__SubContainer__Group__3 ;
    public final void rule__SubContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:357:1: ( rule__SubContainer__Group__2__Impl rule__SubContainer__Group__3 )
            // InternalRefLang.g:358:2: rule__SubContainer__Group__2__Impl rule__SubContainer__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SubContainer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubContainer__Group__3();

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
    // $ANTLR end "rule__SubContainer__Group__2"


    // $ANTLR start "rule__SubContainer__Group__2__Impl"
    // InternalRefLang.g:365:1: rule__SubContainer__Group__2__Impl : ( ( rule__SubContainer__SubContentsAssignment_2 )* ) ;
    public final void rule__SubContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:369:1: ( ( ( rule__SubContainer__SubContentsAssignment_2 )* ) )
            // InternalRefLang.g:370:1: ( ( rule__SubContainer__SubContentsAssignment_2 )* )
            {
            // InternalRefLang.g:370:1: ( ( rule__SubContainer__SubContentsAssignment_2 )* )
            // InternalRefLang.g:371:2: ( rule__SubContainer__SubContentsAssignment_2 )*
            {
             before(grammarAccess.getSubContainerAccess().getSubContentsAssignment_2()); 
            // InternalRefLang.g:372:2: ( rule__SubContainer__SubContentsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRefLang.g:372:3: rule__SubContainer__SubContentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SubContainer__SubContentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSubContainerAccess().getSubContentsAssignment_2()); 

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
    // $ANTLR end "rule__SubContainer__Group__2__Impl"


    // $ANTLR start "rule__SubContainer__Group__3"
    // InternalRefLang.g:380:1: rule__SubContainer__Group__3 : rule__SubContainer__Group__3__Impl rule__SubContainer__Group__4 ;
    public final void rule__SubContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:384:1: ( rule__SubContainer__Group__3__Impl rule__SubContainer__Group__4 )
            // InternalRefLang.g:385:2: rule__SubContainer__Group__3__Impl rule__SubContainer__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SubContainer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubContainer__Group__4();

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
    // $ANTLR end "rule__SubContainer__Group__3"


    // $ANTLR start "rule__SubContainer__Group__3__Impl"
    // InternalRefLang.g:392:1: rule__SubContainer__Group__3__Impl : ( '}' ) ;
    public final void rule__SubContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:396:1: ( ( '}' ) )
            // InternalRefLang.g:397:1: ( '}' )
            {
            // InternalRefLang.g:397:1: ( '}' )
            // InternalRefLang.g:398:2: '}'
            {
             before(grammarAccess.getSubContainerAccess().getRightCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSubContainerAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SubContainer__Group__3__Impl"


    // $ANTLR start "rule__SubContainer__Group__4"
    // InternalRefLang.g:407:1: rule__SubContainer__Group__4 : rule__SubContainer__Group__4__Impl rule__SubContainer__Group__5 ;
    public final void rule__SubContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:411:1: ( rule__SubContainer__Group__4__Impl rule__SubContainer__Group__5 )
            // InternalRefLang.g:412:2: rule__SubContainer__Group__4__Impl rule__SubContainer__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SubContainer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubContainer__Group__5();

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
    // $ANTLR end "rule__SubContainer__Group__4"


    // $ANTLR start "rule__SubContainer__Group__4__Impl"
    // InternalRefLang.g:419:1: rule__SubContainer__Group__4__Impl : ( ( ruleReferences )? ) ;
    public final void rule__SubContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:423:1: ( ( ( ruleReferences )? ) )
            // InternalRefLang.g:424:1: ( ( ruleReferences )? )
            {
            // InternalRefLang.g:424:1: ( ( ruleReferences )? )
            // InternalRefLang.g:425:2: ( ruleReferences )?
            {
             before(grammarAccess.getSubContainerAccess().getReferencesParserRuleCall_4()); 
            // InternalRefLang.g:426:2: ( ruleReferences )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRefLang.g:426:3: ruleReferences
                    {
                    pushFollow(FOLLOW_2);
                    ruleReferences();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubContainerAccess().getReferencesParserRuleCall_4()); 

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
    // $ANTLR end "rule__SubContainer__Group__4__Impl"


    // $ANTLR start "rule__SubContainer__Group__5"
    // InternalRefLang.g:434:1: rule__SubContainer__Group__5 : rule__SubContainer__Group__5__Impl rule__SubContainer__Group__6 ;
    public final void rule__SubContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:438:1: ( rule__SubContainer__Group__5__Impl rule__SubContainer__Group__6 )
            // InternalRefLang.g:439:2: rule__SubContainer__Group__5__Impl rule__SubContainer__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SubContainer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubContainer__Group__6();

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
    // $ANTLR end "rule__SubContainer__Group__5"


    // $ANTLR start "rule__SubContainer__Group__5__Impl"
    // InternalRefLang.g:446:1: rule__SubContainer__Group__5__Impl : ( ( ruleReferences2 )? ) ;
    public final void rule__SubContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:450:1: ( ( ( ruleReferences2 )? ) )
            // InternalRefLang.g:451:1: ( ( ruleReferences2 )? )
            {
            // InternalRefLang.g:451:1: ( ( ruleReferences2 )? )
            // InternalRefLang.g:452:2: ( ruleReferences2 )?
            {
             before(grammarAccess.getSubContainerAccess().getReferences2ParserRuleCall_5()); 
            // InternalRefLang.g:453:2: ( ruleReferences2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRefLang.g:453:3: ruleReferences2
                    {
                    pushFollow(FOLLOW_2);
                    ruleReferences2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubContainerAccess().getReferences2ParserRuleCall_5()); 

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
    // $ANTLR end "rule__SubContainer__Group__5__Impl"


    // $ANTLR start "rule__SubContainer__Group__6"
    // InternalRefLang.g:461:1: rule__SubContainer__Group__6 : rule__SubContainer__Group__6__Impl ;
    public final void rule__SubContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:465:1: ( rule__SubContainer__Group__6__Impl )
            // InternalRefLang.g:466:2: rule__SubContainer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubContainer__Group__6__Impl();

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
    // $ANTLR end "rule__SubContainer__Group__6"


    // $ANTLR start "rule__SubContainer__Group__6__Impl"
    // InternalRefLang.g:472:1: rule__SubContainer__Group__6__Impl : ( ( ruleReferences3 )? ) ;
    public final void rule__SubContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:476:1: ( ( ( ruleReferences3 )? ) )
            // InternalRefLang.g:477:1: ( ( ruleReferences3 )? )
            {
            // InternalRefLang.g:477:1: ( ( ruleReferences3 )? )
            // InternalRefLang.g:478:2: ( ruleReferences3 )?
            {
             before(grammarAccess.getSubContainerAccess().getReferences3ParserRuleCall_6()); 
            // InternalRefLang.g:479:2: ( ruleReferences3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRefLang.g:479:3: ruleReferences3
                    {
                    pushFollow(FOLLOW_2);
                    ruleReferences3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubContainerAccess().getReferences3ParserRuleCall_6()); 

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
    // $ANTLR end "rule__SubContainer__Group__6__Impl"


    // $ANTLR start "rule__Leaf__Group__0"
    // InternalRefLang.g:488:1: rule__Leaf__Group__0 : rule__Leaf__Group__0__Impl rule__Leaf__Group__1 ;
    public final void rule__Leaf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:492:1: ( rule__Leaf__Group__0__Impl rule__Leaf__Group__1 )
            // InternalRefLang.g:493:2: rule__Leaf__Group__0__Impl rule__Leaf__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRefLang.g:500:1: rule__Leaf__Group__0__Impl : ( ( rule__Leaf__NameAssignment_0 ) ) ;
    public final void rule__Leaf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:504:1: ( ( ( rule__Leaf__NameAssignment_0 ) ) )
            // InternalRefLang.g:505:1: ( ( rule__Leaf__NameAssignment_0 ) )
            {
            // InternalRefLang.g:505:1: ( ( rule__Leaf__NameAssignment_0 ) )
            // InternalRefLang.g:506:2: ( rule__Leaf__NameAssignment_0 )
            {
             before(grammarAccess.getLeafAccess().getNameAssignment_0()); 
            // InternalRefLang.g:507:2: ( rule__Leaf__NameAssignment_0 )
            // InternalRefLang.g:507:3: rule__Leaf__NameAssignment_0
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
    // InternalRefLang.g:515:1: rule__Leaf__Group__1 : rule__Leaf__Group__1__Impl rule__Leaf__Group__2 ;
    public final void rule__Leaf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:519:1: ( rule__Leaf__Group__1__Impl rule__Leaf__Group__2 )
            // InternalRefLang.g:520:2: rule__Leaf__Group__1__Impl rule__Leaf__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Leaf__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Leaf__Group__2();

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
    // InternalRefLang.g:527:1: rule__Leaf__Group__1__Impl : ( ( ruleReferences )? ) ;
    public final void rule__Leaf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:531:1: ( ( ( ruleReferences )? ) )
            // InternalRefLang.g:532:1: ( ( ruleReferences )? )
            {
            // InternalRefLang.g:532:1: ( ( ruleReferences )? )
            // InternalRefLang.g:533:2: ( ruleReferences )?
            {
             before(grammarAccess.getLeafAccess().getReferencesParserRuleCall_1()); 
            // InternalRefLang.g:534:2: ( ruleReferences )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRefLang.g:534:3: ruleReferences
                    {
                    pushFollow(FOLLOW_2);
                    ruleReferences();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafAccess().getReferencesParserRuleCall_1()); 

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


    // $ANTLR start "rule__Leaf__Group__2"
    // InternalRefLang.g:542:1: rule__Leaf__Group__2 : rule__Leaf__Group__2__Impl rule__Leaf__Group__3 ;
    public final void rule__Leaf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:546:1: ( rule__Leaf__Group__2__Impl rule__Leaf__Group__3 )
            // InternalRefLang.g:547:2: rule__Leaf__Group__2__Impl rule__Leaf__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Leaf__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Leaf__Group__3();

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
    // $ANTLR end "rule__Leaf__Group__2"


    // $ANTLR start "rule__Leaf__Group__2__Impl"
    // InternalRefLang.g:554:1: rule__Leaf__Group__2__Impl : ( ( ruleReferences2 )? ) ;
    public final void rule__Leaf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:558:1: ( ( ( ruleReferences2 )? ) )
            // InternalRefLang.g:559:1: ( ( ruleReferences2 )? )
            {
            // InternalRefLang.g:559:1: ( ( ruleReferences2 )? )
            // InternalRefLang.g:560:2: ( ruleReferences2 )?
            {
             before(grammarAccess.getLeafAccess().getReferences2ParserRuleCall_2()); 
            // InternalRefLang.g:561:2: ( ruleReferences2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRefLang.g:561:3: ruleReferences2
                    {
                    pushFollow(FOLLOW_2);
                    ruleReferences2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafAccess().getReferences2ParserRuleCall_2()); 

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
    // $ANTLR end "rule__Leaf__Group__2__Impl"


    // $ANTLR start "rule__Leaf__Group__3"
    // InternalRefLang.g:569:1: rule__Leaf__Group__3 : rule__Leaf__Group__3__Impl ;
    public final void rule__Leaf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:573:1: ( rule__Leaf__Group__3__Impl )
            // InternalRefLang.g:574:2: rule__Leaf__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Leaf__Group__3__Impl();

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
    // $ANTLR end "rule__Leaf__Group__3"


    // $ANTLR start "rule__Leaf__Group__3__Impl"
    // InternalRefLang.g:580:1: rule__Leaf__Group__3__Impl : ( ( ruleReferences3 )? ) ;
    public final void rule__Leaf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:584:1: ( ( ( ruleReferences3 )? ) )
            // InternalRefLang.g:585:1: ( ( ruleReferences3 )? )
            {
            // InternalRefLang.g:585:1: ( ( ruleReferences3 )? )
            // InternalRefLang.g:586:2: ( ruleReferences3 )?
            {
             before(grammarAccess.getLeafAccess().getReferences3ParserRuleCall_3()); 
            // InternalRefLang.g:587:2: ( ruleReferences3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRefLang.g:587:3: ruleReferences3
                    {
                    pushFollow(FOLLOW_2);
                    ruleReferences3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafAccess().getReferences3ParserRuleCall_3()); 

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
    // $ANTLR end "rule__Leaf__Group__3__Impl"


    // $ANTLR start "rule__References__Group__0"
    // InternalRefLang.g:596:1: rule__References__Group__0 : rule__References__Group__0__Impl rule__References__Group__1 ;
    public final void rule__References__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:600:1: ( rule__References__Group__0__Impl rule__References__Group__1 )
            // InternalRefLang.g:601:2: rule__References__Group__0__Impl rule__References__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__References__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__References__Group__1();

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
    // $ANTLR end "rule__References__Group__0"


    // $ANTLR start "rule__References__Group__0__Impl"
    // InternalRefLang.g:608:1: rule__References__Group__0__Impl : ( '1' ) ;
    public final void rule__References__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:612:1: ( ( '1' ) )
            // InternalRefLang.g:613:1: ( '1' )
            {
            // InternalRefLang.g:613:1: ( '1' )
            // InternalRefLang.g:614:2: '1'
            {
             before(grammarAccess.getReferencesAccess().getDigitOneKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReferencesAccess().getDigitOneKeyword_0()); 

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
    // $ANTLR end "rule__References__Group__0__Impl"


    // $ANTLR start "rule__References__Group__1"
    // InternalRefLang.g:623:1: rule__References__Group__1 : rule__References__Group__1__Impl ;
    public final void rule__References__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:627:1: ( rule__References__Group__1__Impl )
            // InternalRefLang.g:628:2: rule__References__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__References__Group__1__Impl();

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
    // $ANTLR end "rule__References__Group__1"


    // $ANTLR start "rule__References__Group__1__Impl"
    // InternalRefLang.g:634:1: rule__References__Group__1__Impl : ( ( rule__References__ReferencesAssignment_1 )* ) ;
    public final void rule__References__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:638:1: ( ( ( rule__References__ReferencesAssignment_1 )* ) )
            // InternalRefLang.g:639:1: ( ( rule__References__ReferencesAssignment_1 )* )
            {
            // InternalRefLang.g:639:1: ( ( rule__References__ReferencesAssignment_1 )* )
            // InternalRefLang.g:640:2: ( rule__References__ReferencesAssignment_1 )*
            {
             before(grammarAccess.getReferencesAccess().getReferencesAssignment_1()); 
            // InternalRefLang.g:641:2: ( rule__References__ReferencesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRefLang.g:641:3: rule__References__ReferencesAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__References__ReferencesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getReferencesAccess().getReferencesAssignment_1()); 

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
    // $ANTLR end "rule__References__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalRefLang.g:650:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:654:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalRefLang.g:655:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalRefLang.g:662:1: rule__Reference__Group__0__Impl : ( '->' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:666:1: ( ( '->' ) )
            // InternalRefLang.g:667:1: ( '->' )
            {
            // InternalRefLang.g:667:1: ( '->' )
            // InternalRefLang.g:668:2: '->'
            {
             before(grammarAccess.getReferenceAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalRefLang.g:677:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:681:1: ( rule__Reference__Group__1__Impl )
            // InternalRefLang.g:682:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__1__Impl();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalRefLang.g:688:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__TargetAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:692:1: ( ( ( rule__Reference__TargetAssignment_1 ) ) )
            // InternalRefLang.g:693:1: ( ( rule__Reference__TargetAssignment_1 ) )
            {
            // InternalRefLang.g:693:1: ( ( rule__Reference__TargetAssignment_1 ) )
            // InternalRefLang.g:694:2: ( rule__Reference__TargetAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getTargetAssignment_1()); 
            // InternalRefLang.g:695:2: ( rule__Reference__TargetAssignment_1 )
            // InternalRefLang.g:695:3: rule__Reference__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__References2__Group__0"
    // InternalRefLang.g:704:1: rule__References2__Group__0 : rule__References2__Group__0__Impl rule__References2__Group__1 ;
    public final void rule__References2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:708:1: ( rule__References2__Group__0__Impl rule__References2__Group__1 )
            // InternalRefLang.g:709:2: rule__References2__Group__0__Impl rule__References2__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__References2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__References2__Group__1();

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
    // $ANTLR end "rule__References2__Group__0"


    // $ANTLR start "rule__References2__Group__0__Impl"
    // InternalRefLang.g:716:1: rule__References2__Group__0__Impl : ( '2' ) ;
    public final void rule__References2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:720:1: ( ( '2' ) )
            // InternalRefLang.g:721:1: ( '2' )
            {
            // InternalRefLang.g:721:1: ( '2' )
            // InternalRefLang.g:722:2: '2'
            {
             before(grammarAccess.getReferences2Access().getDigitTwoKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReferences2Access().getDigitTwoKeyword_0()); 

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
    // $ANTLR end "rule__References2__Group__0__Impl"


    // $ANTLR start "rule__References2__Group__1"
    // InternalRefLang.g:731:1: rule__References2__Group__1 : rule__References2__Group__1__Impl ;
    public final void rule__References2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:735:1: ( rule__References2__Group__1__Impl )
            // InternalRefLang.g:736:2: rule__References2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__References2__Group__1__Impl();

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
    // $ANTLR end "rule__References2__Group__1"


    // $ANTLR start "rule__References2__Group__1__Impl"
    // InternalRefLang.g:742:1: rule__References2__Group__1__Impl : ( ( rule__References2__References2Assignment_1 )* ) ;
    public final void rule__References2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:746:1: ( ( ( rule__References2__References2Assignment_1 )* ) )
            // InternalRefLang.g:747:1: ( ( rule__References2__References2Assignment_1 )* )
            {
            // InternalRefLang.g:747:1: ( ( rule__References2__References2Assignment_1 )* )
            // InternalRefLang.g:748:2: ( rule__References2__References2Assignment_1 )*
            {
             before(grammarAccess.getReferences2Access().getReferences2Assignment_1()); 
            // InternalRefLang.g:749:2: ( rule__References2__References2Assignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRefLang.g:749:3: rule__References2__References2Assignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__References2__References2Assignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getReferences2Access().getReferences2Assignment_1()); 

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
    // $ANTLR end "rule__References2__Group__1__Impl"


    // $ANTLR start "rule__References3__Group__0"
    // InternalRefLang.g:758:1: rule__References3__Group__0 : rule__References3__Group__0__Impl rule__References3__Group__1 ;
    public final void rule__References3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:762:1: ( rule__References3__Group__0__Impl rule__References3__Group__1 )
            // InternalRefLang.g:763:2: rule__References3__Group__0__Impl rule__References3__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__References3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__References3__Group__1();

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
    // $ANTLR end "rule__References3__Group__0"


    // $ANTLR start "rule__References3__Group__0__Impl"
    // InternalRefLang.g:770:1: rule__References3__Group__0__Impl : ( '3' ) ;
    public final void rule__References3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:774:1: ( ( '3' ) )
            // InternalRefLang.g:775:1: ( '3' )
            {
            // InternalRefLang.g:775:1: ( '3' )
            // InternalRefLang.g:776:2: '3'
            {
             before(grammarAccess.getReferences3Access().getDigitThreeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReferences3Access().getDigitThreeKeyword_0()); 

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
    // $ANTLR end "rule__References3__Group__0__Impl"


    // $ANTLR start "rule__References3__Group__1"
    // InternalRefLang.g:785:1: rule__References3__Group__1 : rule__References3__Group__1__Impl ;
    public final void rule__References3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:789:1: ( rule__References3__Group__1__Impl )
            // InternalRefLang.g:790:2: rule__References3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__References3__Group__1__Impl();

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
    // $ANTLR end "rule__References3__Group__1"


    // $ANTLR start "rule__References3__Group__1__Impl"
    // InternalRefLang.g:796:1: rule__References3__Group__1__Impl : ( ( rule__References3__References3Assignment_1 )* ) ;
    public final void rule__References3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:800:1: ( ( ( rule__References3__References3Assignment_1 )* ) )
            // InternalRefLang.g:801:1: ( ( rule__References3__References3Assignment_1 )* )
            {
            // InternalRefLang.g:801:1: ( ( rule__References3__References3Assignment_1 )* )
            // InternalRefLang.g:802:2: ( rule__References3__References3Assignment_1 )*
            {
             before(grammarAccess.getReferences3Access().getReferences3Assignment_1()); 
            // InternalRefLang.g:803:2: ( rule__References3__References3Assignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRefLang.g:803:3: rule__References3__References3Assignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__References3__References3Assignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getReferences3Access().getReferences3Assignment_1()); 

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
    // $ANTLR end "rule__References3__Group__1__Impl"


    // $ANTLR start "rule__Reference3__Group__0"
    // InternalRefLang.g:812:1: rule__Reference3__Group__0 : rule__Reference3__Group__0__Impl rule__Reference3__Group__1 ;
    public final void rule__Reference3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:816:1: ( rule__Reference3__Group__0__Impl rule__Reference3__Group__1 )
            // InternalRefLang.g:817:2: rule__Reference3__Group__0__Impl rule__Reference3__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Reference3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference3__Group__1();

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
    // $ANTLR end "rule__Reference3__Group__0"


    // $ANTLR start "rule__Reference3__Group__0__Impl"
    // InternalRefLang.g:824:1: rule__Reference3__Group__0__Impl : ( '->' ) ;
    public final void rule__Reference3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:828:1: ( ( '->' ) )
            // InternalRefLang.g:829:1: ( '->' )
            {
            // InternalRefLang.g:829:1: ( '->' )
            // InternalRefLang.g:830:2: '->'
            {
             before(grammarAccess.getReference3Access().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReference3Access().getHyphenMinusGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Reference3__Group__0__Impl"


    // $ANTLR start "rule__Reference3__Group__1"
    // InternalRefLang.g:839:1: rule__Reference3__Group__1 : rule__Reference3__Group__1__Impl ;
    public final void rule__Reference3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:843:1: ( rule__Reference3__Group__1__Impl )
            // InternalRefLang.g:844:2: rule__Reference3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference3__Group__1__Impl();

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
    // $ANTLR end "rule__Reference3__Group__1"


    // $ANTLR start "rule__Reference3__Group__1__Impl"
    // InternalRefLang.g:850:1: rule__Reference3__Group__1__Impl : ( ( rule__Reference3__Target3Assignment_1 ) ) ;
    public final void rule__Reference3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:854:1: ( ( ( rule__Reference3__Target3Assignment_1 ) ) )
            // InternalRefLang.g:855:1: ( ( rule__Reference3__Target3Assignment_1 ) )
            {
            // InternalRefLang.g:855:1: ( ( rule__Reference3__Target3Assignment_1 ) )
            // InternalRefLang.g:856:2: ( rule__Reference3__Target3Assignment_1 )
            {
             before(grammarAccess.getReference3Access().getTarget3Assignment_1()); 
            // InternalRefLang.g:857:2: ( rule__Reference3__Target3Assignment_1 )
            // InternalRefLang.g:857:3: rule__Reference3__Target3Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference3__Target3Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReference3Access().getTarget3Assignment_1()); 

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
    // $ANTLR end "rule__Reference3__Group__1__Impl"


    // $ANTLR start "rule__QID__Group__0"
    // InternalRefLang.g:866:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:870:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // InternalRefLang.g:871:2: rule__QID__Group__0__Impl rule__QID__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QID__Group__1();

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
    // $ANTLR end "rule__QID__Group__0"


    // $ANTLR start "rule__QID__Group__0__Impl"
    // InternalRefLang.g:878:1: rule__QID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:882:1: ( ( RULE_ID ) )
            // InternalRefLang.g:883:1: ( RULE_ID )
            {
            // InternalRefLang.g:883:1: ( RULE_ID )
            // InternalRefLang.g:884:2: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QID__Group__0__Impl"


    // $ANTLR start "rule__QID__Group__1"
    // InternalRefLang.g:893:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:897:1: ( rule__QID__Group__1__Impl )
            // InternalRefLang.g:898:2: rule__QID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QID__Group__1__Impl();

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
    // $ANTLR end "rule__QID__Group__1"


    // $ANTLR start "rule__QID__Group__1__Impl"
    // InternalRefLang.g:904:1: rule__QID__Group__1__Impl : ( ( rule__QID__Group_1__0 )* ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:908:1: ( ( ( rule__QID__Group_1__0 )* ) )
            // InternalRefLang.g:909:1: ( ( rule__QID__Group_1__0 )* )
            {
            // InternalRefLang.g:909:1: ( ( rule__QID__Group_1__0 )* )
            // InternalRefLang.g:910:2: ( rule__QID__Group_1__0 )*
            {
             before(grammarAccess.getQIDAccess().getGroup_1()); 
            // InternalRefLang.g:911:2: ( rule__QID__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRefLang.g:911:3: rule__QID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__QID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getQIDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QID__Group__1__Impl"


    // $ANTLR start "rule__QID__Group_1__0"
    // InternalRefLang.g:920:1: rule__QID__Group_1__0 : rule__QID__Group_1__0__Impl rule__QID__Group_1__1 ;
    public final void rule__QID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:924:1: ( rule__QID__Group_1__0__Impl rule__QID__Group_1__1 )
            // InternalRefLang.g:925:2: rule__QID__Group_1__0__Impl rule__QID__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__QID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QID__Group_1__1();

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
    // $ANTLR end "rule__QID__Group_1__0"


    // $ANTLR start "rule__QID__Group_1__0__Impl"
    // InternalRefLang.g:932:1: rule__QID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:936:1: ( ( '.' ) )
            // InternalRefLang.g:937:1: ( '.' )
            {
            // InternalRefLang.g:937:1: ( '.' )
            // InternalRefLang.g:938:2: '.'
            {
             before(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QID__Group_1__0__Impl"


    // $ANTLR start "rule__QID__Group_1__1"
    // InternalRefLang.g:947:1: rule__QID__Group_1__1 : rule__QID__Group_1__1__Impl ;
    public final void rule__QID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:951:1: ( rule__QID__Group_1__1__Impl )
            // InternalRefLang.g:952:2: rule__QID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QID__Group_1__1__Impl();

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
    // $ANTLR end "rule__QID__Group_1__1"


    // $ANTLR start "rule__QID__Group_1__1__Impl"
    // InternalRefLang.g:958:1: rule__QID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:962:1: ( ( RULE_ID ) )
            // InternalRefLang.g:963:1: ( RULE_ID )
            {
            // InternalRefLang.g:963:1: ( RULE_ID )
            // InternalRefLang.g:964:2: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QID__Group_1__1__Impl"


    // $ANTLR start "rule__Container__ContentsAssignment"
    // InternalRefLang.g:974:1: rule__Container__ContentsAssignment : ( ruleIContainerContent ) ;
    public final void rule__Container__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:978:1: ( ( ruleIContainerContent ) )
            // InternalRefLang.g:979:2: ( ruleIContainerContent )
            {
            // InternalRefLang.g:979:2: ( ruleIContainerContent )
            // InternalRefLang.g:980:3: ruleIContainerContent
            {
             before(grammarAccess.getContainerAccess().getContentsIContainerContentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIContainerContent();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContentsIContainerContentParserRuleCall_0()); 

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
    // $ANTLR end "rule__Container__ContentsAssignment"


    // $ANTLR start "rule__SubContainer__NameAssignment_0"
    // InternalRefLang.g:989:1: rule__SubContainer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SubContainer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:993:1: ( ( RULE_ID ) )
            // InternalRefLang.g:994:2: ( RULE_ID )
            {
            // InternalRefLang.g:994:2: ( RULE_ID )
            // InternalRefLang.g:995:3: RULE_ID
            {
             before(grammarAccess.getSubContainerAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubContainerAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SubContainer__NameAssignment_0"


    // $ANTLR start "rule__SubContainer__SubContentsAssignment_2"
    // InternalRefLang.g:1004:1: rule__SubContainer__SubContentsAssignment_2 : ( ruleIContainerContent ) ;
    public final void rule__SubContainer__SubContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:1008:1: ( ( ruleIContainerContent ) )
            // InternalRefLang.g:1009:2: ( ruleIContainerContent )
            {
            // InternalRefLang.g:1009:2: ( ruleIContainerContent )
            // InternalRefLang.g:1010:3: ruleIContainerContent
            {
             before(grammarAccess.getSubContainerAccess().getSubContentsIContainerContentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIContainerContent();

            state._fsp--;

             after(grammarAccess.getSubContainerAccess().getSubContentsIContainerContentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SubContainer__SubContentsAssignment_2"


    // $ANTLR start "rule__Leaf__NameAssignment_0"
    // InternalRefLang.g:1019:1: rule__Leaf__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Leaf__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:1023:1: ( ( RULE_ID ) )
            // InternalRefLang.g:1024:2: ( RULE_ID )
            {
            // InternalRefLang.g:1024:2: ( RULE_ID )
            // InternalRefLang.g:1025:3: RULE_ID
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


    // $ANTLR start "rule__References__ReferencesAssignment_1"
    // InternalRefLang.g:1034:1: rule__References__ReferencesAssignment_1 : ( ruleReference ) ;
    public final void rule__References__ReferencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:1038:1: ( ( ruleReference ) )
            // InternalRefLang.g:1039:2: ( ruleReference )
            {
            // InternalRefLang.g:1039:2: ( ruleReference )
            // InternalRefLang.g:1040:3: ruleReference
            {
             before(grammarAccess.getReferencesAccess().getReferencesReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferencesAccess().getReferencesReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__References__ReferencesAssignment_1"


    // $ANTLR start "rule__Reference__TargetAssignment_1"
    // InternalRefLang.g:1049:1: rule__Reference__TargetAssignment_1 : ( ( ruleQID ) ) ;
    public final void rule__Reference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:1053:1: ( ( ( ruleQID ) ) )
            // InternalRefLang.g:1054:2: ( ( ruleQID ) )
            {
            // InternalRefLang.g:1054:2: ( ( ruleQID ) )
            // InternalRefLang.g:1055:3: ( ruleQID )
            {
             before(grammarAccess.getReferenceAccess().getTargetIContainerContentCrossReference_1_0()); 
            // InternalRefLang.g:1056:3: ( ruleQID )
            // InternalRefLang.g:1057:4: ruleQID
            {
             before(grammarAccess.getReferenceAccess().getTargetIContainerContentQIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getTargetIContainerContentQIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getTargetIContainerContentCrossReference_1_0()); 

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
    // $ANTLR end "rule__Reference__TargetAssignment_1"


    // $ANTLR start "rule__References2__References2Assignment_1"
    // InternalRefLang.g:1068:1: rule__References2__References2Assignment_1 : ( ruleReference ) ;
    public final void rule__References2__References2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:1072:1: ( ( ruleReference ) )
            // InternalRefLang.g:1073:2: ( ruleReference )
            {
            // InternalRefLang.g:1073:2: ( ruleReference )
            // InternalRefLang.g:1074:3: ruleReference
            {
             before(grammarAccess.getReferences2Access().getReferences2ReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferences2Access().getReferences2ReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__References2__References2Assignment_1"


    // $ANTLR start "rule__References3__References3Assignment_1"
    // InternalRefLang.g:1083:1: rule__References3__References3Assignment_1 : ( ruleReference3 ) ;
    public final void rule__References3__References3Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:1087:1: ( ( ruleReference3 ) )
            // InternalRefLang.g:1088:2: ( ruleReference3 )
            {
            // InternalRefLang.g:1088:2: ( ruleReference3 )
            // InternalRefLang.g:1089:3: ruleReference3
            {
             before(grammarAccess.getReferences3Access().getReferences3Reference3ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference3();

            state._fsp--;

             after(grammarAccess.getReferences3Access().getReferences3Reference3ParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__References3__References3Assignment_1"


    // $ANTLR start "rule__Reference3__Target3Assignment_1"
    // InternalRefLang.g:1098:1: rule__Reference3__Target3Assignment_1 : ( ( ruleQID ) ) ;
    public final void rule__Reference3__Target3Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLang.g:1102:1: ( ( ( ruleQID ) ) )
            // InternalRefLang.g:1103:2: ( ( ruleQID ) )
            {
            // InternalRefLang.g:1103:2: ( ( ruleQID ) )
            // InternalRefLang.g:1104:3: ( ruleQID )
            {
             before(grammarAccess.getReference3Access().getTarget3IContainerContentCrossReference_1_0()); 
            // InternalRefLang.g:1105:3: ( ruleQID )
            // InternalRefLang.g:1106:4: ruleQID
            {
             before(grammarAccess.getReference3Access().getTarget3IContainerContentQIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQID();

            state._fsp--;

             after(grammarAccess.getReference3Access().getTarget3IContainerContentQIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReference3Access().getTarget3IContainerContentCrossReference_1_0()); 

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
    // $ANTLR end "rule__Reference3__Target3Assignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});

}