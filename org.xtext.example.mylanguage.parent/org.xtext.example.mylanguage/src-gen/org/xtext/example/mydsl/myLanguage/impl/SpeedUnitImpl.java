/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myLanguage.MyLanguagePackage;
import org.xtext.example.mydsl.myLanguage.SpeedUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speed Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.impl.SpeedUnitImpl#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.impl.SpeedUnitImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.impl.SpeedUnitImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeedUnitImpl extends MinimalEObjectImpl.Container implements SpeedUnit
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final String X_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected String x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final String Y_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected String y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected static final String Z_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected String z = Z_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpeedUnitImpl()
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
    return MyLanguagePackage.Literals.SPEED_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(String newX)
  {
    String oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyLanguagePackage.SPEED_UNIT__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(String newY)
  {
    String oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyLanguagePackage.SPEED_UNIT__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getZ()
  {
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZ(String newZ)
  {
    String oldZ = z;
    z = newZ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyLanguagePackage.SPEED_UNIT__Z, oldZ, z));
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
      case MyLanguagePackage.SPEED_UNIT__X:
        return getX();
      case MyLanguagePackage.SPEED_UNIT__Y:
        return getY();
      case MyLanguagePackage.SPEED_UNIT__Z:
        return getZ();
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
      case MyLanguagePackage.SPEED_UNIT__X:
        setX((String)newValue);
        return;
      case MyLanguagePackage.SPEED_UNIT__Y:
        setY((String)newValue);
        return;
      case MyLanguagePackage.SPEED_UNIT__Z:
        setZ((String)newValue);
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
      case MyLanguagePackage.SPEED_UNIT__X:
        setX(X_EDEFAULT);
        return;
      case MyLanguagePackage.SPEED_UNIT__Y:
        setY(Y_EDEFAULT);
        return;
      case MyLanguagePackage.SPEED_UNIT__Z:
        setZ(Z_EDEFAULT);
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
      case MyLanguagePackage.SPEED_UNIT__X:
        return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
      case MyLanguagePackage.SPEED_UNIT__Y:
        return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
      case MyLanguagePackage.SPEED_UNIT__Z:
        return Z_EDEFAULT == null ? z != null : !Z_EDEFAULT.equals(z);
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
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", z: ");
    result.append(z);
    result.append(')');
    return result.toString();
  }

} //SpeedUnitImpl
