package com.epam.railway.transport;


public abstract class RailwayTransport {
    private static long countId;
    private long id;
    private double weight;

    public RailwayTransport() {
        countId ++;
        id = countId;
    }

    public long getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
