package query;

import PetriNet.Place;
import PetriNet.Transition;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import query.PlacetoTransitionMatch;
import query.util.PlacetoTransitionQuerySpecification;

/**
 * Generated pattern matcher API of the query.placetoTransition pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PlacetoTransitionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern placetoTransition(T:Transition,P:Place) {
 * 	Transition.input(T,P);
 * }
 * </pre></code>
 * 
 * @see PlacetoTransitionMatch
 * @see PlacetoTransitionProcessor
 * @see PlacetoTransitionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PlacetoTransitionMatcher extends BaseMatcher<PlacetoTransitionMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PlacetoTransitionMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PlacetoTransitionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PlacetoTransitionMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_T = 0;
  
  private final static int POSITION_P = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PlacetoTransitionMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public PlacetoTransitionMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public PlacetoTransitionMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return matches represented as a PlacetoTransitionMatch object.
   * 
   */
  public Collection<PlacetoTransitionMatch> getAllMatches(final Transition pT, final Place pP) {
    return rawGetAllMatches(new Object[]{pT, pP});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return a match represented as a PlacetoTransitionMatch object, or null if no match is found.
   * 
   */
  public PlacetoTransitionMatch getOneArbitraryMatch(final Transition pT, final Place pP) {
    return rawGetOneArbitraryMatch(new Object[]{pT, pP});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Transition pT, final Place pP) {
    return rawHasMatch(new Object[]{pT, pP});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Transition pT, final Place pP) {
    return rawCountMatches(new Object[]{pT, pP});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Transition pT, final Place pP, final IMatchProcessor<? super PlacetoTransitionMatch> processor) {
    rawForEachMatch(new Object[]{pT, pP}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Transition pT, final Place pP, final IMatchProcessor<? super PlacetoTransitionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pT, pP}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PlacetoTransitionMatch newMatch(final Transition pT, final Place pP) {
    return PlacetoTransitionMatch.newMatch(pT, pP);
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Transition> rawAccumulateAllValuesOfT(final Object[] parameters) {
    Set<Transition> results = new HashSet<Transition>();
    rawAccumulateAllValues(POSITION_T, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transition> getAllValuesOfT() {
    return rawAccumulateAllValuesOfT(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transition> getAllValuesOfT(final PlacetoTransitionMatch partialMatch) {
    return rawAccumulateAllValuesOfT(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transition> getAllValuesOfT(final Place pP) {
    return rawAccumulateAllValuesOfT(new Object[]{
    null, 
    pP
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for P.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Place> rawAccumulateAllValuesOfP(final Object[] parameters) {
    Set<Place> results = new HashSet<Place>();
    rawAccumulateAllValues(POSITION_P, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for P.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Place> getAllValuesOfP() {
    return rawAccumulateAllValuesOfP(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Place> getAllValuesOfP(final PlacetoTransitionMatch partialMatch) {
    return rawAccumulateAllValuesOfP(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Place> getAllValuesOfP(final Transition pT) {
    return rawAccumulateAllValuesOfP(new Object[]{
    pT, 
    null
    });
  }
  
  @Override
  protected PlacetoTransitionMatch tupleToMatch(final Tuple t) {
    try {
    	return PlacetoTransitionMatch.newMatch((PetriNet.Transition) t.get(POSITION_T), (PetriNet.Place) t.get(POSITION_P));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PlacetoTransitionMatch arrayToMatch(final Object[] match) {
    try {
    	return PlacetoTransitionMatch.newMatch((PetriNet.Transition) match[POSITION_T], (PetriNet.Place) match[POSITION_P]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PlacetoTransitionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return PlacetoTransitionMatch.newMutableMatch((PetriNet.Transition) match[POSITION_T], (PetriNet.Place) match[POSITION_P]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PlacetoTransitionMatcher> querySpecification() throws IncQueryException {
    return PlacetoTransitionQuerySpecification.instance();
  }
}
