package bus.serializer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.statecode.IStateSerializer;

import query.TranCanFireMatch;
import PetriNet.PetriNet;
import PetriNet.Place;

public class BusSeril implements IStateSerializer {
	
	private PetriNet pm;
	private ArrayList<Place> places;
	public BusSeril(Notifier root) {
		pm = (PetriNet) root;
		places=new ArrayList<Place>();
		places.addAll(pm.getPlaces());
		Collections.sort(places, new Comparator<Place>() {

			@Override
			public int compare(Place o1, Place o2) {				
			  return o1.getName().compareTo(o2.getName());
			}			
		});
	}
	@Override
	public Object serializeContainmentTree() {
		// TODO Auto-generated method stub		
		String s="";
		for (int i=0; i<places.size(); i++) {
			s=s+Integer.toString(i)+":"+Integer.toString(places.get(i).getTokens().size())+",";
		}
		return s;
	}

	@Override
	public Object serializePatternMatch(IPatternMatch match) {
		// TODO Auto-generated method stub
		//tranzicio
		if (match instanceof TranCanFireMatch) {
			TranCanFireMatch tcfm=(TranCanFireMatch) match;
			return tcfm.getT().getName().trim();
		}
		else {
			throw new DSEException("Unsupported rule.");
		}		
	}

	@Override
	public void resetCache() {
		// TODO Auto-generated method stub
		
	}

}
