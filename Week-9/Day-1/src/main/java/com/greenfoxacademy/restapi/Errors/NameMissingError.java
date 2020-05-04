package com.greenfoxacademy.restapi.Errors;

public class NameMissingError {

    private String error;

    public NameMissingError() {

        this.error = "Please provide a name!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
