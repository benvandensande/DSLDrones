/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Status Sent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.MissionStatusSent#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getMissionStatusSent()
 * @model
 * @generated
 */
public interface MissionStatusSent extends MissionSent
{
  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see #setState(String)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getMissionStatusSent_State()
   * @model
   * @generated
   */
  String getState();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.MissionStatusSent#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see #getState()
   * @generated
   */
  void setState(String value);

} // MissionStatusSent
