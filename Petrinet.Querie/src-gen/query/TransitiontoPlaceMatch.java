package query;

import PetriNet.Place;
import PetriNet.Transition;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import query.util.TransitiontoPlaceQuerySpecification;

/**
 * Pattern-specific match representation of the query.transitiontoPlace pattern,
 * to be used in conjunction with {@link TransitiontoPlaceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TransitiontoPlaceMatcher
 * @see TransitiontoPlaceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TransitiontoPlaceMatch extends BasePatternMatch {
  private Transition fT;
  
  private Place fP;
  
  private static List<String> parameterNames = makeImmutableList("T", "P");
  
  private TransitiontoPlaceMatch(final Transition pT, final Place pP) {
    this.fT = pT;
    this.fP = pP;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    if ("P".equals(parameterName)) return this.fP;
    return null;
  }
  
  public Transition getT() {
    return this.fT;
  }
  
  public Place getP() {
    return this.fP;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("T".equals(parameterName) ) {
    	this.fT = (PetriNet.Transition) newValue;
    	return true;
    }
    if ("P".equals(parameterName) ) {
    	this.fP = (PetriNet.Place) newValue;
    	return true;
    }
    return false;
  }
  
  public void setT(final Transition pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
  }
  
  public void setP(final Place pP) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP = pP;
  }
  
  @Override
  public String patternName() {
    return "query.transitiontoPlace";
  }
  
  @Override
  public List<String> parameterNames() {
    return TransitiontoPlaceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fP};
  }
  
  @Override
  public TransitiontoPlaceMatch toImmutable() {
    return isMutable() ? newMatch(fT, fP) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    
    result.append("\"P\"=" + prettyPrintValue(fP)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    result = prime * result + ((fP == null) ? 0 : fP.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TransitiontoPlaceMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    TransitiontoPlaceMatch other = (TransitiontoPlaceMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fP == null) {if (other.fP != null) return false;}
    else if (!fP.equals(other.fP)) return false;
    return true;
  }
  
  @Override
  public TransitiontoPlaceQuerySpecification specification() {
    try {
    	return TransitiontoPlaceQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static TransitiontoPlaceMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TransitiontoPlaceMatch newMutableMatch(final Transition pT, final Place pP) {
    return new Mutable(pT, pP);
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
  public static TransitiontoPlaceMatch newMatch(final Transition pT, final Place pP) {
    return new Immutable(pT, pP);
  }
  
  private static final class Mutable extends TransitiontoPlaceMatch {
    Mutable(final Transition pT, final Place pP) {
      super(pT, pP);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TransitiontoPlaceMatch {
    Immutable(final Transition pT, final Place pP) {
      super(pT, pP);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
