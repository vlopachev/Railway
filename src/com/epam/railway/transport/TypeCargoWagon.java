package com.epam.railway.transport;

public enum TypeCargoWagon {
    COVERED_WAGON(26.0,68.0),
    OPEN_WAGON(23.0,71.0),
    TANK_WAGON(27.0,67.0),
    PLATFORM_WAGON(23.5,71.0),
    HOPPER_WAGON(23.0,70.0);

    private final double weight;
    private final double payload;

    TypeCargoWagon(double weight, double payload) {
        this.weight = weight;
        this.payload = payload;
    }

    public double getWeight(){
        return weight;
    }

    public double getPayload(){
        return payload;
    }
}
