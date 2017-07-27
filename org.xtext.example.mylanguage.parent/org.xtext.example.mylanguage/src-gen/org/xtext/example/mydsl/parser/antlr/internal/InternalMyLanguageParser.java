package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Test:'", "'Description:'", "'Given:'", "'Then:'", "'When:'", "'Time'", "'is'", "'always'", "'never'", "'status'", "'GPS'", "'positionReading'", "'Barometer'", "'altitudereading'", "'Sonar'", "'distancereading'", "'Notification'", "'sent'", "'interval'", "'in'", "'['", "','", "']'", "'Battery'", "'level'", "'Person'", "'position'", "'number'", "'Mission'", "'goal'", "'missionsafety'", "'Robot'", "'autopilot'", "'ON'", "'OFF'", "'payload'", "'drops'", "'distance'", "'to'", "'obstacles'", "'equal'", "'lower'", "'then'", "'greater'", "'state'", "'within'", "'circle'", "'with'", "'radius'", "'sphere'", "'speed'", "'Environment'", "'windspeed'", "'collisionrisk'", "'tolerance'", "'ACTIVE'", "'UNACTIVE'", "'PAUSED'", "'SAFE'", "'UNSAFE'", "'WARNING'", "'CRITICAL'", "'FAILING'", "'REDUNDANT'", "'m/s('", "')'", "'km/s('", "'m/h('", "'km/h('", "'seconds('", "'hours('", "'minutes('", "'meter('", "'centimeter('", "'millimeter('", "'kilometer('", "'percent('", "'-'", "'.'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
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
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
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

        public InternalMyLanguageParser(TokenStream input, MyLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TestFile";
       	}

       	@Override
       	protected MyLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTestFile"
    // InternalMyLanguage.g:64:1: entryRuleTestFile returns [EObject current=null] : iv_ruleTestFile= ruleTestFile EOF ;
    public final EObject entryRuleTestFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestFile = null;


        try {
            // InternalMyLanguage.g:64:49: (iv_ruleTestFile= ruleTestFile EOF )
            // InternalMyLanguage.g:65:2: iv_ruleTestFile= ruleTestFile EOF
            {
             newCompositeNode(grammarAccess.getTestFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestFile=ruleTestFile();

            state._fsp--;

             current =iv_ruleTestFile; 
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
    // $ANTLR end "entryRuleTestFile"


    // $ANTLR start "ruleTestFile"
    // InternalMyLanguage.g:71:1: ruleTestFile returns [EObject current=null] : ( (lv_tests_0_0= ruleTest ) )* ;
    public final EObject ruleTestFile() throws RecognitionException {
        EObject current = null;

        EObject lv_tests_0_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:77:2: ( ( (lv_tests_0_0= ruleTest ) )* )
            // InternalMyLanguage.g:78:2: ( (lv_tests_0_0= ruleTest ) )*
            {
            // InternalMyLanguage.g:78:2: ( (lv_tests_0_0= ruleTest ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyLanguage.g:79:3: (lv_tests_0_0= ruleTest )
            	    {
            	    // InternalMyLanguage.g:79:3: (lv_tests_0_0= ruleTest )
            	    // InternalMyLanguage.g:80:4: lv_tests_0_0= ruleTest
            	    {

            	    				newCompositeNode(grammarAccess.getTestFileAccess().getTestsTestParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_tests_0_0=ruleTest();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTestFileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"tests",
            	    					lv_tests_0_0,
            	    					"org.xtext.example.mydsl.MyLanguage.Test");
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
    // $ANTLR end "ruleTestFile"


    // $ANTLR start "entryRuleTest"
    // InternalMyLanguage.g:100:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalMyLanguage.g:100:45: (iv_ruleTest= ruleTest EOF )
            // InternalMyLanguage.g:101:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalMyLanguage.g:107:1: ruleTest returns [EObject current=null] : (otherlv_0= 'Test:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STRING ) ) )? ( (lv_statements_4_0= ruleStatement ) )+ ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:113:2: ( (otherlv_0= 'Test:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STRING ) ) )? ( (lv_statements_4_0= ruleStatement ) )+ ) )
            // InternalMyLanguage.g:114:2: (otherlv_0= 'Test:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STRING ) ) )? ( (lv_statements_4_0= ruleStatement ) )+ )
            {
            // InternalMyLanguage.g:114:2: (otherlv_0= 'Test:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STRING ) ) )? ( (lv_statements_4_0= ruleStatement ) )+ )
            // InternalMyLanguage.g:115:3: otherlv_0= 'Test:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STRING ) ) )? ( (lv_statements_4_0= ruleStatement ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalMyLanguage.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyLanguage.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyLanguage.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMyLanguage.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyLanguage.g:137:3: (otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyLanguage.g:138:4: otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getTestAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalMyLanguage.g:142:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalMyLanguage.g:143:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalMyLanguage.g:143:5: (lv_description_3_0= RULE_STRING )
                    // InternalMyLanguage.g:144:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_description_3_0, grammarAccess.getTestAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyLanguage.g:161:3: ( (lv_statements_4_0= ruleStatement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyLanguage.g:162:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalMyLanguage.g:162:4: (lv_statements_4_0= ruleStatement )
            	    // InternalMyLanguage.g:163:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"org.xtext.example.mydsl.MyLanguage.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleStatement"
    // InternalMyLanguage.g:184:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyLanguage.g:184:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyLanguage.g:185:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyLanguage.g:191:1: ruleStatement returns [EObject current=null] : (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Given_0 = null;

        EObject this_When_1 = null;

        EObject this_Then_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:197:2: ( (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen ) )
            // InternalMyLanguage.g:198:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen )
            {
            // InternalMyLanguage.g:198:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 14:
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
                    // InternalMyLanguage.g:199:3: this_Given_0= ruleGiven
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGivenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Given_0=ruleGiven();

                    state._fsp--;


                    			current = this_Given_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:208:3: this_When_1= ruleWhen
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_When_1=ruleWhen();

                    state._fsp--;


                    			current = this_When_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:217:3: this_Then_2= ruleThen
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getThenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Then_2=ruleThen();

                    state._fsp--;


                    			current = this_Then_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleGiven"
    // InternalMyLanguage.g:229:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalMyLanguage.g:229:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalMyLanguage.g:230:2: iv_ruleGiven= ruleGiven EOF
            {
             newCompositeNode(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven=ruleGiven();

            state._fsp--;

             current =iv_ruleGiven; 
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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalMyLanguage.g:236:1: ruleGiven returns [EObject current=null] : (otherlv_0= 'Given:' ( (lv_body_1_0= ruleStatementBody ) ) ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:242:2: ( (otherlv_0= 'Given:' ( (lv_body_1_0= ruleStatementBody ) ) ) )
            // InternalMyLanguage.g:243:2: (otherlv_0= 'Given:' ( (lv_body_1_0= ruleStatementBody ) ) )
            {
            // InternalMyLanguage.g:243:2: (otherlv_0= 'Given:' ( (lv_body_1_0= ruleStatementBody ) ) )
            // InternalMyLanguage.g:244:3: otherlv_0= 'Given:' ( (lv_body_1_0= ruleStatementBody ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getGivenKeyword_0());
            		
            // InternalMyLanguage.g:248:3: ( (lv_body_1_0= ruleStatementBody ) )
            // InternalMyLanguage.g:249:4: (lv_body_1_0= ruleStatementBody )
            {
            // InternalMyLanguage.g:249:4: (lv_body_1_0= ruleStatementBody )
            // InternalMyLanguage.g:250:5: lv_body_1_0= ruleStatementBody
            {

            					newCompositeNode(grammarAccess.getGivenAccess().getBodyStatementBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleStatementBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGivenRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.xtext.example.mydsl.MyLanguage.StatementBody");
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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleThen"
    // InternalMyLanguage.g:271:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalMyLanguage.g:271:45: (iv_ruleThen= ruleThen EOF )
            // InternalMyLanguage.g:272:2: iv_ruleThen= ruleThen EOF
            {
             newCompositeNode(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen=ruleThen();

            state._fsp--;

             current =iv_ruleThen; 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalMyLanguage.g:278:1: ruleThen returns [EObject current=null] : (otherlv_0= 'Then:' ( (lv_body_1_0= ruleStatementBody ) ) ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:284:2: ( (otherlv_0= 'Then:' ( (lv_body_1_0= ruleStatementBody ) ) ) )
            // InternalMyLanguage.g:285:2: (otherlv_0= 'Then:' ( (lv_body_1_0= ruleStatementBody ) ) )
            {
            // InternalMyLanguage.g:285:2: (otherlv_0= 'Then:' ( (lv_body_1_0= ruleStatementBody ) ) )
            // InternalMyLanguage.g:286:3: otherlv_0= 'Then:' ( (lv_body_1_0= ruleStatementBody ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getThenKeyword_0());
            		
            // InternalMyLanguage.g:290:3: ( (lv_body_1_0= ruleStatementBody ) )
            // InternalMyLanguage.g:291:4: (lv_body_1_0= ruleStatementBody )
            {
            // InternalMyLanguage.g:291:4: (lv_body_1_0= ruleStatementBody )
            // InternalMyLanguage.g:292:5: lv_body_1_0= ruleStatementBody
            {

            					newCompositeNode(grammarAccess.getThenAccess().getBodyStatementBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleStatementBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThenRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.xtext.example.mydsl.MyLanguage.StatementBody");
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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleWhen"
    // InternalMyLanguage.g:313:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalMyLanguage.g:313:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalMyLanguage.g:314:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalMyLanguage.g:320:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'When:' ( ( (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent ) ) ) ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_1 = null;

        EObject lv_body_1_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:326:2: ( (otherlv_0= 'When:' ( ( (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent ) ) ) ) )
            // InternalMyLanguage.g:327:2: (otherlv_0= 'When:' ( ( (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent ) ) ) )
            {
            // InternalMyLanguage.g:327:2: (otherlv_0= 'When:' ( ( (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent ) ) ) )
            // InternalMyLanguage.g:328:3: otherlv_0= 'When:' ( ( (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            // InternalMyLanguage.g:332:3: ( ( (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent ) ) )
            // InternalMyLanguage.g:333:4: ( (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent ) )
            {
            // InternalMyLanguage.g:333:4: ( (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent ) )
            // InternalMyLanguage.g:334:5: (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent )
            {
            // InternalMyLanguage.g:334:5: (lv_body_1_1= ruleStatementBody | lv_body_1_2= ruleCompleteTimeSent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21||LA5_0==23||LA5_0==25||LA5_0==27||LA5_0==34||LA5_0==36||LA5_0==39||LA5_0==42||LA5_0==62) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==17) ) {
                    alt5=2;
                }
                else if ( (LA5_2==29) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

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
                    // InternalMyLanguage.g:335:6: lv_body_1_1= ruleStatementBody
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getBodyStatementBodyParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_1_1=ruleStatementBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_1_1,
                    							"org.xtext.example.mydsl.MyLanguage.StatementBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:351:6: lv_body_1_2= ruleCompleteTimeSent
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getBodyCompleteTimeSentParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_1_2=ruleCompleteTimeSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_1_2,
                    							"org.xtext.example.mydsl.MyLanguage.CompleteTimeSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleCompleteTimeSent"
    // InternalMyLanguage.g:373:1: entryRuleCompleteTimeSent returns [EObject current=null] : iv_ruleCompleteTimeSent= ruleCompleteTimeSent EOF ;
    public final EObject entryRuleCompleteTimeSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteTimeSent = null;


        try {
            // InternalMyLanguage.g:373:57: (iv_ruleCompleteTimeSent= ruleCompleteTimeSent EOF )
            // InternalMyLanguage.g:374:2: iv_ruleCompleteTimeSent= ruleCompleteTimeSent EOF
            {
             newCompositeNode(grammarAccess.getCompleteTimeSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompleteTimeSent=ruleCompleteTimeSent();

            state._fsp--;

             current =iv_ruleCompleteTimeSent; 
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
    // $ANTLR end "entryRuleCompleteTimeSent"


    // $ANTLR start "ruleCompleteTimeSent"
    // InternalMyLanguage.g:380:1: ruleCompleteTimeSent returns [EObject current=null] : (otherlv_0= 'Time' otherlv_1= 'is' ( ( (lv_value_2_1= 'always' | lv_value_2_2= 'never' ) ) ) ) ;
    public final EObject ruleCompleteTimeSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:386:2: ( (otherlv_0= 'Time' otherlv_1= 'is' ( ( (lv_value_2_1= 'always' | lv_value_2_2= 'never' ) ) ) ) )
            // InternalMyLanguage.g:387:2: (otherlv_0= 'Time' otherlv_1= 'is' ( ( (lv_value_2_1= 'always' | lv_value_2_2= 'never' ) ) ) )
            {
            // InternalMyLanguage.g:387:2: (otherlv_0= 'Time' otherlv_1= 'is' ( ( (lv_value_2_1= 'always' | lv_value_2_2= 'never' ) ) ) )
            // InternalMyLanguage.g:388:3: otherlv_0= 'Time' otherlv_1= 'is' ( ( (lv_value_2_1= 'always' | lv_value_2_2= 'never' ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCompleteTimeSentAccess().getTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCompleteTimeSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:396:3: ( ( (lv_value_2_1= 'always' | lv_value_2_2= 'never' ) ) )
            // InternalMyLanguage.g:397:4: ( (lv_value_2_1= 'always' | lv_value_2_2= 'never' ) )
            {
            // InternalMyLanguage.g:397:4: ( (lv_value_2_1= 'always' | lv_value_2_2= 'never' ) )
            // InternalMyLanguage.g:398:5: (lv_value_2_1= 'always' | lv_value_2_2= 'never' )
            {
            // InternalMyLanguage.g:398:5: (lv_value_2_1= 'always' | lv_value_2_2= 'never' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyLanguage.g:399:6: lv_value_2_1= 'always'
                    {
                    lv_value_2_1=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getCompleteTimeSentAccess().getValueAlwaysKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompleteTimeSentRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:410:6: lv_value_2_2= 'never'
                    {
                    lv_value_2_2=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getCompleteTimeSentAccess().getValueNeverKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompleteTimeSentRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleCompleteTimeSent"


    // $ANTLR start "entryRuleStatementBody"
    // InternalMyLanguage.g:427:1: entryRuleStatementBody returns [EObject current=null] : iv_ruleStatementBody= ruleStatementBody EOF ;
    public final EObject entryRuleStatementBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBody = null;


        try {
            // InternalMyLanguage.g:427:54: (iv_ruleStatementBody= ruleStatementBody EOF )
            // InternalMyLanguage.g:428:2: iv_ruleStatementBody= ruleStatementBody EOF
            {
             newCompositeNode(grammarAccess.getStatementBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementBody=ruleStatementBody();

            state._fsp--;

             current =iv_ruleStatementBody; 
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
    // $ANTLR end "entryRuleStatementBody"


    // $ANTLR start "ruleStatementBody"
    // InternalMyLanguage.g:434:1: ruleStatementBody returns [EObject current=null] : (this_Robot_0= ruleRobot | this_EnvironmentSent_1= ruleEnvironmentSent | this_TimeSent_2= ruleTimeSent | this_PeopleSent_3= rulePeopleSent | this_MissionSent_4= ruleMissionSent | this_NotificationSent_5= ruleNotificationSent | this_BatterySent_6= ruleBatterySent | this_SonarSent_7= ruleSonarSent | this_BaroSent_8= ruleBaroSent | this_GPSSent_9= ruleGPSSent ) ;
    public final EObject ruleStatementBody() throws RecognitionException {
        EObject current = null;

        EObject this_Robot_0 = null;

        EObject this_EnvironmentSent_1 = null;

        EObject this_TimeSent_2 = null;

        EObject this_PeopleSent_3 = null;

        EObject this_MissionSent_4 = null;

        EObject this_NotificationSent_5 = null;

        EObject this_BatterySent_6 = null;

        EObject this_SonarSent_7 = null;

        EObject this_BaroSent_8 = null;

        EObject this_GPSSent_9 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:440:2: ( (this_Robot_0= ruleRobot | this_EnvironmentSent_1= ruleEnvironmentSent | this_TimeSent_2= ruleTimeSent | this_PeopleSent_3= rulePeopleSent | this_MissionSent_4= ruleMissionSent | this_NotificationSent_5= ruleNotificationSent | this_BatterySent_6= ruleBatterySent | this_SonarSent_7= ruleSonarSent | this_BaroSent_8= ruleBaroSent | this_GPSSent_9= ruleGPSSent ) )
            // InternalMyLanguage.g:441:2: (this_Robot_0= ruleRobot | this_EnvironmentSent_1= ruleEnvironmentSent | this_TimeSent_2= ruleTimeSent | this_PeopleSent_3= rulePeopleSent | this_MissionSent_4= ruleMissionSent | this_NotificationSent_5= ruleNotificationSent | this_BatterySent_6= ruleBatterySent | this_SonarSent_7= ruleSonarSent | this_BaroSent_8= ruleBaroSent | this_GPSSent_9= ruleGPSSent )
            {
            // InternalMyLanguage.g:441:2: (this_Robot_0= ruleRobot | this_EnvironmentSent_1= ruleEnvironmentSent | this_TimeSent_2= ruleTimeSent | this_PeopleSent_3= rulePeopleSent | this_MissionSent_4= ruleMissionSent | this_NotificationSent_5= ruleNotificationSent | this_BatterySent_6= ruleBatterySent | this_SonarSent_7= ruleSonarSent | this_BaroSent_8= ruleBaroSent | this_GPSSent_9= ruleGPSSent )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt7=1;
                }
                break;
            case 62:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=4;
                }
                break;
            case 39:
                {
                alt7=5;
                }
                break;
            case 27:
                {
                alt7=6;
                }
                break;
            case 34:
                {
                alt7=7;
                }
                break;
            case 25:
                {
                alt7=8;
                }
                break;
            case 23:
                {
                alt7=9;
                }
                break;
            case 21:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyLanguage.g:442:3: this_Robot_0= ruleRobot
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getRobotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Robot_0=ruleRobot();

                    state._fsp--;


                    			current = this_Robot_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:451:3: this_EnvironmentSent_1= ruleEnvironmentSent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getEnvironmentSentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnvironmentSent_1=ruleEnvironmentSent();

                    state._fsp--;


                    			current = this_EnvironmentSent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:460:3: this_TimeSent_2= ruleTimeSent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getTimeSentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeSent_2=ruleTimeSent();

                    state._fsp--;


                    			current = this_TimeSent_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:469:3: this_PeopleSent_3= rulePeopleSent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getPeopleSentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PeopleSent_3=rulePeopleSent();

                    state._fsp--;


                    			current = this_PeopleSent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyLanguage.g:478:3: this_MissionSent_4= ruleMissionSent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getMissionSentParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MissionSent_4=ruleMissionSent();

                    state._fsp--;


                    			current = this_MissionSent_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyLanguage.g:487:3: this_NotificationSent_5= ruleNotificationSent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getNotificationSentParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotificationSent_5=ruleNotificationSent();

                    state._fsp--;


                    			current = this_NotificationSent_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyLanguage.g:496:3: this_BatterySent_6= ruleBatterySent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getBatterySentParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BatterySent_6=ruleBatterySent();

                    state._fsp--;


                    			current = this_BatterySent_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyLanguage.g:505:3: this_SonarSent_7= ruleSonarSent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getSonarSentParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SonarSent_7=ruleSonarSent();

                    state._fsp--;


                    			current = this_SonarSent_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyLanguage.g:514:3: this_BaroSent_8= ruleBaroSent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getBaroSentParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaroSent_8=ruleBaroSent();

                    state._fsp--;


                    			current = this_BaroSent_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyLanguage.g:523:3: this_GPSSent_9= ruleGPSSent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getGPSSentParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_GPSSent_9=ruleGPSSent();

                    state._fsp--;


                    			current = this_GPSSent_9;
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
    // $ANTLR end "ruleStatementBody"


    // $ANTLR start "entryRuleCompStatusSent"
    // InternalMyLanguage.g:535:1: entryRuleCompStatusSent returns [EObject current=null] : iv_ruleCompStatusSent= ruleCompStatusSent EOF ;
    public final EObject entryRuleCompStatusSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompStatusSent = null;


        try {
            // InternalMyLanguage.g:535:55: (iv_ruleCompStatusSent= ruleCompStatusSent EOF )
            // InternalMyLanguage.g:536:2: iv_ruleCompStatusSent= ruleCompStatusSent EOF
            {
             newCompositeNode(grammarAccess.getCompStatusSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompStatusSent=ruleCompStatusSent();

            state._fsp--;

             current =iv_ruleCompStatusSent; 
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
    // $ANTLR end "entryRuleCompStatusSent"


    // $ANTLR start "ruleCompStatusSent"
    // InternalMyLanguage.g:542:1: ruleCompStatusSent returns [EObject current=null] : (otherlv_0= 'status' otherlv_1= 'is' ( (lv_status_2_0= ruleCOMPSTATUS ) ) ) ;
    public final EObject ruleCompStatusSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:548:2: ( (otherlv_0= 'status' otherlv_1= 'is' ( (lv_status_2_0= ruleCOMPSTATUS ) ) ) )
            // InternalMyLanguage.g:549:2: (otherlv_0= 'status' otherlv_1= 'is' ( (lv_status_2_0= ruleCOMPSTATUS ) ) )
            {
            // InternalMyLanguage.g:549:2: (otherlv_0= 'status' otherlv_1= 'is' ( (lv_status_2_0= ruleCOMPSTATUS ) ) )
            // InternalMyLanguage.g:550:3: otherlv_0= 'status' otherlv_1= 'is' ( (lv_status_2_0= ruleCOMPSTATUS ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCompStatusSentAccess().getStatusKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCompStatusSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:558:3: ( (lv_status_2_0= ruleCOMPSTATUS ) )
            // InternalMyLanguage.g:559:4: (lv_status_2_0= ruleCOMPSTATUS )
            {
            // InternalMyLanguage.g:559:4: (lv_status_2_0= ruleCOMPSTATUS )
            // InternalMyLanguage.g:560:5: lv_status_2_0= ruleCOMPSTATUS
            {

            					newCompositeNode(grammarAccess.getCompStatusSentAccess().getStatusCOMPSTATUSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_status_2_0=ruleCOMPSTATUS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompStatusSentRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"org.xtext.example.mydsl.MyLanguage.COMPSTATUS");
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
    // $ANTLR end "ruleCompStatusSent"


    // $ANTLR start "entryRuleGPSSent"
    // InternalMyLanguage.g:581:1: entryRuleGPSSent returns [EObject current=null] : iv_ruleGPSSent= ruleGPSSent EOF ;
    public final EObject entryRuleGPSSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPSSent = null;


        try {
            // InternalMyLanguage.g:581:48: (iv_ruleGPSSent= ruleGPSSent EOF )
            // InternalMyLanguage.g:582:2: iv_ruleGPSSent= ruleGPSSent EOF
            {
             newCompositeNode(grammarAccess.getGPSSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGPSSent=ruleGPSSent();

            state._fsp--;

             current =iv_ruleGPSSent; 
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
    // $ANTLR end "entryRuleGPSSent"


    // $ANTLR start "ruleGPSSent"
    // InternalMyLanguage.g:588:1: ruleGPSSent returns [EObject current=null] : (otherlv_0= 'GPS' ( ( (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent ) ) ) ) ;
    public final EObject ruleGPSSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sent_1_1 = null;

        EObject lv_sent_1_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:594:2: ( (otherlv_0= 'GPS' ( ( (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent ) ) ) ) )
            // InternalMyLanguage.g:595:2: (otherlv_0= 'GPS' ( ( (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent ) ) ) )
            {
            // InternalMyLanguage.g:595:2: (otherlv_0= 'GPS' ( ( (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent ) ) ) )
            // InternalMyLanguage.g:596:3: otherlv_0= 'GPS' ( ( (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGPSSentAccess().getGPSKeyword_0());
            		
            // InternalMyLanguage.g:600:3: ( ( (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent ) ) )
            // InternalMyLanguage.g:601:4: ( (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent ) )
            {
            // InternalMyLanguage.g:601:4: ( (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent ) )
            // InternalMyLanguage.g:602:5: (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent )
            {
            // InternalMyLanguage.g:602:5: (lv_sent_1_1= ruleGPSReadingSent | lv_sent_1_2= ruleCompStatusSent )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyLanguage.g:603:6: lv_sent_1_1= ruleGPSReadingSent
                    {

                    						newCompositeNode(grammarAccess.getGPSSentAccess().getSentGPSReadingSentParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_1_1=ruleGPSReadingSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGPSSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_1_1,
                    							"org.xtext.example.mydsl.MyLanguage.GPSReadingSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:619:6: lv_sent_1_2= ruleCompStatusSent
                    {

                    						newCompositeNode(grammarAccess.getGPSSentAccess().getSentCompStatusSentParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_1_2=ruleCompStatusSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGPSSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_1_2,
                    							"org.xtext.example.mydsl.MyLanguage.CompStatusSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleGPSSent"


    // $ANTLR start "entryRuleGPSReadingSent"
    // InternalMyLanguage.g:641:1: entryRuleGPSReadingSent returns [EObject current=null] : iv_ruleGPSReadingSent= ruleGPSReadingSent EOF ;
    public final EObject entryRuleGPSReadingSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPSReadingSent = null;


        try {
            // InternalMyLanguage.g:641:55: (iv_ruleGPSReadingSent= ruleGPSReadingSent EOF )
            // InternalMyLanguage.g:642:2: iv_ruleGPSReadingSent= ruleGPSReadingSent EOF
            {
             newCompositeNode(grammarAccess.getGPSReadingSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGPSReadingSent=ruleGPSReadingSent();

            state._fsp--;

             current =iv_ruleGPSReadingSent; 
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
    // $ANTLR end "entryRuleGPSReadingSent"


    // $ANTLR start "ruleGPSReadingSent"
    // InternalMyLanguage.g:648:1: ruleGPSReadingSent returns [EObject current=null] : (otherlv_0= 'positionReading' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) ;
    public final EObject ruleGPSReadingSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_posX_2_0 = null;

        EObject lv_posY_3_0 = null;

        EObject lv_posZ_4_0 = null;

        EObject lv_tolerance_5_1 = null;

        EObject lv_tolerance_5_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:654:2: ( (otherlv_0= 'positionReading' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) )
            // InternalMyLanguage.g:655:2: (otherlv_0= 'positionReading' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            {
            // InternalMyLanguage.g:655:2: (otherlv_0= 'positionReading' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            // InternalMyLanguage.g:656:3: otherlv_0= 'positionReading' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGPSReadingSentAccess().getPositionReadingKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getGPSReadingSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:664:3: ( (lv_posX_2_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:665:4: (lv_posX_2_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:665:4: (lv_posX_2_0= ruleDistanceUnit )
            // InternalMyLanguage.g:666:5: lv_posX_2_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getGPSReadingSentAccess().getPosXDistanceUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_posX_2_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGPSReadingSentRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:683:3: ( (lv_posY_3_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:684:4: (lv_posY_3_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:684:4: (lv_posY_3_0= ruleDistanceUnit )
            // InternalMyLanguage.g:685:5: lv_posY_3_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getGPSReadingSentAccess().getPosYDistanceUnitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_posY_3_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGPSReadingSentRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:702:3: ( (lv_posZ_4_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:703:4: (lv_posZ_4_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:703:4: (lv_posZ_4_0= ruleDistanceUnit )
            // InternalMyLanguage.g:704:5: lv_posZ_4_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getGPSReadingSentAccess().getPosZDistanceUnitParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_posZ_4_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGPSReadingSentRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:721:3: ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==56) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyLanguage.g:722:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    {
                    // InternalMyLanguage.g:722:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    // InternalMyLanguage.g:723:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:723:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==56) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==60) ) {
                            alt9=2;
                        }
                        else if ( (LA9_1==57) ) {
                            alt9=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyLanguage.g:724:6: lv_tolerance_5_1= ruleCirclePosition
                            {

                            						newCompositeNode(grammarAccess.getGPSReadingSentAccess().getToleranceCirclePositionParserRuleCall_5_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_tolerance_5_1=ruleCirclePosition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getGPSReadingSentRule());
                            						}
                            						set(
                            							current,
                            							"tolerance",
                            							lv_tolerance_5_1,
                            							"org.xtext.example.mydsl.MyLanguage.CirclePosition");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyLanguage.g:740:6: lv_tolerance_5_2= ruleSpherePosition
                            {

                            						newCompositeNode(grammarAccess.getGPSReadingSentAccess().getToleranceSpherePositionParserRuleCall_5_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            lv_tolerance_5_2=ruleSpherePosition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getGPSReadingSentRule());
                            						}
                            						set(
                            							current,
                            							"tolerance",
                            							lv_tolerance_5_2,
                            							"org.xtext.example.mydsl.MyLanguage.SpherePosition");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleGPSReadingSent"


    // $ANTLR start "entryRuleBaroSent"
    // InternalMyLanguage.g:762:1: entryRuleBaroSent returns [EObject current=null] : iv_ruleBaroSent= ruleBaroSent EOF ;
    public final EObject entryRuleBaroSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaroSent = null;


        try {
            // InternalMyLanguage.g:762:49: (iv_ruleBaroSent= ruleBaroSent EOF )
            // InternalMyLanguage.g:763:2: iv_ruleBaroSent= ruleBaroSent EOF
            {
             newCompositeNode(grammarAccess.getBaroSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaroSent=ruleBaroSent();

            state._fsp--;

             current =iv_ruleBaroSent; 
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
    // $ANTLR end "entryRuleBaroSent"


    // $ANTLR start "ruleBaroSent"
    // InternalMyLanguage.g:769:1: ruleBaroSent returns [EObject current=null] : (otherlv_0= 'Barometer' ( ( (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent ) ) ) ) ;
    public final EObject ruleBaroSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sent_1_1 = null;

        EObject lv_sent_1_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:775:2: ( (otherlv_0= 'Barometer' ( ( (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent ) ) ) ) )
            // InternalMyLanguage.g:776:2: (otherlv_0= 'Barometer' ( ( (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent ) ) ) )
            {
            // InternalMyLanguage.g:776:2: (otherlv_0= 'Barometer' ( ( (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent ) ) ) )
            // InternalMyLanguage.g:777:3: otherlv_0= 'Barometer' ( ( (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBaroSentAccess().getBarometerKeyword_0());
            		
            // InternalMyLanguage.g:781:3: ( ( (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent ) ) )
            // InternalMyLanguage.g:782:4: ( (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent ) )
            {
            // InternalMyLanguage.g:782:4: ( (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent ) )
            // InternalMyLanguage.g:783:5: (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent )
            {
            // InternalMyLanguage.g:783:5: (lv_sent_1_1= ruleBaroAltSent | lv_sent_1_2= ruleCompStatusSent )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyLanguage.g:784:6: lv_sent_1_1= ruleBaroAltSent
                    {

                    						newCompositeNode(grammarAccess.getBaroSentAccess().getSentBaroAltSentParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_1_1=ruleBaroAltSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaroSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_1_1,
                    							"org.xtext.example.mydsl.MyLanguage.BaroAltSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:800:6: lv_sent_1_2= ruleCompStatusSent
                    {

                    						newCompositeNode(grammarAccess.getBaroSentAccess().getSentCompStatusSentParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_1_2=ruleCompStatusSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaroSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_1_2,
                    							"org.xtext.example.mydsl.MyLanguage.CompStatusSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleBaroSent"


    // $ANTLR start "entryRuleBaroAltSent"
    // InternalMyLanguage.g:822:1: entryRuleBaroAltSent returns [EObject current=null] : iv_ruleBaroAltSent= ruleBaroAltSent EOF ;
    public final EObject entryRuleBaroAltSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaroAltSent = null;


        try {
            // InternalMyLanguage.g:822:52: (iv_ruleBaroAltSent= ruleBaroAltSent EOF )
            // InternalMyLanguage.g:823:2: iv_ruleBaroAltSent= ruleBaroAltSent EOF
            {
             newCompositeNode(grammarAccess.getBaroAltSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaroAltSent=ruleBaroAltSent();

            state._fsp--;

             current =iv_ruleBaroAltSent; 
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
    // $ANTLR end "entryRuleBaroAltSent"


    // $ANTLR start "ruleBaroAltSent"
    // InternalMyLanguage.g:829:1: ruleBaroAltSent returns [EObject current=null] : (otherlv_0= 'altitudereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) ) ;
    public final EObject ruleBaroAltSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_sent_2_1 = null;

        EObject lv_sent_2_2 = null;

        EObject lv_sent_2_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:835:2: ( (otherlv_0= 'altitudereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) ) )
            // InternalMyLanguage.g:836:2: (otherlv_0= 'altitudereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) )
            {
            // InternalMyLanguage.g:836:2: (otherlv_0= 'altitudereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) )
            // InternalMyLanguage.g:837:3: otherlv_0= 'altitudereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBaroAltSentAccess().getAltitudereadingKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBaroAltSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:845:3: ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:846:4: ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:846:4: ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) )
            // InternalMyLanguage.g:847:5: (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:847:5: (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt12=1;
                }
                break;
            case 52:
                {
                alt12=2;
                }
                break;
            case 51:
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
                    // InternalMyLanguage.g:848:6: lv_sent_2_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getBaroAltSentAccess().getSentGreaterSentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_1=ruleGreaterSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaroAltSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_1,
                    							"org.xtext.example.mydsl.MyLanguage.GreaterSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:864:6: lv_sent_2_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getBaroAltSentAccess().getSentLessSentParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_2=ruleLessSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaroAltSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_2,
                    							"org.xtext.example.mydsl.MyLanguage.LessSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:880:6: lv_sent_2_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getBaroAltSentAccess().getSentEqualSentParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_3=ruleEqualSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaroAltSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_3,
                    							"org.xtext.example.mydsl.MyLanguage.EqualSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleBaroAltSent"


    // $ANTLR start "entryRuleSonarSent"
    // InternalMyLanguage.g:902:1: entryRuleSonarSent returns [EObject current=null] : iv_ruleSonarSent= ruleSonarSent EOF ;
    public final EObject entryRuleSonarSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSonarSent = null;


        try {
            // InternalMyLanguage.g:902:50: (iv_ruleSonarSent= ruleSonarSent EOF )
            // InternalMyLanguage.g:903:2: iv_ruleSonarSent= ruleSonarSent EOF
            {
             newCompositeNode(grammarAccess.getSonarSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSonarSent=ruleSonarSent();

            state._fsp--;

             current =iv_ruleSonarSent; 
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
    // $ANTLR end "entryRuleSonarSent"


    // $ANTLR start "ruleSonarSent"
    // InternalMyLanguage.g:909:1: ruleSonarSent returns [EObject current=null] : (otherlv_0= 'Sonar' ( ( (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent ) ) ) ) ;
    public final EObject ruleSonarSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sent_1_1 = null;

        EObject lv_sent_1_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:915:2: ( (otherlv_0= 'Sonar' ( ( (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent ) ) ) ) )
            // InternalMyLanguage.g:916:2: (otherlv_0= 'Sonar' ( ( (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent ) ) ) )
            {
            // InternalMyLanguage.g:916:2: (otherlv_0= 'Sonar' ( ( (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent ) ) ) )
            // InternalMyLanguage.g:917:3: otherlv_0= 'Sonar' ( ( (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSonarSentAccess().getSonarKeyword_0());
            		
            // InternalMyLanguage.g:921:3: ( ( (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent ) ) )
            // InternalMyLanguage.g:922:4: ( (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent ) )
            {
            // InternalMyLanguage.g:922:4: ( (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent ) )
            // InternalMyLanguage.g:923:5: (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent )
            {
            // InternalMyLanguage.g:923:5: (lv_sent_1_1= ruleSonarDistanceSent | lv_sent_1_2= ruleCompStatusSent )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyLanguage.g:924:6: lv_sent_1_1= ruleSonarDistanceSent
                    {

                    						newCompositeNode(grammarAccess.getSonarSentAccess().getSentSonarDistanceSentParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_1_1=ruleSonarDistanceSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSonarSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_1_1,
                    							"org.xtext.example.mydsl.MyLanguage.SonarDistanceSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:940:6: lv_sent_1_2= ruleCompStatusSent
                    {

                    						newCompositeNode(grammarAccess.getSonarSentAccess().getSentCompStatusSentParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_1_2=ruleCompStatusSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSonarSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_1_2,
                    							"org.xtext.example.mydsl.MyLanguage.CompStatusSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleSonarSent"


    // $ANTLR start "entryRuleSonarDistanceSent"
    // InternalMyLanguage.g:962:1: entryRuleSonarDistanceSent returns [EObject current=null] : iv_ruleSonarDistanceSent= ruleSonarDistanceSent EOF ;
    public final EObject entryRuleSonarDistanceSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSonarDistanceSent = null;


        try {
            // InternalMyLanguage.g:962:58: (iv_ruleSonarDistanceSent= ruleSonarDistanceSent EOF )
            // InternalMyLanguage.g:963:2: iv_ruleSonarDistanceSent= ruleSonarDistanceSent EOF
            {
             newCompositeNode(grammarAccess.getSonarDistanceSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSonarDistanceSent=ruleSonarDistanceSent();

            state._fsp--;

             current =iv_ruleSonarDistanceSent; 
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
    // $ANTLR end "entryRuleSonarDistanceSent"


    // $ANTLR start "ruleSonarDistanceSent"
    // InternalMyLanguage.g:969:1: ruleSonarDistanceSent returns [EObject current=null] : (otherlv_0= 'distancereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) ) ;
    public final EObject ruleSonarDistanceSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_sent_2_1 = null;

        EObject lv_sent_2_2 = null;

        EObject lv_sent_2_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:975:2: ( (otherlv_0= 'distancereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) ) )
            // InternalMyLanguage.g:976:2: (otherlv_0= 'distancereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) )
            {
            // InternalMyLanguage.g:976:2: (otherlv_0= 'distancereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) )
            // InternalMyLanguage.g:977:3: otherlv_0= 'distancereading' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSonarDistanceSentAccess().getDistancereadingKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSonarDistanceSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:985:3: ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:986:4: ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:986:4: ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) )
            // InternalMyLanguage.g:987:5: (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:987:5: (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt14=1;
                }
                break;
            case 52:
                {
                alt14=2;
                }
                break;
            case 51:
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
                    // InternalMyLanguage.g:988:6: lv_sent_2_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getSonarDistanceSentAccess().getSentGreaterSentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_1=ruleGreaterSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSonarDistanceSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_1,
                    							"org.xtext.example.mydsl.MyLanguage.GreaterSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1004:6: lv_sent_2_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getSonarDistanceSentAccess().getSentLessSentParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_2=ruleLessSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSonarDistanceSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_2,
                    							"org.xtext.example.mydsl.MyLanguage.LessSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1020:6: lv_sent_2_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getSonarDistanceSentAccess().getSentEqualSentParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_3=ruleEqualSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSonarDistanceSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_3,
                    							"org.xtext.example.mydsl.MyLanguage.EqualSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleSonarDistanceSent"


    // $ANTLR start "entryRuleNotificationSent"
    // InternalMyLanguage.g:1042:1: entryRuleNotificationSent returns [EObject current=null] : iv_ruleNotificationSent= ruleNotificationSent EOF ;
    public final EObject entryRuleNotificationSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotificationSent = null;


        try {
            // InternalMyLanguage.g:1042:57: (iv_ruleNotificationSent= ruleNotificationSent EOF )
            // InternalMyLanguage.g:1043:2: iv_ruleNotificationSent= ruleNotificationSent EOF
            {
             newCompositeNode(grammarAccess.getNotificationSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotificationSent=ruleNotificationSent();

            state._fsp--;

             current =iv_ruleNotificationSent; 
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
    // $ANTLR end "entryRuleNotificationSent"


    // $ANTLR start "ruleNotificationSent"
    // InternalMyLanguage.g:1049:1: ruleNotificationSent returns [EObject current=null] : ( ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent' ) ;
    public final EObject ruleNotificationSent() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:1055:2: ( ( ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent' ) )
            // InternalMyLanguage.g:1056:2: ( ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent' )
            {
            // InternalMyLanguage.g:1056:2: ( ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent' )
            // InternalMyLanguage.g:1057:3: ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent'
            {
            // InternalMyLanguage.g:1057:3: ( (lv_not_0_0= 'Notification' ) )
            // InternalMyLanguage.g:1058:4: (lv_not_0_0= 'Notification' )
            {
            // InternalMyLanguage.g:1058:4: (lv_not_0_0= 'Notification' )
            // InternalMyLanguage.g:1059:5: lv_not_0_0= 'Notification'
            {
            lv_not_0_0=(Token)match(input,27,FOLLOW_18); 

            					newLeafNode(lv_not_0_0, grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotificationSentRule());
            					}
            					setWithLastConsumed(current, "not", lv_not_0_0, "Notification");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getNotificationSentAccess().getStatusKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getNotificationSentAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNotificationSentAccess().getSentKeyword_3());
            		

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
    // $ANTLR end "ruleNotificationSent"


    // $ANTLR start "entryRuleTimeSent"
    // InternalMyLanguage.g:1087:1: entryRuleTimeSent returns [EObject current=null] : iv_ruleTimeSent= ruleTimeSent EOF ;
    public final EObject entryRuleTimeSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSent = null;


        try {
            // InternalMyLanguage.g:1087:49: (iv_ruleTimeSent= ruleTimeSent EOF )
            // InternalMyLanguage.g:1088:2: iv_ruleTimeSent= ruleTimeSent EOF
            {
             newCompositeNode(grammarAccess.getTimeSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeSent=ruleTimeSent();

            state._fsp--;

             current =iv_ruleTimeSent; 
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
    // $ANTLR end "entryRuleTimeSent"


    // $ANTLR start "ruleTimeSent"
    // InternalMyLanguage.g:1094:1: ruleTimeSent returns [EObject current=null] : (otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval ) ;
    public final EObject ruleTimeSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TimeInterval_1 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1100:2: ( (otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval ) )
            // InternalMyLanguage.g:1101:2: (otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval )
            {
            // InternalMyLanguage.g:1101:2: (otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval )
            // InternalMyLanguage.g:1102:3: otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval
            {
            otherlv_0=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeSentAccess().getTimeKeyword_0());
            		

            			newCompositeNode(grammarAccess.getTimeSentAccess().getTimeIntervalParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_TimeInterval_1=ruleTimeInterval();

            state._fsp--;


            			current = this_TimeInterval_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleTimeSent"


    // $ANTLR start "entryRuleTimeInterval"
    // InternalMyLanguage.g:1118:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalMyLanguage.g:1118:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalMyLanguage.g:1119:2: iv_ruleTimeInterval= ruleTimeInterval EOF
            {
             newCompositeNode(grammarAccess.getTimeIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeInterval=ruleTimeInterval();

            state._fsp--;

             current =iv_ruleTimeInterval; 
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
    // $ANTLR end "entryRuleTimeInterval"


    // $ANTLR start "ruleTimeInterval"
    // InternalMyLanguage.g:1125:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']' ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_first_3_0 = null;

        EObject lv_second_5_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1131:2: ( (otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']' ) )
            // InternalMyLanguage.g:1132:2: (otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']' )
            {
            // InternalMyLanguage.g:1132:2: (otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']' )
            // InternalMyLanguage.g:1133:3: otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getInKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyLanguage.g:1145:3: ( (lv_first_3_0= ruleTimeUnit ) )
            // InternalMyLanguage.g:1146:4: (lv_first_3_0= ruleTimeUnit )
            {
            // InternalMyLanguage.g:1146:4: (lv_first_3_0= ruleTimeUnit )
            // InternalMyLanguage.g:1147:5: lv_first_3_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getTimeIntervalAccess().getFirstTimeUnitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_first_3_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_3_0,
            						"org.xtext.example.mydsl.MyLanguage.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeIntervalAccess().getCommaKeyword_4());
            		
            // InternalMyLanguage.g:1168:3: ( (lv_second_5_0= ruleTimeUnit ) )
            // InternalMyLanguage.g:1169:4: (lv_second_5_0= ruleTimeUnit )
            {
            // InternalMyLanguage.g:1169:4: (lv_second_5_0= ruleTimeUnit )
            // InternalMyLanguage.g:1170:5: lv_second_5_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getTimeIntervalAccess().getSecondTimeUnitParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_second_5_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
            					}
            					set(
            						current,
            						"second",
            						lv_second_5_0,
            						"org.xtext.example.mydsl.MyLanguage.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTimeIntervalAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTimeInterval"


    // $ANTLR start "entryRuleBatterySent"
    // InternalMyLanguage.g:1195:1: entryRuleBatterySent returns [EObject current=null] : iv_ruleBatterySent= ruleBatterySent EOF ;
    public final EObject entryRuleBatterySent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatterySent = null;


        try {
            // InternalMyLanguage.g:1195:52: (iv_ruleBatterySent= ruleBatterySent EOF )
            // InternalMyLanguage.g:1196:2: iv_ruleBatterySent= ruleBatterySent EOF
            {
             newCompositeNode(grammarAccess.getBatterySentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBatterySent=ruleBatterySent();

            state._fsp--;

             current =iv_ruleBatterySent; 
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
    // $ANTLR end "entryRuleBatterySent"


    // $ANTLR start "ruleBatterySent"
    // InternalMyLanguage.g:1202:1: ruleBatterySent returns [EObject current=null] : (otherlv_0= 'Battery' ( ( (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent ) ) ) ) ;
    public final EObject ruleBatterySent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sent_1_1 = null;

        EObject lv_sent_1_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1208:2: ( (otherlv_0= 'Battery' ( ( (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent ) ) ) ) )
            // InternalMyLanguage.g:1209:2: (otherlv_0= 'Battery' ( ( (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent ) ) ) )
            {
            // InternalMyLanguage.g:1209:2: (otherlv_0= 'Battery' ( ( (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent ) ) ) )
            // InternalMyLanguage.g:1210:3: otherlv_0= 'Battery' ( ( (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getBatterySentAccess().getBatteryKeyword_0());
            		
            // InternalMyLanguage.g:1214:3: ( ( (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent ) ) )
            // InternalMyLanguage.g:1215:4: ( (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent ) )
            {
            // InternalMyLanguage.g:1215:4: ( (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent ) )
            // InternalMyLanguage.g:1216:5: (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent )
            {
            // InternalMyLanguage.g:1216:5: (lv_sent_1_1= ruleBatteryLevelSent | lv_sent_1_2= ruleCompStatusSent )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyLanguage.g:1217:6: lv_sent_1_1= ruleBatteryLevelSent
                    {

                    						newCompositeNode(grammarAccess.getBatterySentAccess().getSentBatteryLevelSentParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_1_1=ruleBatteryLevelSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatterySentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_1_1,
                    							"org.xtext.example.mydsl.MyLanguage.BatteryLevelSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1233:6: lv_sent_1_2= ruleCompStatusSent
                    {

                    						newCompositeNode(grammarAccess.getBatterySentAccess().getSentCompStatusSentParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_1_2=ruleCompStatusSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatterySentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_1_2,
                    							"org.xtext.example.mydsl.MyLanguage.CompStatusSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleBatterySent"


    // $ANTLR start "entryRuleBatteryLevelSent"
    // InternalMyLanguage.g:1255:1: entryRuleBatteryLevelSent returns [EObject current=null] : iv_ruleBatteryLevelSent= ruleBatteryLevelSent EOF ;
    public final EObject entryRuleBatteryLevelSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatteryLevelSent = null;


        try {
            // InternalMyLanguage.g:1255:57: (iv_ruleBatteryLevelSent= ruleBatteryLevelSent EOF )
            // InternalMyLanguage.g:1256:2: iv_ruleBatteryLevelSent= ruleBatteryLevelSent EOF
            {
             newCompositeNode(grammarAccess.getBatteryLevelSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBatteryLevelSent=ruleBatteryLevelSent();

            state._fsp--;

             current =iv_ruleBatteryLevelSent; 
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
    // $ANTLR end "entryRuleBatteryLevelSent"


    // $ANTLR start "ruleBatteryLevelSent"
    // InternalMyLanguage.g:1262:1: ruleBatteryLevelSent returns [EObject current=null] : (otherlv_0= 'level' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) ) ;
    public final EObject ruleBatteryLevelSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_sent_2_1 = null;

        EObject lv_sent_2_2 = null;

        EObject lv_sent_2_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1268:2: ( (otherlv_0= 'level' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) ) )
            // InternalMyLanguage.g:1269:2: (otherlv_0= 'level' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) )
            {
            // InternalMyLanguage.g:1269:2: (otherlv_0= 'level' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) ) )
            // InternalMyLanguage.g:1270:3: otherlv_0= 'level' otherlv_1= 'is' ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBatteryLevelSentAccess().getLevelKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBatteryLevelSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1278:3: ( ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:1279:4: ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:1279:4: ( (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent ) )
            // InternalMyLanguage.g:1280:5: (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:1280:5: (lv_sent_2_1= ruleGreaterSent | lv_sent_2_2= ruleLessSent | lv_sent_2_3= ruleEqualSent )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt16=1;
                }
                break;
            case 52:
                {
                alt16=2;
                }
                break;
            case 51:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyLanguage.g:1281:6: lv_sent_2_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getBatteryLevelSentAccess().getSentGreaterSentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_1=ruleGreaterSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatteryLevelSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_1,
                    							"org.xtext.example.mydsl.MyLanguage.GreaterSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1297:6: lv_sent_2_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getBatteryLevelSentAccess().getSentLessSentParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_2=ruleLessSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatteryLevelSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_2,
                    							"org.xtext.example.mydsl.MyLanguage.LessSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1313:6: lv_sent_2_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getBatteryLevelSentAccess().getSentEqualSentParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_3=ruleEqualSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatteryLevelSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_3,
                    							"org.xtext.example.mydsl.MyLanguage.EqualSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleBatteryLevelSent"


    // $ANTLR start "entryRulePeopleSent"
    // InternalMyLanguage.g:1335:1: entryRulePeopleSent returns [EObject current=null] : iv_rulePeopleSent= rulePeopleSent EOF ;
    public final EObject entryRulePeopleSent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeopleSent = null;


        try {
            // InternalMyLanguage.g:1335:51: (iv_rulePeopleSent= rulePeopleSent EOF )
            // InternalMyLanguage.g:1336:2: iv_rulePeopleSent= rulePeopleSent EOF
            {
             newCompositeNode(grammarAccess.getPeopleSentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeopleSent=rulePeopleSent();

            state._fsp--;

             current =iv_rulePeopleSent; 
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
    // $ANTLR end "entryRulePeopleSent"


    // $ANTLR start "rulePeopleSent"
    // InternalMyLanguage.g:1342:1: rulePeopleSent returns [EObject current=null] : (otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent ) ) ;
    public final EObject rulePeopleSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_PeopleNumbSent_1 = null;

        EObject this_PeoplePosSent_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1348:2: ( (otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent ) ) )
            // InternalMyLanguage.g:1349:2: (otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent ) )
            {
            // InternalMyLanguage.g:1349:2: (otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent ) )
            // InternalMyLanguage.g:1350:3: otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getPeopleSentAccess().getPersonKeyword_0());
            		
            // InternalMyLanguage.g:1354:3: (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyLanguage.g:1355:4: this_PeopleNumbSent_1= rulePeopleNumbSent
                    {

                    				newCompositeNode(grammarAccess.getPeopleSentAccess().getPeopleNumbSentParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_PeopleNumbSent_1=rulePeopleNumbSent();

                    state._fsp--;


                    				current = this_PeopleNumbSent_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1364:4: this_PeoplePosSent_2= rulePeoplePosSent
                    {

                    				newCompositeNode(grammarAccess.getPeopleSentAccess().getPeoplePosSentParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_PeoplePosSent_2=rulePeoplePosSent();

                    state._fsp--;


                    				current = this_PeoplePosSent_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "rulePeopleSent"


    // $ANTLR start "entryRulePeoplePosSent"
    // InternalMyLanguage.g:1377:1: entryRulePeoplePosSent returns [EObject current=null] : iv_rulePeoplePosSent= rulePeoplePosSent EOF ;
    public final EObject entryRulePeoplePosSent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeoplePosSent = null;


        try {
            // InternalMyLanguage.g:1377:54: (iv_rulePeoplePosSent= rulePeoplePosSent EOF )
            // InternalMyLanguage.g:1378:2: iv_rulePeoplePosSent= rulePeoplePosSent EOF
            {
             newCompositeNode(grammarAccess.getPeoplePosSentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeoplePosSent=rulePeoplePosSent();

            state._fsp--;

             current =iv_rulePeoplePosSent; 
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
    // $ANTLR end "entryRulePeoplePosSent"


    // $ANTLR start "rulePeoplePosSent"
    // InternalMyLanguage.g:1384:1: rulePeoplePosSent returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) ;
    public final EObject rulePeoplePosSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_posX_2_0 = null;

        EObject lv_posY_3_0 = null;

        EObject lv_posZ_4_0 = null;

        EObject lv_tolerance_5_1 = null;

        EObject lv_tolerance_5_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1390:2: ( (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) )
            // InternalMyLanguage.g:1391:2: (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            {
            // InternalMyLanguage.g:1391:2: (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            // InternalMyLanguage.g:1392:3: otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPeoplePosSentAccess().getPositionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getPeoplePosSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1400:3: ( (lv_posX_2_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:1401:4: (lv_posX_2_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:1401:4: (lv_posX_2_0= ruleDistanceUnit )
            // InternalMyLanguage.g:1402:5: lv_posX_2_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getPeoplePosSentAccess().getPosXDistanceUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_posX_2_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeoplePosSentRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1419:3: ( (lv_posY_3_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:1420:4: (lv_posY_3_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:1420:4: (lv_posY_3_0= ruleDistanceUnit )
            // InternalMyLanguage.g:1421:5: lv_posY_3_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getPeoplePosSentAccess().getPosYDistanceUnitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_posY_3_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeoplePosSentRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1438:3: ( (lv_posZ_4_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:1439:4: (lv_posZ_4_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:1439:4: (lv_posZ_4_0= ruleDistanceUnit )
            // InternalMyLanguage.g:1440:5: lv_posZ_4_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getPeoplePosSentAccess().getPosZDistanceUnitParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_posZ_4_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeoplePosSentRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1457:3: ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==56) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyLanguage.g:1458:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    {
                    // InternalMyLanguage.g:1458:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    // InternalMyLanguage.g:1459:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:1459:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==56) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==60) ) {
                            alt18=2;
                        }
                        else if ( (LA18_1==57) ) {
                            alt18=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyLanguage.g:1460:6: lv_tolerance_5_1= ruleCirclePosition
                            {

                            						newCompositeNode(grammarAccess.getPeoplePosSentAccess().getToleranceCirclePositionParserRuleCall_5_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_tolerance_5_1=ruleCirclePosition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPeoplePosSentRule());
                            						}
                            						set(
                            							current,
                            							"tolerance",
                            							lv_tolerance_5_1,
                            							"org.xtext.example.mydsl.MyLanguage.CirclePosition");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyLanguage.g:1476:6: lv_tolerance_5_2= ruleSpherePosition
                            {

                            						newCompositeNode(grammarAccess.getPeoplePosSentAccess().getToleranceSpherePositionParserRuleCall_5_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            lv_tolerance_5_2=ruleSpherePosition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPeoplePosSentRule());
                            						}
                            						set(
                            							current,
                            							"tolerance",
                            							lv_tolerance_5_2,
                            							"org.xtext.example.mydsl.MyLanguage.SpherePosition");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePeoplePosSent"


    // $ANTLR start "entryRulePeopleNumbSent"
    // InternalMyLanguage.g:1498:1: entryRulePeopleNumbSent returns [EObject current=null] : iv_rulePeopleNumbSent= rulePeopleNumbSent EOF ;
    public final EObject entryRulePeopleNumbSent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeopleNumbSent = null;


        try {
            // InternalMyLanguage.g:1498:55: (iv_rulePeopleNumbSent= rulePeopleNumbSent EOF )
            // InternalMyLanguage.g:1499:2: iv_rulePeopleNumbSent= rulePeopleNumbSent EOF
            {
             newCompositeNode(grammarAccess.getPeopleNumbSentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeopleNumbSent=rulePeopleNumbSent();

            state._fsp--;

             current =iv_rulePeopleNumbSent; 
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
    // $ANTLR end "entryRulePeopleNumbSent"


    // $ANTLR start "rulePeopleNumbSent"
    // InternalMyLanguage.g:1505:1: rulePeopleNumbSent returns [EObject current=null] : (otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) ) ) ;
    public final EObject rulePeopleNumbSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_amount_2_0=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:1511:2: ( (otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) ) ) )
            // InternalMyLanguage.g:1512:2: (otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) ) )
            {
            // InternalMyLanguage.g:1512:2: (otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) ) )
            // InternalMyLanguage.g:1513:3: otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPeopleNumbSentAccess().getNumberKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getPeopleNumbSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1521:3: ( (lv_amount_2_0= RULE_INT ) )
            // InternalMyLanguage.g:1522:4: (lv_amount_2_0= RULE_INT )
            {
            // InternalMyLanguage.g:1522:4: (lv_amount_2_0= RULE_INT )
            // InternalMyLanguage.g:1523:5: lv_amount_2_0= RULE_INT
            {
            lv_amount_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_amount_2_0, grammarAccess.getPeopleNumbSentAccess().getAmountINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeopleNumbSentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "rulePeopleNumbSent"


    // $ANTLR start "entryRuleMissionSent"
    // InternalMyLanguage.g:1543:1: entryRuleMissionSent returns [EObject current=null] : iv_ruleMissionSent= ruleMissionSent EOF ;
    public final EObject entryRuleMissionSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionSent = null;


        try {
            // InternalMyLanguage.g:1543:52: (iv_ruleMissionSent= ruleMissionSent EOF )
            // InternalMyLanguage.g:1544:2: iv_ruleMissionSent= ruleMissionSent EOF
            {
             newCompositeNode(grammarAccess.getMissionSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionSent=ruleMissionSent();

            state._fsp--;

             current =iv_ruleMissionSent; 
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
    // $ANTLR end "entryRuleMissionSent"


    // $ANTLR start "ruleMissionSent"
    // InternalMyLanguage.g:1550:1: ruleMissionSent returns [EObject current=null] : (otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent ) ) ;
    public final EObject ruleMissionSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MissionStatusSent_1 = null;

        EObject this_MissionRiskLevelSent_2 = null;

        EObject this_MissionGoalSent_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1556:2: ( (otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent ) ) )
            // InternalMyLanguage.g:1557:2: (otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent ) )
            {
            // InternalMyLanguage.g:1557:2: (otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent ) )
            // InternalMyLanguage.g:1558:3: otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionSentAccess().getMissionKeyword_0());
            		
            // InternalMyLanguage.g:1562:3: (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt20=1;
                }
                break;
            case 41:
                {
                alt20=2;
                }
                break;
            case 40:
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
                    // InternalMyLanguage.g:1563:4: this_MissionStatusSent_1= ruleMissionStatusSent
                    {

                    				newCompositeNode(grammarAccess.getMissionSentAccess().getMissionStatusSentParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_MissionStatusSent_1=ruleMissionStatusSent();

                    state._fsp--;


                    				current = this_MissionStatusSent_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1572:4: this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent
                    {

                    				newCompositeNode(grammarAccess.getMissionSentAccess().getMissionRiskLevelSentParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_MissionRiskLevelSent_2=ruleMissionRiskLevelSent();

                    state._fsp--;


                    				current = this_MissionRiskLevelSent_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1581:4: this_MissionGoalSent_3= ruleMissionGoalSent
                    {

                    				newCompositeNode(grammarAccess.getMissionSentAccess().getMissionGoalSentParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_MissionGoalSent_3=ruleMissionGoalSent();

                    state._fsp--;


                    				current = this_MissionGoalSent_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleMissionSent"


    // $ANTLR start "entryRuleMissionGoalSent"
    // InternalMyLanguage.g:1594:1: entryRuleMissionGoalSent returns [EObject current=null] : iv_ruleMissionGoalSent= ruleMissionGoalSent EOF ;
    public final EObject entryRuleMissionGoalSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionGoalSent = null;


        try {
            // InternalMyLanguage.g:1594:56: (iv_ruleMissionGoalSent= ruleMissionGoalSent EOF )
            // InternalMyLanguage.g:1595:2: iv_ruleMissionGoalSent= ruleMissionGoalSent EOF
            {
             newCompositeNode(grammarAccess.getMissionGoalSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionGoalSent=ruleMissionGoalSent();

            state._fsp--;

             current =iv_ruleMissionGoalSent; 
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
    // $ANTLR end "entryRuleMissionGoalSent"


    // $ANTLR start "ruleMissionGoalSent"
    // InternalMyLanguage.g:1601:1: ruleMissionGoalSent returns [EObject current=null] : (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleMissionGoalSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_posX_2_0 = null;

        EObject lv_posY_3_0 = null;

        EObject lv_posZ_4_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1607:2: ( (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ) )
            // InternalMyLanguage.g:1608:2: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) )
            {
            // InternalMyLanguage.g:1608:2: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) )
            // InternalMyLanguage.g:1609:3: otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionGoalSentAccess().getGoalKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionGoalSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1617:3: ( (lv_posX_2_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:1618:4: (lv_posX_2_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:1618:4: (lv_posX_2_0= ruleDistanceUnit )
            // InternalMyLanguage.g:1619:5: lv_posX_2_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getMissionGoalSentAccess().getPosXDistanceUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_posX_2_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionGoalSentRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1636:3: ( (lv_posY_3_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:1637:4: (lv_posY_3_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:1637:4: (lv_posY_3_0= ruleDistanceUnit )
            // InternalMyLanguage.g:1638:5: lv_posY_3_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getMissionGoalSentAccess().getPosYDistanceUnitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_posY_3_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionGoalSentRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1655:3: ( (lv_posZ_4_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:1656:4: (lv_posZ_4_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:1656:4: (lv_posZ_4_0= ruleDistanceUnit )
            // InternalMyLanguage.g:1657:5: lv_posZ_4_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getMissionGoalSentAccess().getPosZDistanceUnitParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_posZ_4_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionGoalSentRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
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
    // $ANTLR end "ruleMissionGoalSent"


    // $ANTLR start "entryRuleMissionRiskLevelSent"
    // InternalMyLanguage.g:1678:1: entryRuleMissionRiskLevelSent returns [EObject current=null] : iv_ruleMissionRiskLevelSent= ruleMissionRiskLevelSent EOF ;
    public final EObject entryRuleMissionRiskLevelSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionRiskLevelSent = null;


        try {
            // InternalMyLanguage.g:1678:61: (iv_ruleMissionRiskLevelSent= ruleMissionRiskLevelSent EOF )
            // InternalMyLanguage.g:1679:2: iv_ruleMissionRiskLevelSent= ruleMissionRiskLevelSent EOF
            {
             newCompositeNode(grammarAccess.getMissionRiskLevelSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionRiskLevelSent=ruleMissionRiskLevelSent();

            state._fsp--;

             current =iv_ruleMissionRiskLevelSent; 
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
    // $ANTLR end "entryRuleMissionRiskLevelSent"


    // $ANTLR start "ruleMissionRiskLevelSent"
    // InternalMyLanguage.g:1685:1: ruleMissionRiskLevelSent returns [EObject current=null] : (otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) ) ) ;
    public final EObject ruleMissionRiskLevelSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_risklevel_2_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1691:2: ( (otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) ) ) )
            // InternalMyLanguage.g:1692:2: (otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) ) )
            {
            // InternalMyLanguage.g:1692:2: (otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) ) )
            // InternalMyLanguage.g:1693:3: otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionRiskLevelSentAccess().getMissionsafetyKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionRiskLevelSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1701:3: ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) )
            // InternalMyLanguage.g:1702:4: (lv_risklevel_2_0= ruleMISSIONRISKLEVEL )
            {
            // InternalMyLanguage.g:1702:4: (lv_risklevel_2_0= ruleMISSIONRISKLEVEL )
            // InternalMyLanguage.g:1703:5: lv_risklevel_2_0= ruleMISSIONRISKLEVEL
            {

            					newCompositeNode(grammarAccess.getMissionRiskLevelSentAccess().getRisklevelMISSIONRISKLEVELParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_risklevel_2_0=ruleMISSIONRISKLEVEL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRiskLevelSentRule());
            					}
            					set(
            						current,
            						"risklevel",
            						lv_risklevel_2_0,
            						"org.xtext.example.mydsl.MyLanguage.MISSIONRISKLEVEL");
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
    // $ANTLR end "ruleMissionRiskLevelSent"


    // $ANTLR start "entryRuleMissionStatusSent"
    // InternalMyLanguage.g:1724:1: entryRuleMissionStatusSent returns [EObject current=null] : iv_ruleMissionStatusSent= ruleMissionStatusSent EOF ;
    public final EObject entryRuleMissionStatusSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionStatusSent = null;


        try {
            // InternalMyLanguage.g:1724:58: (iv_ruleMissionStatusSent= ruleMissionStatusSent EOF )
            // InternalMyLanguage.g:1725:2: iv_ruleMissionStatusSent= ruleMissionStatusSent EOF
            {
             newCompositeNode(grammarAccess.getMissionStatusSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionStatusSent=ruleMissionStatusSent();

            state._fsp--;

             current =iv_ruleMissionStatusSent; 
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
    // $ANTLR end "entryRuleMissionStatusSent"


    // $ANTLR start "ruleMissionStatusSent"
    // InternalMyLanguage.g:1731:1: ruleMissionStatusSent returns [EObject current=null] : (otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) ) ) ;
    public final EObject ruleMissionStatusSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_state_2_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1737:2: ( (otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) ) ) )
            // InternalMyLanguage.g:1738:2: (otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) ) )
            {
            // InternalMyLanguage.g:1738:2: (otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) ) )
            // InternalMyLanguage.g:1739:3: otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionStatusSentAccess().getStatusKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionStatusSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1747:3: ( (lv_state_2_0= ruleMISSIONSTATUS ) )
            // InternalMyLanguage.g:1748:4: (lv_state_2_0= ruleMISSIONSTATUS )
            {
            // InternalMyLanguage.g:1748:4: (lv_state_2_0= ruleMISSIONSTATUS )
            // InternalMyLanguage.g:1749:5: lv_state_2_0= ruleMISSIONSTATUS
            {

            					newCompositeNode(grammarAccess.getMissionStatusSentAccess().getStateMISSIONSTATUSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_2_0=ruleMISSIONSTATUS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionStatusSentRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_2_0,
            						"org.xtext.example.mydsl.MyLanguage.MISSIONSTATUS");
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
    // $ANTLR end "ruleMissionStatusSent"


    // $ANTLR start "entryRuleRobot"
    // InternalMyLanguage.g:1770:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalMyLanguage.g:1770:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalMyLanguage.g:1771:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyLanguage.g:1777:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_RobotAutoPilot_7= ruleRobotAutoPilot ) ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_RobotPositionSent_1 = null;

        EObject this_RobotSpeedSent_2 = null;

        EObject this_RobotStateSent_3 = null;

        EObject this_RobotDistanceSent_4 = null;

        EObject this_RiskSent_5 = null;

        EObject this_PayloadSent_6 = null;

        EObject this_RobotAutoPilot_7 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1783:2: ( (otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_RobotAutoPilot_7= ruleRobotAutoPilot ) ) )
            // InternalMyLanguage.g:1784:2: (otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_RobotAutoPilot_7= ruleRobotAutoPilot ) )
            {
            // InternalMyLanguage.g:1784:2: (otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_RobotAutoPilot_7= ruleRobotAutoPilot ) )
            // InternalMyLanguage.g:1785:3: otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_RobotAutoPilot_7= ruleRobotAutoPilot )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalMyLanguage.g:1789:3: (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_RobotAutoPilot_7= ruleRobotAutoPilot )
            int alt21=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt21=1;
                }
                break;
            case 61:
                {
                alt21=2;
                }
                break;
            case 55:
                {
                alt21=3;
                }
                break;
            case 48:
                {
                alt21=4;
                }
                break;
            case 64:
                {
                alt21=5;
                }
                break;
            case 46:
                {
                alt21=6;
                }
                break;
            case 43:
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyLanguage.g:1790:4: this_RobotPositionSent_1= ruleRobotPositionSent
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getRobotPositionSentParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_RobotPositionSent_1=ruleRobotPositionSent();

                    state._fsp--;


                    				current = this_RobotPositionSent_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1799:4: this_RobotSpeedSent_2= ruleRobotSpeedSent
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getRobotSpeedSentParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_RobotSpeedSent_2=ruleRobotSpeedSent();

                    state._fsp--;


                    				current = this_RobotSpeedSent_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:1808:4: this_RobotStateSent_3= ruleRobotStateSent
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getRobotStateSentParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_RobotStateSent_3=ruleRobotStateSent();

                    state._fsp--;


                    				current = this_RobotStateSent_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:1817:4: this_RobotDistanceSent_4= ruleRobotDistanceSent
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getRobotDistanceSentParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_RobotDistanceSent_4=ruleRobotDistanceSent();

                    state._fsp--;


                    				current = this_RobotDistanceSent_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalMyLanguage.g:1826:4: this_RiskSent_5= ruleRiskSent
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getRiskSentParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_RiskSent_5=ruleRiskSent();

                    state._fsp--;


                    				current = this_RiskSent_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalMyLanguage.g:1835:4: this_PayloadSent_6= rulePayloadSent
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getPayloadSentParserRuleCall_1_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_PayloadSent_6=rulePayloadSent();

                    state._fsp--;


                    				current = this_PayloadSent_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalMyLanguage.g:1844:4: this_RobotAutoPilot_7= ruleRobotAutoPilot
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getRobotAutoPilotParserRuleCall_1_6());
                    			
                    pushFollow(FOLLOW_2);
                    this_RobotAutoPilot_7=ruleRobotAutoPilot();

                    state._fsp--;


                    				current = this_RobotAutoPilot_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleRobotAutoPilot"
    // InternalMyLanguage.g:1857:1: entryRuleRobotAutoPilot returns [EObject current=null] : iv_ruleRobotAutoPilot= ruleRobotAutoPilot EOF ;
    public final EObject entryRuleRobotAutoPilot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotAutoPilot = null;


        try {
            // InternalMyLanguage.g:1857:55: (iv_ruleRobotAutoPilot= ruleRobotAutoPilot EOF )
            // InternalMyLanguage.g:1858:2: iv_ruleRobotAutoPilot= ruleRobotAutoPilot EOF
            {
             newCompositeNode(grammarAccess.getRobotAutoPilotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotAutoPilot=ruleRobotAutoPilot();

            state._fsp--;

             current =iv_ruleRobotAutoPilot; 
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
    // $ANTLR end "entryRuleRobotAutoPilot"


    // $ANTLR start "ruleRobotAutoPilot"
    // InternalMyLanguage.g:1864:1: ruleRobotAutoPilot returns [EObject current=null] : (otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) ) ) ;
    public final EObject ruleRobotAutoPilot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_status_2_1=null;
        Token lv_status_2_2=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:1870:2: ( (otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) ) ) )
            // InternalMyLanguage.g:1871:2: (otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) ) )
            {
            // InternalMyLanguage.g:1871:2: (otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) ) )
            // InternalMyLanguage.g:1872:3: otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAutoPilotAccess().getAutopilotKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAutoPilotAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1880:3: ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) )
            // InternalMyLanguage.g:1881:4: ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) )
            {
            // InternalMyLanguage.g:1881:4: ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) )
            // InternalMyLanguage.g:1882:5: (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' )
            {
            // InternalMyLanguage.g:1882:5: (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            else if ( (LA22_0==45) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyLanguage.g:1883:6: lv_status_2_1= 'ON'
                    {
                    lv_status_2_1=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_status_2_1, grammarAccess.getRobotAutoPilotAccess().getStatusONKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRobotAutoPilotRule());
                    						}
                    						setWithLastConsumed(current, "status", lv_status_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1894:6: lv_status_2_2= 'OFF'
                    {
                    lv_status_2_2=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_status_2_2, grammarAccess.getRobotAutoPilotAccess().getStatusOFFKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRobotAutoPilotRule());
                    						}
                    						setWithLastConsumed(current, "status", lv_status_2_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleRobotAutoPilot"


    // $ANTLR start "entryRulePayloadSent"
    // InternalMyLanguage.g:1911:1: entryRulePayloadSent returns [EObject current=null] : iv_rulePayloadSent= rulePayloadSent EOF ;
    public final EObject entryRulePayloadSent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayloadSent = null;


        try {
            // InternalMyLanguage.g:1911:52: (iv_rulePayloadSent= rulePayloadSent EOF )
            // InternalMyLanguage.g:1912:2: iv_rulePayloadSent= rulePayloadSent EOF
            {
             newCompositeNode(grammarAccess.getPayloadSentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePayloadSent=rulePayloadSent();

            state._fsp--;

             current =iv_rulePayloadSent; 
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
    // $ANTLR end "entryRulePayloadSent"


    // $ANTLR start "rulePayloadSent"
    // InternalMyLanguage.g:1918:1: rulePayloadSent returns [EObject current=null] : ( ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops' ) ;
    public final EObject rulePayloadSent() throws RecognitionException {
        EObject current = null;

        Token lv_load_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:1924:2: ( ( ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops' ) )
            // InternalMyLanguage.g:1925:2: ( ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops' )
            {
            // InternalMyLanguage.g:1925:2: ( ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops' )
            // InternalMyLanguage.g:1926:3: ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops'
            {
            // InternalMyLanguage.g:1926:3: ( (lv_load_0_0= 'payload' ) )
            // InternalMyLanguage.g:1927:4: (lv_load_0_0= 'payload' )
            {
            // InternalMyLanguage.g:1927:4: (lv_load_0_0= 'payload' )
            // InternalMyLanguage.g:1928:5: lv_load_0_0= 'payload'
            {
            lv_load_0_0=(Token)match(input,46,FOLLOW_34); 

            					newLeafNode(lv_load_0_0, grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPayloadSentRule());
            					}
            					setWithLastConsumed(current, "load", lv_load_0_0, "payload");
            				

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPayloadSentAccess().getDropsKeyword_1());
            		

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
    // $ANTLR end "rulePayloadSent"


    // $ANTLR start "entryRuleRobotDistanceSent"
    // InternalMyLanguage.g:1948:1: entryRuleRobotDistanceSent returns [EObject current=null] : iv_ruleRobotDistanceSent= ruleRobotDistanceSent EOF ;
    public final EObject entryRuleRobotDistanceSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotDistanceSent = null;


        try {
            // InternalMyLanguage.g:1948:58: (iv_ruleRobotDistanceSent= ruleRobotDistanceSent EOF )
            // InternalMyLanguage.g:1949:2: iv_ruleRobotDistanceSent= ruleRobotDistanceSent EOF
            {
             newCompositeNode(grammarAccess.getRobotDistanceSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotDistanceSent=ruleRobotDistanceSent();

            state._fsp--;

             current =iv_ruleRobotDistanceSent; 
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
    // $ANTLR end "entryRuleRobotDistanceSent"


    // $ANTLR start "ruleRobotDistanceSent"
    // InternalMyLanguage.g:1955:1: ruleRobotDistanceSent returns [EObject current=null] : (otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) ) ) ;
    public final EObject ruleRobotDistanceSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_sent_2_1 = null;

        EObject lv_sent_2_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1961:2: ( (otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) ) ) )
            // InternalMyLanguage.g:1962:2: (otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) ) )
            {
            // InternalMyLanguage.g:1962:2: (otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) ) )
            // InternalMyLanguage.g:1963:3: otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotDistanceSentAccess().getDistanceKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotDistanceSentAccess().getToKeyword_1());
            		
            // InternalMyLanguage.g:1971:3: ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) )
            // InternalMyLanguage.g:1972:4: ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) )
            {
            // InternalMyLanguage.g:1972:4: ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) )
            // InternalMyLanguage.g:1973:5: (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent )
            {
            // InternalMyLanguage.g:1973:5: (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=83 && LA23_0<=86)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyLanguage.g:1974:6: lv_sent_2_1= ruleDistanceToObstaclesSent
                    {

                    						newCompositeNode(grammarAccess.getRobotDistanceSentAccess().getSentDistanceToObstaclesSentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_1=ruleDistanceToObstaclesSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotDistanceSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_1,
                    							"org.xtext.example.mydsl.MyLanguage.DistanceToObstaclesSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1990:6: lv_sent_2_2= ruleDistanceToLocationSent
                    {

                    						newCompositeNode(grammarAccess.getRobotDistanceSentAccess().getSentDistanceToLocationSentParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_2_2=ruleDistanceToLocationSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotDistanceSentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_2_2,
                    							"org.xtext.example.mydsl.MyLanguage.DistanceToLocationSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleRobotDistanceSent"


    // $ANTLR start "entryRuleDistanceToLocationSent"
    // InternalMyLanguage.g:2012:1: entryRuleDistanceToLocationSent returns [EObject current=null] : iv_ruleDistanceToLocationSent= ruleDistanceToLocationSent EOF ;
    public final EObject entryRuleDistanceToLocationSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceToLocationSent = null;


        try {
            // InternalMyLanguage.g:2012:63: (iv_ruleDistanceToLocationSent= ruleDistanceToLocationSent EOF )
            // InternalMyLanguage.g:2013:2: iv_ruleDistanceToLocationSent= ruleDistanceToLocationSent EOF
            {
             newCompositeNode(grammarAccess.getDistanceToLocationSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceToLocationSent=ruleDistanceToLocationSent();

            state._fsp--;

             current =iv_ruleDistanceToLocationSent; 
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
    // $ANTLR end "entryRuleDistanceToLocationSent"


    // $ANTLR start "ruleDistanceToLocationSent"
    // InternalMyLanguage.g:2019:1: ruleDistanceToLocationSent returns [EObject current=null] : ( ( (lv_posX_0_0= ruleDistanceUnit ) ) ( (lv_posY_1_0= ruleDistanceUnit ) ) ( (lv_posZ_2_0= ruleDistanceUnit ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )? ) ;
    public final EObject ruleDistanceToLocationSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_posX_0_0 = null;

        EObject lv_posY_1_0 = null;

        EObject lv_posZ_2_0 = null;

        EObject lv_body_4_1 = null;

        EObject lv_body_4_2 = null;

        EObject lv_body_4_3 = null;

        EObject lv_tolerance_5_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2025:2: ( ( ( (lv_posX_0_0= ruleDistanceUnit ) ) ( (lv_posY_1_0= ruleDistanceUnit ) ) ( (lv_posZ_2_0= ruleDistanceUnit ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )? ) )
            // InternalMyLanguage.g:2026:2: ( ( (lv_posX_0_0= ruleDistanceUnit ) ) ( (lv_posY_1_0= ruleDistanceUnit ) ) ( (lv_posZ_2_0= ruleDistanceUnit ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )? )
            {
            // InternalMyLanguage.g:2026:2: ( ( (lv_posX_0_0= ruleDistanceUnit ) ) ( (lv_posY_1_0= ruleDistanceUnit ) ) ( (lv_posZ_2_0= ruleDistanceUnit ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )? )
            // InternalMyLanguage.g:2027:3: ( (lv_posX_0_0= ruleDistanceUnit ) ) ( (lv_posY_1_0= ruleDistanceUnit ) ) ( (lv_posZ_2_0= ruleDistanceUnit ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )?
            {
            // InternalMyLanguage.g:2027:3: ( (lv_posX_0_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2028:4: (lv_posX_0_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2028:4: (lv_posX_0_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2029:5: lv_posX_0_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getPosXDistanceUnitParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_posX_0_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_0_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:2046:3: ( (lv_posY_1_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2047:4: (lv_posY_1_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2047:4: (lv_posY_1_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2048:5: lv_posY_1_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getPosYDistanceUnitParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_posY_1_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:2065:3: ( (lv_posZ_2_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2066:4: (lv_posZ_2_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2066:4: (lv_posZ_2_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2067:5: lv_posZ_2_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getPosZDistanceUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_posZ_2_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDistanceToLocationSentAccess().getIsKeyword_3());
            		
            // InternalMyLanguage.g:2088:3: ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:2089:4: ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:2089:4: ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) )
            // InternalMyLanguage.g:2090:5: (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:2090:5: (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt24=1;
                }
                break;
            case 52:
                {
                alt24=2;
                }
                break;
            case 51:
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
                    // InternalMyLanguage.g:2091:6: lv_body_4_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getBodyGreaterSentParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_body_4_1=ruleGreaterSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_4_1,
                    							"org.xtext.example.mydsl.MyLanguage.GreaterSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2107:6: lv_body_4_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getBodyLessSentParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_37);
                    lv_body_4_2=ruleLessSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_4_2,
                    							"org.xtext.example.mydsl.MyLanguage.LessSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2123:6: lv_body_4_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getBodyEqualSentParserRuleCall_4_0_2());
                    					
                    pushFollow(FOLLOW_37);
                    lv_body_4_3=ruleEqualSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_4_3,
                    							"org.xtext.example.mydsl.MyLanguage.EqualSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyLanguage.g:2141:3: ( (lv_tolerance_5_0= ruleToleranceSent ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==58) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyLanguage.g:2142:4: (lv_tolerance_5_0= ruleToleranceSent )
                    {
                    // InternalMyLanguage.g:2142:4: (lv_tolerance_5_0= ruleToleranceSent )
                    // InternalMyLanguage.g:2143:5: lv_tolerance_5_0= ruleToleranceSent
                    {

                    					newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getToleranceToleranceSentParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tolerance_5_0=ruleToleranceSent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
                    					}
                    					set(
                    						current,
                    						"tolerance",
                    						lv_tolerance_5_0,
                    						"org.xtext.example.mydsl.MyLanguage.ToleranceSent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDistanceToLocationSent"


    // $ANTLR start "entryRuleDistanceToObstaclesSent"
    // InternalMyLanguage.g:2164:1: entryRuleDistanceToObstaclesSent returns [EObject current=null] : iv_ruleDistanceToObstaclesSent= ruleDistanceToObstaclesSent EOF ;
    public final EObject entryRuleDistanceToObstaclesSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceToObstaclesSent = null;


        try {
            // InternalMyLanguage.g:2164:64: (iv_ruleDistanceToObstaclesSent= ruleDistanceToObstaclesSent EOF )
            // InternalMyLanguage.g:2165:2: iv_ruleDistanceToObstaclesSent= ruleDistanceToObstaclesSent EOF
            {
             newCompositeNode(grammarAccess.getDistanceToObstaclesSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceToObstaclesSent=ruleDistanceToObstaclesSent();

            state._fsp--;

             current =iv_ruleDistanceToObstaclesSent; 
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
    // $ANTLR end "entryRuleDistanceToObstaclesSent"


    // $ANTLR start "ruleDistanceToObstaclesSent"
    // InternalMyLanguage.g:2171:1: ruleDistanceToObstaclesSent returns [EObject current=null] : (otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )? ) ;
    public final EObject ruleDistanceToObstaclesSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_body_2_1 = null;

        EObject lv_body_2_2 = null;

        EObject lv_body_2_3 = null;

        EObject lv_tolerance_3_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2177:2: ( (otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )? ) )
            // InternalMyLanguage.g:2178:2: (otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )? )
            {
            // InternalMyLanguage.g:2178:2: (otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )? )
            // InternalMyLanguage.g:2179:3: otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceToObstaclesSentAccess().getObstaclesKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceToObstaclesSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:2187:3: ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:2188:4: ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:2188:4: ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) )
            // InternalMyLanguage.g:2189:5: (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:2189:5: (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt26=1;
                }
                break;
            case 52:
                {
                alt26=2;
                }
                break;
            case 51:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyLanguage.g:2190:6: lv_body_2_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToObstaclesSentAccess().getBodyGreaterSentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_body_2_1=ruleGreaterSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceToObstaclesSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_1,
                    							"org.xtext.example.mydsl.MyLanguage.GreaterSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2206:6: lv_body_2_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToObstaclesSentAccess().getBodyLessSentParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_37);
                    lv_body_2_2=ruleLessSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceToObstaclesSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_2,
                    							"org.xtext.example.mydsl.MyLanguage.LessSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2222:6: lv_body_2_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToObstaclesSentAccess().getBodyEqualSentParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_37);
                    lv_body_2_3=ruleEqualSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceToObstaclesSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_3,
                    							"org.xtext.example.mydsl.MyLanguage.EqualSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyLanguage.g:2240:3: ( (lv_tolerance_3_0= ruleToleranceSent ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyLanguage.g:2241:4: (lv_tolerance_3_0= ruleToleranceSent )
                    {
                    // InternalMyLanguage.g:2241:4: (lv_tolerance_3_0= ruleToleranceSent )
                    // InternalMyLanguage.g:2242:5: lv_tolerance_3_0= ruleToleranceSent
                    {

                    					newCompositeNode(grammarAccess.getDistanceToObstaclesSentAccess().getToleranceToleranceSentParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tolerance_3_0=ruleToleranceSent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDistanceToObstaclesSentRule());
                    					}
                    					set(
                    						current,
                    						"tolerance",
                    						lv_tolerance_3_0,
                    						"org.xtext.example.mydsl.MyLanguage.ToleranceSent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDistanceToObstaclesSent"


    // $ANTLR start "entryRuleEqualSent"
    // InternalMyLanguage.g:2263:1: entryRuleEqualSent returns [EObject current=null] : iv_ruleEqualSent= ruleEqualSent EOF ;
    public final EObject entryRuleEqualSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualSent = null;


        try {
            // InternalMyLanguage.g:2263:50: (iv_ruleEqualSent= ruleEqualSent EOF )
            // InternalMyLanguage.g:2264:2: iv_ruleEqualSent= ruleEqualSent EOF
            {
             newCompositeNode(grammarAccess.getEqualSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualSent=ruleEqualSent();

            state._fsp--;

             current =iv_ruleEqualSent; 
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
    // $ANTLR end "entryRuleEqualSent"


    // $ANTLR start "ruleEqualSent"
    // InternalMyLanguage.g:2270:1: ruleEqualSent returns [EObject current=null] : (otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) ) ;
    public final EObject ruleEqualSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_amount_2_1 = null;

        EObject lv_amount_2_2 = null;

        EObject lv_amount_2_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2276:2: ( (otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) ) )
            // InternalMyLanguage.g:2277:2: (otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) )
            {
            // InternalMyLanguage.g:2277:2: (otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) )
            // InternalMyLanguage.g:2278:3: otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualSentAccess().getEqualKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualSentAccess().getToKeyword_1());
            		
            // InternalMyLanguage.g:2286:3: ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) )
            // InternalMyLanguage.g:2287:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) )
            {
            // InternalMyLanguage.g:2287:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) )
            // InternalMyLanguage.g:2288:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit )
            {
            // InternalMyLanguage.g:2288:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt28=1;
                }
                break;
            case 87:
                {
                alt28=2;
                }
                break;
            case 75:
            case 77:
            case 78:
            case 79:
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
                    // InternalMyLanguage.g:2289:6: lv_amount_2_1= ruleDistanceUnit
                    {

                    						newCompositeNode(grammarAccess.getEqualSentAccess().getAmountDistanceUnitParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_amount_2_1=ruleDistanceUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualSentRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_2_1,
                    							"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2305:6: lv_amount_2_2= rulePercentUnit
                    {

                    						newCompositeNode(grammarAccess.getEqualSentAccess().getAmountPercentUnitParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_amount_2_2=rulePercentUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualSentRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_2_2,
                    							"org.xtext.example.mydsl.MyLanguage.PercentUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2321:6: lv_amount_2_3= ruleSpeedUnit
                    {

                    						newCompositeNode(grammarAccess.getEqualSentAccess().getAmountSpeedUnitParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_amount_2_3=ruleSpeedUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualSentRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_2_3,
                    							"org.xtext.example.mydsl.MyLanguage.SpeedUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleEqualSent"


    // $ANTLR start "entryRuleLessSent"
    // InternalMyLanguage.g:2343:1: entryRuleLessSent returns [EObject current=null] : iv_ruleLessSent= ruleLessSent EOF ;
    public final EObject entryRuleLessSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessSent = null;


        try {
            // InternalMyLanguage.g:2343:49: (iv_ruleLessSent= ruleLessSent EOF )
            // InternalMyLanguage.g:2344:2: iv_ruleLessSent= ruleLessSent EOF
            {
             newCompositeNode(grammarAccess.getLessSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLessSent=ruleLessSent();

            state._fsp--;

             current =iv_ruleLessSent; 
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
    // $ANTLR end "entryRuleLessSent"


    // $ANTLR start "ruleLessSent"
    // InternalMyLanguage.g:2350:1: ruleLessSent returns [EObject current=null] : (otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) ) ;
    public final EObject ruleLessSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_amount_2_1 = null;

        EObject lv_amount_2_2 = null;

        EObject lv_amount_2_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2356:2: ( (otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) ) )
            // InternalMyLanguage.g:2357:2: (otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) )
            {
            // InternalMyLanguage.g:2357:2: (otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) )
            // InternalMyLanguage.g:2358:3: otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getLessSentAccess().getLowerKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getLessSentAccess().getThenKeyword_1());
            		
            // InternalMyLanguage.g:2366:3: ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) )
            // InternalMyLanguage.g:2367:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) )
            {
            // InternalMyLanguage.g:2367:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) )
            // InternalMyLanguage.g:2368:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit )
            {
            // InternalMyLanguage.g:2368:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt29=1;
                }
                break;
            case 87:
                {
                alt29=2;
                }
                break;
            case 75:
            case 77:
            case 78:
            case 79:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyLanguage.g:2369:6: lv_amount_2_1= ruleDistanceUnit
                    {

                    						newCompositeNode(grammarAccess.getLessSentAccess().getAmountDistanceUnitParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_amount_2_1=ruleDistanceUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLessSentRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_2_1,
                    							"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2385:6: lv_amount_2_2= rulePercentUnit
                    {

                    						newCompositeNode(grammarAccess.getLessSentAccess().getAmountPercentUnitParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_amount_2_2=rulePercentUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLessSentRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_2_2,
                    							"org.xtext.example.mydsl.MyLanguage.PercentUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2401:6: lv_amount_2_3= ruleSpeedUnit
                    {

                    						newCompositeNode(grammarAccess.getLessSentAccess().getAmountSpeedUnitParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_amount_2_3=ruleSpeedUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLessSentRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_2_3,
                    							"org.xtext.example.mydsl.MyLanguage.SpeedUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleLessSent"


    // $ANTLR start "entryRuleGreaterSent"
    // InternalMyLanguage.g:2423:1: entryRuleGreaterSent returns [EObject current=null] : iv_ruleGreaterSent= ruleGreaterSent EOF ;
    public final EObject entryRuleGreaterSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterSent = null;


        try {
            // InternalMyLanguage.g:2423:52: (iv_ruleGreaterSent= ruleGreaterSent EOF )
            // InternalMyLanguage.g:2424:2: iv_ruleGreaterSent= ruleGreaterSent EOF
            {
             newCompositeNode(grammarAccess.getGreaterSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreaterSent=ruleGreaterSent();

            state._fsp--;

             current =iv_ruleGreaterSent; 
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
    // $ANTLR end "entryRuleGreaterSent"


    // $ANTLR start "ruleGreaterSent"
    // InternalMyLanguage.g:2430:1: ruleGreaterSent returns [EObject current=null] : (otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) ) ;
    public final EObject ruleGreaterSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_amount_2_1 = null;

        EObject lv_amount_2_2 = null;

        EObject lv_amount_2_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2436:2: ( (otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) ) )
            // InternalMyLanguage.g:2437:2: (otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) )
            {
            // InternalMyLanguage.g:2437:2: (otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) ) )
            // InternalMyLanguage.g:2438:3: otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterSentAccess().getGreaterKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getGreaterSentAccess().getThenKeyword_1());
            		
            // InternalMyLanguage.g:2446:3: ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) ) )
            // InternalMyLanguage.g:2447:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) )
            {
            // InternalMyLanguage.g:2447:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit ) )
            // InternalMyLanguage.g:2448:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit )
            {
            // InternalMyLanguage.g:2448:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit | lv_amount_2_3= ruleSpeedUnit )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt30=1;
                }
                break;
            case 87:
                {
                alt30=2;
                }
                break;
            case 75:
            case 77:
            case 78:
            case 79:
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
                    // InternalMyLanguage.g:2449:6: lv_amount_2_1= ruleDistanceUnit
                    {

                    						newCompositeNode(grammarAccess.getGreaterSentAccess().getAmountDistanceUnitParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_amount_2_1=ruleDistanceUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGreaterSentRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_2_1,
                    							"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2465:6: lv_amount_2_2= rulePercentUnit
                    {

                    						newCompositeNode(grammarAccess.getGreaterSentAccess().getAmountPercentUnitParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_amount_2_2=rulePercentUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGreaterSentRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_2_2,
                    							"org.xtext.example.mydsl.MyLanguage.PercentUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2481:6: lv_amount_2_3= ruleSpeedUnit
                    {

                    						newCompositeNode(grammarAccess.getGreaterSentAccess().getAmountSpeedUnitParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_amount_2_3=ruleSpeedUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGreaterSentRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_2_3,
                    							"org.xtext.example.mydsl.MyLanguage.SpeedUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleGreaterSent"


    // $ANTLR start "entryRuleRobotStateSent"
    // InternalMyLanguage.g:2503:1: entryRuleRobotStateSent returns [EObject current=null] : iv_ruleRobotStateSent= ruleRobotStateSent EOF ;
    public final EObject entryRuleRobotStateSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotStateSent = null;


        try {
            // InternalMyLanguage.g:2503:55: (iv_ruleRobotStateSent= ruleRobotStateSent EOF )
            // InternalMyLanguage.g:2504:2: iv_ruleRobotStateSent= ruleRobotStateSent EOF
            {
             newCompositeNode(grammarAccess.getRobotStateSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotStateSent=ruleRobotStateSent();

            state._fsp--;

             current =iv_ruleRobotStateSent; 
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
    // $ANTLR end "entryRuleRobotStateSent"


    // $ANTLR start "ruleRobotStateSent"
    // InternalMyLanguage.g:2510:1: ruleRobotStateSent returns [EObject current=null] : (otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRobotStateSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_state_2_0=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:2516:2: ( (otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) ) ) )
            // InternalMyLanguage.g:2517:2: (otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) ) )
            {
            // InternalMyLanguage.g:2517:2: (otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) ) )
            // InternalMyLanguage.g:2518:3: otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotStateSentAccess().getStateKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotStateSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:2526:3: ( (lv_state_2_0= RULE_ID ) )
            // InternalMyLanguage.g:2527:4: (lv_state_2_0= RULE_ID )
            {
            // InternalMyLanguage.g:2527:4: (lv_state_2_0= RULE_ID )
            // InternalMyLanguage.g:2528:5: lv_state_2_0= RULE_ID
            {
            lv_state_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_state_2_0, grammarAccess.getRobotStateSentAccess().getStateIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotStateSentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"state",
            						lv_state_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleRobotStateSent"


    // $ANTLR start "entryRuleRobotPositionSent"
    // InternalMyLanguage.g:2548:1: entryRuleRobotPositionSent returns [EObject current=null] : iv_ruleRobotPositionSent= ruleRobotPositionSent EOF ;
    public final EObject entryRuleRobotPositionSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotPositionSent = null;


        try {
            // InternalMyLanguage.g:2548:58: (iv_ruleRobotPositionSent= ruleRobotPositionSent EOF )
            // InternalMyLanguage.g:2549:2: iv_ruleRobotPositionSent= ruleRobotPositionSent EOF
            {
             newCompositeNode(grammarAccess.getRobotPositionSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotPositionSent=ruleRobotPositionSent();

            state._fsp--;

             current =iv_ruleRobotPositionSent; 
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
    // $ANTLR end "entryRuleRobotPositionSent"


    // $ANTLR start "ruleRobotPositionSent"
    // InternalMyLanguage.g:2555:1: ruleRobotPositionSent returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) ;
    public final EObject ruleRobotPositionSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_posX_2_0 = null;

        EObject lv_posY_3_0 = null;

        EObject lv_posZ_4_0 = null;

        EObject lv_tolerance_5_1 = null;

        EObject lv_tolerance_5_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2561:2: ( (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) )
            // InternalMyLanguage.g:2562:2: (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            {
            // InternalMyLanguage.g:2562:2: (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            // InternalMyLanguage.g:2563:3: otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDistanceUnit ) ) ( (lv_posY_3_0= ruleDistanceUnit ) ) ( (lv_posZ_4_0= ruleDistanceUnit ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotPositionSentAccess().getPositionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotPositionSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:2571:3: ( (lv_posX_2_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2572:4: (lv_posX_2_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2572:4: (lv_posX_2_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2573:5: lv_posX_2_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getRobotPositionSentAccess().getPosXDistanceUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_posX_2_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotPositionSentRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:2590:3: ( (lv_posY_3_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2591:4: (lv_posY_3_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2591:4: (lv_posY_3_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2592:5: lv_posY_3_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getRobotPositionSentAccess().getPosYDistanceUnitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_posY_3_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotPositionSentRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:2609:3: ( (lv_posZ_4_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2610:4: (lv_posZ_4_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2610:4: (lv_posZ_4_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2611:5: lv_posZ_4_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getRobotPositionSentAccess().getPosZDistanceUnitParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_posZ_4_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotPositionSentRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:2628:3: ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==56) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyLanguage.g:2629:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    {
                    // InternalMyLanguage.g:2629:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    // InternalMyLanguage.g:2630:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:2630:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==56) ) {
                        int LA31_1 = input.LA(2);

                        if ( (LA31_1==60) ) {
                            alt31=2;
                        }
                        else if ( (LA31_1==57) ) {
                            alt31=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalMyLanguage.g:2631:6: lv_tolerance_5_1= ruleCirclePosition
                            {

                            						newCompositeNode(grammarAccess.getRobotPositionSentAccess().getToleranceCirclePositionParserRuleCall_5_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_tolerance_5_1=ruleCirclePosition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getRobotPositionSentRule());
                            						}
                            						set(
                            							current,
                            							"tolerance",
                            							lv_tolerance_5_1,
                            							"org.xtext.example.mydsl.MyLanguage.CirclePosition");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyLanguage.g:2647:6: lv_tolerance_5_2= ruleSpherePosition
                            {

                            						newCompositeNode(grammarAccess.getRobotPositionSentAccess().getToleranceSpherePositionParserRuleCall_5_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            lv_tolerance_5_2=ruleSpherePosition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getRobotPositionSentRule());
                            						}
                            						set(
                            							current,
                            							"tolerance",
                            							lv_tolerance_5_2,
                            							"org.xtext.example.mydsl.MyLanguage.SpherePosition");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleRobotPositionSent"


    // $ANTLR start "entryRuleCirclePosition"
    // InternalMyLanguage.g:2669:1: entryRuleCirclePosition returns [EObject current=null] : iv_ruleCirclePosition= ruleCirclePosition EOF ;
    public final EObject entryRuleCirclePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCirclePosition = null;


        try {
            // InternalMyLanguage.g:2669:55: (iv_ruleCirclePosition= ruleCirclePosition EOF )
            // InternalMyLanguage.g:2670:2: iv_ruleCirclePosition= ruleCirclePosition EOF
            {
             newCompositeNode(grammarAccess.getCirclePositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCirclePosition=ruleCirclePosition();

            state._fsp--;

             current =iv_ruleCirclePosition; 
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
    // $ANTLR end "entryRuleCirclePosition"


    // $ANTLR start "ruleCirclePosition"
    // InternalMyLanguage.g:2676:1: ruleCirclePosition returns [EObject current=null] : (otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleCirclePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_tolerance_4_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2682:2: ( (otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) ) )
            // InternalMyLanguage.g:2683:2: (otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) )
            {
            // InternalMyLanguage.g:2683:2: (otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) )
            // InternalMyLanguage.g:2684:3: otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getCirclePositionAccess().getWithinKeyword_0());
            		
            otherlv_1=(Token)match(input,57,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getCirclePositionAccess().getCircleKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getCirclePositionAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCirclePositionAccess().getRadiusKeyword_3());
            		
            // InternalMyLanguage.g:2700:3: ( (lv_tolerance_4_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2701:4: (lv_tolerance_4_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2701:4: (lv_tolerance_4_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2702:5: lv_tolerance_4_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getCirclePositionAccess().getToleranceDistanceUnitParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tolerance_4_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCirclePositionRule());
            					}
            					set(
            						current,
            						"tolerance",
            						lv_tolerance_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
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
    // $ANTLR end "ruleCirclePosition"


    // $ANTLR start "entryRuleSpherePosition"
    // InternalMyLanguage.g:2723:1: entryRuleSpherePosition returns [EObject current=null] : iv_ruleSpherePosition= ruleSpherePosition EOF ;
    public final EObject entryRuleSpherePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpherePosition = null;


        try {
            // InternalMyLanguage.g:2723:55: (iv_ruleSpherePosition= ruleSpherePosition EOF )
            // InternalMyLanguage.g:2724:2: iv_ruleSpherePosition= ruleSpherePosition EOF
            {
             newCompositeNode(grammarAccess.getSpherePositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpherePosition=ruleSpherePosition();

            state._fsp--;

             current =iv_ruleSpherePosition; 
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
    // $ANTLR end "entryRuleSpherePosition"


    // $ANTLR start "ruleSpherePosition"
    // InternalMyLanguage.g:2730:1: ruleSpherePosition returns [EObject current=null] : (otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleSpherePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_tolerance_4_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2736:2: ( (otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) ) )
            // InternalMyLanguage.g:2737:2: (otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) )
            {
            // InternalMyLanguage.g:2737:2: (otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) )
            // InternalMyLanguage.g:2738:3: otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getSpherePositionAccess().getWithinKeyword_0());
            		
            otherlv_1=(Token)match(input,60,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getSpherePositionAccess().getSphereKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getSpherePositionAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSpherePositionAccess().getRadiusKeyword_3());
            		
            // InternalMyLanguage.g:2754:3: ( (lv_tolerance_4_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2755:4: (lv_tolerance_4_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2755:4: (lv_tolerance_4_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2756:5: lv_tolerance_4_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getSpherePositionAccess().getToleranceDistanceUnitParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tolerance_4_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpherePositionRule());
            					}
            					set(
            						current,
            						"tolerance",
            						lv_tolerance_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
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
    // $ANTLR end "ruleSpherePosition"


    // $ANTLR start "entryRuleRobotSpeedSent"
    // InternalMyLanguage.g:2777:1: entryRuleRobotSpeedSent returns [EObject current=null] : iv_ruleRobotSpeedSent= ruleRobotSpeedSent EOF ;
    public final EObject entryRuleRobotSpeedSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotSpeedSent = null;


        try {
            // InternalMyLanguage.g:2777:55: (iv_ruleRobotSpeedSent= ruleRobotSpeedSent EOF )
            // InternalMyLanguage.g:2778:2: iv_ruleRobotSpeedSent= ruleRobotSpeedSent EOF
            {
             newCompositeNode(grammarAccess.getRobotSpeedSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotSpeedSent=ruleRobotSpeedSent();

            state._fsp--;

             current =iv_ruleRobotSpeedSent; 
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
    // $ANTLR end "entryRuleRobotSpeedSent"


    // $ANTLR start "ruleRobotSpeedSent"
    // InternalMyLanguage.g:2784:1: ruleRobotSpeedSent returns [EObject current=null] : (otherlv_0= 'speed' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ) ;
    public final EObject ruleRobotSpeedSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_body_2_1 = null;

        EObject lv_body_2_2 = null;

        EObject lv_body_2_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2790:2: ( (otherlv_0= 'speed' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ) )
            // InternalMyLanguage.g:2791:2: (otherlv_0= 'speed' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) )
            {
            // InternalMyLanguage.g:2791:2: (otherlv_0= 'speed' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) )
            // InternalMyLanguage.g:2792:3: otherlv_0= 'speed' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotSpeedSentAccess().getSpeedKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotSpeedSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:2800:3: ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:2801:4: ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:2801:4: ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) )
            // InternalMyLanguage.g:2802:5: (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:2802:5: (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt33=1;
                }
                break;
            case 52:
                {
                alt33=2;
                }
                break;
            case 51:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyLanguage.g:2803:6: lv_body_2_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getRobotSpeedSentAccess().getBodyGreaterSentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_2_1=ruleGreaterSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotSpeedSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_1,
                    							"org.xtext.example.mydsl.MyLanguage.GreaterSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2819:6: lv_body_2_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getRobotSpeedSentAccess().getBodyLessSentParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_2_2=ruleLessSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotSpeedSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_2,
                    							"org.xtext.example.mydsl.MyLanguage.LessSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2835:6: lv_body_2_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getRobotSpeedSentAccess().getBodyEqualSentParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_2_3=ruleEqualSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotSpeedSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_3,
                    							"org.xtext.example.mydsl.MyLanguage.EqualSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleRobotSpeedSent"


    // $ANTLR start "entryRuleEnvironmentSent"
    // InternalMyLanguage.g:2857:1: entryRuleEnvironmentSent returns [EObject current=null] : iv_ruleEnvironmentSent= ruleEnvironmentSent EOF ;
    public final EObject entryRuleEnvironmentSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentSent = null;


        try {
            // InternalMyLanguage.g:2857:56: (iv_ruleEnvironmentSent= ruleEnvironmentSent EOF )
            // InternalMyLanguage.g:2858:2: iv_ruleEnvironmentSent= ruleEnvironmentSent EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentSent=ruleEnvironmentSent();

            state._fsp--;

             current =iv_ruleEnvironmentSent; 
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
    // $ANTLR end "entryRuleEnvironmentSent"


    // $ANTLR start "ruleEnvironmentSent"
    // InternalMyLanguage.g:2864:1: ruleEnvironmentSent returns [EObject current=null] : (otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) ) ) ;
    public final EObject ruleEnvironmentSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_body_3_1 = null;

        EObject lv_body_3_2 = null;

        EObject lv_body_3_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2870:2: ( (otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) ) ) )
            // InternalMyLanguage.g:2871:2: (otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) ) )
            {
            // InternalMyLanguage.g:2871:2: (otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) ) )
            // InternalMyLanguage.g:2872:3: otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentSentAccess().getEnvironmentKeyword_0());
            		
            otherlv_1=(Token)match(input,63,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentSentAccess().getWindspeedKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentSentAccess().getIsKeyword_2());
            		
            // InternalMyLanguage.g:2884:3: ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:2885:4: ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:2885:4: ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) )
            // InternalMyLanguage.g:2886:5: (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:2886:5: (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt34=1;
                }
                break;
            case 52:
                {
                alt34=2;
                }
                break;
            case 51:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalMyLanguage.g:2887:6: lv_body_3_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentSentAccess().getBodyGreaterSentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_3_1=ruleGreaterSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_3_1,
                    							"org.xtext.example.mydsl.MyLanguage.GreaterSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2903:6: lv_body_3_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentSentAccess().getBodyLessSentParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_3_2=ruleLessSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_3_2,
                    							"org.xtext.example.mydsl.MyLanguage.LessSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2919:6: lv_body_3_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentSentAccess().getBodyEqualSentParserRuleCall_3_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_3_3=ruleEqualSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentSentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_3_3,
                    							"org.xtext.example.mydsl.MyLanguage.EqualSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleEnvironmentSent"


    // $ANTLR start "entryRuleRiskSent"
    // InternalMyLanguage.g:2941:1: entryRuleRiskSent returns [EObject current=null] : iv_ruleRiskSent= ruleRiskSent EOF ;
    public final EObject entryRuleRiskSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRiskSent = null;


        try {
            // InternalMyLanguage.g:2941:49: (iv_ruleRiskSent= ruleRiskSent EOF )
            // InternalMyLanguage.g:2942:2: iv_ruleRiskSent= ruleRiskSent EOF
            {
             newCompositeNode(grammarAccess.getRiskSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRiskSent=ruleRiskSent();

            state._fsp--;

             current =iv_ruleRiskSent; 
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
    // $ANTLR end "entryRuleRiskSent"


    // $ANTLR start "ruleRiskSent"
    // InternalMyLanguage.g:2948:1: ruleRiskSent returns [EObject current=null] : (otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) ) ) ;
    public final EObject ruleRiskSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_level_2_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2954:2: ( (otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) ) ) )
            // InternalMyLanguage.g:2955:2: (otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) ) )
            {
            // InternalMyLanguage.g:2955:2: (otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) ) )
            // InternalMyLanguage.g:2956:3: otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRiskSentAccess().getCollisionriskKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getRiskSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:2964:3: ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) )
            // InternalMyLanguage.g:2965:4: (lv_level_2_0= ruleCOLLISIONRISKLEVEL )
            {
            // InternalMyLanguage.g:2965:4: (lv_level_2_0= ruleCOLLISIONRISKLEVEL )
            // InternalMyLanguage.g:2966:5: lv_level_2_0= ruleCOLLISIONRISKLEVEL
            {

            					newCompositeNode(grammarAccess.getRiskSentAccess().getLevelCOLLISIONRISKLEVELParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_level_2_0=ruleCOLLISIONRISKLEVEL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiskSentRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_2_0,
            						"org.xtext.example.mydsl.MyLanguage.COLLISIONRISKLEVEL");
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
    // $ANTLR end "ruleRiskSent"


    // $ANTLR start "entryRuleToleranceSent"
    // InternalMyLanguage.g:2987:1: entryRuleToleranceSent returns [EObject current=null] : iv_ruleToleranceSent= ruleToleranceSent EOF ;
    public final EObject entryRuleToleranceSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToleranceSent = null;


        try {
            // InternalMyLanguage.g:2987:54: (iv_ruleToleranceSent= ruleToleranceSent EOF )
            // InternalMyLanguage.g:2988:2: iv_ruleToleranceSent= ruleToleranceSent EOF
            {
             newCompositeNode(grammarAccess.getToleranceSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToleranceSent=ruleToleranceSent();

            state._fsp--;

             current =iv_ruleToleranceSent; 
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
    // $ANTLR end "entryRuleToleranceSent"


    // $ANTLR start "ruleToleranceSent"
    // InternalMyLanguage.g:2994:1: ruleToleranceSent returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleToleranceSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3000:2: ( (otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) ) ) )
            // InternalMyLanguage.g:3001:2: (otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) ) )
            {
            // InternalMyLanguage.g:3001:2: (otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) ) )
            // InternalMyLanguage.g:3002:3: otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getToleranceSentAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getToleranceSentAccess().getToleranceKeyword_1());
            		
            // InternalMyLanguage.g:3010:3: ( (lv_unit_2_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:3011:4: (lv_unit_2_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:3011:4: (lv_unit_2_0= ruleDistanceUnit )
            // InternalMyLanguage.g:3012:5: lv_unit_2_0= ruleDistanceUnit
            {

            					newCompositeNode(grammarAccess.getToleranceSentAccess().getUnitDistanceUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_2_0=ruleDistanceUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getToleranceSentRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DistanceUnit");
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
    // $ANTLR end "ruleToleranceSent"


    // $ANTLR start "entryRuleMISSIONSTATUS"
    // InternalMyLanguage.g:3033:1: entryRuleMISSIONSTATUS returns [String current=null] : iv_ruleMISSIONSTATUS= ruleMISSIONSTATUS EOF ;
    public final String entryRuleMISSIONSTATUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMISSIONSTATUS = null;


        try {
            // InternalMyLanguage.g:3033:53: (iv_ruleMISSIONSTATUS= ruleMISSIONSTATUS EOF )
            // InternalMyLanguage.g:3034:2: iv_ruleMISSIONSTATUS= ruleMISSIONSTATUS EOF
            {
             newCompositeNode(grammarAccess.getMISSIONSTATUSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMISSIONSTATUS=ruleMISSIONSTATUS();

            state._fsp--;

             current =iv_ruleMISSIONSTATUS.getText(); 
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
    // $ANTLR end "entryRuleMISSIONSTATUS"


    // $ANTLR start "ruleMISSIONSTATUS"
    // InternalMyLanguage.g:3040:1: ruleMISSIONSTATUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ACTIVE' | kw= 'UNACTIVE' | kw= 'PAUSED' ) ;
    public final AntlrDatatypeRuleToken ruleMISSIONSTATUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:3046:2: ( (kw= 'ACTIVE' | kw= 'UNACTIVE' | kw= 'PAUSED' ) )
            // InternalMyLanguage.g:3047:2: (kw= 'ACTIVE' | kw= 'UNACTIVE' | kw= 'PAUSED' )
            {
            // InternalMyLanguage.g:3047:2: (kw= 'ACTIVE' | kw= 'UNACTIVE' | kw= 'PAUSED' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt35=1;
                }
                break;
            case 67:
                {
                alt35=2;
                }
                break;
            case 68:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMyLanguage.g:3048:3: kw= 'ACTIVE'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMISSIONSTATUSAccess().getACTIVEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:3054:3: kw= 'UNACTIVE'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMISSIONSTATUSAccess().getUNACTIVEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:3060:3: kw= 'PAUSED'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMISSIONSTATUSAccess().getPAUSEDKeyword_2());
                    		

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
    // $ANTLR end "ruleMISSIONSTATUS"


    // $ANTLR start "entryRuleMISSIONRISKLEVEL"
    // InternalMyLanguage.g:3069:1: entryRuleMISSIONRISKLEVEL returns [String current=null] : iv_ruleMISSIONRISKLEVEL= ruleMISSIONRISKLEVEL EOF ;
    public final String entryRuleMISSIONRISKLEVEL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMISSIONRISKLEVEL = null;


        try {
            // InternalMyLanguage.g:3069:56: (iv_ruleMISSIONRISKLEVEL= ruleMISSIONRISKLEVEL EOF )
            // InternalMyLanguage.g:3070:2: iv_ruleMISSIONRISKLEVEL= ruleMISSIONRISKLEVEL EOF
            {
             newCompositeNode(grammarAccess.getMISSIONRISKLEVELRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMISSIONRISKLEVEL=ruleMISSIONRISKLEVEL();

            state._fsp--;

             current =iv_ruleMISSIONRISKLEVEL.getText(); 
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
    // $ANTLR end "entryRuleMISSIONRISKLEVEL"


    // $ANTLR start "ruleMISSIONRISKLEVEL"
    // InternalMyLanguage.g:3076:1: ruleMISSIONRISKLEVEL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SAFE' | kw= 'UNSAFE' ) ;
    public final AntlrDatatypeRuleToken ruleMISSIONRISKLEVEL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:3082:2: ( (kw= 'SAFE' | kw= 'UNSAFE' ) )
            // InternalMyLanguage.g:3083:2: (kw= 'SAFE' | kw= 'UNSAFE' )
            {
            // InternalMyLanguage.g:3083:2: (kw= 'SAFE' | kw= 'UNSAFE' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==69) ) {
                alt36=1;
            }
            else if ( (LA36_0==70) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyLanguage.g:3084:3: kw= 'SAFE'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMISSIONRISKLEVELAccess().getSAFEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:3090:3: kw= 'UNSAFE'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMISSIONRISKLEVELAccess().getUNSAFEKeyword_1());
                    		

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
    // $ANTLR end "ruleMISSIONRISKLEVEL"


    // $ANTLR start "entryRuleCOLLISIONRISKLEVEL"
    // InternalMyLanguage.g:3099:1: entryRuleCOLLISIONRISKLEVEL returns [String current=null] : iv_ruleCOLLISIONRISKLEVEL= ruleCOLLISIONRISKLEVEL EOF ;
    public final String entryRuleCOLLISIONRISKLEVEL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOLLISIONRISKLEVEL = null;


        try {
            // InternalMyLanguage.g:3099:58: (iv_ruleCOLLISIONRISKLEVEL= ruleCOLLISIONRISKLEVEL EOF )
            // InternalMyLanguage.g:3100:2: iv_ruleCOLLISIONRISKLEVEL= ruleCOLLISIONRISKLEVEL EOF
            {
             newCompositeNode(grammarAccess.getCOLLISIONRISKLEVELRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOLLISIONRISKLEVEL=ruleCOLLISIONRISKLEVEL();

            state._fsp--;

             current =iv_ruleCOLLISIONRISKLEVEL.getText(); 
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
    // $ANTLR end "entryRuleCOLLISIONRISKLEVEL"


    // $ANTLR start "ruleCOLLISIONRISKLEVEL"
    // InternalMyLanguage.g:3106:1: ruleCOLLISIONRISKLEVEL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SAFE' | kw= 'WARNING' | kw= 'CRITICAL' ) ;
    public final AntlrDatatypeRuleToken ruleCOLLISIONRISKLEVEL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:3112:2: ( (kw= 'SAFE' | kw= 'WARNING' | kw= 'CRITICAL' ) )
            // InternalMyLanguage.g:3113:2: (kw= 'SAFE' | kw= 'WARNING' | kw= 'CRITICAL' )
            {
            // InternalMyLanguage.g:3113:2: (kw= 'SAFE' | kw= 'WARNING' | kw= 'CRITICAL' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt37=1;
                }
                break;
            case 71:
                {
                alt37=2;
                }
                break;
            case 72:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMyLanguage.g:3114:3: kw= 'SAFE'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOLLISIONRISKLEVELAccess().getSAFEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:3120:3: kw= 'WARNING'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOLLISIONRISKLEVELAccess().getWARNINGKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:3126:3: kw= 'CRITICAL'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOLLISIONRISKLEVELAccess().getCRITICALKeyword_2());
                    		

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
    // $ANTLR end "ruleCOLLISIONRISKLEVEL"


    // $ANTLR start "entryRuleCOMPSTATUS"
    // InternalMyLanguage.g:3135:1: entryRuleCOMPSTATUS returns [String current=null] : iv_ruleCOMPSTATUS= ruleCOMPSTATUS EOF ;
    public final String entryRuleCOMPSTATUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMPSTATUS = null;


        try {
            // InternalMyLanguage.g:3135:50: (iv_ruleCOMPSTATUS= ruleCOMPSTATUS EOF )
            // InternalMyLanguage.g:3136:2: iv_ruleCOMPSTATUS= ruleCOMPSTATUS EOF
            {
             newCompositeNode(grammarAccess.getCOMPSTATUSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOMPSTATUS=ruleCOMPSTATUS();

            state._fsp--;

             current =iv_ruleCOMPSTATUS.getText(); 
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
    // $ANTLR end "entryRuleCOMPSTATUS"


    // $ANTLR start "ruleCOMPSTATUS"
    // InternalMyLanguage.g:3142:1: ruleCOMPSTATUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ACTIVE' | kw= 'FAILING' | kw= 'REDUNDANT' ) ;
    public final AntlrDatatypeRuleToken ruleCOMPSTATUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:3148:2: ( (kw= 'ACTIVE' | kw= 'FAILING' | kw= 'REDUNDANT' ) )
            // InternalMyLanguage.g:3149:2: (kw= 'ACTIVE' | kw= 'FAILING' | kw= 'REDUNDANT' )
            {
            // InternalMyLanguage.g:3149:2: (kw= 'ACTIVE' | kw= 'FAILING' | kw= 'REDUNDANT' )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt38=1;
                }
                break;
            case 73:
                {
                alt38=2;
                }
                break;
            case 74:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMyLanguage.g:3150:3: kw= 'ACTIVE'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPSTATUSAccess().getACTIVEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:3156:3: kw= 'FAILING'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPSTATUSAccess().getFAILINGKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:3162:3: kw= 'REDUNDANT'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPSTATUSAccess().getREDUNDANTKeyword_2());
                    		

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
    // $ANTLR end "ruleCOMPSTATUS"


    // $ANTLR start "entryRuleSpeedUnit"
    // InternalMyLanguage.g:3171:1: entryRuleSpeedUnit returns [EObject current=null] : iv_ruleSpeedUnit= ruleSpeedUnit EOF ;
    public final EObject entryRuleSpeedUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedUnit = null;


        try {
            // InternalMyLanguage.g:3171:50: (iv_ruleSpeedUnit= ruleSpeedUnit EOF )
            // InternalMyLanguage.g:3172:2: iv_ruleSpeedUnit= ruleSpeedUnit EOF
            {
             newCompositeNode(grammarAccess.getSpeedUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeedUnit=ruleSpeedUnit();

            state._fsp--;

             current =iv_ruleSpeedUnit; 
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
    // $ANTLR end "entryRuleSpeedUnit"


    // $ANTLR start "ruleSpeedUnit"
    // InternalMyLanguage.g:3178:1: ruleSpeedUnit returns [EObject current=null] : (this_MS_0= ruleMS | this_KMS_1= ruleKMS | this_MH_2= ruleMH | this_KMH_3= ruleKMH ) ;
    public final EObject ruleSpeedUnit() throws RecognitionException {
        EObject current = null;

        EObject this_MS_0 = null;

        EObject this_KMS_1 = null;

        EObject this_MH_2 = null;

        EObject this_KMH_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3184:2: ( (this_MS_0= ruleMS | this_KMS_1= ruleKMS | this_MH_2= ruleMH | this_KMH_3= ruleKMH ) )
            // InternalMyLanguage.g:3185:2: (this_MS_0= ruleMS | this_KMS_1= ruleKMS | this_MH_2= ruleMH | this_KMH_3= ruleKMH )
            {
            // InternalMyLanguage.g:3185:2: (this_MS_0= ruleMS | this_KMS_1= ruleKMS | this_MH_2= ruleMH | this_KMH_3= ruleKMH )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt39=1;
                }
                break;
            case 77:
                {
                alt39=2;
                }
                break;
            case 78:
                {
                alt39=3;
                }
                break;
            case 79:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMyLanguage.g:3186:3: this_MS_0= ruleMS
                    {

                    			newCompositeNode(grammarAccess.getSpeedUnitAccess().getMSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MS_0=ruleMS();

                    state._fsp--;


                    			current = this_MS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:3195:3: this_KMS_1= ruleKMS
                    {

                    			newCompositeNode(grammarAccess.getSpeedUnitAccess().getKMSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KMS_1=ruleKMS();

                    state._fsp--;


                    			current = this_KMS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:3204:3: this_MH_2= ruleMH
                    {

                    			newCompositeNode(grammarAccess.getSpeedUnitAccess().getMHParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MH_2=ruleMH();

                    state._fsp--;


                    			current = this_MH_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:3213:3: this_KMH_3= ruleKMH
                    {

                    			newCompositeNode(grammarAccess.getSpeedUnitAccess().getKMHParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_KMH_3=ruleKMH();

                    state._fsp--;


                    			current = this_KMH_3;
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
    // $ANTLR end "ruleSpeedUnit"


    // $ANTLR start "entryRuleMS"
    // InternalMyLanguage.g:3225:1: entryRuleMS returns [EObject current=null] : iv_ruleMS= ruleMS EOF ;
    public final EObject entryRuleMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMS = null;


        try {
            // InternalMyLanguage.g:3225:43: (iv_ruleMS= ruleMS EOF )
            // InternalMyLanguage.g:3226:2: iv_ruleMS= ruleMS EOF
            {
             newCompositeNode(grammarAccess.getMSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMS=ruleMS();

            state._fsp--;

             current =iv_ruleMS; 
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
    // $ANTLR end "entryRuleMS"


    // $ANTLR start "ruleMS"
    // InternalMyLanguage.g:3232:1: ruleMS returns [EObject current=null] : (otherlv_0= 'm/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) ;
    public final EObject ruleMS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;

        AntlrDatatypeRuleToken lv_z_5_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3238:2: ( (otherlv_0= 'm/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) )
            // InternalMyLanguage.g:3239:2: (otherlv_0= 'm/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            {
            // InternalMyLanguage.g:3239:2: (otherlv_0= 'm/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            // InternalMyLanguage.g:3240:3: otherlv_0= 'm/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getMSAccess().getMSKeyword_0());
            		
            // InternalMyLanguage.g:3244:3: ( (lv_x_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3245:4: (lv_x_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3245:4: (lv_x_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3246:5: lv_x_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMSAccess().getXDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_x_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMSRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getMSAccess().getCommaKeyword_2());
            		
            // InternalMyLanguage.g:3267:3: ( (lv_y_3_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3268:4: (lv_y_3_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3268:4: (lv_y_3_0= ruleDOUBLE )
            // InternalMyLanguage.g:3269:5: lv_y_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMSAccess().getYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_y_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMSRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getMSAccess().getCommaKeyword_4());
            		
            // InternalMyLanguage.g:3290:3: ( (lv_z_5_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3291:4: (lv_z_5_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3291:4: (lv_z_5_0= ruleDOUBLE )
            // InternalMyLanguage.g:3292:5: lv_z_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMSAccess().getZDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_48);
            lv_z_5_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMSRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_5_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMSAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleMS"


    // $ANTLR start "entryRuleKMS"
    // InternalMyLanguage.g:3317:1: entryRuleKMS returns [EObject current=null] : iv_ruleKMS= ruleKMS EOF ;
    public final EObject entryRuleKMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKMS = null;


        try {
            // InternalMyLanguage.g:3317:44: (iv_ruleKMS= ruleKMS EOF )
            // InternalMyLanguage.g:3318:2: iv_ruleKMS= ruleKMS EOF
            {
             newCompositeNode(grammarAccess.getKMSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKMS=ruleKMS();

            state._fsp--;

             current =iv_ruleKMS; 
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
    // $ANTLR end "entryRuleKMS"


    // $ANTLR start "ruleKMS"
    // InternalMyLanguage.g:3324:1: ruleKMS returns [EObject current=null] : (otherlv_0= 'km/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) ;
    public final EObject ruleKMS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;

        AntlrDatatypeRuleToken lv_z_5_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3330:2: ( (otherlv_0= 'km/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) )
            // InternalMyLanguage.g:3331:2: (otherlv_0= 'km/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            {
            // InternalMyLanguage.g:3331:2: (otherlv_0= 'km/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            // InternalMyLanguage.g:3332:3: otherlv_0= 'km/s(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getKMSAccess().getKmSKeyword_0());
            		
            // InternalMyLanguage.g:3336:3: ( (lv_x_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3337:4: (lv_x_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3337:4: (lv_x_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3338:5: lv_x_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getKMSAccess().getXDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_x_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKMSRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getKMSAccess().getCommaKeyword_2());
            		
            // InternalMyLanguage.g:3359:3: ( (lv_y_3_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3360:4: (lv_y_3_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3360:4: (lv_y_3_0= ruleDOUBLE )
            // InternalMyLanguage.g:3361:5: lv_y_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getKMSAccess().getYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_y_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKMSRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getKMSAccess().getCommaKeyword_4());
            		
            // InternalMyLanguage.g:3382:3: ( (lv_z_5_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3383:4: (lv_z_5_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3383:4: (lv_z_5_0= ruleDOUBLE )
            // InternalMyLanguage.g:3384:5: lv_z_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getKMSAccess().getZDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_48);
            lv_z_5_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKMSRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_5_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getKMSAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleKMS"


    // $ANTLR start "entryRuleMH"
    // InternalMyLanguage.g:3409:1: entryRuleMH returns [EObject current=null] : iv_ruleMH= ruleMH EOF ;
    public final EObject entryRuleMH() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMH = null;


        try {
            // InternalMyLanguage.g:3409:43: (iv_ruleMH= ruleMH EOF )
            // InternalMyLanguage.g:3410:2: iv_ruleMH= ruleMH EOF
            {
             newCompositeNode(grammarAccess.getMHRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMH=ruleMH();

            state._fsp--;

             current =iv_ruleMH; 
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
    // $ANTLR end "entryRuleMH"


    // $ANTLR start "ruleMH"
    // InternalMyLanguage.g:3416:1: ruleMH returns [EObject current=null] : (otherlv_0= 'm/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) ;
    public final EObject ruleMH() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;

        AntlrDatatypeRuleToken lv_z_5_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3422:2: ( (otherlv_0= 'm/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) )
            // InternalMyLanguage.g:3423:2: (otherlv_0= 'm/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            {
            // InternalMyLanguage.g:3423:2: (otherlv_0= 'm/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            // InternalMyLanguage.g:3424:3: otherlv_0= 'm/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getMHAccess().getMHKeyword_0());
            		
            // InternalMyLanguage.g:3428:3: ( (lv_x_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3429:4: (lv_x_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3429:4: (lv_x_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3430:5: lv_x_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMHAccess().getXDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_x_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMHRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getMHAccess().getCommaKeyword_2());
            		
            // InternalMyLanguage.g:3451:3: ( (lv_y_3_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3452:4: (lv_y_3_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3452:4: (lv_y_3_0= ruleDOUBLE )
            // InternalMyLanguage.g:3453:5: lv_y_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMHAccess().getYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_y_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMHRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getMHAccess().getCommaKeyword_4());
            		
            // InternalMyLanguage.g:3474:3: ( (lv_z_5_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3475:4: (lv_z_5_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3475:4: (lv_z_5_0= ruleDOUBLE )
            // InternalMyLanguage.g:3476:5: lv_z_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMHAccess().getZDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_48);
            lv_z_5_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMHRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_5_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMHAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleMH"


    // $ANTLR start "entryRuleKMH"
    // InternalMyLanguage.g:3501:1: entryRuleKMH returns [EObject current=null] : iv_ruleKMH= ruleKMH EOF ;
    public final EObject entryRuleKMH() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKMH = null;


        try {
            // InternalMyLanguage.g:3501:44: (iv_ruleKMH= ruleKMH EOF )
            // InternalMyLanguage.g:3502:2: iv_ruleKMH= ruleKMH EOF
            {
             newCompositeNode(grammarAccess.getKMHRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKMH=ruleKMH();

            state._fsp--;

             current =iv_ruleKMH; 
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
    // $ANTLR end "entryRuleKMH"


    // $ANTLR start "ruleKMH"
    // InternalMyLanguage.g:3508:1: ruleKMH returns [EObject current=null] : (otherlv_0= 'km/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) ;
    public final EObject ruleKMH() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;

        AntlrDatatypeRuleToken lv_z_5_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3514:2: ( (otherlv_0= 'km/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) )
            // InternalMyLanguage.g:3515:2: (otherlv_0= 'km/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            {
            // InternalMyLanguage.g:3515:2: (otherlv_0= 'km/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            // InternalMyLanguage.g:3516:3: otherlv_0= 'km/h(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getKMHAccess().getKmHKeyword_0());
            		
            // InternalMyLanguage.g:3520:3: ( (lv_x_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3521:4: (lv_x_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3521:4: (lv_x_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3522:5: lv_x_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getKMHAccess().getXDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_x_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKMHRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getKMHAccess().getCommaKeyword_2());
            		
            // InternalMyLanguage.g:3543:3: ( (lv_y_3_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3544:4: (lv_y_3_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3544:4: (lv_y_3_0= ruleDOUBLE )
            // InternalMyLanguage.g:3545:5: lv_y_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getKMHAccess().getYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_y_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKMHRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getKMHAccess().getCommaKeyword_4());
            		
            // InternalMyLanguage.g:3566:3: ( (lv_z_5_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3567:4: (lv_z_5_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3567:4: (lv_z_5_0= ruleDOUBLE )
            // InternalMyLanguage.g:3568:5: lv_z_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getKMHAccess().getZDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_48);
            lv_z_5_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKMHRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_5_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getKMHAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleKMH"


    // $ANTLR start "entryRuleDistanceUnit"
    // InternalMyLanguage.g:3593:1: entryRuleDistanceUnit returns [EObject current=null] : iv_ruleDistanceUnit= ruleDistanceUnit EOF ;
    public final EObject entryRuleDistanceUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceUnit = null;


        try {
            // InternalMyLanguage.g:3593:53: (iv_ruleDistanceUnit= ruleDistanceUnit EOF )
            // InternalMyLanguage.g:3594:2: iv_ruleDistanceUnit= ruleDistanceUnit EOF
            {
             newCompositeNode(grammarAccess.getDistanceUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceUnit=ruleDistanceUnit();

            state._fsp--;

             current =iv_ruleDistanceUnit; 
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
    // $ANTLR end "entryRuleDistanceUnit"


    // $ANTLR start "ruleDistanceUnit"
    // InternalMyLanguage.g:3600:1: ruleDistanceUnit returns [EObject current=null] : (this_METER_0= ruleMETER | this_CENTIMETER_1= ruleCENTIMETER | this_MILLIMETER_2= ruleMILLIMETER | this_KILOMETER_3= ruleKILOMETER ) ;
    public final EObject ruleDistanceUnit() throws RecognitionException {
        EObject current = null;

        EObject this_METER_0 = null;

        EObject this_CENTIMETER_1 = null;

        EObject this_MILLIMETER_2 = null;

        EObject this_KILOMETER_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3606:2: ( (this_METER_0= ruleMETER | this_CENTIMETER_1= ruleCENTIMETER | this_MILLIMETER_2= ruleMILLIMETER | this_KILOMETER_3= ruleKILOMETER ) )
            // InternalMyLanguage.g:3607:2: (this_METER_0= ruleMETER | this_CENTIMETER_1= ruleCENTIMETER | this_MILLIMETER_2= ruleMILLIMETER | this_KILOMETER_3= ruleKILOMETER )
            {
            // InternalMyLanguage.g:3607:2: (this_METER_0= ruleMETER | this_CENTIMETER_1= ruleCENTIMETER | this_MILLIMETER_2= ruleMILLIMETER | this_KILOMETER_3= ruleKILOMETER )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt40=1;
                }
                break;
            case 84:
                {
                alt40=2;
                }
                break;
            case 85:
                {
                alt40=3;
                }
                break;
            case 86:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMyLanguage.g:3608:3: this_METER_0= ruleMETER
                    {

                    			newCompositeNode(grammarAccess.getDistanceUnitAccess().getMETERParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_METER_0=ruleMETER();

                    state._fsp--;


                    			current = this_METER_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:3617:3: this_CENTIMETER_1= ruleCENTIMETER
                    {

                    			newCompositeNode(grammarAccess.getDistanceUnitAccess().getCENTIMETERParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CENTIMETER_1=ruleCENTIMETER();

                    state._fsp--;


                    			current = this_CENTIMETER_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:3626:3: this_MILLIMETER_2= ruleMILLIMETER
                    {

                    			newCompositeNode(grammarAccess.getDistanceUnitAccess().getMILLIMETERParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MILLIMETER_2=ruleMILLIMETER();

                    state._fsp--;


                    			current = this_MILLIMETER_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:3635:3: this_KILOMETER_3= ruleKILOMETER
                    {

                    			newCompositeNode(grammarAccess.getDistanceUnitAccess().getKILOMETERParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_KILOMETER_3=ruleKILOMETER();

                    state._fsp--;


                    			current = this_KILOMETER_3;
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
    // $ANTLR end "ruleDistanceUnit"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalMyLanguage.g:3647:1: entryRuleTimeUnit returns [EObject current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final EObject entryRuleTimeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnit = null;


        try {
            // InternalMyLanguage.g:3647:49: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalMyLanguage.g:3648:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;

             current =iv_ruleTimeUnit; 
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
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalMyLanguage.g:3654:1: ruleTimeUnit returns [EObject current=null] : (this_SECONDS_0= ruleSECONDS | this_HOUR_1= ruleHOUR | this_MINUTES_2= ruleMINUTES ) ;
    public final EObject ruleTimeUnit() throws RecognitionException {
        EObject current = null;

        EObject this_SECONDS_0 = null;

        EObject this_HOUR_1 = null;

        EObject this_MINUTES_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3660:2: ( (this_SECONDS_0= ruleSECONDS | this_HOUR_1= ruleHOUR | this_MINUTES_2= ruleMINUTES ) )
            // InternalMyLanguage.g:3661:2: (this_SECONDS_0= ruleSECONDS | this_HOUR_1= ruleHOUR | this_MINUTES_2= ruleMINUTES )
            {
            // InternalMyLanguage.g:3661:2: (this_SECONDS_0= ruleSECONDS | this_HOUR_1= ruleHOUR | this_MINUTES_2= ruleMINUTES )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt41=1;
                }
                break;
            case 81:
                {
                alt41=2;
                }
                break;
            case 82:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMyLanguage.g:3662:3: this_SECONDS_0= ruleSECONDS
                    {

                    			newCompositeNode(grammarAccess.getTimeUnitAccess().getSECONDSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SECONDS_0=ruleSECONDS();

                    state._fsp--;


                    			current = this_SECONDS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:3671:3: this_HOUR_1= ruleHOUR
                    {

                    			newCompositeNode(grammarAccess.getTimeUnitAccess().getHOURParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HOUR_1=ruleHOUR();

                    state._fsp--;


                    			current = this_HOUR_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:3680:3: this_MINUTES_2= ruleMINUTES
                    {

                    			newCompositeNode(grammarAccess.getTimeUnitAccess().getMINUTESParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MINUTES_2=ruleMINUTES();

                    state._fsp--;


                    			current = this_MINUTES_2;
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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleSECONDS"
    // InternalMyLanguage.g:3692:1: entryRuleSECONDS returns [EObject current=null] : iv_ruleSECONDS= ruleSECONDS EOF ;
    public final EObject entryRuleSECONDS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSECONDS = null;


        try {
            // InternalMyLanguage.g:3692:48: (iv_ruleSECONDS= ruleSECONDS EOF )
            // InternalMyLanguage.g:3693:2: iv_ruleSECONDS= ruleSECONDS EOF
            {
             newCompositeNode(grammarAccess.getSECONDSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSECONDS=ruleSECONDS();

            state._fsp--;

             current =iv_ruleSECONDS; 
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
    // $ANTLR end "entryRuleSECONDS"


    // $ANTLR start "ruleSECONDS"
    // InternalMyLanguage.g:3699:1: ruleSECONDS returns [EObject current=null] : (otherlv_0= 'seconds(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' ) ;
    public final EObject ruleSECONDS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3705:2: ( (otherlv_0= 'seconds(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:3706:2: (otherlv_0= 'seconds(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:3706:2: (otherlv_0= 'seconds(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:3707:3: otherlv_0= 'seconds(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getSECONDSAccess().getSecondsKeyword_0());
            		
            // InternalMyLanguage.g:3711:3: ( (lv_value_1_0= rulePositiveDouble ) )
            // InternalMyLanguage.g:3712:4: (lv_value_1_0= rulePositiveDouble )
            {
            // InternalMyLanguage.g:3712:4: (lv_value_1_0= rulePositiveDouble )
            // InternalMyLanguage.g:3713:5: lv_value_1_0= rulePositiveDouble
            {

            					newCompositeNode(grammarAccess.getSECONDSAccess().getValuePositiveDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_value_1_0=rulePositiveDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSECONDSRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.PositiveDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSECONDSAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleSECONDS"


    // $ANTLR start "entryRuleHOUR"
    // InternalMyLanguage.g:3738:1: entryRuleHOUR returns [EObject current=null] : iv_ruleHOUR= ruleHOUR EOF ;
    public final EObject entryRuleHOUR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHOUR = null;


        try {
            // InternalMyLanguage.g:3738:45: (iv_ruleHOUR= ruleHOUR EOF )
            // InternalMyLanguage.g:3739:2: iv_ruleHOUR= ruleHOUR EOF
            {
             newCompositeNode(grammarAccess.getHOURRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHOUR=ruleHOUR();

            state._fsp--;

             current =iv_ruleHOUR; 
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
    // $ANTLR end "entryRuleHOUR"


    // $ANTLR start "ruleHOUR"
    // InternalMyLanguage.g:3745:1: ruleHOUR returns [EObject current=null] : (otherlv_0= 'hours(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' ) ;
    public final EObject ruleHOUR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3751:2: ( (otherlv_0= 'hours(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:3752:2: (otherlv_0= 'hours(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:3752:2: (otherlv_0= 'hours(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:3753:3: otherlv_0= 'hours(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getHOURAccess().getHoursKeyword_0());
            		
            // InternalMyLanguage.g:3757:3: ( (lv_value_1_0= rulePositiveDouble ) )
            // InternalMyLanguage.g:3758:4: (lv_value_1_0= rulePositiveDouble )
            {
            // InternalMyLanguage.g:3758:4: (lv_value_1_0= rulePositiveDouble )
            // InternalMyLanguage.g:3759:5: lv_value_1_0= rulePositiveDouble
            {

            					newCompositeNode(grammarAccess.getHOURAccess().getValuePositiveDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_value_1_0=rulePositiveDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHOURRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.PositiveDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getHOURAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleHOUR"


    // $ANTLR start "entryRuleMINUTES"
    // InternalMyLanguage.g:3784:1: entryRuleMINUTES returns [EObject current=null] : iv_ruleMINUTES= ruleMINUTES EOF ;
    public final EObject entryRuleMINUTES() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMINUTES = null;


        try {
            // InternalMyLanguage.g:3784:48: (iv_ruleMINUTES= ruleMINUTES EOF )
            // InternalMyLanguage.g:3785:2: iv_ruleMINUTES= ruleMINUTES EOF
            {
             newCompositeNode(grammarAccess.getMINUTESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMINUTES=ruleMINUTES();

            state._fsp--;

             current =iv_ruleMINUTES; 
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
    // $ANTLR end "entryRuleMINUTES"


    // $ANTLR start "ruleMINUTES"
    // InternalMyLanguage.g:3791:1: ruleMINUTES returns [EObject current=null] : (otherlv_0= 'minutes(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' ) ;
    public final EObject ruleMINUTES() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3797:2: ( (otherlv_0= 'minutes(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:3798:2: (otherlv_0= 'minutes(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:3798:2: (otherlv_0= 'minutes(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:3799:3: otherlv_0= 'minutes(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getMINUTESAccess().getMinutesKeyword_0());
            		
            // InternalMyLanguage.g:3803:3: ( (lv_value_1_0= rulePositiveDouble ) )
            // InternalMyLanguage.g:3804:4: (lv_value_1_0= rulePositiveDouble )
            {
            // InternalMyLanguage.g:3804:4: (lv_value_1_0= rulePositiveDouble )
            // InternalMyLanguage.g:3805:5: lv_value_1_0= rulePositiveDouble
            {

            					newCompositeNode(grammarAccess.getMINUTESAccess().getValuePositiveDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_value_1_0=rulePositiveDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMINUTESRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.PositiveDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMINUTESAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleMINUTES"


    // $ANTLR start "entryRuleMETER"
    // InternalMyLanguage.g:3830:1: entryRuleMETER returns [EObject current=null] : iv_ruleMETER= ruleMETER EOF ;
    public final EObject entryRuleMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMETER = null;


        try {
            // InternalMyLanguage.g:3830:46: (iv_ruleMETER= ruleMETER EOF )
            // InternalMyLanguage.g:3831:2: iv_ruleMETER= ruleMETER EOF
            {
             newCompositeNode(grammarAccess.getMETERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMETER=ruleMETER();

            state._fsp--;

             current =iv_ruleMETER; 
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
    // $ANTLR end "entryRuleMETER"


    // $ANTLR start "ruleMETER"
    // InternalMyLanguage.g:3837:1: ruleMETER returns [EObject current=null] : (otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleMETER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3843:2: ( (otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:3844:2: (otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:3844:2: (otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:3845:3: otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getMETERAccess().getMeterKeyword_0());
            		
            // InternalMyLanguage.g:3849:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3850:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3850:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3851:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMETERAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMETERRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMETERAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleMETER"


    // $ANTLR start "entryRuleCENTIMETER"
    // InternalMyLanguage.g:3876:1: entryRuleCENTIMETER returns [EObject current=null] : iv_ruleCENTIMETER= ruleCENTIMETER EOF ;
    public final EObject entryRuleCENTIMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCENTIMETER = null;


        try {
            // InternalMyLanguage.g:3876:51: (iv_ruleCENTIMETER= ruleCENTIMETER EOF )
            // InternalMyLanguage.g:3877:2: iv_ruleCENTIMETER= ruleCENTIMETER EOF
            {
             newCompositeNode(grammarAccess.getCENTIMETERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCENTIMETER=ruleCENTIMETER();

            state._fsp--;

             current =iv_ruleCENTIMETER; 
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
    // $ANTLR end "entryRuleCENTIMETER"


    // $ANTLR start "ruleCENTIMETER"
    // InternalMyLanguage.g:3883:1: ruleCENTIMETER returns [EObject current=null] : (otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleCENTIMETER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3889:2: ( (otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:3890:2: (otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:3890:2: (otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:3891:3: otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getCENTIMETERAccess().getCentimeterKeyword_0());
            		
            // InternalMyLanguage.g:3895:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3896:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3896:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3897:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getCENTIMETERAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCENTIMETERRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCENTIMETERAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleCENTIMETER"


    // $ANTLR start "entryRuleMILLIMETER"
    // InternalMyLanguage.g:3922:1: entryRuleMILLIMETER returns [EObject current=null] : iv_ruleMILLIMETER= ruleMILLIMETER EOF ;
    public final EObject entryRuleMILLIMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMILLIMETER = null;


        try {
            // InternalMyLanguage.g:3922:51: (iv_ruleMILLIMETER= ruleMILLIMETER EOF )
            // InternalMyLanguage.g:3923:2: iv_ruleMILLIMETER= ruleMILLIMETER EOF
            {
             newCompositeNode(grammarAccess.getMILLIMETERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMILLIMETER=ruleMILLIMETER();

            state._fsp--;

             current =iv_ruleMILLIMETER; 
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
    // $ANTLR end "entryRuleMILLIMETER"


    // $ANTLR start "ruleMILLIMETER"
    // InternalMyLanguage.g:3929:1: ruleMILLIMETER returns [EObject current=null] : (otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleMILLIMETER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3935:2: ( (otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:3936:2: (otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:3936:2: (otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:3937:3: otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getMILLIMETERAccess().getMillimeterKeyword_0());
            		
            // InternalMyLanguage.g:3941:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3942:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3942:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3943:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMILLIMETERAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMILLIMETERRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMILLIMETERAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleMILLIMETER"


    // $ANTLR start "entryRuleKILOMETER"
    // InternalMyLanguage.g:3968:1: entryRuleKILOMETER returns [EObject current=null] : iv_ruleKILOMETER= ruleKILOMETER EOF ;
    public final EObject entryRuleKILOMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKILOMETER = null;


        try {
            // InternalMyLanguage.g:3968:50: (iv_ruleKILOMETER= ruleKILOMETER EOF )
            // InternalMyLanguage.g:3969:2: iv_ruleKILOMETER= ruleKILOMETER EOF
            {
             newCompositeNode(grammarAccess.getKILOMETERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKILOMETER=ruleKILOMETER();

            state._fsp--;

             current =iv_ruleKILOMETER; 
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
    // $ANTLR end "entryRuleKILOMETER"


    // $ANTLR start "ruleKILOMETER"
    // InternalMyLanguage.g:3975:1: ruleKILOMETER returns [EObject current=null] : (otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleKILOMETER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3981:2: ( (otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:3982:2: (otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:3982:2: (otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:3983:3: otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getKILOMETERAccess().getKilometerKeyword_0());
            		
            // InternalMyLanguage.g:3987:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3988:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3988:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3989:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getKILOMETERAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKILOMETERRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getKILOMETERAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleKILOMETER"


    // $ANTLR start "entryRulePercentUnit"
    // InternalMyLanguage.g:4014:1: entryRulePercentUnit returns [EObject current=null] : iv_rulePercentUnit= rulePercentUnit EOF ;
    public final EObject entryRulePercentUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePercentUnit = null;


        try {
            // InternalMyLanguage.g:4014:52: (iv_rulePercentUnit= rulePercentUnit EOF )
            // InternalMyLanguage.g:4015:2: iv_rulePercentUnit= rulePercentUnit EOF
            {
             newCompositeNode(grammarAccess.getPercentUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePercentUnit=rulePercentUnit();

            state._fsp--;

             current =iv_rulePercentUnit; 
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
    // $ANTLR end "entryRulePercentUnit"


    // $ANTLR start "rulePercentUnit"
    // InternalMyLanguage.g:4021:1: rulePercentUnit returns [EObject current=null] : (otherlv_0= 'percent(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' ) ;
    public final EObject rulePercentUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:4027:2: ( (otherlv_0= 'percent(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:4028:2: (otherlv_0= 'percent(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:4028:2: (otherlv_0= 'percent(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:4029:3: otherlv_0= 'percent(' ( (lv_value_1_0= rulePositiveDouble ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getPercentUnitAccess().getPercentKeyword_0());
            		
            // InternalMyLanguage.g:4033:3: ( (lv_value_1_0= rulePositiveDouble ) )
            // InternalMyLanguage.g:4034:4: (lv_value_1_0= rulePositiveDouble )
            {
            // InternalMyLanguage.g:4034:4: (lv_value_1_0= rulePositiveDouble )
            // InternalMyLanguage.g:4035:5: lv_value_1_0= rulePositiveDouble
            {

            					newCompositeNode(grammarAccess.getPercentUnitAccess().getValuePositiveDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_value_1_0=rulePositiveDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPercentUnitRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.PositiveDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPercentUnitAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "rulePercentUnit"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalMyLanguage.g:4060:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalMyLanguage.g:4060:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalMyLanguage.g:4061:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalMyLanguage.g:4067:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:4073:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalMyLanguage.g:4074:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalMyLanguage.g:4074:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalMyLanguage.g:4075:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalMyLanguage.g:4075:3: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==88) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyLanguage.g:4076:4: kw= '-'
                    {
                    kw=(Token)match(input,88,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_49); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1());
            		
            // InternalMyLanguage.g:4089:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==89) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyLanguage.g:4090:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,89,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulePositiveDouble"
    // InternalMyLanguage.g:4107:1: entryRulePositiveDouble returns [String current=null] : iv_rulePositiveDouble= rulePositiveDouble EOF ;
    public final String entryRulePositiveDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePositiveDouble = null;


        try {
            // InternalMyLanguage.g:4107:54: (iv_rulePositiveDouble= rulePositiveDouble EOF )
            // InternalMyLanguage.g:4108:2: iv_rulePositiveDouble= rulePositiveDouble EOF
            {
             newCompositeNode(grammarAccess.getPositiveDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveDouble=rulePositiveDouble();

            state._fsp--;

             current =iv_rulePositiveDouble.getText(); 
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
    // $ANTLR end "entryRulePositiveDouble"


    // $ANTLR start "rulePositiveDouble"
    // InternalMyLanguage.g:4114:1: rulePositiveDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken rulePositiveDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:4120:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalMyLanguage.g:4121:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalMyLanguage.g:4121:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalMyLanguage.g:4122:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_49); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPositiveDoubleAccess().getINTTerminalRuleCall_0());
            		
            // InternalMyLanguage.g:4129:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==89) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyLanguage.g:4130:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,89,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPositiveDoubleAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getPositiveDoubleAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

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
    // $ANTLR end "rulePositiveDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x400004940AA10000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000604L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0058000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800500000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000030000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2081482000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F8E800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001A0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000040L,0x0000000001000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});

}