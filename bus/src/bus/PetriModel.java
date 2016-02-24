package bus;


import PetriNet.PetriNet;
import PetriNet.PetriNetFactory;
import PetriNet.Place;
import PetriNet.Token;
import PetriNet.Transition;
import impl.PetriNetImpl;

public class PetriModel {
	public PetriNetImpl createModel() {
		PetriNetFactory factory = PetriNetFactory.eINSTANCE;

		PetriNet diagram = factory.createPetriNet();
		Place place = factory.createPlace();
		Place place1 = factory.createPlace();
		Place place2 = factory.createPlace();
		Place place3 = factory.createPlace();
		Place place4 = factory.createPlace();
		Transition tran = factory.createTransition();
		Transition tran1 = factory.createTransition();
		Transition tran2 = factory.createTransition();
		Token token1 = factory.createToken();
		Token token2 = factory.createToken();
		Token token3 = factory.createToken();
		Token token4 = factory.createToken();
		Token token5 = factory.createToken();
		tran.setName("Bus stops");	
	    tran1.setName("One person gets on Bus");
	    tran2.setName("Bus starts");	   
	    place.setName("Person Waiting");
	    place1.setName("Person on bus");
	    place2.setName("Bus leaving");
	    place3.setName("Bus arriving");
	    place4.setName("Bus Waiting");
	    place.getTokens().add(token1);
	    place.getTokens().add(token2);
	    place.getTokens().add(token3);	   
	    place3.getTokens().add(token4);
	    tran.getInput().add(place3);
	    tran.getOutput().add(place4);
	    tran1.getInput().add(place);
	    tran1.getInput().add(place4);
	    tran1.getOutput().add(place1);
	    tran1.getOutput().add(place4);
	    tran2.getInput().add(place4);
	    tran2.getOutput().add(place2);
	    diagram.getPlaces().add(place);
		   diagram.getPlaces().add(place1);
		   diagram.getPlaces().add(place2);
		   diagram.getPlaces().add(place3);
		   diagram.getPlaces().add(place4);
		   diagram.getTransitions().add(tran);
		   diagram.getTransitions().add(tran1);
		   diagram.getTransitions().add(tran2);
		return null;
		
	}
}
