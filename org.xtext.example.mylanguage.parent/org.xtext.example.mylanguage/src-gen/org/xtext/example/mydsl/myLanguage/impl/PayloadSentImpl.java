/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myLanguage.MyLanguagePackage;
import org.xtext.example.mydsl.myLanguage.PayloadSent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payload Sent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.impl.PayloadSentImpl#getLoad <em>Load</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PayloadSentImpl extends RobotImpl implements PayloadSent
{
  /**
   * The default value of the '{@link #getLoad() <em>Load</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoad()
   * @generated
   * @ordered
   */
  protected static final String LOAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLoad() <em>Load</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoad()
   * @generated
   * @ordered
   */
  protected String load = LOAD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PayloadSentImpl()
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
    return MyLanguagePackage.Literals.PAYLOAD_SENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLoad()
  {
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoad(String newLoad)
  {
    String oldLoad = load;
    load = newLoad;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyLanguagePackage.PAYLOAD_SENT__LOAD, oldLoad, load));
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
      case MyLanguagePackage.PAYLOAD_SENT__LOAD:
        return getLoad();
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
      case MyLanguagePackage.PAYLOAD_SENT__LOAD:
        setLoad((String)newValue);
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
      case MyLanguagePackage.PAYLOAD_SENT__LOAD:
        setLoad(LOAD_EDEFAULT);
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
      case MyLanguagePackage.PAYLOAD_SENT__LOAD:
        return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
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
    result.append(" (load: ");
    result.append(load);
    result.append(')');
    return result.toString();
  }

} //PayloadSentImpl