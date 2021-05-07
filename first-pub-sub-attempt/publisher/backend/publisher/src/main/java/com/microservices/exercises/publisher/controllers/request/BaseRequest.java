package com.microservices.exercises.publisher.controllers.request;

import java.util.Date;

/**
 * The base request class.
 * @author Lucas Dias
 * @since 2021-05-06 16:58
 */
public class BaseRequest {

    private String sessionId;

    private Date timestamp;

    private String requestType;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String request) {
        this.requestType = request;
    }
}
