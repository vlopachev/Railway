package com.epam.railway.transport;

public class PassengerWagon extends RailwayTransport {
    TypePassengerWagon typePassengerWagon;
    private int seats;
    private double AVERAGE_PASSENGER_WEIGHT = 0.1;


    public TypePassengerWagon getTypePassengerWagon() {
        return typePassengerWagon;
    }

    public void setTypePassengerWagon(TypePassengerWagon typePassengerWagon) {
        this.typePassengerWagon = typePassengerWagon;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats <= typePassengerWagon.getSeats()){
            this.seats = seats;
        }
    }

    @Override
    public double getWeight() {
        return typePassengerWagon.getWeight() + seats * AVERAGE_PASSENGER_WEIGHT;
    }
}
