package com.epam.railway.transport;


public class CargoWagon extends RailwayTransport {
    TypeCargoWagon typeCargoWagon;

    public TypeCargoWagon getTypeCargoWagon() {
        return typeCargoWagon;
    }

    public void setTypeCargoWagon(TypeCargoWagon typeCargoWagon) {
        this.typeCargoWagon = typeCargoWagon;
        setWeight(typeCargoWagon.getWeightWagon());
    }

    @Override
    public void setPayload(double payload) {
        if (payload <= typeCargoWagon.getMaxPayload()){
            super.setPayload(payload);
        } else {
            System.out.println("Maximum load weight exceeded");
        }

    }
}
