package query.util;

import PetriNet.Transition;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import query.TranCanFireMatch;

/**
 * A match processor tailored for the query.tranCanFire pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TranCanFireProcessor implements IMatchProcessor<TranCanFireMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * 
   */
  public abstract void process(final Transition pT);
  
  @Override
  public void process(final TranCanFireMatch match) {
    process(match.getT());
  }
}
