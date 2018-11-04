package com.epam.railway.transport;


public abstract class RailwayTransport {
    private static long count_id;
    private long id;
    private String model;
    private double weight;
    private double payload;


    public RailwayTransport() {
        count_id ++;
        id = count_id;
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public double getPayload() {
        return payload;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public double getTotalWeight() {
        return weight + payload;
    }
}
