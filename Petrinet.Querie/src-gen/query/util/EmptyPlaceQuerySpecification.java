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
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import query.EmptyPlaceMatch;
import query.EmptyPlaceMatcher;
import query.util.WhereTokenQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate EmptyPlaceMatcher in a type-safe way.
 * 
 * @see EmptyPlaceMatcher
 * @see EmptyPlaceMatch
 * 
 */
@SuppressWarnings("all")
public final class EmptyPlaceQuerySpecification extends BaseGeneratedEMFQuerySpecification<EmptyPlaceMatcher> {
  private EmptyPlaceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EmptyPlaceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EmptyPlaceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EmptyPlaceMatcher.on(engine);
  }
  
  @Override
  public EmptyPlaceMatch newEmptyMatch() {
    return EmptyPlaceMatch.newEmptyMatch();
  }
  
  @Override
  public EmptyPlaceMatch newMatch(final Object... parameters) {
    return EmptyPlaceMatch.newMatch((PetriNet.Place) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static EmptyPlaceQuerySpecification INSTANCE = make();
    
    public static EmptyPlaceQuerySpecification make() {
      return new EmptyPlaceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EmptyPlaceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "query.emptyPlace";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("P");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("P", "PetriNet.Place"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_P = body.getOrCreateVariableByName("P");
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_P, "P")
      	));
      	new TypeConstraint(body, new FlatTuple(var_P), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Place")));
      	new NegativePatternCall(body, new FlatTuple(var_P, var_T), WhereTokenQuerySpecification.instance().getInternalQueryRepresentation());
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
