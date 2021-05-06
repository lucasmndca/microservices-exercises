package com.microservices.exercises.publisher.controllers.response;

import java.util.Date;

/**
 * The project's default template for responses
 * @author Lucas Dias
 * @since 2021-05-05 19:46
 */
public class BaseResponse {

    private Date timestamp;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
