package com.emrekoca.services;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.springframework.stereotype.Component;

import com.emrekoca.utils.JSONUtils;
import com.generatedsources.wsdl.fedex.ClientDetail;
import com.generatedsources.wsdl.fedex.Localization;
import com.generatedsources.wsdl.fedex.NotificationSeverityType;
import com.generatedsources.wsdl.fedex.TrackIdentifierType;
import com.generatedsources.wsdl.fedex.TrackPackageIdentifier;
import com.generatedsources.wsdl.fedex.TrackPortType;
import com.generatedsources.wsdl.fedex.TrackReply;
import com.generatedsources.wsdl.fedex.TrackRequest;
import com.generatedsources.wsdl.fedex.TrackRequestProcessingOptionType;
import com.generatedsources.wsdl.fedex.TrackSelectionDetail;
import com.generatedsources.wsdl.fedex.TrackService;
import com.generatedsources.wsdl.fedex.TransactionDetail;
import com.generatedsources.wsdl.fedex.VersionId;
import com.generatedsources.wsdl.fedex.WebAuthenticationCredential;
import com.generatedsources.wsdl.fedex.WebAuthenticationDetail;

/**
 * Demo of using the Track service with Axis to track a shipment.
 * <p>
 * com.fedex.track.stub is generated via WSDL2Java, like this:<br>
 * 
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.track.stub http://www.fedex.com/...../TrackService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class TrackWebServiceClient {
    
    public static void main(String[] args) throws Exception {
        try {
            FedexTracking client = new FedexTracking();
            client.track("775079558560");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
