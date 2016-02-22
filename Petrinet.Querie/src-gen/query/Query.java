package query;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import query.AllTokenEndMatcher;
import query.EmptyPlaceMatcher;
import query.PlaceEndNameMatcher;
import query.PlacesMatcher;
import query.PlacesWithTokensExceptEndPlacesMatcher;
import query.PlacetoTransitionMatcher;
import query.TranCanFireMatcher;
import query.TransitiontoPlaceMatcher;
import query.WhereTokenMatcher;
import query.util.AllTokenEndQuerySpecification;
import query.util.EmptyPlaceQuerySpecification;
import query.util.PlaceEndNameQuerySpecification;
import query.util.PlacesQuerySpecification;
import query.util.PlacesWithTokensExceptEndPlacesQuerySpecification;
import query.util.PlacetoTransitionQuerySpecification;
import query.util.TranCanFireQuerySpecification;
import query.util.TransitiontoPlaceQuerySpecification;
import query.util.WhereTokenQuerySpecification;

/**
 * A pattern group formed of all patterns defined in query.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file query.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package query, the group contains the definition of the following patterns: <ul>
 * <li>places</li>
 * <li>placetoTransition</li>
 * <li>transitiontoPlace</li>
 * <li>whereToken</li>
 * <li>emptyPlace</li>
 * <li>tranCanFire</li>
 * <li>placeEndName</li>
 * <li>PlacesWithTokensExceptEndPlaces</li>
 * <li>allTokenEnd</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Query extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Query instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Query();
    }
    return INSTANCE;
  }
  
  private static Query INSTANCE;
  
  private Query() throws IncQueryException {
    querySpecifications.add(PlacesQuerySpecification.instance());
    querySpecifications.add(PlacetoTransitionQuerySpecification.instance());
    querySpecifications.add(TransitiontoPlaceQuerySpecification.instance());
    querySpecifications.add(WhereTokenQuerySpecification.instance());
    querySpecifications.add(EmptyPlaceQuerySpecification.instance());
    querySpecifications.add(TranCanFireQuerySpecification.instance());
    querySpecifications.add(PlaceEndNameQuerySpecification.instance());
    querySpecifications.add(PlacesWithTokensExceptEndPlacesQuerySpecification.instance());
    querySpecifications.add(AllTokenEndQuerySpecification.instance());
  }
  
  public PlacesQuerySpecification getPlaces() throws IncQueryException {
    return PlacesQuerySpecification.instance();
  }
  
  public PlacesMatcher getPlaces(final IncQueryEngine engine) throws IncQueryException {
    return PlacesMatcher.on(engine);
  }
  
  public PlacetoTransitionQuerySpecification getPlacetoTransition() throws IncQueryException {
    return PlacetoTransitionQuerySpecification.instance();
  }
  
  public PlacetoTransitionMatcher getPlacetoTransition(final IncQueryEngine engine) throws IncQueryException {
    return PlacetoTransitionMatcher.on(engine);
  }
  
  public TransitiontoPlaceQuerySpecification getTransitiontoPlace() throws IncQueryException {
    return TransitiontoPlaceQuerySpecification.instance();
  }
  
  public TransitiontoPlaceMatcher getTransitiontoPlace(final IncQueryEngine engine) throws IncQueryException {
    return TransitiontoPlaceMatcher.on(engine);
  }
  
  public WhereTokenQuerySpecification getWhereToken() throws IncQueryException {
    return WhereTokenQuerySpecification.instance();
  }
  
  public WhereTokenMatcher getWhereToken(final IncQueryEngine engine) throws IncQueryException {
    return WhereTokenMatcher.on(engine);
  }
  
  public EmptyPlaceQuerySpecification getEmptyPlace() throws IncQueryException {
    return EmptyPlaceQuerySpecification.instance();
  }
  
  public EmptyPlaceMatcher getEmptyPlace(final IncQueryEngine engine) throws IncQueryException {
    return EmptyPlaceMatcher.on(engine);
  }
  
  public TranCanFireQuerySpecification getTranCanFire() throws IncQueryException {
    return TranCanFireQuerySpecification.instance();
  }
  
  public TranCanFireMatcher getTranCanFire(final IncQueryEngine engine) throws IncQueryException {
    return TranCanFireMatcher.on(engine);
  }
  
  public PlaceEndNameQuerySpecification getPlaceEndName() throws IncQueryException {
    return PlaceEndNameQuerySpecification.instance();
  }
  
  public PlaceEndNameMatcher getPlaceEndName(final IncQueryEngine engine) throws IncQueryException {
    return PlaceEndNameMatcher.on(engine);
  }
  
  public PlacesWithTokensExceptEndPlacesQuerySpecification getPlacesWithTokensExceptEndPlaces() throws IncQueryException {
    return PlacesWithTokensExceptEndPlacesQuerySpecification.instance();
  }
  
  public PlacesWithTokensExceptEndPlacesMatcher getPlacesWithTokensExceptEndPlaces(final IncQueryEngine engine) throws IncQueryException {
    return PlacesWithTokensExceptEndPlacesMatcher.on(engine);
  }
  
  public AllTokenEndQuerySpecification getAllTokenEnd() throws IncQueryException {
    return AllTokenEndQuerySpecification.instance();
  }
  
  public AllTokenEndMatcher getAllTokenEnd(final IncQueryEngine engine) throws IncQueryException {
    return AllTokenEndMatcher.on(engine);
  }
}
