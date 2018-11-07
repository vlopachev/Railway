package com.epam.railway.entity;


public class CargoWagon extends RailwayTransport {
    private TypeCargoWagon typeCargoWagon;
    private double cargo;
    private double payload;

    public TypeCargoWagon getTypeCargoWagon() {
        return typeCargoWagon;
    }

    public void setTypeCargoWagon(TypeCargoWagon typeCargoWagon) {
        this.typeCargoWagon = typeCargoWagon;
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


    @Override
    public double getFullWeight() {
        return getWeight() + cargo;
    }
}
