/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance To Location Sent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getPosX <em>Pos X</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getPosZ <em>Pos Z</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getDistanceToLocationSent()
 * @model
 * @generated
 */
public interface DistanceToLocationSent extends EObject
{
  /**
   * Returns the value of the '<em><b>Pos X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos X</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos X</em>' containment reference.
   * @see #setPosX(DistanceUnit)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getDistanceToLocationSent_PosX()
   * @model containment="true"
   * @generated
   */
  DistanceUnit getPosX();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getPosX <em>Pos X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos X</em>' containment reference.
   * @see #getPosX()
   * @generated
   */
  void setPosX(DistanceUnit value);

  /**
   * Returns the value of the '<em><b>Pos Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos Y</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos Y</em>' containment reference.
   * @see #setPosY(DistanceUnit)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getDistanceToLocationSent_PosY()
   * @model containment="true"
   * @generated
   */
  DistanceUnit getPosY();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getPosY <em>Pos Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos Y</em>' containment reference.
   * @see #getPosY()
   * @generated
   */
  void setPosY(DistanceUnit value);

  /**
   * Returns the value of the '<em><b>Pos Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos Z</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos Z</em>' containment reference.
   * @see #setPosZ(DistanceUnit)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getDistanceToLocationSent_PosZ()
   * @model containment="true"
   * @generated
   */
  DistanceUnit getPosZ();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getPosZ <em>Pos Z</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos Z</em>' containment reference.
   * @see #getPosZ()
   * @generated
   */
  void setPosZ(DistanceUnit value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(EObject)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getDistanceToLocationSent_Body()
   * @model containment="true"
   * @generated
   */
  EObject getBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(EObject value);

  /**
   * Returns the value of the '<em><b>Tolerance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tolerance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tolerance</em>' containment reference.
   * @see #setTolerance(ToleranceSent)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getDistanceToLocationSent_Tolerance()
   * @model containment="true"
   * @generated
   */
  ToleranceSent getTolerance();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getTolerance <em>Tolerance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tolerance</em>' containment reference.
   * @see #getTolerance()
   * @generated
   */
  void setTolerance(ToleranceSent value);

} // DistanceToLocationSent
