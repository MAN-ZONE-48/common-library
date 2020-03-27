package com.java.common.lib.constant;

public enum MessageConstant {
    OK("OK"),
    CREATED("CREATED"),
    ACCEPTED("ACCEPTED"),
    NO_CONTENT("NO CONTENT"),
    MOVE_PERMANENTLY("MOVE PERMANENTLY"),
    FOUND("FOUND"),
    BAD_REQUEST("BAD REQUEST: {}"),
    UNAUTHORIZED("UNAUTHORIZED: {}"),
    FORBIDDEN("FORBIDDEN: {}"),
    NOT_FOUND("NOT FOUND: {}"),
    INTERNAL_SERVER_ERROR("INTERNAL SERVER ERROR: {}");




    private String message;

    MessageConstant(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
