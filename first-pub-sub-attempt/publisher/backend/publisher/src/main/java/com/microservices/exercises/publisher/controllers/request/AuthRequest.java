package com.microservices.exercises.publisher.controllers.request;

import java.util.List;

/**
 * The auth request.
 * @author Lucas Dias
 * @since 2021-05-06 17:00
 */
public class AuthRequest extends BaseRequest {

    private List<String> actions;

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return super.getRequestType() + "|" + super.getSessionId() + "|" + this.actions.toString();
    }
}
