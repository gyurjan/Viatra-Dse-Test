package query.util;

import PetriNet.Place;
import PetriNet.Token;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import query.WhereTokenMatch;

/**
 * A match processor tailored for the query.whereToken pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class WhereTokenProcessor implements IMatchProcessor<WhereTokenMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP the value of pattern parameter P in the currently processed match
   * @param pT the value of pattern parameter T in the currently processed match
   * 
   */
  public abstract void process(final Place pP, final Token pT);
  
  @Override
  public void process(final WhereTokenMatch match) {
    process(match.getP(), match.getT());
  }
}
