package com.epam.railway.entity;

import com.epam.railway.logic.RailwayUtils;

public class PassengerWagon extends RailwayTransport {
    private TypePassengerWagon typePassengerWagon;
    private int seats;
    private int passengers;

    public int getSeats() {
        return seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public TypePassengerWagon getTypePassengerWagon() {
        return typePassengerWagon;
    }

    public void setTypePassengerWagon(TypePassengerWagon typePassengerWagon) {
        this.typePassengerWagon = typePassengerWagon;
        switch (typePassengerWagon) {
            case SLEEPING_WAGON:
                setWeight(RailwayUtils.WEIGHT_SLEEPING_WAGON);
                seats = RailwayUtils.SEATS_COUCHETTE_WAGON;
                break;
            case COUCHETTE_WAGON:
                setWeight(RailwayUtils.WEIGHT_COUCHETTE_WAGON);
                seats = RailwayUtils.SEATS_SLEEPING_WAGON;
                break;
            default:
                throw new RuntimeException("Not Supported TypePassengerWagon");
        }
    }

    public void setPassengers(int passengers) {
        if (seats > 0 && passengers <= seats) {
            this.passengers = passengers;
        }
    }

    @Override
    public double getFullWeight() {
        return getWeight() + passengers *
                RailwayUtils.WEIGHT_AVERAGE_PERSON;
    }

    @Override
    public String getTypeTransport() {
        if (typePassengerWagon != null) {
            return typePassengerWagon.toString();
        }
        return "Type not set";
    }
}
