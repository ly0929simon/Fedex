package com.emrekoca.services;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.emrekoca.services.responses.StatusResponse;
import com.emrekoca.services.responses.TrackResponse;
import com.emrekoca.utils.JSONUtils;
import com.generatedsources.wsdl.fedex.ClientDetail;
import com.generatedsources.wsdl.fedex.CompletedTrackDetail;
import com.generatedsources.wsdl.fedex.Localization;
import com.generatedsources.wsdl.fedex.Notification;
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

@Service
public class FedexTracking implements Tracking {

    Logger logger = LogManager.getLogger(FedexTracking.class);

    private static final String accountNumber = "376117995";
    private static final String meterNumber = "114588861";
    private static final String key = "W8ul4aKb6IO2fGBz";
    private static final String password = "25o5RRCIDlQdVKNmbxjaAtqnK";

    public StatusResponse track(final String orderNumber) throws ServiceException, RemoteException {
        TrackRequest request = createClient(orderNumber);
        // Initializing the service
        TrackService service = new TrackService();
        TrackPortType port = service.getTrackServicePort();
        logger.info("--Track Request--");
        logger.info(JSONUtils.toJson(request, true));
        logger.info("--Track Request--");
        try {
            // This is the call to the web service passing in a request object
            // and returning a reply object
            TrackReply reply = port.track(request);
            // check if the call was successful
            if (!isResponseOk(reply.getHighestSeverity())) {
                throw new TrackingException(reply.getHighestSeverity().value());
            }
            logger.info("--Track Reply--");
            logger.info(JSONUtils.toJson(reply, true));
            logger.info("--Track Reply--");
            checkDetails(reply);
            return TrackResponse.success(reply);
        } catch (TrackingException e) {
            return TrackResponse.serverError();
        }
    }

    private void checkDetails(TrackReply reply) throws TrackingException {
        for (CompletedTrackDetail t : reply.getCompletedTrackDetails()) {
            for (Notification n : t.getNotifications()) {
                if (!isResponseOk(n.getSeverity())) {
                    throw new TrackingException(n);
                }
            }
        }
    }

    private TrackRequest createClient(final String orderNumber) {
        TrackRequest request = new TrackRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        // TransactionDetail (Optional)
        request.setTransactionDetail(getTransactionDetail());
        // VersionId
        request.setVersion(getVersion());
        // TrackSelectionDetail
        TrackSelectionDetail selectionDetail = new TrackSelectionDetail();
        TrackPackageIdentifier packageIdentifier = new TrackPackageIdentifier();
        packageIdentifier.setType(TrackIdentifierType.FREE_FORM_REFERENCE);
        packageIdentifier.setValue(orderNumber); // Tracking number
        selectionDetail.setPackageIdentifier(packageIdentifier);
        selectionDetail.setShipmentAccountNumber(accountNumber);
        List<TrackSelectionDetail> selectionDetailList = request.getSelectionDetails();
        selectionDetailList.add(selectionDetail);
        List<TrackRequestProcessingOptionType> options = request.getProcessingOptions();
        options.add(TrackRequestProcessingOptionType.INCLUDE_DETAILED_SCANS);
        return request;
    }

    private TransactionDetail getTransactionDetail() {
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("Track by v10");
        // Localization (Optional)
        Localization local = new Localization();
        local.setLanguageCode("EN");
        local.setLocaleCode("US");
        transactionDetail.setLocalization(local);
        return transactionDetail;
    }

    private VersionId getVersion() {
        VersionId versionId = new VersionId();
        versionId.setServiceId("trck");
        versionId.setMajor(10);
        versionId.setIntermediate(0);
        versionId.setMinor(0);
        return versionId;
    }

    private ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
    }

    private WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential userCredential = new WebAuthenticationCredential();
        userCredential.setKey(key);
        userCredential.setPassword(password);

        WebAuthenticationCredential parentCredential = null;
        /*
         * Boolean useParentCredential = false; // Set this value to true is
         * using // a parent credential if (useParentCredential) { String
         * parentKey = System.getProperty("parentkey"); String parentPassword =
         * System.getProperty("parentpassword"); parentCredential = new
         * WebAuthenticationCredential(); parentCredential.setKey(parentKey);
         * parentCredential.setPassword(parentPassword); }
         */
        WebAuthenticationDetail authDetail = new WebAuthenticationDetail();
        // authDetail.setParentCredential(parentCredential);
        authDetail.setUserCredential(userCredential);
        return authDetail;
    }

    private boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
        if (notificationSeverityType == null) {
            return false;
        }
        if (notificationSeverityType.equals(NotificationSeverityType.WARNING)
            || notificationSeverityType.equals(NotificationSeverityType.NOTE)
            || notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
            return true;
        }
        return false;
    }

    public static class TrackingException extends Exception {
        private static final long serialVersionUID = 1L;
        private final int error;

        public TrackingException(String message) {
            super(message);
            error = -1;
        }

        public TrackingException(Notification n) {
            super(n.getSeverity().value() + " (" + n.getCode() + "): " + n.getLocalizedMessage());
            error = Integer.valueOf(n.getCode());
        }
    }

}
