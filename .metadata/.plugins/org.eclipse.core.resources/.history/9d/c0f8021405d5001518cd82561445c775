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
import query.PlacetoTransitionMatch;
import query.PlacetoTransitionMatcher;

/**
 * A pattern-specific query specification that can instantiate PlacetoTransitionMatcher in a type-safe way.
 * 
 * @see PlacetoTransitionMatcher
 * @see PlacetoTransitionMatch
 * 
 */
@SuppressWarnings("all")
public final class PlacetoTransitionQuerySpecification extends BaseGeneratedEMFQuerySpecification<PlacetoTransitionMatcher> {
  private PlacetoTransitionQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PlacetoTransitionQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PlacetoTransitionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PlacetoTransitionMatcher.on(engine);
  }
  
  @Override
  public PlacetoTransitionMatch newEmptyMatch() {
    return PlacetoTransitionMatch.newEmptyMatch();
  }
  
  @Override
  public PlacetoTransitionMatch newMatch(final Object... parameters) {
    return PlacetoTransitionMatch.newMatch((PetriNet.Transition) parameters[0], (PetriNet.Place) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static PlacetoTransitionQuerySpecification INSTANCE = make();
    
    public static PlacetoTransitionQuerySpecification make() {
      return new PlacetoTransitionQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PlacetoTransitionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "query.placetoTransition";
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
      	new TypeConstraint(body, new FlatTuple(var_T, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("Petrinet", "Transition", "input")));
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
