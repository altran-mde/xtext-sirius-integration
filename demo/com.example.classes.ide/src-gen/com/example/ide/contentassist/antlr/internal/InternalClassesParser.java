package com.example.ide.contentassist.antlr.internal;

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
import com.example.services.ClassesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClassesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DESCRIPTION_TEXT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'public'", "'#'", "'protected'", "'-'", "'private'", "'constant'", "'='", "'association'", "'-->'", "'['", "'..'", "']'", "'class'", "'{'", "'}'", "':'", "'string'", "'integer'"
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

    	public void setGrammarAccess(ClassesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleClassModel"
    // InternalClasses.g:53:1: entryRuleClassModel : ruleClassModel EOF ;
    public final void entryRuleClassModel() throws RecognitionException {
        try {
            // InternalClasses.g:54:1: ( ruleClassModel EOF )
            // InternalClasses.g:55:1: ruleClassModel EOF
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
    // InternalClasses.g:62:1: ruleClassModel : ( ( rule__ClassModel__ContentAssignment )* ) ;
    public final void ruleClassModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:66:2: ( ( ( rule__ClassModel__ContentAssignment )* ) )
            // InternalClasses.g:67:2: ( ( rule__ClassModel__ContentAssignment )* )
            {
            // InternalClasses.g:67:2: ( ( rule__ClassModel__ContentAssignment )* )
            // InternalClasses.g:68:3: ( rule__ClassModel__ContentAssignment )*
            {
             before(grammarAccess.getClassModelAccess().getContentAssignment()); 
            // InternalClasses.g:69:3: ( rule__ClassModel__ContentAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_DESCRIPTION_TEXT||LA1_0==18||LA1_0==20||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalClasses.g:69:4: rule__ClassModel__ContentAssignment
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
    // InternalClasses.g:78:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalClasses.g:79:1: ( ruleContent EOF )
            // InternalClasses.g:80:1: ruleContent EOF
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
    // InternalClasses.g:87:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:91:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalClasses.g:92:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalClasses.g:92:2: ( ( rule__Content__Alternatives ) )
            // InternalClasses.g:93:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalClasses.g:94:3: ( rule__Content__Alternatives )
            // InternalClasses.g:94:4: rule__Content__Alternatives
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
    // InternalClasses.g:103:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalClasses.g:104:1: ( ruleConstant EOF )
            // InternalClasses.g:105:1: ruleConstant EOF
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
    // InternalClasses.g:112:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:116:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalClasses.g:117:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalClasses.g:117:2: ( ( rule__Constant__Group__0 ) )
            // InternalClasses.g:118:3: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // InternalClasses.g:119:3: ( rule__Constant__Group__0 )
            // InternalClasses.g:119:4: rule__Constant__Group__0
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


    // $ANTLR start "entryRuleAssociation"
    // InternalClasses.g:128:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalClasses.g:129:1: ( ruleAssociation EOF )
            // InternalClasses.g:130:1: ruleAssociation EOF
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
    // InternalClasses.g:137:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:141:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalClasses.g:142:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalClasses.g:142:2: ( ( rule__Association__Group__0 ) )
            // InternalClasses.g:143:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalClasses.g:144:3: ( rule__Association__Group__0 )
            // InternalClasses.g:144:4: rule__Association__Group__0
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


    // $ANTLR start "entryRuleClass"
    // InternalClasses.g:153:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalClasses.g:154:1: ( ruleClass EOF )
            // InternalClasses.g:155:1: ruleClass EOF
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
    // InternalClasses.g:162:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:166:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalClasses.g:167:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalClasses.g:167:2: ( ( rule__Class__Group__0 ) )
            // InternalClasses.g:168:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalClasses.g:169:3: ( rule__Class__Group__0 )
            // InternalClasses.g:169:4: rule__Class__Group__0
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
    // InternalClasses.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalClasses.g:179:1: ( ruleAttribute EOF )
            // InternalClasses.g:180:1: ruleAttribute EOF
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
    // InternalClasses.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalClasses.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalClasses.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalClasses.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalClasses.g:194:3: ( rule__Attribute__Group__0 )
            // InternalClasses.g:194:4: rule__Attribute__Group__0
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
    // InternalClasses.g:203:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalClasses.g:204:1: ( ruleType EOF )
            // InternalClasses.g:205:1: ruleType EOF
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
    // InternalClasses.g:212:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:216:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalClasses.g:217:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalClasses.g:217:2: ( ( rule__Type__Alternatives ) )
            // InternalClasses.g:218:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalClasses.g:219:3: ( rule__Type__Alternatives )
            // InternalClasses.g:219:4: rule__Type__Alternatives
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
    // InternalClasses.g:228:1: entryRuleBuiltInType : ruleBuiltInType EOF ;
    public final void entryRuleBuiltInType() throws RecognitionException {
        try {
            // InternalClasses.g:229:1: ( ruleBuiltInType EOF )
            // InternalClasses.g:230:1: ruleBuiltInType EOF
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
    // InternalClasses.g:237:1: ruleBuiltInType : ( ( rule__BuiltInType__Alternatives ) ) ;
    public final void ruleBuiltInType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:241:2: ( ( ( rule__BuiltInType__Alternatives ) ) )
            // InternalClasses.g:242:2: ( ( rule__BuiltInType__Alternatives ) )
            {
            // InternalClasses.g:242:2: ( ( rule__BuiltInType__Alternatives ) )
            // InternalClasses.g:243:3: ( rule__BuiltInType__Alternatives )
            {
             before(grammarAccess.getBuiltInTypeAccess().getAlternatives()); 
            // InternalClasses.g:244:3: ( rule__BuiltInType__Alternatives )
            // InternalClasses.g:244:4: rule__BuiltInType__Alternatives
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
    // InternalClasses.g:253:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalClasses.g:254:1: ( ruleStringType EOF )
            // InternalClasses.g:255:1: ruleStringType EOF
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
    // InternalClasses.g:262:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:266:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalClasses.g:267:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalClasses.g:267:2: ( ( rule__StringType__Group__0 ) )
            // InternalClasses.g:268:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalClasses.g:269:3: ( rule__StringType__Group__0 )
            // InternalClasses.g:269:4: rule__StringType__Group__0
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
    // InternalClasses.g:278:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalClasses.g:279:1: ( ruleIntegerType EOF )
            // InternalClasses.g:280:1: ruleIntegerType EOF
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
    // InternalClasses.g:287:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:291:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalClasses.g:292:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalClasses.g:292:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalClasses.g:293:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalClasses.g:294:3: ( rule__IntegerType__Group__0 )
            // InternalClasses.g:294:4: rule__IntegerType__Group__0
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
    // InternalClasses.g:303:1: entryRuleClassRef : ruleClassRef EOF ;
    public final void entryRuleClassRef() throws RecognitionException {
        try {
            // InternalClasses.g:304:1: ( ruleClassRef EOF )
            // InternalClasses.g:305:1: ruleClassRef EOF
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
    // InternalClasses.g:312:1: ruleClassRef : ( ( rule__ClassRef__TargetAssignment ) ) ;
    public final void ruleClassRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:316:2: ( ( ( rule__ClassRef__TargetAssignment ) ) )
            // InternalClasses.g:317:2: ( ( rule__ClassRef__TargetAssignment ) )
            {
            // InternalClasses.g:317:2: ( ( rule__ClassRef__TargetAssignment ) )
            // InternalClasses.g:318:3: ( rule__ClassRef__TargetAssignment )
            {
             before(grammarAccess.getClassRefAccess().getTargetAssignment()); 
            // InternalClasses.g:319:3: ( rule__ClassRef__TargetAssignment )
            // InternalClasses.g:319:4: rule__ClassRef__TargetAssignment
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
    // InternalClasses.g:328:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalClasses.g:329:1: ( ruleValue EOF )
            // InternalClasses.g:330:1: ruleValue EOF
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
    // InternalClasses.g:337:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:341:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalClasses.g:342:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalClasses.g:342:2: ( ( rule__Value__Alternatives ) )
            // InternalClasses.g:343:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalClasses.g:344:3: ( rule__Value__Alternatives )
            // InternalClasses.g:344:4: rule__Value__Alternatives
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
    // InternalClasses.g:353:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalClasses.g:354:1: ( ruleIntegerLiteral EOF )
            // InternalClasses.g:355:1: ruleIntegerLiteral EOF
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
    // InternalClasses.g:362:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:366:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalClasses.g:367:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalClasses.g:367:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalClasses.g:368:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalClasses.g:369:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalClasses.g:369:4: rule__IntegerLiteral__ValueAssignment
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
    // InternalClasses.g:378:1: entryRuleConstantRef : ruleConstantRef EOF ;
    public final void entryRuleConstantRef() throws RecognitionException {
        try {
            // InternalClasses.g:379:1: ( ruleConstantRef EOF )
            // InternalClasses.g:380:1: ruleConstantRef EOF
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
    // InternalClasses.g:387:1: ruleConstantRef : ( ( rule__ConstantRef__TargetAssignment ) ) ;
    public final void ruleConstantRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:391:2: ( ( ( rule__ConstantRef__TargetAssignment ) ) )
            // InternalClasses.g:392:2: ( ( rule__ConstantRef__TargetAssignment ) )
            {
            // InternalClasses.g:392:2: ( ( rule__ConstantRef__TargetAssignment ) )
            // InternalClasses.g:393:3: ( rule__ConstantRef__TargetAssignment )
            {
             before(grammarAccess.getConstantRefAccess().getTargetAssignment()); 
            // InternalClasses.g:394:3: ( rule__ConstantRef__TargetAssignment )
            // InternalClasses.g:394:4: rule__ConstantRef__TargetAssignment
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
    // InternalClasses.g:404:1: ruleDescription : ( ( rule__Description__DescriptionAssignment ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:408:2: ( ( ( rule__Description__DescriptionAssignment ) ) )
            // InternalClasses.g:409:2: ( ( rule__Description__DescriptionAssignment ) )
            {
            // InternalClasses.g:409:2: ( ( rule__Description__DescriptionAssignment ) )
            // InternalClasses.g:410:3: ( rule__Description__DescriptionAssignment )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); 
            // InternalClasses.g:411:3: ( rule__Description__DescriptionAssignment )
            // InternalClasses.g:411:4: rule__Description__DescriptionAssignment
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
    // InternalClasses.g:420:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:424:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalClasses.g:425:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalClasses.g:425:2: ( ( rule__Visibility__Alternatives ) )
            // InternalClasses.g:426:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalClasses.g:427:3: ( rule__Visibility__Alternatives )
            // InternalClasses.g:427:4: rule__Visibility__Alternatives
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
    // InternalClasses.g:435:1: rule__Content__Alternatives : ( ( ruleConstant ) | ( ruleClass ) | ( ruleAssociation ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:439:1: ( ( ruleConstant ) | ( ruleClass ) | ( ruleAssociation ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_DESCRIPTION_TEXT:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt2=1;
                    }
                    break;
                case 25:
                    {
                    alt2=2;
                    }
                    break;
                case 20:
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
            case 18:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 20:
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
                    // InternalClasses.g:440:2: ( ruleConstant )
                    {
                    // InternalClasses.g:440:2: ( ruleConstant )
                    // InternalClasses.g:441:3: ruleConstant
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
                    // InternalClasses.g:446:2: ( ruleClass )
                    {
                    // InternalClasses.g:446:2: ( ruleClass )
                    // InternalClasses.g:447:3: ruleClass
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
                    // InternalClasses.g:452:2: ( ruleAssociation )
                    {
                    // InternalClasses.g:452:2: ( ruleAssociation )
                    // InternalClasses.g:453:3: ruleAssociation
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
    // InternalClasses.g:462:1: rule__Type__Alternatives : ( ( ruleBuiltInType ) | ( ruleClassRef ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:466:1: ( ( ruleBuiltInType ) | ( ruleClassRef ) )
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
                    // InternalClasses.g:467:2: ( ruleBuiltInType )
                    {
                    // InternalClasses.g:467:2: ( ruleBuiltInType )
                    // InternalClasses.g:468:3: ruleBuiltInType
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
                    // InternalClasses.g:473:2: ( ruleClassRef )
                    {
                    // InternalClasses.g:473:2: ( ruleClassRef )
                    // InternalClasses.g:474:3: ruleClassRef
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
    // InternalClasses.g:483:1: rule__BuiltInType__Alternatives : ( ( ruleStringType ) | ( ruleIntegerType ) );
    public final void rule__BuiltInType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:487:1: ( ( ruleStringType ) | ( ruleIntegerType ) )
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
                    // InternalClasses.g:488:2: ( ruleStringType )
                    {
                    // InternalClasses.g:488:2: ( ruleStringType )
                    // InternalClasses.g:489:3: ruleStringType
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
                    // InternalClasses.g:494:2: ( ruleIntegerType )
                    {
                    // InternalClasses.g:494:2: ( ruleIntegerType )
                    // InternalClasses.g:495:3: ruleIntegerType
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
    // InternalClasses.g:504:1: rule__Value__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleConstantRef ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:508:1: ( ( ruleIntegerLiteral ) | ( ruleConstantRef ) )
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
                    // InternalClasses.g:509:2: ( ruleIntegerLiteral )
                    {
                    // InternalClasses.g:509:2: ( ruleIntegerLiteral )
                    // InternalClasses.g:510:3: ruleIntegerLiteral
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
                    // InternalClasses.g:515:2: ( ruleConstantRef )
                    {
                    // InternalClasses.g:515:2: ( ruleConstantRef )
                    // InternalClasses.g:516:3: ruleConstantRef
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
    // InternalClasses.g:525:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:529:1: ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) )
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
                    // InternalClasses.g:530:2: ( ( '+' ) )
                    {
                    // InternalClasses.g:530:2: ( ( '+' ) )
                    // InternalClasses.g:531:3: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalClasses.g:532:3: ( '+' )
                    // InternalClasses.g:532:4: '+'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalClasses.g:536:2: ( ( 'public' ) )
                    {
                    // InternalClasses.g:536:2: ( ( 'public' ) )
                    // InternalClasses.g:537:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1()); 
                    // InternalClasses.g:538:3: ( 'public' )
                    // InternalClasses.g:538:4: 'public'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalClasses.g:542:2: ( ( '#' ) )
                    {
                    // InternalClasses.g:542:2: ( ( '#' ) )
                    // InternalClasses.g:543:3: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalClasses.g:544:3: ( '#' )
                    // InternalClasses.g:544:4: '#'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalClasses.g:548:2: ( ( 'protected' ) )
                    {
                    // InternalClasses.g:548:2: ( ( 'protected' ) )
                    // InternalClasses.g:549:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3()); 
                    // InternalClasses.g:550:3: ( 'protected' )
                    // InternalClasses.g:550:4: 'protected'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalClasses.g:554:2: ( ( '-' ) )
                    {
                    // InternalClasses.g:554:2: ( ( '-' ) )
                    // InternalClasses.g:555:3: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4()); 
                    // InternalClasses.g:556:3: ( '-' )
                    // InternalClasses.g:556:4: '-'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalClasses.g:560:2: ( ( 'private' ) )
                    {
                    // InternalClasses.g:560:2: ( ( 'private' ) )
                    // InternalClasses.g:561:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_5()); 
                    // InternalClasses.g:562:3: ( 'private' )
                    // InternalClasses.g:562:4: 'private'
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


    // $ANTLR start "rule__Constant__Group__0"
    // InternalClasses.g:570:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:574:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalClasses.g:575:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalClasses.g:582:1: rule__Constant__Group__0__Impl : ( ( ruleDescription )? ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:586:1: ( ( ( ruleDescription )? ) )
            // InternalClasses.g:587:1: ( ( ruleDescription )? )
            {
            // InternalClasses.g:587:1: ( ( ruleDescription )? )
            // InternalClasses.g:588:2: ( ruleDescription )?
            {
             before(grammarAccess.getConstantAccess().getDescriptionParserRuleCall_0()); 
            // InternalClasses.g:589:2: ( ruleDescription )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DESCRIPTION_TEXT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalClasses.g:589:3: ruleDescription
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
    // InternalClasses.g:597:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:601:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalClasses.g:602:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
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
    // InternalClasses.g:609:1: rule__Constant__Group__1__Impl : ( 'constant' ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:613:1: ( ( 'constant' ) )
            // InternalClasses.g:614:1: ( 'constant' )
            {
            // InternalClasses.g:614:1: ( 'constant' )
            // InternalClasses.g:615:2: 'constant'
            {
             before(grammarAccess.getConstantAccess().getConstantKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalClasses.g:624:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:628:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalClasses.g:629:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalClasses.g:636:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:640:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // InternalClasses.g:641:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // InternalClasses.g:641:1: ( ( rule__Constant__NameAssignment_2 ) )
            // InternalClasses.g:642:2: ( rule__Constant__NameAssignment_2 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            // InternalClasses.g:643:2: ( rule__Constant__NameAssignment_2 )
            // InternalClasses.g:643:3: rule__Constant__NameAssignment_2
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
    // InternalClasses.g:651:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:655:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // InternalClasses.g:656:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
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
    // InternalClasses.g:663:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:667:1: ( ( '=' ) )
            // InternalClasses.g:668:1: ( '=' )
            {
            // InternalClasses.g:668:1: ( '=' )
            // InternalClasses.g:669:2: '='
            {
             before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalClasses.g:678:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:682:1: ( rule__Constant__Group__4__Impl )
            // InternalClasses.g:683:2: rule__Constant__Group__4__Impl
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
    // InternalClasses.g:689:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__InitialAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:693:1: ( ( ( rule__Constant__InitialAssignment_4 ) ) )
            // InternalClasses.g:694:1: ( ( rule__Constant__InitialAssignment_4 ) )
            {
            // InternalClasses.g:694:1: ( ( rule__Constant__InitialAssignment_4 ) )
            // InternalClasses.g:695:2: ( rule__Constant__InitialAssignment_4 )
            {
             before(grammarAccess.getConstantAccess().getInitialAssignment_4()); 
            // InternalClasses.g:696:2: ( rule__Constant__InitialAssignment_4 )
            // InternalClasses.g:696:3: rule__Constant__InitialAssignment_4
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


    // $ANTLR start "rule__Association__Group__0"
    // InternalClasses.g:705:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:709:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalClasses.g:710:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalClasses.g:717:1: rule__Association__Group__0__Impl : ( ( ruleDescription )? ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:721:1: ( ( ( ruleDescription )? ) )
            // InternalClasses.g:722:1: ( ( ruleDescription )? )
            {
            // InternalClasses.g:722:1: ( ( ruleDescription )? )
            // InternalClasses.g:723:2: ( ruleDescription )?
            {
             before(grammarAccess.getAssociationAccess().getDescriptionParserRuleCall_0()); 
            // InternalClasses.g:724:2: ( ruleDescription )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DESCRIPTION_TEXT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalClasses.g:724:3: ruleDescription
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
    // InternalClasses.g:732:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:736:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalClasses.g:737:2: rule__Association__Group__1__Impl rule__Association__Group__2
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
    // InternalClasses.g:744:1: rule__Association__Group__1__Impl : ( 'association' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:748:1: ( ( 'association' ) )
            // InternalClasses.g:749:1: ( 'association' )
            {
            // InternalClasses.g:749:1: ( 'association' )
            // InternalClasses.g:750:2: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalClasses.g:759:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:763:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalClasses.g:764:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalClasses.g:771:1: rule__Association__Group__2__Impl : ( ( rule__Association__NameAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:775:1: ( ( ( rule__Association__NameAssignment_2 ) ) )
            // InternalClasses.g:776:1: ( ( rule__Association__NameAssignment_2 ) )
            {
            // InternalClasses.g:776:1: ( ( rule__Association__NameAssignment_2 ) )
            // InternalClasses.g:777:2: ( rule__Association__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_2()); 
            // InternalClasses.g:778:2: ( rule__Association__NameAssignment_2 )
            // InternalClasses.g:778:3: rule__Association__NameAssignment_2
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
    // InternalClasses.g:786:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:790:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalClasses.g:791:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalClasses.g:798:1: rule__Association__Group__3__Impl : ( ( rule__Association__SourceAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:802:1: ( ( ( rule__Association__SourceAssignment_3 ) ) )
            // InternalClasses.g:803:1: ( ( rule__Association__SourceAssignment_3 ) )
            {
            // InternalClasses.g:803:1: ( ( rule__Association__SourceAssignment_3 ) )
            // InternalClasses.g:804:2: ( rule__Association__SourceAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_3()); 
            // InternalClasses.g:805:2: ( rule__Association__SourceAssignment_3 )
            // InternalClasses.g:805:3: rule__Association__SourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Association__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_3()); 

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
    // InternalClasses.g:813:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:817:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalClasses.g:818:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalClasses.g:825:1: rule__Association__Group__4__Impl : ( '-->' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:829:1: ( ( '-->' ) )
            // InternalClasses.g:830:1: ( '-->' )
            {
            // InternalClasses.g:830:1: ( '-->' )
            // InternalClasses.g:831:2: '-->'
            {
             before(grammarAccess.getAssociationAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_4()); 

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
    // InternalClasses.g:840:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:844:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalClasses.g:845:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalClasses.g:852:1: rule__Association__Group__5__Impl : ( ( rule__Association__TargetAssignment_5 ) ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:856:1: ( ( ( rule__Association__TargetAssignment_5 ) ) )
            // InternalClasses.g:857:1: ( ( rule__Association__TargetAssignment_5 ) )
            {
            // InternalClasses.g:857:1: ( ( rule__Association__TargetAssignment_5 ) )
            // InternalClasses.g:858:2: ( rule__Association__TargetAssignment_5 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_5()); 
            // InternalClasses.g:859:2: ( rule__Association__TargetAssignment_5 )
            // InternalClasses.g:859:3: rule__Association__TargetAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Association__TargetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_5()); 

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
    // InternalClasses.g:867:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:871:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // InternalClasses.g:872:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalClasses.g:879:1: rule__Association__Group__6__Impl : ( '[' ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:883:1: ( ( '[' ) )
            // InternalClasses.g:884:1: ( '[' )
            {
            // InternalClasses.g:884:1: ( '[' )
            // InternalClasses.g:885:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_6()); 

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
    // InternalClasses.g:894:1: rule__Association__Group__7 : rule__Association__Group__7__Impl rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:898:1: ( rule__Association__Group__7__Impl rule__Association__Group__8 )
            // InternalClasses.g:899:2: rule__Association__Group__7__Impl rule__Association__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalClasses.g:906:1: rule__Association__Group__7__Impl : ( ( rule__Association__LowerBoundAssignment_7 ) ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:910:1: ( ( ( rule__Association__LowerBoundAssignment_7 ) ) )
            // InternalClasses.g:911:1: ( ( rule__Association__LowerBoundAssignment_7 ) )
            {
            // InternalClasses.g:911:1: ( ( rule__Association__LowerBoundAssignment_7 ) )
            // InternalClasses.g:912:2: ( rule__Association__LowerBoundAssignment_7 )
            {
             before(grammarAccess.getAssociationAccess().getLowerBoundAssignment_7()); 
            // InternalClasses.g:913:2: ( rule__Association__LowerBoundAssignment_7 )
            // InternalClasses.g:913:3: rule__Association__LowerBoundAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Association__LowerBoundAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getLowerBoundAssignment_7()); 

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
    // InternalClasses.g:921:1: rule__Association__Group__8 : rule__Association__Group__8__Impl rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:925:1: ( rule__Association__Group__8__Impl rule__Association__Group__9 )
            // InternalClasses.g:926:2: rule__Association__Group__8__Impl rule__Association__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalClasses.g:933:1: rule__Association__Group__8__Impl : ( '..' ) ;
    public final void rule__Association__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:937:1: ( ( '..' ) )
            // InternalClasses.g:938:1: ( '..' )
            {
            // InternalClasses.g:938:1: ( '..' )
            // InternalClasses.g:939:2: '..'
            {
             before(grammarAccess.getAssociationAccess().getFullStopFullStopKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getFullStopFullStopKeyword_8()); 

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
    // InternalClasses.g:948:1: rule__Association__Group__9 : rule__Association__Group__9__Impl rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:952:1: ( rule__Association__Group__9__Impl rule__Association__Group__10 )
            // InternalClasses.g:953:2: rule__Association__Group__9__Impl rule__Association__Group__10
            {
            pushFollow(FOLLOW_12);
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
    // InternalClasses.g:960:1: rule__Association__Group__9__Impl : ( ( rule__Association__UpperBoundAssignment_9 ) ) ;
    public final void rule__Association__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:964:1: ( ( ( rule__Association__UpperBoundAssignment_9 ) ) )
            // InternalClasses.g:965:1: ( ( rule__Association__UpperBoundAssignment_9 ) )
            {
            // InternalClasses.g:965:1: ( ( rule__Association__UpperBoundAssignment_9 ) )
            // InternalClasses.g:966:2: ( rule__Association__UpperBoundAssignment_9 )
            {
             before(grammarAccess.getAssociationAccess().getUpperBoundAssignment_9()); 
            // InternalClasses.g:967:2: ( rule__Association__UpperBoundAssignment_9 )
            // InternalClasses.g:967:3: rule__Association__UpperBoundAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Association__UpperBoundAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getUpperBoundAssignment_9()); 

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
    // InternalClasses.g:975:1: rule__Association__Group__10 : rule__Association__Group__10__Impl ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:979:1: ( rule__Association__Group__10__Impl )
            // InternalClasses.g:980:2: rule__Association__Group__10__Impl
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
    // InternalClasses.g:986:1: rule__Association__Group__10__Impl : ( ']' ) ;
    public final void rule__Association__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:990:1: ( ( ']' ) )
            // InternalClasses.g:991:1: ( ']' )
            {
            // InternalClasses.g:991:1: ( ']' )
            // InternalClasses.g:992:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_10()); 

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


    // $ANTLR start "rule__Class__Group__0"
    // InternalClasses.g:1002:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1006:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalClasses.g:1007:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalClasses.g:1014:1: rule__Class__Group__0__Impl : ( ( ruleDescription )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1018:1: ( ( ( ruleDescription )? ) )
            // InternalClasses.g:1019:1: ( ( ruleDescription )? )
            {
            // InternalClasses.g:1019:1: ( ( ruleDescription )? )
            // InternalClasses.g:1020:2: ( ruleDescription )?
            {
             before(grammarAccess.getClassAccess().getDescriptionParserRuleCall_0()); 
            // InternalClasses.g:1021:2: ( ruleDescription )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DESCRIPTION_TEXT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalClasses.g:1021:3: ruleDescription
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
    // InternalClasses.g:1029:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1033:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalClasses.g:1034:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalClasses.g:1041:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1045:1: ( ( 'class' ) )
            // InternalClasses.g:1046:1: ( 'class' )
            {
            // InternalClasses.g:1046:1: ( 'class' )
            // InternalClasses.g:1047:2: 'class'
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
    // InternalClasses.g:1056:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1060:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalClasses.g:1061:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalClasses.g:1068:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1072:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalClasses.g:1073:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalClasses.g:1073:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalClasses.g:1074:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalClasses.g:1075:2: ( rule__Class__NameAssignment_2 )
            // InternalClasses.g:1075:3: rule__Class__NameAssignment_2
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
    // InternalClasses.g:1083:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1087:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalClasses.g:1088:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalClasses.g:1095:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1099:1: ( ( '{' ) )
            // InternalClasses.g:1100:1: ( '{' )
            {
            // InternalClasses.g:1100:1: ( '{' )
            // InternalClasses.g:1101:2: '{'
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
    // InternalClasses.g:1110:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1114:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalClasses.g:1115:2: rule__Class__Group__4__Impl rule__Class__Group__5
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
    // InternalClasses.g:1122:1: rule__Class__Group__4__Impl : ( ( rule__Class__SubClassesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1126:1: ( ( ( rule__Class__SubClassesAssignment_4 )* ) )
            // InternalClasses.g:1127:1: ( ( rule__Class__SubClassesAssignment_4 )* )
            {
            // InternalClasses.g:1127:1: ( ( rule__Class__SubClassesAssignment_4 )* )
            // InternalClasses.g:1128:2: ( rule__Class__SubClassesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getSubClassesAssignment_4()); 
            // InternalClasses.g:1129:2: ( rule__Class__SubClassesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DESCRIPTION_TEXT) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==25) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalClasses.g:1129:3: rule__Class__SubClassesAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Class__SubClassesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSubClassesAssignment_4()); 

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
    // InternalClasses.g:1137:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1141:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalClasses.g:1142:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

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
    // InternalClasses.g:1149:1: rule__Class__Group__5__Impl : ( ( rule__Class__AttributesAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1153:1: ( ( ( rule__Class__AttributesAssignment_5 )* ) )
            // InternalClasses.g:1154:1: ( ( rule__Class__AttributesAssignment_5 )* )
            {
            // InternalClasses.g:1154:1: ( ( rule__Class__AttributesAssignment_5 )* )
            // InternalClasses.g:1155:2: ( rule__Class__AttributesAssignment_5 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_5()); 
            // InternalClasses.g:1156:2: ( rule__Class__AttributesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DESCRIPTION_TEXT||(LA11_0>=12 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalClasses.g:1156:3: rule__Class__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Class__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_5()); 

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


    // $ANTLR start "rule__Class__Group__6"
    // InternalClasses.g:1164:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1168:1: ( rule__Class__Group__6__Impl )
            // InternalClasses.g:1169:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__6__Impl();

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
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalClasses.g:1175:1: rule__Class__Group__6__Impl : ( '}' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1179:1: ( ( '}' ) )
            // InternalClasses.g:1180:1: ( '}' )
            {
            // InternalClasses.g:1180:1: ( '}' )
            // InternalClasses.g:1181:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalClasses.g:1191:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1195:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalClasses.g:1196:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalClasses.g:1203:1: rule__Attribute__Group__0__Impl : ( ( ruleDescription )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1207:1: ( ( ( ruleDescription )? ) )
            // InternalClasses.g:1208:1: ( ( ruleDescription )? )
            {
            // InternalClasses.g:1208:1: ( ( ruleDescription )? )
            // InternalClasses.g:1209:2: ( ruleDescription )?
            {
             before(grammarAccess.getAttributeAccess().getDescriptionParserRuleCall_0()); 
            // InternalClasses.g:1210:2: ( ruleDescription )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DESCRIPTION_TEXT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalClasses.g:1210:3: ruleDescription
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
    // InternalClasses.g:1218:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1222:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalClasses.g:1223:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalClasses.g:1230:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1234:1: ( ( ( rule__Attribute__VisibilityAssignment_1 ) ) )
            // InternalClasses.g:1235:1: ( ( rule__Attribute__VisibilityAssignment_1 ) )
            {
            // InternalClasses.g:1235:1: ( ( rule__Attribute__VisibilityAssignment_1 ) )
            // InternalClasses.g:1236:2: ( rule__Attribute__VisibilityAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalClasses.g:1237:2: ( rule__Attribute__VisibilityAssignment_1 )
            // InternalClasses.g:1237:3: rule__Attribute__VisibilityAssignment_1
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
    // InternalClasses.g:1245:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1249:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalClasses.g:1250:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalClasses.g:1257:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1261:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalClasses.g:1262:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalClasses.g:1262:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalClasses.g:1263:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalClasses.g:1264:2: ( rule__Attribute__NameAssignment_2 )
            // InternalClasses.g:1264:3: rule__Attribute__NameAssignment_2
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
    // InternalClasses.g:1272:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1276:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalClasses.g:1277:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalClasses.g:1284:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1288:1: ( ( ':' ) )
            // InternalClasses.g:1289:1: ( ':' )
            {
            // InternalClasses.g:1289:1: ( ':' )
            // InternalClasses.g:1290:2: ':'
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
    // InternalClasses.g:1299:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1303:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalClasses.g:1304:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalClasses.g:1311:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1315:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalClasses.g:1316:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalClasses.g:1316:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalClasses.g:1317:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalClasses.g:1318:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalClasses.g:1318:3: rule__Attribute__TypeAssignment_4
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
    // InternalClasses.g:1326:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1330:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalClasses.g:1331:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
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
    // InternalClasses.g:1338:1: rule__Attribute__Group__5__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1342:1: ( ( '[' ) )
            // InternalClasses.g:1343:1: ( '[' )
            {
            // InternalClasses.g:1343:1: ( '[' )
            // InternalClasses.g:1344:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalClasses.g:1353:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1357:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalClasses.g:1358:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalClasses.g:1365:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__LowerBoundAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1369:1: ( ( ( rule__Attribute__LowerBoundAssignment_6 ) ) )
            // InternalClasses.g:1370:1: ( ( rule__Attribute__LowerBoundAssignment_6 ) )
            {
            // InternalClasses.g:1370:1: ( ( rule__Attribute__LowerBoundAssignment_6 ) )
            // InternalClasses.g:1371:2: ( rule__Attribute__LowerBoundAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundAssignment_6()); 
            // InternalClasses.g:1372:2: ( rule__Attribute__LowerBoundAssignment_6 )
            // InternalClasses.g:1372:3: rule__Attribute__LowerBoundAssignment_6
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
    // InternalClasses.g:1380:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1384:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalClasses.g:1385:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
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
    // InternalClasses.g:1392:1: rule__Attribute__Group__7__Impl : ( '..' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1396:1: ( ( '..' ) )
            // InternalClasses.g:1397:1: ( '..' )
            {
            // InternalClasses.g:1397:1: ( '..' )
            // InternalClasses.g:1398:2: '..'
            {
             before(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalClasses.g:1407:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1411:1: ( rule__Attribute__Group__8__Impl rule__Attribute__Group__9 )
            // InternalClasses.g:1412:2: rule__Attribute__Group__8__Impl rule__Attribute__Group__9
            {
            pushFollow(FOLLOW_12);
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
    // InternalClasses.g:1419:1: rule__Attribute__Group__8__Impl : ( ( rule__Attribute__UpperBoundAssignment_8 ) ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1423:1: ( ( ( rule__Attribute__UpperBoundAssignment_8 ) ) )
            // InternalClasses.g:1424:1: ( ( rule__Attribute__UpperBoundAssignment_8 ) )
            {
            // InternalClasses.g:1424:1: ( ( rule__Attribute__UpperBoundAssignment_8 ) )
            // InternalClasses.g:1425:2: ( rule__Attribute__UpperBoundAssignment_8 )
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundAssignment_8()); 
            // InternalClasses.g:1426:2: ( rule__Attribute__UpperBoundAssignment_8 )
            // InternalClasses.g:1426:3: rule__Attribute__UpperBoundAssignment_8
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
    // InternalClasses.g:1434:1: rule__Attribute__Group__9 : rule__Attribute__Group__9__Impl ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1438:1: ( rule__Attribute__Group__9__Impl )
            // InternalClasses.g:1439:2: rule__Attribute__Group__9__Impl
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
    // InternalClasses.g:1445:1: rule__Attribute__Group__9__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1449:1: ( ( ']' ) )
            // InternalClasses.g:1450:1: ( ']' )
            {
            // InternalClasses.g:1450:1: ( ']' )
            // InternalClasses.g:1451:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
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
    // InternalClasses.g:1461:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1465:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalClasses.g:1466:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalClasses.g:1473:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1477:1: ( ( () ) )
            // InternalClasses.g:1478:1: ( () )
            {
            // InternalClasses.g:1478:1: ( () )
            // InternalClasses.g:1479:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalClasses.g:1480:2: ()
            // InternalClasses.g:1480:3: 
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
    // InternalClasses.g:1488:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1492:1: ( rule__StringType__Group__1__Impl )
            // InternalClasses.g:1493:2: rule__StringType__Group__1__Impl
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
    // InternalClasses.g:1499:1: rule__StringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1503:1: ( ( 'string' ) )
            // InternalClasses.g:1504:1: ( 'string' )
            {
            // InternalClasses.g:1504:1: ( 'string' )
            // InternalClasses.g:1505:2: 'string'
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
    // InternalClasses.g:1515:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1519:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalClasses.g:1520:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalClasses.g:1527:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1531:1: ( ( () ) )
            // InternalClasses.g:1532:1: ( () )
            {
            // InternalClasses.g:1532:1: ( () )
            // InternalClasses.g:1533:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalClasses.g:1534:2: ()
            // InternalClasses.g:1534:3: 
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
    // InternalClasses.g:1542:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1546:1: ( rule__IntegerType__Group__1__Impl )
            // InternalClasses.g:1547:2: rule__IntegerType__Group__1__Impl
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
    // InternalClasses.g:1553:1: rule__IntegerType__Group__1__Impl : ( 'integer' ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1557:1: ( ( 'integer' ) )
            // InternalClasses.g:1558:1: ( 'integer' )
            {
            // InternalClasses.g:1558:1: ( 'integer' )
            // InternalClasses.g:1559:2: 'integer'
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


    // $ANTLR start "rule__ClassModel__ContentAssignment"
    // InternalClasses.g:1569:1: rule__ClassModel__ContentAssignment : ( ruleContent ) ;
    public final void rule__ClassModel__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1573:1: ( ( ruleContent ) )
            // InternalClasses.g:1574:2: ( ruleContent )
            {
            // InternalClasses.g:1574:2: ( ruleContent )
            // InternalClasses.g:1575:3: ruleContent
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
    // InternalClasses.g:1584:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1588:1: ( ( RULE_ID ) )
            // InternalClasses.g:1589:2: ( RULE_ID )
            {
            // InternalClasses.g:1589:2: ( RULE_ID )
            // InternalClasses.g:1590:3: RULE_ID
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
    // InternalClasses.g:1599:1: rule__Constant__InitialAssignment_4 : ( ruleValue ) ;
    public final void rule__Constant__InitialAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1603:1: ( ( ruleValue ) )
            // InternalClasses.g:1604:2: ( ruleValue )
            {
            // InternalClasses.g:1604:2: ( ruleValue )
            // InternalClasses.g:1605:3: ruleValue
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


    // $ANTLR start "rule__Association__NameAssignment_2"
    // InternalClasses.g:1614:1: rule__Association__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1618:1: ( ( RULE_ID ) )
            // InternalClasses.g:1619:2: ( RULE_ID )
            {
            // InternalClasses.g:1619:2: ( RULE_ID )
            // InternalClasses.g:1620:3: RULE_ID
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


    // $ANTLR start "rule__Association__SourceAssignment_3"
    // InternalClasses.g:1629:1: rule__Association__SourceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1633:1: ( ( ( RULE_ID ) ) )
            // InternalClasses.g:1634:2: ( ( RULE_ID ) )
            {
            // InternalClasses.g:1634:2: ( ( RULE_ID ) )
            // InternalClasses.g:1635:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceClassCrossReference_3_0()); 
            // InternalClasses.g:1636:3: ( RULE_ID )
            // InternalClasses.g:1637:4: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceClassIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getSourceClassIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getSourceClassCrossReference_3_0()); 

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
    // $ANTLR end "rule__Association__SourceAssignment_3"


    // $ANTLR start "rule__Association__TargetAssignment_5"
    // InternalClasses.g:1648:1: rule__Association__TargetAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1652:1: ( ( ( RULE_ID ) ) )
            // InternalClasses.g:1653:2: ( ( RULE_ID ) )
            {
            // InternalClasses.g:1653:2: ( ( RULE_ID ) )
            // InternalClasses.g:1654:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetClassCrossReference_5_0()); 
            // InternalClasses.g:1655:3: ( RULE_ID )
            // InternalClasses.g:1656:4: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetClassIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getTargetClassIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetClassCrossReference_5_0()); 

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
    // $ANTLR end "rule__Association__TargetAssignment_5"


    // $ANTLR start "rule__Association__LowerBoundAssignment_7"
    // InternalClasses.g:1667:1: rule__Association__LowerBoundAssignment_7 : ( ruleValue ) ;
    public final void rule__Association__LowerBoundAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1671:1: ( ( ruleValue ) )
            // InternalClasses.g:1672:2: ( ruleValue )
            {
            // InternalClasses.g:1672:2: ( ruleValue )
            // InternalClasses.g:1673:3: ruleValue
            {
             before(grammarAccess.getAssociationAccess().getLowerBoundValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getLowerBoundValueParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Association__LowerBoundAssignment_7"


    // $ANTLR start "rule__Association__UpperBoundAssignment_9"
    // InternalClasses.g:1682:1: rule__Association__UpperBoundAssignment_9 : ( ruleValue ) ;
    public final void rule__Association__UpperBoundAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1686:1: ( ( ruleValue ) )
            // InternalClasses.g:1687:2: ( ruleValue )
            {
            // InternalClasses.g:1687:2: ( ruleValue )
            // InternalClasses.g:1688:3: ruleValue
            {
             before(grammarAccess.getAssociationAccess().getUpperBoundValueParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getUpperBoundValueParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Association__UpperBoundAssignment_9"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalClasses.g:1697:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1701:1: ( ( RULE_ID ) )
            // InternalClasses.g:1702:2: ( RULE_ID )
            {
            // InternalClasses.g:1702:2: ( RULE_ID )
            // InternalClasses.g:1703:3: RULE_ID
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


    // $ANTLR start "rule__Class__SubClassesAssignment_4"
    // InternalClasses.g:1712:1: rule__Class__SubClassesAssignment_4 : ( ruleClass ) ;
    public final void rule__Class__SubClassesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1716:1: ( ( ruleClass ) )
            // InternalClasses.g:1717:2: ( ruleClass )
            {
            // InternalClasses.g:1717:2: ( ruleClass )
            // InternalClasses.g:1718:3: ruleClass
            {
             before(grammarAccess.getClassAccess().getSubClassesClassParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSubClassesClassParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Class__SubClassesAssignment_4"


    // $ANTLR start "rule__Class__AttributesAssignment_5"
    // InternalClasses.g:1727:1: rule__Class__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1731:1: ( ( ruleAttribute ) )
            // InternalClasses.g:1732:2: ( ruleAttribute )
            {
            // InternalClasses.g:1732:2: ( ruleAttribute )
            // InternalClasses.g:1733:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Class__AttributesAssignment_5"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_1"
    // InternalClasses.g:1742:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1746:1: ( ( ruleVisibility ) )
            // InternalClasses.g:1747:2: ( ruleVisibility )
            {
            // InternalClasses.g:1747:2: ( ruleVisibility )
            // InternalClasses.g:1748:3: ruleVisibility
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
    // InternalClasses.g:1757:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1761:1: ( ( RULE_ID ) )
            // InternalClasses.g:1762:2: ( RULE_ID )
            {
            // InternalClasses.g:1762:2: ( RULE_ID )
            // InternalClasses.g:1763:3: RULE_ID
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
    // InternalClasses.g:1772:1: rule__Attribute__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1776:1: ( ( ruleType ) )
            // InternalClasses.g:1777:2: ( ruleType )
            {
            // InternalClasses.g:1777:2: ( ruleType )
            // InternalClasses.g:1778:3: ruleType
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
    // InternalClasses.g:1787:1: rule__Attribute__LowerBoundAssignment_6 : ( ruleValue ) ;
    public final void rule__Attribute__LowerBoundAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1791:1: ( ( ruleValue ) )
            // InternalClasses.g:1792:2: ( ruleValue )
            {
            // InternalClasses.g:1792:2: ( ruleValue )
            // InternalClasses.g:1793:3: ruleValue
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
    // InternalClasses.g:1802:1: rule__Attribute__UpperBoundAssignment_8 : ( ruleValue ) ;
    public final void rule__Attribute__UpperBoundAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1806:1: ( ( ruleValue ) )
            // InternalClasses.g:1807:2: ( ruleValue )
            {
            // InternalClasses.g:1807:2: ( ruleValue )
            // InternalClasses.g:1808:3: ruleValue
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
    // InternalClasses.g:1817:1: rule__ClassRef__TargetAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassRef__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1821:1: ( ( ( RULE_ID ) ) )
            // InternalClasses.g:1822:2: ( ( RULE_ID ) )
            {
            // InternalClasses.g:1822:2: ( ( RULE_ID ) )
            // InternalClasses.g:1823:3: ( RULE_ID )
            {
             before(grammarAccess.getClassRefAccess().getTargetClassCrossReference_0()); 
            // InternalClasses.g:1824:3: ( RULE_ID )
            // InternalClasses.g:1825:4: RULE_ID
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
    // InternalClasses.g:1836:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1840:1: ( ( RULE_INT ) )
            // InternalClasses.g:1841:2: ( RULE_INT )
            {
            // InternalClasses.g:1841:2: ( RULE_INT )
            // InternalClasses.g:1842:3: RULE_INT
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
    // InternalClasses.g:1851:1: rule__ConstantRef__TargetAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConstantRef__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1855:1: ( ( ( RULE_ID ) ) )
            // InternalClasses.g:1856:2: ( ( RULE_ID ) )
            {
            // InternalClasses.g:1856:2: ( ( RULE_ID ) )
            // InternalClasses.g:1857:3: ( RULE_ID )
            {
             before(grammarAccess.getConstantRefAccess().getTargetConstantCrossReference_0()); 
            // InternalClasses.g:1858:3: ( RULE_ID )
            // InternalClasses.g:1859:4: RULE_ID
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
    // InternalClasses.g:1870:1: rule__Description__DescriptionAssignment : ( RULE_DESCRIPTION_TEXT ) ;
    public final void rule__Description__DescriptionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClasses.g:1874:1: ( ( RULE_DESCRIPTION_TEXT ) )
            // InternalClasses.g:1875:2: ( RULE_DESCRIPTION_TEXT )
            {
            // InternalClasses.g:1875:2: ( RULE_DESCRIPTION_TEXT )
            // InternalClasses.g:1876:3: RULE_DESCRIPTION_TEXT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002140042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002140040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000A03F040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000003F042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000003F040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000000L});

}