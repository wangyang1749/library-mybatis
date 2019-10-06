package com.syyb.common.util;

public class MyResult {
    private Integer code;
    private String message;
    private Object data;
    private boolean success;
    private String jwtToken;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static MyResult success(String jwtToken){
        MyResult result = new MyResult();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        result.setSuccess(true);
        result.setJwtToken(jwtToken);
        return result;
    }
    public static MyResult success(int code,String message,Object data){
        MyResult result = new MyResult();
        result.setCode(code);
        result.setData(data);
        result.setMessage(message);
        return result;
    }
    public static MyResult success(int code,String message){
        return success(code,message,null);
    }
    public static MyResult success(int code,Object data){
        return success(code,null,data);
    }



}
