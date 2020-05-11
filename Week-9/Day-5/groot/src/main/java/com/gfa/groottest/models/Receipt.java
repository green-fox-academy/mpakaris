package com.gfa.groottest.models;

public class Receipt {

    private String received;
    private int amount;
    private String shipStatus;
    private boolean ready;

    public Receipt(String received, int amount) {
        this.received = received;
        this.amount = amount;
        checkShipStatus();
        checkIfReady();
    }

    private void checkShipStatus() {
        if (this.amount > 12500) {
            this.shipStatus = "overloaded";
        } else if (this.amount == 12500) {
            this.shipStatus = "full";
        } else {
            float percentage = (Float.valueOf(this.amount)/12500)*100;
            this.shipStatus = String.valueOf(percentage)+"%";
        }
    }

    private void checkIfReady() {
        if (this.amount >= 12500) {
            this.ready = true;
        } else {
            this.ready = false;
        }
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
