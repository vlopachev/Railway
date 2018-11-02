package com.epam.railway;

public abstract class RailwayTransport {
    private static long count_id;
    private long id;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public long getId() {
        return id;
    }


    protected RailwayTransport() {
        count_id ++;
        id = count_id;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
}
