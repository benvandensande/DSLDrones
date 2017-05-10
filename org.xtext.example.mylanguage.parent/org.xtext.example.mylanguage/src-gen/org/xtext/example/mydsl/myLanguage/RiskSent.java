/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Sent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.RiskSent#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getRiskSent()
 * @model
 * @generated
 */
public interface RiskSent extends Robot
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(String)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getRiskSent_Level()
   * @model
   * @generated
   */
  String getLevel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.RiskSent#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(String value);

} // RiskSent