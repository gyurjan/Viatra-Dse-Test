package query.util;

import PetriNet.Place;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import query.PlaceEndNameMatch;

/**
 * A match processor tailored for the query.placeEndName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PlaceEndNameProcessor implements IMatchProcessor<PlaceEndNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP the value of pattern parameter P in the currently processed match
   * 
   */
  public abstract void process(final Place pP);
  
  @Override
  public void process(final PlaceEndNameMatch match) {
    process(match.getP());
  }
}
