package bus.serializer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.statecode.IStateCoder;

import PetriNet.PetriNet;
import PetriNet.Place;
import query.TranCanFireMatch;

public class BusSeril implements IStateCoder {
	
	private PetriNet pm;
	private ArrayList<Place> places;
	

	
	@Override
	public void init(Notifier notifier) {
		// TODO Auto-generated method stub
		pm = (PetriNet) notifier;
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
	public Object createStateCode() {
		// TODO Auto-generated method stub		
				String s="";
				for (int i=0; i<places.size(); i++) {
					s=s+Integer.toString(i)+":"+Integer.toString(places.get(i).getTokens().size())+",";
				}
				return s;
	}
	@Override
	public Object createActivationCode(IPatternMatch match) {
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

}
