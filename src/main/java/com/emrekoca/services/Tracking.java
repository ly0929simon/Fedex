package com.emrekoca.services;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.emrekoca.services.FedexTracking.TrackingException;
import com.emrekoca.services.responses.StatusResponse;

public interface Tracking {
    public StatusResponse track(final String orderNumber)
        throws ServiceException, RemoteException, TrackingException;
}
