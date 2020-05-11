package com.gfa.groottest.models;

public class Arrow {

    private double distance, time, speed;

    public Arrow(double distance, double time) {
        this.distance = distance;
        this.time = time;
        this.speed = this.distance/this.time;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
