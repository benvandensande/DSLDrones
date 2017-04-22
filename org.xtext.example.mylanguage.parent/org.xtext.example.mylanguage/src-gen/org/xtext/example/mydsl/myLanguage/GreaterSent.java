/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater Sent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.GreaterSent#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getGreaterSent()
 * @model
 * @generated
 */
public interface GreaterSent extends EObject
{
  /**
   * Returns the value of the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' containment reference.
   * @see #setAmount(EObject)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getGreaterSent_Amount()
   * @model containment="true"
   * @generated
   */
  EObject getAmount();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.GreaterSent#getAmount <em>Amount</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' containment reference.
   * @see #getAmount()
   * @generated
   */
  void setAmount(EObject value);

} // GreaterSent
