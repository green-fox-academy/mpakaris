package com.greenfoxacademy.restapi.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;
    private String endpoint;
    private String data;
    public Log() {
    }

    public Log(String endpoint, String data) {
        this.endpoint = endpoint;
        this.data = data;
        this.createdAt = new Date();
    }

    public Log(String endpoint, String data, boolean successful, String message) {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return createdAt;
    }

    public void setDate(Date date) {
        this.createdAt = date;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
