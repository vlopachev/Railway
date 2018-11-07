package com.epam.railway.entity;

import com.epam.railway.logic.ParametersRailWayTransport;

public class ServiceWagon extends RailwayTransport {
    private TypeServiceWagon typeServiceWagon;
    private int seats;
    private int operators;
    private double cargo;
    private double payload;

    public TypeServiceWagon getTypeServiceWagon() {
        return typeServiceWagon;
    }

    public void setTypeServiceWagon(TypeServiceWagon typeServiceWagon) {
        this.typeServiceWagon = typeServiceWagon;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        if (cargo <= payload){
            this.cargo = cargo;
        }
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public int getOperators() {
        return operators;
    }

    public void setOperators(int operators) {
        if (operators <= seats){
            this.operators = operators;
        }
    }

    @Override
    public double getFullWeight() {
        return getWeight() + cargo + operators *
                ParametersRailWayTransport.AVERAGE_PERSON_WEIGHT;
    }
}
