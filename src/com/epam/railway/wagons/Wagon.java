package com.epam.railway.wagons;

import com.epam.railway.RailwayTransport;

public abstract class Wagon extends RailwayTransport {
    private TypeWagon typeWagon;

    @Override
    public String getTypeTransport() {
        return typeWagon.toString();
    }

    protected void setTypeWagon(TypeWagon typeWagon) {
        this.typeWagon = typeWagon;
    }

    @Override
    public String toString() {
        return  "Wagon{" +
                "id=" + super.getId() + " "  +
                "typeWagon=" + typeWagon +
                '}';
    }
}
