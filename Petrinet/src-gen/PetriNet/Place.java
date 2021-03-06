/**
 */
package PetriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link PetriNet.Place#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see PetriNet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPlace_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PetriNet.PetriNetPackage#getPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PetriNet.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Place
