/**
 */
package PetriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.PetriNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link PetriNet.PetriNet#getPlaces <em>Places</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPetriNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPetriNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

} // PetriNet
