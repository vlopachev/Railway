package com.epam.railway.transport;


public class CargoWagon extends RailwayTransport {
    TypeCargoWagon typeCargoWagon;
    private double cargo;

    public TypeCargoWagon getTypeCargoWagon() {
        return typeCargoWagon;
    }

    public void setTypeCargoWagon(TypeCargoWagon typeCargoWagon) {
        this.typeCargoWagon = typeCargoWagon;
    }

    @Override
    public double getWeight() {
        return typeCargoWagon.getWeight() + cargo;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        if (cargo <= typeCargoWagon.getPayload()){
            this.cargo = cargo;
        }
    }
}
