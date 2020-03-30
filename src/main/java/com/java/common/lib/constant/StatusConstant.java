package com.java.common.lib.constant;

public enum StatusConstant {
    OK("OK"),
    INTERNAL_SERVER_ERROR("Internal Server Error"),
    FORBIDDEN("Forbidden"),
    BAD_REQUEST("Bad Request"),
    UNAUTHORIZED("Unauthorized"),
    CREATED("Created"),
    NO_CONTENT("No Content"),
    ACCEPTED("Accepted");

    StatusConstant(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

}
