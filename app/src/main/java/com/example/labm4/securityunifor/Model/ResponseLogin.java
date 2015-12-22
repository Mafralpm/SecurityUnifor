package com.example.labm4.securityunifor.Model;

import java.util.List;

public class ResponseLogin {

    private boolean success;
    private String message;
    private List<Employee> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Employee> getData() {
        return data;
    }

    public void setData(List<Employee> data) {
        this.data = data;
    }

}
