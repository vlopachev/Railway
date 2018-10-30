package com.epam.railway;

public abstract class RailwayTransport {
    private static long count_id;
    private String model;
    private long id;

    public RailwayTransport() {
        count_id ++;
        id = count_id;
    }

    public String getModel() {
        return model;
    }

    public long getId() {
        return id;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
