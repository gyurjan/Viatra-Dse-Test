package query;

import PetriNet.Place;
import PetriNet.Token;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import query.util.WhereTokenQuerySpecification;

/**
 * Pattern-specific match representation of the query.whereToken pattern,
 * to be used in conjunction with {@link WhereTokenMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WhereTokenMatcher
 * @see WhereTokenProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WhereTokenMatch extends BasePatternMatch {
  private Place fP;
  
  private Token fT;
  
  private static List<String> parameterNames = makeImmutableList("P", "T");
  
  private WhereTokenMatch(final Place pP, final Token pT) {
    this.fP = pP;
    this.fT = pT;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("P".equals(parameterName)) return this.fP;
    if ("T".equals(parameterName)) return this.fT;
    return null;
  }
  
  public Place getP() {
    return this.fP;
  }
  
  public Token getT() {
    return this.fT;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("P".equals(parameterName) ) {
    	this.fP = (PetriNet.Place) newValue;
    	return true;
    }
    if ("T".equals(parameterName) ) {
    	this.fT = (PetriNet.Token) newValue;
    	return true;
    }
    return false;
  }
  
  public void setP(final Place pP) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP = pP;
  }
  
  public void setT(final Token pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
  }
  
  @Override
  public String patternName() {
    return "query.whereToken";
  }
  
  @Override
  public List<String> parameterNames() {
    return WhereTokenMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP, fT};
  }
  
  @Override
  public WhereTokenMatch toImmutable() {
    return isMutable() ? newMatch(fP, fT) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"P\"=" + prettyPrintValue(fP) + ", ");
    
    result.append("\"T\"=" + prettyPrintValue(fT)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP == null) ? 0 : fP.hashCode());
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WhereTokenMatch)) { // this should be infrequent
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
    WhereTokenMatch other = (WhereTokenMatch) obj;
    if (fP == null) {if (other.fP != null) return false;}
    else if (!fP.equals(other.fP)) return false;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    return true;
  }
  
  @Override
  public WhereTokenQuerySpecification specification() {
    try {
    	return WhereTokenQuerySpecification.instance();
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
  public static WhereTokenMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WhereTokenMatch newMutableMatch(final Place pP, final Token pT) {
    return new Mutable(pP, pT);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WhereTokenMatch newMatch(final Place pP, final Token pT) {
    return new Immutable(pP, pT);
  }
  
  private static final class Mutable extends WhereTokenMatch {
    Mutable(final Place pP, final Token pT) {
      super(pP, pT);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WhereTokenMatch {
    Immutable(final Place pP, final Token pT) {
      super(pP, pT);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
