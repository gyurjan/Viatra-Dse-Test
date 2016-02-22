package query;

import PetriNet.Place;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import query.util.EmptyPlaceQuerySpecification;

/**
 * Pattern-specific match representation of the query.emptyPlace pattern,
 * to be used in conjunction with {@link EmptyPlaceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EmptyPlaceMatcher
 * @see EmptyPlaceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EmptyPlaceMatch extends BasePatternMatch {
  private Place fP;
  
  private static List<String> parameterNames = makeImmutableList("P");
  
  private EmptyPlaceMatch(final Place pP) {
    this.fP = pP;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("P".equals(parameterName)) return this.fP;
    return null;
  }
  
  public Place getP() {
    return this.fP;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("P".equals(parameterName) ) {
    	this.fP = (PetriNet.Place) newValue;
    	return true;
    }
    return false;
  }
  
  public void setP(final Place pP) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP = pP;
  }
  
  @Override
  public String patternName() {
    return "query.emptyPlace";
  }
  
  @Override
  public List<String> parameterNames() {
    return EmptyPlaceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP};
  }
  
  @Override
  public EmptyPlaceMatch toImmutable() {
    return isMutable() ? newMatch(fP) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"P\"=" + prettyPrintValue(fP)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP == null) ? 0 : fP.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EmptyPlaceMatch)) { // this should be infrequent
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
    EmptyPlaceMatch other = (EmptyPlaceMatch) obj;
    if (fP == null) {if (other.fP != null) return false;}
    else if (!fP.equals(other.fP)) return false;
    return true;
  }
  
  @Override
  public EmptyPlaceQuerySpecification specification() {
    try {
    	return EmptyPlaceQuerySpecification.instance();
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
  public static EmptyPlaceMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EmptyPlaceMatch newMutableMatch(final Place pP) {
    return new Mutable(pP);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EmptyPlaceMatch newMatch(final Place pP) {
    return new Immutable(pP);
  }
  
  private static final class Mutable extends EmptyPlaceMatch {
    Mutable(final Place pP) {
      super(pP);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EmptyPlaceMatch {
    Immutable(final Place pP) {
      super(pP);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
