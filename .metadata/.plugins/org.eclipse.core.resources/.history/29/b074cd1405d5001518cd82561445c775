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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import query.TranCanFireMatch;
import query.TranCanFireMatcher;
import query.util.EmptyPlaceQuerySpecification;
import query.util.PlacetoTransitionQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TranCanFireMatcher in a type-safe way.
 * 
 * @see TranCanFireMatcher
 * @see TranCanFireMatch
 * 
 */
@SuppressWarnings("all")
public final class TranCanFireQuerySpecification extends BaseGeneratedEMFQuerySpecification<TranCanFireMatcher> {
  private TranCanFireQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TranCanFireQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TranCanFireMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TranCanFireMatcher.on(engine);
  }
  
  @Override
  public TranCanFireMatch newEmptyMatch() {
    return TranCanFireMatch.newEmptyMatch();
  }
  
  @Override
  public TranCanFireMatch newMatch(final Object... parameters) {
    return TranCanFireMatch.newMatch((PetriNet.Transition) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static TranCanFireQuerySpecification INSTANCE = make();
    
    public static TranCanFireQuerySpecification make() {
      return new TranCanFireQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TranCanFireQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "query.tranCanFire";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("T", "PetriNet.Transition"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_P1 = body.getOrCreateVariableByName("P1");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_T, "T")
      	));
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Transition")));
      	new PositivePatternCall(body, new FlatTuple(var_T, var_P1), PlacetoTransitionQuerySpecification.instance().getInternalQueryRepresentation());
      	new NegativePatternCall(body, new FlatTuple(var_P1), EmptyPlaceQuerySpecification.instance().getInternalQueryRepresentation());
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
