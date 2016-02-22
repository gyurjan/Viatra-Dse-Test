package query.util;

import PetriNet.Place;
import PetriNet.Transition;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import query.PlacetoTransitionMatch;

/**
 * A match processor tailored for the query.placetoTransition pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PlacetoTransitionProcessor implements IMatchProcessor<PlacetoTransitionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * @param pP the value of pattern parameter P in the currently processed match
   * 
   */
  public abstract void process(final Transition pT, final Place pP);
  
  @Override
  public void process(final PlacetoTransitionMatch match) {
    process(match.getT(), match.getP());
  }
}
