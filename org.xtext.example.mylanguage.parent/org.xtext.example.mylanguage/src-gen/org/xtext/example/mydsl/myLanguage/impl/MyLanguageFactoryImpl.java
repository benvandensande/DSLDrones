/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyLanguageFactoryImpl extends EFactoryImpl implements MyLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyLanguageFactory init()
  {
    try
    {
      MyLanguageFactory theMyLanguageFactory = (MyLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(MyLanguagePackage.eNS_URI);
      if (theMyLanguageFactory != null)
      {
        return theMyLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyLanguagePackage.TEST_FILE: return createTestFile();
      case MyLanguagePackage.TEST: return createTest();
      case MyLanguagePackage.STATEMENT: return createStatement();
      case MyLanguagePackage.GIVEN: return createGiven();
      case MyLanguagePackage.THEN: return createThen();
      case MyLanguagePackage.WHEN: return createWhen();
      case MyLanguagePackage.STATEMENT_BODY: return createStatementBody();
      case MyLanguagePackage.COMP_STATUS_SENT: return createCompStatusSent();
      case MyLanguagePackage.GPS_SENT: return createGPSSent();
      case MyLanguagePackage.GPS_READING_SENT: return createGPSReadingSent();
      case MyLanguagePackage.BARO_SENT: return createBaroSent();
      case MyLanguagePackage.BARO_ALT_SENT: return createBaroAltSent();
      case MyLanguagePackage.SONAR_SENT: return createSonarSent();
      case MyLanguagePackage.SONAR_DISTANCE_SENT: return createSonarDistanceSent();
      case MyLanguagePackage.NOTIFICATION_SENT: return createNotificationSent();
      case MyLanguagePackage.TIME_SENT: return createTimeSent();
      case MyLanguagePackage.TIME_INTERVAL: return createTimeInterval();
      case MyLanguagePackage.BATTERY_SENT: return createBatterySent();
      case MyLanguagePackage.BATTERY_LEVEL_SENT: return createBatteryLevelSent();
      case MyLanguagePackage.PEOPLE_SENT: return createPeopleSent();
      case MyLanguagePackage.PEOPLE_POS_SENT: return createPeoplePosSent();
      case MyLanguagePackage.PEOPLE_NUMB_SENT: return createPeopleNumbSent();
      case MyLanguagePackage.MISSION_SENT: return createMissionSent();
      case MyLanguagePackage.MISSION_GOAL_SENT: return createMissionGoalSent();
      case MyLanguagePackage.MISSION_RISK_LEVEL_SENT: return createMissionRiskLevelSent();
      case MyLanguagePackage.MISSION_STATUS_SENT: return createMissionStatusSent();
      case MyLanguagePackage.ROBOT: return createRobot();
      case MyLanguagePackage.ROBOT_AUTO_PILOT: return createRobotAutoPilot();
      case MyLanguagePackage.PAYLOAD_SENT: return createPayloadSent();
      case MyLanguagePackage.ROBOT_DISTANCE_SENT: return createRobotDistanceSent();
      case MyLanguagePackage.DISTANCE_TO_LOCATION_SENT: return createDistanceToLocationSent();
      case MyLanguagePackage.DISTANCE_TO_OBSTACLES_SENT: return createDistanceToObstaclesSent();
      case MyLanguagePackage.EQUAL_SENT: return createEqualSent();
      case MyLanguagePackage.LESS_SENT: return createLessSent();
      case MyLanguagePackage.GREATER_SENT: return createGreaterSent();
      case MyLanguagePackage.ROBOT_STATE_SENT: return createRobotStateSent();
      case MyLanguagePackage.ROBOT_POSITION_SENT: return createRobotPositionSent();
      case MyLanguagePackage.CIRCLE_POSITION: return createCirclePosition();
      case MyLanguagePackage.SPHERE_POSITION: return createSpherePosition();
      case MyLanguagePackage.ROBOT_SPEED_SENT: return createRobotSpeedSent();
      case MyLanguagePackage.ENVIRONMENT_SENT: return createEnvironmentSent();
      case MyLanguagePackage.RISK_SENT: return createRiskSent();
      case MyLanguagePackage.TOLERANCE_SENT: return createToleranceSent();
      case MyLanguagePackage.SPEED_UNIT: return createSpeedUnit();
      case MyLanguagePackage.MS: return createMS();
      case MyLanguagePackage.KMS: return createKMS();
      case MyLanguagePackage.MH: return createMH();
      case MyLanguagePackage.KMH: return createKMH();
      case MyLanguagePackage.DISTANCE_UNIT: return createDistanceUnit();
      case MyLanguagePackage.TIME_UNIT: return createTimeUnit();
      case MyLanguagePackage.SECONDS: return createSECONDS();
      case MyLanguagePackage.HOUR: return createHOUR();
      case MyLanguagePackage.MINUTES: return createMINUTES();
      case MyLanguagePackage.METER: return createMETER();
      case MyLanguagePackage.CENTIMETER: return createCENTIMETER();
      case MyLanguagePackage.MILLIMETER: return createMILLIMETER();
      case MyLanguagePackage.KILOMETER: return createKILOMETER();
      case MyLanguagePackage.PERCENT_UNIT: return createPercentUnit();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestFile createTestFile()
  {
    TestFileImpl testFile = new TestFileImpl();
    return testFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test createTest()
  {
    TestImpl test = new TestImpl();
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Given createGiven()
  {
    GivenImpl given = new GivenImpl();
    return given;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Then createThen()
  {
    ThenImpl then = new ThenImpl();
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public When createWhen()
  {
    WhenImpl when = new WhenImpl();
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBody createStatementBody()
  {
    StatementBodyImpl statementBody = new StatementBodyImpl();
    return statementBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompStatusSent createCompStatusSent()
  {
    CompStatusSentImpl compStatusSent = new CompStatusSentImpl();
    return compStatusSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GPSSent createGPSSent()
  {
    GPSSentImpl gpsSent = new GPSSentImpl();
    return gpsSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GPSReadingSent createGPSReadingSent()
  {
    GPSReadingSentImpl gpsReadingSent = new GPSReadingSentImpl();
    return gpsReadingSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaroSent createBaroSent()
  {
    BaroSentImpl baroSent = new BaroSentImpl();
    return baroSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaroAltSent createBaroAltSent()
  {
    BaroAltSentImpl baroAltSent = new BaroAltSentImpl();
    return baroAltSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SonarSent createSonarSent()
  {
    SonarSentImpl sonarSent = new SonarSentImpl();
    return sonarSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SonarDistanceSent createSonarDistanceSent()
  {
    SonarDistanceSentImpl sonarDistanceSent = new SonarDistanceSentImpl();
    return sonarDistanceSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationSent createNotificationSent()
  {
    NotificationSentImpl notificationSent = new NotificationSentImpl();
    return notificationSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeSent createTimeSent()
  {
    TimeSentImpl timeSent = new TimeSentImpl();
    return timeSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeInterval createTimeInterval()
  {
    TimeIntervalImpl timeInterval = new TimeIntervalImpl();
    return timeInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BatterySent createBatterySent()
  {
    BatterySentImpl batterySent = new BatterySentImpl();
    return batterySent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BatteryLevelSent createBatteryLevelSent()
  {
    BatteryLevelSentImpl batteryLevelSent = new BatteryLevelSentImpl();
    return batteryLevelSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PeopleSent createPeopleSent()
  {
    PeopleSentImpl peopleSent = new PeopleSentImpl();
    return peopleSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PeoplePosSent createPeoplePosSent()
  {
    PeoplePosSentImpl peoplePosSent = new PeoplePosSentImpl();
    return peoplePosSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PeopleNumbSent createPeopleNumbSent()
  {
    PeopleNumbSentImpl peopleNumbSent = new PeopleNumbSentImpl();
    return peopleNumbSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MissionSent createMissionSent()
  {
    MissionSentImpl missionSent = new MissionSentImpl();
    return missionSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MissionGoalSent createMissionGoalSent()
  {
    MissionGoalSentImpl missionGoalSent = new MissionGoalSentImpl();
    return missionGoalSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MissionRiskLevelSent createMissionRiskLevelSent()
  {
    MissionRiskLevelSentImpl missionRiskLevelSent = new MissionRiskLevelSentImpl();
    return missionRiskLevelSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MissionStatusSent createMissionStatusSent()
  {
    MissionStatusSentImpl missionStatusSent = new MissionStatusSentImpl();
    return missionStatusSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Robot createRobot()
  {
    RobotImpl robot = new RobotImpl();
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotAutoPilot createRobotAutoPilot()
  {
    RobotAutoPilotImpl robotAutoPilot = new RobotAutoPilotImpl();
    return robotAutoPilot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PayloadSent createPayloadSent()
  {
    PayloadSentImpl payloadSent = new PayloadSentImpl();
    return payloadSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotDistanceSent createRobotDistanceSent()
  {
    RobotDistanceSentImpl robotDistanceSent = new RobotDistanceSentImpl();
    return robotDistanceSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistanceToLocationSent createDistanceToLocationSent()
  {
    DistanceToLocationSentImpl distanceToLocationSent = new DistanceToLocationSentImpl();
    return distanceToLocationSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistanceToObstaclesSent createDistanceToObstaclesSent()
  {
    DistanceToObstaclesSentImpl distanceToObstaclesSent = new DistanceToObstaclesSentImpl();
    return distanceToObstaclesSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualSent createEqualSent()
  {
    EqualSentImpl equalSent = new EqualSentImpl();
    return equalSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LessSent createLessSent()
  {
    LessSentImpl lessSent = new LessSentImpl();
    return lessSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreaterSent createGreaterSent()
  {
    GreaterSentImpl greaterSent = new GreaterSentImpl();
    return greaterSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotStateSent createRobotStateSent()
  {
    RobotStateSentImpl robotStateSent = new RobotStateSentImpl();
    return robotStateSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotPositionSent createRobotPositionSent()
  {
    RobotPositionSentImpl robotPositionSent = new RobotPositionSentImpl();
    return robotPositionSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CirclePosition createCirclePosition()
  {
    CirclePositionImpl circlePosition = new CirclePositionImpl();
    return circlePosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpherePosition createSpherePosition()
  {
    SpherePositionImpl spherePosition = new SpherePositionImpl();
    return spherePosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotSpeedSent createRobotSpeedSent()
  {
    RobotSpeedSentImpl robotSpeedSent = new RobotSpeedSentImpl();
    return robotSpeedSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentSent createEnvironmentSent()
  {
    EnvironmentSentImpl environmentSent = new EnvironmentSentImpl();
    return environmentSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RiskSent createRiskSent()
  {
    RiskSentImpl riskSent = new RiskSentImpl();
    return riskSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToleranceSent createToleranceSent()
  {
    ToleranceSentImpl toleranceSent = new ToleranceSentImpl();
    return toleranceSent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpeedUnit createSpeedUnit()
  {
    SpeedUnitImpl speedUnit = new SpeedUnitImpl();
    return speedUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MS createMS()
  {
    MSImpl ms = new MSImpl();
    return ms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KMS createKMS()
  {
    KMSImpl kms = new KMSImpl();
    return kms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MH createMH()
  {
    MHImpl mh = new MHImpl();
    return mh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KMH createKMH()
  {
    KMHImpl kmh = new KMHImpl();
    return kmh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistanceUnit createDistanceUnit()
  {
    DistanceUnitImpl distanceUnit = new DistanceUnitImpl();
    return distanceUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnit createTimeUnit()
  {
    TimeUnitImpl timeUnit = new TimeUnitImpl();
    return timeUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SECONDS createSECONDS()
  {
    SECONDSImpl seconds = new SECONDSImpl();
    return seconds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HOUR createHOUR()
  {
    HOURImpl hour = new HOURImpl();
    return hour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MINUTES createMINUTES()
  {
    MINUTESImpl minutes = new MINUTESImpl();
    return minutes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public METER createMETER()
  {
    METERImpl meter = new METERImpl();
    return meter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CENTIMETER createCENTIMETER()
  {
    CENTIMETERImpl centimeter = new CENTIMETERImpl();
    return centimeter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MILLIMETER createMILLIMETER()
  {
    MILLIMETERImpl millimeter = new MILLIMETERImpl();
    return millimeter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KILOMETER createKILOMETER()
  {
    KILOMETERImpl kilometer = new KILOMETERImpl();
    return kilometer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PercentUnit createPercentUnit()
  {
    PercentUnitImpl percentUnit = new PercentUnitImpl();
    return percentUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyLanguagePackage getMyLanguagePackage()
  {
    return (MyLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyLanguagePackage getPackage()
  {
    return MyLanguagePackage.eINSTANCE;
  }

} //MyLanguageFactoryImpl
