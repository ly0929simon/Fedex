package com.emrekoca.hello;

import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emrekoca.services.FedexTracking;
import com.emrekoca.services.FedexTracking.TrackingException;
import com.emrekoca.services.responses.StatusResponse;

@RestController
public class TrackingController {

    @Autowired
    FedexTracking client;

    // http://localhost:8080/track?tracking_number=5901869340
    @GET
    @RequestMapping("/track")
    public StatusResponse track(@RequestParam(value = "tracking_number", defaultValue = "5901869340") String trackingNumber)
        throws RemoteException, ServiceException, TrackingException {
        return client.track(trackingNumber);
    }
}
