package query.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import query.WhereTokenMatch;
import query.WhereTokenMatcher;

/**
 * A pattern-specific query specification that can instantiate WhereTokenMatcher in a type-safe way.
 * 
 * @see WhereTokenMatcher
 * @see WhereTokenMatch
 * 
 */
@SuppressWarnings("all")
public final class WhereTokenQuerySpecification extends BaseGeneratedEMFQuerySpecification<WhereTokenMatcher> {
  private WhereTokenQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WhereTokenQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WhereTokenMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WhereTokenMatcher.on(engine);
  }
  
  @Override
  public WhereTokenMatch newEmptyMatch() {
    return WhereTokenMatch.newEmptyMatch();
  }
  
  @Override
  public WhereTokenMatch newMatch(final Object... parameters) {
    return WhereTokenMatch.newMatch((PetriNet.Place) parameters[0], (PetriNet.Token) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static WhereTokenQuerySpecification INSTANCE = make();
    
    public static WhereTokenQuerySpecification make() {
      return new WhereTokenQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WhereTokenQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "query.whereToken";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("P","T");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("P", "PetriNet.Place"),new PParameter("T", "PetriNet.Token"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_P = body.getOrCreateVariableByName("P");
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_P, "P"),
      				
      		new ExportedParameter(body, var_T, "T")
      	));
      	new TypeConstraint(body, new FlatTuple(var_P), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Place")));
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Token")));
      	new TypeConstraint(body, new FlatTuple(var_P), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Place")));
      	new TypeConstraint(body, new FlatTuple(var_P, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("Petrinet", "Place", "tokens")));
      	new Equality(body, var__virtual_0_, var_T);
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
