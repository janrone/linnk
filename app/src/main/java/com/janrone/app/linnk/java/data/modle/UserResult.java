package com.janrone.app.linnk.java.data.modle;

public class UserResult extends BaseResult {

    /**
     * Copyright 2018 bejson.com
     */

    private String message;
    private int code;
    private UserBean data;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setData(UserBean data) {
        this.data = data;
    }

    public UserBean getData() {
        return data;
    }

}
