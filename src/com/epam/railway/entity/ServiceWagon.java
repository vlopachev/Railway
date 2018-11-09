package com.epam.railway.entity;

import com.epam.railway.logic.RailWayUtils;

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

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        if (typeServiceWagon != null){
            switch (typeServiceWagon){
                case BAGGAGE_WAGON:
                    payload = RailWayUtils.PAYLOAD_BAGGAGE_WAGON;
                    break;
                case POST_WAGON:
                    payload = RailWayUtils.PAYLOAD_POST_WAGON;
                    break;
                default:
                    new RuntimeException("Not Supported TypeServiceWagon");
            }
            if (cargo <= payload){
                this.cargo = cargo;
            }
        }
    }

    public double getPayload() {
        return payload;
    }

    public int getOperators() {
        return operators;
    }

    public void setOperators(int operators) {
        if (typeServiceWagon != null){
            switch (typeServiceWagon){
                case POST_WAGON:
                    seats = RailWayUtils.SEATS_POST_WAGON;
                    break;
                case BAGGAGE_WAGON:
                    seats = RailWayUtils.SEATS_BAGGAGE_WAGON;
                    break;
                default:
                    new RuntimeException("Not Supported TypeServiceWagon");
            }
            if (operators <= seats){
                this.operators = operators;
            }
        }
    }

    @Override
    public double getFullWeight() {
        return getWeight() + cargo + operators *
                RailWayUtils.WEIGHT_AVERAGE_PERSON;
    }
}
