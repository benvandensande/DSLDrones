package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ON'", "'OFF'", "'ACTIVE'", "'UNACTIVE'", "'PAUSED'", "'SAFE'", "'UNSAFE'", "'WARNING'", "'CRITICAL'", "'FAILING'", "'REDUNDANT'", "'Test:'", "'Description:'", "'Given:'", "'Then:'", "'When:'", "'status'", "'is'", "'GPS'", "'positionReading'", "'Barometer'", "'altitudereading'", "'Sonar'", "'distancereading'", "'sent'", "'Time'", "'interval'", "'in'", "'['", "','", "']'", "'Battery'", "'level'", "'Person'", "'position'", "'number'", "'Mission'", "'goal'", "'missionsafety'", "'Robot'", "'autopilot'", "'drops'", "'distance'", "'to'", "'obstacles'", "'equal'", "'lower'", "'then'", "'greater'", "'state'", "'within'", "'circle'", "'with'", "'radius'", "'sphere'", "'speed'", "'Environment'", "'windspeed'", "'collisionrisk'", "'tolerance'", "'seconds('", "')'", "'hours('", "'minutes('", "'meter('", "'centimeter('", "'millimeter('", "'kilometer('", "'percent('", "'-'", "'.'", "'Notification'", "'payload'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalMyLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyLanguage.g"; }


    	private MyLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTestFile"
    // InternalMyLanguage.g:53:1: entryRuleTestFile : ruleTestFile EOF ;
    public final void entryRuleTestFile() throws RecognitionException {
        try {
            // InternalMyLanguage.g:54:1: ( ruleTestFile EOF )
            // InternalMyLanguage.g:55:1: ruleTestFile EOF
            {
             before(grammarAccess.getTestFileRule()); 
            pushFollow(FOLLOW_1);
            ruleTestFile();

            state._fsp--;

             after(grammarAccess.getTestFileRule()); 
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
    // $ANTLR end "entryRuleTestFile"


    // $ANTLR start "ruleTestFile"
    // InternalMyLanguage.g:62:1: ruleTestFile : ( ( rule__TestFile__TestsAssignment )* ) ;
    public final void ruleTestFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:66:2: ( ( ( rule__TestFile__TestsAssignment )* ) )
            // InternalMyLanguage.g:67:2: ( ( rule__TestFile__TestsAssignment )* )
            {
            // InternalMyLanguage.g:67:2: ( ( rule__TestFile__TestsAssignment )* )
            // InternalMyLanguage.g:68:3: ( rule__TestFile__TestsAssignment )*
            {
             before(grammarAccess.getTestFileAccess().getTestsAssignment()); 
            // InternalMyLanguage.g:69:3: ( rule__TestFile__TestsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyLanguage.g:69:4: rule__TestFile__TestsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TestFile__TestsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTestFileAccess().getTestsAssignment()); 

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
    // $ANTLR end "ruleTestFile"


    // $ANTLR start "entryRuleTest"
    // InternalMyLanguage.g:78:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalMyLanguage.g:79:1: ( ruleTest EOF )
            // InternalMyLanguage.g:80:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalMyLanguage.g:87:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:91:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalMyLanguage.g:92:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalMyLanguage.g:92:2: ( ( rule__Test__Group__0 ) )
            // InternalMyLanguage.g:93:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalMyLanguage.g:94:3: ( rule__Test__Group__0 )
            // InternalMyLanguage.g:94:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleStatement"
    // InternalMyLanguage.g:103:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyLanguage.g:104:1: ( ruleStatement EOF )
            // InternalMyLanguage.g:105:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyLanguage.g:112:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:116:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyLanguage.g:117:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyLanguage.g:117:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyLanguage.g:118:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyLanguage.g:119:3: ( rule__Statement__Alternatives )
            // InternalMyLanguage.g:119:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleGiven"
    // InternalMyLanguage.g:128:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalMyLanguage.g:129:1: ( ruleGiven EOF )
            // InternalMyLanguage.g:130:1: ruleGiven EOF
            {
             before(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getGivenRule()); 
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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalMyLanguage.g:137:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:141:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalMyLanguage.g:142:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalMyLanguage.g:142:2: ( ( rule__Given__Group__0 ) )
            // InternalMyLanguage.g:143:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalMyLanguage.g:144:3: ( rule__Given__Group__0 )
            // InternalMyLanguage.g:144:4: rule__Given__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getGroup()); 

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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleThen"
    // InternalMyLanguage.g:153:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalMyLanguage.g:154:1: ( ruleThen EOF )
            // InternalMyLanguage.g:155:1: ruleThen EOF
            {
             before(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getThenRule()); 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalMyLanguage.g:162:1: ruleThen : ( ( rule__Then__Group__0 ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:166:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalMyLanguage.g:167:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalMyLanguage.g:167:2: ( ( rule__Then__Group__0 ) )
            // InternalMyLanguage.g:168:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalMyLanguage.g:169:3: ( rule__Then__Group__0 )
            // InternalMyLanguage.g:169:4: rule__Then__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getGroup()); 

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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleWhen"
    // InternalMyLanguage.g:178:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalMyLanguage.g:179:1: ( ruleWhen EOF )
            // InternalMyLanguage.g:180:1: ruleWhen EOF
            {
             before(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getWhenRule()); 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalMyLanguage.g:187:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:191:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalMyLanguage.g:192:2: ( ( rule__When__Group__0 ) )
            {
            // InternalMyLanguage.g:192:2: ( ( rule__When__Group__0 ) )
            // InternalMyLanguage.g:193:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalMyLanguage.g:194:3: ( rule__When__Group__0 )
            // InternalMyLanguage.g:194:4: rule__When__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getGroup()); 

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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleStatementBody"
    // InternalMyLanguage.g:203:1: entryRuleStatementBody : ruleStatementBody EOF ;
    public final void entryRuleStatementBody() throws RecognitionException {
        try {
            // InternalMyLanguage.g:204:1: ( ruleStatementBody EOF )
            // InternalMyLanguage.g:205:1: ruleStatementBody EOF
            {
             before(grammarAccess.getStatementBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleStatementBody();

            state._fsp--;

             after(grammarAccess.getStatementBodyRule()); 
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
    // $ANTLR end "entryRuleStatementBody"


    // $ANTLR start "ruleStatementBody"
    // InternalMyLanguage.g:212:1: ruleStatementBody : ( ( rule__StatementBody__Alternatives ) ) ;
    public final void ruleStatementBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:216:2: ( ( ( rule__StatementBody__Alternatives ) ) )
            // InternalMyLanguage.g:217:2: ( ( rule__StatementBody__Alternatives ) )
            {
            // InternalMyLanguage.g:217:2: ( ( rule__StatementBody__Alternatives ) )
            // InternalMyLanguage.g:218:3: ( rule__StatementBody__Alternatives )
            {
             before(grammarAccess.getStatementBodyAccess().getAlternatives()); 
            // InternalMyLanguage.g:219:3: ( rule__StatementBody__Alternatives )
            // InternalMyLanguage.g:219:4: rule__StatementBody__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StatementBody__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementBodyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatementBody"


    // $ANTLR start "entryRuleCompStatusSent"
    // InternalMyLanguage.g:228:1: entryRuleCompStatusSent : ruleCompStatusSent EOF ;
    public final void entryRuleCompStatusSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:229:1: ( ruleCompStatusSent EOF )
            // InternalMyLanguage.g:230:1: ruleCompStatusSent EOF
            {
             before(grammarAccess.getCompStatusSentRule()); 
            pushFollow(FOLLOW_1);
            ruleCompStatusSent();

            state._fsp--;

             after(grammarAccess.getCompStatusSentRule()); 
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
    // $ANTLR end "entryRuleCompStatusSent"


    // $ANTLR start "ruleCompStatusSent"
    // InternalMyLanguage.g:237:1: ruleCompStatusSent : ( ( rule__CompStatusSent__Group__0 ) ) ;
    public final void ruleCompStatusSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:241:2: ( ( ( rule__CompStatusSent__Group__0 ) ) )
            // InternalMyLanguage.g:242:2: ( ( rule__CompStatusSent__Group__0 ) )
            {
            // InternalMyLanguage.g:242:2: ( ( rule__CompStatusSent__Group__0 ) )
            // InternalMyLanguage.g:243:3: ( rule__CompStatusSent__Group__0 )
            {
             before(grammarAccess.getCompStatusSentAccess().getGroup()); 
            // InternalMyLanguage.g:244:3: ( rule__CompStatusSent__Group__0 )
            // InternalMyLanguage.g:244:4: rule__CompStatusSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompStatusSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompStatusSentAccess().getGroup()); 

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
    // $ANTLR end "ruleCompStatusSent"


    // $ANTLR start "entryRuleGPSSent"
    // InternalMyLanguage.g:253:1: entryRuleGPSSent : ruleGPSSent EOF ;
    public final void entryRuleGPSSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:254:1: ( ruleGPSSent EOF )
            // InternalMyLanguage.g:255:1: ruleGPSSent EOF
            {
             before(grammarAccess.getGPSSentRule()); 
            pushFollow(FOLLOW_1);
            ruleGPSSent();

            state._fsp--;

             after(grammarAccess.getGPSSentRule()); 
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
    // $ANTLR end "entryRuleGPSSent"


    // $ANTLR start "ruleGPSSent"
    // InternalMyLanguage.g:262:1: ruleGPSSent : ( ( rule__GPSSent__Group__0 ) ) ;
    public final void ruleGPSSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:266:2: ( ( ( rule__GPSSent__Group__0 ) ) )
            // InternalMyLanguage.g:267:2: ( ( rule__GPSSent__Group__0 ) )
            {
            // InternalMyLanguage.g:267:2: ( ( rule__GPSSent__Group__0 ) )
            // InternalMyLanguage.g:268:3: ( rule__GPSSent__Group__0 )
            {
             before(grammarAccess.getGPSSentAccess().getGroup()); 
            // InternalMyLanguage.g:269:3: ( rule__GPSSent__Group__0 )
            // InternalMyLanguage.g:269:4: rule__GPSSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GPSSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGPSSentAccess().getGroup()); 

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
    // $ANTLR end "ruleGPSSent"


    // $ANTLR start "entryRuleGPSReadingSent"
    // InternalMyLanguage.g:278:1: entryRuleGPSReadingSent : ruleGPSReadingSent EOF ;
    public final void entryRuleGPSReadingSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:279:1: ( ruleGPSReadingSent EOF )
            // InternalMyLanguage.g:280:1: ruleGPSReadingSent EOF
            {
             before(grammarAccess.getGPSReadingSentRule()); 
            pushFollow(FOLLOW_1);
            ruleGPSReadingSent();

            state._fsp--;

             after(grammarAccess.getGPSReadingSentRule()); 
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
    // $ANTLR end "entryRuleGPSReadingSent"


    // $ANTLR start "ruleGPSReadingSent"
    // InternalMyLanguage.g:287:1: ruleGPSReadingSent : ( ( rule__GPSReadingSent__Group__0 ) ) ;
    public final void ruleGPSReadingSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:291:2: ( ( ( rule__GPSReadingSent__Group__0 ) ) )
            // InternalMyLanguage.g:292:2: ( ( rule__GPSReadingSent__Group__0 ) )
            {
            // InternalMyLanguage.g:292:2: ( ( rule__GPSReadingSent__Group__0 ) )
            // InternalMyLanguage.g:293:3: ( rule__GPSReadingSent__Group__0 )
            {
             before(grammarAccess.getGPSReadingSentAccess().getGroup()); 
            // InternalMyLanguage.g:294:3: ( rule__GPSReadingSent__Group__0 )
            // InternalMyLanguage.g:294:4: rule__GPSReadingSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGPSReadingSentAccess().getGroup()); 

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
    // $ANTLR end "ruleGPSReadingSent"


    // $ANTLR start "entryRuleBaroSent"
    // InternalMyLanguage.g:303:1: entryRuleBaroSent : ruleBaroSent EOF ;
    public final void entryRuleBaroSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:304:1: ( ruleBaroSent EOF )
            // InternalMyLanguage.g:305:1: ruleBaroSent EOF
            {
             before(grammarAccess.getBaroSentRule()); 
            pushFollow(FOLLOW_1);
            ruleBaroSent();

            state._fsp--;

             after(grammarAccess.getBaroSentRule()); 
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
    // $ANTLR end "entryRuleBaroSent"


    // $ANTLR start "ruleBaroSent"
    // InternalMyLanguage.g:312:1: ruleBaroSent : ( ( rule__BaroSent__Group__0 ) ) ;
    public final void ruleBaroSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:316:2: ( ( ( rule__BaroSent__Group__0 ) ) )
            // InternalMyLanguage.g:317:2: ( ( rule__BaroSent__Group__0 ) )
            {
            // InternalMyLanguage.g:317:2: ( ( rule__BaroSent__Group__0 ) )
            // InternalMyLanguage.g:318:3: ( rule__BaroSent__Group__0 )
            {
             before(grammarAccess.getBaroSentAccess().getGroup()); 
            // InternalMyLanguage.g:319:3: ( rule__BaroSent__Group__0 )
            // InternalMyLanguage.g:319:4: rule__BaroSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaroSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaroSentAccess().getGroup()); 

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
    // $ANTLR end "ruleBaroSent"


    // $ANTLR start "entryRuleBaroAltSent"
    // InternalMyLanguage.g:328:1: entryRuleBaroAltSent : ruleBaroAltSent EOF ;
    public final void entryRuleBaroAltSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:329:1: ( ruleBaroAltSent EOF )
            // InternalMyLanguage.g:330:1: ruleBaroAltSent EOF
            {
             before(grammarAccess.getBaroAltSentRule()); 
            pushFollow(FOLLOW_1);
            ruleBaroAltSent();

            state._fsp--;

             after(grammarAccess.getBaroAltSentRule()); 
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
    // $ANTLR end "entryRuleBaroAltSent"


    // $ANTLR start "ruleBaroAltSent"
    // InternalMyLanguage.g:337:1: ruleBaroAltSent : ( ( rule__BaroAltSent__Group__0 ) ) ;
    public final void ruleBaroAltSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:341:2: ( ( ( rule__BaroAltSent__Group__0 ) ) )
            // InternalMyLanguage.g:342:2: ( ( rule__BaroAltSent__Group__0 ) )
            {
            // InternalMyLanguage.g:342:2: ( ( rule__BaroAltSent__Group__0 ) )
            // InternalMyLanguage.g:343:3: ( rule__BaroAltSent__Group__0 )
            {
             before(grammarAccess.getBaroAltSentAccess().getGroup()); 
            // InternalMyLanguage.g:344:3: ( rule__BaroAltSent__Group__0 )
            // InternalMyLanguage.g:344:4: rule__BaroAltSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaroAltSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaroAltSentAccess().getGroup()); 

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
    // $ANTLR end "ruleBaroAltSent"


    // $ANTLR start "entryRuleSonarSent"
    // InternalMyLanguage.g:353:1: entryRuleSonarSent : ruleSonarSent EOF ;
    public final void entryRuleSonarSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:354:1: ( ruleSonarSent EOF )
            // InternalMyLanguage.g:355:1: ruleSonarSent EOF
            {
             before(grammarAccess.getSonarSentRule()); 
            pushFollow(FOLLOW_1);
            ruleSonarSent();

            state._fsp--;

             after(grammarAccess.getSonarSentRule()); 
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
    // $ANTLR end "entryRuleSonarSent"


    // $ANTLR start "ruleSonarSent"
    // InternalMyLanguage.g:362:1: ruleSonarSent : ( ( rule__SonarSent__Group__0 ) ) ;
    public final void ruleSonarSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:366:2: ( ( ( rule__SonarSent__Group__0 ) ) )
            // InternalMyLanguage.g:367:2: ( ( rule__SonarSent__Group__0 ) )
            {
            // InternalMyLanguage.g:367:2: ( ( rule__SonarSent__Group__0 ) )
            // InternalMyLanguage.g:368:3: ( rule__SonarSent__Group__0 )
            {
             before(grammarAccess.getSonarSentAccess().getGroup()); 
            // InternalMyLanguage.g:369:3: ( rule__SonarSent__Group__0 )
            // InternalMyLanguage.g:369:4: rule__SonarSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SonarSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSonarSentAccess().getGroup()); 

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
    // $ANTLR end "ruleSonarSent"


    // $ANTLR start "entryRuleSonarDistanceSent"
    // InternalMyLanguage.g:378:1: entryRuleSonarDistanceSent : ruleSonarDistanceSent EOF ;
    public final void entryRuleSonarDistanceSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:379:1: ( ruleSonarDistanceSent EOF )
            // InternalMyLanguage.g:380:1: ruleSonarDistanceSent EOF
            {
             before(grammarAccess.getSonarDistanceSentRule()); 
            pushFollow(FOLLOW_1);
            ruleSonarDistanceSent();

            state._fsp--;

             after(grammarAccess.getSonarDistanceSentRule()); 
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
    // $ANTLR end "entryRuleSonarDistanceSent"


    // $ANTLR start "ruleSonarDistanceSent"
    // InternalMyLanguage.g:387:1: ruleSonarDistanceSent : ( ( rule__SonarDistanceSent__Group__0 ) ) ;
    public final void ruleSonarDistanceSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:391:2: ( ( ( rule__SonarDistanceSent__Group__0 ) ) )
            // InternalMyLanguage.g:392:2: ( ( rule__SonarDistanceSent__Group__0 ) )
            {
            // InternalMyLanguage.g:392:2: ( ( rule__SonarDistanceSent__Group__0 ) )
            // InternalMyLanguage.g:393:3: ( rule__SonarDistanceSent__Group__0 )
            {
             before(grammarAccess.getSonarDistanceSentAccess().getGroup()); 
            // InternalMyLanguage.g:394:3: ( rule__SonarDistanceSent__Group__0 )
            // InternalMyLanguage.g:394:4: rule__SonarDistanceSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SonarDistanceSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSonarDistanceSentAccess().getGroup()); 

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
    // $ANTLR end "ruleSonarDistanceSent"


    // $ANTLR start "entryRuleNotificationSent"
    // InternalMyLanguage.g:403:1: entryRuleNotificationSent : ruleNotificationSent EOF ;
    public final void entryRuleNotificationSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:404:1: ( ruleNotificationSent EOF )
            // InternalMyLanguage.g:405:1: ruleNotificationSent EOF
            {
             before(grammarAccess.getNotificationSentRule()); 
            pushFollow(FOLLOW_1);
            ruleNotificationSent();

            state._fsp--;

             after(grammarAccess.getNotificationSentRule()); 
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
    // $ANTLR end "entryRuleNotificationSent"


    // $ANTLR start "ruleNotificationSent"
    // InternalMyLanguage.g:412:1: ruleNotificationSent : ( ( rule__NotificationSent__Group__0 ) ) ;
    public final void ruleNotificationSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:416:2: ( ( ( rule__NotificationSent__Group__0 ) ) )
            // InternalMyLanguage.g:417:2: ( ( rule__NotificationSent__Group__0 ) )
            {
            // InternalMyLanguage.g:417:2: ( ( rule__NotificationSent__Group__0 ) )
            // InternalMyLanguage.g:418:3: ( rule__NotificationSent__Group__0 )
            {
             before(grammarAccess.getNotificationSentAccess().getGroup()); 
            // InternalMyLanguage.g:419:3: ( rule__NotificationSent__Group__0 )
            // InternalMyLanguage.g:419:4: rule__NotificationSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotificationSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotificationSentAccess().getGroup()); 

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
    // $ANTLR end "ruleNotificationSent"


    // $ANTLR start "entryRuleTimeSent"
    // InternalMyLanguage.g:428:1: entryRuleTimeSent : ruleTimeSent EOF ;
    public final void entryRuleTimeSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:429:1: ( ruleTimeSent EOF )
            // InternalMyLanguage.g:430:1: ruleTimeSent EOF
            {
             before(grammarAccess.getTimeSentRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeSent();

            state._fsp--;

             after(grammarAccess.getTimeSentRule()); 
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
    // $ANTLR end "entryRuleTimeSent"


    // $ANTLR start "ruleTimeSent"
    // InternalMyLanguage.g:437:1: ruleTimeSent : ( ( rule__TimeSent__Group__0 ) ) ;
    public final void ruleTimeSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:441:2: ( ( ( rule__TimeSent__Group__0 ) ) )
            // InternalMyLanguage.g:442:2: ( ( rule__TimeSent__Group__0 ) )
            {
            // InternalMyLanguage.g:442:2: ( ( rule__TimeSent__Group__0 ) )
            // InternalMyLanguage.g:443:3: ( rule__TimeSent__Group__0 )
            {
             before(grammarAccess.getTimeSentAccess().getGroup()); 
            // InternalMyLanguage.g:444:3: ( rule__TimeSent__Group__0 )
            // InternalMyLanguage.g:444:4: rule__TimeSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSentAccess().getGroup()); 

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
    // $ANTLR end "ruleTimeSent"


    // $ANTLR start "entryRuleTimeInterval"
    // InternalMyLanguage.g:453:1: entryRuleTimeInterval : ruleTimeInterval EOF ;
    public final void entryRuleTimeInterval() throws RecognitionException {
        try {
            // InternalMyLanguage.g:454:1: ( ruleTimeInterval EOF )
            // InternalMyLanguage.g:455:1: ruleTimeInterval EOF
            {
             before(grammarAccess.getTimeIntervalRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeInterval();

            state._fsp--;

             after(grammarAccess.getTimeIntervalRule()); 
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
    // $ANTLR end "entryRuleTimeInterval"


    // $ANTLR start "ruleTimeInterval"
    // InternalMyLanguage.g:462:1: ruleTimeInterval : ( ( rule__TimeInterval__Group__0 ) ) ;
    public final void ruleTimeInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:466:2: ( ( ( rule__TimeInterval__Group__0 ) ) )
            // InternalMyLanguage.g:467:2: ( ( rule__TimeInterval__Group__0 ) )
            {
            // InternalMyLanguage.g:467:2: ( ( rule__TimeInterval__Group__0 ) )
            // InternalMyLanguage.g:468:3: ( rule__TimeInterval__Group__0 )
            {
             before(grammarAccess.getTimeIntervalAccess().getGroup()); 
            // InternalMyLanguage.g:469:3: ( rule__TimeInterval__Group__0 )
            // InternalMyLanguage.g:469:4: rule__TimeInterval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeInterval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeIntervalAccess().getGroup()); 

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
    // $ANTLR end "ruleTimeInterval"


    // $ANTLR start "entryRuleBatterySent"
    // InternalMyLanguage.g:478:1: entryRuleBatterySent : ruleBatterySent EOF ;
    public final void entryRuleBatterySent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:479:1: ( ruleBatterySent EOF )
            // InternalMyLanguage.g:480:1: ruleBatterySent EOF
            {
             before(grammarAccess.getBatterySentRule()); 
            pushFollow(FOLLOW_1);
            ruleBatterySent();

            state._fsp--;

             after(grammarAccess.getBatterySentRule()); 
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
    // $ANTLR end "entryRuleBatterySent"


    // $ANTLR start "ruleBatterySent"
    // InternalMyLanguage.g:487:1: ruleBatterySent : ( ( rule__BatterySent__Group__0 ) ) ;
    public final void ruleBatterySent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:491:2: ( ( ( rule__BatterySent__Group__0 ) ) )
            // InternalMyLanguage.g:492:2: ( ( rule__BatterySent__Group__0 ) )
            {
            // InternalMyLanguage.g:492:2: ( ( rule__BatterySent__Group__0 ) )
            // InternalMyLanguage.g:493:3: ( rule__BatterySent__Group__0 )
            {
             before(grammarAccess.getBatterySentAccess().getGroup()); 
            // InternalMyLanguage.g:494:3: ( rule__BatterySent__Group__0 )
            // InternalMyLanguage.g:494:4: rule__BatterySent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BatterySent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBatterySentAccess().getGroup()); 

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
    // $ANTLR end "ruleBatterySent"


    // $ANTLR start "entryRuleBatteryLevelSent"
    // InternalMyLanguage.g:503:1: entryRuleBatteryLevelSent : ruleBatteryLevelSent EOF ;
    public final void entryRuleBatteryLevelSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:504:1: ( ruleBatteryLevelSent EOF )
            // InternalMyLanguage.g:505:1: ruleBatteryLevelSent EOF
            {
             before(grammarAccess.getBatteryLevelSentRule()); 
            pushFollow(FOLLOW_1);
            ruleBatteryLevelSent();

            state._fsp--;

             after(grammarAccess.getBatteryLevelSentRule()); 
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
    // $ANTLR end "entryRuleBatteryLevelSent"


    // $ANTLR start "ruleBatteryLevelSent"
    // InternalMyLanguage.g:512:1: ruleBatteryLevelSent : ( ( rule__BatteryLevelSent__Group__0 ) ) ;
    public final void ruleBatteryLevelSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:516:2: ( ( ( rule__BatteryLevelSent__Group__0 ) ) )
            // InternalMyLanguage.g:517:2: ( ( rule__BatteryLevelSent__Group__0 ) )
            {
            // InternalMyLanguage.g:517:2: ( ( rule__BatteryLevelSent__Group__0 ) )
            // InternalMyLanguage.g:518:3: ( rule__BatteryLevelSent__Group__0 )
            {
             before(grammarAccess.getBatteryLevelSentAccess().getGroup()); 
            // InternalMyLanguage.g:519:3: ( rule__BatteryLevelSent__Group__0 )
            // InternalMyLanguage.g:519:4: rule__BatteryLevelSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BatteryLevelSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLevelSentAccess().getGroup()); 

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
    // $ANTLR end "ruleBatteryLevelSent"


    // $ANTLR start "entryRulePeopleSent"
    // InternalMyLanguage.g:528:1: entryRulePeopleSent : rulePeopleSent EOF ;
    public final void entryRulePeopleSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:529:1: ( rulePeopleSent EOF )
            // InternalMyLanguage.g:530:1: rulePeopleSent EOF
            {
             before(grammarAccess.getPeopleSentRule()); 
            pushFollow(FOLLOW_1);
            rulePeopleSent();

            state._fsp--;

             after(grammarAccess.getPeopleSentRule()); 
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
    // $ANTLR end "entryRulePeopleSent"


    // $ANTLR start "rulePeopleSent"
    // InternalMyLanguage.g:537:1: rulePeopleSent : ( ( rule__PeopleSent__Group__0 ) ) ;
    public final void rulePeopleSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:541:2: ( ( ( rule__PeopleSent__Group__0 ) ) )
            // InternalMyLanguage.g:542:2: ( ( rule__PeopleSent__Group__0 ) )
            {
            // InternalMyLanguage.g:542:2: ( ( rule__PeopleSent__Group__0 ) )
            // InternalMyLanguage.g:543:3: ( rule__PeopleSent__Group__0 )
            {
             before(grammarAccess.getPeopleSentAccess().getGroup()); 
            // InternalMyLanguage.g:544:3: ( rule__PeopleSent__Group__0 )
            // InternalMyLanguage.g:544:4: rule__PeopleSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PeopleSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeopleSentAccess().getGroup()); 

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
    // $ANTLR end "rulePeopleSent"


    // $ANTLR start "entryRulePeoplePosSent"
    // InternalMyLanguage.g:553:1: entryRulePeoplePosSent : rulePeoplePosSent EOF ;
    public final void entryRulePeoplePosSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:554:1: ( rulePeoplePosSent EOF )
            // InternalMyLanguage.g:555:1: rulePeoplePosSent EOF
            {
             before(grammarAccess.getPeoplePosSentRule()); 
            pushFollow(FOLLOW_1);
            rulePeoplePosSent();

            state._fsp--;

             after(grammarAccess.getPeoplePosSentRule()); 
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
    // $ANTLR end "entryRulePeoplePosSent"


    // $ANTLR start "rulePeoplePosSent"
    // InternalMyLanguage.g:562:1: rulePeoplePosSent : ( ( rule__PeoplePosSent__Group__0 ) ) ;
    public final void rulePeoplePosSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:566:2: ( ( ( rule__PeoplePosSent__Group__0 ) ) )
            // InternalMyLanguage.g:567:2: ( ( rule__PeoplePosSent__Group__0 ) )
            {
            // InternalMyLanguage.g:567:2: ( ( rule__PeoplePosSent__Group__0 ) )
            // InternalMyLanguage.g:568:3: ( rule__PeoplePosSent__Group__0 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getGroup()); 
            // InternalMyLanguage.g:569:3: ( rule__PeoplePosSent__Group__0 )
            // InternalMyLanguage.g:569:4: rule__PeoplePosSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeoplePosSentAccess().getGroup()); 

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
    // $ANTLR end "rulePeoplePosSent"


    // $ANTLR start "entryRulePeopleNumbSent"
    // InternalMyLanguage.g:578:1: entryRulePeopleNumbSent : rulePeopleNumbSent EOF ;
    public final void entryRulePeopleNumbSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:579:1: ( rulePeopleNumbSent EOF )
            // InternalMyLanguage.g:580:1: rulePeopleNumbSent EOF
            {
             before(grammarAccess.getPeopleNumbSentRule()); 
            pushFollow(FOLLOW_1);
            rulePeopleNumbSent();

            state._fsp--;

             after(grammarAccess.getPeopleNumbSentRule()); 
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
    // $ANTLR end "entryRulePeopleNumbSent"


    // $ANTLR start "rulePeopleNumbSent"
    // InternalMyLanguage.g:587:1: rulePeopleNumbSent : ( ( rule__PeopleNumbSent__Group__0 ) ) ;
    public final void rulePeopleNumbSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:591:2: ( ( ( rule__PeopleNumbSent__Group__0 ) ) )
            // InternalMyLanguage.g:592:2: ( ( rule__PeopleNumbSent__Group__0 ) )
            {
            // InternalMyLanguage.g:592:2: ( ( rule__PeopleNumbSent__Group__0 ) )
            // InternalMyLanguage.g:593:3: ( rule__PeopleNumbSent__Group__0 )
            {
             before(grammarAccess.getPeopleNumbSentAccess().getGroup()); 
            // InternalMyLanguage.g:594:3: ( rule__PeopleNumbSent__Group__0 )
            // InternalMyLanguage.g:594:4: rule__PeopleNumbSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PeopleNumbSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeopleNumbSentAccess().getGroup()); 

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
    // $ANTLR end "rulePeopleNumbSent"


    // $ANTLR start "entryRuleMissionSent"
    // InternalMyLanguage.g:603:1: entryRuleMissionSent : ruleMissionSent EOF ;
    public final void entryRuleMissionSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:604:1: ( ruleMissionSent EOF )
            // InternalMyLanguage.g:605:1: ruleMissionSent EOF
            {
             before(grammarAccess.getMissionSentRule()); 
            pushFollow(FOLLOW_1);
            ruleMissionSent();

            state._fsp--;

             after(grammarAccess.getMissionSentRule()); 
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
    // $ANTLR end "entryRuleMissionSent"


    // $ANTLR start "ruleMissionSent"
    // InternalMyLanguage.g:612:1: ruleMissionSent : ( ( rule__MissionSent__Group__0 ) ) ;
    public final void ruleMissionSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:616:2: ( ( ( rule__MissionSent__Group__0 ) ) )
            // InternalMyLanguage.g:617:2: ( ( rule__MissionSent__Group__0 ) )
            {
            // InternalMyLanguage.g:617:2: ( ( rule__MissionSent__Group__0 ) )
            // InternalMyLanguage.g:618:3: ( rule__MissionSent__Group__0 )
            {
             before(grammarAccess.getMissionSentAccess().getGroup()); 
            // InternalMyLanguage.g:619:3: ( rule__MissionSent__Group__0 )
            // InternalMyLanguage.g:619:4: rule__MissionSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MissionSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionSentAccess().getGroup()); 

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
    // $ANTLR end "ruleMissionSent"


    // $ANTLR start "entryRuleMissionGoalSent"
    // InternalMyLanguage.g:628:1: entryRuleMissionGoalSent : ruleMissionGoalSent EOF ;
    public final void entryRuleMissionGoalSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:629:1: ( ruleMissionGoalSent EOF )
            // InternalMyLanguage.g:630:1: ruleMissionGoalSent EOF
            {
             before(grammarAccess.getMissionGoalSentRule()); 
            pushFollow(FOLLOW_1);
            ruleMissionGoalSent();

            state._fsp--;

             after(grammarAccess.getMissionGoalSentRule()); 
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
    // $ANTLR end "entryRuleMissionGoalSent"


    // $ANTLR start "ruleMissionGoalSent"
    // InternalMyLanguage.g:637:1: ruleMissionGoalSent : ( ( rule__MissionGoalSent__Group__0 ) ) ;
    public final void ruleMissionGoalSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:641:2: ( ( ( rule__MissionGoalSent__Group__0 ) ) )
            // InternalMyLanguage.g:642:2: ( ( rule__MissionGoalSent__Group__0 ) )
            {
            // InternalMyLanguage.g:642:2: ( ( rule__MissionGoalSent__Group__0 ) )
            // InternalMyLanguage.g:643:3: ( rule__MissionGoalSent__Group__0 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getGroup()); 
            // InternalMyLanguage.g:644:3: ( rule__MissionGoalSent__Group__0 )
            // InternalMyLanguage.g:644:4: rule__MissionGoalSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MissionGoalSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionGoalSentAccess().getGroup()); 

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
    // $ANTLR end "ruleMissionGoalSent"


    // $ANTLR start "entryRuleMissionRiskLevelSent"
    // InternalMyLanguage.g:653:1: entryRuleMissionRiskLevelSent : ruleMissionRiskLevelSent EOF ;
    public final void entryRuleMissionRiskLevelSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:654:1: ( ruleMissionRiskLevelSent EOF )
            // InternalMyLanguage.g:655:1: ruleMissionRiskLevelSent EOF
            {
             before(grammarAccess.getMissionRiskLevelSentRule()); 
            pushFollow(FOLLOW_1);
            ruleMissionRiskLevelSent();

            state._fsp--;

             after(grammarAccess.getMissionRiskLevelSentRule()); 
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
    // $ANTLR end "entryRuleMissionRiskLevelSent"


    // $ANTLR start "ruleMissionRiskLevelSent"
    // InternalMyLanguage.g:662:1: ruleMissionRiskLevelSent : ( ( rule__MissionRiskLevelSent__Group__0 ) ) ;
    public final void ruleMissionRiskLevelSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:666:2: ( ( ( rule__MissionRiskLevelSent__Group__0 ) ) )
            // InternalMyLanguage.g:667:2: ( ( rule__MissionRiskLevelSent__Group__0 ) )
            {
            // InternalMyLanguage.g:667:2: ( ( rule__MissionRiskLevelSent__Group__0 ) )
            // InternalMyLanguage.g:668:3: ( rule__MissionRiskLevelSent__Group__0 )
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getGroup()); 
            // InternalMyLanguage.g:669:3: ( rule__MissionRiskLevelSent__Group__0 )
            // InternalMyLanguage.g:669:4: rule__MissionRiskLevelSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MissionRiskLevelSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionRiskLevelSentAccess().getGroup()); 

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
    // $ANTLR end "ruleMissionRiskLevelSent"


    // $ANTLR start "entryRuleMissionStatusSent"
    // InternalMyLanguage.g:678:1: entryRuleMissionStatusSent : ruleMissionStatusSent EOF ;
    public final void entryRuleMissionStatusSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:679:1: ( ruleMissionStatusSent EOF )
            // InternalMyLanguage.g:680:1: ruleMissionStatusSent EOF
            {
             before(grammarAccess.getMissionStatusSentRule()); 
            pushFollow(FOLLOW_1);
            ruleMissionStatusSent();

            state._fsp--;

             after(grammarAccess.getMissionStatusSentRule()); 
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
    // $ANTLR end "entryRuleMissionStatusSent"


    // $ANTLR start "ruleMissionStatusSent"
    // InternalMyLanguage.g:687:1: ruleMissionStatusSent : ( ( rule__MissionStatusSent__Group__0 ) ) ;
    public final void ruleMissionStatusSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:691:2: ( ( ( rule__MissionStatusSent__Group__0 ) ) )
            // InternalMyLanguage.g:692:2: ( ( rule__MissionStatusSent__Group__0 ) )
            {
            // InternalMyLanguage.g:692:2: ( ( rule__MissionStatusSent__Group__0 ) )
            // InternalMyLanguage.g:693:3: ( rule__MissionStatusSent__Group__0 )
            {
             before(grammarAccess.getMissionStatusSentAccess().getGroup()); 
            // InternalMyLanguage.g:694:3: ( rule__MissionStatusSent__Group__0 )
            // InternalMyLanguage.g:694:4: rule__MissionStatusSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MissionStatusSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionStatusSentAccess().getGroup()); 

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
    // $ANTLR end "ruleMissionStatusSent"


    // $ANTLR start "entryRuleRobot"
    // InternalMyLanguage.g:703:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMyLanguage.g:704:1: ( ruleRobot EOF )
            // InternalMyLanguage.g:705:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyLanguage.g:712:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:716:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMyLanguage.g:717:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMyLanguage.g:717:2: ( ( rule__Robot__Group__0 ) )
            // InternalMyLanguage.g:718:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMyLanguage.g:719:3: ( rule__Robot__Group__0 )
            // InternalMyLanguage.g:719:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleRobotAutoPilot"
    // InternalMyLanguage.g:728:1: entryRuleRobotAutoPilot : ruleRobotAutoPilot EOF ;
    public final void entryRuleRobotAutoPilot() throws RecognitionException {
        try {
            // InternalMyLanguage.g:729:1: ( ruleRobotAutoPilot EOF )
            // InternalMyLanguage.g:730:1: ruleRobotAutoPilot EOF
            {
             before(grammarAccess.getRobotAutoPilotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobotAutoPilot();

            state._fsp--;

             after(grammarAccess.getRobotAutoPilotRule()); 
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
    // $ANTLR end "entryRuleRobotAutoPilot"


    // $ANTLR start "ruleRobotAutoPilot"
    // InternalMyLanguage.g:737:1: ruleRobotAutoPilot : ( ( rule__RobotAutoPilot__Group__0 ) ) ;
    public final void ruleRobotAutoPilot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:741:2: ( ( ( rule__RobotAutoPilot__Group__0 ) ) )
            // InternalMyLanguage.g:742:2: ( ( rule__RobotAutoPilot__Group__0 ) )
            {
            // InternalMyLanguage.g:742:2: ( ( rule__RobotAutoPilot__Group__0 ) )
            // InternalMyLanguage.g:743:3: ( rule__RobotAutoPilot__Group__0 )
            {
             before(grammarAccess.getRobotAutoPilotAccess().getGroup()); 
            // InternalMyLanguage.g:744:3: ( rule__RobotAutoPilot__Group__0 )
            // InternalMyLanguage.g:744:4: rule__RobotAutoPilot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RobotAutoPilot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAutoPilotAccess().getGroup()); 

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
    // $ANTLR end "ruleRobotAutoPilot"


    // $ANTLR start "entryRulePayloadSent"
    // InternalMyLanguage.g:753:1: entryRulePayloadSent : rulePayloadSent EOF ;
    public final void entryRulePayloadSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:754:1: ( rulePayloadSent EOF )
            // InternalMyLanguage.g:755:1: rulePayloadSent EOF
            {
             before(grammarAccess.getPayloadSentRule()); 
            pushFollow(FOLLOW_1);
            rulePayloadSent();

            state._fsp--;

             after(grammarAccess.getPayloadSentRule()); 
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
    // $ANTLR end "entryRulePayloadSent"


    // $ANTLR start "rulePayloadSent"
    // InternalMyLanguage.g:762:1: rulePayloadSent : ( ( rule__PayloadSent__Group__0 ) ) ;
    public final void rulePayloadSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:766:2: ( ( ( rule__PayloadSent__Group__0 ) ) )
            // InternalMyLanguage.g:767:2: ( ( rule__PayloadSent__Group__0 ) )
            {
            // InternalMyLanguage.g:767:2: ( ( rule__PayloadSent__Group__0 ) )
            // InternalMyLanguage.g:768:3: ( rule__PayloadSent__Group__0 )
            {
             before(grammarAccess.getPayloadSentAccess().getGroup()); 
            // InternalMyLanguage.g:769:3: ( rule__PayloadSent__Group__0 )
            // InternalMyLanguage.g:769:4: rule__PayloadSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PayloadSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadSentAccess().getGroup()); 

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
    // $ANTLR end "rulePayloadSent"


    // $ANTLR start "entryRuleRobotDistanceSent"
    // InternalMyLanguage.g:778:1: entryRuleRobotDistanceSent : ruleRobotDistanceSent EOF ;
    public final void entryRuleRobotDistanceSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:779:1: ( ruleRobotDistanceSent EOF )
            // InternalMyLanguage.g:780:1: ruleRobotDistanceSent EOF
            {
             before(grammarAccess.getRobotDistanceSentRule()); 
            pushFollow(FOLLOW_1);
            ruleRobotDistanceSent();

            state._fsp--;

             after(grammarAccess.getRobotDistanceSentRule()); 
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
    // $ANTLR end "entryRuleRobotDistanceSent"


    // $ANTLR start "ruleRobotDistanceSent"
    // InternalMyLanguage.g:787:1: ruleRobotDistanceSent : ( ( rule__RobotDistanceSent__Group__0 ) ) ;
    public final void ruleRobotDistanceSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:791:2: ( ( ( rule__RobotDistanceSent__Group__0 ) ) )
            // InternalMyLanguage.g:792:2: ( ( rule__RobotDistanceSent__Group__0 ) )
            {
            // InternalMyLanguage.g:792:2: ( ( rule__RobotDistanceSent__Group__0 ) )
            // InternalMyLanguage.g:793:3: ( rule__RobotDistanceSent__Group__0 )
            {
             before(grammarAccess.getRobotDistanceSentAccess().getGroup()); 
            // InternalMyLanguage.g:794:3: ( rule__RobotDistanceSent__Group__0 )
            // InternalMyLanguage.g:794:4: rule__RobotDistanceSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RobotDistanceSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotDistanceSentAccess().getGroup()); 

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
    // $ANTLR end "ruleRobotDistanceSent"


    // $ANTLR start "entryRuleDistanceToLocationSent"
    // InternalMyLanguage.g:803:1: entryRuleDistanceToLocationSent : ruleDistanceToLocationSent EOF ;
    public final void entryRuleDistanceToLocationSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:804:1: ( ruleDistanceToLocationSent EOF )
            // InternalMyLanguage.g:805:1: ruleDistanceToLocationSent EOF
            {
             before(grammarAccess.getDistanceToLocationSentRule()); 
            pushFollow(FOLLOW_1);
            ruleDistanceToLocationSent();

            state._fsp--;

             after(grammarAccess.getDistanceToLocationSentRule()); 
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
    // $ANTLR end "entryRuleDistanceToLocationSent"


    // $ANTLR start "ruleDistanceToLocationSent"
    // InternalMyLanguage.g:812:1: ruleDistanceToLocationSent : ( ( rule__DistanceToLocationSent__Group__0 ) ) ;
    public final void ruleDistanceToLocationSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:816:2: ( ( ( rule__DistanceToLocationSent__Group__0 ) ) )
            // InternalMyLanguage.g:817:2: ( ( rule__DistanceToLocationSent__Group__0 ) )
            {
            // InternalMyLanguage.g:817:2: ( ( rule__DistanceToLocationSent__Group__0 ) )
            // InternalMyLanguage.g:818:3: ( rule__DistanceToLocationSent__Group__0 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getGroup()); 
            // InternalMyLanguage.g:819:3: ( rule__DistanceToLocationSent__Group__0 )
            // InternalMyLanguage.g:819:4: rule__DistanceToLocationSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceToLocationSentAccess().getGroup()); 

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
    // $ANTLR end "ruleDistanceToLocationSent"


    // $ANTLR start "entryRuleDistanceToObstaclesSent"
    // InternalMyLanguage.g:828:1: entryRuleDistanceToObstaclesSent : ruleDistanceToObstaclesSent EOF ;
    public final void entryRuleDistanceToObstaclesSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:829:1: ( ruleDistanceToObstaclesSent EOF )
            // InternalMyLanguage.g:830:1: ruleDistanceToObstaclesSent EOF
            {
             before(grammarAccess.getDistanceToObstaclesSentRule()); 
            pushFollow(FOLLOW_1);
            ruleDistanceToObstaclesSent();

            state._fsp--;

             after(grammarAccess.getDistanceToObstaclesSentRule()); 
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
    // $ANTLR end "entryRuleDistanceToObstaclesSent"


    // $ANTLR start "ruleDistanceToObstaclesSent"
    // InternalMyLanguage.g:837:1: ruleDistanceToObstaclesSent : ( ( rule__DistanceToObstaclesSent__Group__0 ) ) ;
    public final void ruleDistanceToObstaclesSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:841:2: ( ( ( rule__DistanceToObstaclesSent__Group__0 ) ) )
            // InternalMyLanguage.g:842:2: ( ( rule__DistanceToObstaclesSent__Group__0 ) )
            {
            // InternalMyLanguage.g:842:2: ( ( rule__DistanceToObstaclesSent__Group__0 ) )
            // InternalMyLanguage.g:843:3: ( rule__DistanceToObstaclesSent__Group__0 )
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getGroup()); 
            // InternalMyLanguage.g:844:3: ( rule__DistanceToObstaclesSent__Group__0 )
            // InternalMyLanguage.g:844:4: rule__DistanceToObstaclesSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToObstaclesSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceToObstaclesSentAccess().getGroup()); 

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
    // $ANTLR end "ruleDistanceToObstaclesSent"


    // $ANTLR start "entryRuleEqualSent"
    // InternalMyLanguage.g:853:1: entryRuleEqualSent : ruleEqualSent EOF ;
    public final void entryRuleEqualSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:854:1: ( ruleEqualSent EOF )
            // InternalMyLanguage.g:855:1: ruleEqualSent EOF
            {
             before(grammarAccess.getEqualSentRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualSent();

            state._fsp--;

             after(grammarAccess.getEqualSentRule()); 
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
    // $ANTLR end "entryRuleEqualSent"


    // $ANTLR start "ruleEqualSent"
    // InternalMyLanguage.g:862:1: ruleEqualSent : ( ( rule__EqualSent__Group__0 ) ) ;
    public final void ruleEqualSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:866:2: ( ( ( rule__EqualSent__Group__0 ) ) )
            // InternalMyLanguage.g:867:2: ( ( rule__EqualSent__Group__0 ) )
            {
            // InternalMyLanguage.g:867:2: ( ( rule__EqualSent__Group__0 ) )
            // InternalMyLanguage.g:868:3: ( rule__EqualSent__Group__0 )
            {
             before(grammarAccess.getEqualSentAccess().getGroup()); 
            // InternalMyLanguage.g:869:3: ( rule__EqualSent__Group__0 )
            // InternalMyLanguage.g:869:4: rule__EqualSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualSentAccess().getGroup()); 

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
    // $ANTLR end "ruleEqualSent"


    // $ANTLR start "entryRuleLessSent"
    // InternalMyLanguage.g:878:1: entryRuleLessSent : ruleLessSent EOF ;
    public final void entryRuleLessSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:879:1: ( ruleLessSent EOF )
            // InternalMyLanguage.g:880:1: ruleLessSent EOF
            {
             before(grammarAccess.getLessSentRule()); 
            pushFollow(FOLLOW_1);
            ruleLessSent();

            state._fsp--;

             after(grammarAccess.getLessSentRule()); 
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
    // $ANTLR end "entryRuleLessSent"


    // $ANTLR start "ruleLessSent"
    // InternalMyLanguage.g:887:1: ruleLessSent : ( ( rule__LessSent__Group__0 ) ) ;
    public final void ruleLessSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:891:2: ( ( ( rule__LessSent__Group__0 ) ) )
            // InternalMyLanguage.g:892:2: ( ( rule__LessSent__Group__0 ) )
            {
            // InternalMyLanguage.g:892:2: ( ( rule__LessSent__Group__0 ) )
            // InternalMyLanguage.g:893:3: ( rule__LessSent__Group__0 )
            {
             before(grammarAccess.getLessSentAccess().getGroup()); 
            // InternalMyLanguage.g:894:3: ( rule__LessSent__Group__0 )
            // InternalMyLanguage.g:894:4: rule__LessSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LessSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLessSentAccess().getGroup()); 

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
    // $ANTLR end "ruleLessSent"


    // $ANTLR start "entryRuleGreaterSent"
    // InternalMyLanguage.g:903:1: entryRuleGreaterSent : ruleGreaterSent EOF ;
    public final void entryRuleGreaterSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:904:1: ( ruleGreaterSent EOF )
            // InternalMyLanguage.g:905:1: ruleGreaterSent EOF
            {
             before(grammarAccess.getGreaterSentRule()); 
            pushFollow(FOLLOW_1);
            ruleGreaterSent();

            state._fsp--;

             after(grammarAccess.getGreaterSentRule()); 
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
    // $ANTLR end "entryRuleGreaterSent"


    // $ANTLR start "ruleGreaterSent"
    // InternalMyLanguage.g:912:1: ruleGreaterSent : ( ( rule__GreaterSent__Group__0 ) ) ;
    public final void ruleGreaterSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:916:2: ( ( ( rule__GreaterSent__Group__0 ) ) )
            // InternalMyLanguage.g:917:2: ( ( rule__GreaterSent__Group__0 ) )
            {
            // InternalMyLanguage.g:917:2: ( ( rule__GreaterSent__Group__0 ) )
            // InternalMyLanguage.g:918:3: ( rule__GreaterSent__Group__0 )
            {
             before(grammarAccess.getGreaterSentAccess().getGroup()); 
            // InternalMyLanguage.g:919:3: ( rule__GreaterSent__Group__0 )
            // InternalMyLanguage.g:919:4: rule__GreaterSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GreaterSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreaterSentAccess().getGroup()); 

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
    // $ANTLR end "ruleGreaterSent"


    // $ANTLR start "entryRuleRobotStateSent"
    // InternalMyLanguage.g:928:1: entryRuleRobotStateSent : ruleRobotStateSent EOF ;
    public final void entryRuleRobotStateSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:929:1: ( ruleRobotStateSent EOF )
            // InternalMyLanguage.g:930:1: ruleRobotStateSent EOF
            {
             before(grammarAccess.getRobotStateSentRule()); 
            pushFollow(FOLLOW_1);
            ruleRobotStateSent();

            state._fsp--;

             after(grammarAccess.getRobotStateSentRule()); 
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
    // $ANTLR end "entryRuleRobotStateSent"


    // $ANTLR start "ruleRobotStateSent"
    // InternalMyLanguage.g:937:1: ruleRobotStateSent : ( ( rule__RobotStateSent__Group__0 ) ) ;
    public final void ruleRobotStateSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:941:2: ( ( ( rule__RobotStateSent__Group__0 ) ) )
            // InternalMyLanguage.g:942:2: ( ( rule__RobotStateSent__Group__0 ) )
            {
            // InternalMyLanguage.g:942:2: ( ( rule__RobotStateSent__Group__0 ) )
            // InternalMyLanguage.g:943:3: ( rule__RobotStateSent__Group__0 )
            {
             before(grammarAccess.getRobotStateSentAccess().getGroup()); 
            // InternalMyLanguage.g:944:3: ( rule__RobotStateSent__Group__0 )
            // InternalMyLanguage.g:944:4: rule__RobotStateSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RobotStateSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotStateSentAccess().getGroup()); 

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
    // $ANTLR end "ruleRobotStateSent"


    // $ANTLR start "entryRuleRobotPositionSent"
    // InternalMyLanguage.g:953:1: entryRuleRobotPositionSent : ruleRobotPositionSent EOF ;
    public final void entryRuleRobotPositionSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:954:1: ( ruleRobotPositionSent EOF )
            // InternalMyLanguage.g:955:1: ruleRobotPositionSent EOF
            {
             before(grammarAccess.getRobotPositionSentRule()); 
            pushFollow(FOLLOW_1);
            ruleRobotPositionSent();

            state._fsp--;

             after(grammarAccess.getRobotPositionSentRule()); 
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
    // $ANTLR end "entryRuleRobotPositionSent"


    // $ANTLR start "ruleRobotPositionSent"
    // InternalMyLanguage.g:962:1: ruleRobotPositionSent : ( ( rule__RobotPositionSent__Group__0 ) ) ;
    public final void ruleRobotPositionSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:966:2: ( ( ( rule__RobotPositionSent__Group__0 ) ) )
            // InternalMyLanguage.g:967:2: ( ( rule__RobotPositionSent__Group__0 ) )
            {
            // InternalMyLanguage.g:967:2: ( ( rule__RobotPositionSent__Group__0 ) )
            // InternalMyLanguage.g:968:3: ( rule__RobotPositionSent__Group__0 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getGroup()); 
            // InternalMyLanguage.g:969:3: ( rule__RobotPositionSent__Group__0 )
            // InternalMyLanguage.g:969:4: rule__RobotPositionSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotPositionSentAccess().getGroup()); 

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
    // $ANTLR end "ruleRobotPositionSent"


    // $ANTLR start "entryRuleCirclePosition"
    // InternalMyLanguage.g:978:1: entryRuleCirclePosition : ruleCirclePosition EOF ;
    public final void entryRuleCirclePosition() throws RecognitionException {
        try {
            // InternalMyLanguage.g:979:1: ( ruleCirclePosition EOF )
            // InternalMyLanguage.g:980:1: ruleCirclePosition EOF
            {
             before(grammarAccess.getCirclePositionRule()); 
            pushFollow(FOLLOW_1);
            ruleCirclePosition();

            state._fsp--;

             after(grammarAccess.getCirclePositionRule()); 
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
    // $ANTLR end "entryRuleCirclePosition"


    // $ANTLR start "ruleCirclePosition"
    // InternalMyLanguage.g:987:1: ruleCirclePosition : ( ( rule__CirclePosition__Group__0 ) ) ;
    public final void ruleCirclePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:991:2: ( ( ( rule__CirclePosition__Group__0 ) ) )
            // InternalMyLanguage.g:992:2: ( ( rule__CirclePosition__Group__0 ) )
            {
            // InternalMyLanguage.g:992:2: ( ( rule__CirclePosition__Group__0 ) )
            // InternalMyLanguage.g:993:3: ( rule__CirclePosition__Group__0 )
            {
             before(grammarAccess.getCirclePositionAccess().getGroup()); 
            // InternalMyLanguage.g:994:3: ( rule__CirclePosition__Group__0 )
            // InternalMyLanguage.g:994:4: rule__CirclePosition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CirclePosition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCirclePositionAccess().getGroup()); 

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
    // $ANTLR end "ruleCirclePosition"


    // $ANTLR start "entryRuleSpherePosition"
    // InternalMyLanguage.g:1003:1: entryRuleSpherePosition : ruleSpherePosition EOF ;
    public final void entryRuleSpherePosition() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1004:1: ( ruleSpherePosition EOF )
            // InternalMyLanguage.g:1005:1: ruleSpherePosition EOF
            {
             before(grammarAccess.getSpherePositionRule()); 
            pushFollow(FOLLOW_1);
            ruleSpherePosition();

            state._fsp--;

             after(grammarAccess.getSpherePositionRule()); 
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
    // $ANTLR end "entryRuleSpherePosition"


    // $ANTLR start "ruleSpherePosition"
    // InternalMyLanguage.g:1012:1: ruleSpherePosition : ( ( rule__SpherePosition__Group__0 ) ) ;
    public final void ruleSpherePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1016:2: ( ( ( rule__SpherePosition__Group__0 ) ) )
            // InternalMyLanguage.g:1017:2: ( ( rule__SpherePosition__Group__0 ) )
            {
            // InternalMyLanguage.g:1017:2: ( ( rule__SpherePosition__Group__0 ) )
            // InternalMyLanguage.g:1018:3: ( rule__SpherePosition__Group__0 )
            {
             before(grammarAccess.getSpherePositionAccess().getGroup()); 
            // InternalMyLanguage.g:1019:3: ( rule__SpherePosition__Group__0 )
            // InternalMyLanguage.g:1019:4: rule__SpherePosition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpherePosition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpherePositionAccess().getGroup()); 

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
    // $ANTLR end "ruleSpherePosition"


    // $ANTLR start "entryRuleRobotSpeedSent"
    // InternalMyLanguage.g:1028:1: entryRuleRobotSpeedSent : ruleRobotSpeedSent EOF ;
    public final void entryRuleRobotSpeedSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1029:1: ( ruleRobotSpeedSent EOF )
            // InternalMyLanguage.g:1030:1: ruleRobotSpeedSent EOF
            {
             before(grammarAccess.getRobotSpeedSentRule()); 
            pushFollow(FOLLOW_1);
            ruleRobotSpeedSent();

            state._fsp--;

             after(grammarAccess.getRobotSpeedSentRule()); 
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
    // $ANTLR end "entryRuleRobotSpeedSent"


    // $ANTLR start "ruleRobotSpeedSent"
    // InternalMyLanguage.g:1037:1: ruleRobotSpeedSent : ( ( rule__RobotSpeedSent__Group__0 ) ) ;
    public final void ruleRobotSpeedSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1041:2: ( ( ( rule__RobotSpeedSent__Group__0 ) ) )
            // InternalMyLanguage.g:1042:2: ( ( rule__RobotSpeedSent__Group__0 ) )
            {
            // InternalMyLanguage.g:1042:2: ( ( rule__RobotSpeedSent__Group__0 ) )
            // InternalMyLanguage.g:1043:3: ( rule__RobotSpeedSent__Group__0 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getGroup()); 
            // InternalMyLanguage.g:1044:3: ( rule__RobotSpeedSent__Group__0 )
            // InternalMyLanguage.g:1044:4: rule__RobotSpeedSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RobotSpeedSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotSpeedSentAccess().getGroup()); 

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
    // $ANTLR end "ruleRobotSpeedSent"


    // $ANTLR start "entryRuleEnvironmentSent"
    // InternalMyLanguage.g:1053:1: entryRuleEnvironmentSent : ruleEnvironmentSent EOF ;
    public final void entryRuleEnvironmentSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1054:1: ( ruleEnvironmentSent EOF )
            // InternalMyLanguage.g:1055:1: ruleEnvironmentSent EOF
            {
             before(grammarAccess.getEnvironmentSentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentSent();

            state._fsp--;

             after(grammarAccess.getEnvironmentSentRule()); 
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
    // $ANTLR end "entryRuleEnvironmentSent"


    // $ANTLR start "ruleEnvironmentSent"
    // InternalMyLanguage.g:1062:1: ruleEnvironmentSent : ( ( rule__EnvironmentSent__Group__0 ) ) ;
    public final void ruleEnvironmentSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1066:2: ( ( ( rule__EnvironmentSent__Group__0 ) ) )
            // InternalMyLanguage.g:1067:2: ( ( rule__EnvironmentSent__Group__0 ) )
            {
            // InternalMyLanguage.g:1067:2: ( ( rule__EnvironmentSent__Group__0 ) )
            // InternalMyLanguage.g:1068:3: ( rule__EnvironmentSent__Group__0 )
            {
             before(grammarAccess.getEnvironmentSentAccess().getGroup()); 
            // InternalMyLanguage.g:1069:3: ( rule__EnvironmentSent__Group__0 )
            // InternalMyLanguage.g:1069:4: rule__EnvironmentSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentSentAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironmentSent"


    // $ANTLR start "entryRuleRiskSent"
    // InternalMyLanguage.g:1078:1: entryRuleRiskSent : ruleRiskSent EOF ;
    public final void entryRuleRiskSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1079:1: ( ruleRiskSent EOF )
            // InternalMyLanguage.g:1080:1: ruleRiskSent EOF
            {
             before(grammarAccess.getRiskSentRule()); 
            pushFollow(FOLLOW_1);
            ruleRiskSent();

            state._fsp--;

             after(grammarAccess.getRiskSentRule()); 
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
    // $ANTLR end "entryRuleRiskSent"


    // $ANTLR start "ruleRiskSent"
    // InternalMyLanguage.g:1087:1: ruleRiskSent : ( ( rule__RiskSent__Group__0 ) ) ;
    public final void ruleRiskSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1091:2: ( ( ( rule__RiskSent__Group__0 ) ) )
            // InternalMyLanguage.g:1092:2: ( ( rule__RiskSent__Group__0 ) )
            {
            // InternalMyLanguage.g:1092:2: ( ( rule__RiskSent__Group__0 ) )
            // InternalMyLanguage.g:1093:3: ( rule__RiskSent__Group__0 )
            {
             before(grammarAccess.getRiskSentAccess().getGroup()); 
            // InternalMyLanguage.g:1094:3: ( rule__RiskSent__Group__0 )
            // InternalMyLanguage.g:1094:4: rule__RiskSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RiskSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRiskSentAccess().getGroup()); 

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
    // $ANTLR end "ruleRiskSent"


    // $ANTLR start "entryRuleToleranceSent"
    // InternalMyLanguage.g:1103:1: entryRuleToleranceSent : ruleToleranceSent EOF ;
    public final void entryRuleToleranceSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1104:1: ( ruleToleranceSent EOF )
            // InternalMyLanguage.g:1105:1: ruleToleranceSent EOF
            {
             before(grammarAccess.getToleranceSentRule()); 
            pushFollow(FOLLOW_1);
            ruleToleranceSent();

            state._fsp--;

             after(grammarAccess.getToleranceSentRule()); 
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
    // $ANTLR end "entryRuleToleranceSent"


    // $ANTLR start "ruleToleranceSent"
    // InternalMyLanguage.g:1112:1: ruleToleranceSent : ( ( rule__ToleranceSent__Group__0 ) ) ;
    public final void ruleToleranceSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1116:2: ( ( ( rule__ToleranceSent__Group__0 ) ) )
            // InternalMyLanguage.g:1117:2: ( ( rule__ToleranceSent__Group__0 ) )
            {
            // InternalMyLanguage.g:1117:2: ( ( rule__ToleranceSent__Group__0 ) )
            // InternalMyLanguage.g:1118:3: ( rule__ToleranceSent__Group__0 )
            {
             before(grammarAccess.getToleranceSentAccess().getGroup()); 
            // InternalMyLanguage.g:1119:3: ( rule__ToleranceSent__Group__0 )
            // InternalMyLanguage.g:1119:4: rule__ToleranceSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ToleranceSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToleranceSentAccess().getGroup()); 

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
    // $ANTLR end "ruleToleranceSent"


    // $ANTLR start "entryRuleMISSIONSTATUS"
    // InternalMyLanguage.g:1128:1: entryRuleMISSIONSTATUS : ruleMISSIONSTATUS EOF ;
    public final void entryRuleMISSIONSTATUS() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1129:1: ( ruleMISSIONSTATUS EOF )
            // InternalMyLanguage.g:1130:1: ruleMISSIONSTATUS EOF
            {
             before(grammarAccess.getMISSIONSTATUSRule()); 
            pushFollow(FOLLOW_1);
            ruleMISSIONSTATUS();

            state._fsp--;

             after(grammarAccess.getMISSIONSTATUSRule()); 
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
    // $ANTLR end "entryRuleMISSIONSTATUS"


    // $ANTLR start "ruleMISSIONSTATUS"
    // InternalMyLanguage.g:1137:1: ruleMISSIONSTATUS : ( ( rule__MISSIONSTATUS__Alternatives ) ) ;
    public final void ruleMISSIONSTATUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1141:2: ( ( ( rule__MISSIONSTATUS__Alternatives ) ) )
            // InternalMyLanguage.g:1142:2: ( ( rule__MISSIONSTATUS__Alternatives ) )
            {
            // InternalMyLanguage.g:1142:2: ( ( rule__MISSIONSTATUS__Alternatives ) )
            // InternalMyLanguage.g:1143:3: ( rule__MISSIONSTATUS__Alternatives )
            {
             before(grammarAccess.getMISSIONSTATUSAccess().getAlternatives()); 
            // InternalMyLanguage.g:1144:3: ( rule__MISSIONSTATUS__Alternatives )
            // InternalMyLanguage.g:1144:4: rule__MISSIONSTATUS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MISSIONSTATUS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMISSIONSTATUSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMISSIONSTATUS"


    // $ANTLR start "entryRuleMISSIONRISKLEVEL"
    // InternalMyLanguage.g:1153:1: entryRuleMISSIONRISKLEVEL : ruleMISSIONRISKLEVEL EOF ;
    public final void entryRuleMISSIONRISKLEVEL() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1154:1: ( ruleMISSIONRISKLEVEL EOF )
            // InternalMyLanguage.g:1155:1: ruleMISSIONRISKLEVEL EOF
            {
             before(grammarAccess.getMISSIONRISKLEVELRule()); 
            pushFollow(FOLLOW_1);
            ruleMISSIONRISKLEVEL();

            state._fsp--;

             after(grammarAccess.getMISSIONRISKLEVELRule()); 
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
    // $ANTLR end "entryRuleMISSIONRISKLEVEL"


    // $ANTLR start "ruleMISSIONRISKLEVEL"
    // InternalMyLanguage.g:1162:1: ruleMISSIONRISKLEVEL : ( ( rule__MISSIONRISKLEVEL__Alternatives ) ) ;
    public final void ruleMISSIONRISKLEVEL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1166:2: ( ( ( rule__MISSIONRISKLEVEL__Alternatives ) ) )
            // InternalMyLanguage.g:1167:2: ( ( rule__MISSIONRISKLEVEL__Alternatives ) )
            {
            // InternalMyLanguage.g:1167:2: ( ( rule__MISSIONRISKLEVEL__Alternatives ) )
            // InternalMyLanguage.g:1168:3: ( rule__MISSIONRISKLEVEL__Alternatives )
            {
             before(grammarAccess.getMISSIONRISKLEVELAccess().getAlternatives()); 
            // InternalMyLanguage.g:1169:3: ( rule__MISSIONRISKLEVEL__Alternatives )
            // InternalMyLanguage.g:1169:4: rule__MISSIONRISKLEVEL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MISSIONRISKLEVEL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMISSIONRISKLEVELAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMISSIONRISKLEVEL"


    // $ANTLR start "entryRuleCOLLISIONRISKLEVEL"
    // InternalMyLanguage.g:1178:1: entryRuleCOLLISIONRISKLEVEL : ruleCOLLISIONRISKLEVEL EOF ;
    public final void entryRuleCOLLISIONRISKLEVEL() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1179:1: ( ruleCOLLISIONRISKLEVEL EOF )
            // InternalMyLanguage.g:1180:1: ruleCOLLISIONRISKLEVEL EOF
            {
             before(grammarAccess.getCOLLISIONRISKLEVELRule()); 
            pushFollow(FOLLOW_1);
            ruleCOLLISIONRISKLEVEL();

            state._fsp--;

             after(grammarAccess.getCOLLISIONRISKLEVELRule()); 
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
    // $ANTLR end "entryRuleCOLLISIONRISKLEVEL"


    // $ANTLR start "ruleCOLLISIONRISKLEVEL"
    // InternalMyLanguage.g:1187:1: ruleCOLLISIONRISKLEVEL : ( ( rule__COLLISIONRISKLEVEL__Alternatives ) ) ;
    public final void ruleCOLLISIONRISKLEVEL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1191:2: ( ( ( rule__COLLISIONRISKLEVEL__Alternatives ) ) )
            // InternalMyLanguage.g:1192:2: ( ( rule__COLLISIONRISKLEVEL__Alternatives ) )
            {
            // InternalMyLanguage.g:1192:2: ( ( rule__COLLISIONRISKLEVEL__Alternatives ) )
            // InternalMyLanguage.g:1193:3: ( rule__COLLISIONRISKLEVEL__Alternatives )
            {
             before(grammarAccess.getCOLLISIONRISKLEVELAccess().getAlternatives()); 
            // InternalMyLanguage.g:1194:3: ( rule__COLLISIONRISKLEVEL__Alternatives )
            // InternalMyLanguage.g:1194:4: rule__COLLISIONRISKLEVEL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__COLLISIONRISKLEVEL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOLLISIONRISKLEVELAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCOLLISIONRISKLEVEL"


    // $ANTLR start "entryRuleCOMPSTATUS"
    // InternalMyLanguage.g:1203:1: entryRuleCOMPSTATUS : ruleCOMPSTATUS EOF ;
    public final void entryRuleCOMPSTATUS() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1204:1: ( ruleCOMPSTATUS EOF )
            // InternalMyLanguage.g:1205:1: ruleCOMPSTATUS EOF
            {
             before(grammarAccess.getCOMPSTATUSRule()); 
            pushFollow(FOLLOW_1);
            ruleCOMPSTATUS();

            state._fsp--;

             after(grammarAccess.getCOMPSTATUSRule()); 
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
    // $ANTLR end "entryRuleCOMPSTATUS"


    // $ANTLR start "ruleCOMPSTATUS"
    // InternalMyLanguage.g:1212:1: ruleCOMPSTATUS : ( ( rule__COMPSTATUS__Alternatives ) ) ;
    public final void ruleCOMPSTATUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1216:2: ( ( ( rule__COMPSTATUS__Alternatives ) ) )
            // InternalMyLanguage.g:1217:2: ( ( rule__COMPSTATUS__Alternatives ) )
            {
            // InternalMyLanguage.g:1217:2: ( ( rule__COMPSTATUS__Alternatives ) )
            // InternalMyLanguage.g:1218:3: ( rule__COMPSTATUS__Alternatives )
            {
             before(grammarAccess.getCOMPSTATUSAccess().getAlternatives()); 
            // InternalMyLanguage.g:1219:3: ( rule__COMPSTATUS__Alternatives )
            // InternalMyLanguage.g:1219:4: rule__COMPSTATUS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__COMPSTATUS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOMPSTATUSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCOMPSTATUS"


    // $ANTLR start "entryRuleDistanceUnit"
    // InternalMyLanguage.g:1228:1: entryRuleDistanceUnit : ruleDistanceUnit EOF ;
    public final void entryRuleDistanceUnit() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1229:1: ( ruleDistanceUnit EOF )
            // InternalMyLanguage.g:1230:1: ruleDistanceUnit EOF
            {
             before(grammarAccess.getDistanceUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getDistanceUnitRule()); 
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
    // $ANTLR end "entryRuleDistanceUnit"


    // $ANTLR start "ruleDistanceUnit"
    // InternalMyLanguage.g:1237:1: ruleDistanceUnit : ( ( rule__DistanceUnit__Alternatives ) ) ;
    public final void ruleDistanceUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1241:2: ( ( ( rule__DistanceUnit__Alternatives ) ) )
            // InternalMyLanguage.g:1242:2: ( ( rule__DistanceUnit__Alternatives ) )
            {
            // InternalMyLanguage.g:1242:2: ( ( rule__DistanceUnit__Alternatives ) )
            // InternalMyLanguage.g:1243:3: ( rule__DistanceUnit__Alternatives )
            {
             before(grammarAccess.getDistanceUnitAccess().getAlternatives()); 
            // InternalMyLanguage.g:1244:3: ( rule__DistanceUnit__Alternatives )
            // InternalMyLanguage.g:1244:4: rule__DistanceUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DistanceUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDistanceUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDistanceUnit"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalMyLanguage.g:1253:1: entryRuleTimeUnit : ruleTimeUnit EOF ;
    public final void entryRuleTimeUnit() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1254:1: ( ruleTimeUnit EOF )
            // InternalMyLanguage.g:1255:1: ruleTimeUnit EOF
            {
             before(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeUnitRule()); 
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
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalMyLanguage.g:1262:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1266:2: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalMyLanguage.g:1267:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalMyLanguage.g:1267:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalMyLanguage.g:1268:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalMyLanguage.g:1269:3: ( rule__TimeUnit__Alternatives )
            // InternalMyLanguage.g:1269:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleSECONDS"
    // InternalMyLanguage.g:1278:1: entryRuleSECONDS : ruleSECONDS EOF ;
    public final void entryRuleSECONDS() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1279:1: ( ruleSECONDS EOF )
            // InternalMyLanguage.g:1280:1: ruleSECONDS EOF
            {
             before(grammarAccess.getSECONDSRule()); 
            pushFollow(FOLLOW_1);
            ruleSECONDS();

            state._fsp--;

             after(grammarAccess.getSECONDSRule()); 
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
    // $ANTLR end "entryRuleSECONDS"


    // $ANTLR start "ruleSECONDS"
    // InternalMyLanguage.g:1287:1: ruleSECONDS : ( ( rule__SECONDS__Group__0 ) ) ;
    public final void ruleSECONDS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1291:2: ( ( ( rule__SECONDS__Group__0 ) ) )
            // InternalMyLanguage.g:1292:2: ( ( rule__SECONDS__Group__0 ) )
            {
            // InternalMyLanguage.g:1292:2: ( ( rule__SECONDS__Group__0 ) )
            // InternalMyLanguage.g:1293:3: ( rule__SECONDS__Group__0 )
            {
             before(grammarAccess.getSECONDSAccess().getGroup()); 
            // InternalMyLanguage.g:1294:3: ( rule__SECONDS__Group__0 )
            // InternalMyLanguage.g:1294:4: rule__SECONDS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SECONDS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSECONDSAccess().getGroup()); 

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
    // $ANTLR end "ruleSECONDS"


    // $ANTLR start "entryRuleHOUR"
    // InternalMyLanguage.g:1303:1: entryRuleHOUR : ruleHOUR EOF ;
    public final void entryRuleHOUR() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1304:1: ( ruleHOUR EOF )
            // InternalMyLanguage.g:1305:1: ruleHOUR EOF
            {
             before(grammarAccess.getHOURRule()); 
            pushFollow(FOLLOW_1);
            ruleHOUR();

            state._fsp--;

             after(grammarAccess.getHOURRule()); 
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
    // $ANTLR end "entryRuleHOUR"


    // $ANTLR start "ruleHOUR"
    // InternalMyLanguage.g:1312:1: ruleHOUR : ( ( rule__HOUR__Group__0 ) ) ;
    public final void ruleHOUR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1316:2: ( ( ( rule__HOUR__Group__0 ) ) )
            // InternalMyLanguage.g:1317:2: ( ( rule__HOUR__Group__0 ) )
            {
            // InternalMyLanguage.g:1317:2: ( ( rule__HOUR__Group__0 ) )
            // InternalMyLanguage.g:1318:3: ( rule__HOUR__Group__0 )
            {
             before(grammarAccess.getHOURAccess().getGroup()); 
            // InternalMyLanguage.g:1319:3: ( rule__HOUR__Group__0 )
            // InternalMyLanguage.g:1319:4: rule__HOUR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HOUR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHOURAccess().getGroup()); 

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
    // $ANTLR end "ruleHOUR"


    // $ANTLR start "entryRuleMINUTES"
    // InternalMyLanguage.g:1328:1: entryRuleMINUTES : ruleMINUTES EOF ;
    public final void entryRuleMINUTES() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1329:1: ( ruleMINUTES EOF )
            // InternalMyLanguage.g:1330:1: ruleMINUTES EOF
            {
             before(grammarAccess.getMINUTESRule()); 
            pushFollow(FOLLOW_1);
            ruleMINUTES();

            state._fsp--;

             after(grammarAccess.getMINUTESRule()); 
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
    // $ANTLR end "entryRuleMINUTES"


    // $ANTLR start "ruleMINUTES"
    // InternalMyLanguage.g:1337:1: ruleMINUTES : ( ( rule__MINUTES__Group__0 ) ) ;
    public final void ruleMINUTES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1341:2: ( ( ( rule__MINUTES__Group__0 ) ) )
            // InternalMyLanguage.g:1342:2: ( ( rule__MINUTES__Group__0 ) )
            {
            // InternalMyLanguage.g:1342:2: ( ( rule__MINUTES__Group__0 ) )
            // InternalMyLanguage.g:1343:3: ( rule__MINUTES__Group__0 )
            {
             before(grammarAccess.getMINUTESAccess().getGroup()); 
            // InternalMyLanguage.g:1344:3: ( rule__MINUTES__Group__0 )
            // InternalMyLanguage.g:1344:4: rule__MINUTES__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MINUTES__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMINUTESAccess().getGroup()); 

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
    // $ANTLR end "ruleMINUTES"


    // $ANTLR start "entryRuleMETER"
    // InternalMyLanguage.g:1353:1: entryRuleMETER : ruleMETER EOF ;
    public final void entryRuleMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1354:1: ( ruleMETER EOF )
            // InternalMyLanguage.g:1355:1: ruleMETER EOF
            {
             before(grammarAccess.getMETERRule()); 
            pushFollow(FOLLOW_1);
            ruleMETER();

            state._fsp--;

             after(grammarAccess.getMETERRule()); 
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
    // $ANTLR end "entryRuleMETER"


    // $ANTLR start "ruleMETER"
    // InternalMyLanguage.g:1362:1: ruleMETER : ( ( rule__METER__Group__0 ) ) ;
    public final void ruleMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1366:2: ( ( ( rule__METER__Group__0 ) ) )
            // InternalMyLanguage.g:1367:2: ( ( rule__METER__Group__0 ) )
            {
            // InternalMyLanguage.g:1367:2: ( ( rule__METER__Group__0 ) )
            // InternalMyLanguage.g:1368:3: ( rule__METER__Group__0 )
            {
             before(grammarAccess.getMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1369:3: ( rule__METER__Group__0 )
            // InternalMyLanguage.g:1369:4: rule__METER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__METER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMETERAccess().getGroup()); 

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
    // $ANTLR end "ruleMETER"


    // $ANTLR start "entryRuleCENTIMETER"
    // InternalMyLanguage.g:1378:1: entryRuleCENTIMETER : ruleCENTIMETER EOF ;
    public final void entryRuleCENTIMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1379:1: ( ruleCENTIMETER EOF )
            // InternalMyLanguage.g:1380:1: ruleCENTIMETER EOF
            {
             before(grammarAccess.getCENTIMETERRule()); 
            pushFollow(FOLLOW_1);
            ruleCENTIMETER();

            state._fsp--;

             after(grammarAccess.getCENTIMETERRule()); 
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
    // $ANTLR end "entryRuleCENTIMETER"


    // $ANTLR start "ruleCENTIMETER"
    // InternalMyLanguage.g:1387:1: ruleCENTIMETER : ( ( rule__CENTIMETER__Group__0 ) ) ;
    public final void ruleCENTIMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1391:2: ( ( ( rule__CENTIMETER__Group__0 ) ) )
            // InternalMyLanguage.g:1392:2: ( ( rule__CENTIMETER__Group__0 ) )
            {
            // InternalMyLanguage.g:1392:2: ( ( rule__CENTIMETER__Group__0 ) )
            // InternalMyLanguage.g:1393:3: ( rule__CENTIMETER__Group__0 )
            {
             before(grammarAccess.getCENTIMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1394:3: ( rule__CENTIMETER__Group__0 )
            // InternalMyLanguage.g:1394:4: rule__CENTIMETER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CENTIMETER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCENTIMETERAccess().getGroup()); 

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
    // $ANTLR end "ruleCENTIMETER"


    // $ANTLR start "entryRuleMILLIMETER"
    // InternalMyLanguage.g:1403:1: entryRuleMILLIMETER : ruleMILLIMETER EOF ;
    public final void entryRuleMILLIMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1404:1: ( ruleMILLIMETER EOF )
            // InternalMyLanguage.g:1405:1: ruleMILLIMETER EOF
            {
             before(grammarAccess.getMILLIMETERRule()); 
            pushFollow(FOLLOW_1);
            ruleMILLIMETER();

            state._fsp--;

             after(grammarAccess.getMILLIMETERRule()); 
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
    // $ANTLR end "entryRuleMILLIMETER"


    // $ANTLR start "ruleMILLIMETER"
    // InternalMyLanguage.g:1412:1: ruleMILLIMETER : ( ( rule__MILLIMETER__Group__0 ) ) ;
    public final void ruleMILLIMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1416:2: ( ( ( rule__MILLIMETER__Group__0 ) ) )
            // InternalMyLanguage.g:1417:2: ( ( rule__MILLIMETER__Group__0 ) )
            {
            // InternalMyLanguage.g:1417:2: ( ( rule__MILLIMETER__Group__0 ) )
            // InternalMyLanguage.g:1418:3: ( rule__MILLIMETER__Group__0 )
            {
             before(grammarAccess.getMILLIMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1419:3: ( rule__MILLIMETER__Group__0 )
            // InternalMyLanguage.g:1419:4: rule__MILLIMETER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MILLIMETER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMILLIMETERAccess().getGroup()); 

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
    // $ANTLR end "ruleMILLIMETER"


    // $ANTLR start "entryRuleKILOMETER"
    // InternalMyLanguage.g:1428:1: entryRuleKILOMETER : ruleKILOMETER EOF ;
    public final void entryRuleKILOMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1429:1: ( ruleKILOMETER EOF )
            // InternalMyLanguage.g:1430:1: ruleKILOMETER EOF
            {
             before(grammarAccess.getKILOMETERRule()); 
            pushFollow(FOLLOW_1);
            ruleKILOMETER();

            state._fsp--;

             after(grammarAccess.getKILOMETERRule()); 
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
    // $ANTLR end "entryRuleKILOMETER"


    // $ANTLR start "ruleKILOMETER"
    // InternalMyLanguage.g:1437:1: ruleKILOMETER : ( ( rule__KILOMETER__Group__0 ) ) ;
    public final void ruleKILOMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1441:2: ( ( ( rule__KILOMETER__Group__0 ) ) )
            // InternalMyLanguage.g:1442:2: ( ( rule__KILOMETER__Group__0 ) )
            {
            // InternalMyLanguage.g:1442:2: ( ( rule__KILOMETER__Group__0 ) )
            // InternalMyLanguage.g:1443:3: ( rule__KILOMETER__Group__0 )
            {
             before(grammarAccess.getKILOMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1444:3: ( rule__KILOMETER__Group__0 )
            // InternalMyLanguage.g:1444:4: rule__KILOMETER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KILOMETER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKILOMETERAccess().getGroup()); 

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
    // $ANTLR end "ruleKILOMETER"


    // $ANTLR start "entryRulePercentUnit"
    // InternalMyLanguage.g:1453:1: entryRulePercentUnit : rulePercentUnit EOF ;
    public final void entryRulePercentUnit() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1454:1: ( rulePercentUnit EOF )
            // InternalMyLanguage.g:1455:1: rulePercentUnit EOF
            {
             before(grammarAccess.getPercentUnitRule()); 
            pushFollow(FOLLOW_1);
            rulePercentUnit();

            state._fsp--;

             after(grammarAccess.getPercentUnitRule()); 
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
    // $ANTLR end "entryRulePercentUnit"


    // $ANTLR start "rulePercentUnit"
    // InternalMyLanguage.g:1462:1: rulePercentUnit : ( ( rule__PercentUnit__Group__0 ) ) ;
    public final void rulePercentUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1466:2: ( ( ( rule__PercentUnit__Group__0 ) ) )
            // InternalMyLanguage.g:1467:2: ( ( rule__PercentUnit__Group__0 ) )
            {
            // InternalMyLanguage.g:1467:2: ( ( rule__PercentUnit__Group__0 ) )
            // InternalMyLanguage.g:1468:3: ( rule__PercentUnit__Group__0 )
            {
             before(grammarAccess.getPercentUnitAccess().getGroup()); 
            // InternalMyLanguage.g:1469:3: ( rule__PercentUnit__Group__0 )
            // InternalMyLanguage.g:1469:4: rule__PercentUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PercentUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPercentUnitAccess().getGroup()); 

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
    // $ANTLR end "rulePercentUnit"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalMyLanguage.g:1478:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1479:1: ( ruleDOUBLE EOF )
            // InternalMyLanguage.g:1480:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalMyLanguage.g:1487:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1491:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalMyLanguage.g:1492:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalMyLanguage.g:1492:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalMyLanguage.g:1493:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalMyLanguage.g:1494:3: ( rule__DOUBLE__Group__0 )
            // InternalMyLanguage.g:1494:4: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulePositiveDouble"
    // InternalMyLanguage.g:1503:1: entryRulePositiveDouble : rulePositiveDouble EOF ;
    public final void entryRulePositiveDouble() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1504:1: ( rulePositiveDouble EOF )
            // InternalMyLanguage.g:1505:1: rulePositiveDouble EOF
            {
             before(grammarAccess.getPositiveDoubleRule()); 
            pushFollow(FOLLOW_1);
            rulePositiveDouble();

            state._fsp--;

             after(grammarAccess.getPositiveDoubleRule()); 
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
    // $ANTLR end "entryRulePositiveDouble"


    // $ANTLR start "rulePositiveDouble"
    // InternalMyLanguage.g:1512:1: rulePositiveDouble : ( ( rule__PositiveDouble__Group__0 ) ) ;
    public final void rulePositiveDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1516:2: ( ( ( rule__PositiveDouble__Group__0 ) ) )
            // InternalMyLanguage.g:1517:2: ( ( rule__PositiveDouble__Group__0 ) )
            {
            // InternalMyLanguage.g:1517:2: ( ( rule__PositiveDouble__Group__0 ) )
            // InternalMyLanguage.g:1518:3: ( rule__PositiveDouble__Group__0 )
            {
             before(grammarAccess.getPositiveDoubleAccess().getGroup()); 
            // InternalMyLanguage.g:1519:3: ( rule__PositiveDouble__Group__0 )
            // InternalMyLanguage.g:1519:4: rule__PositiveDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PositiveDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositiveDoubleAccess().getGroup()); 

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
    // $ANTLR end "rulePositiveDouble"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyLanguage.g:1527:1: rule__Statement__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1531:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 25:
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
                    // InternalMyLanguage.g:1532:2: ( ruleGiven )
                    {
                    // InternalMyLanguage.g:1532:2: ( ruleGiven )
                    // InternalMyLanguage.g:1533:3: ruleGiven
                    {
                     before(grammarAccess.getStatementAccess().getGivenParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGiven();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGivenParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1538:2: ( ruleWhen )
                    {
                    // InternalMyLanguage.g:1538:2: ( ruleWhen )
                    // InternalMyLanguage.g:1539:3: ruleWhen
                    {
                     before(grammarAccess.getStatementAccess().getWhenParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWhen();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhenParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1544:2: ( ruleThen )
                    {
                    // InternalMyLanguage.g:1544:2: ( ruleThen )
                    // InternalMyLanguage.g:1545:3: ruleThen
                    {
                     before(grammarAccess.getStatementAccess().getThenParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleThen();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getThenParserRuleCall_2()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__StatementBody__Alternatives"
    // InternalMyLanguage.g:1554:1: rule__StatementBody__Alternatives : ( ( ruleRobot ) | ( ruleEnvironmentSent ) | ( ruleTimeSent ) | ( rulePeopleSent ) | ( ruleMissionSent ) | ( ruleNotificationSent ) | ( ruleBatterySent ) | ( ruleSonarSent ) | ( ruleBaroSent ) | ( ruleGPSSent ) );
    public final void rule__StatementBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1558:1: ( ( ruleRobot ) | ( ruleEnvironmentSent ) | ( ruleTimeSent ) | ( rulePeopleSent ) | ( ruleMissionSent ) | ( ruleNotificationSent ) | ( ruleBatterySent ) | ( ruleSonarSent ) | ( ruleBaroSent ) | ( ruleGPSSent ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt3=1;
                }
                break;
            case 67:
                {
                alt3=2;
                }
                break;
            case 36:
                {
                alt3=3;
                }
                break;
            case 44:
                {
                alt3=4;
                }
                break;
            case 47:
                {
                alt3=5;
                }
                break;
            case 82:
                {
                alt3=6;
                }
                break;
            case 42:
                {
                alt3=7;
                }
                break;
            case 33:
                {
                alt3=8;
                }
                break;
            case 31:
                {
                alt3=9;
                }
                break;
            case 29:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyLanguage.g:1559:2: ( ruleRobot )
                    {
                    // InternalMyLanguage.g:1559:2: ( ruleRobot )
                    // InternalMyLanguage.g:1560:3: ruleRobot
                    {
                     before(grammarAccess.getStatementBodyAccess().getRobotParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRobot();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getRobotParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1565:2: ( ruleEnvironmentSent )
                    {
                    // InternalMyLanguage.g:1565:2: ( ruleEnvironmentSent )
                    // InternalMyLanguage.g:1566:3: ruleEnvironmentSent
                    {
                     before(grammarAccess.getStatementBodyAccess().getEnvironmentSentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnvironmentSent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getEnvironmentSentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1571:2: ( ruleTimeSent )
                    {
                    // InternalMyLanguage.g:1571:2: ( ruleTimeSent )
                    // InternalMyLanguage.g:1572:3: ruleTimeSent
                    {
                     before(grammarAccess.getStatementBodyAccess().getTimeSentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeSent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getTimeSentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:1577:2: ( rulePeopleSent )
                    {
                    // InternalMyLanguage.g:1577:2: ( rulePeopleSent )
                    // InternalMyLanguage.g:1578:3: rulePeopleSent
                    {
                     before(grammarAccess.getStatementBodyAccess().getPeopleSentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePeopleSent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getPeopleSentParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyLanguage.g:1583:2: ( ruleMissionSent )
                    {
                    // InternalMyLanguage.g:1583:2: ( ruleMissionSent )
                    // InternalMyLanguage.g:1584:3: ruleMissionSent
                    {
                     before(grammarAccess.getStatementBodyAccess().getMissionSentParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMissionSent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getMissionSentParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyLanguage.g:1589:2: ( ruleNotificationSent )
                    {
                    // InternalMyLanguage.g:1589:2: ( ruleNotificationSent )
                    // InternalMyLanguage.g:1590:3: ruleNotificationSent
                    {
                     before(grammarAccess.getStatementBodyAccess().getNotificationSentParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNotificationSent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getNotificationSentParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyLanguage.g:1595:2: ( ruleBatterySent )
                    {
                    // InternalMyLanguage.g:1595:2: ( ruleBatterySent )
                    // InternalMyLanguage.g:1596:3: ruleBatterySent
                    {
                     before(grammarAccess.getStatementBodyAccess().getBatterySentParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleBatterySent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getBatterySentParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyLanguage.g:1601:2: ( ruleSonarSent )
                    {
                    // InternalMyLanguage.g:1601:2: ( ruleSonarSent )
                    // InternalMyLanguage.g:1602:3: ruleSonarSent
                    {
                     before(grammarAccess.getStatementBodyAccess().getSonarSentParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSonarSent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getSonarSentParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyLanguage.g:1607:2: ( ruleBaroSent )
                    {
                    // InternalMyLanguage.g:1607:2: ( ruleBaroSent )
                    // InternalMyLanguage.g:1608:3: ruleBaroSent
                    {
                     before(grammarAccess.getStatementBodyAccess().getBaroSentParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleBaroSent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getBaroSentParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyLanguage.g:1613:2: ( ruleGPSSent )
                    {
                    // InternalMyLanguage.g:1613:2: ( ruleGPSSent )
                    // InternalMyLanguage.g:1614:3: ruleGPSSent
                    {
                     before(grammarAccess.getStatementBodyAccess().getGPSSentParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleGPSSent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getGPSSentParserRuleCall_9()); 

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
    // $ANTLR end "rule__StatementBody__Alternatives"


    // $ANTLR start "rule__GPSSent__SentAlternatives_1_0"
    // InternalMyLanguage.g:1623:1: rule__GPSSent__SentAlternatives_1_0 : ( ( ruleGPSReadingSent ) | ( ruleCompStatusSent ) );
    public final void rule__GPSSent__SentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1627:1: ( ( ruleGPSReadingSent ) | ( ruleCompStatusSent ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyLanguage.g:1628:2: ( ruleGPSReadingSent )
                    {
                    // InternalMyLanguage.g:1628:2: ( ruleGPSReadingSent )
                    // InternalMyLanguage.g:1629:3: ruleGPSReadingSent
                    {
                     before(grammarAccess.getGPSSentAccess().getSentGPSReadingSentParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGPSReadingSent();

                    state._fsp--;

                     after(grammarAccess.getGPSSentAccess().getSentGPSReadingSentParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1634:2: ( ruleCompStatusSent )
                    {
                    // InternalMyLanguage.g:1634:2: ( ruleCompStatusSent )
                    // InternalMyLanguage.g:1635:3: ruleCompStatusSent
                    {
                     before(grammarAccess.getGPSSentAccess().getSentCompStatusSentParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompStatusSent();

                    state._fsp--;

                     after(grammarAccess.getGPSSentAccess().getSentCompStatusSentParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__GPSSent__SentAlternatives_1_0"


    // $ANTLR start "rule__GPSReadingSent__ToleranceAlternatives_5_0"
    // InternalMyLanguage.g:1644:1: rule__GPSReadingSent__ToleranceAlternatives_5_0 : ( ( ruleCirclePosition ) | ( ruleSpherePosition ) );
    public final void rule__GPSReadingSent__ToleranceAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1648:1: ( ( ruleCirclePosition ) | ( ruleSpherePosition ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==61) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==62) ) {
                    alt5=1;
                }
                else if ( (LA5_1==65) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyLanguage.g:1649:2: ( ruleCirclePosition )
                    {
                    // InternalMyLanguage.g:1649:2: ( ruleCirclePosition )
                    // InternalMyLanguage.g:1650:3: ruleCirclePosition
                    {
                     before(grammarAccess.getGPSReadingSentAccess().getToleranceCirclePositionParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCirclePosition();

                    state._fsp--;

                     after(grammarAccess.getGPSReadingSentAccess().getToleranceCirclePositionParserRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1655:2: ( ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:1655:2: ( ruleSpherePosition )
                    // InternalMyLanguage.g:1656:3: ruleSpherePosition
                    {
                     before(grammarAccess.getGPSReadingSentAccess().getToleranceSpherePositionParserRuleCall_5_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpherePosition();

                    state._fsp--;

                     after(grammarAccess.getGPSReadingSentAccess().getToleranceSpherePositionParserRuleCall_5_0_1()); 

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
    // $ANTLR end "rule__GPSReadingSent__ToleranceAlternatives_5_0"


    // $ANTLR start "rule__BaroSent__SentAlternatives_1_0"
    // InternalMyLanguage.g:1665:1: rule__BaroSent__SentAlternatives_1_0 : ( ( ruleBaroAltSent ) | ( ruleCompStatusSent ) );
    public final void rule__BaroSent__SentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1669:1: ( ( ruleBaroAltSent ) | ( ruleCompStatusSent ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyLanguage.g:1670:2: ( ruleBaroAltSent )
                    {
                    // InternalMyLanguage.g:1670:2: ( ruleBaroAltSent )
                    // InternalMyLanguage.g:1671:3: ruleBaroAltSent
                    {
                     before(grammarAccess.getBaroSentAccess().getSentBaroAltSentParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBaroAltSent();

                    state._fsp--;

                     after(grammarAccess.getBaroSentAccess().getSentBaroAltSentParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1676:2: ( ruleCompStatusSent )
                    {
                    // InternalMyLanguage.g:1676:2: ( ruleCompStatusSent )
                    // InternalMyLanguage.g:1677:3: ruleCompStatusSent
                    {
                     before(grammarAccess.getBaroSentAccess().getSentCompStatusSentParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompStatusSent();

                    state._fsp--;

                     after(grammarAccess.getBaroSentAccess().getSentCompStatusSentParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__BaroSent__SentAlternatives_1_0"


    // $ANTLR start "rule__BaroAltSent__SentAlternatives_2_0"
    // InternalMyLanguage.g:1686:1: rule__BaroAltSent__SentAlternatives_2_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__BaroAltSent__SentAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1690:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt7=1;
                }
                break;
            case 57:
                {
                alt7=2;
                }
                break;
            case 56:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyLanguage.g:1691:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1691:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1692:3: ruleGreaterSent
                    {
                     before(grammarAccess.getBaroAltSentAccess().getSentGreaterSentParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGreaterSent();

                    state._fsp--;

                     after(grammarAccess.getBaroAltSentAccess().getSentGreaterSentParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1697:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1697:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1698:3: ruleLessSent
                    {
                     before(grammarAccess.getBaroAltSentAccess().getSentLessSentParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLessSent();

                    state._fsp--;

                     after(grammarAccess.getBaroAltSentAccess().getSentLessSentParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1703:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1703:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1704:3: ruleEqualSent
                    {
                     before(grammarAccess.getBaroAltSentAccess().getSentEqualSentParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualSent();

                    state._fsp--;

                     after(grammarAccess.getBaroAltSentAccess().getSentEqualSentParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__BaroAltSent__SentAlternatives_2_0"


    // $ANTLR start "rule__SonarSent__SentAlternatives_1_0"
    // InternalMyLanguage.g:1713:1: rule__SonarSent__SentAlternatives_1_0 : ( ( ruleSonarDistanceSent ) | ( ruleCompStatusSent ) );
    public final void rule__SonarSent__SentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1717:1: ( ( ruleSonarDistanceSent ) | ( ruleCompStatusSent ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyLanguage.g:1718:2: ( ruleSonarDistanceSent )
                    {
                    // InternalMyLanguage.g:1718:2: ( ruleSonarDistanceSent )
                    // InternalMyLanguage.g:1719:3: ruleSonarDistanceSent
                    {
                     before(grammarAccess.getSonarSentAccess().getSentSonarDistanceSentParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSonarDistanceSent();

                    state._fsp--;

                     after(grammarAccess.getSonarSentAccess().getSentSonarDistanceSentParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1724:2: ( ruleCompStatusSent )
                    {
                    // InternalMyLanguage.g:1724:2: ( ruleCompStatusSent )
                    // InternalMyLanguage.g:1725:3: ruleCompStatusSent
                    {
                     before(grammarAccess.getSonarSentAccess().getSentCompStatusSentParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompStatusSent();

                    state._fsp--;

                     after(grammarAccess.getSonarSentAccess().getSentCompStatusSentParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__SonarSent__SentAlternatives_1_0"


    // $ANTLR start "rule__SonarDistanceSent__SentAlternatives_2_0"
    // InternalMyLanguage.g:1734:1: rule__SonarDistanceSent__SentAlternatives_2_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__SonarDistanceSent__SentAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1738:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt9=1;
                }
                break;
            case 57:
                {
                alt9=2;
                }
                break;
            case 56:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyLanguage.g:1739:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1739:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1740:3: ruleGreaterSent
                    {
                     before(grammarAccess.getSonarDistanceSentAccess().getSentGreaterSentParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGreaterSent();

                    state._fsp--;

                     after(grammarAccess.getSonarDistanceSentAccess().getSentGreaterSentParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1745:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1745:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1746:3: ruleLessSent
                    {
                     before(grammarAccess.getSonarDistanceSentAccess().getSentLessSentParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLessSent();

                    state._fsp--;

                     after(grammarAccess.getSonarDistanceSentAccess().getSentLessSentParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1751:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1751:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1752:3: ruleEqualSent
                    {
                     before(grammarAccess.getSonarDistanceSentAccess().getSentEqualSentParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualSent();

                    state._fsp--;

                     after(grammarAccess.getSonarDistanceSentAccess().getSentEqualSentParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__SonarDistanceSent__SentAlternatives_2_0"


    // $ANTLR start "rule__BatterySent__SentAlternatives_1_0"
    // InternalMyLanguage.g:1761:1: rule__BatterySent__SentAlternatives_1_0 : ( ( ruleBatteryLevelSent ) | ( ruleCompStatusSent ) );
    public final void rule__BatterySent__SentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1765:1: ( ( ruleBatteryLevelSent ) | ( ruleCompStatusSent ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyLanguage.g:1766:2: ( ruleBatteryLevelSent )
                    {
                    // InternalMyLanguage.g:1766:2: ( ruleBatteryLevelSent )
                    // InternalMyLanguage.g:1767:3: ruleBatteryLevelSent
                    {
                     before(grammarAccess.getBatterySentAccess().getSentBatteryLevelSentParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBatteryLevelSent();

                    state._fsp--;

                     after(grammarAccess.getBatterySentAccess().getSentBatteryLevelSentParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1772:2: ( ruleCompStatusSent )
                    {
                    // InternalMyLanguage.g:1772:2: ( ruleCompStatusSent )
                    // InternalMyLanguage.g:1773:3: ruleCompStatusSent
                    {
                     before(grammarAccess.getBatterySentAccess().getSentCompStatusSentParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompStatusSent();

                    state._fsp--;

                     after(grammarAccess.getBatterySentAccess().getSentCompStatusSentParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__BatterySent__SentAlternatives_1_0"


    // $ANTLR start "rule__BatteryLevelSent__SentAlternatives_2_0"
    // InternalMyLanguage.g:1782:1: rule__BatteryLevelSent__SentAlternatives_2_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__BatteryLevelSent__SentAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1786:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt11=1;
                }
                break;
            case 57:
                {
                alt11=2;
                }
                break;
            case 56:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyLanguage.g:1787:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1787:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1788:3: ruleGreaterSent
                    {
                     before(grammarAccess.getBatteryLevelSentAccess().getSentGreaterSentParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGreaterSent();

                    state._fsp--;

                     after(grammarAccess.getBatteryLevelSentAccess().getSentGreaterSentParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1793:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1793:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1794:3: ruleLessSent
                    {
                     before(grammarAccess.getBatteryLevelSentAccess().getSentLessSentParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLessSent();

                    state._fsp--;

                     after(grammarAccess.getBatteryLevelSentAccess().getSentLessSentParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1799:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1799:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1800:3: ruleEqualSent
                    {
                     before(grammarAccess.getBatteryLevelSentAccess().getSentEqualSentParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualSent();

                    state._fsp--;

                     after(grammarAccess.getBatteryLevelSentAccess().getSentEqualSentParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__BatteryLevelSent__SentAlternatives_2_0"


    // $ANTLR start "rule__PeopleSent__Alternatives_1"
    // InternalMyLanguage.g:1809:1: rule__PeopleSent__Alternatives_1 : ( ( rulePeopleNumbSent ) | ( rulePeoplePosSent ) );
    public final void rule__PeopleSent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1813:1: ( ( rulePeopleNumbSent ) | ( rulePeoplePosSent ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            else if ( (LA12_0==45) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyLanguage.g:1814:2: ( rulePeopleNumbSent )
                    {
                    // InternalMyLanguage.g:1814:2: ( rulePeopleNumbSent )
                    // InternalMyLanguage.g:1815:3: rulePeopleNumbSent
                    {
                     before(grammarAccess.getPeopleSentAccess().getPeopleNumbSentParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    rulePeopleNumbSent();

                    state._fsp--;

                     after(grammarAccess.getPeopleSentAccess().getPeopleNumbSentParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1820:2: ( rulePeoplePosSent )
                    {
                    // InternalMyLanguage.g:1820:2: ( rulePeoplePosSent )
                    // InternalMyLanguage.g:1821:3: rulePeoplePosSent
                    {
                     before(grammarAccess.getPeopleSentAccess().getPeoplePosSentParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    rulePeoplePosSent();

                    state._fsp--;

                     after(grammarAccess.getPeopleSentAccess().getPeoplePosSentParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__PeopleSent__Alternatives_1"


    // $ANTLR start "rule__PeoplePosSent__ToleranceAlternatives_5_0"
    // InternalMyLanguage.g:1830:1: rule__PeoplePosSent__ToleranceAlternatives_5_0 : ( ( ruleCirclePosition ) | ( ruleSpherePosition ) );
    public final void rule__PeoplePosSent__ToleranceAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1834:1: ( ( ruleCirclePosition ) | ( ruleSpherePosition ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==61) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==62) ) {
                    alt13=1;
                }
                else if ( (LA13_1==65) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyLanguage.g:1835:2: ( ruleCirclePosition )
                    {
                    // InternalMyLanguage.g:1835:2: ( ruleCirclePosition )
                    // InternalMyLanguage.g:1836:3: ruleCirclePosition
                    {
                     before(grammarAccess.getPeoplePosSentAccess().getToleranceCirclePositionParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCirclePosition();

                    state._fsp--;

                     after(grammarAccess.getPeoplePosSentAccess().getToleranceCirclePositionParserRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1841:2: ( ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:1841:2: ( ruleSpherePosition )
                    // InternalMyLanguage.g:1842:3: ruleSpherePosition
                    {
                     before(grammarAccess.getPeoplePosSentAccess().getToleranceSpherePositionParserRuleCall_5_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpherePosition();

                    state._fsp--;

                     after(grammarAccess.getPeoplePosSentAccess().getToleranceSpherePositionParserRuleCall_5_0_1()); 

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
    // $ANTLR end "rule__PeoplePosSent__ToleranceAlternatives_5_0"


    // $ANTLR start "rule__MissionSent__Alternatives_1"
    // InternalMyLanguage.g:1851:1: rule__MissionSent__Alternatives_1 : ( ( ruleMissionStatusSent ) | ( ruleMissionRiskLevelSent ) | ( ruleMissionGoalSent ) );
    public final void rule__MissionSent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1855:1: ( ( ruleMissionStatusSent ) | ( ruleMissionRiskLevelSent ) | ( ruleMissionGoalSent ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 49:
                {
                alt14=2;
                }
                break;
            case 48:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyLanguage.g:1856:2: ( ruleMissionStatusSent )
                    {
                    // InternalMyLanguage.g:1856:2: ( ruleMissionStatusSent )
                    // InternalMyLanguage.g:1857:3: ruleMissionStatusSent
                    {
                     before(grammarAccess.getMissionSentAccess().getMissionStatusSentParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMissionStatusSent();

                    state._fsp--;

                     after(grammarAccess.getMissionSentAccess().getMissionStatusSentParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1862:2: ( ruleMissionRiskLevelSent )
                    {
                    // InternalMyLanguage.g:1862:2: ( ruleMissionRiskLevelSent )
                    // InternalMyLanguage.g:1863:3: ruleMissionRiskLevelSent
                    {
                     before(grammarAccess.getMissionSentAccess().getMissionRiskLevelSentParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMissionRiskLevelSent();

                    state._fsp--;

                     after(grammarAccess.getMissionSentAccess().getMissionRiskLevelSentParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1868:2: ( ruleMissionGoalSent )
                    {
                    // InternalMyLanguage.g:1868:2: ( ruleMissionGoalSent )
                    // InternalMyLanguage.g:1869:3: ruleMissionGoalSent
                    {
                     before(grammarAccess.getMissionSentAccess().getMissionGoalSentParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMissionGoalSent();

                    state._fsp--;

                     after(grammarAccess.getMissionSentAccess().getMissionGoalSentParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__MissionSent__Alternatives_1"


    // $ANTLR start "rule__Robot__Alternatives_1"
    // InternalMyLanguage.g:1878:1: rule__Robot__Alternatives_1 : ( ( ruleRobotPositionSent ) | ( ruleRobotSpeedSent ) | ( ruleRobotStateSent ) | ( ruleRobotDistanceSent ) | ( ruleRiskSent ) | ( rulePayloadSent ) | ( ruleRobotAutoPilot ) );
    public final void rule__Robot__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1882:1: ( ( ruleRobotPositionSent ) | ( ruleRobotSpeedSent ) | ( ruleRobotStateSent ) | ( ruleRobotDistanceSent ) | ( ruleRiskSent ) | ( rulePayloadSent ) | ( ruleRobotAutoPilot ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt15=1;
                }
                break;
            case 66:
                {
                alt15=2;
                }
                break;
            case 60:
                {
                alt15=3;
                }
                break;
            case 53:
                {
                alt15=4;
                }
                break;
            case 69:
                {
                alt15=5;
                }
                break;
            case 83:
                {
                alt15=6;
                }
                break;
            case 51:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyLanguage.g:1883:2: ( ruleRobotPositionSent )
                    {
                    // InternalMyLanguage.g:1883:2: ( ruleRobotPositionSent )
                    // InternalMyLanguage.g:1884:3: ruleRobotPositionSent
                    {
                     before(grammarAccess.getRobotAccess().getRobotPositionSentParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRobotPositionSent();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getRobotPositionSentParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1889:2: ( ruleRobotSpeedSent )
                    {
                    // InternalMyLanguage.g:1889:2: ( ruleRobotSpeedSent )
                    // InternalMyLanguage.g:1890:3: ruleRobotSpeedSent
                    {
                     before(grammarAccess.getRobotAccess().getRobotSpeedSentParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRobotSpeedSent();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getRobotSpeedSentParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1895:2: ( ruleRobotStateSent )
                    {
                    // InternalMyLanguage.g:1895:2: ( ruleRobotStateSent )
                    // InternalMyLanguage.g:1896:3: ruleRobotStateSent
                    {
                     before(grammarAccess.getRobotAccess().getRobotStateSentParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRobotStateSent();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getRobotStateSentParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:1901:2: ( ruleRobotDistanceSent )
                    {
                    // InternalMyLanguage.g:1901:2: ( ruleRobotDistanceSent )
                    // InternalMyLanguage.g:1902:3: ruleRobotDistanceSent
                    {
                     before(grammarAccess.getRobotAccess().getRobotDistanceSentParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRobotDistanceSent();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getRobotDistanceSentParserRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyLanguage.g:1907:2: ( ruleRiskSent )
                    {
                    // InternalMyLanguage.g:1907:2: ( ruleRiskSent )
                    // InternalMyLanguage.g:1908:3: ruleRiskSent
                    {
                     before(grammarAccess.getRobotAccess().getRiskSentParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRiskSent();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getRiskSentParserRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyLanguage.g:1913:2: ( rulePayloadSent )
                    {
                    // InternalMyLanguage.g:1913:2: ( rulePayloadSent )
                    // InternalMyLanguage.g:1914:3: rulePayloadSent
                    {
                     before(grammarAccess.getRobotAccess().getPayloadSentParserRuleCall_1_5()); 
                    pushFollow(FOLLOW_2);
                    rulePayloadSent();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getPayloadSentParserRuleCall_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyLanguage.g:1919:2: ( ruleRobotAutoPilot )
                    {
                    // InternalMyLanguage.g:1919:2: ( ruleRobotAutoPilot )
                    // InternalMyLanguage.g:1920:3: ruleRobotAutoPilot
                    {
                     before(grammarAccess.getRobotAccess().getRobotAutoPilotParserRuleCall_1_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRobotAutoPilot();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getRobotAutoPilotParserRuleCall_1_6()); 

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
    // $ANTLR end "rule__Robot__Alternatives_1"


    // $ANTLR start "rule__RobotAutoPilot__StatusAlternatives_2_0"
    // InternalMyLanguage.g:1929:1: rule__RobotAutoPilot__StatusAlternatives_2_0 : ( ( 'ON' ) | ( 'OFF' ) );
    public final void rule__RobotAutoPilot__StatusAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1933:1: ( ( 'ON' ) | ( 'OFF' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==11) ) {
                alt16=1;
            }
            else if ( (LA16_0==12) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyLanguage.g:1934:2: ( 'ON' )
                    {
                    // InternalMyLanguage.g:1934:2: ( 'ON' )
                    // InternalMyLanguage.g:1935:3: 'ON'
                    {
                     before(grammarAccess.getRobotAutoPilotAccess().getStatusONKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRobotAutoPilotAccess().getStatusONKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1940:2: ( 'OFF' )
                    {
                    // InternalMyLanguage.g:1940:2: ( 'OFF' )
                    // InternalMyLanguage.g:1941:3: 'OFF'
                    {
                     before(grammarAccess.getRobotAutoPilotAccess().getStatusOFFKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRobotAutoPilotAccess().getStatusOFFKeyword_2_0_1()); 

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
    // $ANTLR end "rule__RobotAutoPilot__StatusAlternatives_2_0"


    // $ANTLR start "rule__RobotDistanceSent__SentAlternatives_2_0"
    // InternalMyLanguage.g:1950:1: rule__RobotDistanceSent__SentAlternatives_2_0 : ( ( ruleDistanceToObstaclesSent ) | ( ruleDistanceToLocationSent ) );
    public final void rule__RobotDistanceSent__SentAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1954:1: ( ( ruleDistanceToObstaclesSent ) | ( ruleDistanceToLocationSent ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==55) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=75 && LA17_0<=78)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyLanguage.g:1955:2: ( ruleDistanceToObstaclesSent )
                    {
                    // InternalMyLanguage.g:1955:2: ( ruleDistanceToObstaclesSent )
                    // InternalMyLanguage.g:1956:3: ruleDistanceToObstaclesSent
                    {
                     before(grammarAccess.getRobotDistanceSentAccess().getSentDistanceToObstaclesSentParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceToObstaclesSent();

                    state._fsp--;

                     after(grammarAccess.getRobotDistanceSentAccess().getSentDistanceToObstaclesSentParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1961:2: ( ruleDistanceToLocationSent )
                    {
                    // InternalMyLanguage.g:1961:2: ( ruleDistanceToLocationSent )
                    // InternalMyLanguage.g:1962:3: ruleDistanceToLocationSent
                    {
                     before(grammarAccess.getRobotDistanceSentAccess().getSentDistanceToLocationSentParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceToLocationSent();

                    state._fsp--;

                     after(grammarAccess.getRobotDistanceSentAccess().getSentDistanceToLocationSentParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__RobotDistanceSent__SentAlternatives_2_0"


    // $ANTLR start "rule__DistanceToLocationSent__BodyAlternatives_4_0"
    // InternalMyLanguage.g:1971:1: rule__DistanceToLocationSent__BodyAlternatives_4_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__DistanceToLocationSent__BodyAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1975:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt18=1;
                }
                break;
            case 57:
                {
                alt18=2;
                }
                break;
            case 56:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyLanguage.g:1976:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1976:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1977:3: ruleGreaterSent
                    {
                     before(grammarAccess.getDistanceToLocationSentAccess().getBodyGreaterSentParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGreaterSent();

                    state._fsp--;

                     after(grammarAccess.getDistanceToLocationSentAccess().getBodyGreaterSentParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1982:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1982:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1983:3: ruleLessSent
                    {
                     before(grammarAccess.getDistanceToLocationSentAccess().getBodyLessSentParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLessSent();

                    state._fsp--;

                     after(grammarAccess.getDistanceToLocationSentAccess().getBodyLessSentParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1988:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1988:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1989:3: ruleEqualSent
                    {
                     before(grammarAccess.getDistanceToLocationSentAccess().getBodyEqualSentParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualSent();

                    state._fsp--;

                     after(grammarAccess.getDistanceToLocationSentAccess().getBodyEqualSentParserRuleCall_4_0_2()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__BodyAlternatives_4_0"


    // $ANTLR start "rule__DistanceToObstaclesSent__BodyAlternatives_2_0"
    // InternalMyLanguage.g:1998:1: rule__DistanceToObstaclesSent__BodyAlternatives_2_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__DistanceToObstaclesSent__BodyAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2002:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt19=1;
                }
                break;
            case 57:
                {
                alt19=2;
                }
                break;
            case 56:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyLanguage.g:2003:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:2003:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:2004:3: ruleGreaterSent
                    {
                     before(grammarAccess.getDistanceToObstaclesSentAccess().getBodyGreaterSentParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGreaterSent();

                    state._fsp--;

                     after(grammarAccess.getDistanceToObstaclesSentAccess().getBodyGreaterSentParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2009:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:2009:2: ( ruleLessSent )
                    // InternalMyLanguage.g:2010:3: ruleLessSent
                    {
                     before(grammarAccess.getDistanceToObstaclesSentAccess().getBodyLessSentParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLessSent();

                    state._fsp--;

                     after(grammarAccess.getDistanceToObstaclesSentAccess().getBodyLessSentParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2015:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:2015:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:2016:3: ruleEqualSent
                    {
                     before(grammarAccess.getDistanceToObstaclesSentAccess().getBodyEqualSentParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualSent();

                    state._fsp--;

                     after(grammarAccess.getDistanceToObstaclesSentAccess().getBodyEqualSentParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__DistanceToObstaclesSent__BodyAlternatives_2_0"


    // $ANTLR start "rule__EqualSent__AmountAlternatives_2_0"
    // InternalMyLanguage.g:2025:1: rule__EqualSent__AmountAlternatives_2_0 : ( ( ruleDistanceUnit ) | ( rulePercentUnit ) );
    public final void rule__EqualSent__AmountAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2029:1: ( ( ruleDistanceUnit ) | ( rulePercentUnit ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=75 && LA20_0<=78)) ) {
                alt20=1;
            }
            else if ( (LA20_0==79) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyLanguage.g:2030:2: ( ruleDistanceUnit )
                    {
                    // InternalMyLanguage.g:2030:2: ( ruleDistanceUnit )
                    // InternalMyLanguage.g:2031:3: ruleDistanceUnit
                    {
                     before(grammarAccess.getEqualSentAccess().getAmountDistanceUnitParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceUnit();

                    state._fsp--;

                     after(grammarAccess.getEqualSentAccess().getAmountDistanceUnitParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2036:2: ( rulePercentUnit )
                    {
                    // InternalMyLanguage.g:2036:2: ( rulePercentUnit )
                    // InternalMyLanguage.g:2037:3: rulePercentUnit
                    {
                     before(grammarAccess.getEqualSentAccess().getAmountPercentUnitParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePercentUnit();

                    state._fsp--;

                     after(grammarAccess.getEqualSentAccess().getAmountPercentUnitParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__EqualSent__AmountAlternatives_2_0"


    // $ANTLR start "rule__LessSent__AmountAlternatives_2_0"
    // InternalMyLanguage.g:2046:1: rule__LessSent__AmountAlternatives_2_0 : ( ( ruleDistanceUnit ) | ( rulePercentUnit ) );
    public final void rule__LessSent__AmountAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2050:1: ( ( ruleDistanceUnit ) | ( rulePercentUnit ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=75 && LA21_0<=78)) ) {
                alt21=1;
            }
            else if ( (LA21_0==79) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyLanguage.g:2051:2: ( ruleDistanceUnit )
                    {
                    // InternalMyLanguage.g:2051:2: ( ruleDistanceUnit )
                    // InternalMyLanguage.g:2052:3: ruleDistanceUnit
                    {
                     before(grammarAccess.getLessSentAccess().getAmountDistanceUnitParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceUnit();

                    state._fsp--;

                     after(grammarAccess.getLessSentAccess().getAmountDistanceUnitParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2057:2: ( rulePercentUnit )
                    {
                    // InternalMyLanguage.g:2057:2: ( rulePercentUnit )
                    // InternalMyLanguage.g:2058:3: rulePercentUnit
                    {
                     before(grammarAccess.getLessSentAccess().getAmountPercentUnitParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePercentUnit();

                    state._fsp--;

                     after(grammarAccess.getLessSentAccess().getAmountPercentUnitParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__LessSent__AmountAlternatives_2_0"


    // $ANTLR start "rule__GreaterSent__AmountAlternatives_2_0"
    // InternalMyLanguage.g:2067:1: rule__GreaterSent__AmountAlternatives_2_0 : ( ( ruleDistanceUnit ) | ( rulePercentUnit ) );
    public final void rule__GreaterSent__AmountAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2071:1: ( ( ruleDistanceUnit ) | ( rulePercentUnit ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=75 && LA22_0<=78)) ) {
                alt22=1;
            }
            else if ( (LA22_0==79) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyLanguage.g:2072:2: ( ruleDistanceUnit )
                    {
                    // InternalMyLanguage.g:2072:2: ( ruleDistanceUnit )
                    // InternalMyLanguage.g:2073:3: ruleDistanceUnit
                    {
                     before(grammarAccess.getGreaterSentAccess().getAmountDistanceUnitParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceUnit();

                    state._fsp--;

                     after(grammarAccess.getGreaterSentAccess().getAmountDistanceUnitParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2078:2: ( rulePercentUnit )
                    {
                    // InternalMyLanguage.g:2078:2: ( rulePercentUnit )
                    // InternalMyLanguage.g:2079:3: rulePercentUnit
                    {
                     before(grammarAccess.getGreaterSentAccess().getAmountPercentUnitParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePercentUnit();

                    state._fsp--;

                     after(grammarAccess.getGreaterSentAccess().getAmountPercentUnitParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__GreaterSent__AmountAlternatives_2_0"


    // $ANTLR start "rule__RobotPositionSent__ToleranceAlternatives_5_0"
    // InternalMyLanguage.g:2088:1: rule__RobotPositionSent__ToleranceAlternatives_5_0 : ( ( ruleCirclePosition ) | ( ruleSpherePosition ) );
    public final void rule__RobotPositionSent__ToleranceAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2092:1: ( ( ruleCirclePosition ) | ( ruleSpherePosition ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==61) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==62) ) {
                    alt23=1;
                }
                else if ( (LA23_1==65) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyLanguage.g:2093:2: ( ruleCirclePosition )
                    {
                    // InternalMyLanguage.g:2093:2: ( ruleCirclePosition )
                    // InternalMyLanguage.g:2094:3: ruleCirclePosition
                    {
                     before(grammarAccess.getRobotPositionSentAccess().getToleranceCirclePositionParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCirclePosition();

                    state._fsp--;

                     after(grammarAccess.getRobotPositionSentAccess().getToleranceCirclePositionParserRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2099:2: ( ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:2099:2: ( ruleSpherePosition )
                    // InternalMyLanguage.g:2100:3: ruleSpherePosition
                    {
                     before(grammarAccess.getRobotPositionSentAccess().getToleranceSpherePositionParserRuleCall_5_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpherePosition();

                    state._fsp--;

                     after(grammarAccess.getRobotPositionSentAccess().getToleranceSpherePositionParserRuleCall_5_0_1()); 

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
    // $ANTLR end "rule__RobotPositionSent__ToleranceAlternatives_5_0"


    // $ANTLR start "rule__EnvironmentSent__BodyAlternatives_3_0"
    // InternalMyLanguage.g:2109:1: rule__EnvironmentSent__BodyAlternatives_3_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__EnvironmentSent__BodyAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2113:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt24=1;
                }
                break;
            case 57:
                {
                alt24=2;
                }
                break;
            case 56:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMyLanguage.g:2114:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:2114:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:2115:3: ruleGreaterSent
                    {
                     before(grammarAccess.getEnvironmentSentAccess().getBodyGreaterSentParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGreaterSent();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentSentAccess().getBodyGreaterSentParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2120:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:2120:2: ( ruleLessSent )
                    // InternalMyLanguage.g:2121:3: ruleLessSent
                    {
                     before(grammarAccess.getEnvironmentSentAccess().getBodyLessSentParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLessSent();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentSentAccess().getBodyLessSentParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2126:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:2126:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:2127:3: ruleEqualSent
                    {
                     before(grammarAccess.getEnvironmentSentAccess().getBodyEqualSentParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualSent();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentSentAccess().getBodyEqualSentParserRuleCall_3_0_2()); 

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
    // $ANTLR end "rule__EnvironmentSent__BodyAlternatives_3_0"


    // $ANTLR start "rule__MISSIONSTATUS__Alternatives"
    // InternalMyLanguage.g:2136:1: rule__MISSIONSTATUS__Alternatives : ( ( 'ACTIVE' ) | ( 'UNACTIVE' ) | ( 'PAUSED' ) );
    public final void rule__MISSIONSTATUS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2140:1: ( ( 'ACTIVE' ) | ( 'UNACTIVE' ) | ( 'PAUSED' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt25=1;
                }
                break;
            case 14:
                {
                alt25=2;
                }
                break;
            case 15:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMyLanguage.g:2141:2: ( 'ACTIVE' )
                    {
                    // InternalMyLanguage.g:2141:2: ( 'ACTIVE' )
                    // InternalMyLanguage.g:2142:3: 'ACTIVE'
                    {
                     before(grammarAccess.getMISSIONSTATUSAccess().getACTIVEKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMISSIONSTATUSAccess().getACTIVEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2147:2: ( 'UNACTIVE' )
                    {
                    // InternalMyLanguage.g:2147:2: ( 'UNACTIVE' )
                    // InternalMyLanguage.g:2148:3: 'UNACTIVE'
                    {
                     before(grammarAccess.getMISSIONSTATUSAccess().getUNACTIVEKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMISSIONSTATUSAccess().getUNACTIVEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2153:2: ( 'PAUSED' )
                    {
                    // InternalMyLanguage.g:2153:2: ( 'PAUSED' )
                    // InternalMyLanguage.g:2154:3: 'PAUSED'
                    {
                     before(grammarAccess.getMISSIONSTATUSAccess().getPAUSEDKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMISSIONSTATUSAccess().getPAUSEDKeyword_2()); 

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
    // $ANTLR end "rule__MISSIONSTATUS__Alternatives"


    // $ANTLR start "rule__MISSIONRISKLEVEL__Alternatives"
    // InternalMyLanguage.g:2163:1: rule__MISSIONRISKLEVEL__Alternatives : ( ( 'SAFE' ) | ( 'UNSAFE' ) );
    public final void rule__MISSIONRISKLEVEL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2167:1: ( ( 'SAFE' ) | ( 'UNSAFE' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            else if ( (LA26_0==17) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyLanguage.g:2168:2: ( 'SAFE' )
                    {
                    // InternalMyLanguage.g:2168:2: ( 'SAFE' )
                    // InternalMyLanguage.g:2169:3: 'SAFE'
                    {
                     before(grammarAccess.getMISSIONRISKLEVELAccess().getSAFEKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMISSIONRISKLEVELAccess().getSAFEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2174:2: ( 'UNSAFE' )
                    {
                    // InternalMyLanguage.g:2174:2: ( 'UNSAFE' )
                    // InternalMyLanguage.g:2175:3: 'UNSAFE'
                    {
                     before(grammarAccess.getMISSIONRISKLEVELAccess().getUNSAFEKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMISSIONRISKLEVELAccess().getUNSAFEKeyword_1()); 

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
    // $ANTLR end "rule__MISSIONRISKLEVEL__Alternatives"


    // $ANTLR start "rule__COLLISIONRISKLEVEL__Alternatives"
    // InternalMyLanguage.g:2184:1: rule__COLLISIONRISKLEVEL__Alternatives : ( ( 'SAFE' ) | ( 'WARNING' ) | ( 'CRITICAL' ) );
    public final void rule__COLLISIONRISKLEVEL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2188:1: ( ( 'SAFE' ) | ( 'WARNING' ) | ( 'CRITICAL' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt27=1;
                }
                break;
            case 18:
                {
                alt27=2;
                }
                break;
            case 19:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMyLanguage.g:2189:2: ( 'SAFE' )
                    {
                    // InternalMyLanguage.g:2189:2: ( 'SAFE' )
                    // InternalMyLanguage.g:2190:3: 'SAFE'
                    {
                     before(grammarAccess.getCOLLISIONRISKLEVELAccess().getSAFEKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCOLLISIONRISKLEVELAccess().getSAFEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2195:2: ( 'WARNING' )
                    {
                    // InternalMyLanguage.g:2195:2: ( 'WARNING' )
                    // InternalMyLanguage.g:2196:3: 'WARNING'
                    {
                     before(grammarAccess.getCOLLISIONRISKLEVELAccess().getWARNINGKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCOLLISIONRISKLEVELAccess().getWARNINGKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2201:2: ( 'CRITICAL' )
                    {
                    // InternalMyLanguage.g:2201:2: ( 'CRITICAL' )
                    // InternalMyLanguage.g:2202:3: 'CRITICAL'
                    {
                     before(grammarAccess.getCOLLISIONRISKLEVELAccess().getCRITICALKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCOLLISIONRISKLEVELAccess().getCRITICALKeyword_2()); 

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
    // $ANTLR end "rule__COLLISIONRISKLEVEL__Alternatives"


    // $ANTLR start "rule__COMPSTATUS__Alternatives"
    // InternalMyLanguage.g:2211:1: rule__COMPSTATUS__Alternatives : ( ( 'ACTIVE' ) | ( 'FAILING' ) | ( 'REDUNDANT' ) );
    public final void rule__COMPSTATUS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2215:1: ( ( 'ACTIVE' ) | ( 'FAILING' ) | ( 'REDUNDANT' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt28=1;
                }
                break;
            case 20:
                {
                alt28=2;
                }
                break;
            case 21:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyLanguage.g:2216:2: ( 'ACTIVE' )
                    {
                    // InternalMyLanguage.g:2216:2: ( 'ACTIVE' )
                    // InternalMyLanguage.g:2217:3: 'ACTIVE'
                    {
                     before(grammarAccess.getCOMPSTATUSAccess().getACTIVEKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCOMPSTATUSAccess().getACTIVEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2222:2: ( 'FAILING' )
                    {
                    // InternalMyLanguage.g:2222:2: ( 'FAILING' )
                    // InternalMyLanguage.g:2223:3: 'FAILING'
                    {
                     before(grammarAccess.getCOMPSTATUSAccess().getFAILINGKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCOMPSTATUSAccess().getFAILINGKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2228:2: ( 'REDUNDANT' )
                    {
                    // InternalMyLanguage.g:2228:2: ( 'REDUNDANT' )
                    // InternalMyLanguage.g:2229:3: 'REDUNDANT'
                    {
                     before(grammarAccess.getCOMPSTATUSAccess().getREDUNDANTKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCOMPSTATUSAccess().getREDUNDANTKeyword_2()); 

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
    // $ANTLR end "rule__COMPSTATUS__Alternatives"


    // $ANTLR start "rule__DistanceUnit__Alternatives"
    // InternalMyLanguage.g:2238:1: rule__DistanceUnit__Alternatives : ( ( ruleMETER ) | ( ruleCENTIMETER ) | ( ruleMILLIMETER ) | ( ruleKILOMETER ) );
    public final void rule__DistanceUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2242:1: ( ( ruleMETER ) | ( ruleCENTIMETER ) | ( ruleMILLIMETER ) | ( ruleKILOMETER ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt29=1;
                }
                break;
            case 76:
                {
                alt29=2;
                }
                break;
            case 77:
                {
                alt29=3;
                }
                break;
            case 78:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyLanguage.g:2243:2: ( ruleMETER )
                    {
                    // InternalMyLanguage.g:2243:2: ( ruleMETER )
                    // InternalMyLanguage.g:2244:3: ruleMETER
                    {
                     before(grammarAccess.getDistanceUnitAccess().getMETERParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMETER();

                    state._fsp--;

                     after(grammarAccess.getDistanceUnitAccess().getMETERParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2249:2: ( ruleCENTIMETER )
                    {
                    // InternalMyLanguage.g:2249:2: ( ruleCENTIMETER )
                    // InternalMyLanguage.g:2250:3: ruleCENTIMETER
                    {
                     before(grammarAccess.getDistanceUnitAccess().getCENTIMETERParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCENTIMETER();

                    state._fsp--;

                     after(grammarAccess.getDistanceUnitAccess().getCENTIMETERParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2255:2: ( ruleMILLIMETER )
                    {
                    // InternalMyLanguage.g:2255:2: ( ruleMILLIMETER )
                    // InternalMyLanguage.g:2256:3: ruleMILLIMETER
                    {
                     before(grammarAccess.getDistanceUnitAccess().getMILLIMETERParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMILLIMETER();

                    state._fsp--;

                     after(grammarAccess.getDistanceUnitAccess().getMILLIMETERParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:2261:2: ( ruleKILOMETER )
                    {
                    // InternalMyLanguage.g:2261:2: ( ruleKILOMETER )
                    // InternalMyLanguage.g:2262:3: ruleKILOMETER
                    {
                     before(grammarAccess.getDistanceUnitAccess().getKILOMETERParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleKILOMETER();

                    state._fsp--;

                     after(grammarAccess.getDistanceUnitAccess().getKILOMETERParserRuleCall_3()); 

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
    // $ANTLR end "rule__DistanceUnit__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalMyLanguage.g:2271:1: rule__TimeUnit__Alternatives : ( ( ruleSECONDS ) | ( ruleHOUR ) | ( ruleMINUTES ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2275:1: ( ( ruleSECONDS ) | ( ruleHOUR ) | ( ruleMINUTES ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt30=1;
                }
                break;
            case 73:
                {
                alt30=2;
                }
                break;
            case 74:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyLanguage.g:2276:2: ( ruleSECONDS )
                    {
                    // InternalMyLanguage.g:2276:2: ( ruleSECONDS )
                    // InternalMyLanguage.g:2277:3: ruleSECONDS
                    {
                     before(grammarAccess.getTimeUnitAccess().getSECONDSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSECONDS();

                    state._fsp--;

                     after(grammarAccess.getTimeUnitAccess().getSECONDSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2282:2: ( ruleHOUR )
                    {
                    // InternalMyLanguage.g:2282:2: ( ruleHOUR )
                    // InternalMyLanguage.g:2283:3: ruleHOUR
                    {
                     before(grammarAccess.getTimeUnitAccess().getHOURParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHOUR();

                    state._fsp--;

                     after(grammarAccess.getTimeUnitAccess().getHOURParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2288:2: ( ruleMINUTES )
                    {
                    // InternalMyLanguage.g:2288:2: ( ruleMINUTES )
                    // InternalMyLanguage.g:2289:3: ruleMINUTES
                    {
                     before(grammarAccess.getTimeUnitAccess().getMINUTESParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMINUTES();

                    state._fsp--;

                     after(grammarAccess.getTimeUnitAccess().getMINUTESParserRuleCall_2()); 

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
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__Test__Group__0"
    // InternalMyLanguage.g:2298:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2302:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalMyLanguage.g:2303:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

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
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalMyLanguage.g:2310:1: rule__Test__Group__0__Impl : ( 'Test:' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2314:1: ( ( 'Test:' ) )
            // InternalMyLanguage.g:2315:1: ( 'Test:' )
            {
            // InternalMyLanguage.g:2315:1: ( 'Test:' )
            // InternalMyLanguage.g:2316:2: 'Test:'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_0()); 

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
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalMyLanguage.g:2325:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2329:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalMyLanguage.g:2330:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

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
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalMyLanguage.g:2337:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2341:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalMyLanguage.g:2342:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalMyLanguage.g:2342:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalMyLanguage.g:2343:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalMyLanguage.g:2344:2: ( rule__Test__NameAssignment_1 )
            // InternalMyLanguage.g:2344:3: rule__Test__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalMyLanguage.g:2352:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2356:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalMyLanguage.g:2357:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

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
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalMyLanguage.g:2364:1: rule__Test__Group__2__Impl : ( ( rule__Test__Group_2__0 )? ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2368:1: ( ( ( rule__Test__Group_2__0 )? ) )
            // InternalMyLanguage.g:2369:1: ( ( rule__Test__Group_2__0 )? )
            {
            // InternalMyLanguage.g:2369:1: ( ( rule__Test__Group_2__0 )? )
            // InternalMyLanguage.g:2370:2: ( rule__Test__Group_2__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_2()); 
            // InternalMyLanguage.g:2371:2: ( rule__Test__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyLanguage.g:2371:3: rule__Test__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalMyLanguage.g:2379:1: rule__Test__Group__3 : rule__Test__Group__3__Impl ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2383:1: ( rule__Test__Group__3__Impl )
            // InternalMyLanguage.g:2384:2: rule__Test__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__3__Impl();

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
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalMyLanguage.g:2390:1: rule__Test__Group__3__Impl : ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2394:1: ( ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) ) )
            // InternalMyLanguage.g:2395:1: ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) )
            {
            // InternalMyLanguage.g:2395:1: ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) )
            // InternalMyLanguage.g:2396:2: ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* )
            {
            // InternalMyLanguage.g:2396:2: ( ( rule__Test__StatementsAssignment_3 ) )
            // InternalMyLanguage.g:2397:3: ( rule__Test__StatementsAssignment_3 )
            {
             before(grammarAccess.getTestAccess().getStatementsAssignment_3()); 
            // InternalMyLanguage.g:2398:3: ( rule__Test__StatementsAssignment_3 )
            // InternalMyLanguage.g:2398:4: rule__Test__StatementsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Test__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getStatementsAssignment_3()); 

            }

            // InternalMyLanguage.g:2401:2: ( ( rule__Test__StatementsAssignment_3 )* )
            // InternalMyLanguage.g:2402:3: ( rule__Test__StatementsAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getStatementsAssignment_3()); 
            // InternalMyLanguage.g:2403:3: ( rule__Test__StatementsAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=24 && LA32_0<=26)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyLanguage.g:2403:4: rule__Test__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Test__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getStatementsAssignment_3()); 

            }


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
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group_2__0"
    // InternalMyLanguage.g:2413:1: rule__Test__Group_2__0 : rule__Test__Group_2__0__Impl rule__Test__Group_2__1 ;
    public final void rule__Test__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2417:1: ( rule__Test__Group_2__0__Impl rule__Test__Group_2__1 )
            // InternalMyLanguage.g:2418:2: rule__Test__Group_2__0__Impl rule__Test__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Test__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_2__1();

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
    // $ANTLR end "rule__Test__Group_2__0"


    // $ANTLR start "rule__Test__Group_2__0__Impl"
    // InternalMyLanguage.g:2425:1: rule__Test__Group_2__0__Impl : ( 'Description:' ) ;
    public final void rule__Test__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2429:1: ( ( 'Description:' ) )
            // InternalMyLanguage.g:2430:1: ( 'Description:' )
            {
            // InternalMyLanguage.g:2430:1: ( 'Description:' )
            // InternalMyLanguage.g:2431:2: 'Description:'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getDescriptionKeyword_2_0()); 

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
    // $ANTLR end "rule__Test__Group_2__0__Impl"


    // $ANTLR start "rule__Test__Group_2__1"
    // InternalMyLanguage.g:2440:1: rule__Test__Group_2__1 : rule__Test__Group_2__1__Impl ;
    public final void rule__Test__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2444:1: ( rule__Test__Group_2__1__Impl )
            // InternalMyLanguage.g:2445:2: rule__Test__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_2__1__Impl();

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
    // $ANTLR end "rule__Test__Group_2__1"


    // $ANTLR start "rule__Test__Group_2__1__Impl"
    // InternalMyLanguage.g:2451:1: rule__Test__Group_2__1__Impl : ( ( rule__Test__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Test__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2455:1: ( ( ( rule__Test__DescriptionAssignment_2_1 ) ) )
            // InternalMyLanguage.g:2456:1: ( ( rule__Test__DescriptionAssignment_2_1 ) )
            {
            // InternalMyLanguage.g:2456:1: ( ( rule__Test__DescriptionAssignment_2_1 ) )
            // InternalMyLanguage.g:2457:2: ( rule__Test__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getTestAccess().getDescriptionAssignment_2_1()); 
            // InternalMyLanguage.g:2458:2: ( rule__Test__DescriptionAssignment_2_1 )
            // InternalMyLanguage.g:2458:3: rule__Test__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getDescriptionAssignment_2_1()); 

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
    // $ANTLR end "rule__Test__Group_2__1__Impl"


    // $ANTLR start "rule__Given__Group__0"
    // InternalMyLanguage.g:2467:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2471:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalMyLanguage.g:2472:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Given__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__1();

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
    // $ANTLR end "rule__Given__Group__0"


    // $ANTLR start "rule__Given__Group__0__Impl"
    // InternalMyLanguage.g:2479:1: rule__Given__Group__0__Impl : ( 'Given:' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2483:1: ( ( 'Given:' ) )
            // InternalMyLanguage.g:2484:1: ( 'Given:' )
            {
            // InternalMyLanguage.g:2484:1: ( 'Given:' )
            // InternalMyLanguage.g:2485:2: 'Given:'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getGivenKeyword_0()); 

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
    // $ANTLR end "rule__Given__Group__0__Impl"


    // $ANTLR start "rule__Given__Group__1"
    // InternalMyLanguage.g:2494:1: rule__Given__Group__1 : rule__Given__Group__1__Impl ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2498:1: ( rule__Given__Group__1__Impl )
            // InternalMyLanguage.g:2499:2: rule__Given__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__1__Impl();

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
    // $ANTLR end "rule__Given__Group__1"


    // $ANTLR start "rule__Given__Group__1__Impl"
    // InternalMyLanguage.g:2505:1: rule__Given__Group__1__Impl : ( ( rule__Given__BodyAssignment_1 ) ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2509:1: ( ( ( rule__Given__BodyAssignment_1 ) ) )
            // InternalMyLanguage.g:2510:1: ( ( rule__Given__BodyAssignment_1 ) )
            {
            // InternalMyLanguage.g:2510:1: ( ( rule__Given__BodyAssignment_1 ) )
            // InternalMyLanguage.g:2511:2: ( rule__Given__BodyAssignment_1 )
            {
             before(grammarAccess.getGivenAccess().getBodyAssignment_1()); 
            // InternalMyLanguage.g:2512:2: ( rule__Given__BodyAssignment_1 )
            // InternalMyLanguage.g:2512:3: rule__Given__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Given__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getBodyAssignment_1()); 

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
    // $ANTLR end "rule__Given__Group__1__Impl"


    // $ANTLR start "rule__Then__Group__0"
    // InternalMyLanguage.g:2521:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2525:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalMyLanguage.g:2526:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Then__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__1();

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
    // $ANTLR end "rule__Then__Group__0"


    // $ANTLR start "rule__Then__Group__0__Impl"
    // InternalMyLanguage.g:2533:1: rule__Then__Group__0__Impl : ( 'Then:' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2537:1: ( ( 'Then:' ) )
            // InternalMyLanguage.g:2538:1: ( 'Then:' )
            {
            // InternalMyLanguage.g:2538:1: ( 'Then:' )
            // InternalMyLanguage.g:2539:2: 'Then:'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getThenKeyword_0()); 

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
    // $ANTLR end "rule__Then__Group__0__Impl"


    // $ANTLR start "rule__Then__Group__1"
    // InternalMyLanguage.g:2548:1: rule__Then__Group__1 : rule__Then__Group__1__Impl ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2552:1: ( rule__Then__Group__1__Impl )
            // InternalMyLanguage.g:2553:2: rule__Then__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__1__Impl();

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
    // $ANTLR end "rule__Then__Group__1"


    // $ANTLR start "rule__Then__Group__1__Impl"
    // InternalMyLanguage.g:2559:1: rule__Then__Group__1__Impl : ( ( rule__Then__BodyAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2563:1: ( ( ( rule__Then__BodyAssignment_1 ) ) )
            // InternalMyLanguage.g:2564:1: ( ( rule__Then__BodyAssignment_1 ) )
            {
            // InternalMyLanguage.g:2564:1: ( ( rule__Then__BodyAssignment_1 ) )
            // InternalMyLanguage.g:2565:2: ( rule__Then__BodyAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getBodyAssignment_1()); 
            // InternalMyLanguage.g:2566:2: ( rule__Then__BodyAssignment_1 )
            // InternalMyLanguage.g:2566:3: rule__Then__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Then__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getBodyAssignment_1()); 

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
    // $ANTLR end "rule__Then__Group__1__Impl"


    // $ANTLR start "rule__When__Group__0"
    // InternalMyLanguage.g:2575:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2579:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalMyLanguage.g:2580:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__When__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__1();

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
    // $ANTLR end "rule__When__Group__0"


    // $ANTLR start "rule__When__Group__0__Impl"
    // InternalMyLanguage.g:2587:1: rule__When__Group__0__Impl : ( 'When:' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2591:1: ( ( 'When:' ) )
            // InternalMyLanguage.g:2592:1: ( 'When:' )
            {
            // InternalMyLanguage.g:2592:1: ( 'When:' )
            // InternalMyLanguage.g:2593:2: 'When:'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getWhenKeyword_0()); 

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
    // $ANTLR end "rule__When__Group__0__Impl"


    // $ANTLR start "rule__When__Group__1"
    // InternalMyLanguage.g:2602:1: rule__When__Group__1 : rule__When__Group__1__Impl ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2606:1: ( rule__When__Group__1__Impl )
            // InternalMyLanguage.g:2607:2: rule__When__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__1__Impl();

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
    // $ANTLR end "rule__When__Group__1"


    // $ANTLR start "rule__When__Group__1__Impl"
    // InternalMyLanguage.g:2613:1: rule__When__Group__1__Impl : ( ( rule__When__BodyAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2617:1: ( ( ( rule__When__BodyAssignment_1 ) ) )
            // InternalMyLanguage.g:2618:1: ( ( rule__When__BodyAssignment_1 ) )
            {
            // InternalMyLanguage.g:2618:1: ( ( rule__When__BodyAssignment_1 ) )
            // InternalMyLanguage.g:2619:2: ( rule__When__BodyAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getBodyAssignment_1()); 
            // InternalMyLanguage.g:2620:2: ( rule__When__BodyAssignment_1 )
            // InternalMyLanguage.g:2620:3: rule__When__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__When__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getBodyAssignment_1()); 

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
    // $ANTLR end "rule__When__Group__1__Impl"


    // $ANTLR start "rule__CompStatusSent__Group__0"
    // InternalMyLanguage.g:2629:1: rule__CompStatusSent__Group__0 : rule__CompStatusSent__Group__0__Impl rule__CompStatusSent__Group__1 ;
    public final void rule__CompStatusSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2633:1: ( rule__CompStatusSent__Group__0__Impl rule__CompStatusSent__Group__1 )
            // InternalMyLanguage.g:2634:2: rule__CompStatusSent__Group__0__Impl rule__CompStatusSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CompStatusSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompStatusSent__Group__1();

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
    // $ANTLR end "rule__CompStatusSent__Group__0"


    // $ANTLR start "rule__CompStatusSent__Group__0__Impl"
    // InternalMyLanguage.g:2641:1: rule__CompStatusSent__Group__0__Impl : ( 'status' ) ;
    public final void rule__CompStatusSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2645:1: ( ( 'status' ) )
            // InternalMyLanguage.g:2646:1: ( 'status' )
            {
            // InternalMyLanguage.g:2646:1: ( 'status' )
            // InternalMyLanguage.g:2647:2: 'status'
            {
             before(grammarAccess.getCompStatusSentAccess().getStatusKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompStatusSentAccess().getStatusKeyword_0()); 

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
    // $ANTLR end "rule__CompStatusSent__Group__0__Impl"


    // $ANTLR start "rule__CompStatusSent__Group__1"
    // InternalMyLanguage.g:2656:1: rule__CompStatusSent__Group__1 : rule__CompStatusSent__Group__1__Impl rule__CompStatusSent__Group__2 ;
    public final void rule__CompStatusSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2660:1: ( rule__CompStatusSent__Group__1__Impl rule__CompStatusSent__Group__2 )
            // InternalMyLanguage.g:2661:2: rule__CompStatusSent__Group__1__Impl rule__CompStatusSent__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CompStatusSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompStatusSent__Group__2();

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
    // $ANTLR end "rule__CompStatusSent__Group__1"


    // $ANTLR start "rule__CompStatusSent__Group__1__Impl"
    // InternalMyLanguage.g:2668:1: rule__CompStatusSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__CompStatusSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2672:1: ( ( 'is' ) )
            // InternalMyLanguage.g:2673:1: ( 'is' )
            {
            // InternalMyLanguage.g:2673:1: ( 'is' )
            // InternalMyLanguage.g:2674:2: 'is'
            {
             before(grammarAccess.getCompStatusSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompStatusSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__CompStatusSent__Group__1__Impl"


    // $ANTLR start "rule__CompStatusSent__Group__2"
    // InternalMyLanguage.g:2683:1: rule__CompStatusSent__Group__2 : rule__CompStatusSent__Group__2__Impl ;
    public final void rule__CompStatusSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2687:1: ( rule__CompStatusSent__Group__2__Impl )
            // InternalMyLanguage.g:2688:2: rule__CompStatusSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompStatusSent__Group__2__Impl();

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
    // $ANTLR end "rule__CompStatusSent__Group__2"


    // $ANTLR start "rule__CompStatusSent__Group__2__Impl"
    // InternalMyLanguage.g:2694:1: rule__CompStatusSent__Group__2__Impl : ( ( rule__CompStatusSent__StatusAssignment_2 ) ) ;
    public final void rule__CompStatusSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2698:1: ( ( ( rule__CompStatusSent__StatusAssignment_2 ) ) )
            // InternalMyLanguage.g:2699:1: ( ( rule__CompStatusSent__StatusAssignment_2 ) )
            {
            // InternalMyLanguage.g:2699:1: ( ( rule__CompStatusSent__StatusAssignment_2 ) )
            // InternalMyLanguage.g:2700:2: ( rule__CompStatusSent__StatusAssignment_2 )
            {
             before(grammarAccess.getCompStatusSentAccess().getStatusAssignment_2()); 
            // InternalMyLanguage.g:2701:2: ( rule__CompStatusSent__StatusAssignment_2 )
            // InternalMyLanguage.g:2701:3: rule__CompStatusSent__StatusAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompStatusSent__StatusAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompStatusSentAccess().getStatusAssignment_2()); 

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
    // $ANTLR end "rule__CompStatusSent__Group__2__Impl"


    // $ANTLR start "rule__GPSSent__Group__0"
    // InternalMyLanguage.g:2710:1: rule__GPSSent__Group__0 : rule__GPSSent__Group__0__Impl rule__GPSSent__Group__1 ;
    public final void rule__GPSSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2714:1: ( rule__GPSSent__Group__0__Impl rule__GPSSent__Group__1 )
            // InternalMyLanguage.g:2715:2: rule__GPSSent__Group__0__Impl rule__GPSSent__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__GPSSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GPSSent__Group__1();

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
    // $ANTLR end "rule__GPSSent__Group__0"


    // $ANTLR start "rule__GPSSent__Group__0__Impl"
    // InternalMyLanguage.g:2722:1: rule__GPSSent__Group__0__Impl : ( 'GPS' ) ;
    public final void rule__GPSSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2726:1: ( ( 'GPS' ) )
            // InternalMyLanguage.g:2727:1: ( 'GPS' )
            {
            // InternalMyLanguage.g:2727:1: ( 'GPS' )
            // InternalMyLanguage.g:2728:2: 'GPS'
            {
             before(grammarAccess.getGPSSentAccess().getGPSKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGPSSentAccess().getGPSKeyword_0()); 

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
    // $ANTLR end "rule__GPSSent__Group__0__Impl"


    // $ANTLR start "rule__GPSSent__Group__1"
    // InternalMyLanguage.g:2737:1: rule__GPSSent__Group__1 : rule__GPSSent__Group__1__Impl ;
    public final void rule__GPSSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2741:1: ( rule__GPSSent__Group__1__Impl )
            // InternalMyLanguage.g:2742:2: rule__GPSSent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GPSSent__Group__1__Impl();

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
    // $ANTLR end "rule__GPSSent__Group__1"


    // $ANTLR start "rule__GPSSent__Group__1__Impl"
    // InternalMyLanguage.g:2748:1: rule__GPSSent__Group__1__Impl : ( ( rule__GPSSent__SentAssignment_1 ) ) ;
    public final void rule__GPSSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2752:1: ( ( ( rule__GPSSent__SentAssignment_1 ) ) )
            // InternalMyLanguage.g:2753:1: ( ( rule__GPSSent__SentAssignment_1 ) )
            {
            // InternalMyLanguage.g:2753:1: ( ( rule__GPSSent__SentAssignment_1 ) )
            // InternalMyLanguage.g:2754:2: ( rule__GPSSent__SentAssignment_1 )
            {
             before(grammarAccess.getGPSSentAccess().getSentAssignment_1()); 
            // InternalMyLanguage.g:2755:2: ( rule__GPSSent__SentAssignment_1 )
            // InternalMyLanguage.g:2755:3: rule__GPSSent__SentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GPSSent__SentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGPSSentAccess().getSentAssignment_1()); 

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
    // $ANTLR end "rule__GPSSent__Group__1__Impl"


    // $ANTLR start "rule__GPSReadingSent__Group__0"
    // InternalMyLanguage.g:2764:1: rule__GPSReadingSent__Group__0 : rule__GPSReadingSent__Group__0__Impl rule__GPSReadingSent__Group__1 ;
    public final void rule__GPSReadingSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2768:1: ( rule__GPSReadingSent__Group__0__Impl rule__GPSReadingSent__Group__1 )
            // InternalMyLanguage.g:2769:2: rule__GPSReadingSent__Group__0__Impl rule__GPSReadingSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GPSReadingSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__Group__1();

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
    // $ANTLR end "rule__GPSReadingSent__Group__0"


    // $ANTLR start "rule__GPSReadingSent__Group__0__Impl"
    // InternalMyLanguage.g:2776:1: rule__GPSReadingSent__Group__0__Impl : ( 'positionReading' ) ;
    public final void rule__GPSReadingSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2780:1: ( ( 'positionReading' ) )
            // InternalMyLanguage.g:2781:1: ( 'positionReading' )
            {
            // InternalMyLanguage.g:2781:1: ( 'positionReading' )
            // InternalMyLanguage.g:2782:2: 'positionReading'
            {
             before(grammarAccess.getGPSReadingSentAccess().getPositionReadingKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGPSReadingSentAccess().getPositionReadingKeyword_0()); 

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
    // $ANTLR end "rule__GPSReadingSent__Group__0__Impl"


    // $ANTLR start "rule__GPSReadingSent__Group__1"
    // InternalMyLanguage.g:2791:1: rule__GPSReadingSent__Group__1 : rule__GPSReadingSent__Group__1__Impl rule__GPSReadingSent__Group__2 ;
    public final void rule__GPSReadingSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2795:1: ( rule__GPSReadingSent__Group__1__Impl rule__GPSReadingSent__Group__2 )
            // InternalMyLanguage.g:2796:2: rule__GPSReadingSent__Group__1__Impl rule__GPSReadingSent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__GPSReadingSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__Group__2();

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
    // $ANTLR end "rule__GPSReadingSent__Group__1"


    // $ANTLR start "rule__GPSReadingSent__Group__1__Impl"
    // InternalMyLanguage.g:2803:1: rule__GPSReadingSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__GPSReadingSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2807:1: ( ( 'is' ) )
            // InternalMyLanguage.g:2808:1: ( 'is' )
            {
            // InternalMyLanguage.g:2808:1: ( 'is' )
            // InternalMyLanguage.g:2809:2: 'is'
            {
             before(grammarAccess.getGPSReadingSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGPSReadingSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__GPSReadingSent__Group__1__Impl"


    // $ANTLR start "rule__GPSReadingSent__Group__2"
    // InternalMyLanguage.g:2818:1: rule__GPSReadingSent__Group__2 : rule__GPSReadingSent__Group__2__Impl rule__GPSReadingSent__Group__3 ;
    public final void rule__GPSReadingSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2822:1: ( rule__GPSReadingSent__Group__2__Impl rule__GPSReadingSent__Group__3 )
            // InternalMyLanguage.g:2823:2: rule__GPSReadingSent__Group__2__Impl rule__GPSReadingSent__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__GPSReadingSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__Group__3();

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
    // $ANTLR end "rule__GPSReadingSent__Group__2"


    // $ANTLR start "rule__GPSReadingSent__Group__2__Impl"
    // InternalMyLanguage.g:2830:1: rule__GPSReadingSent__Group__2__Impl : ( ( rule__GPSReadingSent__PosXAssignment_2 ) ) ;
    public final void rule__GPSReadingSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2834:1: ( ( ( rule__GPSReadingSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:2835:1: ( ( rule__GPSReadingSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:2835:1: ( ( rule__GPSReadingSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:2836:2: ( rule__GPSReadingSent__PosXAssignment_2 )
            {
             before(grammarAccess.getGPSReadingSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:2837:2: ( rule__GPSReadingSent__PosXAssignment_2 )
            // InternalMyLanguage.g:2837:3: rule__GPSReadingSent__PosXAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__PosXAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGPSReadingSentAccess().getPosXAssignment_2()); 

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
    // $ANTLR end "rule__GPSReadingSent__Group__2__Impl"


    // $ANTLR start "rule__GPSReadingSent__Group__3"
    // InternalMyLanguage.g:2845:1: rule__GPSReadingSent__Group__3 : rule__GPSReadingSent__Group__3__Impl rule__GPSReadingSent__Group__4 ;
    public final void rule__GPSReadingSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2849:1: ( rule__GPSReadingSent__Group__3__Impl rule__GPSReadingSent__Group__4 )
            // InternalMyLanguage.g:2850:2: rule__GPSReadingSent__Group__3__Impl rule__GPSReadingSent__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__GPSReadingSent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__Group__4();

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
    // $ANTLR end "rule__GPSReadingSent__Group__3"


    // $ANTLR start "rule__GPSReadingSent__Group__3__Impl"
    // InternalMyLanguage.g:2857:1: rule__GPSReadingSent__Group__3__Impl : ( ( rule__GPSReadingSent__PosYAssignment_3 ) ) ;
    public final void rule__GPSReadingSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2861:1: ( ( ( rule__GPSReadingSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:2862:1: ( ( rule__GPSReadingSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:2862:1: ( ( rule__GPSReadingSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:2863:2: ( rule__GPSReadingSent__PosYAssignment_3 )
            {
             before(grammarAccess.getGPSReadingSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:2864:2: ( rule__GPSReadingSent__PosYAssignment_3 )
            // InternalMyLanguage.g:2864:3: rule__GPSReadingSent__PosYAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__PosYAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGPSReadingSentAccess().getPosYAssignment_3()); 

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
    // $ANTLR end "rule__GPSReadingSent__Group__3__Impl"


    // $ANTLR start "rule__GPSReadingSent__Group__4"
    // InternalMyLanguage.g:2872:1: rule__GPSReadingSent__Group__4 : rule__GPSReadingSent__Group__4__Impl rule__GPSReadingSent__Group__5 ;
    public final void rule__GPSReadingSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2876:1: ( rule__GPSReadingSent__Group__4__Impl rule__GPSReadingSent__Group__5 )
            // InternalMyLanguage.g:2877:2: rule__GPSReadingSent__Group__4__Impl rule__GPSReadingSent__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__GPSReadingSent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__Group__5();

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
    // $ANTLR end "rule__GPSReadingSent__Group__4"


    // $ANTLR start "rule__GPSReadingSent__Group__4__Impl"
    // InternalMyLanguage.g:2884:1: rule__GPSReadingSent__Group__4__Impl : ( ( rule__GPSReadingSent__PosZAssignment_4 ) ) ;
    public final void rule__GPSReadingSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2888:1: ( ( ( rule__GPSReadingSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:2889:1: ( ( rule__GPSReadingSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:2889:1: ( ( rule__GPSReadingSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:2890:2: ( rule__GPSReadingSent__PosZAssignment_4 )
            {
             before(grammarAccess.getGPSReadingSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:2891:2: ( rule__GPSReadingSent__PosZAssignment_4 )
            // InternalMyLanguage.g:2891:3: rule__GPSReadingSent__PosZAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__PosZAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGPSReadingSentAccess().getPosZAssignment_4()); 

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
    // $ANTLR end "rule__GPSReadingSent__Group__4__Impl"


    // $ANTLR start "rule__GPSReadingSent__Group__5"
    // InternalMyLanguage.g:2899:1: rule__GPSReadingSent__Group__5 : rule__GPSReadingSent__Group__5__Impl ;
    public final void rule__GPSReadingSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2903:1: ( rule__GPSReadingSent__Group__5__Impl )
            // InternalMyLanguage.g:2904:2: rule__GPSReadingSent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__Group__5__Impl();

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
    // $ANTLR end "rule__GPSReadingSent__Group__5"


    // $ANTLR start "rule__GPSReadingSent__Group__5__Impl"
    // InternalMyLanguage.g:2910:1: rule__GPSReadingSent__Group__5__Impl : ( ( rule__GPSReadingSent__ToleranceAssignment_5 )? ) ;
    public final void rule__GPSReadingSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2914:1: ( ( ( rule__GPSReadingSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:2915:1: ( ( rule__GPSReadingSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:2915:1: ( ( rule__GPSReadingSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:2916:2: ( rule__GPSReadingSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getGPSReadingSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:2917:2: ( rule__GPSReadingSent__ToleranceAssignment_5 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==61) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyLanguage.g:2917:3: rule__GPSReadingSent__ToleranceAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__GPSReadingSent__ToleranceAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGPSReadingSentAccess().getToleranceAssignment_5()); 

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
    // $ANTLR end "rule__GPSReadingSent__Group__5__Impl"


    // $ANTLR start "rule__BaroSent__Group__0"
    // InternalMyLanguage.g:2926:1: rule__BaroSent__Group__0 : rule__BaroSent__Group__0__Impl rule__BaroSent__Group__1 ;
    public final void rule__BaroSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2930:1: ( rule__BaroSent__Group__0__Impl rule__BaroSent__Group__1 )
            // InternalMyLanguage.g:2931:2: rule__BaroSent__Group__0__Impl rule__BaroSent__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__BaroSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaroSent__Group__1();

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
    // $ANTLR end "rule__BaroSent__Group__0"


    // $ANTLR start "rule__BaroSent__Group__0__Impl"
    // InternalMyLanguage.g:2938:1: rule__BaroSent__Group__0__Impl : ( 'Barometer' ) ;
    public final void rule__BaroSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2942:1: ( ( 'Barometer' ) )
            // InternalMyLanguage.g:2943:1: ( 'Barometer' )
            {
            // InternalMyLanguage.g:2943:1: ( 'Barometer' )
            // InternalMyLanguage.g:2944:2: 'Barometer'
            {
             before(grammarAccess.getBaroSentAccess().getBarometerKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBaroSentAccess().getBarometerKeyword_0()); 

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
    // $ANTLR end "rule__BaroSent__Group__0__Impl"


    // $ANTLR start "rule__BaroSent__Group__1"
    // InternalMyLanguage.g:2953:1: rule__BaroSent__Group__1 : rule__BaroSent__Group__1__Impl ;
    public final void rule__BaroSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2957:1: ( rule__BaroSent__Group__1__Impl )
            // InternalMyLanguage.g:2958:2: rule__BaroSent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaroSent__Group__1__Impl();

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
    // $ANTLR end "rule__BaroSent__Group__1"


    // $ANTLR start "rule__BaroSent__Group__1__Impl"
    // InternalMyLanguage.g:2964:1: rule__BaroSent__Group__1__Impl : ( ( rule__BaroSent__SentAssignment_1 ) ) ;
    public final void rule__BaroSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2968:1: ( ( ( rule__BaroSent__SentAssignment_1 ) ) )
            // InternalMyLanguage.g:2969:1: ( ( rule__BaroSent__SentAssignment_1 ) )
            {
            // InternalMyLanguage.g:2969:1: ( ( rule__BaroSent__SentAssignment_1 ) )
            // InternalMyLanguage.g:2970:2: ( rule__BaroSent__SentAssignment_1 )
            {
             before(grammarAccess.getBaroSentAccess().getSentAssignment_1()); 
            // InternalMyLanguage.g:2971:2: ( rule__BaroSent__SentAssignment_1 )
            // InternalMyLanguage.g:2971:3: rule__BaroSent__SentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BaroSent__SentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBaroSentAccess().getSentAssignment_1()); 

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
    // $ANTLR end "rule__BaroSent__Group__1__Impl"


    // $ANTLR start "rule__BaroAltSent__Group__0"
    // InternalMyLanguage.g:2980:1: rule__BaroAltSent__Group__0 : rule__BaroAltSent__Group__0__Impl rule__BaroAltSent__Group__1 ;
    public final void rule__BaroAltSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2984:1: ( rule__BaroAltSent__Group__0__Impl rule__BaroAltSent__Group__1 )
            // InternalMyLanguage.g:2985:2: rule__BaroAltSent__Group__0__Impl rule__BaroAltSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BaroAltSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaroAltSent__Group__1();

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
    // $ANTLR end "rule__BaroAltSent__Group__0"


    // $ANTLR start "rule__BaroAltSent__Group__0__Impl"
    // InternalMyLanguage.g:2992:1: rule__BaroAltSent__Group__0__Impl : ( 'altitudereading' ) ;
    public final void rule__BaroAltSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2996:1: ( ( 'altitudereading' ) )
            // InternalMyLanguage.g:2997:1: ( 'altitudereading' )
            {
            // InternalMyLanguage.g:2997:1: ( 'altitudereading' )
            // InternalMyLanguage.g:2998:2: 'altitudereading'
            {
             before(grammarAccess.getBaroAltSentAccess().getAltitudereadingKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBaroAltSentAccess().getAltitudereadingKeyword_0()); 

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
    // $ANTLR end "rule__BaroAltSent__Group__0__Impl"


    // $ANTLR start "rule__BaroAltSent__Group__1"
    // InternalMyLanguage.g:3007:1: rule__BaroAltSent__Group__1 : rule__BaroAltSent__Group__1__Impl rule__BaroAltSent__Group__2 ;
    public final void rule__BaroAltSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3011:1: ( rule__BaroAltSent__Group__1__Impl rule__BaroAltSent__Group__2 )
            // InternalMyLanguage.g:3012:2: rule__BaroAltSent__Group__1__Impl rule__BaroAltSent__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__BaroAltSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaroAltSent__Group__2();

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
    // $ANTLR end "rule__BaroAltSent__Group__1"


    // $ANTLR start "rule__BaroAltSent__Group__1__Impl"
    // InternalMyLanguage.g:3019:1: rule__BaroAltSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__BaroAltSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3023:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3024:1: ( 'is' )
            {
            // InternalMyLanguage.g:3024:1: ( 'is' )
            // InternalMyLanguage.g:3025:2: 'is'
            {
             before(grammarAccess.getBaroAltSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBaroAltSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__BaroAltSent__Group__1__Impl"


    // $ANTLR start "rule__BaroAltSent__Group__2"
    // InternalMyLanguage.g:3034:1: rule__BaroAltSent__Group__2 : rule__BaroAltSent__Group__2__Impl ;
    public final void rule__BaroAltSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3038:1: ( rule__BaroAltSent__Group__2__Impl )
            // InternalMyLanguage.g:3039:2: rule__BaroAltSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaroAltSent__Group__2__Impl();

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
    // $ANTLR end "rule__BaroAltSent__Group__2"


    // $ANTLR start "rule__BaroAltSent__Group__2__Impl"
    // InternalMyLanguage.g:3045:1: rule__BaroAltSent__Group__2__Impl : ( ( rule__BaroAltSent__SentAssignment_2 ) ) ;
    public final void rule__BaroAltSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3049:1: ( ( ( rule__BaroAltSent__SentAssignment_2 ) ) )
            // InternalMyLanguage.g:3050:1: ( ( rule__BaroAltSent__SentAssignment_2 ) )
            {
            // InternalMyLanguage.g:3050:1: ( ( rule__BaroAltSent__SentAssignment_2 ) )
            // InternalMyLanguage.g:3051:2: ( rule__BaroAltSent__SentAssignment_2 )
            {
             before(grammarAccess.getBaroAltSentAccess().getSentAssignment_2()); 
            // InternalMyLanguage.g:3052:2: ( rule__BaroAltSent__SentAssignment_2 )
            // InternalMyLanguage.g:3052:3: rule__BaroAltSent__SentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BaroAltSent__SentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaroAltSentAccess().getSentAssignment_2()); 

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
    // $ANTLR end "rule__BaroAltSent__Group__2__Impl"


    // $ANTLR start "rule__SonarSent__Group__0"
    // InternalMyLanguage.g:3061:1: rule__SonarSent__Group__0 : rule__SonarSent__Group__0__Impl rule__SonarSent__Group__1 ;
    public final void rule__SonarSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3065:1: ( rule__SonarSent__Group__0__Impl rule__SonarSent__Group__1 )
            // InternalMyLanguage.g:3066:2: rule__SonarSent__Group__0__Impl rule__SonarSent__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SonarSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SonarSent__Group__1();

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
    // $ANTLR end "rule__SonarSent__Group__0"


    // $ANTLR start "rule__SonarSent__Group__0__Impl"
    // InternalMyLanguage.g:3073:1: rule__SonarSent__Group__0__Impl : ( 'Sonar' ) ;
    public final void rule__SonarSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3077:1: ( ( 'Sonar' ) )
            // InternalMyLanguage.g:3078:1: ( 'Sonar' )
            {
            // InternalMyLanguage.g:3078:1: ( 'Sonar' )
            // InternalMyLanguage.g:3079:2: 'Sonar'
            {
             before(grammarAccess.getSonarSentAccess().getSonarKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSonarSentAccess().getSonarKeyword_0()); 

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
    // $ANTLR end "rule__SonarSent__Group__0__Impl"


    // $ANTLR start "rule__SonarSent__Group__1"
    // InternalMyLanguage.g:3088:1: rule__SonarSent__Group__1 : rule__SonarSent__Group__1__Impl ;
    public final void rule__SonarSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3092:1: ( rule__SonarSent__Group__1__Impl )
            // InternalMyLanguage.g:3093:2: rule__SonarSent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SonarSent__Group__1__Impl();

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
    // $ANTLR end "rule__SonarSent__Group__1"


    // $ANTLR start "rule__SonarSent__Group__1__Impl"
    // InternalMyLanguage.g:3099:1: rule__SonarSent__Group__1__Impl : ( ( rule__SonarSent__SentAssignment_1 ) ) ;
    public final void rule__SonarSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3103:1: ( ( ( rule__SonarSent__SentAssignment_1 ) ) )
            // InternalMyLanguage.g:3104:1: ( ( rule__SonarSent__SentAssignment_1 ) )
            {
            // InternalMyLanguage.g:3104:1: ( ( rule__SonarSent__SentAssignment_1 ) )
            // InternalMyLanguage.g:3105:2: ( rule__SonarSent__SentAssignment_1 )
            {
             before(grammarAccess.getSonarSentAccess().getSentAssignment_1()); 
            // InternalMyLanguage.g:3106:2: ( rule__SonarSent__SentAssignment_1 )
            // InternalMyLanguage.g:3106:3: rule__SonarSent__SentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SonarSent__SentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSonarSentAccess().getSentAssignment_1()); 

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
    // $ANTLR end "rule__SonarSent__Group__1__Impl"


    // $ANTLR start "rule__SonarDistanceSent__Group__0"
    // InternalMyLanguage.g:3115:1: rule__SonarDistanceSent__Group__0 : rule__SonarDistanceSent__Group__0__Impl rule__SonarDistanceSent__Group__1 ;
    public final void rule__SonarDistanceSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3119:1: ( rule__SonarDistanceSent__Group__0__Impl rule__SonarDistanceSent__Group__1 )
            // InternalMyLanguage.g:3120:2: rule__SonarDistanceSent__Group__0__Impl rule__SonarDistanceSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SonarDistanceSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SonarDistanceSent__Group__1();

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
    // $ANTLR end "rule__SonarDistanceSent__Group__0"


    // $ANTLR start "rule__SonarDistanceSent__Group__0__Impl"
    // InternalMyLanguage.g:3127:1: rule__SonarDistanceSent__Group__0__Impl : ( 'distancereading' ) ;
    public final void rule__SonarDistanceSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3131:1: ( ( 'distancereading' ) )
            // InternalMyLanguage.g:3132:1: ( 'distancereading' )
            {
            // InternalMyLanguage.g:3132:1: ( 'distancereading' )
            // InternalMyLanguage.g:3133:2: 'distancereading'
            {
             before(grammarAccess.getSonarDistanceSentAccess().getDistancereadingKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSonarDistanceSentAccess().getDistancereadingKeyword_0()); 

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
    // $ANTLR end "rule__SonarDistanceSent__Group__0__Impl"


    // $ANTLR start "rule__SonarDistanceSent__Group__1"
    // InternalMyLanguage.g:3142:1: rule__SonarDistanceSent__Group__1 : rule__SonarDistanceSent__Group__1__Impl rule__SonarDistanceSent__Group__2 ;
    public final void rule__SonarDistanceSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3146:1: ( rule__SonarDistanceSent__Group__1__Impl rule__SonarDistanceSent__Group__2 )
            // InternalMyLanguage.g:3147:2: rule__SonarDistanceSent__Group__1__Impl rule__SonarDistanceSent__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SonarDistanceSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SonarDistanceSent__Group__2();

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
    // $ANTLR end "rule__SonarDistanceSent__Group__1"


    // $ANTLR start "rule__SonarDistanceSent__Group__1__Impl"
    // InternalMyLanguage.g:3154:1: rule__SonarDistanceSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__SonarDistanceSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3158:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3159:1: ( 'is' )
            {
            // InternalMyLanguage.g:3159:1: ( 'is' )
            // InternalMyLanguage.g:3160:2: 'is'
            {
             before(grammarAccess.getSonarDistanceSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSonarDistanceSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__SonarDistanceSent__Group__1__Impl"


    // $ANTLR start "rule__SonarDistanceSent__Group__2"
    // InternalMyLanguage.g:3169:1: rule__SonarDistanceSent__Group__2 : rule__SonarDistanceSent__Group__2__Impl ;
    public final void rule__SonarDistanceSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3173:1: ( rule__SonarDistanceSent__Group__2__Impl )
            // InternalMyLanguage.g:3174:2: rule__SonarDistanceSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SonarDistanceSent__Group__2__Impl();

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
    // $ANTLR end "rule__SonarDistanceSent__Group__2"


    // $ANTLR start "rule__SonarDistanceSent__Group__2__Impl"
    // InternalMyLanguage.g:3180:1: rule__SonarDistanceSent__Group__2__Impl : ( ( rule__SonarDistanceSent__SentAssignment_2 ) ) ;
    public final void rule__SonarDistanceSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3184:1: ( ( ( rule__SonarDistanceSent__SentAssignment_2 ) ) )
            // InternalMyLanguage.g:3185:1: ( ( rule__SonarDistanceSent__SentAssignment_2 ) )
            {
            // InternalMyLanguage.g:3185:1: ( ( rule__SonarDistanceSent__SentAssignment_2 ) )
            // InternalMyLanguage.g:3186:2: ( rule__SonarDistanceSent__SentAssignment_2 )
            {
             before(grammarAccess.getSonarDistanceSentAccess().getSentAssignment_2()); 
            // InternalMyLanguage.g:3187:2: ( rule__SonarDistanceSent__SentAssignment_2 )
            // InternalMyLanguage.g:3187:3: rule__SonarDistanceSent__SentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SonarDistanceSent__SentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSonarDistanceSentAccess().getSentAssignment_2()); 

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
    // $ANTLR end "rule__SonarDistanceSent__Group__2__Impl"


    // $ANTLR start "rule__NotificationSent__Group__0"
    // InternalMyLanguage.g:3196:1: rule__NotificationSent__Group__0 : rule__NotificationSent__Group__0__Impl rule__NotificationSent__Group__1 ;
    public final void rule__NotificationSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3200:1: ( rule__NotificationSent__Group__0__Impl rule__NotificationSent__Group__1 )
            // InternalMyLanguage.g:3201:2: rule__NotificationSent__Group__0__Impl rule__NotificationSent__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__NotificationSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotificationSent__Group__1();

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
    // $ANTLR end "rule__NotificationSent__Group__0"


    // $ANTLR start "rule__NotificationSent__Group__0__Impl"
    // InternalMyLanguage.g:3208:1: rule__NotificationSent__Group__0__Impl : ( ( rule__NotificationSent__NotAssignment_0 ) ) ;
    public final void rule__NotificationSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3212:1: ( ( ( rule__NotificationSent__NotAssignment_0 ) ) )
            // InternalMyLanguage.g:3213:1: ( ( rule__NotificationSent__NotAssignment_0 ) )
            {
            // InternalMyLanguage.g:3213:1: ( ( rule__NotificationSent__NotAssignment_0 ) )
            // InternalMyLanguage.g:3214:2: ( rule__NotificationSent__NotAssignment_0 )
            {
             before(grammarAccess.getNotificationSentAccess().getNotAssignment_0()); 
            // InternalMyLanguage.g:3215:2: ( rule__NotificationSent__NotAssignment_0 )
            // InternalMyLanguage.g:3215:3: rule__NotificationSent__NotAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NotificationSent__NotAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNotificationSentAccess().getNotAssignment_0()); 

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
    // $ANTLR end "rule__NotificationSent__Group__0__Impl"


    // $ANTLR start "rule__NotificationSent__Group__1"
    // InternalMyLanguage.g:3223:1: rule__NotificationSent__Group__1 : rule__NotificationSent__Group__1__Impl rule__NotificationSent__Group__2 ;
    public final void rule__NotificationSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3227:1: ( rule__NotificationSent__Group__1__Impl rule__NotificationSent__Group__2 )
            // InternalMyLanguage.g:3228:2: rule__NotificationSent__Group__1__Impl rule__NotificationSent__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__NotificationSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotificationSent__Group__2();

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
    // $ANTLR end "rule__NotificationSent__Group__1"


    // $ANTLR start "rule__NotificationSent__Group__1__Impl"
    // InternalMyLanguage.g:3235:1: rule__NotificationSent__Group__1__Impl : ( 'status' ) ;
    public final void rule__NotificationSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3239:1: ( ( 'status' ) )
            // InternalMyLanguage.g:3240:1: ( 'status' )
            {
            // InternalMyLanguage.g:3240:1: ( 'status' )
            // InternalMyLanguage.g:3241:2: 'status'
            {
             before(grammarAccess.getNotificationSentAccess().getStatusKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNotificationSentAccess().getStatusKeyword_1()); 

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
    // $ANTLR end "rule__NotificationSent__Group__1__Impl"


    // $ANTLR start "rule__NotificationSent__Group__2"
    // InternalMyLanguage.g:3250:1: rule__NotificationSent__Group__2 : rule__NotificationSent__Group__2__Impl rule__NotificationSent__Group__3 ;
    public final void rule__NotificationSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3254:1: ( rule__NotificationSent__Group__2__Impl rule__NotificationSent__Group__3 )
            // InternalMyLanguage.g:3255:2: rule__NotificationSent__Group__2__Impl rule__NotificationSent__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__NotificationSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotificationSent__Group__3();

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
    // $ANTLR end "rule__NotificationSent__Group__2"


    // $ANTLR start "rule__NotificationSent__Group__2__Impl"
    // InternalMyLanguage.g:3262:1: rule__NotificationSent__Group__2__Impl : ( 'is' ) ;
    public final void rule__NotificationSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3266:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3267:1: ( 'is' )
            {
            // InternalMyLanguage.g:3267:1: ( 'is' )
            // InternalMyLanguage.g:3268:2: 'is'
            {
             before(grammarAccess.getNotificationSentAccess().getIsKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNotificationSentAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__NotificationSent__Group__2__Impl"


    // $ANTLR start "rule__NotificationSent__Group__3"
    // InternalMyLanguage.g:3277:1: rule__NotificationSent__Group__3 : rule__NotificationSent__Group__3__Impl ;
    public final void rule__NotificationSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3281:1: ( rule__NotificationSent__Group__3__Impl )
            // InternalMyLanguage.g:3282:2: rule__NotificationSent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotificationSent__Group__3__Impl();

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
    // $ANTLR end "rule__NotificationSent__Group__3"


    // $ANTLR start "rule__NotificationSent__Group__3__Impl"
    // InternalMyLanguage.g:3288:1: rule__NotificationSent__Group__3__Impl : ( 'sent' ) ;
    public final void rule__NotificationSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3292:1: ( ( 'sent' ) )
            // InternalMyLanguage.g:3293:1: ( 'sent' )
            {
            // InternalMyLanguage.g:3293:1: ( 'sent' )
            // InternalMyLanguage.g:3294:2: 'sent'
            {
             before(grammarAccess.getNotificationSentAccess().getSentKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNotificationSentAccess().getSentKeyword_3()); 

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
    // $ANTLR end "rule__NotificationSent__Group__3__Impl"


    // $ANTLR start "rule__TimeSent__Group__0"
    // InternalMyLanguage.g:3304:1: rule__TimeSent__Group__0 : rule__TimeSent__Group__0__Impl rule__TimeSent__Group__1 ;
    public final void rule__TimeSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3308:1: ( rule__TimeSent__Group__0__Impl rule__TimeSent__Group__1 )
            // InternalMyLanguage.g:3309:2: rule__TimeSent__Group__0__Impl rule__TimeSent__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TimeSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSent__Group__1();

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
    // $ANTLR end "rule__TimeSent__Group__0"


    // $ANTLR start "rule__TimeSent__Group__0__Impl"
    // InternalMyLanguage.g:3316:1: rule__TimeSent__Group__0__Impl : ( 'Time' ) ;
    public final void rule__TimeSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3320:1: ( ( 'Time' ) )
            // InternalMyLanguage.g:3321:1: ( 'Time' )
            {
            // InternalMyLanguage.g:3321:1: ( 'Time' )
            // InternalMyLanguage.g:3322:2: 'Time'
            {
             before(grammarAccess.getTimeSentAccess().getTimeKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTimeSentAccess().getTimeKeyword_0()); 

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
    // $ANTLR end "rule__TimeSent__Group__0__Impl"


    // $ANTLR start "rule__TimeSent__Group__1"
    // InternalMyLanguage.g:3331:1: rule__TimeSent__Group__1 : rule__TimeSent__Group__1__Impl ;
    public final void rule__TimeSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3335:1: ( rule__TimeSent__Group__1__Impl )
            // InternalMyLanguage.g:3336:2: rule__TimeSent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeSent__Group__1__Impl();

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
    // $ANTLR end "rule__TimeSent__Group__1"


    // $ANTLR start "rule__TimeSent__Group__1__Impl"
    // InternalMyLanguage.g:3342:1: rule__TimeSent__Group__1__Impl : ( ruleTimeInterval ) ;
    public final void rule__TimeSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3346:1: ( ( ruleTimeInterval ) )
            // InternalMyLanguage.g:3347:1: ( ruleTimeInterval )
            {
            // InternalMyLanguage.g:3347:1: ( ruleTimeInterval )
            // InternalMyLanguage.g:3348:2: ruleTimeInterval
            {
             before(grammarAccess.getTimeSentAccess().getTimeIntervalParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTimeInterval();

            state._fsp--;

             after(grammarAccess.getTimeSentAccess().getTimeIntervalParserRuleCall_1()); 

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
    // $ANTLR end "rule__TimeSent__Group__1__Impl"


    // $ANTLR start "rule__TimeInterval__Group__0"
    // InternalMyLanguage.g:3358:1: rule__TimeInterval__Group__0 : rule__TimeInterval__Group__0__Impl rule__TimeInterval__Group__1 ;
    public final void rule__TimeInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3362:1: ( rule__TimeInterval__Group__0__Impl rule__TimeInterval__Group__1 )
            // InternalMyLanguage.g:3363:2: rule__TimeInterval__Group__0__Impl rule__TimeInterval__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__TimeInterval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeInterval__Group__1();

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
    // $ANTLR end "rule__TimeInterval__Group__0"


    // $ANTLR start "rule__TimeInterval__Group__0__Impl"
    // InternalMyLanguage.g:3370:1: rule__TimeInterval__Group__0__Impl : ( 'interval' ) ;
    public final void rule__TimeInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3374:1: ( ( 'interval' ) )
            // InternalMyLanguage.g:3375:1: ( 'interval' )
            {
            // InternalMyLanguage.g:3375:1: ( 'interval' )
            // InternalMyLanguage.g:3376:2: 'interval'
            {
             before(grammarAccess.getTimeIntervalAccess().getIntervalKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTimeIntervalAccess().getIntervalKeyword_0()); 

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
    // $ANTLR end "rule__TimeInterval__Group__0__Impl"


    // $ANTLR start "rule__TimeInterval__Group__1"
    // InternalMyLanguage.g:3385:1: rule__TimeInterval__Group__1 : rule__TimeInterval__Group__1__Impl rule__TimeInterval__Group__2 ;
    public final void rule__TimeInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3389:1: ( rule__TimeInterval__Group__1__Impl rule__TimeInterval__Group__2 )
            // InternalMyLanguage.g:3390:2: rule__TimeInterval__Group__1__Impl rule__TimeInterval__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__TimeInterval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeInterval__Group__2();

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
    // $ANTLR end "rule__TimeInterval__Group__1"


    // $ANTLR start "rule__TimeInterval__Group__1__Impl"
    // InternalMyLanguage.g:3397:1: rule__TimeInterval__Group__1__Impl : ( 'in' ) ;
    public final void rule__TimeInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3401:1: ( ( 'in' ) )
            // InternalMyLanguage.g:3402:1: ( 'in' )
            {
            // InternalMyLanguage.g:3402:1: ( 'in' )
            // InternalMyLanguage.g:3403:2: 'in'
            {
             before(grammarAccess.getTimeIntervalAccess().getInKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTimeIntervalAccess().getInKeyword_1()); 

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
    // $ANTLR end "rule__TimeInterval__Group__1__Impl"


    // $ANTLR start "rule__TimeInterval__Group__2"
    // InternalMyLanguage.g:3412:1: rule__TimeInterval__Group__2 : rule__TimeInterval__Group__2__Impl rule__TimeInterval__Group__3 ;
    public final void rule__TimeInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3416:1: ( rule__TimeInterval__Group__2__Impl rule__TimeInterval__Group__3 )
            // InternalMyLanguage.g:3417:2: rule__TimeInterval__Group__2__Impl rule__TimeInterval__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__TimeInterval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeInterval__Group__3();

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
    // $ANTLR end "rule__TimeInterval__Group__2"


    // $ANTLR start "rule__TimeInterval__Group__2__Impl"
    // InternalMyLanguage.g:3424:1: rule__TimeInterval__Group__2__Impl : ( '[' ) ;
    public final void rule__TimeInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3428:1: ( ( '[' ) )
            // InternalMyLanguage.g:3429:1: ( '[' )
            {
            // InternalMyLanguage.g:3429:1: ( '[' )
            // InternalMyLanguage.g:3430:2: '['
            {
             before(grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__TimeInterval__Group__2__Impl"


    // $ANTLR start "rule__TimeInterval__Group__3"
    // InternalMyLanguage.g:3439:1: rule__TimeInterval__Group__3 : rule__TimeInterval__Group__3__Impl rule__TimeInterval__Group__4 ;
    public final void rule__TimeInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3443:1: ( rule__TimeInterval__Group__3__Impl rule__TimeInterval__Group__4 )
            // InternalMyLanguage.g:3444:2: rule__TimeInterval__Group__3__Impl rule__TimeInterval__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__TimeInterval__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeInterval__Group__4();

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
    // $ANTLR end "rule__TimeInterval__Group__3"


    // $ANTLR start "rule__TimeInterval__Group__3__Impl"
    // InternalMyLanguage.g:3451:1: rule__TimeInterval__Group__3__Impl : ( ( rule__TimeInterval__FirstAssignment_3 ) ) ;
    public final void rule__TimeInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3455:1: ( ( ( rule__TimeInterval__FirstAssignment_3 ) ) )
            // InternalMyLanguage.g:3456:1: ( ( rule__TimeInterval__FirstAssignment_3 ) )
            {
            // InternalMyLanguage.g:3456:1: ( ( rule__TimeInterval__FirstAssignment_3 ) )
            // InternalMyLanguage.g:3457:2: ( rule__TimeInterval__FirstAssignment_3 )
            {
             before(grammarAccess.getTimeIntervalAccess().getFirstAssignment_3()); 
            // InternalMyLanguage.g:3458:2: ( rule__TimeInterval__FirstAssignment_3 )
            // InternalMyLanguage.g:3458:3: rule__TimeInterval__FirstAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TimeInterval__FirstAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTimeIntervalAccess().getFirstAssignment_3()); 

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
    // $ANTLR end "rule__TimeInterval__Group__3__Impl"


    // $ANTLR start "rule__TimeInterval__Group__4"
    // InternalMyLanguage.g:3466:1: rule__TimeInterval__Group__4 : rule__TimeInterval__Group__4__Impl rule__TimeInterval__Group__5 ;
    public final void rule__TimeInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3470:1: ( rule__TimeInterval__Group__4__Impl rule__TimeInterval__Group__5 )
            // InternalMyLanguage.g:3471:2: rule__TimeInterval__Group__4__Impl rule__TimeInterval__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__TimeInterval__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeInterval__Group__5();

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
    // $ANTLR end "rule__TimeInterval__Group__4"


    // $ANTLR start "rule__TimeInterval__Group__4__Impl"
    // InternalMyLanguage.g:3478:1: rule__TimeInterval__Group__4__Impl : ( ',' ) ;
    public final void rule__TimeInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3482:1: ( ( ',' ) )
            // InternalMyLanguage.g:3483:1: ( ',' )
            {
            // InternalMyLanguage.g:3483:1: ( ',' )
            // InternalMyLanguage.g:3484:2: ','
            {
             before(grammarAccess.getTimeIntervalAccess().getCommaKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTimeIntervalAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__TimeInterval__Group__4__Impl"


    // $ANTLR start "rule__TimeInterval__Group__5"
    // InternalMyLanguage.g:3493:1: rule__TimeInterval__Group__5 : rule__TimeInterval__Group__5__Impl rule__TimeInterval__Group__6 ;
    public final void rule__TimeInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3497:1: ( rule__TimeInterval__Group__5__Impl rule__TimeInterval__Group__6 )
            // InternalMyLanguage.g:3498:2: rule__TimeInterval__Group__5__Impl rule__TimeInterval__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__TimeInterval__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeInterval__Group__6();

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
    // $ANTLR end "rule__TimeInterval__Group__5"


    // $ANTLR start "rule__TimeInterval__Group__5__Impl"
    // InternalMyLanguage.g:3505:1: rule__TimeInterval__Group__5__Impl : ( ( rule__TimeInterval__SecondAssignment_5 ) ) ;
    public final void rule__TimeInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3509:1: ( ( ( rule__TimeInterval__SecondAssignment_5 ) ) )
            // InternalMyLanguage.g:3510:1: ( ( rule__TimeInterval__SecondAssignment_5 ) )
            {
            // InternalMyLanguage.g:3510:1: ( ( rule__TimeInterval__SecondAssignment_5 ) )
            // InternalMyLanguage.g:3511:2: ( rule__TimeInterval__SecondAssignment_5 )
            {
             before(grammarAccess.getTimeIntervalAccess().getSecondAssignment_5()); 
            // InternalMyLanguage.g:3512:2: ( rule__TimeInterval__SecondAssignment_5 )
            // InternalMyLanguage.g:3512:3: rule__TimeInterval__SecondAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TimeInterval__SecondAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTimeIntervalAccess().getSecondAssignment_5()); 

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
    // $ANTLR end "rule__TimeInterval__Group__5__Impl"


    // $ANTLR start "rule__TimeInterval__Group__6"
    // InternalMyLanguage.g:3520:1: rule__TimeInterval__Group__6 : rule__TimeInterval__Group__6__Impl ;
    public final void rule__TimeInterval__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3524:1: ( rule__TimeInterval__Group__6__Impl )
            // InternalMyLanguage.g:3525:2: rule__TimeInterval__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeInterval__Group__6__Impl();

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
    // $ANTLR end "rule__TimeInterval__Group__6"


    // $ANTLR start "rule__TimeInterval__Group__6__Impl"
    // InternalMyLanguage.g:3531:1: rule__TimeInterval__Group__6__Impl : ( ']' ) ;
    public final void rule__TimeInterval__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3535:1: ( ( ']' ) )
            // InternalMyLanguage.g:3536:1: ( ']' )
            {
            // InternalMyLanguage.g:3536:1: ( ']' )
            // InternalMyLanguage.g:3537:2: ']'
            {
             before(grammarAccess.getTimeIntervalAccess().getRightSquareBracketKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTimeIntervalAccess().getRightSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__TimeInterval__Group__6__Impl"


    // $ANTLR start "rule__BatterySent__Group__0"
    // InternalMyLanguage.g:3547:1: rule__BatterySent__Group__0 : rule__BatterySent__Group__0__Impl rule__BatterySent__Group__1 ;
    public final void rule__BatterySent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3551:1: ( rule__BatterySent__Group__0__Impl rule__BatterySent__Group__1 )
            // InternalMyLanguage.g:3552:2: rule__BatterySent__Group__0__Impl rule__BatterySent__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__BatterySent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatterySent__Group__1();

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
    // $ANTLR end "rule__BatterySent__Group__0"


    // $ANTLR start "rule__BatterySent__Group__0__Impl"
    // InternalMyLanguage.g:3559:1: rule__BatterySent__Group__0__Impl : ( 'Battery' ) ;
    public final void rule__BatterySent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3563:1: ( ( 'Battery' ) )
            // InternalMyLanguage.g:3564:1: ( 'Battery' )
            {
            // InternalMyLanguage.g:3564:1: ( 'Battery' )
            // InternalMyLanguage.g:3565:2: 'Battery'
            {
             before(grammarAccess.getBatterySentAccess().getBatteryKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBatterySentAccess().getBatteryKeyword_0()); 

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
    // $ANTLR end "rule__BatterySent__Group__0__Impl"


    // $ANTLR start "rule__BatterySent__Group__1"
    // InternalMyLanguage.g:3574:1: rule__BatterySent__Group__1 : rule__BatterySent__Group__1__Impl ;
    public final void rule__BatterySent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3578:1: ( rule__BatterySent__Group__1__Impl )
            // InternalMyLanguage.g:3579:2: rule__BatterySent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BatterySent__Group__1__Impl();

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
    // $ANTLR end "rule__BatterySent__Group__1"


    // $ANTLR start "rule__BatterySent__Group__1__Impl"
    // InternalMyLanguage.g:3585:1: rule__BatterySent__Group__1__Impl : ( ( rule__BatterySent__SentAssignment_1 ) ) ;
    public final void rule__BatterySent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3589:1: ( ( ( rule__BatterySent__SentAssignment_1 ) ) )
            // InternalMyLanguage.g:3590:1: ( ( rule__BatterySent__SentAssignment_1 ) )
            {
            // InternalMyLanguage.g:3590:1: ( ( rule__BatterySent__SentAssignment_1 ) )
            // InternalMyLanguage.g:3591:2: ( rule__BatterySent__SentAssignment_1 )
            {
             before(grammarAccess.getBatterySentAccess().getSentAssignment_1()); 
            // InternalMyLanguage.g:3592:2: ( rule__BatterySent__SentAssignment_1 )
            // InternalMyLanguage.g:3592:3: rule__BatterySent__SentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BatterySent__SentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBatterySentAccess().getSentAssignment_1()); 

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
    // $ANTLR end "rule__BatterySent__Group__1__Impl"


    // $ANTLR start "rule__BatteryLevelSent__Group__0"
    // InternalMyLanguage.g:3601:1: rule__BatteryLevelSent__Group__0 : rule__BatteryLevelSent__Group__0__Impl rule__BatteryLevelSent__Group__1 ;
    public final void rule__BatteryLevelSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3605:1: ( rule__BatteryLevelSent__Group__0__Impl rule__BatteryLevelSent__Group__1 )
            // InternalMyLanguage.g:3606:2: rule__BatteryLevelSent__Group__0__Impl rule__BatteryLevelSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BatteryLevelSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatteryLevelSent__Group__1();

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
    // $ANTLR end "rule__BatteryLevelSent__Group__0"


    // $ANTLR start "rule__BatteryLevelSent__Group__0__Impl"
    // InternalMyLanguage.g:3613:1: rule__BatteryLevelSent__Group__0__Impl : ( 'level' ) ;
    public final void rule__BatteryLevelSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3617:1: ( ( 'level' ) )
            // InternalMyLanguage.g:3618:1: ( 'level' )
            {
            // InternalMyLanguage.g:3618:1: ( 'level' )
            // InternalMyLanguage.g:3619:2: 'level'
            {
             before(grammarAccess.getBatteryLevelSentAccess().getLevelKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBatteryLevelSentAccess().getLevelKeyword_0()); 

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
    // $ANTLR end "rule__BatteryLevelSent__Group__0__Impl"


    // $ANTLR start "rule__BatteryLevelSent__Group__1"
    // InternalMyLanguage.g:3628:1: rule__BatteryLevelSent__Group__1 : rule__BatteryLevelSent__Group__1__Impl rule__BatteryLevelSent__Group__2 ;
    public final void rule__BatteryLevelSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3632:1: ( rule__BatteryLevelSent__Group__1__Impl rule__BatteryLevelSent__Group__2 )
            // InternalMyLanguage.g:3633:2: rule__BatteryLevelSent__Group__1__Impl rule__BatteryLevelSent__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__BatteryLevelSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatteryLevelSent__Group__2();

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
    // $ANTLR end "rule__BatteryLevelSent__Group__1"


    // $ANTLR start "rule__BatteryLevelSent__Group__1__Impl"
    // InternalMyLanguage.g:3640:1: rule__BatteryLevelSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__BatteryLevelSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3644:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3645:1: ( 'is' )
            {
            // InternalMyLanguage.g:3645:1: ( 'is' )
            // InternalMyLanguage.g:3646:2: 'is'
            {
             before(grammarAccess.getBatteryLevelSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBatteryLevelSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__BatteryLevelSent__Group__1__Impl"


    // $ANTLR start "rule__BatteryLevelSent__Group__2"
    // InternalMyLanguage.g:3655:1: rule__BatteryLevelSent__Group__2 : rule__BatteryLevelSent__Group__2__Impl ;
    public final void rule__BatteryLevelSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3659:1: ( rule__BatteryLevelSent__Group__2__Impl )
            // InternalMyLanguage.g:3660:2: rule__BatteryLevelSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BatteryLevelSent__Group__2__Impl();

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
    // $ANTLR end "rule__BatteryLevelSent__Group__2"


    // $ANTLR start "rule__BatteryLevelSent__Group__2__Impl"
    // InternalMyLanguage.g:3666:1: rule__BatteryLevelSent__Group__2__Impl : ( ( rule__BatteryLevelSent__SentAssignment_2 ) ) ;
    public final void rule__BatteryLevelSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3670:1: ( ( ( rule__BatteryLevelSent__SentAssignment_2 ) ) )
            // InternalMyLanguage.g:3671:1: ( ( rule__BatteryLevelSent__SentAssignment_2 ) )
            {
            // InternalMyLanguage.g:3671:1: ( ( rule__BatteryLevelSent__SentAssignment_2 ) )
            // InternalMyLanguage.g:3672:2: ( rule__BatteryLevelSent__SentAssignment_2 )
            {
             before(grammarAccess.getBatteryLevelSentAccess().getSentAssignment_2()); 
            // InternalMyLanguage.g:3673:2: ( rule__BatteryLevelSent__SentAssignment_2 )
            // InternalMyLanguage.g:3673:3: rule__BatteryLevelSent__SentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BatteryLevelSent__SentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLevelSentAccess().getSentAssignment_2()); 

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
    // $ANTLR end "rule__BatteryLevelSent__Group__2__Impl"


    // $ANTLR start "rule__PeopleSent__Group__0"
    // InternalMyLanguage.g:3682:1: rule__PeopleSent__Group__0 : rule__PeopleSent__Group__0__Impl rule__PeopleSent__Group__1 ;
    public final void rule__PeopleSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3686:1: ( rule__PeopleSent__Group__0__Impl rule__PeopleSent__Group__1 )
            // InternalMyLanguage.g:3687:2: rule__PeopleSent__Group__0__Impl rule__PeopleSent__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__PeopleSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeopleSent__Group__1();

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
    // $ANTLR end "rule__PeopleSent__Group__0"


    // $ANTLR start "rule__PeopleSent__Group__0__Impl"
    // InternalMyLanguage.g:3694:1: rule__PeopleSent__Group__0__Impl : ( 'Person' ) ;
    public final void rule__PeopleSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3698:1: ( ( 'Person' ) )
            // InternalMyLanguage.g:3699:1: ( 'Person' )
            {
            // InternalMyLanguage.g:3699:1: ( 'Person' )
            // InternalMyLanguage.g:3700:2: 'Person'
            {
             before(grammarAccess.getPeopleSentAccess().getPersonKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPeopleSentAccess().getPersonKeyword_0()); 

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
    // $ANTLR end "rule__PeopleSent__Group__0__Impl"


    // $ANTLR start "rule__PeopleSent__Group__1"
    // InternalMyLanguage.g:3709:1: rule__PeopleSent__Group__1 : rule__PeopleSent__Group__1__Impl ;
    public final void rule__PeopleSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3713:1: ( rule__PeopleSent__Group__1__Impl )
            // InternalMyLanguage.g:3714:2: rule__PeopleSent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PeopleSent__Group__1__Impl();

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
    // $ANTLR end "rule__PeopleSent__Group__1"


    // $ANTLR start "rule__PeopleSent__Group__1__Impl"
    // InternalMyLanguage.g:3720:1: rule__PeopleSent__Group__1__Impl : ( ( rule__PeopleSent__Alternatives_1 ) ) ;
    public final void rule__PeopleSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3724:1: ( ( ( rule__PeopleSent__Alternatives_1 ) ) )
            // InternalMyLanguage.g:3725:1: ( ( rule__PeopleSent__Alternatives_1 ) )
            {
            // InternalMyLanguage.g:3725:1: ( ( rule__PeopleSent__Alternatives_1 ) )
            // InternalMyLanguage.g:3726:2: ( rule__PeopleSent__Alternatives_1 )
            {
             before(grammarAccess.getPeopleSentAccess().getAlternatives_1()); 
            // InternalMyLanguage.g:3727:2: ( rule__PeopleSent__Alternatives_1 )
            // InternalMyLanguage.g:3727:3: rule__PeopleSent__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__PeopleSent__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPeopleSentAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__PeopleSent__Group__1__Impl"


    // $ANTLR start "rule__PeoplePosSent__Group__0"
    // InternalMyLanguage.g:3736:1: rule__PeoplePosSent__Group__0 : rule__PeoplePosSent__Group__0__Impl rule__PeoplePosSent__Group__1 ;
    public final void rule__PeoplePosSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3740:1: ( rule__PeoplePosSent__Group__0__Impl rule__PeoplePosSent__Group__1 )
            // InternalMyLanguage.g:3741:2: rule__PeoplePosSent__Group__0__Impl rule__PeoplePosSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PeoplePosSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__Group__1();

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
    // $ANTLR end "rule__PeoplePosSent__Group__0"


    // $ANTLR start "rule__PeoplePosSent__Group__0__Impl"
    // InternalMyLanguage.g:3748:1: rule__PeoplePosSent__Group__0__Impl : ( 'position' ) ;
    public final void rule__PeoplePosSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3752:1: ( ( 'position' ) )
            // InternalMyLanguage.g:3753:1: ( 'position' )
            {
            // InternalMyLanguage.g:3753:1: ( 'position' )
            // InternalMyLanguage.g:3754:2: 'position'
            {
             before(grammarAccess.getPeoplePosSentAccess().getPositionKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPeoplePosSentAccess().getPositionKeyword_0()); 

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
    // $ANTLR end "rule__PeoplePosSent__Group__0__Impl"


    // $ANTLR start "rule__PeoplePosSent__Group__1"
    // InternalMyLanguage.g:3763:1: rule__PeoplePosSent__Group__1 : rule__PeoplePosSent__Group__1__Impl rule__PeoplePosSent__Group__2 ;
    public final void rule__PeoplePosSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3767:1: ( rule__PeoplePosSent__Group__1__Impl rule__PeoplePosSent__Group__2 )
            // InternalMyLanguage.g:3768:2: rule__PeoplePosSent__Group__1__Impl rule__PeoplePosSent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PeoplePosSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__Group__2();

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
    // $ANTLR end "rule__PeoplePosSent__Group__1"


    // $ANTLR start "rule__PeoplePosSent__Group__1__Impl"
    // InternalMyLanguage.g:3775:1: rule__PeoplePosSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__PeoplePosSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3779:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3780:1: ( 'is' )
            {
            // InternalMyLanguage.g:3780:1: ( 'is' )
            // InternalMyLanguage.g:3781:2: 'is'
            {
             before(grammarAccess.getPeoplePosSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPeoplePosSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__PeoplePosSent__Group__1__Impl"


    // $ANTLR start "rule__PeoplePosSent__Group__2"
    // InternalMyLanguage.g:3790:1: rule__PeoplePosSent__Group__2 : rule__PeoplePosSent__Group__2__Impl rule__PeoplePosSent__Group__3 ;
    public final void rule__PeoplePosSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3794:1: ( rule__PeoplePosSent__Group__2__Impl rule__PeoplePosSent__Group__3 )
            // InternalMyLanguage.g:3795:2: rule__PeoplePosSent__Group__2__Impl rule__PeoplePosSent__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__PeoplePosSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__Group__3();

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
    // $ANTLR end "rule__PeoplePosSent__Group__2"


    // $ANTLR start "rule__PeoplePosSent__Group__2__Impl"
    // InternalMyLanguage.g:3802:1: rule__PeoplePosSent__Group__2__Impl : ( ( rule__PeoplePosSent__PosXAssignment_2 ) ) ;
    public final void rule__PeoplePosSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3806:1: ( ( ( rule__PeoplePosSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:3807:1: ( ( rule__PeoplePosSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:3807:1: ( ( rule__PeoplePosSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:3808:2: ( rule__PeoplePosSent__PosXAssignment_2 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:3809:2: ( rule__PeoplePosSent__PosXAssignment_2 )
            // InternalMyLanguage.g:3809:3: rule__PeoplePosSent__PosXAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__PosXAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPeoplePosSentAccess().getPosXAssignment_2()); 

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
    // $ANTLR end "rule__PeoplePosSent__Group__2__Impl"


    // $ANTLR start "rule__PeoplePosSent__Group__3"
    // InternalMyLanguage.g:3817:1: rule__PeoplePosSent__Group__3 : rule__PeoplePosSent__Group__3__Impl rule__PeoplePosSent__Group__4 ;
    public final void rule__PeoplePosSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3821:1: ( rule__PeoplePosSent__Group__3__Impl rule__PeoplePosSent__Group__4 )
            // InternalMyLanguage.g:3822:2: rule__PeoplePosSent__Group__3__Impl rule__PeoplePosSent__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PeoplePosSent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__Group__4();

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
    // $ANTLR end "rule__PeoplePosSent__Group__3"


    // $ANTLR start "rule__PeoplePosSent__Group__3__Impl"
    // InternalMyLanguage.g:3829:1: rule__PeoplePosSent__Group__3__Impl : ( ( rule__PeoplePosSent__PosYAssignment_3 ) ) ;
    public final void rule__PeoplePosSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3833:1: ( ( ( rule__PeoplePosSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:3834:1: ( ( rule__PeoplePosSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:3834:1: ( ( rule__PeoplePosSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:3835:2: ( rule__PeoplePosSent__PosYAssignment_3 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:3836:2: ( rule__PeoplePosSent__PosYAssignment_3 )
            // InternalMyLanguage.g:3836:3: rule__PeoplePosSent__PosYAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__PosYAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPeoplePosSentAccess().getPosYAssignment_3()); 

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
    // $ANTLR end "rule__PeoplePosSent__Group__3__Impl"


    // $ANTLR start "rule__PeoplePosSent__Group__4"
    // InternalMyLanguage.g:3844:1: rule__PeoplePosSent__Group__4 : rule__PeoplePosSent__Group__4__Impl rule__PeoplePosSent__Group__5 ;
    public final void rule__PeoplePosSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3848:1: ( rule__PeoplePosSent__Group__4__Impl rule__PeoplePosSent__Group__5 )
            // InternalMyLanguage.g:3849:2: rule__PeoplePosSent__Group__4__Impl rule__PeoplePosSent__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__PeoplePosSent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__Group__5();

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
    // $ANTLR end "rule__PeoplePosSent__Group__4"


    // $ANTLR start "rule__PeoplePosSent__Group__4__Impl"
    // InternalMyLanguage.g:3856:1: rule__PeoplePosSent__Group__4__Impl : ( ( rule__PeoplePosSent__PosZAssignment_4 ) ) ;
    public final void rule__PeoplePosSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3860:1: ( ( ( rule__PeoplePosSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:3861:1: ( ( rule__PeoplePosSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:3861:1: ( ( rule__PeoplePosSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:3862:2: ( rule__PeoplePosSent__PosZAssignment_4 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:3863:2: ( rule__PeoplePosSent__PosZAssignment_4 )
            // InternalMyLanguage.g:3863:3: rule__PeoplePosSent__PosZAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__PosZAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPeoplePosSentAccess().getPosZAssignment_4()); 

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
    // $ANTLR end "rule__PeoplePosSent__Group__4__Impl"


    // $ANTLR start "rule__PeoplePosSent__Group__5"
    // InternalMyLanguage.g:3871:1: rule__PeoplePosSent__Group__5 : rule__PeoplePosSent__Group__5__Impl ;
    public final void rule__PeoplePosSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3875:1: ( rule__PeoplePosSent__Group__5__Impl )
            // InternalMyLanguage.g:3876:2: rule__PeoplePosSent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__Group__5__Impl();

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
    // $ANTLR end "rule__PeoplePosSent__Group__5"


    // $ANTLR start "rule__PeoplePosSent__Group__5__Impl"
    // InternalMyLanguage.g:3882:1: rule__PeoplePosSent__Group__5__Impl : ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? ) ;
    public final void rule__PeoplePosSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3886:1: ( ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:3887:1: ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:3887:1: ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:3888:2: ( rule__PeoplePosSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getPeoplePosSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:3889:2: ( rule__PeoplePosSent__ToleranceAssignment_5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==61) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyLanguage.g:3889:3: rule__PeoplePosSent__ToleranceAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__PeoplePosSent__ToleranceAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeoplePosSentAccess().getToleranceAssignment_5()); 

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
    // $ANTLR end "rule__PeoplePosSent__Group__5__Impl"


    // $ANTLR start "rule__PeopleNumbSent__Group__0"
    // InternalMyLanguage.g:3898:1: rule__PeopleNumbSent__Group__0 : rule__PeopleNumbSent__Group__0__Impl rule__PeopleNumbSent__Group__1 ;
    public final void rule__PeopleNumbSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3902:1: ( rule__PeopleNumbSent__Group__0__Impl rule__PeopleNumbSent__Group__1 )
            // InternalMyLanguage.g:3903:2: rule__PeopleNumbSent__Group__0__Impl rule__PeopleNumbSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PeopleNumbSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeopleNumbSent__Group__1();

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
    // $ANTLR end "rule__PeopleNumbSent__Group__0"


    // $ANTLR start "rule__PeopleNumbSent__Group__0__Impl"
    // InternalMyLanguage.g:3910:1: rule__PeopleNumbSent__Group__0__Impl : ( 'number' ) ;
    public final void rule__PeopleNumbSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3914:1: ( ( 'number' ) )
            // InternalMyLanguage.g:3915:1: ( 'number' )
            {
            // InternalMyLanguage.g:3915:1: ( 'number' )
            // InternalMyLanguage.g:3916:2: 'number'
            {
             before(grammarAccess.getPeopleNumbSentAccess().getNumberKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPeopleNumbSentAccess().getNumberKeyword_0()); 

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
    // $ANTLR end "rule__PeopleNumbSent__Group__0__Impl"


    // $ANTLR start "rule__PeopleNumbSent__Group__1"
    // InternalMyLanguage.g:3925:1: rule__PeopleNumbSent__Group__1 : rule__PeopleNumbSent__Group__1__Impl rule__PeopleNumbSent__Group__2 ;
    public final void rule__PeopleNumbSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3929:1: ( rule__PeopleNumbSent__Group__1__Impl rule__PeopleNumbSent__Group__2 )
            // InternalMyLanguage.g:3930:2: rule__PeopleNumbSent__Group__1__Impl rule__PeopleNumbSent__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__PeopleNumbSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeopleNumbSent__Group__2();

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
    // $ANTLR end "rule__PeopleNumbSent__Group__1"


    // $ANTLR start "rule__PeopleNumbSent__Group__1__Impl"
    // InternalMyLanguage.g:3937:1: rule__PeopleNumbSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__PeopleNumbSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3941:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3942:1: ( 'is' )
            {
            // InternalMyLanguage.g:3942:1: ( 'is' )
            // InternalMyLanguage.g:3943:2: 'is'
            {
             before(grammarAccess.getPeopleNumbSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPeopleNumbSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__PeopleNumbSent__Group__1__Impl"


    // $ANTLR start "rule__PeopleNumbSent__Group__2"
    // InternalMyLanguage.g:3952:1: rule__PeopleNumbSent__Group__2 : rule__PeopleNumbSent__Group__2__Impl ;
    public final void rule__PeopleNumbSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3956:1: ( rule__PeopleNumbSent__Group__2__Impl )
            // InternalMyLanguage.g:3957:2: rule__PeopleNumbSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PeopleNumbSent__Group__2__Impl();

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
    // $ANTLR end "rule__PeopleNumbSent__Group__2"


    // $ANTLR start "rule__PeopleNumbSent__Group__2__Impl"
    // InternalMyLanguage.g:3963:1: rule__PeopleNumbSent__Group__2__Impl : ( ( rule__PeopleNumbSent__AmountAssignment_2 ) ) ;
    public final void rule__PeopleNumbSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3967:1: ( ( ( rule__PeopleNumbSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:3968:1: ( ( rule__PeopleNumbSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:3968:1: ( ( rule__PeopleNumbSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:3969:2: ( rule__PeopleNumbSent__AmountAssignment_2 )
            {
             before(grammarAccess.getPeopleNumbSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:3970:2: ( rule__PeopleNumbSent__AmountAssignment_2 )
            // InternalMyLanguage.g:3970:3: rule__PeopleNumbSent__AmountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PeopleNumbSent__AmountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPeopleNumbSentAccess().getAmountAssignment_2()); 

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
    // $ANTLR end "rule__PeopleNumbSent__Group__2__Impl"


    // $ANTLR start "rule__MissionSent__Group__0"
    // InternalMyLanguage.g:3979:1: rule__MissionSent__Group__0 : rule__MissionSent__Group__0__Impl rule__MissionSent__Group__1 ;
    public final void rule__MissionSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3983:1: ( rule__MissionSent__Group__0__Impl rule__MissionSent__Group__1 )
            // InternalMyLanguage.g:3984:2: rule__MissionSent__Group__0__Impl rule__MissionSent__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__MissionSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionSent__Group__1();

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
    // $ANTLR end "rule__MissionSent__Group__0"


    // $ANTLR start "rule__MissionSent__Group__0__Impl"
    // InternalMyLanguage.g:3991:1: rule__MissionSent__Group__0__Impl : ( 'Mission' ) ;
    public final void rule__MissionSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3995:1: ( ( 'Mission' ) )
            // InternalMyLanguage.g:3996:1: ( 'Mission' )
            {
            // InternalMyLanguage.g:3996:1: ( 'Mission' )
            // InternalMyLanguage.g:3997:2: 'Mission'
            {
             before(grammarAccess.getMissionSentAccess().getMissionKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMissionSentAccess().getMissionKeyword_0()); 

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
    // $ANTLR end "rule__MissionSent__Group__0__Impl"


    // $ANTLR start "rule__MissionSent__Group__1"
    // InternalMyLanguage.g:4006:1: rule__MissionSent__Group__1 : rule__MissionSent__Group__1__Impl ;
    public final void rule__MissionSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4010:1: ( rule__MissionSent__Group__1__Impl )
            // InternalMyLanguage.g:4011:2: rule__MissionSent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MissionSent__Group__1__Impl();

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
    // $ANTLR end "rule__MissionSent__Group__1"


    // $ANTLR start "rule__MissionSent__Group__1__Impl"
    // InternalMyLanguage.g:4017:1: rule__MissionSent__Group__1__Impl : ( ( rule__MissionSent__Alternatives_1 ) ) ;
    public final void rule__MissionSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4021:1: ( ( ( rule__MissionSent__Alternatives_1 ) ) )
            // InternalMyLanguage.g:4022:1: ( ( rule__MissionSent__Alternatives_1 ) )
            {
            // InternalMyLanguage.g:4022:1: ( ( rule__MissionSent__Alternatives_1 ) )
            // InternalMyLanguage.g:4023:2: ( rule__MissionSent__Alternatives_1 )
            {
             before(grammarAccess.getMissionSentAccess().getAlternatives_1()); 
            // InternalMyLanguage.g:4024:2: ( rule__MissionSent__Alternatives_1 )
            // InternalMyLanguage.g:4024:3: rule__MissionSent__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MissionSent__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionSentAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__MissionSent__Group__1__Impl"


    // $ANTLR start "rule__MissionGoalSent__Group__0"
    // InternalMyLanguage.g:4033:1: rule__MissionGoalSent__Group__0 : rule__MissionGoalSent__Group__0__Impl rule__MissionGoalSent__Group__1 ;
    public final void rule__MissionGoalSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4037:1: ( rule__MissionGoalSent__Group__0__Impl rule__MissionGoalSent__Group__1 )
            // InternalMyLanguage.g:4038:2: rule__MissionGoalSent__Group__0__Impl rule__MissionGoalSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MissionGoalSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionGoalSent__Group__1();

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
    // $ANTLR end "rule__MissionGoalSent__Group__0"


    // $ANTLR start "rule__MissionGoalSent__Group__0__Impl"
    // InternalMyLanguage.g:4045:1: rule__MissionGoalSent__Group__0__Impl : ( 'goal' ) ;
    public final void rule__MissionGoalSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4049:1: ( ( 'goal' ) )
            // InternalMyLanguage.g:4050:1: ( 'goal' )
            {
            // InternalMyLanguage.g:4050:1: ( 'goal' )
            // InternalMyLanguage.g:4051:2: 'goal'
            {
             before(grammarAccess.getMissionGoalSentAccess().getGoalKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMissionGoalSentAccess().getGoalKeyword_0()); 

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
    // $ANTLR end "rule__MissionGoalSent__Group__0__Impl"


    // $ANTLR start "rule__MissionGoalSent__Group__1"
    // InternalMyLanguage.g:4060:1: rule__MissionGoalSent__Group__1 : rule__MissionGoalSent__Group__1__Impl rule__MissionGoalSent__Group__2 ;
    public final void rule__MissionGoalSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4064:1: ( rule__MissionGoalSent__Group__1__Impl rule__MissionGoalSent__Group__2 )
            // InternalMyLanguage.g:4065:2: rule__MissionGoalSent__Group__1__Impl rule__MissionGoalSent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MissionGoalSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionGoalSent__Group__2();

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
    // $ANTLR end "rule__MissionGoalSent__Group__1"


    // $ANTLR start "rule__MissionGoalSent__Group__1__Impl"
    // InternalMyLanguage.g:4072:1: rule__MissionGoalSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__MissionGoalSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4076:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4077:1: ( 'is' )
            {
            // InternalMyLanguage.g:4077:1: ( 'is' )
            // InternalMyLanguage.g:4078:2: 'is'
            {
             before(grammarAccess.getMissionGoalSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMissionGoalSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__MissionGoalSent__Group__1__Impl"


    // $ANTLR start "rule__MissionGoalSent__Group__2"
    // InternalMyLanguage.g:4087:1: rule__MissionGoalSent__Group__2 : rule__MissionGoalSent__Group__2__Impl rule__MissionGoalSent__Group__3 ;
    public final void rule__MissionGoalSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4091:1: ( rule__MissionGoalSent__Group__2__Impl rule__MissionGoalSent__Group__3 )
            // InternalMyLanguage.g:4092:2: rule__MissionGoalSent__Group__2__Impl rule__MissionGoalSent__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__MissionGoalSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionGoalSent__Group__3();

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
    // $ANTLR end "rule__MissionGoalSent__Group__2"


    // $ANTLR start "rule__MissionGoalSent__Group__2__Impl"
    // InternalMyLanguage.g:4099:1: rule__MissionGoalSent__Group__2__Impl : ( ( rule__MissionGoalSent__PosXAssignment_2 ) ) ;
    public final void rule__MissionGoalSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4103:1: ( ( ( rule__MissionGoalSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:4104:1: ( ( rule__MissionGoalSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:4104:1: ( ( rule__MissionGoalSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:4105:2: ( rule__MissionGoalSent__PosXAssignment_2 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:4106:2: ( rule__MissionGoalSent__PosXAssignment_2 )
            // InternalMyLanguage.g:4106:3: rule__MissionGoalSent__PosXAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MissionGoalSent__PosXAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionGoalSentAccess().getPosXAssignment_2()); 

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
    // $ANTLR end "rule__MissionGoalSent__Group__2__Impl"


    // $ANTLR start "rule__MissionGoalSent__Group__3"
    // InternalMyLanguage.g:4114:1: rule__MissionGoalSent__Group__3 : rule__MissionGoalSent__Group__3__Impl rule__MissionGoalSent__Group__4 ;
    public final void rule__MissionGoalSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4118:1: ( rule__MissionGoalSent__Group__3__Impl rule__MissionGoalSent__Group__4 )
            // InternalMyLanguage.g:4119:2: rule__MissionGoalSent__Group__3__Impl rule__MissionGoalSent__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__MissionGoalSent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionGoalSent__Group__4();

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
    // $ANTLR end "rule__MissionGoalSent__Group__3"


    // $ANTLR start "rule__MissionGoalSent__Group__3__Impl"
    // InternalMyLanguage.g:4126:1: rule__MissionGoalSent__Group__3__Impl : ( ( rule__MissionGoalSent__PosYAssignment_3 ) ) ;
    public final void rule__MissionGoalSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4130:1: ( ( ( rule__MissionGoalSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:4131:1: ( ( rule__MissionGoalSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:4131:1: ( ( rule__MissionGoalSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:4132:2: ( rule__MissionGoalSent__PosYAssignment_3 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:4133:2: ( rule__MissionGoalSent__PosYAssignment_3 )
            // InternalMyLanguage.g:4133:3: rule__MissionGoalSent__PosYAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MissionGoalSent__PosYAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMissionGoalSentAccess().getPosYAssignment_3()); 

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
    // $ANTLR end "rule__MissionGoalSent__Group__3__Impl"


    // $ANTLR start "rule__MissionGoalSent__Group__4"
    // InternalMyLanguage.g:4141:1: rule__MissionGoalSent__Group__4 : rule__MissionGoalSent__Group__4__Impl ;
    public final void rule__MissionGoalSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4145:1: ( rule__MissionGoalSent__Group__4__Impl )
            // InternalMyLanguage.g:4146:2: rule__MissionGoalSent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MissionGoalSent__Group__4__Impl();

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
    // $ANTLR end "rule__MissionGoalSent__Group__4"


    // $ANTLR start "rule__MissionGoalSent__Group__4__Impl"
    // InternalMyLanguage.g:4152:1: rule__MissionGoalSent__Group__4__Impl : ( ( rule__MissionGoalSent__PosZAssignment_4 ) ) ;
    public final void rule__MissionGoalSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4156:1: ( ( ( rule__MissionGoalSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:4157:1: ( ( rule__MissionGoalSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:4157:1: ( ( rule__MissionGoalSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:4158:2: ( rule__MissionGoalSent__PosZAssignment_4 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:4159:2: ( rule__MissionGoalSent__PosZAssignment_4 )
            // InternalMyLanguage.g:4159:3: rule__MissionGoalSent__PosZAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MissionGoalSent__PosZAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMissionGoalSentAccess().getPosZAssignment_4()); 

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
    // $ANTLR end "rule__MissionGoalSent__Group__4__Impl"


    // $ANTLR start "rule__MissionRiskLevelSent__Group__0"
    // InternalMyLanguage.g:4168:1: rule__MissionRiskLevelSent__Group__0 : rule__MissionRiskLevelSent__Group__0__Impl rule__MissionRiskLevelSent__Group__1 ;
    public final void rule__MissionRiskLevelSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4172:1: ( rule__MissionRiskLevelSent__Group__0__Impl rule__MissionRiskLevelSent__Group__1 )
            // InternalMyLanguage.g:4173:2: rule__MissionRiskLevelSent__Group__0__Impl rule__MissionRiskLevelSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MissionRiskLevelSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionRiskLevelSent__Group__1();

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
    // $ANTLR end "rule__MissionRiskLevelSent__Group__0"


    // $ANTLR start "rule__MissionRiskLevelSent__Group__0__Impl"
    // InternalMyLanguage.g:4180:1: rule__MissionRiskLevelSent__Group__0__Impl : ( 'missionsafety' ) ;
    public final void rule__MissionRiskLevelSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4184:1: ( ( 'missionsafety' ) )
            // InternalMyLanguage.g:4185:1: ( 'missionsafety' )
            {
            // InternalMyLanguage.g:4185:1: ( 'missionsafety' )
            // InternalMyLanguage.g:4186:2: 'missionsafety'
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getMissionsafetyKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMissionRiskLevelSentAccess().getMissionsafetyKeyword_0()); 

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
    // $ANTLR end "rule__MissionRiskLevelSent__Group__0__Impl"


    // $ANTLR start "rule__MissionRiskLevelSent__Group__1"
    // InternalMyLanguage.g:4195:1: rule__MissionRiskLevelSent__Group__1 : rule__MissionRiskLevelSent__Group__1__Impl rule__MissionRiskLevelSent__Group__2 ;
    public final void rule__MissionRiskLevelSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4199:1: ( rule__MissionRiskLevelSent__Group__1__Impl rule__MissionRiskLevelSent__Group__2 )
            // InternalMyLanguage.g:4200:2: rule__MissionRiskLevelSent__Group__1__Impl rule__MissionRiskLevelSent__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__MissionRiskLevelSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionRiskLevelSent__Group__2();

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
    // $ANTLR end "rule__MissionRiskLevelSent__Group__1"


    // $ANTLR start "rule__MissionRiskLevelSent__Group__1__Impl"
    // InternalMyLanguage.g:4207:1: rule__MissionRiskLevelSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__MissionRiskLevelSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4211:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4212:1: ( 'is' )
            {
            // InternalMyLanguage.g:4212:1: ( 'is' )
            // InternalMyLanguage.g:4213:2: 'is'
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMissionRiskLevelSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__MissionRiskLevelSent__Group__1__Impl"


    // $ANTLR start "rule__MissionRiskLevelSent__Group__2"
    // InternalMyLanguage.g:4222:1: rule__MissionRiskLevelSent__Group__2 : rule__MissionRiskLevelSent__Group__2__Impl ;
    public final void rule__MissionRiskLevelSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4226:1: ( rule__MissionRiskLevelSent__Group__2__Impl )
            // InternalMyLanguage.g:4227:2: rule__MissionRiskLevelSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MissionRiskLevelSent__Group__2__Impl();

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
    // $ANTLR end "rule__MissionRiskLevelSent__Group__2"


    // $ANTLR start "rule__MissionRiskLevelSent__Group__2__Impl"
    // InternalMyLanguage.g:4233:1: rule__MissionRiskLevelSent__Group__2__Impl : ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) ) ;
    public final void rule__MissionRiskLevelSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4237:1: ( ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) ) )
            // InternalMyLanguage.g:4238:1: ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) )
            {
            // InternalMyLanguage.g:4238:1: ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) )
            // InternalMyLanguage.g:4239:2: ( rule__MissionRiskLevelSent__RisklevelAssignment_2 )
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getRisklevelAssignment_2()); 
            // InternalMyLanguage.g:4240:2: ( rule__MissionRiskLevelSent__RisklevelAssignment_2 )
            // InternalMyLanguage.g:4240:3: rule__MissionRiskLevelSent__RisklevelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MissionRiskLevelSent__RisklevelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionRiskLevelSentAccess().getRisklevelAssignment_2()); 

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
    // $ANTLR end "rule__MissionRiskLevelSent__Group__2__Impl"


    // $ANTLR start "rule__MissionStatusSent__Group__0"
    // InternalMyLanguage.g:4249:1: rule__MissionStatusSent__Group__0 : rule__MissionStatusSent__Group__0__Impl rule__MissionStatusSent__Group__1 ;
    public final void rule__MissionStatusSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4253:1: ( rule__MissionStatusSent__Group__0__Impl rule__MissionStatusSent__Group__1 )
            // InternalMyLanguage.g:4254:2: rule__MissionStatusSent__Group__0__Impl rule__MissionStatusSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MissionStatusSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionStatusSent__Group__1();

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
    // $ANTLR end "rule__MissionStatusSent__Group__0"


    // $ANTLR start "rule__MissionStatusSent__Group__0__Impl"
    // InternalMyLanguage.g:4261:1: rule__MissionStatusSent__Group__0__Impl : ( 'status' ) ;
    public final void rule__MissionStatusSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4265:1: ( ( 'status' ) )
            // InternalMyLanguage.g:4266:1: ( 'status' )
            {
            // InternalMyLanguage.g:4266:1: ( 'status' )
            // InternalMyLanguage.g:4267:2: 'status'
            {
             before(grammarAccess.getMissionStatusSentAccess().getStatusKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMissionStatusSentAccess().getStatusKeyword_0()); 

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
    // $ANTLR end "rule__MissionStatusSent__Group__0__Impl"


    // $ANTLR start "rule__MissionStatusSent__Group__1"
    // InternalMyLanguage.g:4276:1: rule__MissionStatusSent__Group__1 : rule__MissionStatusSent__Group__1__Impl rule__MissionStatusSent__Group__2 ;
    public final void rule__MissionStatusSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4280:1: ( rule__MissionStatusSent__Group__1__Impl rule__MissionStatusSent__Group__2 )
            // InternalMyLanguage.g:4281:2: rule__MissionStatusSent__Group__1__Impl rule__MissionStatusSent__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__MissionStatusSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionStatusSent__Group__2();

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
    // $ANTLR end "rule__MissionStatusSent__Group__1"


    // $ANTLR start "rule__MissionStatusSent__Group__1__Impl"
    // InternalMyLanguage.g:4288:1: rule__MissionStatusSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__MissionStatusSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4292:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4293:1: ( 'is' )
            {
            // InternalMyLanguage.g:4293:1: ( 'is' )
            // InternalMyLanguage.g:4294:2: 'is'
            {
             before(grammarAccess.getMissionStatusSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMissionStatusSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__MissionStatusSent__Group__1__Impl"


    // $ANTLR start "rule__MissionStatusSent__Group__2"
    // InternalMyLanguage.g:4303:1: rule__MissionStatusSent__Group__2 : rule__MissionStatusSent__Group__2__Impl ;
    public final void rule__MissionStatusSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4307:1: ( rule__MissionStatusSent__Group__2__Impl )
            // InternalMyLanguage.g:4308:2: rule__MissionStatusSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MissionStatusSent__Group__2__Impl();

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
    // $ANTLR end "rule__MissionStatusSent__Group__2"


    // $ANTLR start "rule__MissionStatusSent__Group__2__Impl"
    // InternalMyLanguage.g:4314:1: rule__MissionStatusSent__Group__2__Impl : ( ( rule__MissionStatusSent__StateAssignment_2 ) ) ;
    public final void rule__MissionStatusSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4318:1: ( ( ( rule__MissionStatusSent__StateAssignment_2 ) ) )
            // InternalMyLanguage.g:4319:1: ( ( rule__MissionStatusSent__StateAssignment_2 ) )
            {
            // InternalMyLanguage.g:4319:1: ( ( rule__MissionStatusSent__StateAssignment_2 ) )
            // InternalMyLanguage.g:4320:2: ( rule__MissionStatusSent__StateAssignment_2 )
            {
             before(grammarAccess.getMissionStatusSentAccess().getStateAssignment_2()); 
            // InternalMyLanguage.g:4321:2: ( rule__MissionStatusSent__StateAssignment_2 )
            // InternalMyLanguage.g:4321:3: rule__MissionStatusSent__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MissionStatusSent__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionStatusSentAccess().getStateAssignment_2()); 

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
    // $ANTLR end "rule__MissionStatusSent__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalMyLanguage.g:4330:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4334:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyLanguage.g:4335:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

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
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalMyLanguage.g:4342:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4346:1: ( ( 'Robot' ) )
            // InternalMyLanguage.g:4347:1: ( 'Robot' )
            {
            // InternalMyLanguage.g:4347:1: ( 'Robot' )
            // InternalMyLanguage.g:4348:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_0()); 

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
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalMyLanguage.g:4357:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4361:1: ( rule__Robot__Group__1__Impl )
            // InternalMyLanguage.g:4362:2: rule__Robot__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__1__Impl();

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
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalMyLanguage.g:4368:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__Alternatives_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4372:1: ( ( ( rule__Robot__Alternatives_1 ) ) )
            // InternalMyLanguage.g:4373:1: ( ( rule__Robot__Alternatives_1 ) )
            {
            // InternalMyLanguage.g:4373:1: ( ( rule__Robot__Alternatives_1 ) )
            // InternalMyLanguage.g:4374:2: ( rule__Robot__Alternatives_1 )
            {
             before(grammarAccess.getRobotAccess().getAlternatives_1()); 
            // InternalMyLanguage.g:4375:2: ( rule__Robot__Alternatives_1 )
            // InternalMyLanguage.g:4375:3: rule__Robot__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__RobotAutoPilot__Group__0"
    // InternalMyLanguage.g:4384:1: rule__RobotAutoPilot__Group__0 : rule__RobotAutoPilot__Group__0__Impl rule__RobotAutoPilot__Group__1 ;
    public final void rule__RobotAutoPilot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4388:1: ( rule__RobotAutoPilot__Group__0__Impl rule__RobotAutoPilot__Group__1 )
            // InternalMyLanguage.g:4389:2: rule__RobotAutoPilot__Group__0__Impl rule__RobotAutoPilot__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RobotAutoPilot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotAutoPilot__Group__1();

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
    // $ANTLR end "rule__RobotAutoPilot__Group__0"


    // $ANTLR start "rule__RobotAutoPilot__Group__0__Impl"
    // InternalMyLanguage.g:4396:1: rule__RobotAutoPilot__Group__0__Impl : ( 'autopilot' ) ;
    public final void rule__RobotAutoPilot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4400:1: ( ( 'autopilot' ) )
            // InternalMyLanguage.g:4401:1: ( 'autopilot' )
            {
            // InternalMyLanguage.g:4401:1: ( 'autopilot' )
            // InternalMyLanguage.g:4402:2: 'autopilot'
            {
             before(grammarAccess.getRobotAutoPilotAccess().getAutopilotKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRobotAutoPilotAccess().getAutopilotKeyword_0()); 

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
    // $ANTLR end "rule__RobotAutoPilot__Group__0__Impl"


    // $ANTLR start "rule__RobotAutoPilot__Group__1"
    // InternalMyLanguage.g:4411:1: rule__RobotAutoPilot__Group__1 : rule__RobotAutoPilot__Group__1__Impl rule__RobotAutoPilot__Group__2 ;
    public final void rule__RobotAutoPilot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4415:1: ( rule__RobotAutoPilot__Group__1__Impl rule__RobotAutoPilot__Group__2 )
            // InternalMyLanguage.g:4416:2: rule__RobotAutoPilot__Group__1__Impl rule__RobotAutoPilot__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__RobotAutoPilot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotAutoPilot__Group__2();

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
    // $ANTLR end "rule__RobotAutoPilot__Group__1"


    // $ANTLR start "rule__RobotAutoPilot__Group__1__Impl"
    // InternalMyLanguage.g:4423:1: rule__RobotAutoPilot__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotAutoPilot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4427:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4428:1: ( 'is' )
            {
            // InternalMyLanguage.g:4428:1: ( 'is' )
            // InternalMyLanguage.g:4429:2: 'is'
            {
             before(grammarAccess.getRobotAutoPilotAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRobotAutoPilotAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__RobotAutoPilot__Group__1__Impl"


    // $ANTLR start "rule__RobotAutoPilot__Group__2"
    // InternalMyLanguage.g:4438:1: rule__RobotAutoPilot__Group__2 : rule__RobotAutoPilot__Group__2__Impl ;
    public final void rule__RobotAutoPilot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4442:1: ( rule__RobotAutoPilot__Group__2__Impl )
            // InternalMyLanguage.g:4443:2: rule__RobotAutoPilot__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotAutoPilot__Group__2__Impl();

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
    // $ANTLR end "rule__RobotAutoPilot__Group__2"


    // $ANTLR start "rule__RobotAutoPilot__Group__2__Impl"
    // InternalMyLanguage.g:4449:1: rule__RobotAutoPilot__Group__2__Impl : ( ( rule__RobotAutoPilot__StatusAssignment_2 ) ) ;
    public final void rule__RobotAutoPilot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4453:1: ( ( ( rule__RobotAutoPilot__StatusAssignment_2 ) ) )
            // InternalMyLanguage.g:4454:1: ( ( rule__RobotAutoPilot__StatusAssignment_2 ) )
            {
            // InternalMyLanguage.g:4454:1: ( ( rule__RobotAutoPilot__StatusAssignment_2 ) )
            // InternalMyLanguage.g:4455:2: ( rule__RobotAutoPilot__StatusAssignment_2 )
            {
             before(grammarAccess.getRobotAutoPilotAccess().getStatusAssignment_2()); 
            // InternalMyLanguage.g:4456:2: ( rule__RobotAutoPilot__StatusAssignment_2 )
            // InternalMyLanguage.g:4456:3: rule__RobotAutoPilot__StatusAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotAutoPilot__StatusAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAutoPilotAccess().getStatusAssignment_2()); 

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
    // $ANTLR end "rule__RobotAutoPilot__Group__2__Impl"


    // $ANTLR start "rule__PayloadSent__Group__0"
    // InternalMyLanguage.g:4465:1: rule__PayloadSent__Group__0 : rule__PayloadSent__Group__0__Impl rule__PayloadSent__Group__1 ;
    public final void rule__PayloadSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4469:1: ( rule__PayloadSent__Group__0__Impl rule__PayloadSent__Group__1 )
            // InternalMyLanguage.g:4470:2: rule__PayloadSent__Group__0__Impl rule__PayloadSent__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__PayloadSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PayloadSent__Group__1();

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
    // $ANTLR end "rule__PayloadSent__Group__0"


    // $ANTLR start "rule__PayloadSent__Group__0__Impl"
    // InternalMyLanguage.g:4477:1: rule__PayloadSent__Group__0__Impl : ( ( rule__PayloadSent__LoadAssignment_0 ) ) ;
    public final void rule__PayloadSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4481:1: ( ( ( rule__PayloadSent__LoadAssignment_0 ) ) )
            // InternalMyLanguage.g:4482:1: ( ( rule__PayloadSent__LoadAssignment_0 ) )
            {
            // InternalMyLanguage.g:4482:1: ( ( rule__PayloadSent__LoadAssignment_0 ) )
            // InternalMyLanguage.g:4483:2: ( rule__PayloadSent__LoadAssignment_0 )
            {
             before(grammarAccess.getPayloadSentAccess().getLoadAssignment_0()); 
            // InternalMyLanguage.g:4484:2: ( rule__PayloadSent__LoadAssignment_0 )
            // InternalMyLanguage.g:4484:3: rule__PayloadSent__LoadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PayloadSent__LoadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadSentAccess().getLoadAssignment_0()); 

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
    // $ANTLR end "rule__PayloadSent__Group__0__Impl"


    // $ANTLR start "rule__PayloadSent__Group__1"
    // InternalMyLanguage.g:4492:1: rule__PayloadSent__Group__1 : rule__PayloadSent__Group__1__Impl ;
    public final void rule__PayloadSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4496:1: ( rule__PayloadSent__Group__1__Impl )
            // InternalMyLanguage.g:4497:2: rule__PayloadSent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PayloadSent__Group__1__Impl();

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
    // $ANTLR end "rule__PayloadSent__Group__1"


    // $ANTLR start "rule__PayloadSent__Group__1__Impl"
    // InternalMyLanguage.g:4503:1: rule__PayloadSent__Group__1__Impl : ( 'drops' ) ;
    public final void rule__PayloadSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4507:1: ( ( 'drops' ) )
            // InternalMyLanguage.g:4508:1: ( 'drops' )
            {
            // InternalMyLanguage.g:4508:1: ( 'drops' )
            // InternalMyLanguage.g:4509:2: 'drops'
            {
             before(grammarAccess.getPayloadSentAccess().getDropsKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPayloadSentAccess().getDropsKeyword_1()); 

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
    // $ANTLR end "rule__PayloadSent__Group__1__Impl"


    // $ANTLR start "rule__RobotDistanceSent__Group__0"
    // InternalMyLanguage.g:4519:1: rule__RobotDistanceSent__Group__0 : rule__RobotDistanceSent__Group__0__Impl rule__RobotDistanceSent__Group__1 ;
    public final void rule__RobotDistanceSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4523:1: ( rule__RobotDistanceSent__Group__0__Impl rule__RobotDistanceSent__Group__1 )
            // InternalMyLanguage.g:4524:2: rule__RobotDistanceSent__Group__0__Impl rule__RobotDistanceSent__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__RobotDistanceSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotDistanceSent__Group__1();

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
    // $ANTLR end "rule__RobotDistanceSent__Group__0"


    // $ANTLR start "rule__RobotDistanceSent__Group__0__Impl"
    // InternalMyLanguage.g:4531:1: rule__RobotDistanceSent__Group__0__Impl : ( 'distance' ) ;
    public final void rule__RobotDistanceSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4535:1: ( ( 'distance' ) )
            // InternalMyLanguage.g:4536:1: ( 'distance' )
            {
            // InternalMyLanguage.g:4536:1: ( 'distance' )
            // InternalMyLanguage.g:4537:2: 'distance'
            {
             before(grammarAccess.getRobotDistanceSentAccess().getDistanceKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRobotDistanceSentAccess().getDistanceKeyword_0()); 

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
    // $ANTLR end "rule__RobotDistanceSent__Group__0__Impl"


    // $ANTLR start "rule__RobotDistanceSent__Group__1"
    // InternalMyLanguage.g:4546:1: rule__RobotDistanceSent__Group__1 : rule__RobotDistanceSent__Group__1__Impl rule__RobotDistanceSent__Group__2 ;
    public final void rule__RobotDistanceSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4550:1: ( rule__RobotDistanceSent__Group__1__Impl rule__RobotDistanceSent__Group__2 )
            // InternalMyLanguage.g:4551:2: rule__RobotDistanceSent__Group__1__Impl rule__RobotDistanceSent__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__RobotDistanceSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotDistanceSent__Group__2();

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
    // $ANTLR end "rule__RobotDistanceSent__Group__1"


    // $ANTLR start "rule__RobotDistanceSent__Group__1__Impl"
    // InternalMyLanguage.g:4558:1: rule__RobotDistanceSent__Group__1__Impl : ( 'to' ) ;
    public final void rule__RobotDistanceSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4562:1: ( ( 'to' ) )
            // InternalMyLanguage.g:4563:1: ( 'to' )
            {
            // InternalMyLanguage.g:4563:1: ( 'to' )
            // InternalMyLanguage.g:4564:2: 'to'
            {
             before(grammarAccess.getRobotDistanceSentAccess().getToKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRobotDistanceSentAccess().getToKeyword_1()); 

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
    // $ANTLR end "rule__RobotDistanceSent__Group__1__Impl"


    // $ANTLR start "rule__RobotDistanceSent__Group__2"
    // InternalMyLanguage.g:4573:1: rule__RobotDistanceSent__Group__2 : rule__RobotDistanceSent__Group__2__Impl ;
    public final void rule__RobotDistanceSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4577:1: ( rule__RobotDistanceSent__Group__2__Impl )
            // InternalMyLanguage.g:4578:2: rule__RobotDistanceSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotDistanceSent__Group__2__Impl();

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
    // $ANTLR end "rule__RobotDistanceSent__Group__2"


    // $ANTLR start "rule__RobotDistanceSent__Group__2__Impl"
    // InternalMyLanguage.g:4584:1: rule__RobotDistanceSent__Group__2__Impl : ( ( rule__RobotDistanceSent__SentAssignment_2 ) ) ;
    public final void rule__RobotDistanceSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4588:1: ( ( ( rule__RobotDistanceSent__SentAssignment_2 ) ) )
            // InternalMyLanguage.g:4589:1: ( ( rule__RobotDistanceSent__SentAssignment_2 ) )
            {
            // InternalMyLanguage.g:4589:1: ( ( rule__RobotDistanceSent__SentAssignment_2 ) )
            // InternalMyLanguage.g:4590:2: ( rule__RobotDistanceSent__SentAssignment_2 )
            {
             before(grammarAccess.getRobotDistanceSentAccess().getSentAssignment_2()); 
            // InternalMyLanguage.g:4591:2: ( rule__RobotDistanceSent__SentAssignment_2 )
            // InternalMyLanguage.g:4591:3: rule__RobotDistanceSent__SentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotDistanceSent__SentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotDistanceSentAccess().getSentAssignment_2()); 

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
    // $ANTLR end "rule__RobotDistanceSent__Group__2__Impl"


    // $ANTLR start "rule__DistanceToLocationSent__Group__0"
    // InternalMyLanguage.g:4600:1: rule__DistanceToLocationSent__Group__0 : rule__DistanceToLocationSent__Group__0__Impl rule__DistanceToLocationSent__Group__1 ;
    public final void rule__DistanceToLocationSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4604:1: ( rule__DistanceToLocationSent__Group__0__Impl rule__DistanceToLocationSent__Group__1 )
            // InternalMyLanguage.g:4605:2: rule__DistanceToLocationSent__Group__0__Impl rule__DistanceToLocationSent__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DistanceToLocationSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__Group__1();

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__0"


    // $ANTLR start "rule__DistanceToLocationSent__Group__0__Impl"
    // InternalMyLanguage.g:4612:1: rule__DistanceToLocationSent__Group__0__Impl : ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) ) ;
    public final void rule__DistanceToLocationSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4616:1: ( ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) ) )
            // InternalMyLanguage.g:4617:1: ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) )
            {
            // InternalMyLanguage.g:4617:1: ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) )
            // InternalMyLanguage.g:4618:2: ( rule__DistanceToLocationSent__PosXAssignment_0 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosXAssignment_0()); 
            // InternalMyLanguage.g:4619:2: ( rule__DistanceToLocationSent__PosXAssignment_0 )
            // InternalMyLanguage.g:4619:3: rule__DistanceToLocationSent__PosXAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__PosXAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceToLocationSentAccess().getPosXAssignment_0()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__0__Impl"


    // $ANTLR start "rule__DistanceToLocationSent__Group__1"
    // InternalMyLanguage.g:4627:1: rule__DistanceToLocationSent__Group__1 : rule__DistanceToLocationSent__Group__1__Impl rule__DistanceToLocationSent__Group__2 ;
    public final void rule__DistanceToLocationSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4631:1: ( rule__DistanceToLocationSent__Group__1__Impl rule__DistanceToLocationSent__Group__2 )
            // InternalMyLanguage.g:4632:2: rule__DistanceToLocationSent__Group__1__Impl rule__DistanceToLocationSent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DistanceToLocationSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__Group__2();

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__1"


    // $ANTLR start "rule__DistanceToLocationSent__Group__1__Impl"
    // InternalMyLanguage.g:4639:1: rule__DistanceToLocationSent__Group__1__Impl : ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) ) ;
    public final void rule__DistanceToLocationSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4643:1: ( ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) ) )
            // InternalMyLanguage.g:4644:1: ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) )
            {
            // InternalMyLanguage.g:4644:1: ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) )
            // InternalMyLanguage.g:4645:2: ( rule__DistanceToLocationSent__PosYAssignment_1 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosYAssignment_1()); 
            // InternalMyLanguage.g:4646:2: ( rule__DistanceToLocationSent__PosYAssignment_1 )
            // InternalMyLanguage.g:4646:3: rule__DistanceToLocationSent__PosYAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__PosYAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDistanceToLocationSentAccess().getPosYAssignment_1()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__1__Impl"


    // $ANTLR start "rule__DistanceToLocationSent__Group__2"
    // InternalMyLanguage.g:4654:1: rule__DistanceToLocationSent__Group__2 : rule__DistanceToLocationSent__Group__2__Impl rule__DistanceToLocationSent__Group__3 ;
    public final void rule__DistanceToLocationSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4658:1: ( rule__DistanceToLocationSent__Group__2__Impl rule__DistanceToLocationSent__Group__3 )
            // InternalMyLanguage.g:4659:2: rule__DistanceToLocationSent__Group__2__Impl rule__DistanceToLocationSent__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__DistanceToLocationSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__Group__3();

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__2"


    // $ANTLR start "rule__DistanceToLocationSent__Group__2__Impl"
    // InternalMyLanguage.g:4666:1: rule__DistanceToLocationSent__Group__2__Impl : ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) ) ;
    public final void rule__DistanceToLocationSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4670:1: ( ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) ) )
            // InternalMyLanguage.g:4671:1: ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) )
            {
            // InternalMyLanguage.g:4671:1: ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) )
            // InternalMyLanguage.g:4672:2: ( rule__DistanceToLocationSent__PosZAssignment_2 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosZAssignment_2()); 
            // InternalMyLanguage.g:4673:2: ( rule__DistanceToLocationSent__PosZAssignment_2 )
            // InternalMyLanguage.g:4673:3: rule__DistanceToLocationSent__PosZAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__PosZAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDistanceToLocationSentAccess().getPosZAssignment_2()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__2__Impl"


    // $ANTLR start "rule__DistanceToLocationSent__Group__3"
    // InternalMyLanguage.g:4681:1: rule__DistanceToLocationSent__Group__3 : rule__DistanceToLocationSent__Group__3__Impl rule__DistanceToLocationSent__Group__4 ;
    public final void rule__DistanceToLocationSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4685:1: ( rule__DistanceToLocationSent__Group__3__Impl rule__DistanceToLocationSent__Group__4 )
            // InternalMyLanguage.g:4686:2: rule__DistanceToLocationSent__Group__3__Impl rule__DistanceToLocationSent__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__DistanceToLocationSent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__Group__4();

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__3"


    // $ANTLR start "rule__DistanceToLocationSent__Group__3__Impl"
    // InternalMyLanguage.g:4693:1: rule__DistanceToLocationSent__Group__3__Impl : ( 'is' ) ;
    public final void rule__DistanceToLocationSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4697:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4698:1: ( 'is' )
            {
            // InternalMyLanguage.g:4698:1: ( 'is' )
            // InternalMyLanguage.g:4699:2: 'is'
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getIsKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDistanceToLocationSentAccess().getIsKeyword_3()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__3__Impl"


    // $ANTLR start "rule__DistanceToLocationSent__Group__4"
    // InternalMyLanguage.g:4708:1: rule__DistanceToLocationSent__Group__4 : rule__DistanceToLocationSent__Group__4__Impl rule__DistanceToLocationSent__Group__5 ;
    public final void rule__DistanceToLocationSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4712:1: ( rule__DistanceToLocationSent__Group__4__Impl rule__DistanceToLocationSent__Group__5 )
            // InternalMyLanguage.g:4713:2: rule__DistanceToLocationSent__Group__4__Impl rule__DistanceToLocationSent__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__DistanceToLocationSent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__Group__5();

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__4"


    // $ANTLR start "rule__DistanceToLocationSent__Group__4__Impl"
    // InternalMyLanguage.g:4720:1: rule__DistanceToLocationSent__Group__4__Impl : ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) ) ;
    public final void rule__DistanceToLocationSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4724:1: ( ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) ) )
            // InternalMyLanguage.g:4725:1: ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) )
            {
            // InternalMyLanguage.g:4725:1: ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) )
            // InternalMyLanguage.g:4726:2: ( rule__DistanceToLocationSent__BodyAssignment_4 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getBodyAssignment_4()); 
            // InternalMyLanguage.g:4727:2: ( rule__DistanceToLocationSent__BodyAssignment_4 )
            // InternalMyLanguage.g:4727:3: rule__DistanceToLocationSent__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDistanceToLocationSentAccess().getBodyAssignment_4()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__4__Impl"


    // $ANTLR start "rule__DistanceToLocationSent__Group__5"
    // InternalMyLanguage.g:4735:1: rule__DistanceToLocationSent__Group__5 : rule__DistanceToLocationSent__Group__5__Impl ;
    public final void rule__DistanceToLocationSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4739:1: ( rule__DistanceToLocationSent__Group__5__Impl )
            // InternalMyLanguage.g:4740:2: rule__DistanceToLocationSent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__Group__5__Impl();

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__5"


    // $ANTLR start "rule__DistanceToLocationSent__Group__5__Impl"
    // InternalMyLanguage.g:4746:1: rule__DistanceToLocationSent__Group__5__Impl : ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? ) ;
    public final void rule__DistanceToLocationSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4750:1: ( ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:4751:1: ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:4751:1: ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:4752:2: ( rule__DistanceToLocationSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:4753:2: ( rule__DistanceToLocationSent__ToleranceAssignment_5 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==63) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyLanguage.g:4753:3: rule__DistanceToLocationSent__ToleranceAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__DistanceToLocationSent__ToleranceAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDistanceToLocationSentAccess().getToleranceAssignment_5()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__Group__5__Impl"


    // $ANTLR start "rule__DistanceToObstaclesSent__Group__0"
    // InternalMyLanguage.g:4762:1: rule__DistanceToObstaclesSent__Group__0 : rule__DistanceToObstaclesSent__Group__0__Impl rule__DistanceToObstaclesSent__Group__1 ;
    public final void rule__DistanceToObstaclesSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4766:1: ( rule__DistanceToObstaclesSent__Group__0__Impl rule__DistanceToObstaclesSent__Group__1 )
            // InternalMyLanguage.g:4767:2: rule__DistanceToObstaclesSent__Group__0__Impl rule__DistanceToObstaclesSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DistanceToObstaclesSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceToObstaclesSent__Group__1();

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
    // $ANTLR end "rule__DistanceToObstaclesSent__Group__0"


    // $ANTLR start "rule__DistanceToObstaclesSent__Group__0__Impl"
    // InternalMyLanguage.g:4774:1: rule__DistanceToObstaclesSent__Group__0__Impl : ( 'obstacles' ) ;
    public final void rule__DistanceToObstaclesSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4778:1: ( ( 'obstacles' ) )
            // InternalMyLanguage.g:4779:1: ( 'obstacles' )
            {
            // InternalMyLanguage.g:4779:1: ( 'obstacles' )
            // InternalMyLanguage.g:4780:2: 'obstacles'
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getObstaclesKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDistanceToObstaclesSentAccess().getObstaclesKeyword_0()); 

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
    // $ANTLR end "rule__DistanceToObstaclesSent__Group__0__Impl"


    // $ANTLR start "rule__DistanceToObstaclesSent__Group__1"
    // InternalMyLanguage.g:4789:1: rule__DistanceToObstaclesSent__Group__1 : rule__DistanceToObstaclesSent__Group__1__Impl rule__DistanceToObstaclesSent__Group__2 ;
    public final void rule__DistanceToObstaclesSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4793:1: ( rule__DistanceToObstaclesSent__Group__1__Impl rule__DistanceToObstaclesSent__Group__2 )
            // InternalMyLanguage.g:4794:2: rule__DistanceToObstaclesSent__Group__1__Impl rule__DistanceToObstaclesSent__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__DistanceToObstaclesSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceToObstaclesSent__Group__2();

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
    // $ANTLR end "rule__DistanceToObstaclesSent__Group__1"


    // $ANTLR start "rule__DistanceToObstaclesSent__Group__1__Impl"
    // InternalMyLanguage.g:4801:1: rule__DistanceToObstaclesSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__DistanceToObstaclesSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4805:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4806:1: ( 'is' )
            {
            // InternalMyLanguage.g:4806:1: ( 'is' )
            // InternalMyLanguage.g:4807:2: 'is'
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDistanceToObstaclesSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__DistanceToObstaclesSent__Group__1__Impl"


    // $ANTLR start "rule__DistanceToObstaclesSent__Group__2"
    // InternalMyLanguage.g:4816:1: rule__DistanceToObstaclesSent__Group__2 : rule__DistanceToObstaclesSent__Group__2__Impl rule__DistanceToObstaclesSent__Group__3 ;
    public final void rule__DistanceToObstaclesSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4820:1: ( rule__DistanceToObstaclesSent__Group__2__Impl rule__DistanceToObstaclesSent__Group__3 )
            // InternalMyLanguage.g:4821:2: rule__DistanceToObstaclesSent__Group__2__Impl rule__DistanceToObstaclesSent__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__DistanceToObstaclesSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceToObstaclesSent__Group__3();

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
    // $ANTLR end "rule__DistanceToObstaclesSent__Group__2"


    // $ANTLR start "rule__DistanceToObstaclesSent__Group__2__Impl"
    // InternalMyLanguage.g:4828:1: rule__DistanceToObstaclesSent__Group__2__Impl : ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) ) ;
    public final void rule__DistanceToObstaclesSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4832:1: ( ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) ) )
            // InternalMyLanguage.g:4833:1: ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) )
            {
            // InternalMyLanguage.g:4833:1: ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) )
            // InternalMyLanguage.g:4834:2: ( rule__DistanceToObstaclesSent__BodyAssignment_2 )
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAssignment_2()); 
            // InternalMyLanguage.g:4835:2: ( rule__DistanceToObstaclesSent__BodyAssignment_2 )
            // InternalMyLanguage.g:4835:3: rule__DistanceToObstaclesSent__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToObstaclesSent__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAssignment_2()); 

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
    // $ANTLR end "rule__DistanceToObstaclesSent__Group__2__Impl"


    // $ANTLR start "rule__DistanceToObstaclesSent__Group__3"
    // InternalMyLanguage.g:4843:1: rule__DistanceToObstaclesSent__Group__3 : rule__DistanceToObstaclesSent__Group__3__Impl ;
    public final void rule__DistanceToObstaclesSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4847:1: ( rule__DistanceToObstaclesSent__Group__3__Impl )
            // InternalMyLanguage.g:4848:2: rule__DistanceToObstaclesSent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToObstaclesSent__Group__3__Impl();

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
    // $ANTLR end "rule__DistanceToObstaclesSent__Group__3"


    // $ANTLR start "rule__DistanceToObstaclesSent__Group__3__Impl"
    // InternalMyLanguage.g:4854:1: rule__DistanceToObstaclesSent__Group__3__Impl : ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? ) ;
    public final void rule__DistanceToObstaclesSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4858:1: ( ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? ) )
            // InternalMyLanguage.g:4859:1: ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? )
            {
            // InternalMyLanguage.g:4859:1: ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? )
            // InternalMyLanguage.g:4860:2: ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )?
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getToleranceAssignment_3()); 
            // InternalMyLanguage.g:4861:2: ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==63) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyLanguage.g:4861:3: rule__DistanceToObstaclesSent__ToleranceAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DistanceToObstaclesSent__ToleranceAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDistanceToObstaclesSentAccess().getToleranceAssignment_3()); 

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
    // $ANTLR end "rule__DistanceToObstaclesSent__Group__3__Impl"


    // $ANTLR start "rule__EqualSent__Group__0"
    // InternalMyLanguage.g:4870:1: rule__EqualSent__Group__0 : rule__EqualSent__Group__0__Impl rule__EqualSent__Group__1 ;
    public final void rule__EqualSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4874:1: ( rule__EqualSent__Group__0__Impl rule__EqualSent__Group__1 )
            // InternalMyLanguage.g:4875:2: rule__EqualSent__Group__0__Impl rule__EqualSent__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__EqualSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualSent__Group__1();

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
    // $ANTLR end "rule__EqualSent__Group__0"


    // $ANTLR start "rule__EqualSent__Group__0__Impl"
    // InternalMyLanguage.g:4882:1: rule__EqualSent__Group__0__Impl : ( 'equal' ) ;
    public final void rule__EqualSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4886:1: ( ( 'equal' ) )
            // InternalMyLanguage.g:4887:1: ( 'equal' )
            {
            // InternalMyLanguage.g:4887:1: ( 'equal' )
            // InternalMyLanguage.g:4888:2: 'equal'
            {
             before(grammarAccess.getEqualSentAccess().getEqualKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getEqualSentAccess().getEqualKeyword_0()); 

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
    // $ANTLR end "rule__EqualSent__Group__0__Impl"


    // $ANTLR start "rule__EqualSent__Group__1"
    // InternalMyLanguage.g:4897:1: rule__EqualSent__Group__1 : rule__EqualSent__Group__1__Impl rule__EqualSent__Group__2 ;
    public final void rule__EqualSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4901:1: ( rule__EqualSent__Group__1__Impl rule__EqualSent__Group__2 )
            // InternalMyLanguage.g:4902:2: rule__EqualSent__Group__1__Impl rule__EqualSent__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__EqualSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualSent__Group__2();

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
    // $ANTLR end "rule__EqualSent__Group__1"


    // $ANTLR start "rule__EqualSent__Group__1__Impl"
    // InternalMyLanguage.g:4909:1: rule__EqualSent__Group__1__Impl : ( 'to' ) ;
    public final void rule__EqualSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4913:1: ( ( 'to' ) )
            // InternalMyLanguage.g:4914:1: ( 'to' )
            {
            // InternalMyLanguage.g:4914:1: ( 'to' )
            // InternalMyLanguage.g:4915:2: 'to'
            {
             before(grammarAccess.getEqualSentAccess().getToKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEqualSentAccess().getToKeyword_1()); 

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
    // $ANTLR end "rule__EqualSent__Group__1__Impl"


    // $ANTLR start "rule__EqualSent__Group__2"
    // InternalMyLanguage.g:4924:1: rule__EqualSent__Group__2 : rule__EqualSent__Group__2__Impl ;
    public final void rule__EqualSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4928:1: ( rule__EqualSent__Group__2__Impl )
            // InternalMyLanguage.g:4929:2: rule__EqualSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualSent__Group__2__Impl();

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
    // $ANTLR end "rule__EqualSent__Group__2"


    // $ANTLR start "rule__EqualSent__Group__2__Impl"
    // InternalMyLanguage.g:4935:1: rule__EqualSent__Group__2__Impl : ( ( rule__EqualSent__AmountAssignment_2 ) ) ;
    public final void rule__EqualSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4939:1: ( ( ( rule__EqualSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:4940:1: ( ( rule__EqualSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:4940:1: ( ( rule__EqualSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:4941:2: ( rule__EqualSent__AmountAssignment_2 )
            {
             before(grammarAccess.getEqualSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:4942:2: ( rule__EqualSent__AmountAssignment_2 )
            // InternalMyLanguage.g:4942:3: rule__EqualSent__AmountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualSent__AmountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualSentAccess().getAmountAssignment_2()); 

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
    // $ANTLR end "rule__EqualSent__Group__2__Impl"


    // $ANTLR start "rule__LessSent__Group__0"
    // InternalMyLanguage.g:4951:1: rule__LessSent__Group__0 : rule__LessSent__Group__0__Impl rule__LessSent__Group__1 ;
    public final void rule__LessSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4955:1: ( rule__LessSent__Group__0__Impl rule__LessSent__Group__1 )
            // InternalMyLanguage.g:4956:2: rule__LessSent__Group__0__Impl rule__LessSent__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__LessSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessSent__Group__1();

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
    // $ANTLR end "rule__LessSent__Group__0"


    // $ANTLR start "rule__LessSent__Group__0__Impl"
    // InternalMyLanguage.g:4963:1: rule__LessSent__Group__0__Impl : ( 'lower' ) ;
    public final void rule__LessSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4967:1: ( ( 'lower' ) )
            // InternalMyLanguage.g:4968:1: ( 'lower' )
            {
            // InternalMyLanguage.g:4968:1: ( 'lower' )
            // InternalMyLanguage.g:4969:2: 'lower'
            {
             before(grammarAccess.getLessSentAccess().getLowerKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getLessSentAccess().getLowerKeyword_0()); 

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
    // $ANTLR end "rule__LessSent__Group__0__Impl"


    // $ANTLR start "rule__LessSent__Group__1"
    // InternalMyLanguage.g:4978:1: rule__LessSent__Group__1 : rule__LessSent__Group__1__Impl rule__LessSent__Group__2 ;
    public final void rule__LessSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4982:1: ( rule__LessSent__Group__1__Impl rule__LessSent__Group__2 )
            // InternalMyLanguage.g:4983:2: rule__LessSent__Group__1__Impl rule__LessSent__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__LessSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessSent__Group__2();

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
    // $ANTLR end "rule__LessSent__Group__1"


    // $ANTLR start "rule__LessSent__Group__1__Impl"
    // InternalMyLanguage.g:4990:1: rule__LessSent__Group__1__Impl : ( 'then' ) ;
    public final void rule__LessSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4994:1: ( ( 'then' ) )
            // InternalMyLanguage.g:4995:1: ( 'then' )
            {
            // InternalMyLanguage.g:4995:1: ( 'then' )
            // InternalMyLanguage.g:4996:2: 'then'
            {
             before(grammarAccess.getLessSentAccess().getThenKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLessSentAccess().getThenKeyword_1()); 

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
    // $ANTLR end "rule__LessSent__Group__1__Impl"


    // $ANTLR start "rule__LessSent__Group__2"
    // InternalMyLanguage.g:5005:1: rule__LessSent__Group__2 : rule__LessSent__Group__2__Impl ;
    public final void rule__LessSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5009:1: ( rule__LessSent__Group__2__Impl )
            // InternalMyLanguage.g:5010:2: rule__LessSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessSent__Group__2__Impl();

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
    // $ANTLR end "rule__LessSent__Group__2"


    // $ANTLR start "rule__LessSent__Group__2__Impl"
    // InternalMyLanguage.g:5016:1: rule__LessSent__Group__2__Impl : ( ( rule__LessSent__AmountAssignment_2 ) ) ;
    public final void rule__LessSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5020:1: ( ( ( rule__LessSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:5021:1: ( ( rule__LessSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:5021:1: ( ( rule__LessSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:5022:2: ( rule__LessSent__AmountAssignment_2 )
            {
             before(grammarAccess.getLessSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:5023:2: ( rule__LessSent__AmountAssignment_2 )
            // InternalMyLanguage.g:5023:3: rule__LessSent__AmountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LessSent__AmountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLessSentAccess().getAmountAssignment_2()); 

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
    // $ANTLR end "rule__LessSent__Group__2__Impl"


    // $ANTLR start "rule__GreaterSent__Group__0"
    // InternalMyLanguage.g:5032:1: rule__GreaterSent__Group__0 : rule__GreaterSent__Group__0__Impl rule__GreaterSent__Group__1 ;
    public final void rule__GreaterSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5036:1: ( rule__GreaterSent__Group__0__Impl rule__GreaterSent__Group__1 )
            // InternalMyLanguage.g:5037:2: rule__GreaterSent__Group__0__Impl rule__GreaterSent__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__GreaterSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterSent__Group__1();

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
    // $ANTLR end "rule__GreaterSent__Group__0"


    // $ANTLR start "rule__GreaterSent__Group__0__Impl"
    // InternalMyLanguage.g:5044:1: rule__GreaterSent__Group__0__Impl : ( 'greater' ) ;
    public final void rule__GreaterSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5048:1: ( ( 'greater' ) )
            // InternalMyLanguage.g:5049:1: ( 'greater' )
            {
            // InternalMyLanguage.g:5049:1: ( 'greater' )
            // InternalMyLanguage.g:5050:2: 'greater'
            {
             before(grammarAccess.getGreaterSentAccess().getGreaterKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getGreaterSentAccess().getGreaterKeyword_0()); 

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
    // $ANTLR end "rule__GreaterSent__Group__0__Impl"


    // $ANTLR start "rule__GreaterSent__Group__1"
    // InternalMyLanguage.g:5059:1: rule__GreaterSent__Group__1 : rule__GreaterSent__Group__1__Impl rule__GreaterSent__Group__2 ;
    public final void rule__GreaterSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5063:1: ( rule__GreaterSent__Group__1__Impl rule__GreaterSent__Group__2 )
            // InternalMyLanguage.g:5064:2: rule__GreaterSent__Group__1__Impl rule__GreaterSent__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__GreaterSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterSent__Group__2();

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
    // $ANTLR end "rule__GreaterSent__Group__1"


    // $ANTLR start "rule__GreaterSent__Group__1__Impl"
    // InternalMyLanguage.g:5071:1: rule__GreaterSent__Group__1__Impl : ( 'then' ) ;
    public final void rule__GreaterSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5075:1: ( ( 'then' ) )
            // InternalMyLanguage.g:5076:1: ( 'then' )
            {
            // InternalMyLanguage.g:5076:1: ( 'then' )
            // InternalMyLanguage.g:5077:2: 'then'
            {
             before(grammarAccess.getGreaterSentAccess().getThenKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGreaterSentAccess().getThenKeyword_1()); 

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
    // $ANTLR end "rule__GreaterSent__Group__1__Impl"


    // $ANTLR start "rule__GreaterSent__Group__2"
    // InternalMyLanguage.g:5086:1: rule__GreaterSent__Group__2 : rule__GreaterSent__Group__2__Impl ;
    public final void rule__GreaterSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5090:1: ( rule__GreaterSent__Group__2__Impl )
            // InternalMyLanguage.g:5091:2: rule__GreaterSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GreaterSent__Group__2__Impl();

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
    // $ANTLR end "rule__GreaterSent__Group__2"


    // $ANTLR start "rule__GreaterSent__Group__2__Impl"
    // InternalMyLanguage.g:5097:1: rule__GreaterSent__Group__2__Impl : ( ( rule__GreaterSent__AmountAssignment_2 ) ) ;
    public final void rule__GreaterSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5101:1: ( ( ( rule__GreaterSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:5102:1: ( ( rule__GreaterSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:5102:1: ( ( rule__GreaterSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:5103:2: ( rule__GreaterSent__AmountAssignment_2 )
            {
             before(grammarAccess.getGreaterSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:5104:2: ( rule__GreaterSent__AmountAssignment_2 )
            // InternalMyLanguage.g:5104:3: rule__GreaterSent__AmountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GreaterSent__AmountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGreaterSentAccess().getAmountAssignment_2()); 

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
    // $ANTLR end "rule__GreaterSent__Group__2__Impl"


    // $ANTLR start "rule__RobotStateSent__Group__0"
    // InternalMyLanguage.g:5113:1: rule__RobotStateSent__Group__0 : rule__RobotStateSent__Group__0__Impl rule__RobotStateSent__Group__1 ;
    public final void rule__RobotStateSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5117:1: ( rule__RobotStateSent__Group__0__Impl rule__RobotStateSent__Group__1 )
            // InternalMyLanguage.g:5118:2: rule__RobotStateSent__Group__0__Impl rule__RobotStateSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RobotStateSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotStateSent__Group__1();

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
    // $ANTLR end "rule__RobotStateSent__Group__0"


    // $ANTLR start "rule__RobotStateSent__Group__0__Impl"
    // InternalMyLanguage.g:5125:1: rule__RobotStateSent__Group__0__Impl : ( 'state' ) ;
    public final void rule__RobotStateSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5129:1: ( ( 'state' ) )
            // InternalMyLanguage.g:5130:1: ( 'state' )
            {
            // InternalMyLanguage.g:5130:1: ( 'state' )
            // InternalMyLanguage.g:5131:2: 'state'
            {
             before(grammarAccess.getRobotStateSentAccess().getStateKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRobotStateSentAccess().getStateKeyword_0()); 

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
    // $ANTLR end "rule__RobotStateSent__Group__0__Impl"


    // $ANTLR start "rule__RobotStateSent__Group__1"
    // InternalMyLanguage.g:5140:1: rule__RobotStateSent__Group__1 : rule__RobotStateSent__Group__1__Impl rule__RobotStateSent__Group__2 ;
    public final void rule__RobotStateSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5144:1: ( rule__RobotStateSent__Group__1__Impl rule__RobotStateSent__Group__2 )
            // InternalMyLanguage.g:5145:2: rule__RobotStateSent__Group__1__Impl rule__RobotStateSent__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RobotStateSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotStateSent__Group__2();

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
    // $ANTLR end "rule__RobotStateSent__Group__1"


    // $ANTLR start "rule__RobotStateSent__Group__1__Impl"
    // InternalMyLanguage.g:5152:1: rule__RobotStateSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotStateSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5156:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5157:1: ( 'is' )
            {
            // InternalMyLanguage.g:5157:1: ( 'is' )
            // InternalMyLanguage.g:5158:2: 'is'
            {
             before(grammarAccess.getRobotStateSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRobotStateSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__RobotStateSent__Group__1__Impl"


    // $ANTLR start "rule__RobotStateSent__Group__2"
    // InternalMyLanguage.g:5167:1: rule__RobotStateSent__Group__2 : rule__RobotStateSent__Group__2__Impl ;
    public final void rule__RobotStateSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5171:1: ( rule__RobotStateSent__Group__2__Impl )
            // InternalMyLanguage.g:5172:2: rule__RobotStateSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotStateSent__Group__2__Impl();

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
    // $ANTLR end "rule__RobotStateSent__Group__2"


    // $ANTLR start "rule__RobotStateSent__Group__2__Impl"
    // InternalMyLanguage.g:5178:1: rule__RobotStateSent__Group__2__Impl : ( ( rule__RobotStateSent__StateAssignment_2 ) ) ;
    public final void rule__RobotStateSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5182:1: ( ( ( rule__RobotStateSent__StateAssignment_2 ) ) )
            // InternalMyLanguage.g:5183:1: ( ( rule__RobotStateSent__StateAssignment_2 ) )
            {
            // InternalMyLanguage.g:5183:1: ( ( rule__RobotStateSent__StateAssignment_2 ) )
            // InternalMyLanguage.g:5184:2: ( rule__RobotStateSent__StateAssignment_2 )
            {
             before(grammarAccess.getRobotStateSentAccess().getStateAssignment_2()); 
            // InternalMyLanguage.g:5185:2: ( rule__RobotStateSent__StateAssignment_2 )
            // InternalMyLanguage.g:5185:3: rule__RobotStateSent__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotStateSent__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotStateSentAccess().getStateAssignment_2()); 

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
    // $ANTLR end "rule__RobotStateSent__Group__2__Impl"


    // $ANTLR start "rule__RobotPositionSent__Group__0"
    // InternalMyLanguage.g:5194:1: rule__RobotPositionSent__Group__0 : rule__RobotPositionSent__Group__0__Impl rule__RobotPositionSent__Group__1 ;
    public final void rule__RobotPositionSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5198:1: ( rule__RobotPositionSent__Group__0__Impl rule__RobotPositionSent__Group__1 )
            // InternalMyLanguage.g:5199:2: rule__RobotPositionSent__Group__0__Impl rule__RobotPositionSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RobotPositionSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__Group__1();

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
    // $ANTLR end "rule__RobotPositionSent__Group__0"


    // $ANTLR start "rule__RobotPositionSent__Group__0__Impl"
    // InternalMyLanguage.g:5206:1: rule__RobotPositionSent__Group__0__Impl : ( 'position' ) ;
    public final void rule__RobotPositionSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5210:1: ( ( 'position' ) )
            // InternalMyLanguage.g:5211:1: ( 'position' )
            {
            // InternalMyLanguage.g:5211:1: ( 'position' )
            // InternalMyLanguage.g:5212:2: 'position'
            {
             before(grammarAccess.getRobotPositionSentAccess().getPositionKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRobotPositionSentAccess().getPositionKeyword_0()); 

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
    // $ANTLR end "rule__RobotPositionSent__Group__0__Impl"


    // $ANTLR start "rule__RobotPositionSent__Group__1"
    // InternalMyLanguage.g:5221:1: rule__RobotPositionSent__Group__1 : rule__RobotPositionSent__Group__1__Impl rule__RobotPositionSent__Group__2 ;
    public final void rule__RobotPositionSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5225:1: ( rule__RobotPositionSent__Group__1__Impl rule__RobotPositionSent__Group__2 )
            // InternalMyLanguage.g:5226:2: rule__RobotPositionSent__Group__1__Impl rule__RobotPositionSent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RobotPositionSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__Group__2();

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
    // $ANTLR end "rule__RobotPositionSent__Group__1"


    // $ANTLR start "rule__RobotPositionSent__Group__1__Impl"
    // InternalMyLanguage.g:5233:1: rule__RobotPositionSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotPositionSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5237:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5238:1: ( 'is' )
            {
            // InternalMyLanguage.g:5238:1: ( 'is' )
            // InternalMyLanguage.g:5239:2: 'is'
            {
             before(grammarAccess.getRobotPositionSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRobotPositionSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__RobotPositionSent__Group__1__Impl"


    // $ANTLR start "rule__RobotPositionSent__Group__2"
    // InternalMyLanguage.g:5248:1: rule__RobotPositionSent__Group__2 : rule__RobotPositionSent__Group__2__Impl rule__RobotPositionSent__Group__3 ;
    public final void rule__RobotPositionSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5252:1: ( rule__RobotPositionSent__Group__2__Impl rule__RobotPositionSent__Group__3 )
            // InternalMyLanguage.g:5253:2: rule__RobotPositionSent__Group__2__Impl rule__RobotPositionSent__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RobotPositionSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__Group__3();

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
    // $ANTLR end "rule__RobotPositionSent__Group__2"


    // $ANTLR start "rule__RobotPositionSent__Group__2__Impl"
    // InternalMyLanguage.g:5260:1: rule__RobotPositionSent__Group__2__Impl : ( ( rule__RobotPositionSent__PosXAssignment_2 ) ) ;
    public final void rule__RobotPositionSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5264:1: ( ( ( rule__RobotPositionSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:5265:1: ( ( rule__RobotPositionSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:5265:1: ( ( rule__RobotPositionSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:5266:2: ( rule__RobotPositionSent__PosXAssignment_2 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:5267:2: ( rule__RobotPositionSent__PosXAssignment_2 )
            // InternalMyLanguage.g:5267:3: rule__RobotPositionSent__PosXAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__PosXAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotPositionSentAccess().getPosXAssignment_2()); 

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
    // $ANTLR end "rule__RobotPositionSent__Group__2__Impl"


    // $ANTLR start "rule__RobotPositionSent__Group__3"
    // InternalMyLanguage.g:5275:1: rule__RobotPositionSent__Group__3 : rule__RobotPositionSent__Group__3__Impl rule__RobotPositionSent__Group__4 ;
    public final void rule__RobotPositionSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5279:1: ( rule__RobotPositionSent__Group__3__Impl rule__RobotPositionSent__Group__4 )
            // InternalMyLanguage.g:5280:2: rule__RobotPositionSent__Group__3__Impl rule__RobotPositionSent__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RobotPositionSent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__Group__4();

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
    // $ANTLR end "rule__RobotPositionSent__Group__3"


    // $ANTLR start "rule__RobotPositionSent__Group__3__Impl"
    // InternalMyLanguage.g:5287:1: rule__RobotPositionSent__Group__3__Impl : ( ( rule__RobotPositionSent__PosYAssignment_3 ) ) ;
    public final void rule__RobotPositionSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5291:1: ( ( ( rule__RobotPositionSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:5292:1: ( ( rule__RobotPositionSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:5292:1: ( ( rule__RobotPositionSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:5293:2: ( rule__RobotPositionSent__PosYAssignment_3 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:5294:2: ( rule__RobotPositionSent__PosYAssignment_3 )
            // InternalMyLanguage.g:5294:3: rule__RobotPositionSent__PosYAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__PosYAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotPositionSentAccess().getPosYAssignment_3()); 

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
    // $ANTLR end "rule__RobotPositionSent__Group__3__Impl"


    // $ANTLR start "rule__RobotPositionSent__Group__4"
    // InternalMyLanguage.g:5302:1: rule__RobotPositionSent__Group__4 : rule__RobotPositionSent__Group__4__Impl rule__RobotPositionSent__Group__5 ;
    public final void rule__RobotPositionSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5306:1: ( rule__RobotPositionSent__Group__4__Impl rule__RobotPositionSent__Group__5 )
            // InternalMyLanguage.g:5307:2: rule__RobotPositionSent__Group__4__Impl rule__RobotPositionSent__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__RobotPositionSent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__Group__5();

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
    // $ANTLR end "rule__RobotPositionSent__Group__4"


    // $ANTLR start "rule__RobotPositionSent__Group__4__Impl"
    // InternalMyLanguage.g:5314:1: rule__RobotPositionSent__Group__4__Impl : ( ( rule__RobotPositionSent__PosZAssignment_4 ) ) ;
    public final void rule__RobotPositionSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5318:1: ( ( ( rule__RobotPositionSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:5319:1: ( ( rule__RobotPositionSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:5319:1: ( ( rule__RobotPositionSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:5320:2: ( rule__RobotPositionSent__PosZAssignment_4 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:5321:2: ( rule__RobotPositionSent__PosZAssignment_4 )
            // InternalMyLanguage.g:5321:3: rule__RobotPositionSent__PosZAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__PosZAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRobotPositionSentAccess().getPosZAssignment_4()); 

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
    // $ANTLR end "rule__RobotPositionSent__Group__4__Impl"


    // $ANTLR start "rule__RobotPositionSent__Group__5"
    // InternalMyLanguage.g:5329:1: rule__RobotPositionSent__Group__5 : rule__RobotPositionSent__Group__5__Impl ;
    public final void rule__RobotPositionSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5333:1: ( rule__RobotPositionSent__Group__5__Impl )
            // InternalMyLanguage.g:5334:2: rule__RobotPositionSent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__Group__5__Impl();

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
    // $ANTLR end "rule__RobotPositionSent__Group__5"


    // $ANTLR start "rule__RobotPositionSent__Group__5__Impl"
    // InternalMyLanguage.g:5340:1: rule__RobotPositionSent__Group__5__Impl : ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? ) ;
    public final void rule__RobotPositionSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5344:1: ( ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:5345:1: ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:5345:1: ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:5346:2: ( rule__RobotPositionSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getRobotPositionSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:5347:2: ( rule__RobotPositionSent__ToleranceAssignment_5 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==61) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyLanguage.g:5347:3: rule__RobotPositionSent__ToleranceAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotPositionSent__ToleranceAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotPositionSentAccess().getToleranceAssignment_5()); 

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
    // $ANTLR end "rule__RobotPositionSent__Group__5__Impl"


    // $ANTLR start "rule__CirclePosition__Group__0"
    // InternalMyLanguage.g:5356:1: rule__CirclePosition__Group__0 : rule__CirclePosition__Group__0__Impl rule__CirclePosition__Group__1 ;
    public final void rule__CirclePosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5360:1: ( rule__CirclePosition__Group__0__Impl rule__CirclePosition__Group__1 )
            // InternalMyLanguage.g:5361:2: rule__CirclePosition__Group__0__Impl rule__CirclePosition__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__CirclePosition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CirclePosition__Group__1();

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
    // $ANTLR end "rule__CirclePosition__Group__0"


    // $ANTLR start "rule__CirclePosition__Group__0__Impl"
    // InternalMyLanguage.g:5368:1: rule__CirclePosition__Group__0__Impl : ( 'within' ) ;
    public final void rule__CirclePosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5372:1: ( ( 'within' ) )
            // InternalMyLanguage.g:5373:1: ( 'within' )
            {
            // InternalMyLanguage.g:5373:1: ( 'within' )
            // InternalMyLanguage.g:5374:2: 'within'
            {
             before(grammarAccess.getCirclePositionAccess().getWithinKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getCirclePositionAccess().getWithinKeyword_0()); 

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
    // $ANTLR end "rule__CirclePosition__Group__0__Impl"


    // $ANTLR start "rule__CirclePosition__Group__1"
    // InternalMyLanguage.g:5383:1: rule__CirclePosition__Group__1 : rule__CirclePosition__Group__1__Impl rule__CirclePosition__Group__2 ;
    public final void rule__CirclePosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5387:1: ( rule__CirclePosition__Group__1__Impl rule__CirclePosition__Group__2 )
            // InternalMyLanguage.g:5388:2: rule__CirclePosition__Group__1__Impl rule__CirclePosition__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__CirclePosition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CirclePosition__Group__2();

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
    // $ANTLR end "rule__CirclePosition__Group__1"


    // $ANTLR start "rule__CirclePosition__Group__1__Impl"
    // InternalMyLanguage.g:5395:1: rule__CirclePosition__Group__1__Impl : ( 'circle' ) ;
    public final void rule__CirclePosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5399:1: ( ( 'circle' ) )
            // InternalMyLanguage.g:5400:1: ( 'circle' )
            {
            // InternalMyLanguage.g:5400:1: ( 'circle' )
            // InternalMyLanguage.g:5401:2: 'circle'
            {
             before(grammarAccess.getCirclePositionAccess().getCircleKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getCirclePositionAccess().getCircleKeyword_1()); 

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
    // $ANTLR end "rule__CirclePosition__Group__1__Impl"


    // $ANTLR start "rule__CirclePosition__Group__2"
    // InternalMyLanguage.g:5410:1: rule__CirclePosition__Group__2 : rule__CirclePosition__Group__2__Impl rule__CirclePosition__Group__3 ;
    public final void rule__CirclePosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5414:1: ( rule__CirclePosition__Group__2__Impl rule__CirclePosition__Group__3 )
            // InternalMyLanguage.g:5415:2: rule__CirclePosition__Group__2__Impl rule__CirclePosition__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__CirclePosition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CirclePosition__Group__3();

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
    // $ANTLR end "rule__CirclePosition__Group__2"


    // $ANTLR start "rule__CirclePosition__Group__2__Impl"
    // InternalMyLanguage.g:5422:1: rule__CirclePosition__Group__2__Impl : ( 'with' ) ;
    public final void rule__CirclePosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5426:1: ( ( 'with' ) )
            // InternalMyLanguage.g:5427:1: ( 'with' )
            {
            // InternalMyLanguage.g:5427:1: ( 'with' )
            // InternalMyLanguage.g:5428:2: 'with'
            {
             before(grammarAccess.getCirclePositionAccess().getWithKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getCirclePositionAccess().getWithKeyword_2()); 

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
    // $ANTLR end "rule__CirclePosition__Group__2__Impl"


    // $ANTLR start "rule__CirclePosition__Group__3"
    // InternalMyLanguage.g:5437:1: rule__CirclePosition__Group__3 : rule__CirclePosition__Group__3__Impl rule__CirclePosition__Group__4 ;
    public final void rule__CirclePosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5441:1: ( rule__CirclePosition__Group__3__Impl rule__CirclePosition__Group__4 )
            // InternalMyLanguage.g:5442:2: rule__CirclePosition__Group__3__Impl rule__CirclePosition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__CirclePosition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CirclePosition__Group__4();

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
    // $ANTLR end "rule__CirclePosition__Group__3"


    // $ANTLR start "rule__CirclePosition__Group__3__Impl"
    // InternalMyLanguage.g:5449:1: rule__CirclePosition__Group__3__Impl : ( 'radius' ) ;
    public final void rule__CirclePosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5453:1: ( ( 'radius' ) )
            // InternalMyLanguage.g:5454:1: ( 'radius' )
            {
            // InternalMyLanguage.g:5454:1: ( 'radius' )
            // InternalMyLanguage.g:5455:2: 'radius'
            {
             before(grammarAccess.getCirclePositionAccess().getRadiusKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getCirclePositionAccess().getRadiusKeyword_3()); 

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
    // $ANTLR end "rule__CirclePosition__Group__3__Impl"


    // $ANTLR start "rule__CirclePosition__Group__4"
    // InternalMyLanguage.g:5464:1: rule__CirclePosition__Group__4 : rule__CirclePosition__Group__4__Impl ;
    public final void rule__CirclePosition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5468:1: ( rule__CirclePosition__Group__4__Impl )
            // InternalMyLanguage.g:5469:2: rule__CirclePosition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CirclePosition__Group__4__Impl();

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
    // $ANTLR end "rule__CirclePosition__Group__4"


    // $ANTLR start "rule__CirclePosition__Group__4__Impl"
    // InternalMyLanguage.g:5475:1: rule__CirclePosition__Group__4__Impl : ( ( rule__CirclePosition__ToleranceAssignment_4 ) ) ;
    public final void rule__CirclePosition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5479:1: ( ( ( rule__CirclePosition__ToleranceAssignment_4 ) ) )
            // InternalMyLanguage.g:5480:1: ( ( rule__CirclePosition__ToleranceAssignment_4 ) )
            {
            // InternalMyLanguage.g:5480:1: ( ( rule__CirclePosition__ToleranceAssignment_4 ) )
            // InternalMyLanguage.g:5481:2: ( rule__CirclePosition__ToleranceAssignment_4 )
            {
             before(grammarAccess.getCirclePositionAccess().getToleranceAssignment_4()); 
            // InternalMyLanguage.g:5482:2: ( rule__CirclePosition__ToleranceAssignment_4 )
            // InternalMyLanguage.g:5482:3: rule__CirclePosition__ToleranceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CirclePosition__ToleranceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCirclePositionAccess().getToleranceAssignment_4()); 

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
    // $ANTLR end "rule__CirclePosition__Group__4__Impl"


    // $ANTLR start "rule__SpherePosition__Group__0"
    // InternalMyLanguage.g:5491:1: rule__SpherePosition__Group__0 : rule__SpherePosition__Group__0__Impl rule__SpherePosition__Group__1 ;
    public final void rule__SpherePosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5495:1: ( rule__SpherePosition__Group__0__Impl rule__SpherePosition__Group__1 )
            // InternalMyLanguage.g:5496:2: rule__SpherePosition__Group__0__Impl rule__SpherePosition__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__SpherePosition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpherePosition__Group__1();

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
    // $ANTLR end "rule__SpherePosition__Group__0"


    // $ANTLR start "rule__SpherePosition__Group__0__Impl"
    // InternalMyLanguage.g:5503:1: rule__SpherePosition__Group__0__Impl : ( 'within' ) ;
    public final void rule__SpherePosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5507:1: ( ( 'within' ) )
            // InternalMyLanguage.g:5508:1: ( 'within' )
            {
            // InternalMyLanguage.g:5508:1: ( 'within' )
            // InternalMyLanguage.g:5509:2: 'within'
            {
             before(grammarAccess.getSpherePositionAccess().getWithinKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getSpherePositionAccess().getWithinKeyword_0()); 

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
    // $ANTLR end "rule__SpherePosition__Group__0__Impl"


    // $ANTLR start "rule__SpherePosition__Group__1"
    // InternalMyLanguage.g:5518:1: rule__SpherePosition__Group__1 : rule__SpherePosition__Group__1__Impl rule__SpherePosition__Group__2 ;
    public final void rule__SpherePosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5522:1: ( rule__SpherePosition__Group__1__Impl rule__SpherePosition__Group__2 )
            // InternalMyLanguage.g:5523:2: rule__SpherePosition__Group__1__Impl rule__SpherePosition__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__SpherePosition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpherePosition__Group__2();

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
    // $ANTLR end "rule__SpherePosition__Group__1"


    // $ANTLR start "rule__SpherePosition__Group__1__Impl"
    // InternalMyLanguage.g:5530:1: rule__SpherePosition__Group__1__Impl : ( 'sphere' ) ;
    public final void rule__SpherePosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5534:1: ( ( 'sphere' ) )
            // InternalMyLanguage.g:5535:1: ( 'sphere' )
            {
            // InternalMyLanguage.g:5535:1: ( 'sphere' )
            // InternalMyLanguage.g:5536:2: 'sphere'
            {
             before(grammarAccess.getSpherePositionAccess().getSphereKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSpherePositionAccess().getSphereKeyword_1()); 

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
    // $ANTLR end "rule__SpherePosition__Group__1__Impl"


    // $ANTLR start "rule__SpherePosition__Group__2"
    // InternalMyLanguage.g:5545:1: rule__SpherePosition__Group__2 : rule__SpherePosition__Group__2__Impl rule__SpherePosition__Group__3 ;
    public final void rule__SpherePosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5549:1: ( rule__SpherePosition__Group__2__Impl rule__SpherePosition__Group__3 )
            // InternalMyLanguage.g:5550:2: rule__SpherePosition__Group__2__Impl rule__SpherePosition__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__SpherePosition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpherePosition__Group__3();

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
    // $ANTLR end "rule__SpherePosition__Group__2"


    // $ANTLR start "rule__SpherePosition__Group__2__Impl"
    // InternalMyLanguage.g:5557:1: rule__SpherePosition__Group__2__Impl : ( 'with' ) ;
    public final void rule__SpherePosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5561:1: ( ( 'with' ) )
            // InternalMyLanguage.g:5562:1: ( 'with' )
            {
            // InternalMyLanguage.g:5562:1: ( 'with' )
            // InternalMyLanguage.g:5563:2: 'with'
            {
             before(grammarAccess.getSpherePositionAccess().getWithKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSpherePositionAccess().getWithKeyword_2()); 

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
    // $ANTLR end "rule__SpherePosition__Group__2__Impl"


    // $ANTLR start "rule__SpherePosition__Group__3"
    // InternalMyLanguage.g:5572:1: rule__SpherePosition__Group__3 : rule__SpherePosition__Group__3__Impl rule__SpherePosition__Group__4 ;
    public final void rule__SpherePosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5576:1: ( rule__SpherePosition__Group__3__Impl rule__SpherePosition__Group__4 )
            // InternalMyLanguage.g:5577:2: rule__SpherePosition__Group__3__Impl rule__SpherePosition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SpherePosition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpherePosition__Group__4();

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
    // $ANTLR end "rule__SpherePosition__Group__3"


    // $ANTLR start "rule__SpherePosition__Group__3__Impl"
    // InternalMyLanguage.g:5584:1: rule__SpherePosition__Group__3__Impl : ( 'radius' ) ;
    public final void rule__SpherePosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5588:1: ( ( 'radius' ) )
            // InternalMyLanguage.g:5589:1: ( 'radius' )
            {
            // InternalMyLanguage.g:5589:1: ( 'radius' )
            // InternalMyLanguage.g:5590:2: 'radius'
            {
             before(grammarAccess.getSpherePositionAccess().getRadiusKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getSpherePositionAccess().getRadiusKeyword_3()); 

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
    // $ANTLR end "rule__SpherePosition__Group__3__Impl"


    // $ANTLR start "rule__SpherePosition__Group__4"
    // InternalMyLanguage.g:5599:1: rule__SpherePosition__Group__4 : rule__SpherePosition__Group__4__Impl ;
    public final void rule__SpherePosition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5603:1: ( rule__SpherePosition__Group__4__Impl )
            // InternalMyLanguage.g:5604:2: rule__SpherePosition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpherePosition__Group__4__Impl();

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
    // $ANTLR end "rule__SpherePosition__Group__4"


    // $ANTLR start "rule__SpherePosition__Group__4__Impl"
    // InternalMyLanguage.g:5610:1: rule__SpherePosition__Group__4__Impl : ( ( rule__SpherePosition__ToleranceAssignment_4 ) ) ;
    public final void rule__SpherePosition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5614:1: ( ( ( rule__SpherePosition__ToleranceAssignment_4 ) ) )
            // InternalMyLanguage.g:5615:1: ( ( rule__SpherePosition__ToleranceAssignment_4 ) )
            {
            // InternalMyLanguage.g:5615:1: ( ( rule__SpherePosition__ToleranceAssignment_4 ) )
            // InternalMyLanguage.g:5616:2: ( rule__SpherePosition__ToleranceAssignment_4 )
            {
             before(grammarAccess.getSpherePositionAccess().getToleranceAssignment_4()); 
            // InternalMyLanguage.g:5617:2: ( rule__SpherePosition__ToleranceAssignment_4 )
            // InternalMyLanguage.g:5617:3: rule__SpherePosition__ToleranceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SpherePosition__ToleranceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpherePositionAccess().getToleranceAssignment_4()); 

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
    // $ANTLR end "rule__SpherePosition__Group__4__Impl"


    // $ANTLR start "rule__RobotSpeedSent__Group__0"
    // InternalMyLanguage.g:5626:1: rule__RobotSpeedSent__Group__0 : rule__RobotSpeedSent__Group__0__Impl rule__RobotSpeedSent__Group__1 ;
    public final void rule__RobotSpeedSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5630:1: ( rule__RobotSpeedSent__Group__0__Impl rule__RobotSpeedSent__Group__1 )
            // InternalMyLanguage.g:5631:2: rule__RobotSpeedSent__Group__0__Impl rule__RobotSpeedSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RobotSpeedSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotSpeedSent__Group__1();

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
    // $ANTLR end "rule__RobotSpeedSent__Group__0"


    // $ANTLR start "rule__RobotSpeedSent__Group__0__Impl"
    // InternalMyLanguage.g:5638:1: rule__RobotSpeedSent__Group__0__Impl : ( 'speed' ) ;
    public final void rule__RobotSpeedSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5642:1: ( ( 'speed' ) )
            // InternalMyLanguage.g:5643:1: ( 'speed' )
            {
            // InternalMyLanguage.g:5643:1: ( 'speed' )
            // InternalMyLanguage.g:5644:2: 'speed'
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getRobotSpeedSentAccess().getSpeedKeyword_0()); 

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
    // $ANTLR end "rule__RobotSpeedSent__Group__0__Impl"


    // $ANTLR start "rule__RobotSpeedSent__Group__1"
    // InternalMyLanguage.g:5653:1: rule__RobotSpeedSent__Group__1 : rule__RobotSpeedSent__Group__1__Impl rule__RobotSpeedSent__Group__2 ;
    public final void rule__RobotSpeedSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5657:1: ( rule__RobotSpeedSent__Group__1__Impl rule__RobotSpeedSent__Group__2 )
            // InternalMyLanguage.g:5658:2: rule__RobotSpeedSent__Group__1__Impl rule__RobotSpeedSent__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__RobotSpeedSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotSpeedSent__Group__2();

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
    // $ANTLR end "rule__RobotSpeedSent__Group__1"


    // $ANTLR start "rule__RobotSpeedSent__Group__1__Impl"
    // InternalMyLanguage.g:5665:1: rule__RobotSpeedSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotSpeedSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5669:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5670:1: ( 'is' )
            {
            // InternalMyLanguage.g:5670:1: ( 'is' )
            // InternalMyLanguage.g:5671:2: 'is'
            {
             before(grammarAccess.getRobotSpeedSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRobotSpeedSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__RobotSpeedSent__Group__1__Impl"


    // $ANTLR start "rule__RobotSpeedSent__Group__2"
    // InternalMyLanguage.g:5680:1: rule__RobotSpeedSent__Group__2 : rule__RobotSpeedSent__Group__2__Impl rule__RobotSpeedSent__Group__3 ;
    public final void rule__RobotSpeedSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5684:1: ( rule__RobotSpeedSent__Group__2__Impl rule__RobotSpeedSent__Group__3 )
            // InternalMyLanguage.g:5685:2: rule__RobotSpeedSent__Group__2__Impl rule__RobotSpeedSent__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__RobotSpeedSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotSpeedSent__Group__3();

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
    // $ANTLR end "rule__RobotSpeedSent__Group__2"


    // $ANTLR start "rule__RobotSpeedSent__Group__2__Impl"
    // InternalMyLanguage.g:5692:1: rule__RobotSpeedSent__Group__2__Impl : ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) ) ;
    public final void rule__RobotSpeedSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5696:1: ( ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) ) )
            // InternalMyLanguage.g:5697:1: ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) )
            {
            // InternalMyLanguage.g:5697:1: ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) )
            // InternalMyLanguage.g:5698:2: ( rule__RobotSpeedSent__SpeedXAssignment_2 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedXAssignment_2()); 
            // InternalMyLanguage.g:5699:2: ( rule__RobotSpeedSent__SpeedXAssignment_2 )
            // InternalMyLanguage.g:5699:3: rule__RobotSpeedSent__SpeedXAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotSpeedSent__SpeedXAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotSpeedSentAccess().getSpeedXAssignment_2()); 

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
    // $ANTLR end "rule__RobotSpeedSent__Group__2__Impl"


    // $ANTLR start "rule__RobotSpeedSent__Group__3"
    // InternalMyLanguage.g:5707:1: rule__RobotSpeedSent__Group__3 : rule__RobotSpeedSent__Group__3__Impl rule__RobotSpeedSent__Group__4 ;
    public final void rule__RobotSpeedSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5711:1: ( rule__RobotSpeedSent__Group__3__Impl rule__RobotSpeedSent__Group__4 )
            // InternalMyLanguage.g:5712:2: rule__RobotSpeedSent__Group__3__Impl rule__RobotSpeedSent__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__RobotSpeedSent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotSpeedSent__Group__4();

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
    // $ANTLR end "rule__RobotSpeedSent__Group__3"


    // $ANTLR start "rule__RobotSpeedSent__Group__3__Impl"
    // InternalMyLanguage.g:5719:1: rule__RobotSpeedSent__Group__3__Impl : ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) ) ;
    public final void rule__RobotSpeedSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5723:1: ( ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) ) )
            // InternalMyLanguage.g:5724:1: ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) )
            {
            // InternalMyLanguage.g:5724:1: ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) )
            // InternalMyLanguage.g:5725:2: ( rule__RobotSpeedSent__SpeedYAssignment_3 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedYAssignment_3()); 
            // InternalMyLanguage.g:5726:2: ( rule__RobotSpeedSent__SpeedYAssignment_3 )
            // InternalMyLanguage.g:5726:3: rule__RobotSpeedSent__SpeedYAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RobotSpeedSent__SpeedYAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotSpeedSentAccess().getSpeedYAssignment_3()); 

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
    // $ANTLR end "rule__RobotSpeedSent__Group__3__Impl"


    // $ANTLR start "rule__RobotSpeedSent__Group__4"
    // InternalMyLanguage.g:5734:1: rule__RobotSpeedSent__Group__4 : rule__RobotSpeedSent__Group__4__Impl ;
    public final void rule__RobotSpeedSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5738:1: ( rule__RobotSpeedSent__Group__4__Impl )
            // InternalMyLanguage.g:5739:2: rule__RobotSpeedSent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotSpeedSent__Group__4__Impl();

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
    // $ANTLR end "rule__RobotSpeedSent__Group__4"


    // $ANTLR start "rule__RobotSpeedSent__Group__4__Impl"
    // InternalMyLanguage.g:5745:1: rule__RobotSpeedSent__Group__4__Impl : ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) ) ;
    public final void rule__RobotSpeedSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5749:1: ( ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) ) )
            // InternalMyLanguage.g:5750:1: ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) )
            {
            // InternalMyLanguage.g:5750:1: ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) )
            // InternalMyLanguage.g:5751:2: ( rule__RobotSpeedSent__SpeedZAssignment_4 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedZAssignment_4()); 
            // InternalMyLanguage.g:5752:2: ( rule__RobotSpeedSent__SpeedZAssignment_4 )
            // InternalMyLanguage.g:5752:3: rule__RobotSpeedSent__SpeedZAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RobotSpeedSent__SpeedZAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRobotSpeedSentAccess().getSpeedZAssignment_4()); 

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
    // $ANTLR end "rule__RobotSpeedSent__Group__4__Impl"


    // $ANTLR start "rule__EnvironmentSent__Group__0"
    // InternalMyLanguage.g:5761:1: rule__EnvironmentSent__Group__0 : rule__EnvironmentSent__Group__0__Impl rule__EnvironmentSent__Group__1 ;
    public final void rule__EnvironmentSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5765:1: ( rule__EnvironmentSent__Group__0__Impl rule__EnvironmentSent__Group__1 )
            // InternalMyLanguage.g:5766:2: rule__EnvironmentSent__Group__0__Impl rule__EnvironmentSent__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__EnvironmentSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentSent__Group__1();

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
    // $ANTLR end "rule__EnvironmentSent__Group__0"


    // $ANTLR start "rule__EnvironmentSent__Group__0__Impl"
    // InternalMyLanguage.g:5773:1: rule__EnvironmentSent__Group__0__Impl : ( 'Environment' ) ;
    public final void rule__EnvironmentSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5777:1: ( ( 'Environment' ) )
            // InternalMyLanguage.g:5778:1: ( 'Environment' )
            {
            // InternalMyLanguage.g:5778:1: ( 'Environment' )
            // InternalMyLanguage.g:5779:2: 'Environment'
            {
             before(grammarAccess.getEnvironmentSentAccess().getEnvironmentKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getEnvironmentSentAccess().getEnvironmentKeyword_0()); 

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
    // $ANTLR end "rule__EnvironmentSent__Group__0__Impl"


    // $ANTLR start "rule__EnvironmentSent__Group__1"
    // InternalMyLanguage.g:5788:1: rule__EnvironmentSent__Group__1 : rule__EnvironmentSent__Group__1__Impl rule__EnvironmentSent__Group__2 ;
    public final void rule__EnvironmentSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5792:1: ( rule__EnvironmentSent__Group__1__Impl rule__EnvironmentSent__Group__2 )
            // InternalMyLanguage.g:5793:2: rule__EnvironmentSent__Group__1__Impl rule__EnvironmentSent__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EnvironmentSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentSent__Group__2();

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
    // $ANTLR end "rule__EnvironmentSent__Group__1"


    // $ANTLR start "rule__EnvironmentSent__Group__1__Impl"
    // InternalMyLanguage.g:5800:1: rule__EnvironmentSent__Group__1__Impl : ( 'windspeed' ) ;
    public final void rule__EnvironmentSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5804:1: ( ( 'windspeed' ) )
            // InternalMyLanguage.g:5805:1: ( 'windspeed' )
            {
            // InternalMyLanguage.g:5805:1: ( 'windspeed' )
            // InternalMyLanguage.g:5806:2: 'windspeed'
            {
             before(grammarAccess.getEnvironmentSentAccess().getWindspeedKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getEnvironmentSentAccess().getWindspeedKeyword_1()); 

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
    // $ANTLR end "rule__EnvironmentSent__Group__1__Impl"


    // $ANTLR start "rule__EnvironmentSent__Group__2"
    // InternalMyLanguage.g:5815:1: rule__EnvironmentSent__Group__2 : rule__EnvironmentSent__Group__2__Impl rule__EnvironmentSent__Group__3 ;
    public final void rule__EnvironmentSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5819:1: ( rule__EnvironmentSent__Group__2__Impl rule__EnvironmentSent__Group__3 )
            // InternalMyLanguage.g:5820:2: rule__EnvironmentSent__Group__2__Impl rule__EnvironmentSent__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__EnvironmentSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentSent__Group__3();

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
    // $ANTLR end "rule__EnvironmentSent__Group__2"


    // $ANTLR start "rule__EnvironmentSent__Group__2__Impl"
    // InternalMyLanguage.g:5827:1: rule__EnvironmentSent__Group__2__Impl : ( 'is' ) ;
    public final void rule__EnvironmentSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5831:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5832:1: ( 'is' )
            {
            // InternalMyLanguage.g:5832:1: ( 'is' )
            // InternalMyLanguage.g:5833:2: 'is'
            {
             before(grammarAccess.getEnvironmentSentAccess().getIsKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnvironmentSentAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__EnvironmentSent__Group__2__Impl"


    // $ANTLR start "rule__EnvironmentSent__Group__3"
    // InternalMyLanguage.g:5842:1: rule__EnvironmentSent__Group__3 : rule__EnvironmentSent__Group__3__Impl ;
    public final void rule__EnvironmentSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5846:1: ( rule__EnvironmentSent__Group__3__Impl )
            // InternalMyLanguage.g:5847:2: rule__EnvironmentSent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentSent__Group__3__Impl();

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
    // $ANTLR end "rule__EnvironmentSent__Group__3"


    // $ANTLR start "rule__EnvironmentSent__Group__3__Impl"
    // InternalMyLanguage.g:5853:1: rule__EnvironmentSent__Group__3__Impl : ( ( rule__EnvironmentSent__BodyAssignment_3 ) ) ;
    public final void rule__EnvironmentSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5857:1: ( ( ( rule__EnvironmentSent__BodyAssignment_3 ) ) )
            // InternalMyLanguage.g:5858:1: ( ( rule__EnvironmentSent__BodyAssignment_3 ) )
            {
            // InternalMyLanguage.g:5858:1: ( ( rule__EnvironmentSent__BodyAssignment_3 ) )
            // InternalMyLanguage.g:5859:2: ( rule__EnvironmentSent__BodyAssignment_3 )
            {
             before(grammarAccess.getEnvironmentSentAccess().getBodyAssignment_3()); 
            // InternalMyLanguage.g:5860:2: ( rule__EnvironmentSent__BodyAssignment_3 )
            // InternalMyLanguage.g:5860:3: rule__EnvironmentSent__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentSent__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentSentAccess().getBodyAssignment_3()); 

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
    // $ANTLR end "rule__EnvironmentSent__Group__3__Impl"


    // $ANTLR start "rule__RiskSent__Group__0"
    // InternalMyLanguage.g:5869:1: rule__RiskSent__Group__0 : rule__RiskSent__Group__0__Impl rule__RiskSent__Group__1 ;
    public final void rule__RiskSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5873:1: ( rule__RiskSent__Group__0__Impl rule__RiskSent__Group__1 )
            // InternalMyLanguage.g:5874:2: rule__RiskSent__Group__0__Impl rule__RiskSent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RiskSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RiskSent__Group__1();

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
    // $ANTLR end "rule__RiskSent__Group__0"


    // $ANTLR start "rule__RiskSent__Group__0__Impl"
    // InternalMyLanguage.g:5881:1: rule__RiskSent__Group__0__Impl : ( 'collisionrisk' ) ;
    public final void rule__RiskSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5885:1: ( ( 'collisionrisk' ) )
            // InternalMyLanguage.g:5886:1: ( 'collisionrisk' )
            {
            // InternalMyLanguage.g:5886:1: ( 'collisionrisk' )
            // InternalMyLanguage.g:5887:2: 'collisionrisk'
            {
             before(grammarAccess.getRiskSentAccess().getCollisionriskKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRiskSentAccess().getCollisionriskKeyword_0()); 

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
    // $ANTLR end "rule__RiskSent__Group__0__Impl"


    // $ANTLR start "rule__RiskSent__Group__1"
    // InternalMyLanguage.g:5896:1: rule__RiskSent__Group__1 : rule__RiskSent__Group__1__Impl rule__RiskSent__Group__2 ;
    public final void rule__RiskSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5900:1: ( rule__RiskSent__Group__1__Impl rule__RiskSent__Group__2 )
            // InternalMyLanguage.g:5901:2: rule__RiskSent__Group__1__Impl rule__RiskSent__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__RiskSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RiskSent__Group__2();

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
    // $ANTLR end "rule__RiskSent__Group__1"


    // $ANTLR start "rule__RiskSent__Group__1__Impl"
    // InternalMyLanguage.g:5908:1: rule__RiskSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RiskSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5912:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5913:1: ( 'is' )
            {
            // InternalMyLanguage.g:5913:1: ( 'is' )
            // InternalMyLanguage.g:5914:2: 'is'
            {
             before(grammarAccess.getRiskSentAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRiskSentAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__RiskSent__Group__1__Impl"


    // $ANTLR start "rule__RiskSent__Group__2"
    // InternalMyLanguage.g:5923:1: rule__RiskSent__Group__2 : rule__RiskSent__Group__2__Impl ;
    public final void rule__RiskSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5927:1: ( rule__RiskSent__Group__2__Impl )
            // InternalMyLanguage.g:5928:2: rule__RiskSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RiskSent__Group__2__Impl();

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
    // $ANTLR end "rule__RiskSent__Group__2"


    // $ANTLR start "rule__RiskSent__Group__2__Impl"
    // InternalMyLanguage.g:5934:1: rule__RiskSent__Group__2__Impl : ( ( rule__RiskSent__LevelAssignment_2 ) ) ;
    public final void rule__RiskSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5938:1: ( ( ( rule__RiskSent__LevelAssignment_2 ) ) )
            // InternalMyLanguage.g:5939:1: ( ( rule__RiskSent__LevelAssignment_2 ) )
            {
            // InternalMyLanguage.g:5939:1: ( ( rule__RiskSent__LevelAssignment_2 ) )
            // InternalMyLanguage.g:5940:2: ( rule__RiskSent__LevelAssignment_2 )
            {
             before(grammarAccess.getRiskSentAccess().getLevelAssignment_2()); 
            // InternalMyLanguage.g:5941:2: ( rule__RiskSent__LevelAssignment_2 )
            // InternalMyLanguage.g:5941:3: rule__RiskSent__LevelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RiskSent__LevelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRiskSentAccess().getLevelAssignment_2()); 

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
    // $ANTLR end "rule__RiskSent__Group__2__Impl"


    // $ANTLR start "rule__ToleranceSent__Group__0"
    // InternalMyLanguage.g:5950:1: rule__ToleranceSent__Group__0 : rule__ToleranceSent__Group__0__Impl rule__ToleranceSent__Group__1 ;
    public final void rule__ToleranceSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5954:1: ( rule__ToleranceSent__Group__0__Impl rule__ToleranceSent__Group__1 )
            // InternalMyLanguage.g:5955:2: rule__ToleranceSent__Group__0__Impl rule__ToleranceSent__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__ToleranceSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToleranceSent__Group__1();

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
    // $ANTLR end "rule__ToleranceSent__Group__0"


    // $ANTLR start "rule__ToleranceSent__Group__0__Impl"
    // InternalMyLanguage.g:5962:1: rule__ToleranceSent__Group__0__Impl : ( 'with' ) ;
    public final void rule__ToleranceSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5966:1: ( ( 'with' ) )
            // InternalMyLanguage.g:5967:1: ( 'with' )
            {
            // InternalMyLanguage.g:5967:1: ( 'with' )
            // InternalMyLanguage.g:5968:2: 'with'
            {
             before(grammarAccess.getToleranceSentAccess().getWithKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getToleranceSentAccess().getWithKeyword_0()); 

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
    // $ANTLR end "rule__ToleranceSent__Group__0__Impl"


    // $ANTLR start "rule__ToleranceSent__Group__1"
    // InternalMyLanguage.g:5977:1: rule__ToleranceSent__Group__1 : rule__ToleranceSent__Group__1__Impl rule__ToleranceSent__Group__2 ;
    public final void rule__ToleranceSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5981:1: ( rule__ToleranceSent__Group__1__Impl rule__ToleranceSent__Group__2 )
            // InternalMyLanguage.g:5982:2: rule__ToleranceSent__Group__1__Impl rule__ToleranceSent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ToleranceSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToleranceSent__Group__2();

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
    // $ANTLR end "rule__ToleranceSent__Group__1"


    // $ANTLR start "rule__ToleranceSent__Group__1__Impl"
    // InternalMyLanguage.g:5989:1: rule__ToleranceSent__Group__1__Impl : ( 'tolerance' ) ;
    public final void rule__ToleranceSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5993:1: ( ( 'tolerance' ) )
            // InternalMyLanguage.g:5994:1: ( 'tolerance' )
            {
            // InternalMyLanguage.g:5994:1: ( 'tolerance' )
            // InternalMyLanguage.g:5995:2: 'tolerance'
            {
             before(grammarAccess.getToleranceSentAccess().getToleranceKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getToleranceSentAccess().getToleranceKeyword_1()); 

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
    // $ANTLR end "rule__ToleranceSent__Group__1__Impl"


    // $ANTLR start "rule__ToleranceSent__Group__2"
    // InternalMyLanguage.g:6004:1: rule__ToleranceSent__Group__2 : rule__ToleranceSent__Group__2__Impl ;
    public final void rule__ToleranceSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6008:1: ( rule__ToleranceSent__Group__2__Impl )
            // InternalMyLanguage.g:6009:2: rule__ToleranceSent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToleranceSent__Group__2__Impl();

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
    // $ANTLR end "rule__ToleranceSent__Group__2"


    // $ANTLR start "rule__ToleranceSent__Group__2__Impl"
    // InternalMyLanguage.g:6015:1: rule__ToleranceSent__Group__2__Impl : ( ( rule__ToleranceSent__UnitAssignment_2 ) ) ;
    public final void rule__ToleranceSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6019:1: ( ( ( rule__ToleranceSent__UnitAssignment_2 ) ) )
            // InternalMyLanguage.g:6020:1: ( ( rule__ToleranceSent__UnitAssignment_2 ) )
            {
            // InternalMyLanguage.g:6020:1: ( ( rule__ToleranceSent__UnitAssignment_2 ) )
            // InternalMyLanguage.g:6021:2: ( rule__ToleranceSent__UnitAssignment_2 )
            {
             before(grammarAccess.getToleranceSentAccess().getUnitAssignment_2()); 
            // InternalMyLanguage.g:6022:2: ( rule__ToleranceSent__UnitAssignment_2 )
            // InternalMyLanguage.g:6022:3: rule__ToleranceSent__UnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ToleranceSent__UnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getToleranceSentAccess().getUnitAssignment_2()); 

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
    // $ANTLR end "rule__ToleranceSent__Group__2__Impl"


    // $ANTLR start "rule__SECONDS__Group__0"
    // InternalMyLanguage.g:6031:1: rule__SECONDS__Group__0 : rule__SECONDS__Group__0__Impl rule__SECONDS__Group__1 ;
    public final void rule__SECONDS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6035:1: ( rule__SECONDS__Group__0__Impl rule__SECONDS__Group__1 )
            // InternalMyLanguage.g:6036:2: rule__SECONDS__Group__0__Impl rule__SECONDS__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__SECONDS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SECONDS__Group__1();

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
    // $ANTLR end "rule__SECONDS__Group__0"


    // $ANTLR start "rule__SECONDS__Group__0__Impl"
    // InternalMyLanguage.g:6043:1: rule__SECONDS__Group__0__Impl : ( 'seconds(' ) ;
    public final void rule__SECONDS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6047:1: ( ( 'seconds(' ) )
            // InternalMyLanguage.g:6048:1: ( 'seconds(' )
            {
            // InternalMyLanguage.g:6048:1: ( 'seconds(' )
            // InternalMyLanguage.g:6049:2: 'seconds('
            {
             before(grammarAccess.getSECONDSAccess().getSecondsKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getSECONDSAccess().getSecondsKeyword_0()); 

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
    // $ANTLR end "rule__SECONDS__Group__0__Impl"


    // $ANTLR start "rule__SECONDS__Group__1"
    // InternalMyLanguage.g:6058:1: rule__SECONDS__Group__1 : rule__SECONDS__Group__1__Impl rule__SECONDS__Group__2 ;
    public final void rule__SECONDS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6062:1: ( rule__SECONDS__Group__1__Impl rule__SECONDS__Group__2 )
            // InternalMyLanguage.g:6063:2: rule__SECONDS__Group__1__Impl rule__SECONDS__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__SECONDS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SECONDS__Group__2();

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
    // $ANTLR end "rule__SECONDS__Group__1"


    // $ANTLR start "rule__SECONDS__Group__1__Impl"
    // InternalMyLanguage.g:6070:1: rule__SECONDS__Group__1__Impl : ( ( rule__SECONDS__ValueAssignment_1 ) ) ;
    public final void rule__SECONDS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6074:1: ( ( ( rule__SECONDS__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6075:1: ( ( rule__SECONDS__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6075:1: ( ( rule__SECONDS__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6076:2: ( rule__SECONDS__ValueAssignment_1 )
            {
             before(grammarAccess.getSECONDSAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6077:2: ( rule__SECONDS__ValueAssignment_1 )
            // InternalMyLanguage.g:6077:3: rule__SECONDS__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SECONDS__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSECONDSAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__SECONDS__Group__1__Impl"


    // $ANTLR start "rule__SECONDS__Group__2"
    // InternalMyLanguage.g:6085:1: rule__SECONDS__Group__2 : rule__SECONDS__Group__2__Impl ;
    public final void rule__SECONDS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6089:1: ( rule__SECONDS__Group__2__Impl )
            // InternalMyLanguage.g:6090:2: rule__SECONDS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SECONDS__Group__2__Impl();

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
    // $ANTLR end "rule__SECONDS__Group__2"


    // $ANTLR start "rule__SECONDS__Group__2__Impl"
    // InternalMyLanguage.g:6096:1: rule__SECONDS__Group__2__Impl : ( ')' ) ;
    public final void rule__SECONDS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6100:1: ( ( ')' ) )
            // InternalMyLanguage.g:6101:1: ( ')' )
            {
            // InternalMyLanguage.g:6101:1: ( ')' )
            // InternalMyLanguage.g:6102:2: ')'
            {
             before(grammarAccess.getSECONDSAccess().getRightParenthesisKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getSECONDSAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__SECONDS__Group__2__Impl"


    // $ANTLR start "rule__HOUR__Group__0"
    // InternalMyLanguage.g:6112:1: rule__HOUR__Group__0 : rule__HOUR__Group__0__Impl rule__HOUR__Group__1 ;
    public final void rule__HOUR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6116:1: ( rule__HOUR__Group__0__Impl rule__HOUR__Group__1 )
            // InternalMyLanguage.g:6117:2: rule__HOUR__Group__0__Impl rule__HOUR__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__HOUR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOUR__Group__1();

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
    // $ANTLR end "rule__HOUR__Group__0"


    // $ANTLR start "rule__HOUR__Group__0__Impl"
    // InternalMyLanguage.g:6124:1: rule__HOUR__Group__0__Impl : ( 'hours(' ) ;
    public final void rule__HOUR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6128:1: ( ( 'hours(' ) )
            // InternalMyLanguage.g:6129:1: ( 'hours(' )
            {
            // InternalMyLanguage.g:6129:1: ( 'hours(' )
            // InternalMyLanguage.g:6130:2: 'hours('
            {
             before(grammarAccess.getHOURAccess().getHoursKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getHOURAccess().getHoursKeyword_0()); 

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
    // $ANTLR end "rule__HOUR__Group__0__Impl"


    // $ANTLR start "rule__HOUR__Group__1"
    // InternalMyLanguage.g:6139:1: rule__HOUR__Group__1 : rule__HOUR__Group__1__Impl rule__HOUR__Group__2 ;
    public final void rule__HOUR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6143:1: ( rule__HOUR__Group__1__Impl rule__HOUR__Group__2 )
            // InternalMyLanguage.g:6144:2: rule__HOUR__Group__1__Impl rule__HOUR__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__HOUR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOUR__Group__2();

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
    // $ANTLR end "rule__HOUR__Group__1"


    // $ANTLR start "rule__HOUR__Group__1__Impl"
    // InternalMyLanguage.g:6151:1: rule__HOUR__Group__1__Impl : ( ( rule__HOUR__ValueAssignment_1 ) ) ;
    public final void rule__HOUR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6155:1: ( ( ( rule__HOUR__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6156:1: ( ( rule__HOUR__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6156:1: ( ( rule__HOUR__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6157:2: ( rule__HOUR__ValueAssignment_1 )
            {
             before(grammarAccess.getHOURAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6158:2: ( rule__HOUR__ValueAssignment_1 )
            // InternalMyLanguage.g:6158:3: rule__HOUR__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HOUR__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHOURAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__HOUR__Group__1__Impl"


    // $ANTLR start "rule__HOUR__Group__2"
    // InternalMyLanguage.g:6166:1: rule__HOUR__Group__2 : rule__HOUR__Group__2__Impl ;
    public final void rule__HOUR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6170:1: ( rule__HOUR__Group__2__Impl )
            // InternalMyLanguage.g:6171:2: rule__HOUR__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOUR__Group__2__Impl();

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
    // $ANTLR end "rule__HOUR__Group__2"


    // $ANTLR start "rule__HOUR__Group__2__Impl"
    // InternalMyLanguage.g:6177:1: rule__HOUR__Group__2__Impl : ( ')' ) ;
    public final void rule__HOUR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6181:1: ( ( ')' ) )
            // InternalMyLanguage.g:6182:1: ( ')' )
            {
            // InternalMyLanguage.g:6182:1: ( ')' )
            // InternalMyLanguage.g:6183:2: ')'
            {
             before(grammarAccess.getHOURAccess().getRightParenthesisKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getHOURAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__HOUR__Group__2__Impl"


    // $ANTLR start "rule__MINUTES__Group__0"
    // InternalMyLanguage.g:6193:1: rule__MINUTES__Group__0 : rule__MINUTES__Group__0__Impl rule__MINUTES__Group__1 ;
    public final void rule__MINUTES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6197:1: ( rule__MINUTES__Group__0__Impl rule__MINUTES__Group__1 )
            // InternalMyLanguage.g:6198:2: rule__MINUTES__Group__0__Impl rule__MINUTES__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__MINUTES__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MINUTES__Group__1();

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
    // $ANTLR end "rule__MINUTES__Group__0"


    // $ANTLR start "rule__MINUTES__Group__0__Impl"
    // InternalMyLanguage.g:6205:1: rule__MINUTES__Group__0__Impl : ( 'minutes(' ) ;
    public final void rule__MINUTES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6209:1: ( ( 'minutes(' ) )
            // InternalMyLanguage.g:6210:1: ( 'minutes(' )
            {
            // InternalMyLanguage.g:6210:1: ( 'minutes(' )
            // InternalMyLanguage.g:6211:2: 'minutes('
            {
             before(grammarAccess.getMINUTESAccess().getMinutesKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getMINUTESAccess().getMinutesKeyword_0()); 

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
    // $ANTLR end "rule__MINUTES__Group__0__Impl"


    // $ANTLR start "rule__MINUTES__Group__1"
    // InternalMyLanguage.g:6220:1: rule__MINUTES__Group__1 : rule__MINUTES__Group__1__Impl rule__MINUTES__Group__2 ;
    public final void rule__MINUTES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6224:1: ( rule__MINUTES__Group__1__Impl rule__MINUTES__Group__2 )
            // InternalMyLanguage.g:6225:2: rule__MINUTES__Group__1__Impl rule__MINUTES__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__MINUTES__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MINUTES__Group__2();

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
    // $ANTLR end "rule__MINUTES__Group__1"


    // $ANTLR start "rule__MINUTES__Group__1__Impl"
    // InternalMyLanguage.g:6232:1: rule__MINUTES__Group__1__Impl : ( ( rule__MINUTES__ValueAssignment_1 ) ) ;
    public final void rule__MINUTES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6236:1: ( ( ( rule__MINUTES__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6237:1: ( ( rule__MINUTES__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6237:1: ( ( rule__MINUTES__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6238:2: ( rule__MINUTES__ValueAssignment_1 )
            {
             before(grammarAccess.getMINUTESAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6239:2: ( rule__MINUTES__ValueAssignment_1 )
            // InternalMyLanguage.g:6239:3: rule__MINUTES__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MINUTES__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMINUTESAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__MINUTES__Group__1__Impl"


    // $ANTLR start "rule__MINUTES__Group__2"
    // InternalMyLanguage.g:6247:1: rule__MINUTES__Group__2 : rule__MINUTES__Group__2__Impl ;
    public final void rule__MINUTES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6251:1: ( rule__MINUTES__Group__2__Impl )
            // InternalMyLanguage.g:6252:2: rule__MINUTES__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MINUTES__Group__2__Impl();

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
    // $ANTLR end "rule__MINUTES__Group__2"


    // $ANTLR start "rule__MINUTES__Group__2__Impl"
    // InternalMyLanguage.g:6258:1: rule__MINUTES__Group__2__Impl : ( ')' ) ;
    public final void rule__MINUTES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6262:1: ( ( ')' ) )
            // InternalMyLanguage.g:6263:1: ( ')' )
            {
            // InternalMyLanguage.g:6263:1: ( ')' )
            // InternalMyLanguage.g:6264:2: ')'
            {
             before(grammarAccess.getMINUTESAccess().getRightParenthesisKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getMINUTESAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__MINUTES__Group__2__Impl"


    // $ANTLR start "rule__METER__Group__0"
    // InternalMyLanguage.g:6274:1: rule__METER__Group__0 : rule__METER__Group__0__Impl rule__METER__Group__1 ;
    public final void rule__METER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6278:1: ( rule__METER__Group__0__Impl rule__METER__Group__1 )
            // InternalMyLanguage.g:6279:2: rule__METER__Group__0__Impl rule__METER__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__METER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__METER__Group__1();

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
    // $ANTLR end "rule__METER__Group__0"


    // $ANTLR start "rule__METER__Group__0__Impl"
    // InternalMyLanguage.g:6286:1: rule__METER__Group__0__Impl : ( 'meter(' ) ;
    public final void rule__METER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6290:1: ( ( 'meter(' ) )
            // InternalMyLanguage.g:6291:1: ( 'meter(' )
            {
            // InternalMyLanguage.g:6291:1: ( 'meter(' )
            // InternalMyLanguage.g:6292:2: 'meter('
            {
             before(grammarAccess.getMETERAccess().getMeterKeyword_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getMETERAccess().getMeterKeyword_0()); 

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
    // $ANTLR end "rule__METER__Group__0__Impl"


    // $ANTLR start "rule__METER__Group__1"
    // InternalMyLanguage.g:6301:1: rule__METER__Group__1 : rule__METER__Group__1__Impl rule__METER__Group__2 ;
    public final void rule__METER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6305:1: ( rule__METER__Group__1__Impl rule__METER__Group__2 )
            // InternalMyLanguage.g:6306:2: rule__METER__Group__1__Impl rule__METER__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__METER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__METER__Group__2();

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
    // $ANTLR end "rule__METER__Group__1"


    // $ANTLR start "rule__METER__Group__1__Impl"
    // InternalMyLanguage.g:6313:1: rule__METER__Group__1__Impl : ( ( rule__METER__ValueAssignment_1 ) ) ;
    public final void rule__METER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6317:1: ( ( ( rule__METER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6318:1: ( ( rule__METER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6318:1: ( ( rule__METER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6319:2: ( rule__METER__ValueAssignment_1 )
            {
             before(grammarAccess.getMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6320:2: ( rule__METER__ValueAssignment_1 )
            // InternalMyLanguage.g:6320:3: rule__METER__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__METER__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMETERAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__METER__Group__1__Impl"


    // $ANTLR start "rule__METER__Group__2"
    // InternalMyLanguage.g:6328:1: rule__METER__Group__2 : rule__METER__Group__2__Impl ;
    public final void rule__METER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6332:1: ( rule__METER__Group__2__Impl )
            // InternalMyLanguage.g:6333:2: rule__METER__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__METER__Group__2__Impl();

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
    // $ANTLR end "rule__METER__Group__2"


    // $ANTLR start "rule__METER__Group__2__Impl"
    // InternalMyLanguage.g:6339:1: rule__METER__Group__2__Impl : ( ')' ) ;
    public final void rule__METER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6343:1: ( ( ')' ) )
            // InternalMyLanguage.g:6344:1: ( ')' )
            {
            // InternalMyLanguage.g:6344:1: ( ')' )
            // InternalMyLanguage.g:6345:2: ')'
            {
             before(grammarAccess.getMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getMETERAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__METER__Group__2__Impl"


    // $ANTLR start "rule__CENTIMETER__Group__0"
    // InternalMyLanguage.g:6355:1: rule__CENTIMETER__Group__0 : rule__CENTIMETER__Group__0__Impl rule__CENTIMETER__Group__1 ;
    public final void rule__CENTIMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6359:1: ( rule__CENTIMETER__Group__0__Impl rule__CENTIMETER__Group__1 )
            // InternalMyLanguage.g:6360:2: rule__CENTIMETER__Group__0__Impl rule__CENTIMETER__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__CENTIMETER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CENTIMETER__Group__1();

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
    // $ANTLR end "rule__CENTIMETER__Group__0"


    // $ANTLR start "rule__CENTIMETER__Group__0__Impl"
    // InternalMyLanguage.g:6367:1: rule__CENTIMETER__Group__0__Impl : ( 'centimeter(' ) ;
    public final void rule__CENTIMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6371:1: ( ( 'centimeter(' ) )
            // InternalMyLanguage.g:6372:1: ( 'centimeter(' )
            {
            // InternalMyLanguage.g:6372:1: ( 'centimeter(' )
            // InternalMyLanguage.g:6373:2: 'centimeter('
            {
             before(grammarAccess.getCENTIMETERAccess().getCentimeterKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getCENTIMETERAccess().getCentimeterKeyword_0()); 

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
    // $ANTLR end "rule__CENTIMETER__Group__0__Impl"


    // $ANTLR start "rule__CENTIMETER__Group__1"
    // InternalMyLanguage.g:6382:1: rule__CENTIMETER__Group__1 : rule__CENTIMETER__Group__1__Impl rule__CENTIMETER__Group__2 ;
    public final void rule__CENTIMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6386:1: ( rule__CENTIMETER__Group__1__Impl rule__CENTIMETER__Group__2 )
            // InternalMyLanguage.g:6387:2: rule__CENTIMETER__Group__1__Impl rule__CENTIMETER__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__CENTIMETER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CENTIMETER__Group__2();

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
    // $ANTLR end "rule__CENTIMETER__Group__1"


    // $ANTLR start "rule__CENTIMETER__Group__1__Impl"
    // InternalMyLanguage.g:6394:1: rule__CENTIMETER__Group__1__Impl : ( ( rule__CENTIMETER__ValueAssignment_1 ) ) ;
    public final void rule__CENTIMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6398:1: ( ( ( rule__CENTIMETER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6399:1: ( ( rule__CENTIMETER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6399:1: ( ( rule__CENTIMETER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6400:2: ( rule__CENTIMETER__ValueAssignment_1 )
            {
             before(grammarAccess.getCENTIMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6401:2: ( rule__CENTIMETER__ValueAssignment_1 )
            // InternalMyLanguage.g:6401:3: rule__CENTIMETER__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CENTIMETER__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCENTIMETERAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__CENTIMETER__Group__1__Impl"


    // $ANTLR start "rule__CENTIMETER__Group__2"
    // InternalMyLanguage.g:6409:1: rule__CENTIMETER__Group__2 : rule__CENTIMETER__Group__2__Impl ;
    public final void rule__CENTIMETER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6413:1: ( rule__CENTIMETER__Group__2__Impl )
            // InternalMyLanguage.g:6414:2: rule__CENTIMETER__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CENTIMETER__Group__2__Impl();

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
    // $ANTLR end "rule__CENTIMETER__Group__2"


    // $ANTLR start "rule__CENTIMETER__Group__2__Impl"
    // InternalMyLanguage.g:6420:1: rule__CENTIMETER__Group__2__Impl : ( ')' ) ;
    public final void rule__CENTIMETER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6424:1: ( ( ')' ) )
            // InternalMyLanguage.g:6425:1: ( ')' )
            {
            // InternalMyLanguage.g:6425:1: ( ')' )
            // InternalMyLanguage.g:6426:2: ')'
            {
             before(grammarAccess.getCENTIMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getCENTIMETERAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__CENTIMETER__Group__2__Impl"


    // $ANTLR start "rule__MILLIMETER__Group__0"
    // InternalMyLanguage.g:6436:1: rule__MILLIMETER__Group__0 : rule__MILLIMETER__Group__0__Impl rule__MILLIMETER__Group__1 ;
    public final void rule__MILLIMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6440:1: ( rule__MILLIMETER__Group__0__Impl rule__MILLIMETER__Group__1 )
            // InternalMyLanguage.g:6441:2: rule__MILLIMETER__Group__0__Impl rule__MILLIMETER__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__MILLIMETER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MILLIMETER__Group__1();

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
    // $ANTLR end "rule__MILLIMETER__Group__0"


    // $ANTLR start "rule__MILLIMETER__Group__0__Impl"
    // InternalMyLanguage.g:6448:1: rule__MILLIMETER__Group__0__Impl : ( 'millimeter(' ) ;
    public final void rule__MILLIMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6452:1: ( ( 'millimeter(' ) )
            // InternalMyLanguage.g:6453:1: ( 'millimeter(' )
            {
            // InternalMyLanguage.g:6453:1: ( 'millimeter(' )
            // InternalMyLanguage.g:6454:2: 'millimeter('
            {
             before(grammarAccess.getMILLIMETERAccess().getMillimeterKeyword_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getMILLIMETERAccess().getMillimeterKeyword_0()); 

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
    // $ANTLR end "rule__MILLIMETER__Group__0__Impl"


    // $ANTLR start "rule__MILLIMETER__Group__1"
    // InternalMyLanguage.g:6463:1: rule__MILLIMETER__Group__1 : rule__MILLIMETER__Group__1__Impl rule__MILLIMETER__Group__2 ;
    public final void rule__MILLIMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6467:1: ( rule__MILLIMETER__Group__1__Impl rule__MILLIMETER__Group__2 )
            // InternalMyLanguage.g:6468:2: rule__MILLIMETER__Group__1__Impl rule__MILLIMETER__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__MILLIMETER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MILLIMETER__Group__2();

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
    // $ANTLR end "rule__MILLIMETER__Group__1"


    // $ANTLR start "rule__MILLIMETER__Group__1__Impl"
    // InternalMyLanguage.g:6475:1: rule__MILLIMETER__Group__1__Impl : ( ( rule__MILLIMETER__ValueAssignment_1 ) ) ;
    public final void rule__MILLIMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6479:1: ( ( ( rule__MILLIMETER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6480:1: ( ( rule__MILLIMETER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6480:1: ( ( rule__MILLIMETER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6481:2: ( rule__MILLIMETER__ValueAssignment_1 )
            {
             before(grammarAccess.getMILLIMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6482:2: ( rule__MILLIMETER__ValueAssignment_1 )
            // InternalMyLanguage.g:6482:3: rule__MILLIMETER__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MILLIMETER__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMILLIMETERAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__MILLIMETER__Group__1__Impl"


    // $ANTLR start "rule__MILLIMETER__Group__2"
    // InternalMyLanguage.g:6490:1: rule__MILLIMETER__Group__2 : rule__MILLIMETER__Group__2__Impl ;
    public final void rule__MILLIMETER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6494:1: ( rule__MILLIMETER__Group__2__Impl )
            // InternalMyLanguage.g:6495:2: rule__MILLIMETER__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MILLIMETER__Group__2__Impl();

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
    // $ANTLR end "rule__MILLIMETER__Group__2"


    // $ANTLR start "rule__MILLIMETER__Group__2__Impl"
    // InternalMyLanguage.g:6501:1: rule__MILLIMETER__Group__2__Impl : ( ')' ) ;
    public final void rule__MILLIMETER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6505:1: ( ( ')' ) )
            // InternalMyLanguage.g:6506:1: ( ')' )
            {
            // InternalMyLanguage.g:6506:1: ( ')' )
            // InternalMyLanguage.g:6507:2: ')'
            {
             before(grammarAccess.getMILLIMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getMILLIMETERAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__MILLIMETER__Group__2__Impl"


    // $ANTLR start "rule__KILOMETER__Group__0"
    // InternalMyLanguage.g:6517:1: rule__KILOMETER__Group__0 : rule__KILOMETER__Group__0__Impl rule__KILOMETER__Group__1 ;
    public final void rule__KILOMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6521:1: ( rule__KILOMETER__Group__0__Impl rule__KILOMETER__Group__1 )
            // InternalMyLanguage.g:6522:2: rule__KILOMETER__Group__0__Impl rule__KILOMETER__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__KILOMETER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KILOMETER__Group__1();

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
    // $ANTLR end "rule__KILOMETER__Group__0"


    // $ANTLR start "rule__KILOMETER__Group__0__Impl"
    // InternalMyLanguage.g:6529:1: rule__KILOMETER__Group__0__Impl : ( 'kilometer(' ) ;
    public final void rule__KILOMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6533:1: ( ( 'kilometer(' ) )
            // InternalMyLanguage.g:6534:1: ( 'kilometer(' )
            {
            // InternalMyLanguage.g:6534:1: ( 'kilometer(' )
            // InternalMyLanguage.g:6535:2: 'kilometer('
            {
             before(grammarAccess.getKILOMETERAccess().getKilometerKeyword_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getKILOMETERAccess().getKilometerKeyword_0()); 

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
    // $ANTLR end "rule__KILOMETER__Group__0__Impl"


    // $ANTLR start "rule__KILOMETER__Group__1"
    // InternalMyLanguage.g:6544:1: rule__KILOMETER__Group__1 : rule__KILOMETER__Group__1__Impl rule__KILOMETER__Group__2 ;
    public final void rule__KILOMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6548:1: ( rule__KILOMETER__Group__1__Impl rule__KILOMETER__Group__2 )
            // InternalMyLanguage.g:6549:2: rule__KILOMETER__Group__1__Impl rule__KILOMETER__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__KILOMETER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KILOMETER__Group__2();

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
    // $ANTLR end "rule__KILOMETER__Group__1"


    // $ANTLR start "rule__KILOMETER__Group__1__Impl"
    // InternalMyLanguage.g:6556:1: rule__KILOMETER__Group__1__Impl : ( ( rule__KILOMETER__ValueAssignment_1 ) ) ;
    public final void rule__KILOMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6560:1: ( ( ( rule__KILOMETER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6561:1: ( ( rule__KILOMETER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6561:1: ( ( rule__KILOMETER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6562:2: ( rule__KILOMETER__ValueAssignment_1 )
            {
             before(grammarAccess.getKILOMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6563:2: ( rule__KILOMETER__ValueAssignment_1 )
            // InternalMyLanguage.g:6563:3: rule__KILOMETER__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KILOMETER__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKILOMETERAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__KILOMETER__Group__1__Impl"


    // $ANTLR start "rule__KILOMETER__Group__2"
    // InternalMyLanguage.g:6571:1: rule__KILOMETER__Group__2 : rule__KILOMETER__Group__2__Impl ;
    public final void rule__KILOMETER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6575:1: ( rule__KILOMETER__Group__2__Impl )
            // InternalMyLanguage.g:6576:2: rule__KILOMETER__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KILOMETER__Group__2__Impl();

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
    // $ANTLR end "rule__KILOMETER__Group__2"


    // $ANTLR start "rule__KILOMETER__Group__2__Impl"
    // InternalMyLanguage.g:6582:1: rule__KILOMETER__Group__2__Impl : ( ')' ) ;
    public final void rule__KILOMETER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6586:1: ( ( ')' ) )
            // InternalMyLanguage.g:6587:1: ( ')' )
            {
            // InternalMyLanguage.g:6587:1: ( ')' )
            // InternalMyLanguage.g:6588:2: ')'
            {
             before(grammarAccess.getKILOMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getKILOMETERAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__KILOMETER__Group__2__Impl"


    // $ANTLR start "rule__PercentUnit__Group__0"
    // InternalMyLanguage.g:6598:1: rule__PercentUnit__Group__0 : rule__PercentUnit__Group__0__Impl rule__PercentUnit__Group__1 ;
    public final void rule__PercentUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6602:1: ( rule__PercentUnit__Group__0__Impl rule__PercentUnit__Group__1 )
            // InternalMyLanguage.g:6603:2: rule__PercentUnit__Group__0__Impl rule__PercentUnit__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__PercentUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PercentUnit__Group__1();

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
    // $ANTLR end "rule__PercentUnit__Group__0"


    // $ANTLR start "rule__PercentUnit__Group__0__Impl"
    // InternalMyLanguage.g:6610:1: rule__PercentUnit__Group__0__Impl : ( 'percent(' ) ;
    public final void rule__PercentUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6614:1: ( ( 'percent(' ) )
            // InternalMyLanguage.g:6615:1: ( 'percent(' )
            {
            // InternalMyLanguage.g:6615:1: ( 'percent(' )
            // InternalMyLanguage.g:6616:2: 'percent('
            {
             before(grammarAccess.getPercentUnitAccess().getPercentKeyword_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getPercentUnitAccess().getPercentKeyword_0()); 

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
    // $ANTLR end "rule__PercentUnit__Group__0__Impl"


    // $ANTLR start "rule__PercentUnit__Group__1"
    // InternalMyLanguage.g:6625:1: rule__PercentUnit__Group__1 : rule__PercentUnit__Group__1__Impl rule__PercentUnit__Group__2 ;
    public final void rule__PercentUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6629:1: ( rule__PercentUnit__Group__1__Impl rule__PercentUnit__Group__2 )
            // InternalMyLanguage.g:6630:2: rule__PercentUnit__Group__1__Impl rule__PercentUnit__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__PercentUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PercentUnit__Group__2();

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
    // $ANTLR end "rule__PercentUnit__Group__1"


    // $ANTLR start "rule__PercentUnit__Group__1__Impl"
    // InternalMyLanguage.g:6637:1: rule__PercentUnit__Group__1__Impl : ( ( rule__PercentUnit__ValueAssignment_1 ) ) ;
    public final void rule__PercentUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6641:1: ( ( ( rule__PercentUnit__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6642:1: ( ( rule__PercentUnit__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6642:1: ( ( rule__PercentUnit__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6643:2: ( rule__PercentUnit__ValueAssignment_1 )
            {
             before(grammarAccess.getPercentUnitAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6644:2: ( rule__PercentUnit__ValueAssignment_1 )
            // InternalMyLanguage.g:6644:3: rule__PercentUnit__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PercentUnit__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPercentUnitAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__PercentUnit__Group__1__Impl"


    // $ANTLR start "rule__PercentUnit__Group__2"
    // InternalMyLanguage.g:6652:1: rule__PercentUnit__Group__2 : rule__PercentUnit__Group__2__Impl ;
    public final void rule__PercentUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6656:1: ( rule__PercentUnit__Group__2__Impl )
            // InternalMyLanguage.g:6657:2: rule__PercentUnit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PercentUnit__Group__2__Impl();

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
    // $ANTLR end "rule__PercentUnit__Group__2"


    // $ANTLR start "rule__PercentUnit__Group__2__Impl"
    // InternalMyLanguage.g:6663:1: rule__PercentUnit__Group__2__Impl : ( ')' ) ;
    public final void rule__PercentUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6667:1: ( ( ')' ) )
            // InternalMyLanguage.g:6668:1: ( ')' )
            {
            // InternalMyLanguage.g:6668:1: ( ')' )
            // InternalMyLanguage.g:6669:2: ')'
            {
             before(grammarAccess.getPercentUnitAccess().getRightParenthesisKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getPercentUnitAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__PercentUnit__Group__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalMyLanguage.g:6679:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6683:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalMyLanguage.g:6684:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1();

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
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // InternalMyLanguage.g:6691:1: rule__DOUBLE__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6695:1: ( ( ( '-' )? ) )
            // InternalMyLanguage.g:6696:1: ( ( '-' )? )
            {
            // InternalMyLanguage.g:6696:1: ( ( '-' )? )
            // InternalMyLanguage.g:6697:2: ( '-' )?
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
            // InternalMyLanguage.g:6698:2: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==80) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyLanguage.g:6698:3: '-'
                    {
                    match(input,80,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // InternalMyLanguage.g:6706:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6710:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalMyLanguage.g:6711:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2();

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
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // InternalMyLanguage.g:6718:1: rule__DOUBLE__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6722:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6723:1: ( RULE_INT )
            {
            // InternalMyLanguage.g:6723:1: ( RULE_INT )
            // InternalMyLanguage.g:6724:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__2"
    // InternalMyLanguage.g:6733:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6737:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalMyLanguage.g:6738:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // InternalMyLanguage.g:6744:1: rule__DOUBLE__Group__2__Impl : ( ( rule__DOUBLE__Group_2__0 )? ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6748:1: ( ( ( rule__DOUBLE__Group_2__0 )? ) )
            // InternalMyLanguage.g:6749:1: ( ( rule__DOUBLE__Group_2__0 )? )
            {
            // InternalMyLanguage.g:6749:1: ( ( rule__DOUBLE__Group_2__0 )? )
            // InternalMyLanguage.g:6750:2: ( rule__DOUBLE__Group_2__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_2()); 
            // InternalMyLanguage.g:6751:2: ( rule__DOUBLE__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==81) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyLanguage.g:6751:3: rule__DOUBLE__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOUBLE__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group_2__0"
    // InternalMyLanguage.g:6760:1: rule__DOUBLE__Group_2__0 : rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 ;
    public final void rule__DOUBLE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6764:1: ( rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 )
            // InternalMyLanguage.g:6765:2: rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__DOUBLE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_2__1();

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
    // $ANTLR end "rule__DOUBLE__Group_2__0"


    // $ANTLR start "rule__DOUBLE__Group_2__0__Impl"
    // InternalMyLanguage.g:6772:1: rule__DOUBLE__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6776:1: ( ( '.' ) )
            // InternalMyLanguage.g:6777:1: ( '.' )
            {
            // InternalMyLanguage.g:6777:1: ( '.' )
            // InternalMyLanguage.g:6778:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group_2__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_2__1"
    // InternalMyLanguage.g:6787:1: rule__DOUBLE__Group_2__1 : rule__DOUBLE__Group_2__1__Impl ;
    public final void rule__DOUBLE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6791:1: ( rule__DOUBLE__Group_2__1__Impl )
            // InternalMyLanguage.g:6792:2: rule__DOUBLE__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_2__1__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group_2__1"


    // $ANTLR start "rule__DOUBLE__Group_2__1__Impl"
    // InternalMyLanguage.g:6798:1: rule__DOUBLE__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6802:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6803:1: ( RULE_INT )
            {
            // InternalMyLanguage.g:6803:1: ( RULE_INT )
            // InternalMyLanguage.g:6804:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group_2__1__Impl"


    // $ANTLR start "rule__PositiveDouble__Group__0"
    // InternalMyLanguage.g:6814:1: rule__PositiveDouble__Group__0 : rule__PositiveDouble__Group__0__Impl rule__PositiveDouble__Group__1 ;
    public final void rule__PositiveDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6818:1: ( rule__PositiveDouble__Group__0__Impl rule__PositiveDouble__Group__1 )
            // InternalMyLanguage.g:6819:2: rule__PositiveDouble__Group__0__Impl rule__PositiveDouble__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__PositiveDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositiveDouble__Group__1();

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
    // $ANTLR end "rule__PositiveDouble__Group__0"


    // $ANTLR start "rule__PositiveDouble__Group__0__Impl"
    // InternalMyLanguage.g:6826:1: rule__PositiveDouble__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__PositiveDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6830:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6831:1: ( RULE_INT )
            {
            // InternalMyLanguage.g:6831:1: ( RULE_INT )
            // InternalMyLanguage.g:6832:2: RULE_INT
            {
             before(grammarAccess.getPositiveDoubleAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositiveDoubleAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__PositiveDouble__Group__0__Impl"


    // $ANTLR start "rule__PositiveDouble__Group__1"
    // InternalMyLanguage.g:6841:1: rule__PositiveDouble__Group__1 : rule__PositiveDouble__Group__1__Impl ;
    public final void rule__PositiveDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6845:1: ( rule__PositiveDouble__Group__1__Impl )
            // InternalMyLanguage.g:6846:2: rule__PositiveDouble__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositiveDouble__Group__1__Impl();

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
    // $ANTLR end "rule__PositiveDouble__Group__1"


    // $ANTLR start "rule__PositiveDouble__Group__1__Impl"
    // InternalMyLanguage.g:6852:1: rule__PositiveDouble__Group__1__Impl : ( ( rule__PositiveDouble__Group_1__0 )? ) ;
    public final void rule__PositiveDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6856:1: ( ( ( rule__PositiveDouble__Group_1__0 )? ) )
            // InternalMyLanguage.g:6857:1: ( ( rule__PositiveDouble__Group_1__0 )? )
            {
            // InternalMyLanguage.g:6857:1: ( ( rule__PositiveDouble__Group_1__0 )? )
            // InternalMyLanguage.g:6858:2: ( rule__PositiveDouble__Group_1__0 )?
            {
             before(grammarAccess.getPositiveDoubleAccess().getGroup_1()); 
            // InternalMyLanguage.g:6859:2: ( rule__PositiveDouble__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==81) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyLanguage.g:6859:3: rule__PositiveDouble__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PositiveDouble__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositiveDoubleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PositiveDouble__Group__1__Impl"


    // $ANTLR start "rule__PositiveDouble__Group_1__0"
    // InternalMyLanguage.g:6868:1: rule__PositiveDouble__Group_1__0 : rule__PositiveDouble__Group_1__0__Impl rule__PositiveDouble__Group_1__1 ;
    public final void rule__PositiveDouble__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6872:1: ( rule__PositiveDouble__Group_1__0__Impl rule__PositiveDouble__Group_1__1 )
            // InternalMyLanguage.g:6873:2: rule__PositiveDouble__Group_1__0__Impl rule__PositiveDouble__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__PositiveDouble__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositiveDouble__Group_1__1();

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
    // $ANTLR end "rule__PositiveDouble__Group_1__0"


    // $ANTLR start "rule__PositiveDouble__Group_1__0__Impl"
    // InternalMyLanguage.g:6880:1: rule__PositiveDouble__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PositiveDouble__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6884:1: ( ( '.' ) )
            // InternalMyLanguage.g:6885:1: ( '.' )
            {
            // InternalMyLanguage.g:6885:1: ( '.' )
            // InternalMyLanguage.g:6886:2: '.'
            {
             before(grammarAccess.getPositiveDoubleAccess().getFullStopKeyword_1_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getPositiveDoubleAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__PositiveDouble__Group_1__0__Impl"


    // $ANTLR start "rule__PositiveDouble__Group_1__1"
    // InternalMyLanguage.g:6895:1: rule__PositiveDouble__Group_1__1 : rule__PositiveDouble__Group_1__1__Impl ;
    public final void rule__PositiveDouble__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6899:1: ( rule__PositiveDouble__Group_1__1__Impl )
            // InternalMyLanguage.g:6900:2: rule__PositiveDouble__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositiveDouble__Group_1__1__Impl();

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
    // $ANTLR end "rule__PositiveDouble__Group_1__1"


    // $ANTLR start "rule__PositiveDouble__Group_1__1__Impl"
    // InternalMyLanguage.g:6906:1: rule__PositiveDouble__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__PositiveDouble__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6910:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6911:1: ( RULE_INT )
            {
            // InternalMyLanguage.g:6911:1: ( RULE_INT )
            // InternalMyLanguage.g:6912:2: RULE_INT
            {
             before(grammarAccess.getPositiveDoubleAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositiveDoubleAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__PositiveDouble__Group_1__1__Impl"


    // $ANTLR start "rule__TestFile__TestsAssignment"
    // InternalMyLanguage.g:6922:1: rule__TestFile__TestsAssignment : ( ruleTest ) ;
    public final void rule__TestFile__TestsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6926:1: ( ( ruleTest ) )
            // InternalMyLanguage.g:6927:2: ( ruleTest )
            {
            // InternalMyLanguage.g:6927:2: ( ruleTest )
            // InternalMyLanguage.g:6928:3: ruleTest
            {
             before(grammarAccess.getTestFileAccess().getTestsTestParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestFileAccess().getTestsTestParserRuleCall_0()); 

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
    // $ANTLR end "rule__TestFile__TestsAssignment"


    // $ANTLR start "rule__Test__NameAssignment_1"
    // InternalMyLanguage.g:6937:1: rule__Test__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6941:1: ( ( RULE_ID ) )
            // InternalMyLanguage.g:6942:2: ( RULE_ID )
            {
            // InternalMyLanguage.g:6942:2: ( RULE_ID )
            // InternalMyLanguage.g:6943:3: RULE_ID
            {
             before(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Test__NameAssignment_1"


    // $ANTLR start "rule__Test__DescriptionAssignment_2_1"
    // InternalMyLanguage.g:6952:1: rule__Test__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Test__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6956:1: ( ( RULE_STRING ) )
            // InternalMyLanguage.g:6957:2: ( RULE_STRING )
            {
            // InternalMyLanguage.g:6957:2: ( RULE_STRING )
            // InternalMyLanguage.g:6958:3: RULE_STRING
            {
             before(grammarAccess.getTestAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Test__DescriptionAssignment_2_1"


    // $ANTLR start "rule__Test__StatementsAssignment_3"
    // InternalMyLanguage.g:6967:1: rule__Test__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Test__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6971:1: ( ( ruleStatement ) )
            // InternalMyLanguage.g:6972:2: ( ruleStatement )
            {
            // InternalMyLanguage.g:6972:2: ( ruleStatement )
            // InternalMyLanguage.g:6973:3: ruleStatement
            {
             before(grammarAccess.getTestAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTestAccess().getStatementsStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Test__StatementsAssignment_3"


    // $ANTLR start "rule__Given__BodyAssignment_1"
    // InternalMyLanguage.g:6982:1: rule__Given__BodyAssignment_1 : ( ruleStatementBody ) ;
    public final void rule__Given__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6986:1: ( ( ruleStatementBody ) )
            // InternalMyLanguage.g:6987:2: ( ruleStatementBody )
            {
            // InternalMyLanguage.g:6987:2: ( ruleStatementBody )
            // InternalMyLanguage.g:6988:3: ruleStatementBody
            {
             before(grammarAccess.getGivenAccess().getBodyStatementBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementBody();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getBodyStatementBodyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Given__BodyAssignment_1"


    // $ANTLR start "rule__Then__BodyAssignment_1"
    // InternalMyLanguage.g:6997:1: rule__Then__BodyAssignment_1 : ( ruleStatementBody ) ;
    public final void rule__Then__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7001:1: ( ( ruleStatementBody ) )
            // InternalMyLanguage.g:7002:2: ( ruleStatementBody )
            {
            // InternalMyLanguage.g:7002:2: ( ruleStatementBody )
            // InternalMyLanguage.g:7003:3: ruleStatementBody
            {
             before(grammarAccess.getThenAccess().getBodyStatementBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementBody();

            state._fsp--;

             after(grammarAccess.getThenAccess().getBodyStatementBodyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Then__BodyAssignment_1"


    // $ANTLR start "rule__When__BodyAssignment_1"
    // InternalMyLanguage.g:7012:1: rule__When__BodyAssignment_1 : ( ruleStatementBody ) ;
    public final void rule__When__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7016:1: ( ( ruleStatementBody ) )
            // InternalMyLanguage.g:7017:2: ( ruleStatementBody )
            {
            // InternalMyLanguage.g:7017:2: ( ruleStatementBody )
            // InternalMyLanguage.g:7018:3: ruleStatementBody
            {
             before(grammarAccess.getWhenAccess().getBodyStatementBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementBody();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getBodyStatementBodyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__When__BodyAssignment_1"


    // $ANTLR start "rule__CompStatusSent__StatusAssignment_2"
    // InternalMyLanguage.g:7027:1: rule__CompStatusSent__StatusAssignment_2 : ( ruleCOMPSTATUS ) ;
    public final void rule__CompStatusSent__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7031:1: ( ( ruleCOMPSTATUS ) )
            // InternalMyLanguage.g:7032:2: ( ruleCOMPSTATUS )
            {
            // InternalMyLanguage.g:7032:2: ( ruleCOMPSTATUS )
            // InternalMyLanguage.g:7033:3: ruleCOMPSTATUS
            {
             before(grammarAccess.getCompStatusSentAccess().getStatusCOMPSTATUSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPSTATUS();

            state._fsp--;

             after(grammarAccess.getCompStatusSentAccess().getStatusCOMPSTATUSParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompStatusSent__StatusAssignment_2"


    // $ANTLR start "rule__GPSSent__SentAssignment_1"
    // InternalMyLanguage.g:7042:1: rule__GPSSent__SentAssignment_1 : ( ( rule__GPSSent__SentAlternatives_1_0 ) ) ;
    public final void rule__GPSSent__SentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7046:1: ( ( ( rule__GPSSent__SentAlternatives_1_0 ) ) )
            // InternalMyLanguage.g:7047:2: ( ( rule__GPSSent__SentAlternatives_1_0 ) )
            {
            // InternalMyLanguage.g:7047:2: ( ( rule__GPSSent__SentAlternatives_1_0 ) )
            // InternalMyLanguage.g:7048:3: ( rule__GPSSent__SentAlternatives_1_0 )
            {
             before(grammarAccess.getGPSSentAccess().getSentAlternatives_1_0()); 
            // InternalMyLanguage.g:7049:3: ( rule__GPSSent__SentAlternatives_1_0 )
            // InternalMyLanguage.g:7049:4: rule__GPSSent__SentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__GPSSent__SentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGPSSentAccess().getSentAlternatives_1_0()); 

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
    // $ANTLR end "rule__GPSSent__SentAssignment_1"


    // $ANTLR start "rule__GPSReadingSent__PosXAssignment_2"
    // InternalMyLanguage.g:7057:1: rule__GPSReadingSent__PosXAssignment_2 : ( ruleDistanceUnit ) ;
    public final void rule__GPSReadingSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7061:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7062:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7062:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7063:3: ruleDistanceUnit
            {
             before(grammarAccess.getGPSReadingSentAccess().getPosXDistanceUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getGPSReadingSentAccess().getPosXDistanceUnitParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GPSReadingSent__PosXAssignment_2"


    // $ANTLR start "rule__GPSReadingSent__PosYAssignment_3"
    // InternalMyLanguage.g:7072:1: rule__GPSReadingSent__PosYAssignment_3 : ( ruleDistanceUnit ) ;
    public final void rule__GPSReadingSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7076:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7077:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7077:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7078:3: ruleDistanceUnit
            {
             before(grammarAccess.getGPSReadingSentAccess().getPosYDistanceUnitParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getGPSReadingSentAccess().getPosYDistanceUnitParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GPSReadingSent__PosYAssignment_3"


    // $ANTLR start "rule__GPSReadingSent__PosZAssignment_4"
    // InternalMyLanguage.g:7087:1: rule__GPSReadingSent__PosZAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__GPSReadingSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7091:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7092:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7092:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7093:3: ruleDistanceUnit
            {
             before(grammarAccess.getGPSReadingSentAccess().getPosZDistanceUnitParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getGPSReadingSentAccess().getPosZDistanceUnitParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__GPSReadingSent__PosZAssignment_4"


    // $ANTLR start "rule__GPSReadingSent__ToleranceAssignment_5"
    // InternalMyLanguage.g:7102:1: rule__GPSReadingSent__ToleranceAssignment_5 : ( ( rule__GPSReadingSent__ToleranceAlternatives_5_0 ) ) ;
    public final void rule__GPSReadingSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7106:1: ( ( ( rule__GPSReadingSent__ToleranceAlternatives_5_0 ) ) )
            // InternalMyLanguage.g:7107:2: ( ( rule__GPSReadingSent__ToleranceAlternatives_5_0 ) )
            {
            // InternalMyLanguage.g:7107:2: ( ( rule__GPSReadingSent__ToleranceAlternatives_5_0 ) )
            // InternalMyLanguage.g:7108:3: ( rule__GPSReadingSent__ToleranceAlternatives_5_0 )
            {
             before(grammarAccess.getGPSReadingSentAccess().getToleranceAlternatives_5_0()); 
            // InternalMyLanguage.g:7109:3: ( rule__GPSReadingSent__ToleranceAlternatives_5_0 )
            // InternalMyLanguage.g:7109:4: rule__GPSReadingSent__ToleranceAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__GPSReadingSent__ToleranceAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getGPSReadingSentAccess().getToleranceAlternatives_5_0()); 

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
    // $ANTLR end "rule__GPSReadingSent__ToleranceAssignment_5"


    // $ANTLR start "rule__BaroSent__SentAssignment_1"
    // InternalMyLanguage.g:7117:1: rule__BaroSent__SentAssignment_1 : ( ( rule__BaroSent__SentAlternatives_1_0 ) ) ;
    public final void rule__BaroSent__SentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7121:1: ( ( ( rule__BaroSent__SentAlternatives_1_0 ) ) )
            // InternalMyLanguage.g:7122:2: ( ( rule__BaroSent__SentAlternatives_1_0 ) )
            {
            // InternalMyLanguage.g:7122:2: ( ( rule__BaroSent__SentAlternatives_1_0 ) )
            // InternalMyLanguage.g:7123:3: ( rule__BaroSent__SentAlternatives_1_0 )
            {
             before(grammarAccess.getBaroSentAccess().getSentAlternatives_1_0()); 
            // InternalMyLanguage.g:7124:3: ( rule__BaroSent__SentAlternatives_1_0 )
            // InternalMyLanguage.g:7124:4: rule__BaroSent__SentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BaroSent__SentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBaroSentAccess().getSentAlternatives_1_0()); 

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
    // $ANTLR end "rule__BaroSent__SentAssignment_1"


    // $ANTLR start "rule__BaroAltSent__SentAssignment_2"
    // InternalMyLanguage.g:7132:1: rule__BaroAltSent__SentAssignment_2 : ( ( rule__BaroAltSent__SentAlternatives_2_0 ) ) ;
    public final void rule__BaroAltSent__SentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7136:1: ( ( ( rule__BaroAltSent__SentAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:7137:2: ( ( rule__BaroAltSent__SentAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:7137:2: ( ( rule__BaroAltSent__SentAlternatives_2_0 ) )
            // InternalMyLanguage.g:7138:3: ( rule__BaroAltSent__SentAlternatives_2_0 )
            {
             before(grammarAccess.getBaroAltSentAccess().getSentAlternatives_2_0()); 
            // InternalMyLanguage.g:7139:3: ( rule__BaroAltSent__SentAlternatives_2_0 )
            // InternalMyLanguage.g:7139:4: rule__BaroAltSent__SentAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BaroAltSent__SentAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBaroAltSentAccess().getSentAlternatives_2_0()); 

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
    // $ANTLR end "rule__BaroAltSent__SentAssignment_2"


    // $ANTLR start "rule__SonarSent__SentAssignment_1"
    // InternalMyLanguage.g:7147:1: rule__SonarSent__SentAssignment_1 : ( ( rule__SonarSent__SentAlternatives_1_0 ) ) ;
    public final void rule__SonarSent__SentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7151:1: ( ( ( rule__SonarSent__SentAlternatives_1_0 ) ) )
            // InternalMyLanguage.g:7152:2: ( ( rule__SonarSent__SentAlternatives_1_0 ) )
            {
            // InternalMyLanguage.g:7152:2: ( ( rule__SonarSent__SentAlternatives_1_0 ) )
            // InternalMyLanguage.g:7153:3: ( rule__SonarSent__SentAlternatives_1_0 )
            {
             before(grammarAccess.getSonarSentAccess().getSentAlternatives_1_0()); 
            // InternalMyLanguage.g:7154:3: ( rule__SonarSent__SentAlternatives_1_0 )
            // InternalMyLanguage.g:7154:4: rule__SonarSent__SentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SonarSent__SentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSonarSentAccess().getSentAlternatives_1_0()); 

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
    // $ANTLR end "rule__SonarSent__SentAssignment_1"


    // $ANTLR start "rule__SonarDistanceSent__SentAssignment_2"
    // InternalMyLanguage.g:7162:1: rule__SonarDistanceSent__SentAssignment_2 : ( ( rule__SonarDistanceSent__SentAlternatives_2_0 ) ) ;
    public final void rule__SonarDistanceSent__SentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7166:1: ( ( ( rule__SonarDistanceSent__SentAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:7167:2: ( ( rule__SonarDistanceSent__SentAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:7167:2: ( ( rule__SonarDistanceSent__SentAlternatives_2_0 ) )
            // InternalMyLanguage.g:7168:3: ( rule__SonarDistanceSent__SentAlternatives_2_0 )
            {
             before(grammarAccess.getSonarDistanceSentAccess().getSentAlternatives_2_0()); 
            // InternalMyLanguage.g:7169:3: ( rule__SonarDistanceSent__SentAlternatives_2_0 )
            // InternalMyLanguage.g:7169:4: rule__SonarDistanceSent__SentAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SonarDistanceSent__SentAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSonarDistanceSentAccess().getSentAlternatives_2_0()); 

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
    // $ANTLR end "rule__SonarDistanceSent__SentAssignment_2"


    // $ANTLR start "rule__NotificationSent__NotAssignment_0"
    // InternalMyLanguage.g:7177:1: rule__NotificationSent__NotAssignment_0 : ( ( 'Notification' ) ) ;
    public final void rule__NotificationSent__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7181:1: ( ( ( 'Notification' ) ) )
            // InternalMyLanguage.g:7182:2: ( ( 'Notification' ) )
            {
            // InternalMyLanguage.g:7182:2: ( ( 'Notification' ) )
            // InternalMyLanguage.g:7183:3: ( 'Notification' )
            {
             before(grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0()); 
            // InternalMyLanguage.g:7184:3: ( 'Notification' )
            // InternalMyLanguage.g:7185:4: 'Notification'
            {
             before(grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0()); 

            }

             after(grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0()); 

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
    // $ANTLR end "rule__NotificationSent__NotAssignment_0"


    // $ANTLR start "rule__TimeInterval__FirstAssignment_3"
    // InternalMyLanguage.g:7196:1: rule__TimeInterval__FirstAssignment_3 : ( ruleTimeUnit ) ;
    public final void rule__TimeInterval__FirstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7200:1: ( ( ruleTimeUnit ) )
            // InternalMyLanguage.g:7201:2: ( ruleTimeUnit )
            {
            // InternalMyLanguage.g:7201:2: ( ruleTimeUnit )
            // InternalMyLanguage.g:7202:3: ruleTimeUnit
            {
             before(grammarAccess.getTimeIntervalAccess().getFirstTimeUnitParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeIntervalAccess().getFirstTimeUnitParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TimeInterval__FirstAssignment_3"


    // $ANTLR start "rule__TimeInterval__SecondAssignment_5"
    // InternalMyLanguage.g:7211:1: rule__TimeInterval__SecondAssignment_5 : ( ruleTimeUnit ) ;
    public final void rule__TimeInterval__SecondAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7215:1: ( ( ruleTimeUnit ) )
            // InternalMyLanguage.g:7216:2: ( ruleTimeUnit )
            {
            // InternalMyLanguage.g:7216:2: ( ruleTimeUnit )
            // InternalMyLanguage.g:7217:3: ruleTimeUnit
            {
             before(grammarAccess.getTimeIntervalAccess().getSecondTimeUnitParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeIntervalAccess().getSecondTimeUnitParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__TimeInterval__SecondAssignment_5"


    // $ANTLR start "rule__BatterySent__SentAssignment_1"
    // InternalMyLanguage.g:7226:1: rule__BatterySent__SentAssignment_1 : ( ( rule__BatterySent__SentAlternatives_1_0 ) ) ;
    public final void rule__BatterySent__SentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7230:1: ( ( ( rule__BatterySent__SentAlternatives_1_0 ) ) )
            // InternalMyLanguage.g:7231:2: ( ( rule__BatterySent__SentAlternatives_1_0 ) )
            {
            // InternalMyLanguage.g:7231:2: ( ( rule__BatterySent__SentAlternatives_1_0 ) )
            // InternalMyLanguage.g:7232:3: ( rule__BatterySent__SentAlternatives_1_0 )
            {
             before(grammarAccess.getBatterySentAccess().getSentAlternatives_1_0()); 
            // InternalMyLanguage.g:7233:3: ( rule__BatterySent__SentAlternatives_1_0 )
            // InternalMyLanguage.g:7233:4: rule__BatterySent__SentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BatterySent__SentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBatterySentAccess().getSentAlternatives_1_0()); 

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
    // $ANTLR end "rule__BatterySent__SentAssignment_1"


    // $ANTLR start "rule__BatteryLevelSent__SentAssignment_2"
    // InternalMyLanguage.g:7241:1: rule__BatteryLevelSent__SentAssignment_2 : ( ( rule__BatteryLevelSent__SentAlternatives_2_0 ) ) ;
    public final void rule__BatteryLevelSent__SentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7245:1: ( ( ( rule__BatteryLevelSent__SentAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:7246:2: ( ( rule__BatteryLevelSent__SentAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:7246:2: ( ( rule__BatteryLevelSent__SentAlternatives_2_0 ) )
            // InternalMyLanguage.g:7247:3: ( rule__BatteryLevelSent__SentAlternatives_2_0 )
            {
             before(grammarAccess.getBatteryLevelSentAccess().getSentAlternatives_2_0()); 
            // InternalMyLanguage.g:7248:3: ( rule__BatteryLevelSent__SentAlternatives_2_0 )
            // InternalMyLanguage.g:7248:4: rule__BatteryLevelSent__SentAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BatteryLevelSent__SentAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBatteryLevelSentAccess().getSentAlternatives_2_0()); 

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
    // $ANTLR end "rule__BatteryLevelSent__SentAssignment_2"


    // $ANTLR start "rule__PeoplePosSent__PosXAssignment_2"
    // InternalMyLanguage.g:7256:1: rule__PeoplePosSent__PosXAssignment_2 : ( ruleDistanceUnit ) ;
    public final void rule__PeoplePosSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7260:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7261:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7261:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7262:3: ruleDistanceUnit
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosXDistanceUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getPeoplePosSentAccess().getPosXDistanceUnitParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PeoplePosSent__PosXAssignment_2"


    // $ANTLR start "rule__PeoplePosSent__PosYAssignment_3"
    // InternalMyLanguage.g:7271:1: rule__PeoplePosSent__PosYAssignment_3 : ( ruleDistanceUnit ) ;
    public final void rule__PeoplePosSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7275:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7276:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7276:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7277:3: ruleDistanceUnit
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosYDistanceUnitParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getPeoplePosSentAccess().getPosYDistanceUnitParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PeoplePosSent__PosYAssignment_3"


    // $ANTLR start "rule__PeoplePosSent__PosZAssignment_4"
    // InternalMyLanguage.g:7286:1: rule__PeoplePosSent__PosZAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__PeoplePosSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7290:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7291:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7291:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7292:3: ruleDistanceUnit
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosZDistanceUnitParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getPeoplePosSentAccess().getPosZDistanceUnitParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PeoplePosSent__PosZAssignment_4"


    // $ANTLR start "rule__PeoplePosSent__ToleranceAssignment_5"
    // InternalMyLanguage.g:7301:1: rule__PeoplePosSent__ToleranceAssignment_5 : ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) ) ;
    public final void rule__PeoplePosSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7305:1: ( ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) ) )
            // InternalMyLanguage.g:7306:2: ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) )
            {
            // InternalMyLanguage.g:7306:2: ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) )
            // InternalMyLanguage.g:7307:3: ( rule__PeoplePosSent__ToleranceAlternatives_5_0 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getToleranceAlternatives_5_0()); 
            // InternalMyLanguage.g:7308:3: ( rule__PeoplePosSent__ToleranceAlternatives_5_0 )
            // InternalMyLanguage.g:7308:4: rule__PeoplePosSent__ToleranceAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__PeoplePosSent__ToleranceAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPeoplePosSentAccess().getToleranceAlternatives_5_0()); 

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
    // $ANTLR end "rule__PeoplePosSent__ToleranceAssignment_5"


    // $ANTLR start "rule__PeopleNumbSent__AmountAssignment_2"
    // InternalMyLanguage.g:7316:1: rule__PeopleNumbSent__AmountAssignment_2 : ( RULE_INT ) ;
    public final void rule__PeopleNumbSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7320:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:7321:2: ( RULE_INT )
            {
            // InternalMyLanguage.g:7321:2: ( RULE_INT )
            // InternalMyLanguage.g:7322:3: RULE_INT
            {
             before(grammarAccess.getPeopleNumbSentAccess().getAmountINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPeopleNumbSentAccess().getAmountINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PeopleNumbSent__AmountAssignment_2"


    // $ANTLR start "rule__MissionGoalSent__PosXAssignment_2"
    // InternalMyLanguage.g:7331:1: rule__MissionGoalSent__PosXAssignment_2 : ( ruleDistanceUnit ) ;
    public final void rule__MissionGoalSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7335:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7336:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7336:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7337:3: ruleDistanceUnit
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosXDistanceUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getMissionGoalSentAccess().getPosXDistanceUnitParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MissionGoalSent__PosXAssignment_2"


    // $ANTLR start "rule__MissionGoalSent__PosYAssignment_3"
    // InternalMyLanguage.g:7346:1: rule__MissionGoalSent__PosYAssignment_3 : ( ruleDistanceUnit ) ;
    public final void rule__MissionGoalSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7350:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7351:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7351:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7352:3: ruleDistanceUnit
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosYDistanceUnitParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getMissionGoalSentAccess().getPosYDistanceUnitParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MissionGoalSent__PosYAssignment_3"


    // $ANTLR start "rule__MissionGoalSent__PosZAssignment_4"
    // InternalMyLanguage.g:7361:1: rule__MissionGoalSent__PosZAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__MissionGoalSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7365:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7366:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7366:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7367:3: ruleDistanceUnit
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosZDistanceUnitParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getMissionGoalSentAccess().getPosZDistanceUnitParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MissionGoalSent__PosZAssignment_4"


    // $ANTLR start "rule__MissionRiskLevelSent__RisklevelAssignment_2"
    // InternalMyLanguage.g:7376:1: rule__MissionRiskLevelSent__RisklevelAssignment_2 : ( ruleMISSIONRISKLEVEL ) ;
    public final void rule__MissionRiskLevelSent__RisklevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7380:1: ( ( ruleMISSIONRISKLEVEL ) )
            // InternalMyLanguage.g:7381:2: ( ruleMISSIONRISKLEVEL )
            {
            // InternalMyLanguage.g:7381:2: ( ruleMISSIONRISKLEVEL )
            // InternalMyLanguage.g:7382:3: ruleMISSIONRISKLEVEL
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getRisklevelMISSIONRISKLEVELParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMISSIONRISKLEVEL();

            state._fsp--;

             after(grammarAccess.getMissionRiskLevelSentAccess().getRisklevelMISSIONRISKLEVELParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MissionRiskLevelSent__RisklevelAssignment_2"


    // $ANTLR start "rule__MissionStatusSent__StateAssignment_2"
    // InternalMyLanguage.g:7391:1: rule__MissionStatusSent__StateAssignment_2 : ( ruleMISSIONSTATUS ) ;
    public final void rule__MissionStatusSent__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7395:1: ( ( ruleMISSIONSTATUS ) )
            // InternalMyLanguage.g:7396:2: ( ruleMISSIONSTATUS )
            {
            // InternalMyLanguage.g:7396:2: ( ruleMISSIONSTATUS )
            // InternalMyLanguage.g:7397:3: ruleMISSIONSTATUS
            {
             before(grammarAccess.getMissionStatusSentAccess().getStateMISSIONSTATUSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMISSIONSTATUS();

            state._fsp--;

             after(grammarAccess.getMissionStatusSentAccess().getStateMISSIONSTATUSParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MissionStatusSent__StateAssignment_2"


    // $ANTLR start "rule__RobotAutoPilot__StatusAssignment_2"
    // InternalMyLanguage.g:7406:1: rule__RobotAutoPilot__StatusAssignment_2 : ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) ) ;
    public final void rule__RobotAutoPilot__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7410:1: ( ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:7411:2: ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:7411:2: ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) )
            // InternalMyLanguage.g:7412:3: ( rule__RobotAutoPilot__StatusAlternatives_2_0 )
            {
             before(grammarAccess.getRobotAutoPilotAccess().getStatusAlternatives_2_0()); 
            // InternalMyLanguage.g:7413:3: ( rule__RobotAutoPilot__StatusAlternatives_2_0 )
            // InternalMyLanguage.g:7413:4: rule__RobotAutoPilot__StatusAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RobotAutoPilot__StatusAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAutoPilotAccess().getStatusAlternatives_2_0()); 

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
    // $ANTLR end "rule__RobotAutoPilot__StatusAssignment_2"


    // $ANTLR start "rule__PayloadSent__LoadAssignment_0"
    // InternalMyLanguage.g:7421:1: rule__PayloadSent__LoadAssignment_0 : ( ( 'payload' ) ) ;
    public final void rule__PayloadSent__LoadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7425:1: ( ( ( 'payload' ) ) )
            // InternalMyLanguage.g:7426:2: ( ( 'payload' ) )
            {
            // InternalMyLanguage.g:7426:2: ( ( 'payload' ) )
            // InternalMyLanguage.g:7427:3: ( 'payload' )
            {
             before(grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0()); 
            // InternalMyLanguage.g:7428:3: ( 'payload' )
            // InternalMyLanguage.g:7429:4: 'payload'
            {
             before(grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0()); 

            }

             after(grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0()); 

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
    // $ANTLR end "rule__PayloadSent__LoadAssignment_0"


    // $ANTLR start "rule__RobotDistanceSent__SentAssignment_2"
    // InternalMyLanguage.g:7440:1: rule__RobotDistanceSent__SentAssignment_2 : ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) ) ;
    public final void rule__RobotDistanceSent__SentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7444:1: ( ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:7445:2: ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:7445:2: ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) )
            // InternalMyLanguage.g:7446:3: ( rule__RobotDistanceSent__SentAlternatives_2_0 )
            {
             before(grammarAccess.getRobotDistanceSentAccess().getSentAlternatives_2_0()); 
            // InternalMyLanguage.g:7447:3: ( rule__RobotDistanceSent__SentAlternatives_2_0 )
            // InternalMyLanguage.g:7447:4: rule__RobotDistanceSent__SentAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RobotDistanceSent__SentAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRobotDistanceSentAccess().getSentAlternatives_2_0()); 

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
    // $ANTLR end "rule__RobotDistanceSent__SentAssignment_2"


    // $ANTLR start "rule__DistanceToLocationSent__PosXAssignment_0"
    // InternalMyLanguage.g:7455:1: rule__DistanceToLocationSent__PosXAssignment_0 : ( ruleDistanceUnit ) ;
    public final void rule__DistanceToLocationSent__PosXAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7459:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7460:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7460:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7461:3: ruleDistanceUnit
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosXDistanceUnitParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getDistanceToLocationSentAccess().getPosXDistanceUnitParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__PosXAssignment_0"


    // $ANTLR start "rule__DistanceToLocationSent__PosYAssignment_1"
    // InternalMyLanguage.g:7470:1: rule__DistanceToLocationSent__PosYAssignment_1 : ( ruleDistanceUnit ) ;
    public final void rule__DistanceToLocationSent__PosYAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7474:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7475:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7475:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7476:3: ruleDistanceUnit
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosYDistanceUnitParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getDistanceToLocationSentAccess().getPosYDistanceUnitParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__PosYAssignment_1"


    // $ANTLR start "rule__DistanceToLocationSent__PosZAssignment_2"
    // InternalMyLanguage.g:7485:1: rule__DistanceToLocationSent__PosZAssignment_2 : ( ruleDistanceUnit ) ;
    public final void rule__DistanceToLocationSent__PosZAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7489:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7490:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7490:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7491:3: ruleDistanceUnit
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosZDistanceUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getDistanceToLocationSentAccess().getPosZDistanceUnitParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__PosZAssignment_2"


    // $ANTLR start "rule__DistanceToLocationSent__BodyAssignment_4"
    // InternalMyLanguage.g:7500:1: rule__DistanceToLocationSent__BodyAssignment_4 : ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) ) ;
    public final void rule__DistanceToLocationSent__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7504:1: ( ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) ) )
            // InternalMyLanguage.g:7505:2: ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) )
            {
            // InternalMyLanguage.g:7505:2: ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) )
            // InternalMyLanguage.g:7506:3: ( rule__DistanceToLocationSent__BodyAlternatives_4_0 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getBodyAlternatives_4_0()); 
            // InternalMyLanguage.g:7507:3: ( rule__DistanceToLocationSent__BodyAlternatives_4_0 )
            // InternalMyLanguage.g:7507:4: rule__DistanceToLocationSent__BodyAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToLocationSent__BodyAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceToLocationSentAccess().getBodyAlternatives_4_0()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__BodyAssignment_4"


    // $ANTLR start "rule__DistanceToLocationSent__ToleranceAssignment_5"
    // InternalMyLanguage.g:7515:1: rule__DistanceToLocationSent__ToleranceAssignment_5 : ( ruleToleranceSent ) ;
    public final void rule__DistanceToLocationSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7519:1: ( ( ruleToleranceSent ) )
            // InternalMyLanguage.g:7520:2: ( ruleToleranceSent )
            {
            // InternalMyLanguage.g:7520:2: ( ruleToleranceSent )
            // InternalMyLanguage.g:7521:3: ruleToleranceSent
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getToleranceToleranceSentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleToleranceSent();

            state._fsp--;

             after(grammarAccess.getDistanceToLocationSentAccess().getToleranceToleranceSentParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__DistanceToLocationSent__ToleranceAssignment_5"


    // $ANTLR start "rule__DistanceToObstaclesSent__BodyAssignment_2"
    // InternalMyLanguage.g:7530:1: rule__DistanceToObstaclesSent__BodyAssignment_2 : ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) ) ;
    public final void rule__DistanceToObstaclesSent__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7534:1: ( ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:7535:2: ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:7535:2: ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) )
            // InternalMyLanguage.g:7536:3: ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 )
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAlternatives_2_0()); 
            // InternalMyLanguage.g:7537:3: ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 )
            // InternalMyLanguage.g:7537:4: rule__DistanceToObstaclesSent__BodyAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceToObstaclesSent__BodyAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAlternatives_2_0()); 

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
    // $ANTLR end "rule__DistanceToObstaclesSent__BodyAssignment_2"


    // $ANTLR start "rule__DistanceToObstaclesSent__ToleranceAssignment_3"
    // InternalMyLanguage.g:7545:1: rule__DistanceToObstaclesSent__ToleranceAssignment_3 : ( ruleToleranceSent ) ;
    public final void rule__DistanceToObstaclesSent__ToleranceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7549:1: ( ( ruleToleranceSent ) )
            // InternalMyLanguage.g:7550:2: ( ruleToleranceSent )
            {
            // InternalMyLanguage.g:7550:2: ( ruleToleranceSent )
            // InternalMyLanguage.g:7551:3: ruleToleranceSent
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getToleranceToleranceSentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleToleranceSent();

            state._fsp--;

             after(grammarAccess.getDistanceToObstaclesSentAccess().getToleranceToleranceSentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DistanceToObstaclesSent__ToleranceAssignment_3"


    // $ANTLR start "rule__EqualSent__AmountAssignment_2"
    // InternalMyLanguage.g:7560:1: rule__EqualSent__AmountAssignment_2 : ( ( rule__EqualSent__AmountAlternatives_2_0 ) ) ;
    public final void rule__EqualSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7564:1: ( ( ( rule__EqualSent__AmountAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:7565:2: ( ( rule__EqualSent__AmountAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:7565:2: ( ( rule__EqualSent__AmountAlternatives_2_0 ) )
            // InternalMyLanguage.g:7566:3: ( rule__EqualSent__AmountAlternatives_2_0 )
            {
             before(grammarAccess.getEqualSentAccess().getAmountAlternatives_2_0()); 
            // InternalMyLanguage.g:7567:3: ( rule__EqualSent__AmountAlternatives_2_0 )
            // InternalMyLanguage.g:7567:4: rule__EqualSent__AmountAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EqualSent__AmountAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualSentAccess().getAmountAlternatives_2_0()); 

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
    // $ANTLR end "rule__EqualSent__AmountAssignment_2"


    // $ANTLR start "rule__LessSent__AmountAssignment_2"
    // InternalMyLanguage.g:7575:1: rule__LessSent__AmountAssignment_2 : ( ( rule__LessSent__AmountAlternatives_2_0 ) ) ;
    public final void rule__LessSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7579:1: ( ( ( rule__LessSent__AmountAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:7580:2: ( ( rule__LessSent__AmountAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:7580:2: ( ( rule__LessSent__AmountAlternatives_2_0 ) )
            // InternalMyLanguage.g:7581:3: ( rule__LessSent__AmountAlternatives_2_0 )
            {
             before(grammarAccess.getLessSentAccess().getAmountAlternatives_2_0()); 
            // InternalMyLanguage.g:7582:3: ( rule__LessSent__AmountAlternatives_2_0 )
            // InternalMyLanguage.g:7582:4: rule__LessSent__AmountAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LessSent__AmountAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLessSentAccess().getAmountAlternatives_2_0()); 

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
    // $ANTLR end "rule__LessSent__AmountAssignment_2"


    // $ANTLR start "rule__GreaterSent__AmountAssignment_2"
    // InternalMyLanguage.g:7590:1: rule__GreaterSent__AmountAssignment_2 : ( ( rule__GreaterSent__AmountAlternatives_2_0 ) ) ;
    public final void rule__GreaterSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7594:1: ( ( ( rule__GreaterSent__AmountAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:7595:2: ( ( rule__GreaterSent__AmountAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:7595:2: ( ( rule__GreaterSent__AmountAlternatives_2_0 ) )
            // InternalMyLanguage.g:7596:3: ( rule__GreaterSent__AmountAlternatives_2_0 )
            {
             before(grammarAccess.getGreaterSentAccess().getAmountAlternatives_2_0()); 
            // InternalMyLanguage.g:7597:3: ( rule__GreaterSent__AmountAlternatives_2_0 )
            // InternalMyLanguage.g:7597:4: rule__GreaterSent__AmountAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GreaterSent__AmountAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGreaterSentAccess().getAmountAlternatives_2_0()); 

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
    // $ANTLR end "rule__GreaterSent__AmountAssignment_2"


    // $ANTLR start "rule__RobotStateSent__StateAssignment_2"
    // InternalMyLanguage.g:7605:1: rule__RobotStateSent__StateAssignment_2 : ( RULE_ID ) ;
    public final void rule__RobotStateSent__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7609:1: ( ( RULE_ID ) )
            // InternalMyLanguage.g:7610:2: ( RULE_ID )
            {
            // InternalMyLanguage.g:7610:2: ( RULE_ID )
            // InternalMyLanguage.g:7611:3: RULE_ID
            {
             before(grammarAccess.getRobotStateSentAccess().getStateIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRobotStateSentAccess().getStateIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RobotStateSent__StateAssignment_2"


    // $ANTLR start "rule__RobotPositionSent__PosXAssignment_2"
    // InternalMyLanguage.g:7620:1: rule__RobotPositionSent__PosXAssignment_2 : ( ruleDistanceUnit ) ;
    public final void rule__RobotPositionSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7624:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7625:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7625:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7626:3: ruleDistanceUnit
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosXDistanceUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getRobotPositionSentAccess().getPosXDistanceUnitParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RobotPositionSent__PosXAssignment_2"


    // $ANTLR start "rule__RobotPositionSent__PosYAssignment_3"
    // InternalMyLanguage.g:7635:1: rule__RobotPositionSent__PosYAssignment_3 : ( ruleDistanceUnit ) ;
    public final void rule__RobotPositionSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7639:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7640:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7640:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7641:3: ruleDistanceUnit
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosYDistanceUnitParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getRobotPositionSentAccess().getPosYDistanceUnitParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RobotPositionSent__PosYAssignment_3"


    // $ANTLR start "rule__RobotPositionSent__PosZAssignment_4"
    // InternalMyLanguage.g:7650:1: rule__RobotPositionSent__PosZAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__RobotPositionSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7654:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7655:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7655:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7656:3: ruleDistanceUnit
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosZDistanceUnitParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getRobotPositionSentAccess().getPosZDistanceUnitParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RobotPositionSent__PosZAssignment_4"


    // $ANTLR start "rule__RobotPositionSent__ToleranceAssignment_5"
    // InternalMyLanguage.g:7665:1: rule__RobotPositionSent__ToleranceAssignment_5 : ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) ) ;
    public final void rule__RobotPositionSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7669:1: ( ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) ) )
            // InternalMyLanguage.g:7670:2: ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) )
            {
            // InternalMyLanguage.g:7670:2: ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) )
            // InternalMyLanguage.g:7671:3: ( rule__RobotPositionSent__ToleranceAlternatives_5_0 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getToleranceAlternatives_5_0()); 
            // InternalMyLanguage.g:7672:3: ( rule__RobotPositionSent__ToleranceAlternatives_5_0 )
            // InternalMyLanguage.g:7672:4: rule__RobotPositionSent__ToleranceAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__RobotPositionSent__ToleranceAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getRobotPositionSentAccess().getToleranceAlternatives_5_0()); 

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
    // $ANTLR end "rule__RobotPositionSent__ToleranceAssignment_5"


    // $ANTLR start "rule__CirclePosition__ToleranceAssignment_4"
    // InternalMyLanguage.g:7680:1: rule__CirclePosition__ToleranceAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__CirclePosition__ToleranceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7684:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7685:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7685:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7686:3: ruleDistanceUnit
            {
             before(grammarAccess.getCirclePositionAccess().getToleranceDistanceUnitParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getCirclePositionAccess().getToleranceDistanceUnitParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CirclePosition__ToleranceAssignment_4"


    // $ANTLR start "rule__SpherePosition__ToleranceAssignment_4"
    // InternalMyLanguage.g:7695:1: rule__SpherePosition__ToleranceAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__SpherePosition__ToleranceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7699:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7700:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7700:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7701:3: ruleDistanceUnit
            {
             before(grammarAccess.getSpherePositionAccess().getToleranceDistanceUnitParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getSpherePositionAccess().getToleranceDistanceUnitParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SpherePosition__ToleranceAssignment_4"


    // $ANTLR start "rule__RobotSpeedSent__SpeedXAssignment_2"
    // InternalMyLanguage.g:7710:1: rule__RobotSpeedSent__SpeedXAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__RobotSpeedSent__SpeedXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7714:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7715:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7715:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7716:3: ruleDOUBLE
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedXDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getRobotSpeedSentAccess().getSpeedXDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RobotSpeedSent__SpeedXAssignment_2"


    // $ANTLR start "rule__RobotSpeedSent__SpeedYAssignment_3"
    // InternalMyLanguage.g:7725:1: rule__RobotSpeedSent__SpeedYAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__RobotSpeedSent__SpeedYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7729:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7730:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7730:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7731:3: ruleDOUBLE
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedYDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getRobotSpeedSentAccess().getSpeedYDOUBLEParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RobotSpeedSent__SpeedYAssignment_3"


    // $ANTLR start "rule__RobotSpeedSent__SpeedZAssignment_4"
    // InternalMyLanguage.g:7740:1: rule__RobotSpeedSent__SpeedZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__RobotSpeedSent__SpeedZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7744:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7745:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7745:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7746:3: ruleDOUBLE
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedZDOUBLEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getRobotSpeedSentAccess().getSpeedZDOUBLEParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RobotSpeedSent__SpeedZAssignment_4"


    // $ANTLR start "rule__EnvironmentSent__BodyAssignment_3"
    // InternalMyLanguage.g:7755:1: rule__EnvironmentSent__BodyAssignment_3 : ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) ) ;
    public final void rule__EnvironmentSent__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7759:1: ( ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) ) )
            // InternalMyLanguage.g:7760:2: ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) )
            {
            // InternalMyLanguage.g:7760:2: ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) )
            // InternalMyLanguage.g:7761:3: ( rule__EnvironmentSent__BodyAlternatives_3_0 )
            {
             before(grammarAccess.getEnvironmentSentAccess().getBodyAlternatives_3_0()); 
            // InternalMyLanguage.g:7762:3: ( rule__EnvironmentSent__BodyAlternatives_3_0 )
            // InternalMyLanguage.g:7762:4: rule__EnvironmentSent__BodyAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentSent__BodyAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentSentAccess().getBodyAlternatives_3_0()); 

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
    // $ANTLR end "rule__EnvironmentSent__BodyAssignment_3"


    // $ANTLR start "rule__RiskSent__LevelAssignment_2"
    // InternalMyLanguage.g:7770:1: rule__RiskSent__LevelAssignment_2 : ( ruleCOLLISIONRISKLEVEL ) ;
    public final void rule__RiskSent__LevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7774:1: ( ( ruleCOLLISIONRISKLEVEL ) )
            // InternalMyLanguage.g:7775:2: ( ruleCOLLISIONRISKLEVEL )
            {
            // InternalMyLanguage.g:7775:2: ( ruleCOLLISIONRISKLEVEL )
            // InternalMyLanguage.g:7776:3: ruleCOLLISIONRISKLEVEL
            {
             before(grammarAccess.getRiskSentAccess().getLevelCOLLISIONRISKLEVELParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLLISIONRISKLEVEL();

            state._fsp--;

             after(grammarAccess.getRiskSentAccess().getLevelCOLLISIONRISKLEVELParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RiskSent__LevelAssignment_2"


    // $ANTLR start "rule__ToleranceSent__UnitAssignment_2"
    // InternalMyLanguage.g:7785:1: rule__ToleranceSent__UnitAssignment_2 : ( ruleDistanceUnit ) ;
    public final void rule__ToleranceSent__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7789:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7790:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7790:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7791:3: ruleDistanceUnit
            {
             before(grammarAccess.getToleranceSentAccess().getUnitDistanceUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getToleranceSentAccess().getUnitDistanceUnitParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ToleranceSent__UnitAssignment_2"


    // $ANTLR start "rule__SECONDS__ValueAssignment_1"
    // InternalMyLanguage.g:7800:1: rule__SECONDS__ValueAssignment_1 : ( rulePositiveDouble ) ;
    public final void rule__SECONDS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7804:1: ( ( rulePositiveDouble ) )
            // InternalMyLanguage.g:7805:2: ( rulePositiveDouble )
            {
            // InternalMyLanguage.g:7805:2: ( rulePositiveDouble )
            // InternalMyLanguage.g:7806:3: rulePositiveDouble
            {
             before(grammarAccess.getSECONDSAccess().getValuePositiveDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositiveDouble();

            state._fsp--;

             after(grammarAccess.getSECONDSAccess().getValuePositiveDoubleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SECONDS__ValueAssignment_1"


    // $ANTLR start "rule__HOUR__ValueAssignment_1"
    // InternalMyLanguage.g:7815:1: rule__HOUR__ValueAssignment_1 : ( rulePositiveDouble ) ;
    public final void rule__HOUR__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7819:1: ( ( rulePositiveDouble ) )
            // InternalMyLanguage.g:7820:2: ( rulePositiveDouble )
            {
            // InternalMyLanguage.g:7820:2: ( rulePositiveDouble )
            // InternalMyLanguage.g:7821:3: rulePositiveDouble
            {
             before(grammarAccess.getHOURAccess().getValuePositiveDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositiveDouble();

            state._fsp--;

             after(grammarAccess.getHOURAccess().getValuePositiveDoubleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__HOUR__ValueAssignment_1"


    // $ANTLR start "rule__MINUTES__ValueAssignment_1"
    // InternalMyLanguage.g:7830:1: rule__MINUTES__ValueAssignment_1 : ( rulePositiveDouble ) ;
    public final void rule__MINUTES__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7834:1: ( ( rulePositiveDouble ) )
            // InternalMyLanguage.g:7835:2: ( rulePositiveDouble )
            {
            // InternalMyLanguage.g:7835:2: ( rulePositiveDouble )
            // InternalMyLanguage.g:7836:3: rulePositiveDouble
            {
             before(grammarAccess.getMINUTESAccess().getValuePositiveDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositiveDouble();

            state._fsp--;

             after(grammarAccess.getMINUTESAccess().getValuePositiveDoubleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MINUTES__ValueAssignment_1"


    // $ANTLR start "rule__METER__ValueAssignment_1"
    // InternalMyLanguage.g:7845:1: rule__METER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__METER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7849:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7850:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7850:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7851:3: ruleDOUBLE
            {
             before(grammarAccess.getMETERAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMETERAccess().getValueDOUBLEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__METER__ValueAssignment_1"


    // $ANTLR start "rule__CENTIMETER__ValueAssignment_1"
    // InternalMyLanguage.g:7860:1: rule__CENTIMETER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__CENTIMETER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7864:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7865:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7865:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7866:3: ruleDOUBLE
            {
             before(grammarAccess.getCENTIMETERAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getCENTIMETERAccess().getValueDOUBLEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CENTIMETER__ValueAssignment_1"


    // $ANTLR start "rule__MILLIMETER__ValueAssignment_1"
    // InternalMyLanguage.g:7875:1: rule__MILLIMETER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__MILLIMETER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7879:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7880:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7880:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7881:3: ruleDOUBLE
            {
             before(grammarAccess.getMILLIMETERAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMILLIMETERAccess().getValueDOUBLEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MILLIMETER__ValueAssignment_1"


    // $ANTLR start "rule__KILOMETER__ValueAssignment_1"
    // InternalMyLanguage.g:7890:1: rule__KILOMETER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__KILOMETER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7894:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7895:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7895:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7896:3: ruleDOUBLE
            {
             before(grammarAccess.getKILOMETERAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getKILOMETERAccess().getValueDOUBLEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__KILOMETER__ValueAssignment_1"


    // $ANTLR start "rule__PercentUnit__ValueAssignment_1"
    // InternalMyLanguage.g:7905:1: rule__PercentUnit__ValueAssignment_1 : ( rulePositiveDouble ) ;
    public final void rule__PercentUnit__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7909:1: ( ( rulePositiveDouble ) )
            // InternalMyLanguage.g:7910:2: ( rulePositiveDouble )
            {
            // InternalMyLanguage.g:7910:2: ( rulePositiveDouble )
            // InternalMyLanguage.g:7911:3: rulePositiveDouble
            {
             before(grammarAccess.getPercentUnitAccess().getValuePositiveDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositiveDouble();

            state._fsp--;

             after(grammarAccess.getPercentUnitAccess().getValuePositiveDoubleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PercentUnit__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00049412A0000000L,0x0000000000040008L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000148000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0B00000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000448000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000680L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080048000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0003000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x1028200000000000L,0x0000000000080024L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});

}