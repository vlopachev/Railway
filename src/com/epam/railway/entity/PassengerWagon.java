package com.epam.railway.entity;

import com.epam.railway.logic.RailWayUtils;

public class PassengerWagon extends RailwayTransport {
    private TypePassengerWagon typePassengerWagon;
    private int seats;
    private int passengers;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public TypePassengerWagon getTypePassengerWagon() {
        return typePassengerWagon;
    }

    public void setTypePassengerWagon(TypePassengerWagon typePassengerWagon) {
        this.typePassengerWagon = typePassengerWagon;
        switch (typePassengerWagon){
            case SLEEPING_WAGON:
                setWeight(RailWayUtils.WEIGHT_SLEEPING_WAGON);
                break;
            case COUCHETTE_WAGON:
                setWeight(RailWayUtils.WEIGHT_COUCHETTE_WAGON);
                break;
            default:
                new RuntimeException("Not Supported TypePassengerWagon");
        }
    }

    public void setPassengers(int passengers) {
        if (typePassengerWagon != null){
            switch (typePassengerWagon){
                case COUCHETTE_WAGON:
                    seats = RailWayUtils.SEATS_COUCHETTE_WAGON;
                    break;
                case SLEEPING_WAGON:
                    seats = RailWayUtils.SEATS_SLEEPING_WAGON;
                    break;
                default:
                    new RuntimeException("Not Supported TypePassengerWagon");
            }
            if (passengers <= seats){
                this.passengers = passengers;
            }
        }

    }

    @Override
    public double getFullWeight() {
        return getWeight() + passengers * RailWayUtils.WEIGHT_AVERAGE_PERSON;
    }
}
