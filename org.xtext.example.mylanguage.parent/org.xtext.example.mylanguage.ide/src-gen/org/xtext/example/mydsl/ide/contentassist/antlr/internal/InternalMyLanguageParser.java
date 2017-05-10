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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ON'", "'OFF'", "'ACTIVE'", "'UNACTIVE'", "'PAUSED'", "'SAFE'", "'UNSAFE'", "'WARNING'", "'CRITICAL'", "'motor'", "'camera'", "'GPS'", "'battery'", "'barometer'", "'scanner'", "'sonar'", "'autopilot'", "'Test:'", "'Description:'", "'Given:'", "'Then:'", "'When:'", "'status'", "'is'", "'sent'", "'Time'", "'interval'", "'in'", "'['", "','", "']'", "'Battery'", "'level'", "'Person'", "'position'", "'number'", "'Mission'", "'goal'", "'missionsafety'", "'Robot'", "'used'", "'as'", "'redundant'", "'component'", "'drops'", "'distance'", "'to'", "'obstacles'", "'equal'", "'lower'", "'then'", "'greater'", "'state'", "'within'", "'circle'", "'with'", "'radius'", "'sphere'", "'speed'", "'Environment'", "'windspeed'", "'fails'", "'collisionrisk'", "'tolerance'", "'seconds('", "')'", "'hours('", "'minutes('", "'meter('", "'centimeter('", "'millimeter('", "'kilometer('", "'percent('", "'-'", "'.'", "'Notification'", "'payload'"
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


    // $ANTLR start "entryRuleNotificationSent"
    // InternalMyLanguage.g:228:1: entryRuleNotificationSent : ruleNotificationSent EOF ;
    public final void entryRuleNotificationSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:229:1: ( ruleNotificationSent EOF )
            // InternalMyLanguage.g:230:1: ruleNotificationSent EOF
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
    // InternalMyLanguage.g:237:1: ruleNotificationSent : ( ( rule__NotificationSent__Group__0 ) ) ;
    public final void ruleNotificationSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:241:2: ( ( ( rule__NotificationSent__Group__0 ) ) )
            // InternalMyLanguage.g:242:2: ( ( rule__NotificationSent__Group__0 ) )
            {
            // InternalMyLanguage.g:242:2: ( ( rule__NotificationSent__Group__0 ) )
            // InternalMyLanguage.g:243:3: ( rule__NotificationSent__Group__0 )
            {
             before(grammarAccess.getNotificationSentAccess().getGroup()); 
            // InternalMyLanguage.g:244:3: ( rule__NotificationSent__Group__0 )
            // InternalMyLanguage.g:244:4: rule__NotificationSent__Group__0
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
    // InternalMyLanguage.g:253:1: entryRuleTimeSent : ruleTimeSent EOF ;
    public final void entryRuleTimeSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:254:1: ( ruleTimeSent EOF )
            // InternalMyLanguage.g:255:1: ruleTimeSent EOF
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
    // InternalMyLanguage.g:262:1: ruleTimeSent : ( ( rule__TimeSent__Group__0 ) ) ;
    public final void ruleTimeSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:266:2: ( ( ( rule__TimeSent__Group__0 ) ) )
            // InternalMyLanguage.g:267:2: ( ( rule__TimeSent__Group__0 ) )
            {
            // InternalMyLanguage.g:267:2: ( ( rule__TimeSent__Group__0 ) )
            // InternalMyLanguage.g:268:3: ( rule__TimeSent__Group__0 )
            {
             before(grammarAccess.getTimeSentAccess().getGroup()); 
            // InternalMyLanguage.g:269:3: ( rule__TimeSent__Group__0 )
            // InternalMyLanguage.g:269:4: rule__TimeSent__Group__0
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
    // InternalMyLanguage.g:278:1: entryRuleTimeInterval : ruleTimeInterval EOF ;
    public final void entryRuleTimeInterval() throws RecognitionException {
        try {
            // InternalMyLanguage.g:279:1: ( ruleTimeInterval EOF )
            // InternalMyLanguage.g:280:1: ruleTimeInterval EOF
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
    // InternalMyLanguage.g:287:1: ruleTimeInterval : ( ( rule__TimeInterval__Group__0 ) ) ;
    public final void ruleTimeInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:291:2: ( ( ( rule__TimeInterval__Group__0 ) ) )
            // InternalMyLanguage.g:292:2: ( ( rule__TimeInterval__Group__0 ) )
            {
            // InternalMyLanguage.g:292:2: ( ( rule__TimeInterval__Group__0 ) )
            // InternalMyLanguage.g:293:3: ( rule__TimeInterval__Group__0 )
            {
             before(grammarAccess.getTimeIntervalAccess().getGroup()); 
            // InternalMyLanguage.g:294:3: ( rule__TimeInterval__Group__0 )
            // InternalMyLanguage.g:294:4: rule__TimeInterval__Group__0
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
    // InternalMyLanguage.g:303:1: entryRuleBatterySent : ruleBatterySent EOF ;
    public final void entryRuleBatterySent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:304:1: ( ruleBatterySent EOF )
            // InternalMyLanguage.g:305:1: ruleBatterySent EOF
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
    // InternalMyLanguage.g:312:1: ruleBatterySent : ( ( rule__BatterySent__Group__0 ) ) ;
    public final void ruleBatterySent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:316:2: ( ( ( rule__BatterySent__Group__0 ) ) )
            // InternalMyLanguage.g:317:2: ( ( rule__BatterySent__Group__0 ) )
            {
            // InternalMyLanguage.g:317:2: ( ( rule__BatterySent__Group__0 ) )
            // InternalMyLanguage.g:318:3: ( rule__BatterySent__Group__0 )
            {
             before(grammarAccess.getBatterySentAccess().getGroup()); 
            // InternalMyLanguage.g:319:3: ( rule__BatterySent__Group__0 )
            // InternalMyLanguage.g:319:4: rule__BatterySent__Group__0
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
    // InternalMyLanguage.g:328:1: entryRulePeopleSent : rulePeopleSent EOF ;
    public final void entryRulePeopleSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:329:1: ( rulePeopleSent EOF )
            // InternalMyLanguage.g:330:1: rulePeopleSent EOF
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
    // InternalMyLanguage.g:337:1: rulePeopleSent : ( ( rule__PeopleSent__Group__0 ) ) ;
    public final void rulePeopleSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:341:2: ( ( ( rule__PeopleSent__Group__0 ) ) )
            // InternalMyLanguage.g:342:2: ( ( rule__PeopleSent__Group__0 ) )
            {
            // InternalMyLanguage.g:342:2: ( ( rule__PeopleSent__Group__0 ) )
            // InternalMyLanguage.g:343:3: ( rule__PeopleSent__Group__0 )
            {
             before(grammarAccess.getPeopleSentAccess().getGroup()); 
            // InternalMyLanguage.g:344:3: ( rule__PeopleSent__Group__0 )
            // InternalMyLanguage.g:344:4: rule__PeopleSent__Group__0
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
    // InternalMyLanguage.g:353:1: entryRulePeoplePosSent : rulePeoplePosSent EOF ;
    public final void entryRulePeoplePosSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:354:1: ( rulePeoplePosSent EOF )
            // InternalMyLanguage.g:355:1: rulePeoplePosSent EOF
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
    // InternalMyLanguage.g:362:1: rulePeoplePosSent : ( ( rule__PeoplePosSent__Group__0 ) ) ;
    public final void rulePeoplePosSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:366:2: ( ( ( rule__PeoplePosSent__Group__0 ) ) )
            // InternalMyLanguage.g:367:2: ( ( rule__PeoplePosSent__Group__0 ) )
            {
            // InternalMyLanguage.g:367:2: ( ( rule__PeoplePosSent__Group__0 ) )
            // InternalMyLanguage.g:368:3: ( rule__PeoplePosSent__Group__0 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getGroup()); 
            // InternalMyLanguage.g:369:3: ( rule__PeoplePosSent__Group__0 )
            // InternalMyLanguage.g:369:4: rule__PeoplePosSent__Group__0
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
    // InternalMyLanguage.g:378:1: entryRulePeopleNumbSent : rulePeopleNumbSent EOF ;
    public final void entryRulePeopleNumbSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:379:1: ( rulePeopleNumbSent EOF )
            // InternalMyLanguage.g:380:1: rulePeopleNumbSent EOF
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
    // InternalMyLanguage.g:387:1: rulePeopleNumbSent : ( ( rule__PeopleNumbSent__Group__0 ) ) ;
    public final void rulePeopleNumbSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:391:2: ( ( ( rule__PeopleNumbSent__Group__0 ) ) )
            // InternalMyLanguage.g:392:2: ( ( rule__PeopleNumbSent__Group__0 ) )
            {
            // InternalMyLanguage.g:392:2: ( ( rule__PeopleNumbSent__Group__0 ) )
            // InternalMyLanguage.g:393:3: ( rule__PeopleNumbSent__Group__0 )
            {
             before(grammarAccess.getPeopleNumbSentAccess().getGroup()); 
            // InternalMyLanguage.g:394:3: ( rule__PeopleNumbSent__Group__0 )
            // InternalMyLanguage.g:394:4: rule__PeopleNumbSent__Group__0
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
    // InternalMyLanguage.g:403:1: entryRuleMissionSent : ruleMissionSent EOF ;
    public final void entryRuleMissionSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:404:1: ( ruleMissionSent EOF )
            // InternalMyLanguage.g:405:1: ruleMissionSent EOF
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
    // InternalMyLanguage.g:412:1: ruleMissionSent : ( ( rule__MissionSent__Group__0 ) ) ;
    public final void ruleMissionSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:416:2: ( ( ( rule__MissionSent__Group__0 ) ) )
            // InternalMyLanguage.g:417:2: ( ( rule__MissionSent__Group__0 ) )
            {
            // InternalMyLanguage.g:417:2: ( ( rule__MissionSent__Group__0 ) )
            // InternalMyLanguage.g:418:3: ( rule__MissionSent__Group__0 )
            {
             before(grammarAccess.getMissionSentAccess().getGroup()); 
            // InternalMyLanguage.g:419:3: ( rule__MissionSent__Group__0 )
            // InternalMyLanguage.g:419:4: rule__MissionSent__Group__0
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
    // InternalMyLanguage.g:428:1: entryRuleMissionGoalSent : ruleMissionGoalSent EOF ;
    public final void entryRuleMissionGoalSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:429:1: ( ruleMissionGoalSent EOF )
            // InternalMyLanguage.g:430:1: ruleMissionGoalSent EOF
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
    // InternalMyLanguage.g:437:1: ruleMissionGoalSent : ( ( rule__MissionGoalSent__Group__0 ) ) ;
    public final void ruleMissionGoalSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:441:2: ( ( ( rule__MissionGoalSent__Group__0 ) ) )
            // InternalMyLanguage.g:442:2: ( ( rule__MissionGoalSent__Group__0 ) )
            {
            // InternalMyLanguage.g:442:2: ( ( rule__MissionGoalSent__Group__0 ) )
            // InternalMyLanguage.g:443:3: ( rule__MissionGoalSent__Group__0 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getGroup()); 
            // InternalMyLanguage.g:444:3: ( rule__MissionGoalSent__Group__0 )
            // InternalMyLanguage.g:444:4: rule__MissionGoalSent__Group__0
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
    // InternalMyLanguage.g:453:1: entryRuleMissionRiskLevelSent : ruleMissionRiskLevelSent EOF ;
    public final void entryRuleMissionRiskLevelSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:454:1: ( ruleMissionRiskLevelSent EOF )
            // InternalMyLanguage.g:455:1: ruleMissionRiskLevelSent EOF
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
    // InternalMyLanguage.g:462:1: ruleMissionRiskLevelSent : ( ( rule__MissionRiskLevelSent__Group__0 ) ) ;
    public final void ruleMissionRiskLevelSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:466:2: ( ( ( rule__MissionRiskLevelSent__Group__0 ) ) )
            // InternalMyLanguage.g:467:2: ( ( rule__MissionRiskLevelSent__Group__0 ) )
            {
            // InternalMyLanguage.g:467:2: ( ( rule__MissionRiskLevelSent__Group__0 ) )
            // InternalMyLanguage.g:468:3: ( rule__MissionRiskLevelSent__Group__0 )
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getGroup()); 
            // InternalMyLanguage.g:469:3: ( rule__MissionRiskLevelSent__Group__0 )
            // InternalMyLanguage.g:469:4: rule__MissionRiskLevelSent__Group__0
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
    // InternalMyLanguage.g:478:1: entryRuleMissionStatusSent : ruleMissionStatusSent EOF ;
    public final void entryRuleMissionStatusSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:479:1: ( ruleMissionStatusSent EOF )
            // InternalMyLanguage.g:480:1: ruleMissionStatusSent EOF
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
    // InternalMyLanguage.g:487:1: ruleMissionStatusSent : ( ( rule__MissionStatusSent__Group__0 ) ) ;
    public final void ruleMissionStatusSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:491:2: ( ( ( rule__MissionStatusSent__Group__0 ) ) )
            // InternalMyLanguage.g:492:2: ( ( rule__MissionStatusSent__Group__0 ) )
            {
            // InternalMyLanguage.g:492:2: ( ( rule__MissionStatusSent__Group__0 ) )
            // InternalMyLanguage.g:493:3: ( rule__MissionStatusSent__Group__0 )
            {
             before(grammarAccess.getMissionStatusSentAccess().getGroup()); 
            // InternalMyLanguage.g:494:3: ( rule__MissionStatusSent__Group__0 )
            // InternalMyLanguage.g:494:4: rule__MissionStatusSent__Group__0
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
    // InternalMyLanguage.g:503:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMyLanguage.g:504:1: ( ruleRobot EOF )
            // InternalMyLanguage.g:505:1: ruleRobot EOF
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
    // InternalMyLanguage.g:512:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:516:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMyLanguage.g:517:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMyLanguage.g:517:2: ( ( rule__Robot__Group__0 ) )
            // InternalMyLanguage.g:518:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMyLanguage.g:519:3: ( rule__Robot__Group__0 )
            // InternalMyLanguage.g:519:4: rule__Robot__Group__0
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
    // InternalMyLanguage.g:528:1: entryRuleRobotAutoPilot : ruleRobotAutoPilot EOF ;
    public final void entryRuleRobotAutoPilot() throws RecognitionException {
        try {
            // InternalMyLanguage.g:529:1: ( ruleRobotAutoPilot EOF )
            // InternalMyLanguage.g:530:1: ruleRobotAutoPilot EOF
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
    // InternalMyLanguage.g:537:1: ruleRobotAutoPilot : ( ( rule__RobotAutoPilot__Group__0 ) ) ;
    public final void ruleRobotAutoPilot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:541:2: ( ( ( rule__RobotAutoPilot__Group__0 ) ) )
            // InternalMyLanguage.g:542:2: ( ( rule__RobotAutoPilot__Group__0 ) )
            {
            // InternalMyLanguage.g:542:2: ( ( rule__RobotAutoPilot__Group__0 ) )
            // InternalMyLanguage.g:543:3: ( rule__RobotAutoPilot__Group__0 )
            {
             before(grammarAccess.getRobotAutoPilotAccess().getGroup()); 
            // InternalMyLanguage.g:544:3: ( rule__RobotAutoPilot__Group__0 )
            // InternalMyLanguage.g:544:4: rule__RobotAutoPilot__Group__0
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
    // InternalMyLanguage.g:553:1: entryRuleRedundantComponent : ruleRedundantComponent EOF ;
    public final void entryRuleRedundantComponent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:554:1: ( ruleRedundantComponent EOF )
            // InternalMyLanguage.g:555:1: ruleRedundantComponent EOF
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
    // InternalMyLanguage.g:562:1: ruleRedundantComponent : ( ( rule__RedundantComponent__Group__0 ) ) ;
    public final void ruleRedundantComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:566:2: ( ( ( rule__RedundantComponent__Group__0 ) ) )
            // InternalMyLanguage.g:567:2: ( ( rule__RedundantComponent__Group__0 ) )
            {
            // InternalMyLanguage.g:567:2: ( ( rule__RedundantComponent__Group__0 ) )
            // InternalMyLanguage.g:568:3: ( rule__RedundantComponent__Group__0 )
            {
             before(grammarAccess.getRedundantComponentAccess().getGroup()); 
            // InternalMyLanguage.g:569:3: ( rule__RedundantComponent__Group__0 )
            // InternalMyLanguage.g:569:4: rule__RedundantComponent__Group__0
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
    // InternalMyLanguage.g:578:1: entryRulePayloadSent : rulePayloadSent EOF ;
    public final void entryRulePayloadSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:579:1: ( rulePayloadSent EOF )
            // InternalMyLanguage.g:580:1: rulePayloadSent EOF
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
    // InternalMyLanguage.g:587:1: rulePayloadSent : ( ( rule__PayloadSent__Group__0 ) ) ;
    public final void rulePayloadSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:591:2: ( ( ( rule__PayloadSent__Group__0 ) ) )
            // InternalMyLanguage.g:592:2: ( ( rule__PayloadSent__Group__0 ) )
            {
            // InternalMyLanguage.g:592:2: ( ( rule__PayloadSent__Group__0 ) )
            // InternalMyLanguage.g:593:3: ( rule__PayloadSent__Group__0 )
            {
             before(grammarAccess.getPayloadSentAccess().getGroup()); 
            // InternalMyLanguage.g:594:3: ( rule__PayloadSent__Group__0 )
            // InternalMyLanguage.g:594:4: rule__PayloadSent__Group__0
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
    // InternalMyLanguage.g:603:1: entryRuleRobotDistanceSent : ruleRobotDistanceSent EOF ;
    public final void entryRuleRobotDistanceSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:604:1: ( ruleRobotDistanceSent EOF )
            // InternalMyLanguage.g:605:1: ruleRobotDistanceSent EOF
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
    // InternalMyLanguage.g:612:1: ruleRobotDistanceSent : ( ( rule__RobotDistanceSent__Group__0 ) ) ;
    public final void ruleRobotDistanceSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:616:2: ( ( ( rule__RobotDistanceSent__Group__0 ) ) )
            // InternalMyLanguage.g:617:2: ( ( rule__RobotDistanceSent__Group__0 ) )
            {
            // InternalMyLanguage.g:617:2: ( ( rule__RobotDistanceSent__Group__0 ) )
            // InternalMyLanguage.g:618:3: ( rule__RobotDistanceSent__Group__0 )
            {
             before(grammarAccess.getRobotDistanceSentAccess().getGroup()); 
            // InternalMyLanguage.g:619:3: ( rule__RobotDistanceSent__Group__0 )
            // InternalMyLanguage.g:619:4: rule__RobotDistanceSent__Group__0
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
    // InternalMyLanguage.g:628:1: entryRuleDistanceToLocationSent : ruleDistanceToLocationSent EOF ;
    public final void entryRuleDistanceToLocationSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:629:1: ( ruleDistanceToLocationSent EOF )
            // InternalMyLanguage.g:630:1: ruleDistanceToLocationSent EOF
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
    // InternalMyLanguage.g:637:1: ruleDistanceToLocationSent : ( ( rule__DistanceToLocationSent__Group__0 ) ) ;
    public final void ruleDistanceToLocationSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:641:2: ( ( ( rule__DistanceToLocationSent__Group__0 ) ) )
            // InternalMyLanguage.g:642:2: ( ( rule__DistanceToLocationSent__Group__0 ) )
            {
            // InternalMyLanguage.g:642:2: ( ( rule__DistanceToLocationSent__Group__0 ) )
            // InternalMyLanguage.g:643:3: ( rule__DistanceToLocationSent__Group__0 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getGroup()); 
            // InternalMyLanguage.g:644:3: ( rule__DistanceToLocationSent__Group__0 )
            // InternalMyLanguage.g:644:4: rule__DistanceToLocationSent__Group__0
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
    // InternalMyLanguage.g:653:1: entryRuleDistanceToObstaclesSent : ruleDistanceToObstaclesSent EOF ;
    public final void entryRuleDistanceToObstaclesSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:654:1: ( ruleDistanceToObstaclesSent EOF )
            // InternalMyLanguage.g:655:1: ruleDistanceToObstaclesSent EOF
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
    // InternalMyLanguage.g:662:1: ruleDistanceToObstaclesSent : ( ( rule__DistanceToObstaclesSent__Group__0 ) ) ;
    public final void ruleDistanceToObstaclesSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:666:2: ( ( ( rule__DistanceToObstaclesSent__Group__0 ) ) )
            // InternalMyLanguage.g:667:2: ( ( rule__DistanceToObstaclesSent__Group__0 ) )
            {
            // InternalMyLanguage.g:667:2: ( ( rule__DistanceToObstaclesSent__Group__0 ) )
            // InternalMyLanguage.g:668:3: ( rule__DistanceToObstaclesSent__Group__0 )
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getGroup()); 
            // InternalMyLanguage.g:669:3: ( rule__DistanceToObstaclesSent__Group__0 )
            // InternalMyLanguage.g:669:4: rule__DistanceToObstaclesSent__Group__0
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
    // InternalMyLanguage.g:678:1: entryRuleEqualSent : ruleEqualSent EOF ;
    public final void entryRuleEqualSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:679:1: ( ruleEqualSent EOF )
            // InternalMyLanguage.g:680:1: ruleEqualSent EOF
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
    // InternalMyLanguage.g:687:1: ruleEqualSent : ( ( rule__EqualSent__Group__0 ) ) ;
    public final void ruleEqualSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:691:2: ( ( ( rule__EqualSent__Group__0 ) ) )
            // InternalMyLanguage.g:692:2: ( ( rule__EqualSent__Group__0 ) )
            {
            // InternalMyLanguage.g:692:2: ( ( rule__EqualSent__Group__0 ) )
            // InternalMyLanguage.g:693:3: ( rule__EqualSent__Group__0 )
            {
             before(grammarAccess.getEqualSentAccess().getGroup()); 
            // InternalMyLanguage.g:694:3: ( rule__EqualSent__Group__0 )
            // InternalMyLanguage.g:694:4: rule__EqualSent__Group__0
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
    // InternalMyLanguage.g:703:1: entryRuleLessSent : ruleLessSent EOF ;
    public final void entryRuleLessSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:704:1: ( ruleLessSent EOF )
            // InternalMyLanguage.g:705:1: ruleLessSent EOF
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
    // InternalMyLanguage.g:712:1: ruleLessSent : ( ( rule__LessSent__Group__0 ) ) ;
    public final void ruleLessSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:716:2: ( ( ( rule__LessSent__Group__0 ) ) )
            // InternalMyLanguage.g:717:2: ( ( rule__LessSent__Group__0 ) )
            {
            // InternalMyLanguage.g:717:2: ( ( rule__LessSent__Group__0 ) )
            // InternalMyLanguage.g:718:3: ( rule__LessSent__Group__0 )
            {
             before(grammarAccess.getLessSentAccess().getGroup()); 
            // InternalMyLanguage.g:719:3: ( rule__LessSent__Group__0 )
            // InternalMyLanguage.g:719:4: rule__LessSent__Group__0
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
    // InternalMyLanguage.g:728:1: entryRuleGreaterSent : ruleGreaterSent EOF ;
    public final void entryRuleGreaterSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:729:1: ( ruleGreaterSent EOF )
            // InternalMyLanguage.g:730:1: ruleGreaterSent EOF
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
    // InternalMyLanguage.g:737:1: ruleGreaterSent : ( ( rule__GreaterSent__Group__0 ) ) ;
    public final void ruleGreaterSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:741:2: ( ( ( rule__GreaterSent__Group__0 ) ) )
            // InternalMyLanguage.g:742:2: ( ( rule__GreaterSent__Group__0 ) )
            {
            // InternalMyLanguage.g:742:2: ( ( rule__GreaterSent__Group__0 ) )
            // InternalMyLanguage.g:743:3: ( rule__GreaterSent__Group__0 )
            {
             before(grammarAccess.getGreaterSentAccess().getGroup()); 
            // InternalMyLanguage.g:744:3: ( rule__GreaterSent__Group__0 )
            // InternalMyLanguage.g:744:4: rule__GreaterSent__Group__0
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
    // InternalMyLanguage.g:753:1: entryRuleRobotStateSent : ruleRobotStateSent EOF ;
    public final void entryRuleRobotStateSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:754:1: ( ruleRobotStateSent EOF )
            // InternalMyLanguage.g:755:1: ruleRobotStateSent EOF
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
    // InternalMyLanguage.g:762:1: ruleRobotStateSent : ( ( rule__RobotStateSent__Group__0 ) ) ;
    public final void ruleRobotStateSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:766:2: ( ( ( rule__RobotStateSent__Group__0 ) ) )
            // InternalMyLanguage.g:767:2: ( ( rule__RobotStateSent__Group__0 ) )
            {
            // InternalMyLanguage.g:767:2: ( ( rule__RobotStateSent__Group__0 ) )
            // InternalMyLanguage.g:768:3: ( rule__RobotStateSent__Group__0 )
            {
             before(grammarAccess.getRobotStateSentAccess().getGroup()); 
            // InternalMyLanguage.g:769:3: ( rule__RobotStateSent__Group__0 )
            // InternalMyLanguage.g:769:4: rule__RobotStateSent__Group__0
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
    // InternalMyLanguage.g:778:1: entryRuleRobotPositionSent : ruleRobotPositionSent EOF ;
    public final void entryRuleRobotPositionSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:779:1: ( ruleRobotPositionSent EOF )
            // InternalMyLanguage.g:780:1: ruleRobotPositionSent EOF
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
    // InternalMyLanguage.g:787:1: ruleRobotPositionSent : ( ( rule__RobotPositionSent__Group__0 ) ) ;
    public final void ruleRobotPositionSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:791:2: ( ( ( rule__RobotPositionSent__Group__0 ) ) )
            // InternalMyLanguage.g:792:2: ( ( rule__RobotPositionSent__Group__0 ) )
            {
            // InternalMyLanguage.g:792:2: ( ( rule__RobotPositionSent__Group__0 ) )
            // InternalMyLanguage.g:793:3: ( rule__RobotPositionSent__Group__0 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getGroup()); 
            // InternalMyLanguage.g:794:3: ( rule__RobotPositionSent__Group__0 )
            // InternalMyLanguage.g:794:4: rule__RobotPositionSent__Group__0
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
    // InternalMyLanguage.g:803:1: entryRuleCirclePosition : ruleCirclePosition EOF ;
    public final void entryRuleCirclePosition() throws RecognitionException {
        try {
            // InternalMyLanguage.g:804:1: ( ruleCirclePosition EOF )
            // InternalMyLanguage.g:805:1: ruleCirclePosition EOF
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
    // InternalMyLanguage.g:812:1: ruleCirclePosition : ( ( rule__CirclePosition__Group__0 ) ) ;
    public final void ruleCirclePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:816:2: ( ( ( rule__CirclePosition__Group__0 ) ) )
            // InternalMyLanguage.g:817:2: ( ( rule__CirclePosition__Group__0 ) )
            {
            // InternalMyLanguage.g:817:2: ( ( rule__CirclePosition__Group__0 ) )
            // InternalMyLanguage.g:818:3: ( rule__CirclePosition__Group__0 )
            {
             before(grammarAccess.getCirclePositionAccess().getGroup()); 
            // InternalMyLanguage.g:819:3: ( rule__CirclePosition__Group__0 )
            // InternalMyLanguage.g:819:4: rule__CirclePosition__Group__0
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
    // InternalMyLanguage.g:828:1: entryRuleSpherePosition : ruleSpherePosition EOF ;
    public final void entryRuleSpherePosition() throws RecognitionException {
        try {
            // InternalMyLanguage.g:829:1: ( ruleSpherePosition EOF )
            // InternalMyLanguage.g:830:1: ruleSpherePosition EOF
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
    // InternalMyLanguage.g:837:1: ruleSpherePosition : ( ( rule__SpherePosition__Group__0 ) ) ;
    public final void ruleSpherePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:841:2: ( ( ( rule__SpherePosition__Group__0 ) ) )
            // InternalMyLanguage.g:842:2: ( ( rule__SpherePosition__Group__0 ) )
            {
            // InternalMyLanguage.g:842:2: ( ( rule__SpherePosition__Group__0 ) )
            // InternalMyLanguage.g:843:3: ( rule__SpherePosition__Group__0 )
            {
             before(grammarAccess.getSpherePositionAccess().getGroup()); 
            // InternalMyLanguage.g:844:3: ( rule__SpherePosition__Group__0 )
            // InternalMyLanguage.g:844:4: rule__SpherePosition__Group__0
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
    // InternalMyLanguage.g:853:1: entryRuleRobotSpeedSent : ruleRobotSpeedSent EOF ;
    public final void entryRuleRobotSpeedSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:854:1: ( ruleRobotSpeedSent EOF )
            // InternalMyLanguage.g:855:1: ruleRobotSpeedSent EOF
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
    // InternalMyLanguage.g:862:1: ruleRobotSpeedSent : ( ( rule__RobotSpeedSent__Group__0 ) ) ;
    public final void ruleRobotSpeedSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:866:2: ( ( ( rule__RobotSpeedSent__Group__0 ) ) )
            // InternalMyLanguage.g:867:2: ( ( rule__RobotSpeedSent__Group__0 ) )
            {
            // InternalMyLanguage.g:867:2: ( ( rule__RobotSpeedSent__Group__0 ) )
            // InternalMyLanguage.g:868:3: ( rule__RobotSpeedSent__Group__0 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getGroup()); 
            // InternalMyLanguage.g:869:3: ( rule__RobotSpeedSent__Group__0 )
            // InternalMyLanguage.g:869:4: rule__RobotSpeedSent__Group__0
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
    // InternalMyLanguage.g:878:1: entryRuleEnvironmentSent : ruleEnvironmentSent EOF ;
    public final void entryRuleEnvironmentSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:879:1: ( ruleEnvironmentSent EOF )
            // InternalMyLanguage.g:880:1: ruleEnvironmentSent EOF
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
    // InternalMyLanguage.g:887:1: ruleEnvironmentSent : ( ( rule__EnvironmentSent__Group__0 ) ) ;
    public final void ruleEnvironmentSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:891:2: ( ( ( rule__EnvironmentSent__Group__0 ) ) )
            // InternalMyLanguage.g:892:2: ( ( rule__EnvironmentSent__Group__0 ) )
            {
            // InternalMyLanguage.g:892:2: ( ( rule__EnvironmentSent__Group__0 ) )
            // InternalMyLanguage.g:893:3: ( rule__EnvironmentSent__Group__0 )
            {
             before(grammarAccess.getEnvironmentSentAccess().getGroup()); 
            // InternalMyLanguage.g:894:3: ( rule__EnvironmentSent__Group__0 )
            // InternalMyLanguage.g:894:4: rule__EnvironmentSent__Group__0
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
    // InternalMyLanguage.g:903:1: entryRuleFailingComponentSent : ruleFailingComponentSent EOF ;
    public final void entryRuleFailingComponentSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:904:1: ( ruleFailingComponentSent EOF )
            // InternalMyLanguage.g:905:1: ruleFailingComponentSent EOF
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
    // InternalMyLanguage.g:912:1: ruleFailingComponentSent : ( ( rule__FailingComponentSent__Group__0 ) ) ;
    public final void ruleFailingComponentSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:916:2: ( ( ( rule__FailingComponentSent__Group__0 ) ) )
            // InternalMyLanguage.g:917:2: ( ( rule__FailingComponentSent__Group__0 ) )
            {
            // InternalMyLanguage.g:917:2: ( ( rule__FailingComponentSent__Group__0 ) )
            // InternalMyLanguage.g:918:3: ( rule__FailingComponentSent__Group__0 )
            {
             before(grammarAccess.getFailingComponentSentAccess().getGroup()); 
            // InternalMyLanguage.g:919:3: ( rule__FailingComponentSent__Group__0 )
            // InternalMyLanguage.g:919:4: rule__FailingComponentSent__Group__0
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
    // InternalMyLanguage.g:928:1: entryRuleRiskSent : ruleRiskSent EOF ;
    public final void entryRuleRiskSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:929:1: ( ruleRiskSent EOF )
            // InternalMyLanguage.g:930:1: ruleRiskSent EOF
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
    // InternalMyLanguage.g:937:1: ruleRiskSent : ( ( rule__RiskSent__Group__0 ) ) ;
    public final void ruleRiskSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:941:2: ( ( ( rule__RiskSent__Group__0 ) ) )
            // InternalMyLanguage.g:942:2: ( ( rule__RiskSent__Group__0 ) )
            {
            // InternalMyLanguage.g:942:2: ( ( rule__RiskSent__Group__0 ) )
            // InternalMyLanguage.g:943:3: ( rule__RiskSent__Group__0 )
            {
             before(grammarAccess.getRiskSentAccess().getGroup()); 
            // InternalMyLanguage.g:944:3: ( rule__RiskSent__Group__0 )
            // InternalMyLanguage.g:944:4: rule__RiskSent__Group__0
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
    // InternalMyLanguage.g:953:1: entryRuleToleranceSent : ruleToleranceSent EOF ;
    public final void entryRuleToleranceSent() throws RecognitionException {
        try {
            // InternalMyLanguage.g:954:1: ( ruleToleranceSent EOF )
            // InternalMyLanguage.g:955:1: ruleToleranceSent EOF
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
    // InternalMyLanguage.g:962:1: ruleToleranceSent : ( ( rule__ToleranceSent__Group__0 ) ) ;
    public final void ruleToleranceSent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:966:2: ( ( ( rule__ToleranceSent__Group__0 ) ) )
            // InternalMyLanguage.g:967:2: ( ( rule__ToleranceSent__Group__0 ) )
            {
            // InternalMyLanguage.g:967:2: ( ( rule__ToleranceSent__Group__0 ) )
            // InternalMyLanguage.g:968:3: ( rule__ToleranceSent__Group__0 )
            {
             before(grammarAccess.getToleranceSentAccess().getGroup()); 
            // InternalMyLanguage.g:969:3: ( rule__ToleranceSent__Group__0 )
            // InternalMyLanguage.g:969:4: rule__ToleranceSent__Group__0
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
    // InternalMyLanguage.g:978:1: entryRuleMISSIONSTATUS : ruleMISSIONSTATUS EOF ;
    public final void entryRuleMISSIONSTATUS() throws RecognitionException {
        try {
            // InternalMyLanguage.g:979:1: ( ruleMISSIONSTATUS EOF )
            // InternalMyLanguage.g:980:1: ruleMISSIONSTATUS EOF
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
    // InternalMyLanguage.g:987:1: ruleMISSIONSTATUS : ( ( rule__MISSIONSTATUS__Alternatives ) ) ;
    public final void ruleMISSIONSTATUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:991:2: ( ( ( rule__MISSIONSTATUS__Alternatives ) ) )
            // InternalMyLanguage.g:992:2: ( ( rule__MISSIONSTATUS__Alternatives ) )
            {
            // InternalMyLanguage.g:992:2: ( ( rule__MISSIONSTATUS__Alternatives ) )
            // InternalMyLanguage.g:993:3: ( rule__MISSIONSTATUS__Alternatives )
            {
             before(grammarAccess.getMISSIONSTATUSAccess().getAlternatives()); 
            // InternalMyLanguage.g:994:3: ( rule__MISSIONSTATUS__Alternatives )
            // InternalMyLanguage.g:994:4: rule__MISSIONSTATUS__Alternatives
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
    // InternalMyLanguage.g:1003:1: entryRuleMISSIONRISKLEVEL : ruleMISSIONRISKLEVEL EOF ;
    public final void entryRuleMISSIONRISKLEVEL() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1004:1: ( ruleMISSIONRISKLEVEL EOF )
            // InternalMyLanguage.g:1005:1: ruleMISSIONRISKLEVEL EOF
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
    // InternalMyLanguage.g:1012:1: ruleMISSIONRISKLEVEL : ( ( rule__MISSIONRISKLEVEL__Alternatives ) ) ;
    public final void ruleMISSIONRISKLEVEL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1016:2: ( ( ( rule__MISSIONRISKLEVEL__Alternatives ) ) )
            // InternalMyLanguage.g:1017:2: ( ( rule__MISSIONRISKLEVEL__Alternatives ) )
            {
            // InternalMyLanguage.g:1017:2: ( ( rule__MISSIONRISKLEVEL__Alternatives ) )
            // InternalMyLanguage.g:1018:3: ( rule__MISSIONRISKLEVEL__Alternatives )
            {
             before(grammarAccess.getMISSIONRISKLEVELAccess().getAlternatives()); 
            // InternalMyLanguage.g:1019:3: ( rule__MISSIONRISKLEVEL__Alternatives )
            // InternalMyLanguage.g:1019:4: rule__MISSIONRISKLEVEL__Alternatives
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
    // InternalMyLanguage.g:1028:1: entryRuleCOLLISIONRISKLEVEL : ruleCOLLISIONRISKLEVEL EOF ;
    public final void entryRuleCOLLISIONRISKLEVEL() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1029:1: ( ruleCOLLISIONRISKLEVEL EOF )
            // InternalMyLanguage.g:1030:1: ruleCOLLISIONRISKLEVEL EOF
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
    // InternalMyLanguage.g:1037:1: ruleCOLLISIONRISKLEVEL : ( ( rule__COLLISIONRISKLEVEL__Alternatives ) ) ;
    public final void ruleCOLLISIONRISKLEVEL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1041:2: ( ( ( rule__COLLISIONRISKLEVEL__Alternatives ) ) )
            // InternalMyLanguage.g:1042:2: ( ( rule__COLLISIONRISKLEVEL__Alternatives ) )
            {
            // InternalMyLanguage.g:1042:2: ( ( rule__COLLISIONRISKLEVEL__Alternatives ) )
            // InternalMyLanguage.g:1043:3: ( rule__COLLISIONRISKLEVEL__Alternatives )
            {
             before(grammarAccess.getCOLLISIONRISKLEVELAccess().getAlternatives()); 
            // InternalMyLanguage.g:1044:3: ( rule__COLLISIONRISKLEVEL__Alternatives )
            // InternalMyLanguage.g:1044:4: rule__COLLISIONRISKLEVEL__Alternatives
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
    // InternalMyLanguage.g:1053:1: entryRuleCOMPONENT : ruleCOMPONENT EOF ;
    public final void entryRuleCOMPONENT() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1054:1: ( ruleCOMPONENT EOF )
            // InternalMyLanguage.g:1055:1: ruleCOMPONENT EOF
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
    // InternalMyLanguage.g:1062:1: ruleCOMPONENT : ( ( rule__COMPONENT__Alternatives ) ) ;
    public final void ruleCOMPONENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1066:2: ( ( ( rule__COMPONENT__Alternatives ) ) )
            // InternalMyLanguage.g:1067:2: ( ( rule__COMPONENT__Alternatives ) )
            {
            // InternalMyLanguage.g:1067:2: ( ( rule__COMPONENT__Alternatives ) )
            // InternalMyLanguage.g:1068:3: ( rule__COMPONENT__Alternatives )
            {
             before(grammarAccess.getCOMPONENTAccess().getAlternatives()); 
            // InternalMyLanguage.g:1069:3: ( rule__COMPONENT__Alternatives )
            // InternalMyLanguage.g:1069:4: rule__COMPONENT__Alternatives
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
    // InternalMyLanguage.g:1078:1: entryRuleDistanceUnit : ruleDistanceUnit EOF ;
    public final void entryRuleDistanceUnit() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1079:1: ( ruleDistanceUnit EOF )
            // InternalMyLanguage.g:1080:1: ruleDistanceUnit EOF
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
    // InternalMyLanguage.g:1087:1: ruleDistanceUnit : ( ( rule__DistanceUnit__Alternatives ) ) ;
    public final void ruleDistanceUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1091:2: ( ( ( rule__DistanceUnit__Alternatives ) ) )
            // InternalMyLanguage.g:1092:2: ( ( rule__DistanceUnit__Alternatives ) )
            {
            // InternalMyLanguage.g:1092:2: ( ( rule__DistanceUnit__Alternatives ) )
            // InternalMyLanguage.g:1093:3: ( rule__DistanceUnit__Alternatives )
            {
             before(grammarAccess.getDistanceUnitAccess().getAlternatives()); 
            // InternalMyLanguage.g:1094:3: ( rule__DistanceUnit__Alternatives )
            // InternalMyLanguage.g:1094:4: rule__DistanceUnit__Alternatives
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
    // InternalMyLanguage.g:1103:1: entryRuleTimeUnit : ruleTimeUnit EOF ;
    public final void entryRuleTimeUnit() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1104:1: ( ruleTimeUnit EOF )
            // InternalMyLanguage.g:1105:1: ruleTimeUnit EOF
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
    // InternalMyLanguage.g:1112:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1116:2: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalMyLanguage.g:1117:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalMyLanguage.g:1117:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalMyLanguage.g:1118:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalMyLanguage.g:1119:3: ( rule__TimeUnit__Alternatives )
            // InternalMyLanguage.g:1119:4: rule__TimeUnit__Alternatives
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
    // InternalMyLanguage.g:1128:1: entryRuleSECONDS : ruleSECONDS EOF ;
    public final void entryRuleSECONDS() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1129:1: ( ruleSECONDS EOF )
            // InternalMyLanguage.g:1130:1: ruleSECONDS EOF
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
    // InternalMyLanguage.g:1137:1: ruleSECONDS : ( ( rule__SECONDS__Group__0 ) ) ;
    public final void ruleSECONDS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1141:2: ( ( ( rule__SECONDS__Group__0 ) ) )
            // InternalMyLanguage.g:1142:2: ( ( rule__SECONDS__Group__0 ) )
            {
            // InternalMyLanguage.g:1142:2: ( ( rule__SECONDS__Group__0 ) )
            // InternalMyLanguage.g:1143:3: ( rule__SECONDS__Group__0 )
            {
             before(grammarAccess.getSECONDSAccess().getGroup()); 
            // InternalMyLanguage.g:1144:3: ( rule__SECONDS__Group__0 )
            // InternalMyLanguage.g:1144:4: rule__SECONDS__Group__0
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
    // InternalMyLanguage.g:1153:1: entryRuleHOUR : ruleHOUR EOF ;
    public final void entryRuleHOUR() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1154:1: ( ruleHOUR EOF )
            // InternalMyLanguage.g:1155:1: ruleHOUR EOF
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
    // InternalMyLanguage.g:1162:1: ruleHOUR : ( ( rule__HOUR__Group__0 ) ) ;
    public final void ruleHOUR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1166:2: ( ( ( rule__HOUR__Group__0 ) ) )
            // InternalMyLanguage.g:1167:2: ( ( rule__HOUR__Group__0 ) )
            {
            // InternalMyLanguage.g:1167:2: ( ( rule__HOUR__Group__0 ) )
            // InternalMyLanguage.g:1168:3: ( rule__HOUR__Group__0 )
            {
             before(grammarAccess.getHOURAccess().getGroup()); 
            // InternalMyLanguage.g:1169:3: ( rule__HOUR__Group__0 )
            // InternalMyLanguage.g:1169:4: rule__HOUR__Group__0
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
    // InternalMyLanguage.g:1178:1: entryRuleMINUTES : ruleMINUTES EOF ;
    public final void entryRuleMINUTES() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1179:1: ( ruleMINUTES EOF )
            // InternalMyLanguage.g:1180:1: ruleMINUTES EOF
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
    // InternalMyLanguage.g:1187:1: ruleMINUTES : ( ( rule__MINUTES__Group__0 ) ) ;
    public final void ruleMINUTES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1191:2: ( ( ( rule__MINUTES__Group__0 ) ) )
            // InternalMyLanguage.g:1192:2: ( ( rule__MINUTES__Group__0 ) )
            {
            // InternalMyLanguage.g:1192:2: ( ( rule__MINUTES__Group__0 ) )
            // InternalMyLanguage.g:1193:3: ( rule__MINUTES__Group__0 )
            {
             before(grammarAccess.getMINUTESAccess().getGroup()); 
            // InternalMyLanguage.g:1194:3: ( rule__MINUTES__Group__0 )
            // InternalMyLanguage.g:1194:4: rule__MINUTES__Group__0
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
    // InternalMyLanguage.g:1203:1: entryRuleMETER : ruleMETER EOF ;
    public final void entryRuleMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1204:1: ( ruleMETER EOF )
            // InternalMyLanguage.g:1205:1: ruleMETER EOF
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
    // InternalMyLanguage.g:1212:1: ruleMETER : ( ( rule__METER__Group__0 ) ) ;
    public final void ruleMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1216:2: ( ( ( rule__METER__Group__0 ) ) )
            // InternalMyLanguage.g:1217:2: ( ( rule__METER__Group__0 ) )
            {
            // InternalMyLanguage.g:1217:2: ( ( rule__METER__Group__0 ) )
            // InternalMyLanguage.g:1218:3: ( rule__METER__Group__0 )
            {
             before(grammarAccess.getMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1219:3: ( rule__METER__Group__0 )
            // InternalMyLanguage.g:1219:4: rule__METER__Group__0
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
    // InternalMyLanguage.g:1228:1: entryRuleCENTIMETER : ruleCENTIMETER EOF ;
    public final void entryRuleCENTIMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1229:1: ( ruleCENTIMETER EOF )
            // InternalMyLanguage.g:1230:1: ruleCENTIMETER EOF
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
    // InternalMyLanguage.g:1237:1: ruleCENTIMETER : ( ( rule__CENTIMETER__Group__0 ) ) ;
    public final void ruleCENTIMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1241:2: ( ( ( rule__CENTIMETER__Group__0 ) ) )
            // InternalMyLanguage.g:1242:2: ( ( rule__CENTIMETER__Group__0 ) )
            {
            // InternalMyLanguage.g:1242:2: ( ( rule__CENTIMETER__Group__0 ) )
            // InternalMyLanguage.g:1243:3: ( rule__CENTIMETER__Group__0 )
            {
             before(grammarAccess.getCENTIMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1244:3: ( rule__CENTIMETER__Group__0 )
            // InternalMyLanguage.g:1244:4: rule__CENTIMETER__Group__0
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
    // InternalMyLanguage.g:1253:1: entryRuleMILLIMETER : ruleMILLIMETER EOF ;
    public final void entryRuleMILLIMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1254:1: ( ruleMILLIMETER EOF )
            // InternalMyLanguage.g:1255:1: ruleMILLIMETER EOF
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
    // InternalMyLanguage.g:1262:1: ruleMILLIMETER : ( ( rule__MILLIMETER__Group__0 ) ) ;
    public final void ruleMILLIMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1266:2: ( ( ( rule__MILLIMETER__Group__0 ) ) )
            // InternalMyLanguage.g:1267:2: ( ( rule__MILLIMETER__Group__0 ) )
            {
            // InternalMyLanguage.g:1267:2: ( ( rule__MILLIMETER__Group__0 ) )
            // InternalMyLanguage.g:1268:3: ( rule__MILLIMETER__Group__0 )
            {
             before(grammarAccess.getMILLIMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1269:3: ( rule__MILLIMETER__Group__0 )
            // InternalMyLanguage.g:1269:4: rule__MILLIMETER__Group__0
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
    // InternalMyLanguage.g:1278:1: entryRuleKILOMETER : ruleKILOMETER EOF ;
    public final void entryRuleKILOMETER() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1279:1: ( ruleKILOMETER EOF )
            // InternalMyLanguage.g:1280:1: ruleKILOMETER EOF
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
    // InternalMyLanguage.g:1287:1: ruleKILOMETER : ( ( rule__KILOMETER__Group__0 ) ) ;
    public final void ruleKILOMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1291:2: ( ( ( rule__KILOMETER__Group__0 ) ) )
            // InternalMyLanguage.g:1292:2: ( ( rule__KILOMETER__Group__0 ) )
            {
            // InternalMyLanguage.g:1292:2: ( ( rule__KILOMETER__Group__0 ) )
            // InternalMyLanguage.g:1293:3: ( rule__KILOMETER__Group__0 )
            {
             before(grammarAccess.getKILOMETERAccess().getGroup()); 
            // InternalMyLanguage.g:1294:3: ( rule__KILOMETER__Group__0 )
            // InternalMyLanguage.g:1294:4: rule__KILOMETER__Group__0
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
    // InternalMyLanguage.g:1303:1: entryRulePercentUnit : rulePercentUnit EOF ;
    public final void entryRulePercentUnit() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1304:1: ( rulePercentUnit EOF )
            // InternalMyLanguage.g:1305:1: rulePercentUnit EOF
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
    // InternalMyLanguage.g:1312:1: rulePercentUnit : ( ( rule__PercentUnit__Group__0 ) ) ;
    public final void rulePercentUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1316:2: ( ( ( rule__PercentUnit__Group__0 ) ) )
            // InternalMyLanguage.g:1317:2: ( ( rule__PercentUnit__Group__0 ) )
            {
            // InternalMyLanguage.g:1317:2: ( ( rule__PercentUnit__Group__0 ) )
            // InternalMyLanguage.g:1318:3: ( rule__PercentUnit__Group__0 )
            {
             before(grammarAccess.getPercentUnitAccess().getGroup()); 
            // InternalMyLanguage.g:1319:3: ( rule__PercentUnit__Group__0 )
            // InternalMyLanguage.g:1319:4: rule__PercentUnit__Group__0
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
    // InternalMyLanguage.g:1328:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalMyLanguage.g:1329:1: ( ruleDOUBLE EOF )
            // InternalMyLanguage.g:1330:1: ruleDOUBLE EOF
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
    // InternalMyLanguage.g:1337:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1341:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalMyLanguage.g:1342:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalMyLanguage.g:1342:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalMyLanguage.g:1343:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalMyLanguage.g:1344:3: ( rule__DOUBLE__Group__0 )
            // InternalMyLanguage.g:1344:4: rule__DOUBLE__Group__0
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
    // InternalMyLanguage.g:1352:1: rule__Statement__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1356:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) )
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
                    // InternalMyLanguage.g:1357:2: ( ruleGiven )
                    {
                    // InternalMyLanguage.g:1357:2: ( ruleGiven )
                    // InternalMyLanguage.g:1358:3: ruleGiven
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
                    // InternalMyLanguage.g:1363:2: ( ruleWhen )
                    {
                    // InternalMyLanguage.g:1363:2: ( ruleWhen )
                    // InternalMyLanguage.g:1364:3: ruleWhen
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
                    // InternalMyLanguage.g:1369:2: ( ruleThen )
                    {
                    // InternalMyLanguage.g:1369:2: ( ruleThen )
                    // InternalMyLanguage.g:1370:3: ruleThen
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
    // InternalMyLanguage.g:1379:1: rule__StatementBody__Alternatives : ( ( ruleRobot ) | ( ruleEnvironmentSent ) | ( ruleTimeSent ) | ( rulePeopleSent ) | ( ruleMissionSent ) | ( ruleNotificationSent ) | ( ruleBatterySent ) );
    public final void rule__StatementBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1383:1: ( ( ruleRobot ) | ( ruleEnvironmentSent ) | ( ruleTimeSent ) | ( rulePeopleSent ) | ( ruleMissionSent ) | ( ruleNotificationSent ) | ( ruleBatterySent ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt3=1;
                }
                break;
            case 70:
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
            case 86:
                {
                alt3=6;
                }
                break;
            case 42:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyLanguage.g:1384:2: ( ruleRobot )
                    {
                    // InternalMyLanguage.g:1384:2: ( ruleRobot )
                    // InternalMyLanguage.g:1385:3: ruleRobot
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
                    // InternalMyLanguage.g:1390:2: ( ruleEnvironmentSent )
                    {
                    // InternalMyLanguage.g:1390:2: ( ruleEnvironmentSent )
                    // InternalMyLanguage.g:1391:3: ruleEnvironmentSent
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
                    // InternalMyLanguage.g:1396:2: ( ruleTimeSent )
                    {
                    // InternalMyLanguage.g:1396:2: ( ruleTimeSent )
                    // InternalMyLanguage.g:1397:3: ruleTimeSent
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
                    // InternalMyLanguage.g:1402:2: ( rulePeopleSent )
                    {
                    // InternalMyLanguage.g:1402:2: ( rulePeopleSent )
                    // InternalMyLanguage.g:1403:3: rulePeopleSent
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
                    // InternalMyLanguage.g:1408:2: ( ruleMissionSent )
                    {
                    // InternalMyLanguage.g:1408:2: ( ruleMissionSent )
                    // InternalMyLanguage.g:1409:3: ruleMissionSent
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
                    // InternalMyLanguage.g:1414:2: ( ruleNotificationSent )
                    {
                    // InternalMyLanguage.g:1414:2: ( ruleNotificationSent )
                    // InternalMyLanguage.g:1415:3: ruleNotificationSent
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
                    // InternalMyLanguage.g:1420:2: ( ruleBatterySent )
                    {
                    // InternalMyLanguage.g:1420:2: ( ruleBatterySent )
                    // InternalMyLanguage.g:1421:3: ruleBatterySent
                    {
                     before(grammarAccess.getStatementBodyAccess().getBatterySentParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleBatterySent();

                    state._fsp--;

                     after(grammarAccess.getStatementBodyAccess().getBatterySentParserRuleCall_6()); 

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


    // $ANTLR start "rule__BatterySent__SentAlternatives_3_0"
    // InternalMyLanguage.g:1430:1: rule__BatterySent__SentAlternatives_3_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__BatterySent__SentAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1434:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt4=1;
                }
                break;
            case 60:
                {
                alt4=2;
                }
                break;
            case 59:
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
                    // InternalMyLanguage.g:1435:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1435:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1436:3: ruleGreaterSent
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
                    // InternalMyLanguage.g:1441:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1441:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1442:3: ruleLessSent
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
                    // InternalMyLanguage.g:1447:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1447:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1448:3: ruleEqualSent
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
    // InternalMyLanguage.g:1457:1: rule__PeopleSent__Alternatives_1 : ( ( rulePeopleNumbSent ) | ( rulePeoplePosSent ) );
    public final void rule__PeopleSent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1461:1: ( ( rulePeopleNumbSent ) | ( rulePeoplePosSent ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==46) ) {
                alt5=1;
            }
            else if ( (LA5_0==45) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyLanguage.g:1462:2: ( rulePeopleNumbSent )
                    {
                    // InternalMyLanguage.g:1462:2: ( rulePeopleNumbSent )
                    // InternalMyLanguage.g:1463:3: rulePeopleNumbSent
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
                    // InternalMyLanguage.g:1468:2: ( rulePeoplePosSent )
                    {
                    // InternalMyLanguage.g:1468:2: ( rulePeoplePosSent )
                    // InternalMyLanguage.g:1469:3: rulePeoplePosSent
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
    // InternalMyLanguage.g:1478:1: rule__PeoplePosSent__ToleranceAlternatives_5_0 : ( ( ruleCirclePosition ) | ( ruleSpherePosition ) );
    public final void rule__PeoplePosSent__ToleranceAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1482:1: ( ( ruleCirclePosition ) | ( ruleSpherePosition ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==64) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==65) ) {
                    alt6=1;
                }
                else if ( (LA6_1==68) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyLanguage.g:1483:2: ( ruleCirclePosition )
                    {
                    // InternalMyLanguage.g:1483:2: ( ruleCirclePosition )
                    // InternalMyLanguage.g:1484:3: ruleCirclePosition
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
                    // InternalMyLanguage.g:1489:2: ( ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:1489:2: ( ruleSpherePosition )
                    // InternalMyLanguage.g:1490:3: ruleSpherePosition
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
    // InternalMyLanguage.g:1499:1: rule__MissionSent__Alternatives_1 : ( ( ruleMissionStatusSent ) | ( ruleMissionRiskLevelSent ) | ( ruleMissionGoalSent ) );
    public final void rule__MissionSent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1503:1: ( ( ruleMissionStatusSent ) | ( ruleMissionRiskLevelSent ) | ( ruleMissionGoalSent ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 49:
                {
                alt7=2;
                }
                break;
            case 48:
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
                    // InternalMyLanguage.g:1504:2: ( ruleMissionStatusSent )
                    {
                    // InternalMyLanguage.g:1504:2: ( ruleMissionStatusSent )
                    // InternalMyLanguage.g:1505:3: ruleMissionStatusSent
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
                    // InternalMyLanguage.g:1510:2: ( ruleMissionRiskLevelSent )
                    {
                    // InternalMyLanguage.g:1510:2: ( ruleMissionRiskLevelSent )
                    // InternalMyLanguage.g:1511:3: ruleMissionRiskLevelSent
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
                    // InternalMyLanguage.g:1516:2: ( ruleMissionGoalSent )
                    {
                    // InternalMyLanguage.g:1516:2: ( ruleMissionGoalSent )
                    // InternalMyLanguage.g:1517:3: ruleMissionGoalSent
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
    // InternalMyLanguage.g:1526:1: rule__Robot__Alternatives_1 : ( ( ruleRobotPositionSent ) | ( ruleRobotSpeedSent ) | ( ruleRobotStateSent ) | ( ruleRobotDistanceSent ) | ( ruleRiskSent ) | ( rulePayloadSent ) | ( ruleFailingComponentSent ) | ( ruleRedundantComponent ) | ( ruleRobotAutoPilot ) );
    public final void rule__Robot__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1530:1: ( ( ruleRobotPositionSent ) | ( ruleRobotSpeedSent ) | ( ruleRobotStateSent ) | ( ruleRobotDistanceSent ) | ( ruleRiskSent ) | ( rulePayloadSent ) | ( ruleFailingComponentSent ) | ( ruleRedundantComponent ) | ( ruleRobotAutoPilot ) )
            int alt8=9;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMyLanguage.g:1531:2: ( ruleRobotPositionSent )
                    {
                    // InternalMyLanguage.g:1531:2: ( ruleRobotPositionSent )
                    // InternalMyLanguage.g:1532:3: ruleRobotPositionSent
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
                    // InternalMyLanguage.g:1537:2: ( ruleRobotSpeedSent )
                    {
                    // InternalMyLanguage.g:1537:2: ( ruleRobotSpeedSent )
                    // InternalMyLanguage.g:1538:3: ruleRobotSpeedSent
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
                    // InternalMyLanguage.g:1543:2: ( ruleRobotStateSent )
                    {
                    // InternalMyLanguage.g:1543:2: ( ruleRobotStateSent )
                    // InternalMyLanguage.g:1544:3: ruleRobotStateSent
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
                    // InternalMyLanguage.g:1549:2: ( ruleRobotDistanceSent )
                    {
                    // InternalMyLanguage.g:1549:2: ( ruleRobotDistanceSent )
                    // InternalMyLanguage.g:1550:3: ruleRobotDistanceSent
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
                    // InternalMyLanguage.g:1555:2: ( ruleRiskSent )
                    {
                    // InternalMyLanguage.g:1555:2: ( ruleRiskSent )
                    // InternalMyLanguage.g:1556:3: ruleRiskSent
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
                    // InternalMyLanguage.g:1561:2: ( rulePayloadSent )
                    {
                    // InternalMyLanguage.g:1561:2: ( rulePayloadSent )
                    // InternalMyLanguage.g:1562:3: rulePayloadSent
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
                    // InternalMyLanguage.g:1567:2: ( ruleFailingComponentSent )
                    {
                    // InternalMyLanguage.g:1567:2: ( ruleFailingComponentSent )
                    // InternalMyLanguage.g:1568:3: ruleFailingComponentSent
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
                    // InternalMyLanguage.g:1573:2: ( ruleRedundantComponent )
                    {
                    // InternalMyLanguage.g:1573:2: ( ruleRedundantComponent )
                    // InternalMyLanguage.g:1574:3: ruleRedundantComponent
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
                    // InternalMyLanguage.g:1579:2: ( ruleRobotAutoPilot )
                    {
                    // InternalMyLanguage.g:1579:2: ( ruleRobotAutoPilot )
                    // InternalMyLanguage.g:1580:3: ruleRobotAutoPilot
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
    // InternalMyLanguage.g:1589:1: rule__RobotAutoPilot__StatusAlternatives_2_0 : ( ( 'ON' ) | ( 'OFF' ) );
    public final void rule__RobotAutoPilot__StatusAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1593:1: ( ( 'ON' ) | ( 'OFF' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyLanguage.g:1594:2: ( 'ON' )
                    {
                    // InternalMyLanguage.g:1594:2: ( 'ON' )
                    // InternalMyLanguage.g:1595:3: 'ON'
                    {
                     before(grammarAccess.getRobotAutoPilotAccess().getStatusONKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRobotAutoPilotAccess().getStatusONKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1600:2: ( 'OFF' )
                    {
                    // InternalMyLanguage.g:1600:2: ( 'OFF' )
                    // InternalMyLanguage.g:1601:3: 'OFF'
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
    // InternalMyLanguage.g:1610:1: rule__RobotDistanceSent__SentAlternatives_2_0 : ( ( ruleDistanceToObstaclesSent ) | ( ruleDistanceToLocationSent ) );
    public final void rule__RobotDistanceSent__SentAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1614:1: ( ( ruleDistanceToObstaclesSent ) | ( ruleDistanceToLocationSent ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==58) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT||LA10_0==84) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyLanguage.g:1615:2: ( ruleDistanceToObstaclesSent )
                    {
                    // InternalMyLanguage.g:1615:2: ( ruleDistanceToObstaclesSent )
                    // InternalMyLanguage.g:1616:3: ruleDistanceToObstaclesSent
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
                    // InternalMyLanguage.g:1621:2: ( ruleDistanceToLocationSent )
                    {
                    // InternalMyLanguage.g:1621:2: ( ruleDistanceToLocationSent )
                    // InternalMyLanguage.g:1622:3: ruleDistanceToLocationSent
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
    // InternalMyLanguage.g:1631:1: rule__DistanceToLocationSent__BodyAlternatives_4_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__DistanceToLocationSent__BodyAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1635:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt11=1;
                }
                break;
            case 60:
                {
                alt11=2;
                }
                break;
            case 59:
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
                    // InternalMyLanguage.g:1636:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1636:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1637:3: ruleGreaterSent
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
                    // InternalMyLanguage.g:1642:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1642:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1643:3: ruleLessSent
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
                    // InternalMyLanguage.g:1648:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1648:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1649:3: ruleEqualSent
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
    // InternalMyLanguage.g:1658:1: rule__DistanceToObstaclesSent__BodyAlternatives_2_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__DistanceToObstaclesSent__BodyAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1662:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt12=1;
                }
                break;
            case 60:
                {
                alt12=2;
                }
                break;
            case 59:
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
                    // InternalMyLanguage.g:1663:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1663:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1664:3: ruleGreaterSent
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
                    // InternalMyLanguage.g:1669:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1669:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1670:3: ruleLessSent
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
                    // InternalMyLanguage.g:1675:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1675:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1676:3: ruleEqualSent
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
    // InternalMyLanguage.g:1685:1: rule__EqualSent__AmountAlternatives_2_0 : ( ( ruleDistanceUnit ) | ( rulePercentUnit ) );
    public final void rule__EqualSent__AmountAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1689:1: ( ( ruleDistanceUnit ) | ( rulePercentUnit ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=79 && LA13_0<=82)) ) {
                alt13=1;
            }
            else if ( (LA13_0==83) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyLanguage.g:1690:2: ( ruleDistanceUnit )
                    {
                    // InternalMyLanguage.g:1690:2: ( ruleDistanceUnit )
                    // InternalMyLanguage.g:1691:3: ruleDistanceUnit
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
                    // InternalMyLanguage.g:1696:2: ( rulePercentUnit )
                    {
                    // InternalMyLanguage.g:1696:2: ( rulePercentUnit )
                    // InternalMyLanguage.g:1697:3: rulePercentUnit
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
    // InternalMyLanguage.g:1706:1: rule__LessSent__AmountAlternatives_2_0 : ( ( ruleDistanceUnit ) | ( rulePercentUnit ) );
    public final void rule__LessSent__AmountAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1710:1: ( ( ruleDistanceUnit ) | ( rulePercentUnit ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=79 && LA14_0<=82)) ) {
                alt14=1;
            }
            else if ( (LA14_0==83) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyLanguage.g:1711:2: ( ruleDistanceUnit )
                    {
                    // InternalMyLanguage.g:1711:2: ( ruleDistanceUnit )
                    // InternalMyLanguage.g:1712:3: ruleDistanceUnit
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
                    // InternalMyLanguage.g:1717:2: ( rulePercentUnit )
                    {
                    // InternalMyLanguage.g:1717:2: ( rulePercentUnit )
                    // InternalMyLanguage.g:1718:3: rulePercentUnit
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
    // InternalMyLanguage.g:1727:1: rule__GreaterSent__AmountAlternatives_2_0 : ( ( ruleDistanceUnit ) | ( rulePercentUnit ) );
    public final void rule__GreaterSent__AmountAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1731:1: ( ( ruleDistanceUnit ) | ( rulePercentUnit ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=79 && LA15_0<=82)) ) {
                alt15=1;
            }
            else if ( (LA15_0==83) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyLanguage.g:1732:2: ( ruleDistanceUnit )
                    {
                    // InternalMyLanguage.g:1732:2: ( ruleDistanceUnit )
                    // InternalMyLanguage.g:1733:3: ruleDistanceUnit
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
                    // InternalMyLanguage.g:1738:2: ( rulePercentUnit )
                    {
                    // InternalMyLanguage.g:1738:2: ( rulePercentUnit )
                    // InternalMyLanguage.g:1739:3: rulePercentUnit
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
    // InternalMyLanguage.g:1748:1: rule__RobotPositionSent__ToleranceAlternatives_5_0 : ( ( ruleCirclePosition ) | ( ruleSpherePosition ) );
    public final void rule__RobotPositionSent__ToleranceAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1752:1: ( ( ruleCirclePosition ) | ( ruleSpherePosition ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==64) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==68) ) {
                    alt16=2;
                }
                else if ( (LA16_1==65) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyLanguage.g:1753:2: ( ruleCirclePosition )
                    {
                    // InternalMyLanguage.g:1753:2: ( ruleCirclePosition )
                    // InternalMyLanguage.g:1754:3: ruleCirclePosition
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
                    // InternalMyLanguage.g:1759:2: ( ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:1759:2: ( ruleSpherePosition )
                    // InternalMyLanguage.g:1760:3: ruleSpherePosition
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
    // InternalMyLanguage.g:1769:1: rule__EnvironmentSent__BodyAlternatives_3_0 : ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) );
    public final void rule__EnvironmentSent__BodyAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1773:1: ( ( ruleGreaterSent ) | ( ruleLessSent ) | ( ruleEqualSent ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt17=1;
                }
                break;
            case 60:
                {
                alt17=2;
                }
                break;
            case 59:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyLanguage.g:1774:2: ( ruleGreaterSent )
                    {
                    // InternalMyLanguage.g:1774:2: ( ruleGreaterSent )
                    // InternalMyLanguage.g:1775:3: ruleGreaterSent
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
                    // InternalMyLanguage.g:1780:2: ( ruleLessSent )
                    {
                    // InternalMyLanguage.g:1780:2: ( ruleLessSent )
                    // InternalMyLanguage.g:1781:3: ruleLessSent
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
                    // InternalMyLanguage.g:1786:2: ( ruleEqualSent )
                    {
                    // InternalMyLanguage.g:1786:2: ( ruleEqualSent )
                    // InternalMyLanguage.g:1787:3: ruleEqualSent
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
    // InternalMyLanguage.g:1796:1: rule__MISSIONSTATUS__Alternatives : ( ( 'ACTIVE' ) | ( 'UNACTIVE' ) | ( 'PAUSED' ) );
    public final void rule__MISSIONSTATUS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1800:1: ( ( 'ACTIVE' ) | ( 'UNACTIVE' ) | ( 'PAUSED' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt18=1;
                }
                break;
            case 14:
                {
                alt18=2;
                }
                break;
            case 15:
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
                    // InternalMyLanguage.g:1801:2: ( 'ACTIVE' )
                    {
                    // InternalMyLanguage.g:1801:2: ( 'ACTIVE' )
                    // InternalMyLanguage.g:1802:3: 'ACTIVE'
                    {
                     before(grammarAccess.getMISSIONSTATUSAccess().getACTIVEKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMISSIONSTATUSAccess().getACTIVEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1807:2: ( 'UNACTIVE' )
                    {
                    // InternalMyLanguage.g:1807:2: ( 'UNACTIVE' )
                    // InternalMyLanguage.g:1808:3: 'UNACTIVE'
                    {
                     before(grammarAccess.getMISSIONSTATUSAccess().getUNACTIVEKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMISSIONSTATUSAccess().getUNACTIVEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1813:2: ( 'PAUSED' )
                    {
                    // InternalMyLanguage.g:1813:2: ( 'PAUSED' )
                    // InternalMyLanguage.g:1814:3: 'PAUSED'
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
    // InternalMyLanguage.g:1823:1: rule__MISSIONRISKLEVEL__Alternatives : ( ( 'SAFE' ) | ( 'UNSAFE' ) );
    public final void rule__MISSIONRISKLEVEL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1827:1: ( ( 'SAFE' ) | ( 'UNSAFE' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            else if ( (LA19_0==17) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyLanguage.g:1828:2: ( 'SAFE' )
                    {
                    // InternalMyLanguage.g:1828:2: ( 'SAFE' )
                    // InternalMyLanguage.g:1829:3: 'SAFE'
                    {
                     before(grammarAccess.getMISSIONRISKLEVELAccess().getSAFEKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMISSIONRISKLEVELAccess().getSAFEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1834:2: ( 'UNSAFE' )
                    {
                    // InternalMyLanguage.g:1834:2: ( 'UNSAFE' )
                    // InternalMyLanguage.g:1835:3: 'UNSAFE'
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
    // InternalMyLanguage.g:1844:1: rule__COLLISIONRISKLEVEL__Alternatives : ( ( 'SAFE' ) | ( 'WARNING' ) | ( 'CRITICAL' ) );
    public final void rule__COLLISIONRISKLEVEL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1848:1: ( ( 'SAFE' ) | ( 'WARNING' ) | ( 'CRITICAL' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt20=1;
                }
                break;
            case 18:
                {
                alt20=2;
                }
                break;
            case 19:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyLanguage.g:1849:2: ( 'SAFE' )
                    {
                    // InternalMyLanguage.g:1849:2: ( 'SAFE' )
                    // InternalMyLanguage.g:1850:3: 'SAFE'
                    {
                     before(grammarAccess.getCOLLISIONRISKLEVELAccess().getSAFEKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCOLLISIONRISKLEVELAccess().getSAFEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1855:2: ( 'WARNING' )
                    {
                    // InternalMyLanguage.g:1855:2: ( 'WARNING' )
                    // InternalMyLanguage.g:1856:3: 'WARNING'
                    {
                     before(grammarAccess.getCOLLISIONRISKLEVELAccess().getWARNINGKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCOLLISIONRISKLEVELAccess().getWARNINGKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1861:2: ( 'CRITICAL' )
                    {
                    // InternalMyLanguage.g:1861:2: ( 'CRITICAL' )
                    // InternalMyLanguage.g:1862:3: 'CRITICAL'
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
    // InternalMyLanguage.g:1871:1: rule__COMPONENT__Alternatives : ( ( 'motor' ) | ( 'camera' ) | ( 'GPS' ) | ( 'battery' ) | ( 'barometer' ) | ( 'scanner' ) | ( 'sonar' ) | ( 'autopilot' ) );
    public final void rule__COMPONENT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1875:1: ( ( 'motor' ) | ( 'camera' ) | ( 'GPS' ) | ( 'battery' ) | ( 'barometer' ) | ( 'scanner' ) | ( 'sonar' ) | ( 'autopilot' ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt21=1;
                }
                break;
            case 21:
                {
                alt21=2;
                }
                break;
            case 22:
                {
                alt21=3;
                }
                break;
            case 23:
                {
                alt21=4;
                }
                break;
            case 24:
                {
                alt21=5;
                }
                break;
            case 25:
                {
                alt21=6;
                }
                break;
            case 26:
                {
                alt21=7;
                }
                break;
            case 27:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyLanguage.g:1876:2: ( 'motor' )
                    {
                    // InternalMyLanguage.g:1876:2: ( 'motor' )
                    // InternalMyLanguage.g:1877:3: 'motor'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getMotorKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getMotorKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1882:2: ( 'camera' )
                    {
                    // InternalMyLanguage.g:1882:2: ( 'camera' )
                    // InternalMyLanguage.g:1883:3: 'camera'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getCameraKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getCameraKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1888:2: ( 'GPS' )
                    {
                    // InternalMyLanguage.g:1888:2: ( 'GPS' )
                    // InternalMyLanguage.g:1889:3: 'GPS'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getGPSKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getGPSKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:1894:2: ( 'battery' )
                    {
                    // InternalMyLanguage.g:1894:2: ( 'battery' )
                    // InternalMyLanguage.g:1895:3: 'battery'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getBatteryKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getBatteryKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyLanguage.g:1900:2: ( 'barometer' )
                    {
                    // InternalMyLanguage.g:1900:2: ( 'barometer' )
                    // InternalMyLanguage.g:1901:3: 'barometer'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getBarometerKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getBarometerKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyLanguage.g:1906:2: ( 'scanner' )
                    {
                    // InternalMyLanguage.g:1906:2: ( 'scanner' )
                    // InternalMyLanguage.g:1907:3: 'scanner'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getScannerKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getScannerKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyLanguage.g:1912:2: ( 'sonar' )
                    {
                    // InternalMyLanguage.g:1912:2: ( 'sonar' )
                    // InternalMyLanguage.g:1913:3: 'sonar'
                    {
                     before(grammarAccess.getCOMPONENTAccess().getSonarKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getCOMPONENTAccess().getSonarKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyLanguage.g:1918:2: ( 'autopilot' )
                    {
                    // InternalMyLanguage.g:1918:2: ( 'autopilot' )
                    // InternalMyLanguage.g:1919:3: 'autopilot'
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
    // InternalMyLanguage.g:1928:1: rule__DistanceUnit__Alternatives : ( ( ruleMETER ) | ( ruleCENTIMETER ) | ( ruleMILLIMETER ) | ( ruleKILOMETER ) );
    public final void rule__DistanceUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1932:1: ( ( ruleMETER ) | ( ruleCENTIMETER ) | ( ruleMILLIMETER ) | ( ruleKILOMETER ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt22=1;
                }
                break;
            case 80:
                {
                alt22=2;
                }
                break;
            case 81:
                {
                alt22=3;
                }
                break;
            case 82:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyLanguage.g:1933:2: ( ruleMETER )
                    {
                    // InternalMyLanguage.g:1933:2: ( ruleMETER )
                    // InternalMyLanguage.g:1934:3: ruleMETER
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
                    // InternalMyLanguage.g:1939:2: ( ruleCENTIMETER )
                    {
                    // InternalMyLanguage.g:1939:2: ( ruleCENTIMETER )
                    // InternalMyLanguage.g:1940:3: ruleCENTIMETER
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
                    // InternalMyLanguage.g:1945:2: ( ruleMILLIMETER )
                    {
                    // InternalMyLanguage.g:1945:2: ( ruleMILLIMETER )
                    // InternalMyLanguage.g:1946:3: ruleMILLIMETER
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
                    // InternalMyLanguage.g:1951:2: ( ruleKILOMETER )
                    {
                    // InternalMyLanguage.g:1951:2: ( ruleKILOMETER )
                    // InternalMyLanguage.g:1952:3: ruleKILOMETER
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
    // InternalMyLanguage.g:1961:1: rule__TimeUnit__Alternatives : ( ( ruleSECONDS ) | ( ruleHOUR ) | ( ruleMINUTES ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1965:1: ( ( ruleSECONDS ) | ( ruleHOUR ) | ( ruleMINUTES ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt23=1;
                }
                break;
            case 77:
                {
                alt23=2;
                }
                break;
            case 78:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyLanguage.g:1966:2: ( ruleSECONDS )
                    {
                    // InternalMyLanguage.g:1966:2: ( ruleSECONDS )
                    // InternalMyLanguage.g:1967:3: ruleSECONDS
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
                    // InternalMyLanguage.g:1972:2: ( ruleHOUR )
                    {
                    // InternalMyLanguage.g:1972:2: ( ruleHOUR )
                    // InternalMyLanguage.g:1973:3: ruleHOUR
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
                    // InternalMyLanguage.g:1978:2: ( ruleMINUTES )
                    {
                    // InternalMyLanguage.g:1978:2: ( ruleMINUTES )
                    // InternalMyLanguage.g:1979:3: ruleMINUTES
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
    // InternalMyLanguage.g:1988:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:1992:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalMyLanguage.g:1993:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalMyLanguage.g:2000:1: rule__Test__Group__0__Impl : ( 'Test:' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2004:1: ( ( 'Test:' ) )
            // InternalMyLanguage.g:2005:1: ( 'Test:' )
            {
            // InternalMyLanguage.g:2005:1: ( 'Test:' )
            // InternalMyLanguage.g:2006:2: 'Test:'
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
    // InternalMyLanguage.g:2015:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2019:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalMyLanguage.g:2020:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalMyLanguage.g:2027:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2031:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalMyLanguage.g:2032:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalMyLanguage.g:2032:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalMyLanguage.g:2033:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalMyLanguage.g:2034:2: ( rule__Test__NameAssignment_1 )
            // InternalMyLanguage.g:2034:3: rule__Test__NameAssignment_1
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
    // InternalMyLanguage.g:2042:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2046:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalMyLanguage.g:2047:2: rule__Test__Group__2__Impl rule__Test__Group__3
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
    // InternalMyLanguage.g:2054:1: rule__Test__Group__2__Impl : ( ( rule__Test__Group_2__0 )? ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2058:1: ( ( ( rule__Test__Group_2__0 )? ) )
            // InternalMyLanguage.g:2059:1: ( ( rule__Test__Group_2__0 )? )
            {
            // InternalMyLanguage.g:2059:1: ( ( rule__Test__Group_2__0 )? )
            // InternalMyLanguage.g:2060:2: ( rule__Test__Group_2__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_2()); 
            // InternalMyLanguage.g:2061:2: ( rule__Test__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyLanguage.g:2061:3: rule__Test__Group_2__0
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
    // InternalMyLanguage.g:2069:1: rule__Test__Group__3 : rule__Test__Group__3__Impl ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2073:1: ( rule__Test__Group__3__Impl )
            // InternalMyLanguage.g:2074:2: rule__Test__Group__3__Impl
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
    // InternalMyLanguage.g:2080:1: rule__Test__Group__3__Impl : ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2084:1: ( ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) ) )
            // InternalMyLanguage.g:2085:1: ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) )
            {
            // InternalMyLanguage.g:2085:1: ( ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* ) )
            // InternalMyLanguage.g:2086:2: ( ( rule__Test__StatementsAssignment_3 ) ) ( ( rule__Test__StatementsAssignment_3 )* )
            {
            // InternalMyLanguage.g:2086:2: ( ( rule__Test__StatementsAssignment_3 ) )
            // InternalMyLanguage.g:2087:3: ( rule__Test__StatementsAssignment_3 )
            {
             before(grammarAccess.getTestAccess().getStatementsAssignment_3()); 
            // InternalMyLanguage.g:2088:3: ( rule__Test__StatementsAssignment_3 )
            // InternalMyLanguage.g:2088:4: rule__Test__StatementsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Test__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getStatementsAssignment_3()); 

            }

            // InternalMyLanguage.g:2091:2: ( ( rule__Test__StatementsAssignment_3 )* )
            // InternalMyLanguage.g:2092:3: ( rule__Test__StatementsAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getStatementsAssignment_3()); 
            // InternalMyLanguage.g:2093:3: ( rule__Test__StatementsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=30 && LA25_0<=32)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyLanguage.g:2093:4: rule__Test__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Test__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMyLanguage.g:2103:1: rule__Test__Group_2__0 : rule__Test__Group_2__0__Impl rule__Test__Group_2__1 ;
    public final void rule__Test__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2107:1: ( rule__Test__Group_2__0__Impl rule__Test__Group_2__1 )
            // InternalMyLanguage.g:2108:2: rule__Test__Group_2__0__Impl rule__Test__Group_2__1
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
    // InternalMyLanguage.g:2115:1: rule__Test__Group_2__0__Impl : ( 'Description:' ) ;
    public final void rule__Test__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2119:1: ( ( 'Description:' ) )
            // InternalMyLanguage.g:2120:1: ( 'Description:' )
            {
            // InternalMyLanguage.g:2120:1: ( 'Description:' )
            // InternalMyLanguage.g:2121:2: 'Description:'
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
    // InternalMyLanguage.g:2130:1: rule__Test__Group_2__1 : rule__Test__Group_2__1__Impl ;
    public final void rule__Test__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2134:1: ( rule__Test__Group_2__1__Impl )
            // InternalMyLanguage.g:2135:2: rule__Test__Group_2__1__Impl
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
    // InternalMyLanguage.g:2141:1: rule__Test__Group_2__1__Impl : ( ( rule__Test__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Test__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2145:1: ( ( ( rule__Test__DescriptionAssignment_2_1 ) ) )
            // InternalMyLanguage.g:2146:1: ( ( rule__Test__DescriptionAssignment_2_1 ) )
            {
            // InternalMyLanguage.g:2146:1: ( ( rule__Test__DescriptionAssignment_2_1 ) )
            // InternalMyLanguage.g:2147:2: ( rule__Test__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getTestAccess().getDescriptionAssignment_2_1()); 
            // InternalMyLanguage.g:2148:2: ( rule__Test__DescriptionAssignment_2_1 )
            // InternalMyLanguage.g:2148:3: rule__Test__DescriptionAssignment_2_1
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
    // InternalMyLanguage.g:2157:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2161:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalMyLanguage.g:2162:2: rule__Given__Group__0__Impl rule__Given__Group__1
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
    // InternalMyLanguage.g:2169:1: rule__Given__Group__0__Impl : ( 'Given:' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2173:1: ( ( 'Given:' ) )
            // InternalMyLanguage.g:2174:1: ( 'Given:' )
            {
            // InternalMyLanguage.g:2174:1: ( 'Given:' )
            // InternalMyLanguage.g:2175:2: 'Given:'
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
    // InternalMyLanguage.g:2184:1: rule__Given__Group__1 : rule__Given__Group__1__Impl ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2188:1: ( rule__Given__Group__1__Impl )
            // InternalMyLanguage.g:2189:2: rule__Given__Group__1__Impl
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
    // InternalMyLanguage.g:2195:1: rule__Given__Group__1__Impl : ( ( rule__Given__BodyAssignment_1 ) ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2199:1: ( ( ( rule__Given__BodyAssignment_1 ) ) )
            // InternalMyLanguage.g:2200:1: ( ( rule__Given__BodyAssignment_1 ) )
            {
            // InternalMyLanguage.g:2200:1: ( ( rule__Given__BodyAssignment_1 ) )
            // InternalMyLanguage.g:2201:2: ( rule__Given__BodyAssignment_1 )
            {
             before(grammarAccess.getGivenAccess().getBodyAssignment_1()); 
            // InternalMyLanguage.g:2202:2: ( rule__Given__BodyAssignment_1 )
            // InternalMyLanguage.g:2202:3: rule__Given__BodyAssignment_1
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
    // InternalMyLanguage.g:2211:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2215:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalMyLanguage.g:2216:2: rule__Then__Group__0__Impl rule__Then__Group__1
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
    // InternalMyLanguage.g:2223:1: rule__Then__Group__0__Impl : ( 'Then:' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2227:1: ( ( 'Then:' ) )
            // InternalMyLanguage.g:2228:1: ( 'Then:' )
            {
            // InternalMyLanguage.g:2228:1: ( 'Then:' )
            // InternalMyLanguage.g:2229:2: 'Then:'
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
    // InternalMyLanguage.g:2238:1: rule__Then__Group__1 : rule__Then__Group__1__Impl ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2242:1: ( rule__Then__Group__1__Impl )
            // InternalMyLanguage.g:2243:2: rule__Then__Group__1__Impl
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
    // InternalMyLanguage.g:2249:1: rule__Then__Group__1__Impl : ( ( rule__Then__BodyAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2253:1: ( ( ( rule__Then__BodyAssignment_1 ) ) )
            // InternalMyLanguage.g:2254:1: ( ( rule__Then__BodyAssignment_1 ) )
            {
            // InternalMyLanguage.g:2254:1: ( ( rule__Then__BodyAssignment_1 ) )
            // InternalMyLanguage.g:2255:2: ( rule__Then__BodyAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getBodyAssignment_1()); 
            // InternalMyLanguage.g:2256:2: ( rule__Then__BodyAssignment_1 )
            // InternalMyLanguage.g:2256:3: rule__Then__BodyAssignment_1
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
    // InternalMyLanguage.g:2265:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2269:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalMyLanguage.g:2270:2: rule__When__Group__0__Impl rule__When__Group__1
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
    // InternalMyLanguage.g:2277:1: rule__When__Group__0__Impl : ( 'When:' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2281:1: ( ( 'When:' ) )
            // InternalMyLanguage.g:2282:1: ( 'When:' )
            {
            // InternalMyLanguage.g:2282:1: ( 'When:' )
            // InternalMyLanguage.g:2283:2: 'When:'
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
    // InternalMyLanguage.g:2292:1: rule__When__Group__1 : rule__When__Group__1__Impl ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2296:1: ( rule__When__Group__1__Impl )
            // InternalMyLanguage.g:2297:2: rule__When__Group__1__Impl
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
    // InternalMyLanguage.g:2303:1: rule__When__Group__1__Impl : ( ( rule__When__BodyAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2307:1: ( ( ( rule__When__BodyAssignment_1 ) ) )
            // InternalMyLanguage.g:2308:1: ( ( rule__When__BodyAssignment_1 ) )
            {
            // InternalMyLanguage.g:2308:1: ( ( rule__When__BodyAssignment_1 ) )
            // InternalMyLanguage.g:2309:2: ( rule__When__BodyAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getBodyAssignment_1()); 
            // InternalMyLanguage.g:2310:2: ( rule__When__BodyAssignment_1 )
            // InternalMyLanguage.g:2310:3: rule__When__BodyAssignment_1
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


    // $ANTLR start "rule__NotificationSent__Group__0"
    // InternalMyLanguage.g:2319:1: rule__NotificationSent__Group__0 : rule__NotificationSent__Group__0__Impl rule__NotificationSent__Group__1 ;
    public final void rule__NotificationSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2323:1: ( rule__NotificationSent__Group__0__Impl rule__NotificationSent__Group__1 )
            // InternalMyLanguage.g:2324:2: rule__NotificationSent__Group__0__Impl rule__NotificationSent__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyLanguage.g:2331:1: rule__NotificationSent__Group__0__Impl : ( ( rule__NotificationSent__NotAssignment_0 ) ) ;
    public final void rule__NotificationSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2335:1: ( ( ( rule__NotificationSent__NotAssignment_0 ) ) )
            // InternalMyLanguage.g:2336:1: ( ( rule__NotificationSent__NotAssignment_0 ) )
            {
            // InternalMyLanguage.g:2336:1: ( ( rule__NotificationSent__NotAssignment_0 ) )
            // InternalMyLanguage.g:2337:2: ( rule__NotificationSent__NotAssignment_0 )
            {
             before(grammarAccess.getNotificationSentAccess().getNotAssignment_0()); 
            // InternalMyLanguage.g:2338:2: ( rule__NotificationSent__NotAssignment_0 )
            // InternalMyLanguage.g:2338:3: rule__NotificationSent__NotAssignment_0
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
    // InternalMyLanguage.g:2346:1: rule__NotificationSent__Group__1 : rule__NotificationSent__Group__1__Impl rule__NotificationSent__Group__2 ;
    public final void rule__NotificationSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2350:1: ( rule__NotificationSent__Group__1__Impl rule__NotificationSent__Group__2 )
            // InternalMyLanguage.g:2351:2: rule__NotificationSent__Group__1__Impl rule__NotificationSent__Group__2
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
    // InternalMyLanguage.g:2358:1: rule__NotificationSent__Group__1__Impl : ( 'status' ) ;
    public final void rule__NotificationSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2362:1: ( ( 'status' ) )
            // InternalMyLanguage.g:2363:1: ( 'status' )
            {
            // InternalMyLanguage.g:2363:1: ( 'status' )
            // InternalMyLanguage.g:2364:2: 'status'
            {
             before(grammarAccess.getNotificationSentAccess().getStatusKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyLanguage.g:2373:1: rule__NotificationSent__Group__2 : rule__NotificationSent__Group__2__Impl rule__NotificationSent__Group__3 ;
    public final void rule__NotificationSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2377:1: ( rule__NotificationSent__Group__2__Impl rule__NotificationSent__Group__3 )
            // InternalMyLanguage.g:2378:2: rule__NotificationSent__Group__2__Impl rule__NotificationSent__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyLanguage.g:2385:1: rule__NotificationSent__Group__2__Impl : ( 'is' ) ;
    public final void rule__NotificationSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2389:1: ( ( 'is' ) )
            // InternalMyLanguage.g:2390:1: ( 'is' )
            {
            // InternalMyLanguage.g:2390:1: ( 'is' )
            // InternalMyLanguage.g:2391:2: 'is'
            {
             before(grammarAccess.getNotificationSentAccess().getIsKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:2400:1: rule__NotificationSent__Group__3 : rule__NotificationSent__Group__3__Impl ;
    public final void rule__NotificationSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2404:1: ( rule__NotificationSent__Group__3__Impl )
            // InternalMyLanguage.g:2405:2: rule__NotificationSent__Group__3__Impl
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
    // InternalMyLanguage.g:2411:1: rule__NotificationSent__Group__3__Impl : ( 'sent' ) ;
    public final void rule__NotificationSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2415:1: ( ( 'sent' ) )
            // InternalMyLanguage.g:2416:1: ( 'sent' )
            {
            // InternalMyLanguage.g:2416:1: ( 'sent' )
            // InternalMyLanguage.g:2417:2: 'sent'
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
    // InternalMyLanguage.g:2427:1: rule__TimeSent__Group__0 : rule__TimeSent__Group__0__Impl rule__TimeSent__Group__1 ;
    public final void rule__TimeSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2431:1: ( rule__TimeSent__Group__0__Impl rule__TimeSent__Group__1 )
            // InternalMyLanguage.g:2432:2: rule__TimeSent__Group__0__Impl rule__TimeSent__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyLanguage.g:2439:1: rule__TimeSent__Group__0__Impl : ( 'Time' ) ;
    public final void rule__TimeSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2443:1: ( ( 'Time' ) )
            // InternalMyLanguage.g:2444:1: ( 'Time' )
            {
            // InternalMyLanguage.g:2444:1: ( 'Time' )
            // InternalMyLanguage.g:2445:2: 'Time'
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
    // InternalMyLanguage.g:2454:1: rule__TimeSent__Group__1 : rule__TimeSent__Group__1__Impl ;
    public final void rule__TimeSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2458:1: ( rule__TimeSent__Group__1__Impl )
            // InternalMyLanguage.g:2459:2: rule__TimeSent__Group__1__Impl
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
    // InternalMyLanguage.g:2465:1: rule__TimeSent__Group__1__Impl : ( ruleTimeInterval ) ;
    public final void rule__TimeSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2469:1: ( ( ruleTimeInterval ) )
            // InternalMyLanguage.g:2470:1: ( ruleTimeInterval )
            {
            // InternalMyLanguage.g:2470:1: ( ruleTimeInterval )
            // InternalMyLanguage.g:2471:2: ruleTimeInterval
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
    // InternalMyLanguage.g:2481:1: rule__TimeInterval__Group__0 : rule__TimeInterval__Group__0__Impl rule__TimeInterval__Group__1 ;
    public final void rule__TimeInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2485:1: ( rule__TimeInterval__Group__0__Impl rule__TimeInterval__Group__1 )
            // InternalMyLanguage.g:2486:2: rule__TimeInterval__Group__0__Impl rule__TimeInterval__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyLanguage.g:2493:1: rule__TimeInterval__Group__0__Impl : ( 'interval' ) ;
    public final void rule__TimeInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2497:1: ( ( 'interval' ) )
            // InternalMyLanguage.g:2498:1: ( 'interval' )
            {
            // InternalMyLanguage.g:2498:1: ( 'interval' )
            // InternalMyLanguage.g:2499:2: 'interval'
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
    // InternalMyLanguage.g:2508:1: rule__TimeInterval__Group__1 : rule__TimeInterval__Group__1__Impl rule__TimeInterval__Group__2 ;
    public final void rule__TimeInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2512:1: ( rule__TimeInterval__Group__1__Impl rule__TimeInterval__Group__2 )
            // InternalMyLanguage.g:2513:2: rule__TimeInterval__Group__1__Impl rule__TimeInterval__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyLanguage.g:2520:1: rule__TimeInterval__Group__1__Impl : ( 'in' ) ;
    public final void rule__TimeInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2524:1: ( ( 'in' ) )
            // InternalMyLanguage.g:2525:1: ( 'in' )
            {
            // InternalMyLanguage.g:2525:1: ( 'in' )
            // InternalMyLanguage.g:2526:2: 'in'
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
    // InternalMyLanguage.g:2535:1: rule__TimeInterval__Group__2 : rule__TimeInterval__Group__2__Impl rule__TimeInterval__Group__3 ;
    public final void rule__TimeInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2539:1: ( rule__TimeInterval__Group__2__Impl rule__TimeInterval__Group__3 )
            // InternalMyLanguage.g:2540:2: rule__TimeInterval__Group__2__Impl rule__TimeInterval__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyLanguage.g:2547:1: rule__TimeInterval__Group__2__Impl : ( '[' ) ;
    public final void rule__TimeInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2551:1: ( ( '[' ) )
            // InternalMyLanguage.g:2552:1: ( '[' )
            {
            // InternalMyLanguage.g:2552:1: ( '[' )
            // InternalMyLanguage.g:2553:2: '['
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
    // InternalMyLanguage.g:2562:1: rule__TimeInterval__Group__3 : rule__TimeInterval__Group__3__Impl rule__TimeInterval__Group__4 ;
    public final void rule__TimeInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2566:1: ( rule__TimeInterval__Group__3__Impl rule__TimeInterval__Group__4 )
            // InternalMyLanguage.g:2567:2: rule__TimeInterval__Group__3__Impl rule__TimeInterval__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyLanguage.g:2574:1: rule__TimeInterval__Group__3__Impl : ( ( rule__TimeInterval__FirstAssignment_3 ) ) ;
    public final void rule__TimeInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2578:1: ( ( ( rule__TimeInterval__FirstAssignment_3 ) ) )
            // InternalMyLanguage.g:2579:1: ( ( rule__TimeInterval__FirstAssignment_3 ) )
            {
            // InternalMyLanguage.g:2579:1: ( ( rule__TimeInterval__FirstAssignment_3 ) )
            // InternalMyLanguage.g:2580:2: ( rule__TimeInterval__FirstAssignment_3 )
            {
             before(grammarAccess.getTimeIntervalAccess().getFirstAssignment_3()); 
            // InternalMyLanguage.g:2581:2: ( rule__TimeInterval__FirstAssignment_3 )
            // InternalMyLanguage.g:2581:3: rule__TimeInterval__FirstAssignment_3
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
    // InternalMyLanguage.g:2589:1: rule__TimeInterval__Group__4 : rule__TimeInterval__Group__4__Impl rule__TimeInterval__Group__5 ;
    public final void rule__TimeInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2593:1: ( rule__TimeInterval__Group__4__Impl rule__TimeInterval__Group__5 )
            // InternalMyLanguage.g:2594:2: rule__TimeInterval__Group__4__Impl rule__TimeInterval__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyLanguage.g:2601:1: rule__TimeInterval__Group__4__Impl : ( ',' ) ;
    public final void rule__TimeInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2605:1: ( ( ',' ) )
            // InternalMyLanguage.g:2606:1: ( ',' )
            {
            // InternalMyLanguage.g:2606:1: ( ',' )
            // InternalMyLanguage.g:2607:2: ','
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
    // InternalMyLanguage.g:2616:1: rule__TimeInterval__Group__5 : rule__TimeInterval__Group__5__Impl rule__TimeInterval__Group__6 ;
    public final void rule__TimeInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2620:1: ( rule__TimeInterval__Group__5__Impl rule__TimeInterval__Group__6 )
            // InternalMyLanguage.g:2621:2: rule__TimeInterval__Group__5__Impl rule__TimeInterval__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyLanguage.g:2628:1: rule__TimeInterval__Group__5__Impl : ( ( rule__TimeInterval__SecondAssignment_5 ) ) ;
    public final void rule__TimeInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2632:1: ( ( ( rule__TimeInterval__SecondAssignment_5 ) ) )
            // InternalMyLanguage.g:2633:1: ( ( rule__TimeInterval__SecondAssignment_5 ) )
            {
            // InternalMyLanguage.g:2633:1: ( ( rule__TimeInterval__SecondAssignment_5 ) )
            // InternalMyLanguage.g:2634:2: ( rule__TimeInterval__SecondAssignment_5 )
            {
             before(grammarAccess.getTimeIntervalAccess().getSecondAssignment_5()); 
            // InternalMyLanguage.g:2635:2: ( rule__TimeInterval__SecondAssignment_5 )
            // InternalMyLanguage.g:2635:3: rule__TimeInterval__SecondAssignment_5
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
    // InternalMyLanguage.g:2643:1: rule__TimeInterval__Group__6 : rule__TimeInterval__Group__6__Impl ;
    public final void rule__TimeInterval__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2647:1: ( rule__TimeInterval__Group__6__Impl )
            // InternalMyLanguage.g:2648:2: rule__TimeInterval__Group__6__Impl
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
    // InternalMyLanguage.g:2654:1: rule__TimeInterval__Group__6__Impl : ( ']' ) ;
    public final void rule__TimeInterval__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2658:1: ( ( ']' ) )
            // InternalMyLanguage.g:2659:1: ( ']' )
            {
            // InternalMyLanguage.g:2659:1: ( ']' )
            // InternalMyLanguage.g:2660:2: ']'
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
    // InternalMyLanguage.g:2670:1: rule__BatterySent__Group__0 : rule__BatterySent__Group__0__Impl rule__BatterySent__Group__1 ;
    public final void rule__BatterySent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2674:1: ( rule__BatterySent__Group__0__Impl rule__BatterySent__Group__1 )
            // InternalMyLanguage.g:2675:2: rule__BatterySent__Group__0__Impl rule__BatterySent__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyLanguage.g:2682:1: rule__BatterySent__Group__0__Impl : ( 'Battery' ) ;
    public final void rule__BatterySent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2686:1: ( ( 'Battery' ) )
            // InternalMyLanguage.g:2687:1: ( 'Battery' )
            {
            // InternalMyLanguage.g:2687:1: ( 'Battery' )
            // InternalMyLanguage.g:2688:2: 'Battery'
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
    // InternalMyLanguage.g:2697:1: rule__BatterySent__Group__1 : rule__BatterySent__Group__1__Impl rule__BatterySent__Group__2 ;
    public final void rule__BatterySent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2701:1: ( rule__BatterySent__Group__1__Impl rule__BatterySent__Group__2 )
            // InternalMyLanguage.g:2702:2: rule__BatterySent__Group__1__Impl rule__BatterySent__Group__2
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
    // InternalMyLanguage.g:2709:1: rule__BatterySent__Group__1__Impl : ( 'level' ) ;
    public final void rule__BatterySent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2713:1: ( ( 'level' ) )
            // InternalMyLanguage.g:2714:1: ( 'level' )
            {
            // InternalMyLanguage.g:2714:1: ( 'level' )
            // InternalMyLanguage.g:2715:2: 'level'
            {
             before(grammarAccess.getBatterySentAccess().getLevelKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyLanguage.g:2724:1: rule__BatterySent__Group__2 : rule__BatterySent__Group__2__Impl rule__BatterySent__Group__3 ;
    public final void rule__BatterySent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2728:1: ( rule__BatterySent__Group__2__Impl rule__BatterySent__Group__3 )
            // InternalMyLanguage.g:2729:2: rule__BatterySent__Group__2__Impl rule__BatterySent__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyLanguage.g:2736:1: rule__BatterySent__Group__2__Impl : ( 'is' ) ;
    public final void rule__BatterySent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2740:1: ( ( 'is' ) )
            // InternalMyLanguage.g:2741:1: ( 'is' )
            {
            // InternalMyLanguage.g:2741:1: ( 'is' )
            // InternalMyLanguage.g:2742:2: 'is'
            {
             before(grammarAccess.getBatterySentAccess().getIsKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:2751:1: rule__BatterySent__Group__3 : rule__BatterySent__Group__3__Impl ;
    public final void rule__BatterySent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2755:1: ( rule__BatterySent__Group__3__Impl )
            // InternalMyLanguage.g:2756:2: rule__BatterySent__Group__3__Impl
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
    // InternalMyLanguage.g:2762:1: rule__BatterySent__Group__3__Impl : ( ( rule__BatterySent__SentAssignment_3 ) ) ;
    public final void rule__BatterySent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2766:1: ( ( ( rule__BatterySent__SentAssignment_3 ) ) )
            // InternalMyLanguage.g:2767:1: ( ( rule__BatterySent__SentAssignment_3 ) )
            {
            // InternalMyLanguage.g:2767:1: ( ( rule__BatterySent__SentAssignment_3 ) )
            // InternalMyLanguage.g:2768:2: ( rule__BatterySent__SentAssignment_3 )
            {
             before(grammarAccess.getBatterySentAccess().getSentAssignment_3()); 
            // InternalMyLanguage.g:2769:2: ( rule__BatterySent__SentAssignment_3 )
            // InternalMyLanguage.g:2769:3: rule__BatterySent__SentAssignment_3
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
    // InternalMyLanguage.g:2778:1: rule__PeopleSent__Group__0 : rule__PeopleSent__Group__0__Impl rule__PeopleSent__Group__1 ;
    public final void rule__PeopleSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2782:1: ( rule__PeopleSent__Group__0__Impl rule__PeopleSent__Group__1 )
            // InternalMyLanguage.g:2783:2: rule__PeopleSent__Group__0__Impl rule__PeopleSent__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyLanguage.g:2790:1: rule__PeopleSent__Group__0__Impl : ( 'Person' ) ;
    public final void rule__PeopleSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2794:1: ( ( 'Person' ) )
            // InternalMyLanguage.g:2795:1: ( 'Person' )
            {
            // InternalMyLanguage.g:2795:1: ( 'Person' )
            // InternalMyLanguage.g:2796:2: 'Person'
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
    // InternalMyLanguage.g:2805:1: rule__PeopleSent__Group__1 : rule__PeopleSent__Group__1__Impl ;
    public final void rule__PeopleSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2809:1: ( rule__PeopleSent__Group__1__Impl )
            // InternalMyLanguage.g:2810:2: rule__PeopleSent__Group__1__Impl
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
    // InternalMyLanguage.g:2816:1: rule__PeopleSent__Group__1__Impl : ( ( rule__PeopleSent__Alternatives_1 ) ) ;
    public final void rule__PeopleSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2820:1: ( ( ( rule__PeopleSent__Alternatives_1 ) ) )
            // InternalMyLanguage.g:2821:1: ( ( rule__PeopleSent__Alternatives_1 ) )
            {
            // InternalMyLanguage.g:2821:1: ( ( rule__PeopleSent__Alternatives_1 ) )
            // InternalMyLanguage.g:2822:2: ( rule__PeopleSent__Alternatives_1 )
            {
             before(grammarAccess.getPeopleSentAccess().getAlternatives_1()); 
            // InternalMyLanguage.g:2823:2: ( rule__PeopleSent__Alternatives_1 )
            // InternalMyLanguage.g:2823:3: rule__PeopleSent__Alternatives_1
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
    // InternalMyLanguage.g:2832:1: rule__PeoplePosSent__Group__0 : rule__PeoplePosSent__Group__0__Impl rule__PeoplePosSent__Group__1 ;
    public final void rule__PeoplePosSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2836:1: ( rule__PeoplePosSent__Group__0__Impl rule__PeoplePosSent__Group__1 )
            // InternalMyLanguage.g:2837:2: rule__PeoplePosSent__Group__0__Impl rule__PeoplePosSent__Group__1
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
    // InternalMyLanguage.g:2844:1: rule__PeoplePosSent__Group__0__Impl : ( 'position' ) ;
    public final void rule__PeoplePosSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2848:1: ( ( 'position' ) )
            // InternalMyLanguage.g:2849:1: ( 'position' )
            {
            // InternalMyLanguage.g:2849:1: ( 'position' )
            // InternalMyLanguage.g:2850:2: 'position'
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
    // InternalMyLanguage.g:2859:1: rule__PeoplePosSent__Group__1 : rule__PeoplePosSent__Group__1__Impl rule__PeoplePosSent__Group__2 ;
    public final void rule__PeoplePosSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2863:1: ( rule__PeoplePosSent__Group__1__Impl rule__PeoplePosSent__Group__2 )
            // InternalMyLanguage.g:2864:2: rule__PeoplePosSent__Group__1__Impl rule__PeoplePosSent__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:2871:1: rule__PeoplePosSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__PeoplePosSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2875:1: ( ( 'is' ) )
            // InternalMyLanguage.g:2876:1: ( 'is' )
            {
            // InternalMyLanguage.g:2876:1: ( 'is' )
            // InternalMyLanguage.g:2877:2: 'is'
            {
             before(grammarAccess.getPeoplePosSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:2886:1: rule__PeoplePosSent__Group__2 : rule__PeoplePosSent__Group__2__Impl rule__PeoplePosSent__Group__3 ;
    public final void rule__PeoplePosSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2890:1: ( rule__PeoplePosSent__Group__2__Impl rule__PeoplePosSent__Group__3 )
            // InternalMyLanguage.g:2891:2: rule__PeoplePosSent__Group__2__Impl rule__PeoplePosSent__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:2898:1: rule__PeoplePosSent__Group__2__Impl : ( ( rule__PeoplePosSent__PosXAssignment_2 ) ) ;
    public final void rule__PeoplePosSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2902:1: ( ( ( rule__PeoplePosSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:2903:1: ( ( rule__PeoplePosSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:2903:1: ( ( rule__PeoplePosSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:2904:2: ( rule__PeoplePosSent__PosXAssignment_2 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:2905:2: ( rule__PeoplePosSent__PosXAssignment_2 )
            // InternalMyLanguage.g:2905:3: rule__PeoplePosSent__PosXAssignment_2
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
    // InternalMyLanguage.g:2913:1: rule__PeoplePosSent__Group__3 : rule__PeoplePosSent__Group__3__Impl rule__PeoplePosSent__Group__4 ;
    public final void rule__PeoplePosSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2917:1: ( rule__PeoplePosSent__Group__3__Impl rule__PeoplePosSent__Group__4 )
            // InternalMyLanguage.g:2918:2: rule__PeoplePosSent__Group__3__Impl rule__PeoplePosSent__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:2925:1: rule__PeoplePosSent__Group__3__Impl : ( ( rule__PeoplePosSent__PosYAssignment_3 ) ) ;
    public final void rule__PeoplePosSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2929:1: ( ( ( rule__PeoplePosSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:2930:1: ( ( rule__PeoplePosSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:2930:1: ( ( rule__PeoplePosSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:2931:2: ( rule__PeoplePosSent__PosYAssignment_3 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:2932:2: ( rule__PeoplePosSent__PosYAssignment_3 )
            // InternalMyLanguage.g:2932:3: rule__PeoplePosSent__PosYAssignment_3
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
    // InternalMyLanguage.g:2940:1: rule__PeoplePosSent__Group__4 : rule__PeoplePosSent__Group__4__Impl rule__PeoplePosSent__Group__5 ;
    public final void rule__PeoplePosSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2944:1: ( rule__PeoplePosSent__Group__4__Impl rule__PeoplePosSent__Group__5 )
            // InternalMyLanguage.g:2945:2: rule__PeoplePosSent__Group__4__Impl rule__PeoplePosSent__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:2952:1: rule__PeoplePosSent__Group__4__Impl : ( ( rule__PeoplePosSent__PosZAssignment_4 ) ) ;
    public final void rule__PeoplePosSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2956:1: ( ( ( rule__PeoplePosSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:2957:1: ( ( rule__PeoplePosSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:2957:1: ( ( rule__PeoplePosSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:2958:2: ( rule__PeoplePosSent__PosZAssignment_4 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:2959:2: ( rule__PeoplePosSent__PosZAssignment_4 )
            // InternalMyLanguage.g:2959:3: rule__PeoplePosSent__PosZAssignment_4
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
    // InternalMyLanguage.g:2967:1: rule__PeoplePosSent__Group__5 : rule__PeoplePosSent__Group__5__Impl ;
    public final void rule__PeoplePosSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2971:1: ( rule__PeoplePosSent__Group__5__Impl )
            // InternalMyLanguage.g:2972:2: rule__PeoplePosSent__Group__5__Impl
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
    // InternalMyLanguage.g:2978:1: rule__PeoplePosSent__Group__5__Impl : ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? ) ;
    public final void rule__PeoplePosSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2982:1: ( ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:2983:1: ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:2983:1: ( ( rule__PeoplePosSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:2984:2: ( rule__PeoplePosSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getPeoplePosSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:2985:2: ( rule__PeoplePosSent__ToleranceAssignment_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyLanguage.g:2985:3: rule__PeoplePosSent__ToleranceAssignment_5
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
    // InternalMyLanguage.g:2994:1: rule__PeopleNumbSent__Group__0 : rule__PeopleNumbSent__Group__0__Impl rule__PeopleNumbSent__Group__1 ;
    public final void rule__PeopleNumbSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:2998:1: ( rule__PeopleNumbSent__Group__0__Impl rule__PeopleNumbSent__Group__1 )
            // InternalMyLanguage.g:2999:2: rule__PeopleNumbSent__Group__0__Impl rule__PeopleNumbSent__Group__1
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
    // InternalMyLanguage.g:3006:1: rule__PeopleNumbSent__Group__0__Impl : ( 'number' ) ;
    public final void rule__PeopleNumbSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3010:1: ( ( 'number' ) )
            // InternalMyLanguage.g:3011:1: ( 'number' )
            {
            // InternalMyLanguage.g:3011:1: ( 'number' )
            // InternalMyLanguage.g:3012:2: 'number'
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
    // InternalMyLanguage.g:3021:1: rule__PeopleNumbSent__Group__1 : rule__PeopleNumbSent__Group__1__Impl rule__PeopleNumbSent__Group__2 ;
    public final void rule__PeopleNumbSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3025:1: ( rule__PeopleNumbSent__Group__1__Impl rule__PeopleNumbSent__Group__2 )
            // InternalMyLanguage.g:3026:2: rule__PeopleNumbSent__Group__1__Impl rule__PeopleNumbSent__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyLanguage.g:3033:1: rule__PeopleNumbSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__PeopleNumbSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3037:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3038:1: ( 'is' )
            {
            // InternalMyLanguage.g:3038:1: ( 'is' )
            // InternalMyLanguage.g:3039:2: 'is'
            {
             before(grammarAccess.getPeopleNumbSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:3048:1: rule__PeopleNumbSent__Group__2 : rule__PeopleNumbSent__Group__2__Impl ;
    public final void rule__PeopleNumbSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3052:1: ( rule__PeopleNumbSent__Group__2__Impl )
            // InternalMyLanguage.g:3053:2: rule__PeopleNumbSent__Group__2__Impl
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
    // InternalMyLanguage.g:3059:1: rule__PeopleNumbSent__Group__2__Impl : ( ( rule__PeopleNumbSent__AmountAssignment_2 ) ) ;
    public final void rule__PeopleNumbSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3063:1: ( ( ( rule__PeopleNumbSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:3064:1: ( ( rule__PeopleNumbSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:3064:1: ( ( rule__PeopleNumbSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:3065:2: ( rule__PeopleNumbSent__AmountAssignment_2 )
            {
             before(grammarAccess.getPeopleNumbSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:3066:2: ( rule__PeopleNumbSent__AmountAssignment_2 )
            // InternalMyLanguage.g:3066:3: rule__PeopleNumbSent__AmountAssignment_2
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
    // InternalMyLanguage.g:3075:1: rule__MissionSent__Group__0 : rule__MissionSent__Group__0__Impl rule__MissionSent__Group__1 ;
    public final void rule__MissionSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3079:1: ( rule__MissionSent__Group__0__Impl rule__MissionSent__Group__1 )
            // InternalMyLanguage.g:3080:2: rule__MissionSent__Group__0__Impl rule__MissionSent__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyLanguage.g:3087:1: rule__MissionSent__Group__0__Impl : ( 'Mission' ) ;
    public final void rule__MissionSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3091:1: ( ( 'Mission' ) )
            // InternalMyLanguage.g:3092:1: ( 'Mission' )
            {
            // InternalMyLanguage.g:3092:1: ( 'Mission' )
            // InternalMyLanguage.g:3093:2: 'Mission'
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
    // InternalMyLanguage.g:3102:1: rule__MissionSent__Group__1 : rule__MissionSent__Group__1__Impl ;
    public final void rule__MissionSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3106:1: ( rule__MissionSent__Group__1__Impl )
            // InternalMyLanguage.g:3107:2: rule__MissionSent__Group__1__Impl
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
    // InternalMyLanguage.g:3113:1: rule__MissionSent__Group__1__Impl : ( ( rule__MissionSent__Alternatives_1 ) ) ;
    public final void rule__MissionSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3117:1: ( ( ( rule__MissionSent__Alternatives_1 ) ) )
            // InternalMyLanguage.g:3118:1: ( ( rule__MissionSent__Alternatives_1 ) )
            {
            // InternalMyLanguage.g:3118:1: ( ( rule__MissionSent__Alternatives_1 ) )
            // InternalMyLanguage.g:3119:2: ( rule__MissionSent__Alternatives_1 )
            {
             before(grammarAccess.getMissionSentAccess().getAlternatives_1()); 
            // InternalMyLanguage.g:3120:2: ( rule__MissionSent__Alternatives_1 )
            // InternalMyLanguage.g:3120:3: rule__MissionSent__Alternatives_1
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
    // InternalMyLanguage.g:3129:1: rule__MissionGoalSent__Group__0 : rule__MissionGoalSent__Group__0__Impl rule__MissionGoalSent__Group__1 ;
    public final void rule__MissionGoalSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3133:1: ( rule__MissionGoalSent__Group__0__Impl rule__MissionGoalSent__Group__1 )
            // InternalMyLanguage.g:3134:2: rule__MissionGoalSent__Group__0__Impl rule__MissionGoalSent__Group__1
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
    // InternalMyLanguage.g:3141:1: rule__MissionGoalSent__Group__0__Impl : ( 'goal' ) ;
    public final void rule__MissionGoalSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3145:1: ( ( 'goal' ) )
            // InternalMyLanguage.g:3146:1: ( 'goal' )
            {
            // InternalMyLanguage.g:3146:1: ( 'goal' )
            // InternalMyLanguage.g:3147:2: 'goal'
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
    // InternalMyLanguage.g:3156:1: rule__MissionGoalSent__Group__1 : rule__MissionGoalSent__Group__1__Impl rule__MissionGoalSent__Group__2 ;
    public final void rule__MissionGoalSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3160:1: ( rule__MissionGoalSent__Group__1__Impl rule__MissionGoalSent__Group__2 )
            // InternalMyLanguage.g:3161:2: rule__MissionGoalSent__Group__1__Impl rule__MissionGoalSent__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:3168:1: rule__MissionGoalSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__MissionGoalSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3172:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3173:1: ( 'is' )
            {
            // InternalMyLanguage.g:3173:1: ( 'is' )
            // InternalMyLanguage.g:3174:2: 'is'
            {
             before(grammarAccess.getMissionGoalSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:3183:1: rule__MissionGoalSent__Group__2 : rule__MissionGoalSent__Group__2__Impl rule__MissionGoalSent__Group__3 ;
    public final void rule__MissionGoalSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3187:1: ( rule__MissionGoalSent__Group__2__Impl rule__MissionGoalSent__Group__3 )
            // InternalMyLanguage.g:3188:2: rule__MissionGoalSent__Group__2__Impl rule__MissionGoalSent__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:3195:1: rule__MissionGoalSent__Group__2__Impl : ( ( rule__MissionGoalSent__PosXAssignment_2 ) ) ;
    public final void rule__MissionGoalSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3199:1: ( ( ( rule__MissionGoalSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:3200:1: ( ( rule__MissionGoalSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:3200:1: ( ( rule__MissionGoalSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:3201:2: ( rule__MissionGoalSent__PosXAssignment_2 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:3202:2: ( rule__MissionGoalSent__PosXAssignment_2 )
            // InternalMyLanguage.g:3202:3: rule__MissionGoalSent__PosXAssignment_2
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
    // InternalMyLanguage.g:3210:1: rule__MissionGoalSent__Group__3 : rule__MissionGoalSent__Group__3__Impl rule__MissionGoalSent__Group__4 ;
    public final void rule__MissionGoalSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3214:1: ( rule__MissionGoalSent__Group__3__Impl rule__MissionGoalSent__Group__4 )
            // InternalMyLanguage.g:3215:2: rule__MissionGoalSent__Group__3__Impl rule__MissionGoalSent__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:3222:1: rule__MissionGoalSent__Group__3__Impl : ( ( rule__MissionGoalSent__PosYAssignment_3 ) ) ;
    public final void rule__MissionGoalSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3226:1: ( ( ( rule__MissionGoalSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:3227:1: ( ( rule__MissionGoalSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:3227:1: ( ( rule__MissionGoalSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:3228:2: ( rule__MissionGoalSent__PosYAssignment_3 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:3229:2: ( rule__MissionGoalSent__PosYAssignment_3 )
            // InternalMyLanguage.g:3229:3: rule__MissionGoalSent__PosYAssignment_3
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
    // InternalMyLanguage.g:3237:1: rule__MissionGoalSent__Group__4 : rule__MissionGoalSent__Group__4__Impl ;
    public final void rule__MissionGoalSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3241:1: ( rule__MissionGoalSent__Group__4__Impl )
            // InternalMyLanguage.g:3242:2: rule__MissionGoalSent__Group__4__Impl
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
    // InternalMyLanguage.g:3248:1: rule__MissionGoalSent__Group__4__Impl : ( ( rule__MissionGoalSent__PosZAssignment_4 ) ) ;
    public final void rule__MissionGoalSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3252:1: ( ( ( rule__MissionGoalSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:3253:1: ( ( rule__MissionGoalSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:3253:1: ( ( rule__MissionGoalSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:3254:2: ( rule__MissionGoalSent__PosZAssignment_4 )
            {
             before(grammarAccess.getMissionGoalSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:3255:2: ( rule__MissionGoalSent__PosZAssignment_4 )
            // InternalMyLanguage.g:3255:3: rule__MissionGoalSent__PosZAssignment_4
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
    // InternalMyLanguage.g:3264:1: rule__MissionRiskLevelSent__Group__0 : rule__MissionRiskLevelSent__Group__0__Impl rule__MissionRiskLevelSent__Group__1 ;
    public final void rule__MissionRiskLevelSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3268:1: ( rule__MissionRiskLevelSent__Group__0__Impl rule__MissionRiskLevelSent__Group__1 )
            // InternalMyLanguage.g:3269:2: rule__MissionRiskLevelSent__Group__0__Impl rule__MissionRiskLevelSent__Group__1
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
    // InternalMyLanguage.g:3276:1: rule__MissionRiskLevelSent__Group__0__Impl : ( 'missionsafety' ) ;
    public final void rule__MissionRiskLevelSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3280:1: ( ( 'missionsafety' ) )
            // InternalMyLanguage.g:3281:1: ( 'missionsafety' )
            {
            // InternalMyLanguage.g:3281:1: ( 'missionsafety' )
            // InternalMyLanguage.g:3282:2: 'missionsafety'
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
    // InternalMyLanguage.g:3291:1: rule__MissionRiskLevelSent__Group__1 : rule__MissionRiskLevelSent__Group__1__Impl rule__MissionRiskLevelSent__Group__2 ;
    public final void rule__MissionRiskLevelSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3295:1: ( rule__MissionRiskLevelSent__Group__1__Impl rule__MissionRiskLevelSent__Group__2 )
            // InternalMyLanguage.g:3296:2: rule__MissionRiskLevelSent__Group__1__Impl rule__MissionRiskLevelSent__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyLanguage.g:3303:1: rule__MissionRiskLevelSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__MissionRiskLevelSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3307:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3308:1: ( 'is' )
            {
            // InternalMyLanguage.g:3308:1: ( 'is' )
            // InternalMyLanguage.g:3309:2: 'is'
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:3318:1: rule__MissionRiskLevelSent__Group__2 : rule__MissionRiskLevelSent__Group__2__Impl ;
    public final void rule__MissionRiskLevelSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3322:1: ( rule__MissionRiskLevelSent__Group__2__Impl )
            // InternalMyLanguage.g:3323:2: rule__MissionRiskLevelSent__Group__2__Impl
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
    // InternalMyLanguage.g:3329:1: rule__MissionRiskLevelSent__Group__2__Impl : ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) ) ;
    public final void rule__MissionRiskLevelSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3333:1: ( ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) ) )
            // InternalMyLanguage.g:3334:1: ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) )
            {
            // InternalMyLanguage.g:3334:1: ( ( rule__MissionRiskLevelSent__RisklevelAssignment_2 ) )
            // InternalMyLanguage.g:3335:2: ( rule__MissionRiskLevelSent__RisklevelAssignment_2 )
            {
             before(grammarAccess.getMissionRiskLevelSentAccess().getRisklevelAssignment_2()); 
            // InternalMyLanguage.g:3336:2: ( rule__MissionRiskLevelSent__RisklevelAssignment_2 )
            // InternalMyLanguage.g:3336:3: rule__MissionRiskLevelSent__RisklevelAssignment_2
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
    // InternalMyLanguage.g:3345:1: rule__MissionStatusSent__Group__0 : rule__MissionStatusSent__Group__0__Impl rule__MissionStatusSent__Group__1 ;
    public final void rule__MissionStatusSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3349:1: ( rule__MissionStatusSent__Group__0__Impl rule__MissionStatusSent__Group__1 )
            // InternalMyLanguage.g:3350:2: rule__MissionStatusSent__Group__0__Impl rule__MissionStatusSent__Group__1
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
    // InternalMyLanguage.g:3357:1: rule__MissionStatusSent__Group__0__Impl : ( 'status' ) ;
    public final void rule__MissionStatusSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3361:1: ( ( 'status' ) )
            // InternalMyLanguage.g:3362:1: ( 'status' )
            {
            // InternalMyLanguage.g:3362:1: ( 'status' )
            // InternalMyLanguage.g:3363:2: 'status'
            {
             before(grammarAccess.getMissionStatusSentAccess().getStatusKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyLanguage.g:3372:1: rule__MissionStatusSent__Group__1 : rule__MissionStatusSent__Group__1__Impl rule__MissionStatusSent__Group__2 ;
    public final void rule__MissionStatusSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3376:1: ( rule__MissionStatusSent__Group__1__Impl rule__MissionStatusSent__Group__2 )
            // InternalMyLanguage.g:3377:2: rule__MissionStatusSent__Group__1__Impl rule__MissionStatusSent__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyLanguage.g:3384:1: rule__MissionStatusSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__MissionStatusSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3388:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3389:1: ( 'is' )
            {
            // InternalMyLanguage.g:3389:1: ( 'is' )
            // InternalMyLanguage.g:3390:2: 'is'
            {
             before(grammarAccess.getMissionStatusSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:3399:1: rule__MissionStatusSent__Group__2 : rule__MissionStatusSent__Group__2__Impl ;
    public final void rule__MissionStatusSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3403:1: ( rule__MissionStatusSent__Group__2__Impl )
            // InternalMyLanguage.g:3404:2: rule__MissionStatusSent__Group__2__Impl
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
    // InternalMyLanguage.g:3410:1: rule__MissionStatusSent__Group__2__Impl : ( ( rule__MissionStatusSent__StateAssignment_2 ) ) ;
    public final void rule__MissionStatusSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3414:1: ( ( ( rule__MissionStatusSent__StateAssignment_2 ) ) )
            // InternalMyLanguage.g:3415:1: ( ( rule__MissionStatusSent__StateAssignment_2 ) )
            {
            // InternalMyLanguage.g:3415:1: ( ( rule__MissionStatusSent__StateAssignment_2 ) )
            // InternalMyLanguage.g:3416:2: ( rule__MissionStatusSent__StateAssignment_2 )
            {
             before(grammarAccess.getMissionStatusSentAccess().getStateAssignment_2()); 
            // InternalMyLanguage.g:3417:2: ( rule__MissionStatusSent__StateAssignment_2 )
            // InternalMyLanguage.g:3417:3: rule__MissionStatusSent__StateAssignment_2
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
    // InternalMyLanguage.g:3426:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3430:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyLanguage.g:3431:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyLanguage.g:3438:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3442:1: ( ( 'Robot' ) )
            // InternalMyLanguage.g:3443:1: ( 'Robot' )
            {
            // InternalMyLanguage.g:3443:1: ( 'Robot' )
            // InternalMyLanguage.g:3444:2: 'Robot'
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
    // InternalMyLanguage.g:3453:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3457:1: ( rule__Robot__Group__1__Impl )
            // InternalMyLanguage.g:3458:2: rule__Robot__Group__1__Impl
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
    // InternalMyLanguage.g:3464:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__Alternatives_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3468:1: ( ( ( rule__Robot__Alternatives_1 ) ) )
            // InternalMyLanguage.g:3469:1: ( ( rule__Robot__Alternatives_1 ) )
            {
            // InternalMyLanguage.g:3469:1: ( ( rule__Robot__Alternatives_1 ) )
            // InternalMyLanguage.g:3470:2: ( rule__Robot__Alternatives_1 )
            {
             before(grammarAccess.getRobotAccess().getAlternatives_1()); 
            // InternalMyLanguage.g:3471:2: ( rule__Robot__Alternatives_1 )
            // InternalMyLanguage.g:3471:3: rule__Robot__Alternatives_1
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
    // InternalMyLanguage.g:3480:1: rule__RobotAutoPilot__Group__0 : rule__RobotAutoPilot__Group__0__Impl rule__RobotAutoPilot__Group__1 ;
    public final void rule__RobotAutoPilot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3484:1: ( rule__RobotAutoPilot__Group__0__Impl rule__RobotAutoPilot__Group__1 )
            // InternalMyLanguage.g:3485:2: rule__RobotAutoPilot__Group__0__Impl rule__RobotAutoPilot__Group__1
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
    // InternalMyLanguage.g:3492:1: rule__RobotAutoPilot__Group__0__Impl : ( 'autopilot' ) ;
    public final void rule__RobotAutoPilot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3496:1: ( ( 'autopilot' ) )
            // InternalMyLanguage.g:3497:1: ( 'autopilot' )
            {
            // InternalMyLanguage.g:3497:1: ( 'autopilot' )
            // InternalMyLanguage.g:3498:2: 'autopilot'
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
    // InternalMyLanguage.g:3507:1: rule__RobotAutoPilot__Group__1 : rule__RobotAutoPilot__Group__1__Impl rule__RobotAutoPilot__Group__2 ;
    public final void rule__RobotAutoPilot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3511:1: ( rule__RobotAutoPilot__Group__1__Impl rule__RobotAutoPilot__Group__2 )
            // InternalMyLanguage.g:3512:2: rule__RobotAutoPilot__Group__1__Impl rule__RobotAutoPilot__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyLanguage.g:3519:1: rule__RobotAutoPilot__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotAutoPilot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3523:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3524:1: ( 'is' )
            {
            // InternalMyLanguage.g:3524:1: ( 'is' )
            // InternalMyLanguage.g:3525:2: 'is'
            {
             before(grammarAccess.getRobotAutoPilotAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:3534:1: rule__RobotAutoPilot__Group__2 : rule__RobotAutoPilot__Group__2__Impl ;
    public final void rule__RobotAutoPilot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3538:1: ( rule__RobotAutoPilot__Group__2__Impl )
            // InternalMyLanguage.g:3539:2: rule__RobotAutoPilot__Group__2__Impl
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
    // InternalMyLanguage.g:3545:1: rule__RobotAutoPilot__Group__2__Impl : ( ( rule__RobotAutoPilot__StatusAssignment_2 ) ) ;
    public final void rule__RobotAutoPilot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3549:1: ( ( ( rule__RobotAutoPilot__StatusAssignment_2 ) ) )
            // InternalMyLanguage.g:3550:1: ( ( rule__RobotAutoPilot__StatusAssignment_2 ) )
            {
            // InternalMyLanguage.g:3550:1: ( ( rule__RobotAutoPilot__StatusAssignment_2 ) )
            // InternalMyLanguage.g:3551:2: ( rule__RobotAutoPilot__StatusAssignment_2 )
            {
             before(grammarAccess.getRobotAutoPilotAccess().getStatusAssignment_2()); 
            // InternalMyLanguage.g:3552:2: ( rule__RobotAutoPilot__StatusAssignment_2 )
            // InternalMyLanguage.g:3552:3: rule__RobotAutoPilot__StatusAssignment_2
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
    // InternalMyLanguage.g:3561:1: rule__RedundantComponent__Group__0 : rule__RedundantComponent__Group__0__Impl rule__RedundantComponent__Group__1 ;
    public final void rule__RedundantComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3565:1: ( rule__RedundantComponent__Group__0__Impl rule__RedundantComponent__Group__1 )
            // InternalMyLanguage.g:3566:2: rule__RedundantComponent__Group__0__Impl rule__RedundantComponent__Group__1
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
    // InternalMyLanguage.g:3573:1: rule__RedundantComponent__Group__0__Impl : ( ( rule__RedundantComponent__ComponentAssignment_0 ) ) ;
    public final void rule__RedundantComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3577:1: ( ( ( rule__RedundantComponent__ComponentAssignment_0 ) ) )
            // InternalMyLanguage.g:3578:1: ( ( rule__RedundantComponent__ComponentAssignment_0 ) )
            {
            // InternalMyLanguage.g:3578:1: ( ( rule__RedundantComponent__ComponentAssignment_0 ) )
            // InternalMyLanguage.g:3579:2: ( rule__RedundantComponent__ComponentAssignment_0 )
            {
             before(grammarAccess.getRedundantComponentAccess().getComponentAssignment_0()); 
            // InternalMyLanguage.g:3580:2: ( rule__RedundantComponent__ComponentAssignment_0 )
            // InternalMyLanguage.g:3580:3: rule__RedundantComponent__ComponentAssignment_0
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
    // InternalMyLanguage.g:3588:1: rule__RedundantComponent__Group__1 : rule__RedundantComponent__Group__1__Impl rule__RedundantComponent__Group__2 ;
    public final void rule__RedundantComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3592:1: ( rule__RedundantComponent__Group__1__Impl rule__RedundantComponent__Group__2 )
            // InternalMyLanguage.g:3593:2: rule__RedundantComponent__Group__1__Impl rule__RedundantComponent__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyLanguage.g:3600:1: rule__RedundantComponent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RedundantComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3604:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3605:1: ( 'is' )
            {
            // InternalMyLanguage.g:3605:1: ( 'is' )
            // InternalMyLanguage.g:3606:2: 'is'
            {
             before(grammarAccess.getRedundantComponentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:3615:1: rule__RedundantComponent__Group__2 : rule__RedundantComponent__Group__2__Impl rule__RedundantComponent__Group__3 ;
    public final void rule__RedundantComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3619:1: ( rule__RedundantComponent__Group__2__Impl rule__RedundantComponent__Group__3 )
            // InternalMyLanguage.g:3620:2: rule__RedundantComponent__Group__2__Impl rule__RedundantComponent__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyLanguage.g:3627:1: rule__RedundantComponent__Group__2__Impl : ( 'used' ) ;
    public final void rule__RedundantComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3631:1: ( ( 'used' ) )
            // InternalMyLanguage.g:3632:1: ( 'used' )
            {
            // InternalMyLanguage.g:3632:1: ( 'used' )
            // InternalMyLanguage.g:3633:2: 'used'
            {
             before(grammarAccess.getRedundantComponentAccess().getUsedKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyLanguage.g:3642:1: rule__RedundantComponent__Group__3 : rule__RedundantComponent__Group__3__Impl rule__RedundantComponent__Group__4 ;
    public final void rule__RedundantComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3646:1: ( rule__RedundantComponent__Group__3__Impl rule__RedundantComponent__Group__4 )
            // InternalMyLanguage.g:3647:2: rule__RedundantComponent__Group__3__Impl rule__RedundantComponent__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyLanguage.g:3654:1: rule__RedundantComponent__Group__3__Impl : ( 'as' ) ;
    public final void rule__RedundantComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3658:1: ( ( 'as' ) )
            // InternalMyLanguage.g:3659:1: ( 'as' )
            {
            // InternalMyLanguage.g:3659:1: ( 'as' )
            // InternalMyLanguage.g:3660:2: 'as'
            {
             before(grammarAccess.getRedundantComponentAccess().getAsKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyLanguage.g:3669:1: rule__RedundantComponent__Group__4 : rule__RedundantComponent__Group__4__Impl rule__RedundantComponent__Group__5 ;
    public final void rule__RedundantComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3673:1: ( rule__RedundantComponent__Group__4__Impl rule__RedundantComponent__Group__5 )
            // InternalMyLanguage.g:3674:2: rule__RedundantComponent__Group__4__Impl rule__RedundantComponent__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyLanguage.g:3681:1: rule__RedundantComponent__Group__4__Impl : ( 'redundant' ) ;
    public final void rule__RedundantComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3685:1: ( ( 'redundant' ) )
            // InternalMyLanguage.g:3686:1: ( 'redundant' )
            {
            // InternalMyLanguage.g:3686:1: ( 'redundant' )
            // InternalMyLanguage.g:3687:2: 'redundant'
            {
             before(grammarAccess.getRedundantComponentAccess().getRedundantKeyword_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyLanguage.g:3696:1: rule__RedundantComponent__Group__5 : rule__RedundantComponent__Group__5__Impl ;
    public final void rule__RedundantComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3700:1: ( rule__RedundantComponent__Group__5__Impl )
            // InternalMyLanguage.g:3701:2: rule__RedundantComponent__Group__5__Impl
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
    // InternalMyLanguage.g:3707:1: rule__RedundantComponent__Group__5__Impl : ( 'component' ) ;
    public final void rule__RedundantComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3711:1: ( ( 'component' ) )
            // InternalMyLanguage.g:3712:1: ( 'component' )
            {
            // InternalMyLanguage.g:3712:1: ( 'component' )
            // InternalMyLanguage.g:3713:2: 'component'
            {
             before(grammarAccess.getRedundantComponentAccess().getComponentKeyword_5()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyLanguage.g:3723:1: rule__PayloadSent__Group__0 : rule__PayloadSent__Group__0__Impl rule__PayloadSent__Group__1 ;
    public final void rule__PayloadSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3727:1: ( rule__PayloadSent__Group__0__Impl rule__PayloadSent__Group__1 )
            // InternalMyLanguage.g:3728:2: rule__PayloadSent__Group__0__Impl rule__PayloadSent__Group__1
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
    // InternalMyLanguage.g:3735:1: rule__PayloadSent__Group__0__Impl : ( ( rule__PayloadSent__LoadAssignment_0 ) ) ;
    public final void rule__PayloadSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3739:1: ( ( ( rule__PayloadSent__LoadAssignment_0 ) ) )
            // InternalMyLanguage.g:3740:1: ( ( rule__PayloadSent__LoadAssignment_0 ) )
            {
            // InternalMyLanguage.g:3740:1: ( ( rule__PayloadSent__LoadAssignment_0 ) )
            // InternalMyLanguage.g:3741:2: ( rule__PayloadSent__LoadAssignment_0 )
            {
             before(grammarAccess.getPayloadSentAccess().getLoadAssignment_0()); 
            // InternalMyLanguage.g:3742:2: ( rule__PayloadSent__LoadAssignment_0 )
            // InternalMyLanguage.g:3742:3: rule__PayloadSent__LoadAssignment_0
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
    // InternalMyLanguage.g:3750:1: rule__PayloadSent__Group__1 : rule__PayloadSent__Group__1__Impl ;
    public final void rule__PayloadSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3754:1: ( rule__PayloadSent__Group__1__Impl )
            // InternalMyLanguage.g:3755:2: rule__PayloadSent__Group__1__Impl
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
    // InternalMyLanguage.g:3761:1: rule__PayloadSent__Group__1__Impl : ( 'drops' ) ;
    public final void rule__PayloadSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3765:1: ( ( 'drops' ) )
            // InternalMyLanguage.g:3766:1: ( 'drops' )
            {
            // InternalMyLanguage.g:3766:1: ( 'drops' )
            // InternalMyLanguage.g:3767:2: 'drops'
            {
             before(grammarAccess.getPayloadSentAccess().getDropsKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyLanguage.g:3777:1: rule__RobotDistanceSent__Group__0 : rule__RobotDistanceSent__Group__0__Impl rule__RobotDistanceSent__Group__1 ;
    public final void rule__RobotDistanceSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3781:1: ( rule__RobotDistanceSent__Group__0__Impl rule__RobotDistanceSent__Group__1 )
            // InternalMyLanguage.g:3782:2: rule__RobotDistanceSent__Group__0__Impl rule__RobotDistanceSent__Group__1
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
    // InternalMyLanguage.g:3789:1: rule__RobotDistanceSent__Group__0__Impl : ( 'distance' ) ;
    public final void rule__RobotDistanceSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3793:1: ( ( 'distance' ) )
            // InternalMyLanguage.g:3794:1: ( 'distance' )
            {
            // InternalMyLanguage.g:3794:1: ( 'distance' )
            // InternalMyLanguage.g:3795:2: 'distance'
            {
             before(grammarAccess.getRobotDistanceSentAccess().getDistanceKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyLanguage.g:3804:1: rule__RobotDistanceSent__Group__1 : rule__RobotDistanceSent__Group__1__Impl rule__RobotDistanceSent__Group__2 ;
    public final void rule__RobotDistanceSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3808:1: ( rule__RobotDistanceSent__Group__1__Impl rule__RobotDistanceSent__Group__2 )
            // InternalMyLanguage.g:3809:2: rule__RobotDistanceSent__Group__1__Impl rule__RobotDistanceSent__Group__2
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
    // InternalMyLanguage.g:3816:1: rule__RobotDistanceSent__Group__1__Impl : ( 'to' ) ;
    public final void rule__RobotDistanceSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3820:1: ( ( 'to' ) )
            // InternalMyLanguage.g:3821:1: ( 'to' )
            {
            // InternalMyLanguage.g:3821:1: ( 'to' )
            // InternalMyLanguage.g:3822:2: 'to'
            {
             before(grammarAccess.getRobotDistanceSentAccess().getToKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyLanguage.g:3831:1: rule__RobotDistanceSent__Group__2 : rule__RobotDistanceSent__Group__2__Impl ;
    public final void rule__RobotDistanceSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3835:1: ( rule__RobotDistanceSent__Group__2__Impl )
            // InternalMyLanguage.g:3836:2: rule__RobotDistanceSent__Group__2__Impl
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
    // InternalMyLanguage.g:3842:1: rule__RobotDistanceSent__Group__2__Impl : ( ( rule__RobotDistanceSent__SentAssignment_2 ) ) ;
    public final void rule__RobotDistanceSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3846:1: ( ( ( rule__RobotDistanceSent__SentAssignment_2 ) ) )
            // InternalMyLanguage.g:3847:1: ( ( rule__RobotDistanceSent__SentAssignment_2 ) )
            {
            // InternalMyLanguage.g:3847:1: ( ( rule__RobotDistanceSent__SentAssignment_2 ) )
            // InternalMyLanguage.g:3848:2: ( rule__RobotDistanceSent__SentAssignment_2 )
            {
             before(grammarAccess.getRobotDistanceSentAccess().getSentAssignment_2()); 
            // InternalMyLanguage.g:3849:2: ( rule__RobotDistanceSent__SentAssignment_2 )
            // InternalMyLanguage.g:3849:3: rule__RobotDistanceSent__SentAssignment_2
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
    // InternalMyLanguage.g:3858:1: rule__DistanceToLocationSent__Group__0 : rule__DistanceToLocationSent__Group__0__Impl rule__DistanceToLocationSent__Group__1 ;
    public final void rule__DistanceToLocationSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3862:1: ( rule__DistanceToLocationSent__Group__0__Impl rule__DistanceToLocationSent__Group__1 )
            // InternalMyLanguage.g:3863:2: rule__DistanceToLocationSent__Group__0__Impl rule__DistanceToLocationSent__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:3870:1: rule__DistanceToLocationSent__Group__0__Impl : ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) ) ;
    public final void rule__DistanceToLocationSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3874:1: ( ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) ) )
            // InternalMyLanguage.g:3875:1: ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) )
            {
            // InternalMyLanguage.g:3875:1: ( ( rule__DistanceToLocationSent__PosXAssignment_0 ) )
            // InternalMyLanguage.g:3876:2: ( rule__DistanceToLocationSent__PosXAssignment_0 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosXAssignment_0()); 
            // InternalMyLanguage.g:3877:2: ( rule__DistanceToLocationSent__PosXAssignment_0 )
            // InternalMyLanguage.g:3877:3: rule__DistanceToLocationSent__PosXAssignment_0
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
    // InternalMyLanguage.g:3885:1: rule__DistanceToLocationSent__Group__1 : rule__DistanceToLocationSent__Group__1__Impl rule__DistanceToLocationSent__Group__2 ;
    public final void rule__DistanceToLocationSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3889:1: ( rule__DistanceToLocationSent__Group__1__Impl rule__DistanceToLocationSent__Group__2 )
            // InternalMyLanguage.g:3890:2: rule__DistanceToLocationSent__Group__1__Impl rule__DistanceToLocationSent__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:3897:1: rule__DistanceToLocationSent__Group__1__Impl : ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) ) ;
    public final void rule__DistanceToLocationSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3901:1: ( ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) ) )
            // InternalMyLanguage.g:3902:1: ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) )
            {
            // InternalMyLanguage.g:3902:1: ( ( rule__DistanceToLocationSent__PosYAssignment_1 ) )
            // InternalMyLanguage.g:3903:2: ( rule__DistanceToLocationSent__PosYAssignment_1 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosYAssignment_1()); 
            // InternalMyLanguage.g:3904:2: ( rule__DistanceToLocationSent__PosYAssignment_1 )
            // InternalMyLanguage.g:3904:3: rule__DistanceToLocationSent__PosYAssignment_1
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
    // InternalMyLanguage.g:3912:1: rule__DistanceToLocationSent__Group__2 : rule__DistanceToLocationSent__Group__2__Impl rule__DistanceToLocationSent__Group__3 ;
    public final void rule__DistanceToLocationSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3916:1: ( rule__DistanceToLocationSent__Group__2__Impl rule__DistanceToLocationSent__Group__3 )
            // InternalMyLanguage.g:3917:2: rule__DistanceToLocationSent__Group__2__Impl rule__DistanceToLocationSent__Group__3
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
    // InternalMyLanguage.g:3924:1: rule__DistanceToLocationSent__Group__2__Impl : ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) ) ;
    public final void rule__DistanceToLocationSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3928:1: ( ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) ) )
            // InternalMyLanguage.g:3929:1: ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) )
            {
            // InternalMyLanguage.g:3929:1: ( ( rule__DistanceToLocationSent__PosZAssignment_2 ) )
            // InternalMyLanguage.g:3930:2: ( rule__DistanceToLocationSent__PosZAssignment_2 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getPosZAssignment_2()); 
            // InternalMyLanguage.g:3931:2: ( rule__DistanceToLocationSent__PosZAssignment_2 )
            // InternalMyLanguage.g:3931:3: rule__DistanceToLocationSent__PosZAssignment_2
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
    // InternalMyLanguage.g:3939:1: rule__DistanceToLocationSent__Group__3 : rule__DistanceToLocationSent__Group__3__Impl rule__DistanceToLocationSent__Group__4 ;
    public final void rule__DistanceToLocationSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3943:1: ( rule__DistanceToLocationSent__Group__3__Impl rule__DistanceToLocationSent__Group__4 )
            // InternalMyLanguage.g:3944:2: rule__DistanceToLocationSent__Group__3__Impl rule__DistanceToLocationSent__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyLanguage.g:3951:1: rule__DistanceToLocationSent__Group__3__Impl : ( 'is' ) ;
    public final void rule__DistanceToLocationSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3955:1: ( ( 'is' ) )
            // InternalMyLanguage.g:3956:1: ( 'is' )
            {
            // InternalMyLanguage.g:3956:1: ( 'is' )
            // InternalMyLanguage.g:3957:2: 'is'
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getIsKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:3966:1: rule__DistanceToLocationSent__Group__4 : rule__DistanceToLocationSent__Group__4__Impl rule__DistanceToLocationSent__Group__5 ;
    public final void rule__DistanceToLocationSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3970:1: ( rule__DistanceToLocationSent__Group__4__Impl rule__DistanceToLocationSent__Group__5 )
            // InternalMyLanguage.g:3971:2: rule__DistanceToLocationSent__Group__4__Impl rule__DistanceToLocationSent__Group__5
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
    // InternalMyLanguage.g:3978:1: rule__DistanceToLocationSent__Group__4__Impl : ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) ) ;
    public final void rule__DistanceToLocationSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3982:1: ( ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) ) )
            // InternalMyLanguage.g:3983:1: ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) )
            {
            // InternalMyLanguage.g:3983:1: ( ( rule__DistanceToLocationSent__BodyAssignment_4 ) )
            // InternalMyLanguage.g:3984:2: ( rule__DistanceToLocationSent__BodyAssignment_4 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getBodyAssignment_4()); 
            // InternalMyLanguage.g:3985:2: ( rule__DistanceToLocationSent__BodyAssignment_4 )
            // InternalMyLanguage.g:3985:3: rule__DistanceToLocationSent__BodyAssignment_4
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
    // InternalMyLanguage.g:3993:1: rule__DistanceToLocationSent__Group__5 : rule__DistanceToLocationSent__Group__5__Impl ;
    public final void rule__DistanceToLocationSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:3997:1: ( rule__DistanceToLocationSent__Group__5__Impl )
            // InternalMyLanguage.g:3998:2: rule__DistanceToLocationSent__Group__5__Impl
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
    // InternalMyLanguage.g:4004:1: rule__DistanceToLocationSent__Group__5__Impl : ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? ) ;
    public final void rule__DistanceToLocationSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4008:1: ( ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:4009:1: ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:4009:1: ( ( rule__DistanceToLocationSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:4010:2: ( rule__DistanceToLocationSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:4011:2: ( rule__DistanceToLocationSent__ToleranceAssignment_5 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==66) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyLanguage.g:4011:3: rule__DistanceToLocationSent__ToleranceAssignment_5
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
    // InternalMyLanguage.g:4020:1: rule__DistanceToObstaclesSent__Group__0 : rule__DistanceToObstaclesSent__Group__0__Impl rule__DistanceToObstaclesSent__Group__1 ;
    public final void rule__DistanceToObstaclesSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4024:1: ( rule__DistanceToObstaclesSent__Group__0__Impl rule__DistanceToObstaclesSent__Group__1 )
            // InternalMyLanguage.g:4025:2: rule__DistanceToObstaclesSent__Group__0__Impl rule__DistanceToObstaclesSent__Group__1
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
    // InternalMyLanguage.g:4032:1: rule__DistanceToObstaclesSent__Group__0__Impl : ( 'obstacles' ) ;
    public final void rule__DistanceToObstaclesSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4036:1: ( ( 'obstacles' ) )
            // InternalMyLanguage.g:4037:1: ( 'obstacles' )
            {
            // InternalMyLanguage.g:4037:1: ( 'obstacles' )
            // InternalMyLanguage.g:4038:2: 'obstacles'
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getObstaclesKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyLanguage.g:4047:1: rule__DistanceToObstaclesSent__Group__1 : rule__DistanceToObstaclesSent__Group__1__Impl rule__DistanceToObstaclesSent__Group__2 ;
    public final void rule__DistanceToObstaclesSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4051:1: ( rule__DistanceToObstaclesSent__Group__1__Impl rule__DistanceToObstaclesSent__Group__2 )
            // InternalMyLanguage.g:4052:2: rule__DistanceToObstaclesSent__Group__1__Impl rule__DistanceToObstaclesSent__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyLanguage.g:4059:1: rule__DistanceToObstaclesSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__DistanceToObstaclesSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4063:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4064:1: ( 'is' )
            {
            // InternalMyLanguage.g:4064:1: ( 'is' )
            // InternalMyLanguage.g:4065:2: 'is'
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:4074:1: rule__DistanceToObstaclesSent__Group__2 : rule__DistanceToObstaclesSent__Group__2__Impl rule__DistanceToObstaclesSent__Group__3 ;
    public final void rule__DistanceToObstaclesSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4078:1: ( rule__DistanceToObstaclesSent__Group__2__Impl rule__DistanceToObstaclesSent__Group__3 )
            // InternalMyLanguage.g:4079:2: rule__DistanceToObstaclesSent__Group__2__Impl rule__DistanceToObstaclesSent__Group__3
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
    // InternalMyLanguage.g:4086:1: rule__DistanceToObstaclesSent__Group__2__Impl : ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) ) ;
    public final void rule__DistanceToObstaclesSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4090:1: ( ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) ) )
            // InternalMyLanguage.g:4091:1: ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) )
            {
            // InternalMyLanguage.g:4091:1: ( ( rule__DistanceToObstaclesSent__BodyAssignment_2 ) )
            // InternalMyLanguage.g:4092:2: ( rule__DistanceToObstaclesSent__BodyAssignment_2 )
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAssignment_2()); 
            // InternalMyLanguage.g:4093:2: ( rule__DistanceToObstaclesSent__BodyAssignment_2 )
            // InternalMyLanguage.g:4093:3: rule__DistanceToObstaclesSent__BodyAssignment_2
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
    // InternalMyLanguage.g:4101:1: rule__DistanceToObstaclesSent__Group__3 : rule__DistanceToObstaclesSent__Group__3__Impl ;
    public final void rule__DistanceToObstaclesSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4105:1: ( rule__DistanceToObstaclesSent__Group__3__Impl )
            // InternalMyLanguage.g:4106:2: rule__DistanceToObstaclesSent__Group__3__Impl
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
    // InternalMyLanguage.g:4112:1: rule__DistanceToObstaclesSent__Group__3__Impl : ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? ) ;
    public final void rule__DistanceToObstaclesSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4116:1: ( ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? ) )
            // InternalMyLanguage.g:4117:1: ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? )
            {
            // InternalMyLanguage.g:4117:1: ( ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )? )
            // InternalMyLanguage.g:4118:2: ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )?
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getToleranceAssignment_3()); 
            // InternalMyLanguage.g:4119:2: ( rule__DistanceToObstaclesSent__ToleranceAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==66) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyLanguage.g:4119:3: rule__DistanceToObstaclesSent__ToleranceAssignment_3
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
    // InternalMyLanguage.g:4128:1: rule__EqualSent__Group__0 : rule__EqualSent__Group__0__Impl rule__EqualSent__Group__1 ;
    public final void rule__EqualSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4132:1: ( rule__EqualSent__Group__0__Impl rule__EqualSent__Group__1 )
            // InternalMyLanguage.g:4133:2: rule__EqualSent__Group__0__Impl rule__EqualSent__Group__1
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
    // InternalMyLanguage.g:4140:1: rule__EqualSent__Group__0__Impl : ( 'equal' ) ;
    public final void rule__EqualSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4144:1: ( ( 'equal' ) )
            // InternalMyLanguage.g:4145:1: ( 'equal' )
            {
            // InternalMyLanguage.g:4145:1: ( 'equal' )
            // InternalMyLanguage.g:4146:2: 'equal'
            {
             before(grammarAccess.getEqualSentAccess().getEqualKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyLanguage.g:4155:1: rule__EqualSent__Group__1 : rule__EqualSent__Group__1__Impl rule__EqualSent__Group__2 ;
    public final void rule__EqualSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4159:1: ( rule__EqualSent__Group__1__Impl rule__EqualSent__Group__2 )
            // InternalMyLanguage.g:4160:2: rule__EqualSent__Group__1__Impl rule__EqualSent__Group__2
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
    // InternalMyLanguage.g:4167:1: rule__EqualSent__Group__1__Impl : ( 'to' ) ;
    public final void rule__EqualSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4171:1: ( ( 'to' ) )
            // InternalMyLanguage.g:4172:1: ( 'to' )
            {
            // InternalMyLanguage.g:4172:1: ( 'to' )
            // InternalMyLanguage.g:4173:2: 'to'
            {
             before(grammarAccess.getEqualSentAccess().getToKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyLanguage.g:4182:1: rule__EqualSent__Group__2 : rule__EqualSent__Group__2__Impl ;
    public final void rule__EqualSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4186:1: ( rule__EqualSent__Group__2__Impl )
            // InternalMyLanguage.g:4187:2: rule__EqualSent__Group__2__Impl
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
    // InternalMyLanguage.g:4193:1: rule__EqualSent__Group__2__Impl : ( ( rule__EqualSent__AmountAssignment_2 ) ) ;
    public final void rule__EqualSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4197:1: ( ( ( rule__EqualSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:4198:1: ( ( rule__EqualSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:4198:1: ( ( rule__EqualSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:4199:2: ( rule__EqualSent__AmountAssignment_2 )
            {
             before(grammarAccess.getEqualSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:4200:2: ( rule__EqualSent__AmountAssignment_2 )
            // InternalMyLanguage.g:4200:3: rule__EqualSent__AmountAssignment_2
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
    // InternalMyLanguage.g:4209:1: rule__LessSent__Group__0 : rule__LessSent__Group__0__Impl rule__LessSent__Group__1 ;
    public final void rule__LessSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4213:1: ( rule__LessSent__Group__0__Impl rule__LessSent__Group__1 )
            // InternalMyLanguage.g:4214:2: rule__LessSent__Group__0__Impl rule__LessSent__Group__1
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
    // InternalMyLanguage.g:4221:1: rule__LessSent__Group__0__Impl : ( 'lower' ) ;
    public final void rule__LessSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4225:1: ( ( 'lower' ) )
            // InternalMyLanguage.g:4226:1: ( 'lower' )
            {
            // InternalMyLanguage.g:4226:1: ( 'lower' )
            // InternalMyLanguage.g:4227:2: 'lower'
            {
             before(grammarAccess.getLessSentAccess().getLowerKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyLanguage.g:4236:1: rule__LessSent__Group__1 : rule__LessSent__Group__1__Impl rule__LessSent__Group__2 ;
    public final void rule__LessSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4240:1: ( rule__LessSent__Group__1__Impl rule__LessSent__Group__2 )
            // InternalMyLanguage.g:4241:2: rule__LessSent__Group__1__Impl rule__LessSent__Group__2
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
    // InternalMyLanguage.g:4248:1: rule__LessSent__Group__1__Impl : ( 'then' ) ;
    public final void rule__LessSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4252:1: ( ( 'then' ) )
            // InternalMyLanguage.g:4253:1: ( 'then' )
            {
            // InternalMyLanguage.g:4253:1: ( 'then' )
            // InternalMyLanguage.g:4254:2: 'then'
            {
             before(grammarAccess.getLessSentAccess().getThenKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyLanguage.g:4263:1: rule__LessSent__Group__2 : rule__LessSent__Group__2__Impl ;
    public final void rule__LessSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4267:1: ( rule__LessSent__Group__2__Impl )
            // InternalMyLanguage.g:4268:2: rule__LessSent__Group__2__Impl
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
    // InternalMyLanguage.g:4274:1: rule__LessSent__Group__2__Impl : ( ( rule__LessSent__AmountAssignment_2 ) ) ;
    public final void rule__LessSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4278:1: ( ( ( rule__LessSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:4279:1: ( ( rule__LessSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:4279:1: ( ( rule__LessSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:4280:2: ( rule__LessSent__AmountAssignment_2 )
            {
             before(grammarAccess.getLessSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:4281:2: ( rule__LessSent__AmountAssignment_2 )
            // InternalMyLanguage.g:4281:3: rule__LessSent__AmountAssignment_2
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
    // InternalMyLanguage.g:4290:1: rule__GreaterSent__Group__0 : rule__GreaterSent__Group__0__Impl rule__GreaterSent__Group__1 ;
    public final void rule__GreaterSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4294:1: ( rule__GreaterSent__Group__0__Impl rule__GreaterSent__Group__1 )
            // InternalMyLanguage.g:4295:2: rule__GreaterSent__Group__0__Impl rule__GreaterSent__Group__1
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
    // InternalMyLanguage.g:4302:1: rule__GreaterSent__Group__0__Impl : ( 'greater' ) ;
    public final void rule__GreaterSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4306:1: ( ( 'greater' ) )
            // InternalMyLanguage.g:4307:1: ( 'greater' )
            {
            // InternalMyLanguage.g:4307:1: ( 'greater' )
            // InternalMyLanguage.g:4308:2: 'greater'
            {
             before(grammarAccess.getGreaterSentAccess().getGreaterKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyLanguage.g:4317:1: rule__GreaterSent__Group__1 : rule__GreaterSent__Group__1__Impl rule__GreaterSent__Group__2 ;
    public final void rule__GreaterSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4321:1: ( rule__GreaterSent__Group__1__Impl rule__GreaterSent__Group__2 )
            // InternalMyLanguage.g:4322:2: rule__GreaterSent__Group__1__Impl rule__GreaterSent__Group__2
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
    // InternalMyLanguage.g:4329:1: rule__GreaterSent__Group__1__Impl : ( 'then' ) ;
    public final void rule__GreaterSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4333:1: ( ( 'then' ) )
            // InternalMyLanguage.g:4334:1: ( 'then' )
            {
            // InternalMyLanguage.g:4334:1: ( 'then' )
            // InternalMyLanguage.g:4335:2: 'then'
            {
             before(grammarAccess.getGreaterSentAccess().getThenKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyLanguage.g:4344:1: rule__GreaterSent__Group__2 : rule__GreaterSent__Group__2__Impl ;
    public final void rule__GreaterSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4348:1: ( rule__GreaterSent__Group__2__Impl )
            // InternalMyLanguage.g:4349:2: rule__GreaterSent__Group__2__Impl
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
    // InternalMyLanguage.g:4355:1: rule__GreaterSent__Group__2__Impl : ( ( rule__GreaterSent__AmountAssignment_2 ) ) ;
    public final void rule__GreaterSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4359:1: ( ( ( rule__GreaterSent__AmountAssignment_2 ) ) )
            // InternalMyLanguage.g:4360:1: ( ( rule__GreaterSent__AmountAssignment_2 ) )
            {
            // InternalMyLanguage.g:4360:1: ( ( rule__GreaterSent__AmountAssignment_2 ) )
            // InternalMyLanguage.g:4361:2: ( rule__GreaterSent__AmountAssignment_2 )
            {
             before(grammarAccess.getGreaterSentAccess().getAmountAssignment_2()); 
            // InternalMyLanguage.g:4362:2: ( rule__GreaterSent__AmountAssignment_2 )
            // InternalMyLanguage.g:4362:3: rule__GreaterSent__AmountAssignment_2
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
    // InternalMyLanguage.g:4371:1: rule__RobotStateSent__Group__0 : rule__RobotStateSent__Group__0__Impl rule__RobotStateSent__Group__1 ;
    public final void rule__RobotStateSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4375:1: ( rule__RobotStateSent__Group__0__Impl rule__RobotStateSent__Group__1 )
            // InternalMyLanguage.g:4376:2: rule__RobotStateSent__Group__0__Impl rule__RobotStateSent__Group__1
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
    // InternalMyLanguage.g:4383:1: rule__RobotStateSent__Group__0__Impl : ( 'state' ) ;
    public final void rule__RobotStateSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4387:1: ( ( 'state' ) )
            // InternalMyLanguage.g:4388:1: ( 'state' )
            {
            // InternalMyLanguage.g:4388:1: ( 'state' )
            // InternalMyLanguage.g:4389:2: 'state'
            {
             before(grammarAccess.getRobotStateSentAccess().getStateKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyLanguage.g:4398:1: rule__RobotStateSent__Group__1 : rule__RobotStateSent__Group__1__Impl rule__RobotStateSent__Group__2 ;
    public final void rule__RobotStateSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4402:1: ( rule__RobotStateSent__Group__1__Impl rule__RobotStateSent__Group__2 )
            // InternalMyLanguage.g:4403:2: rule__RobotStateSent__Group__1__Impl rule__RobotStateSent__Group__2
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
    // InternalMyLanguage.g:4410:1: rule__RobotStateSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotStateSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4414:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4415:1: ( 'is' )
            {
            // InternalMyLanguage.g:4415:1: ( 'is' )
            // InternalMyLanguage.g:4416:2: 'is'
            {
             before(grammarAccess.getRobotStateSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:4425:1: rule__RobotStateSent__Group__2 : rule__RobotStateSent__Group__2__Impl ;
    public final void rule__RobotStateSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4429:1: ( rule__RobotStateSent__Group__2__Impl )
            // InternalMyLanguage.g:4430:2: rule__RobotStateSent__Group__2__Impl
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
    // InternalMyLanguage.g:4436:1: rule__RobotStateSent__Group__2__Impl : ( ( rule__RobotStateSent__StateAssignment_2 ) ) ;
    public final void rule__RobotStateSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4440:1: ( ( ( rule__RobotStateSent__StateAssignment_2 ) ) )
            // InternalMyLanguage.g:4441:1: ( ( rule__RobotStateSent__StateAssignment_2 ) )
            {
            // InternalMyLanguage.g:4441:1: ( ( rule__RobotStateSent__StateAssignment_2 ) )
            // InternalMyLanguage.g:4442:2: ( rule__RobotStateSent__StateAssignment_2 )
            {
             before(grammarAccess.getRobotStateSentAccess().getStateAssignment_2()); 
            // InternalMyLanguage.g:4443:2: ( rule__RobotStateSent__StateAssignment_2 )
            // InternalMyLanguage.g:4443:3: rule__RobotStateSent__StateAssignment_2
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
    // InternalMyLanguage.g:4452:1: rule__RobotPositionSent__Group__0 : rule__RobotPositionSent__Group__0__Impl rule__RobotPositionSent__Group__1 ;
    public final void rule__RobotPositionSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4456:1: ( rule__RobotPositionSent__Group__0__Impl rule__RobotPositionSent__Group__1 )
            // InternalMyLanguage.g:4457:2: rule__RobotPositionSent__Group__0__Impl rule__RobotPositionSent__Group__1
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
    // InternalMyLanguage.g:4464:1: rule__RobotPositionSent__Group__0__Impl : ( 'position' ) ;
    public final void rule__RobotPositionSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4468:1: ( ( 'position' ) )
            // InternalMyLanguage.g:4469:1: ( 'position' )
            {
            // InternalMyLanguage.g:4469:1: ( 'position' )
            // InternalMyLanguage.g:4470:2: 'position'
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
    // InternalMyLanguage.g:4479:1: rule__RobotPositionSent__Group__1 : rule__RobotPositionSent__Group__1__Impl rule__RobotPositionSent__Group__2 ;
    public final void rule__RobotPositionSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4483:1: ( rule__RobotPositionSent__Group__1__Impl rule__RobotPositionSent__Group__2 )
            // InternalMyLanguage.g:4484:2: rule__RobotPositionSent__Group__1__Impl rule__RobotPositionSent__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:4491:1: rule__RobotPositionSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotPositionSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4495:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4496:1: ( 'is' )
            {
            // InternalMyLanguage.g:4496:1: ( 'is' )
            // InternalMyLanguage.g:4497:2: 'is'
            {
             before(grammarAccess.getRobotPositionSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:4506:1: rule__RobotPositionSent__Group__2 : rule__RobotPositionSent__Group__2__Impl rule__RobotPositionSent__Group__3 ;
    public final void rule__RobotPositionSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4510:1: ( rule__RobotPositionSent__Group__2__Impl rule__RobotPositionSent__Group__3 )
            // InternalMyLanguage.g:4511:2: rule__RobotPositionSent__Group__2__Impl rule__RobotPositionSent__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:4518:1: rule__RobotPositionSent__Group__2__Impl : ( ( rule__RobotPositionSent__PosXAssignment_2 ) ) ;
    public final void rule__RobotPositionSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4522:1: ( ( ( rule__RobotPositionSent__PosXAssignment_2 ) ) )
            // InternalMyLanguage.g:4523:1: ( ( rule__RobotPositionSent__PosXAssignment_2 ) )
            {
            // InternalMyLanguage.g:4523:1: ( ( rule__RobotPositionSent__PosXAssignment_2 ) )
            // InternalMyLanguage.g:4524:2: ( rule__RobotPositionSent__PosXAssignment_2 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosXAssignment_2()); 
            // InternalMyLanguage.g:4525:2: ( rule__RobotPositionSent__PosXAssignment_2 )
            // InternalMyLanguage.g:4525:3: rule__RobotPositionSent__PosXAssignment_2
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
    // InternalMyLanguage.g:4533:1: rule__RobotPositionSent__Group__3 : rule__RobotPositionSent__Group__3__Impl rule__RobotPositionSent__Group__4 ;
    public final void rule__RobotPositionSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4537:1: ( rule__RobotPositionSent__Group__3__Impl rule__RobotPositionSent__Group__4 )
            // InternalMyLanguage.g:4538:2: rule__RobotPositionSent__Group__3__Impl rule__RobotPositionSent__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:4545:1: rule__RobotPositionSent__Group__3__Impl : ( ( rule__RobotPositionSent__PosYAssignment_3 ) ) ;
    public final void rule__RobotPositionSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4549:1: ( ( ( rule__RobotPositionSent__PosYAssignment_3 ) ) )
            // InternalMyLanguage.g:4550:1: ( ( rule__RobotPositionSent__PosYAssignment_3 ) )
            {
            // InternalMyLanguage.g:4550:1: ( ( rule__RobotPositionSent__PosYAssignment_3 ) )
            // InternalMyLanguage.g:4551:2: ( rule__RobotPositionSent__PosYAssignment_3 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosYAssignment_3()); 
            // InternalMyLanguage.g:4552:2: ( rule__RobotPositionSent__PosYAssignment_3 )
            // InternalMyLanguage.g:4552:3: rule__RobotPositionSent__PosYAssignment_3
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
    // InternalMyLanguage.g:4560:1: rule__RobotPositionSent__Group__4 : rule__RobotPositionSent__Group__4__Impl rule__RobotPositionSent__Group__5 ;
    public final void rule__RobotPositionSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4564:1: ( rule__RobotPositionSent__Group__4__Impl rule__RobotPositionSent__Group__5 )
            // InternalMyLanguage.g:4565:2: rule__RobotPositionSent__Group__4__Impl rule__RobotPositionSent__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyLanguage.g:4572:1: rule__RobotPositionSent__Group__4__Impl : ( ( rule__RobotPositionSent__PosZAssignment_4 ) ) ;
    public final void rule__RobotPositionSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4576:1: ( ( ( rule__RobotPositionSent__PosZAssignment_4 ) ) )
            // InternalMyLanguage.g:4577:1: ( ( rule__RobotPositionSent__PosZAssignment_4 ) )
            {
            // InternalMyLanguage.g:4577:1: ( ( rule__RobotPositionSent__PosZAssignment_4 ) )
            // InternalMyLanguage.g:4578:2: ( rule__RobotPositionSent__PosZAssignment_4 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getPosZAssignment_4()); 
            // InternalMyLanguage.g:4579:2: ( rule__RobotPositionSent__PosZAssignment_4 )
            // InternalMyLanguage.g:4579:3: rule__RobotPositionSent__PosZAssignment_4
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
    // InternalMyLanguage.g:4587:1: rule__RobotPositionSent__Group__5 : rule__RobotPositionSent__Group__5__Impl ;
    public final void rule__RobotPositionSent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4591:1: ( rule__RobotPositionSent__Group__5__Impl )
            // InternalMyLanguage.g:4592:2: rule__RobotPositionSent__Group__5__Impl
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
    // InternalMyLanguage.g:4598:1: rule__RobotPositionSent__Group__5__Impl : ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? ) ;
    public final void rule__RobotPositionSent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4602:1: ( ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? ) )
            // InternalMyLanguage.g:4603:1: ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? )
            {
            // InternalMyLanguage.g:4603:1: ( ( rule__RobotPositionSent__ToleranceAssignment_5 )? )
            // InternalMyLanguage.g:4604:2: ( rule__RobotPositionSent__ToleranceAssignment_5 )?
            {
             before(grammarAccess.getRobotPositionSentAccess().getToleranceAssignment_5()); 
            // InternalMyLanguage.g:4605:2: ( rule__RobotPositionSent__ToleranceAssignment_5 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==64) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyLanguage.g:4605:3: rule__RobotPositionSent__ToleranceAssignment_5
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
    // InternalMyLanguage.g:4614:1: rule__CirclePosition__Group__0 : rule__CirclePosition__Group__0__Impl rule__CirclePosition__Group__1 ;
    public final void rule__CirclePosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4618:1: ( rule__CirclePosition__Group__0__Impl rule__CirclePosition__Group__1 )
            // InternalMyLanguage.g:4619:2: rule__CirclePosition__Group__0__Impl rule__CirclePosition__Group__1
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
    // InternalMyLanguage.g:4626:1: rule__CirclePosition__Group__0__Impl : ( 'within' ) ;
    public final void rule__CirclePosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4630:1: ( ( 'within' ) )
            // InternalMyLanguage.g:4631:1: ( 'within' )
            {
            // InternalMyLanguage.g:4631:1: ( 'within' )
            // InternalMyLanguage.g:4632:2: 'within'
            {
             before(grammarAccess.getCirclePositionAccess().getWithinKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyLanguage.g:4641:1: rule__CirclePosition__Group__1 : rule__CirclePosition__Group__1__Impl rule__CirclePosition__Group__2 ;
    public final void rule__CirclePosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4645:1: ( rule__CirclePosition__Group__1__Impl rule__CirclePosition__Group__2 )
            // InternalMyLanguage.g:4646:2: rule__CirclePosition__Group__1__Impl rule__CirclePosition__Group__2
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
    // InternalMyLanguage.g:4653:1: rule__CirclePosition__Group__1__Impl : ( 'circle' ) ;
    public final void rule__CirclePosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4657:1: ( ( 'circle' ) )
            // InternalMyLanguage.g:4658:1: ( 'circle' )
            {
            // InternalMyLanguage.g:4658:1: ( 'circle' )
            // InternalMyLanguage.g:4659:2: 'circle'
            {
             before(grammarAccess.getCirclePositionAccess().getCircleKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyLanguage.g:4668:1: rule__CirclePosition__Group__2 : rule__CirclePosition__Group__2__Impl rule__CirclePosition__Group__3 ;
    public final void rule__CirclePosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4672:1: ( rule__CirclePosition__Group__2__Impl rule__CirclePosition__Group__3 )
            // InternalMyLanguage.g:4673:2: rule__CirclePosition__Group__2__Impl rule__CirclePosition__Group__3
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
    // InternalMyLanguage.g:4680:1: rule__CirclePosition__Group__2__Impl : ( 'with' ) ;
    public final void rule__CirclePosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4684:1: ( ( 'with' ) )
            // InternalMyLanguage.g:4685:1: ( 'with' )
            {
            // InternalMyLanguage.g:4685:1: ( 'with' )
            // InternalMyLanguage.g:4686:2: 'with'
            {
             before(grammarAccess.getCirclePositionAccess().getWithKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyLanguage.g:4695:1: rule__CirclePosition__Group__3 : rule__CirclePosition__Group__3__Impl rule__CirclePosition__Group__4 ;
    public final void rule__CirclePosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4699:1: ( rule__CirclePosition__Group__3__Impl rule__CirclePosition__Group__4 )
            // InternalMyLanguage.g:4700:2: rule__CirclePosition__Group__3__Impl rule__CirclePosition__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyLanguage.g:4707:1: rule__CirclePosition__Group__3__Impl : ( 'radius' ) ;
    public final void rule__CirclePosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4711:1: ( ( 'radius' ) )
            // InternalMyLanguage.g:4712:1: ( 'radius' )
            {
            // InternalMyLanguage.g:4712:1: ( 'radius' )
            // InternalMyLanguage.g:4713:2: 'radius'
            {
             before(grammarAccess.getCirclePositionAccess().getRadiusKeyword_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyLanguage.g:4722:1: rule__CirclePosition__Group__4 : rule__CirclePosition__Group__4__Impl ;
    public final void rule__CirclePosition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4726:1: ( rule__CirclePosition__Group__4__Impl )
            // InternalMyLanguage.g:4727:2: rule__CirclePosition__Group__4__Impl
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
    // InternalMyLanguage.g:4733:1: rule__CirclePosition__Group__4__Impl : ( ( rule__CirclePosition__ToleranceAssignment_4 ) ) ;
    public final void rule__CirclePosition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4737:1: ( ( ( rule__CirclePosition__ToleranceAssignment_4 ) ) )
            // InternalMyLanguage.g:4738:1: ( ( rule__CirclePosition__ToleranceAssignment_4 ) )
            {
            // InternalMyLanguage.g:4738:1: ( ( rule__CirclePosition__ToleranceAssignment_4 ) )
            // InternalMyLanguage.g:4739:2: ( rule__CirclePosition__ToleranceAssignment_4 )
            {
             before(grammarAccess.getCirclePositionAccess().getToleranceAssignment_4()); 
            // InternalMyLanguage.g:4740:2: ( rule__CirclePosition__ToleranceAssignment_4 )
            // InternalMyLanguage.g:4740:3: rule__CirclePosition__ToleranceAssignment_4
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
    // InternalMyLanguage.g:4749:1: rule__SpherePosition__Group__0 : rule__SpherePosition__Group__0__Impl rule__SpherePosition__Group__1 ;
    public final void rule__SpherePosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4753:1: ( rule__SpherePosition__Group__0__Impl rule__SpherePosition__Group__1 )
            // InternalMyLanguage.g:4754:2: rule__SpherePosition__Group__0__Impl rule__SpherePosition__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyLanguage.g:4761:1: rule__SpherePosition__Group__0__Impl : ( 'within' ) ;
    public final void rule__SpherePosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4765:1: ( ( 'within' ) )
            // InternalMyLanguage.g:4766:1: ( 'within' )
            {
            // InternalMyLanguage.g:4766:1: ( 'within' )
            // InternalMyLanguage.g:4767:2: 'within'
            {
             before(grammarAccess.getSpherePositionAccess().getWithinKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyLanguage.g:4776:1: rule__SpherePosition__Group__1 : rule__SpherePosition__Group__1__Impl rule__SpherePosition__Group__2 ;
    public final void rule__SpherePosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4780:1: ( rule__SpherePosition__Group__1__Impl rule__SpherePosition__Group__2 )
            // InternalMyLanguage.g:4781:2: rule__SpherePosition__Group__1__Impl rule__SpherePosition__Group__2
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
    // InternalMyLanguage.g:4788:1: rule__SpherePosition__Group__1__Impl : ( 'sphere' ) ;
    public final void rule__SpherePosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4792:1: ( ( 'sphere' ) )
            // InternalMyLanguage.g:4793:1: ( 'sphere' )
            {
            // InternalMyLanguage.g:4793:1: ( 'sphere' )
            // InternalMyLanguage.g:4794:2: 'sphere'
            {
             before(grammarAccess.getSpherePositionAccess().getSphereKeyword_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyLanguage.g:4803:1: rule__SpherePosition__Group__2 : rule__SpherePosition__Group__2__Impl rule__SpherePosition__Group__3 ;
    public final void rule__SpherePosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4807:1: ( rule__SpherePosition__Group__2__Impl rule__SpherePosition__Group__3 )
            // InternalMyLanguage.g:4808:2: rule__SpherePosition__Group__2__Impl rule__SpherePosition__Group__3
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
    // InternalMyLanguage.g:4815:1: rule__SpherePosition__Group__2__Impl : ( 'with' ) ;
    public final void rule__SpherePosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4819:1: ( ( 'with' ) )
            // InternalMyLanguage.g:4820:1: ( 'with' )
            {
            // InternalMyLanguage.g:4820:1: ( 'with' )
            // InternalMyLanguage.g:4821:2: 'with'
            {
             before(grammarAccess.getSpherePositionAccess().getWithKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyLanguage.g:4830:1: rule__SpherePosition__Group__3 : rule__SpherePosition__Group__3__Impl rule__SpherePosition__Group__4 ;
    public final void rule__SpherePosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4834:1: ( rule__SpherePosition__Group__3__Impl rule__SpherePosition__Group__4 )
            // InternalMyLanguage.g:4835:2: rule__SpherePosition__Group__3__Impl rule__SpherePosition__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyLanguage.g:4842:1: rule__SpherePosition__Group__3__Impl : ( 'radius' ) ;
    public final void rule__SpherePosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4846:1: ( ( 'radius' ) )
            // InternalMyLanguage.g:4847:1: ( 'radius' )
            {
            // InternalMyLanguage.g:4847:1: ( 'radius' )
            // InternalMyLanguage.g:4848:2: 'radius'
            {
             before(grammarAccess.getSpherePositionAccess().getRadiusKeyword_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyLanguage.g:4857:1: rule__SpherePosition__Group__4 : rule__SpherePosition__Group__4__Impl ;
    public final void rule__SpherePosition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4861:1: ( rule__SpherePosition__Group__4__Impl )
            // InternalMyLanguage.g:4862:2: rule__SpherePosition__Group__4__Impl
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
    // InternalMyLanguage.g:4868:1: rule__SpherePosition__Group__4__Impl : ( ( rule__SpherePosition__ToleranceAssignment_4 ) ) ;
    public final void rule__SpherePosition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4872:1: ( ( ( rule__SpherePosition__ToleranceAssignment_4 ) ) )
            // InternalMyLanguage.g:4873:1: ( ( rule__SpherePosition__ToleranceAssignment_4 ) )
            {
            // InternalMyLanguage.g:4873:1: ( ( rule__SpherePosition__ToleranceAssignment_4 ) )
            // InternalMyLanguage.g:4874:2: ( rule__SpherePosition__ToleranceAssignment_4 )
            {
             before(grammarAccess.getSpherePositionAccess().getToleranceAssignment_4()); 
            // InternalMyLanguage.g:4875:2: ( rule__SpherePosition__ToleranceAssignment_4 )
            // InternalMyLanguage.g:4875:3: rule__SpherePosition__ToleranceAssignment_4
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
    // InternalMyLanguage.g:4884:1: rule__RobotSpeedSent__Group__0 : rule__RobotSpeedSent__Group__0__Impl rule__RobotSpeedSent__Group__1 ;
    public final void rule__RobotSpeedSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4888:1: ( rule__RobotSpeedSent__Group__0__Impl rule__RobotSpeedSent__Group__1 )
            // InternalMyLanguage.g:4889:2: rule__RobotSpeedSent__Group__0__Impl rule__RobotSpeedSent__Group__1
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
    // InternalMyLanguage.g:4896:1: rule__RobotSpeedSent__Group__0__Impl : ( 'speed' ) ;
    public final void rule__RobotSpeedSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4900:1: ( ( 'speed' ) )
            // InternalMyLanguage.g:4901:1: ( 'speed' )
            {
            // InternalMyLanguage.g:4901:1: ( 'speed' )
            // InternalMyLanguage.g:4902:2: 'speed'
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMyLanguage.g:4911:1: rule__RobotSpeedSent__Group__1 : rule__RobotSpeedSent__Group__1__Impl rule__RobotSpeedSent__Group__2 ;
    public final void rule__RobotSpeedSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4915:1: ( rule__RobotSpeedSent__Group__1__Impl rule__RobotSpeedSent__Group__2 )
            // InternalMyLanguage.g:4916:2: rule__RobotSpeedSent__Group__1__Impl rule__RobotSpeedSent__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:4923:1: rule__RobotSpeedSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RobotSpeedSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4927:1: ( ( 'is' ) )
            // InternalMyLanguage.g:4928:1: ( 'is' )
            {
            // InternalMyLanguage.g:4928:1: ( 'is' )
            // InternalMyLanguage.g:4929:2: 'is'
            {
             before(grammarAccess.getRobotSpeedSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:4938:1: rule__RobotSpeedSent__Group__2 : rule__RobotSpeedSent__Group__2__Impl rule__RobotSpeedSent__Group__3 ;
    public final void rule__RobotSpeedSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4942:1: ( rule__RobotSpeedSent__Group__2__Impl rule__RobotSpeedSent__Group__3 )
            // InternalMyLanguage.g:4943:2: rule__RobotSpeedSent__Group__2__Impl rule__RobotSpeedSent__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:4950:1: rule__RobotSpeedSent__Group__2__Impl : ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) ) ;
    public final void rule__RobotSpeedSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4954:1: ( ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) ) )
            // InternalMyLanguage.g:4955:1: ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) )
            {
            // InternalMyLanguage.g:4955:1: ( ( rule__RobotSpeedSent__SpeedXAssignment_2 ) )
            // InternalMyLanguage.g:4956:2: ( rule__RobotSpeedSent__SpeedXAssignment_2 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedXAssignment_2()); 
            // InternalMyLanguage.g:4957:2: ( rule__RobotSpeedSent__SpeedXAssignment_2 )
            // InternalMyLanguage.g:4957:3: rule__RobotSpeedSent__SpeedXAssignment_2
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
    // InternalMyLanguage.g:4965:1: rule__RobotSpeedSent__Group__3 : rule__RobotSpeedSent__Group__3__Impl rule__RobotSpeedSent__Group__4 ;
    public final void rule__RobotSpeedSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4969:1: ( rule__RobotSpeedSent__Group__3__Impl rule__RobotSpeedSent__Group__4 )
            // InternalMyLanguage.g:4970:2: rule__RobotSpeedSent__Group__3__Impl rule__RobotSpeedSent__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:4977:1: rule__RobotSpeedSent__Group__3__Impl : ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) ) ;
    public final void rule__RobotSpeedSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4981:1: ( ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) ) )
            // InternalMyLanguage.g:4982:1: ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) )
            {
            // InternalMyLanguage.g:4982:1: ( ( rule__RobotSpeedSent__SpeedYAssignment_3 ) )
            // InternalMyLanguage.g:4983:2: ( rule__RobotSpeedSent__SpeedYAssignment_3 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedYAssignment_3()); 
            // InternalMyLanguage.g:4984:2: ( rule__RobotSpeedSent__SpeedYAssignment_3 )
            // InternalMyLanguage.g:4984:3: rule__RobotSpeedSent__SpeedYAssignment_3
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
    // InternalMyLanguage.g:4992:1: rule__RobotSpeedSent__Group__4 : rule__RobotSpeedSent__Group__4__Impl ;
    public final void rule__RobotSpeedSent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:4996:1: ( rule__RobotSpeedSent__Group__4__Impl )
            // InternalMyLanguage.g:4997:2: rule__RobotSpeedSent__Group__4__Impl
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
    // InternalMyLanguage.g:5003:1: rule__RobotSpeedSent__Group__4__Impl : ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) ) ;
    public final void rule__RobotSpeedSent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5007:1: ( ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) ) )
            // InternalMyLanguage.g:5008:1: ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) )
            {
            // InternalMyLanguage.g:5008:1: ( ( rule__RobotSpeedSent__SpeedZAssignment_4 ) )
            // InternalMyLanguage.g:5009:2: ( rule__RobotSpeedSent__SpeedZAssignment_4 )
            {
             before(grammarAccess.getRobotSpeedSentAccess().getSpeedZAssignment_4()); 
            // InternalMyLanguage.g:5010:2: ( rule__RobotSpeedSent__SpeedZAssignment_4 )
            // InternalMyLanguage.g:5010:3: rule__RobotSpeedSent__SpeedZAssignment_4
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
    // InternalMyLanguage.g:5019:1: rule__EnvironmentSent__Group__0 : rule__EnvironmentSent__Group__0__Impl rule__EnvironmentSent__Group__1 ;
    public final void rule__EnvironmentSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5023:1: ( rule__EnvironmentSent__Group__0__Impl rule__EnvironmentSent__Group__1 )
            // InternalMyLanguage.g:5024:2: rule__EnvironmentSent__Group__0__Impl rule__EnvironmentSent__Group__1
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
    // InternalMyLanguage.g:5031:1: rule__EnvironmentSent__Group__0__Impl : ( 'Environment' ) ;
    public final void rule__EnvironmentSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5035:1: ( ( 'Environment' ) )
            // InternalMyLanguage.g:5036:1: ( 'Environment' )
            {
            // InternalMyLanguage.g:5036:1: ( 'Environment' )
            // InternalMyLanguage.g:5037:2: 'Environment'
            {
             before(grammarAccess.getEnvironmentSentAccess().getEnvironmentKeyword_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMyLanguage.g:5046:1: rule__EnvironmentSent__Group__1 : rule__EnvironmentSent__Group__1__Impl rule__EnvironmentSent__Group__2 ;
    public final void rule__EnvironmentSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5050:1: ( rule__EnvironmentSent__Group__1__Impl rule__EnvironmentSent__Group__2 )
            // InternalMyLanguage.g:5051:2: rule__EnvironmentSent__Group__1__Impl rule__EnvironmentSent__Group__2
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
    // InternalMyLanguage.g:5058:1: rule__EnvironmentSent__Group__1__Impl : ( 'windspeed' ) ;
    public final void rule__EnvironmentSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5062:1: ( ( 'windspeed' ) )
            // InternalMyLanguage.g:5063:1: ( 'windspeed' )
            {
            // InternalMyLanguage.g:5063:1: ( 'windspeed' )
            // InternalMyLanguage.g:5064:2: 'windspeed'
            {
             before(grammarAccess.getEnvironmentSentAccess().getWindspeedKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMyLanguage.g:5073:1: rule__EnvironmentSent__Group__2 : rule__EnvironmentSent__Group__2__Impl rule__EnvironmentSent__Group__3 ;
    public final void rule__EnvironmentSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5077:1: ( rule__EnvironmentSent__Group__2__Impl rule__EnvironmentSent__Group__3 )
            // InternalMyLanguage.g:5078:2: rule__EnvironmentSent__Group__2__Impl rule__EnvironmentSent__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyLanguage.g:5085:1: rule__EnvironmentSent__Group__2__Impl : ( 'is' ) ;
    public final void rule__EnvironmentSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5089:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5090:1: ( 'is' )
            {
            // InternalMyLanguage.g:5090:1: ( 'is' )
            // InternalMyLanguage.g:5091:2: 'is'
            {
             before(grammarAccess.getEnvironmentSentAccess().getIsKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:5100:1: rule__EnvironmentSent__Group__3 : rule__EnvironmentSent__Group__3__Impl ;
    public final void rule__EnvironmentSent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5104:1: ( rule__EnvironmentSent__Group__3__Impl )
            // InternalMyLanguage.g:5105:2: rule__EnvironmentSent__Group__3__Impl
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
    // InternalMyLanguage.g:5111:1: rule__EnvironmentSent__Group__3__Impl : ( ( rule__EnvironmentSent__BodyAssignment_3 ) ) ;
    public final void rule__EnvironmentSent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5115:1: ( ( ( rule__EnvironmentSent__BodyAssignment_3 ) ) )
            // InternalMyLanguage.g:5116:1: ( ( rule__EnvironmentSent__BodyAssignment_3 ) )
            {
            // InternalMyLanguage.g:5116:1: ( ( rule__EnvironmentSent__BodyAssignment_3 ) )
            // InternalMyLanguage.g:5117:2: ( rule__EnvironmentSent__BodyAssignment_3 )
            {
             before(grammarAccess.getEnvironmentSentAccess().getBodyAssignment_3()); 
            // InternalMyLanguage.g:5118:2: ( rule__EnvironmentSent__BodyAssignment_3 )
            // InternalMyLanguage.g:5118:3: rule__EnvironmentSent__BodyAssignment_3
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
    // InternalMyLanguage.g:5127:1: rule__FailingComponentSent__Group__0 : rule__FailingComponentSent__Group__0__Impl rule__FailingComponentSent__Group__1 ;
    public final void rule__FailingComponentSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5131:1: ( rule__FailingComponentSent__Group__0__Impl rule__FailingComponentSent__Group__1 )
            // InternalMyLanguage.g:5132:2: rule__FailingComponentSent__Group__0__Impl rule__FailingComponentSent__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyLanguage.g:5139:1: rule__FailingComponentSent__Group__0__Impl : ( ( rule__FailingComponentSent__ComponentAssignment_0 ) ) ;
    public final void rule__FailingComponentSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5143:1: ( ( ( rule__FailingComponentSent__ComponentAssignment_0 ) ) )
            // InternalMyLanguage.g:5144:1: ( ( rule__FailingComponentSent__ComponentAssignment_0 ) )
            {
            // InternalMyLanguage.g:5144:1: ( ( rule__FailingComponentSent__ComponentAssignment_0 ) )
            // InternalMyLanguage.g:5145:2: ( rule__FailingComponentSent__ComponentAssignment_0 )
            {
             before(grammarAccess.getFailingComponentSentAccess().getComponentAssignment_0()); 
            // InternalMyLanguage.g:5146:2: ( rule__FailingComponentSent__ComponentAssignment_0 )
            // InternalMyLanguage.g:5146:3: rule__FailingComponentSent__ComponentAssignment_0
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
    // InternalMyLanguage.g:5154:1: rule__FailingComponentSent__Group__1 : rule__FailingComponentSent__Group__1__Impl ;
    public final void rule__FailingComponentSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5158:1: ( rule__FailingComponentSent__Group__1__Impl )
            // InternalMyLanguage.g:5159:2: rule__FailingComponentSent__Group__1__Impl
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
    // InternalMyLanguage.g:5165:1: rule__FailingComponentSent__Group__1__Impl : ( 'fails' ) ;
    public final void rule__FailingComponentSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5169:1: ( ( 'fails' ) )
            // InternalMyLanguage.g:5170:1: ( 'fails' )
            {
            // InternalMyLanguage.g:5170:1: ( 'fails' )
            // InternalMyLanguage.g:5171:2: 'fails'
            {
             before(grammarAccess.getFailingComponentSentAccess().getFailsKeyword_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalMyLanguage.g:5181:1: rule__RiskSent__Group__0 : rule__RiskSent__Group__0__Impl rule__RiskSent__Group__1 ;
    public final void rule__RiskSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5185:1: ( rule__RiskSent__Group__0__Impl rule__RiskSent__Group__1 )
            // InternalMyLanguage.g:5186:2: rule__RiskSent__Group__0__Impl rule__RiskSent__Group__1
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
    // InternalMyLanguage.g:5193:1: rule__RiskSent__Group__0__Impl : ( 'collisionrisk' ) ;
    public final void rule__RiskSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5197:1: ( ( 'collisionrisk' ) )
            // InternalMyLanguage.g:5198:1: ( 'collisionrisk' )
            {
            // InternalMyLanguage.g:5198:1: ( 'collisionrisk' )
            // InternalMyLanguage.g:5199:2: 'collisionrisk'
            {
             before(grammarAccess.getRiskSentAccess().getCollisionriskKeyword_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalMyLanguage.g:5208:1: rule__RiskSent__Group__1 : rule__RiskSent__Group__1__Impl rule__RiskSent__Group__2 ;
    public final void rule__RiskSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5212:1: ( rule__RiskSent__Group__1__Impl rule__RiskSent__Group__2 )
            // InternalMyLanguage.g:5213:2: rule__RiskSent__Group__1__Impl rule__RiskSent__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyLanguage.g:5220:1: rule__RiskSent__Group__1__Impl : ( 'is' ) ;
    public final void rule__RiskSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5224:1: ( ( 'is' ) )
            // InternalMyLanguage.g:5225:1: ( 'is' )
            {
            // InternalMyLanguage.g:5225:1: ( 'is' )
            // InternalMyLanguage.g:5226:2: 'is'
            {
             before(grammarAccess.getRiskSentAccess().getIsKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyLanguage.g:5235:1: rule__RiskSent__Group__2 : rule__RiskSent__Group__2__Impl ;
    public final void rule__RiskSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5239:1: ( rule__RiskSent__Group__2__Impl )
            // InternalMyLanguage.g:5240:2: rule__RiskSent__Group__2__Impl
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
    // InternalMyLanguage.g:5246:1: rule__RiskSent__Group__2__Impl : ( ( rule__RiskSent__LevelAssignment_2 ) ) ;
    public final void rule__RiskSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5250:1: ( ( ( rule__RiskSent__LevelAssignment_2 ) ) )
            // InternalMyLanguage.g:5251:1: ( ( rule__RiskSent__LevelAssignment_2 ) )
            {
            // InternalMyLanguage.g:5251:1: ( ( rule__RiskSent__LevelAssignment_2 ) )
            // InternalMyLanguage.g:5252:2: ( rule__RiskSent__LevelAssignment_2 )
            {
             before(grammarAccess.getRiskSentAccess().getLevelAssignment_2()); 
            // InternalMyLanguage.g:5253:2: ( rule__RiskSent__LevelAssignment_2 )
            // InternalMyLanguage.g:5253:3: rule__RiskSent__LevelAssignment_2
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
    // InternalMyLanguage.g:5262:1: rule__ToleranceSent__Group__0 : rule__ToleranceSent__Group__0__Impl rule__ToleranceSent__Group__1 ;
    public final void rule__ToleranceSent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5266:1: ( rule__ToleranceSent__Group__0__Impl rule__ToleranceSent__Group__1 )
            // InternalMyLanguage.g:5267:2: rule__ToleranceSent__Group__0__Impl rule__ToleranceSent__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyLanguage.g:5274:1: rule__ToleranceSent__Group__0__Impl : ( 'with' ) ;
    public final void rule__ToleranceSent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5278:1: ( ( 'with' ) )
            // InternalMyLanguage.g:5279:1: ( 'with' )
            {
            // InternalMyLanguage.g:5279:1: ( 'with' )
            // InternalMyLanguage.g:5280:2: 'with'
            {
             before(grammarAccess.getToleranceSentAccess().getWithKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyLanguage.g:5289:1: rule__ToleranceSent__Group__1 : rule__ToleranceSent__Group__1__Impl rule__ToleranceSent__Group__2 ;
    public final void rule__ToleranceSent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5293:1: ( rule__ToleranceSent__Group__1__Impl rule__ToleranceSent__Group__2 )
            // InternalMyLanguage.g:5294:2: rule__ToleranceSent__Group__1__Impl rule__ToleranceSent__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyLanguage.g:5301:1: rule__ToleranceSent__Group__1__Impl : ( 'tolerance' ) ;
    public final void rule__ToleranceSent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5305:1: ( ( 'tolerance' ) )
            // InternalMyLanguage.g:5306:1: ( 'tolerance' )
            {
            // InternalMyLanguage.g:5306:1: ( 'tolerance' )
            // InternalMyLanguage.g:5307:2: 'tolerance'
            {
             before(grammarAccess.getToleranceSentAccess().getToleranceKeyword_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalMyLanguage.g:5316:1: rule__ToleranceSent__Group__2 : rule__ToleranceSent__Group__2__Impl ;
    public final void rule__ToleranceSent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5320:1: ( rule__ToleranceSent__Group__2__Impl )
            // InternalMyLanguage.g:5321:2: rule__ToleranceSent__Group__2__Impl
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
    // InternalMyLanguage.g:5327:1: rule__ToleranceSent__Group__2__Impl : ( ( rule__ToleranceSent__UnitAssignment_2 ) ) ;
    public final void rule__ToleranceSent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5331:1: ( ( ( rule__ToleranceSent__UnitAssignment_2 ) ) )
            // InternalMyLanguage.g:5332:1: ( ( rule__ToleranceSent__UnitAssignment_2 ) )
            {
            // InternalMyLanguage.g:5332:1: ( ( rule__ToleranceSent__UnitAssignment_2 ) )
            // InternalMyLanguage.g:5333:2: ( rule__ToleranceSent__UnitAssignment_2 )
            {
             before(grammarAccess.getToleranceSentAccess().getUnitAssignment_2()); 
            // InternalMyLanguage.g:5334:2: ( rule__ToleranceSent__UnitAssignment_2 )
            // InternalMyLanguage.g:5334:3: rule__ToleranceSent__UnitAssignment_2
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
    // InternalMyLanguage.g:5343:1: rule__SECONDS__Group__0 : rule__SECONDS__Group__0__Impl rule__SECONDS__Group__1 ;
    public final void rule__SECONDS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5347:1: ( rule__SECONDS__Group__0__Impl rule__SECONDS__Group__1 )
            // InternalMyLanguage.g:5348:2: rule__SECONDS__Group__0__Impl rule__SECONDS__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:5355:1: rule__SECONDS__Group__0__Impl : ( 'seconds(' ) ;
    public final void rule__SECONDS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5359:1: ( ( 'seconds(' ) )
            // InternalMyLanguage.g:5360:1: ( 'seconds(' )
            {
            // InternalMyLanguage.g:5360:1: ( 'seconds(' )
            // InternalMyLanguage.g:5361:2: 'seconds('
            {
             before(grammarAccess.getSECONDSAccess().getSecondsKeyword_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalMyLanguage.g:5370:1: rule__SECONDS__Group__1 : rule__SECONDS__Group__1__Impl rule__SECONDS__Group__2 ;
    public final void rule__SECONDS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5374:1: ( rule__SECONDS__Group__1__Impl rule__SECONDS__Group__2 )
            // InternalMyLanguage.g:5375:2: rule__SECONDS__Group__1__Impl rule__SECONDS__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyLanguage.g:5382:1: rule__SECONDS__Group__1__Impl : ( ( rule__SECONDS__ValueAssignment_1 ) ) ;
    public final void rule__SECONDS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5386:1: ( ( ( rule__SECONDS__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5387:1: ( ( rule__SECONDS__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5387:1: ( ( rule__SECONDS__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5388:2: ( rule__SECONDS__ValueAssignment_1 )
            {
             before(grammarAccess.getSECONDSAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5389:2: ( rule__SECONDS__ValueAssignment_1 )
            // InternalMyLanguage.g:5389:3: rule__SECONDS__ValueAssignment_1
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
    // InternalMyLanguage.g:5397:1: rule__SECONDS__Group__2 : rule__SECONDS__Group__2__Impl ;
    public final void rule__SECONDS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5401:1: ( rule__SECONDS__Group__2__Impl )
            // InternalMyLanguage.g:5402:2: rule__SECONDS__Group__2__Impl
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
    // InternalMyLanguage.g:5408:1: rule__SECONDS__Group__2__Impl : ( ')' ) ;
    public final void rule__SECONDS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5412:1: ( ( ')' ) )
            // InternalMyLanguage.g:5413:1: ( ')' )
            {
            // InternalMyLanguage.g:5413:1: ( ')' )
            // InternalMyLanguage.g:5414:2: ')'
            {
             before(grammarAccess.getSECONDSAccess().getRightParenthesisKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyLanguage.g:5424:1: rule__HOUR__Group__0 : rule__HOUR__Group__0__Impl rule__HOUR__Group__1 ;
    public final void rule__HOUR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5428:1: ( rule__HOUR__Group__0__Impl rule__HOUR__Group__1 )
            // InternalMyLanguage.g:5429:2: rule__HOUR__Group__0__Impl rule__HOUR__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:5436:1: rule__HOUR__Group__0__Impl : ( 'hours(' ) ;
    public final void rule__HOUR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5440:1: ( ( 'hours(' ) )
            // InternalMyLanguage.g:5441:1: ( 'hours(' )
            {
            // InternalMyLanguage.g:5441:1: ( 'hours(' )
            // InternalMyLanguage.g:5442:2: 'hours('
            {
             before(grammarAccess.getHOURAccess().getHoursKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalMyLanguage.g:5451:1: rule__HOUR__Group__1 : rule__HOUR__Group__1__Impl rule__HOUR__Group__2 ;
    public final void rule__HOUR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5455:1: ( rule__HOUR__Group__1__Impl rule__HOUR__Group__2 )
            // InternalMyLanguage.g:5456:2: rule__HOUR__Group__1__Impl rule__HOUR__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyLanguage.g:5463:1: rule__HOUR__Group__1__Impl : ( ( rule__HOUR__ValueAssignment_1 ) ) ;
    public final void rule__HOUR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5467:1: ( ( ( rule__HOUR__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5468:1: ( ( rule__HOUR__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5468:1: ( ( rule__HOUR__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5469:2: ( rule__HOUR__ValueAssignment_1 )
            {
             before(grammarAccess.getHOURAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5470:2: ( rule__HOUR__ValueAssignment_1 )
            // InternalMyLanguage.g:5470:3: rule__HOUR__ValueAssignment_1
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
    // InternalMyLanguage.g:5478:1: rule__HOUR__Group__2 : rule__HOUR__Group__2__Impl ;
    public final void rule__HOUR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5482:1: ( rule__HOUR__Group__2__Impl )
            // InternalMyLanguage.g:5483:2: rule__HOUR__Group__2__Impl
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
    // InternalMyLanguage.g:5489:1: rule__HOUR__Group__2__Impl : ( ')' ) ;
    public final void rule__HOUR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5493:1: ( ( ')' ) )
            // InternalMyLanguage.g:5494:1: ( ')' )
            {
            // InternalMyLanguage.g:5494:1: ( ')' )
            // InternalMyLanguage.g:5495:2: ')'
            {
             before(grammarAccess.getHOURAccess().getRightParenthesisKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyLanguage.g:5505:1: rule__MINUTES__Group__0 : rule__MINUTES__Group__0__Impl rule__MINUTES__Group__1 ;
    public final void rule__MINUTES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5509:1: ( rule__MINUTES__Group__0__Impl rule__MINUTES__Group__1 )
            // InternalMyLanguage.g:5510:2: rule__MINUTES__Group__0__Impl rule__MINUTES__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:5517:1: rule__MINUTES__Group__0__Impl : ( 'minutes(' ) ;
    public final void rule__MINUTES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5521:1: ( ( 'minutes(' ) )
            // InternalMyLanguage.g:5522:1: ( 'minutes(' )
            {
            // InternalMyLanguage.g:5522:1: ( 'minutes(' )
            // InternalMyLanguage.g:5523:2: 'minutes('
            {
             before(grammarAccess.getMINUTESAccess().getMinutesKeyword_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyLanguage.g:5532:1: rule__MINUTES__Group__1 : rule__MINUTES__Group__1__Impl rule__MINUTES__Group__2 ;
    public final void rule__MINUTES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5536:1: ( rule__MINUTES__Group__1__Impl rule__MINUTES__Group__2 )
            // InternalMyLanguage.g:5537:2: rule__MINUTES__Group__1__Impl rule__MINUTES__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyLanguage.g:5544:1: rule__MINUTES__Group__1__Impl : ( ( rule__MINUTES__ValueAssignment_1 ) ) ;
    public final void rule__MINUTES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5548:1: ( ( ( rule__MINUTES__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5549:1: ( ( rule__MINUTES__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5549:1: ( ( rule__MINUTES__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5550:2: ( rule__MINUTES__ValueAssignment_1 )
            {
             before(grammarAccess.getMINUTESAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5551:2: ( rule__MINUTES__ValueAssignment_1 )
            // InternalMyLanguage.g:5551:3: rule__MINUTES__ValueAssignment_1
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
    // InternalMyLanguage.g:5559:1: rule__MINUTES__Group__2 : rule__MINUTES__Group__2__Impl ;
    public final void rule__MINUTES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5563:1: ( rule__MINUTES__Group__2__Impl )
            // InternalMyLanguage.g:5564:2: rule__MINUTES__Group__2__Impl
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
    // InternalMyLanguage.g:5570:1: rule__MINUTES__Group__2__Impl : ( ')' ) ;
    public final void rule__MINUTES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5574:1: ( ( ')' ) )
            // InternalMyLanguage.g:5575:1: ( ')' )
            {
            // InternalMyLanguage.g:5575:1: ( ')' )
            // InternalMyLanguage.g:5576:2: ')'
            {
             before(grammarAccess.getMINUTESAccess().getRightParenthesisKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyLanguage.g:5586:1: rule__METER__Group__0 : rule__METER__Group__0__Impl rule__METER__Group__1 ;
    public final void rule__METER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5590:1: ( rule__METER__Group__0__Impl rule__METER__Group__1 )
            // InternalMyLanguage.g:5591:2: rule__METER__Group__0__Impl rule__METER__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:5598:1: rule__METER__Group__0__Impl : ( 'meter(' ) ;
    public final void rule__METER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5602:1: ( ( 'meter(' ) )
            // InternalMyLanguage.g:5603:1: ( 'meter(' )
            {
            // InternalMyLanguage.g:5603:1: ( 'meter(' )
            // InternalMyLanguage.g:5604:2: 'meter('
            {
             before(grammarAccess.getMETERAccess().getMeterKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalMyLanguage.g:5613:1: rule__METER__Group__1 : rule__METER__Group__1__Impl rule__METER__Group__2 ;
    public final void rule__METER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5617:1: ( rule__METER__Group__1__Impl rule__METER__Group__2 )
            // InternalMyLanguage.g:5618:2: rule__METER__Group__1__Impl rule__METER__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyLanguage.g:5625:1: rule__METER__Group__1__Impl : ( ( rule__METER__ValueAssignment_1 ) ) ;
    public final void rule__METER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5629:1: ( ( ( rule__METER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5630:1: ( ( rule__METER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5630:1: ( ( rule__METER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5631:2: ( rule__METER__ValueAssignment_1 )
            {
             before(grammarAccess.getMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5632:2: ( rule__METER__ValueAssignment_1 )
            // InternalMyLanguage.g:5632:3: rule__METER__ValueAssignment_1
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
    // InternalMyLanguage.g:5640:1: rule__METER__Group__2 : rule__METER__Group__2__Impl ;
    public final void rule__METER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5644:1: ( rule__METER__Group__2__Impl )
            // InternalMyLanguage.g:5645:2: rule__METER__Group__2__Impl
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
    // InternalMyLanguage.g:5651:1: rule__METER__Group__2__Impl : ( ')' ) ;
    public final void rule__METER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5655:1: ( ( ')' ) )
            // InternalMyLanguage.g:5656:1: ( ')' )
            {
            // InternalMyLanguage.g:5656:1: ( ')' )
            // InternalMyLanguage.g:5657:2: ')'
            {
             before(grammarAccess.getMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyLanguage.g:5667:1: rule__CENTIMETER__Group__0 : rule__CENTIMETER__Group__0__Impl rule__CENTIMETER__Group__1 ;
    public final void rule__CENTIMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5671:1: ( rule__CENTIMETER__Group__0__Impl rule__CENTIMETER__Group__1 )
            // InternalMyLanguage.g:5672:2: rule__CENTIMETER__Group__0__Impl rule__CENTIMETER__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:5679:1: rule__CENTIMETER__Group__0__Impl : ( 'centimeter(' ) ;
    public final void rule__CENTIMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5683:1: ( ( 'centimeter(' ) )
            // InternalMyLanguage.g:5684:1: ( 'centimeter(' )
            {
            // InternalMyLanguage.g:5684:1: ( 'centimeter(' )
            // InternalMyLanguage.g:5685:2: 'centimeter('
            {
             before(grammarAccess.getCENTIMETERAccess().getCentimeterKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalMyLanguage.g:5694:1: rule__CENTIMETER__Group__1 : rule__CENTIMETER__Group__1__Impl rule__CENTIMETER__Group__2 ;
    public final void rule__CENTIMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5698:1: ( rule__CENTIMETER__Group__1__Impl rule__CENTIMETER__Group__2 )
            // InternalMyLanguage.g:5699:2: rule__CENTIMETER__Group__1__Impl rule__CENTIMETER__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyLanguage.g:5706:1: rule__CENTIMETER__Group__1__Impl : ( ( rule__CENTIMETER__ValueAssignment_1 ) ) ;
    public final void rule__CENTIMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5710:1: ( ( ( rule__CENTIMETER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5711:1: ( ( rule__CENTIMETER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5711:1: ( ( rule__CENTIMETER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5712:2: ( rule__CENTIMETER__ValueAssignment_1 )
            {
             before(grammarAccess.getCENTIMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5713:2: ( rule__CENTIMETER__ValueAssignment_1 )
            // InternalMyLanguage.g:5713:3: rule__CENTIMETER__ValueAssignment_1
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
    // InternalMyLanguage.g:5721:1: rule__CENTIMETER__Group__2 : rule__CENTIMETER__Group__2__Impl ;
    public final void rule__CENTIMETER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5725:1: ( rule__CENTIMETER__Group__2__Impl )
            // InternalMyLanguage.g:5726:2: rule__CENTIMETER__Group__2__Impl
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
    // InternalMyLanguage.g:5732:1: rule__CENTIMETER__Group__2__Impl : ( ')' ) ;
    public final void rule__CENTIMETER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5736:1: ( ( ')' ) )
            // InternalMyLanguage.g:5737:1: ( ')' )
            {
            // InternalMyLanguage.g:5737:1: ( ')' )
            // InternalMyLanguage.g:5738:2: ')'
            {
             before(grammarAccess.getCENTIMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyLanguage.g:5748:1: rule__MILLIMETER__Group__0 : rule__MILLIMETER__Group__0__Impl rule__MILLIMETER__Group__1 ;
    public final void rule__MILLIMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5752:1: ( rule__MILLIMETER__Group__0__Impl rule__MILLIMETER__Group__1 )
            // InternalMyLanguage.g:5753:2: rule__MILLIMETER__Group__0__Impl rule__MILLIMETER__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:5760:1: rule__MILLIMETER__Group__0__Impl : ( 'millimeter(' ) ;
    public final void rule__MILLIMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5764:1: ( ( 'millimeter(' ) )
            // InternalMyLanguage.g:5765:1: ( 'millimeter(' )
            {
            // InternalMyLanguage.g:5765:1: ( 'millimeter(' )
            // InternalMyLanguage.g:5766:2: 'millimeter('
            {
             before(grammarAccess.getMILLIMETERAccess().getMillimeterKeyword_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalMyLanguage.g:5775:1: rule__MILLIMETER__Group__1 : rule__MILLIMETER__Group__1__Impl rule__MILLIMETER__Group__2 ;
    public final void rule__MILLIMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5779:1: ( rule__MILLIMETER__Group__1__Impl rule__MILLIMETER__Group__2 )
            // InternalMyLanguage.g:5780:2: rule__MILLIMETER__Group__1__Impl rule__MILLIMETER__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyLanguage.g:5787:1: rule__MILLIMETER__Group__1__Impl : ( ( rule__MILLIMETER__ValueAssignment_1 ) ) ;
    public final void rule__MILLIMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5791:1: ( ( ( rule__MILLIMETER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5792:1: ( ( rule__MILLIMETER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5792:1: ( ( rule__MILLIMETER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5793:2: ( rule__MILLIMETER__ValueAssignment_1 )
            {
             before(grammarAccess.getMILLIMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5794:2: ( rule__MILLIMETER__ValueAssignment_1 )
            // InternalMyLanguage.g:5794:3: rule__MILLIMETER__ValueAssignment_1
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
    // InternalMyLanguage.g:5802:1: rule__MILLIMETER__Group__2 : rule__MILLIMETER__Group__2__Impl ;
    public final void rule__MILLIMETER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5806:1: ( rule__MILLIMETER__Group__2__Impl )
            // InternalMyLanguage.g:5807:2: rule__MILLIMETER__Group__2__Impl
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
    // InternalMyLanguage.g:5813:1: rule__MILLIMETER__Group__2__Impl : ( ')' ) ;
    public final void rule__MILLIMETER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5817:1: ( ( ')' ) )
            // InternalMyLanguage.g:5818:1: ( ')' )
            {
            // InternalMyLanguage.g:5818:1: ( ')' )
            // InternalMyLanguage.g:5819:2: ')'
            {
             before(grammarAccess.getMILLIMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyLanguage.g:5829:1: rule__KILOMETER__Group__0 : rule__KILOMETER__Group__0__Impl rule__KILOMETER__Group__1 ;
    public final void rule__KILOMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5833:1: ( rule__KILOMETER__Group__0__Impl rule__KILOMETER__Group__1 )
            // InternalMyLanguage.g:5834:2: rule__KILOMETER__Group__0__Impl rule__KILOMETER__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:5841:1: rule__KILOMETER__Group__0__Impl : ( 'kilometer(' ) ;
    public final void rule__KILOMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5845:1: ( ( 'kilometer(' ) )
            // InternalMyLanguage.g:5846:1: ( 'kilometer(' )
            {
            // InternalMyLanguage.g:5846:1: ( 'kilometer(' )
            // InternalMyLanguage.g:5847:2: 'kilometer('
            {
             before(grammarAccess.getKILOMETERAccess().getKilometerKeyword_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalMyLanguage.g:5856:1: rule__KILOMETER__Group__1 : rule__KILOMETER__Group__1__Impl rule__KILOMETER__Group__2 ;
    public final void rule__KILOMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5860:1: ( rule__KILOMETER__Group__1__Impl rule__KILOMETER__Group__2 )
            // InternalMyLanguage.g:5861:2: rule__KILOMETER__Group__1__Impl rule__KILOMETER__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyLanguage.g:5868:1: rule__KILOMETER__Group__1__Impl : ( ( rule__KILOMETER__ValueAssignment_1 ) ) ;
    public final void rule__KILOMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5872:1: ( ( ( rule__KILOMETER__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5873:1: ( ( rule__KILOMETER__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5873:1: ( ( rule__KILOMETER__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5874:2: ( rule__KILOMETER__ValueAssignment_1 )
            {
             before(grammarAccess.getKILOMETERAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5875:2: ( rule__KILOMETER__ValueAssignment_1 )
            // InternalMyLanguage.g:5875:3: rule__KILOMETER__ValueAssignment_1
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
    // InternalMyLanguage.g:5883:1: rule__KILOMETER__Group__2 : rule__KILOMETER__Group__2__Impl ;
    public final void rule__KILOMETER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5887:1: ( rule__KILOMETER__Group__2__Impl )
            // InternalMyLanguage.g:5888:2: rule__KILOMETER__Group__2__Impl
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
    // InternalMyLanguage.g:5894:1: rule__KILOMETER__Group__2__Impl : ( ')' ) ;
    public final void rule__KILOMETER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5898:1: ( ( ')' ) )
            // InternalMyLanguage.g:5899:1: ( ')' )
            {
            // InternalMyLanguage.g:5899:1: ( ')' )
            // InternalMyLanguage.g:5900:2: ')'
            {
             before(grammarAccess.getKILOMETERAccess().getRightParenthesisKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyLanguage.g:5910:1: rule__PercentUnit__Group__0 : rule__PercentUnit__Group__0__Impl rule__PercentUnit__Group__1 ;
    public final void rule__PercentUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5914:1: ( rule__PercentUnit__Group__0__Impl rule__PercentUnit__Group__1 )
            // InternalMyLanguage.g:5915:2: rule__PercentUnit__Group__0__Impl rule__PercentUnit__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:5922:1: rule__PercentUnit__Group__0__Impl : ( 'percent(' ) ;
    public final void rule__PercentUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5926:1: ( ( 'percent(' ) )
            // InternalMyLanguage.g:5927:1: ( 'percent(' )
            {
            // InternalMyLanguage.g:5927:1: ( 'percent(' )
            // InternalMyLanguage.g:5928:2: 'percent('
            {
             before(grammarAccess.getPercentUnitAccess().getPercentKeyword_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalMyLanguage.g:5937:1: rule__PercentUnit__Group__1 : rule__PercentUnit__Group__1__Impl rule__PercentUnit__Group__2 ;
    public final void rule__PercentUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5941:1: ( rule__PercentUnit__Group__1__Impl rule__PercentUnit__Group__2 )
            // InternalMyLanguage.g:5942:2: rule__PercentUnit__Group__1__Impl rule__PercentUnit__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyLanguage.g:5949:1: rule__PercentUnit__Group__1__Impl : ( ( rule__PercentUnit__ValueAssignment_1 ) ) ;
    public final void rule__PercentUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5953:1: ( ( ( rule__PercentUnit__ValueAssignment_1 ) ) )
            // InternalMyLanguage.g:5954:1: ( ( rule__PercentUnit__ValueAssignment_1 ) )
            {
            // InternalMyLanguage.g:5954:1: ( ( rule__PercentUnit__ValueAssignment_1 ) )
            // InternalMyLanguage.g:5955:2: ( rule__PercentUnit__ValueAssignment_1 )
            {
             before(grammarAccess.getPercentUnitAccess().getValueAssignment_1()); 
            // InternalMyLanguage.g:5956:2: ( rule__PercentUnit__ValueAssignment_1 )
            // InternalMyLanguage.g:5956:3: rule__PercentUnit__ValueAssignment_1
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
    // InternalMyLanguage.g:5964:1: rule__PercentUnit__Group__2 : rule__PercentUnit__Group__2__Impl ;
    public final void rule__PercentUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5968:1: ( rule__PercentUnit__Group__2__Impl )
            // InternalMyLanguage.g:5969:2: rule__PercentUnit__Group__2__Impl
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
    // InternalMyLanguage.g:5975:1: rule__PercentUnit__Group__2__Impl : ( ')' ) ;
    public final void rule__PercentUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5979:1: ( ( ')' ) )
            // InternalMyLanguage.g:5980:1: ( ')' )
            {
            // InternalMyLanguage.g:5980:1: ( ')' )
            // InternalMyLanguage.g:5981:2: ')'
            {
             before(grammarAccess.getPercentUnitAccess().getRightParenthesisKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyLanguage.g:5991:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:5995:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalMyLanguage.g:5996:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyLanguage.g:6003:1: rule__DOUBLE__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6007:1: ( ( ( '-' )? ) )
            // InternalMyLanguage.g:6008:1: ( ( '-' )? )
            {
            // InternalMyLanguage.g:6008:1: ( ( '-' )? )
            // InternalMyLanguage.g:6009:2: ( '-' )?
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
            // InternalMyLanguage.g:6010:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==84) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyLanguage.g:6010:3: '-'
                    {
                    match(input,84,FOLLOW_2); 

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
    // InternalMyLanguage.g:6018:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6022:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalMyLanguage.g:6023:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyLanguage.g:6030:1: rule__DOUBLE__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6034:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6035:1: ( RULE_INT )
            {
            // InternalMyLanguage.g:6035:1: ( RULE_INT )
            // InternalMyLanguage.g:6036:2: RULE_INT
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
    // InternalMyLanguage.g:6045:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6049:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalMyLanguage.g:6050:2: rule__DOUBLE__Group__2__Impl
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
    // InternalMyLanguage.g:6056:1: rule__DOUBLE__Group__2__Impl : ( ( rule__DOUBLE__Group_2__0 )? ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6060:1: ( ( ( rule__DOUBLE__Group_2__0 )? ) )
            // InternalMyLanguage.g:6061:1: ( ( rule__DOUBLE__Group_2__0 )? )
            {
            // InternalMyLanguage.g:6061:1: ( ( rule__DOUBLE__Group_2__0 )? )
            // InternalMyLanguage.g:6062:2: ( rule__DOUBLE__Group_2__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_2()); 
            // InternalMyLanguage.g:6063:2: ( rule__DOUBLE__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==85) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyLanguage.g:6063:3: rule__DOUBLE__Group_2__0
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
    // InternalMyLanguage.g:6072:1: rule__DOUBLE__Group_2__0 : rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 ;
    public final void rule__DOUBLE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6076:1: ( rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 )
            // InternalMyLanguage.g:6077:2: rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyLanguage.g:6084:1: rule__DOUBLE__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6088:1: ( ( '.' ) )
            // InternalMyLanguage.g:6089:1: ( '.' )
            {
            // InternalMyLanguage.g:6089:1: ( '.' )
            // InternalMyLanguage.g:6090:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalMyLanguage.g:6099:1: rule__DOUBLE__Group_2__1 : rule__DOUBLE__Group_2__1__Impl ;
    public final void rule__DOUBLE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6103:1: ( rule__DOUBLE__Group_2__1__Impl )
            // InternalMyLanguage.g:6104:2: rule__DOUBLE__Group_2__1__Impl
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
    // InternalMyLanguage.g:6110:1: rule__DOUBLE__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6114:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6115:1: ( RULE_INT )
            {
            // InternalMyLanguage.g:6115:1: ( RULE_INT )
            // InternalMyLanguage.g:6116:2: RULE_INT
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
    // InternalMyLanguage.g:6126:1: rule__TestFile__TestsAssignment : ( ruleTest ) ;
    public final void rule__TestFile__TestsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6130:1: ( ( ruleTest ) )
            // InternalMyLanguage.g:6131:2: ( ruleTest )
            {
            // InternalMyLanguage.g:6131:2: ( ruleTest )
            // InternalMyLanguage.g:6132:3: ruleTest
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
    // InternalMyLanguage.g:6141:1: rule__Test__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6145:1: ( ( RULE_ID ) )
            // InternalMyLanguage.g:6146:2: ( RULE_ID )
            {
            // InternalMyLanguage.g:6146:2: ( RULE_ID )
            // InternalMyLanguage.g:6147:3: RULE_ID
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
    // InternalMyLanguage.g:6156:1: rule__Test__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Test__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6160:1: ( ( RULE_STRING ) )
            // InternalMyLanguage.g:6161:2: ( RULE_STRING )
            {
            // InternalMyLanguage.g:6161:2: ( RULE_STRING )
            // InternalMyLanguage.g:6162:3: RULE_STRING
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
    // InternalMyLanguage.g:6171:1: rule__Test__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Test__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6175:1: ( ( ruleStatement ) )
            // InternalMyLanguage.g:6176:2: ( ruleStatement )
            {
            // InternalMyLanguage.g:6176:2: ( ruleStatement )
            // InternalMyLanguage.g:6177:3: ruleStatement
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
    // InternalMyLanguage.g:6186:1: rule__Given__BodyAssignment_1 : ( ruleStatementBody ) ;
    public final void rule__Given__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6190:1: ( ( ruleStatementBody ) )
            // InternalMyLanguage.g:6191:2: ( ruleStatementBody )
            {
            // InternalMyLanguage.g:6191:2: ( ruleStatementBody )
            // InternalMyLanguage.g:6192:3: ruleStatementBody
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
    // InternalMyLanguage.g:6201:1: rule__Then__BodyAssignment_1 : ( ruleStatementBody ) ;
    public final void rule__Then__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6205:1: ( ( ruleStatementBody ) )
            // InternalMyLanguage.g:6206:2: ( ruleStatementBody )
            {
            // InternalMyLanguage.g:6206:2: ( ruleStatementBody )
            // InternalMyLanguage.g:6207:3: ruleStatementBody
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
    // InternalMyLanguage.g:6216:1: rule__When__BodyAssignment_1 : ( ruleStatementBody ) ;
    public final void rule__When__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6220:1: ( ( ruleStatementBody ) )
            // InternalMyLanguage.g:6221:2: ( ruleStatementBody )
            {
            // InternalMyLanguage.g:6221:2: ( ruleStatementBody )
            // InternalMyLanguage.g:6222:3: ruleStatementBody
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


    // $ANTLR start "rule__NotificationSent__NotAssignment_0"
    // InternalMyLanguage.g:6231:1: rule__NotificationSent__NotAssignment_0 : ( ( 'Notification' ) ) ;
    public final void rule__NotificationSent__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6235:1: ( ( ( 'Notification' ) ) )
            // InternalMyLanguage.g:6236:2: ( ( 'Notification' ) )
            {
            // InternalMyLanguage.g:6236:2: ( ( 'Notification' ) )
            // InternalMyLanguage.g:6237:3: ( 'Notification' )
            {
             before(grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0()); 
            // InternalMyLanguage.g:6238:3: ( 'Notification' )
            // InternalMyLanguage.g:6239:4: 'Notification'
            {
             before(grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalMyLanguage.g:6250:1: rule__TimeInterval__FirstAssignment_3 : ( ruleTimeUnit ) ;
    public final void rule__TimeInterval__FirstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6254:1: ( ( ruleTimeUnit ) )
            // InternalMyLanguage.g:6255:2: ( ruleTimeUnit )
            {
            // InternalMyLanguage.g:6255:2: ( ruleTimeUnit )
            // InternalMyLanguage.g:6256:3: ruleTimeUnit
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
    // InternalMyLanguage.g:6265:1: rule__TimeInterval__SecondAssignment_5 : ( ruleTimeUnit ) ;
    public final void rule__TimeInterval__SecondAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6269:1: ( ( ruleTimeUnit ) )
            // InternalMyLanguage.g:6270:2: ( ruleTimeUnit )
            {
            // InternalMyLanguage.g:6270:2: ( ruleTimeUnit )
            // InternalMyLanguage.g:6271:3: ruleTimeUnit
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
    // InternalMyLanguage.g:6280:1: rule__BatterySent__SentAssignment_3 : ( ( rule__BatterySent__SentAlternatives_3_0 ) ) ;
    public final void rule__BatterySent__SentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6284:1: ( ( ( rule__BatterySent__SentAlternatives_3_0 ) ) )
            // InternalMyLanguage.g:6285:2: ( ( rule__BatterySent__SentAlternatives_3_0 ) )
            {
            // InternalMyLanguage.g:6285:2: ( ( rule__BatterySent__SentAlternatives_3_0 ) )
            // InternalMyLanguage.g:6286:3: ( rule__BatterySent__SentAlternatives_3_0 )
            {
             before(grammarAccess.getBatterySentAccess().getSentAlternatives_3_0()); 
            // InternalMyLanguage.g:6287:3: ( rule__BatterySent__SentAlternatives_3_0 )
            // InternalMyLanguage.g:6287:4: rule__BatterySent__SentAlternatives_3_0
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
    // InternalMyLanguage.g:6295:1: rule__PeoplePosSent__PosXAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__PeoplePosSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6299:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6300:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6300:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6301:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6310:1: rule__PeoplePosSent__PosYAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__PeoplePosSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6314:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6315:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6315:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6316:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6325:1: rule__PeoplePosSent__PosZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__PeoplePosSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6329:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6330:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6330:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6331:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6340:1: rule__PeoplePosSent__ToleranceAssignment_5 : ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) ) ;
    public final void rule__PeoplePosSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6344:1: ( ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) ) )
            // InternalMyLanguage.g:6345:2: ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) )
            {
            // InternalMyLanguage.g:6345:2: ( ( rule__PeoplePosSent__ToleranceAlternatives_5_0 ) )
            // InternalMyLanguage.g:6346:3: ( rule__PeoplePosSent__ToleranceAlternatives_5_0 )
            {
             before(grammarAccess.getPeoplePosSentAccess().getToleranceAlternatives_5_0()); 
            // InternalMyLanguage.g:6347:3: ( rule__PeoplePosSent__ToleranceAlternatives_5_0 )
            // InternalMyLanguage.g:6347:4: rule__PeoplePosSent__ToleranceAlternatives_5_0
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
    // InternalMyLanguage.g:6355:1: rule__PeopleNumbSent__AmountAssignment_2 : ( RULE_INT ) ;
    public final void rule__PeopleNumbSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6359:1: ( ( RULE_INT ) )
            // InternalMyLanguage.g:6360:2: ( RULE_INT )
            {
            // InternalMyLanguage.g:6360:2: ( RULE_INT )
            // InternalMyLanguage.g:6361:3: RULE_INT
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
    // InternalMyLanguage.g:6370:1: rule__MissionGoalSent__PosXAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__MissionGoalSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6374:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6375:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6375:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6376:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6385:1: rule__MissionGoalSent__PosYAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__MissionGoalSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6389:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6390:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6390:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6391:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6400:1: rule__MissionGoalSent__PosZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__MissionGoalSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6404:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6405:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6405:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6406:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6415:1: rule__MissionRiskLevelSent__RisklevelAssignment_2 : ( ruleMISSIONRISKLEVEL ) ;
    public final void rule__MissionRiskLevelSent__RisklevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6419:1: ( ( ruleMISSIONRISKLEVEL ) )
            // InternalMyLanguage.g:6420:2: ( ruleMISSIONRISKLEVEL )
            {
            // InternalMyLanguage.g:6420:2: ( ruleMISSIONRISKLEVEL )
            // InternalMyLanguage.g:6421:3: ruleMISSIONRISKLEVEL
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
    // InternalMyLanguage.g:6430:1: rule__MissionStatusSent__StateAssignment_2 : ( ruleMISSIONSTATUS ) ;
    public final void rule__MissionStatusSent__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6434:1: ( ( ruleMISSIONSTATUS ) )
            // InternalMyLanguage.g:6435:2: ( ruleMISSIONSTATUS )
            {
            // InternalMyLanguage.g:6435:2: ( ruleMISSIONSTATUS )
            // InternalMyLanguage.g:6436:3: ruleMISSIONSTATUS
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
    // InternalMyLanguage.g:6445:1: rule__RobotAutoPilot__StatusAssignment_2 : ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) ) ;
    public final void rule__RobotAutoPilot__StatusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6449:1: ( ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6450:2: ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6450:2: ( ( rule__RobotAutoPilot__StatusAlternatives_2_0 ) )
            // InternalMyLanguage.g:6451:3: ( rule__RobotAutoPilot__StatusAlternatives_2_0 )
            {
             before(grammarAccess.getRobotAutoPilotAccess().getStatusAlternatives_2_0()); 
            // InternalMyLanguage.g:6452:3: ( rule__RobotAutoPilot__StatusAlternatives_2_0 )
            // InternalMyLanguage.g:6452:4: rule__RobotAutoPilot__StatusAlternatives_2_0
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
    // InternalMyLanguage.g:6460:1: rule__RedundantComponent__ComponentAssignment_0 : ( ruleCOMPONENT ) ;
    public final void rule__RedundantComponent__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6464:1: ( ( ruleCOMPONENT ) )
            // InternalMyLanguage.g:6465:2: ( ruleCOMPONENT )
            {
            // InternalMyLanguage.g:6465:2: ( ruleCOMPONENT )
            // InternalMyLanguage.g:6466:3: ruleCOMPONENT
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
    // InternalMyLanguage.g:6475:1: rule__PayloadSent__LoadAssignment_0 : ( ( 'payload' ) ) ;
    public final void rule__PayloadSent__LoadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6479:1: ( ( ( 'payload' ) ) )
            // InternalMyLanguage.g:6480:2: ( ( 'payload' ) )
            {
            // InternalMyLanguage.g:6480:2: ( ( 'payload' ) )
            // InternalMyLanguage.g:6481:3: ( 'payload' )
            {
             before(grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0()); 
            // InternalMyLanguage.g:6482:3: ( 'payload' )
            // InternalMyLanguage.g:6483:4: 'payload'
            {
             before(grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalMyLanguage.g:6494:1: rule__RobotDistanceSent__SentAssignment_2 : ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) ) ;
    public final void rule__RobotDistanceSent__SentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6498:1: ( ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6499:2: ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6499:2: ( ( rule__RobotDistanceSent__SentAlternatives_2_0 ) )
            // InternalMyLanguage.g:6500:3: ( rule__RobotDistanceSent__SentAlternatives_2_0 )
            {
             before(grammarAccess.getRobotDistanceSentAccess().getSentAlternatives_2_0()); 
            // InternalMyLanguage.g:6501:3: ( rule__RobotDistanceSent__SentAlternatives_2_0 )
            // InternalMyLanguage.g:6501:4: rule__RobotDistanceSent__SentAlternatives_2_0
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
    // InternalMyLanguage.g:6509:1: rule__DistanceToLocationSent__PosXAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__DistanceToLocationSent__PosXAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6513:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6514:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6514:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6515:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6524:1: rule__DistanceToLocationSent__PosYAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__DistanceToLocationSent__PosYAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6528:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6529:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6529:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6530:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6539:1: rule__DistanceToLocationSent__PosZAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__DistanceToLocationSent__PosZAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6543:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6544:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6544:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6545:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6554:1: rule__DistanceToLocationSent__BodyAssignment_4 : ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) ) ;
    public final void rule__DistanceToLocationSent__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6558:1: ( ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) ) )
            // InternalMyLanguage.g:6559:2: ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) )
            {
            // InternalMyLanguage.g:6559:2: ( ( rule__DistanceToLocationSent__BodyAlternatives_4_0 ) )
            // InternalMyLanguage.g:6560:3: ( rule__DistanceToLocationSent__BodyAlternatives_4_0 )
            {
             before(grammarAccess.getDistanceToLocationSentAccess().getBodyAlternatives_4_0()); 
            // InternalMyLanguage.g:6561:3: ( rule__DistanceToLocationSent__BodyAlternatives_4_0 )
            // InternalMyLanguage.g:6561:4: rule__DistanceToLocationSent__BodyAlternatives_4_0
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
    // InternalMyLanguage.g:6569:1: rule__DistanceToLocationSent__ToleranceAssignment_5 : ( ruleToleranceSent ) ;
    public final void rule__DistanceToLocationSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6573:1: ( ( ruleToleranceSent ) )
            // InternalMyLanguage.g:6574:2: ( ruleToleranceSent )
            {
            // InternalMyLanguage.g:6574:2: ( ruleToleranceSent )
            // InternalMyLanguage.g:6575:3: ruleToleranceSent
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
    // InternalMyLanguage.g:6584:1: rule__DistanceToObstaclesSent__BodyAssignment_2 : ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) ) ;
    public final void rule__DistanceToObstaclesSent__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6588:1: ( ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6589:2: ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6589:2: ( ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 ) )
            // InternalMyLanguage.g:6590:3: ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 )
            {
             before(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAlternatives_2_0()); 
            // InternalMyLanguage.g:6591:3: ( rule__DistanceToObstaclesSent__BodyAlternatives_2_0 )
            // InternalMyLanguage.g:6591:4: rule__DistanceToObstaclesSent__BodyAlternatives_2_0
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
    // InternalMyLanguage.g:6599:1: rule__DistanceToObstaclesSent__ToleranceAssignment_3 : ( ruleToleranceSent ) ;
    public final void rule__DistanceToObstaclesSent__ToleranceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6603:1: ( ( ruleToleranceSent ) )
            // InternalMyLanguage.g:6604:2: ( ruleToleranceSent )
            {
            // InternalMyLanguage.g:6604:2: ( ruleToleranceSent )
            // InternalMyLanguage.g:6605:3: ruleToleranceSent
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
    // InternalMyLanguage.g:6614:1: rule__EqualSent__AmountAssignment_2 : ( ( rule__EqualSent__AmountAlternatives_2_0 ) ) ;
    public final void rule__EqualSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6618:1: ( ( ( rule__EqualSent__AmountAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6619:2: ( ( rule__EqualSent__AmountAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6619:2: ( ( rule__EqualSent__AmountAlternatives_2_0 ) )
            // InternalMyLanguage.g:6620:3: ( rule__EqualSent__AmountAlternatives_2_0 )
            {
             before(grammarAccess.getEqualSentAccess().getAmountAlternatives_2_0()); 
            // InternalMyLanguage.g:6621:3: ( rule__EqualSent__AmountAlternatives_2_0 )
            // InternalMyLanguage.g:6621:4: rule__EqualSent__AmountAlternatives_2_0
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
    // InternalMyLanguage.g:6629:1: rule__LessSent__AmountAssignment_2 : ( ( rule__LessSent__AmountAlternatives_2_0 ) ) ;
    public final void rule__LessSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6633:1: ( ( ( rule__LessSent__AmountAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6634:2: ( ( rule__LessSent__AmountAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6634:2: ( ( rule__LessSent__AmountAlternatives_2_0 ) )
            // InternalMyLanguage.g:6635:3: ( rule__LessSent__AmountAlternatives_2_0 )
            {
             before(grammarAccess.getLessSentAccess().getAmountAlternatives_2_0()); 
            // InternalMyLanguage.g:6636:3: ( rule__LessSent__AmountAlternatives_2_0 )
            // InternalMyLanguage.g:6636:4: rule__LessSent__AmountAlternatives_2_0
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
    // InternalMyLanguage.g:6644:1: rule__GreaterSent__AmountAssignment_2 : ( ( rule__GreaterSent__AmountAlternatives_2_0 ) ) ;
    public final void rule__GreaterSent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6648:1: ( ( ( rule__GreaterSent__AmountAlternatives_2_0 ) ) )
            // InternalMyLanguage.g:6649:2: ( ( rule__GreaterSent__AmountAlternatives_2_0 ) )
            {
            // InternalMyLanguage.g:6649:2: ( ( rule__GreaterSent__AmountAlternatives_2_0 ) )
            // InternalMyLanguage.g:6650:3: ( rule__GreaterSent__AmountAlternatives_2_0 )
            {
             before(grammarAccess.getGreaterSentAccess().getAmountAlternatives_2_0()); 
            // InternalMyLanguage.g:6651:3: ( rule__GreaterSent__AmountAlternatives_2_0 )
            // InternalMyLanguage.g:6651:4: rule__GreaterSent__AmountAlternatives_2_0
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
    // InternalMyLanguage.g:6659:1: rule__RobotStateSent__StateAssignment_2 : ( RULE_ID ) ;
    public final void rule__RobotStateSent__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6663:1: ( ( RULE_ID ) )
            // InternalMyLanguage.g:6664:2: ( RULE_ID )
            {
            // InternalMyLanguage.g:6664:2: ( RULE_ID )
            // InternalMyLanguage.g:6665:3: RULE_ID
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
    // InternalMyLanguage.g:6674:1: rule__RobotPositionSent__PosXAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__RobotPositionSent__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6678:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6679:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6679:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6680:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6689:1: rule__RobotPositionSent__PosYAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__RobotPositionSent__PosYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6693:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6694:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6694:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6695:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6704:1: rule__RobotPositionSent__PosZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__RobotPositionSent__PosZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6708:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6709:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6709:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6710:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6719:1: rule__RobotPositionSent__ToleranceAssignment_5 : ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) ) ;
    public final void rule__RobotPositionSent__ToleranceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6723:1: ( ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) ) )
            // InternalMyLanguage.g:6724:2: ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) )
            {
            // InternalMyLanguage.g:6724:2: ( ( rule__RobotPositionSent__ToleranceAlternatives_5_0 ) )
            // InternalMyLanguage.g:6725:3: ( rule__RobotPositionSent__ToleranceAlternatives_5_0 )
            {
             before(grammarAccess.getRobotPositionSentAccess().getToleranceAlternatives_5_0()); 
            // InternalMyLanguage.g:6726:3: ( rule__RobotPositionSent__ToleranceAlternatives_5_0 )
            // InternalMyLanguage.g:6726:4: rule__RobotPositionSent__ToleranceAlternatives_5_0
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
    // InternalMyLanguage.g:6734:1: rule__CirclePosition__ToleranceAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__CirclePosition__ToleranceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6738:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:6739:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:6739:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:6740:3: ruleDistanceUnit
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
    // InternalMyLanguage.g:6749:1: rule__SpherePosition__ToleranceAssignment_4 : ( ruleDistanceUnit ) ;
    public final void rule__SpherePosition__ToleranceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6753:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:6754:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:6754:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:6755:3: ruleDistanceUnit
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
    // InternalMyLanguage.g:6764:1: rule__RobotSpeedSent__SpeedXAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__RobotSpeedSent__SpeedXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6768:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6769:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6769:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6770:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6779:1: rule__RobotSpeedSent__SpeedYAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__RobotSpeedSent__SpeedYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6783:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6784:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6784:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6785:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6794:1: rule__RobotSpeedSent__SpeedZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__RobotSpeedSent__SpeedZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6798:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6799:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6799:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6800:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6809:1: rule__EnvironmentSent__BodyAssignment_3 : ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) ) ;
    public final void rule__EnvironmentSent__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6813:1: ( ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) ) )
            // InternalMyLanguage.g:6814:2: ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) )
            {
            // InternalMyLanguage.g:6814:2: ( ( rule__EnvironmentSent__BodyAlternatives_3_0 ) )
            // InternalMyLanguage.g:6815:3: ( rule__EnvironmentSent__BodyAlternatives_3_0 )
            {
             before(grammarAccess.getEnvironmentSentAccess().getBodyAlternatives_3_0()); 
            // InternalMyLanguage.g:6816:3: ( rule__EnvironmentSent__BodyAlternatives_3_0 )
            // InternalMyLanguage.g:6816:4: rule__EnvironmentSent__BodyAlternatives_3_0
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
    // InternalMyLanguage.g:6824:1: rule__FailingComponentSent__ComponentAssignment_0 : ( ruleCOMPONENT ) ;
    public final void rule__FailingComponentSent__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6828:1: ( ( ruleCOMPONENT ) )
            // InternalMyLanguage.g:6829:2: ( ruleCOMPONENT )
            {
            // InternalMyLanguage.g:6829:2: ( ruleCOMPONENT )
            // InternalMyLanguage.g:6830:3: ruleCOMPONENT
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
    // InternalMyLanguage.g:6839:1: rule__RiskSent__LevelAssignment_2 : ( ruleCOLLISIONRISKLEVEL ) ;
    public final void rule__RiskSent__LevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6843:1: ( ( ruleCOLLISIONRISKLEVEL ) )
            // InternalMyLanguage.g:6844:2: ( ruleCOLLISIONRISKLEVEL )
            {
            // InternalMyLanguage.g:6844:2: ( ruleCOLLISIONRISKLEVEL )
            // InternalMyLanguage.g:6845:3: ruleCOLLISIONRISKLEVEL
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
    // InternalMyLanguage.g:6854:1: rule__ToleranceSent__UnitAssignment_2 : ( ruleDistanceUnit ) ;
    public final void rule__ToleranceSent__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6858:1: ( ( ruleDistanceUnit ) )
            // InternalMyLanguage.g:6859:2: ( ruleDistanceUnit )
            {
            // InternalMyLanguage.g:6859:2: ( ruleDistanceUnit )
            // InternalMyLanguage.g:6860:3: ruleDistanceUnit
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
    // InternalMyLanguage.g:6869:1: rule__SECONDS__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__SECONDS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6873:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6874:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6874:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6875:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6884:1: rule__HOUR__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HOUR__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6888:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6889:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6889:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6890:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6899:1: rule__MINUTES__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__MINUTES__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6903:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6904:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6904:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6905:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6914:1: rule__METER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__METER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6918:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6919:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6919:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6920:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6929:1: rule__CENTIMETER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__CENTIMETER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6933:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6934:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6934:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6935:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6944:1: rule__MILLIMETER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__MILLIMETER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6948:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6949:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6949:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6950:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6959:1: rule__KILOMETER__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__KILOMETER__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6963:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6964:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6964:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6965:3: ruleDOUBLE
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
    // InternalMyLanguage.g:6974:1: rule__PercentUnit__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__PercentUnit__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyLanguage.g:6978:1: ( ( ruleDOUBLE ) )
            // InternalMyLanguage.g:6979:2: ( ruleDOUBLE )
            {
            // InternalMyLanguage.g:6979:2: ( ruleDOUBLE )
            // InternalMyLanguage.g:6980:3: ruleDOUBLE
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\24\6\uffff\10\42\2\uffff\1\13\1\uffff";
    static final String dfa_3s = "\1\127\6\uffff\10\110\2\uffff\1\63\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\10\uffff\1\7\1\10\1\uffff\1\11";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\21\uffff\1\1\12\uffff\1\4\6\uffff\1\3\5\uffff\1\2\3\uffff\1\5\15\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\45\uffff\1\17",
            "\1\20\45\uffff\1\17",
            "\1\20\45\uffff\1\17",
            "\1\20\45\uffff\1\17",
            "\1\20\45\uffff\1\17",
            "\1\20\45\uffff\1\17",
            "\1\20\45\uffff\1\17",
            "\1\21\45\uffff\1\17",
            "",
            "",
            "\2\22\46\uffff\1\20",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1526:1: rule__Robot__Alternatives_1 : ( ( ruleRobotPositionSent ) | ( ruleRobotSpeedSent ) | ( ruleRobotStateSent ) | ( ruleRobotDistanceSent ) | ( ruleRiskSent ) | ( rulePayloadSent ) | ( ruleFailingComponentSent ) | ( ruleRedundantComponent ) | ( ruleRobotAutoPilot ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0004941000000000L,0x0000000000400040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x5800000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0003000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x810020000FF00000L,0x0000000000800220L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000000010L,0x0000000000100000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});

}