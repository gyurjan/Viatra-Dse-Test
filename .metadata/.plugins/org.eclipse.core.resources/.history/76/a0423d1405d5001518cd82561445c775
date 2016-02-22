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
import query.TransitiontoPlaceMatch;
import query.TransitiontoPlaceMatcher;

/**
 * A pattern-specific query specification that can instantiate TransitiontoPlaceMatcher in a type-safe way.
 * 
 * @see TransitiontoPlaceMatcher
 * @see TransitiontoPlaceMatch
 * 
 */
@SuppressWarnings("all")
public final class TransitiontoPlaceQuerySpecification extends BaseGeneratedEMFQuerySpecification<TransitiontoPlaceMatcher> {
  private TransitiontoPlaceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TransitiontoPlaceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TransitiontoPlaceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TransitiontoPlaceMatcher.on(engine);
  }
  
  @Override
  public TransitiontoPlaceMatch newEmptyMatch() {
    return TransitiontoPlaceMatch.newEmptyMatch();
  }
  
  @Override
  public TransitiontoPlaceMatch newMatch(final Object... parameters) {
    return TransitiontoPlaceMatch.newMatch((PetriNet.Transition) parameters[0], (PetriNet.Place) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TransitiontoPlaceQuerySpecification INSTANCE = make();
    
    public static TransitiontoPlaceQuerySpecification make() {
      return new TransitiontoPlaceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TransitiontoPlaceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "query.transitiontoPlace";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T","P");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("T", "PetriNet.Transition"),new PParameter("P", "PetriNet.Place"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_P = body.getOrCreateVariableByName("P");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_T, "T"),
      				
      		new ExportedParameter(body, var_P, "P")
      	));
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Transition")));
      	new TypeConstraint(body, new FlatTuple(var_P), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Place")));
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Transition")));
      	new TypeConstraint(body, new FlatTuple(var_T, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("Petrinet", "Transition", "output")));
      	new Equality(body, var__virtual_0_, var_P);
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
