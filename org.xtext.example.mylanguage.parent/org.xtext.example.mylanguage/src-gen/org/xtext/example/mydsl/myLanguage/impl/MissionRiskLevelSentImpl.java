/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myLanguage.MissionRiskLevelSent;
import org.xtext.example.mydsl.myLanguage.MyLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Risk Level Sent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.impl.MissionRiskLevelSentImpl#getRisklevel <em>Risklevel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionRiskLevelSentImpl extends MissionSentImpl implements MissionRiskLevelSent
{
  /**
   * The default value of the '{@link #getRisklevel() <em>Risklevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRisklevel()
   * @generated
   * @ordered
   */
  protected static final String RISKLEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRisklevel() <em>Risklevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRisklevel()
   * @generated
   * @ordered
   */
  protected String risklevel = RISKLEVEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MissionRiskLevelSentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyLanguagePackage.Literals.MISSION_RISK_LEVEL_SENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRisklevel()
  {
    return risklevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRisklevel(String newRisklevel)
  {
    String oldRisklevel = risklevel;
    risklevel = newRisklevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyLanguagePackage.MISSION_RISK_LEVEL_SENT__RISKLEVEL, oldRisklevel, risklevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyLanguagePackage.MISSION_RISK_LEVEL_SENT__RISKLEVEL:
        return getRisklevel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyLanguagePackage.MISSION_RISK_LEVEL_SENT__RISKLEVEL:
        setRisklevel((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyLanguagePackage.MISSION_RISK_LEVEL_SENT__RISKLEVEL:
        setRisklevel(RISKLEVEL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyLanguagePackage.MISSION_RISK_LEVEL_SENT__RISKLEVEL:
        return RISKLEVEL_EDEFAULT == null ? risklevel != null : !RISKLEVEL_EDEFAULT.equals(risklevel);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (risklevel: ");
    result.append(risklevel);
    result.append(')');
    return result.toString();
  }

} //MissionRiskLevelSentImpl
