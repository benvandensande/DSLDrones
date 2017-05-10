/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl.myLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage
 * @generated
 */
public class MyLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MyLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyLanguageSwitch<Adapter> modelSwitch =
    new MyLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseTestFile(TestFile object)
      {
        return createTestFileAdapter();
      }
      @Override
      public Adapter caseTest(Test object)
      {
        return createTestAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseGiven(Given object)
      {
        return createGivenAdapter();
      }
      @Override
      public Adapter caseThen(Then object)
      {
        return createThenAdapter();
      }
      @Override
      public Adapter caseWhen(When object)
      {
        return createWhenAdapter();
      }
      @Override
      public Adapter caseStatementBody(StatementBody object)
      {
        return createStatementBodyAdapter();
      }
      @Override
      public Adapter caseSonarSent(SonarSent object)
      {
        return createSonarSentAdapter();
      }
      @Override
      public Adapter caseNotificationSent(NotificationSent object)
      {
        return createNotificationSentAdapter();
      }
      @Override
      public Adapter caseTimeSent(TimeSent object)
      {
        return createTimeSentAdapter();
      }
      @Override
      public Adapter caseTimeInterval(TimeInterval object)
      {
        return createTimeIntervalAdapter();
      }
      @Override
      public Adapter caseBatterySent(BatterySent object)
      {
        return createBatterySentAdapter();
      }
      @Override
      public Adapter casePeopleSent(PeopleSent object)
      {
        return createPeopleSentAdapter();
      }
      @Override
      public Adapter casePeoplePosSent(PeoplePosSent object)
      {
        return createPeoplePosSentAdapter();
      }
      @Override
      public Adapter casePeopleNumbSent(PeopleNumbSent object)
      {
        return createPeopleNumbSentAdapter();
      }
      @Override
      public Adapter caseMissionSent(MissionSent object)
      {
        return createMissionSentAdapter();
      }
      @Override
      public Adapter caseMissionGoalSent(MissionGoalSent object)
      {
        return createMissionGoalSentAdapter();
      }
      @Override
      public Adapter caseMissionRiskLevelSent(MissionRiskLevelSent object)
      {
        return createMissionRiskLevelSentAdapter();
      }
      @Override
      public Adapter caseMissionStatusSent(MissionStatusSent object)
      {
        return createMissionStatusSentAdapter();
      }
      @Override
      public Adapter caseRobot(Robot object)
      {
        return createRobotAdapter();
      }
      @Override
      public Adapter caseRobotAutoPilot(RobotAutoPilot object)
      {
        return createRobotAutoPilotAdapter();
      }
      @Override
      public Adapter caseRedundantComponent(RedundantComponent object)
      {
        return createRedundantComponentAdapter();
      }
      @Override
      public Adapter casePayloadSent(PayloadSent object)
      {
        return createPayloadSentAdapter();
      }
      @Override
      public Adapter caseRobotDistanceSent(RobotDistanceSent object)
      {
        return createRobotDistanceSentAdapter();
      }
      @Override
      public Adapter caseDistanceToLocationSent(DistanceToLocationSent object)
      {
        return createDistanceToLocationSentAdapter();
      }
      @Override
      public Adapter caseDistanceToObstaclesSent(DistanceToObstaclesSent object)
      {
        return createDistanceToObstaclesSentAdapter();
      }
      @Override
      public Adapter caseEqualSent(EqualSent object)
      {
        return createEqualSentAdapter();
      }
      @Override
      public Adapter caseLessSent(LessSent object)
      {
        return createLessSentAdapter();
      }
      @Override
      public Adapter caseGreaterSent(GreaterSent object)
      {
        return createGreaterSentAdapter();
      }
      @Override
      public Adapter caseRobotStateSent(RobotStateSent object)
      {
        return createRobotStateSentAdapter();
      }
      @Override
      public Adapter caseRobotPositionSent(RobotPositionSent object)
      {
        return createRobotPositionSentAdapter();
      }
      @Override
      public Adapter caseCirclePosition(CirclePosition object)
      {
        return createCirclePositionAdapter();
      }
      @Override
      public Adapter caseSpherePosition(SpherePosition object)
      {
        return createSpherePositionAdapter();
      }
      @Override
      public Adapter caseRobotSpeedSent(RobotSpeedSent object)
      {
        return createRobotSpeedSentAdapter();
      }
      @Override
      public Adapter caseEnvironmentSent(EnvironmentSent object)
      {
        return createEnvironmentSentAdapter();
      }
      @Override
      public Adapter caseFailingComponentSent(FailingComponentSent object)
      {
        return createFailingComponentSentAdapter();
      }
      @Override
      public Adapter caseRiskSent(RiskSent object)
      {
        return createRiskSentAdapter();
      }
      @Override
      public Adapter caseToleranceSent(ToleranceSent object)
      {
        return createToleranceSentAdapter();
      }
      @Override
      public Adapter caseDistanceUnit(DistanceUnit object)
      {
        return createDistanceUnitAdapter();
      }
      @Override
      public Adapter caseTimeUnit(TimeUnit object)
      {
        return createTimeUnitAdapter();
      }
      @Override
      public Adapter caseSECONDS(SECONDS object)
      {
        return createSECONDSAdapter();
      }
      @Override
      public Adapter caseHOUR(HOUR object)
      {
        return createHOURAdapter();
      }
      @Override
      public Adapter caseMINUTES(MINUTES object)
      {
        return createMINUTESAdapter();
      }
      @Override
      public Adapter caseMETER(METER object)
      {
        return createMETERAdapter();
      }
      @Override
      public Adapter caseCENTIMETER(CENTIMETER object)
      {
        return createCENTIMETERAdapter();
      }
      @Override
      public Adapter caseMILLIMETER(MILLIMETER object)
      {
        return createMILLIMETERAdapter();
      }
      @Override
      public Adapter caseKILOMETER(KILOMETER object)
      {
        return createKILOMETERAdapter();
      }
      @Override
      public Adapter casePercentUnit(PercentUnit object)
      {
        return createPercentUnitAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.TestFile <em>Test File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.TestFile
   * @generated
   */
  public Adapter createTestFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.Test <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.Test
   * @generated
   */
  public Adapter createTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.Given <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.Given
   * @generated
   */
  public Adapter createGivenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.Then <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.Then
   * @generated
   */
  public Adapter createThenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.When <em>When</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.When
   * @generated
   */
  public Adapter createWhenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.StatementBody <em>Statement Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.StatementBody
   * @generated
   */
  public Adapter createStatementBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.SonarSent <em>Sonar Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.SonarSent
   * @generated
   */
  public Adapter createSonarSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.NotificationSent <em>Notification Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.NotificationSent
   * @generated
   */
  public Adapter createNotificationSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.TimeSent <em>Time Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.TimeSent
   * @generated
   */
  public Adapter createTimeSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.TimeInterval <em>Time Interval</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.TimeInterval
   * @generated
   */
  public Adapter createTimeIntervalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.BatterySent <em>Battery Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.BatterySent
   * @generated
   */
  public Adapter createBatterySentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.PeopleSent <em>People Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.PeopleSent
   * @generated
   */
  public Adapter createPeopleSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.PeoplePosSent <em>People Pos Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.PeoplePosSent
   * @generated
   */
  public Adapter createPeoplePosSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.PeopleNumbSent <em>People Numb Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.PeopleNumbSent
   * @generated
   */
  public Adapter createPeopleNumbSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.MissionSent <em>Mission Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.MissionSent
   * @generated
   */
  public Adapter createMissionSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.MissionGoalSent <em>Mission Goal Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.MissionGoalSent
   * @generated
   */
  public Adapter createMissionGoalSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.MissionRiskLevelSent <em>Mission Risk Level Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.MissionRiskLevelSent
   * @generated
   */
  public Adapter createMissionRiskLevelSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.MissionStatusSent <em>Mission Status Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.MissionStatusSent
   * @generated
   */
  public Adapter createMissionStatusSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.Robot
   * @generated
   */
  public Adapter createRobotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.RobotAutoPilot <em>Robot Auto Pilot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.RobotAutoPilot
   * @generated
   */
  public Adapter createRobotAutoPilotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.RedundantComponent <em>Redundant Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.RedundantComponent
   * @generated
   */
  public Adapter createRedundantComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.PayloadSent <em>Payload Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.PayloadSent
   * @generated
   */
  public Adapter createPayloadSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.RobotDistanceSent <em>Robot Distance Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.RobotDistanceSent
   * @generated
   */
  public Adapter createRobotDistanceSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent <em>Distance To Location Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.DistanceToLocationSent
   * @generated
   */
  public Adapter createDistanceToLocationSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.DistanceToObstaclesSent <em>Distance To Obstacles Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.DistanceToObstaclesSent
   * @generated
   */
  public Adapter createDistanceToObstaclesSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.EqualSent <em>Equal Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.EqualSent
   * @generated
   */
  public Adapter createEqualSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.LessSent <em>Less Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.LessSent
   * @generated
   */
  public Adapter createLessSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.GreaterSent <em>Greater Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.GreaterSent
   * @generated
   */
  public Adapter createGreaterSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.RobotStateSent <em>Robot State Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.RobotStateSent
   * @generated
   */
  public Adapter createRobotStateSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.RobotPositionSent <em>Robot Position Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.RobotPositionSent
   * @generated
   */
  public Adapter createRobotPositionSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.CirclePosition <em>Circle Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.CirclePosition
   * @generated
   */
  public Adapter createCirclePositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.SpherePosition <em>Sphere Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.SpherePosition
   * @generated
   */
  public Adapter createSpherePositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.RobotSpeedSent <em>Robot Speed Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.RobotSpeedSent
   * @generated
   */
  public Adapter createRobotSpeedSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.EnvironmentSent <em>Environment Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.EnvironmentSent
   * @generated
   */
  public Adapter createEnvironmentSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.FailingComponentSent <em>Failing Component Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.FailingComponentSent
   * @generated
   */
  public Adapter createFailingComponentSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.RiskSent <em>Risk Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.RiskSent
   * @generated
   */
  public Adapter createRiskSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.ToleranceSent <em>Tolerance Sent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.ToleranceSent
   * @generated
   */
  public Adapter createToleranceSentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.DistanceUnit <em>Distance Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.DistanceUnit
   * @generated
   */
  public Adapter createDistanceUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.TimeUnit <em>Time Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.TimeUnit
   * @generated
   */
  public Adapter createTimeUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.SECONDS <em>SECONDS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.SECONDS
   * @generated
   */
  public Adapter createSECONDSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.HOUR <em>HOUR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.HOUR
   * @generated
   */
  public Adapter createHOURAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.MINUTES <em>MINUTES</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.MINUTES
   * @generated
   */
  public Adapter createMINUTESAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.METER <em>METER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.METER
   * @generated
   */
  public Adapter createMETERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.CENTIMETER <em>CENTIMETER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.CENTIMETER
   * @generated
   */
  public Adapter createCENTIMETERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.MILLIMETER <em>MILLIMETER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.MILLIMETER
   * @generated
   */
  public Adapter createMILLIMETERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.KILOMETER <em>KILOMETER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.KILOMETER
   * @generated
   */
  public Adapter createKILOMETERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myLanguage.PercentUnit <em>Percent Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myLanguage.PercentUnit
   * @generated
   */
  public Adapter createPercentUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MyLanguageAdapterFactory