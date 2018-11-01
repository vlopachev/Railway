package com.epam.railway;

public abstract class RailwayTransport {
    private static long count_id;
    private long id;

    protected abstract String getTypeTransport();

    public RailwayTransport() {
        count_id ++;
        id = count_id;
    }

    protected long getId() {
        return id;
    }
}
