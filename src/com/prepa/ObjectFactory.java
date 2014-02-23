
package com.prepa;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.prepa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.prepa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBreakdownsByTownOrCityResponse }
     * 
     */
    public GetBreakdownsByTownOrCityResponse createGetBreakdownsByTownOrCityResponse() {
        return new GetBreakdownsByTownOrCityResponse();
    }

    /**
     * Create an instance of {@link BreakdownArea }
     * 
     */
    public BreakdownArea createBreakdownArea() {
        return new BreakdownArea();
    }

    /**
     * Create an instance of {@link GetBreakdownsSummaryResponse }
     * 
     */
    public GetBreakdownsSummaryResponse createGetBreakdownsSummaryResponse() {
        return new GetBreakdownsSummaryResponse();
    }

    /**
     * Create an instance of {@link BreakdownSummary }
     * 
     */
    public BreakdownSummary createBreakdownSummary() {
        return new BreakdownSummary();
    }

    /**
     * Create an instance of {@link GetBreakdownsByTownOrCity }
     * 
     */
    public GetBreakdownsByTownOrCity createGetBreakdownsByTownOrCity() {
        return new GetBreakdownsByTownOrCity();
    }

}
