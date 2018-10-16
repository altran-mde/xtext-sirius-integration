package com.example.classes.ide.contentassist.antlr.internal;

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
import com.example.classes.services.InlineeditGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInlineeditParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DESCRIPTION_TEXT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'public'", "'#'", "'protected'", "'-'", "'private'", "'association'", "'['", "'..'", "']'", "'-->'", "'constant'", "'='", "'class'", "'{'", "'}'", "':'", "'string'", "'integer'"
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

    	public void setGrammarAccess(InlineeditGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleInlineClassModel"
    // InternalInlineedit.g:53:1: entryRuleInlineClassModel : ruleInlineClassModel EOF ;
    public final void entryRuleInlineClassModel() throws RecognitionException {
        try {
            // InternalInlineedit.g:54:1: ( ruleInlineClassModel EOF )
            // InternalInlineedit.g:55:1: ruleInlineClassModel EOF
            {
             before(grammarAccess.getInlineClassModelRule()); 
            pushFollow(FOLLOW_1);
            ruleInlineClassModel();

            state._fsp--;

             after(grammarAccess.getInlineClassModelRule()); 
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
    // $ANTLR end "entryRuleInlineClassModel"


    // $ANTLR start "ruleInlineClassModel"
    // InternalInlineedit.g:62:1: ruleInlineClassModel : ( ruleClassModel ) ;
    public final void ruleInlineClassModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:66:2: ( ( ruleClassModel ) )
            // InternalInlineedit.g:67:2: ( ruleClassModel )
            {
            // InternalInlineedit.g:67:2: ( ruleClassModel )
            // InternalInlineedit.g:68:3: ruleClassModel
            {
             before(grammarAccess.getInlineClassModelAccess().getClassModelParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleClassModel();

            state._fsp--;

             after(grammarAccess.getInlineClassModelAccess().getClassModelParserRuleCall()); 

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
    // $ANTLR end "ruleInlineClassModel"


    // $ANTLR start "entryRuleAssociation"
    // InternalInlineedit.g:78:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalInlineedit.g:79:1: ( ruleAssociation EOF )
            // InternalInlineedit.g:80:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalInlineedit.g:87:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:91:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalInlineedit.g:92:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalInlineedit.g:92:2: ( ( rule__Association__Group__0 ) )
            // InternalInlineedit.g:93:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalInlineedit.g:94:3: ( rule__Association__Group__0 )
            // InternalInlineedit.g:94:4: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleClassModel"
    // InternalInlineedit.g:103:1: entryRuleClassModel : ruleClassModel EOF ;
    public final void entryRuleClassModel() throws RecognitionException {
        try {
            // InternalInlineedit.g:104:1: ( ruleClassModel EOF )
            // InternalInlineedit.g:105:1: ruleClassModel EOF
            {
             before(grammarAccess.getClassModelRule()); 
            pushFollow(FOLLOW_1);
            ruleClassModel();

            state._fsp--;

             after(grammarAccess.getClassModelRule()); 
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
    // $ANTLR end "entryRuleClassModel"


    // $ANTLR start "ruleClassModel"
    // InternalInlineedit.g:112:1: ruleClassModel : ( ( rule__ClassModel__ContentAssignment )* ) ;
    public final void ruleClassModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:116:2: ( ( ( rule__ClassModel__ContentAssignment )* ) )
            // InternalInlineedit.g:117:2: ( ( rule__ClassModel__ContentAssignment )* )
            {
            // InternalInlineedit.g:117:2: ( ( rule__ClassModel__ContentAssignment )* )
            // InternalInlineedit.g:118:3: ( rule__ClassModel__ContentAssignment )*
            {
             before(grammarAccess.getClassModelAccess().getContentAssignment()); 
            // InternalInlineedit.g:119:3: ( rule__ClassModel__ContentAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_DESCRIPTION_TEXT||LA1_0==18||LA1_0==23||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalInlineedit.g:119:4: rule__ClassModel__ContentAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ClassModel__ContentAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getClassModelAccess().getContentAssignment()); 

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
    // $ANTLR end "ruleClassModel"


    // $ANTLR start "entryRuleContent"
    // InternalInlineedit.g:128:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalInlineedit.g:129:1: ( ruleContent EOF )
            // InternalInlineedit.g:130:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalInlineedit.g:137:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:141:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalInlineedit.g:142:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalInlineedit.g:142:2: ( ( rule__Content__Alternatives ) )
            // InternalInlineedit.g:143:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalInlineedit.g:144:3: ( rule__Content__Alternatives )
            // InternalInlineedit.g:144:4: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleConstant"
    // InternalInlineedit.g:153:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalInlineedit.g:154:1: ( ruleConstant EOF )
            // InternalInlineedit.g:155:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalInlineedit.g:162:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:166:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalInlineedit.g:167:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalInlineedit.g:167:2: ( ( rule__Constant__Group__0 ) )
            // InternalInlineedit.g:168:3: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // InternalInlineedit.g:169:3: ( rule__Constant__Group__0 )
            // InternalInlineedit.g:169:4: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleClass"
    // InternalInlineedit.g:178:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalInlineedit.g:179:1: ( ruleClass EOF )
            // InternalInlineedit.g:180:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalInlineedit.g:187:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:191:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalInlineedit.g:192:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalInlineedit.g:192:2: ( ( rule__Class__Group__0 ) )
            // InternalInlineedit.g:193:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalInlineedit.g:194:3: ( rule__Class__Group__0 )
            // InternalInlineedit.g:194:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalInlineedit.g:203:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalInlineedit.g:204:1: ( ruleAttribute EOF )
            // InternalInlineedit.g:205:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalInlineedit.g:212:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:216:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalInlineedit.g:217:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalInlineedit.g:217:2: ( ( rule__Attribute__Group__0 ) )
            // InternalInlineedit.g:218:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalInlineedit.g:219:3: ( rule__Attribute__Group__0 )
            // InternalInlineedit.g:219:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalInlineedit.g:228:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalInlineedit.g:229:1: ( ruleType EOF )
            // InternalInlineedit.g:230:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalInlineedit.g:237:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:241:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalInlineedit.g:242:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalInlineedit.g:242:2: ( ( rule__Type__Alternatives ) )
            // InternalInlineedit.g:243:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalInlineedit.g:244:3: ( rule__Type__Alternatives )
            // InternalInlineedit.g:244:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBuiltInType"
    // InternalInlineedit.g:253:1: entryRuleBuiltInType : ruleBuiltInType EOF ;
    public final void entryRuleBuiltInType() throws RecognitionException {
        try {
            // InternalInlineedit.g:254:1: ( ruleBuiltInType EOF )
            // InternalInlineedit.g:255:1: ruleBuiltInType EOF
            {
             before(grammarAccess.getBuiltInTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBuiltInType();

            state._fsp--;

             after(grammarAccess.getBuiltInTypeRule()); 
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
    // $ANTLR end "entryRuleBuiltInType"


    // $ANTLR start "ruleBuiltInType"
    // InternalInlineedit.g:262:1: ruleBuiltInType : ( ( rule__BuiltInType__Alternatives ) ) ;
    public final void ruleBuiltInType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:266:2: ( ( ( rule__BuiltInType__Alternatives ) ) )
            // InternalInlineedit.g:267:2: ( ( rule__BuiltInType__Alternatives ) )
            {
            // InternalInlineedit.g:267:2: ( ( rule__BuiltInType__Alternatives ) )
            // InternalInlineedit.g:268:3: ( rule__BuiltInType__Alternatives )
            {
             before(grammarAccess.getBuiltInTypeAccess().getAlternatives()); 
            // InternalInlineedit.g:269:3: ( rule__BuiltInType__Alternatives )
            // InternalInlineedit.g:269:4: rule__BuiltInType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BuiltInType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "entryRuleStringType"
    // InternalInlineedit.g:278:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalInlineedit.g:279:1: ( ruleStringType EOF )
            // InternalInlineedit.g:280:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalInlineedit.g:287:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:291:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalInlineedit.g:292:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalInlineedit.g:292:2: ( ( rule__StringType__Group__0 ) )
            // InternalInlineedit.g:293:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalInlineedit.g:294:3: ( rule__StringType__Group__0 )
            // InternalInlineedit.g:294:4: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalInlineedit.g:303:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalInlineedit.g:304:1: ( ruleIntegerType EOF )
            // InternalInlineedit.g:305:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalInlineedit.g:312:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:316:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalInlineedit.g:317:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalInlineedit.g:317:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalInlineedit.g:318:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalInlineedit.g:319:3: ( rule__IntegerType__Group__0 )
            // InternalInlineedit.g:319:4: rule__IntegerType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleClassRef"
    // InternalInlineedit.g:328:1: entryRuleClassRef : ruleClassRef EOF ;
    public final void entryRuleClassRef() throws RecognitionException {
        try {
            // InternalInlineedit.g:329:1: ( ruleClassRef EOF )
            // InternalInlineedit.g:330:1: ruleClassRef EOF
            {
             before(grammarAccess.getClassRefRule()); 
            pushFollow(FOLLOW_1);
            ruleClassRef();

            state._fsp--;

             after(grammarAccess.getClassRefRule()); 
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
    // $ANTLR end "entryRuleClassRef"


    // $ANTLR start "ruleClassRef"
    // InternalInlineedit.g:337:1: ruleClassRef : ( ( rule__ClassRef__TargetAssignment ) ) ;
    public final void ruleClassRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:341:2: ( ( ( rule__ClassRef__TargetAssignment ) ) )
            // InternalInlineedit.g:342:2: ( ( rule__ClassRef__TargetAssignment ) )
            {
            // InternalInlineedit.g:342:2: ( ( rule__ClassRef__TargetAssignment ) )
            // InternalInlineedit.g:343:3: ( rule__ClassRef__TargetAssignment )
            {
             before(grammarAccess.getClassRefAccess().getTargetAssignment()); 
            // InternalInlineedit.g:344:3: ( rule__ClassRef__TargetAssignment )
            // InternalInlineedit.g:344:4: rule__ClassRef__TargetAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ClassRef__TargetAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassRefAccess().getTargetAssignment()); 

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
    // $ANTLR end "ruleClassRef"


    // $ANTLR start "entryRuleValue"
    // InternalInlineedit.g:353:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalInlineedit.g:354:1: ( ruleValue EOF )
            // InternalInlineedit.g:355:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalInlineedit.g:362:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:366:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalInlineedit.g:367:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalInlineedit.g:367:2: ( ( rule__Value__Alternatives ) )
            // InternalInlineedit.g:368:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalInlineedit.g:369:3: ( rule__Value__Alternatives )
            // InternalInlineedit.g:369:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalInlineedit.g:378:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalInlineedit.g:379:1: ( ruleIntegerLiteral EOF )
            // InternalInlineedit.g:380:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalInlineedit.g:387:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:391:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalInlineedit.g:392:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalInlineedit.g:392:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalInlineedit.g:393:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalInlineedit.g:394:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalInlineedit.g:394:4: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleConstantRef"
    // InternalInlineedit.g:403:1: entryRuleConstantRef : ruleConstantRef EOF ;
    public final void entryRuleConstantRef() throws RecognitionException {
        try {
            // InternalInlineedit.g:404:1: ( ruleConstantRef EOF )
            // InternalInlineedit.g:405:1: ruleConstantRef EOF
            {
             before(grammarAccess.getConstantRefRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantRef();

            state._fsp--;

             after(grammarAccess.getConstantRefRule()); 
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
    // $ANTLR end "entryRuleConstantRef"


    // $ANTLR start "ruleConstantRef"
    // InternalInlineedit.g:412:1: ruleConstantRef : ( ( rule__ConstantRef__TargetAssignment ) ) ;
    public final void ruleConstantRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:416:2: ( ( ( rule__ConstantRef__TargetAssignment ) ) )
            // InternalInlineedit.g:417:2: ( ( rule__ConstantRef__TargetAssignment ) )
            {
            // InternalInlineedit.g:417:2: ( ( rule__ConstantRef__TargetAssignment ) )
            // InternalInlineedit.g:418:3: ( rule__ConstantRef__TargetAssignment )
            {
             before(grammarAccess.getConstantRefAccess().getTargetAssignment()); 
            // InternalInlineedit.g:419:3: ( rule__ConstantRef__TargetAssignment )
            // InternalInlineedit.g:419:4: rule__ConstantRef__TargetAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConstantRef__TargetAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstantRefAccess().getTargetAssignment()); 

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
    // $ANTLR end "ruleConstantRef"


    // $ANTLR start "ruleDescription"
    // InternalInlineedit.g:429:1: ruleDescription : ( ( rule__Description__DescriptionAssignment ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:433:2: ( ( ( rule__Description__DescriptionAssignment ) ) )
            // InternalInlineedit.g:434:2: ( ( rule__Description__DescriptionAssignment ) )
            {
            // InternalInlineedit.g:434:2: ( ( rule__Description__DescriptionAssignment ) )
            // InternalInlineedit.g:435:3: ( rule__Description__DescriptionAssignment )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); 
            // InternalInlineedit.g:436:3: ( rule__Description__DescriptionAssignment )
            // InternalInlineedit.g:436:4: rule__Description__DescriptionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Description__DescriptionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); 

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "ruleVisibility"
    // InternalInlineedit.g:445:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:449:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalInlineedit.g:450:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalInlineedit.g:450:2: ( ( rule__Visibility__Alternatives ) )
            // InternalInlineedit.g:451:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalInlineedit.g:452:3: ( rule__Visibility__Alternatives )
            // InternalInlineedit.g:452:4: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__Content__Alternatives"
    // InternalInlineedit.g:460:1: rule__Content__Alternatives : ( ( ruleConstant ) | ( ruleClass ) | ( ruleAssociation ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:464:1: ( ( ruleConstant ) | ( ruleClass ) | ( ruleAssociation ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_DESCRIPTION_TEXT:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt2=3;
                    }
                    break;
                case 23:
                    {
                    alt2=1;
                    }
                    break;
                case 25:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 23:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 18:
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
                    // InternalInlineedit.g:465:2: ( ruleConstant )
                    {
                    // InternalInlineedit.g:465:2: ( ruleConstant )
                    // InternalInlineedit.g:466:3: ruleConstant
                    {
                     before(grammarAccess.getContentAccess().getConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:471:2: ( ruleClass )
                    {
                    // InternalInlineedit.g:471:2: ( ruleClass )
                    // InternalInlineedit.g:472:3: ruleClass
                    {
                     before(grammarAccess.getContentAccess().getClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInlineedit.g:477:2: ( ruleAssociation )
                    {
                    // InternalInlineedit.g:477:2: ( ruleAssociation )
                    // InternalInlineedit.g:478:3: ruleAssociation
                    {
                     before(grammarAccess.getContentAccess().getAssociationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getAssociationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalInlineedit.g:487:1: rule__Type__Alternatives : ( ( ruleBuiltInType ) | ( ruleClassRef ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:491:1: ( ( ruleBuiltInType ) | ( ruleClassRef ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=29 && LA3_0<=30)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalInlineedit.g:492:2: ( ruleBuiltInType )
                    {
                    // InternalInlineedit.g:492:2: ( ruleBuiltInType )
                    // InternalInlineedit.g:493:3: ruleBuiltInType
                    {
                     before(grammarAccess.getTypeAccess().getBuiltInTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBuiltInType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBuiltInTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:498:2: ( ruleClassRef )
                    {
                    // InternalInlineedit.g:498:2: ( ruleClassRef )
                    // InternalInlineedit.g:499:3: ruleClassRef
                    {
                     before(grammarAccess.getTypeAccess().getClassRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassRef();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__BuiltInType__Alternatives"
    // InternalInlineedit.g:508:1: rule__BuiltInType__Alternatives : ( ( ruleStringType ) | ( ruleIntegerType ) );
    public final void rule__BuiltInType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:512:1: ( ( ruleStringType ) | ( ruleIntegerType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalInlineedit.g:513:2: ( ruleStringType )
                    {
                    // InternalInlineedit.g:513:2: ( ruleStringType )
                    // InternalInlineedit.g:514:3: ruleStringType
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getBuiltInTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:519:2: ( ruleIntegerType )
                    {
                    // InternalInlineedit.g:519:2: ( ruleIntegerType )
                    // InternalInlineedit.g:520:3: ruleIntegerType
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getIntegerTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getBuiltInTypeAccess().getIntegerTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__BuiltInType__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalInlineedit.g:529:1: rule__Value__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleConstantRef ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:533:1: ( ( ruleIntegerLiteral ) | ( ruleConstantRef ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalInlineedit.g:534:2: ( ruleIntegerLiteral )
                    {
                    // InternalInlineedit.g:534:2: ( ruleIntegerLiteral )
                    // InternalInlineedit.g:535:3: ruleIntegerLiteral
                    {
                     before(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:540:2: ( ruleConstantRef )
                    {
                    // InternalInlineedit.g:540:2: ( ruleConstantRef )
                    // InternalInlineedit.g:541:3: ruleConstantRef
                    {
                     before(grammarAccess.getValueAccess().getConstantRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantRef();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getConstantRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalInlineedit.g:550:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:554:1: ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 16:
                {
                alt6=5;
                }
                break;
            case 17:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalInlineedit.g:555:2: ( ( '+' ) )
                    {
                    // InternalInlineedit.g:555:2: ( ( '+' ) )
                    // InternalInlineedit.g:556:3: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalInlineedit.g:557:3: ( '+' )
                    // InternalInlineedit.g:557:4: '+'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInlineedit.g:561:2: ( ( 'public' ) )
                    {
                    // InternalInlineedit.g:561:2: ( ( 'public' ) )
                    // InternalInlineedit.g:562:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1()); 
                    // InternalInlineedit.g:563:3: ( 'public' )
                    // InternalInlineedit.g:563:4: 'public'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInlineedit.g:567:2: ( ( '#' ) )
                    {
                    // InternalInlineedit.g:567:2: ( ( '#' ) )
                    // InternalInlineedit.g:568:3: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalInlineedit.g:569:3: ( '#' )
                    // InternalInlineedit.g:569:4: '#'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInlineedit.g:573:2: ( ( 'protected' ) )
                    {
                    // InternalInlineedit.g:573:2: ( ( 'protected' ) )
                    // InternalInlineedit.g:574:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3()); 
                    // InternalInlineedit.g:575:3: ( 'protected' )
                    // InternalInlineedit.g:575:4: 'protected'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalInlineedit.g:579:2: ( ( '-' ) )
                    {
                    // InternalInlineedit.g:579:2: ( ( '-' ) )
                    // InternalInlineedit.g:580:3: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4()); 
                    // InternalInlineedit.g:581:3: ( '-' )
                    // InternalInlineedit.g:581:4: '-'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalInlineedit.g:585:2: ( ( 'private' ) )
                    {
                    // InternalInlineedit.g:585:2: ( ( 'private' ) )
                    // InternalInlineedit.g:586:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_5()); 
                    // InternalInlineedit.g:587:3: ( 'private' )
                    // InternalInlineedit.g:587:4: 'private'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__Association__Group__0"
    // InternalInlineedit.g:595:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:599:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalInlineedit.g:600:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

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
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalInlineedit.g:607:1: rule__Association__Group__0__Impl : ( ( ruleDescription )? ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:611:1: ( ( ( ruleDescription )? ) )
            // InternalInlineedit.g:612:1: ( ( ruleDescription )? )
            {
            // InternalInlineedit.g:612:1: ( ( ruleDescription )? )
            // InternalInlineedit.g:613:2: ( ruleDescription )?
            {
             before(grammarAccess.getAssociationAccess().getDescriptionParserRuleCall_0()); 
            // InternalInlineedit.g:614:2: ( ruleDescription )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DESCRIPTION_TEXT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalInlineedit.g:614:3: ruleDescription
                    {
                    pushFollow(FOLLOW_2);
                    ruleDescription();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getDescriptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalInlineedit.g:622:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:626:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalInlineedit.g:627:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

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
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalInlineedit.g:634:1: rule__Association__Group__1__Impl : ( 'association' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:638:1: ( ( 'association' ) )
            // InternalInlineedit.g:639:1: ( 'association' )
            {
            // InternalInlineedit.g:639:1: ( 'association' )
            // InternalInlineedit.g:640:2: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 

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
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalInlineedit.g:649:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:653:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalInlineedit.g:654:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

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
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalInlineedit.g:661:1: rule__Association__Group__2__Impl : ( ( rule__Association__NameAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:665:1: ( ( ( rule__Association__NameAssignment_2 ) ) )
            // InternalInlineedit.g:666:1: ( ( rule__Association__NameAssignment_2 ) )
            {
            // InternalInlineedit.g:666:1: ( ( rule__Association__NameAssignment_2 ) )
            // InternalInlineedit.g:667:2: ( rule__Association__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_2()); 
            // InternalInlineedit.g:668:2: ( rule__Association__NameAssignment_2 )
            // InternalInlineedit.g:668:3: rule__Association__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalInlineedit.g:676:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:680:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalInlineedit.g:681:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

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
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalInlineedit.g:688:1: rule__Association__Group__3__Impl : ( '[' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:692:1: ( ( '[' ) )
            // InternalInlineedit.g:693:1: ( '[' )
            {
            // InternalInlineedit.g:693:1: ( '[' )
            // InternalInlineedit.g:694:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalInlineedit.g:703:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:707:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalInlineedit.g:708:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__5();

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
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalInlineedit.g:715:1: rule__Association__Group__4__Impl : ( ( rule__Association__LowerBoundAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:719:1: ( ( ( rule__Association__LowerBoundAssignment_4 ) ) )
            // InternalInlineedit.g:720:1: ( ( rule__Association__LowerBoundAssignment_4 ) )
            {
            // InternalInlineedit.g:720:1: ( ( rule__Association__LowerBoundAssignment_4 ) )
            // InternalInlineedit.g:721:2: ( rule__Association__LowerBoundAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getLowerBoundAssignment_4()); 
            // InternalInlineedit.g:722:2: ( rule__Association__LowerBoundAssignment_4 )
            // InternalInlineedit.g:722:3: rule__Association__LowerBoundAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Association__LowerBoundAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getLowerBoundAssignment_4()); 

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
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // InternalInlineedit.g:730:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:734:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalInlineedit.g:735:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__6();

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
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // InternalInlineedit.g:742:1: rule__Association__Group__5__Impl : ( '..' ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:746:1: ( ( '..' ) )
            // InternalInlineedit.g:747:1: ( '..' )
            {
            // InternalInlineedit.g:747:1: ( '..' )
            // InternalInlineedit.g:748:2: '..'
            {
             before(grammarAccess.getAssociationAccess().getFullStopFullStopKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getFullStopFullStopKeyword_5()); 

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
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // InternalInlineedit.g:757:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:761:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // InternalInlineedit.g:762:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Association__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__7();

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
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // InternalInlineedit.g:769:1: rule__Association__Group__6__Impl : ( ( rule__Association__UpperBoundAssignment_6 ) ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:773:1: ( ( ( rule__Association__UpperBoundAssignment_6 ) ) )
            // InternalInlineedit.g:774:1: ( ( rule__Association__UpperBoundAssignment_6 ) )
            {
            // InternalInlineedit.g:774:1: ( ( rule__Association__UpperBoundAssignment_6 ) )
            // InternalInlineedit.g:775:2: ( rule__Association__UpperBoundAssignment_6 )
            {
             before(grammarAccess.getAssociationAccess().getUpperBoundAssignment_6()); 
            // InternalInlineedit.g:776:2: ( rule__Association__UpperBoundAssignment_6 )
            // InternalInlineedit.g:776:3: rule__Association__UpperBoundAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Association__UpperBoundAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getUpperBoundAssignment_6()); 

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
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__Association__Group__7"
    // InternalInlineedit.g:784:1: rule__Association__Group__7 : rule__Association__Group__7__Impl rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:788:1: ( rule__Association__Group__7__Impl rule__Association__Group__8 )
            // InternalInlineedit.g:789:2: rule__Association__Group__7__Impl rule__Association__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__8();

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
    // $ANTLR end "rule__Association__Group__7"


    // $ANTLR start "rule__Association__Group__7__Impl"
    // InternalInlineedit.g:796:1: rule__Association__Group__7__Impl : ( ']' ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:800:1: ( ( ']' ) )
            // InternalInlineedit.g:801:1: ( ']' )
            {
            // InternalInlineedit.g:801:1: ( ']' )
            // InternalInlineedit.g:802:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__Association__Group__7__Impl"


    // $ANTLR start "rule__Association__Group__8"
    // InternalInlineedit.g:811:1: rule__Association__Group__8 : rule__Association__Group__8__Impl rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:815:1: ( rule__Association__Group__8__Impl rule__Association__Group__9 )
            // InternalInlineedit.g:816:2: rule__Association__Group__8__Impl rule__Association__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Association__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__9();

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
    // $ANTLR end "rule__Association__Group__8"


    // $ANTLR start "rule__Association__Group__8__Impl"
    // InternalInlineedit.g:823:1: rule__Association__Group__8__Impl : ( ( rule__Association__SourceAssignment_8 ) ) ;
    public final void rule__Association__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:827:1: ( ( ( rule__Association__SourceAssignment_8 ) ) )
            // InternalInlineedit.g:828:1: ( ( rule__Association__SourceAssignment_8 ) )
            {
            // InternalInlineedit.g:828:1: ( ( rule__Association__SourceAssignment_8 ) )
            // InternalInlineedit.g:829:2: ( rule__Association__SourceAssignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_8()); 
            // InternalInlineedit.g:830:2: ( rule__Association__SourceAssignment_8 )
            // InternalInlineedit.g:830:3: rule__Association__SourceAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Association__SourceAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_8()); 

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
    // $ANTLR end "rule__Association__Group__8__Impl"


    // $ANTLR start "rule__Association__Group__9"
    // InternalInlineedit.g:838:1: rule__Association__Group__9 : rule__Association__Group__9__Impl rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:842:1: ( rule__Association__Group__9__Impl rule__Association__Group__10 )
            // InternalInlineedit.g:843:2: rule__Association__Group__9__Impl rule__Association__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__10();

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
    // $ANTLR end "rule__Association__Group__9"


    // $ANTLR start "rule__Association__Group__9__Impl"
    // InternalInlineedit.g:850:1: rule__Association__Group__9__Impl : ( '-->' ) ;
    public final void rule__Association__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:854:1: ( ( '-->' ) )
            // InternalInlineedit.g:855:1: ( '-->' )
            {
            // InternalInlineedit.g:855:1: ( '-->' )
            // InternalInlineedit.g:856:2: '-->'
            {
             before(grammarAccess.getAssociationAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_9()); 

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
    // $ANTLR end "rule__Association__Group__9__Impl"


    // $ANTLR start "rule__Association__Group__10"
    // InternalInlineedit.g:865:1: rule__Association__Group__10 : rule__Association__Group__10__Impl ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:869:1: ( rule__Association__Group__10__Impl )
            // InternalInlineedit.g:870:2: rule__Association__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__10__Impl();

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
    // $ANTLR end "rule__Association__Group__10"


    // $ANTLR start "rule__Association__Group__10__Impl"
    // InternalInlineedit.g:876:1: rule__Association__Group__10__Impl : ( ( rule__Association__TargetAssignment_10 ) ) ;
    public final void rule__Association__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:880:1: ( ( ( rule__Association__TargetAssignment_10 ) ) )
            // InternalInlineedit.g:881:1: ( ( rule__Association__TargetAssignment_10 ) )
            {
            // InternalInlineedit.g:881:1: ( ( rule__Association__TargetAssignment_10 ) )
            // InternalInlineedit.g:882:2: ( rule__Association__TargetAssignment_10 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_10()); 
            // InternalInlineedit.g:883:2: ( rule__Association__TargetAssignment_10 )
            // InternalInlineedit.g:883:3: rule__Association__TargetAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Association__TargetAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_10()); 

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
    // $ANTLR end "rule__Association__Group__10__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalInlineedit.g:892:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:896:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalInlineedit.g:897:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__1();

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
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalInlineedit.g:904:1: rule__Constant__Group__0__Impl : ( ( ruleDescription )? ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:908:1: ( ( ( ruleDescription )? ) )
            // InternalInlineedit.g:909:1: ( ( ruleDescription )? )
            {
            // InternalInlineedit.g:909:1: ( ( ruleDescription )? )
            // InternalInlineedit.g:910:2: ( ruleDescription )?
            {
             before(grammarAccess.getConstantAccess().getDescriptionParserRuleCall_0()); 
            // InternalInlineedit.g:911:2: ( ruleDescription )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DESCRIPTION_TEXT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInlineedit.g:911:3: ruleDescription
                    {
                    pushFollow(FOLLOW_2);
                    ruleDescription();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantAccess().getDescriptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalInlineedit.g:919:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:923:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalInlineedit.g:924:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__2();

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
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalInlineedit.g:931:1: rule__Constant__Group__1__Impl : ( 'constant' ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:935:1: ( ( 'constant' ) )
            // InternalInlineedit.g:936:1: ( 'constant' )
            {
            // InternalInlineedit.g:936:1: ( 'constant' )
            // InternalInlineedit.g:937:2: 'constant'
            {
             before(grammarAccess.getConstantAccess().getConstantKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getConstantKeyword_1()); 

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
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // InternalInlineedit.g:946:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:950:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalInlineedit.g:951:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__3();

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
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // InternalInlineedit.g:958:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:962:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // InternalInlineedit.g:963:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // InternalInlineedit.g:963:1: ( ( rule__Constant__NameAssignment_2 ) )
            // InternalInlineedit.g:964:2: ( rule__Constant__NameAssignment_2 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            // InternalInlineedit.g:965:2: ( rule__Constant__NameAssignment_2 )
            // InternalInlineedit.g:965:3: rule__Constant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constant__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // InternalInlineedit.g:973:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:977:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // InternalInlineedit.g:978:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__4();

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
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // InternalInlineedit.g:985:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:989:1: ( ( '=' ) )
            // InternalInlineedit.g:990:1: ( '=' )
            {
            // InternalInlineedit.g:990:1: ( '=' )
            // InternalInlineedit.g:991:2: '='
            {
             before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // InternalInlineedit.g:1000:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1004:1: ( rule__Constant__Group__4__Impl )
            // InternalInlineedit.g:1005:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__4__Impl();

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
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // InternalInlineedit.g:1011:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__InitialAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1015:1: ( ( ( rule__Constant__InitialAssignment_4 ) ) )
            // InternalInlineedit.g:1016:1: ( ( rule__Constant__InitialAssignment_4 ) )
            {
            // InternalInlineedit.g:1016:1: ( ( rule__Constant__InitialAssignment_4 ) )
            // InternalInlineedit.g:1017:2: ( rule__Constant__InitialAssignment_4 )
            {
             before(grammarAccess.getConstantAccess().getInitialAssignment_4()); 
            // InternalInlineedit.g:1018:2: ( rule__Constant__InitialAssignment_4 )
            // InternalInlineedit.g:1018:3: rule__Constant__InitialAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Constant__InitialAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getInitialAssignment_4()); 

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
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalInlineedit.g:1027:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1031:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalInlineedit.g:1032:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

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
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalInlineedit.g:1039:1: rule__Class__Group__0__Impl : ( ( ruleDescription )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1043:1: ( ( ( ruleDescription )? ) )
            // InternalInlineedit.g:1044:1: ( ( ruleDescription )? )
            {
            // InternalInlineedit.g:1044:1: ( ( ruleDescription )? )
            // InternalInlineedit.g:1045:2: ( ruleDescription )?
            {
             before(grammarAccess.getClassAccess().getDescriptionParserRuleCall_0()); 
            // InternalInlineedit.g:1046:2: ( ruleDescription )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DESCRIPTION_TEXT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalInlineedit.g:1046:3: ruleDescription
                    {
                    pushFollow(FOLLOW_2);
                    ruleDescription();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getDescriptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalInlineedit.g:1054:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1058:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalInlineedit.g:1059:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

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
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalInlineedit.g:1066:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1070:1: ( ( 'class' ) )
            // InternalInlineedit.g:1071:1: ( 'class' )
            {
            // InternalInlineedit.g:1071:1: ( 'class' )
            // InternalInlineedit.g:1072:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalInlineedit.g:1081:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1085:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalInlineedit.g:1086:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

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
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalInlineedit.g:1093:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1097:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalInlineedit.g:1098:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalInlineedit.g:1098:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalInlineedit.g:1099:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalInlineedit.g:1100:2: ( rule__Class__NameAssignment_2 )
            // InternalInlineedit.g:1100:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalInlineedit.g:1108:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1112:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalInlineedit.g:1113:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

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
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalInlineedit.g:1120:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1124:1: ( ( '{' ) )
            // InternalInlineedit.g:1125:1: ( '{' )
            {
            // InternalInlineedit.g:1125:1: ( '{' )
            // InternalInlineedit.g:1126:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalInlineedit.g:1135:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1139:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalInlineedit.g:1140:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

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
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalInlineedit.g:1147:1: rule__Class__Group__4__Impl : ( ( rule__Class__AttributesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1151:1: ( ( ( rule__Class__AttributesAssignment_4 )* ) )
            // InternalInlineedit.g:1152:1: ( ( rule__Class__AttributesAssignment_4 )* )
            {
            // InternalInlineedit.g:1152:1: ( ( rule__Class__AttributesAssignment_4 )* )
            // InternalInlineedit.g:1153:2: ( rule__Class__AttributesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4()); 
            // InternalInlineedit.g:1154:2: ( rule__Class__AttributesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DESCRIPTION_TEXT||(LA10_0>=12 && LA10_0<=17)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalInlineedit.g:1154:3: rule__Class__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Class__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalInlineedit.g:1162:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1166:1: ( rule__Class__Group__5__Impl )
            // InternalInlineedit.g:1167:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__5__Impl();

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
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalInlineedit.g:1173:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1177:1: ( ( '}' ) )
            // InternalInlineedit.g:1178:1: ( '}' )
            {
            // InternalInlineedit.g:1178:1: ( '}' )
            // InternalInlineedit.g:1179:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalInlineedit.g:1189:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1193:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalInlineedit.g:1194:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalInlineedit.g:1201:1: rule__Attribute__Group__0__Impl : ( ( ruleDescription )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1205:1: ( ( ( ruleDescription )? ) )
            // InternalInlineedit.g:1206:1: ( ( ruleDescription )? )
            {
            // InternalInlineedit.g:1206:1: ( ( ruleDescription )? )
            // InternalInlineedit.g:1207:2: ( ruleDescription )?
            {
             before(grammarAccess.getAttributeAccess().getDescriptionParserRuleCall_0()); 
            // InternalInlineedit.g:1208:2: ( ruleDescription )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DESCRIPTION_TEXT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalInlineedit.g:1208:3: ruleDescription
                    {
                    pushFollow(FOLLOW_2);
                    ruleDescription();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getDescriptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalInlineedit.g:1216:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1220:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalInlineedit.g:1221:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalInlineedit.g:1228:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1232:1: ( ( ( rule__Attribute__VisibilityAssignment_1 ) ) )
            // InternalInlineedit.g:1233:1: ( ( rule__Attribute__VisibilityAssignment_1 ) )
            {
            // InternalInlineedit.g:1233:1: ( ( rule__Attribute__VisibilityAssignment_1 ) )
            // InternalInlineedit.g:1234:2: ( rule__Attribute__VisibilityAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalInlineedit.g:1235:2: ( rule__Attribute__VisibilityAssignment_1 )
            // InternalInlineedit.g:1235:3: rule__Attribute__VisibilityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__VisibilityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalInlineedit.g:1243:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1247:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalInlineedit.g:1248:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalInlineedit.g:1255:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1259:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalInlineedit.g:1260:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalInlineedit.g:1260:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalInlineedit.g:1261:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalInlineedit.g:1262:2: ( rule__Attribute__NameAssignment_2 )
            // InternalInlineedit.g:1262:3: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalInlineedit.g:1270:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1274:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalInlineedit.g:1275:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalInlineedit.g:1282:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1286:1: ( ( ':' ) )
            // InternalInlineedit.g:1287:1: ( ':' )
            {
            // InternalInlineedit.g:1287:1: ( ':' )
            // InternalInlineedit.g:1288:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalInlineedit.g:1297:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1301:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalInlineedit.g:1302:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalInlineedit.g:1309:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1313:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalInlineedit.g:1314:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalInlineedit.g:1314:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalInlineedit.g:1315:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalInlineedit.g:1316:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalInlineedit.g:1316:3: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalInlineedit.g:1324:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1328:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalInlineedit.g:1329:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalInlineedit.g:1336:1: rule__Attribute__Group__5__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1340:1: ( ( '[' ) )
            // InternalInlineedit.g:1341:1: ( '[' )
            {
            // InternalInlineedit.g:1341:1: ( '[' )
            // InternalInlineedit.g:1342:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalInlineedit.g:1351:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1355:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalInlineedit.g:1356:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7();

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
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalInlineedit.g:1363:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__LowerBoundAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1367:1: ( ( ( rule__Attribute__LowerBoundAssignment_6 ) ) )
            // InternalInlineedit.g:1368:1: ( ( rule__Attribute__LowerBoundAssignment_6 ) )
            {
            // InternalInlineedit.g:1368:1: ( ( rule__Attribute__LowerBoundAssignment_6 ) )
            // InternalInlineedit.g:1369:2: ( rule__Attribute__LowerBoundAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundAssignment_6()); 
            // InternalInlineedit.g:1370:2: ( rule__Attribute__LowerBoundAssignment_6 )
            // InternalInlineedit.g:1370:3: rule__Attribute__LowerBoundAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__LowerBoundAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getLowerBoundAssignment_6()); 

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
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // InternalInlineedit.g:1378:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1382:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalInlineedit.g:1383:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Attribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__8();

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
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // InternalInlineedit.g:1390:1: rule__Attribute__Group__7__Impl : ( '..' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1394:1: ( ( '..' ) )
            // InternalInlineedit.g:1395:1: ( '..' )
            {
            // InternalInlineedit.g:1395:1: ( '..' )
            // InternalInlineedit.g:1396:2: '..'
            {
             before(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_7()); 

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
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group__8"
    // InternalInlineedit.g:1405:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1409:1: ( rule__Attribute__Group__8__Impl rule__Attribute__Group__9 )
            // InternalInlineedit.g:1410:2: rule__Attribute__Group__8__Impl rule__Attribute__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__9();

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
    // $ANTLR end "rule__Attribute__Group__8"


    // $ANTLR start "rule__Attribute__Group__8__Impl"
    // InternalInlineedit.g:1417:1: rule__Attribute__Group__8__Impl : ( ( rule__Attribute__UpperBoundAssignment_8 ) ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1421:1: ( ( ( rule__Attribute__UpperBoundAssignment_8 ) ) )
            // InternalInlineedit.g:1422:1: ( ( rule__Attribute__UpperBoundAssignment_8 ) )
            {
            // InternalInlineedit.g:1422:1: ( ( rule__Attribute__UpperBoundAssignment_8 ) )
            // InternalInlineedit.g:1423:2: ( rule__Attribute__UpperBoundAssignment_8 )
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundAssignment_8()); 
            // InternalInlineedit.g:1424:2: ( rule__Attribute__UpperBoundAssignment_8 )
            // InternalInlineedit.g:1424:3: rule__Attribute__UpperBoundAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UpperBoundAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getUpperBoundAssignment_8()); 

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
    // $ANTLR end "rule__Attribute__Group__8__Impl"


    // $ANTLR start "rule__Attribute__Group__9"
    // InternalInlineedit.g:1432:1: rule__Attribute__Group__9 : rule__Attribute__Group__9__Impl ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1436:1: ( rule__Attribute__Group__9__Impl )
            // InternalInlineedit.g:1437:2: rule__Attribute__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__9__Impl();

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
    // $ANTLR end "rule__Attribute__Group__9"


    // $ANTLR start "rule__Attribute__Group__9__Impl"
    // InternalInlineedit.g:1443:1: rule__Attribute__Group__9__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1447:1: ( ( ']' ) )
            // InternalInlineedit.g:1448:1: ( ']' )
            {
            // InternalInlineedit.g:1448:1: ( ']' )
            // InternalInlineedit.g:1449:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_9()); 

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
    // $ANTLR end "rule__Attribute__Group__9__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // InternalInlineedit.g:1459:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1463:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalInlineedit.g:1464:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__1();

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
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // InternalInlineedit.g:1471:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1475:1: ( ( () ) )
            // InternalInlineedit.g:1476:1: ( () )
            {
            // InternalInlineedit.g:1476:1: ( () )
            // InternalInlineedit.g:1477:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalInlineedit.g:1478:2: ()
            // InternalInlineedit.g:1478:3: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // InternalInlineedit.g:1486:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1490:1: ( rule__StringType__Group__1__Impl )
            // InternalInlineedit.g:1491:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__1__Impl();

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
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // InternalInlineedit.g:1497:1: rule__StringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1501:1: ( ( 'string' ) )
            // InternalInlineedit.g:1502:1: ( 'string' )
            {
            // InternalInlineedit.g:1502:1: ( 'string' )
            // InternalInlineedit.g:1503:2: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 

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
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__IntegerType__Group__0"
    // InternalInlineedit.g:1513:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1517:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalInlineedit.g:1518:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__IntegerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__1();

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
    // $ANTLR end "rule__IntegerType__Group__0"


    // $ANTLR start "rule__IntegerType__Group__0__Impl"
    // InternalInlineedit.g:1525:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1529:1: ( ( () ) )
            // InternalInlineedit.g:1530:1: ( () )
            {
            // InternalInlineedit.g:1530:1: ( () )
            // InternalInlineedit.g:1531:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalInlineedit.g:1532:2: ()
            // InternalInlineedit.g:1532:3: 
            {
            }

             after(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__0__Impl"


    // $ANTLR start "rule__IntegerType__Group__1"
    // InternalInlineedit.g:1540:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1544:1: ( rule__IntegerType__Group__1__Impl )
            // InternalInlineedit.g:1545:2: rule__IntegerType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__1__Impl();

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
    // $ANTLR end "rule__IntegerType__Group__1"


    // $ANTLR start "rule__IntegerType__Group__1__Impl"
    // InternalInlineedit.g:1551:1: rule__IntegerType__Group__1__Impl : ( 'integer' ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1555:1: ( ( 'integer' ) )
            // InternalInlineedit.g:1556:1: ( 'integer' )
            {
            // InternalInlineedit.g:1556:1: ( 'integer' )
            // InternalInlineedit.g:1557:2: 'integer'
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1()); 

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
    // $ANTLR end "rule__IntegerType__Group__1__Impl"


    // $ANTLR start "rule__Association__NameAssignment_2"
    // InternalInlineedit.g:1567:1: rule__Association__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1571:1: ( ( RULE_ID ) )
            // InternalInlineedit.g:1572:2: ( RULE_ID )
            {
            // InternalInlineedit.g:1572:2: ( RULE_ID )
            // InternalInlineedit.g:1573:3: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Association__NameAssignment_2"


    // $ANTLR start "rule__Association__LowerBoundAssignment_4"
    // InternalInlineedit.g:1582:1: rule__Association__LowerBoundAssignment_4 : ( ruleValue ) ;
    public final void rule__Association__LowerBoundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1586:1: ( ( ruleValue ) )
            // InternalInlineedit.g:1587:2: ( ruleValue )
            {
            // InternalInlineedit.g:1587:2: ( ruleValue )
            // InternalInlineedit.g:1588:3: ruleValue
            {
             before(grammarAccess.getAssociationAccess().getLowerBoundValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getLowerBoundValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Association__LowerBoundAssignment_4"


    // $ANTLR start "rule__Association__UpperBoundAssignment_6"
    // InternalInlineedit.g:1597:1: rule__Association__UpperBoundAssignment_6 : ( ruleValue ) ;
    public final void rule__Association__UpperBoundAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1601:1: ( ( ruleValue ) )
            // InternalInlineedit.g:1602:2: ( ruleValue )
            {
            // InternalInlineedit.g:1602:2: ( ruleValue )
            // InternalInlineedit.g:1603:3: ruleValue
            {
             before(grammarAccess.getAssociationAccess().getUpperBoundValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getUpperBoundValueParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Association__UpperBoundAssignment_6"


    // $ANTLR start "rule__Association__SourceAssignment_8"
    // InternalInlineedit.g:1612:1: rule__Association__SourceAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1616:1: ( ( ( RULE_ID ) ) )
            // InternalInlineedit.g:1617:2: ( ( RULE_ID ) )
            {
            // InternalInlineedit.g:1617:2: ( ( RULE_ID ) )
            // InternalInlineedit.g:1618:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceClassCrossReference_8_0()); 
            // InternalInlineedit.g:1619:3: ( RULE_ID )
            // InternalInlineedit.g:1620:4: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceClassIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getSourceClassIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getSourceClassCrossReference_8_0()); 

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
    // $ANTLR end "rule__Association__SourceAssignment_8"


    // $ANTLR start "rule__Association__TargetAssignment_10"
    // InternalInlineedit.g:1631:1: rule__Association__TargetAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1635:1: ( ( ( RULE_ID ) ) )
            // InternalInlineedit.g:1636:2: ( ( RULE_ID ) )
            {
            // InternalInlineedit.g:1636:2: ( ( RULE_ID ) )
            // InternalInlineedit.g:1637:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetClassCrossReference_10_0()); 
            // InternalInlineedit.g:1638:3: ( RULE_ID )
            // InternalInlineedit.g:1639:4: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetClassIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getTargetClassIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetClassCrossReference_10_0()); 

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
    // $ANTLR end "rule__Association__TargetAssignment_10"


    // $ANTLR start "rule__ClassModel__ContentAssignment"
    // InternalInlineedit.g:1650:1: rule__ClassModel__ContentAssignment : ( ruleContent ) ;
    public final void rule__ClassModel__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1654:1: ( ( ruleContent ) )
            // InternalInlineedit.g:1655:2: ( ruleContent )
            {
            // InternalInlineedit.g:1655:2: ( ruleContent )
            // InternalInlineedit.g:1656:3: ruleContent
            {
             before(grammarAccess.getClassModelAccess().getContentContentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getClassModelAccess().getContentContentParserRuleCall_0()); 

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
    // $ANTLR end "rule__ClassModel__ContentAssignment"


    // $ANTLR start "rule__Constant__NameAssignment_2"
    // InternalInlineedit.g:1665:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1669:1: ( ( RULE_ID ) )
            // InternalInlineedit.g:1670:2: ( RULE_ID )
            {
            // InternalInlineedit.g:1670:2: ( RULE_ID )
            // InternalInlineedit.g:1671:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Constant__NameAssignment_2"


    // $ANTLR start "rule__Constant__InitialAssignment_4"
    // InternalInlineedit.g:1680:1: rule__Constant__InitialAssignment_4 : ( ruleValue ) ;
    public final void rule__Constant__InitialAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1684:1: ( ( ruleValue ) )
            // InternalInlineedit.g:1685:2: ( ruleValue )
            {
            // InternalInlineedit.g:1685:2: ( ruleValue )
            // InternalInlineedit.g:1686:3: ruleValue
            {
             before(grammarAccess.getConstantAccess().getInitialValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getInitialValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Constant__InitialAssignment_4"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalInlineedit.g:1695:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1699:1: ( ( RULE_ID ) )
            // InternalInlineedit.g:1700:2: ( RULE_ID )
            {
            // InternalInlineedit.g:1700:2: ( RULE_ID )
            // InternalInlineedit.g:1701:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__AttributesAssignment_4"
    // InternalInlineedit.g:1710:1: rule__Class__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1714:1: ( ( ruleAttribute ) )
            // InternalInlineedit.g:1715:2: ( ruleAttribute )
            {
            // InternalInlineedit.g:1715:2: ( ruleAttribute )
            // InternalInlineedit.g:1716:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Class__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_1"
    // InternalInlineedit.g:1725:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1729:1: ( ( ruleVisibility ) )
            // InternalInlineedit.g:1730:2: ( ruleVisibility )
            {
            // InternalInlineedit.g:1730:2: ( ruleVisibility )
            // InternalInlineedit.g:1731:3: ruleVisibility
            {
             before(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__VisibilityAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalInlineedit.g:1740:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1744:1: ( ( RULE_ID ) )
            // InternalInlineedit.g:1745:2: ( RULE_ID )
            {
            // InternalInlineedit.g:1745:2: ( RULE_ID )
            // InternalInlineedit.g:1746:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // InternalInlineedit.g:1755:1: rule__Attribute__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1759:1: ( ( ruleType ) )
            // InternalInlineedit.g:1760:2: ( ruleType )
            {
            // InternalInlineedit.g:1760:2: ( ruleType )
            // InternalInlineedit.g:1761:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Attribute__LowerBoundAssignment_6"
    // InternalInlineedit.g:1770:1: rule__Attribute__LowerBoundAssignment_6 : ( ruleValue ) ;
    public final void rule__Attribute__LowerBoundAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1774:1: ( ( ruleValue ) )
            // InternalInlineedit.g:1775:2: ( ruleValue )
            {
            // InternalInlineedit.g:1775:2: ( ruleValue )
            // InternalInlineedit.g:1776:3: ruleValue
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getLowerBoundValueParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Attribute__LowerBoundAssignment_6"


    // $ANTLR start "rule__Attribute__UpperBoundAssignment_8"
    // InternalInlineedit.g:1785:1: rule__Attribute__UpperBoundAssignment_8 : ( ruleValue ) ;
    public final void rule__Attribute__UpperBoundAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1789:1: ( ( ruleValue ) )
            // InternalInlineedit.g:1790:2: ( ruleValue )
            {
            // InternalInlineedit.g:1790:2: ( ruleValue )
            // InternalInlineedit.g:1791:3: ruleValue
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundValueParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getUpperBoundValueParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Attribute__UpperBoundAssignment_8"


    // $ANTLR start "rule__ClassRef__TargetAssignment"
    // InternalInlineedit.g:1800:1: rule__ClassRef__TargetAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassRef__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1804:1: ( ( ( RULE_ID ) ) )
            // InternalInlineedit.g:1805:2: ( ( RULE_ID ) )
            {
            // InternalInlineedit.g:1805:2: ( ( RULE_ID ) )
            // InternalInlineedit.g:1806:3: ( RULE_ID )
            {
             before(grammarAccess.getClassRefAccess().getTargetClassCrossReference_0()); 
            // InternalInlineedit.g:1807:3: ( RULE_ID )
            // InternalInlineedit.g:1808:4: RULE_ID
            {
             before(grammarAccess.getClassRefAccess().getTargetClassIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassRefAccess().getTargetClassIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getClassRefAccess().getTargetClassCrossReference_0()); 

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
    // $ANTLR end "rule__ClassRef__TargetAssignment"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // InternalInlineedit.g:1819:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1823:1: ( ( RULE_INT ) )
            // InternalInlineedit.g:1824:2: ( RULE_INT )
            {
            // InternalInlineedit.g:1824:2: ( RULE_INT )
            // InternalInlineedit.g:1825:3: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntegerLiteral__ValueAssignment"


    // $ANTLR start "rule__ConstantRef__TargetAssignment"
    // InternalInlineedit.g:1834:1: rule__ConstantRef__TargetAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConstantRef__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1838:1: ( ( ( RULE_ID ) ) )
            // InternalInlineedit.g:1839:2: ( ( RULE_ID ) )
            {
            // InternalInlineedit.g:1839:2: ( ( RULE_ID ) )
            // InternalInlineedit.g:1840:3: ( RULE_ID )
            {
             before(grammarAccess.getConstantRefAccess().getTargetConstantCrossReference_0()); 
            // InternalInlineedit.g:1841:3: ( RULE_ID )
            // InternalInlineedit.g:1842:4: RULE_ID
            {
             before(grammarAccess.getConstantRefAccess().getTargetConstantIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantRefAccess().getTargetConstantIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getConstantRefAccess().getTargetConstantCrossReference_0()); 

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
    // $ANTLR end "rule__ConstantRef__TargetAssignment"


    // $ANTLR start "rule__Description__DescriptionAssignment"
    // InternalInlineedit.g:1853:1: rule__Description__DescriptionAssignment : ( RULE_DESCRIPTION_TEXT ) ;
    public final void rule__Description__DescriptionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInlineedit.g:1857:1: ( ( RULE_DESCRIPTION_TEXT ) )
            // InternalInlineedit.g:1858:2: ( RULE_DESCRIPTION_TEXT )
            {
            // InternalInlineedit.g:1858:2: ( RULE_DESCRIPTION_TEXT )
            // InternalInlineedit.g:1859:3: RULE_DESCRIPTION_TEXT
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionDESCRIPTION_TEXTTerminalRuleCall_0()); 
            match(input,RULE_DESCRIPTION_TEXT,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionDESCRIPTION_TEXTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Description__DescriptionAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002840042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002840040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000803F040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000003F042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000003F040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000000L});

}