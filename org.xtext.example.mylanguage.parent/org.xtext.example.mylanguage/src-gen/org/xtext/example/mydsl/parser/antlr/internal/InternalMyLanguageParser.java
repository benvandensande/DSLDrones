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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Test:'", "'Description:'", "'Given:'", "'Then:'", "'When:'", "'Notification'", "'status'", "'is'", "'sent'", "'Time'", "'interval'", "'in'", "'['", "','", "']'", "'Battery'", "'level'", "'Person'", "'position'", "'number'", "'Mission'", "'goal'", "'missionsafety'", "'Robot'", "'autopilot'", "'ON'", "'OFF'", "'used'", "'as'", "'redundant'", "'component'", "'payload'", "'drops'", "'distance'", "'to'", "'obstacles'", "'equal'", "'lower'", "'then'", "'greater'", "'state'", "'within'", "'circle'", "'with'", "'radius'", "'sphere'", "'speed'", "'Environment'", "'windspeed'", "'fails'", "'collisionrisk'", "'tolerance'", "'ACTIVE'", "'UNACTIVE'", "'PAUSED'", "'SAFE'", "'UNSAFE'", "'WARNING'", "'CRITICAL'", "'motor'", "'camera'", "'GPS'", "'battery'", "'barometer'", "'scanner'", "'sonar'", "'seconds('", "')'", "'hours('", "'minutes('", "'meter('", "'centimeter('", "'millimeter('", "'kilometer('", "'percent('", "'.'"
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
    public static final int T__86=86;
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
    // InternalMyLanguage.g:320:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'When:' ( (lv_body_1_0= ruleStatementBody ) ) ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:326:2: ( (otherlv_0= 'When:' ( (lv_body_1_0= ruleStatementBody ) ) ) )
            // InternalMyLanguage.g:327:2: (otherlv_0= 'When:' ( (lv_body_1_0= ruleStatementBody ) ) )
            {
            // InternalMyLanguage.g:327:2: (otherlv_0= 'When:' ( (lv_body_1_0= ruleStatementBody ) ) )
            // InternalMyLanguage.g:328:3: otherlv_0= 'When:' ( (lv_body_1_0= ruleStatementBody ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            // InternalMyLanguage.g:332:3: ( (lv_body_1_0= ruleStatementBody ) )
            // InternalMyLanguage.g:333:4: (lv_body_1_0= ruleStatementBody )
            {
            // InternalMyLanguage.g:333:4: (lv_body_1_0= ruleStatementBody )
            // InternalMyLanguage.g:334:5: lv_body_1_0= ruleStatementBody
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getBodyStatementBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleStatementBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleStatementBody"
    // InternalMyLanguage.g:355:1: entryRuleStatementBody returns [EObject current=null] : iv_ruleStatementBody= ruleStatementBody EOF ;
    public final EObject entryRuleStatementBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBody = null;


        try {
            // InternalMyLanguage.g:355:54: (iv_ruleStatementBody= ruleStatementBody EOF )
            // InternalMyLanguage.g:356:2: iv_ruleStatementBody= ruleStatementBody EOF
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
    // InternalMyLanguage.g:362:1: ruleStatementBody returns [EObject current=null] : (this_Robot_0= ruleRobot | this_EnvironmentSent_1= ruleEnvironmentSent | this_TimeSent_2= ruleTimeSent | this_PeopleSent_3= rulePeopleSent | this_MissionSent_4= ruleMissionSent | this_NotificationSent_5= ruleNotificationSent | this_BatterySent_6= ruleBatterySent ) ;
    public final EObject ruleStatementBody() throws RecognitionException {
        EObject current = null;

        EObject this_Robot_0 = null;

        EObject this_EnvironmentSent_1 = null;

        EObject this_TimeSent_2 = null;

        EObject this_PeopleSent_3 = null;

        EObject this_MissionSent_4 = null;

        EObject this_NotificationSent_5 = null;

        EObject this_BatterySent_6 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:368:2: ( (this_Robot_0= ruleRobot | this_EnvironmentSent_1= ruleEnvironmentSent | this_TimeSent_2= ruleTimeSent | this_PeopleSent_3= rulePeopleSent | this_MissionSent_4= ruleMissionSent | this_NotificationSent_5= ruleNotificationSent | this_BatterySent_6= ruleBatterySent ) )
            // InternalMyLanguage.g:369:2: (this_Robot_0= ruleRobot | this_EnvironmentSent_1= ruleEnvironmentSent | this_TimeSent_2= ruleTimeSent | this_PeopleSent_3= rulePeopleSent | this_MissionSent_4= ruleMissionSent | this_NotificationSent_5= ruleNotificationSent | this_BatterySent_6= ruleBatterySent )
            {
            // InternalMyLanguage.g:369:2: (this_Robot_0= ruleRobot | this_EnvironmentSent_1= ruleEnvironmentSent | this_TimeSent_2= ruleTimeSent | this_PeopleSent_3= rulePeopleSent | this_MissionSent_4= ruleMissionSent | this_NotificationSent_5= ruleNotificationSent | this_BatterySent_6= ruleBatterySent )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 58:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyLanguage.g:370:3: this_Robot_0= ruleRobot
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
                    // InternalMyLanguage.g:379:3: this_EnvironmentSent_1= ruleEnvironmentSent
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
                    // InternalMyLanguage.g:388:3: this_TimeSent_2= ruleTimeSent
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
                    // InternalMyLanguage.g:397:3: this_PeopleSent_3= rulePeopleSent
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
                    // InternalMyLanguage.g:406:3: this_MissionSent_4= ruleMissionSent
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
                    // InternalMyLanguage.g:415:3: this_NotificationSent_5= ruleNotificationSent
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
                    // InternalMyLanguage.g:424:3: this_BatterySent_6= ruleBatterySent
                    {

                    			newCompositeNode(grammarAccess.getStatementBodyAccess().getBatterySentParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BatterySent_6=ruleBatterySent();

                    state._fsp--;


                    			current = this_BatterySent_6;
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


    // $ANTLR start "entryRuleNotificationSent"
    // InternalMyLanguage.g:436:1: entryRuleNotificationSent returns [EObject current=null] : iv_ruleNotificationSent= ruleNotificationSent EOF ;
    public final EObject entryRuleNotificationSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotificationSent = null;


        try {
            // InternalMyLanguage.g:436:57: (iv_ruleNotificationSent= ruleNotificationSent EOF )
            // InternalMyLanguage.g:437:2: iv_ruleNotificationSent= ruleNotificationSent EOF
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
    // InternalMyLanguage.g:443:1: ruleNotificationSent returns [EObject current=null] : ( ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent' ) ;
    public final EObject ruleNotificationSent() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:449:2: ( ( ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent' ) )
            // InternalMyLanguage.g:450:2: ( ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent' )
            {
            // InternalMyLanguage.g:450:2: ( ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent' )
            // InternalMyLanguage.g:451:3: ( (lv_not_0_0= 'Notification' ) ) otherlv_1= 'status' otherlv_2= 'is' otherlv_3= 'sent'
            {
            // InternalMyLanguage.g:451:3: ( (lv_not_0_0= 'Notification' ) )
            // InternalMyLanguage.g:452:4: (lv_not_0_0= 'Notification' )
            {
            // InternalMyLanguage.g:452:4: (lv_not_0_0= 'Notification' )
            // InternalMyLanguage.g:453:5: lv_not_0_0= 'Notification'
            {
            lv_not_0_0=(Token)match(input,16,FOLLOW_9); 

            					newLeafNode(lv_not_0_0, grammarAccess.getNotificationSentAccess().getNotNotificationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotificationSentRule());
            					}
            					setWithLastConsumed(current, "not", lv_not_0_0, "Notification");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getNotificationSentAccess().getStatusKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getNotificationSentAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMyLanguage.g:481:1: entryRuleTimeSent returns [EObject current=null] : iv_ruleTimeSent= ruleTimeSent EOF ;
    public final EObject entryRuleTimeSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSent = null;


        try {
            // InternalMyLanguage.g:481:49: (iv_ruleTimeSent= ruleTimeSent EOF )
            // InternalMyLanguage.g:482:2: iv_ruleTimeSent= ruleTimeSent EOF
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
    // InternalMyLanguage.g:488:1: ruleTimeSent returns [EObject current=null] : (otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval ) ;
    public final EObject ruleTimeSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TimeInterval_1 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:494:2: ( (otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval ) )
            // InternalMyLanguage.g:495:2: (otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval )
            {
            // InternalMyLanguage.g:495:2: (otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval )
            // InternalMyLanguage.g:496:3: otherlv_0= 'Time' this_TimeInterval_1= ruleTimeInterval
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

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
    // InternalMyLanguage.g:512:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalMyLanguage.g:512:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalMyLanguage.g:513:2: iv_ruleTimeInterval= ruleTimeInterval EOF
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
    // InternalMyLanguage.g:519:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']' ) ;
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
            // InternalMyLanguage.g:525:2: ( (otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']' ) )
            // InternalMyLanguage.g:526:2: (otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']' )
            {
            // InternalMyLanguage.g:526:2: (otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']' )
            // InternalMyLanguage.g:527:3: otherlv_0= 'interval' otherlv_1= 'in' otherlv_2= '[' ( (lv_first_3_0= ruleTimeUnit ) ) otherlv_4= ',' ( (lv_second_5_0= ruleTimeUnit ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getInKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyLanguage.g:539:3: ( (lv_first_3_0= ruleTimeUnit ) )
            // InternalMyLanguage.g:540:4: (lv_first_3_0= ruleTimeUnit )
            {
            // InternalMyLanguage.g:540:4: (lv_first_3_0= ruleTimeUnit )
            // InternalMyLanguage.g:541:5: lv_first_3_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getTimeIntervalAccess().getFirstTimeUnitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_4=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeIntervalAccess().getCommaKeyword_4());
            		
            // InternalMyLanguage.g:562:3: ( (lv_second_5_0= ruleTimeUnit ) )
            // InternalMyLanguage.g:563:4: (lv_second_5_0= ruleTimeUnit )
            {
            // InternalMyLanguage.g:563:4: (lv_second_5_0= ruleTimeUnit )
            // InternalMyLanguage.g:564:5: lv_second_5_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getTimeIntervalAccess().getSecondTimeUnitParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyLanguage.g:589:1: entryRuleBatterySent returns [EObject current=null] : iv_ruleBatterySent= ruleBatterySent EOF ;
    public final EObject entryRuleBatterySent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatterySent = null;


        try {
            // InternalMyLanguage.g:589:52: (iv_ruleBatterySent= ruleBatterySent EOF )
            // InternalMyLanguage.g:590:2: iv_ruleBatterySent= ruleBatterySent EOF
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
    // InternalMyLanguage.g:596:1: ruleBatterySent returns [EObject current=null] : (otherlv_0= 'Battery' otherlv_1= 'level' otherlv_2= 'is' ( ( (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent ) ) ) ) ;
    public final EObject ruleBatterySent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_sent_3_1 = null;

        EObject lv_sent_3_2 = null;

        EObject lv_sent_3_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:602:2: ( (otherlv_0= 'Battery' otherlv_1= 'level' otherlv_2= 'is' ( ( (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent ) ) ) ) )
            // InternalMyLanguage.g:603:2: (otherlv_0= 'Battery' otherlv_1= 'level' otherlv_2= 'is' ( ( (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent ) ) ) )
            {
            // InternalMyLanguage.g:603:2: (otherlv_0= 'Battery' otherlv_1= 'level' otherlv_2= 'is' ( ( (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent ) ) ) )
            // InternalMyLanguage.g:604:3: otherlv_0= 'Battery' otherlv_1= 'level' otherlv_2= 'is' ( ( (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getBatterySentAccess().getBatteryKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBatterySentAccess().getLevelKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getBatterySentAccess().getIsKeyword_2());
            		
            // InternalMyLanguage.g:616:3: ( ( (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:617:4: ( (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:617:4: ( (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent ) )
            // InternalMyLanguage.g:618:5: (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:618:5: (lv_sent_3_1= ruleGreaterSent | lv_sent_3_2= ruleLessSent | lv_sent_3_3= ruleEqualSent )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt6=1;
                }
                break;
            case 48:
                {
                alt6=2;
                }
                break;
            case 47:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyLanguage.g:619:6: lv_sent_3_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getBatterySentAccess().getSentGreaterSentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_3_1=ruleGreaterSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatterySentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_3_1,
                    							"org.xtext.example.mydsl.MyLanguage.GreaterSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:635:6: lv_sent_3_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getBatterySentAccess().getSentLessSentParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_3_2=ruleLessSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatterySentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_3_2,
                    							"org.xtext.example.mydsl.MyLanguage.LessSent");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:651:6: lv_sent_3_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getBatterySentAccess().getSentEqualSentParserRuleCall_3_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sent_3_3=ruleEqualSent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatterySentRule());
                    						}
                    						set(
                    							current,
                    							"sent",
                    							lv_sent_3_3,
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
    // $ANTLR end "ruleBatterySent"


    // $ANTLR start "entryRulePeopleSent"
    // InternalMyLanguage.g:673:1: entryRulePeopleSent returns [EObject current=null] : iv_rulePeopleSent= rulePeopleSent EOF ;
    public final EObject entryRulePeopleSent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeopleSent = null;


        try {
            // InternalMyLanguage.g:673:51: (iv_rulePeopleSent= rulePeopleSent EOF )
            // InternalMyLanguage.g:674:2: iv_rulePeopleSent= rulePeopleSent EOF
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
    // InternalMyLanguage.g:680:1: rulePeopleSent returns [EObject current=null] : (otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent ) ) ;
    public final EObject rulePeopleSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_PeopleNumbSent_1 = null;

        EObject this_PeoplePosSent_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:686:2: ( (otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent ) ) )
            // InternalMyLanguage.g:687:2: (otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent ) )
            {
            // InternalMyLanguage.g:687:2: (otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent ) )
            // InternalMyLanguage.g:688:3: otherlv_0= 'Person' (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPeopleSentAccess().getPersonKeyword_0());
            		
            // InternalMyLanguage.g:692:3: (this_PeopleNumbSent_1= rulePeopleNumbSent | this_PeoplePosSent_2= rulePeoplePosSent )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyLanguage.g:693:4: this_PeopleNumbSent_1= rulePeopleNumbSent
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
                    // InternalMyLanguage.g:702:4: this_PeoplePosSent_2= rulePeoplePosSent
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
    // InternalMyLanguage.g:715:1: entryRulePeoplePosSent returns [EObject current=null] : iv_rulePeoplePosSent= rulePeoplePosSent EOF ;
    public final EObject entryRulePeoplePosSent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeoplePosSent = null;


        try {
            // InternalMyLanguage.g:715:54: (iv_rulePeoplePosSent= rulePeoplePosSent EOF )
            // InternalMyLanguage.g:716:2: iv_rulePeoplePosSent= rulePeoplePosSent EOF
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
    // InternalMyLanguage.g:722:1: rulePeoplePosSent returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) ;
    public final EObject rulePeoplePosSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_posX_2_0 = null;

        AntlrDatatypeRuleToken lv_posY_3_0 = null;

        AntlrDatatypeRuleToken lv_posZ_4_0 = null;

        EObject lv_tolerance_5_1 = null;

        EObject lv_tolerance_5_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:728:2: ( (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) )
            // InternalMyLanguage.g:729:2: (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            {
            // InternalMyLanguage.g:729:2: (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            // InternalMyLanguage.g:730:3: otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPeoplePosSentAccess().getPositionKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getPeoplePosSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:738:3: ( (lv_posX_2_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:739:4: (lv_posX_2_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:739:4: (lv_posX_2_0= ruleDOUBLE )
            // InternalMyLanguage.g:740:5: lv_posX_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getPeoplePosSentAccess().getPosXDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_posX_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeoplePosSentRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:757:3: ( (lv_posY_3_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:758:4: (lv_posY_3_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:758:4: (lv_posY_3_0= ruleDOUBLE )
            // InternalMyLanguage.g:759:5: lv_posY_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getPeoplePosSentAccess().getPosYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_posY_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeoplePosSentRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:776:3: ( (lv_posZ_4_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:777:4: (lv_posZ_4_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:777:4: (lv_posZ_4_0= ruleDOUBLE )
            // InternalMyLanguage.g:778:5: lv_posZ_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getPeoplePosSentAccess().getPosZDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_posZ_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeoplePosSentRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:795:3: ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==52) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyLanguage.g:796:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    {
                    // InternalMyLanguage.g:796:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    // InternalMyLanguage.g:797:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:797:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==52) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==53) ) {
                            alt8=1;
                        }
                        else if ( (LA8_1==56) ) {
                            alt8=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyLanguage.g:798:6: lv_tolerance_5_1= ruleCirclePosition
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
                            // InternalMyLanguage.g:814:6: lv_tolerance_5_2= ruleSpherePosition
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
    // InternalMyLanguage.g:836:1: entryRulePeopleNumbSent returns [EObject current=null] : iv_rulePeopleNumbSent= rulePeopleNumbSent EOF ;
    public final EObject entryRulePeopleNumbSent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeopleNumbSent = null;


        try {
            // InternalMyLanguage.g:836:55: (iv_rulePeopleNumbSent= rulePeopleNumbSent EOF )
            // InternalMyLanguage.g:837:2: iv_rulePeopleNumbSent= rulePeopleNumbSent EOF
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
    // InternalMyLanguage.g:843:1: rulePeopleNumbSent returns [EObject current=null] : (otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) ) ) ;
    public final EObject rulePeopleNumbSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_amount_2_0=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:849:2: ( (otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) ) ) )
            // InternalMyLanguage.g:850:2: (otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) ) )
            {
            // InternalMyLanguage.g:850:2: (otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) ) )
            // InternalMyLanguage.g:851:3: otherlv_0= 'number' otherlv_1= 'is' ( (lv_amount_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPeopleNumbSentAccess().getNumberKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getPeopleNumbSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:859:3: ( (lv_amount_2_0= RULE_INT ) )
            // InternalMyLanguage.g:860:4: (lv_amount_2_0= RULE_INT )
            {
            // InternalMyLanguage.g:860:4: (lv_amount_2_0= RULE_INT )
            // InternalMyLanguage.g:861:5: lv_amount_2_0= RULE_INT
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
    // InternalMyLanguage.g:881:1: entryRuleMissionSent returns [EObject current=null] : iv_ruleMissionSent= ruleMissionSent EOF ;
    public final EObject entryRuleMissionSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionSent = null;


        try {
            // InternalMyLanguage.g:881:52: (iv_ruleMissionSent= ruleMissionSent EOF )
            // InternalMyLanguage.g:882:2: iv_ruleMissionSent= ruleMissionSent EOF
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
    // InternalMyLanguage.g:888:1: ruleMissionSent returns [EObject current=null] : (otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent ) ) ;
    public final EObject ruleMissionSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MissionStatusSent_1 = null;

        EObject this_MissionRiskLevelSent_2 = null;

        EObject this_MissionGoalSent_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:894:2: ( (otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent ) ) )
            // InternalMyLanguage.g:895:2: (otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent ) )
            {
            // InternalMyLanguage.g:895:2: (otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent ) )
            // InternalMyLanguage.g:896:3: otherlv_0= 'Mission' (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionSentAccess().getMissionKeyword_0());
            		
            // InternalMyLanguage.g:900:3: (this_MissionStatusSent_1= ruleMissionStatusSent | this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent | this_MissionGoalSent_3= ruleMissionGoalSent )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyLanguage.g:901:4: this_MissionStatusSent_1= ruleMissionStatusSent
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
                    // InternalMyLanguage.g:910:4: this_MissionRiskLevelSent_2= ruleMissionRiskLevelSent
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
                    // InternalMyLanguage.g:919:4: this_MissionGoalSent_3= ruleMissionGoalSent
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
    // InternalMyLanguage.g:932:1: entryRuleMissionGoalSent returns [EObject current=null] : iv_ruleMissionGoalSent= ruleMissionGoalSent EOF ;
    public final EObject entryRuleMissionGoalSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionGoalSent = null;


        try {
            // InternalMyLanguage.g:932:56: (iv_ruleMissionGoalSent= ruleMissionGoalSent EOF )
            // InternalMyLanguage.g:933:2: iv_ruleMissionGoalSent= ruleMissionGoalSent EOF
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
    // InternalMyLanguage.g:939:1: ruleMissionGoalSent returns [EObject current=null] : (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleMissionGoalSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_posX_2_0 = null;

        AntlrDatatypeRuleToken lv_posY_3_0 = null;

        AntlrDatatypeRuleToken lv_posZ_4_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:945:2: ( (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ) )
            // InternalMyLanguage.g:946:2: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) )
            {
            // InternalMyLanguage.g:946:2: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) )
            // InternalMyLanguage.g:947:3: otherlv_0= 'goal' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionGoalSentAccess().getGoalKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionGoalSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:955:3: ( (lv_posX_2_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:956:4: (lv_posX_2_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:956:4: (lv_posX_2_0= ruleDOUBLE )
            // InternalMyLanguage.g:957:5: lv_posX_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMissionGoalSentAccess().getPosXDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_posX_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionGoalSentRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:974:3: ( (lv_posY_3_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:975:4: (lv_posY_3_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:975:4: (lv_posY_3_0= ruleDOUBLE )
            // InternalMyLanguage.g:976:5: lv_posY_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMissionGoalSentAccess().getPosYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_posY_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionGoalSentRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:993:3: ( (lv_posZ_4_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:994:4: (lv_posZ_4_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:994:4: (lv_posZ_4_0= ruleDOUBLE )
            // InternalMyLanguage.g:995:5: lv_posZ_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMissionGoalSentAccess().getPosZDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_posZ_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionGoalSentRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
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
    // InternalMyLanguage.g:1016:1: entryRuleMissionRiskLevelSent returns [EObject current=null] : iv_ruleMissionRiskLevelSent= ruleMissionRiskLevelSent EOF ;
    public final EObject entryRuleMissionRiskLevelSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionRiskLevelSent = null;


        try {
            // InternalMyLanguage.g:1016:61: (iv_ruleMissionRiskLevelSent= ruleMissionRiskLevelSent EOF )
            // InternalMyLanguage.g:1017:2: iv_ruleMissionRiskLevelSent= ruleMissionRiskLevelSent EOF
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
    // InternalMyLanguage.g:1023:1: ruleMissionRiskLevelSent returns [EObject current=null] : (otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) ) ) ;
    public final EObject ruleMissionRiskLevelSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_risklevel_2_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1029:2: ( (otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) ) ) )
            // InternalMyLanguage.g:1030:2: (otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) ) )
            {
            // InternalMyLanguage.g:1030:2: (otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) ) )
            // InternalMyLanguage.g:1031:3: otherlv_0= 'missionsafety' otherlv_1= 'is' ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionRiskLevelSentAccess().getMissionsafetyKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionRiskLevelSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1039:3: ( (lv_risklevel_2_0= ruleMISSIONRISKLEVEL ) )
            // InternalMyLanguage.g:1040:4: (lv_risklevel_2_0= ruleMISSIONRISKLEVEL )
            {
            // InternalMyLanguage.g:1040:4: (lv_risklevel_2_0= ruleMISSIONRISKLEVEL )
            // InternalMyLanguage.g:1041:5: lv_risklevel_2_0= ruleMISSIONRISKLEVEL
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
    // InternalMyLanguage.g:1062:1: entryRuleMissionStatusSent returns [EObject current=null] : iv_ruleMissionStatusSent= ruleMissionStatusSent EOF ;
    public final EObject entryRuleMissionStatusSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionStatusSent = null;


        try {
            // InternalMyLanguage.g:1062:58: (iv_ruleMissionStatusSent= ruleMissionStatusSent EOF )
            // InternalMyLanguage.g:1063:2: iv_ruleMissionStatusSent= ruleMissionStatusSent EOF
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
    // InternalMyLanguage.g:1069:1: ruleMissionStatusSent returns [EObject current=null] : (otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) ) ) ;
    public final EObject ruleMissionStatusSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_state_2_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1075:2: ( (otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) ) ) )
            // InternalMyLanguage.g:1076:2: (otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) ) )
            {
            // InternalMyLanguage.g:1076:2: (otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) ) )
            // InternalMyLanguage.g:1077:3: otherlv_0= 'status' otherlv_1= 'is' ( (lv_state_2_0= ruleMISSIONSTATUS ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionStatusSentAccess().getStatusKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionStatusSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1085:3: ( (lv_state_2_0= ruleMISSIONSTATUS ) )
            // InternalMyLanguage.g:1086:4: (lv_state_2_0= ruleMISSIONSTATUS )
            {
            // InternalMyLanguage.g:1086:4: (lv_state_2_0= ruleMISSIONSTATUS )
            // InternalMyLanguage.g:1087:5: lv_state_2_0= ruleMISSIONSTATUS
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
    // InternalMyLanguage.g:1108:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalMyLanguage.g:1108:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalMyLanguage.g:1109:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalMyLanguage.g:1115:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_FailingComponentSent_7= ruleFailingComponentSent | this_RedundantComponent_8= ruleRedundantComponent | this_RobotAutoPilot_9= ruleRobotAutoPilot ) ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_RobotPositionSent_1 = null;

        EObject this_RobotSpeedSent_2 = null;

        EObject this_RobotStateSent_3 = null;

        EObject this_RobotDistanceSent_4 = null;

        EObject this_RiskSent_5 = null;

        EObject this_PayloadSent_6 = null;

        EObject this_FailingComponentSent_7 = null;

        EObject this_RedundantComponent_8 = null;

        EObject this_RobotAutoPilot_9 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1121:2: ( (otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_FailingComponentSent_7= ruleFailingComponentSent | this_RedundantComponent_8= ruleRedundantComponent | this_RobotAutoPilot_9= ruleRobotAutoPilot ) ) )
            // InternalMyLanguage.g:1122:2: (otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_FailingComponentSent_7= ruleFailingComponentSent | this_RedundantComponent_8= ruleRedundantComponent | this_RobotAutoPilot_9= ruleRobotAutoPilot ) )
            {
            // InternalMyLanguage.g:1122:2: (otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_FailingComponentSent_7= ruleFailingComponentSent | this_RedundantComponent_8= ruleRedundantComponent | this_RobotAutoPilot_9= ruleRobotAutoPilot ) )
            // InternalMyLanguage.g:1123:3: otherlv_0= 'Robot' (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_FailingComponentSent_7= ruleFailingComponentSent | this_RedundantComponent_8= ruleRedundantComponent | this_RobotAutoPilot_9= ruleRobotAutoPilot )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalMyLanguage.g:1127:3: (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_FailingComponentSent_7= ruleFailingComponentSent | this_RedundantComponent_8= ruleRedundantComponent | this_RobotAutoPilot_9= ruleRobotAutoPilot )
            int alt11=9;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMyLanguage.g:1128:4: this_RobotPositionSent_1= ruleRobotPositionSent
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
                    // InternalMyLanguage.g:1137:4: this_RobotSpeedSent_2= ruleRobotSpeedSent
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
                    // InternalMyLanguage.g:1146:4: this_RobotStateSent_3= ruleRobotStateSent
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
                    // InternalMyLanguage.g:1155:4: this_RobotDistanceSent_4= ruleRobotDistanceSent
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
                    // InternalMyLanguage.g:1164:4: this_RiskSent_5= ruleRiskSent
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
                    // InternalMyLanguage.g:1173:4: this_PayloadSent_6= rulePayloadSent
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
                    // InternalMyLanguage.g:1182:4: this_FailingComponentSent_7= ruleFailingComponentSent
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getFailingComponentSentParserRuleCall_1_6());
                    			
                    pushFollow(FOLLOW_2);
                    this_FailingComponentSent_7=ruleFailingComponentSent();

                    state._fsp--;


                    				current = this_FailingComponentSent_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalMyLanguage.g:1191:4: this_RedundantComponent_8= ruleRedundantComponent
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getRedundantComponentParserRuleCall_1_7());
                    			
                    pushFollow(FOLLOW_2);
                    this_RedundantComponent_8=ruleRedundantComponent();

                    state._fsp--;


                    				current = this_RedundantComponent_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalMyLanguage.g:1200:4: this_RobotAutoPilot_9= ruleRobotAutoPilot
                    {

                    				newCompositeNode(grammarAccess.getRobotAccess().getRobotAutoPilotParserRuleCall_1_8());
                    			
                    pushFollow(FOLLOW_2);
                    this_RobotAutoPilot_9=ruleRobotAutoPilot();

                    state._fsp--;


                    				current = this_RobotAutoPilot_9;
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
    // InternalMyLanguage.g:1213:1: entryRuleRobotAutoPilot returns [EObject current=null] : iv_ruleRobotAutoPilot= ruleRobotAutoPilot EOF ;
    public final EObject entryRuleRobotAutoPilot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotAutoPilot = null;


        try {
            // InternalMyLanguage.g:1213:55: (iv_ruleRobotAutoPilot= ruleRobotAutoPilot EOF )
            // InternalMyLanguage.g:1214:2: iv_ruleRobotAutoPilot= ruleRobotAutoPilot EOF
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
    // InternalMyLanguage.g:1220:1: ruleRobotAutoPilot returns [EObject current=null] : (otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) ) ) ;
    public final EObject ruleRobotAutoPilot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_status_2_1=null;
        Token lv_status_2_2=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:1226:2: ( (otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) ) ) )
            // InternalMyLanguage.g:1227:2: (otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) ) )
            {
            // InternalMyLanguage.g:1227:2: (otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) ) )
            // InternalMyLanguage.g:1228:3: otherlv_0= 'autopilot' otherlv_1= 'is' ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAutoPilotAccess().getAutopilotKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAutoPilotAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1236:3: ( ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) ) )
            // InternalMyLanguage.g:1237:4: ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) )
            {
            // InternalMyLanguage.g:1237:4: ( (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' ) )
            // InternalMyLanguage.g:1238:5: (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' )
            {
            // InternalMyLanguage.g:1238:5: (lv_status_2_1= 'ON' | lv_status_2_2= 'OFF' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==37) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyLanguage.g:1239:6: lv_status_2_1= 'ON'
                    {
                    lv_status_2_1=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_status_2_1, grammarAccess.getRobotAutoPilotAccess().getStatusONKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRobotAutoPilotRule());
                    						}
                    						setWithLastConsumed(current, "status", lv_status_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:1250:6: lv_status_2_2= 'OFF'
                    {
                    lv_status_2_2=(Token)match(input,37,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRedundantComponent"
    // InternalMyLanguage.g:1267:1: entryRuleRedundantComponent returns [EObject current=null] : iv_ruleRedundantComponent= ruleRedundantComponent EOF ;
    public final EObject entryRuleRedundantComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedundantComponent = null;


        try {
            // InternalMyLanguage.g:1267:59: (iv_ruleRedundantComponent= ruleRedundantComponent EOF )
            // InternalMyLanguage.g:1268:2: iv_ruleRedundantComponent= ruleRedundantComponent EOF
            {
             newCompositeNode(grammarAccess.getRedundantComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedundantComponent=ruleRedundantComponent();

            state._fsp--;

             current =iv_ruleRedundantComponent; 
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
    // $ANTLR end "entryRuleRedundantComponent"


    // $ANTLR start "ruleRedundantComponent"
    // InternalMyLanguage.g:1274:1: ruleRedundantComponent returns [EObject current=null] : ( ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'is' otherlv_2= 'used' otherlv_3= 'as' otherlv_4= 'redundant' otherlv_5= 'component' ) ;
    public final EObject ruleRedundantComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_component_0_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1280:2: ( ( ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'is' otherlv_2= 'used' otherlv_3= 'as' otherlv_4= 'redundant' otherlv_5= 'component' ) )
            // InternalMyLanguage.g:1281:2: ( ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'is' otherlv_2= 'used' otherlv_3= 'as' otherlv_4= 'redundant' otherlv_5= 'component' )
            {
            // InternalMyLanguage.g:1281:2: ( ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'is' otherlv_2= 'used' otherlv_3= 'as' otherlv_4= 'redundant' otherlv_5= 'component' )
            // InternalMyLanguage.g:1282:3: ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'is' otherlv_2= 'used' otherlv_3= 'as' otherlv_4= 'redundant' otherlv_5= 'component'
            {
            // InternalMyLanguage.g:1282:3: ( (lv_component_0_0= ruleCOMPONENT ) )
            // InternalMyLanguage.g:1283:4: (lv_component_0_0= ruleCOMPONENT )
            {
            // InternalMyLanguage.g:1283:4: (lv_component_0_0= ruleCOMPONENT )
            // InternalMyLanguage.g:1284:5: lv_component_0_0= ruleCOMPONENT
            {

            					newCompositeNode(grammarAccess.getRedundantComponentAccess().getComponentCOMPONENTParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_component_0_0=ruleCOMPONENT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRedundantComponentRule());
            					}
            					set(
            						current,
            						"component",
            						lv_component_0_0,
            						"org.xtext.example.mydsl.MyLanguage.COMPONENT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getRedundantComponentAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getRedundantComponentAccess().getUsedKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getRedundantComponentAccess().getAsKeyword_3());
            		
            otherlv_4=(Token)match(input,40,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getRedundantComponentAccess().getRedundantKeyword_4());
            		
            otherlv_5=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRedundantComponentAccess().getComponentKeyword_5());
            		

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
    // $ANTLR end "ruleRedundantComponent"


    // $ANTLR start "entryRulePayloadSent"
    // InternalMyLanguage.g:1325:1: entryRulePayloadSent returns [EObject current=null] : iv_rulePayloadSent= rulePayloadSent EOF ;
    public final EObject entryRulePayloadSent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayloadSent = null;


        try {
            // InternalMyLanguage.g:1325:52: (iv_rulePayloadSent= rulePayloadSent EOF )
            // InternalMyLanguage.g:1326:2: iv_rulePayloadSent= rulePayloadSent EOF
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
    // InternalMyLanguage.g:1332:1: rulePayloadSent returns [EObject current=null] : ( ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops' ) ;
    public final EObject rulePayloadSent() throws RecognitionException {
        EObject current = null;

        Token lv_load_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:1338:2: ( ( ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops' ) )
            // InternalMyLanguage.g:1339:2: ( ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops' )
            {
            // InternalMyLanguage.g:1339:2: ( ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops' )
            // InternalMyLanguage.g:1340:3: ( (lv_load_0_0= 'payload' ) ) otherlv_1= 'drops'
            {
            // InternalMyLanguage.g:1340:3: ( (lv_load_0_0= 'payload' ) )
            // InternalMyLanguage.g:1341:4: (lv_load_0_0= 'payload' )
            {
            // InternalMyLanguage.g:1341:4: (lv_load_0_0= 'payload' )
            // InternalMyLanguage.g:1342:5: lv_load_0_0= 'payload'
            {
            lv_load_0_0=(Token)match(input,42,FOLLOW_32); 

            					newLeafNode(lv_load_0_0, grammarAccess.getPayloadSentAccess().getLoadPayloadKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPayloadSentRule());
            					}
            					setWithLastConsumed(current, "load", lv_load_0_0, "payload");
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalMyLanguage.g:1362:1: entryRuleRobotDistanceSent returns [EObject current=null] : iv_ruleRobotDistanceSent= ruleRobotDistanceSent EOF ;
    public final EObject entryRuleRobotDistanceSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotDistanceSent = null;


        try {
            // InternalMyLanguage.g:1362:58: (iv_ruleRobotDistanceSent= ruleRobotDistanceSent EOF )
            // InternalMyLanguage.g:1363:2: iv_ruleRobotDistanceSent= ruleRobotDistanceSent EOF
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
    // InternalMyLanguage.g:1369:1: ruleRobotDistanceSent returns [EObject current=null] : (otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) ) ) ;
    public final EObject ruleRobotDistanceSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_sent_2_1 = null;

        EObject lv_sent_2_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1375:2: ( (otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) ) ) )
            // InternalMyLanguage.g:1376:2: (otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) ) )
            {
            // InternalMyLanguage.g:1376:2: (otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) ) )
            // InternalMyLanguage.g:1377:3: otherlv_0= 'distance' otherlv_1= 'to' ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotDistanceSentAccess().getDistanceKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotDistanceSentAccess().getToKeyword_1());
            		
            // InternalMyLanguage.g:1385:3: ( ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) ) )
            // InternalMyLanguage.g:1386:4: ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) )
            {
            // InternalMyLanguage.g:1386:4: ( (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent ) )
            // InternalMyLanguage.g:1387:5: (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent )
            {
            // InternalMyLanguage.g:1387:5: (lv_sent_2_1= ruleDistanceToObstaclesSent | lv_sent_2_2= ruleDistanceToLocationSent )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyLanguage.g:1388:6: lv_sent_2_1= ruleDistanceToObstaclesSent
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
                    // InternalMyLanguage.g:1404:6: lv_sent_2_2= ruleDistanceToLocationSent
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
    // InternalMyLanguage.g:1426:1: entryRuleDistanceToLocationSent returns [EObject current=null] : iv_ruleDistanceToLocationSent= ruleDistanceToLocationSent EOF ;
    public final EObject entryRuleDistanceToLocationSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceToLocationSent = null;


        try {
            // InternalMyLanguage.g:1426:63: (iv_ruleDistanceToLocationSent= ruleDistanceToLocationSent EOF )
            // InternalMyLanguage.g:1427:2: iv_ruleDistanceToLocationSent= ruleDistanceToLocationSent EOF
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
    // InternalMyLanguage.g:1433:1: ruleDistanceToLocationSent returns [EObject current=null] : ( ( (lv_posX_0_0= ruleDOUBLE ) ) ( (lv_posY_1_0= ruleDOUBLE ) ) ( (lv_posZ_2_0= ruleDOUBLE ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )? ) ;
    public final EObject ruleDistanceToLocationSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_posX_0_0 = null;

        AntlrDatatypeRuleToken lv_posY_1_0 = null;

        AntlrDatatypeRuleToken lv_posZ_2_0 = null;

        EObject lv_body_4_1 = null;

        EObject lv_body_4_2 = null;

        EObject lv_body_4_3 = null;

        EObject lv_tolerance_5_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1439:2: ( ( ( (lv_posX_0_0= ruleDOUBLE ) ) ( (lv_posY_1_0= ruleDOUBLE ) ) ( (lv_posZ_2_0= ruleDOUBLE ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )? ) )
            // InternalMyLanguage.g:1440:2: ( ( (lv_posX_0_0= ruleDOUBLE ) ) ( (lv_posY_1_0= ruleDOUBLE ) ) ( (lv_posZ_2_0= ruleDOUBLE ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )? )
            {
            // InternalMyLanguage.g:1440:2: ( ( (lv_posX_0_0= ruleDOUBLE ) ) ( (lv_posY_1_0= ruleDOUBLE ) ) ( (lv_posZ_2_0= ruleDOUBLE ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )? )
            // InternalMyLanguage.g:1441:3: ( (lv_posX_0_0= ruleDOUBLE ) ) ( (lv_posY_1_0= ruleDOUBLE ) ) ( (lv_posZ_2_0= ruleDOUBLE ) ) otherlv_3= 'is' ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) ) ( (lv_tolerance_5_0= ruleToleranceSent ) )?
            {
            // InternalMyLanguage.g:1441:3: ( (lv_posX_0_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:1442:4: (lv_posX_0_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:1442:4: (lv_posX_0_0= ruleDOUBLE )
            // InternalMyLanguage.g:1443:5: lv_posX_0_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getPosXDOUBLEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_posX_0_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_0_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1460:3: ( (lv_posY_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:1461:4: (lv_posY_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:1461:4: (lv_posY_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:1462:5: lv_posY_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getPosYDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_posY_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1479:3: ( (lv_posZ_2_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:1480:4: (lv_posZ_2_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:1480:4: (lv_posZ_2_0= ruleDOUBLE )
            // InternalMyLanguage.g:1481:5: lv_posZ_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getPosZDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_posZ_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceToLocationSentRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDistanceToLocationSentAccess().getIsKeyword_3());
            		
            // InternalMyLanguage.g:1502:3: ( ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:1503:4: ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:1503:4: ( (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent ) )
            // InternalMyLanguage.g:1504:5: (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:1504:5: (lv_body_4_1= ruleGreaterSent | lv_body_4_2= ruleLessSent | lv_body_4_3= ruleEqualSent )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt14=1;
                }
                break;
            case 48:
                {
                alt14=2;
                }
                break;
            case 47:
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
                    // InternalMyLanguage.g:1505:6: lv_body_4_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getBodyGreaterSentParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalMyLanguage.g:1521:6: lv_body_4_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getBodyLessSentParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalMyLanguage.g:1537:6: lv_body_4_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToLocationSentAccess().getBodyEqualSentParserRuleCall_4_0_2());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalMyLanguage.g:1555:3: ( (lv_tolerance_5_0= ruleToleranceSent ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyLanguage.g:1556:4: (lv_tolerance_5_0= ruleToleranceSent )
                    {
                    // InternalMyLanguage.g:1556:4: (lv_tolerance_5_0= ruleToleranceSent )
                    // InternalMyLanguage.g:1557:5: lv_tolerance_5_0= ruleToleranceSent
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
    // InternalMyLanguage.g:1578:1: entryRuleDistanceToObstaclesSent returns [EObject current=null] : iv_ruleDistanceToObstaclesSent= ruleDistanceToObstaclesSent EOF ;
    public final EObject entryRuleDistanceToObstaclesSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceToObstaclesSent = null;


        try {
            // InternalMyLanguage.g:1578:64: (iv_ruleDistanceToObstaclesSent= ruleDistanceToObstaclesSent EOF )
            // InternalMyLanguage.g:1579:2: iv_ruleDistanceToObstaclesSent= ruleDistanceToObstaclesSent EOF
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
    // InternalMyLanguage.g:1585:1: ruleDistanceToObstaclesSent returns [EObject current=null] : (otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )? ) ;
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
            // InternalMyLanguage.g:1591:2: ( (otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )? ) )
            // InternalMyLanguage.g:1592:2: (otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )? )
            {
            // InternalMyLanguage.g:1592:2: (otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )? )
            // InternalMyLanguage.g:1593:3: otherlv_0= 'obstacles' otherlv_1= 'is' ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) ) ( (lv_tolerance_3_0= ruleToleranceSent ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceToObstaclesSentAccess().getObstaclesKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceToObstaclesSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1601:3: ( ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:1602:4: ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:1602:4: ( (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent ) )
            // InternalMyLanguage.g:1603:5: (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:1603:5: (lv_body_2_1= ruleGreaterSent | lv_body_2_2= ruleLessSent | lv_body_2_3= ruleEqualSent )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt16=1;
                }
                break;
            case 48:
                {
                alt16=2;
                }
                break;
            case 47:
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
                    // InternalMyLanguage.g:1604:6: lv_body_2_1= ruleGreaterSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToObstaclesSentAccess().getBodyGreaterSentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalMyLanguage.g:1620:6: lv_body_2_2= ruleLessSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToObstaclesSentAccess().getBodyLessSentParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalMyLanguage.g:1636:6: lv_body_2_3= ruleEqualSent
                    {

                    						newCompositeNode(grammarAccess.getDistanceToObstaclesSentAccess().getBodyEqualSentParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalMyLanguage.g:1654:3: ( (lv_tolerance_3_0= ruleToleranceSent ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyLanguage.g:1655:4: (lv_tolerance_3_0= ruleToleranceSent )
                    {
                    // InternalMyLanguage.g:1655:4: (lv_tolerance_3_0= ruleToleranceSent )
                    // InternalMyLanguage.g:1656:5: lv_tolerance_3_0= ruleToleranceSent
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
    // InternalMyLanguage.g:1677:1: entryRuleEqualSent returns [EObject current=null] : iv_ruleEqualSent= ruleEqualSent EOF ;
    public final EObject entryRuleEqualSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualSent = null;


        try {
            // InternalMyLanguage.g:1677:50: (iv_ruleEqualSent= ruleEqualSent EOF )
            // InternalMyLanguage.g:1678:2: iv_ruleEqualSent= ruleEqualSent EOF
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
    // InternalMyLanguage.g:1684:1: ruleEqualSent returns [EObject current=null] : (otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) ) ;
    public final EObject ruleEqualSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_amount_2_1 = null;

        EObject lv_amount_2_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1690:2: ( (otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) ) )
            // InternalMyLanguage.g:1691:2: (otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) )
            {
            // InternalMyLanguage.g:1691:2: (otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) )
            // InternalMyLanguage.g:1692:3: otherlv_0= 'equal' otherlv_1= 'to' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualSentAccess().getEqualKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualSentAccess().getToKeyword_1());
            		
            // InternalMyLanguage.g:1700:3: ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) )
            // InternalMyLanguage.g:1701:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) )
            {
            // InternalMyLanguage.g:1701:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) )
            // InternalMyLanguage.g:1702:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit )
            {
            // InternalMyLanguage.g:1702:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=81 && LA18_0<=84)) ) {
                alt18=1;
            }
            else if ( (LA18_0==85) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyLanguage.g:1703:6: lv_amount_2_1= ruleDistanceUnit
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
                    // InternalMyLanguage.g:1719:6: lv_amount_2_2= rulePercentUnit
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
    // InternalMyLanguage.g:1741:1: entryRuleLessSent returns [EObject current=null] : iv_ruleLessSent= ruleLessSent EOF ;
    public final EObject entryRuleLessSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessSent = null;


        try {
            // InternalMyLanguage.g:1741:49: (iv_ruleLessSent= ruleLessSent EOF )
            // InternalMyLanguage.g:1742:2: iv_ruleLessSent= ruleLessSent EOF
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
    // InternalMyLanguage.g:1748:1: ruleLessSent returns [EObject current=null] : (otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) ) ;
    public final EObject ruleLessSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_amount_2_1 = null;

        EObject lv_amount_2_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1754:2: ( (otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) ) )
            // InternalMyLanguage.g:1755:2: (otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) )
            {
            // InternalMyLanguage.g:1755:2: (otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) )
            // InternalMyLanguage.g:1756:3: otherlv_0= 'lower' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getLessSentAccess().getLowerKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getLessSentAccess().getThenKeyword_1());
            		
            // InternalMyLanguage.g:1764:3: ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) )
            // InternalMyLanguage.g:1765:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) )
            {
            // InternalMyLanguage.g:1765:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) )
            // InternalMyLanguage.g:1766:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit )
            {
            // InternalMyLanguage.g:1766:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=81 && LA19_0<=84)) ) {
                alt19=1;
            }
            else if ( (LA19_0==85) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyLanguage.g:1767:6: lv_amount_2_1= ruleDistanceUnit
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
                    // InternalMyLanguage.g:1783:6: lv_amount_2_2= rulePercentUnit
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
    // InternalMyLanguage.g:1805:1: entryRuleGreaterSent returns [EObject current=null] : iv_ruleGreaterSent= ruleGreaterSent EOF ;
    public final EObject entryRuleGreaterSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterSent = null;


        try {
            // InternalMyLanguage.g:1805:52: (iv_ruleGreaterSent= ruleGreaterSent EOF )
            // InternalMyLanguage.g:1806:2: iv_ruleGreaterSent= ruleGreaterSent EOF
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
    // InternalMyLanguage.g:1812:1: ruleGreaterSent returns [EObject current=null] : (otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) ) ;
    public final EObject ruleGreaterSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_amount_2_1 = null;

        EObject lv_amount_2_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1818:2: ( (otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) ) )
            // InternalMyLanguage.g:1819:2: (otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) )
            {
            // InternalMyLanguage.g:1819:2: (otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) ) )
            // InternalMyLanguage.g:1820:3: otherlv_0= 'greater' otherlv_1= 'then' ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterSentAccess().getGreaterKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getGreaterSentAccess().getThenKeyword_1());
            		
            // InternalMyLanguage.g:1828:3: ( ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) ) )
            // InternalMyLanguage.g:1829:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) )
            {
            // InternalMyLanguage.g:1829:4: ( (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit ) )
            // InternalMyLanguage.g:1830:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit )
            {
            // InternalMyLanguage.g:1830:5: (lv_amount_2_1= ruleDistanceUnit | lv_amount_2_2= rulePercentUnit )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=81 && LA20_0<=84)) ) {
                alt20=1;
            }
            else if ( (LA20_0==85) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyLanguage.g:1831:6: lv_amount_2_1= ruleDistanceUnit
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
                    // InternalMyLanguage.g:1847:6: lv_amount_2_2= rulePercentUnit
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
    // InternalMyLanguage.g:1869:1: entryRuleRobotStateSent returns [EObject current=null] : iv_ruleRobotStateSent= ruleRobotStateSent EOF ;
    public final EObject entryRuleRobotStateSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotStateSent = null;


        try {
            // InternalMyLanguage.g:1869:55: (iv_ruleRobotStateSent= ruleRobotStateSent EOF )
            // InternalMyLanguage.g:1870:2: iv_ruleRobotStateSent= ruleRobotStateSent EOF
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
    // InternalMyLanguage.g:1876:1: ruleRobotStateSent returns [EObject current=null] : (otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRobotStateSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_state_2_0=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:1882:2: ( (otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) ) ) )
            // InternalMyLanguage.g:1883:2: (otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) ) )
            {
            // InternalMyLanguage.g:1883:2: (otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) ) )
            // InternalMyLanguage.g:1884:3: otherlv_0= 'state' otherlv_1= 'is' ( (lv_state_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotStateSentAccess().getStateKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotStateSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1892:3: ( (lv_state_2_0= RULE_ID ) )
            // InternalMyLanguage.g:1893:4: (lv_state_2_0= RULE_ID )
            {
            // InternalMyLanguage.g:1893:4: (lv_state_2_0= RULE_ID )
            // InternalMyLanguage.g:1894:5: lv_state_2_0= RULE_ID
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
    // InternalMyLanguage.g:1914:1: entryRuleRobotPositionSent returns [EObject current=null] : iv_ruleRobotPositionSent= ruleRobotPositionSent EOF ;
    public final EObject entryRuleRobotPositionSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotPositionSent = null;


        try {
            // InternalMyLanguage.g:1914:58: (iv_ruleRobotPositionSent= ruleRobotPositionSent EOF )
            // InternalMyLanguage.g:1915:2: iv_ruleRobotPositionSent= ruleRobotPositionSent EOF
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
    // InternalMyLanguage.g:1921:1: ruleRobotPositionSent returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) ;
    public final EObject ruleRobotPositionSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_posX_2_0 = null;

        AntlrDatatypeRuleToken lv_posY_3_0 = null;

        AntlrDatatypeRuleToken lv_posZ_4_0 = null;

        EObject lv_tolerance_5_1 = null;

        EObject lv_tolerance_5_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:1927:2: ( (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? ) )
            // InternalMyLanguage.g:1928:2: (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            {
            // InternalMyLanguage.g:1928:2: (otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )? )
            // InternalMyLanguage.g:1929:3: otherlv_0= 'position' otherlv_1= 'is' ( (lv_posX_2_0= ruleDOUBLE ) ) ( (lv_posY_3_0= ruleDOUBLE ) ) ( (lv_posZ_4_0= ruleDOUBLE ) ) ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotPositionSentAccess().getPositionKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotPositionSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:1937:3: ( (lv_posX_2_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:1938:4: (lv_posX_2_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:1938:4: (lv_posX_2_0= ruleDOUBLE )
            // InternalMyLanguage.g:1939:5: lv_posX_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRobotPositionSentAccess().getPosXDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_posX_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotPositionSentRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1956:3: ( (lv_posY_3_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:1957:4: (lv_posY_3_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:1957:4: (lv_posY_3_0= ruleDOUBLE )
            // InternalMyLanguage.g:1958:5: lv_posY_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRobotPositionSentAccess().getPosYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_posY_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotPositionSentRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1975:3: ( (lv_posZ_4_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:1976:4: (lv_posZ_4_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:1976:4: (lv_posZ_4_0= ruleDOUBLE )
            // InternalMyLanguage.g:1977:5: lv_posZ_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRobotPositionSentAccess().getPosZDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_posZ_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotPositionSentRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:1994:3: ( ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyLanguage.g:1995:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    {
                    // InternalMyLanguage.g:1995:4: ( (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition ) )
                    // InternalMyLanguage.g:1996:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    {
                    // InternalMyLanguage.g:1996:5: (lv_tolerance_5_1= ruleCirclePosition | lv_tolerance_5_2= ruleSpherePosition )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==52) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==53) ) {
                            alt21=1;
                        }
                        else if ( (LA21_1==56) ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyLanguage.g:1997:6: lv_tolerance_5_1= ruleCirclePosition
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
                            // InternalMyLanguage.g:2013:6: lv_tolerance_5_2= ruleSpherePosition
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
    // InternalMyLanguage.g:2035:1: entryRuleCirclePosition returns [EObject current=null] : iv_ruleCirclePosition= ruleCirclePosition EOF ;
    public final EObject entryRuleCirclePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCirclePosition = null;


        try {
            // InternalMyLanguage.g:2035:55: (iv_ruleCirclePosition= ruleCirclePosition EOF )
            // InternalMyLanguage.g:2036:2: iv_ruleCirclePosition= ruleCirclePosition EOF
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
    // InternalMyLanguage.g:2042:1: ruleCirclePosition returns [EObject current=null] : (otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleCirclePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_tolerance_4_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2048:2: ( (otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) ) )
            // InternalMyLanguage.g:2049:2: (otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) )
            {
            // InternalMyLanguage.g:2049:2: (otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) )
            // InternalMyLanguage.g:2050:3: otherlv_0= 'within' otherlv_1= 'circle' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getCirclePositionAccess().getWithinKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getCirclePositionAccess().getCircleKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getCirclePositionAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getCirclePositionAccess().getRadiusKeyword_3());
            		
            // InternalMyLanguage.g:2066:3: ( (lv_tolerance_4_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2067:4: (lv_tolerance_4_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2067:4: (lv_tolerance_4_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2068:5: lv_tolerance_4_0= ruleDistanceUnit
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
    // InternalMyLanguage.g:2089:1: entryRuleSpherePosition returns [EObject current=null] : iv_ruleSpherePosition= ruleSpherePosition EOF ;
    public final EObject entryRuleSpherePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpherePosition = null;


        try {
            // InternalMyLanguage.g:2089:55: (iv_ruleSpherePosition= ruleSpherePosition EOF )
            // InternalMyLanguage.g:2090:2: iv_ruleSpherePosition= ruleSpherePosition EOF
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
    // InternalMyLanguage.g:2096:1: ruleSpherePosition returns [EObject current=null] : (otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleSpherePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_tolerance_4_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2102:2: ( (otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) ) )
            // InternalMyLanguage.g:2103:2: (otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) )
            {
            // InternalMyLanguage.g:2103:2: (otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) ) )
            // InternalMyLanguage.g:2104:3: otherlv_0= 'within' otherlv_1= 'sphere' otherlv_2= 'with' otherlv_3= 'radius' ( (lv_tolerance_4_0= ruleDistanceUnit ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getSpherePositionAccess().getWithinKeyword_0());
            		
            otherlv_1=(Token)match(input,56,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getSpherePositionAccess().getSphereKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getSpherePositionAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getSpherePositionAccess().getRadiusKeyword_3());
            		
            // InternalMyLanguage.g:2120:3: ( (lv_tolerance_4_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2121:4: (lv_tolerance_4_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2121:4: (lv_tolerance_4_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2122:5: lv_tolerance_4_0= ruleDistanceUnit
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
    // InternalMyLanguage.g:2143:1: entryRuleRobotSpeedSent returns [EObject current=null] : iv_ruleRobotSpeedSent= ruleRobotSpeedSent EOF ;
    public final EObject entryRuleRobotSpeedSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotSpeedSent = null;


        try {
            // InternalMyLanguage.g:2143:55: (iv_ruleRobotSpeedSent= ruleRobotSpeedSent EOF )
            // InternalMyLanguage.g:2144:2: iv_ruleRobotSpeedSent= ruleRobotSpeedSent EOF
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
    // InternalMyLanguage.g:2150:1: ruleRobotSpeedSent returns [EObject current=null] : (otherlv_0= 'speed' otherlv_1= 'is' ( (lv_speedX_2_0= ruleDOUBLE ) ) ( (lv_speedY_3_0= ruleDOUBLE ) ) ( (lv_speedZ_4_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleRobotSpeedSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_speedX_2_0 = null;

        AntlrDatatypeRuleToken lv_speedY_3_0 = null;

        AntlrDatatypeRuleToken lv_speedZ_4_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2156:2: ( (otherlv_0= 'speed' otherlv_1= 'is' ( (lv_speedX_2_0= ruleDOUBLE ) ) ( (lv_speedY_3_0= ruleDOUBLE ) ) ( (lv_speedZ_4_0= ruleDOUBLE ) ) ) )
            // InternalMyLanguage.g:2157:2: (otherlv_0= 'speed' otherlv_1= 'is' ( (lv_speedX_2_0= ruleDOUBLE ) ) ( (lv_speedY_3_0= ruleDOUBLE ) ) ( (lv_speedZ_4_0= ruleDOUBLE ) ) )
            {
            // InternalMyLanguage.g:2157:2: (otherlv_0= 'speed' otherlv_1= 'is' ( (lv_speedX_2_0= ruleDOUBLE ) ) ( (lv_speedY_3_0= ruleDOUBLE ) ) ( (lv_speedZ_4_0= ruleDOUBLE ) ) )
            // InternalMyLanguage.g:2158:3: otherlv_0= 'speed' otherlv_1= 'is' ( (lv_speedX_2_0= ruleDOUBLE ) ) ( (lv_speedY_3_0= ruleDOUBLE ) ) ( (lv_speedZ_4_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotSpeedSentAccess().getSpeedKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotSpeedSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:2166:3: ( (lv_speedX_2_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:2167:4: (lv_speedX_2_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:2167:4: (lv_speedX_2_0= ruleDOUBLE )
            // InternalMyLanguage.g:2168:5: lv_speedX_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRobotSpeedSentAccess().getSpeedXDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_speedX_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotSpeedSentRule());
            					}
            					set(
            						current,
            						"speedX",
            						lv_speedX_2_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:2185:3: ( (lv_speedY_3_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:2186:4: (lv_speedY_3_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:2186:4: (lv_speedY_3_0= ruleDOUBLE )
            // InternalMyLanguage.g:2187:5: lv_speedY_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRobotSpeedSentAccess().getSpeedYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_speedY_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotSpeedSentRule());
            					}
            					set(
            						current,
            						"speedY",
            						lv_speedY_3_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyLanguage.g:2204:3: ( (lv_speedZ_4_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:2205:4: (lv_speedZ_4_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:2205:4: (lv_speedZ_4_0= ruleDOUBLE )
            // InternalMyLanguage.g:2206:5: lv_speedZ_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRobotSpeedSentAccess().getSpeedZDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_speedZ_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotSpeedSentRule());
            					}
            					set(
            						current,
            						"speedZ",
            						lv_speedZ_4_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
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
    // $ANTLR end "ruleRobotSpeedSent"


    // $ANTLR start "entryRuleEnvironmentSent"
    // InternalMyLanguage.g:2227:1: entryRuleEnvironmentSent returns [EObject current=null] : iv_ruleEnvironmentSent= ruleEnvironmentSent EOF ;
    public final EObject entryRuleEnvironmentSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentSent = null;


        try {
            // InternalMyLanguage.g:2227:56: (iv_ruleEnvironmentSent= ruleEnvironmentSent EOF )
            // InternalMyLanguage.g:2228:2: iv_ruleEnvironmentSent= ruleEnvironmentSent EOF
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
    // InternalMyLanguage.g:2234:1: ruleEnvironmentSent returns [EObject current=null] : (otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) ) ) ;
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
            // InternalMyLanguage.g:2240:2: ( (otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) ) ) )
            // InternalMyLanguage.g:2241:2: (otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) ) )
            {
            // InternalMyLanguage.g:2241:2: (otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) ) )
            // InternalMyLanguage.g:2242:3: otherlv_0= 'Environment' otherlv_1= 'windspeed' otherlv_2= 'is' ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentSentAccess().getEnvironmentKeyword_0());
            		
            otherlv_1=(Token)match(input,59,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentSentAccess().getWindspeedKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentSentAccess().getIsKeyword_2());
            		
            // InternalMyLanguage.g:2254:3: ( ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) ) )
            // InternalMyLanguage.g:2255:4: ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) )
            {
            // InternalMyLanguage.g:2255:4: ( (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent ) )
            // InternalMyLanguage.g:2256:5: (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent )
            {
            // InternalMyLanguage.g:2256:5: (lv_body_3_1= ruleGreaterSent | lv_body_3_2= ruleLessSent | lv_body_3_3= ruleEqualSent )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt23=1;
                }
                break;
            case 48:
                {
                alt23=2;
                }
                break;
            case 47:
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
                    // InternalMyLanguage.g:2257:6: lv_body_3_1= ruleGreaterSent
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
                    // InternalMyLanguage.g:2273:6: lv_body_3_2= ruleLessSent
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
                    // InternalMyLanguage.g:2289:6: lv_body_3_3= ruleEqualSent
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


    // $ANTLR start "entryRuleFailingComponentSent"
    // InternalMyLanguage.g:2311:1: entryRuleFailingComponentSent returns [EObject current=null] : iv_ruleFailingComponentSent= ruleFailingComponentSent EOF ;
    public final EObject entryRuleFailingComponentSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailingComponentSent = null;


        try {
            // InternalMyLanguage.g:2311:61: (iv_ruleFailingComponentSent= ruleFailingComponentSent EOF )
            // InternalMyLanguage.g:2312:2: iv_ruleFailingComponentSent= ruleFailingComponentSent EOF
            {
             newCompositeNode(grammarAccess.getFailingComponentSentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFailingComponentSent=ruleFailingComponentSent();

            state._fsp--;

             current =iv_ruleFailingComponentSent; 
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
    // $ANTLR end "entryRuleFailingComponentSent"


    // $ANTLR start "ruleFailingComponentSent"
    // InternalMyLanguage.g:2318:1: ruleFailingComponentSent returns [EObject current=null] : ( ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'fails' ) ;
    public final EObject ruleFailingComponentSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_component_0_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2324:2: ( ( ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'fails' ) )
            // InternalMyLanguage.g:2325:2: ( ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'fails' )
            {
            // InternalMyLanguage.g:2325:2: ( ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'fails' )
            // InternalMyLanguage.g:2326:3: ( (lv_component_0_0= ruleCOMPONENT ) ) otherlv_1= 'fails'
            {
            // InternalMyLanguage.g:2326:3: ( (lv_component_0_0= ruleCOMPONENT ) )
            // InternalMyLanguage.g:2327:4: (lv_component_0_0= ruleCOMPONENT )
            {
            // InternalMyLanguage.g:2327:4: (lv_component_0_0= ruleCOMPONENT )
            // InternalMyLanguage.g:2328:5: lv_component_0_0= ruleCOMPONENT
            {

            					newCompositeNode(grammarAccess.getFailingComponentSentAccess().getComponentCOMPONENTParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_component_0_0=ruleCOMPONENT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFailingComponentSentRule());
            					}
            					set(
            						current,
            						"component",
            						lv_component_0_0,
            						"org.xtext.example.mydsl.MyLanguage.COMPONENT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFailingComponentSentAccess().getFailsKeyword_1());
            		

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
    // $ANTLR end "ruleFailingComponentSent"


    // $ANTLR start "entryRuleRiskSent"
    // InternalMyLanguage.g:2353:1: entryRuleRiskSent returns [EObject current=null] : iv_ruleRiskSent= ruleRiskSent EOF ;
    public final EObject entryRuleRiskSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRiskSent = null;


        try {
            // InternalMyLanguage.g:2353:49: (iv_ruleRiskSent= ruleRiskSent EOF )
            // InternalMyLanguage.g:2354:2: iv_ruleRiskSent= ruleRiskSent EOF
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
    // InternalMyLanguage.g:2360:1: ruleRiskSent returns [EObject current=null] : (otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) ) ) ;
    public final EObject ruleRiskSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_level_2_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2366:2: ( (otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) ) ) )
            // InternalMyLanguage.g:2367:2: (otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) ) )
            {
            // InternalMyLanguage.g:2367:2: (otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) ) )
            // InternalMyLanguage.g:2368:3: otherlv_0= 'collisionrisk' otherlv_1= 'is' ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRiskSentAccess().getCollisionriskKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getRiskSentAccess().getIsKeyword_1());
            		
            // InternalMyLanguage.g:2376:3: ( (lv_level_2_0= ruleCOLLISIONRISKLEVEL ) )
            // InternalMyLanguage.g:2377:4: (lv_level_2_0= ruleCOLLISIONRISKLEVEL )
            {
            // InternalMyLanguage.g:2377:4: (lv_level_2_0= ruleCOLLISIONRISKLEVEL )
            // InternalMyLanguage.g:2378:5: lv_level_2_0= ruleCOLLISIONRISKLEVEL
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
    // InternalMyLanguage.g:2399:1: entryRuleToleranceSent returns [EObject current=null] : iv_ruleToleranceSent= ruleToleranceSent EOF ;
    public final EObject entryRuleToleranceSent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToleranceSent = null;


        try {
            // InternalMyLanguage.g:2399:54: (iv_ruleToleranceSent= ruleToleranceSent EOF )
            // InternalMyLanguage.g:2400:2: iv_ruleToleranceSent= ruleToleranceSent EOF
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
    // InternalMyLanguage.g:2406:1: ruleToleranceSent returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) ) ) ;
    public final EObject ruleToleranceSent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2412:2: ( (otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) ) ) )
            // InternalMyLanguage.g:2413:2: (otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) ) )
            {
            // InternalMyLanguage.g:2413:2: (otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) ) )
            // InternalMyLanguage.g:2414:3: otherlv_0= 'with' otherlv_1= 'tolerance' ( (lv_unit_2_0= ruleDistanceUnit ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getToleranceSentAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,62,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getToleranceSentAccess().getToleranceKeyword_1());
            		
            // InternalMyLanguage.g:2422:3: ( (lv_unit_2_0= ruleDistanceUnit ) )
            // InternalMyLanguage.g:2423:4: (lv_unit_2_0= ruleDistanceUnit )
            {
            // InternalMyLanguage.g:2423:4: (lv_unit_2_0= ruleDistanceUnit )
            // InternalMyLanguage.g:2424:5: lv_unit_2_0= ruleDistanceUnit
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
    // InternalMyLanguage.g:2445:1: entryRuleMISSIONSTATUS returns [String current=null] : iv_ruleMISSIONSTATUS= ruleMISSIONSTATUS EOF ;
    public final String entryRuleMISSIONSTATUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMISSIONSTATUS = null;


        try {
            // InternalMyLanguage.g:2445:53: (iv_ruleMISSIONSTATUS= ruleMISSIONSTATUS EOF )
            // InternalMyLanguage.g:2446:2: iv_ruleMISSIONSTATUS= ruleMISSIONSTATUS EOF
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
    // InternalMyLanguage.g:2452:1: ruleMISSIONSTATUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ACTIVE' | kw= 'UNACTIVE' | kw= 'PAUSED' ) ;
    public final AntlrDatatypeRuleToken ruleMISSIONSTATUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:2458:2: ( (kw= 'ACTIVE' | kw= 'UNACTIVE' | kw= 'PAUSED' ) )
            // InternalMyLanguage.g:2459:2: (kw= 'ACTIVE' | kw= 'UNACTIVE' | kw= 'PAUSED' )
            {
            // InternalMyLanguage.g:2459:2: (kw= 'ACTIVE' | kw= 'UNACTIVE' | kw= 'PAUSED' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt24=1;
                }
                break;
            case 64:
                {
                alt24=2;
                }
                break;
            case 65:
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
                    // InternalMyLanguage.g:2460:3: kw= 'ACTIVE'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMISSIONSTATUSAccess().getACTIVEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2466:3: kw= 'UNACTIVE'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMISSIONSTATUSAccess().getUNACTIVEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2472:3: kw= 'PAUSED'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

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
    // InternalMyLanguage.g:2481:1: entryRuleMISSIONRISKLEVEL returns [String current=null] : iv_ruleMISSIONRISKLEVEL= ruleMISSIONRISKLEVEL EOF ;
    public final String entryRuleMISSIONRISKLEVEL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMISSIONRISKLEVEL = null;


        try {
            // InternalMyLanguage.g:2481:56: (iv_ruleMISSIONRISKLEVEL= ruleMISSIONRISKLEVEL EOF )
            // InternalMyLanguage.g:2482:2: iv_ruleMISSIONRISKLEVEL= ruleMISSIONRISKLEVEL EOF
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
    // InternalMyLanguage.g:2488:1: ruleMISSIONRISKLEVEL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SAFE' | kw= 'UNSAFE' ) ;
    public final AntlrDatatypeRuleToken ruleMISSIONRISKLEVEL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:2494:2: ( (kw= 'SAFE' | kw= 'UNSAFE' ) )
            // InternalMyLanguage.g:2495:2: (kw= 'SAFE' | kw= 'UNSAFE' )
            {
            // InternalMyLanguage.g:2495:2: (kw= 'SAFE' | kw= 'UNSAFE' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==66) ) {
                alt25=1;
            }
            else if ( (LA25_0==67) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyLanguage.g:2496:3: kw= 'SAFE'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMISSIONRISKLEVELAccess().getSAFEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2502:3: kw= 'UNSAFE'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

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
    // InternalMyLanguage.g:2511:1: entryRuleCOLLISIONRISKLEVEL returns [String current=null] : iv_ruleCOLLISIONRISKLEVEL= ruleCOLLISIONRISKLEVEL EOF ;
    public final String entryRuleCOLLISIONRISKLEVEL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOLLISIONRISKLEVEL = null;


        try {
            // InternalMyLanguage.g:2511:58: (iv_ruleCOLLISIONRISKLEVEL= ruleCOLLISIONRISKLEVEL EOF )
            // InternalMyLanguage.g:2512:2: iv_ruleCOLLISIONRISKLEVEL= ruleCOLLISIONRISKLEVEL EOF
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
    // InternalMyLanguage.g:2518:1: ruleCOLLISIONRISKLEVEL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SAFE' | kw= 'WARNING' | kw= 'CRITICAL' ) ;
    public final AntlrDatatypeRuleToken ruleCOLLISIONRISKLEVEL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:2524:2: ( (kw= 'SAFE' | kw= 'WARNING' | kw= 'CRITICAL' ) )
            // InternalMyLanguage.g:2525:2: (kw= 'SAFE' | kw= 'WARNING' | kw= 'CRITICAL' )
            {
            // InternalMyLanguage.g:2525:2: (kw= 'SAFE' | kw= 'WARNING' | kw= 'CRITICAL' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt26=1;
                }
                break;
            case 68:
                {
                alt26=2;
                }
                break;
            case 69:
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
                    // InternalMyLanguage.g:2526:3: kw= 'SAFE'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOLLISIONRISKLEVELAccess().getSAFEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2532:3: kw= 'WARNING'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOLLISIONRISKLEVELAccess().getWARNINGKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2538:3: kw= 'CRITICAL'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCOMPONENT"
    // InternalMyLanguage.g:2547:1: entryRuleCOMPONENT returns [String current=null] : iv_ruleCOMPONENT= ruleCOMPONENT EOF ;
    public final String entryRuleCOMPONENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMPONENT = null;


        try {
            // InternalMyLanguage.g:2547:49: (iv_ruleCOMPONENT= ruleCOMPONENT EOF )
            // InternalMyLanguage.g:2548:2: iv_ruleCOMPONENT= ruleCOMPONENT EOF
            {
             newCompositeNode(grammarAccess.getCOMPONENTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOMPONENT=ruleCOMPONENT();

            state._fsp--;

             current =iv_ruleCOMPONENT.getText(); 
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
    // $ANTLR end "entryRuleCOMPONENT"


    // $ANTLR start "ruleCOMPONENT"
    // InternalMyLanguage.g:2554:1: ruleCOMPONENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'motor' | kw= 'camera' | kw= 'GPS' | kw= 'battery' | kw= 'barometer' | kw= 'scanner' | kw= 'sonar' | kw= 'autopilot' ) ;
    public final AntlrDatatypeRuleToken ruleCOMPONENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:2560:2: ( (kw= 'motor' | kw= 'camera' | kw= 'GPS' | kw= 'battery' | kw= 'barometer' | kw= 'scanner' | kw= 'sonar' | kw= 'autopilot' ) )
            // InternalMyLanguage.g:2561:2: (kw= 'motor' | kw= 'camera' | kw= 'GPS' | kw= 'battery' | kw= 'barometer' | kw= 'scanner' | kw= 'sonar' | kw= 'autopilot' )
            {
            // InternalMyLanguage.g:2561:2: (kw= 'motor' | kw= 'camera' | kw= 'GPS' | kw= 'battery' | kw= 'barometer' | kw= 'scanner' | kw= 'sonar' | kw= 'autopilot' )
            int alt27=8;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt27=1;
                }
                break;
            case 71:
                {
                alt27=2;
                }
                break;
            case 72:
                {
                alt27=3;
                }
                break;
            case 73:
                {
                alt27=4;
                }
                break;
            case 74:
                {
                alt27=5;
                }
                break;
            case 75:
                {
                alt27=6;
                }
                break;
            case 76:
                {
                alt27=7;
                }
                break;
            case 35:
                {
                alt27=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMyLanguage.g:2562:3: kw= 'motor'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPONENTAccess().getMotorKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyLanguage.g:2568:3: kw= 'camera'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPONENTAccess().getCameraKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyLanguage.g:2574:3: kw= 'GPS'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPONENTAccess().getGPSKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyLanguage.g:2580:3: kw= 'battery'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPONENTAccess().getBatteryKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyLanguage.g:2586:3: kw= 'barometer'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPONENTAccess().getBarometerKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyLanguage.g:2592:3: kw= 'scanner'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPONENTAccess().getScannerKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyLanguage.g:2598:3: kw= 'sonar'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPONENTAccess().getSonarKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyLanguage.g:2604:3: kw= 'autopilot'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCOMPONENTAccess().getAutopilotKeyword_7());
                    		

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
    // $ANTLR end "ruleCOMPONENT"


    // $ANTLR start "entryRuleDistanceUnit"
    // InternalMyLanguage.g:2613:1: entryRuleDistanceUnit returns [EObject current=null] : iv_ruleDistanceUnit= ruleDistanceUnit EOF ;
    public final EObject entryRuleDistanceUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceUnit = null;


        try {
            // InternalMyLanguage.g:2613:53: (iv_ruleDistanceUnit= ruleDistanceUnit EOF )
            // InternalMyLanguage.g:2614:2: iv_ruleDistanceUnit= ruleDistanceUnit EOF
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
    // InternalMyLanguage.g:2620:1: ruleDistanceUnit returns [EObject current=null] : (this_METER_0= ruleMETER | this_CENTIMETER_1= ruleCENTIMETER | this_MILLIMETER_2= ruleMILLIMETER | this_KILOMETER_3= ruleKILOMETER ) ;
    public final EObject ruleDistanceUnit() throws RecognitionException {
        EObject current = null;

        EObject this_METER_0 = null;

        EObject this_CENTIMETER_1 = null;

        EObject this_MILLIMETER_2 = null;

        EObject this_KILOMETER_3 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2626:2: ( (this_METER_0= ruleMETER | this_CENTIMETER_1= ruleCENTIMETER | this_MILLIMETER_2= ruleMILLIMETER | this_KILOMETER_3= ruleKILOMETER ) )
            // InternalMyLanguage.g:2627:2: (this_METER_0= ruleMETER | this_CENTIMETER_1= ruleCENTIMETER | this_MILLIMETER_2= ruleMILLIMETER | this_KILOMETER_3= ruleKILOMETER )
            {
            // InternalMyLanguage.g:2627:2: (this_METER_0= ruleMETER | this_CENTIMETER_1= ruleCENTIMETER | this_MILLIMETER_2= ruleMILLIMETER | this_KILOMETER_3= ruleKILOMETER )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt28=1;
                }
                break;
            case 82:
                {
                alt28=2;
                }
                break;
            case 83:
                {
                alt28=3;
                }
                break;
            case 84:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyLanguage.g:2628:3: this_METER_0= ruleMETER
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
                    // InternalMyLanguage.g:2637:3: this_CENTIMETER_1= ruleCENTIMETER
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
                    // InternalMyLanguage.g:2646:3: this_MILLIMETER_2= ruleMILLIMETER
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
                    // InternalMyLanguage.g:2655:3: this_KILOMETER_3= ruleKILOMETER
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
    // InternalMyLanguage.g:2667:1: entryRuleTimeUnit returns [EObject current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final EObject entryRuleTimeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnit = null;


        try {
            // InternalMyLanguage.g:2667:49: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalMyLanguage.g:2668:2: iv_ruleTimeUnit= ruleTimeUnit EOF
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
    // InternalMyLanguage.g:2674:1: ruleTimeUnit returns [EObject current=null] : (this_SECONDS_0= ruleSECONDS | this_HOUR_1= ruleHOUR | this_MINUTES_2= ruleMINUTES ) ;
    public final EObject ruleTimeUnit() throws RecognitionException {
        EObject current = null;

        EObject this_SECONDS_0 = null;

        EObject this_HOUR_1 = null;

        EObject this_MINUTES_2 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2680:2: ( (this_SECONDS_0= ruleSECONDS | this_HOUR_1= ruleHOUR | this_MINUTES_2= ruleMINUTES ) )
            // InternalMyLanguage.g:2681:2: (this_SECONDS_0= ruleSECONDS | this_HOUR_1= ruleHOUR | this_MINUTES_2= ruleMINUTES )
            {
            // InternalMyLanguage.g:2681:2: (this_SECONDS_0= ruleSECONDS | this_HOUR_1= ruleHOUR | this_MINUTES_2= ruleMINUTES )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt29=1;
                }
                break;
            case 79:
                {
                alt29=2;
                }
                break;
            case 80:
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
                    // InternalMyLanguage.g:2682:3: this_SECONDS_0= ruleSECONDS
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
                    // InternalMyLanguage.g:2691:3: this_HOUR_1= ruleHOUR
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
                    // InternalMyLanguage.g:2700:3: this_MINUTES_2= ruleMINUTES
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
    // InternalMyLanguage.g:2712:1: entryRuleSECONDS returns [EObject current=null] : iv_ruleSECONDS= ruleSECONDS EOF ;
    public final EObject entryRuleSECONDS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSECONDS = null;


        try {
            // InternalMyLanguage.g:2712:48: (iv_ruleSECONDS= ruleSECONDS EOF )
            // InternalMyLanguage.g:2713:2: iv_ruleSECONDS= ruleSECONDS EOF
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
    // InternalMyLanguage.g:2719:1: ruleSECONDS returns [EObject current=null] : (otherlv_0= 'seconds(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleSECONDS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2725:2: ( (otherlv_0= 'seconds(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:2726:2: (otherlv_0= 'seconds(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:2726:2: (otherlv_0= 'seconds(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:2727:3: otherlv_0= 'seconds(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSECONDSAccess().getSecondsKeyword_0());
            		
            // InternalMyLanguage.g:2731:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:2732:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:2732:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:2733:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getSECONDSAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSECONDSRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyLanguage.g:2758:1: entryRuleHOUR returns [EObject current=null] : iv_ruleHOUR= ruleHOUR EOF ;
    public final EObject entryRuleHOUR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHOUR = null;


        try {
            // InternalMyLanguage.g:2758:45: (iv_ruleHOUR= ruleHOUR EOF )
            // InternalMyLanguage.g:2759:2: iv_ruleHOUR= ruleHOUR EOF
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
    // InternalMyLanguage.g:2765:1: ruleHOUR returns [EObject current=null] : (otherlv_0= 'hours(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleHOUR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2771:2: ( (otherlv_0= 'hours(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:2772:2: (otherlv_0= 'hours(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:2772:2: (otherlv_0= 'hours(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:2773:3: otherlv_0= 'hours(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getHOURAccess().getHoursKeyword_0());
            		
            // InternalMyLanguage.g:2777:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:2778:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:2778:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:2779:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHOURAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHOURRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyLanguage.g:2804:1: entryRuleMINUTES returns [EObject current=null] : iv_ruleMINUTES= ruleMINUTES EOF ;
    public final EObject entryRuleMINUTES() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMINUTES = null;


        try {
            // InternalMyLanguage.g:2804:48: (iv_ruleMINUTES= ruleMINUTES EOF )
            // InternalMyLanguage.g:2805:2: iv_ruleMINUTES= ruleMINUTES EOF
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
    // InternalMyLanguage.g:2811:1: ruleMINUTES returns [EObject current=null] : (otherlv_0= 'minutes(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleMINUTES() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2817:2: ( (otherlv_0= 'minutes(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:2818:2: (otherlv_0= 'minutes(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:2818:2: (otherlv_0= 'minutes(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:2819:3: otherlv_0= 'minutes(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getMINUTESAccess().getMinutesKeyword_0());
            		
            // InternalMyLanguage.g:2823:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:2824:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:2824:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:2825:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMINUTESAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMINUTESRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyLanguage.g:2850:1: entryRuleMETER returns [EObject current=null] : iv_ruleMETER= ruleMETER EOF ;
    public final EObject entryRuleMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMETER = null;


        try {
            // InternalMyLanguage.g:2850:46: (iv_ruleMETER= ruleMETER EOF )
            // InternalMyLanguage.g:2851:2: iv_ruleMETER= ruleMETER EOF
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
    // InternalMyLanguage.g:2857:1: ruleMETER returns [EObject current=null] : (otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleMETER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2863:2: ( (otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:2864:2: (otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:2864:2: (otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:2865:3: otherlv_0= 'meter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getMETERAccess().getMeterKeyword_0());
            		
            // InternalMyLanguage.g:2869:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:2870:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:2870:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:2871:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMETERAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
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

            otherlv_2=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyLanguage.g:2896:1: entryRuleCENTIMETER returns [EObject current=null] : iv_ruleCENTIMETER= ruleCENTIMETER EOF ;
    public final EObject entryRuleCENTIMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCENTIMETER = null;


        try {
            // InternalMyLanguage.g:2896:51: (iv_ruleCENTIMETER= ruleCENTIMETER EOF )
            // InternalMyLanguage.g:2897:2: iv_ruleCENTIMETER= ruleCENTIMETER EOF
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
    // InternalMyLanguage.g:2903:1: ruleCENTIMETER returns [EObject current=null] : (otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleCENTIMETER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2909:2: ( (otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:2910:2: (otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:2910:2: (otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:2911:3: otherlv_0= 'centimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCENTIMETERAccess().getCentimeterKeyword_0());
            		
            // InternalMyLanguage.g:2915:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:2916:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:2916:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:2917:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getCENTIMETERAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
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

            otherlv_2=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyLanguage.g:2942:1: entryRuleMILLIMETER returns [EObject current=null] : iv_ruleMILLIMETER= ruleMILLIMETER EOF ;
    public final EObject entryRuleMILLIMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMILLIMETER = null;


        try {
            // InternalMyLanguage.g:2942:51: (iv_ruleMILLIMETER= ruleMILLIMETER EOF )
            // InternalMyLanguage.g:2943:2: iv_ruleMILLIMETER= ruleMILLIMETER EOF
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
    // InternalMyLanguage.g:2949:1: ruleMILLIMETER returns [EObject current=null] : (otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleMILLIMETER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:2955:2: ( (otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:2956:2: (otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:2956:2: (otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:2957:3: otherlv_0= 'millimeter(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getMILLIMETERAccess().getMillimeterKeyword_0());
            		
            // InternalMyLanguage.g:2961:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:2962:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:2962:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:2963:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getMILLIMETERAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
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

            otherlv_2=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyLanguage.g:2988:1: entryRuleKILOMETER returns [EObject current=null] : iv_ruleKILOMETER= ruleKILOMETER EOF ;
    public final EObject entryRuleKILOMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKILOMETER = null;


        try {
            // InternalMyLanguage.g:2988:50: (iv_ruleKILOMETER= ruleKILOMETER EOF )
            // InternalMyLanguage.g:2989:2: iv_ruleKILOMETER= ruleKILOMETER EOF
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
    // InternalMyLanguage.g:2995:1: ruleKILOMETER returns [EObject current=null] : (otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject ruleKILOMETER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3001:2: ( (otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:3002:2: (otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:3002:2: (otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:3003:3: otherlv_0= 'kilometer(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getKILOMETERAccess().getKilometerKeyword_0());
            		
            // InternalMyLanguage.g:3007:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3008:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3008:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3009:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getKILOMETERAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
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

            otherlv_2=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyLanguage.g:3034:1: entryRulePercentUnit returns [EObject current=null] : iv_rulePercentUnit= rulePercentUnit EOF ;
    public final EObject entryRulePercentUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePercentUnit = null;


        try {
            // InternalMyLanguage.g:3034:52: (iv_rulePercentUnit= rulePercentUnit EOF )
            // InternalMyLanguage.g:3035:2: iv_rulePercentUnit= rulePercentUnit EOF
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
    // InternalMyLanguage.g:3041:1: rulePercentUnit returns [EObject current=null] : (otherlv_0= 'percent(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) ;
    public final EObject rulePercentUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyLanguage.g:3047:2: ( (otherlv_0= 'percent(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' ) )
            // InternalMyLanguage.g:3048:2: (otherlv_0= 'percent(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            {
            // InternalMyLanguage.g:3048:2: (otherlv_0= 'percent(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')' )
            // InternalMyLanguage.g:3049:3: otherlv_0= 'percent(' ( (lv_value_1_0= ruleDOUBLE ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getPercentUnitAccess().getPercentKeyword_0());
            		
            // InternalMyLanguage.g:3053:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalMyLanguage.g:3054:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalMyLanguage.g:3054:4: (lv_value_1_0= ruleDOUBLE )
            // InternalMyLanguage.g:3055:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getPercentUnitAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPercentUnitRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyLanguage.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMyLanguage.g:3080:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalMyLanguage.g:3080:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalMyLanguage.g:3081:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalMyLanguage.g:3087:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyLanguage.g:3093:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalMyLanguage.g:3094:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalMyLanguage.g:3094:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalMyLanguage.g:3095:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_48); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            // InternalMyLanguage.g:3102:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==86) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyLanguage.g:3103:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,86,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1());
                    			

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

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\35\6\uffff\10\22\2\uffff\1\44\1\uffff";
    static final String dfa_3s = "\1\114\6\uffff\10\74\2\uffff\1\46\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\10\uffff\1\7\1\10\1\uffff\1\11";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\5\uffff\1\16\6\uffff\1\6\1\uffff\1\4\6\uffff\1\3\5\uffff\1\2\3\uffff\1\5\10\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\51\uffff\1\17",
            "\1\20\51\uffff\1\17",
            "\1\20\51\uffff\1\17",
            "\1\20\51\uffff\1\17",
            "\1\20\51\uffff\1\17",
            "\1\20\51\uffff\1\17",
            "\1\20\51\uffff\1\17",
            "\1\21\51\uffff\1\17",
            "",
            "",
            "\2\22\1\20",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1127:3: (this_RobotPositionSent_1= ruleRobotPositionSent | this_RobotSpeedSent_2= ruleRobotSpeedSent | this_RobotStateSent_3= ruleRobotStateSent | this_RobotDistanceSent_4= ruleRobotDistanceSent | this_RiskSent_5= ruleRiskSent | this_PayloadSent_6= rulePayloadSent | this_FailingComponentSent_7= ruleFailingComponentSent | this_RedundantComponent_8= ruleRedundantComponent | this_RobotAutoPilot_9= ruleRobotAutoPilot )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0400000494110000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x000000000001A000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0005800000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000300020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x2208140820000000L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000034L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});

}