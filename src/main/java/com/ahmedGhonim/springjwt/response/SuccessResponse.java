package com.ahmedGhonim.springjwt.response;

import org.springframework.http.HttpStatus;

/**
 * @author Ghonim
 */
public class SuccessResponse<T> {

    private int status;
    private T data;

    private SuccessResponse() {
    }

    public SuccessResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public SuccessResponse(T data) {
        this.status = HttpStatus.OK.value();
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

