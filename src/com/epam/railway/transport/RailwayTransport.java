package com.epam.railway.transport;


public abstract class RailwayTransport {
    private static long countId;
    private long id;

    public RailwayTransport() {
        countId ++;
        id = countId;
    }

    public long getId() {
        return id;
    }

    public abstract double getWeight();

}
