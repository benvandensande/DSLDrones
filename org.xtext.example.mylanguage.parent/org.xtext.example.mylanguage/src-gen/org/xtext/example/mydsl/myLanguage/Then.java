/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.Then#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getThen()
 * @model
 * @generated
 */
public interface Then extends Statement
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(StatementBody)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getThen_Body()
   * @model containment="true"
   * @generated
   */
  StatementBody getBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.Then#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(StatementBody value);

} // Then
