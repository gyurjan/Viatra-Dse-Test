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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import query.PlaceEndNameMatch;
import query.PlaceEndNameMatcher;

/**
 * A pattern-specific query specification that can instantiate PlaceEndNameMatcher in a type-safe way.
 * 
 * @see PlaceEndNameMatcher
 * @see PlaceEndNameMatch
 * 
 */
@SuppressWarnings("all")
public final class PlaceEndNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<PlaceEndNameMatcher> {
  private PlaceEndNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PlaceEndNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PlaceEndNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PlaceEndNameMatcher.on(engine);
  }
  
  @Override
  public PlaceEndNameMatch newEmptyMatch() {
    return PlaceEndNameMatch.newEmptyMatch();
  }
  
  @Override
  public PlaceEndNameMatch newMatch(final Object... parameters) {
    return PlaceEndNameMatch.newMatch((PetriNet.Place) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static PlaceEndNameQuerySpecification INSTANCE = make();
    
    public static PlaceEndNameQuerySpecification make() {
      return new PlaceEndNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PlaceEndNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "query.placeEndName";
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
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_P, "P")
      	));
      	new TypeConstraint(body, new FlatTuple(var_P), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Place")));
      	new ConstantValue(body, var__virtual_0_, "Person on bus");
      	new TypeConstraint(body, new FlatTuple(var_P), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Place")));
      	new TypeConstraint(body, new FlatTuple(var_P, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("Petrinet", "Place", "name")));
      	new Equality(body, var__virtual_1_, var__virtual_0_);
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_P = body.getOrCreateVariableByName("P");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_P, "P")
      	));
      	new TypeConstraint(body, new FlatTuple(var_P), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Place")));
      	new ConstantValue(body, var__virtual_0_, "Bus leaving");
      	new TypeConstraint(body, new FlatTuple(var_P), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("Petrinet", "Place")));
      	new TypeConstraint(body, new FlatTuple(var_P, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("Petrinet", "Place", "name")));
      	new Equality(body, var__virtual_1_, var__virtual_0_);
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
