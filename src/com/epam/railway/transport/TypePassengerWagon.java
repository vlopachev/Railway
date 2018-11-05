package com.epam.railway.transport;

public enum TypePassengerWagon {
    SLEEPING_WAGON(45.0,18),
    OPEN_SLEEPING_WAGON(45.0,36);

    private final double weight;

    private final int seats;

    TypePassengerWagon(double weight, int seats) {
        this.weight = weight;
        this.seats = seats;
    }

    public double getWeight(){
        return weight;
    }

    public int getSeats() {
        return seats;
    }

}
