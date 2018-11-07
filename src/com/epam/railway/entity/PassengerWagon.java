package com.epam.railway.entity;

import com.epam.railway.logic.ParametersRailWayTransport;

public class PassengerWagon extends RailwayTransport {
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

    public void setPassengers(int passengers) {
        if (passengers <= seats){
            this.passengers = passengers;
        }
    }

    @Override
    public double getFullWeight() {
        return getWeight() + passengers * ParametersRailWayTransport.AVERAGE_PERSON_WEIGHT;
    }
}
