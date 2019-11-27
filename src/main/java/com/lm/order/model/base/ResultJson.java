package com.lm.order.model.base;

import com.lm.order.common.OrderRespCode;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.Map;

public class ResultJson<T> {
    private Integer code;
    private String message;
    private T data;
    @JsonIgnore
    private static final Map EMPTY_MAP = new HashMap<>();

    public ResultJson(){}

    public ResultJson(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResultJson success(Object data){
        if(data == null) {
            return success();
        }
        return new ResultJson(OrderRespCode._000000.getCode(), OrderRespCode._000000.getDesc(), data);
    }

    public static ResultJson success(){
        return new ResultJson(OrderRespCode._000000.getCode(), OrderRespCode._000000.getDesc(), EMPTY_MAP);
    }

    public static ResultJson fail(){
        return new ResultJson(OrderRespCode._066666.getCode(), OrderRespCode._066666.getDesc(), EMPTY_MAP);
    }

    public static ResultJson fail(Integer code, String message){
        return new ResultJson(code, message, EMPTY_MAP);
    }

    public static <T> ResultJson fail(Integer code, String message, T data){
        return new ResultJson(code, message, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
