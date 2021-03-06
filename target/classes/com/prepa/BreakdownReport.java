package com.prepa;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-02-23T12:27:38.544-04:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "BreakdownReport", 
                  wsdlLocation = "http://wss.prepa.com/services/BreakdownReport?wsdl",
                  targetNamespace = "http://ws.breakdown.prepa.com") 
public class BreakdownReport extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.breakdown.prepa.com", "BreakdownReport");
    public final static QName BreakdownReportHttpSoap11Endpoint = new QName("http://ws.breakdown.prepa.com", "BreakdownReportHttpSoap11Endpoint");
    public final static QName BreakdownReportHttpEndpoint = new QName("http://ws.breakdown.prepa.com", "BreakdownReportHttpEndpoint");
    public final static QName BreakdownReportHttpSoap12Endpoint = new QName("http://ws.breakdown.prepa.com", "BreakdownReportHttpSoap12Endpoint");
    static {
        URL url = null;
        try {
            url = new URL("http://wss.prepa.com/services/BreakdownReport?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BreakdownReport.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://wss.prepa.com/services/BreakdownReport?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BreakdownReport(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BreakdownReport(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BreakdownReport() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BreakdownReport(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BreakdownReport(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BreakdownReport(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BreakdownReportPortType
     */
    @WebEndpoint(name = "BreakdownReportHttpSoap11Endpoint")
    public BreakdownReportPortType getBreakdownReportHttpSoap11Endpoint() {
        return super.getPort(BreakdownReportHttpSoap11Endpoint, BreakdownReportPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BreakdownReportPortType
     */
    @WebEndpoint(name = "BreakdownReportHttpSoap11Endpoint")
    public BreakdownReportPortType getBreakdownReportHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(BreakdownReportHttpSoap11Endpoint, BreakdownReportPortType.class, features);
    }
    /**
     *
     * @return
     *     returns BreakdownReportPortType
     */
    @WebEndpoint(name = "BreakdownReportHttpEndpoint")
    public BreakdownReportPortType getBreakdownReportHttpEndpoint() {
        return super.getPort(BreakdownReportHttpEndpoint, BreakdownReportPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BreakdownReportPortType
     */
    @WebEndpoint(name = "BreakdownReportHttpEndpoint")
    public BreakdownReportPortType getBreakdownReportHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(BreakdownReportHttpEndpoint, BreakdownReportPortType.class, features);
    }
    /**
     *
     * @return
     *     returns BreakdownReportPortType
     */
    @WebEndpoint(name = "BreakdownReportHttpSoap12Endpoint")
    public BreakdownReportPortType getBreakdownReportHttpSoap12Endpoint() {
        return super.getPort(BreakdownReportHttpSoap12Endpoint, BreakdownReportPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BreakdownReportPortType
     */
    @WebEndpoint(name = "BreakdownReportHttpSoap12Endpoint")
    public BreakdownReportPortType getBreakdownReportHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(BreakdownReportHttpSoap12Endpoint, BreakdownReportPortType.class, features);
    }

}
