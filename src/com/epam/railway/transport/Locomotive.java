package com.epam.railway.transport;

public class Locomotive extends RailwayTransport {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void setPayload(double payload) {

    }
}
