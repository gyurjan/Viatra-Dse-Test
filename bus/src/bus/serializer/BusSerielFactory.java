package bus.serializer;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.statecode.IStateSerializer;
import org.eclipse.viatra.dse.statecode.IStateSerializerFactory;

public class BusSerielFactory implements IStateSerializerFactory {

	@Override
	public IStateSerializer createStateSerializer(Notifier modelRoot)
			throws UnsupportedMetaModel {
		// TODO Auto-generated method stub
		BusSeril bs=new BusSeril(modelRoot);
		return bs;
	}

}
