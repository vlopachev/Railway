package com.epam.railway.wagons;

import com.epam.railway.RailwayTransport;

public abstract class Wagon extends RailwayTransport {
    private TypeWagon typeWagon;

    protected TypeWagon getTypeWagon() {
        return typeWagon;
    }

    void setTypeWagon(TypeWagon typeWagon) {
        this.typeWagon = typeWagon;
    }
}
