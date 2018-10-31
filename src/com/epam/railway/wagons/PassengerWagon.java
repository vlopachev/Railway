package com.epam.railway.wagons;

public class PassengerWagon extends Wagon {
    private int seats;
    private double baggage;

    public PassengerWagon() {
        super.setTypeWagon(TypeWagon.Passenger);
    }
}
