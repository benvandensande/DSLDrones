/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyLanguageParser;
import org.xtext.example.mydsl.services.MyLanguageGrammarAccess;

public class MyLanguageParser extends AbstractContentAssistParser {

	@Inject
	private MyLanguageGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyLanguageParser createParser() {
		InternalMyLanguageParser result = new InternalMyLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getStatementBodyAccess().getAlternatives(), "rule__StatementBody__Alternatives");
					put(grammarAccess.getGPSSentAccess().getSentAlternatives_1_0(), "rule__GPSSent__SentAlternatives_1_0");
					put(grammarAccess.getGPSReadingSentAccess().getToleranceAlternatives_5_0(), "rule__GPSReadingSent__ToleranceAlternatives_5_0");
					put(grammarAccess.getBaroSentAccess().getSentAlternatives_1_0(), "rule__BaroSent__SentAlternatives_1_0");
					put(grammarAccess.getBaroAltSentAccess().getSentAlternatives_2_0(), "rule__BaroAltSent__SentAlternatives_2_0");
					put(grammarAccess.getSonarSentAccess().getSentAlternatives_1_0(), "rule__SonarSent__SentAlternatives_1_0");
					put(grammarAccess.getSonarDistanceSentAccess().getSentAlternatives_2_0(), "rule__SonarDistanceSent__SentAlternatives_2_0");
					put(grammarAccess.getBatterySentAccess().getSentAlternatives_1_0(), "rule__BatterySent__SentAlternatives_1_0");
					put(grammarAccess.getBatteryLevelSentAccess().getSentAlternatives_2_0(), "rule__BatteryLevelSent__SentAlternatives_2_0");
					put(grammarAccess.getPeopleSentAccess().getAlternatives_1(), "rule__PeopleSent__Alternatives_1");
					put(grammarAccess.getPeoplePosSentAccess().getToleranceAlternatives_5_0(), "rule__PeoplePosSent__ToleranceAlternatives_5_0");
					put(grammarAccess.getMissionSentAccess().getAlternatives_1(), "rule__MissionSent__Alternatives_1");
					put(grammarAccess.getRobotAccess().getAlternatives_1(), "rule__Robot__Alternatives_1");
					put(grammarAccess.getRobotAutoPilotAccess().getStatusAlternatives_2_0(), "rule__RobotAutoPilot__StatusAlternatives_2_0");
					put(grammarAccess.getRobotDistanceSentAccess().getSentAlternatives_2_0(), "rule__RobotDistanceSent__SentAlternatives_2_0");
					put(grammarAccess.getDistanceToLocationSentAccess().getBodyAlternatives_4_0(), "rule__DistanceToLocationSent__BodyAlternatives_4_0");
					put(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAlternatives_2_0(), "rule__DistanceToObstaclesSent__BodyAlternatives_2_0");
					put(grammarAccess.getEqualSentAccess().getAmountAlternatives_2_0(), "rule__EqualSent__AmountAlternatives_2_0");
					put(grammarAccess.getLessSentAccess().getAmountAlternatives_2_0(), "rule__LessSent__AmountAlternatives_2_0");
					put(grammarAccess.getGreaterSentAccess().getAmountAlternatives_2_0(), "rule__GreaterSent__AmountAlternatives_2_0");
					put(grammarAccess.getRobotPositionSentAccess().getToleranceAlternatives_5_0(), "rule__RobotPositionSent__ToleranceAlternatives_5_0");
					put(grammarAccess.getEnvironmentSentAccess().getBodyAlternatives_3_0(), "rule__EnvironmentSent__BodyAlternatives_3_0");
					put(grammarAccess.getMISSIONSTATUSAccess().getAlternatives(), "rule__MISSIONSTATUS__Alternatives");
					put(grammarAccess.getMISSIONRISKLEVELAccess().getAlternatives(), "rule__MISSIONRISKLEVEL__Alternatives");
					put(grammarAccess.getCOLLISIONRISKLEVELAccess().getAlternatives(), "rule__COLLISIONRISKLEVEL__Alternatives");
					put(grammarAccess.getCOMPSTATUSAccess().getAlternatives(), "rule__COMPSTATUS__Alternatives");
					put(grammarAccess.getSpeedUnitAccess().getAlternatives(), "rule__SpeedUnit__Alternatives");
					put(grammarAccess.getDistanceUnitAccess().getAlternatives(), "rule__DistanceUnit__Alternatives");
					put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
					put(grammarAccess.getTestAccess().getGroup(), "rule__Test__Group__0");
					put(grammarAccess.getTestAccess().getGroup_2(), "rule__Test__Group_2__0");
					put(grammarAccess.getGivenAccess().getGroup(), "rule__Given__Group__0");
					put(grammarAccess.getThenAccess().getGroup(), "rule__Then__Group__0");
					put(grammarAccess.getWhenAccess().getGroup(), "rule__When__Group__0");
					put(grammarAccess.getCompStatusSentAccess().getGroup(), "rule__CompStatusSent__Group__0");
					put(grammarAccess.getGPSSentAccess().getGroup(), "rule__GPSSent__Group__0");
					put(grammarAccess.getGPSReadingSentAccess().getGroup(), "rule__GPSReadingSent__Group__0");
					put(grammarAccess.getBaroSentAccess().getGroup(), "rule__BaroSent__Group__0");
					put(grammarAccess.getBaroAltSentAccess().getGroup(), "rule__BaroAltSent__Group__0");
					put(grammarAccess.getSonarSentAccess().getGroup(), "rule__SonarSent__Group__0");
					put(grammarAccess.getSonarDistanceSentAccess().getGroup(), "rule__SonarDistanceSent__Group__0");
					put(grammarAccess.getNotificationSentAccess().getGroup(), "rule__NotificationSent__Group__0");
					put(grammarAccess.getTimeSentAccess().getGroup(), "rule__TimeSent__Group__0");
					put(grammarAccess.getTimeIntervalAccess().getGroup(), "rule__TimeInterval__Group__0");
					put(grammarAccess.getBatterySentAccess().getGroup(), "rule__BatterySent__Group__0");
					put(grammarAccess.getBatteryLevelSentAccess().getGroup(), "rule__BatteryLevelSent__Group__0");
					put(grammarAccess.getPeopleSentAccess().getGroup(), "rule__PeopleSent__Group__0");
					put(grammarAccess.getPeoplePosSentAccess().getGroup(), "rule__PeoplePosSent__Group__0");
					put(grammarAccess.getPeopleNumbSentAccess().getGroup(), "rule__PeopleNumbSent__Group__0");
					put(grammarAccess.getMissionSentAccess().getGroup(), "rule__MissionSent__Group__0");
					put(grammarAccess.getMissionGoalSentAccess().getGroup(), "rule__MissionGoalSent__Group__0");
					put(grammarAccess.getMissionRiskLevelSentAccess().getGroup(), "rule__MissionRiskLevelSent__Group__0");
					put(grammarAccess.getMissionStatusSentAccess().getGroup(), "rule__MissionStatusSent__Group__0");
					put(grammarAccess.getRobotAccess().getGroup(), "rule__Robot__Group__0");
					put(grammarAccess.getRobotAutoPilotAccess().getGroup(), "rule__RobotAutoPilot__Group__0");
					put(grammarAccess.getPayloadSentAccess().getGroup(), "rule__PayloadSent__Group__0");
					put(grammarAccess.getRobotDistanceSentAccess().getGroup(), "rule__RobotDistanceSent__Group__0");
					put(grammarAccess.getDistanceToLocationSentAccess().getGroup(), "rule__DistanceToLocationSent__Group__0");
					put(grammarAccess.getDistanceToObstaclesSentAccess().getGroup(), "rule__DistanceToObstaclesSent__Group__0");
					put(grammarAccess.getEqualSentAccess().getGroup(), "rule__EqualSent__Group__0");
					put(grammarAccess.getLessSentAccess().getGroup(), "rule__LessSent__Group__0");
					put(grammarAccess.getGreaterSentAccess().getGroup(), "rule__GreaterSent__Group__0");
					put(grammarAccess.getRobotStateSentAccess().getGroup(), "rule__RobotStateSent__Group__0");
					put(grammarAccess.getRobotPositionSentAccess().getGroup(), "rule__RobotPositionSent__Group__0");
					put(grammarAccess.getCirclePositionAccess().getGroup(), "rule__CirclePosition__Group__0");
					put(grammarAccess.getSpherePositionAccess().getGroup(), "rule__SpherePosition__Group__0");
					put(grammarAccess.getRobotSpeedSentAccess().getGroup(), "rule__RobotSpeedSent__Group__0");
					put(grammarAccess.getEnvironmentSentAccess().getGroup(), "rule__EnvironmentSent__Group__0");
					put(grammarAccess.getRiskSentAccess().getGroup(), "rule__RiskSent__Group__0");
					put(grammarAccess.getToleranceSentAccess().getGroup(), "rule__ToleranceSent__Group__0");
					put(grammarAccess.getMSAccess().getGroup(), "rule__MS__Group__0");
					put(grammarAccess.getKMSAccess().getGroup(), "rule__KMS__Group__0");
					put(grammarAccess.getMHAccess().getGroup(), "rule__MH__Group__0");
					put(grammarAccess.getKMHAccess().getGroup(), "rule__KMH__Group__0");
					put(grammarAccess.getSECONDSAccess().getGroup(), "rule__SECONDS__Group__0");
					put(grammarAccess.getHOURAccess().getGroup(), "rule__HOUR__Group__0");
					put(grammarAccess.getMINUTESAccess().getGroup(), "rule__MINUTES__Group__0");
					put(grammarAccess.getMETERAccess().getGroup(), "rule__METER__Group__0");
					put(grammarAccess.getCENTIMETERAccess().getGroup(), "rule__CENTIMETER__Group__0");
					put(grammarAccess.getMILLIMETERAccess().getGroup(), "rule__MILLIMETER__Group__0");
					put(grammarAccess.getKILOMETERAccess().getGroup(), "rule__KILOMETER__Group__0");
					put(grammarAccess.getPercentUnitAccess().getGroup(), "rule__PercentUnit__Group__0");
					put(grammarAccess.getDOUBLEAccess().getGroup(), "rule__DOUBLE__Group__0");
					put(grammarAccess.getDOUBLEAccess().getGroup_2(), "rule__DOUBLE__Group_2__0");
					put(grammarAccess.getPositiveDoubleAccess().getGroup(), "rule__PositiveDouble__Group__0");
					put(grammarAccess.getPositiveDoubleAccess().getGroup_1(), "rule__PositiveDouble__Group_1__0");
					put(grammarAccess.getTestFileAccess().getTestsAssignment(), "rule__TestFile__TestsAssignment");
					put(grammarAccess.getTestAccess().getNameAssignment_1(), "rule__Test__NameAssignment_1");
					put(grammarAccess.getTestAccess().getDescriptionAssignment_2_1(), "rule__Test__DescriptionAssignment_2_1");
					put(grammarAccess.getTestAccess().getStatementsAssignment_3(), "rule__Test__StatementsAssignment_3");
					put(grammarAccess.getGivenAccess().getBodyAssignment_1(), "rule__Given__BodyAssignment_1");
					put(grammarAccess.getThenAccess().getBodyAssignment_1(), "rule__Then__BodyAssignment_1");
					put(grammarAccess.getWhenAccess().getBodyAssignment_1(), "rule__When__BodyAssignment_1");
					put(grammarAccess.getCompStatusSentAccess().getStatusAssignment_2(), "rule__CompStatusSent__StatusAssignment_2");
					put(grammarAccess.getGPSSentAccess().getSentAssignment_1(), "rule__GPSSent__SentAssignment_1");
					put(grammarAccess.getGPSReadingSentAccess().getPosXAssignment_2(), "rule__GPSReadingSent__PosXAssignment_2");
					put(grammarAccess.getGPSReadingSentAccess().getPosYAssignment_3(), "rule__GPSReadingSent__PosYAssignment_3");
					put(grammarAccess.getGPSReadingSentAccess().getPosZAssignment_4(), "rule__GPSReadingSent__PosZAssignment_4");
					put(grammarAccess.getGPSReadingSentAccess().getToleranceAssignment_5(), "rule__GPSReadingSent__ToleranceAssignment_5");
					put(grammarAccess.getBaroSentAccess().getSentAssignment_1(), "rule__BaroSent__SentAssignment_1");
					put(grammarAccess.getBaroAltSentAccess().getSentAssignment_2(), "rule__BaroAltSent__SentAssignment_2");
					put(grammarAccess.getSonarSentAccess().getSentAssignment_1(), "rule__SonarSent__SentAssignment_1");
					put(grammarAccess.getSonarDistanceSentAccess().getSentAssignment_2(), "rule__SonarDistanceSent__SentAssignment_2");
					put(grammarAccess.getNotificationSentAccess().getNotAssignment_0(), "rule__NotificationSent__NotAssignment_0");
					put(grammarAccess.getTimeIntervalAccess().getFirstAssignment_3(), "rule__TimeInterval__FirstAssignment_3");
					put(grammarAccess.getTimeIntervalAccess().getSecondAssignment_5(), "rule__TimeInterval__SecondAssignment_5");
					put(grammarAccess.getBatterySentAccess().getSentAssignment_1(), "rule__BatterySent__SentAssignment_1");
					put(grammarAccess.getBatteryLevelSentAccess().getSentAssignment_2(), "rule__BatteryLevelSent__SentAssignment_2");
					put(grammarAccess.getPeoplePosSentAccess().getPosXAssignment_2(), "rule__PeoplePosSent__PosXAssignment_2");
					put(grammarAccess.getPeoplePosSentAccess().getPosYAssignment_3(), "rule__PeoplePosSent__PosYAssignment_3");
					put(grammarAccess.getPeoplePosSentAccess().getPosZAssignment_4(), "rule__PeoplePosSent__PosZAssignment_4");
					put(grammarAccess.getPeoplePosSentAccess().getToleranceAssignment_5(), "rule__PeoplePosSent__ToleranceAssignment_5");
					put(grammarAccess.getPeopleNumbSentAccess().getAmountAssignment_2(), "rule__PeopleNumbSent__AmountAssignment_2");
					put(grammarAccess.getMissionGoalSentAccess().getPosXAssignment_2(), "rule__MissionGoalSent__PosXAssignment_2");
					put(grammarAccess.getMissionGoalSentAccess().getPosYAssignment_3(), "rule__MissionGoalSent__PosYAssignment_3");
					put(grammarAccess.getMissionGoalSentAccess().getPosZAssignment_4(), "rule__MissionGoalSent__PosZAssignment_4");
					put(grammarAccess.getMissionRiskLevelSentAccess().getRisklevelAssignment_2(), "rule__MissionRiskLevelSent__RisklevelAssignment_2");
					put(grammarAccess.getMissionStatusSentAccess().getStateAssignment_2(), "rule__MissionStatusSent__StateAssignment_2");
					put(grammarAccess.getRobotAutoPilotAccess().getStatusAssignment_2(), "rule__RobotAutoPilot__StatusAssignment_2");
					put(grammarAccess.getPayloadSentAccess().getLoadAssignment_0(), "rule__PayloadSent__LoadAssignment_0");
					put(grammarAccess.getRobotDistanceSentAccess().getSentAssignment_2(), "rule__RobotDistanceSent__SentAssignment_2");
					put(grammarAccess.getDistanceToLocationSentAccess().getPosXAssignment_0(), "rule__DistanceToLocationSent__PosXAssignment_0");
					put(grammarAccess.getDistanceToLocationSentAccess().getPosYAssignment_1(), "rule__DistanceToLocationSent__PosYAssignment_1");
					put(grammarAccess.getDistanceToLocationSentAccess().getPosZAssignment_2(), "rule__DistanceToLocationSent__PosZAssignment_2");
					put(grammarAccess.getDistanceToLocationSentAccess().getBodyAssignment_4(), "rule__DistanceToLocationSent__BodyAssignment_4");
					put(grammarAccess.getDistanceToLocationSentAccess().getToleranceAssignment_5(), "rule__DistanceToLocationSent__ToleranceAssignment_5");
					put(grammarAccess.getDistanceToObstaclesSentAccess().getBodyAssignment_2(), "rule__DistanceToObstaclesSent__BodyAssignment_2");
					put(grammarAccess.getDistanceToObstaclesSentAccess().getToleranceAssignment_3(), "rule__DistanceToObstaclesSent__ToleranceAssignment_3");
					put(grammarAccess.getEqualSentAccess().getAmountAssignment_2(), "rule__EqualSent__AmountAssignment_2");
					put(grammarAccess.getLessSentAccess().getAmountAssignment_2(), "rule__LessSent__AmountAssignment_2");
					put(grammarAccess.getGreaterSentAccess().getAmountAssignment_2(), "rule__GreaterSent__AmountAssignment_2");
					put(grammarAccess.getRobotStateSentAccess().getStateAssignment_2(), "rule__RobotStateSent__StateAssignment_2");
					put(grammarAccess.getRobotPositionSentAccess().getPosXAssignment_2(), "rule__RobotPositionSent__PosXAssignment_2");
					put(grammarAccess.getRobotPositionSentAccess().getPosYAssignment_3(), "rule__RobotPositionSent__PosYAssignment_3");
					put(grammarAccess.getRobotPositionSentAccess().getPosZAssignment_4(), "rule__RobotPositionSent__PosZAssignment_4");
					put(grammarAccess.getRobotPositionSentAccess().getToleranceAssignment_5(), "rule__RobotPositionSent__ToleranceAssignment_5");
					put(grammarAccess.getCirclePositionAccess().getToleranceAssignment_4(), "rule__CirclePosition__ToleranceAssignment_4");
					put(grammarAccess.getSpherePositionAccess().getToleranceAssignment_4(), "rule__SpherePosition__ToleranceAssignment_4");
					put(grammarAccess.getRobotSpeedSentAccess().getSpeedAssignment_2(), "rule__RobotSpeedSent__SpeedAssignment_2");
					put(grammarAccess.getEnvironmentSentAccess().getBodyAssignment_3(), "rule__EnvironmentSent__BodyAssignment_3");
					put(grammarAccess.getRiskSentAccess().getLevelAssignment_2(), "rule__RiskSent__LevelAssignment_2");
					put(grammarAccess.getToleranceSentAccess().getUnitAssignment_2(), "rule__ToleranceSent__UnitAssignment_2");
					put(grammarAccess.getMSAccess().getXAssignment_1(), "rule__MS__XAssignment_1");
					put(grammarAccess.getMSAccess().getYAssignment_3(), "rule__MS__YAssignment_3");
					put(grammarAccess.getMSAccess().getZAssignment_5(), "rule__MS__ZAssignment_5");
					put(grammarAccess.getKMSAccess().getXAssignment_1(), "rule__KMS__XAssignment_1");
					put(grammarAccess.getKMSAccess().getYAssignment_3(), "rule__KMS__YAssignment_3");
					put(grammarAccess.getKMSAccess().getZAssignment_5(), "rule__KMS__ZAssignment_5");
					put(grammarAccess.getMHAccess().getXAssignment_1(), "rule__MH__XAssignment_1");
					put(grammarAccess.getMHAccess().getYAssignment_3(), "rule__MH__YAssignment_3");
					put(grammarAccess.getMHAccess().getZAssignment_5(), "rule__MH__ZAssignment_5");
					put(grammarAccess.getKMHAccess().getXAssignment_1(), "rule__KMH__XAssignment_1");
					put(grammarAccess.getKMHAccess().getYAssignment_3(), "rule__KMH__YAssignment_3");
					put(grammarAccess.getKMHAccess().getZAssignment_5(), "rule__KMH__ZAssignment_5");
					put(grammarAccess.getSECONDSAccess().getValueAssignment_1(), "rule__SECONDS__ValueAssignment_1");
					put(grammarAccess.getHOURAccess().getValueAssignment_1(), "rule__HOUR__ValueAssignment_1");
					put(grammarAccess.getMINUTESAccess().getValueAssignment_1(), "rule__MINUTES__ValueAssignment_1");
					put(grammarAccess.getMETERAccess().getValueAssignment_1(), "rule__METER__ValueAssignment_1");
					put(grammarAccess.getCENTIMETERAccess().getValueAssignment_1(), "rule__CENTIMETER__ValueAssignment_1");
					put(grammarAccess.getMILLIMETERAccess().getValueAssignment_1(), "rule__MILLIMETER__ValueAssignment_1");
					put(grammarAccess.getKILOMETERAccess().getValueAssignment_1(), "rule__KILOMETER__ValueAssignment_1");
					put(grammarAccess.getPercentUnitAccess().getValueAssignment_1(), "rule__PercentUnit__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyLanguageParser typedParser = (InternalMyLanguageParser) parser;
			typedParser.entryRuleTestFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
