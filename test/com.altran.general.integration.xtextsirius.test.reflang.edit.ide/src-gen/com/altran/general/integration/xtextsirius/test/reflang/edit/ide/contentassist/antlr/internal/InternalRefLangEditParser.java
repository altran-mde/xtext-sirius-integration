package com.altran.general.integration.xtextsirius.test.reflang.edit.ide.contentassist.antlr.internal;

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
import com.altran.general.integration.xtextsirius.test.reflang.edit.services.RefLangEditGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRefLangEditParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(RefLangEditGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleXContainer"
    // InternalRefLangEdit.g:53:1: entryRuleXContainer : ruleXContainer EOF ;
    public final void entryRuleXContainer() throws RecognitionException {
        try {
            // InternalRefLangEdit.g:54:1: ( ruleXContainer EOF )
            // InternalRefLangEdit.g:55:1: ruleXContainer EOF
            {
             before(grammarAccess.getXContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleXContainer();

            state._fsp--;

             after(grammarAccess.getXContainerRule()); 
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
    // $ANTLR end "entryRuleXContainer"


    // $ANTLR start "ruleXContainer"
    // InternalRefLangEdit.g:62:1: ruleXContainer : ( ruleContainer ) ;
    public final void ruleXContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:66:2: ( ( ruleContainer ) )
            // InternalRefLangEdit.g:67:2: ( ruleContainer )
            {
            // InternalRefLangEdit.g:67:2: ( ruleContainer )
            // InternalRefLangEdit.g:68:3: ruleContainer
            {
             before(grammarAccess.getXContainerAccess().getContainerParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getXContainerAccess().getContainerParserRuleCall()); 

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
    // $ANTLR end "ruleXContainer"


    // $ANTLR start "entryRuleReference"
    // InternalRefLangEdit.g:78:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalRefLangEdit.g:79:1: ( ruleReference EOF )
            // InternalRefLangEdit.g:80:1: ruleReference EOF
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
    // InternalRefLangEdit.g:87:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:91:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalRefLangEdit.g:92:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalRefLangEdit.g:92:2: ( ( rule__Reference__Group__0 ) )
            // InternalRefLangEdit.g:93:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalRefLangEdit.g:94:3: ( rule__Reference__Group__0 )
            // InternalRefLangEdit.g:94:4: rule__Reference__Group__0
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


    // $ANTLR start "entryRuleContainer"
    // InternalRefLangEdit.g:103:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalRefLangEdit.g:104:1: ( ruleContainer EOF )
            // InternalRefLangEdit.g:105:1: ruleContainer EOF
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
    // InternalRefLangEdit.g:112:1: ruleContainer : ( ( rule__Container__ContentsAssignment )* ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:116:2: ( ( ( rule__Container__ContentsAssignment )* ) )
            // InternalRefLangEdit.g:117:2: ( ( rule__Container__ContentsAssignment )* )
            {
            // InternalRefLangEdit.g:117:2: ( ( rule__Container__ContentsAssignment )* )
            // InternalRefLangEdit.g:118:3: ( rule__Container__ContentsAssignment )*
            {
             before(grammarAccess.getContainerAccess().getContentsAssignment()); 
            // InternalRefLangEdit.g:119:3: ( rule__Container__ContentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRefLangEdit.g:119:4: rule__Container__ContentsAssignment
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
    // InternalRefLangEdit.g:128:1: entryRuleIContainerContent : ruleIContainerContent EOF ;
    public final void entryRuleIContainerContent() throws RecognitionException {
        try {
            // InternalRefLangEdit.g:129:1: ( ruleIContainerContent EOF )
            // InternalRefLangEdit.g:130:1: ruleIContainerContent EOF
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
    // InternalRefLangEdit.g:137:1: ruleIContainerContent : ( ( rule__IContainerContent__Alternatives ) ) ;
    public final void ruleIContainerContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:141:2: ( ( ( rule__IContainerContent__Alternatives ) ) )
            // InternalRefLangEdit.g:142:2: ( ( rule__IContainerContent__Alternatives ) )
            {
            // InternalRefLangEdit.g:142:2: ( ( rule__IContainerContent__Alternatives ) )
            // InternalRefLangEdit.g:143:3: ( rule__IContainerContent__Alternatives )
            {
             before(grammarAccess.getIContainerContentAccess().getAlternatives()); 
            // InternalRefLangEdit.g:144:3: ( rule__IContainerContent__Alternatives )
            // InternalRefLangEdit.g:144:4: rule__IContainerContent__Alternatives
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
    // InternalRefLangEdit.g:153:1: entryRuleSubContainer : ruleSubContainer EOF ;
    public final void entryRuleSubContainer() throws RecognitionException {
        try {
            // InternalRefLangEdit.g:154:1: ( ruleSubContainer EOF )
            // InternalRefLangEdit.g:155:1: ruleSubContainer EOF
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
    // InternalRefLangEdit.g:162:1: ruleSubContainer : ( ( rule__SubContainer__Group__0 ) ) ;
    public final void ruleSubContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:166:2: ( ( ( rule__SubContainer__Group__0 ) ) )
            // InternalRefLangEdit.g:167:2: ( ( rule__SubContainer__Group__0 ) )
            {
            // InternalRefLangEdit.g:167:2: ( ( rule__SubContainer__Group__0 ) )
            // InternalRefLangEdit.g:168:3: ( rule__SubContainer__Group__0 )
            {
             before(grammarAccess.getSubContainerAccess().getGroup()); 
            // InternalRefLangEdit.g:169:3: ( rule__SubContainer__Group__0 )
            // InternalRefLangEdit.g:169:4: rule__SubContainer__Group__0
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
    // InternalRefLangEdit.g:178:1: entryRuleLeaf : ruleLeaf EOF ;
    public final void entryRuleLeaf() throws RecognitionException {
        try {
            // InternalRefLangEdit.g:179:1: ( ruleLeaf EOF )
            // InternalRefLangEdit.g:180:1: ruleLeaf EOF
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
    // InternalRefLangEdit.g:187:1: ruleLeaf : ( ( rule__Leaf__Group__0 ) ) ;
    public final void ruleLeaf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:191:2: ( ( ( rule__Leaf__Group__0 ) ) )
            // InternalRefLangEdit.g:192:2: ( ( rule__Leaf__Group__0 ) )
            {
            // InternalRefLangEdit.g:192:2: ( ( rule__Leaf__Group__0 ) )
            // InternalRefLangEdit.g:193:3: ( rule__Leaf__Group__0 )
            {
             before(grammarAccess.getLeafAccess().getGroup()); 
            // InternalRefLangEdit.g:194:3: ( rule__Leaf__Group__0 )
            // InternalRefLangEdit.g:194:4: rule__Leaf__Group__0
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
    // InternalRefLangEdit.g:204:1: ruleReferences : ( ( rule__References__Group__0 ) ) ;
    public final void ruleReferences() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:208:2: ( ( ( rule__References__Group__0 ) ) )
            // InternalRefLangEdit.g:209:2: ( ( rule__References__Group__0 ) )
            {
            // InternalRefLangEdit.g:209:2: ( ( rule__References__Group__0 ) )
            // InternalRefLangEdit.g:210:3: ( rule__References__Group__0 )
            {
             before(grammarAccess.getReferencesAccess().getGroup()); 
            // InternalRefLangEdit.g:211:3: ( rule__References__Group__0 )
            // InternalRefLangEdit.g:211:4: rule__References__Group__0
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


    // $ANTLR start "ruleReferences2"
    // InternalRefLangEdit.g:221:1: ruleReferences2 : ( ( rule__References2__Group__0 ) ) ;
    public final void ruleReferences2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:225:2: ( ( ( rule__References2__Group__0 ) ) )
            // InternalRefLangEdit.g:226:2: ( ( rule__References2__Group__0 ) )
            {
            // InternalRefLangEdit.g:226:2: ( ( rule__References2__Group__0 ) )
            // InternalRefLangEdit.g:227:3: ( rule__References2__Group__0 )
            {
             before(grammarAccess.getReferences2Access().getGroup()); 
            // InternalRefLangEdit.g:228:3: ( rule__References2__Group__0 )
            // InternalRefLangEdit.g:228:4: rule__References2__Group__0
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
    // InternalRefLangEdit.g:238:1: ruleReferences3 : ( ( rule__References3__Group__0 ) ) ;
    public final void ruleReferences3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:242:2: ( ( ( rule__References3__Group__0 ) ) )
            // InternalRefLangEdit.g:243:2: ( ( rule__References3__Group__0 ) )
            {
            // InternalRefLangEdit.g:243:2: ( ( rule__References3__Group__0 ) )
            // InternalRefLangEdit.g:244:3: ( rule__References3__Group__0 )
            {
             before(grammarAccess.getReferences3Access().getGroup()); 
            // InternalRefLangEdit.g:245:3: ( rule__References3__Group__0 )
            // InternalRefLangEdit.g:245:4: rule__References3__Group__0
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
    // InternalRefLangEdit.g:254:1: entryRuleReference3 : ruleReference3 EOF ;
    public final void entryRuleReference3() throws RecognitionException {
        try {
            // InternalRefLangEdit.g:255:1: ( ruleReference3 EOF )
            // InternalRefLangEdit.g:256:1: ruleReference3 EOF
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
    // InternalRefLangEdit.g:263:1: ruleReference3 : ( ( rule__Reference3__Group__0 ) ) ;
    public final void ruleReference3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:267:2: ( ( ( rule__Reference3__Group__0 ) ) )
            // InternalRefLangEdit.g:268:2: ( ( rule__Reference3__Group__0 ) )
            {
            // InternalRefLangEdit.g:268:2: ( ( rule__Reference3__Group__0 ) )
            // InternalRefLangEdit.g:269:3: ( rule__Reference3__Group__0 )
            {
             before(grammarAccess.getReference3Access().getGroup()); 
            // InternalRefLangEdit.g:270:3: ( rule__Reference3__Group__0 )
            // InternalRefLangEdit.g:270:4: rule__Reference3__Group__0
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
    // InternalRefLangEdit.g:279:1: entryRuleQID : ruleQID EOF ;
    public final void entryRuleQID() throws RecognitionException {
        try {
            // InternalRefLangEdit.g:280:1: ( ruleQID EOF )
            // InternalRefLangEdit.g:281:1: ruleQID EOF
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
    // InternalRefLangEdit.g:288:1: ruleQID : ( ( rule__QID__Group__0 ) ) ;
    public final void ruleQID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:292:2: ( ( ( rule__QID__Group__0 ) ) )
            // InternalRefLangEdit.g:293:2: ( ( rule__QID__Group__0 ) )
            {
            // InternalRefLangEdit.g:293:2: ( ( rule__QID__Group__0 ) )
            // InternalRefLangEdit.g:294:3: ( rule__QID__Group__0 )
            {
             before(grammarAccess.getQIDAccess().getGroup()); 
            // InternalRefLangEdit.g:295:3: ( rule__QID__Group__0 )
            // InternalRefLangEdit.g:295:4: rule__QID__Group__0
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
    // InternalRefLangEdit.g:303:1: rule__IContainerContent__Alternatives : ( ( ruleSubContainer ) | ( ruleLeaf ) );
    public final void rule__IContainerContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:307:1: ( ( ruleSubContainer ) | ( ruleLeaf ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==12) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||(LA2_1>=13 && LA2_1<=16)) ) {
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
                    // InternalRefLangEdit.g:308:2: ( ruleSubContainer )
                    {
                    // InternalRefLangEdit.g:308:2: ( ruleSubContainer )
                    // InternalRefLangEdit.g:309:3: ruleSubContainer
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
                    // InternalRefLangEdit.g:314:2: ( ruleLeaf )
                    {
                    // InternalRefLangEdit.g:314:2: ( ruleLeaf )
                    // InternalRefLangEdit.g:315:3: ruleLeaf
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


    // $ANTLR start "rule__Reference__Group__0"
    // InternalRefLangEdit.g:324:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:328:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalRefLangEdit.g:329:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRefLangEdit.g:336:1: rule__Reference__Group__0__Impl : ( '->' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:340:1: ( ( '->' ) )
            // InternalRefLangEdit.g:341:1: ( '->' )
            {
            // InternalRefLangEdit.g:341:1: ( '->' )
            // InternalRefLangEdit.g:342:2: '->'
            {
             before(grammarAccess.getReferenceAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalRefLangEdit.g:351:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:355:1: ( rule__Reference__Group__1__Impl )
            // InternalRefLangEdit.g:356:2: rule__Reference__Group__1__Impl
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
    // InternalRefLangEdit.g:362:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__TargetAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:366:1: ( ( ( rule__Reference__TargetAssignment_1 ) ) )
            // InternalRefLangEdit.g:367:1: ( ( rule__Reference__TargetAssignment_1 ) )
            {
            // InternalRefLangEdit.g:367:1: ( ( rule__Reference__TargetAssignment_1 ) )
            // InternalRefLangEdit.g:368:2: ( rule__Reference__TargetAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getTargetAssignment_1()); 
            // InternalRefLangEdit.g:369:2: ( rule__Reference__TargetAssignment_1 )
            // InternalRefLangEdit.g:369:3: rule__Reference__TargetAssignment_1
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


    // $ANTLR start "rule__SubContainer__Group__0"
    // InternalRefLangEdit.g:378:1: rule__SubContainer__Group__0 : rule__SubContainer__Group__0__Impl rule__SubContainer__Group__1 ;
    public final void rule__SubContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:382:1: ( rule__SubContainer__Group__0__Impl rule__SubContainer__Group__1 )
            // InternalRefLangEdit.g:383:2: rule__SubContainer__Group__0__Impl rule__SubContainer__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalRefLangEdit.g:390:1: rule__SubContainer__Group__0__Impl : ( ( rule__SubContainer__NameAssignment_0 ) ) ;
    public final void rule__SubContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:394:1: ( ( ( rule__SubContainer__NameAssignment_0 ) ) )
            // InternalRefLangEdit.g:395:1: ( ( rule__SubContainer__NameAssignment_0 ) )
            {
            // InternalRefLangEdit.g:395:1: ( ( rule__SubContainer__NameAssignment_0 ) )
            // InternalRefLangEdit.g:396:2: ( rule__SubContainer__NameAssignment_0 )
            {
             before(grammarAccess.getSubContainerAccess().getNameAssignment_0()); 
            // InternalRefLangEdit.g:397:2: ( rule__SubContainer__NameAssignment_0 )
            // InternalRefLangEdit.g:397:3: rule__SubContainer__NameAssignment_0
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
    // InternalRefLangEdit.g:405:1: rule__SubContainer__Group__1 : rule__SubContainer__Group__1__Impl rule__SubContainer__Group__2 ;
    public final void rule__SubContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:409:1: ( rule__SubContainer__Group__1__Impl rule__SubContainer__Group__2 )
            // InternalRefLangEdit.g:410:2: rule__SubContainer__Group__1__Impl rule__SubContainer__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalRefLangEdit.g:417:1: rule__SubContainer__Group__1__Impl : ( '{' ) ;
    public final void rule__SubContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:421:1: ( ( '{' ) )
            // InternalRefLangEdit.g:422:1: ( '{' )
            {
            // InternalRefLangEdit.g:422:1: ( '{' )
            // InternalRefLangEdit.g:423:2: '{'
            {
             before(grammarAccess.getSubContainerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalRefLangEdit.g:432:1: rule__SubContainer__Group__2 : rule__SubContainer__Group__2__Impl rule__SubContainer__Group__3 ;
    public final void rule__SubContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:436:1: ( rule__SubContainer__Group__2__Impl rule__SubContainer__Group__3 )
            // InternalRefLangEdit.g:437:2: rule__SubContainer__Group__2__Impl rule__SubContainer__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalRefLangEdit.g:444:1: rule__SubContainer__Group__2__Impl : ( ( rule__SubContainer__SubContentsAssignment_2 )* ) ;
    public final void rule__SubContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:448:1: ( ( ( rule__SubContainer__SubContentsAssignment_2 )* ) )
            // InternalRefLangEdit.g:449:1: ( ( rule__SubContainer__SubContentsAssignment_2 )* )
            {
            // InternalRefLangEdit.g:449:1: ( ( rule__SubContainer__SubContentsAssignment_2 )* )
            // InternalRefLangEdit.g:450:2: ( rule__SubContainer__SubContentsAssignment_2 )*
            {
             before(grammarAccess.getSubContainerAccess().getSubContentsAssignment_2()); 
            // InternalRefLangEdit.g:451:2: ( rule__SubContainer__SubContentsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRefLangEdit.g:451:3: rule__SubContainer__SubContentsAssignment_2
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
    // InternalRefLangEdit.g:459:1: rule__SubContainer__Group__3 : rule__SubContainer__Group__3__Impl rule__SubContainer__Group__4 ;
    public final void rule__SubContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:463:1: ( rule__SubContainer__Group__3__Impl rule__SubContainer__Group__4 )
            // InternalRefLangEdit.g:464:2: rule__SubContainer__Group__3__Impl rule__SubContainer__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRefLangEdit.g:471:1: rule__SubContainer__Group__3__Impl : ( '}' ) ;
    public final void rule__SubContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:475:1: ( ( '}' ) )
            // InternalRefLangEdit.g:476:1: ( '}' )
            {
            // InternalRefLangEdit.g:476:1: ( '}' )
            // InternalRefLangEdit.g:477:2: '}'
            {
             before(grammarAccess.getSubContainerAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalRefLangEdit.g:486:1: rule__SubContainer__Group__4 : rule__SubContainer__Group__4__Impl rule__SubContainer__Group__5 ;
    public final void rule__SubContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:490:1: ( rule__SubContainer__Group__4__Impl rule__SubContainer__Group__5 )
            // InternalRefLangEdit.g:491:2: rule__SubContainer__Group__4__Impl rule__SubContainer__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalRefLangEdit.g:498:1: rule__SubContainer__Group__4__Impl : ( ( ruleReferences )? ) ;
    public final void rule__SubContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:502:1: ( ( ( ruleReferences )? ) )
            // InternalRefLangEdit.g:503:1: ( ( ruleReferences )? )
            {
            // InternalRefLangEdit.g:503:1: ( ( ruleReferences )? )
            // InternalRefLangEdit.g:504:2: ( ruleReferences )?
            {
             before(grammarAccess.getSubContainerAccess().getReferencesParserRuleCall_4()); 
            // InternalRefLangEdit.g:505:2: ( ruleReferences )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRefLangEdit.g:505:3: ruleReferences
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
    // InternalRefLangEdit.g:513:1: rule__SubContainer__Group__5 : rule__SubContainer__Group__5__Impl rule__SubContainer__Group__6 ;
    public final void rule__SubContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:517:1: ( rule__SubContainer__Group__5__Impl rule__SubContainer__Group__6 )
            // InternalRefLangEdit.g:518:2: rule__SubContainer__Group__5__Impl rule__SubContainer__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalRefLangEdit.g:525:1: rule__SubContainer__Group__5__Impl : ( ( ruleReferences2 )? ) ;
    public final void rule__SubContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:529:1: ( ( ( ruleReferences2 )? ) )
            // InternalRefLangEdit.g:530:1: ( ( ruleReferences2 )? )
            {
            // InternalRefLangEdit.g:530:1: ( ( ruleReferences2 )? )
            // InternalRefLangEdit.g:531:2: ( ruleReferences2 )?
            {
             before(grammarAccess.getSubContainerAccess().getReferences2ParserRuleCall_5()); 
            // InternalRefLangEdit.g:532:2: ( ruleReferences2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRefLangEdit.g:532:3: ruleReferences2
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
    // InternalRefLangEdit.g:540:1: rule__SubContainer__Group__6 : rule__SubContainer__Group__6__Impl ;
    public final void rule__SubContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:544:1: ( rule__SubContainer__Group__6__Impl )
            // InternalRefLangEdit.g:545:2: rule__SubContainer__Group__6__Impl
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
    // InternalRefLangEdit.g:551:1: rule__SubContainer__Group__6__Impl : ( ( ruleReferences3 )? ) ;
    public final void rule__SubContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:555:1: ( ( ( ruleReferences3 )? ) )
            // InternalRefLangEdit.g:556:1: ( ( ruleReferences3 )? )
            {
            // InternalRefLangEdit.g:556:1: ( ( ruleReferences3 )? )
            // InternalRefLangEdit.g:557:2: ( ruleReferences3 )?
            {
             before(grammarAccess.getSubContainerAccess().getReferences3ParserRuleCall_6()); 
            // InternalRefLangEdit.g:558:2: ( ruleReferences3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRefLangEdit.g:558:3: ruleReferences3
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
    // InternalRefLangEdit.g:567:1: rule__Leaf__Group__0 : rule__Leaf__Group__0__Impl rule__Leaf__Group__1 ;
    public final void rule__Leaf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:571:1: ( rule__Leaf__Group__0__Impl rule__Leaf__Group__1 )
            // InternalRefLangEdit.g:572:2: rule__Leaf__Group__0__Impl rule__Leaf__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRefLangEdit.g:579:1: rule__Leaf__Group__0__Impl : ( ( rule__Leaf__NameAssignment_0 ) ) ;
    public final void rule__Leaf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:583:1: ( ( ( rule__Leaf__NameAssignment_0 ) ) )
            // InternalRefLangEdit.g:584:1: ( ( rule__Leaf__NameAssignment_0 ) )
            {
            // InternalRefLangEdit.g:584:1: ( ( rule__Leaf__NameAssignment_0 ) )
            // InternalRefLangEdit.g:585:2: ( rule__Leaf__NameAssignment_0 )
            {
             before(grammarAccess.getLeafAccess().getNameAssignment_0()); 
            // InternalRefLangEdit.g:586:2: ( rule__Leaf__NameAssignment_0 )
            // InternalRefLangEdit.g:586:3: rule__Leaf__NameAssignment_0
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
    // InternalRefLangEdit.g:594:1: rule__Leaf__Group__1 : rule__Leaf__Group__1__Impl rule__Leaf__Group__2 ;
    public final void rule__Leaf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:598:1: ( rule__Leaf__Group__1__Impl rule__Leaf__Group__2 )
            // InternalRefLangEdit.g:599:2: rule__Leaf__Group__1__Impl rule__Leaf__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRefLangEdit.g:606:1: rule__Leaf__Group__1__Impl : ( ( ruleReferences )? ) ;
    public final void rule__Leaf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:610:1: ( ( ( ruleReferences )? ) )
            // InternalRefLangEdit.g:611:1: ( ( ruleReferences )? )
            {
            // InternalRefLangEdit.g:611:1: ( ( ruleReferences )? )
            // InternalRefLangEdit.g:612:2: ( ruleReferences )?
            {
             before(grammarAccess.getLeafAccess().getReferencesParserRuleCall_1()); 
            // InternalRefLangEdit.g:613:2: ( ruleReferences )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRefLangEdit.g:613:3: ruleReferences
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
    // InternalRefLangEdit.g:621:1: rule__Leaf__Group__2 : rule__Leaf__Group__2__Impl rule__Leaf__Group__3 ;
    public final void rule__Leaf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:625:1: ( rule__Leaf__Group__2__Impl rule__Leaf__Group__3 )
            // InternalRefLangEdit.g:626:2: rule__Leaf__Group__2__Impl rule__Leaf__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRefLangEdit.g:633:1: rule__Leaf__Group__2__Impl : ( ( ruleReferences2 )? ) ;
    public final void rule__Leaf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:637:1: ( ( ( ruleReferences2 )? ) )
            // InternalRefLangEdit.g:638:1: ( ( ruleReferences2 )? )
            {
            // InternalRefLangEdit.g:638:1: ( ( ruleReferences2 )? )
            // InternalRefLangEdit.g:639:2: ( ruleReferences2 )?
            {
             before(grammarAccess.getLeafAccess().getReferences2ParserRuleCall_2()); 
            // InternalRefLangEdit.g:640:2: ( ruleReferences2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRefLangEdit.g:640:3: ruleReferences2
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
    // InternalRefLangEdit.g:648:1: rule__Leaf__Group__3 : rule__Leaf__Group__3__Impl ;
    public final void rule__Leaf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:652:1: ( rule__Leaf__Group__3__Impl )
            // InternalRefLangEdit.g:653:2: rule__Leaf__Group__3__Impl
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
    // InternalRefLangEdit.g:659:1: rule__Leaf__Group__3__Impl : ( ( ruleReferences3 )? ) ;
    public final void rule__Leaf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:663:1: ( ( ( ruleReferences3 )? ) )
            // InternalRefLangEdit.g:664:1: ( ( ruleReferences3 )? )
            {
            // InternalRefLangEdit.g:664:1: ( ( ruleReferences3 )? )
            // InternalRefLangEdit.g:665:2: ( ruleReferences3 )?
            {
             before(grammarAccess.getLeafAccess().getReferences3ParserRuleCall_3()); 
            // InternalRefLangEdit.g:666:2: ( ruleReferences3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRefLangEdit.g:666:3: ruleReferences3
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
    // InternalRefLangEdit.g:675:1: rule__References__Group__0 : rule__References__Group__0__Impl rule__References__Group__1 ;
    public final void rule__References__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:679:1: ( rule__References__Group__0__Impl rule__References__Group__1 )
            // InternalRefLangEdit.g:680:2: rule__References__Group__0__Impl rule__References__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRefLangEdit.g:687:1: rule__References__Group__0__Impl : ( '1' ) ;
    public final void rule__References__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:691:1: ( ( '1' ) )
            // InternalRefLangEdit.g:692:1: ( '1' )
            {
            // InternalRefLangEdit.g:692:1: ( '1' )
            // InternalRefLangEdit.g:693:2: '1'
            {
             before(grammarAccess.getReferencesAccess().getDigitOneKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRefLangEdit.g:702:1: rule__References__Group__1 : rule__References__Group__1__Impl ;
    public final void rule__References__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:706:1: ( rule__References__Group__1__Impl )
            // InternalRefLangEdit.g:707:2: rule__References__Group__1__Impl
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
    // InternalRefLangEdit.g:713:1: rule__References__Group__1__Impl : ( ( rule__References__ReferencesAssignment_1 )* ) ;
    public final void rule__References__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:717:1: ( ( ( rule__References__ReferencesAssignment_1 )* ) )
            // InternalRefLangEdit.g:718:1: ( ( rule__References__ReferencesAssignment_1 )* )
            {
            // InternalRefLangEdit.g:718:1: ( ( rule__References__ReferencesAssignment_1 )* )
            // InternalRefLangEdit.g:719:2: ( rule__References__ReferencesAssignment_1 )*
            {
             before(grammarAccess.getReferencesAccess().getReferencesAssignment_1()); 
            // InternalRefLangEdit.g:720:2: ( rule__References__ReferencesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRefLangEdit.g:720:3: rule__References__ReferencesAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
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


    // $ANTLR start "rule__References2__Group__0"
    // InternalRefLangEdit.g:729:1: rule__References2__Group__0 : rule__References2__Group__0__Impl rule__References2__Group__1 ;
    public final void rule__References2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:733:1: ( rule__References2__Group__0__Impl rule__References2__Group__1 )
            // InternalRefLangEdit.g:734:2: rule__References2__Group__0__Impl rule__References2__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRefLangEdit.g:741:1: rule__References2__Group__0__Impl : ( '2' ) ;
    public final void rule__References2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:745:1: ( ( '2' ) )
            // InternalRefLangEdit.g:746:1: ( '2' )
            {
            // InternalRefLangEdit.g:746:1: ( '2' )
            // InternalRefLangEdit.g:747:2: '2'
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
    // InternalRefLangEdit.g:756:1: rule__References2__Group__1 : rule__References2__Group__1__Impl ;
    public final void rule__References2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:760:1: ( rule__References2__Group__1__Impl )
            // InternalRefLangEdit.g:761:2: rule__References2__Group__1__Impl
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
    // InternalRefLangEdit.g:767:1: rule__References2__Group__1__Impl : ( ( rule__References2__References2Assignment_1 )* ) ;
    public final void rule__References2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:771:1: ( ( ( rule__References2__References2Assignment_1 )* ) )
            // InternalRefLangEdit.g:772:1: ( ( rule__References2__References2Assignment_1 )* )
            {
            // InternalRefLangEdit.g:772:1: ( ( rule__References2__References2Assignment_1 )* )
            // InternalRefLangEdit.g:773:2: ( rule__References2__References2Assignment_1 )*
            {
             before(grammarAccess.getReferences2Access().getReferences2Assignment_1()); 
            // InternalRefLangEdit.g:774:2: ( rule__References2__References2Assignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRefLangEdit.g:774:3: rule__References2__References2Assignment_1
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalRefLangEdit.g:783:1: rule__References3__Group__0 : rule__References3__Group__0__Impl rule__References3__Group__1 ;
    public final void rule__References3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:787:1: ( rule__References3__Group__0__Impl rule__References3__Group__1 )
            // InternalRefLangEdit.g:788:2: rule__References3__Group__0__Impl rule__References3__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRefLangEdit.g:795:1: rule__References3__Group__0__Impl : ( '3' ) ;
    public final void rule__References3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:799:1: ( ( '3' ) )
            // InternalRefLangEdit.g:800:1: ( '3' )
            {
            // InternalRefLangEdit.g:800:1: ( '3' )
            // InternalRefLangEdit.g:801:2: '3'
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
    // InternalRefLangEdit.g:810:1: rule__References3__Group__1 : rule__References3__Group__1__Impl ;
    public final void rule__References3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:814:1: ( rule__References3__Group__1__Impl )
            // InternalRefLangEdit.g:815:2: rule__References3__Group__1__Impl
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
    // InternalRefLangEdit.g:821:1: rule__References3__Group__1__Impl : ( ( rule__References3__References3Assignment_1 )* ) ;
    public final void rule__References3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:825:1: ( ( ( rule__References3__References3Assignment_1 )* ) )
            // InternalRefLangEdit.g:826:1: ( ( rule__References3__References3Assignment_1 )* )
            {
            // InternalRefLangEdit.g:826:1: ( ( rule__References3__References3Assignment_1 )* )
            // InternalRefLangEdit.g:827:2: ( rule__References3__References3Assignment_1 )*
            {
             before(grammarAccess.getReferences3Access().getReferences3Assignment_1()); 
            // InternalRefLangEdit.g:828:2: ( rule__References3__References3Assignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRefLangEdit.g:828:3: rule__References3__References3Assignment_1
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalRefLangEdit.g:837:1: rule__Reference3__Group__0 : rule__Reference3__Group__0__Impl rule__Reference3__Group__1 ;
    public final void rule__Reference3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:841:1: ( rule__Reference3__Group__0__Impl rule__Reference3__Group__1 )
            // InternalRefLangEdit.g:842:2: rule__Reference3__Group__0__Impl rule__Reference3__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRefLangEdit.g:849:1: rule__Reference3__Group__0__Impl : ( '->' ) ;
    public final void rule__Reference3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:853:1: ( ( '->' ) )
            // InternalRefLangEdit.g:854:1: ( '->' )
            {
            // InternalRefLangEdit.g:854:1: ( '->' )
            // InternalRefLangEdit.g:855:2: '->'
            {
             before(grammarAccess.getReference3Access().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalRefLangEdit.g:864:1: rule__Reference3__Group__1 : rule__Reference3__Group__1__Impl ;
    public final void rule__Reference3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:868:1: ( rule__Reference3__Group__1__Impl )
            // InternalRefLangEdit.g:869:2: rule__Reference3__Group__1__Impl
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
    // InternalRefLangEdit.g:875:1: rule__Reference3__Group__1__Impl : ( ( rule__Reference3__Target3Assignment_1 ) ) ;
    public final void rule__Reference3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:879:1: ( ( ( rule__Reference3__Target3Assignment_1 ) ) )
            // InternalRefLangEdit.g:880:1: ( ( rule__Reference3__Target3Assignment_1 ) )
            {
            // InternalRefLangEdit.g:880:1: ( ( rule__Reference3__Target3Assignment_1 ) )
            // InternalRefLangEdit.g:881:2: ( rule__Reference3__Target3Assignment_1 )
            {
             before(grammarAccess.getReference3Access().getTarget3Assignment_1()); 
            // InternalRefLangEdit.g:882:2: ( rule__Reference3__Target3Assignment_1 )
            // InternalRefLangEdit.g:882:3: rule__Reference3__Target3Assignment_1
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
    // InternalRefLangEdit.g:891:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:895:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // InternalRefLangEdit.g:896:2: rule__QID__Group__0__Impl rule__QID__Group__1
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
    // InternalRefLangEdit.g:903:1: rule__QID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:907:1: ( ( RULE_ID ) )
            // InternalRefLangEdit.g:908:1: ( RULE_ID )
            {
            // InternalRefLangEdit.g:908:1: ( RULE_ID )
            // InternalRefLangEdit.g:909:2: RULE_ID
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
    // InternalRefLangEdit.g:918:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:922:1: ( rule__QID__Group__1__Impl )
            // InternalRefLangEdit.g:923:2: rule__QID__Group__1__Impl
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
    // InternalRefLangEdit.g:929:1: rule__QID__Group__1__Impl : ( ( rule__QID__Group_1__0 )* ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:933:1: ( ( ( rule__QID__Group_1__0 )* ) )
            // InternalRefLangEdit.g:934:1: ( ( rule__QID__Group_1__0 )* )
            {
            // InternalRefLangEdit.g:934:1: ( ( rule__QID__Group_1__0 )* )
            // InternalRefLangEdit.g:935:2: ( rule__QID__Group_1__0 )*
            {
             before(grammarAccess.getQIDAccess().getGroup_1()); 
            // InternalRefLangEdit.g:936:2: ( rule__QID__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRefLangEdit.g:936:3: rule__QID__Group_1__0
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
    // InternalRefLangEdit.g:945:1: rule__QID__Group_1__0 : rule__QID__Group_1__0__Impl rule__QID__Group_1__1 ;
    public final void rule__QID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:949:1: ( rule__QID__Group_1__0__Impl rule__QID__Group_1__1 )
            // InternalRefLangEdit.g:950:2: rule__QID__Group_1__0__Impl rule__QID__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRefLangEdit.g:957:1: rule__QID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:961:1: ( ( '.' ) )
            // InternalRefLangEdit.g:962:1: ( '.' )
            {
            // InternalRefLangEdit.g:962:1: ( '.' )
            // InternalRefLangEdit.g:963:2: '.'
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
    // InternalRefLangEdit.g:972:1: rule__QID__Group_1__1 : rule__QID__Group_1__1__Impl ;
    public final void rule__QID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:976:1: ( rule__QID__Group_1__1__Impl )
            // InternalRefLangEdit.g:977:2: rule__QID__Group_1__1__Impl
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
    // InternalRefLangEdit.g:983:1: rule__QID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:987:1: ( ( RULE_ID ) )
            // InternalRefLangEdit.g:988:1: ( RULE_ID )
            {
            // InternalRefLangEdit.g:988:1: ( RULE_ID )
            // InternalRefLangEdit.g:989:2: RULE_ID
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


    // $ANTLR start "rule__Reference__TargetAssignment_1"
    // InternalRefLangEdit.g:999:1: rule__Reference__TargetAssignment_1 : ( ( ruleQID ) ) ;
    public final void rule__Reference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:1003:1: ( ( ( ruleQID ) ) )
            // InternalRefLangEdit.g:1004:2: ( ( ruleQID ) )
            {
            // InternalRefLangEdit.g:1004:2: ( ( ruleQID ) )
            // InternalRefLangEdit.g:1005:3: ( ruleQID )
            {
             before(grammarAccess.getReferenceAccess().getTargetIContainerContentCrossReference_1_0()); 
            // InternalRefLangEdit.g:1006:3: ( ruleQID )
            // InternalRefLangEdit.g:1007:4: ruleQID
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


    // $ANTLR start "rule__Container__ContentsAssignment"
    // InternalRefLangEdit.g:1018:1: rule__Container__ContentsAssignment : ( ruleIContainerContent ) ;
    public final void rule__Container__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:1022:1: ( ( ruleIContainerContent ) )
            // InternalRefLangEdit.g:1023:2: ( ruleIContainerContent )
            {
            // InternalRefLangEdit.g:1023:2: ( ruleIContainerContent )
            // InternalRefLangEdit.g:1024:3: ruleIContainerContent
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
    // InternalRefLangEdit.g:1033:1: rule__SubContainer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SubContainer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:1037:1: ( ( RULE_ID ) )
            // InternalRefLangEdit.g:1038:2: ( RULE_ID )
            {
            // InternalRefLangEdit.g:1038:2: ( RULE_ID )
            // InternalRefLangEdit.g:1039:3: RULE_ID
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
    // InternalRefLangEdit.g:1048:1: rule__SubContainer__SubContentsAssignment_2 : ( ruleIContainerContent ) ;
    public final void rule__SubContainer__SubContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:1052:1: ( ( ruleIContainerContent ) )
            // InternalRefLangEdit.g:1053:2: ( ruleIContainerContent )
            {
            // InternalRefLangEdit.g:1053:2: ( ruleIContainerContent )
            // InternalRefLangEdit.g:1054:3: ruleIContainerContent
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
    // InternalRefLangEdit.g:1063:1: rule__Leaf__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Leaf__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:1067:1: ( ( RULE_ID ) )
            // InternalRefLangEdit.g:1068:2: ( RULE_ID )
            {
            // InternalRefLangEdit.g:1068:2: ( RULE_ID )
            // InternalRefLangEdit.g:1069:3: RULE_ID
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
    // InternalRefLangEdit.g:1078:1: rule__References__ReferencesAssignment_1 : ( ruleReference ) ;
    public final void rule__References__ReferencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:1082:1: ( ( ruleReference ) )
            // InternalRefLangEdit.g:1083:2: ( ruleReference )
            {
            // InternalRefLangEdit.g:1083:2: ( ruleReference )
            // InternalRefLangEdit.g:1084:3: ruleReference
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


    // $ANTLR start "rule__References2__References2Assignment_1"
    // InternalRefLangEdit.g:1093:1: rule__References2__References2Assignment_1 : ( ruleReference ) ;
    public final void rule__References2__References2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:1097:1: ( ( ruleReference ) )
            // InternalRefLangEdit.g:1098:2: ( ruleReference )
            {
            // InternalRefLangEdit.g:1098:2: ( ruleReference )
            // InternalRefLangEdit.g:1099:3: ruleReference
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
    // InternalRefLangEdit.g:1108:1: rule__References3__References3Assignment_1 : ( ruleReference3 ) ;
    public final void rule__References3__References3Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:1112:1: ( ( ruleReference3 ) )
            // InternalRefLangEdit.g:1113:2: ( ruleReference3 )
            {
            // InternalRefLangEdit.g:1113:2: ( ruleReference3 )
            // InternalRefLangEdit.g:1114:3: ruleReference3
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
    // InternalRefLangEdit.g:1123:1: rule__Reference3__Target3Assignment_1 : ( ( ruleQID ) ) ;
    public final void rule__Reference3__Target3Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRefLangEdit.g:1127:1: ( ( ( ruleQID ) ) )
            // InternalRefLangEdit.g:1128:2: ( ( ruleQID ) )
            {
            // InternalRefLangEdit.g:1128:2: ( ( ruleQID ) )
            // InternalRefLangEdit.g:1129:3: ( ruleQID )
            {
             before(grammarAccess.getReference3Access().getTarget3IContainerContentCrossReference_1_0()); 
            // InternalRefLangEdit.g:1130:3: ( ruleQID )
            // InternalRefLangEdit.g:1131:4: ruleQID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});

}