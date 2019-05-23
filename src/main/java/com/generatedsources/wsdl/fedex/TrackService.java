package com.generatedsources.wsdl.fedex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-04-06T22:57:59.249-07:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "TrackService", 
                 // wsdlLocation = "file:/Users/ekoca/Documents/workspace/fedex/references/TrackService_v10.wsdl",
                 // wsdlLocation = "http://39.96.6.123:1949/TrackService_v10.wsdl",
                  wsdlLocation = "file:E:\\User\\ekoca\\TrackService_v10.wsdl",
                  targetNamespace = "http://fedex.com/ws/track/v10") 
public class TrackService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://fedex.com/ws/track/v10", "TrackService");
    public final static QName TrackServicePort = new QName("http://fedex.com/ws/track/v10", "TrackServicePort");
    static {
        URL url = null;
        try {
           // url = new URL("file:/Users/ekoca/Documents/workspace/fedex/references/TrackService_v10.wsdl");
           // url = new URL("http://39.96.6.123:1949/TrackService_v10.wsdl");
            url = new URL("file:E:\\User\\ekoca\\TrackService_v10.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TrackService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:E:\\User\\ekoca\\TrackService_v10.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TrackService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TrackService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TrackService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public TrackService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TrackService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TrackService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns TrackPortType
     */
    @WebEndpoint(name = "TrackServicePort")
    public TrackPortType getTrackServicePort() {
        return super.getPort(TrackServicePort, TrackPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TrackPortType
     */
    @WebEndpoint(name = "TrackServicePort")
    public TrackPortType getTrackServicePort(WebServiceFeature... features) {
        return super.getPort(TrackServicePort, TrackPortType.class, features);
    }

}
