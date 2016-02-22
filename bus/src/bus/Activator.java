package bus;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.objectives.impl.ModelQueriesHardObjective;
import org.eclipse.viatra.dse.solutionstore.SimpleSolutionStore;
import org.osgi.framework.BundleContext;

import query.TranCanFireMatch;
import query.TranCanFireMatcher;
import petrinet.mypetri.PetriModel;
import query.util.AllTokenEndQuerySpecification;
import query.util.TranCanFireProcessor;
import query.util.TranCanFireQuerySpecification;
import PetriNet.PetriNetFactory;
import PetriNet.Place;
import PetriNet.Token;
import PetriNet.Transition;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "bus"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;				
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
