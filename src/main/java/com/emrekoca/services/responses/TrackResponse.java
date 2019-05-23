package com.emrekoca.services.responses;

import com.generatedsources.wsdl.fedex.TrackReply;

public class TrackResponse extends StatusResponse {
    public TrackReply data;
    public Long ms;

    public TrackResponse(int status) {
        super(status);
    }

    public TrackResponse(int status, String message) {
        super(status, message);
    }

    public TrackResponse(TrackReply data) {
        this(SUCCESS);
        this.data = data;
    }
    
    @SuppressWarnings("unchecked")
    public static <T extends StatusResponse> T success(TrackReply data) {
        return (T)new TrackResponse(data);
    }
}
