package com.greenfoxacademy.restapi.Errors;

public class DoUntilError {

    private String error;

    public DoUntilError() {
        this.error = "Please provide a number!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
