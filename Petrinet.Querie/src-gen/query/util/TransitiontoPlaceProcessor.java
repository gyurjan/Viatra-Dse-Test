package query.util;

import PetriNet.Place;
import PetriNet.Transition;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import query.TransitiontoPlaceMatch;

/**
 * A match processor tailored for the query.transitiontoPlace pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TransitiontoPlaceProcessor implements IMatchProcessor<TransitiontoPlaceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * @param pP the value of pattern parameter P in the currently processed match
   * 
   */
  public abstract void process(final Transition pT, final Place pP);
  
  @Override
  public void process(final TransitiontoPlaceMatch match) {
    process(match.getT(), match.getP());
  }
}
