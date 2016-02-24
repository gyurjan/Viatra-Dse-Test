package bus.serializer;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;

public class BusSerielFactory implements IStateCoderFactory {


	@Override
	public IStateCoder createStateCoder() {
		// TODO Auto-generated method stub
		BusSeril bs=new BusSeril();
		return bs;
	}

}
