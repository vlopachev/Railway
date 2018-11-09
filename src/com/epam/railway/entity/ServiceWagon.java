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
        switch (typeServiceWagon) {
            case BAGGAGE_WAGON:
                setWeight(RailWayUtils.WEIGHT_BAGGAGE_WAGON);
                payload = RailWayUtils.PAYLOAD_BAGGAGE_WAGON;
                seats = RailWayUtils.SEATS_POST_WAGON;
                break;
            case POST_WAGON:
                setWeight(RailWayUtils.WEIGHT_POST_WAGON);
                payload = RailWayUtils.PAYLOAD_POST_WAGON;
                seats = RailWayUtils.SEATS_BAGGAGE_WAGON;
                break;
            default:
                throw new RuntimeException("Not Supported TypeServiceWagon");
        }
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        if (payload > 0 && cargo <= payload) {
            this.cargo = cargo;
        }
    }

    public double getPayload() {
        return payload;
    }

    public int getOperators() {
        return operators;
    }

    public void setOperators(int operators) {
        if (seats > 0 && operators <= seats) {
            this.operators = operators;
        }
    }

    @Override
    public double getFullWeight() {
        return getWeight() + cargo + operators *
                RailWayUtils.WEIGHT_AVERAGE_PERSON;
    }

    @Override
    public String getTypeTransport() {
        if (typeServiceWagon != null) {
            typeServiceWagon.toString();
        }
        return "Type not set";
    }


}
