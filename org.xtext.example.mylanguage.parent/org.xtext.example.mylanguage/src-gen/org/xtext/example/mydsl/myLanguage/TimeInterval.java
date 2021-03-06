/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.TimeInterval#getFirst <em>First</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.TimeInterval#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getTimeInterval()
 * @model
 * @generated
 */
public interface TimeInterval extends TimeSent
{
  /**
   * Returns the value of the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' containment reference.
   * @see #setFirst(TimeUnit)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getTimeInterval_First()
   * @model containment="true"
   * @generated
   */
  TimeUnit getFirst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.TimeInterval#getFirst <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' containment reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(TimeUnit value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' containment reference.
   * @see #setSecond(TimeUnit)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getTimeInterval_Second()
   * @model containment="true"
   * @generated
   */
  TimeUnit getSecond();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.TimeInterval#getSecond <em>Second</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' containment reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(TimeUnit value);

} // TimeInterval
