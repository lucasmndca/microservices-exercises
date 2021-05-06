package com.microservices.exercises.publisher.controllers.response;

/**
 * Default response for authentication
 * @author Lucas Dias
 * @since 2021-05-05 19:54
 */
public class AuthResponse extends BaseResponse {

    private Boolean isValid;
    private String userEmail;

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
