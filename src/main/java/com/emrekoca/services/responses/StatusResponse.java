package com.emrekoca.services.responses;

import com.emrekoca.utils.JSONUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Basic standard web service response with status code.
 * 
 * @author Emre Koca
 */
@JsonInclude(Include.NON_NULL)
public class StatusResponse {
    /** Generic codes that apply to all services **/
    public static final int SUCCESS = 0, SERVER_ERROR = 9999, INPUT_VALIDATION_ERROR = 9998, NOT_FOUND = 9997,
        BACKEND_SERVICE_ERROR = 9996;
    public final int status;
    public String message;

    public StatusResponse() {
        this(0);
    }

    public StatusResponse(int status) {
        this.status = status;
    }

    public StatusResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    @SuppressWarnings("unchecked")
    public static <T extends StatusResponse> T success() {
        return (T)new StatusResponse(SUCCESS);
    }

    @SuppressWarnings("unchecked")
    public static <T extends StatusResponse> T serverError() {
        return (T)new StatusResponse(SERVER_ERROR);
    }

    @SuppressWarnings("unchecked")
    public static <T extends StatusResponse> T serverError(String message) {
        return (T)new StatusResponse(SERVER_ERROR, message);
    }

    @SuppressWarnings("unchecked")
    public static <T extends StatusResponse> T inputValidationError(String message) {
        return (T)new StatusResponse(INPUT_VALIDATION_ERROR, message);
    }

    @SuppressWarnings("unchecked")
    public static <T extends StatusResponse> T notFound(String message) {
        return (T)new StatusResponse(NOT_FOUND, message);
    }

    @SuppressWarnings("unchecked")
    public static <T extends StatusResponse> T backendServiceError(String message) {
        return (T)new StatusResponse(BACKEND_SERVICE_ERROR, message);
    }

    /**
     * This simulates the actual code that is used inside Jersey to generate
     * json from the object. This guarantees the same generation mechanism, as
     * different object to json conversion classes normally produce slightly
     * different results.
     * 
     * Indent is added for readability, since it will only be used in testing.
     */
    @Override
    public String toString() {
        return JSONUtils.toJson(this, true);
    }
}
