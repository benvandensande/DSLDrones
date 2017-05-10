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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ON'", "'OFF'", "'ACTIVE'", "'UNACTIVE'", "'PAUSED'", "'SAFE'", "'UNSAFE'", "'WARNING'", "'CRITICAL'", "'motor'", "'camera'", "'GPS'", "'battery'", "'barometer'", "'scanner'", "'sonar'", "'autopilot'", "'Test:'", "'Description:'", "'Given:'", "'Then:'", "'When:'", "'Sonar'", "'distancereading'", "'is'", "'status'", "'sent'", "'Time'", "'interval'", "'in'", "'['", "','", "']'", "'Battery'", "'level'", "'Person'", "'position'", "'number'", "'Mission'", "'goal'", "'missionsafety'", "'Robot'", "'used'", "'as'", "'redundant'", "'component'", "'drops'", "'distance'", "'to'", "'obstacles'", "'equal'", "'lower'", "'then'", "'greater'", "'state'", "'within'", "'circle'", "'with'", "'radius'", "'sphere'", "'speed'", "'Environment'", "'windspeed'", "'fails'", "'collisionrisk'", "'tolerance'", "'seconds('", "')'", "'hours('", "'minutes('", "'meter('", "'centimeter('", "'millimeter('", "'kilometer('", "'percent('", "'-'", "'.'", "'Notification'", "'payload'"
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
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
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

                if ( (LA1_0==28) ) {
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


    // $ANTLR start "entryRuleSonarSent"
    // InternalMyLanguage.g:228:1: entryRuleSonarSent : ruleSonarSent EOF ;
    public final void entryRuleSonarSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:229:1: ( ruleSonarSent EOF )
            // InternalMyLanguage.g:230:1: ruleSonarSent EOF
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
    // InternalMyLanguage.g:237:1: ruleSonarSent : ( ( rule__SonarSent__Group__0 ) ) ;
    public final void ruleSonarSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:241:2: ( ( ( rule__SonarSent__Group__0 ) ) )
            // InternalMyLanguage.g:242:2: ( ( rule__SonarSent__Group__0 ) )
            {
            // InternalMyLanguage.g:242:2: ( ( rule__SonarSent__Group__0 ) )
            // InternalMyLanguage.g:243:3: ( rule__SonarSent__Group__0 )
            {
             before(grammarAccess.getSonarSentAccess().getGroup()); 
            // InternalMyLanguage.g:244:3: ( rule__SonarSent__Group__0 )
            // InternalMyLanguage.g:244:4: rule__SonarSent__Group__0
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


    // $ANTLR start "entryRuleNotificationSent"
    // InternalMyLanguage.g:253:1: entryRuleNotificationSent : ruleNotificationSent EOF ;
    public final void entryRuleNotificationSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:254:1: ( ruleNotificationSent EOF )
            // InternalMyLanguage.g:255:1: ruleNotificationSent EOF
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
    // InternalMyLanguage.g:262:1: ruleNotificationSent : ( ( rule__NotificationSent__Group__0 ) ) ;
    public final void ruleNotificationSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:266:2: ( ( ( rule__NotificationSent__Group__0 ) ) )
            // InternalMyLanguage.g:267:2: ( ( rule__NotificationSent__Group__0 ) )
            {
            // InternalMyLanguage.g:267:2: ( ( rule__NotificationSent__Group__0 ) )
            // InternalMyLanguage.g:268:3: ( rule__NotificationSent__Group__0 )
            {
             before(grammarAccess.getNotificationSentAccess().getGroup()); 
            // InternalMyLanguage.g:269:3: ( rule__NotificationSent__Group__0 )
            // InternalMyLanguage.g:269:4: rule__NotificationSent__Group__0
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
    // InternalMyLanguage.g:278:1: entryRuleTimeSent : ruleTimeSent EOF ;
    public final void entryRuleTimeSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:279:1: ( ruleTimeSent EOF )
            // InternalMyLanguage.g:280:1: ruleTimeSent EOF
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
    // InternalMyLanguage.g:287:1: ruleTimeSent : ( ( rule__TimeSent__Group__0 ) ) ;
    public final void ruleTimeSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:291:2: ( ( ( rule__TimeSent__Group__0 ) ) )
            // InternalMyLanguage.g:292:2: ( ( rule__TimeSent__Group__0 ) )
            {
            // InternalMyLanguage.g:292:2: ( ( rule__TimeSent__Group__0 ) )
            // InternalMyLanguage.g:293:3: ( rule__TimeSent__Group__0 )
            {
             before(grammarAccess.getTimeSentAccess().getGroup()); 
            // InternalMyLanguage.g:294:3: ( rule__TimeSent__Group__0 )
            // InternalMyLanguage.g:294:4: rule__TimeSent__Group__0
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
    // InternalMyLanguage.g:303:1: entryRuleTimeInterval : ruleTimeInterval EOF ;
    public final void entryRuleTimeInterval() throws RecognitionException {
        try {
            // InternalMyLanguage.g:304:1: ( ruleTimeInterval EOF )
            // InternalMyLanguage.g:305:1: ruleTimeInterval EOF
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
    // InternalMyLanguage.g:312:1: ruleTimeInterval : ( ( rule__TimeInterval__Group__0 ) ) ;
    public final void ruleTimeInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:316:2: ( ( ( rule__TimeInterval__Group__0 ) ) )
            // InternalMyLanguage.g:317:2: ( ( rule__TimeInterval__Group__0 ) )
            {
            // InternalMyLanguage.g:317:2: ( ( rule__TimeInterval__Group__0 ) )
            // InternalMyLanguage.g:318:3: ( rule__TimeInterval__Group__0 )
            {
             before(grammarAccess.getTimeIntervalAccess().getGroup()); 
            // InternalMyLanguage.g:319:3: ( rule__TimeInterval__Group__0 )
            // InternalMyLanguage.g:319:4: rule__TimeInterval__Group__0
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
    // InternalMyLanguage.g:328:1: entryRuleBatterySent : ruleBatterySent EOF ;
    public final void entryRuleBatterySent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:329:1: ( ruleBatterySent EOF )
            // InternalMyLanguage.g:330:1: ruleBatterySent EOF
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
    // InternalMyLanguage.g:337:1: ruleBatterySent : ( ( rule__BatterySent__Group__0 ) ) ;
    public final void ruleBatterySent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:341:2: ( ( ( rule__BatterySent__Group__0 ) ) )
            // InternalMyLanguage.g:342:2: ( ( rule__BatterySent__Group__0 ) )
            {
            // InternalMyLanguage.g:342:2: ( ( rule__BatterySent__Group__0 ) )
            // InternalMyLanguage.g:343:3: ( rule__BatterySent__Group__0 )
            {
             before(grammarAccess.getBatterySentAccess().getGroup()); 
            // InternalMyLanguage.g:344:3: ( rule__BatterySent__Group__0 )
            // InternalMyLanguage.g:344:4: rule__BatterySent__Group__0
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


    // $ANTLR start "entryRulePeopleSent"
    // InternalMyLanguage.g:353:1: entryRulePeopleSent : rulePeopleSent EOF ;
    public final void entryRulePeopleSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:354:1: ( rulePeopleSent EOF )
            // InternalMyLanguage.g:355:1: rulePeopleSent EOF
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
    // InternalMyLanguage.g:362:1: rulePeopleSent : ( ( rule__PeopleSent__Group__0 ) ) ;
    public final void rulePeopleSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:366:2: ( ( ( rule__PeopleSent__Group__0 ) ) )
            // InternalMyLanguage.g:367:2: ( ( rule__PeopleSent__Group__0 ) )
            {
            // InternalMyLanguage.g:367:2: ( ( rule__PeopleSent__Group__0 ) )
            // InternalMyLanguage.g:368:3: ( rule__PeopleSent__Group__0 )
            {
             before(grammarAccess.getPeopleSentAccess().getGroup()); 
            // InternalMyLanguage.g:369:3: ( rule__PeopleSent__Group__0 )
            // InternalMyLanguage.g:369:4: rule__PeopleSent__Group__0
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
    // InternalMyLanguage.g:378:1: entryRulePeoplePosSent : rulePeoplePosSent EOF ;
    public final void entryRulePeoplePosSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:379:1: ( rulePeoplePosSent EOF )
            // InternalMyLanguage.g:380:1: rulePeoplePosSent EOF
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
    // InternalMyLanguage.g:387:1: rulePeoplePosSent : ( ( rule__PeoplePosSent__Group__0 ) ) ;
    public final void rulePeoplePosSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:391:2: ( ( ( rule__PeoplePosSent__Group__0 ) ) )
            // InternalMyLanguage.g:392:2: ( ( rule__PeoplePosSent__Group__0 ) )
            {
            // InternalMyLanguage.g:392:2: ( ( rule__PeoplePosSent__Group__0 ) )
            // InternalMyLanguage.g:393:3: ( rule__PeoplePosSent__Group__0 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getGroup()); 
            // InternalMyLanguage.g:394:3: ( rule__PeoplePosSent__Group__0 )
            // InternalMyLanguage.g:394:4: rule__PeoplePosSent__Group__0
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
    // InternalMyLanguage.g:403:1: entryRulePeopleNumbSent : rulePeopleNumbSent EOF ;
    public final void entryRulePeopleNumbSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:404:1: ( rulePeopleNumbSent EOF )
            // InternalMyLanguage.g:405:1: rulePeopleNumbSent EOF
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
    // InternalMyLanguage.g:412:1: rulePeopleNumbSent : ( ( rule__PeopleNumbSent__Group__0 ) ) ;
    public final void rulePeopleNumbSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:416:2: ( ( ( rule__PeopleNumbSent__Group__0 ) ) )
            // InternalMyLanguage.g:417:2: ( ( rule__PeopleNumbSent__Group__0 ) )
            {
            // InternalMyLanguage.g:417:2: ( ( rule__PeopleNumbSent__Group__0 ) )
            // InternalMyLanguage.g:418:3: ( rule__PeopleNumbSent__Group__0 )
            {
             before(grammarAccess.getPeopleNumbSentAccess().getGroup()); 
            // InternalMyLanguage.g:419:3: ( rule__PeopleNumbSent__Group__0 )
            // InternalMyLanguage.g:419:4: rule__PeopleNumbSent__Group__0
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
    // InternalMyLanguage.g:428:1: entryRuleMissionSent : ruleMissionSent EOF ;
    public final void entryRuleMissionSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:429:1: ( ruleMissionSent EOF )
            // InternalMyLanguage.g:430:1: ruleMissionSent EOF
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
    // InternalMyLanguage.g:437:1: ruleMissionSent : ( ( rule__MissionSent__Group__0 ) ) ;
    public final void ruleMissionSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:441:2: ( ( ( rule__MissionSent__Group__0 ) ) )
            // InternalMyLanguage.g:442:2: ( ( rule__MissionSent__Group__0 ) )
            {
            // InternalMyLanguage.g:442:2: ( ( rule__MissionSent__Group__0 ) )
            // InternalMyLanguage.g:443:3: ( rule__MissionSent__Group__0 )
            {
             before(grammarAccess.getMissionSentAccess().getGroup()); 
            // InternalMyLanguage.g:444:3: ( rule__MissionSent__Group__0 )
            // InternalMyLanguage.g:444:4: rule__MissionSent__Group__0
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
    // InternalMyLanguage.g:453:1: entryRuleMissionGoalSent : ruleMissionGoalSent EOF ;
    public final void entryRuleMissionGoalSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:454:1: ( ruleMissionGoalSent EOF )
            // InternalMyLanguage.g:455:1: ruleMissionGoalSent EOF
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
    // InternalMyLanguage.g:462:1: ruleMissionGoalSent : ( ( rule__MissionGoalSent__Group__0 ) ) ;
    public final void ruleMissionGoalSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:466:2: ( ( ( rule__MissionGoalSent__Group__0 ) ) )
            // InternalMyLanguage.g:467:2: ( ( rule__MissionGoalSent__Group__0 ) )
            {
            // InternalMyLanguage.g:467:2: ( ( rule__MissionGoalSent__Group__0 ) )
            // InternalMyLanguage.g:468:3: ( rule__MissionGoalSent__Group__0 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getGroup()); 
            // InternalMyLanguage.g:469:3: ( rule__MissionGoalSent__Group__0 )
            // InternalMyLanguage.g:469:4: rule__MissionGoalSent__Group__0
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
    // InternalMyLanguage.g:478:1: entryRuleMissionRiskLevelSent : ruleMissionRiskLevelSent EOF ;
    public final void entryRuleMissionRiskLevelSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:479:1: ( ruleMissionRiskLevelSent EOF )
            // InternalMyLanguage.g:480:1: ruleMissionRiskLevelSent EOF
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
    // InternalMyLanguage.g:487:1: ruleMissionRiskLevelSent : ( ( rule__MissionRiskLevelSent__Group__0 ) ) ;
    public final void ruleMissionRiskLevelSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:491:2: ( ( ( rule__MissionRiskLevelSent__Group__0 ) ) )
            // InternalMyLanguage.g:492:2: ( ( rule__MissionRiskLevelSent__Group__0 ) )
            {
            // InternalMyLanguage.g:492:2: ( ( rule__MissionRiskLevelSent__Group__0 ) )
            // InternalMyLanguage.g:493:3: ( rule__MissionRiskLevelSent__Group__0 )
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getGroup()); 
            // InternalMyLanguage.g:494:3: ( rule__MissionRiskLevelSent__Group__0 )
            // InternalMyLanguage.g:494:4: rule__MissionRiskLevelSent__Group__0
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
    // InternalMyLanguage.g:503:1: entryRuleMissionStatusSent : ruleMissionStatusSent EOF ;
    public final void entryRuleMissionStatusSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:504:1: ( ruleMissionStatusSent EOF )
            // InternalMyLanguage.g:505:1: ruleMissionStatusSent EOF
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
    // InternalMyLanguage.g:512:1: ruleMissionStatusSent : ( ( rule__MissionStatusSent__Group__0 ) ) ;
    public final void ruleMissionStatusSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:516:2: ( ( ( rule__MissionStatusSent__Group__0 ) ) )
            // InternalMyLanguage.g:517:2: ( ( rule__MissionStatusSent__Group__0 ) )
            {
            // InternalMyLanguage.g:517:2: ( ( rule__MissionStatusSent__Group__0 ) )
            // InternalMyLanguage.g:518:3: ( rule__MissionStatusSent__Group__0 )
            {
             before(grammarAccess.getMissionStatusSentAccess().getGroup()); 
            // InternalMyLanguage.g:519:3: ( rule__MissionStatusSent__Group__0 )
            // InternalMyLanguage.g:519:4: rule__MissionStatusSent__Group__0
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
    // InternalMyLanguage.g:528:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMyLanguage.g:529:1: ( ruleRobot EOF )
            // InternalMyLanguage.g:530:1: ruleRobot EOF
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
    // InternalMyLanguage.g:537:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:541:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMyLanguage.g:542:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMyLanguage.g:542:2: ( ( rule__Robot__Group__0 ) )
            // InternalMyLanguage.g:543:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMyLanguage.g:544:3: ( rule__Robot__Group__0 )
            // InternalMyLanguage.g:544:4: rule__Robot__Group__0
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
    // InternalMyLanguage.g:553:1: entryRuleRobotAutoPilot : ruleRobotAutoPilot EOF ;
    public final void entryRuleRobotAutoPilot() throws RecognitionException {
        try {
            // InternalMyLanguage.g:554:1: ( ruleRobotAutoPilot EOF )
            // InternalMyLanguage.g:555:1: ruleRobotAutoPilot EOF
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
    // InternalMyLanguage.g:562:1: ruleRobotAutoPilot : ( ( rule__RobotAutoPilot__Group__0 ) ) ;
    public final void ruleRobotAutoPilot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:566:2: ( ( ( rule__RobotAutoPilot__Group__0 ) ) )
            // InternalMyLanguage.g:567:2: ( ( rule__RobotAutoPilot__Group__0 ) )
            {
            // InternalMyLanguage.g:567:2: ( ( rule__RobotAutoPilot__Group__0 ) )
            // InternalMyLanguage.g:568:3: ( rule__RobotAutoPilot__Group__0 )
            {
             before(grammarAccess.getRobotAutoPilotAccess().getGroup()); 
            // InternalMyLanguage.g:569:3: ( rule__RobotAutoPilot__Group__0 )
            // InternalMyLanguage.g:569:4: rule__RobotAutoPilot__Group__0
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


    // $ANTLR start "entryRuleRedundantComponent"
    // InternalMyLanguage.g:578:1: entryRuleRedundantComponent : ruleRedundantComponent EOF ;
    public final void entryRuleRedundantComponent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:579:1: ( ruleRedundantComponent EOF )
            // InternalMyLanguage.g:580:1: ruleRedundantComponent EOF
            {
             before(grammarAccess.getRedundantComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleRedundantComponent();

            state._fsp--;

             after(grammarAccess.getRedundantComponentRule()); 
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
    // $ANTLR end "entryRuleRedundantComponent"


    // $ANTLR start "ruleRedundantComponent"
    // InternalMyLanguage.g:587:1: ruleRedundantComponent : ( ( rule__RedundantComponent__Group__0 ) ) ;
    public final void ruleRedundantComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:591:2: ( ( ( rule__RedundantComponent__Group__0 ) ) )
            // InternalMyLanguage.g:592:2: ( ( rule__RedundantComponent__Group__0 ) )
            {
            // InternalMyLanguage.g:592:2: ( ( rule__RedundantComponent__Group__0 ) )
            // InternalMyLanguage.g:593:3: ( rule__RedundantComponent__Group__0 )
            {
             before(grammarAccess.getRedundantComponentAccess().getGroup()); 
            // InternalMyLanguage.g:594:3: ( rule__RedundantComponent__Group__0 )
            // InternalMyLanguage.g:594:4: rule__RedundantComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RedundantComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRedundantComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRedundantComponent"


    // $ANTLR start "entryRulePayloadSent"
    // InternalMyLanguage.g:603:1: entryRulePayloadSent : rulePayloadSent EOF ;
    public final void entryRulePayloadSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:604:1: ( rulePayloadSent EOF )
            // InternalMyLanguage.g:605:1: rulePayloadSent EOF
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
    // InternalMyLanguage.g:612:1: rulePayloadSent : ( ( rule__PayloadSent__Group__0 ) ) ;
    public final void rulePayloadSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:616:2: ( ( ( rule__PayloadSent__Group__0 ) ) )
            // InternalMyLanguage.g:617:2: ( ( rule__PayloadSent__Group__0 ) )
            {
            // InternalMyLanguage.g:617:2: ( ( rule__PayloadSent__Group__0 ) )
            // InternalMyLanguage.g:618:3: ( rule__PayloadSent__Group__0 )
            {
             before(grammarAccess.getPayloadSentAccess().getGroup()); 
            // InternalMyLanguage.g:619:3: ( rule__PayloadSent__Group__0 )
            // InternalMyLanguage.g:619:4: rule__PayloadSent__Group__0
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
    // InternalMyLanguage.g:628:1: entryRuleRobotDistanceSent : ruleRobotDistanceSent EOF ;
    public final void entryRuleRobotDistanceSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:629:1: ( ruleRobotDistanceSent EOF )
            // InternalMyLanguage.g:630:1: ruleRobotDistanceSent EOF
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
    // InternalMyLanguage.g:637:1: ruleRobotDistanceSent : ( ( rule__RobotDistanceSent__Group__0 ) ) ;
    public final void ruleRobotDistanceSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:641:2: ( ( ( rule__RobotDistanceSent__Group__0 ) ) )
            // InternalMyLanguage.g:642:2: ( ( rule__RobotDistanceSent__Group__0 ) )
            {
            // InternalMyLanguage.g:642:2: ( ( rule__RobotDistanceSent__Group__0 ) )
            // InternalMyLanguage.g:643:3: ( rule__RobotDistanceSent__Group__0 )
            {
             before(grammarAccess.getRobotDistanceSentAccess().getGroup()); 
            // InternalMyLanguage.g:644:3: ( rule__RobotDistanceSent__Group__0 )
            // InternalMyLanguage.g:644:4: rule__RobotDistanceSent__Group__0
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
    // InternalMyLanguage.g:653:1: entryRuleDistanceToLocationSent : ruleDistanceToLocationSent EOF ;
    public final void entryRuleDistanceToLocationSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:654:1: ( ruleDistanceToLocationSent EOF )
            // InternalMyLanguage.g:655:1: ruleDistanceToLocationSent EOF
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
    // InternalMyLanguage.g:662:1: ruleDistanceToLocationSent : ( ( rule__DistanceToLocationSent__Group__0 ) ) ;
    public final void ruleDistanceToLocationSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:666:2: ( ( ( rule__DistanceToLocationSent__Group__0 ) ) )
            // InternalMyLanguage.g:667:2: ( ( rule__DistanceToLocationSent__Group__0 ) )
            {
            // InternalMyLanguage.g:667:2: ( ( rule__DistanceToLocationSent__Group__0 ) )
            // InternalMyLanguage.g:668:3: ( rule__DistanceToLocationSent__Group__0 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getGroup()); 
            // InternalMyLanguage.g:669:3: ( rule__DistanceToLocationSent__Group__0 )
            // InternalMyLanguage.g:669:4: rule__DistanceToLocationSent__Group__0
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
    // InternalMyLanguage.g:678:1: entryRuleDistanceToObstaclesSent : ruleDistanceToObstaclesSent EOF ;
    public final void entryRuleDistanceToObstaclesSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:679:1: ( ruleDistanceToObstaclesSent EOF )
            // InternalMyLanguage.g:680:1: ruleDistanceToObstaclesSent EOF
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
    // InternalMyLanguage.g:687:1: ruleDistanceToObstaclesSent : ( ( rule__DistanceToObstaclesSent__Group__0 ) ) ;
    public final void ruleDistanceToObstaclesSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:691:2: ( ( ( rule__DistanceToObstaclesSent__Group__0 ) ) )
            // InternalMyLanguage.g:692:2: ( ( rule__DistanceToObstaclesSent__Group__0 ) )
            {
            // InternalMyLanguage.g:692:2: ( ( rule__DistanceToObstaclesSent__Group__0 ) )
            // InternalMyLanguage.g:693:3: ( rule__DistanceToObstaclesSent__Group__0 )
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getGroup()); 
            // InternalMyLanguage.g:694:3: ( rule__DistanceToObstaclesSent__Group__0 )
            // InternalMyLanguage.g:694:4: rule__DistanceToObstaclesSent__Group__0
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
    // InternalMyLanguage.g:703:1: entryRuleEqualSent : ruleEqualSent EOF ;
    public final void entryRuleEqualSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:704:1: ( ruleEqualSent EOF )
            // InternalMyLanguage.g:705:1: ruleEqualSent EOF
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
    // InternalMyLanguage.g:712:1: ruleEqualSent : ( ( rule__EqualSent__Group__0 ) ) ;
    public final void ruleEqualSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:716:2: ( ( ( rule__EqualSent__Group__0 ) ) )
            // InternalMyLanguage.g:717:2: ( ( rule__EqualSent__Group__0 ) )
            {
            // InternalMyLanguage.g:717:2: ( ( rule__EqualSent__Group__0 ) )
            // InternalMyLanguage.g:718:3: ( rule__EqualSent__Group__0 )
            {
             before(grammarAccess.getEqualSentAccess().getGroup()); 
            // InternalMyLanguage.g:719:3: ( rule__EqualSent__Group__0 )
            // InternalMyLanguage.g:719:4: rule__EqualSent__Group__0
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
    // InternalMyLanguage.g:728:1: entryRuleLessSent : ruleLessSent EOF ;
    public final void entryRuleLessSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:729:1: ( ruleLessSent EOF )
            // InternalMyLanguage.g:730:1: ruleLessSent EOF
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
    // InternalMyLanguage.g:737:1: ruleLessSent : ( ( rule__LessSent__Group__0 ) ) ;
    public final void ruleLessSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:741:2: ( ( ( rule__LessSent__Group__0 ) ) )
            // InternalMyLanguage.g:742:2: ( ( rule__LessSent__Group__0 ) )
            {
            // InternalMyLanguage.g:742:2: ( ( rule__LessSent__Group__0 ) )
            // InternalMyLanguage.g:743:3: ( rule__LessSent__Group__0 )
            {
             before(grammarAccess.getLessSentAccess().getGroup()); 
            // InternalMyLanguage.g:744:3: ( rule__LessSent__Group__0 )
            // InternalMyLanguage.g:744:4: rule__LessSent__Group__0
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
    // InternalMyLanguage.g:753:1: entryRuleGreaterSent : ruleGreaterSent EOF ;
    public final void entryRuleGreaterSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:754:1: ( ruleGreaterSent EOF )
            // InternalMyLanguage.g:755:1: ruleGreaterSent EOF
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
    // InternalMyLanguage.g:762:1: ruleGreaterSent : ( ( rule__GreaterSent__Group__0 ) ) ;
    public final void ruleGreaterSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:766:2: ( ( ( rule__GreaterSent__Group__0 ) ) )
            // InternalMyLanguage.g:767:2: ( ( rule__GreaterSent__Group__0 ) )
            {
            // InternalMyLanguage.g:767:2: ( ( rule__GreaterSent__Group__0 ) )
            // InternalMyLanguage.g:768:3: ( rule__GreaterSent__Group__0 )
            {
             before(grammarAccess.getGreaterSentAccess().getGroup()); 
            // InternalMyLanguage.g:769:3: ( rule__GreaterSent__Group__0 )
            // InternalMyLanguage.g:769:4: rule__GreaterSent__Group__0
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
    // InternalMyLanguage.g:778:1: entryRuleRobotStateSent : ruleRobotStateSent EOF ;
    public final void entryRuleRobotStateSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:779:1: ( ruleRobotStateSent EOF )
            // InternalMyLanguage.g:780:1: ruleRobotStateSent EOF
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
    // InternalMyLanguage.g:787:1: ruleRobotStateSent : ( ( rule__RobotStateSent__Group__0 ) ) ;
    public final void ruleRobotStateSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:791:2: ( ( ( rule__RobotStateSent__Group__0 ) ) )
            // InternalMyLanguage.g:792:2: ( ( rule__RobotStateSent__Group__0 ) )
            {
            // InternalMyLanguage.g:792:2: ( ( rule__RobotStateSent__Group__0 ) )
            // InternalMyLanguage.g:793:3: ( rule__RobotStateSent__Group__0 )
            {
             before(grammarAccess.getRobotStateSentAccess().getGroup()); 
            // InternalMyLanguage.g:794:3: ( rule__RobotStateSent__Group__0 )
            // InternalMyLanguage.g:794:4: rule__RobotStateSent__Group__0
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
    // InternalMyLanguage.g:803:1: entryRuleRobotPositionSent : ruleRobotPositionSent EOF ;
    public final void entryRuleRobotPositionSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:804:1: ( ruleRobotPositionSent EOF )
            // InternalMyLanguage.g:805:1: ruleRobotPositionSent EOF
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
    // InternalMyLanguage.g:812:1: ruleRobotPositionSent : ( ( rule__RobotPositionSent__Group__0 ) ) ;
    public final void ruleRobotPositionSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:816:2: ( ( ( rule__RobotPositionSent__Group__0 ) ) )
            // InternalMyLanguage.g:817:2: ( ( rule__RobotPositionSent__Group__0 ) )
            {
            // InternalMyLanguage.g:817:2: ( ( rule__RobotPositionSent__Group__0 ) )
            // InternalMyLanguage.g:818:3: ( rule__RobotPositionSent__Group__0 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getGroup()); 
            // InternalMyLanguage.g:819:3: ( rule__RobotPositionSent__Group__0 )
            // InternalMyLanguage.g:819:4: rule__RobotPositionSent__Group__0
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
    // InternalMyLanguage.g:828:1: entryRuleCirclePosition : ruleCirclePosition EOF ;
    public final void entryRuleCirclePosition() throws RecognitionException {
        try {
            // InternalMyLanguage.g:829:1: ( ruleCirclePosition EOF )
            // InternalMyLanguage.g:830:1: ruleCirclePosition EOF
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
    // InternalMyLanguage.g:837:1: ruleCirclePosition : ( ( rule__CirclePosition__Group__0 ) ) ;
    public final void ruleCirclePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:841:2: ( ( ( rule__CirclePosition__Group__0 ) ) )
            // InternalMyLanguage.g:842:2: ( ( rule__CirclePosition__Group__0 ) )
            {
            // InternalMyLanguage.g:842:2: ( ( rule__CirclePosition__Group__0 ) )
            // InternalMyLanguage.g:843:3: ( rule__CirclePosition__Group__0 )
            {
             before(grammarAccess.getCirclePositionAccess().getGroup()); 
            // InternalMyLanguage.g:844:3: ( rule__CirclePosition__Group__0 )
            // InternalMyLanguage.g:844:4: rule__CirclePosition__Group__0
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
    // InternalMyLanguage.g:853:1: entryRuleSpherePosition : ruleSpherePosition EOF ;
    public final void entryRuleSpherePosition() throws RecognitionException {
        try {
            // InternalMyLanguage.g:854:1: ( ruleSpherePosition EOF )
            // InternalMyLanguage.g:855:1: ruleSpherePosition EOF
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
    // InternalMyLanguage.g:862:1: ruleSpherePosition : ( ( rule__SpherePosition__Group__0 ) ) ;
    public final void ruleSpherePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:866:2: ( ( ( rule__SpherePosition__Group__0 ) ) )
            // InternalMyLanguage.g:867:2: ( ( rule__SpherePosition__Group__0 ) )
            {
            // InternalMyLanguage.g:867:2: ( ( rule__SpherePosition__Group__0 ) )
            // InternalMyLanguage.g:868:3: ( rule__SpherePosition__Group__0 )
            {
             before(grammarAccess.getSpherePositionAccess().getGroup()); 
            // InternalMyLanguage.g:869:3: ( rule__SpherePosition__Group__0 )
            // InternalMyLanguage.g:869:4: rule__SpherePosition__Group__0
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
    // InternalMyLanguage.g:878:1: entryRuleRobotSpeedSent : ruleRobotSpeedSent EOF ;
    public final void entryRuleRobotSpeedSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:879:1: ( ruleRobotSpeedSent EOF )
            // InternalMyLanguage.g:880:1: ruleRobotSpeedSent EOF
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
    // InternalMyLanguage.g:887:1: ruleRobotSpeedSent : ( ( rule__RobotSpeedSent__Group__0 ) ) ;
    public final void ruleRobotSpeedSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:891:2: ( ( ( rule__RobotSpeedSent__Group__0 ) ) )
            // InternalMyLanguage.g:892:2: ( ( rule__RobotSpeedSent__Group__0 ) )
            {
            // InternalMyLanguage.g:892:2: ( ( rule__RobotSpeedSent__Group__0 ) )
            // InternalMyLanguage.g:893:3: ( rule__RobotSpeedSent__Group__0 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getGroup()); 
            // InternalMyLanguage.g:894:3: ( rule__RobotSpeedSent__Group__0 )
            // InternalMyLanguage.g:894:4: rule__RobotSpeedSent__Group__0
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
    // InternalMyLanguage.g:903:1: entryRuleEnvironmentSent : ruleEnvironmentSent EOF ;
    public final void entryRuleEnvironmentSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:904:1: ( ruleEnvironmentSent EOF )
            // InternalMyLanguage.g:905:1: ruleEnvironmentSent EOF
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
    // InternalMyLanguage.g:912:1: ruleEnvironmentSent : ( ( rule__EnvironmentSent__Group__0 ) ) ;
    public final void ruleEnvironmentSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:916:2: ( ( ( rule__EnvironmentSent__Group__0 ) ) )
            // InternalMyLanguage.g:917:2: ( ( rule__EnvironmentSent__Group__0 ) )
            {
            // InternalMyLanguage.g:917:2: ( ( rule__EnvironmentSent__Group__0 ) )
            // InternalMyLanguage.g:918:3: ( rule__EnvironmentSent__Group__0 )
            {
             before(grammarAccess.getEnvironmentSentAccess().getGroup()); 
            // InternalMyLanguage.g:919:3: ( rule__EnvironmentSent__Group__0 )
            // InternalMyLanguage.g:919:4: rule__EnvironmentSent__Group__0
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


    // $ANTLR start "entryRuleFailingComponentSent"
    // InternalMyLanguage.g:928:1: entryRuleFailingComponentSent : ruleFailingComponentSent EOF ;
    public final void entryRuleFailingComponentSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:929:1: ( ruleFailingComponentSent EOF )
            // InternalMyLanguage.g:930:1: ruleFailingComponentSent EOF
            {
             before(grammarAccess.getFailingComponentSentRule()); 
            pushFollow(FOLLOW_1);
            ruleFailingComponentSent();

            state._fsp--;

             after(grammarAccess.getFailingComponentSentRule()); 
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
    // $ANTLR end "entryRuleFailingComponentSent"


    // $ANTLR start "ruleFailingComponentSent"
    // InternalMyLanguage.g:937:1: ruleFailingComponentSent : ( ( rule__FailingComponentSent__Group__0 ) ) ;
    public final void ruleFailingComponentSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:941:2: ( ( ( rule__FailingComponentSent__Group__0 ) ) )
            // InternalMyLanguage.g:942:2: ( ( rule__FailingComponentSent__Group__0 ) )
            {
            // InternalMyLanguage.g:942:2: ( ( rule__FailingComponentSent__Group__0 ) )
            // InternalMyLanguage.g:943:3: ( rule__FailingComponentSent__Group__0 )
            {
             before(grammarAccess.getFailingComponentSentAccess().getGroup()); 
            // InternalMyLanguage.g:944:3: ( rule__FailingComponentSent__Group__0 )
            // InternalMyLanguage.g:944:4: rule__FailingComponentSent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FailingComponentSent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFailingComponentSentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFailingComponentSent"


    // $ANTLR start "entryRuleRiskSent"
    // InternalMyLanguage.g:953:1: entryRuleRiskSent : ruleRiskSent EOF ;
    public final void entryRuleRiskSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:954:1: ( ruleRiskSent EOF )
            // InternalMyLanguage.g:955:1: ruleRiskSent EOF
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
    // InternalMyLanguage.g:962:1: ruleRiskSent : ( ( rule__RiskSent__Group__0 ) ) ;
    public final void ruleRiskSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:966:2: ( ( ( rule__RiskSent__Group__0 ) ) )
            // InternalMyLanguage.g:967:2: ( ( rule__RiskSent__Group__0 ) )
            {
            // InternalMyLanguage.g:967:2: ( ( rule__RiskSent__Group__0 ) )
            // InternalMyLanguage.g:968:3: ( rule__RiskSent__Group__0 )
            {
             before(grammarAccess.getRiskSentAccess().getGroup()); 
            // InternalMyLanguage.g:969:3: ( rule__RiskSent__Group__0 )
            // InternalMyLanguage.g:969:4: rule__RiskSent__Group__0
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
    // InternalMyLanguage.g:978:1: entryRuleToleranceSent : ruleToleranceSent EOF ;
    public final void entryRuleToleranceSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:979:1: ( ruleToleranceSent EOF )
            // InternalMyLanguage.g:980:1: ruleToleranceSent EOF
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
    // InternalMyLanguage.g:987:1: ruleToleranceSent : ( ( rule__ToleranceSent__Group__0 ) ) ;
    public final void ruleToleranceSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:991:2: ( ( ( rule__ToleranceSent__Group__0 ) ) )
            // InternalMyLanguage.g:992:2: ( ( rule__ToleranceSent__Group__0 ) )
            {
            // InternalMyLanguage.g:992:2: ( ( rule__ToleranceSent__Group__0 ) )
            // InternalMyLanguage.g:993:3: ( rule__ToleranceSent__Group__0 )
            {
             before(grammarAccess.getToleranceSentAccess().getGroup()); 
            // InternalMyLanguage.g:994:3: ( rule__ToleranceSent__Group__0 )
            // InternalMyLanguage.g:994:4: rule__ToleranceSent__Group__0
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
    // InternalMyLanguage.g:1003:1: entryRuleMISSIONSTATUS : ruleMISSIONSTATUS EOF ;
    public final void entryRuleMISSIONSTATUS() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1004:1: ( ruleMISSIONSTATUS EOF )
            // InternalMyLanguage.g:1005:1: ruleMISSIONSTATUS EOF
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
    // InternalMyLanguage.g:1012:1: ruleMISSIONSTATUS : ( ( rule__MISSIONSTATUS__Alternatives ) ) ;
    public final void ruleMISSIONSTATUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1016:2: ( ( ( rule__MISSIONSTATUS__Alternatives ) ) )
            // InternalMyLanguage.g:1017:2: ( ( rule__MISSIONSTATUS__Alternatives ) )
            {
            // InternalMyLanguage.g:1017:2: ( ( rule__MISSIONSTATUS__Alternatives ) )
            // InternalMyLanguage.g:1018:3: ( rule__MISSIONSTATUS__Alternatives )
            {
             before(grammarAccess.getMISSIONSTATUSAccess().getAlternatives()); 
            // InternalMyLanguage.g:1019:3: ( rule__MISSIONSTATUS__Alternatives )
            // InternalMyLanguage.g:1019:4: rule__MISSIONSTATUS__Alternatives
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
    // InternalMyLanguage.g:1028:1: entryRuleMISSIONRISKLEVEL : ruleMISSIONRISKLEVEL EOF ;
    public final void entryRuleMISSIONRISKLEVEL() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1029:1: ( ruleMISSIONRISKLEVEL EOF )
            // InternalMyLanguage.g:1030:1: ruleMISSIONRISKLEVEL EOF
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
    // InternalMyLanguage.g:1037:1: ruleMISSIONRISKLEVEL : ( ( rule__MISSIONRISKLEVEL__Alternatives ) ) ;
    public final void ruleMISSIONRISKLEVEL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1041:2: ( ( ( rule__MISSIONRISKLEVEL__Alternatives ) ) )
            // InternalMyLanguage.g:1042:2: ( ( rule__MISSIONRISKLEVEL__Alternatives ) )
            {
            // InternalMyLanguage.g:1042:2: ( ( rule__MISSIONRISKLEVEL__Alternatives ) )
            // InternalMyLanguage.g:1043:3: ( rule__MISSIONRISKLEVEL__Alternatives )
            {
             before(grammarAccess.getMISSIONRISKLEVELAccess().getAlternatives()); 
            // InternalMyLanguage.g:1044:3: ( rule__MISSIONRISKLEVEL__Alternatives )
            // InternalMyLanguage.g:1044:4: rule__MISSIONRISKLEVEL__Alternatives
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
    // InternalMyLanguage.g:1053:1: entryRuleCOLLISIONRISKLEVEL : ruleCOLLISIONRISKLEVEL EOF ;
    public final void entryRuleCOLLISIONRISKLEVEL() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1054:1: ( ruleCOLLISIONRISKLEVEL EOF )
            // InternalMyLanguage.g:1055:1: ruleCOLLISIONRISKLEVEL EOF
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
    // InternalMyLanguage.g:1062:1: ruleCOLLISIONRISKLEVEL : ( ( rule__COLLISIONRISKLEVEL__Alternatives ) ) ;
    public final void ruleCOLLISIONRISKLEVEL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1066:2: ( ( ( rule__COLLISIONRISKLEVEL__Alternatives ) ) )
            // InternalMyLanguage.g:1067:2: ( ( rule__COLLISIONRISKLEVEL__Alternatives ) )
            {
            // InternalMyLanguage.g:1067:2: ( ( rule__COLLISIONRISKLEVEL__Alternatives ) )
            // InternalMyLanguage.g:1068:3: ( rule__COLLISIONRISKLEVEL__Alternatives )
            {
             before(grammarAccess.getCOLLISIONRISKLEVELAccess().getAlternatives()); 
            // InternalMyLanguage.g:1069:3: ( rule__COLLISIONRISKLEVEL__Alternatives )
            // InternalMyLanguage.g:1069:4: rule__COLLISIONRISKLEVEL__Alternatives
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


    // $ANTLR start "entryRuleCOMPONENT"
    // InternalMyLanguage.g:1078:1: entryRuleCOMPONENT : ruleCOMPONENT EOF ;
    public final void entryRuleCOMPONENT() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1079:1: ( ruleCOMPONENT EOF )
            // InternalMyLanguage.g:1080:1: ruleCOMPONENT EOF
            {
             before(grammarAccess.getCOMPONENTRule()); 
            pushFollow(FOLLOW_1);
            ruleCOMPONENT();

            state._fsp--;

             after(grammarAccess.getCOMPONENTRule()); 
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
    // $ANTLR end "entryRuleCOMPONENT"


    // $ANTLR start "ruleCOMPONENT"
    // InternalMyLanguage.g:1087:1: ruleCOMPONENT : ( ( rule__COMPONENT__Alternatives ) ) ;
    public final void ruleCOMPONENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1091:2: ( ( ( rule__COMPONENT__Alternatives ) ) )
            // InternalMyLanguage.g:1092:2: ( ( rule__COMPONENT__Alternatives ) )
            {
            // InternalMyLanguage.g:1092:2: ( ( rule__COMPONENT__Alternatives ) )
            // InternalMyLanguage.g:1093:3: ( rule__COMPONENT__Alternatives )
            {
             before(grammarAccess.getCOMPONENTAccess().getAlternatives()); 
            // InternalMyLanguage.g:1094:3: ( rule__COMPONENT__Alternatives )
            // InternalMyLanguage.g:1094:4: rule__COMPONENT__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__COMPONENT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOMPONENTAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOMPONENT"


    // $ANTLR start "entryRuleDistanceUnit"
    // InternalMyLanguage.g:1103:1: entryRuleDistanceUnit : ruleDistanceUnit EOF ;
    public final void entryRuleDistanceUnit() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1104:1: ( ruleDistanceUnit EOF )
            // InternalMyLanguage.g:1105:1: ruleDistanceUnit EOF
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
    // InternalMyLanguage.g:1112:1: ruleDistanceUnit : ( ( rule__DistanceUnit__Alternatives ) ) ;
    public final void ruleDistanceUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1116:2: ( ( ( rule__DistanceUnit__Alternatives ) ) )
            // InternalMyLanguage.g:1117:2: ( ( rule__DistanceUnit__Alternatives ) )
            {
            // InternalMyLanguage.g:1117:2: ( ( rule__DistanceUnit__Alternatives ) )
            // InternalMyLanguage.g:1118:3: ( rule__DistanceUnit__Alternatives )
            {
             before(grammarAccess.getDistanceUnitAccess().getAlternatives()); 
            // InternalMyLanguage.g:1119:3: ( rule__DistanceUnit__Alternatives )
            // InternalMyLanguage.g:1119:4: rule__DistanceUnit__Alternatives
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
    // InternalMyLanguage.g:1128:1: entryRuleTimeUnit : ruleTimeUnit EOF ;
    public final void entryRuleTimeUnit() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1129:1: ( ruleTimeUnit EOF )
            // InternalMyLanguage.g:1130:1: ruleTimeUnit EOF
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
    // InternalMyLanguage.g:1137:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1141:2: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalMyLanguage.g:1142:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalMyLanguage.g:1142:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalMyLanguage.g:1143:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalMyLanguage.g:1144:3: ( rule__TimeUnit__Alternatives )
            // InternalMyLanguage.g:1144:4: rule__TimeUnit__Alternatives
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
    // InternalMyLanguage.g:1153:1: entryRuleSECONDS : ruleSECONDS EOF ;
    public final void entryRuleSECONDS() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1154:1: ( ruleSECONDS EOF )
            // InternalMyLanguage.g:1155:1: ruleSECONDS EOF
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
    // InternalMyLanguage.g:1162:1: ruleSECONDS : ( ( rule__SECONDS__Group__0 ) ) ;
    public final void ruleSECONDS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1166:2: ( ( ( rule__SECONDS__Group__0 ) ) )
            // InternalMyLanguage.g:1167:2: ( ( rule__SECONDS__Group__0 ) )
            {
            // InternalMyLanguage.g:1167:2: ( ( rule__SECONDS__Group__0 ) )
            // InternalMyLanguage.g:1168:3: ( rule__SECONDS__Group__0 )
            {
             before(grammarAccess.getSECONDSAccess().getGroup()); 
            // InternalMyLanguage.g:1169:3: ( rule__SECONDS__Group__0 )
            // InternalMyLanguage.g:1169:4: rule__SECONDS__Group__0
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
    // InternalMyLanguage.g:1178:1: entryRuleHOUR : ruleHOUR EOF ;
    public final void entryRuleHOUR() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1179:1: ( ruleHOUR EOF )
            // InternalMyLanguage.g:1180:1: ruleHOUR EOF
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
    // InternalMyLanguage.g:1187:1: ruleHOUR : ( ( rule__HOUR__Group__0 ) ) ;
    public final void ruleHOUR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1191:2: ( ( ( rule__HOUR__Group__0 ) ) )
            // InternalMyLanguage.g:1192:2: ( ( rule__HOUR__Group__0 ) )
            {
            // InternalMyLanguage.g:1192:2: ( ( rule__HOUR__Group__0 ) )
            // InternalMyLanguage.g:1193:3: ( rule__HOUR__Group__0 )
            {
             before(grammarAccess.getHOURAccess().getGroup()); 
            // InternalMyLanguage.g:1194:3: ( rule__HOUR__Group__0 )
            // InternalMyLanguage.g:1194:4: rule__HOUR__Group__0
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
    // InternalMyLanguage.g:1203:1: entryRuleMINUTES : ruleMINUTES EOF ;
    public final void entryRuleMINUTES() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1204:1: ( ruleMINUTES EOF )
            // InternalMyLanguage.g:1205:1: ruleMINUTES EOF
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
    // InternalMyLanguage.g:1212:1: ruleMINUTES : ( ( rule__MINUTES__Group__0 ) ) ;
    public final void ruleMINUTES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1216:2: ( ( ( rule__MINUTES__Group__0 ) ) )
            // InternalMyLanguage.g:1217:2: ( ( rule__MINUTES__Group__0 ) )
            {
            // InternalMyLanguage.g:1217:2: ( ( rule__MINUTES__Group__0 ) )
            // InternalMyLanguage.g:1218:3: ( rule__MINUTES__Group__0 )
            {
             before(grammarAccess.getMINUTESAccess().getGroup()); 
            // InternalMyLanguage.g:1219:3: ( rule__MINUTES__Group__0 )
            // InternalMyLanguage.g:1219:4: rule__MINUTES__Group__0
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
    // InternalMyLanguage.g:1228:1: entryRuleMETER : ruleMETER EOF ;
    public final void entryRuleMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1229:1: ( ruleMETER EOF )
            // InternalMyLanguage.g:1230:1: ruleMETER EOF
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
    // InternalMyLanguage.g:1237:1: ruleMETER : ( ( rule__METER__Group__0 ) ) ;
    public final void ruleMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1241:2: ( ( ( rule__METER__Group__0 ) ) )
            // InternalMyLanguage.g:1242:2: ( ( rule__METER__Group__0 ) )
            {
            // InternalMyLanguage.g:1242:2: ( ( rule__METER__Group__0 ) )
            // InternalMyLanguage.g:1243:3: ( rule__METER__Group__0 )
            {
             before(grammarAccess.getMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1244:3: ( rule__METER__Group__0 )
            // InternalMyLanguage.g:1244:4: rule__METER__Group__0
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
    // InternalMyLanguage.g:1253:1: entryRuleCENTIMETER : ruleCENTIMETER EOF ;
    public final void entryRuleCENTIMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1254:1: ( ruleCENTIMETER EOF )
            // InternalMyLanguage.g:1255:1: ruleCENTIMETER EOF
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
    // InternalMyLanguage.g:1262:1: ruleCENTIMETER : ( ( rule__CENTIMETER__Group__0 ) ) ;
    public final void ruleCENTIMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1266:2: ( ( ( rule__CENTIMETER__Group__0 ) ) )
            // InternalMyLanguage.g:1267:2: ( ( rule__CENTIMETER__Group__0 ) )
            {
            // InternalMyLanguage.g:1267:2: ( ( rule__CENTIMETER__Group__0 ) )
            // InternalMyLanguage.g:1268:3: ( rule__CENTIMETER__Group__0 )
            {
             before(grammarAccess.getCENTIMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1269:3: ( rule__CENTIMETER__Group__0 )
            // InternalMyLanguage.g:1269:4: rule__CENTIMETER__Group__0
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
    // InternalMyLanguage.g:1278:1: entryRuleMILLIMETER : ruleMILLIMETER EOF ;
    public final void entryRuleMILLIMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1279:1: ( ruleMILLIMETER EOF )
            // InternalMyLanguage.g:1280:1: ruleMILLIMETER EOF
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
    // InternalMyLanguage.g:1287:1: ruleMILLIMETER : ( ( rule__MILLIMETER__Group__0 ) ) ;
    public final void ruleMILLIMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1291:2: ( ( ( rule__MILLIMETER__Group__0 ) ) )
            // InternalMyLanguage.g:1292:2: ( ( rule__MILLIMETER__Group__0 ) )
            {
            // InternalMyLanguage.g:1292:2: ( ( rule__MILLIMETER__Group__0 ) )
            // InternalMyLanguage.g:1293:3: ( rule__MILLIMETER__Group__0 )
            {
             before(grammarAccess.getMILLIMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1294:3: ( rule__MILLIMETER__Group__0 )
            // InternalMyLanguage.g:1294:4: rule__MILLIMETER__Group__0
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
    // InternalMyLanguage.g:1303:1: entryRuleKILOMETER : ruleKILOMETER EOF ;
    public final void entryRuleKILOMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1304:1: ( ruleKILOMETER EOF )
            // InternalMyLanguage.g:1305:1: ruleKILOMETER EOF
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
    // InternalMyLanguage.g:1312:1: ruleKILOMETER : ( ( rule__KILOMETER__Group__0 ) ) ;
    public final void ruleKILOMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1316:2: ( ( ( rule__KILOMETER__Group__0 ) ) )
            // InternalMyLanguage.g:1317:2: ( ( rule__KILOMETER__Group__0 ) )
            {
            // InternalMyLanguage.g:1317:2: ( ( rule__KILOMETER__Group__0 ) )
            // InternalMyLanguage.g:1318:3: ( rule__KILOMETER__Group__0 )
            {
             before(grammarAccess.getKILOMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1319:3: ( rule__KILOMETER__Group__0 )
            // InternalMyLanguage.g:1319:4: rule__KILOMETER__Group__0
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
    // InternalMyLanguage.g:1328:1: entryRulePercentUnit : rulePercentUnit EOF ;
    public final void entryRulePercentUnit() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1329:1: ( rulePercentUnit EOF )
            // InternalMyLanguage.g:1330:1: rulePercentUnit EOF
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
    // InternalMyLanguage.g:1337:1: rulePercentUnit : ( ( rule__PercentUnit__Group__0 ) ) ;
    public final void rulePercentUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1341:2: ( ( ( rule__PercentUnit__Group__0 ) ) )
            // InternalMyLanguage.g:1342:2: ( ( rule__PercentUnit__Group__0 ) )
            {
            // InternalMyLanguage.g:1342:2: ( ( rule__PercentUnit__Group__0 ) )
            // InternalMyLanguage.g:1343:3: ( rule__PercentUnit__Group__0 )
            {
             before(grammarAccess.getPercentUnitAccess().getGroup()); 
            // InternalMyLanguage.g:1344:3: ( rule__PercentUnit__Group__0 )
            // InternalMyLanguage.g:1344:4: rule__PercentUnit__Group__0
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
    // InternalMyLanguage.g:1353:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1354:1: ( ruleDOUBLE EOF )
            // InternalMyLanguage.g:1355:1: ruleDOUBLE EOF
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
    // InternalMyLanguage.g:1362:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1366:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalMyLanguage.g:1367:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalMyLanguage.g:1367:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalMyLanguage.g:1368:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalMyLanguage.g:1369:3: ( rule__DOUBLE__Group__0 )
            // InternalMyLanguage.g:1369:4: rule__DOUBLE__Group__0
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyLanguage.g:1377:1: rule__Statement__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1381:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 31:
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
                    // InternalMyLanguage.g:1382:2: ( ruleGiven )
                    {
                    // InternalMyLanguage.g:1382:2: ( ruleGiven )
                    // InternalMyLanguage.g:1383:3: ruleGiven
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
                    // InternalMyLanguage.g:1388:2: ( ruleWhen )
                    {
                    // InternalMyLanguage.g:1388:2: ( ruleWhen )
                    // InternalMyLanguage.g:1389:3: ruleWhen
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
                    // InternalMyLanguage.g:1394:2: ( ruleThen )
                    {
                    // InternalMyLanguage.g:1394:2: ( ruleThen )
                    // InternalMyLanguage.g:1395:3: ruleThen
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
    // InternalMyLanguage.g:1404:1: rule__StatementBody__Alternatives : ( ( ruleRobot ) | ( ruleEnvironmentSent ) | ( ruleTimeSent ) | ( rulePeopleSent ) | ( ruleMissionSent ) | ( ruleNotificationSent ) | ( ruleBatterySent ) | ( ruleSonarSent ) );
    public final void rule__StatementBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1408:1: ( ( ruleRobot ) | ( ruleEnvironmentSent ) | ( ruleTimeSent ) | ( rulePeopleSent ) | ( ruleMissionSent ) | ( ruleNotificationSent ) | ( ruleBatterySent ) | ( ruleSonarSent ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt3=1;
                }
                break;
            case 72:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 46:
                {
                alt3=4;
                }
                break;
            case 49:
                {
                alt3=5;
                }
                break;
            case 88:
                {
                alt3=6;
                }
                break;
            case 44:
                {
                alt3=7;
                }
                break;
            case 33:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyLanguage.g:1409:2: ( ruleRobot )
                    {
                    // InternalMyLanguage.g:1409:2: ( ruleRobot )
                    // InternalMyLanguage.g:1410:3: ruleRobot
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
                    // InternalMyLanguage.g:1415:2: ( ruleEnvironmentSent )
                    {
                    // InternalMyLanguage.g:1415:2: ( ruleEnvironmentSent )
                    // InternalMyLanguage.g:1416:3: ruleEnvironmentSent
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
                    // InternalMyLanguage.g:1421:2: ( ruleTimeSent )
                    {
                    // InternalMyLanguage.g:1421:2: ( ruleTimeSent )
                    // InternalMyLanguage.g:1422:3: ruleTimeSent
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
                    // InternalMyLanguage.g:1427:2: ( rulePeopleSent )
                    {
                    // InternalMyLanguage.g:1427:2: ( rulePeopleSent )
                    // InternalMyLanguage.g:1428:3: rulePeopleSent
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
                    // InternalMyLanguage.g:1433:2: ( ruleMissionSent )
                    {
                    // InternalMyLanguage.g:1433:2: ( ruleMissionSent )
                    // InternalMyLanguage.g:1434:3: ruleMissionSent
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
                    // InternalMyLanguage.g:1439:2: ( ruleNotificationSent )
                    {
                    // InternalMyLanguage.g:1439:2: ( ruleNotificationSent )
                    // InternalMyLanguage.g:1440:3: ruleNotificationSent
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
                    // InternalMyLanguage.g:1445:2: ( ruleBatterySent )
                    {
                    // InternalMyLanguage.g:1445:2: ( ruleBatterySent )
                    // InternalMyLanguage.g:1446:3: ruleBatterySent
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
                    // InternalMyLanguage.g:1451:2: ( ruleSonarSent )
                    {
                    // InternalMyLanguage.g:1451:2: ( ruleSonarSent )
                    // InternalMyLanguage.g:1452:3: ruleSonarSent
                    {
                     before(grammarAccess.getStatementBodyAccess().getSonarSentParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSonarSent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getSonarSentParserRuleCall_7()); 

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


    // $ANTLR start "rule__SonarSent__SentAlternatives_3_0"
    // InternalMyLanguage.g:1461:1: rule__SonarSent__SentAlternatives_3_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__SonarSent__SentAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1465:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt4=1;
                }
                break;
            case 62:
                {
                alt4=2;
                }
                break;
            case 61:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyLanguage.g:1466:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1466:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1467:3: ruleGreaterSent
                    {
                     before(grammarAccess.getSonarSentAccess().getSentGreaterSentParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGreaterSent();

                    state._fsp--;

                     after(grammarAccess.getSonarSentAccess().getSentGreaterSentParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1472:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1472:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1473:3: ruleLessSent
                    {
                     before(grammarAccess.getSonarSentAccess().getSentLessSentParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLessSent();

                    state._fsp--;

                     after(grammarAccess.getSonarSentAccess().getSentLessSentParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1478:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1478:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1479:3: ruleEqualSent
                    {
                     before(grammarAccess.getSonarSentAccess().getSentEqualSentParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualSent();

                    state._fsp--;

                     after(grammarAccess.getSonarSentAccess().getSentEqualSentParserRuleCall_3_0_2()); 

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
    // $ANTLR end "rule__SonarSent__SentAlternatives_3_0"


    // $ANTLR start "rule__BatterySent__SentAlternatives_3_0"
    // InternalMyLanguage.g:1488:1: rule__BatterySent__SentAlternatives_3_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__BatterySent__SentAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1492:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt5=1;
                }
                break;
            case 62:
                {
                alt5=2;
                }
                break;
            case 61:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyLanguage.g:1493:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1493:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1494:3: ruleGreaterSent
                    {
                     before(grammarAccess.getBatterySentAccess().getSentGreaterSentParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGreaterSent();

                    state._fsp--;

                     after(grammarAccess.getBatterySentAccess().getSentGreaterSentParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1499:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1499:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1500:3: ruleLessSent
                    {
                     before(grammarAccess.getBatterySentAccess().getSentLessSentParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLessSent();

                    state._fsp--;

                     after(grammarAccess.getBatterySentAccess().getSentLessSentParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1505:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1505:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1506:3: ruleEqualSent
                    {
                     before(grammarAccess.getBatterySentAccess().getSentEqualSentParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualSent();

                    state._fsp--;

                     after(grammarAccess.getBatterySentAccess().getSentEqualSentParserRuleCall_3_0_2()); 

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
    // $ANTLR end "rule__BatterySent__SentAlternatives_3_0"


    // $ANTLR start "rule__PeopleSent__Alternatives_1"
    // InternalMyLanguage.g:1515:1: rule__PeopleSent__Alternatives_1 : ( ( rulePeopleNumbSent ) | ( rulePeoplePosSent ) );
    public final void rule__PeopleSent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1519:1: ( ( rulePeopleNumbSent ) | ( rulePeoplePosSent ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==48) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyLanguage.g:1520:2: ( rulePeopleNumbSent )
                    {
                    // InternalMyLanguage.g:1520:2: ( rulePeopleNumbSent )
                    // InternalMyLanguage.g:1521:3: rulePeopleNumbSent
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
                    // InternalMyLanguage.g:1526:2: ( rulePeoplePosSent )
                    {
                    // InternalMyLanguage.g:1526:2: ( rulePeoplePosSent )
                    // InternalMyLanguage.g:1527:3: rulePeoplePosSent
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
    // InternalMyLanguage.g:1536:1: rule__PeoplePosSent__ToleranceAlternatives_5_0 : ( ( ruleCirclePosition ) | ( ruleSpherePosition ) );
    public final void rule__PeoplePosSent__ToleranceAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1540:1: ( ( ruleCirclePosition ) | ( ruleSpherePosition ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==66) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==70) ) {
                    alt7=2;
                }
                else if ( (LA7_1==67) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyLanguage.g:1541:2: ( ruleCirclePosition )
                    {
                    // InternalMyLanguage.g:1541:2: ( ruleCirclePosition )
                    // InternalMyLanguage.g:1542:3: ruleCirclePosition
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
                    // InternalMyLanguage.g:1547:2: ( ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:1547:2: ( ruleSpherePosition )
                    // InternalMyLanguage.g:1548:3: ruleSpherePosition
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
    // InternalMyLanguage.g:1557:1: rule__MissionSent__Alternatives_1 : ( ( ruleMissionStatusSent ) | ( ruleMissionRiskLevelSent ) | ( ruleMissionGoalSent ) );
    public final void rule__MissionSent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1561:1: ( ( ruleMissionStatusSent ) | ( ruleMissionRiskLevelSent ) | ( ruleMissionGoalSent ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt8=1;
                }
                break;
            case 51:
                {
                alt8=2;
                }
                break;
            case 50:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyLanguage.g:1562:2: ( ruleMissionStatusSent )
                    {
                    // InternalMyLanguage.g:1562:2: ( ruleMissionStatusSent )
                    // InternalMyLanguage.g:1563:3: ruleMissionStatusSent
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
                    // InternalMyLanguage.g:1568:2: ( ruleMissionRiskLevelSent )
                    {
                    // InternalMyLanguage.g:1568:2: ( ruleMissionRiskLevelSent )
                    // InternalMyLanguage.g:1569:3: ruleMissionRiskLevelSent
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
                    // InternalMyLanguage.g:1574:2: ( ruleMissionGoalSent )
                    {
                    // InternalMyLanguage.g:1574:2: ( ruleMissionGoalSent )
                    // InternalMyLanguage.g:1575:3: ruleMissionGoalSent
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
    // InternalMyLanguage.g:1584:1: rule__Robot__Alternatives_1 : ( ( ruleRobotPositionSent ) | ( ruleRobotSpeedSent ) | ( ruleRobotStateSent ) | ( ruleRobotDistanceSent ) | ( ruleRiskSent ) | ( rulePayloadSent ) | ( ruleFailingComponentSent ) | ( ruleRedundantComponent ) | ( ruleRobotAutoPilot ) );
    public final void rule__Robot__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1588:1: ( ( ruleRobotPositionSent ) | ( ruleRobotSpeedSent ) | ( ruleRobotStateSent ) | ( ruleRobotDistanceSent ) | ( ruleRiskSent ) | ( rulePayloadSent ) | ( ruleFailingComponentSent ) | ( ruleRedundantComponent ) | ( ruleRobotAutoPilot ) )
            int alt9=9;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMyLanguage.g:1589:2: ( ruleRobotPositionSent )
                    {
                    // InternalMyLanguage.g:1589:2: ( ruleRobotPositionSent )
                    // InternalMyLanguage.g:1590:3: ruleRobotPositionSent
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
                    // InternalMyLanguage.g:1595:2: ( ruleRobotSpeedSent )
                    {
                    // InternalMyLanguage.g:1595:2: ( ruleRobotSpeedSent )
                    // InternalMyLanguage.g:1596:3: ruleRobotSpeedSent
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
                    // InternalMyLanguage.g:1601:2: ( ruleRobotStateSent )
                    {
                    // InternalMyLanguage.g:1601:2: ( ruleRobotStateSent )
                    // InternalMyLanguage.g:1602:3: ruleRobotStateSent
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
                    // InternalMyLanguage.g:1607:2: ( ruleRobotDistanceSent )
                    {
                    // InternalMyLanguage.g:1607:2: ( ruleRobotDistanceSent )
                    // InternalMyLanguage.g:1608:3: ruleRobotDistanceSent
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
                    // InternalMyLanguage.g:1613:2: ( ruleRiskSent )
                    {
                    // InternalMyLanguage.g:1613:2: ( ruleRiskSent )
                    // InternalMyLanguage.g:1614:3: ruleRiskSent
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
                    // InternalMyLanguage.g:1619:2: ( rulePayloadSent )
                    {
                    // InternalMyLanguage.g:1619:2: ( rulePayloadSent )
                    // InternalMyLanguage.g:1620:3: rulePayloadSent
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
                    // InternalMyLanguage.g:1625:2: ( ruleFailingComponentSent )
                    {
                    // InternalMyLanguage.g:1625:2: ( ruleFailingComponentSent )
                    // InternalMyLanguage.g:1626:3: ruleFailingComponentSent
                    {
                     before(grammarAccess.getRobotAccess().getFailingComponentSentParserRuleCall_1_6()); 
                    pushFollow(FOLLOW_2);
                    ruleFailingComponentSent();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getFailingComponentSentParserRuleCall_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyLanguage.g:1631:2: ( ruleRedundantComponent )
                    {
                    // InternalMyLanguage.g:1631:2: ( ruleRedundantComponent )
                    // InternalMyLanguage.g:1632:3: ruleRedundantComponent
                    {
                     before(grammarAccess.getRobotAccess().getRedundantComponentParserRuleCall_1_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRedundantComponent();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getRedundantComponentParserRuleCall_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyLanguage.g:1637:2: ( ruleRobotAutoPilot )
                    {
                    // InternalMyLanguage.g:1637:2: ( ruleRobotAutoPilot )
                    // InternalMyLanguage.g:1638:3: ruleRobotAutoPilot
                    {
                     before(grammarAccess.getRobotAccess().getRobotAutoPilotParserRuleCall_1_8()); 
                    pushFollow(FOLLOW_2);
                    ruleRobotAutoPilot();

                    state._fsp--;

                     after(grammarAccess.getRobotAccess().getRobotAutoPilotParserRuleCall_1_8()); 

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
    // InternalMyLanguage.g:1647:1: rule__RobotAutoPilot__StatusAlternatives_2_0 : ( ( 'ON' ) | ( 'OFF' ) );
    public final void rule__RobotAutoPilot__StatusAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1651:1: ( ( 'ON' ) | ( 'OFF' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyLanguage.g:1652:2: ( 'ON' )
                    {
                    // InternalMyLanguage.g:1652:2: ( 'ON' )
                    // InternalMyLanguage.g:1653:3: 'ON'
                    {
                     before(grammarAccess.getRobotAutoPilotAccess().getStatusONKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRobotAutoPilotAccess().getStatusONKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1658:2: ( 'OFF' )
                    {
                    // InternalMyLanguage.g:1658:2: ( 'OFF' )
                    // InternalMyLanguage.g:1659:3: 'OFF'
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
    // InternalMyLanguage.g:1668:1: rule__RobotDistanceSent__SentAlternatives_2_0 : ( ( ruleDistanceToObstaclesSent ) | ( ruleDistanceToLocationSent ) );
    public final void rule__RobotDistanceSent__SentAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1672:1: ( ( ruleDistanceToObstaclesSent ) | ( ruleDistanceToLocationSent ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==60) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT||LA11_0==86) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyLanguage.g:1673:2: ( ruleDistanceToObstaclesSent )
                    {
                    // InternalMyLanguage.g:1673:2: ( ruleDistanceToObstaclesSent )
                    // InternalMyLanguage.g:1674:3: ruleDistanceToObstaclesSent
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
                    // InternalMyLanguage.g:1679:2: ( ruleDistanceToLocationSent )
                    {
                    // InternalMyLanguage.g:1679:2: ( ruleDistanceToLocationSent )
                    // InternalMyLanguage.g:1680:3: ruleDistanceToLocationSent
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
    // InternalMyLanguage.g:1689:1: rule__DistanceToLocationSent__BodyAlternatives_4_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__DistanceToLocationSent__BodyAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1693:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt12=1;
                }
                break;
            case 62:
                {
                alt12=2;
                }
                break;
            case 61:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyLanguage.g:1694:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1694:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1695:3: ruleGreaterSent
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
                    // InternalMyLanguage.g:1700:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1700:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1701:3: ruleLessSent
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
                    // InternalMyLanguage.g:1706:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1706:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1707:3: ruleEqualSent
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
    // InternalMyLanguage.g:1716:1: rule__DistanceToObstaclesSent__BodyAlternatives_2_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__DistanceToObstaclesSent__BodyAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1720:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt13=1;
                }
                break;
            case 62:
                {
                alt13=2;
                }
                break;
            case 61:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyLanguage.g:1721:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1721:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1722:3: ruleGreaterSent
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
                    // InternalMyLanguage.g:1727:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1727:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1728:3: ruleLessSent
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
                    // InternalMyLanguage.g:1733:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1733:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1734:3: ruleEqualSent
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
    // InternalMyLanguage.g:1743:1: rule__EqualSent__AmountAlternatives_2_0 : ( ( ruleDistanceUnit ) | ( rulePercentUnit ) );
    public final void rule__EqualSent__AmountAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1747:1: ( ( ruleDistanceUnit ) | ( rulePercentUnit ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=81 && LA14_0<=84)) ) {
                alt14=1;
            }
            else if ( (LA14_0==85) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyLanguage.g:1748:2: ( ruleDistanceUnit )
                    {
                    // InternalMyLanguage.g:1748:2: ( ruleDistanceUnit )
                    // InternalMyLanguage.g:1749:3: ruleDistanceUnit
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
                    // InternalMyLanguage.g:1754:2: ( rulePercentUnit )
                    {
                    // InternalMyLanguage.g:1754:2: ( rulePercentUnit )
                    // InternalMyLanguage.g:1755:3: rulePercentUnit
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
    // InternalMyLanguage.g:1764:1: rule__LessSent__AmountAlternatives_2_0 : ( ( ruleDistanceUnit ) | ( rulePercentUnit ) );
    public final void rule__LessSent__AmountAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1768:1: ( ( ruleDistanceUnit ) | ( rulePercentUnit ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=81 && LA15_0<=84)) ) {
                alt15=1;
            }
            else if ( (LA15_0==85) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyLanguage.g:1769:2: ( ruleDistanceUnit )
                    {
                    // InternalMyLanguage.g:1769:2: ( ruleDistanceUnit )
                    // InternalMyLanguage.g:1770:3: ruleDistanceUnit
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
                    // InternalMyLanguage.g:1775:2: ( rulePercentUnit )
                    {
                    // InternalMyLanguage.g:1775:2: ( rulePercentUnit )
                    // InternalMyLanguage.g:1776:3: rulePercentUnit
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
    // InternalMyLanguage.g:1785:1: rule__GreaterSent__AmountAlternatives_2_0 : ( ( ruleDistanceUnit ) | ( rulePercentUnit ) );
    public final void rule__GreaterSent__AmountAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1789:1: ( ( ruleDistanceUnit ) | ( rulePercentUnit ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=81 && LA16_0<=84)) ) {
                alt16=1;
            }
            else if ( (LA16_0==85) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyLanguage.g:1790:2: ( ruleDistanceUnit )
                    {
                    // InternalMyLanguage.g:1790:2: ( ruleDistanceUnit )
                    // InternalMyLanguage.g:1791:3: ruleDistanceUnit
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
                    // InternalMyLanguage.g:1796:2: ( rulePercentUnit )
                    {
                    // InternalMyLanguage.g:1796:2: ( rulePercentUnit )
                    // InternalMyLanguage.g:1797:3: rulePercentUnit
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
    // InternalMyLanguage.g:1806:1: rule__RobotPositionSent__ToleranceAlternatives_5_0 : ( ( ruleCirclePosition ) | ( ruleSpherePosition ) );
    public final void rule__RobotPositionSent__ToleranceAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1810:1: ( ( ruleCirclePosition ) | ( ruleSpherePosition ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==66) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==67) ) {
                    alt17=1;
                }
                else if ( (LA17_1==70) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyLanguage.g:1811:2: ( ruleCirclePosition )
                    {
                    // InternalMyLanguage.g:1811:2: ( ruleCirclePosition )
                    // InternalMyLanguage.g:1812:3: ruleCirclePosition
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
                    // InternalMyLanguage.g:1817:2: ( ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:1817:2: ( ruleSpherePosition )
                    // InternalMyLanguage.g:1818:3: ruleSpherePosition
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
    // InternalMyLanguage.g:1827:1: rule__EnvironmentSent__BodyAlternatives_3_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__EnvironmentSent__BodyAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1831:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt18=1;
                }
                break;
            case 62:
                {
                alt18=2;
                }
                break;
            case 61:
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
                    // InternalMyLanguage.g:1832:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1832:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1833:3: ruleGreaterSent
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
                    // InternalMyLanguage.g:1838:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1838:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1839:3: ruleLessSent
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
                    // InternalMyLanguage.g:1844:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1844:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1845:3: ruleEqualSent
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
    // InternalMyLanguage.g:1854:1: rule__MISSIONSTATUS__Alternatives : ( ( 'ACTIVE' ) | ( 'UNACTIVE' ) | ( 'PAUSED' ) );
    public final void rule__MISSIONSTATUS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1858:1: ( ( 'ACTIVE' ) | ( 'UNACTIVE' ) | ( 'PAUSED' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt19=1;
                }
                break;
            case 14:
                {
                alt19=2;
                }
                break;
            case 15:
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
                    // InternalMyLanguage.g:1859:2: ( 'ACTIVE' )
                    {
                    // InternalMyLanguage.g:1859:2: ( 'ACTIVE' )
                    // InternalMyLanguage.g:1860:3: 'ACTIVE'
                    {
                     before(grammarAccess.getMISSIONSTATUSAccess().getACTIVEKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMISSIONSTATUSAccess().getACTIVEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1865:2: ( 'UNACTIVE' )
                    {
                    // InternalMyLanguage.g:1865:2: ( 'UNACTIVE' )
                    // InternalMyLanguage.g:1866:3: 'UNACTIVE'
                    {
                     before(grammarAccess.getMISSIONSTATUSAccess().getUNACTIVEKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMISSIONSTATUSAccess().getUNACTIVEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1871:2: ( 'PAUSED' )
                    {
                    // InternalMyLanguage.g:1871:2: ( 'PAUSED' )
                    // InternalMyLanguage.g:1872:3: 'PAUSED'
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
    // InternalMyLanguage.g:1881:1: rule__MISSIONRISKLEVEL__Alternatives : ( ( 'SAFE' ) | ( 'UNSAFE' ) );
    public final void rule__MISSIONRISKLEVEL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1885:1: ( ( 'SAFE' ) | ( 'UNSAFE' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            else if ( (LA20_0==17) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyLanguage.g:1886:2: ( 'SAFE' )
                    {
                    // InternalMyLanguage.g:1886:2: ( 'SAFE' )
                    // InternalMyLanguage.g:1887:3: 'SAFE'
                    {
                     before(grammarAccess.getMISSIONRISKLEVELAccess().getSAFEKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMISSIONRISKLEVELAccess().getSAFEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1892:2: ( 'UNSAFE' )
                    {
                    // InternalMyLanguage.g:1892:2: ( 'UNSAFE' )
                    // InternalMyLanguage.g:1893:3: 'UNSAFE'
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
    // InternalMyLanguage.g:1902:1: rule__COLLISIONRISKLEVEL__Alternatives : ( ( 'SAFE' ) | ( 'WARNING' ) | ( 'CRITICAL' ) );
    public final void rule__COLLISIONRISKLEVEL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1906:1: ( ( 'SAFE' ) | ( 'WARNING' ) | ( 'CRITICAL' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt21=1;
                }
                break;
            case 18:
                {
                alt21=2;
                }
                break;
            case 19:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyLanguage.g:1907:2: ( 'SAFE' )
                    {
                    // InternalMyLanguage.g:1907:2: ( 'SAFE' )
                    // InternalMyLanguage.g:1908:3: 'SAFE'
                    {
                     before(grammarAccess.getCOLLISIONRISKLEVELAccess().getSAFEKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCOLLISIONRISKLEVELAccess().getSAFEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1913:2: ( 'WARNING' )
                    {
                    // InternalMyLanguage.g:1913:2: ( 'WARNING' )
                    // InternalMyLanguage.g:1914:3: 'WARNING'
                    {
                     before(grammarAccess.getCOLLISIONRISKLEVELAccess().getWARNINGKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCOLLISIONRISKLEVELAccess().getWARNINGKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1919:2: ( 'CRITICAL' )
                    {
                    // InternalMyLanguage.g:1919:2: ( 'CRITICAL' )
                    // InternalMyLanguage.g:1920:3: 'CRITICAL'
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


    // $ANTLR start "rule__COMPONENT__Alternatives"
    // InternalMyLanguage.g:1929:1: rule__COMPONENT__Alternatives : ( ( 'motor' ) | ( 'camera' ) | ( 'GPS' ) | ( 'battery' ) | ( 'barometer' ) | ( 'scanner' ) | ( 'sonar' ) | ( 'autopilot' ) );
    public final void rule__COMPONENT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1933:1: ( ( 'motor' ) | ( 'camera' ) | ( 'GPS' ) | ( 'battery' ) | ( 'barometer' ) | ( 'scanner' ) | ( 'sonar' ) | ( 'autopilot' ) )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt22=1;
                }
                break;
            case 21:
                {
                alt22=2;
                }
                break;
            case 22:
                {
                alt22=3;
                }
                break;
            case 23:
                {
                alt22=4;
                }
                break;
            case 24:
                {
                alt22=5;
                }
                break;
            case 25:
                {
                alt22=6;
                }
                break;
            case 26:
                {
                alt22=7;
                }
                break;
            case 27:
                {
                alt22=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyLanguage.g:1934:2: ( 'motor' )
                    {
                    // InternalMyLanguage.g:1934:2: ( 'motor' )
                    // InternalMyLanguage.g:1935:3: 'motor'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getMotorKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getMotorKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1940:2: ( 'camera' )
                    {
                    // InternalMyLanguage.g:1940:2: ( 'camera' )
                    // InternalMyLanguage.g:1941:3: 'camera'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getCameraKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getCameraKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1946:2: ( 'GPS' )
                    {
                    // InternalMyLanguage.g:1946:2: ( 'GPS' )
                    // InternalMyLanguage.g:1947:3: 'GPS'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getGPSKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getGPSKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:1952:2: ( 'battery' )
                    {
                    // InternalMyLanguage.g:1952:2: ( 'battery' )
                    // InternalMyLanguage.g:1953:3: 'battery'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getBatteryKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getBatteryKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyLanguage.g:1958:2: ( 'barometer' )
                    {
                    // InternalMyLanguage.g:1958:2: ( 'barometer' )
                    // InternalMyLanguage.g:1959:3: 'barometer'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getBarometerKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getBarometerKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyLanguage.g:1964:2: ( 'scanner' )
                    {
                    // InternalMyLanguage.g:1964:2: ( 'scanner' )
                    // InternalMyLanguage.g:1965:3: 'scanner'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getScannerKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getScannerKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyLanguage.g:1970:2: ( 'sonar' )
                    {
                    // InternalMyLanguage.g:1970:2: ( 'sonar' )
                    // InternalMyLanguage.g:1971:3: 'sonar'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getSonarKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getSonarKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyLanguage.g:1976:2: ( 'autopilot' )
                    {
                    // InternalMyLanguage.g:1976:2: ( 'autopilot' )
                    // InternalMyLanguage.g:1977:3: 'autopilot'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getAutopilotKeyword_7()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getAutopilotKeyword_7()); 

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
    // $ANTLR end "rule__COMPONENT__Alternatives"


    // $ANTLR start "rule__DistanceUnit__Alternatives"
    // InternalMyLanguage.g:1986:1: rule__DistanceUnit__Alternatives : ( ( ruleMETER ) | ( ruleCENTIMETER ) | ( ruleMILLIMETER ) | ( ruleKILOMETER ) );
    public final void rule__DistanceUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1990:1: ( ( ruleMETER ) | ( ruleCENTIMETER ) | ( ruleMILLIMETER ) | ( ruleKILOMETER ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt23=1;
                }
                break;
            case 82:
                {
                alt23=2;
                }
                break;
            case 83:
                {
                alt23=3;
                }
                break;
            case 84:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyLanguage.g:1991:2: ( ruleMETER )
                    {
                    // InternalMyLanguage.g:1991:2: ( ruleMETER )
                    // InternalMyLanguage.g:1992:3: ruleMETER
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
                    // InternalMyLanguage.g:1997:2: ( ruleCENTIMETER )
                    {
                    // InternalMyLanguage.g:1997:2: ( ruleCENTIMETER )
                    // InternalMyLanguage.g:1998:3: ruleCENTIMETER
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
                    // InternalMyLanguage.g:2003:2: ( ruleMILLIMETER )
                    {
                    // InternalMyLanguage.g:2003:2: ( ruleMILLIMETER )
                    // InternalMyLanguage.g:2004:3: ruleMILLIMETER
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
                    // InternalMyLanguage.g:2009:2: ( ruleKILOMETER )
                    {
                    // InternalMyLanguage.g:2009:2: ( ruleKILOMETER )
                    // InternalMyLanguage.g:2010:3: ruleKILOMETER
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
    // InternalMyLanguage.g:2019:1: rule__TimeUnit__Alternatives : ( ( ruleSECONDS ) | ( ruleHOUR ) | ( ruleMINUTES ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2023:1: ( ( ruleSECONDS ) | ( ruleHOUR ) | ( ruleMINUTES ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt24=1;
                }
                break;
            case 79:
                {
                alt24=2;
                }
                break;
            case 80:
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
                    // InternalMyLanguage.g:2024:2: ( ruleSECONDS )
                    {
                    // InternalMyLanguage.g:2024:2: ( ruleSECONDS )
                    // InternalMyLanguage.g:2025:3: ruleSECONDS
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
                    // InternalMyLanguage.g:2030:2: ( ruleHOUR )
                    {
                    // InternalMyLanguage.g:2030:2: ( ruleHOUR )
                    // InternalMyLanguage.g:2031:3: ruleHOUR
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
                    // InternalMyLanguage.g:2036:2: ( ruleMINUTES )
                    {
                    // InternalMyLanguage.g:2036:2: ( ruleMINUTES )
                    // InternalMyLanguage.g:2037:3: ruleMINUTES
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
    // InternalMyLanguage.g:2046:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2050:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalMyLanguage.g:2051:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalMyLanguage.g:2058:1: rule__Test__Group__0__Impl : ( 'Test:' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2062:1: ( ( 'Test:' ) )
            // InternalMyLanguage.g:2063:1: ( 'Test:' )
            {
            // InternalMyLanguage.g:2063:1: ( 'Test:' )
            // InternalMyLanguage.g:2064:2: 'Test:'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyLanguage.g:2073:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2077:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalMyLanguage.g:2078:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalMyLanguage.g:2085:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2089:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalMyLanguage.g:2090:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalMyLanguage.g:2090:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalMyLanguage.g:2091:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalMyLanguage.g:2092:2: ( rule__Test__NameAssignment_1 )
            // InternalMyLanguage.g:2092:3: rule__Test__NameAssignment_1
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
    // InternalMyLanguage.g:2100:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2104:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalMyLanguage.g:2105:2: rule__Test__Group__2__Impl rule__Test__Group__3
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
    // InternalMyLanguage.g:2112:1: rule__Test__Group__2__Impl : ( ( rule__Test__Group_2__0 )? ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2116:1: ( ( ( rule__Test__Group_2__0 )? ) )
            // InternalMyLanguage.g:2117:1: ( ( rule__Test__Group_2__0 )? )
            {
            // InternalMyLanguage.g:2117:1: ( ( rule__Test__Group_2__0 )? )
            // InternalMyLanguage.g:2118:2: ( rule__Test__Group_2__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_2()); 
            // InternalMyLanguage.g:2119:2: ( rule__Test__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyLanguage.g:2119:3: rule__Test__Group_2__0
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
    // InternalMyLanguage.g:2127:1: rule__Test__Group__3 : rule__Test__Group__3__Impl ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2131:1: ( rule__Test__Group__3__Impl )
            // InternalMyLanguage.g:2132:2: rule__Test__Group__3__Impl
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
    // InternalMyLanguage.g:2138:1: rule__Test__Group__3__Impl : ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2142:1: ( ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) ) )
            // InternalMyLanguage.g:2143:1: ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) )
            {
            // InternalMyLanguage.g:2143:1: ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) )
            // InternalMyLanguage.g:2144:2: ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* )
            {
            // InternalMyLanguage.g:2144:2: ( ( rule__Test__StatementsAssignment_3 ) )
            // InternalMyLanguage.g:2145:3: ( rule__Test__StatementsAssignment_3 )
            {
             before(grammarAccess.getTestAccess().getStatementsAssignment_3()); 
            // InternalMyLanguage.g:2146:3: ( rule__Test__StatementsAssignment_3 )
            // InternalMyLanguage.g:2146:4: rule__Test__StatementsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Test__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getStatementsAssignment_3()); 

            }

            // InternalMyLanguage.g:2149:2: ( ( rule__Test__StatementsAssignment_3 )* )
            // InternalMyLanguage.g:2150:3: ( rule__Test__StatementsAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getStatementsAssignment_3()); 
            // InternalMyLanguage.g:2151:3: ( rule__Test__StatementsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=30 && LA26_0<=32)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyLanguage.g:2151:4: rule__Test__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Test__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMyLanguage.g:2161:1: rule__Test__Group_2__0 : rule__Test__Group_2__0__Impl rule__Test__Group_2__1 ;
    public final void rule__Test__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2165:1: ( rule__Test__Group_2__0__Impl rule__Test__Group_2__1 )
            // InternalMyLanguage.g:2166:2: rule__Test__Group_2__0__Impl rule__Test__Group_2__1
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
    // InternalMyLanguage.g:2173:1: rule__Test__Group_2__0__Impl : ( 'Description:' ) ;
    public final void rule__Test__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2177:1: ( ( 'Description:' ) )
            // InternalMyLanguage.g:2178:1: ( 'Description:' )
            {
            // InternalMyLanguage.g:2178:1: ( 'Description:' )
            // InternalMyLanguage.g:2179:2: 'Description:'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyLanguage.g:2188:1: rule__Test__Group_2__1 : rule__Test__Group_2__1__Impl ;
    public final void rule__Test__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2192:1: ( rule__Test__Group_2__1__Impl )
            // InternalMyLanguage.g:2193:2: rule__Test__Group_2__1__Impl
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
    // InternalMyLanguage.g:2199:1: rule__Test__Group_2__1__Impl : ( ( rule__Test__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Test__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2203:1: ( ( ( rule__Test__DescriptionAssignment_2_1 ) ) )
            // InternalMyLanguage.g:2204:1: ( ( rule__Test__DescriptionAssignment_2_1 ) )
            {
            // InternalMyLanguage.g:2204:1: ( ( rule__Test__DescriptionAssignment_2_1 ) )
            // InternalMyLanguage.g:2205:2: ( rule__Test__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getTestAccess().getDescriptionAssignment_2_1()); 
            // InternalMyLanguage.g:2206:2: ( rule__Test__DescriptionAssignment_2_1 )
            // InternalMyLanguage.g:2206:3: rule__Test__DescriptionAssignment_2_1
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
    // InternalMyLanguage.g:2215:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2219:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalMyLanguage.g:2220:2: rule__Given__Group__0__Impl rule__Given__Group__1
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
    // InternalMyLanguage.g:2227:1: rule__Given__Group__0__Impl : ( 'Given:' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2231:1: ( ( 'Given:' ) )
            // InternalMyLanguage.g:2232:1: ( 'Given:' )
            {
            // InternalMyLanguage.g:2232:1: ( 'Given:' )
            // InternalMyLanguage.g:2233:2: 'Given:'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyLanguage.g:2242:1: rule__Given__Group__1 : rule__Given__Group__1__Impl ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2246:1: ( rule__Given__Group__1__Impl )
            // InternalMyLanguage.g:2247:2: rule__Given__Group__1__Impl
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
    // InternalMyLanguage.g:2253:1: rule__Given__Group__1__Impl : ( ( rule__Given__BodyAssignment_1 ) ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2257:1: ( ( ( rule__Given__BodyAssignment_1 ) ) )
            // InternalMyLanguage.g:2258:1: ( ( rule__Given__BodyAssignment_1 ) )
            {
            // InternalMyLanguage.g:2258:1: ( ( rule__Given__BodyAssignment_1 ) )
            // InternalMyLanguage.g:2259:2: ( rule__Given__BodyAssignment_1 )
            {
             before(grammarAccess.getGivenAccess().getBodyAssignment_1()); 
            // InternalMyLanguage.g:2260:2: ( rule__Given__BodyAssignment_1 )
            // InternalMyLanguage.g:2260:3: rule__Given__BodyAssignment_1
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
    // InternalMyLanguage.g:2269:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2273:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalMyLanguage.g:2274:2: rule__Then__Group__0__Impl rule__Then__Group__1
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
    // InternalMyLanguage.g:2281:1: rule__Then__Group__0__Impl : ( 'Then:' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2285:1: ( ( 'Then:' ) )
            // InternalMyLanguage.g:2286:1: ( 'Then:' )
            {
            // InternalMyLanguage.g:2286:1: ( 'Then:' )
            // InternalMyLanguage.g:2287:2: 'Then:'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyLanguage.g:2296:1: rule__Then__Group__1 : rule__Then__Group__1__Impl ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2300:1: ( rule__Then__Group__1__Impl )
            // InternalMyLanguage.g:2301:2: rule__Then__Group__1__Impl
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
    // InternalMyLanguage.g:2307:1: rule__Then__Group__1__Impl : ( ( rule__Then__BodyAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2311:1: ( ( ( rule__Then__BodyAssignment_1 ) ) )
            // InternalMyLanguage.g:2312:1: ( ( rule__Then__BodyAssignment_1 ) )
            {
            // InternalMyLanguage.g:2312:1: ( ( rule__Then__BodyAssignment_1 ) )
            // InternalMyLanguage.g:2313:2: ( rule__Then__BodyAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getBodyAssignment_1()); 
            // InternalMyLanguage.g:2314:2: ( rule__Then__BodyAssignment_1 )
            // InternalMyLanguage.g:2314:3: rule__Then__BodyAssignment_1
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
    // InternalMyLanguage.g:2323:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2327:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalMyLanguage.g:2328:2: rule__When__Group__0__Impl rule__When__Group__1
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
    // InternalMyLanguage.g:2335:1: rule__When__Group__0__Impl : ( 'When:' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2339:1: ( ( 'When:' ) )
            // InternalMyLanguage.g:2340:1: ( 'When:' )
            {
            // InternalMyLanguage.g:2340:1: ( 'When:' )
            // InternalMyLanguage.g:2341:2: 'When:'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyLanguage.g:2350:1: rule__When__Group__1 : rule__When__Group__1__Impl ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2354:1: ( rule__When__Group__1__Impl )
            // InternalMyLanguage.g:2355:2: rule__When__Group__1__Impl
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
    // InternalMyLanguage.g:2361:1: rule__When__Group__1__Impl : ( ( rule__When__BodyAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2365:1: ( ( ( rule__When__BodyAssignment_1 ) ) )
            // InternalMyLanguage.g:2366:1: ( ( rule__When__BodyAssignment_1 ) )
            {
            // InternalMyLanguage.g:2366:1: ( ( rule__When__BodyAssignment_1 ) )
            // InternalMyLanguage.g:2367:2: ( rule__When__BodyAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getBodyAssignment_1()); 
            // InternalMyLanguage.g:2368:2: ( rule__When__BodyAssignment_1 )
            // InternalMyLanguage.g:2368:3: rule__When__BodyAssignment_1
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


    // $ANTLR start "rule__SonarSent__Group__0"
    // InternalMyLanguage.g:2377:1: rule__SonarSent__Group__0 : rule__SonarSent__Group__0__Impl rule__SonarSent__Group__1 ;
    public final void rule__SonarSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2381:1: ( rule__SonarSent__Group__0__Impl rule__SonarSent__Group__1 )
            // InternalMyLanguage.g:2382:2: rule__SonarSent__Group__0__Impl rule__SonarSent__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyLanguage.g:2389:1: rule__SonarSent__Group__0__Impl : ( 'Sonar' ) ;
    public final void rule__SonarSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2393:1: ( ( 'Sonar' ) )
            // InternalMyLanguage.g:2394:1: ( 'Sonar' )
            {
            // InternalMyLanguage.g:2394:1: ( 'Sonar' )
            // InternalMyLanguage.g:2395:2: 'Sonar'
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
    // InternalMyLanguage.g:2404:1: rule__SonarSent__Group__1 : rule__SonarSent__Group__1__Impl rule__SonarSent__Group__2 ;
    public final void rule__SonarSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2408:1: ( rule__SonarSent__Group__1__Impl rule__SonarSent__Group__2 )
            // InternalMyLanguage.g:2409:2: rule__SonarSent__Group__1__Impl rule__SonarSent__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SonarSent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SonarSent__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMyLanguage.g:2416:1: rule__SonarSent__Group__1__Impl : ( 'distancereading' ) ;
    public final void rule__SonarSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2420:1: ( ( 'distancereading' ) )
            // InternalMyLanguage.g:2421:1: ( 'distancereading' )
            {
            // InternalMyLanguage.g:2421:1: ( 'distancereading' )
            // InternalMyLanguage.g:2422:2: 'distancereading'
            {
             before(grammarAccess.getSonarSentAccess().getDistancereadingKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSonarSentAccess().getDistancereadingKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SonarSent__Group__2"
    // InternalMyLanguage.g:2431:1: rule__SonarSent__Group__2 : rule__SonarSent__Group__2__Impl rule__SonarSent__Group__3 ;
    public final void rule__SonarSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2435:1: ( rule__SonarSent__Group__2__Impl rule__SonarSent__Group__3 )
            // InternalMyLanguage.g:2436:2: rule__SonarSent__Group__2__Impl rule__SonarSent__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SonarSent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SonarSent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SonarSent__Group__2"


    // $ANTLR start "rule__SonarSent__Group__2__Impl"
    // InternalMyLanguage.g:2443:1: rule__SonarSent__Group__2__Impl : ( 'is' ) ;
    public final void rule__SonarSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2447:1: ( ( 'is' ) )
            // InternalMyLanguage.g:2448:1: ( 'is' )
            {
            // InternalMyLanguage.g:2448:1: ( 'is' )
            // InternalMyLanguage.g:2449:2: 'is'
            {
             before(grammarAccess.getSonarSentAccess().getIsKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSonarSentAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SonarSent__Group__2__Impl"


    // $ANTLR start "rule__SonarSent__Group__3"
    // InternalMyLanguage.g:2458:1: rule__SonarSent__Group__3 : rule__SonarSent__Group__3__Impl ;
    public final void rule__SonarSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2462:1: ( rule__SonarSent__Group__3__Impl )
            // InternalMyLanguage.g:2463:2: rule__SonarSent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SonarSent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SonarSent__Group__3"


    // $ANTLR start "rule__SonarSent__Group__3__Impl"
    // InternalMyLanguage.g:2469:1: rule__SonarSent__Group__3__Impl : ( ( rule__SonarSent__SentAssignment_3 ) ) ;
    public final void rule__SonarSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2473:1: ( ( ( rule__SonarSent__SentAssignment_3 ) ) )
            // InternalMyLanguage.g:2474:1: ( ( rule__SonarSent__SentAssignment_3 ) )
            {
            // InternalMyLanguage.g:2474:1: ( ( rule__SonarSent__SentAssignment_3 ) )
            // InternalMyLanguage.g:2475:2: ( rule__SonarSent__SentAssignment_3 )
            {
             before(grammarAccess.getSonarSentAccess().getSentAssignment_3()); 
            // InternalMyLanguage.g:2476:2: ( rule__SonarSent__SentAssignment_3 )
            // InternalMyLanguage.g:2476:3: rule__SonarSent__SentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SonarSent__SentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSonarSentAccess().getSentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SonarSent__Group__3__Impl"


    // $ANTLR start "rule__NotificationSent__Group__0"
    // InternalMyLanguage.g:2485:1: rule__NotificationSent__Group__0 : rule__NotificationSent__Group__0__Impl rule__NotificationSent__Group__1 ;
    public final void rule__NotificationSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2489:1: ( rule__NotificationSent__Group__0__Impl rule__NotificationSent__Group__1 )
            // InternalMyLanguage.g:2490:2: rule__NotificationSent__Group__0__Impl rule__NotificationSent__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyLanguage.g:2497:1: rule__NotificationSent__Group__0__Impl : ( ( rule__NotificationSent__NotAssignment_0 ) ) ;
    public final void rule__NotificationSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2501:1: ( ( ( rule__NotificationSent__NotAssignment_0 ) ) )
            // InternalMyLanguage.g:2502:1: ( ( rule__NotificationSent__NotAssignment_0 ) )
            {
            // InternalMyLanguage.g:2502:1: ( ( rule__NotificationSent__NotAssignment_0 ) )
            // InternalMyLanguage.g:2503:2: ( rule__NotificationSent__NotAssignment_0 )
            {
             before(grammarAccess.getNotificationSentAccess().getNotAssignment_0()); 
            // InternalMyLanguage.g:2504:2: ( rule__NotificationSent__NotAssignment_0 )
            // InternalMyLanguage.g:2504:3: rule__NotificationSent__NotAssignment_0
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
    // InternalMyLanguage.g:2512:1: rule__NotificationSent__Group__1 : rule__NotificationSent__Group__1__Impl rule__NotificationSent__Group__2 ;
    public final void rule__NotificationSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2516:1: ( rule__NotificationSent__Group__1__Impl rule__NotificationSent__Group__2 )
            // InternalMyLanguage.g:2517:2: rule__NotificationSent__Group__1__Impl rule__NotificationSent__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:2524:1: rule__NotificationSent__Group__1__Impl : ( 'status' ) ;
    public final void rule__NotificationSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2528:1: ( ( 'status' ) )
            // InternalMyLanguage.g:2529:1: ( 'status' )
            {
            // InternalMyLanguage.g:2529:1: ( 'status' )
            // InternalMyLanguage.g:2530:2: 'status'
            {
             before(grammarAccess.getNotificationSentAccess().getStatusKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyLanguage.g:2539:1: rule__NotificationSent__Group__2 : rule__NotificationSent__Group__2__Impl rule__NotificationSent__Group__3 ;
    public final void rule__NotificationSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2543:1: ( rule__NotificationSent__Group__2__Impl rule__NotificationSent__Group__3 )
            // InternalMyLanguage.g:2544:2: rule__NotificationSent__Group__2__Impl rule__NotificationSent__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyLanguage.g:2551:1: rule__NotificationSent__Group__2__Impl : ( 'is' ) ;
    public final void rule__NotificationSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2555:1: ( ( 'is' ) )
            // InternalMyLanguage.g:2556:1: ( 'is' )
            {
            // InternalMyLanguage.g:2556:1: ( 'is' )
            // InternalMyLanguage.g:2557:2: 'is'
            {
             before(grammarAccess.getNotificationSentAccess().getIsKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:2566:1: rule__NotificationSent__Group__3 : rule__NotificationSent__Group__3__Impl ;
    public final void rule__NotificationSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2570:1: ( rule__NotificationSent__Group__3__Impl )
            // InternalMyLanguage.g:2571:2: rule__NotificationSent__Group__3__Impl
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
    // InternalMyLanguage.g:2577:1: rule__NotificationSent__Group__3__Impl : ( 'sent' ) ;
    public final void rule__NotificationSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2581:1: ( ( 'sent' ) )
            // InternalMyLanguage.g:2582:1: ( 'sent' )
            {
            // InternalMyLanguage.g:2582:1: ( 'sent' )
            // InternalMyLanguage.g:2583:2: 'sent'
            {
             before(grammarAccess.getNotificationSentAccess().getSentKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyLanguage.g:2593:1: rule__TimeSent__Group__0 : rule__TimeSent__Group__0__Impl rule__TimeSent__Group__1 ;
    public final void rule__TimeSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2597:1: ( rule__TimeSent__Group__0__Impl rule__TimeSent__Group__1 )
            // InternalMyLanguage.g:2598:2: rule__TimeSent__Group__0__Impl rule__TimeSent__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyLanguage.g:2605:1: rule__TimeSent__Group__0__Impl : ( 'Time' ) ;
    public final void rule__TimeSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2609:1: ( ( 'Time' ) )
            // InternalMyLanguage.g:2610:1: ( 'Time' )
            {
            // InternalMyLanguage.g:2610:1: ( 'Time' )
            // InternalMyLanguage.g:2611:2: 'Time'
            {
             before(grammarAccess.getTimeSentAccess().getTimeKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyLanguage.g:2620:1: rule__TimeSent__Group__1 : rule__TimeSent__Group__1__Impl ;
    public final void rule__TimeSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2624:1: ( rule__TimeSent__Group__1__Impl )
            // InternalMyLanguage.g:2625:2: rule__TimeSent__Group__1__Impl
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
    // InternalMyLanguage.g:2631:1: rule__TimeSent__Group__1__Impl : ( ruleTimeInterval ) ;
    public final void rule__TimeSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2635:1: ( ( ruleTimeInterval ) )
            // InternalMyLanguage.g:2636:1: ( ruleTimeInterval )
            {
            // InternalMyLanguage.g:2636:1: ( ruleTimeInterval )
            // InternalMyLanguage.g:2637:2: ruleTimeInterval
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
    // InternalMyLanguage.g:2647:1: rule__TimeInterval__Group__0 : rule__TimeInterval__Group__0__Impl rule__TimeInterval__Group__1 ;
    public final void rule__TimeInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2651:1: ( rule__TimeInterval__Group__0__Impl rule__TimeInterval__Group__1 )
            // InternalMyLanguage.g:2652:2: rule__TimeInterval__Group__0__Impl rule__TimeInterval__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyLanguage.g:2659:1: rule__TimeInterval__Group__0__Impl : ( 'interval' ) ;
    public final void rule__TimeInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2663:1: ( ( 'interval' ) )
            // InternalMyLanguage.g:2664:1: ( 'interval' )
            {
            // InternalMyLanguage.g:2664:1: ( 'interval' )
            // InternalMyLanguage.g:2665:2: 'interval'
            {
             before(grammarAccess.getTimeIntervalAccess().getIntervalKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyLanguage.g:2674:1: rule__TimeInterval__Group__1 : rule__TimeInterval__Group__1__Impl rule__TimeInterval__Group__2 ;
    public final void rule__TimeInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2678:1: ( rule__TimeInterval__Group__1__Impl rule__TimeInterval__Group__2 )
            // InternalMyLanguage.g:2679:2: rule__TimeInterval__Group__1__Impl rule__TimeInterval__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyLanguage.g:2686:1: rule__TimeInterval__Group__1__Impl : ( 'in' ) ;
    public final void rule__TimeInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2690:1: ( ( 'in' ) )
            // InternalMyLanguage.g:2691:1: ( 'in' )
            {
            // InternalMyLanguage.g:2691:1: ( 'in' )
            // InternalMyLanguage.g:2692:2: 'in'
            {
             before(grammarAccess.getTimeIntervalAccess().getInKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyLanguage.g:2701:1: rule__TimeInterval__Group__2 : rule__TimeInterval__Group__2__Impl rule__TimeInterval__Group__3 ;
    public final void rule__TimeInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2705:1: ( rule__TimeInterval__Group__2__Impl rule__TimeInterval__Group__3 )
            // InternalMyLanguage.g:2706:2: rule__TimeInterval__Group__2__Impl rule__TimeInterval__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyLanguage.g:2713:1: rule__TimeInterval__Group__2__Impl : ( '[' ) ;
    public final void rule__TimeInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2717:1: ( ( '[' ) )
            // InternalMyLanguage.g:2718:1: ( '[' )
            {
            // InternalMyLanguage.g:2718:1: ( '[' )
            // InternalMyLanguage.g:2719:2: '['
            {
             before(grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyLanguage.g:2728:1: rule__TimeInterval__Group__3 : rule__TimeInterval__Group__3__Impl rule__TimeInterval__Group__4 ;
    public final void rule__TimeInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2732:1: ( rule__TimeInterval__Group__3__Impl rule__TimeInterval__Group__4 )
            // InternalMyLanguage.g:2733:2: rule__TimeInterval__Group__3__Impl rule__TimeInterval__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyLanguage.g:2740:1: rule__TimeInterval__Group__3__Impl : ( ( rule__TimeInterval__FirstAssignment_3 ) ) ;
    public final void rule__TimeInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2744:1: ( ( ( rule__TimeInterval__FirstAssignment_3 ) ) )
            // InternalMyLanguage.g:2745:1: ( ( rule__TimeInterval__FirstAssignment_3 ) )
            {
            // InternalMyLanguage.g:2745:1: ( ( rule__TimeInterval__FirstAssignment_3 ) )
            // InternalMyLanguage.g:2746:2: ( rule__TimeInterval__FirstAssignment_3 )
            {
             before(grammarAccess.getTimeIntervalAccess().getFirstAssignment_3()); 
            // InternalMyLanguage.g:2747:2: ( rule__TimeInterval__FirstAssignment_3 )
            // InternalMyLanguage.g:2747:3: rule__TimeInterval__FirstAssignment_3
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
    // InternalMyLanguage.g:2755:1: rule__TimeInterval__Group__4 : rule__TimeInterval__Group__4__Impl rule__TimeInterval__Group__5 ;
    public final void rule__TimeInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2759:1: ( rule__TimeInterval__Group__4__Impl rule__TimeInterval__Group__5 )
            // InternalMyLanguage.g:2760:2: rule__TimeInterval__Group__4__Impl rule__TimeInterval__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyLanguage.g:2767:1: rule__TimeInterval__Group__4__Impl : ( ',' ) ;
    public final void rule__TimeInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2771:1: ( ( ',' ) )
            // InternalMyLanguage.g:2772:1: ( ',' )
            {
            // InternalMyLanguage.g:2772:1: ( ',' )
            // InternalMyLanguage.g:2773:2: ','
            {
             before(grammarAccess.getTimeIntervalAccess().getCommaKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyLanguage.g:2782:1: rule__TimeInterval__Group__5 : rule__TimeInterval__Group__5__Impl rule__TimeInterval__Group__6 ;
    public final void rule__TimeInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2786:1: ( rule__TimeInterval__Group__5__Impl rule__TimeInterval__Group__6 )
            // InternalMyLanguage.g:2787:2: rule__TimeInterval__Group__5__Impl rule__TimeInterval__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyLanguage.g:2794:1: rule__TimeInterval__Group__5__Impl : ( ( rule__TimeInterval__SecondAssignment_5 ) ) ;
    public final void rule__TimeInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2798:1: ( ( ( rule__TimeInterval__SecondAssignment_5 ) ) )
            // InternalMyLanguage.g:2799:1: ( ( rule__TimeInterval__SecondAssignment_5 ) )
            {
            // InternalMyLanguage.g:2799:1: ( ( rule__TimeInterval__SecondAssignment_5 ) )
            // InternalMyLanguage.g:2800:2: ( rule__TimeInterval__SecondAssignment_5 )
            {
             before(grammarAccess.getTimeIntervalAccess().getSecondAssignment_5()); 
            // InternalMyLanguage.g:2801:2: ( rule__TimeInterval__SecondAssignment_5 )
            // InternalMyLanguage.g:2801:3: rule__TimeInterval__SecondAssignment_5
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
    // InternalMyLanguage.g:2809:1: rule__TimeInterval__Group__6 : rule__TimeInterval__Group__6__Impl ;
    public final void rule__TimeInterval__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2813:1: ( rule__TimeInterval__Group__6__Impl )
            // InternalMyLanguage.g:2814:2: rule__TimeInterval__Group__6__Impl
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
    // InternalMyLanguage.g:2820:1: rule__TimeInterval__Group__6__Impl : ( ']' ) ;
    public final void rule__TimeInterval__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2824:1: ( ( ']' ) )
            // InternalMyLanguage.g:2825:1: ( ']' )
            {
            // InternalMyLanguage.g:2825:1: ( ']' )
            // InternalMyLanguage.g:2826:2: ']'
            {
             before(grammarAccess.getTimeIntervalAccess().getRightSquareBracketKeyword_6()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyLanguage.g:2836:1: rule__BatterySent__Group__0 : rule__BatterySent__Group__0__Impl rule__BatterySent__Group__1 ;
    public final void rule__BatterySent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2840:1: ( rule__BatterySent__Group__0__Impl rule__BatterySent__Group__1 )
            // InternalMyLanguage.g:2841:2: rule__BatterySent__Group__0__Impl rule__BatterySent__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyLanguage.g:2848:1: rule__BatterySent__Group__0__Impl : ( 'Battery' ) ;
    public final void rule__BatterySent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2852:1: ( ( 'Battery' ) )
            // InternalMyLanguage.g:2853:1: ( 'Battery' )
            {
            // InternalMyLanguage.g:2853:1: ( 'Battery' )
            // InternalMyLanguage.g:2854:2: 'Battery'
            {
             before(grammarAccess.getBatterySentAccess().getBatteryKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyLanguage.g:2863:1: rule__BatterySent__Group__1 : rule__BatterySent__Group__1__Impl rule__BatterySent__Group__2 ;
    public final void rule__BatterySent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2867:1: ( rule__BatterySent__Group__1__Impl rule__BatterySent__Group__2 )
            // InternalMyLanguage.g:2868:2: rule__BatterySent__Group__1__Impl rule__BatterySent__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__BatterySent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatterySent__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMyLanguage.g:2875:1: rule__BatterySent__Group__1__Impl : ( 'level' ) ;
    public final void rule__BatterySent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2879:1: ( ( 'level' ) )
            // InternalMyLanguage.g:2880:1: ( 'level' )
            {
            // InternalMyLanguage.g:2880:1: ( 'level' )
            // InternalMyLanguage.g:2881:2: 'level'
            {
             before(grammarAccess.getBatterySentAccess().getLevelKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBatterySentAccess().getLevelKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BatterySent__Group__2"
    // InternalMyLanguage.g:2890:1: rule__BatterySent__Group__2 : rule__BatterySent__Group__2__Impl rule__BatterySent__Group__3 ;
    public final void rule__BatterySent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2894:1: ( rule__BatterySent__Group__2__Impl rule__BatterySent__Group__3 )
            // InternalMyLanguage.g:2895:2: rule__BatterySent__Group__2__Impl rule__BatterySent__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__BatterySent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatterySent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatterySent__Group__2"


    // $ANTLR start "rule__BatterySent__Group__2__Impl"
    // InternalMyLanguage.g:2902:1: rule__BatterySent__Group__2__Impl : ( 'is' ) ;
    public final void rule__BatterySent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2906:1: ( ( 'is' ) )
            // InternalMyLanguage.g:2907:1: ( 'is' )
            {
            // InternalMyLanguage.g:2907:1: ( 'is' )
            // InternalMyLanguage.g:2908:2: 'is'
            {
             before(grammarAccess.getBatterySentAccess().getIsKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBatterySentAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatterySent__Group__2__Impl"


    // $ANTLR start "rule__BatterySent__Group__3"
    // InternalMyLanguage.g:2917:1: rule__BatterySent__Group__3 : rule__BatterySent__Group__3__Impl ;
    public final void rule__BatterySent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2921:1: ( rule__BatterySent__Group__3__Impl )
            // InternalMyLanguage.g:2922:2: rule__BatterySent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BatterySent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatterySent__Group__3"


    // $ANTLR start "rule__BatterySent__Group__3__Impl"
    // InternalMyLanguage.g:2928:1: rule__BatterySent__Group__3__Impl : ( ( rule__BatterySent__SentAssignment_3 ) ) ;
    public final void rule__BatterySent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2932:1: ( ( ( rule__BatterySent__SentAssignment_3 ) ) )
            // InternalMyLanguage.g:2933:1: ( ( rule__BatterySent__SentAssignment_3 ) )
            {
            // InternalMyLanguage.g:2933:1: ( ( rule__BatterySent__SentAssignment_3 ) )
            // InternalMyLanguage.g:2934:2: ( rule__BatterySent__SentAssignment_3 )
            {
             before(grammarAccess.getBatterySentAccess().getSentAssignment_3()); 
            // InternalMyLanguage.g:2935:2: ( rule__BatterySent__SentAssignment_3 )
            // InternalMyLanguage.g:2935:3: rule__BatterySent__SentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BatterySent__SentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBatterySentAccess().getSentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatterySent__Group__3__Impl"


    // $ANTLR start "rule__PeopleSent__Group__0"
    // InternalMyLanguage.g:2944:1: rule__PeopleSent__Group__0 : rule__PeopleSent__Group__0__Impl rule__PeopleSent__Group__1 ;
    public final void rule__PeopleSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2948:1: ( rule__PeopleSent__Group__0__Impl rule__PeopleSent__Group__1 )
            // InternalMyLanguage.g:2949:2: rule__PeopleSent__Group__0__Impl rule__PeopleSent__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:2956:1: rule__PeopleSent__Group__0__Impl : ( 'Person' ) ;
    public final void rule__PeopleSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2960:1: ( ( 'Person' ) )
            // InternalMyLanguage.g:2961:1: ( 'Person' )
            {
            // InternalMyLanguage.g:2961:1: ( 'Person' )
            // InternalMyLanguage.g:2962:2: 'Person'
            {
             before(grammarAccess.getPeopleSentAccess().getPersonKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyLanguage.g:2971:1: rule__PeopleSent__Group__1 : rule__PeopleSent__Group__1__Impl ;
    public final void rule__PeopleSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2975:1: ( rule__PeopleSent__Group__1__Impl )
            // InternalMyLanguage.g:2976:2: rule__PeopleSent__Group__1__Impl
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
    // InternalMyLanguage.g:2982:1: rule__PeopleSent__Group__1__Impl : ( ( rule__PeopleSent__Alternatives_1 ) ) ;
    public final void rule__PeopleSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2986:1: ( ( ( rule__PeopleSent__Alternatives_1 ) ) )
            // InternalMyLanguage.g:2987:1: ( ( rule__PeopleSent__Alternatives_1 ) )
            {
            // InternalMyLanguage.g:2987:1: ( ( rule__PeopleSent__Alternatives_1 ) )
            // InternalMyLanguage.g:2988:2: ( rule__PeopleSent__Alternatives_1 )
            {
             before(grammarAccess.getPeopleSentAccess().getAlternatives_1()); 
            // InternalMyLanguage.g:2989:2: ( rule__PeopleSent__Alternatives_1 )
            // InternalMyLanguage.g:2989:3: rule__PeopleSent__Alternatives_1
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
    // InternalMyLanguage.g:2998:1: rule__PeoplePosSent__Group__0 : rule__PeoplePosSent__Group__0__Impl rule__PeoplePosSent__Group__1 ;
    public final void rule__PeoplePosSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3002:1: ( rule__PeoplePosSent__Group__0__Impl rule__PeoplePosSent__Group__1 )
            // InternalMyLanguage.g:3003:2: rule__PeoplePosSent__Group__0__Impl rule__PeoplePosSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:3010:1: rule__PeoplePosSent__Group__0__Impl : ( 'position' ) ;
    public final void rule__PeoplePosSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3014:1: ( ( 'position' ) )
            // InternalMyLanguage.g:3015:1: ( 'position' )
            {
            // InternalMyLanguage.g:3015:1: ( 'position' )
            // InternalMyLanguage.g:3016:2: 'position'
            {
             before(grammarAccess.getPeoplePosSentAccess().getPositionKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyLanguage.g:3025:1: rule__PeoplePosSent__Group__1 : rule__PeoplePosSent__Group__1__Impl rule__PeoplePosSent__Group__2 ;
    public final void rule__PeoplePosSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3029:1: ( rule__PeoplePosSent__Group__1__Impl rule__PeoplePosSent__Group__2 )
            // InternalMyLanguage.g:3030:2: rule__PeoplePosSent__Group__1__Impl rule__PeoplePosSent__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:3037:1: rule__PeoplePosSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__PeoplePosSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3041:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3042:1: ( 'is' )
            {
            // InternalMyLanguage.g:3042:1: ( 'is' )
            // InternalMyLanguage.g:3043:2: 'is'
            {
             before(grammarAccess.getPeoplePosSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:3052:1: rule__PeoplePosSent__Group__2 : rule__PeoplePosSent__Group__2__Impl rule__PeoplePosSent__Group__3 ;
    public final void rule__PeoplePosSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3056:1: ( rule__PeoplePosSent__Group__2__Impl rule__PeoplePosSent__Group__3 )
            // InternalMyLanguage.g:3057:2: rule__PeoplePosSent__Group__2__Impl rule__PeoplePosSent__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:3064:1: rule__PeoplePosSent__Group__2__Impl : ( ( rule__PeoplePosSent__PosXAssignment_2 ) ) ;
    public final void rule__PeoplePosSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3068:1: ( ( ( rule__PeoplePosSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:3069:1: ( ( rule__PeoplePosSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:3069:1: ( ( rule__PeoplePosSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:3070:2: ( rule__PeoplePosSent__PosXAssignment_2 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:3071:2: ( rule__PeoplePosSent__PosXAssignment_2 )
            // InternalMyLanguage.g:3071:3: rule__PeoplePosSent__PosXAssignment_2
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
    // InternalMyLanguage.g:3079:1: rule__PeoplePosSent__Group__3 : rule__PeoplePosSent__Group__3__Impl rule__PeoplePosSent__Group__4 ;
    public final void rule__PeoplePosSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3083:1: ( rule__PeoplePosSent__Group__3__Impl rule__PeoplePosSent__Group__4 )
            // InternalMyLanguage.g:3084:2: rule__PeoplePosSent__Group__3__Impl rule__PeoplePosSent__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:3091:1: rule__PeoplePosSent__Group__3__Impl : ( ( rule__PeoplePosSent__PosYAssignment_3 ) ) ;
    public final void rule__PeoplePosSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3095:1: ( ( ( rule__PeoplePosSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:3096:1: ( ( rule__PeoplePosSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:3096:1: ( ( rule__PeoplePosSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:3097:2: ( rule__PeoplePosSent__PosYAssignment_3 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:3098:2: ( rule__PeoplePosSent__PosYAssignment_3 )
            // InternalMyLanguage.g:3098:3: rule__PeoplePosSent__PosYAssignment_3
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
    // InternalMyLanguage.g:3106:1: rule__PeoplePosSent__Group__4 : rule__PeoplePosSent__Group__4__Impl rule__PeoplePosSent__Group__5 ;
    public final void rule__PeoplePosSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3110:1: ( rule__PeoplePosSent__Group__4__Impl rule__PeoplePosSent__Group__5 )
            // InternalMyLanguage.g:3111:2: rule__PeoplePosSent__Group__4__Impl rule__PeoplePosSent__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyLanguage.g:3118:1: rule__PeoplePosSent__Group__4__Impl : ( ( rule__PeoplePosSent__PosZAssignment_4 ) ) ;
    public final void rule__PeoplePosSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3122:1: ( ( ( rule__PeoplePosSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:3123:1: ( ( rule__PeoplePosSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:3123:1: ( ( rule__PeoplePosSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:3124:2: ( rule__PeoplePosSent__PosZAssignment_4 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:3125:2: ( rule__PeoplePosSent__PosZAssignment_4 )
            // InternalMyLanguage.g:3125:3: rule__PeoplePosSent__PosZAssignment_4
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
    // InternalMyLanguage.g:3133:1: rule__PeoplePosSent__Group__5 : rule__PeoplePosSent__Group__5__Impl ;
    public final void rule__PeoplePosSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3137:1: ( rule__PeoplePosSent__Group__5__Impl )
            // InternalMyLanguage.g:3138:2: rule__PeoplePosSent__Group__5__Impl
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
    // InternalMyLanguage.g:3144:1: rule__PeoplePosSent__Group__5__Impl : ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? ) ;
    public final void rule__PeoplePosSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3148:1: ( ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:3149:1: ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:3149:1: ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:3150:2: ( rule__PeoplePosSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getPeoplePosSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:3151:2: ( rule__PeoplePosSent__ToleranceAssignment_5 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==66) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyLanguage.g:3151:3: rule__PeoplePosSent__ToleranceAssignment_5
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
    // InternalMyLanguage.g:3160:1: rule__PeopleNumbSent__Group__0 : rule__PeopleNumbSent__Group__0__Impl rule__PeopleNumbSent__Group__1 ;
    public final void rule__PeopleNumbSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3164:1: ( rule__PeopleNumbSent__Group__0__Impl rule__PeopleNumbSent__Group__1 )
            // InternalMyLanguage.g:3165:2: rule__PeopleNumbSent__Group__0__Impl rule__PeopleNumbSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:3172:1: rule__PeopleNumbSent__Group__0__Impl : ( 'number' ) ;
    public final void rule__PeopleNumbSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3176:1: ( ( 'number' ) )
            // InternalMyLanguage.g:3177:1: ( 'number' )
            {
            // InternalMyLanguage.g:3177:1: ( 'number' )
            // InternalMyLanguage.g:3178:2: 'number'
            {
             before(grammarAccess.getPeopleNumbSentAccess().getNumberKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyLanguage.g:3187:1: rule__PeopleNumbSent__Group__1 : rule__PeopleNumbSent__Group__1__Impl rule__PeopleNumbSent__Group__2 ;
    public final void rule__PeopleNumbSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3191:1: ( rule__PeopleNumbSent__Group__1__Impl rule__PeopleNumbSent__Group__2 )
            // InternalMyLanguage.g:3192:2: rule__PeopleNumbSent__Group__1__Impl rule__PeopleNumbSent__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyLanguage.g:3199:1: rule__PeopleNumbSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__PeopleNumbSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3203:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3204:1: ( 'is' )
            {
            // InternalMyLanguage.g:3204:1: ( 'is' )
            // InternalMyLanguage.g:3205:2: 'is'
            {
             before(grammarAccess.getPeopleNumbSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:3214:1: rule__PeopleNumbSent__Group__2 : rule__PeopleNumbSent__Group__2__Impl ;
    public final void rule__PeopleNumbSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3218:1: ( rule__PeopleNumbSent__Group__2__Impl )
            // InternalMyLanguage.g:3219:2: rule__PeopleNumbSent__Group__2__Impl
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
    // InternalMyLanguage.g:3225:1: rule__PeopleNumbSent__Group__2__Impl : ( ( rule__PeopleNumbSent__AmountAssignment_2 ) ) ;
    public final void rule__PeopleNumbSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3229:1: ( ( ( rule__PeopleNumbSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:3230:1: ( ( rule__PeopleNumbSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:3230:1: ( ( rule__PeopleNumbSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:3231:2: ( rule__PeopleNumbSent__AmountAssignment_2 )
            {
             before(grammarAccess.getPeopleNumbSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:3232:2: ( rule__PeopleNumbSent__AmountAssignment_2 )
            // InternalMyLanguage.g:3232:3: rule__PeopleNumbSent__AmountAssignment_2
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
    // InternalMyLanguage.g:3241:1: rule__MissionSent__Group__0 : rule__MissionSent__Group__0__Impl rule__MissionSent__Group__1 ;
    public final void rule__MissionSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3245:1: ( rule__MissionSent__Group__0__Impl rule__MissionSent__Group__1 )
            // InternalMyLanguage.g:3246:2: rule__MissionSent__Group__0__Impl rule__MissionSent__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyLanguage.g:3253:1: rule__MissionSent__Group__0__Impl : ( 'Mission' ) ;
    public final void rule__MissionSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3257:1: ( ( 'Mission' ) )
            // InternalMyLanguage.g:3258:1: ( 'Mission' )
            {
            // InternalMyLanguage.g:3258:1: ( 'Mission' )
            // InternalMyLanguage.g:3259:2: 'Mission'
            {
             before(grammarAccess.getMissionSentAccess().getMissionKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyLanguage.g:3268:1: rule__MissionSent__Group__1 : rule__MissionSent__Group__1__Impl ;
    public final void rule__MissionSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3272:1: ( rule__MissionSent__Group__1__Impl )
            // InternalMyLanguage.g:3273:2: rule__MissionSent__Group__1__Impl
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
    // InternalMyLanguage.g:3279:1: rule__MissionSent__Group__1__Impl : ( ( rule__MissionSent__Alternatives_1 ) ) ;
    public final void rule__MissionSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3283:1: ( ( ( rule__MissionSent__Alternatives_1 ) ) )
            // InternalMyLanguage.g:3284:1: ( ( rule__MissionSent__Alternatives_1 ) )
            {
            // InternalMyLanguage.g:3284:1: ( ( rule__MissionSent__Alternatives_1 ) )
            // InternalMyLanguage.g:3285:2: ( rule__MissionSent__Alternatives_1 )
            {
             before(grammarAccess.getMissionSentAccess().getAlternatives_1()); 
            // InternalMyLanguage.g:3286:2: ( rule__MissionSent__Alternatives_1 )
            // InternalMyLanguage.g:3286:3: rule__MissionSent__Alternatives_1
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
    // InternalMyLanguage.g:3295:1: rule__MissionGoalSent__Group__0 : rule__MissionGoalSent__Group__0__Impl rule__MissionGoalSent__Group__1 ;
    public final void rule__MissionGoalSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3299:1: ( rule__MissionGoalSent__Group__0__Impl rule__MissionGoalSent__Group__1 )
            // InternalMyLanguage.g:3300:2: rule__MissionGoalSent__Group__0__Impl rule__MissionGoalSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:3307:1: rule__MissionGoalSent__Group__0__Impl : ( 'goal' ) ;
    public final void rule__MissionGoalSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3311:1: ( ( 'goal' ) )
            // InternalMyLanguage.g:3312:1: ( 'goal' )
            {
            // InternalMyLanguage.g:3312:1: ( 'goal' )
            // InternalMyLanguage.g:3313:2: 'goal'
            {
             before(grammarAccess.getMissionGoalSentAccess().getGoalKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyLanguage.g:3322:1: rule__MissionGoalSent__Group__1 : rule__MissionGoalSent__Group__1__Impl rule__MissionGoalSent__Group__2 ;
    public final void rule__MissionGoalSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3326:1: ( rule__MissionGoalSent__Group__1__Impl rule__MissionGoalSent__Group__2 )
            // InternalMyLanguage.g:3327:2: rule__MissionGoalSent__Group__1__Impl rule__MissionGoalSent__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:3334:1: rule__MissionGoalSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__MissionGoalSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3338:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3339:1: ( 'is' )
            {
            // InternalMyLanguage.g:3339:1: ( 'is' )
            // InternalMyLanguage.g:3340:2: 'is'
            {
             before(grammarAccess.getMissionGoalSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:3349:1: rule__MissionGoalSent__Group__2 : rule__MissionGoalSent__Group__2__Impl rule__MissionGoalSent__Group__3 ;
    public final void rule__MissionGoalSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3353:1: ( rule__MissionGoalSent__Group__2__Impl rule__MissionGoalSent__Group__3 )
            // InternalMyLanguage.g:3354:2: rule__MissionGoalSent__Group__2__Impl rule__MissionGoalSent__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:3361:1: rule__MissionGoalSent__Group__2__Impl : ( ( rule__MissionGoalSent__PosXAssignment_2 ) ) ;
    public final void rule__MissionGoalSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3365:1: ( ( ( rule__MissionGoalSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:3366:1: ( ( rule__MissionGoalSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:3366:1: ( ( rule__MissionGoalSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:3367:2: ( rule__MissionGoalSent__PosXAssignment_2 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:3368:2: ( rule__MissionGoalSent__PosXAssignment_2 )
            // InternalMyLanguage.g:3368:3: rule__MissionGoalSent__PosXAssignment_2
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
    // InternalMyLanguage.g:3376:1: rule__MissionGoalSent__Group__3 : rule__MissionGoalSent__Group__3__Impl rule__MissionGoalSent__Group__4 ;
    public final void rule__MissionGoalSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3380:1: ( rule__MissionGoalSent__Group__3__Impl rule__MissionGoalSent__Group__4 )
            // InternalMyLanguage.g:3381:2: rule__MissionGoalSent__Group__3__Impl rule__MissionGoalSent__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:3388:1: rule__MissionGoalSent__Group__3__Impl : ( ( rule__MissionGoalSent__PosYAssignment_3 ) ) ;
    public final void rule__MissionGoalSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3392:1: ( ( ( rule__MissionGoalSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:3393:1: ( ( rule__MissionGoalSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:3393:1: ( ( rule__MissionGoalSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:3394:2: ( rule__MissionGoalSent__PosYAssignment_3 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:3395:2: ( rule__MissionGoalSent__PosYAssignment_3 )
            // InternalMyLanguage.g:3395:3: rule__MissionGoalSent__PosYAssignment_3
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
    // InternalMyLanguage.g:3403:1: rule__MissionGoalSent__Group__4 : rule__MissionGoalSent__Group__4__Impl ;
    public final void rule__MissionGoalSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3407:1: ( rule__MissionGoalSent__Group__4__Impl )
            // InternalMyLanguage.g:3408:2: rule__MissionGoalSent__Group__4__Impl
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
    // InternalMyLanguage.g:3414:1: rule__MissionGoalSent__Group__4__Impl : ( ( rule__MissionGoalSent__PosZAssignment_4 ) ) ;
    public final void rule__MissionGoalSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3418:1: ( ( ( rule__MissionGoalSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:3419:1: ( ( rule__MissionGoalSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:3419:1: ( ( rule__MissionGoalSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:3420:2: ( rule__MissionGoalSent__PosZAssignment_4 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:3421:2: ( rule__MissionGoalSent__PosZAssignment_4 )
            // InternalMyLanguage.g:3421:3: rule__MissionGoalSent__PosZAssignment_4
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
    // InternalMyLanguage.g:3430:1: rule__MissionRiskLevelSent__Group__0 : rule__MissionRiskLevelSent__Group__0__Impl rule__MissionRiskLevelSent__Group__1 ;
    public final void rule__MissionRiskLevelSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3434:1: ( rule__MissionRiskLevelSent__Group__0__Impl rule__MissionRiskLevelSent__Group__1 )
            // InternalMyLanguage.g:3435:2: rule__MissionRiskLevelSent__Group__0__Impl rule__MissionRiskLevelSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:3442:1: rule__MissionRiskLevelSent__Group__0__Impl : ( 'missionsafety' ) ;
    public final void rule__MissionRiskLevelSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3446:1: ( ( 'missionsafety' ) )
            // InternalMyLanguage.g:3447:1: ( 'missionsafety' )
            {
            // InternalMyLanguage.g:3447:1: ( 'missionsafety' )
            // InternalMyLanguage.g:3448:2: 'missionsafety'
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getMissionsafetyKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyLanguage.g:3457:1: rule__MissionRiskLevelSent__Group__1 : rule__MissionRiskLevelSent__Group__1__Impl rule__MissionRiskLevelSent__Group__2 ;
    public final void rule__MissionRiskLevelSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3461:1: ( rule__MissionRiskLevelSent__Group__1__Impl rule__MissionRiskLevelSent__Group__2 )
            // InternalMyLanguage.g:3462:2: rule__MissionRiskLevelSent__Group__1__Impl rule__MissionRiskLevelSent__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyLanguage.g:3469:1: rule__MissionRiskLevelSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__MissionRiskLevelSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3473:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3474:1: ( 'is' )
            {
            // InternalMyLanguage.g:3474:1: ( 'is' )
            // InternalMyLanguage.g:3475:2: 'is'
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:3484:1: rule__MissionRiskLevelSent__Group__2 : rule__MissionRiskLevelSent__Group__2__Impl ;
    public final void rule__MissionRiskLevelSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3488:1: ( rule__MissionRiskLevelSent__Group__2__Impl )
            // InternalMyLanguage.g:3489:2: rule__MissionRiskLevelSent__Group__2__Impl
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
    // InternalMyLanguage.g:3495:1: rule__MissionRiskLevelSent__Group__2__Impl : ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) ) ;
    public final void rule__MissionRiskLevelSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3499:1: ( ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) ) )
            // InternalMyLanguage.g:3500:1: ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) )
            {
            // InternalMyLanguage.g:3500:1: ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) )
            // InternalMyLanguage.g:3501:2: ( rule__MissionRiskLevelSent__RisklevelAssignment_2 )
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getRisklevelAssignment_2()); 
            // InternalMyLanguage.g:3502:2: ( rule__MissionRiskLevelSent__RisklevelAssignment_2 )
            // InternalMyLanguage.g:3502:3: rule__MissionRiskLevelSent__RisklevelAssignment_2
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
    // InternalMyLanguage.g:3511:1: rule__MissionStatusSent__Group__0 : rule__MissionStatusSent__Group__0__Impl rule__MissionStatusSent__Group__1 ;
    public final void rule__MissionStatusSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3515:1: ( rule__MissionStatusSent__Group__0__Impl rule__MissionStatusSent__Group__1 )
            // InternalMyLanguage.g:3516:2: rule__MissionStatusSent__Group__0__Impl rule__MissionStatusSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:3523:1: rule__MissionStatusSent__Group__0__Impl : ( 'status' ) ;
    public final void rule__MissionStatusSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3527:1: ( ( 'status' ) )
            // InternalMyLanguage.g:3528:1: ( 'status' )
            {
            // InternalMyLanguage.g:3528:1: ( 'status' )
            // InternalMyLanguage.g:3529:2: 'status'
            {
             before(grammarAccess.getMissionStatusSentAccess().getStatusKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyLanguage.g:3538:1: rule__MissionStatusSent__Group__1 : rule__MissionStatusSent__Group__1__Impl rule__MissionStatusSent__Group__2 ;
    public final void rule__MissionStatusSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3542:1: ( rule__MissionStatusSent__Group__1__Impl rule__MissionStatusSent__Group__2 )
            // InternalMyLanguage.g:3543:2: rule__MissionStatusSent__Group__1__Impl rule__MissionStatusSent__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyLanguage.g:3550:1: rule__MissionStatusSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__MissionStatusSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3554:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3555:1: ( 'is' )
            {
            // InternalMyLanguage.g:3555:1: ( 'is' )
            // InternalMyLanguage.g:3556:2: 'is'
            {
             before(grammarAccess.getMissionStatusSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:3565:1: rule__MissionStatusSent__Group__2 : rule__MissionStatusSent__Group__2__Impl ;
    public final void rule__MissionStatusSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3569:1: ( rule__MissionStatusSent__Group__2__Impl )
            // InternalMyLanguage.g:3570:2: rule__MissionStatusSent__Group__2__Impl
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
    // InternalMyLanguage.g:3576:1: rule__MissionStatusSent__Group__2__Impl : ( ( rule__MissionStatusSent__StateAssignment_2 ) ) ;
    public final void rule__MissionStatusSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3580:1: ( ( ( rule__MissionStatusSent__StateAssignment_2 ) ) )
            // InternalMyLanguage.g:3581:1: ( ( rule__MissionStatusSent__StateAssignment_2 ) )
            {
            // InternalMyLanguage.g:3581:1: ( ( rule__MissionStatusSent__StateAssignment_2 ) )
            // InternalMyLanguage.g:3582:2: ( rule__MissionStatusSent__StateAssignment_2 )
            {
             before(grammarAccess.getMissionStatusSentAccess().getStateAssignment_2()); 
            // InternalMyLanguage.g:3583:2: ( rule__MissionStatusSent__StateAssignment_2 )
            // InternalMyLanguage.g:3583:3: rule__MissionStatusSent__StateAssignment_2
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
    // InternalMyLanguage.g:3592:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3596:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyLanguage.g:3597:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyLanguage.g:3604:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3608:1: ( ( 'Robot' ) )
            // InternalMyLanguage.g:3609:1: ( 'Robot' )
            {
            // InternalMyLanguage.g:3609:1: ( 'Robot' )
            // InternalMyLanguage.g:3610:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyLanguage.g:3619:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3623:1: ( rule__Robot__Group__1__Impl )
            // InternalMyLanguage.g:3624:2: rule__Robot__Group__1__Impl
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
    // InternalMyLanguage.g:3630:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__Alternatives_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3634:1: ( ( ( rule__Robot__Alternatives_1 ) ) )
            // InternalMyLanguage.g:3635:1: ( ( rule__Robot__Alternatives_1 ) )
            {
            // InternalMyLanguage.g:3635:1: ( ( rule__Robot__Alternatives_1 ) )
            // InternalMyLanguage.g:3636:2: ( rule__Robot__Alternatives_1 )
            {
             before(grammarAccess.getRobotAccess().getAlternatives_1()); 
            // InternalMyLanguage.g:3637:2: ( rule__Robot__Alternatives_1 )
            // InternalMyLanguage.g:3637:3: rule__Robot__Alternatives_1
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
    // InternalMyLanguage.g:3646:1: rule__RobotAutoPilot__Group__0 : rule__RobotAutoPilot__Group__0__Impl rule__RobotAutoPilot__Group__1 ;
    public final void rule__RobotAutoPilot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3650:1: ( rule__RobotAutoPilot__Group__0__Impl rule__RobotAutoPilot__Group__1 )
            // InternalMyLanguage.g:3651:2: rule__RobotAutoPilot__Group__0__Impl rule__RobotAutoPilot__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:3658:1: rule__RobotAutoPilot__Group__0__Impl : ( 'autopilot' ) ;
    public final void rule__RobotAutoPilot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3662:1: ( ( 'autopilot' ) )
            // InternalMyLanguage.g:3663:1: ( 'autopilot' )
            {
            // InternalMyLanguage.g:3663:1: ( 'autopilot' )
            // InternalMyLanguage.g:3664:2: 'autopilot'
            {
             before(grammarAccess.getRobotAutoPilotAccess().getAutopilotKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyLanguage.g:3673:1: rule__RobotAutoPilot__Group__1 : rule__RobotAutoPilot__Group__1__Impl rule__RobotAutoPilot__Group__2 ;
    public final void rule__RobotAutoPilot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3677:1: ( rule__RobotAutoPilot__Group__1__Impl rule__RobotAutoPilot__Group__2 )
            // InternalMyLanguage.g:3678:2: rule__RobotAutoPilot__Group__1__Impl rule__RobotAutoPilot__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyLanguage.g:3685:1: rule__RobotAutoPilot__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotAutoPilot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3689:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3690:1: ( 'is' )
            {
            // InternalMyLanguage.g:3690:1: ( 'is' )
            // InternalMyLanguage.g:3691:2: 'is'
            {
             before(grammarAccess.getRobotAutoPilotAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:3700:1: rule__RobotAutoPilot__Group__2 : rule__RobotAutoPilot__Group__2__Impl ;
    public final void rule__RobotAutoPilot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3704:1: ( rule__RobotAutoPilot__Group__2__Impl )
            // InternalMyLanguage.g:3705:2: rule__RobotAutoPilot__Group__2__Impl
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
    // InternalMyLanguage.g:3711:1: rule__RobotAutoPilot__Group__2__Impl : ( ( rule__RobotAutoPilot__StatusAssignment_2 ) ) ;
    public final void rule__RobotAutoPilot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3715:1: ( ( ( rule__RobotAutoPilot__StatusAssignment_2 ) ) )
            // InternalMyLanguage.g:3716:1: ( ( rule__RobotAutoPilot__StatusAssignment_2 ) )
            {
            // InternalMyLanguage.g:3716:1: ( ( rule__RobotAutoPilot__StatusAssignment_2 ) )
            // InternalMyLanguage.g:3717:2: ( rule__RobotAutoPilot__StatusAssignment_2 )
            {
             before(grammarAccess.getRobotAutoPilotAccess().getStatusAssignment_2()); 
            // InternalMyLanguage.g:3718:2: ( rule__RobotAutoPilot__StatusAssignment_2 )
            // InternalMyLanguage.g:3718:3: rule__RobotAutoPilot__StatusAssignment_2
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


    // $ANTLR start "rule__RedundantComponent__Group__0"
    // InternalMyLanguage.g:3727:1: rule__RedundantComponent__Group__0 : rule__RedundantComponent__Group__0__Impl rule__RedundantComponent__Group__1 ;
    public final void rule__RedundantComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3731:1: ( rule__RedundantComponent__Group__0__Impl rule__RedundantComponent__Group__1 )
            // InternalMyLanguage.g:3732:2: rule__RedundantComponent__Group__0__Impl rule__RedundantComponent__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RedundantComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RedundantComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__0"


    // $ANTLR start "rule__RedundantComponent__Group__0__Impl"
    // InternalMyLanguage.g:3739:1: rule__RedundantComponent__Group__0__Impl : ( ( rule__RedundantComponent__ComponentAssignment_0 ) ) ;
    public final void rule__RedundantComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3743:1: ( ( ( rule__RedundantComponent__ComponentAssignment_0 ) ) )
            // InternalMyLanguage.g:3744:1: ( ( rule__RedundantComponent__ComponentAssignment_0 ) )
            {
            // InternalMyLanguage.g:3744:1: ( ( rule__RedundantComponent__ComponentAssignment_0 ) )
            // InternalMyLanguage.g:3745:2: ( rule__RedundantComponent__ComponentAssignment_0 )
            {
             before(grammarAccess.getRedundantComponentAccess().getComponentAssignment_0()); 
            // InternalMyLanguage.g:3746:2: ( rule__RedundantComponent__ComponentAssignment_0 )
            // InternalMyLanguage.g:3746:3: rule__RedundantComponent__ComponentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RedundantComponent__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRedundantComponentAccess().getComponentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__0__Impl"


    // $ANTLR start "rule__RedundantComponent__Group__1"
    // InternalMyLanguage.g:3754:1: rule__RedundantComponent__Group__1 : rule__RedundantComponent__Group__1__Impl rule__RedundantComponent__Group__2 ;
    public final void rule__RedundantComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3758:1: ( rule__RedundantComponent__Group__1__Impl rule__RedundantComponent__Group__2 )
            // InternalMyLanguage.g:3759:2: rule__RedundantComponent__Group__1__Impl rule__RedundantComponent__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__RedundantComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RedundantComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__1"


    // $ANTLR start "rule__RedundantComponent__Group__1__Impl"
    // InternalMyLanguage.g:3766:1: rule__RedundantComponent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RedundantComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3770:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3771:1: ( 'is' )
            {
            // InternalMyLanguage.g:3771:1: ( 'is' )
            // InternalMyLanguage.g:3772:2: 'is'
            {
             before(grammarAccess.getRedundantComponentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRedundantComponentAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__1__Impl"


    // $ANTLR start "rule__RedundantComponent__Group__2"
    // InternalMyLanguage.g:3781:1: rule__RedundantComponent__Group__2 : rule__RedundantComponent__Group__2__Impl rule__RedundantComponent__Group__3 ;
    public final void rule__RedundantComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3785:1: ( rule__RedundantComponent__Group__2__Impl rule__RedundantComponent__Group__3 )
            // InternalMyLanguage.g:3786:2: rule__RedundantComponent__Group__2__Impl rule__RedundantComponent__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__RedundantComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RedundantComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__2"


    // $ANTLR start "rule__RedundantComponent__Group__2__Impl"
    // InternalMyLanguage.g:3793:1: rule__RedundantComponent__Group__2__Impl : ( 'used' ) ;
    public final void rule__RedundantComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3797:1: ( ( 'used' ) )
            // InternalMyLanguage.g:3798:1: ( 'used' )
            {
            // InternalMyLanguage.g:3798:1: ( 'used' )
            // InternalMyLanguage.g:3799:2: 'used'
            {
             before(grammarAccess.getRedundantComponentAccess().getUsedKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRedundantComponentAccess().getUsedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__2__Impl"


    // $ANTLR start "rule__RedundantComponent__Group__3"
    // InternalMyLanguage.g:3808:1: rule__RedundantComponent__Group__3 : rule__RedundantComponent__Group__3__Impl rule__RedundantComponent__Group__4 ;
    public final void rule__RedundantComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3812:1: ( rule__RedundantComponent__Group__3__Impl rule__RedundantComponent__Group__4 )
            // InternalMyLanguage.g:3813:2: rule__RedundantComponent__Group__3__Impl rule__RedundantComponent__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__RedundantComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RedundantComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__3"


    // $ANTLR start "rule__RedundantComponent__Group__3__Impl"
    // InternalMyLanguage.g:3820:1: rule__RedundantComponent__Group__3__Impl : ( 'as' ) ;
    public final void rule__RedundantComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3824:1: ( ( 'as' ) )
            // InternalMyLanguage.g:3825:1: ( 'as' )
            {
            // InternalMyLanguage.g:3825:1: ( 'as' )
            // InternalMyLanguage.g:3826:2: 'as'
            {
             before(grammarAccess.getRedundantComponentAccess().getAsKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRedundantComponentAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__3__Impl"


    // $ANTLR start "rule__RedundantComponent__Group__4"
    // InternalMyLanguage.g:3835:1: rule__RedundantComponent__Group__4 : rule__RedundantComponent__Group__4__Impl rule__RedundantComponent__Group__5 ;
    public final void rule__RedundantComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3839:1: ( rule__RedundantComponent__Group__4__Impl rule__RedundantComponent__Group__5 )
            // InternalMyLanguage.g:3840:2: rule__RedundantComponent__Group__4__Impl rule__RedundantComponent__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__RedundantComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RedundantComponent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__4"


    // $ANTLR start "rule__RedundantComponent__Group__4__Impl"
    // InternalMyLanguage.g:3847:1: rule__RedundantComponent__Group__4__Impl : ( 'redundant' ) ;
    public final void rule__RedundantComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3851:1: ( ( 'redundant' ) )
            // InternalMyLanguage.g:3852:1: ( 'redundant' )
            {
            // InternalMyLanguage.g:3852:1: ( 'redundant' )
            // InternalMyLanguage.g:3853:2: 'redundant'
            {
             before(grammarAccess.getRedundantComponentAccess().getRedundantKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRedundantComponentAccess().getRedundantKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__4__Impl"


    // $ANTLR start "rule__RedundantComponent__Group__5"
    // InternalMyLanguage.g:3862:1: rule__RedundantComponent__Group__5 : rule__RedundantComponent__Group__5__Impl ;
    public final void rule__RedundantComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3866:1: ( rule__RedundantComponent__Group__5__Impl )
            // InternalMyLanguage.g:3867:2: rule__RedundantComponent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RedundantComponent__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__5"


    // $ANTLR start "rule__RedundantComponent__Group__5__Impl"
    // InternalMyLanguage.g:3873:1: rule__RedundantComponent__Group__5__Impl : ( 'component' ) ;
    public final void rule__RedundantComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3877:1: ( ( 'component' ) )
            // InternalMyLanguage.g:3878:1: ( 'component' )
            {
            // InternalMyLanguage.g:3878:1: ( 'component' )
            // InternalMyLanguage.g:3879:2: 'component'
            {
             before(grammarAccess.getRedundantComponentAccess().getComponentKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRedundantComponentAccess().getComponentKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__Group__5__Impl"


    // $ANTLR start "rule__PayloadSent__Group__0"
    // InternalMyLanguage.g:3889:1: rule__PayloadSent__Group__0 : rule__PayloadSent__Group__0__Impl rule__PayloadSent__Group__1 ;
    public final void rule__PayloadSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3893:1: ( rule__PayloadSent__Group__0__Impl rule__PayloadSent__Group__1 )
            // InternalMyLanguage.g:3894:2: rule__PayloadSent__Group__0__Impl rule__PayloadSent__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyLanguage.g:3901:1: rule__PayloadSent__Group__0__Impl : ( ( rule__PayloadSent__LoadAssignment_0 ) ) ;
    public final void rule__PayloadSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3905:1: ( ( ( rule__PayloadSent__LoadAssignment_0 ) ) )
            // InternalMyLanguage.g:3906:1: ( ( rule__PayloadSent__LoadAssignment_0 ) )
            {
            // InternalMyLanguage.g:3906:1: ( ( rule__PayloadSent__LoadAssignment_0 ) )
            // InternalMyLanguage.g:3907:2: ( rule__PayloadSent__LoadAssignment_0 )
            {
             before(grammarAccess.getPayloadSentAccess().getLoadAssignment_0()); 
            // InternalMyLanguage.g:3908:2: ( rule__PayloadSent__LoadAssignment_0 )
            // InternalMyLanguage.g:3908:3: rule__PayloadSent__LoadAssignment_0
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
    // InternalMyLanguage.g:3916:1: rule__PayloadSent__Group__1 : rule__PayloadSent__Group__1__Impl ;
    public final void rule__PayloadSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3920:1: ( rule__PayloadSent__Group__1__Impl )
            // InternalMyLanguage.g:3921:2: rule__PayloadSent__Group__1__Impl
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
    // InternalMyLanguage.g:3927:1: rule__PayloadSent__Group__1__Impl : ( 'drops' ) ;
    public final void rule__PayloadSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3931:1: ( ( 'drops' ) )
            // InternalMyLanguage.g:3932:1: ( 'drops' )
            {
            // InternalMyLanguage.g:3932:1: ( 'drops' )
            // InternalMyLanguage.g:3933:2: 'drops'
            {
             before(grammarAccess.getPayloadSentAccess().getDropsKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyLanguage.g:3943:1: rule__RobotDistanceSent__Group__0 : rule__RobotDistanceSent__Group__0__Impl rule__RobotDistanceSent__Group__1 ;
    public final void rule__RobotDistanceSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3947:1: ( rule__RobotDistanceSent__Group__0__Impl rule__RobotDistanceSent__Group__1 )
            // InternalMyLanguage.g:3948:2: rule__RobotDistanceSent__Group__0__Impl rule__RobotDistanceSent__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyLanguage.g:3955:1: rule__RobotDistanceSent__Group__0__Impl : ( 'distance' ) ;
    public final void rule__RobotDistanceSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3959:1: ( ( 'distance' ) )
            // InternalMyLanguage.g:3960:1: ( 'distance' )
            {
            // InternalMyLanguage.g:3960:1: ( 'distance' )
            // InternalMyLanguage.g:3961:2: 'distance'
            {
             before(grammarAccess.getRobotDistanceSentAccess().getDistanceKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyLanguage.g:3970:1: rule__RobotDistanceSent__Group__1 : rule__RobotDistanceSent__Group__1__Impl rule__RobotDistanceSent__Group__2 ;
    public final void rule__RobotDistanceSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3974:1: ( rule__RobotDistanceSent__Group__1__Impl rule__RobotDistanceSent__Group__2 )
            // InternalMyLanguage.g:3975:2: rule__RobotDistanceSent__Group__1__Impl rule__RobotDistanceSent__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyLanguage.g:3982:1: rule__RobotDistanceSent__Group__1__Impl : ( 'to' ) ;
    public final void rule__RobotDistanceSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3986:1: ( ( 'to' ) )
            // InternalMyLanguage.g:3987:1: ( 'to' )
            {
            // InternalMyLanguage.g:3987:1: ( 'to' )
            // InternalMyLanguage.g:3988:2: 'to'
            {
             before(grammarAccess.getRobotDistanceSentAccess().getToKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyLanguage.g:3997:1: rule__RobotDistanceSent__Group__2 : rule__RobotDistanceSent__Group__2__Impl ;
    public final void rule__RobotDistanceSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4001:1: ( rule__RobotDistanceSent__Group__2__Impl )
            // InternalMyLanguage.g:4002:2: rule__RobotDistanceSent__Group__2__Impl
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
    // InternalMyLanguage.g:4008:1: rule__RobotDistanceSent__Group__2__Impl : ( ( rule__RobotDistanceSent__SentAssignment_2 ) ) ;
    public final void rule__RobotDistanceSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4012:1: ( ( ( rule__RobotDistanceSent__SentAssignment_2 ) ) )
            // InternalMyLanguage.g:4013:1: ( ( rule__RobotDistanceSent__SentAssignment_2 ) )
            {
            // InternalMyLanguage.g:4013:1: ( ( rule__RobotDistanceSent__SentAssignment_2 ) )
            // InternalMyLanguage.g:4014:2: ( rule__RobotDistanceSent__SentAssignment_2 )
            {
             before(grammarAccess.getRobotDistanceSentAccess().getSentAssignment_2()); 
            // InternalMyLanguage.g:4015:2: ( rule__RobotDistanceSent__SentAssignment_2 )
            // InternalMyLanguage.g:4015:3: rule__RobotDistanceSent__SentAssignment_2
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
    // InternalMyLanguage.g:4024:1: rule__DistanceToLocationSent__Group__0 : rule__DistanceToLocationSent__Group__0__Impl rule__DistanceToLocationSent__Group__1 ;
    public final void rule__DistanceToLocationSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4028:1: ( rule__DistanceToLocationSent__Group__0__Impl rule__DistanceToLocationSent__Group__1 )
            // InternalMyLanguage.g:4029:2: rule__DistanceToLocationSent__Group__0__Impl rule__DistanceToLocationSent__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:4036:1: rule__DistanceToLocationSent__Group__0__Impl : ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) ) ;
    public final void rule__DistanceToLocationSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4040:1: ( ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) ) )
            // InternalMyLanguage.g:4041:1: ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) )
            {
            // InternalMyLanguage.g:4041:1: ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) )
            // InternalMyLanguage.g:4042:2: ( rule__DistanceToLocationSent__PosXAssignment_0 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosXAssignment_0()); 
            // InternalMyLanguage.g:4043:2: ( rule__DistanceToLocationSent__PosXAssignment_0 )
            // InternalMyLanguage.g:4043:3: rule__DistanceToLocationSent__PosXAssignment_0
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
    // InternalMyLanguage.g:4051:1: rule__DistanceToLocationSent__Group__1 : rule__DistanceToLocationSent__Group__1__Impl rule__DistanceToLocationSent__Group__2 ;
    public final void rule__DistanceToLocationSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4055:1: ( rule__DistanceToLocationSent__Group__1__Impl rule__DistanceToLocationSent__Group__2 )
            // InternalMyLanguage.g:4056:2: rule__DistanceToLocationSent__Group__1__Impl rule__DistanceToLocationSent__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:4063:1: rule__DistanceToLocationSent__Group__1__Impl : ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) ) ;
    public final void rule__DistanceToLocationSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4067:1: ( ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) ) )
            // InternalMyLanguage.g:4068:1: ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) )
            {
            // InternalMyLanguage.g:4068:1: ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) )
            // InternalMyLanguage.g:4069:2: ( rule__DistanceToLocationSent__PosYAssignment_1 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosYAssignment_1()); 
            // InternalMyLanguage.g:4070:2: ( rule__DistanceToLocationSent__PosYAssignment_1 )
            // InternalMyLanguage.g:4070:3: rule__DistanceToLocationSent__PosYAssignment_1
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
    // InternalMyLanguage.g:4078:1: rule__DistanceToLocationSent__Group__2 : rule__DistanceToLocationSent__Group__2__Impl rule__DistanceToLocationSent__Group__3 ;
    public final void rule__DistanceToLocationSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4082:1: ( rule__DistanceToLocationSent__Group__2__Impl rule__DistanceToLocationSent__Group__3 )
            // InternalMyLanguage.g:4083:2: rule__DistanceToLocationSent__Group__2__Impl rule__DistanceToLocationSent__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:4090:1: rule__DistanceToLocationSent__Group__2__Impl : ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) ) ;
    public final void rule__DistanceToLocationSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4094:1: ( ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) ) )
            // InternalMyLanguage.g:4095:1: ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) )
            {
            // InternalMyLanguage.g:4095:1: ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) )
            // InternalMyLanguage.g:4096:2: ( rule__DistanceToLocationSent__PosZAssignment_2 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosZAssignment_2()); 
            // InternalMyLanguage.g:4097:2: ( rule__DistanceToLocationSent__PosZAssignment_2 )
            // InternalMyLanguage.g:4097:3: rule__DistanceToLocationSent__PosZAssignment_2
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
    // InternalMyLanguage.g:4105:1: rule__DistanceToLocationSent__Group__3 : rule__DistanceToLocationSent__Group__3__Impl rule__DistanceToLocationSent__Group__4 ;
    public final void rule__DistanceToLocationSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4109:1: ( rule__DistanceToLocationSent__Group__3__Impl rule__DistanceToLocationSent__Group__4 )
            // InternalMyLanguage.g:4110:2: rule__DistanceToLocationSent__Group__3__Impl rule__DistanceToLocationSent__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyLanguage.g:4117:1: rule__DistanceToLocationSent__Group__3__Impl : ( 'is' ) ;
    public final void rule__DistanceToLocationSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4121:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4122:1: ( 'is' )
            {
            // InternalMyLanguage.g:4122:1: ( 'is' )
            // InternalMyLanguage.g:4123:2: 'is'
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getIsKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:4132:1: rule__DistanceToLocationSent__Group__4 : rule__DistanceToLocationSent__Group__4__Impl rule__DistanceToLocationSent__Group__5 ;
    public final void rule__DistanceToLocationSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4136:1: ( rule__DistanceToLocationSent__Group__4__Impl rule__DistanceToLocationSent__Group__5 )
            // InternalMyLanguage.g:4137:2: rule__DistanceToLocationSent__Group__4__Impl rule__DistanceToLocationSent__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyLanguage.g:4144:1: rule__DistanceToLocationSent__Group__4__Impl : ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) ) ;
    public final void rule__DistanceToLocationSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4148:1: ( ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) ) )
            // InternalMyLanguage.g:4149:1: ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) )
            {
            // InternalMyLanguage.g:4149:1: ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) )
            // InternalMyLanguage.g:4150:2: ( rule__DistanceToLocationSent__BodyAssignment_4 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getBodyAssignment_4()); 
            // InternalMyLanguage.g:4151:2: ( rule__DistanceToLocationSent__BodyAssignment_4 )
            // InternalMyLanguage.g:4151:3: rule__DistanceToLocationSent__BodyAssignment_4
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
    // InternalMyLanguage.g:4159:1: rule__DistanceToLocationSent__Group__5 : rule__DistanceToLocationSent__Group__5__Impl ;
    public final void rule__DistanceToLocationSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4163:1: ( rule__DistanceToLocationSent__Group__5__Impl )
            // InternalMyLanguage.g:4164:2: rule__DistanceToLocationSent__Group__5__Impl
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
    // InternalMyLanguage.g:4170:1: rule__DistanceToLocationSent__Group__5__Impl : ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? ) ;
    public final void rule__DistanceToLocationSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4174:1: ( ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:4175:1: ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:4175:1: ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:4176:2: ( rule__DistanceToLocationSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:4177:2: ( rule__DistanceToLocationSent__ToleranceAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==68) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyLanguage.g:4177:3: rule__DistanceToLocationSent__ToleranceAssignment_5
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
    // InternalMyLanguage.g:4186:1: rule__DistanceToObstaclesSent__Group__0 : rule__DistanceToObstaclesSent__Group__0__Impl rule__DistanceToObstaclesSent__Group__1 ;
    public final void rule__DistanceToObstaclesSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4190:1: ( rule__DistanceToObstaclesSent__Group__0__Impl rule__DistanceToObstaclesSent__Group__1 )
            // InternalMyLanguage.g:4191:2: rule__DistanceToObstaclesSent__Group__0__Impl rule__DistanceToObstaclesSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:4198:1: rule__DistanceToObstaclesSent__Group__0__Impl : ( 'obstacles' ) ;
    public final void rule__DistanceToObstaclesSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4202:1: ( ( 'obstacles' ) )
            // InternalMyLanguage.g:4203:1: ( 'obstacles' )
            {
            // InternalMyLanguage.g:4203:1: ( 'obstacles' )
            // InternalMyLanguage.g:4204:2: 'obstacles'
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getObstaclesKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyLanguage.g:4213:1: rule__DistanceToObstaclesSent__Group__1 : rule__DistanceToObstaclesSent__Group__1__Impl rule__DistanceToObstaclesSent__Group__2 ;
    public final void rule__DistanceToObstaclesSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4217:1: ( rule__DistanceToObstaclesSent__Group__1__Impl rule__DistanceToObstaclesSent__Group__2 )
            // InternalMyLanguage.g:4218:2: rule__DistanceToObstaclesSent__Group__1__Impl rule__DistanceToObstaclesSent__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyLanguage.g:4225:1: rule__DistanceToObstaclesSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__DistanceToObstaclesSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4229:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4230:1: ( 'is' )
            {
            // InternalMyLanguage.g:4230:1: ( 'is' )
            // InternalMyLanguage.g:4231:2: 'is'
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:4240:1: rule__DistanceToObstaclesSent__Group__2 : rule__DistanceToObstaclesSent__Group__2__Impl rule__DistanceToObstaclesSent__Group__3 ;
    public final void rule__DistanceToObstaclesSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4244:1: ( rule__DistanceToObstaclesSent__Group__2__Impl rule__DistanceToObstaclesSent__Group__3 )
            // InternalMyLanguage.g:4245:2: rule__DistanceToObstaclesSent__Group__2__Impl rule__DistanceToObstaclesSent__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyLanguage.g:4252:1: rule__DistanceToObstaclesSent__Group__2__Impl : ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) ) ;
    public final void rule__DistanceToObstaclesSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4256:1: ( ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) ) )
            // InternalMyLanguage.g:4257:1: ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) )
            {
            // InternalMyLanguage.g:4257:1: ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) )
            // InternalMyLanguage.g:4258:2: ( rule__DistanceToObstaclesSent__BodyAssignment_2 )
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAssignment_2()); 
            // InternalMyLanguage.g:4259:2: ( rule__DistanceToObstaclesSent__BodyAssignment_2 )
            // InternalMyLanguage.g:4259:3: rule__DistanceToObstaclesSent__BodyAssignment_2
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
    // InternalMyLanguage.g:4267:1: rule__DistanceToObstaclesSent__Group__3 : rule__DistanceToObstaclesSent__Group__3__Impl ;
    public final void rule__DistanceToObstaclesSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4271:1: ( rule__DistanceToObstaclesSent__Group__3__Impl )
            // InternalMyLanguage.g:4272:2: rule__DistanceToObstaclesSent__Group__3__Impl
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
    // InternalMyLanguage.g:4278:1: rule__DistanceToObstaclesSent__Group__3__Impl : ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? ) ;
    public final void rule__DistanceToObstaclesSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4282:1: ( ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? ) )
            // InternalMyLanguage.g:4283:1: ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? )
            {
            // InternalMyLanguage.g:4283:1: ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? )
            // InternalMyLanguage.g:4284:2: ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )?
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getToleranceAssignment_3()); 
            // InternalMyLanguage.g:4285:2: ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==68) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyLanguage.g:4285:3: rule__DistanceToObstaclesSent__ToleranceAssignment_3
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
    // InternalMyLanguage.g:4294:1: rule__EqualSent__Group__0 : rule__EqualSent__Group__0__Impl rule__EqualSent__Group__1 ;
    public final void rule__EqualSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4298:1: ( rule__EqualSent__Group__0__Impl rule__EqualSent__Group__1 )
            // InternalMyLanguage.g:4299:2: rule__EqualSent__Group__0__Impl rule__EqualSent__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyLanguage.g:4306:1: rule__EqualSent__Group__0__Impl : ( 'equal' ) ;
    public final void rule__EqualSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4310:1: ( ( 'equal' ) )
            // InternalMyLanguage.g:4311:1: ( 'equal' )
            {
            // InternalMyLanguage.g:4311:1: ( 'equal' )
            // InternalMyLanguage.g:4312:2: 'equal'
            {
             before(grammarAccess.getEqualSentAccess().getEqualKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyLanguage.g:4321:1: rule__EqualSent__Group__1 : rule__EqualSent__Group__1__Impl rule__EqualSent__Group__2 ;
    public final void rule__EqualSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4325:1: ( rule__EqualSent__Group__1__Impl rule__EqualSent__Group__2 )
            // InternalMyLanguage.g:4326:2: rule__EqualSent__Group__1__Impl rule__EqualSent__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyLanguage.g:4333:1: rule__EqualSent__Group__1__Impl : ( 'to' ) ;
    public final void rule__EqualSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4337:1: ( ( 'to' ) )
            // InternalMyLanguage.g:4338:1: ( 'to' )
            {
            // InternalMyLanguage.g:4338:1: ( 'to' )
            // InternalMyLanguage.g:4339:2: 'to'
            {
             before(grammarAccess.getEqualSentAccess().getToKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyLanguage.g:4348:1: rule__EqualSent__Group__2 : rule__EqualSent__Group__2__Impl ;
    public final void rule__EqualSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4352:1: ( rule__EqualSent__Group__2__Impl )
            // InternalMyLanguage.g:4353:2: rule__EqualSent__Group__2__Impl
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
    // InternalMyLanguage.g:4359:1: rule__EqualSent__Group__2__Impl : ( ( rule__EqualSent__AmountAssignment_2 ) ) ;
    public final void rule__EqualSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4363:1: ( ( ( rule__EqualSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:4364:1: ( ( rule__EqualSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:4364:1: ( ( rule__EqualSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:4365:2: ( rule__EqualSent__AmountAssignment_2 )
            {
             before(grammarAccess.getEqualSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:4366:2: ( rule__EqualSent__AmountAssignment_2 )
            // InternalMyLanguage.g:4366:3: rule__EqualSent__AmountAssignment_2
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
    // InternalMyLanguage.g:4375:1: rule__LessSent__Group__0 : rule__LessSent__Group__0__Impl rule__LessSent__Group__1 ;
    public final void rule__LessSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4379:1: ( rule__LessSent__Group__0__Impl rule__LessSent__Group__1 )
            // InternalMyLanguage.g:4380:2: rule__LessSent__Group__0__Impl rule__LessSent__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyLanguage.g:4387:1: rule__LessSent__Group__0__Impl : ( 'lower' ) ;
    public final void rule__LessSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4391:1: ( ( 'lower' ) )
            // InternalMyLanguage.g:4392:1: ( 'lower' )
            {
            // InternalMyLanguage.g:4392:1: ( 'lower' )
            // InternalMyLanguage.g:4393:2: 'lower'
            {
             before(grammarAccess.getLessSentAccess().getLowerKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyLanguage.g:4402:1: rule__LessSent__Group__1 : rule__LessSent__Group__1__Impl rule__LessSent__Group__2 ;
    public final void rule__LessSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4406:1: ( rule__LessSent__Group__1__Impl rule__LessSent__Group__2 )
            // InternalMyLanguage.g:4407:2: rule__LessSent__Group__1__Impl rule__LessSent__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyLanguage.g:4414:1: rule__LessSent__Group__1__Impl : ( 'then' ) ;
    public final void rule__LessSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4418:1: ( ( 'then' ) )
            // InternalMyLanguage.g:4419:1: ( 'then' )
            {
            // InternalMyLanguage.g:4419:1: ( 'then' )
            // InternalMyLanguage.g:4420:2: 'then'
            {
             before(grammarAccess.getLessSentAccess().getThenKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyLanguage.g:4429:1: rule__LessSent__Group__2 : rule__LessSent__Group__2__Impl ;
    public final void rule__LessSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4433:1: ( rule__LessSent__Group__2__Impl )
            // InternalMyLanguage.g:4434:2: rule__LessSent__Group__2__Impl
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
    // InternalMyLanguage.g:4440:1: rule__LessSent__Group__2__Impl : ( ( rule__LessSent__AmountAssignment_2 ) ) ;
    public final void rule__LessSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4444:1: ( ( ( rule__LessSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:4445:1: ( ( rule__LessSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:4445:1: ( ( rule__LessSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:4446:2: ( rule__LessSent__AmountAssignment_2 )
            {
             before(grammarAccess.getLessSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:4447:2: ( rule__LessSent__AmountAssignment_2 )
            // InternalMyLanguage.g:4447:3: rule__LessSent__AmountAssignment_2
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
    // InternalMyLanguage.g:4456:1: rule__GreaterSent__Group__0 : rule__GreaterSent__Group__0__Impl rule__GreaterSent__Group__1 ;
    public final void rule__GreaterSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4460:1: ( rule__GreaterSent__Group__0__Impl rule__GreaterSent__Group__1 )
            // InternalMyLanguage.g:4461:2: rule__GreaterSent__Group__0__Impl rule__GreaterSent__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyLanguage.g:4468:1: rule__GreaterSent__Group__0__Impl : ( 'greater' ) ;
    public final void rule__GreaterSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4472:1: ( ( 'greater' ) )
            // InternalMyLanguage.g:4473:1: ( 'greater' )
            {
            // InternalMyLanguage.g:4473:1: ( 'greater' )
            // InternalMyLanguage.g:4474:2: 'greater'
            {
             before(grammarAccess.getGreaterSentAccess().getGreaterKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyLanguage.g:4483:1: rule__GreaterSent__Group__1 : rule__GreaterSent__Group__1__Impl rule__GreaterSent__Group__2 ;
    public final void rule__GreaterSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4487:1: ( rule__GreaterSent__Group__1__Impl rule__GreaterSent__Group__2 )
            // InternalMyLanguage.g:4488:2: rule__GreaterSent__Group__1__Impl rule__GreaterSent__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyLanguage.g:4495:1: rule__GreaterSent__Group__1__Impl : ( 'then' ) ;
    public final void rule__GreaterSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4499:1: ( ( 'then' ) )
            // InternalMyLanguage.g:4500:1: ( 'then' )
            {
            // InternalMyLanguage.g:4500:1: ( 'then' )
            // InternalMyLanguage.g:4501:2: 'then'
            {
             before(grammarAccess.getGreaterSentAccess().getThenKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyLanguage.g:4510:1: rule__GreaterSent__Group__2 : rule__GreaterSent__Group__2__Impl ;
    public final void rule__GreaterSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4514:1: ( rule__GreaterSent__Group__2__Impl )
            // InternalMyLanguage.g:4515:2: rule__GreaterSent__Group__2__Impl
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
    // InternalMyLanguage.g:4521:1: rule__GreaterSent__Group__2__Impl : ( ( rule__GreaterSent__AmountAssignment_2 ) ) ;
    public final void rule__GreaterSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4525:1: ( ( ( rule__GreaterSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:4526:1: ( ( rule__GreaterSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:4526:1: ( ( rule__GreaterSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:4527:2: ( rule__GreaterSent__AmountAssignment_2 )
            {
             before(grammarAccess.getGreaterSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:4528:2: ( rule__GreaterSent__AmountAssignment_2 )
            // InternalMyLanguage.g:4528:3: rule__GreaterSent__AmountAssignment_2
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
    // InternalMyLanguage.g:4537:1: rule__RobotStateSent__Group__0 : rule__RobotStateSent__Group__0__Impl rule__RobotStateSent__Group__1 ;
    public final void rule__RobotStateSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4541:1: ( rule__RobotStateSent__Group__0__Impl rule__RobotStateSent__Group__1 )
            // InternalMyLanguage.g:4542:2: rule__RobotStateSent__Group__0__Impl rule__RobotStateSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:4549:1: rule__RobotStateSent__Group__0__Impl : ( 'state' ) ;
    public final void rule__RobotStateSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4553:1: ( ( 'state' ) )
            // InternalMyLanguage.g:4554:1: ( 'state' )
            {
            // InternalMyLanguage.g:4554:1: ( 'state' )
            // InternalMyLanguage.g:4555:2: 'state'
            {
             before(grammarAccess.getRobotStateSentAccess().getStateKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyLanguage.g:4564:1: rule__RobotStateSent__Group__1 : rule__RobotStateSent__Group__1__Impl rule__RobotStateSent__Group__2 ;
    public final void rule__RobotStateSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4568:1: ( rule__RobotStateSent__Group__1__Impl rule__RobotStateSent__Group__2 )
            // InternalMyLanguage.g:4569:2: rule__RobotStateSent__Group__1__Impl rule__RobotStateSent__Group__2
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
    // InternalMyLanguage.g:4576:1: rule__RobotStateSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotStateSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4580:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4581:1: ( 'is' )
            {
            // InternalMyLanguage.g:4581:1: ( 'is' )
            // InternalMyLanguage.g:4582:2: 'is'
            {
             before(grammarAccess.getRobotStateSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:4591:1: rule__RobotStateSent__Group__2 : rule__RobotStateSent__Group__2__Impl ;
    public final void rule__RobotStateSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4595:1: ( rule__RobotStateSent__Group__2__Impl )
            // InternalMyLanguage.g:4596:2: rule__RobotStateSent__Group__2__Impl
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
    // InternalMyLanguage.g:4602:1: rule__RobotStateSent__Group__2__Impl : ( ( rule__RobotStateSent__StateAssignment_2 ) ) ;
    public final void rule__RobotStateSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4606:1: ( ( ( rule__RobotStateSent__StateAssignment_2 ) ) )
            // InternalMyLanguage.g:4607:1: ( ( rule__RobotStateSent__StateAssignment_2 ) )
            {
            // InternalMyLanguage.g:4607:1: ( ( rule__RobotStateSent__StateAssignment_2 ) )
            // InternalMyLanguage.g:4608:2: ( rule__RobotStateSent__StateAssignment_2 )
            {
             before(grammarAccess.getRobotStateSentAccess().getStateAssignment_2()); 
            // InternalMyLanguage.g:4609:2: ( rule__RobotStateSent__StateAssignment_2 )
            // InternalMyLanguage.g:4609:3: rule__RobotStateSent__StateAssignment_2
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
    // InternalMyLanguage.g:4618:1: rule__RobotPositionSent__Group__0 : rule__RobotPositionSent__Group__0__Impl rule__RobotPositionSent__Group__1 ;
    public final void rule__RobotPositionSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4622:1: ( rule__RobotPositionSent__Group__0__Impl rule__RobotPositionSent__Group__1 )
            // InternalMyLanguage.g:4623:2: rule__RobotPositionSent__Group__0__Impl rule__RobotPositionSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:4630:1: rule__RobotPositionSent__Group__0__Impl : ( 'position' ) ;
    public final void rule__RobotPositionSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4634:1: ( ( 'position' ) )
            // InternalMyLanguage.g:4635:1: ( 'position' )
            {
            // InternalMyLanguage.g:4635:1: ( 'position' )
            // InternalMyLanguage.g:4636:2: 'position'
            {
             before(grammarAccess.getRobotPositionSentAccess().getPositionKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyLanguage.g:4645:1: rule__RobotPositionSent__Group__1 : rule__RobotPositionSent__Group__1__Impl rule__RobotPositionSent__Group__2 ;
    public final void rule__RobotPositionSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4649:1: ( rule__RobotPositionSent__Group__1__Impl rule__RobotPositionSent__Group__2 )
            // InternalMyLanguage.g:4650:2: rule__RobotPositionSent__Group__1__Impl rule__RobotPositionSent__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:4657:1: rule__RobotPositionSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotPositionSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4661:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4662:1: ( 'is' )
            {
            // InternalMyLanguage.g:4662:1: ( 'is' )
            // InternalMyLanguage.g:4663:2: 'is'
            {
             before(grammarAccess.getRobotPositionSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:4672:1: rule__RobotPositionSent__Group__2 : rule__RobotPositionSent__Group__2__Impl rule__RobotPositionSent__Group__3 ;
    public final void rule__RobotPositionSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4676:1: ( rule__RobotPositionSent__Group__2__Impl rule__RobotPositionSent__Group__3 )
            // InternalMyLanguage.g:4677:2: rule__RobotPositionSent__Group__2__Impl rule__RobotPositionSent__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:4684:1: rule__RobotPositionSent__Group__2__Impl : ( ( rule__RobotPositionSent__PosXAssignment_2 ) ) ;
    public final void rule__RobotPositionSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4688:1: ( ( ( rule__RobotPositionSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:4689:1: ( ( rule__RobotPositionSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:4689:1: ( ( rule__RobotPositionSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:4690:2: ( rule__RobotPositionSent__PosXAssignment_2 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:4691:2: ( rule__RobotPositionSent__PosXAssignment_2 )
            // InternalMyLanguage.g:4691:3: rule__RobotPositionSent__PosXAssignment_2
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
    // InternalMyLanguage.g:4699:1: rule__RobotPositionSent__Group__3 : rule__RobotPositionSent__Group__3__Impl rule__RobotPositionSent__Group__4 ;
    public final void rule__RobotPositionSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4703:1: ( rule__RobotPositionSent__Group__3__Impl rule__RobotPositionSent__Group__4 )
            // InternalMyLanguage.g:4704:2: rule__RobotPositionSent__Group__3__Impl rule__RobotPositionSent__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:4711:1: rule__RobotPositionSent__Group__3__Impl : ( ( rule__RobotPositionSent__PosYAssignment_3 ) ) ;
    public final void rule__RobotPositionSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4715:1: ( ( ( rule__RobotPositionSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:4716:1: ( ( rule__RobotPositionSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:4716:1: ( ( rule__RobotPositionSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:4717:2: ( rule__RobotPositionSent__PosYAssignment_3 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:4718:2: ( rule__RobotPositionSent__PosYAssignment_3 )
            // InternalMyLanguage.g:4718:3: rule__RobotPositionSent__PosYAssignment_3
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
    // InternalMyLanguage.g:4726:1: rule__RobotPositionSent__Group__4 : rule__RobotPositionSent__Group__4__Impl rule__RobotPositionSent__Group__5 ;
    public final void rule__RobotPositionSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4730:1: ( rule__RobotPositionSent__Group__4__Impl rule__RobotPositionSent__Group__5 )
            // InternalMyLanguage.g:4731:2: rule__RobotPositionSent__Group__4__Impl rule__RobotPositionSent__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyLanguage.g:4738:1: rule__RobotPositionSent__Group__4__Impl : ( ( rule__RobotPositionSent__PosZAssignment_4 ) ) ;
    public final void rule__RobotPositionSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4742:1: ( ( ( rule__RobotPositionSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:4743:1: ( ( rule__RobotPositionSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:4743:1: ( ( rule__RobotPositionSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:4744:2: ( rule__RobotPositionSent__PosZAssignment_4 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:4745:2: ( rule__RobotPositionSent__PosZAssignment_4 )
            // InternalMyLanguage.g:4745:3: rule__RobotPositionSent__PosZAssignment_4
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
    // InternalMyLanguage.g:4753:1: rule__RobotPositionSent__Group__5 : rule__RobotPositionSent__Group__5__Impl ;
    public final void rule__RobotPositionSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4757:1: ( rule__RobotPositionSent__Group__5__Impl )
            // InternalMyLanguage.g:4758:2: rule__RobotPositionSent__Group__5__Impl
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
    // InternalMyLanguage.g:4764:1: rule__RobotPositionSent__Group__5__Impl : ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? ) ;
    public final void rule__RobotPositionSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4768:1: ( ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:4769:1: ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:4769:1: ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:4770:2: ( rule__RobotPositionSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getRobotPositionSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:4771:2: ( rule__RobotPositionSent__ToleranceAssignment_5 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==66) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyLanguage.g:4771:3: rule__RobotPositionSent__ToleranceAssignment_5
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
    // InternalMyLanguage.g:4780:1: rule__CirclePosition__Group__0 : rule__CirclePosition__Group__0__Impl rule__CirclePosition__Group__1 ;
    public final void rule__CirclePosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4784:1: ( rule__CirclePosition__Group__0__Impl rule__CirclePosition__Group__1 )
            // InternalMyLanguage.g:4785:2: rule__CirclePosition__Group__0__Impl rule__CirclePosition__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyLanguage.g:4792:1: rule__CirclePosition__Group__0__Impl : ( 'within' ) ;
    public final void rule__CirclePosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4796:1: ( ( 'within' ) )
            // InternalMyLanguage.g:4797:1: ( 'within' )
            {
            // InternalMyLanguage.g:4797:1: ( 'within' )
            // InternalMyLanguage.g:4798:2: 'within'
            {
             before(grammarAccess.getCirclePositionAccess().getWithinKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyLanguage.g:4807:1: rule__CirclePosition__Group__1 : rule__CirclePosition__Group__1__Impl rule__CirclePosition__Group__2 ;
    public final void rule__CirclePosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4811:1: ( rule__CirclePosition__Group__1__Impl rule__CirclePosition__Group__2 )
            // InternalMyLanguage.g:4812:2: rule__CirclePosition__Group__1__Impl rule__CirclePosition__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyLanguage.g:4819:1: rule__CirclePosition__Group__1__Impl : ( 'circle' ) ;
    public final void rule__CirclePosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4823:1: ( ( 'circle' ) )
            // InternalMyLanguage.g:4824:1: ( 'circle' )
            {
            // InternalMyLanguage.g:4824:1: ( 'circle' )
            // InternalMyLanguage.g:4825:2: 'circle'
            {
             before(grammarAccess.getCirclePositionAccess().getCircleKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyLanguage.g:4834:1: rule__CirclePosition__Group__2 : rule__CirclePosition__Group__2__Impl rule__CirclePosition__Group__3 ;
    public final void rule__CirclePosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4838:1: ( rule__CirclePosition__Group__2__Impl rule__CirclePosition__Group__3 )
            // InternalMyLanguage.g:4839:2: rule__CirclePosition__Group__2__Impl rule__CirclePosition__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyLanguage.g:4846:1: rule__CirclePosition__Group__2__Impl : ( 'with' ) ;
    public final void rule__CirclePosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4850:1: ( ( 'with' ) )
            // InternalMyLanguage.g:4851:1: ( 'with' )
            {
            // InternalMyLanguage.g:4851:1: ( 'with' )
            // InternalMyLanguage.g:4852:2: 'with'
            {
             before(grammarAccess.getCirclePositionAccess().getWithKeyword_2()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyLanguage.g:4861:1: rule__CirclePosition__Group__3 : rule__CirclePosition__Group__3__Impl rule__CirclePosition__Group__4 ;
    public final void rule__CirclePosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4865:1: ( rule__CirclePosition__Group__3__Impl rule__CirclePosition__Group__4 )
            // InternalMyLanguage.g:4866:2: rule__CirclePosition__Group__3__Impl rule__CirclePosition__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyLanguage.g:4873:1: rule__CirclePosition__Group__3__Impl : ( 'radius' ) ;
    public final void rule__CirclePosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4877:1: ( ( 'radius' ) )
            // InternalMyLanguage.g:4878:1: ( 'radius' )
            {
            // InternalMyLanguage.g:4878:1: ( 'radius' )
            // InternalMyLanguage.g:4879:2: 'radius'
            {
             before(grammarAccess.getCirclePositionAccess().getRadiusKeyword_3()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMyLanguage.g:4888:1: rule__CirclePosition__Group__4 : rule__CirclePosition__Group__4__Impl ;
    public final void rule__CirclePosition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4892:1: ( rule__CirclePosition__Group__4__Impl )
            // InternalMyLanguage.g:4893:2: rule__CirclePosition__Group__4__Impl
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
    // InternalMyLanguage.g:4899:1: rule__CirclePosition__Group__4__Impl : ( ( rule__CirclePosition__ToleranceAssignment_4 ) ) ;
    public final void rule__CirclePosition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4903:1: ( ( ( rule__CirclePosition__ToleranceAssignment_4 ) ) )
            // InternalMyLanguage.g:4904:1: ( ( rule__CirclePosition__ToleranceAssignment_4 ) )
            {
            // InternalMyLanguage.g:4904:1: ( ( rule__CirclePosition__ToleranceAssignment_4 ) )
            // InternalMyLanguage.g:4905:2: ( rule__CirclePosition__ToleranceAssignment_4 )
            {
             before(grammarAccess.getCirclePositionAccess().getToleranceAssignment_4()); 
            // InternalMyLanguage.g:4906:2: ( rule__CirclePosition__ToleranceAssignment_4 )
            // InternalMyLanguage.g:4906:3: rule__CirclePosition__ToleranceAssignment_4
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
    // InternalMyLanguage.g:4915:1: rule__SpherePosition__Group__0 : rule__SpherePosition__Group__0__Impl rule__SpherePosition__Group__1 ;
    public final void rule__SpherePosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4919:1: ( rule__SpherePosition__Group__0__Impl rule__SpherePosition__Group__1 )
            // InternalMyLanguage.g:4920:2: rule__SpherePosition__Group__0__Impl rule__SpherePosition__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyLanguage.g:4927:1: rule__SpherePosition__Group__0__Impl : ( 'within' ) ;
    public final void rule__SpherePosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4931:1: ( ( 'within' ) )
            // InternalMyLanguage.g:4932:1: ( 'within' )
            {
            // InternalMyLanguage.g:4932:1: ( 'within' )
            // InternalMyLanguage.g:4933:2: 'within'
            {
             before(grammarAccess.getSpherePositionAccess().getWithinKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyLanguage.g:4942:1: rule__SpherePosition__Group__1 : rule__SpherePosition__Group__1__Impl rule__SpherePosition__Group__2 ;
    public final void rule__SpherePosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4946:1: ( rule__SpherePosition__Group__1__Impl rule__SpherePosition__Group__2 )
            // InternalMyLanguage.g:4947:2: rule__SpherePosition__Group__1__Impl rule__SpherePosition__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyLanguage.g:4954:1: rule__SpherePosition__Group__1__Impl : ( 'sphere' ) ;
    public final void rule__SpherePosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4958:1: ( ( 'sphere' ) )
            // InternalMyLanguage.g:4959:1: ( 'sphere' )
            {
            // InternalMyLanguage.g:4959:1: ( 'sphere' )
            // InternalMyLanguage.g:4960:2: 'sphere'
            {
             before(grammarAccess.getSpherePositionAccess().getSphereKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMyLanguage.g:4969:1: rule__SpherePosition__Group__2 : rule__SpherePosition__Group__2__Impl rule__SpherePosition__Group__3 ;
    public final void rule__SpherePosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4973:1: ( rule__SpherePosition__Group__2__Impl rule__SpherePosition__Group__3 )
            // InternalMyLanguage.g:4974:2: rule__SpherePosition__Group__2__Impl rule__SpherePosition__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyLanguage.g:4981:1: rule__SpherePosition__Group__2__Impl : ( 'with' ) ;
    public final void rule__SpherePosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4985:1: ( ( 'with' ) )
            // InternalMyLanguage.g:4986:1: ( 'with' )
            {
            // InternalMyLanguage.g:4986:1: ( 'with' )
            // InternalMyLanguage.g:4987:2: 'with'
            {
             before(grammarAccess.getSpherePositionAccess().getWithKeyword_2()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyLanguage.g:4996:1: rule__SpherePosition__Group__3 : rule__SpherePosition__Group__3__Impl rule__SpherePosition__Group__4 ;
    public final void rule__SpherePosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5000:1: ( rule__SpherePosition__Group__3__Impl rule__SpherePosition__Group__4 )
            // InternalMyLanguage.g:5001:2: rule__SpherePosition__Group__3__Impl rule__SpherePosition__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyLanguage.g:5008:1: rule__SpherePosition__Group__3__Impl : ( 'radius' ) ;
    public final void rule__SpherePosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5012:1: ( ( 'radius' ) )
            // InternalMyLanguage.g:5013:1: ( 'radius' )
            {
            // InternalMyLanguage.g:5013:1: ( 'radius' )
            // InternalMyLanguage.g:5014:2: 'radius'
            {
             before(grammarAccess.getSpherePositionAccess().getRadiusKeyword_3()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMyLanguage.g:5023:1: rule__SpherePosition__Group__4 : rule__SpherePosition__Group__4__Impl ;
    public final void rule__SpherePosition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5027:1: ( rule__SpherePosition__Group__4__Impl )
            // InternalMyLanguage.g:5028:2: rule__SpherePosition__Group__4__Impl
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
    // InternalMyLanguage.g:5034:1: rule__SpherePosition__Group__4__Impl : ( ( rule__SpherePosition__ToleranceAssignment_4 ) ) ;
    public final void rule__SpherePosition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5038:1: ( ( ( rule__SpherePosition__ToleranceAssignment_4 ) ) )
            // InternalMyLanguage.g:5039:1: ( ( rule__SpherePosition__ToleranceAssignment_4 ) )
            {
            // InternalMyLanguage.g:5039:1: ( ( rule__SpherePosition__ToleranceAssignment_4 ) )
            // InternalMyLanguage.g:5040:2: ( rule__SpherePosition__ToleranceAssignment_4 )
            {
             before(grammarAccess.getSpherePositionAccess().getToleranceAssignment_4()); 
            // InternalMyLanguage.g:5041:2: ( rule__SpherePosition__ToleranceAssignment_4 )
            // InternalMyLanguage.g:5041:3: rule__SpherePosition__ToleranceAssignment_4
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
    // InternalMyLanguage.g:5050:1: rule__RobotSpeedSent__Group__0 : rule__RobotSpeedSent__Group__0__Impl rule__RobotSpeedSent__Group__1 ;
    public final void rule__RobotSpeedSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5054:1: ( rule__RobotSpeedSent__Group__0__Impl rule__RobotSpeedSent__Group__1 )
            // InternalMyLanguage.g:5055:2: rule__RobotSpeedSent__Group__0__Impl rule__RobotSpeedSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:5062:1: rule__RobotSpeedSent__Group__0__Impl : ( 'speed' ) ;
    public final void rule__RobotSpeedSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5066:1: ( ( 'speed' ) )
            // InternalMyLanguage.g:5067:1: ( 'speed' )
            {
            // InternalMyLanguage.g:5067:1: ( 'speed' )
            // InternalMyLanguage.g:5068:2: 'speed'
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedKeyword_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMyLanguage.g:5077:1: rule__RobotSpeedSent__Group__1 : rule__RobotSpeedSent__Group__1__Impl rule__RobotSpeedSent__Group__2 ;
    public final void rule__RobotSpeedSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5081:1: ( rule__RobotSpeedSent__Group__1__Impl rule__RobotSpeedSent__Group__2 )
            // InternalMyLanguage.g:5082:2: rule__RobotSpeedSent__Group__1__Impl rule__RobotSpeedSent__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:5089:1: rule__RobotSpeedSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotSpeedSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5093:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5094:1: ( 'is' )
            {
            // InternalMyLanguage.g:5094:1: ( 'is' )
            // InternalMyLanguage.g:5095:2: 'is'
            {
             before(grammarAccess.getRobotSpeedSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:5104:1: rule__RobotSpeedSent__Group__2 : rule__RobotSpeedSent__Group__2__Impl rule__RobotSpeedSent__Group__3 ;
    public final void rule__RobotSpeedSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5108:1: ( rule__RobotSpeedSent__Group__2__Impl rule__RobotSpeedSent__Group__3 )
            // InternalMyLanguage.g:5109:2: rule__RobotSpeedSent__Group__2__Impl rule__RobotSpeedSent__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:5116:1: rule__RobotSpeedSent__Group__2__Impl : ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) ) ;
    public final void rule__RobotSpeedSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5120:1: ( ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) ) )
            // InternalMyLanguage.g:5121:1: ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) )
            {
            // InternalMyLanguage.g:5121:1: ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) )
            // InternalMyLanguage.g:5122:2: ( rule__RobotSpeedSent__SpeedXAssignment_2 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedXAssignment_2()); 
            // InternalMyLanguage.g:5123:2: ( rule__RobotSpeedSent__SpeedXAssignment_2 )
            // InternalMyLanguage.g:5123:3: rule__RobotSpeedSent__SpeedXAssignment_2
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
    // InternalMyLanguage.g:5131:1: rule__RobotSpeedSent__Group__3 : rule__RobotSpeedSent__Group__3__Impl rule__RobotSpeedSent__Group__4 ;
    public final void rule__RobotSpeedSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5135:1: ( rule__RobotSpeedSent__Group__3__Impl rule__RobotSpeedSent__Group__4 )
            // InternalMyLanguage.g:5136:2: rule__RobotSpeedSent__Group__3__Impl rule__RobotSpeedSent__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:5143:1: rule__RobotSpeedSent__Group__3__Impl : ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) ) ;
    public final void rule__RobotSpeedSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5147:1: ( ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) ) )
            // InternalMyLanguage.g:5148:1: ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) )
            {
            // InternalMyLanguage.g:5148:1: ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) )
            // InternalMyLanguage.g:5149:2: ( rule__RobotSpeedSent__SpeedYAssignment_3 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedYAssignment_3()); 
            // InternalMyLanguage.g:5150:2: ( rule__RobotSpeedSent__SpeedYAssignment_3 )
            // InternalMyLanguage.g:5150:3: rule__RobotSpeedSent__SpeedYAssignment_3
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
    // InternalMyLanguage.g:5158:1: rule__RobotSpeedSent__Group__4 : rule__RobotSpeedSent__Group__4__Impl ;
    public final void rule__RobotSpeedSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5162:1: ( rule__RobotSpeedSent__Group__4__Impl )
            // InternalMyLanguage.g:5163:2: rule__RobotSpeedSent__Group__4__Impl
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
    // InternalMyLanguage.g:5169:1: rule__RobotSpeedSent__Group__4__Impl : ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) ) ;
    public final void rule__RobotSpeedSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5173:1: ( ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) ) )
            // InternalMyLanguage.g:5174:1: ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) )
            {
            // InternalMyLanguage.g:5174:1: ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) )
            // InternalMyLanguage.g:5175:2: ( rule__RobotSpeedSent__SpeedZAssignment_4 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedZAssignment_4()); 
            // InternalMyLanguage.g:5176:2: ( rule__RobotSpeedSent__SpeedZAssignment_4 )
            // InternalMyLanguage.g:5176:3: rule__RobotSpeedSent__SpeedZAssignment_4
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
    // InternalMyLanguage.g:5185:1: rule__EnvironmentSent__Group__0 : rule__EnvironmentSent__Group__0__Impl rule__EnvironmentSent__Group__1 ;
    public final void rule__EnvironmentSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5189:1: ( rule__EnvironmentSent__Group__0__Impl rule__EnvironmentSent__Group__1 )
            // InternalMyLanguage.g:5190:2: rule__EnvironmentSent__Group__0__Impl rule__EnvironmentSent__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyLanguage.g:5197:1: rule__EnvironmentSent__Group__0__Impl : ( 'Environment' ) ;
    public final void rule__EnvironmentSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5201:1: ( ( 'Environment' ) )
            // InternalMyLanguage.g:5202:1: ( 'Environment' )
            {
            // InternalMyLanguage.g:5202:1: ( 'Environment' )
            // InternalMyLanguage.g:5203:2: 'Environment'
            {
             before(grammarAccess.getEnvironmentSentAccess().getEnvironmentKeyword_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalMyLanguage.g:5212:1: rule__EnvironmentSent__Group__1 : rule__EnvironmentSent__Group__1__Impl rule__EnvironmentSent__Group__2 ;
    public final void rule__EnvironmentSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5216:1: ( rule__EnvironmentSent__Group__1__Impl rule__EnvironmentSent__Group__2 )
            // InternalMyLanguage.g:5217:2: rule__EnvironmentSent__Group__1__Impl rule__EnvironmentSent__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:5224:1: rule__EnvironmentSent__Group__1__Impl : ( 'windspeed' ) ;
    public final void rule__EnvironmentSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5228:1: ( ( 'windspeed' ) )
            // InternalMyLanguage.g:5229:1: ( 'windspeed' )
            {
            // InternalMyLanguage.g:5229:1: ( 'windspeed' )
            // InternalMyLanguage.g:5230:2: 'windspeed'
            {
             before(grammarAccess.getEnvironmentSentAccess().getWindspeedKeyword_1()); 
            match(input,73,FOLLOW_2); 
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
    // InternalMyLanguage.g:5239:1: rule__EnvironmentSent__Group__2 : rule__EnvironmentSent__Group__2__Impl rule__EnvironmentSent__Group__3 ;
    public final void rule__EnvironmentSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5243:1: ( rule__EnvironmentSent__Group__2__Impl rule__EnvironmentSent__Group__3 )
            // InternalMyLanguage.g:5244:2: rule__EnvironmentSent__Group__2__Impl rule__EnvironmentSent__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyLanguage.g:5251:1: rule__EnvironmentSent__Group__2__Impl : ( 'is' ) ;
    public final void rule__EnvironmentSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5255:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5256:1: ( 'is' )
            {
            // InternalMyLanguage.g:5256:1: ( 'is' )
            // InternalMyLanguage.g:5257:2: 'is'
            {
             before(grammarAccess.getEnvironmentSentAccess().getIsKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:5266:1: rule__EnvironmentSent__Group__3 : rule__EnvironmentSent__Group__3__Impl ;
    public final void rule__EnvironmentSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5270:1: ( rule__EnvironmentSent__Group__3__Impl )
            // InternalMyLanguage.g:5271:2: rule__EnvironmentSent__Group__3__Impl
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
    // InternalMyLanguage.g:5277:1: rule__EnvironmentSent__Group__3__Impl : ( ( rule__EnvironmentSent__BodyAssignment_3 ) ) ;
    public final void rule__EnvironmentSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5281:1: ( ( ( rule__EnvironmentSent__BodyAssignment_3 ) ) )
            // InternalMyLanguage.g:5282:1: ( ( rule__EnvironmentSent__BodyAssignment_3 ) )
            {
            // InternalMyLanguage.g:5282:1: ( ( rule__EnvironmentSent__BodyAssignment_3 ) )
            // InternalMyLanguage.g:5283:2: ( rule__EnvironmentSent__BodyAssignment_3 )
            {
             before(grammarAccess.getEnvironmentSentAccess().getBodyAssignment_3()); 
            // InternalMyLanguage.g:5284:2: ( rule__EnvironmentSent__BodyAssignment_3 )
            // InternalMyLanguage.g:5284:3: rule__EnvironmentSent__BodyAssignment_3
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


    // $ANTLR start "rule__FailingComponentSent__Group__0"
    // InternalMyLanguage.g:5293:1: rule__FailingComponentSent__Group__0 : rule__FailingComponentSent__Group__0__Impl rule__FailingComponentSent__Group__1 ;
    public final void rule__FailingComponentSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5297:1: ( rule__FailingComponentSent__Group__0__Impl rule__FailingComponentSent__Group__1 )
            // InternalMyLanguage.g:5298:2: rule__FailingComponentSent__Group__0__Impl rule__FailingComponentSent__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__FailingComponentSent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FailingComponentSent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailingComponentSent__Group__0"


    // $ANTLR start "rule__FailingComponentSent__Group__0__Impl"
    // InternalMyLanguage.g:5305:1: rule__FailingComponentSent__Group__0__Impl : ( ( rule__FailingComponentSent__ComponentAssignment_0 ) ) ;
    public final void rule__FailingComponentSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5309:1: ( ( ( rule__FailingComponentSent__ComponentAssignment_0 ) ) )
            // InternalMyLanguage.g:5310:1: ( ( rule__FailingComponentSent__ComponentAssignment_0 ) )
            {
            // InternalMyLanguage.g:5310:1: ( ( rule__FailingComponentSent__ComponentAssignment_0 ) )
            // InternalMyLanguage.g:5311:2: ( rule__FailingComponentSent__ComponentAssignment_0 )
            {
             before(grammarAccess.getFailingComponentSentAccess().getComponentAssignment_0()); 
            // InternalMyLanguage.g:5312:2: ( rule__FailingComponentSent__ComponentAssignment_0 )
            // InternalMyLanguage.g:5312:3: rule__FailingComponentSent__ComponentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FailingComponentSent__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFailingComponentSentAccess().getComponentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailingComponentSent__Group__0__Impl"


    // $ANTLR start "rule__FailingComponentSent__Group__1"
    // InternalMyLanguage.g:5320:1: rule__FailingComponentSent__Group__1 : rule__FailingComponentSent__Group__1__Impl ;
    public final void rule__FailingComponentSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5324:1: ( rule__FailingComponentSent__Group__1__Impl )
            // InternalMyLanguage.g:5325:2: rule__FailingComponentSent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FailingComponentSent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailingComponentSent__Group__1"


    // $ANTLR start "rule__FailingComponentSent__Group__1__Impl"
    // InternalMyLanguage.g:5331:1: rule__FailingComponentSent__Group__1__Impl : ( 'fails' ) ;
    public final void rule__FailingComponentSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5335:1: ( ( 'fails' ) )
            // InternalMyLanguage.g:5336:1: ( 'fails' )
            {
            // InternalMyLanguage.g:5336:1: ( 'fails' )
            // InternalMyLanguage.g:5337:2: 'fails'
            {
             before(grammarAccess.getFailingComponentSentAccess().getFailsKeyword_1()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getFailingComponentSentAccess().getFailsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailingComponentSent__Group__1__Impl"


    // $ANTLR start "rule__RiskSent__Group__0"
    // InternalMyLanguage.g:5347:1: rule__RiskSent__Group__0 : rule__RiskSent__Group__0__Impl rule__RiskSent__Group__1 ;
    public final void rule__RiskSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5351:1: ( rule__RiskSent__Group__0__Impl rule__RiskSent__Group__1 )
            // InternalMyLanguage.g:5352:2: rule__RiskSent__Group__0__Impl rule__RiskSent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyLanguage.g:5359:1: rule__RiskSent__Group__0__Impl : ( 'collisionrisk' ) ;
    public final void rule__RiskSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5363:1: ( ( 'collisionrisk' ) )
            // InternalMyLanguage.g:5364:1: ( 'collisionrisk' )
            {
            // InternalMyLanguage.g:5364:1: ( 'collisionrisk' )
            // InternalMyLanguage.g:5365:2: 'collisionrisk'
            {
             before(grammarAccess.getRiskSentAccess().getCollisionriskKeyword_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalMyLanguage.g:5374:1: rule__RiskSent__Group__1 : rule__RiskSent__Group__1__Impl rule__RiskSent__Group__2 ;
    public final void rule__RiskSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5378:1: ( rule__RiskSent__Group__1__Impl rule__RiskSent__Group__2 )
            // InternalMyLanguage.g:5379:2: rule__RiskSent__Group__1__Impl rule__RiskSent__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyLanguage.g:5386:1: rule__RiskSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RiskSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5390:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5391:1: ( 'is' )
            {
            // InternalMyLanguage.g:5391:1: ( 'is' )
            // InternalMyLanguage.g:5392:2: 'is'
            {
             before(grammarAccess.getRiskSentAccess().getIsKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyLanguage.g:5401:1: rule__RiskSent__Group__2 : rule__RiskSent__Group__2__Impl ;
    public final void rule__RiskSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5405:1: ( rule__RiskSent__Group__2__Impl )
            // InternalMyLanguage.g:5406:2: rule__RiskSent__Group__2__Impl
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
    // InternalMyLanguage.g:5412:1: rule__RiskSent__Group__2__Impl : ( ( rule__RiskSent__LevelAssignment_2 ) ) ;
    public final void rule__RiskSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5416:1: ( ( ( rule__RiskSent__LevelAssignment_2 ) ) )
            // InternalMyLanguage.g:5417:1: ( ( rule__RiskSent__LevelAssignment_2 ) )
            {
            // InternalMyLanguage.g:5417:1: ( ( rule__RiskSent__LevelAssignment_2 ) )
            // InternalMyLanguage.g:5418:2: ( rule__RiskSent__LevelAssignment_2 )
            {
             before(grammarAccess.getRiskSentAccess().getLevelAssignment_2()); 
            // InternalMyLanguage.g:5419:2: ( rule__RiskSent__LevelAssignment_2 )
            // InternalMyLanguage.g:5419:3: rule__RiskSent__LevelAssignment_2
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
    // InternalMyLanguage.g:5428:1: rule__ToleranceSent__Group__0 : rule__ToleranceSent__Group__0__Impl rule__ToleranceSent__Group__1 ;
    public final void rule__ToleranceSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5432:1: ( rule__ToleranceSent__Group__0__Impl rule__ToleranceSent__Group__1 )
            // InternalMyLanguage.g:5433:2: rule__ToleranceSent__Group__0__Impl rule__ToleranceSent__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyLanguage.g:5440:1: rule__ToleranceSent__Group__0__Impl : ( 'with' ) ;
    public final void rule__ToleranceSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5444:1: ( ( 'with' ) )
            // InternalMyLanguage.g:5445:1: ( 'with' )
            {
            // InternalMyLanguage.g:5445:1: ( 'with' )
            // InternalMyLanguage.g:5446:2: 'with'
            {
             before(grammarAccess.getToleranceSentAccess().getWithKeyword_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyLanguage.g:5455:1: rule__ToleranceSent__Group__1 : rule__ToleranceSent__Group__1__Impl rule__ToleranceSent__Group__2 ;
    public final void rule__ToleranceSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5459:1: ( rule__ToleranceSent__Group__1__Impl rule__ToleranceSent__Group__2 )
            // InternalMyLanguage.g:5460:2: rule__ToleranceSent__Group__1__Impl rule__ToleranceSent__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyLanguage.g:5467:1: rule__ToleranceSent__Group__1__Impl : ( 'tolerance' ) ;
    public final void rule__ToleranceSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5471:1: ( ( 'tolerance' ) )
            // InternalMyLanguage.g:5472:1: ( 'tolerance' )
            {
            // InternalMyLanguage.g:5472:1: ( 'tolerance' )
            // InternalMyLanguage.g:5473:2: 'tolerance'
            {
             before(grammarAccess.getToleranceSentAccess().getToleranceKeyword_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyLanguage.g:5482:1: rule__ToleranceSent__Group__2 : rule__ToleranceSent__Group__2__Impl ;
    public final void rule__ToleranceSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5486:1: ( rule__ToleranceSent__Group__2__Impl )
            // InternalMyLanguage.g:5487:2: rule__ToleranceSent__Group__2__Impl
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
    // InternalMyLanguage.g:5493:1: rule__ToleranceSent__Group__2__Impl : ( ( rule__ToleranceSent__UnitAssignment_2 ) ) ;
    public final void rule__ToleranceSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5497:1: ( ( ( rule__ToleranceSent__UnitAssignment_2 ) ) )
            // InternalMyLanguage.g:5498:1: ( ( rule__ToleranceSent__UnitAssignment_2 ) )
            {
            // InternalMyLanguage.g:5498:1: ( ( rule__ToleranceSent__UnitAssignment_2 ) )
            // InternalMyLanguage.g:5499:2: ( rule__ToleranceSent__UnitAssignment_2 )
            {
             before(grammarAccess.getToleranceSentAccess().getUnitAssignment_2()); 
            // InternalMyLanguage.g:5500:2: ( rule__ToleranceSent__UnitAssignment_2 )
            // InternalMyLanguage.g:5500:3: rule__ToleranceSent__UnitAssignment_2
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
    // InternalMyLanguage.g:5509:1: rule__SECONDS__Group__0 : rule__SECONDS__Group__0__Impl rule__SECONDS__Group__1 ;
    public final void rule__SECONDS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5513:1: ( rule__SECONDS__Group__0__Impl rule__SECONDS__Group__1 )
            // InternalMyLanguage.g:5514:2: rule__SECONDS__Group__0__Impl rule__SECONDS__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:5521:1: rule__SECONDS__Group__0__Impl : ( 'seconds(' ) ;
    public final void rule__SECONDS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5525:1: ( ( 'seconds(' ) )
            // InternalMyLanguage.g:5526:1: ( 'seconds(' )
            {
            // InternalMyLanguage.g:5526:1: ( 'seconds(' )
            // InternalMyLanguage.g:5527:2: 'seconds('
            {
             before(grammarAccess.getSECONDSAccess().getSecondsKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalMyLanguage.g:5536:1: rule__SECONDS__Group__1 : rule__SECONDS__Group__1__Impl rule__SECONDS__Group__2 ;
    public final void rule__SECONDS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5540:1: ( rule__SECONDS__Group__1__Impl rule__SECONDS__Group__2 )
            // InternalMyLanguage.g:5541:2: rule__SECONDS__Group__1__Impl rule__SECONDS__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyLanguage.g:5548:1: rule__SECONDS__Group__1__Impl : ( ( rule__SECONDS__ValueAssignment_1 ) ) ;
    public final void rule__SECONDS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5552:1: ( ( ( rule__SECONDS__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5553:1: ( ( rule__SECONDS__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5553:1: ( ( rule__SECONDS__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5554:2: ( rule__SECONDS__ValueAssignment_1 )
            {
             before(grammarAccess.getSECONDSAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5555:2: ( rule__SECONDS__ValueAssignment_1 )
            // InternalMyLanguage.g:5555:3: rule__SECONDS__ValueAssignment_1
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
    // InternalMyLanguage.g:5563:1: rule__SECONDS__Group__2 : rule__SECONDS__Group__2__Impl ;
    public final void rule__SECONDS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5567:1: ( rule__SECONDS__Group__2__Impl )
            // InternalMyLanguage.g:5568:2: rule__SECONDS__Group__2__Impl
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
    // InternalMyLanguage.g:5574:1: rule__SECONDS__Group__2__Impl : ( ')' ) ;
    public final void rule__SECONDS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5578:1: ( ( ')' ) )
            // InternalMyLanguage.g:5579:1: ( ')' )
            {
            // InternalMyLanguage.g:5579:1: ( ')' )
            // InternalMyLanguage.g:5580:2: ')'
            {
             before(grammarAccess.getSECONDSAccess().getRightParenthesisKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyLanguage.g:5590:1: rule__HOUR__Group__0 : rule__HOUR__Group__0__Impl rule__HOUR__Group__1 ;
    public final void rule__HOUR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5594:1: ( rule__HOUR__Group__0__Impl rule__HOUR__Group__1 )
            // InternalMyLanguage.g:5595:2: rule__HOUR__Group__0__Impl rule__HOUR__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:5602:1: rule__HOUR__Group__0__Impl : ( 'hours(' ) ;
    public final void rule__HOUR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5606:1: ( ( 'hours(' ) )
            // InternalMyLanguage.g:5607:1: ( 'hours(' )
            {
            // InternalMyLanguage.g:5607:1: ( 'hours(' )
            // InternalMyLanguage.g:5608:2: 'hours('
            {
             before(grammarAccess.getHOURAccess().getHoursKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalMyLanguage.g:5617:1: rule__HOUR__Group__1 : rule__HOUR__Group__1__Impl rule__HOUR__Group__2 ;
    public final void rule__HOUR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5621:1: ( rule__HOUR__Group__1__Impl rule__HOUR__Group__2 )
            // InternalMyLanguage.g:5622:2: rule__HOUR__Group__1__Impl rule__HOUR__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyLanguage.g:5629:1: rule__HOUR__Group__1__Impl : ( ( rule__HOUR__ValueAssignment_1 ) ) ;
    public final void rule__HOUR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5633:1: ( ( ( rule__HOUR__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5634:1: ( ( rule__HOUR__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5634:1: ( ( rule__HOUR__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5635:2: ( rule__HOUR__ValueAssignment_1 )
            {
             before(grammarAccess.getHOURAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5636:2: ( rule__HOUR__ValueAssignment_1 )
            // InternalMyLanguage.g:5636:3: rule__HOUR__ValueAssignment_1
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
    // InternalMyLanguage.g:5644:1: rule__HOUR__Group__2 : rule__HOUR__Group__2__Impl ;
    public final void rule__HOUR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5648:1: ( rule__HOUR__Group__2__Impl )
            // InternalMyLanguage.g:5649:2: rule__HOUR__Group__2__Impl
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
    // InternalMyLanguage.g:5655:1: rule__HOUR__Group__2__Impl : ( ')' ) ;
    public final void rule__HOUR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5659:1: ( ( ')' ) )
            // InternalMyLanguage.g:5660:1: ( ')' )
            {
            // InternalMyLanguage.g:5660:1: ( ')' )
            // InternalMyLanguage.g:5661:2: ')'
            {
             before(grammarAccess.getHOURAccess().getRightParenthesisKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyLanguage.g:5671:1: rule__MINUTES__Group__0 : rule__MINUTES__Group__0__Impl rule__MINUTES__Group__1 ;
    public final void rule__MINUTES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5675:1: ( rule__MINUTES__Group__0__Impl rule__MINUTES__Group__1 )
            // InternalMyLanguage.g:5676:2: rule__MINUTES__Group__0__Impl rule__MINUTES__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:5683:1: rule__MINUTES__Group__0__Impl : ( 'minutes(' ) ;
    public final void rule__MINUTES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5687:1: ( ( 'minutes(' ) )
            // InternalMyLanguage.g:5688:1: ( 'minutes(' )
            {
            // InternalMyLanguage.g:5688:1: ( 'minutes(' )
            // InternalMyLanguage.g:5689:2: 'minutes('
            {
             before(grammarAccess.getMINUTESAccess().getMinutesKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalMyLanguage.g:5698:1: rule__MINUTES__Group__1 : rule__MINUTES__Group__1__Impl rule__MINUTES__Group__2 ;
    public final void rule__MINUTES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5702:1: ( rule__MINUTES__Group__1__Impl rule__MINUTES__Group__2 )
            // InternalMyLanguage.g:5703:2: rule__MINUTES__Group__1__Impl rule__MINUTES__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyLanguage.g:5710:1: rule__MINUTES__Group__1__Impl : ( ( rule__MINUTES__ValueAssignment_1 ) ) ;
    public final void rule__MINUTES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5714:1: ( ( ( rule__MINUTES__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5715:1: ( ( rule__MINUTES__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5715:1: ( ( rule__MINUTES__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5716:2: ( rule__MINUTES__ValueAssignment_1 )
            {
             before(grammarAccess.getMINUTESAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5717:2: ( rule__MINUTES__ValueAssignment_1 )
            // InternalMyLanguage.g:5717:3: rule__MINUTES__ValueAssignment_1
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
    // InternalMyLanguage.g:5725:1: rule__MINUTES__Group__2 : rule__MINUTES__Group__2__Impl ;
    public final void rule__MINUTES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5729:1: ( rule__MINUTES__Group__2__Impl )
            // InternalMyLanguage.g:5730:2: rule__MINUTES__Group__2__Impl
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
    // InternalMyLanguage.g:5736:1: rule__MINUTES__Group__2__Impl : ( ')' ) ;
    public final void rule__MINUTES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5740:1: ( ( ')' ) )
            // InternalMyLanguage.g:5741:1: ( ')' )
            {
            // InternalMyLanguage.g:5741:1: ( ')' )
            // InternalMyLanguage.g:5742:2: ')'
            {
             before(grammarAccess.getMINUTESAccess().getRightParenthesisKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyLanguage.g:5752:1: rule__METER__Group__0 : rule__METER__Group__0__Impl rule__METER__Group__1 ;
    public final void rule__METER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5756:1: ( rule__METER__Group__0__Impl rule__METER__Group__1 )
            // InternalMyLanguage.g:5757:2: rule__METER__Group__0__Impl rule__METER__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:5764:1: rule__METER__Group__0__Impl : ( 'meter(' ) ;
    public final void rule__METER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5768:1: ( ( 'meter(' ) )
            // InternalMyLanguage.g:5769:1: ( 'meter(' )
            {
            // InternalMyLanguage.g:5769:1: ( 'meter(' )
            // InternalMyLanguage.g:5770:2: 'meter('
            {
             before(grammarAccess.getMETERAccess().getMeterKeyword_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalMyLanguage.g:5779:1: rule__METER__Group__1 : rule__METER__Group__1__Impl rule__METER__Group__2 ;
    public final void rule__METER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5783:1: ( rule__METER__Group__1__Impl rule__METER__Group__2 )
            // InternalMyLanguage.g:5784:2: rule__METER__Group__1__Impl rule__METER__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyLanguage.g:5791:1: rule__METER__Group__1__Impl : ( ( rule__METER__ValueAssignment_1 ) ) ;
    public final void rule__METER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5795:1: ( ( ( rule__METER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5796:1: ( ( rule__METER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5796:1: ( ( rule__METER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5797:2: ( rule__METER__ValueAssignment_1 )
            {
             before(grammarAccess.getMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5798:2: ( rule__METER__ValueAssignment_1 )
            // InternalMyLanguage.g:5798:3: rule__METER__ValueAssignment_1
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
    // InternalMyLanguage.g:5806:1: rule__METER__Group__2 : rule__METER__Group__2__Impl ;
    public final void rule__METER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5810:1: ( rule__METER__Group__2__Impl )
            // InternalMyLanguage.g:5811:2: rule__METER__Group__2__Impl
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
    // InternalMyLanguage.g:5817:1: rule__METER__Group__2__Impl : ( ')' ) ;
    public final void rule__METER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5821:1: ( ( ')' ) )
            // InternalMyLanguage.g:5822:1: ( ')' )
            {
            // InternalMyLanguage.g:5822:1: ( ')' )
            // InternalMyLanguage.g:5823:2: ')'
            {
             before(grammarAccess.getMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyLanguage.g:5833:1: rule__CENTIMETER__Group__0 : rule__CENTIMETER__Group__0__Impl rule__CENTIMETER__Group__1 ;
    public final void rule__CENTIMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5837:1: ( rule__CENTIMETER__Group__0__Impl rule__CENTIMETER__Group__1 )
            // InternalMyLanguage.g:5838:2: rule__CENTIMETER__Group__0__Impl rule__CENTIMETER__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:5845:1: rule__CENTIMETER__Group__0__Impl : ( 'centimeter(' ) ;
    public final void rule__CENTIMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5849:1: ( ( 'centimeter(' ) )
            // InternalMyLanguage.g:5850:1: ( 'centimeter(' )
            {
            // InternalMyLanguage.g:5850:1: ( 'centimeter(' )
            // InternalMyLanguage.g:5851:2: 'centimeter('
            {
             before(grammarAccess.getCENTIMETERAccess().getCentimeterKeyword_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalMyLanguage.g:5860:1: rule__CENTIMETER__Group__1 : rule__CENTIMETER__Group__1__Impl rule__CENTIMETER__Group__2 ;
    public final void rule__CENTIMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5864:1: ( rule__CENTIMETER__Group__1__Impl rule__CENTIMETER__Group__2 )
            // InternalMyLanguage.g:5865:2: rule__CENTIMETER__Group__1__Impl rule__CENTIMETER__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyLanguage.g:5872:1: rule__CENTIMETER__Group__1__Impl : ( ( rule__CENTIMETER__ValueAssignment_1 ) ) ;
    public final void rule__CENTIMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5876:1: ( ( ( rule__CENTIMETER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5877:1: ( ( rule__CENTIMETER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5877:1: ( ( rule__CENTIMETER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5878:2: ( rule__CENTIMETER__ValueAssignment_1 )
            {
             before(grammarAccess.getCENTIMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5879:2: ( rule__CENTIMETER__ValueAssignment_1 )
            // InternalMyLanguage.g:5879:3: rule__CENTIMETER__ValueAssignment_1
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
    // InternalMyLanguage.g:5887:1: rule__CENTIMETER__Group__2 : rule__CENTIMETER__Group__2__Impl ;
    public final void rule__CENTIMETER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5891:1: ( rule__CENTIMETER__Group__2__Impl )
            // InternalMyLanguage.g:5892:2: rule__CENTIMETER__Group__2__Impl
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
    // InternalMyLanguage.g:5898:1: rule__CENTIMETER__Group__2__Impl : ( ')' ) ;
    public final void rule__CENTIMETER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5902:1: ( ( ')' ) )
            // InternalMyLanguage.g:5903:1: ( ')' )
            {
            // InternalMyLanguage.g:5903:1: ( ')' )
            // InternalMyLanguage.g:5904:2: ')'
            {
             before(grammarAccess.getCENTIMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyLanguage.g:5914:1: rule__MILLIMETER__Group__0 : rule__MILLIMETER__Group__0__Impl rule__MILLIMETER__Group__1 ;
    public final void rule__MILLIMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5918:1: ( rule__MILLIMETER__Group__0__Impl rule__MILLIMETER__Group__1 )
            // InternalMyLanguage.g:5919:2: rule__MILLIMETER__Group__0__Impl rule__MILLIMETER__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:5926:1: rule__MILLIMETER__Group__0__Impl : ( 'millimeter(' ) ;
    public final void rule__MILLIMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5930:1: ( ( 'millimeter(' ) )
            // InternalMyLanguage.g:5931:1: ( 'millimeter(' )
            {
            // InternalMyLanguage.g:5931:1: ( 'millimeter(' )
            // InternalMyLanguage.g:5932:2: 'millimeter('
            {
             before(grammarAccess.getMILLIMETERAccess().getMillimeterKeyword_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalMyLanguage.g:5941:1: rule__MILLIMETER__Group__1 : rule__MILLIMETER__Group__1__Impl rule__MILLIMETER__Group__2 ;
    public final void rule__MILLIMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5945:1: ( rule__MILLIMETER__Group__1__Impl rule__MILLIMETER__Group__2 )
            // InternalMyLanguage.g:5946:2: rule__MILLIMETER__Group__1__Impl rule__MILLIMETER__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyLanguage.g:5953:1: rule__MILLIMETER__Group__1__Impl : ( ( rule__MILLIMETER__ValueAssignment_1 ) ) ;
    public final void rule__MILLIMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5957:1: ( ( ( rule__MILLIMETER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5958:1: ( ( rule__MILLIMETER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5958:1: ( ( rule__MILLIMETER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5959:2: ( rule__MILLIMETER__ValueAssignment_1 )
            {
             before(grammarAccess.getMILLIMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5960:2: ( rule__MILLIMETER__ValueAssignment_1 )
            // InternalMyLanguage.g:5960:3: rule__MILLIMETER__ValueAssignment_1
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
    // InternalMyLanguage.g:5968:1: rule__MILLIMETER__Group__2 : rule__MILLIMETER__Group__2__Impl ;
    public final void rule__MILLIMETER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5972:1: ( rule__MILLIMETER__Group__2__Impl )
            // InternalMyLanguage.g:5973:2: rule__MILLIMETER__Group__2__Impl
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
    // InternalMyLanguage.g:5979:1: rule__MILLIMETER__Group__2__Impl : ( ')' ) ;
    public final void rule__MILLIMETER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5983:1: ( ( ')' ) )
            // InternalMyLanguage.g:5984:1: ( ')' )
            {
            // InternalMyLanguage.g:5984:1: ( ')' )
            // InternalMyLanguage.g:5985:2: ')'
            {
             before(grammarAccess.getMILLIMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyLanguage.g:5995:1: rule__KILOMETER__Group__0 : rule__KILOMETER__Group__0__Impl rule__KILOMETER__Group__1 ;
    public final void rule__KILOMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5999:1: ( rule__KILOMETER__Group__0__Impl rule__KILOMETER__Group__1 )
            // InternalMyLanguage.g:6000:2: rule__KILOMETER__Group__0__Impl rule__KILOMETER__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:6007:1: rule__KILOMETER__Group__0__Impl : ( 'kilometer(' ) ;
    public final void rule__KILOMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6011:1: ( ( 'kilometer(' ) )
            // InternalMyLanguage.g:6012:1: ( 'kilometer(' )
            {
            // InternalMyLanguage.g:6012:1: ( 'kilometer(' )
            // InternalMyLanguage.g:6013:2: 'kilometer('
            {
             before(grammarAccess.getKILOMETERAccess().getKilometerKeyword_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalMyLanguage.g:6022:1: rule__KILOMETER__Group__1 : rule__KILOMETER__Group__1__Impl rule__KILOMETER__Group__2 ;
    public final void rule__KILOMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6026:1: ( rule__KILOMETER__Group__1__Impl rule__KILOMETER__Group__2 )
            // InternalMyLanguage.g:6027:2: rule__KILOMETER__Group__1__Impl rule__KILOMETER__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyLanguage.g:6034:1: rule__KILOMETER__Group__1__Impl : ( ( rule__KILOMETER__ValueAssignment_1 ) ) ;
    public final void rule__KILOMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6038:1: ( ( ( rule__KILOMETER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6039:1: ( ( rule__KILOMETER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6039:1: ( ( rule__KILOMETER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6040:2: ( rule__KILOMETER__ValueAssignment_1 )
            {
             before(grammarAccess.getKILOMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6041:2: ( rule__KILOMETER__ValueAssignment_1 )
            // InternalMyLanguage.g:6041:3: rule__KILOMETER__ValueAssignment_1
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
    // InternalMyLanguage.g:6049:1: rule__KILOMETER__Group__2 : rule__KILOMETER__Group__2__Impl ;
    public final void rule__KILOMETER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6053:1: ( rule__KILOMETER__Group__2__Impl )
            // InternalMyLanguage.g:6054:2: rule__KILOMETER__Group__2__Impl
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
    // InternalMyLanguage.g:6060:1: rule__KILOMETER__Group__2__Impl : ( ')' ) ;
    public final void rule__KILOMETER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6064:1: ( ( ')' ) )
            // InternalMyLanguage.g:6065:1: ( ')' )
            {
            // InternalMyLanguage.g:6065:1: ( ')' )
            // InternalMyLanguage.g:6066:2: ')'
            {
             before(grammarAccess.getKILOMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyLanguage.g:6076:1: rule__PercentUnit__Group__0 : rule__PercentUnit__Group__0__Impl rule__PercentUnit__Group__1 ;
    public final void rule__PercentUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6080:1: ( rule__PercentUnit__Group__0__Impl rule__PercentUnit__Group__1 )
            // InternalMyLanguage.g:6081:2: rule__PercentUnit__Group__0__Impl rule__PercentUnit__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:6088:1: rule__PercentUnit__Group__0__Impl : ( 'percent(' ) ;
    public final void rule__PercentUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6092:1: ( ( 'percent(' ) )
            // InternalMyLanguage.g:6093:1: ( 'percent(' )
            {
            // InternalMyLanguage.g:6093:1: ( 'percent(' )
            // InternalMyLanguage.g:6094:2: 'percent('
            {
             before(grammarAccess.getPercentUnitAccess().getPercentKeyword_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalMyLanguage.g:6103:1: rule__PercentUnit__Group__1 : rule__PercentUnit__Group__1__Impl rule__PercentUnit__Group__2 ;
    public final void rule__PercentUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6107:1: ( rule__PercentUnit__Group__1__Impl rule__PercentUnit__Group__2 )
            // InternalMyLanguage.g:6108:2: rule__PercentUnit__Group__1__Impl rule__PercentUnit__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyLanguage.g:6115:1: rule__PercentUnit__Group__1__Impl : ( ( rule__PercentUnit__ValueAssignment_1 ) ) ;
    public final void rule__PercentUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6119:1: ( ( ( rule__PercentUnit__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:6120:1: ( ( rule__PercentUnit__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:6120:1: ( ( rule__PercentUnit__ValueAssignment_1 ) )
            // InternalMyLanguage.g:6121:2: ( rule__PercentUnit__ValueAssignment_1 )
            {
             before(grammarAccess.getPercentUnitAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:6122:2: ( rule__PercentUnit__ValueAssignment_1 )
            // InternalMyLanguage.g:6122:3: rule__PercentUnit__ValueAssignment_1
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
    // InternalMyLanguage.g:6130:1: rule__PercentUnit__Group__2 : rule__PercentUnit__Group__2__Impl ;
    public final void rule__PercentUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6134:1: ( rule__PercentUnit__Group__2__Impl )
            // InternalMyLanguage.g:6135:2: rule__PercentUnit__Group__2__Impl
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
    // InternalMyLanguage.g:6141:1: rule__PercentUnit__Group__2__Impl : ( ')' ) ;
    public final void rule__PercentUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6145:1: ( ( ')' ) )
            // InternalMyLanguage.g:6146:1: ( ')' )
            {
            // InternalMyLanguage.g:6146:1: ( ')' )
            // InternalMyLanguage.g:6147:2: ')'
            {
             before(grammarAccess.getPercentUnitAccess().getRightParenthesisKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyLanguage.g:6157:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6161:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalMyLanguage.g:6162:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:6169:1: rule__DOUBLE__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6173:1: ( ( ( '-' )? ) )
            // InternalMyLanguage.g:6174:1: ( ( '-' )? )
            {
            // InternalMyLanguage.g:6174:1: ( ( '-' )? )
            // InternalMyLanguage.g:6175:2: ( '-' )?
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
            // InternalMyLanguage.g:6176:2: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==86) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyLanguage.g:6176:3: '-'
                    {
                    match(input,86,FOLLOW_2); 

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
    // InternalMyLanguage.g:6184:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6188:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalMyLanguage.g:6189:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalMyLanguage.g:6196:1: rule__DOUBLE__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6200:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6201:1: ( RULE_INT )
            {
            // InternalMyLanguage.g:6201:1: ( RULE_INT )
            // InternalMyLanguage.g:6202:2: RULE_INT
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
    // InternalMyLanguage.g:6211:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6215:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalMyLanguage.g:6216:2: rule__DOUBLE__Group__2__Impl
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
    // InternalMyLanguage.g:6222:1: rule__DOUBLE__Group__2__Impl : ( ( rule__DOUBLE__Group_2__0 )? ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6226:1: ( ( ( rule__DOUBLE__Group_2__0 )? ) )
            // InternalMyLanguage.g:6227:1: ( ( rule__DOUBLE__Group_2__0 )? )
            {
            // InternalMyLanguage.g:6227:1: ( ( rule__DOUBLE__Group_2__0 )? )
            // InternalMyLanguage.g:6228:2: ( rule__DOUBLE__Group_2__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_2()); 
            // InternalMyLanguage.g:6229:2: ( rule__DOUBLE__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==87) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyLanguage.g:6229:3: rule__DOUBLE__Group_2__0
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
    // InternalMyLanguage.g:6238:1: rule__DOUBLE__Group_2__0 : rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 ;
    public final void rule__DOUBLE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6242:1: ( rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 )
            // InternalMyLanguage.g:6243:2: rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyLanguage.g:6250:1: rule__DOUBLE__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6254:1: ( ( '.' ) )
            // InternalMyLanguage.g:6255:1: ( '.' )
            {
            // InternalMyLanguage.g:6255:1: ( '.' )
            // InternalMyLanguage.g:6256:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalMyLanguage.g:6265:1: rule__DOUBLE__Group_2__1 : rule__DOUBLE__Group_2__1__Impl ;
    public final void rule__DOUBLE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6269:1: ( rule__DOUBLE__Group_2__1__Impl )
            // InternalMyLanguage.g:6270:2: rule__DOUBLE__Group_2__1__Impl
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
    // InternalMyLanguage.g:6276:1: rule__DOUBLE__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6280:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6281:1: ( RULE_INT )
            {
            // InternalMyLanguage.g:6281:1: ( RULE_INT )
            // InternalMyLanguage.g:6282:2: RULE_INT
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


    // $ANTLR start "rule__TestFile__TestsAssignment"
    // InternalMyLanguage.g:6292:1: rule__TestFile__TestsAssignment : ( ruleTest ) ;
    public final void rule__TestFile__TestsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6296:1: ( ( ruleTest ) )
            // InternalMyLanguage.g:6297:2: ( ruleTest )
            {
            // InternalMyLanguage.g:6297:2: ( ruleTest )
            // InternalMyLanguage.g:6298:3: ruleTest
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
    // InternalMyLanguage.g:6307:1: rule__Test__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6311:1: ( ( RULE_ID ) )
            // InternalMyLanguage.g:6312:2: ( RULE_ID )
            {
            // InternalMyLanguage.g:6312:2: ( RULE_ID )
            // InternalMyLanguage.g:6313:3: RULE_ID
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
    // InternalMyLanguage.g:6322:1: rule__Test__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Test__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6326:1: ( ( RULE_STRING ) )
            // InternalMyLanguage.g:6327:2: ( RULE_STRING )
            {
            // InternalMyLanguage.g:6327:2: ( RULE_STRING )
            // InternalMyLanguage.g:6328:3: RULE_STRING
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
    // InternalMyLanguage.g:6337:1: rule__Test__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Test__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6341:1: ( ( ruleStatement ) )
            // InternalMyLanguage.g:6342:2: ( ruleStatement )
            {
            // InternalMyLanguage.g:6342:2: ( ruleStatement )
            // InternalMyLanguage.g:6343:3: ruleStatement
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
    // InternalMyLanguage.g:6352:1: rule__Given__BodyAssignment_1 : ( ruleStatementBody ) ;
    public final void rule__Given__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6356:1: ( ( ruleStatementBody ) )
            // InternalMyLanguage.g:6357:2: ( ruleStatementBody )
            {
            // InternalMyLanguage.g:6357:2: ( ruleStatementBody )
            // InternalMyLanguage.g:6358:3: ruleStatementBody
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
    // InternalMyLanguage.g:6367:1: rule__Then__BodyAssignment_1 : ( ruleStatementBody ) ;
    public final void rule__Then__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6371:1: ( ( ruleStatementBody ) )
            // InternalMyLanguage.g:6372:2: ( ruleStatementBody )
            {
            // InternalMyLanguage.g:6372:2: ( ruleStatementBody )
            // InternalMyLanguage.g:6373:3: ruleStatementBody
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
    // InternalMyLanguage.g:6382:1: rule__When__BodyAssignment_1 : ( ruleStatementBody ) ;
    public final void rule__When__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6386:1: ( ( ruleStatementBody ) )
            // InternalMyLanguage.g:6387:2: ( ruleStatementBody )
            {
            // InternalMyLanguage.g:6387:2: ( ruleStatementBody )
            // InternalMyLanguage.g:6388:3: ruleStatementBody
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


    // $ANTLR start "rule__SonarSent__SentAssignment_3"
    // InternalMyLanguage.g:6397:1: rule__SonarSent__SentAssignment_3 : ( ( rule__SonarSent__SentAlternatives_3_0 ) ) ;
    public final void rule__SonarSent__SentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6401:1: ( ( ( rule__SonarSent__SentAlternatives_3_0 ) ) )
            // InternalMyLanguage.g:6402:2: ( ( rule__SonarSent__SentAlternatives_3_0 ) )
            {
            // InternalMyLanguage.g:6402:2: ( ( rule__SonarSent__SentAlternatives_3_0 ) )
            // InternalMyLanguage.g:6403:3: ( rule__SonarSent__SentAlternatives_3_0 )
            {
             before(grammarAccess.getSonarSentAccess().getSentAlternatives_3_0()); 
            // InternalMyLanguage.g:6404:3: ( rule__SonarSent__SentAlternatives_3_0 )
            // InternalMyLanguage.g:6404:4: rule__SonarSent__SentAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SonarSent__SentAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSonarSentAccess().getSentAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SonarSent__SentAssignment_3"


    // $ANTLR start "rule__NotificationSent__NotAssignment_0"
    // InternalMyLanguage.g:6412:1: rule__NotificationSent__NotAssignment_0 : ( ( 'Notification' ) ) ;
    public final void rule__NotificationSent__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6416:1: ( ( ( 'Notification' ) ) )
            // InternalMyLanguage.g:6417:2: ( ( 'Notification' ) )
            {
            // InternalMyLanguage.g:6417:2: ( ( 'Notification' ) )
            // InternalMyLanguage.g:6418:3: ( 'Notification' )
            {
             before(grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0()); 
            // InternalMyLanguage.g:6419:3: ( 'Notification' )
            // InternalMyLanguage.g:6420:4: 'Notification'
            {
             before(grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0()); 
            match(input,88,FOLLOW_2); 
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
    // InternalMyLanguage.g:6431:1: rule__TimeInterval__FirstAssignment_3 : ( ruleTimeUnit ) ;
    public final void rule__TimeInterval__FirstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6435:1: ( ( ruleTimeUnit ) )
            // InternalMyLanguage.g:6436:2: ( ruleTimeUnit )
            {
            // InternalMyLanguage.g:6436:2: ( ruleTimeUnit )
            // InternalMyLanguage.g:6437:3: ruleTimeUnit
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
    // InternalMyLanguage.g:6446:1: rule__TimeInterval__SecondAssignment_5 : ( ruleTimeUnit ) ;
    public final void rule__TimeInterval__SecondAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6450:1: ( ( ruleTimeUnit ) )
            // InternalMyLanguage.g:6451:2: ( ruleTimeUnit )
            {
            // InternalMyLanguage.g:6451:2: ( ruleTimeUnit )
            // InternalMyLanguage.g:6452:3: ruleTimeUnit
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


    // $ANTLR start "rule__BatterySent__SentAssignment_3"
    // InternalMyLanguage.g:6461:1: rule__BatterySent__SentAssignment_3 : ( ( rule__BatterySent__SentAlternatives_3_0 ) ) ;
    public final void rule__BatterySent__SentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6465:1: ( ( ( rule__BatterySent__SentAlternatives_3_0 ) ) )
            // InternalMyLanguage.g:6466:2: ( ( rule__BatterySent__SentAlternatives_3_0 ) )
            {
            // InternalMyLanguage.g:6466:2: ( ( rule__BatterySent__SentAlternatives_3_0 ) )
            // InternalMyLanguage.g:6467:3: ( rule__BatterySent__SentAlternatives_3_0 )
            {
             before(grammarAccess.getBatterySentAccess().getSentAlternatives_3_0()); 
            // InternalMyLanguage.g:6468:3: ( rule__BatterySent__SentAlternatives_3_0 )
            // InternalMyLanguage.g:6468:4: rule__BatterySent__SentAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__BatterySent__SentAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getBatterySentAccess().getSentAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatterySent__SentAssignment_3"


    // $ANTLR start "rule__PeoplePosSent__PosXAssignment_2"
    // InternalMyLanguage.g:6476:1: rule__PeoplePosSent__PosXAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__PeoplePosSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6480:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6481:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6481:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6482:3: ruleDOUBLE
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosXDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getPeoplePosSentAccess().getPosXDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6491:1: rule__PeoplePosSent__PosYAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__PeoplePosSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6495:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6496:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6496:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6497:3: ruleDOUBLE
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosYDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getPeoplePosSentAccess().getPosYDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6506:1: rule__PeoplePosSent__PosZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__PeoplePosSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6510:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6511:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6511:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6512:3: ruleDOUBLE
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosZDOUBLEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getPeoplePosSentAccess().getPosZDOUBLEParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6521:1: rule__PeoplePosSent__ToleranceAssignment_5 : ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) ) ;
    public final void rule__PeoplePosSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6525:1: ( ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) ) )
            // InternalMyLanguage.g:6526:2: ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) )
            {
            // InternalMyLanguage.g:6526:2: ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) )
            // InternalMyLanguage.g:6527:3: ( rule__PeoplePosSent__ToleranceAlternatives_5_0 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getToleranceAlternatives_5_0()); 
            // InternalMyLanguage.g:6528:3: ( rule__PeoplePosSent__ToleranceAlternatives_5_0 )
            // InternalMyLanguage.g:6528:4: rule__PeoplePosSent__ToleranceAlternatives_5_0
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
    // InternalMyLanguage.g:6536:1: rule__PeopleNumbSent__AmountAssignment_2 : ( RULE_INT ) ;
    public final void rule__PeopleNumbSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6540:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6541:2: ( RULE_INT )
            {
            // InternalMyLanguage.g:6541:2: ( RULE_INT )
            // InternalMyLanguage.g:6542:3: RULE_INT
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
    // InternalMyLanguage.g:6551:1: rule__MissionGoalSent__PosXAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__MissionGoalSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6555:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6556:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6556:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6557:3: ruleDOUBLE
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosXDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMissionGoalSentAccess().getPosXDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6566:1: rule__MissionGoalSent__PosYAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__MissionGoalSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6570:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6571:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6571:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6572:3: ruleDOUBLE
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosYDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMissionGoalSentAccess().getPosYDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6581:1: rule__MissionGoalSent__PosZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__MissionGoalSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6585:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6586:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6586:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6587:3: ruleDOUBLE
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosZDOUBLEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMissionGoalSentAccess().getPosZDOUBLEParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6596:1: rule__MissionRiskLevelSent__RisklevelAssignment_2 : ( ruleMISSIONRISKLEVEL ) ;
    public final void rule__MissionRiskLevelSent__RisklevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6600:1: ( ( ruleMISSIONRISKLEVEL ) )
            // InternalMyLanguage.g:6601:2: ( ruleMISSIONRISKLEVEL )
            {
            // InternalMyLanguage.g:6601:2: ( ruleMISSIONRISKLEVEL )
            // InternalMyLanguage.g:6602:3: ruleMISSIONRISKLEVEL
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
    // InternalMyLanguage.g:6611:1: rule__MissionStatusSent__StateAssignment_2 : ( ruleMISSIONSTATUS ) ;
    public final void rule__MissionStatusSent__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6615:1: ( ( ruleMISSIONSTATUS ) )
            // InternalMyLanguage.g:6616:2: ( ruleMISSIONSTATUS )
            {
            // InternalMyLanguage.g:6616:2: ( ruleMISSIONSTATUS )
            // InternalMyLanguage.g:6617:3: ruleMISSIONSTATUS
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
    // InternalMyLanguage.g:6626:1: rule__RobotAutoPilot__StatusAssignment_2 : ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) ) ;
    public final void rule__RobotAutoPilot__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6630:1: ( ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6631:2: ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6631:2: ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) )
            // InternalMyLanguage.g:6632:3: ( rule__RobotAutoPilot__StatusAlternatives_2_0 )
            {
             before(grammarAccess.getRobotAutoPilotAccess().getStatusAlternatives_2_0()); 
            // InternalMyLanguage.g:6633:3: ( rule__RobotAutoPilot__StatusAlternatives_2_0 )
            // InternalMyLanguage.g:6633:4: rule__RobotAutoPilot__StatusAlternatives_2_0
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


    // $ANTLR start "rule__RedundantComponent__ComponentAssignment_0"
    // InternalMyLanguage.g:6641:1: rule__RedundantComponent__ComponentAssignment_0 : ( ruleCOMPONENT ) ;
    public final void rule__RedundantComponent__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6645:1: ( ( ruleCOMPONENT ) )
            // InternalMyLanguage.g:6646:2: ( ruleCOMPONENT )
            {
            // InternalMyLanguage.g:6646:2: ( ruleCOMPONENT )
            // InternalMyLanguage.g:6647:3: ruleCOMPONENT
            {
             before(grammarAccess.getRedundantComponentAccess().getComponentCOMPONENTParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPONENT();

            state._fsp--;

             after(grammarAccess.getRedundantComponentAccess().getComponentCOMPONENTParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RedundantComponent__ComponentAssignment_0"


    // $ANTLR start "rule__PayloadSent__LoadAssignment_0"
    // InternalMyLanguage.g:6656:1: rule__PayloadSent__LoadAssignment_0 : ( ( 'payload' ) ) ;
    public final void rule__PayloadSent__LoadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6660:1: ( ( ( 'payload' ) ) )
            // InternalMyLanguage.g:6661:2: ( ( 'payload' ) )
            {
            // InternalMyLanguage.g:6661:2: ( ( 'payload' ) )
            // InternalMyLanguage.g:6662:3: ( 'payload' )
            {
             before(grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0()); 
            // InternalMyLanguage.g:6663:3: ( 'payload' )
            // InternalMyLanguage.g:6664:4: 'payload'
            {
             before(grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0()); 
            match(input,89,FOLLOW_2); 
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
    // InternalMyLanguage.g:6675:1: rule__RobotDistanceSent__SentAssignment_2 : ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) ) ;
    public final void rule__RobotDistanceSent__SentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6679:1: ( ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6680:2: ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6680:2: ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) )
            // InternalMyLanguage.g:6681:3: ( rule__RobotDistanceSent__SentAlternatives_2_0 )
            {
             before(grammarAccess.getRobotDistanceSentAccess().getSentAlternatives_2_0()); 
            // InternalMyLanguage.g:6682:3: ( rule__RobotDistanceSent__SentAlternatives_2_0 )
            // InternalMyLanguage.g:6682:4: rule__RobotDistanceSent__SentAlternatives_2_0
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
    // InternalMyLanguage.g:6690:1: rule__DistanceToLocationSent__PosXAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__DistanceToLocationSent__PosXAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6694:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6695:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6695:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6696:3: ruleDOUBLE
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosXDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDistanceToLocationSentAccess().getPosXDOUBLEParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6705:1: rule__DistanceToLocationSent__PosYAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__DistanceToLocationSent__PosYAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6709:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6710:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6710:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6711:3: ruleDOUBLE
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosYDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDistanceToLocationSentAccess().getPosYDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6720:1: rule__DistanceToLocationSent__PosZAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__DistanceToLocationSent__PosZAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6724:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6725:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6725:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6726:3: ruleDOUBLE
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosZDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDistanceToLocationSentAccess().getPosZDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6735:1: rule__DistanceToLocationSent__BodyAssignment_4 : ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) ) ;
    public final void rule__DistanceToLocationSent__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6739:1: ( ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) ) )
            // InternalMyLanguage.g:6740:2: ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) )
            {
            // InternalMyLanguage.g:6740:2: ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) )
            // InternalMyLanguage.g:6741:3: ( rule__DistanceToLocationSent__BodyAlternatives_4_0 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getBodyAlternatives_4_0()); 
            // InternalMyLanguage.g:6742:3: ( rule__DistanceToLocationSent__BodyAlternatives_4_0 )
            // InternalMyLanguage.g:6742:4: rule__DistanceToLocationSent__BodyAlternatives_4_0
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
    // InternalMyLanguage.g:6750:1: rule__DistanceToLocationSent__ToleranceAssignment_5 : ( ruleToleranceSent ) ;
    public final void rule__DistanceToLocationSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6754:1: ( ( ruleToleranceSent ) )
            // InternalMyLanguage.g:6755:2: ( ruleToleranceSent )
            {
            // InternalMyLanguage.g:6755:2: ( ruleToleranceSent )
            // InternalMyLanguage.g:6756:3: ruleToleranceSent
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
    // InternalMyLanguage.g:6765:1: rule__DistanceToObstaclesSent__BodyAssignment_2 : ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) ) ;
    public final void rule__DistanceToObstaclesSent__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6769:1: ( ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6770:2: ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6770:2: ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) )
            // InternalMyLanguage.g:6771:3: ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 )
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAlternatives_2_0()); 
            // InternalMyLanguage.g:6772:3: ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 )
            // InternalMyLanguage.g:6772:4: rule__DistanceToObstaclesSent__BodyAlternatives_2_0
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
    // InternalMyLanguage.g:6780:1: rule__DistanceToObstaclesSent__ToleranceAssignment_3 : ( ruleToleranceSent ) ;
    public final void rule__DistanceToObstaclesSent__ToleranceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6784:1: ( ( ruleToleranceSent ) )
            // InternalMyLanguage.g:6785:2: ( ruleToleranceSent )
            {
            // InternalMyLanguage.g:6785:2: ( ruleToleranceSent )
            // InternalMyLanguage.g:6786:3: ruleToleranceSent
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
    // InternalMyLanguage.g:6795:1: rule__EqualSent__AmountAssignment_2 : ( ( rule__EqualSent__AmountAlternatives_2_0 ) ) ;
    public final void rule__EqualSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6799:1: ( ( ( rule__EqualSent__AmountAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6800:2: ( ( rule__EqualSent__AmountAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6800:2: ( ( rule__EqualSent__AmountAlternatives_2_0 ) )
            // InternalMyLanguage.g:6801:3: ( rule__EqualSent__AmountAlternatives_2_0 )
            {
             before(grammarAccess.getEqualSentAccess().getAmountAlternatives_2_0()); 
            // InternalMyLanguage.g:6802:3: ( rule__EqualSent__AmountAlternatives_2_0 )
            // InternalMyLanguage.g:6802:4: rule__EqualSent__AmountAlternatives_2_0
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
    // InternalMyLanguage.g:6810:1: rule__LessSent__AmountAssignment_2 : ( ( rule__LessSent__AmountAlternatives_2_0 ) ) ;
    public final void rule__LessSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6814:1: ( ( ( rule__LessSent__AmountAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6815:2: ( ( rule__LessSent__AmountAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6815:2: ( ( rule__LessSent__AmountAlternatives_2_0 ) )
            // InternalMyLanguage.g:6816:3: ( rule__LessSent__AmountAlternatives_2_0 )
            {
             before(grammarAccess.getLessSentAccess().getAmountAlternatives_2_0()); 
            // InternalMyLanguage.g:6817:3: ( rule__LessSent__AmountAlternatives_2_0 )
            // InternalMyLanguage.g:6817:4: rule__LessSent__AmountAlternatives_2_0
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
    // InternalMyLanguage.g:6825:1: rule__GreaterSent__AmountAssignment_2 : ( ( rule__GreaterSent__AmountAlternatives_2_0 ) ) ;
    public final void rule__GreaterSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6829:1: ( ( ( rule__GreaterSent__AmountAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6830:2: ( ( rule__GreaterSent__AmountAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6830:2: ( ( rule__GreaterSent__AmountAlternatives_2_0 ) )
            // InternalMyLanguage.g:6831:3: ( rule__GreaterSent__AmountAlternatives_2_0 )
            {
             before(grammarAccess.getGreaterSentAccess().getAmountAlternatives_2_0()); 
            // InternalMyLanguage.g:6832:3: ( rule__GreaterSent__AmountAlternatives_2_0 )
            // InternalMyLanguage.g:6832:4: rule__GreaterSent__AmountAlternatives_2_0
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
    // InternalMyLanguage.g:6840:1: rule__RobotStateSent__StateAssignment_2 : ( RULE_ID ) ;
    public final void rule__RobotStateSent__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6844:1: ( ( RULE_ID ) )
            // InternalMyLanguage.g:6845:2: ( RULE_ID )
            {
            // InternalMyLanguage.g:6845:2: ( RULE_ID )
            // InternalMyLanguage.g:6846:3: RULE_ID
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
    // InternalMyLanguage.g:6855:1: rule__RobotPositionSent__PosXAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__RobotPositionSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6859:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6860:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6860:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6861:3: ruleDOUBLE
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosXDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getRobotPositionSentAccess().getPosXDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6870:1: rule__RobotPositionSent__PosYAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__RobotPositionSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6874:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6875:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6875:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6876:3: ruleDOUBLE
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosYDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getRobotPositionSentAccess().getPosYDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6885:1: rule__RobotPositionSent__PosZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__RobotPositionSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6889:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6890:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6890:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6891:3: ruleDOUBLE
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosZDOUBLEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getRobotPositionSentAccess().getPosZDOUBLEParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:6900:1: rule__RobotPositionSent__ToleranceAssignment_5 : ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) ) ;
    public final void rule__RobotPositionSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6904:1: ( ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) ) )
            // InternalMyLanguage.g:6905:2: ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) )
            {
            // InternalMyLanguage.g:6905:2: ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) )
            // InternalMyLanguage.g:6906:3: ( rule__RobotPositionSent__ToleranceAlternatives_5_0 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getToleranceAlternatives_5_0()); 
            // InternalMyLanguage.g:6907:3: ( rule__RobotPositionSent__ToleranceAlternatives_5_0 )
            // InternalMyLanguage.g:6907:4: rule__RobotPositionSent__ToleranceAlternatives_5_0
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
    // InternalMyLanguage.g:6915:1: rule__CirclePosition__ToleranceAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__CirclePosition__ToleranceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6919:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:6920:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:6920:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:6921:3: ruleDistanceUnit
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
    // InternalMyLanguage.g:6930:1: rule__SpherePosition__ToleranceAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__SpherePosition__ToleranceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6934:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:6935:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:6935:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:6936:3: ruleDistanceUnit
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
    // InternalMyLanguage.g:6945:1: rule__RobotSpeedSent__SpeedXAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__RobotSpeedSent__SpeedXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6949:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6950:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6950:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6951:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6960:1: rule__RobotSpeedSent__SpeedYAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__RobotSpeedSent__SpeedYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6964:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6965:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6965:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6966:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6975:1: rule__RobotSpeedSent__SpeedZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__RobotSpeedSent__SpeedZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6979:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6980:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6980:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6981:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6990:1: rule__EnvironmentSent__BodyAssignment_3 : ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) ) ;
    public final void rule__EnvironmentSent__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6994:1: ( ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) ) )
            // InternalMyLanguage.g:6995:2: ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) )
            {
            // InternalMyLanguage.g:6995:2: ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) )
            // InternalMyLanguage.g:6996:3: ( rule__EnvironmentSent__BodyAlternatives_3_0 )
            {
             before(grammarAccess.getEnvironmentSentAccess().getBodyAlternatives_3_0()); 
            // InternalMyLanguage.g:6997:3: ( rule__EnvironmentSent__BodyAlternatives_3_0 )
            // InternalMyLanguage.g:6997:4: rule__EnvironmentSent__BodyAlternatives_3_0
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


    // $ANTLR start "rule__FailingComponentSent__ComponentAssignment_0"
    // InternalMyLanguage.g:7005:1: rule__FailingComponentSent__ComponentAssignment_0 : ( ruleCOMPONENT ) ;
    public final void rule__FailingComponentSent__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7009:1: ( ( ruleCOMPONENT ) )
            // InternalMyLanguage.g:7010:2: ( ruleCOMPONENT )
            {
            // InternalMyLanguage.g:7010:2: ( ruleCOMPONENT )
            // InternalMyLanguage.g:7011:3: ruleCOMPONENT
            {
             before(grammarAccess.getFailingComponentSentAccess().getComponentCOMPONENTParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPONENT();

            state._fsp--;

             after(grammarAccess.getFailingComponentSentAccess().getComponentCOMPONENTParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailingComponentSent__ComponentAssignment_0"


    // $ANTLR start "rule__RiskSent__LevelAssignment_2"
    // InternalMyLanguage.g:7020:1: rule__RiskSent__LevelAssignment_2 : ( ruleCOLLISIONRISKLEVEL ) ;
    public final void rule__RiskSent__LevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7024:1: ( ( ruleCOLLISIONRISKLEVEL ) )
            // InternalMyLanguage.g:7025:2: ( ruleCOLLISIONRISKLEVEL )
            {
            // InternalMyLanguage.g:7025:2: ( ruleCOLLISIONRISKLEVEL )
            // InternalMyLanguage.g:7026:3: ruleCOLLISIONRISKLEVEL
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
    // InternalMyLanguage.g:7035:1: rule__ToleranceSent__UnitAssignment_2 : ( ruleDistanceUnit ) ;
    public final void rule__ToleranceSent__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7039:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:7040:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:7040:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:7041:3: ruleDistanceUnit
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
    // InternalMyLanguage.g:7050:1: rule__SECONDS__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__SECONDS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7054:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7055:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7055:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7056:3: ruleDOUBLE
            {
             before(grammarAccess.getSECONDSAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getSECONDSAccess().getValueDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:7065:1: rule__HOUR__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HOUR__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7069:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7070:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7070:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7071:3: ruleDOUBLE
            {
             before(grammarAccess.getHOURAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getHOURAccess().getValueDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:7080:1: rule__MINUTES__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__MINUTES__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7084:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7085:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7085:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7086:3: ruleDOUBLE
            {
             before(grammarAccess.getMINUTESAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMINUTESAccess().getValueDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyLanguage.g:7095:1: rule__METER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__METER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7099:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7100:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7100:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7101:3: ruleDOUBLE
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
    // InternalMyLanguage.g:7110:1: rule__CENTIMETER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__CENTIMETER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7114:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7115:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7115:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7116:3: ruleDOUBLE
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
    // InternalMyLanguage.g:7125:1: rule__MILLIMETER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__MILLIMETER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7129:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7130:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7130:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7131:3: ruleDOUBLE
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
    // InternalMyLanguage.g:7140:1: rule__KILOMETER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__KILOMETER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7144:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7145:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7145:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7146:3: ruleDOUBLE
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
    // InternalMyLanguage.g:7155:1: rule__PercentUnit__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__PercentUnit__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:7159:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:7160:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:7160:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:7161:3: ruleDOUBLE
            {
             before(grammarAccess.getPercentUnitAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getPercentUnitAccess().getValueDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
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


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\24\6\uffff\10\43\2\uffff\1\13\1\uffff";
    static final String dfa_3s = "\1\131\6\uffff\10\112\2\uffff\1\65\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\10\uffff\1\10\1\7\1\uffff\1\11";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\23\uffff\1\1\12\uffff\1\4\6\uffff\1\3\5\uffff\1\2\3\uffff\1\5\15\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17\46\uffff\1\20",
            "\1\17\46\uffff\1\20",
            "\1\17\46\uffff\1\20",
            "\1\17\46\uffff\1\20",
            "\1\17\46\uffff\1\20",
            "\1\17\46\uffff\1\20",
            "\1\17\46\uffff\1\20",
            "\1\21\46\uffff\1\20",
            "",
            "",
            "\2\22\50\uffff\1\17",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1584:1: rule__Robot__Alternatives_1 : ( ( ruleRobotPositionSent ) | ( ruleRobotSpeedSent ) | ( ruleRobotStateSent ) | ( ruleRobotDistanceSent ) | ( ruleRiskSent ) | ( rulePayloadSent ) | ( ruleFailingComponentSent ) | ( ruleRedundantComponent ) | ( ruleRobotAutoPilot ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0012504200000000L,0x0000000001000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x6000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x000000000001A000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L,0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000C001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x040080000FF00000L,0x0000000002000882L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000010L,0x0000000000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});

}