/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Risk Level Sent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.MissionRiskLevelSent#getRisklevel <em>Risklevel</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getMissionRiskLevelSent()
 * @model
 * @generated
 */
public interface MissionRiskLevelSent extends MissionSent
{
  /**
   * Returns the value of the '<em><b>Risklevel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Risklevel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Risklevel</em>' attribute.
   * @see #setRisklevel(String)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getMissionRiskLevelSent_Risklevel()
   * @model
   * @generated
   */
  String getRisklevel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.MissionRiskLevelSent#getRisklevel <em>Risklevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Risklevel</em>' attribute.
   * @see #getRisklevel()
   * @generated
   */
  void setRisklevel(String value);

} // MissionRiskLevelSent
