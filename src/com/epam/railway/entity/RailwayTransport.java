package com.epam.railway.entity;


public abstract class RailwayTransport {
    private TypeRailwayTransport typeRailwayTransport;
    private static long countId;
    private long id;
    private double weight;

    protected RailwayTransport(TypeRailwayTransport typeRailwayTransport) {
        this();
        this.typeRailwayTransport = typeRailwayTransport;

    }

    protected RailwayTransport() {
        countId ++;
        id = countId;
    }

    public TypeRailwayTransport getTypeRailwayTransport() {
        return typeRailwayTransport;
    }

    public abstract String getTypeTransport();

    public abstract double getFullWeight();

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
