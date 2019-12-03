package com.fudo.store.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fudo.store.type.ResponseCodeEnum;

import java.time.LocalDateTime;

public class BaseResponse {
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime time = LocalDateTime.now();
    private Object data;
    private String message;
    private ResponseCodeEnum code ;

    public BaseResponse(Object data, String message, ResponseCodeEnum code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public BaseResponse(String message, ResponseCodeEnum code) {
        this.message = message;
        this.code = code;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseCodeEnum getCode() {
        return code;
    }

    public void setCode(ResponseCodeEnum code) {
        this.code = code;
    }

}
