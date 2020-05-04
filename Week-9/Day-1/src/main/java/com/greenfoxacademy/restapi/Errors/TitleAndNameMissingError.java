package com.greenfoxacademy.restapi.Errors;

public class TitleAndNameMissingError {

    private String error;

    public TitleAndNameMissingError() {
        this.error = "Please provide a name and a title!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
