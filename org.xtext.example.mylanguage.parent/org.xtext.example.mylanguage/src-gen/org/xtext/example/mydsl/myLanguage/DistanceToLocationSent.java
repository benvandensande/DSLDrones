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
   * Returns the value of the '<em><b>Pos X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos X</em>' attribute.
   * @see #setPosX(String)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getDistanceToLocationSent_PosX()
   * @model
   * @generated
   */
  String getPosX();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getPosX <em>Pos X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos X</em>' attribute.
   * @see #getPosX()
   * @generated
   */
  void setPosX(String value);

  /**
   * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos Y</em>' attribute.
   * @see #setPosY(String)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getDistanceToLocationSent_PosY()
   * @model
   * @generated
   */
  String getPosY();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getPosY <em>Pos Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos Y</em>' attribute.
   * @see #getPosY()
   * @generated
   */
  void setPosY(String value);

  /**
   * Returns the value of the '<em><b>Pos Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos Z</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos Z</em>' attribute.
   * @see #setPosZ(String)
   * @see org.xtext.example.mydsl.myLanguage.MyLanguagePackage#getDistanceToLocationSent_PosZ()
   * @model
   * @generated
   */
  String getPosZ();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myLanguage.DistanceToLocationSent#getPosZ <em>Pos Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos Z</em>' attribute.
   * @see #getPosZ()
   * @generated
   */
  void setPosZ(String value);

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
