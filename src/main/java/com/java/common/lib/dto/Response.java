package com.java.common.lib.dto;

public class Response {

    private boolean error;
    private int code;
    private String status;
    private Object data;

    public Response() {
    }

    public Response(boolean error, int code, String status, Object data) {
        this.error = error;
        this.code = code;
        this.status = status;
        this.data = data;
    }
    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
